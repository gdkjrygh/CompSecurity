// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.aw;

import com.comscore.utils.n;
import java.util.concurrent.atomic.AtomicBoolean;
import p.aq.b;

class c
    implements Runnable
{

    private AtomicBoolean a;
    private AtomicBoolean b;
    private Runnable c;
    private b d;
    private long e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    c(Runnable runnable, b b1, long l, boolean flag, long l1)
    {
        c = runnable;
        d = b1;
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
        return e;
    }

    boolean c()
    {
        return h;
    }

    long d()
    {
        return g;
    }

    Runnable e()
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
            com.comscore.utils.c.b(getClass(), "Unexpected error running asynchronous task: ");
            com.comscore.utils.c.a(exception);
            d.r().a("exception_ocurrences", 1L);
            d.t(false);
        }
        a.set(false);
        b.set(true);
    }
}
