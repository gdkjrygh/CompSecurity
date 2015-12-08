// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.google.analytics.tracking.android:
//            be, f, g, x, 
//            h, ad, aq, aa, 
//            ac, z, d, j, 
//            y, c, l, u, 
//            ab

final class GAServiceProxy
    implements be, f, g
{

    volatile long a;
    volatile ConnectState b;
    final Queue c;
    volatile Timer d;
    l e;
    long f;
    private volatile c g;
    private h h;
    private h i;
    private final j j;
    private final Context k;
    private volatile int l;
    private volatile Timer m;
    private volatile Timer n;
    private boolean o;
    private boolean p;

    private GAServiceProxy(Context context, j j1)
    {
        c = new ConcurrentLinkedQueue();
        f = 0x493e0L;
        i = null;
        k = context;
        j = j1;
        e = new x(this);
        l = 0;
        b = ConnectState.DISCONNECTED;
    }

    GAServiceProxy(Context context, j j1, byte byte0)
    {
        this(context, j1);
    }

    private static Timer a(Timer timer)
    {
        if (timer != null)
        {
            timer.cancel();
        }
        return null;
    }

    private void i()
    {
        m = a(m);
        n = a(n);
        d = a(d);
    }

    private void j()
    {
        h.b();
        o = false;
    }

    private void k()
    {
        m = a(m);
        m = new Timer("Service Reconnect");
        m.schedule(new ad(this), 5000L);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        n = a(n);
        l = 0;
        aq.d("Connected to service");
        b = ConnectState.CONNECTED_SERVICE;
        e();
        d = a(d);
        d = new Timer("disconnect check");
        d.schedule(new aa(this), f);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        b = ConnectState.PENDING_CONNECTION;
        if (l >= 2) goto _L2; else goto _L1
_L1:
        aq.f((new StringBuilder("Service unavailable (code=")).append(i1).append("), will retry.").toString());
        k();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aq.f((new StringBuilder("Service unavailable (code=")).append(i1).append("), using local store.").toString());
        f();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Map map, long l1, String s, List list)
    {
        aq.d("putHit called");
        c.add(new ac(map, l1, s, list));
        e();
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (b != ConnectState.PENDING_DISCONNECT) goto _L2; else goto _L1
_L1:
        aq.d("Disconnected from service");
        i();
        b = ConnectState.DISCONNECTED;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        aq.d("Unexpected disconnect.");
        b = ConnectState.PENDING_CONNECTION;
        if (l >= 2)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        k();
          goto _L3
        Exception exception;
        exception;
        throw exception;
        f();
          goto _L3
    }

    public final void c()
    {
        switch (z.a[b.ordinal()])
        {
        default:
            o = true;
            // fall through

        case 2: // '\002'
            return;

        case 1: // '\001'
            j();
            break;
        }
    }

    public final void d()
    {
        if (g != null)
        {
            return;
        } else
        {
            g = new d(k, this, this);
            g();
            return;
        }
    }

    final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (Thread.currentThread().equals(j.c())) goto _L2; else goto _L1
_L1:
        j.b().add(new y(this));
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!p) goto _L4; else goto _L3
_L3:
        aq.d("clearHits called");
        c.clear();
        z.a[b.ordinal()];
        JVM INSTR tableswitch 1 2: default 368
    //                   1 208
    //                   2 225;
           goto _L5 _L6 _L7
_L5:
        p = true;
_L4:
        z.a[b.ordinal()];
        JVM INSTR tableswitch 1 3: default 371
    //                   1 144
    //                   2 256
    //                   3 342;
           goto _L8 _L9 _L10 _L11
_L9:
        ac ac1;
        for (; !c.isEmpty(); h.a(ac1.a, ac1.b, ac1.c, ac1.d))
        {
            ac1 = (ac)c.poll();
            aq.d("Sending hit to store");
        }

          goto _L12
        Exception exception;
        exception;
        throw exception;
_L6:
        h.a();
        p = false;
          goto _L4
_L7:
        g.a();
        p = false;
          goto _L4
_L12:
        if (!o) goto _L8; else goto _L13
_L13:
        j();
          goto _L8
_L10:
        for (; !c.isEmpty(); c.poll())
        {
            ac ac2 = (ac)c.peek();
            aq.d("Sending hit to service");
            g.a(ac2.a, ac2.b, ac2.c, ac2.d);
        }

        a = e.a();
          goto _L8
_L11:
        aq.d("Need to reconnect");
        if (!c.isEmpty())
        {
            g();
        }
          goto _L8
    }

    final void f()
    {
        this;
        JVM INSTR monitorenter ;
        ConnectState connectstate;
        ConnectState connectstate1;
        connectstate = b;
        connectstate1 = ConnectState.CONNECTED_LOCAL;
        if (connectstate != connectstate1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i();
        aq.d("falling back to local store");
        if (i == null)
        {
            break; /* Loop/switch isn't completed */
        }
        h = i;
_L4:
        b = ConnectState.CONNECTED_LOCAL;
        e();
        if (true) goto _L1; else goto _L3
        Exception exception;
        exception;
        throw exception;
_L3:
        u u1 = u.a();
        u1.a(k, j);
        h = u1.b();
          goto _L4
    }

    final void g()
    {
        this;
        JVM INSTR monitorenter ;
        ConnectState connectstate;
        ConnectState connectstate1;
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        connectstate = b;
        connectstate1 = ConnectState.CONNECTED_LOCAL;
        if (connectstate == connectstate1)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        l = l + 1;
        a(n);
        b = ConnectState.CONNECTING;
        n = new Timer("Failed Connect");
        n.schedule(new ab(this), 3000L);
        aq.d("connecting to Analytics service");
        g.b();
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        aq.f("security exception on connectToService");
        f();
          goto _L1
        obj;
        throw obj;
        aq.f("client not initialized.");
        f();
          goto _L1
    }

    final void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != null && b == ConnectState.CONNECTED_SERVICE)
        {
            b = ConnectState.PENDING_DISCONNECT;
            g.c();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private class ConnectState extends Enum
    {

        public static final ConnectState BLOCKED;
        public static final ConnectState CONNECTED_LOCAL;
        public static final ConnectState CONNECTED_SERVICE;
        public static final ConnectState CONNECTING;
        public static final ConnectState DISCONNECTED;
        public static final ConnectState PENDING_CONNECTION;
        public static final ConnectState PENDING_DISCONNECT;
        private static final ConnectState a[];

        public static ConnectState valueOf(String s)
        {
            return (ConnectState)Enum.valueOf(com/google/analytics/tracking/android/GAServiceProxy$ConnectState, s);
        }

        public static ConnectState[] values()
        {
            return (ConnectState[])a.clone();
        }

        static 
        {
            CONNECTING = new ConnectState("CONNECTING", 0);
            CONNECTED_SERVICE = new ConnectState("CONNECTED_SERVICE", 1);
            CONNECTED_LOCAL = new ConnectState("CONNECTED_LOCAL", 2);
            BLOCKED = new ConnectState("BLOCKED", 3);
            PENDING_CONNECTION = new ConnectState("PENDING_CONNECTION", 4);
            PENDING_DISCONNECT = new ConnectState("PENDING_DISCONNECT", 5);
            DISCONNECTED = new ConnectState("DISCONNECTED", 6);
            a = (new ConnectState[] {
                CONNECTING, CONNECTED_SERVICE, CONNECTED_LOCAL, BLOCKED, PENDING_CONNECTION, PENDING_DISCONNECT, DISCONNECTED
            });
        }

        private ConnectState(String s, int i1)
        {
            super(s, i1);
        }
    }

}
