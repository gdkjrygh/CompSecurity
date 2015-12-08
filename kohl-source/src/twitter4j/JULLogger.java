// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package twitter4j:
//            Logger

final class JULLogger extends twitter4j.Logger
{

    private final Logger LOGGER;

    JULLogger(Logger logger)
    {
        LOGGER = logger;
    }

    public void debug(String s)
    {
        LOGGER.fine(s);
    }

    public void debug(String s, String s1)
    {
        LOGGER.fine((new StringBuilder()).append(s).append(s1).toString());
    }

    public void error(String s)
    {
        LOGGER.severe(s);
    }

    public void error(String s, Throwable throwable)
    {
        LOGGER.severe((new StringBuilder()).append(s).append(throwable.getMessage()).toString());
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
        return LOGGER.isLoggable(Level.FINE);
    }

    public boolean isErrorEnabled()
    {
        return LOGGER.isLoggable(Level.SEVERE);
    }

    public boolean isInfoEnabled()
    {
        return LOGGER.isLoggable(Level.INFO);
    }

    public boolean isWarnEnabled()
    {
        return LOGGER.isLoggable(Level.WARNING);
    }

    public void warn(String s)
    {
        LOGGER.warning(s);
    }

    public void warn(String s, String s1)
    {
        LOGGER.warning((new StringBuilder()).append(s).append(s1).toString());
    }
}
