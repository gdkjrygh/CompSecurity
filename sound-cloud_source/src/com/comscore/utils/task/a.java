// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.task;

import com.comscore.analytics.Core;
import com.comscore.utils.CSLog;
import com.comscore.utils.Storage;
import java.util.concurrent.atomic.AtomicBoolean;

class a
    implements Runnable
{

    private AtomicBoolean a;
    private AtomicBoolean b;
    private Runnable c;
    private Core d;
    private long e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    a(Runnable runnable, Core core)
    {
        this(runnable, core, 0L);
    }

    a(Runnable runnable, Core core, long l)
    {
        this(runnable, core, l, false, 0L);
    }

    a(Runnable runnable, Core core, long l, boolean flag, long l1)
    {
        c = runnable;
        d = core;
        long l3 = System.currentTimeMillis();
        long l2;
        boolean flag1;
        if (l > 0L)
        {
            l2 = l;
        } else
        {
            l2 = 0L;
        }
        e = l2 + l3;
        if (l > 0L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = flag1;
        f = System.currentTimeMillis();
        h = flag;
        g = l1;
        a = new AtomicBoolean();
        b = new AtomicBoolean();
        b.set(false);
        a.set(false);
    }

    long a()
    {
        long l = e - System.currentTimeMillis();
        if (l > 0L)
        {
            return l;
        } else
        {
            return 0L;
        }
    }

    long b()
    {
        return f;
    }

    boolean c()
    {
        return a.get();
    }

    boolean d()
    {
        return i;
    }

    boolean e()
    {
        return b.get();
    }

    long f()
    {
        return e;
    }

    boolean g()
    {
        return h;
    }

    long h()
    {
        return g;
    }

    Runnable i()
    {
        return c;
    }

    public void run()
    {
        a.set(true);
        try
        {
            c.run();
        }
        catch (Exception exception)
        {
            CSLog.e(getClass(), "Unexpected error running asynchronous task: ");
            CSLog.printStackTrace(exception);
            d.getStorage().add("exception_ocurrences", 1L);
            d.setEnabled(false);
        }
        a.set(false);
        b.set(true);
    }
}
