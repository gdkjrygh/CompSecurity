// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.platforms;

import java.util.TimerTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.conviva.platforms:
//            PlatformApi

public class AndroidApi
    implements PlatformApi
{

    private ScheduledThreadPoolExecutor _pool;
    private ScheduledFuture _scheduledPollTask;
    private ScheduledFuture _scheduledTask;

    public AndroidApi(Object obj)
    {
        _pool = new ScheduledThreadPoolExecutor(2);
    }

    public void cleanup()
    {
        if (_scheduledTask != null)
        {
            _scheduledTask.cancel(false);
        }
        if (_scheduledPollTask != null)
        {
            _scheduledPollTask.cancel(false);
        }
    }

    public void createPollTask(TimerTask timertask, int i)
    {
        if (_scheduledPollTask != null)
        {
            _scheduledPollTask.cancel(false);
        }
        _scheduledPollTask = _pool.scheduleAtFixedRate(timertask, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void createTimer(TimerTask timertask, int i, int j, String s)
    {
        if (_scheduledTask != null)
        {
            _scheduledTask.cancel(false);
        }
        _scheduledTask = _pool.scheduleAtFixedRate(timertask, i, j, TimeUnit.MILLISECONDS);
    }
}
