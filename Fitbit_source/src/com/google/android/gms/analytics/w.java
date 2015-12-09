// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bn;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.analytics:
//            v, c, af, p, 
//            ad, ab, at, ac

class w
    implements ac.b, ac.c, v
{

    private volatile long a;
    private volatile a b;
    private volatile ab c;
    private ad d;
    private ad e;
    private final c f;
    private final af g;
    private final Context h;
    private final Queue i;
    private volatile int j;
    private volatile Timer k;
    private volatile Timer l;
    private volatile Timer m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private bl r;
    private long s;

    w(Context context, af af1)
    {
        this(context, af1, null, com.google.android.gms.analytics.c.a(context));
    }

    w(Context context, af af1, ad ad1, c c1)
    {
        i = new ConcurrentLinkedQueue();
        s = 0x493e0L;
        e = ad1;
        h = context;
        g = af1;
        f = c1;
        r = bn.c();
        j = 0;
    /* block-local class not found */
    class a {}

        b = a.g;
    }

    private Timer a(Timer timer)
    {
        if (timer != null)
        {
            timer.cancel();
        }
        return null;
    }

    static void a(w w1)
    {
        w1.h();
    }

    static a b(w w1)
    {
        return w1.b;
    }

    static void c(w w1)
    {
        w1.j();
    }

    static void d(w w1)
    {
        w1.k();
    }

    static Queue e(w w1)
    {
        return w1.i;
    }

    static long f(w w1)
    {
        return w1.a;
    }

    static long g(w w1)
    {
        return w1.s;
    }

    private void g()
    {
        k = a(k);
        l = a(l);
        m = a(m);
    }

    static bl h(w w1)
    {
        return w1.r;
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(g.e())) goto _L2; else goto _L1
_L1:
        g.d().add(new _cls1());
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (o)
        {
            a();
        }
    /* anonymous class not found */
    class _anm2 {}

        _cls2.a[b.ordinal()];
        JVM INSTR tableswitch 1 7: default 362
    //                   1 108
    //                   2 219
    //                   3 362
    //                   4 362
    //                   5 362
    //                   6 338
    //                   7 188;
           goto _L3 _L4 _L5 _L3 _L3 _L3 _L6 _L7
_L4:
    /* block-local class not found */
    class d {}

        d d1;
        for (; !i.isEmpty(); d.a(d1.a(), d1.b(), d1.c(), d1.d()))
        {
            d1 = (d)i.poll();
            com.google.android.gms.analytics.p.c((new StringBuilder()).append("Sending hit to store  ").append(d1).toString());
        }

          goto _L8
        Exception exception;
        exception;
        throw exception;
_L7:
        com.google.android.gms.analytics.p.c("Blocked. Dropping hits.");
        i.clear();
          goto _L3
_L8:
        if (!n) goto _L3; else goto _L9
_L9:
        i();
          goto _L3
_L5:
        if (i.isEmpty()) goto _L11; else goto _L10
_L10:
        d d2;
        d2 = (d)i.peek();
        com.google.android.gms.analytics.p.c((new StringBuilder()).append("Sending hit to service   ").append(d2).toString());
        if (f.b()) goto _L13; else goto _L12
_L12:
        c.a(d2.a(), d2.b(), d2.c(), d2.d());
_L14:
        i.poll();
          goto _L5
_L13:
        com.google.android.gms.analytics.p.c("Dry run enabled. Hit not actually sent to service.");
          goto _L14
_L11:
        a = r.b();
          goto _L3
_L6:
        com.google.android.gms.analytics.p.c("Need to reconnect");
        if (!i.isEmpty())
        {
            k();
        }
          goto _L3
    }

    private void i()
    {
        d.c();
        n = false;
    }

    static void i(w w1)
    {
        w1.l();
    }

    static Timer j(w w1)
    {
        return w1.m;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        a1 = b;
        a2 = a.c;
        if (a1 != a2) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (h == null || !"com.google.android.gms".equals(h.getPackageName()))
        {
            break MISSING_BLOCK_LABEL_71;
        }
        b = a.d;
        c.c();
        com.google.android.gms.analytics.p.d("Attempted to fall back to local store from service.");
          goto _L1
        Exception exception;
        exception;
        throw exception;
        g();
        com.google.android.gms.analytics.p.c("falling back to local store");
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        d = e;
_L3:
        b = a.c;
        h();
          goto _L1
        at at1 = at.c();
        at1.a(h, g);
        d = at1.d();
          goto _L3
    }

    private void k()
    {
        this;
        JVM INSTR monitorenter ;
        a a1;
        a a2;
        if (q || c == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        a1 = b;
        a2 = a.c;
        if (a1 == a2)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        j = j + 1;
        a(l);
        b = a.a;
        l = new Timer("Failed Connect");
    /* block-local class not found */
    class c {}

        l.schedule(new c(null), 3000L);
        com.google.android.gms.analytics.p.c("connecting to Analytics service");
        c.b();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com.google.android.gms.analytics.p.d("security exception on connectToService");
        j();
          goto _L1
        obj;
        throw obj;
        com.google.android.gms.analytics.p.d("client not initialized.");
        j();
          goto _L1
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null && b == a.b)
        {
            b = a.f;
            c.c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void m()
    {
        k = a(k);
        k = new Timer("Service Reconnect");
    /* block-local class not found */
    class e {}

        k.schedule(new e(null), 5000L);
    }

    public void a()
    {
        com.google.android.gms.analytics.p.c("clearHits called");
        i.clear();
        switch (_cls2.a[b.ordinal()])
        {
        default:
            o = true;
            return;

        case 1: // '\001'
            d.a(0L);
            o = false;
            return;

        case 2: // '\002'
            c.a();
            break;
        }
        o = false;
    }

    public void a(int i1, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        b = a.e;
        if (j >= 2) goto _L2; else goto _L1
_L1:
        com.google.android.gms.analytics.p.d((new StringBuilder()).append("Service unavailable (code=").append(i1).append("), will retry.").toString());
        m();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.google.android.gms.analytics.p.d((new StringBuilder()).append("Service unavailable (code=").append(i1).append("), using local store.").toString());
        j();
        if (true) goto _L4; else goto _L3
_L3:
        intent;
        throw intent;
    }

    public void a(Map map, long l1, String s1, List list)
    {
        com.google.android.gms.analytics.p.c("putHit called");
        i.add(new d(map, l1, s1, list));
        h();
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = q;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.google.android.gms.analytics.p.c("setForceLocalDispatch called.");
        q = true;
        _cls2.a[b.ordinal()];
        JVM INSTR tableswitch 1 6: default 96
    //                   1 11
    //                   2 76
    //                   3 88
    //                   4 11
    //                   5 11
    //                   6 11;
           goto _L3 _L3 _L4 _L5 _L3 _L3 _L3
_L3:
        if (true) goto _L1; else goto _L6
_L6:
_L4:
        l();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L5:
        p = true;
          goto _L1
    }

    public void c()
    {
        switch (_cls2.a[b.ordinal()])
        {
        default:
            n = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            i();
            break;
        }
    }

    public void d()
    {
        if (c != null)
        {
            return;
        } else
        {
            c = new ac(h, this, this);
            k();
            return;
        }
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        l = a(l);
        j = 0;
        com.google.android.gms.analytics.p.c("Connected to service");
        b = a.b;
        if (!p) goto _L2; else goto _L1
_L1:
        l();
        p = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        h();
        m = a(m);
        m = new Timer("disconnect check");
    /* block-local class not found */
    class b {}

        m.schedule(new b(null), s);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != a.d) goto _L2; else goto _L1
_L1:
        com.google.android.gms.analytics.p.c("Service blocked.");
        g();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b != a.f)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        com.google.android.gms.analytics.p.c("Disconnected from service");
        g();
        b = a.g;
          goto _L3
        Exception exception;
        exception;
        throw exception;
label0:
        {
            com.google.android.gms.analytics.p.c("Unexpected disconnect.");
            b = a.e;
            if (j >= 2)
            {
                break label0;
            }
            m();
        }
          goto _L3
        j();
          goto _L3
    }

    /* member class not found */
    class _cls1 {}

}
