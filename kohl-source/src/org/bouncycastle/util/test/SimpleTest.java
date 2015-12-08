// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.test;

import java.io.PrintStream;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.util.test:
//            Test, TestResult, SimpleTestResult, TestFailedException

public abstract class SimpleTest
    implements Test
{

    public SimpleTest()
    {
    }

    protected static void runTest(Test test)
    {
        runTest(test, System.out);
    }

    protected static void runTest(Test test, PrintStream printstream)
    {
        test = test.perform();
        printstream.println(test.toString());
        if (test.getException() != null)
        {
            test.getException().printStackTrace(printstream);
        }
    }

    private TestResult success()
    {
        return SimpleTestResult.successful(this, "Okay");
    }

    protected boolean areEqual(byte abyte0[], byte abyte1[])
    {
        return Arrays.areEqual(abyte0, abyte1);
    }

    protected void fail(String s)
    {
        throw new TestFailedException(SimpleTestResult.failed(this, s));
    }

    protected void fail(String s, Object obj, Object obj1)
    {
        throw new TestFailedException(SimpleTestResult.failed(this, s, obj, obj1));
    }

    protected void fail(String s, Throwable throwable)
    {
        throw new TestFailedException(SimpleTestResult.failed(this, s, throwable));
    }

    public abstract String getName();

    public TestResult perform()
    {
        TestResult testresult;
        try
        {
            performTest();
            testresult = success();
        }
        catch (TestFailedException testfailedexception)
        {
            return testfailedexception.getResult();
        }
        catch (Exception exception)
        {
            return SimpleTestResult.failed(this, (new StringBuilder()).append("Exception: ").append(exception).toString(), exception);
        }
        return testresult;
    }

    public abstract void performTest()
        throws Exception;
}
