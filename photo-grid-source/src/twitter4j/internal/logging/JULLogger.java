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

    public final void debug(String s)
    {
        LOGGER.fine(s);
    }

    public final void debug(String s, String s1)
    {
        LOGGER.fine((new StringBuilder()).append(s).append(s1).toString());
    }

    public final void error(String s)
    {
        LOGGER.severe(s);
    }

    public final void error(String s, Throwable throwable)
    {
        LOGGER.severe((new StringBuilder()).append(s).append(throwable.getMessage()).toString());
    }

    public final void info(String s)
    {
        LOGGER.info(s);
    }

    public final void info(String s, String s1)
    {
        LOGGER.info((new StringBuilder()).append(s).append(s1).toString());
    }

    public final boolean isDebugEnabled()
    {
        return LOGGER.isLoggable(Level.FINE);
    }

    public final boolean isErrorEnabled()
    {
        return LOGGER.isLoggable(Level.SEVERE);
    }

    public final boolean isInfoEnabled()
    {
        return LOGGER.isLoggable(Level.INFO);
    }

    public final boolean isWarnEnabled()
    {
        return LOGGER.isLoggable(Level.WARNING);
    }

    public final void warn(String s)
    {
        LOGGER.warning(s);
    }

    public final void warn(String s, String s1)
    {
        LOGGER.warning((new StringBuilder()).append(s).append(s1).toString());
    }
}
