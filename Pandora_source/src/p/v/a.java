// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.v;

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

// Referenced classes of package p.v:
//            b

public class p.v.a extends ThreadPoolExecutor
{
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

    static class b extends FutureTask
        implements Comparable
    {

        private final int a;
        private final int b;

        public int a(b b1)
        {
            int j = a - b1.a;
            int i = j;
            if (j == 0)
            {
                i = b - b1.b;
            }
            return i;
        }

        public int compareTo(Object obj)
        {
            return a((b)obj);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof b)
            {
                obj = (b)obj;
                flag = flag1;
                if (b == ((b) (obj)).b)
                {
                    flag = flag1;
                    if (a == ((b) (obj)).a)
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

        public b(Runnable runnable, Object obj, int i)
        {
            super(runnable, obj);
            if (!(runnable instanceof p.v.b))
            {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            } else
            {
                a = ((p.v.b)runnable).b();
                b = i;
                return;
            }
        }
    }

    public static class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        private static final c d[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(p/v/a$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        protected void a(Throwable throwable)
        {
        }

        static 
        {
            a = new c("IGNORE", 0);
            b = new c("LOG", 1) {

                protected void a(Throwable throwable)
                {
                    if (Log.isLoggable("PriorityExecutor", 6))
                    {
                        Log.e("PriorityExecutor", "Request threw uncaught throwable", throwable);
                    }
                }

            };
            c = new c("THROW", 2) {

                protected void a(Throwable throwable)
                {
                    super.a(throwable);
                    throw new RuntimeException(throwable);
                }

            };
            d = (new c[] {
                a, b, c
            });
        }

        private c(String s, int i)
        {
            super(s, i);
        }

    }


    private final AtomicInteger a;
    private final c b;

    public p.v.a(int i)
    {
        this(i, c.b);
    }

    public p.v.a(int i, int j, long l, TimeUnit timeunit, ThreadFactory threadfactory, c c1)
    {
        super(i, j, l, timeunit, new PriorityBlockingQueue(), threadfactory);
        a = new AtomicInteger();
        b = c1;
    }

    public p.v.a(int i, c c1)
    {
        this(i, i, 0L, TimeUnit.MILLISECONDS, ((ThreadFactory) (new a())), c1);
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
        return new b(runnable, obj, a.getAndIncrement());
    }
}
