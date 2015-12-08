// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.log;

import com.auditude.ads.util.event.IEventDispatcher;

// Referenced classes of package com.auditude.ads.util.log:
//            LogLevel

public interface ILogger
    extends IEventDispatcher
{

    public abstract void debug(Object obj);

    public abstract void error(Object obj);

    public abstract void fatal(Object obj);

    public abstract String getCategory();

    public abstract void info(Object obj);

    public abstract void log(LogLevel loglevel, Object obj);

    public abstract void warn(Object obj);
}
