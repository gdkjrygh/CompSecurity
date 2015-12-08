// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android;


// Referenced classes of package io.fabric.sdk.android:
//            Logger

public class SilentLogger
    implements Logger
{

    private int logLevel;

    public SilentLogger()
    {
        logLevel = 7;
    }

    public void d(String s, String s1)
    {
    }

    public void d(String s, String s1, Throwable throwable)
    {
    }

    public void e(String s, String s1)
    {
    }

    public void e(String s, String s1, Throwable throwable)
    {
    }

    public int getLogLevel()
    {
        return logLevel;
    }

    public void i(String s, String s1)
    {
    }

    public void i(String s, String s1, Throwable throwable)
    {
    }

    public boolean isLoggable(String s, int j)
    {
        return false;
    }

    public void log(int j, String s, String s1)
    {
    }

    public void log(int j, String s, String s1, boolean flag)
    {
    }

    public void setLogLevel(int j)
    {
    }

    public void v(String s, String s1)
    {
    }

    public void v(String s, String s1, Throwable throwable)
    {
    }

    public void w(String s, String s1)
    {
    }

    public void w(String s, String s1, Throwable throwable)
    {
    }
}
