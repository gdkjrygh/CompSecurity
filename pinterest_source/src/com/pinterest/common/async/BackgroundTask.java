// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.common.async;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.pinterest.common.async:
//            BackgroundResult

public abstract class BackgroundTask extends BackgroundResult
{

    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE = 1;
    private static final int MAXIMUM_POOL_SIZE;
    private static final ScheduledExecutorService SCHEDULER;
    private static final Executor THREAD_POOL_EXECUTOR;
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static final BlockingQueue _poolWorkQueue;
    private static final ThreadFactory _threadFactory;

    public BackgroundTask()
    {
    }

    public void execute()
    {
        THREAD_POOL_EXECUTOR.execute(new TaskRunnable(null));
    }

    public abstract void run();

    public void schedule(long l)
    {
        SCHEDULER.schedule(new TaskRunnable(null), l, TimeUnit.MILLISECONDS);
    }

    static 
    {
        int i = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = i;
        CORE_POOL_SIZE = i + 1;
        MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
        _threadFactory = new _cls1();
        _poolWorkQueue = new LinkedBlockingQueue(128);
        THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1L, TimeUnit.SECONDS, _poolWorkQueue, _threadFactory);
        SCHEDULER = Executors.newScheduledThreadPool(CORE_POOL_SIZE);
    }


    private class TaskRunnable
        implements Runnable
    {

        private BackgroundTask _task;

        public void run()
        {
            if (_task != null)
            {
                _task.run();
                BackgroundTask.UI_HANDLER.post(new TaskFinishRunnable(_task, null));
            }
        }

        private TaskRunnable()
        {
            _task = BackgroundTask.this;
        }

        TaskRunnable(_cls1 _pcls1)
        {
            this();
        }

        /* member class not found */
        class TaskFinishRunnable {}

    }


    private class _cls1
        implements ThreadFactory
    {

        private final AtomicInteger _count = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable)
        {
            return new Thread(runnable, (new StringBuilder("BackgroundTask #")).append(_count.getAndIncrement()).toString());
        }

        _cls1()
        {
        }
    }

}
