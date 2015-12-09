// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.spi;

import org.apache.log4j.Appender;
import org.apache.log4j.Category;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

// Referenced classes of package org.apache.log4j.spi:
//            LoggerFactory

public interface LoggerRepository
{

    public abstract void emitNoAppenderWarning(Category category);

    public abstract void fireAddAppenderEvent(Category category, Appender appender);

    public abstract Logger getLogger(String s);

    public abstract Logger getLogger(String s, LoggerFactory loggerfactory);

    public abstract Logger getRootLogger();

    public abstract Level getThreshold();

    public abstract boolean isDisabled(int i);

    public abstract void resetConfiguration();

    public abstract void setThreshold(Level level);
}
