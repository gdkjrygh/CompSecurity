// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class ec
{
    final class a
        implements Thread.UncaughtExceptionHandler
    {

        final ec a;

        public final void uncaughtException(Thread thread, Throwable throwable)
        {
            ec.a(a, thread, throwable);
            ec.b(a, thread, throwable);
        }

        private a()
        {
            a = ec.this;
            super();
        }

    }


    private static ec a;
    private final Thread.UncaughtExceptionHandler b = Thread.getDefaultUncaughtExceptionHandler();
    private final Map c = new WeakHashMap();

    private ec()
    {
        Thread.setDefaultUncaughtExceptionHandler(new a());
    }

    public static ec a()
    {
        com/flurry/sdk/ec;
        JVM INSTR monitorenter ;
        ec ec1;
        if (a == null)
        {
            a = new ec();
        }
        ec1 = a;
        com/flurry/sdk/ec;
        JVM INSTR monitorexit ;
        return ec1;
        Exception exception;
        exception;
        throw exception;
    }

    static void a(ec ec1, Thread thread, Throwable throwable)
    {
        ec1.a(thread, throwable);
    }

    private void a(Thread thread, Throwable throwable)
    {
        for (Iterator iterator = b().iterator(); iterator.hasNext();)
        {
            Thread.UncaughtExceptionHandler uncaughtexceptionhandler = (Thread.UncaughtExceptionHandler)iterator.next();
            try
            {
                uncaughtexceptionhandler.uncaughtException(thread, throwable);
            }
            catch (Throwable throwable1) { }
        }

    }

    private Set b()
    {
        Set set;
        synchronized (c)
        {
            set = c.keySet();
        }
        return set;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void b(ec ec1, Thread thread, Throwable throwable)
    {
        ec1.b(thread, throwable);
    }

    private void b(Thread thread, Throwable throwable)
    {
        if (b != null)
        {
            b.uncaughtException(thread, throwable);
        }
    }

    public final void a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
    {
        synchronized (c)
        {
            c.put(uncaughtexceptionhandler, null);
        }
        return;
        uncaughtexceptionhandler;
        map;
        JVM INSTR monitorexit ;
        throw uncaughtexceptionhandler;
    }
}
