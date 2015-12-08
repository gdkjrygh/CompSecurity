// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class lv
{

    private static lv a;
    private final Thread.UncaughtExceptionHandler b = Thread.getDefaultUncaughtExceptionHandler();
    private final Map c = new WeakHashMap();

    private lv()
    {
        Thread.setDefaultUncaughtExceptionHandler(new a(null));
    }

    public static lv a()
    {
        com/flurry/sdk/lv;
        JVM INSTR monitorenter ;
        lv lv1;
        if (a == null)
        {
            a = new lv();
        }
        lv1 = a;
        com/flurry/sdk/lv;
        JVM INSTR monitorexit ;
        return lv1;
        Exception exception;
        exception;
        throw exception;
    }

    static void a(lv lv1, Thread thread, Throwable throwable)
    {
        lv1.a(thread, throwable);
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
        com/flurry/sdk/lv;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.d();
        }
        a = null;
        com/flurry/sdk/lv;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void b(lv lv1, Thread thread, Throwable throwable)
    {
        lv1.b(thread, throwable);
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

    private class a
        implements Thread.UncaughtExceptionHandler
    {

        final lv a;

        public final void uncaughtException(Thread thread, Throwable throwable)
        {
            lv.a(a, thread, throwable);
            lv.b(a, thread, throwable);
        }

        private a()
        {
            a = lv.this;
            super();
        }

        a(_cls1 _pcls1)
        {
            this();
        }
    }

}
