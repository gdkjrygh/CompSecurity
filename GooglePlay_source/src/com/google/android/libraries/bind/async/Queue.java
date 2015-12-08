// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.async;

import android.os.Process;
import com.google.android.libraries.bind.logging.Logd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.libraries.bind.async:
//            Queues, AsyncUtil, JankLock

public final class Queue
    implements Executor
{

    private static final Logd LOGD = Logd.get(com/google/android/libraries/bind/async/Queues);
    protected static final List queues = new ArrayList();
    protected Executor executor;
    public final Executor fallbackIfMain;
    private final String name;
    public final int poolSize;
    protected final ThreadGroup threadGroup;

    public Queue(String s)
    {
        fallbackIfMain = new Executor() {

            final Queue this$0;

            public final void execute(Runnable runnable)
            {
                if (!AsyncUtil.isMainThread())
                {
                    runnable.run();
                    return;
                } else
                {
                    Queue.this.execute(runnable);
                    return;
                }
            }

            
            {
                this$0 = Queue.this;
                super();
            }
        };
        name = s;
        queues.add(this);
        poolSize = 2;
        threadGroup = new ThreadGroup(s);
        s = new ThreadFactory() {

            private final AtomicInteger createdCount = new AtomicInteger(1);
            final Queue this$0;

            public final Thread newThread(Runnable runnable)
            {
                runnable = runnable. new Runnable() {

                    final _cls3 this$1;
                    final Runnable val$r;

                    public final void run()
                    {
                        Process.setThreadPriority(10);
                        r.run();
                    }

            
            {
                this$1 = final__pcls3;
                r = Runnable.this;
                super();
            }
                };
                String s1 = (new StringBuilder()).append(Queue.this).append(" #").append(createdCount.getAndIncrement()).toString();
                runnable = new Thread(threadGroup, runnable, s1);
                runnable.setPriority(1);
                return runnable;
            }

            
            {
                this$0 = Queue.this;
                super();
            }
        };
        executor = new ThreadPoolExecutor(poolSize, TimeUnit.SECONDS, new LinkedBlockingQueue(), s, true) {

            final Queue this$0;
            final boolean val$jankLocked = true;

            protected final void beforeExecute(Thread thread, Runnable runnable)
            {
label0:
                {
                    super.beforeExecute(thread, runnable);
                    if (jankLocked)
                    {
                        thread = JankLock.global;
                        if (!JankLock.DISABLED && !AsyncUtil.isMainThread())
                        {
                            break label0;
                        }
                    }
                    return;
                }
                ((JankLock) (thread)).pauseLock.lock();
                while (((JankLock) (thread)).isPaused) 
                {
                    ((JankLock) (thread)).unpaused.awaitUninterruptibly();
                }
                break MISSING_BLOCK_LABEL_66;
                runnable;
                ((JankLock) (thread)).pauseLock.unlock();
                throw runnable;
                ((JankLock) (thread)).pauseLock.unlock();
                return;
            }

            
            {
                this$0 = Queue.this;
                super(final_i, j, 10L, timeunit, blockingqueue, threadfactory);
            }
        };
    }

    public Queue(String s, Executor executor1)
    {
        fallbackIfMain = new _cls2();
        name = s;
        queues.add(this);
        poolSize = 1;
        threadGroup = new ThreadGroup(s);
        executor = executor1;
    }

    public final void execute(Runnable runnable)
    {
        executor.execute(runnable);
    }

    public final String toString()
    {
        return name;
    }

}
