// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.logging;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

// Referenced classes of package twitter4j.internal.logging:
//            Logger

final class Log4JLogger extends twitter4j.internal.logging.Logger
{

    private final Logger LOGGER;

    Log4JLogger(Logger logger)
    {
        LOGGER = logger;
    }

    public final void debug(String s)
    {
        LOGGER.debug(s);
    }

    public final void debug(String s, String s1)
    {
        debug((new StringBuilder()).append(s).append(s1).toString());
    }

    public final void error(String s)
    {
        LOGGER.error(s);
    }

    public final void error(String s, Throwable throwable)
    {
        LOGGER.error(s, throwable);
    }

    public final void info(String s)
    {
        LOGGER.info(s);
    }

    public final void info(String s, String s1)
    {
        info((new StringBuilder()).append(s).append(s1).toString());
    }

    public final boolean isDebugEnabled()
    {
        return LOGGER.isDebugEnabled();
    }

    public final boolean isErrorEnabled()
    {
        return LOGGER.isEnabledFor(Level.WARN);
    }

    public final boolean isInfoEnabled()
    {
        return LOGGER.isInfoEnabled();
    }

    public final boolean isWarnEnabled()
    {
        return LOGGER.isEnabledFor(Level.WARN);
    }

    public final void warn(String s)
    {
        LOGGER.warn(s);
    }

    public final void warn(String s, String s1)
    {
        warn((new StringBuilder()).append(s).append(s1).toString());
    }
}
