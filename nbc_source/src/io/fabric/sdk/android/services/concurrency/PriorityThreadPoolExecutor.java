// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            DependencyPriorityBlockingQueue, Task, PriorityFutureTask

public class PriorityThreadPoolExecutor extends ThreadPoolExecutor
{
    static final class PriorityThreadFactory
        implements ThreadFactory
    {

        private final int threadPriority;

        public Thread newThread(Runnable runnable)
        {
            runnable = new Thread(runnable);
            runnable.setPriority(threadPriority);
            runnable.setName("Queue");
            return runnable;
        }

        public PriorityThreadFactory(int i)
        {
            threadPriority = i;
        }
    }


    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final long KEEP_ALIVE = 1L;
    private static final int MAXIMUM_POOL_SIZE;

    PriorityThreadPoolExecutor(int i, int j, long l, TimeUnit timeunit, PriorityBlockingQueue priorityblockingqueue, ThreadFactory threadfactory)
    {
        super(i, j, l, timeunit, priorityblockingqueue, threadfactory);
        prestartAllCoreThreads();
    }

    public static PriorityThreadPoolExecutor create()
    {
        return new PriorityThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1L, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new PriorityThreadFactory(10));
    }

    public static PriorityThreadPoolExecutor create(int i)
    {
        return new PriorityThreadPoolExecutor(i, i, 1L, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new PriorityThreadFactory(10));
    }

    protected void afterExecute(Runnable runnable, Throwable throwable)
    {
        if (runnable instanceof Task)
        {
            Task task = (Task)runnable;
            task.notifyFinished();
            task.setError(throwable);
        }
        super.afterExecute(runnable, throwable);
    }

    public void execute(Runnable runnable)
    {
        if (runnable instanceof Comparable)
        {
            super.execute(runnable);
            return;
        } else
        {
            super.execute(newTaskFor(runnable, null));
            return;
        }
    }

    protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new PriorityFutureTask(runnable, obj);
    }

    protected RunnableFuture newTaskFor(Callable callable)
    {
        return new PriorityFutureTask(callable);
    }

    static 
    {
        CPU_COUNT = Runtime.getRuntime().availableProcessors();
        CORE_POOL_SIZE = CPU_COUNT + 1;
        MAXIMUM_POOL_SIZE = CPU_COUNT * 2 + 1;
    }
}
