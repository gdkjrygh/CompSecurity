// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.threading;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.aviary.android.feather.common.a.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.aviary.android.feather.common.threading:
//            b, a

public class ThreadPool
{
    public abstract class Worker
        implements com.aviary.android.feather.common.threading.a, Runnable
    {

        com.aviary.android.feather.common.threading.b d;
        a e;
        Object f;
        Exception g;
        boolean h;
        boolean i;
        final ThreadPool j;

        protected void a(Exception exception)
        {
            g = exception;
        }

        protected void a(Object obj)
        {
            f = obj;
        }

        public boolean a()
        {
            f();
            return g != null;
        }

        public Exception b()
        {
            f();
            return g;
        }

        protected void c()
        {
            if (e != null)
            {
                ThreadPool.b(j).post(new Runnable(this) {

                    final Worker a;

                    public void run()
                    {
                        a.e.a();
                    }

            
            {
                a = worker;
                super();
            }
                });
            }
        }

        public boolean cancel(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            flag = i;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return false;
_L2:
            i = true;
            c();
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        protected void d()
        {
            if (d != null)
            {
                ThreadPool.b(j).post(new Runnable(this, this) {

                    final com.aviary.android.feather.common.threading.a a;
                    final Worker b;

                    public void run()
                    {
                        b.d.a(a);
                    }

            
            {
                b = worker;
                a = a1;
                super();
            }
                });
            }
        }

        protected void e()
        {
            h = true;
        }

        public void f()
        {
            get();
        }

        public Object get()
        {
            this;
            JVM INSTR monitorenter ;
_L1:
            boolean flag = h;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_43;
            }
            wait();
              goto _L1
            Object obj;
            obj;
            ThreadPool.b().d(((Throwable) (obj)).getMessage());
            ((Throwable) (obj)).printStackTrace();
              goto _L1
            obj;
            throw obj;
            Object obj1 = f;
            this;
            JVM INSTR monitorexit ;
            return obj1;
        }

        public Object get(long l, TimeUnit timeunit)
            throws InterruptedException, ExecutionException, TimeoutException
        {
            throw new TimeoutException("non implemented");
        }

        public boolean isCancelled()
        {
            return i;
        }

        public boolean isDone()
        {
            return h;
        }

        public transient Worker(b b1, com.aviary.android.feather.common.threading.b b2, Object aobj[])
        {
            j = ThreadPool.this;
            super();
            d = b2;
        }
    }

    public static interface a
    {

        public abstract void a();
    }

    public static interface b
    {

        public transient abstract Object a(Worker worker, Object aobj[])
            throws Exception;
    }

    class c
        implements ThreadFactory
    {

        final ThreadPool a;
        private final int b;
        private final AtomicInteger c = new AtomicInteger();
        private final String d;

        static int a(c c1)
        {
            return c1.b;
        }

        public Thread newThread(Runnable runnable)
        {
            return new Thread(this, runnable, (new StringBuilder()).append(d).append('-').append(c.getAndIncrement()).toString()) {

                final c a;

                public void run()
                {
                    Process.setThreadPriority(com.aviary.android.feather.common.threading.c.a(a));
                    super.run();
                }

            
            {
                a = c1;
                super(runnable, s);
            }
            };
        }

        public c(String s, int i)
        {
            a = ThreadPool.this;
            super();
            d = s;
            b = i;
        }
    }


    private static final com.aviary.android.feather.common.a.a.c c;
    private final ThreadPoolExecutor a;
    private final Handler b = new Handler(Looper.getMainLooper());

    public ThreadPool(int i, int j)
    {
        a = new ThreadPoolExecutor(i, i * 2, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c("thread-pool-service", j));
    }

    static void a(ThreadPool threadpool)
    {
        threadpool.c();
    }

    static Handler b(ThreadPool threadpool)
    {
        return threadpool.b;
    }

    static com.aviary.android.feather.common.a.a.c b()
    {
        return c;
    }

    private void c()
    {
    }

    public transient com.aviary.android.feather.common.threading.a a(b b1, com.aviary.android.feather.common.threading.b b2, Object aobj[])
    {
        b1 = new Worker(b1, b2, aobj, b1, aobj) {

            final b a;
            final Object b[];
            final ThreadPool c;

            public Object get(long l, TimeUnit timeunit)
                throws InterruptedException, ExecutionException, TimeoutException
            {
                return null;
            }

            public void run()
            {
                Exception exception = null;
                if (i) goto _L2; else goto _L1
_L1:
                Object obj;
                try
                {
                    obj = a.a(this, b);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((Exception) (obj)).printStackTrace();
                    exception = new Exception(((Throwable) (obj)));
                    obj = null;
                    continue; /* Loop/switch isn't completed */
                }
_L4:
                this;
                JVM INSTR monitorenter ;
                if (exception == null)
                {
                    break MISSING_BLOCK_LABEL_35;
                }
                a(exception);
                a(obj);
                e();
                notifyAll();
                this;
                JVM INSTR monitorexit ;
                d();
                com.aviary.android.feather.common.threading.ThreadPool.a(c);
                return;
                obj;
                this;
                JVM INSTR monitorexit ;
                throw obj;
_L2:
                obj = null;
                if (true) goto _L4; else goto _L3
_L3:
            }

            transient 
            {
                c = ThreadPool.this;
                a = b3;
                b = aobj1;
                super(b1, b2, aobj);
            }
        };
        a.execute(b1);
        return b1;
    }

    public void a()
    {
        a.shutdown();
    }

    public String toString()
    {
        return String.format("ThreadPool(pool: %d, corePool: %d, largestPool: %d, maxPool: %d, tasks: %d, active: %d, completed: %d)", new Object[] {
            Integer.valueOf(a.getPoolSize()), Integer.valueOf(a.getCorePoolSize()), Integer.valueOf(a.getLargestPoolSize()), Integer.valueOf(a.getMaximumPoolSize()), Long.valueOf(a.getTaskCount()), Integer.valueOf(a.getActiveCount()), Long.valueOf(a.getCompletedTaskCount())
        });
    }

    static 
    {
        c = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/common/threading/ThreadPool.getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
    }
}
