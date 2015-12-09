// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import java.util.concurrent.Executor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.libraries.bind.async:
//            DelayedRunnable, AsyncUtil, Queues

public final class JankLock
    implements Executor
{

    public static final boolean DISABLED;
    public static final JankLock global = new JankLock();
    public boolean isPaused;
    public final ReentrantLock pauseLock = new ReentrantLock();
    public final DelayedRunnable resumeRunnable = new DelayedRunnable(AsyncUtil.mainThreadHandler(), new Runnable() {

        final JankLock this$0;

        public final void run()
        {
            JankLock janklock;
            janklock = JankLock.this;
            if (JankLock.DISABLED)
            {
                break MISSING_BLOCK_LABEL_42;
            }
            AsyncUtil.checkMainThread();
            janklock.pauseLock.lock();
            janklock.isPaused = false;
            janklock.unpaused.signalAll();
            janklock.pauseLock.unlock();
            return;
            Exception exception;
            exception;
            janklock.pauseLock.unlock();
            throw exception;
        }

            
            {
                this$0 = JankLock.this;
                super();
            }
    });
    final Condition unpaused;

    public JankLock()
    {
        unpaused = pauseLock.newCondition();
    }

    public final void execute(final Runnable runnable)
    {
        final Executor executor = AsyncUtil.mainThreadExecutor();
        final Queue blockingQueue = Queues.BIND_CPU;
        runnable = new Runnable() {

            final Runnable deliveringRunnable = new _cls1();
            final Runnable outerRunnable = this;
            final JankLock this$0;
            final Executor val$blockingQueue;
            final Executor val$executor;
            final Runnable val$runnable;

            public final void run()
            {
                executor.execute(deliveringRunnable);
            }

            
            {
                this$0 = JankLock.this;
                blockingQueue = executor1;
                runnable = runnable1;
                executor = executor2;
                super();
            }
        };
        if (!isPaused())
        {
            runnable.run();
            return;
        } else
        {
            blockingQueue.execute(runnable);
            return;
        }
    }

    public final boolean isPaused()
    {
        if (DISABLED)
        {
            return false;
        }
        pauseLock.lock();
        boolean flag = isPaused;
        pauseLock.unlock();
        return flag;
        Exception exception;
        exception;
        pauseLock.unlock();
        throw exception;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        DISABLED = flag;
    }

    // Unreferenced inner class com/google/android/libraries/bind/async/JankLock$2$1

/* anonymous class */
    final class _cls1
        implements Runnable
    {

        final _cls2 this$1;

        public final void run()
        {
            if (isPaused())
            {
                blockingQueue.execute(outerRunnable);
                return;
            } else
            {
                runnable.run();
                return;
            }
        }

            
            {
                this$1 = _cls2.this;
                super();
            }
    }

}
