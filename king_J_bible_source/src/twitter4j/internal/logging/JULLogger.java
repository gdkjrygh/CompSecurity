// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package twitter4j.internal.logging:
//            Logger

final class JULLogger extends twitter4j.internal.logging.Logger
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
        LOGGER.fine(s + s1);
    }

    public void error(String s)
    {
        LOGGER.severe(s);
    }

    public void error(String s, Throwable throwable)
    {
        LOGGER.severe(s + throwable.getMessage());
    }

    public void info(String s)
    {
        LOGGER.info(s);
    }

    public void info(String s, String s1)
    {
        LOGGER.info(s + s1);
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
        LOGGER.warning(s + s1);
    }
}
