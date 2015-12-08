// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.pinterest.base.Application;
import com.pinterest.kit.log.PLog;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class PinterestWorkerService extends Service
{

    private boolean _running;
    private AtomicInteger _runningWorkers;

    public PinterestWorkerService()
    {
        _runningWorkers = new AtomicInteger();
    }

    protected abstract Runnable[] getTasks();

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        Runnable arunnable[] = getTasks();
        _runningWorkers.set(arunnable.length);
        int j = arunnable.length;
        for (int i = 0; i < j; i++)
        {
            (new _cls1()).execute();
        }

    }

    public void onDestroy()
    {
        _running = false;
        int i = _runningWorkers.get();
        if (i != 0)
        {
            PLog.info("Background service task interrupted: %s", new Object[] {
                Integer.valueOf(i)
            });
        }
        super.onDestroy();
        Application.watch(this);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (_running)
        {
            return 2;
        } else
        {
            _running = true;
            return 2;
        }
    }

    public void onWorkerComplete()
    {
        if (_runningWorkers.decrementAndGet() == 0)
        {
            stopSelf();
        }
    }

    private class _cls1 extends BackgroundTask
    {

        final PinterestWorkerService this$0;
        final Runnable val$task;

        public void run()
        {
            task.run();
        }

        _cls1()
        {
            this$0 = PinterestWorkerService.this;
            task = runnable;
            super();
        }
    }

}
