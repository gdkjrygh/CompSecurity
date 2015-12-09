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
//            hq, hr, gc, gb

class t> extends hq
{

    final hr a;
    final a b;

    public void safeRun()
    {
        a.j();
    }

    imeUnit(imeUnit imeunit, hr hr1)
    {
        b = imeunit;
        a = hr1;
        super();
    }

    // Unreferenced inner class com/flurry/sdk/gc$1

/* anonymous class */
    class gc._cls1 extends ThreadPoolExecutor
    {

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
            (new gc._cls1._cls2(throwable)).run();
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
                (new gc._cls1._cls1(this, thread)).run();
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
                a = gc1;
                super(i, j, l, timeunit, blockingqueue);
            }

        // Unreferenced inner class com/flurry/sdk/gc$1$2

/* anonymous class */
        class gc._cls1._cls2 extends hq
        {

            final hr a;
            final gc._cls1 b;

            public void safeRun()
            {
                a.k();
            }

                    
                    {
                        b = gc._cls1.this;
                        a = hr1;
                        super();
                    }
        }

    }

}
