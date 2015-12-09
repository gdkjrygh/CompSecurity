// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.flurry.sdk:
//            fu, hi, gb, hr, 
//            gd, hq

public class gc
{

    private static final String a = com/flurry/sdk/gc.getSimpleName();
    private final fu b = new fu();
    private final HashMap c = new HashMap();
    private final HashMap d = new HashMap();
    private final ThreadPoolExecutor e;

    public gc(String s, int i, int j, long l, TimeUnit timeunit, BlockingQueue blockingqueue)
    {
        e = new ThreadPoolExecutor(i, j, l, timeunit, blockingqueue) {

            final gc a;

            protected void afterExecute(Runnable runnable, Throwable throwable)
            {
                super.afterExecute(runnable, throwable);
                throwable = gc.a(a, runnable);
                if (throwable == null)
                {
                    return;
                }
                synchronized (gc.a(a))
                {
                    gc.a(a).remove(throwable);
                }
                gc.a(a, throwable);
                (new hq(this, throwable) {

                    final hr a;
                    final _cls1 b;

                    public void safeRun()
                    {
                        a.k();
                    }

            
            {
                b = _pcls1;
                a = hr1;
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
                thread = gc.a(a, runnable);
                if (thread == null)
                {
                    return;
                } else
                {
                    (new hq(this, thread) {

                        final hr a;
                        final _cls1 b;

                        public void safeRun()
                        {
                            a.j();
                        }

            
            {
                b = _pcls1;
                a = hr1;
                super();
            }
                    }).run();
                    return;
                }
            }

            protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
            {
                gb gb1 = new gb(runnable, obj);
                synchronized (gc.a(a))
                {
                    gc.a(a).put((hr)runnable, gb1);
                }
                return gb1;
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
                a = gc.this;
                super(i, j, l, timeunit, blockingqueue);
            }
        };
        e.setRejectedExecutionHandler(new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy() {

            final gc a;

            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadpoolexecutor)
            {
                super.rejectedExecution(runnable, threadpoolexecutor);
                threadpoolexecutor = gc.a(a, runnable);
                if (threadpoolexecutor == null)
                {
                    return;
                }
                synchronized (gc.a(a))
                {
                    gc.a(a).remove(threadpoolexecutor);
                }
                gc.a(a, threadpoolexecutor);
                (new hq(this, threadpoolexecutor) {

                    final hr a;
                    final _cls2 b;

                    public void safeRun()
                    {
                        a.l();
                    }

            
            {
                b = _pcls2;
                a = hr1;
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
                a = gc.this;
                super();
            }
        });
        s = new hi(s, 1);
        e.setThreadFactory(s);
    }

    static hr a(gc gc1, Runnable runnable)
    {
        return gc1.a(runnable);
    }

    private hr a(Runnable runnable)
    {
        if (runnable instanceof gb)
        {
            return (hr)((gb)runnable).a();
        }
        if (runnable instanceof hr)
        {
            return (hr)runnable;
        } else
        {
            gd.a(6, a, (new StringBuilder()).append("Unknown runnable class: ").append(runnable.getClass().getName()).toString());
            return null;
        }
    }

    static HashMap a(gc gc1)
    {
        return gc1.d;
    }

    static void a(gc gc1, hr hr1)
    {
        gc1.b(hr1);
    }

    private void b(hr hr1)
    {
        this;
        JVM INSTR monitorenter ;
        c(c.get(hr1), hr1);
        this;
        JVM INSTR monitorexit ;
        return;
        hr1;
        throw hr1;
    }

    private void b(Object obj, hr hr1)
    {
        this;
        JVM INSTR monitorenter ;
        b.a(obj, hr1);
        c.put(hr1, obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    private void c(Object obj, hr hr1)
    {
        this;
        JVM INSTR monitorenter ;
        b.b(obj, hr1);
        c.remove(hr1);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public void a(hr hr1)
    {
        this;
        JVM INSTR monitorenter ;
        if (hr1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Future future;
        synchronized (d)
        {
            future = (Future)d.remove(hr1);
        }
        b(hr1);
        if (future == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        future.cancel(true);
        (new hq(hr1) {

            final hr a;
            final gc b;

            public void safeRun()
            {
                a.h();
            }

            
            {
                b = gc.this;
                a = hr1;
                super();
            }
        }).run();
        if (true) goto _L1; else goto _L3
_L3:
        hr1;
        throw hr1;
        hr1;
        hashmap;
        JVM INSTR monitorexit ;
        throw hr1;
    }

    public void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        HashSet hashset = new HashSet();
        hashset.addAll(b.a(obj));
        obj = hashset.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            a((hr)((Iterator) (obj)).next());
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public void a(Object obj, hr hr1)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null && hr1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b(obj, hr1);
        e.submit(hr1);
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public long b(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null) goto _L2; else goto _L1
_L1:
        long l = 0L;
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        int i = b.a(obj).size();
        l = i;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = new HashSet();
        ((Set) (obj)).addAll(b.c());
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); a(((Iterator) (obj)).next())) { }
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

}
