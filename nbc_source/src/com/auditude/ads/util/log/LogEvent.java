// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.log;

import com.auditude.ads.util.event.Event;
import com.auditude.ads.util.event.IEventDispatcher;

// Referenced classes of package com.auditude.ads.util.log:
//            LogLevel

public class LogEvent extends Event
{

    public static final String LOG = "log";
    public Object data;
    public LogLevel level;

    public LogEvent(IEventDispatcher ieventdispatcher, Object obj, LogLevel loglevel)
    {
        super(ieventdispatcher);
        data = obj;
        level = loglevel;
    }
}
