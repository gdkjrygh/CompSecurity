// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.log;

import com.auditude.ads.util.event.EventDispatcher;

// Referenced classes of package com.auditude.ads.util.log:
//            ILogger, LogEvent, LogLevel

public class LogLogger extends EventDispatcher
    implements ILogger
{

    private String category;

    public LogLogger(String s)
    {
        category = s;
    }

    private String getLogData(Object obj)
    {
        if (obj == null)
        {
            return "";
        }
        if (obj instanceof String)
        {
            return (String)obj;
        } else
        {
            return obj.toString();
        }
    }

    public void debug(Object obj)
    {
        dispatchEvent("log", new LogEvent(this, getLogData(obj), LogLevel.DEBUG));
    }

    public void error(Object obj)
    {
        dispatchEvent("log", new LogEvent(this, getLogData(obj), LogLevel.ERROR));
    }

    public void fatal(Object obj)
    {
        dispatchEvent("log", new LogEvent(this, getLogData(obj), LogLevel.FATAL));
    }

    public String getCategory()
    {
        return category;
    }

    public void info(Object obj)
    {
        dispatchEvent("log", new LogEvent(this, getLogData(obj), LogLevel.INFO));
    }

    public void log(LogLevel loglevel, Object obj)
        throws RuntimeException
    {
        if (loglevel.getVerbosity() < LogLevel.DEBUG.getVerbosity())
        {
            throw new RuntimeException("Logging at level ALL is not allowed");
        } else
        {
            dispatchEvent("log", new LogEvent(this, obj, loglevel));
            return;
        }
    }

    public void warn(Object obj)
    {
        dispatchEvent("log", new LogEvent(this, getLogData(obj), LogLevel.WARN));
    }
}
