// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.m;

import com.kik.g.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class q
{
    private static final class a
        implements Runnable
    {

        protected final p a;
        protected final Callable b;

        public final void run()
        {
            try
            {
                Object obj = b.call();
                a.a(obj);
                return;
            }
            catch (Throwable throwable)
            {
                a.a(throwable);
            }
        }

        protected a(p p1, Callable callable)
        {
            a = p1;
            b = callable;
        }
    }


    private ExecutorService a;

    public q()
    {
        a = Executors.newSingleThreadExecutor();
    }

    public final p a(Callable callable)
    {
        this;
        JVM INSTR monitorenter ;
        p p1;
        p1 = new p();
        a.submit(new a(p1, callable));
        this;
        JVM INSTR monitorexit ;
        return p1;
        callable;
        throw callable;
    }
}
