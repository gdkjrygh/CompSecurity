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

    public final void debug(String s)
    {
    }

    public final void debug(String s, String s1)
    {
    }

    public final void error(String s)
    {
    }

    public final void error(String s, Throwable throwable)
    {
    }

    public final void info(String s)
    {
    }

    public final void info(String s, String s1)
    {
    }

    public final boolean isDebugEnabled()
    {
        return false;
    }

    public final boolean isErrorEnabled()
    {
        return false;
    }

    public final boolean isInfoEnabled()
    {
        return false;
    }

    public final boolean isWarnEnabled()
    {
        return false;
    }

    public final void warn(String s)
    {
    }

    public final void warn(String s, String s1)
    {
    }
}
