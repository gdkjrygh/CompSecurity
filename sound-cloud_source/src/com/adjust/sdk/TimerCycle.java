// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TimerCycle
{

    private Runnable command;
    private long cycleDelay;
    private long initialDelay;
    private boolean isPaused;
    private ScheduledExecutorService scheduler;
    private ScheduledFuture waitingTask;

    public TimerCycle(Runnable runnable, long l, long l1)
    {
        scheduler = Executors.newSingleThreadScheduledExecutor();
        command = runnable;
        initialDelay = l;
        cycleDelay = l1;
        isPaused = true;
    }

    public void start()
    {
        if (!isPaused)
        {
            return;
        } else
        {
            waitingTask = scheduler.scheduleWithFixedDelay(command, initialDelay, cycleDelay, TimeUnit.MILLISECONDS);
            isPaused = false;
            return;
        }
    }

    public void suspend()
    {
        if (isPaused)
        {
            return;
        } else
        {
            initialDelay = waitingTask.getDelay(TimeUnit.MILLISECONDS);
            waitingTask.cancel(false);
            isPaused = true;
            return;
        }
    }
}
