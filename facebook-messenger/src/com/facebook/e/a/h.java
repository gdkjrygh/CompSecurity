// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.e.a;

import com.facebook.base.broadcast.j;
import com.facebook.base.broadcast.k;
import com.facebook.base.broadcast.l;
import com.facebook.common.hardware.q;
import com.facebook.common.hardware.t;
import com.facebook.common.v.a;
import com.facebook.debug.log.b;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.e.a:
//            i, j, k, l, 
//            m, e

public class h
{

    private static Class a = com/facebook/e/a/h;
    private e b;
    private final Runnable c = new i(this);
    private final Runnable d = new com.facebook.e.a.j(this);
    private ScheduledFuture e;
    private ScheduledFuture f;
    private boolean g;
    private boolean h;
    private final ScheduledExecutorService i;
    private final q j;
    private final t k = new com.facebook.e.a.k(this);
    private final j l;
    private final l m;
    private final com.facebook.c.b n = new com.facebook.e.a.l(this);
    private final com.facebook.c.b o = new m(this);

    public h(q q1, j j1, ScheduledExecutorService scheduledexecutorservice)
    {
        j = q1;
        l = j1;
        i = scheduledexecutorservice;
        m = l.a().a(a.b, n).a(a.c, o).a();
    }

    static e a(h h1)
    {
        return h1.b;
    }

    static Class a()
    {
        return a;
    }

    static boolean a(h h1, boolean flag)
    {
        h1.g = flag;
        return flag;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (g && h && (e == null || f == null))
        {
            com.facebook.debug.log.b.b(a, "ResourceManager onStart");
            if (e == null)
            {
                e = i.scheduleAtFixedRate(c, 0L, 1000L, TimeUnit.MILLISECONDS);
            }
            if (f == null)
            {
                f = i.scheduleAtFixedRate(d, 0L, 5000L, TimeUnit.MILLISECONDS);
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void b(h h1)
    {
        h1.b();
    }

    static boolean b(h h1, boolean flag)
    {
        h1.h = flag;
        return flag;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null || f != null)
        {
            com.facebook.debug.log.b.b(a, "ResourceManager onStop");
            if (e != null)
            {
                e.cancel(false);
                e = null;
            }
            if (f != null)
            {
                f.cancel(false);
                f = null;
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void c(h h1)
    {
        h1.c();
    }

    public void a(e e1)
    {
        b = e1;
        g = true;
        h = true;
        b();
        m.b();
        j.a(k);
    }

}
