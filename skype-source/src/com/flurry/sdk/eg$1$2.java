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
//            ff, fg, eg, ef

class t> extends ff
{

    final fg a;
    final a b;

    public void a()
    {
        a.k();
    }

    imeUnit(imeUnit imeunit, fg fg1)
    {
        b = imeunit;
        a = fg1;
        super();
    }

    // Unreferenced inner class com/flurry/sdk/eg$1

/* anonymous class */
    class eg._cls1 extends ThreadPoolExecutor
    {

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
            (new eg._cls1._cls2(this, throwable)).run();
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
                (new eg._cls1._cls1(thread)).run();
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
                a = eg1;
                super(i, j, l, timeunit, blockingqueue);
            }

        // Unreferenced inner class com/flurry/sdk/eg$1$1

/* anonymous class */
        class eg._cls1._cls1 extends ff
        {

            final fg a;
            final eg._cls1 b;

            public void a()
            {
                a.j();
            }

                    
                    {
                        b = eg._cls1.this;
                        a = fg1;
                        super();
                    }
        }

    }

}
