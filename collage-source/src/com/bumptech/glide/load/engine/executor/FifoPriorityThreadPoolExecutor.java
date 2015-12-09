// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.bumptech.glide.load.engine.executor:
//            a

public class FifoPriorityThreadPoolExecutor extends ThreadPoolExecutor
{
    static class LoadTask extends FutureTask
        implements Comparable
    {

        private final int a;
        private final int b;

        public int a(LoadTask loadtask)
        {
            int j = a - loadtask.a;
            int i = j;
            if (j == 0)
            {
                i = b - loadtask.b;
            }
            return i;
        }

        public int compareTo(Object obj)
        {
            return a((LoadTask)obj);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof LoadTask)
            {
                obj = (LoadTask)obj;
                flag = flag1;
                if (b == ((LoadTask) (obj)).b)
                {
                    flag = flag1;
                    if (a == ((LoadTask) (obj)).a)
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return a * 31 + b;
        }

        public LoadTask(Runnable runnable, Object obj, int i)
        {
            super(runnable, obj);
            if (!(runnable instanceof com.bumptech.glide.load.engine.executor.a))
            {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            } else
            {
                a = ((com.bumptech.glide.load.engine.executor.a)runnable).b();
                b = i;
                return;
            }
        }
    }

    public static class a
        implements ThreadFactory
    {

        int a;

        public Thread newThread(Runnable runnable)
        {
            runnable = new Thread(this, runnable, (new StringBuilder()).append("fifo-pool-thread-").append(a).toString()) {

                final a a;

                public void run()
                {
                    Process.setThreadPriority(10);
                    super.run();
                }

            
            {
                a = a1;
                super(runnable, s);
            }
            };
            a = a + 1;
            return runnable;
        }

        public a()
        {
            a = 0;
        }
    }

    public static class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/bumptech/glide/load/engine/executor/FifoPriorityThreadPoolExecutor$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        protected void a(Throwable throwable)
        {
        }

        static 
        {
            a = new b("IGNORE", 0);
            b = new b("LOG", 1) {

                protected void a(Throwable throwable)
                {
                    if (Log.isLoggable("PriorityExecutor", 6))
                    {
                        Log.e("PriorityExecutor", "Request threw uncaught throwable", throwable);
                    }
                }

            };
            c = new b("THROW", 2) {

                protected void a(Throwable throwable)
                {
                    super.a(throwable);
                    throw new RuntimeException(throwable);
                }

            };
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }

    }


    private final AtomicInteger a;
    private final b b;

    public FifoPriorityThreadPoolExecutor(int i)
    {
        this(i, b.b);
    }

    public FifoPriorityThreadPoolExecutor(int i, int j, long l, TimeUnit timeunit, ThreadFactory threadfactory, b b1)
    {
        super(i, j, l, timeunit, new PriorityBlockingQueue(), threadfactory);
        a = new AtomicInteger();
        b = b1;
    }

    public FifoPriorityThreadPoolExecutor(int i, b b1)
    {
        this(i, i, 0L, TimeUnit.MILLISECONDS, ((ThreadFactory) (new a())), b1);
    }

    protected void afterExecute(Runnable runnable, Throwable throwable)
    {
        super.afterExecute(runnable, throwable);
        if (throwable != null || !(runnable instanceof Future))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        runnable = (Future)runnable;
        if (!runnable.isDone() || runnable.isCancelled())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        runnable.get();
        return;
        runnable;
        b.a(runnable);
        return;
        runnable;
        b.a(runnable);
        return;
    }

    protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new LoadTask(runnable, obj, a.getAndIncrement());
    }
}
