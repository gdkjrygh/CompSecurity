// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class ht
{
    final class a
        implements Thread.UncaughtExceptionHandler
    {

        final ht a;

        public void uncaughtException(Thread thread, Throwable throwable)
        {
            ht.a(a, thread, throwable);
            ht.b(a, thread, throwable);
        }

        private a()
        {
            a = ht.this;
            super();
        }

    }


    private static ht a;
    private final Thread.UncaughtExceptionHandler b = Thread.getDefaultUncaughtExceptionHandler();
    private final Map c = new WeakHashMap();

    private ht()
    {
        Thread.setDefaultUncaughtExceptionHandler(new a());
    }

    public static ht a()
    {
        com/flurry/sdk/ht;
        JVM INSTR monitorenter ;
        ht ht1;
        if (a == null)
        {
            a = new ht();
        }
        ht1 = a;
        com/flurry/sdk/ht;
        JVM INSTR monitorexit ;
        return ht1;
        Exception exception;
        exception;
        throw exception;
    }

    static void a(ht ht1, Thread thread, Throwable throwable)
    {
        ht1.a(thread, throwable);
    }

    private void a(Thread thread, Throwable throwable)
    {
        for (Iterator iterator = c().iterator(); iterator.hasNext();)
        {
            Thread.UncaughtExceptionHandler uncaughtexceptionhandler = (Thread.UncaughtExceptionHandler)iterator.next();
            try
            {
                uncaughtexceptionhandler.uncaughtException(thread, throwable);
            }
            catch (Throwable throwable1) { }
        }

    }

    public static void b()
    {
        com/flurry/sdk/ht;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.d();
        }
        a = null;
        com/flurry/sdk/ht;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void b(ht ht1, Thread thread, Throwable throwable)
    {
        ht1.b(thread, throwable);
    }

    private void b(Thread thread, Throwable throwable)
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        b.uncaughtException(thread, throwable);
        return;
        thread;
    }

    private Set c()
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

    private void d()
    {
        Thread.setDefaultUncaughtExceptionHandler(b);
    }

    public void a(Thread.UncaughtExceptionHandler uncaughtexceptionhandler)
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
