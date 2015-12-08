// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            DependencyPriorityBlockingQueue, Task, PriorityTask, PriorityFutureTask

public class PriorityThreadPoolExecutor extends ThreadPoolExecutor
{

    private static final int a;
    private static final int b;
    private static final int c;

    PriorityThreadPoolExecutor(int i, int j, long l, TimeUnit timeunit, DependencyPriorityBlockingQueue dependencypriorityblockingqueue, ThreadFactory threadfactory)
    {
        super(i, j, l, timeunit, dependencypriorityblockingqueue, threadfactory);
        prestartAllCoreThreads();
    }

    public static PriorityThreadPoolExecutor a()
    {
        return a(b, c);
    }

    public static PriorityThreadPoolExecutor a(int i, int j)
    {
        return new PriorityThreadPoolExecutor(i, j, 1L, TimeUnit.SECONDS, new DependencyPriorityBlockingQueue(), new PriorityThreadFactory(10));
    }

    protected void afterExecute(Runnable runnable, Throwable throwable)
    {
        Task task = (Task)runnable;
        task.b(true);
        task.a(throwable);
        b().d();
        super.afterExecute(runnable, throwable);
    }

    public DependencyPriorityBlockingQueue b()
    {
        return (DependencyPriorityBlockingQueue)super.getQueue();
    }

    public void execute(Runnable runnable)
    {
        if (PriorityTask.a(runnable))
        {
            super.execute(runnable);
            return;
        } else
        {
            super.execute(newTaskFor(runnable, null));
            return;
        }
    }

    public BlockingQueue getQueue()
    {
        return b();
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
        a = Runtime.getRuntime().availableProcessors();
        b = a + 1;
        c = a * 2 + 1;
    }

    private class PriorityThreadFactory
        implements ThreadFactory
    {

        private final int a;

        public Thread newThread(Runnable runnable)
        {
            runnable = new Thread(runnable);
            runnable.setPriority(a);
            runnable.setName("Queue");
            return runnable;
        }

        public PriorityThreadFactory(int i)
        {
            a = i;
        }
    }

}
