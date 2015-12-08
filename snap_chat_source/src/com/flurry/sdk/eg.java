// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.flurry.sdk:
//            ds, ew, ef, fd, 
//            el, fc

public class eg
{

    private static final String a = com/flurry/sdk/eg.getSimpleName();
    private final ds b = new ds();
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();
    private final ThreadPoolExecutor e;

    public eg(String s, int i, int j, long l, TimeUnit timeunit, BlockingQueue blockingqueue)
    {
        e = new ThreadPoolExecutor(i, j, l, timeunit, blockingqueue) {

            final eg a;

            protected void afterExecute(Runnable runnable, Throwable throwable)
            {
                super.afterExecute(runnable, throwable);
                throwable = eg.a(a, runnable);
                if (throwable == null)
                {
                    return;
                }
                synchronized (eg.a(a))
                {
                    eg.a(a).remove(throwable);
                }
                eg.a(a, throwable);
                (new fc(this, throwable) {

                    final fd a;
                    final _cls1 b;

                    public void a()
                    {
                        a.k();
                    }

            
            {
                b = _pcls1;
                a = fd1;
                super();
            }
                }).run();
                return;
                throwable;
                runnable;
                JVM INSTR monitorexit ;
                throw throwable;
            }

            protected void beforeExecute(Thread thread, Runnable runnable)
            {
                super.beforeExecute(thread, runnable);
                thread = eg.a(a, runnable);
                if (thread == null)
                {
                    return;
                } else
                {
                    (new fc(this, thread) {

                        final fd a;
                        final _cls1 b;

                        public void a()
                        {
                            a.j();
                        }

            
            {
                b = _pcls1;
                a = fd1;
                super();
            }
                    }).run();
                    return;
                }
            }

            protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
            {
                ef ef1 = new ef(runnable, obj);
                synchronized (eg.a(a))
                {
                    eg.a(a).put((fd)runnable, ef1);
                }
                return ef1;
                runnable;
                obj;
                JVM INSTR monitorexit ;
                throw runnable;
            }

            protected RunnableFuture newTaskFor(Callable callable)
            {
                throw new UnsupportedOperationException("Callable not supported");
            }

            
            {
                a = eg.this;
                super(i, j, l, timeunit, blockingqueue);
            }
        };
        e.setRejectedExecutionHandler(new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy() {

            final eg a;

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
            {
                super.rejectedExecution(runnable, threadpoolexecutor);
                threadpoolexecutor = eg.a(a, runnable);
                if (threadpoolexecutor == null)
                {
                    return;
                }
                synchronized (eg.a(a))
                {
                    eg.a(a).remove(threadpoolexecutor);
                }
                eg.a(a, threadpoolexecutor);
                (new fc(this, threadpoolexecutor) {

                    final fd a;
                    final _cls2 b;

                    public void a()
                    {
                        a.l();
                    }

            
            {
                b = _pcls2;
                a = fd1;
                super();
            }
                }).run();
                return;
                threadpoolexecutor;
                runnable;
                JVM INSTR monitorexit ;
                throw threadpoolexecutor;
            }

            
            {
                a = eg.this;
                super();
            }
        });
        s = new ew(s, 1);
        e.setThreadFactory(s);
    }

    static fd a(eg eg1, Runnable runnable)
    {
        return eg1.a(runnable);
    }

    private fd a(Runnable runnable)
    {
        if (runnable instanceof ef)
        {
            return (fd)((ef)runnable).a();
        }
        if (runnable instanceof fd)
        {
            return (fd)runnable;
        } else
        {
            el.a(6, a, (new StringBuilder("Unknown runnable class: ")).append(runnable.getClass().getName()).toString());
            return null;
        }
    }

    static HashMap a(eg eg1)
    {
        return eg1.d;
    }

    static void a(eg eg1, fd fd1)
    {
        eg1.b(fd1);
    }

    private void b(fd fd1)
    {
        this;
        JVM INSTR monitorenter ;
        c(c.get(fd1), fd1);
        this;
        JVM INSTR monitorexit ;
        return;
        fd1;
        throw fd1;
    }

    private void b(Object obj, fd fd1)
    {
        this;
        JVM INSTR monitorenter ;
        b.a(obj, fd1);
        c.put(fd1, obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    private void c(Object obj, fd fd1)
    {
        this;
        JVM INSTR monitorenter ;
        b.b(obj, fd1);
        c.remove(fd1);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public void a(Object obj, fd fd1)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null && fd1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b(obj, fd1);
        e.submit(fd1);
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

}
