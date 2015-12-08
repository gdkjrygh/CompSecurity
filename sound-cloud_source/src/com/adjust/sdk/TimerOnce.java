// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TimerOnce
{

    private Runnable command;
    private boolean isRunning;
    private ScheduledExecutorService scheduler;
    private ScheduledFuture waitingTask;

    public TimerOnce(ScheduledExecutorService scheduledexecutorservice, Runnable runnable)
    {
        scheduler = scheduledexecutorservice;
        command = runnable;
        isRunning = false;
    }

    public long getFireIn()
    {
        if (waitingTask == null)
        {
            return 0L;
        } else
        {
            return waitingTask.getDelay(TimeUnit.MILLISECONDS);
        }
    }

    public void startIn(long l)
    {
        if (waitingTask != null)
        {
            waitingTask.cancel(false);
        }
        waitingTask = scheduler.schedule(command, l, TimeUnit.MILLISECONDS);
    }
}
