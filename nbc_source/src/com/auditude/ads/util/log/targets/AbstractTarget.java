// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.log.targets;

import com.auditude.ads.util.event.IEventListener;
import com.auditude.ads.util.log.ILogger;
import com.auditude.ads.util.log.Log;
import com.auditude.ads.util.log.LogEvent;
import com.auditude.ads.util.log.LogLevel;

// Referenced classes of package com.auditude.ads.util.log.targets:
//            ILoggingTarget

public class AbstractTarget
    implements IEventListener, ILoggingTarget
{

    private LogLevel level;

    public AbstractTarget()
    {
        level = LogLevel.ALL;
    }

    public ILogger addLogger(ILogger ilogger)
    {
        if (ilogger != null)
        {
            ilogger.addEventListener("log", this);
        }
        return ilogger;
    }

    public LogLevel getLevel()
    {
        return level;
    }

    public void initialized(Object obj)
    {
        Log.addTarget(this);
    }

    public void logEvent(LogEvent logevent)
    {
    }

    public void onEvent(String s, Object obj)
    {
        if (s == "log" && (obj instanceof LogEvent))
        {
            s = (LogEvent)obj;
            if (((LogEvent) (s)).level.getVerbosity() >= level.getVerbosity())
            {
                logEvent(s);
            }
        }
    }

    public void removeLogger(ILogger ilogger)
    {
        if (ilogger != null)
        {
            ilogger.removeEventListener("log", this);
        }
    }

    public void setLevel(LogLevel loglevel)
    {
        Log.removeTarget(this);
        level = loglevel;
        Log.addTarget(this);
    }
}
