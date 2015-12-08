// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.j.g;
import com.google.android.m4b.maps.j.m;
import com.google.android.m4b.maps.j.x;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            d, g, b, i, 
//            q, e, f, j

final class h
    implements com.google.android.m4b.maps.h.d
{
    final class a extends Handler
    {

        private h a;

        public final void handleMessage(Message message)
        {
            message.what;
            JVM INSTR tableswitch 1 2: default 28
        //                       1 61
        //                       2 108;
               goto _L1 _L2 _L3
_L1:
            int i1 = message.what;
            Log.w("GoogleApiClientImpl", (new StringBuilder(31)).append("Unknown message id: ").append(i1).toString());
            return;
_L2:
            message = a;
            ((h) (message)).a.lock();
            if (message.g())
            {
                message.b();
            }
            ((h) (message)).a.unlock();
            return;
            Exception exception;
            exception;
            ((h) (message)).a.unlock();
            throw exception;
_L3:
            com.google.android.m4b.maps.h.h.a(a);
            return;
        }

        a(Looper looper)
        {
            a = h.this;
            super(looper);
        }
    }

    static final class b extends BroadcastReceiver
    {

        private WeakReference a;

        public final void onReceive(Context context, Intent intent)
        {
            intent = intent.getData();
            context = null;
            if (intent != null)
            {
                context = intent.getSchemeSpecificPart();
            }
            if (context != null && context.equals("com.google.android.gms"))
            {
                if ((context = (h)a.get()) != null)
                {
                    com.google.android.m4b.maps.h.h.a(context);
                    return;
                }
            }
        }

        b(h h1)
        {
            a = new WeakReference(h1);
        }
    }

    static interface c
    {
    }

    public abstract class d
        implements d.b
    {

        private h a;

        public final void a(int i1)
        {
            a.a.lock();
            a.r.b(i1);
            a.a.unlock();
            return;
            Exception exception;
            exception;
            a.a.unlock();
            throw exception;
        }

        public d()
        {
            a = h.this;
            super();
        }
    }

    static interface e
    {

        public abstract void a();

        public abstract void a(c c1);

        public abstract b.c b();

        public abstract void b(b.a a1);

        public abstract void b(q q1);

        public abstract void c(q q1);
    }


    final Lock a = new ReentrantLock();
    final Condition b;
    final m c;
    final Context d;
    final Looper e;
    final Queue f = new LinkedList();
    volatile boolean g;
    long h;
    long i;
    final a j;
    BroadcastReceiver k;
    final Map l = new HashMap();
    final Map m = new HashMap();
    Set n;
    g o;
    Map p;
    b.b q;
    volatile i r;
    final Set s = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final int t;
    private final int u;
    private com.google.android.m4b.maps.g.a v;
    private final Set w = Collections.newSetFromMap(new WeakHashMap());
    private final c x = new c() {

        private h a;

            
            {
                a = h.this;
                super();
            }
    };
    private final d.b y = new d() {

        private h a;

        public final void a(Bundle bundle)
        {
            a.r.a(bundle);
        }

            
            {
                a = h.this;
                super();
            }
    };
    private final com.google.android.m4b.maps.j.m.a z = new com.google.android.m4b.maps.j.m.a() {

        private h a;

        public final boolean e()
        {
            return a.r instanceof com.google.android.m4b.maps.h.e;
        }

            
            {
                a = h.this;
                super();
            }
    };

    public h(Context context, Looper looper, g g1, b.b b1, Map map, Set set, Set set1, 
            int i1, int j1)
    {
        h = 0x1d4c0L;
        i = 5000L;
        n = new HashSet();
        v = null;
        d = context;
        c = new m(looper, z);
        e = looper;
        j = new a(looper);
        t = i1;
        u = j1;
        p = new HashMap();
        b = a.newCondition();
        r = new com.google.android.m4b.maps.h.g(this);
        d.b b2;
        for (set = set.iterator(); set.hasNext(); c.a(b2))
        {
            b2 = (d.b)set.next();
        }

        for (set = set1.iterator(); set.hasNext(); c.a(set1))
        {
            set1 = (d.d)set.next();
        }

        set = g1.d;
        set1 = map.keySet().iterator();
        while (set1.hasNext()) 
        {
            com.google.android.m4b.maps.h.b b3 = (com.google.android.m4b.maps.h.b)set1.next();
            Object obj = map.get(b3);
            if (set.get(b3) != null)
            {
                if (((com.google.android.m4b.maps.j.g.a)set.get(b3)).b)
                {
                    i1 = 1;
                } else
                {
                    i1 = 2;
                }
            } else
            {
                i1 = 0;
            }
            p.put(b3, Integer.valueOf(i1));
            obj = b3.a().a(context, looper, g1, obj, y, new d.d(b3, i1) {

                private com.google.android.m4b.maps.h.b a;
                private int b;
                private h c;

                public final void a(com.google.android.m4b.maps.g.a a1)
                {
                    c.r.a(a1, a, b);
                }

            
            {
                c = h.this;
                a = b1;
                b = i1;
                super();
            }
            });
            l.put(b3.b(), obj);
        }
        o = g1;
        q = b1;
    }

    static void a(h h1)
    {
        h1.a.lock();
        if (h1.g)
        {
            h1.b();
        }
        h1.a.unlock();
        return;
        Exception exception;
        exception;
        h1.a.unlock();
        throw exception;
    }

    public final Looper a()
    {
        return e;
    }

    public final c.a a(c.a a1)
    {
        boolean flag;
        if (a1.a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.j.x.b(flag, "This task can not be enqueued (it's probably a Batch or malformed)");
        com.google.android.m4b.maps.j.x.b(l.containsKey(a1.a), "GoogleApiClient is not configured to use the API required for this call.");
        a.lock();
        a1 = r.a(a1);
        a.unlock();
        return a1;
        a1;
        a.unlock();
        throw a1;
    }

    final void a(com.google.android.m4b.maps.g.a a1)
    {
        a.lock();
        v = a1;
        r = new com.google.android.m4b.maps.h.g(this);
        r.a();
        b.signalAll();
        a.unlock();
        return;
        a1;
        a.unlock();
        throw a1;
    }

    public final void a(d.b b1)
    {
        c.a(b1);
    }

    public final void a(d.d d1)
    {
        c.a(d1);
    }

    final void a(e e1)
    {
        s.add(e1);
        e1.a(x);
    }

    public final void a(String s1, PrintWriter printwriter)
    {
        printwriter.append(s1).append("mState=").append(r.c());
        printwriter.append(" mResuming=").print(g);
        printwriter.append(" mWorkQueue.size()=").print(f.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(s.size());
        String s2 = String.valueOf(s1).concat("  ");
        com.google.android.m4b.maps.h.b b1;
        for (Iterator iterator = p.keySet().iterator(); iterator.hasNext(); ((b.a)l.get(b1.b())).a(s2, printwriter))
        {
            b1 = (com.google.android.m4b.maps.h.b)iterator.next();
            printwriter.append(s1).append(b1.b).println(":");
        }

    }

    public final c.a b(c.a a1)
    {
        e e1;
        boolean flag;
        if (a1.a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.m4b.maps.j.x.b(flag, "This task can not be executed (it's probably a Batch or malformed)");
        a.lock();
        if (!g)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        f.add(a1);
        for (; !f.isEmpty(); e1.c(q.b))
        {
            e1 = (e)f.remove();
            a(e1);
        }

        break MISSING_BLOCK_LABEL_102;
        a1;
        a.unlock();
        throw a1;
        a.unlock();
        return a1;
        a1 = r.b(a1);
        a.unlock();
        return a1;
    }

    public final void b()
    {
        a.lock();
        r.b();
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public final void b(d.b b1)
    {
        m m1;
        m1 = c;
        com.google.android.m4b.maps.j.x.a(b1);
        Object obj = m1.i;
        obj;
        JVM INSTR monitorenter ;
        if (m1.b.remove(b1)) goto _L2; else goto _L1
_L1:
        b1 = String.valueOf(b1);
        Log.w("GmsClientEvents", (new StringBuilder(String.valueOf(b1).length() + 52)).append("unregisterConnectionCallbacks(): listener ").append(b1).append(" not found").toString());
_L4:
        return;
_L2:
        if (m1.g)
        {
            m1.c.add(b1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        b1;
        obj;
        JVM INSTR monitorexit ;
        throw b1;
    }

    public final void b(d.d d1)
    {
        m m1 = c;
        com.google.android.m4b.maps.j.x.a(d1);
        synchronized (m1.i)
        {
            if (!m1.d.remove(d1))
            {
                d1 = String.valueOf(d1);
                Log.w("GmsClientEvents", (new StringBuilder(String.valueOf(d1).length() + 57)).append("unregisterConnectionFailedListener(): listener ").append(d1).append(" not found").toString());
            }
        }
        return;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    public final void c()
    {
        g();
        a.lock();
        r.a(-1);
        a.unlock();
        return;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }

    public final boolean d()
    {
        return r instanceof com.google.android.m4b.maps.h.e;
    }

    public final boolean e()
    {
        return r instanceof f;
    }

    final void f()
    {
        e e1;
        for (Iterator iterator = s.iterator(); iterator.hasNext(); e1.a())
        {
            e1 = (e)iterator.next();
            e1.a(null);
        }

        s.clear();
        for (Iterator iterator1 = w.iterator(); iterator1.hasNext();)
        {
            ((j)iterator1.next()).a = null;
        }

        w.clear();
        n.clear();
    }

    final boolean g()
    {
        a.lock();
        boolean flag = g;
        if (!flag)
        {
            a.unlock();
            return false;
        }
        g = false;
        j.removeMessages(2);
        j.removeMessages(1);
        if (k != null)
        {
            d.getApplicationContext().unregisterReceiver(k);
            k = null;
        }
        a.unlock();
        return true;
        Exception exception;
        exception;
        a.unlock();
        throw exception;
    }
}
