// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import org.apache.commons.logging.Log;

// Referenced classes of package twitter4j:
//            Logger

final class CommonsLoggingLogger extends Logger
{

    private final Log LOGGER;

    CommonsLoggingLogger(Log log)
    {
        LOGGER = log;
    }

    public void debug(String s)
    {
        LOGGER.debug(s);
    }

    public void debug(String s, String s1)
    {
        LOGGER.debug((new StringBuilder()).append(s).append(s1).toString());
    }

    public void error(String s)
    {
        LOGGER.error(s);
    }

    public void error(String s, Throwable throwable)
    {
        LOGGER.error(s, throwable);
    }

    public void info(String s)
    {
        LOGGER.info(s);
    }

    public void info(String s, String s1)
    {
        LOGGER.info((new StringBuilder()).append(s).append(s1).toString());
    }

    public boolean isDebugEnabled()
    {
        return LOGGER.isDebugEnabled();
    }

    public boolean isErrorEnabled()
    {
        return LOGGER.isErrorEnabled();
    }

    public boolean isInfoEnabled()
    {
        return LOGGER.isInfoEnabled();
    }

    public boolean isWarnEnabled()
    {
        return LOGGER.isWarnEnabled();
    }

    public void warn(String s)
    {
        LOGGER.warn(s);
    }

    public void warn(String s, String s1)
    {
        LOGGER.warn((new StringBuilder()).append(s).append(s1).toString());
    }
}
