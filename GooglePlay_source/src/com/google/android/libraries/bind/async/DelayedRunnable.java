// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import android.os.Handler;
import android.os.SystemClock;

public final class DelayedRunnable
{

    final Runnable baseRunnable;
    private final Handler handler;
    final Object lock;
    long scheduledTime;
    private final Runnable wrapperRunnable = new Runnable() {

        final DelayedRunnable this$0;

        public final void run()
        {
            synchronized (lock)
            {
                scheduledTime = -1L;
            }
            baseRunnable.run();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = DelayedRunnable.this;
                super();
            }
    };

    public DelayedRunnable(Handler handler1, Runnable runnable)
    {
        baseRunnable = runnable;
        handler = handler1;
        lock = wrapperRunnable;
        scheduledTime = -1L;
    }

    private void rescheduleAtTime(long l)
    {
        scheduledTime = l;
        handler.removeCallbacks(wrapperRunnable);
        if (!handler.postAtTime(wrapperRunnable, scheduledTime))
        {
            scheduledTime = -1L;
        }
    }

    public final boolean postDelayed$25666f8(long l)
    {
        l = SystemClock.uptimeMillis() + l;
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (scheduledTime > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        rescheduleAtTime(l);
        obj;
        JVM INSTR monitorexit ;
        return false;
        if (l > scheduledTime)
        {
            rescheduleAtTime(l);
        }
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
