// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.flurry.sdk:
//            ds, ez, ef, fg, 
//            eo, ff

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
                (new ff(this, throwable) {

                    final fg a;
                    final _cls1 b;

                    public void a()
                    {
                        a.k();
                    }

            
            {
                b = _pcls1;
                a = fg1;
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
                    (new ff(this, thread) {

                        final fg a;
                        final _cls1 b;

                        public void a()
                        {
                            a.j();
                        }

            
            {
                b = _pcls1;
                a = fg1;
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
                    eg.a(a).put((fg)runnable, ef1);
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
                (new ff(this, threadpoolexecutor) {

                    final fg a;
                    final _cls2 b;

                    public void a()
                    {
                        a.l();
                    }

            
            {
                b = _pcls2;
                a = fg1;
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
        s = new ez(s, 1);
        e.setThreadFactory(s);
    }

    static fg a(eg eg1, Runnable runnable)
    {
        return eg1.a(runnable);
    }

    private fg a(Runnable runnable)
    {
        if (runnable instanceof ef)
        {
            return (fg)((ef)runnable).a();
        }
        if (runnable instanceof fg)
        {
            return (fg)runnable;
        } else
        {
            eo.a(6, a, (new StringBuilder("Unknown runnable class: ")).append(runnable.getClass().getName()).toString());
            return null;
        }
    }

    static HashMap a(eg eg1)
    {
        return eg1.d;
    }

    static void a(eg eg1, fg fg1)
    {
        eg1.b(fg1);
    }

    private void b(fg fg1)
    {
        this;
        JVM INSTR monitorenter ;
        c(c.get(fg1), fg1);
        this;
        JVM INSTR monitorexit ;
        return;
        fg1;
        throw fg1;
    }

    private void b(Object obj, fg fg1)
    {
        this;
        JVM INSTR monitorenter ;
        b.a(obj, fg1);
        c.put(fg1, obj);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    private void c(Object obj, fg fg1)
    {
        this;
        JVM INSTR monitorenter ;
        b.b(obj, fg1);
        c.remove(fg1);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    public void a(fg fg1)
    {
        this;
        JVM INSTR monitorenter ;
        if (fg1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Future future;
        synchronized (d)
        {
            future = (Future)d.remove(fg1);
        }
        b(fg1);
        if (future == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        future.cancel(true);
        (new ff(fg1) {

            final fg a;
            final eg b;

            public void a()
            {
                a.h();
            }

            
            {
                b = eg.this;
                a = fg1;
                super();
            }
        }).run();
        if (true) goto _L1; else goto _L3
_L3:
        fg1;
        throw fg1;
        fg1;
        hashmap;
        JVM INSTR monitorexit ;
        throw fg1;
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
            a((fg)((Iterator) (obj)).next());
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        throw obj;
    }

    public void a(Object obj, fg fg1)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null && fg1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b(obj, fg1);
        e.submit(fg1);
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

}
