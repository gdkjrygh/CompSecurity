// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.logging;

import java.io.PrintStream;
import java.util.Date;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

// Referenced classes of package twitter4j.internal.logging:
//            Logger

final class StdOutLogger extends Logger
{

    private static final boolean DEBUG = ConfigurationContext.getInstance().isDebugEnabled();

    StdOutLogger()
    {
    }

    public final void debug(String s)
    {
        if (DEBUG)
        {
            System.out.println((new StringBuilder("[")).append(new Date()).append("]").append(s).toString());
        }
    }

    public final void debug(String s, String s1)
    {
        if (DEBUG)
        {
            debug((new StringBuilder()).append(s).append(s1).toString());
        }
    }

    public final void error(String s)
    {
        System.out.println((new StringBuilder("[")).append(new Date()).append("]").append(s).toString());
    }

    public final void error(String s, Throwable throwable)
    {
        System.out.println(s);
        throwable.printStackTrace(System.err);
    }

    public final void info(String s)
    {
        System.out.println((new StringBuilder("[")).append(new Date()).append("]").append(s).toString());
    }

    public final void info(String s, String s1)
    {
        info((new StringBuilder()).append(s).append(s1).toString());
    }

    public final boolean isDebugEnabled()
    {
        return DEBUG;
    }

    public final boolean isErrorEnabled()
    {
        return true;
    }

    public final boolean isInfoEnabled()
    {
        return true;
    }

    public final boolean isWarnEnabled()
    {
        return true;
    }

    public final void warn(String s)
    {
        System.out.println((new StringBuilder("[")).append(new Date()).append("]").append(s).toString());
    }

    public final void warn(String s, String s1)
    {
        warn((new StringBuilder()).append(s).append(s1).toString());
    }

}
