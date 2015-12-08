// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.spi;

import org.apache.log4j.Appender;
import org.apache.log4j.Category;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

// Referenced classes of package org.apache.log4j.spi:
//            LoggerRepository, NOPLogger, LoggerFactory

public final class NOPLoggerRepository
    implements LoggerRepository
{

    public NOPLoggerRepository()
    {
    }

    public final void emitNoAppenderWarning(Category category)
    {
    }

    public final void fireAddAppenderEvent(Category category, Appender appender)
    {
    }

    public final Logger getLogger(String s)
    {
        return new NOPLogger(this, s);
    }

    public final Logger getLogger(String s, LoggerFactory loggerfactory)
    {
        return new NOPLogger(this, s);
    }

    public final Logger getRootLogger()
    {
        return new NOPLogger(this, "root");
    }

    public final Level getThreshold()
    {
        return Level.OFF;
    }

    public final boolean isDisabled(int i)
    {
        return true;
    }

    public final void resetConfiguration()
    {
    }

    public final void setThreshold(Level level)
    {
    }
}
