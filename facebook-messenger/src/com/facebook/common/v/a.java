// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.v;

import android.app.KeyguardManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.common.v:
//            b, c

public class a
{

    public static final String a = (new StringBuilder()).append(com/facebook/common/v/a.getCanonicalName()).append(".USER_MAYBE_BECAME_ACTIVE_OR_INACTIVE_IN_APP").toString();
    public static final String b = (new StringBuilder()).append(com/facebook/common/v/a.getCanonicalName()).append(".USER_ENTERED_APP").toString();
    public static final String c = (new StringBuilder()).append(com/facebook/common/v/a.getCanonicalName()).append(".USER_LEFT_APP").toString();
    private static final Class d = com/facebook/common/v/a;
    private final com.facebook.base.broadcast.a e;
    private final com.facebook.common.executors.a f;
    private final com.facebook.common.time.a g;
    private final ScheduledExecutorService h;
    private final KeyguardManager i;
    private final c j = new c(this);
    private final Runnable k = new b(this);
    private ScheduledFuture l;
    private volatile boolean m;
    private volatile long n;
    private volatile long o;
    private volatile long p;

    public a(com.facebook.base.broadcast.a a1, com.facebook.common.executors.a a2, com.facebook.common.time.a a3, ScheduledExecutorService scheduledexecutorservice, KeyguardManager keyguardmanager)
    {
        e = a1;
        f = a2;
        g = a3;
        h = scheduledexecutorservice;
        i = keyguardmanager;
    }

    static ScheduledFuture a(a a1, ScheduledFuture scheduledfuture)
    {
        a1.l = scheduledfuture;
        return scheduledfuture;
    }

    static boolean a(a a1)
    {
        return a1.m;
    }

    static com.facebook.base.broadcast.a b(a a1)
    {
        return a1.e;
    }

    static void c(a a1)
    {
        a1.h();
    }

    static void d(a a1)
    {
        a1.g();
    }

    static void e(a a1)
    {
        a1.i();
    }

    private void g()
    {
        f.a();
        m = false;
        o = g.a();
        l = h.schedule(k, 5000L, TimeUnit.MILLISECONDS);
        e.a(a);
    }

    private void h()
    {
        f.a();
        m = true;
        n = g.a();
        if (l == null)
        {
            e.a(b);
        } else
        {
            l.cancel(false);
            l = null;
        }
        e.a(a);
    }

    private void i()
    {
        f.a();
        p = g.a();
        e.a(a);
    }

    private boolean j()
    {
        return i.inKeyguardRestrictedInputMode();
    }

    public boolean a()
    {
        return !m && g.a() - o > 5000L;
    }

    public boolean a(long l1)
    {
        return g.a() - p <= l1;
    }

    public boolean b()
    {
        return m && !j();
    }

    public boolean b(long l1)
    {
        for (long l2 = g.a(); l2 - p < l1 || m && l2 - n < l1;)
        {
            return true;
        }

        return false;
    }

    public boolean c()
    {
        return m;
    }

    public long d()
    {
        return p;
    }

    public long e()
    {
        return o;
    }

    public c f()
    {
        return j;
    }

}
