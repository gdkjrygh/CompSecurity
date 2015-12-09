// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.ip;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.android.gms.analytics:
//            n, s, t, a, 
//            at, w, ar, h, 
//            as, aw, u, p, 
//            an, av, ax, q, 
//            au

final class aq
    implements n, s, t
{

    private volatile long a;
    private volatile int b;
    private volatile p c;
    private u d;
    private u e;
    private final a f;
    private final w g;
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
    private io r;
    private long s;

    aq(Context context, w w1)
    {
        this(context, w1, com.google.android.gms.analytics.a.a(context));
    }

    private aq(Context context, w w1, a a1)
    {
        i = new ConcurrentLinkedQueue();
        e = null;
        h = context;
        g = w1;
        f = a1;
        j = 0;
        b = at.g;
        if (a(context))
        {
            s = 10000L;
        } else
        {
            s = 0x493e0L;
        }
        r = ip.c();
    }

    private static Timer a(Timer timer)
    {
        if (timer != null)
        {
            timer.cancel();
        }
        return null;
    }

    static void a(aq aq1)
    {
        aq1.g();
    }

    private static boolean a(Context context)
    {
        return context != null && "com.google.android.gms".equals(context.getPackageName());
    }

    static int b(aq aq1)
    {
        return aq1.b;
    }

    static void c(aq aq1)
    {
        aq1.i();
    }

    static void d(aq aq1)
    {
        aq1.j();
    }

    static Queue e(aq aq1)
    {
        return aq1.i;
    }

    static long f(aq aq1)
    {
        return aq1.a;
    }

    private void f()
    {
        k = a(k);
        l = a(l);
        m = a(m);
    }

    static long g(aq aq1)
    {
        return aq1.s;
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(g.d())) goto _L2; else goto _L1
_L1:
        g.c().add(new ar(this));
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!o) goto _L4; else goto _L3
_L3:
        com.google.android.gms.analytics.h.c("clearHits called");
        i.clear();
        as.a[b - 1];
        JVM INSTR tableswitch 1 2: default 434
    //                   1 229
    //                   2 246;
           goto _L5 _L6 _L7
_L5:
        o = true;
_L4:
        as.a[b - 1];
        JVM INSTR tableswitch 1 7: default 437
    //                   1 152
    //                   2 294
    //                   3 437
    //                   4 437
    //                   5 437
    //                   6 410
    //                   7 263;
           goto _L8 _L9 _L10 _L8 _L8 _L8 _L11 _L12
_L9:
        aw aw1;
        for (; !i.isEmpty(); d.a(aw1.a(), aw1.b(), aw1.c(), aw1.d()))
        {
            aw1 = (aw)i.poll();
            com.google.android.gms.analytics.h.c((new StringBuilder("Sending hit to store  ")).append(aw1).toString());
        }

          goto _L13
        Exception exception;
        exception;
        throw exception;
_L6:
        d.a();
        o = false;
          goto _L4
_L7:
        c.a();
        o = false;
          goto _L4
_L12:
        com.google.android.gms.analytics.h.c("Blocked. Dropping hits.");
        i.clear();
          goto _L8
_L13:
        if (!n) goto _L8; else goto _L14
_L14:
        h();
          goto _L8
_L10:
        if (i.isEmpty()) goto _L16; else goto _L15
_L15:
        aw aw2;
        aw2 = (aw)i.peek();
        com.google.android.gms.analytics.h.c((new StringBuilder("Sending hit to service   ")).append(aw2).toString());
        if (f.b()) goto _L18; else goto _L17
_L17:
        c.a(aw2.a(), aw2.b(), aw2.c(), aw2.d());
_L19:
        i.poll();
          goto _L10
_L18:
        com.google.android.gms.analytics.h.c("Dry run enabled. Hit not actually sent to service.");
          goto _L19
_L16:
        a = r.b();
          goto _L8
_L11:
        com.google.android.gms.analytics.h.c("Need to reconnect");
        if (!i.isEmpty())
        {
            j();
        }
          goto _L8
    }

    static io h(aq aq1)
    {
        return aq1.r;
    }

    private void h()
    {
        d.c();
        n = false;
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = b;
        j1 = at.c;
        if (i1 != j1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!a(h))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        b = at.d;
        c.c();
        com.google.android.gms.analytics.h.d("Attempted to fall back to local store from service.");
          goto _L1
        Exception exception;
        exception;
        throw exception;
        f();
        com.google.android.gms.analytics.h.c("falling back to local store");
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        d = e;
_L3:
        b = at.c;
        g();
          goto _L1
        an an1 = an.c();
        an1.a(h, g);
        d = an1.a(null);
          goto _L3
    }

    static void i(aq aq1)
    {
        aq1.k();
    }

    static Timer j(aq aq1)
    {
        return aq1.m;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        if (q || c == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        i1 = b;
        j1 = at.c;
        if (i1 == j1)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        j = j + 1;
        a(l);
        b = at.a;
        l = new Timer("Failed Connect");
        l.schedule(new av(this, (byte)0), 3000L);
        com.google.android.gms.analytics.h.c("connecting to Analytics service");
        c.b();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        com.google.android.gms.analytics.h.d("security exception on connectToService");
        i();
          goto _L1
        obj;
        throw obj;
        com.google.android.gms.analytics.h.d("client not initialized.");
        i();
          goto _L1
    }

    private void k()
    {
        this;
        JVM INSTR monitorenter ;
        if (c != null && b == at.b)
        {
            b = at.f;
            c.c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void l()
    {
        k = a(k);
        k = new Timer("Service Reconnect");
        k.schedule(new ax(this, (byte)0), 5000L);
    }

    public final void a()
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
        com.google.android.gms.analytics.h.c("setForceLocalDispatch called.");
        q = true;
        as.a[b - 1];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 11
    //                   2 60
    //                   3 72;
           goto _L3 _L3 _L4 _L5
_L3:
        if (true) goto _L1; else goto _L6
_L6:
_L4:
        k();
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L5:
        p = true;
          goto _L1
    }

    public final void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        b = at.e;
        if (j >= 2) goto _L2; else goto _L1
_L1:
        com.google.android.gms.analytics.h.d((new StringBuilder("Service unavailable (code=")).append(i1).append("), will retry.").toString());
        l();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.google.android.gms.analytics.h.d((new StringBuilder("Service unavailable (code=")).append(i1).append("), using local store.").toString());
        i();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        switch (as.a[b - 1])
        {
        default:
            n = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            h();
            break;
        }
    }

    public final void c()
    {
        if (c != null)
        {
            return;
        } else
        {
            c = new q(h, this, this);
            j();
            return;
        }
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        l = a(l);
        j = 0;
        com.google.android.gms.analytics.h.c("Connected to service");
        b = at.b;
        if (!p) goto _L2; else goto _L1
_L1:
        k();
        p = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        g();
        m = a(m);
        m = new Timer("disconnect check");
        m.schedule(new au(this, (byte)0), s);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != at.d) goto _L2; else goto _L1
_L1:
        com.google.android.gms.analytics.h.c("Service blocked.");
        f();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b != at.f)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        com.google.android.gms.analytics.h.c("Disconnected from service");
        f();
        b = at.g;
          goto _L3
        Exception exception;
        exception;
        throw exception;
label0:
        {
            com.google.android.gms.analytics.h.c("Unexpected disconnect.");
            b = at.e;
            if (j >= 2)
            {
                break label0;
            }
            l();
        }
          goto _L3
        i();
          goto _L3
    }
}
