// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.logging;


// Referenced classes of package twitter4j.internal.logging:
//            Logger

final class NullLogger extends Logger
{

    NullLogger()
    {
    }

    public void debug(String s)
    {
    }

    public void debug(String s, String s1)
    {
    }

    public void error(String s)
    {
    }

    public void error(String s, Throwable throwable)
    {
    }

    public void info(String s)
    {
    }

    public void info(String s, String s1)
    {
    }

    public boolean isDebugEnabled()
    {
        return false;
    }

    public boolean isErrorEnabled()
    {
        return false;
    }

    public boolean isInfoEnabled()
    {
        return false;
    }

    public boolean isWarnEnabled()
    {
        return false;
    }

    public void warn(String s)
    {
    }

    public void warn(String s, String s1)
    {
    }
}
