// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.spi;

import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.Vector;
import org.apache.log4j.Appender;
import org.apache.log4j.Category;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

// Referenced classes of package org.apache.log4j.spi:
//            NOPLoggerRepository, LoggingEvent

public final class NOPLogger extends Logger
{

    public NOPLogger(NOPLoggerRepository noploggerrepository, String s)
    {
        super(s);
        super.repository = noploggerrepository;
        super.level = Level.OFF;
        super.parent = this;
    }

    public final void addAppender(Appender appender)
    {
    }

    public final void callAppenders(LoggingEvent loggingevent)
    {
    }

    final void closeNestedAppenders()
    {
    }

    public final void debug(Object obj)
    {
    }

    public final Enumeration getAllAppenders()
    {
        return (new Vector()).elements();
    }

    public final Level getEffectiveLevel()
    {
        return Level.OFF;
    }

    public final void removeAllAppenders()
    {
    }

    public final void setLevel(Level level)
    {
    }

    public final void setResourceBundle(ResourceBundle resourcebundle)
    {
    }
}
