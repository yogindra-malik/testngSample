package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_1 {

	@Test
	public void TestLogin()
	{
		System.out.println("login done");
	}
	@Test
	public void Testformfill()
	{
		System.out.println("form fill  done");
	}
	@BeforeMethod
	public void openbrowser()
	{
		System.out.println("openbrowser done");
	}
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("closebrowser  done");
	}
	@BeforeTest
	public void opendbconnection()
	{
		System.out.println("opendbconnection done");
	}
	@AfterTest
	public void closedbconnection()
	{
		System.out.println("closedbconnection  done");
	}
	@BeforeSuite
	public void openseleniumserver()
	{
		System.out.println("openseleniumserver done");
		//executed once 
	}
	@AfterSuite
	public void stopseleniumserver()
	{
		System.out.println("seleniumserver stopped");
	}

}
