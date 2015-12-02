// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.facebook.analytics.AnalyticsServiceEvent;
import com.facebook.analytics.cd;
import com.facebook.analytics.service.AnalyticsService;
import com.facebook.common.e.h;
import com.facebook.common.v.f;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.google.common.a.es;
import com.google.common.a.hq;
import com.google.common.d.a.i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.analytics.a:
//            d, f, e, c

public class a
{

    private static final Class a;
    private static final String b;
    private static final String c;
    private final Context d;
    private final com.facebook.common.time.a e;
    private final ScheduledExecutorService f;
    private final d g;
    private final com.facebook.common.executors.a h;
    private final h i;
    private final f j;
    private final com.facebook.analytics.a.d k = new com.facebook.analytics.a.d(this, null);
    private final com.facebook.analytics.a.f l = new com.facebook.analytics.a.f(this, null);
    private final Object m = new Object();
    private final List n = hq.a();
    private long o;
    private long p;
    private boolean q;

    public a(Context context, com.facebook.common.time.a a1, ScheduledExecutorService scheduledexecutorservice, d d1, com.facebook.common.executors.a a2, h h1, f f1)
    {
        o = -1L;
        q = false;
        d = context;
        e = a1;
        f = scheduledexecutorservice;
        g = d1;
        h = a2;
        i = h1;
        j = f1;
        p = 5000L;
        g.a(k);
        o = e.a() + p;
    }

    static void a(a a1)
    {
        a1.h();
    }

    static void a(a a1, ServiceConnection serviceconnection)
    {
        a1.b(serviceconnection);
    }

    private boolean a(ServiceConnection serviceconnection)
    {
        com.facebook.debug.log.b.a(a, "bindService()");
        Intent intent = new Intent(d, com/facebook/analytics/service/AnalyticsService);
        return d.bindService(intent, serviceconnection, f());
    }

    static d b(a a1)
    {
        return a1.g;
    }

    private void b(ServiceConnection serviceconnection)
    {
        com.facebook.debug.log.b.a(a, "unbindService()");
        d.unbindService(serviceconnection);
    }

    static Class e()
    {
        return a;
    }

    private static int f()
    {
        byte byte0 = 5;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            byte0 = 37;
        }
        return byte0;
    }

    private void g()
    {
        o = e.a();
    }

    private void h()
    {
        com.facebook.debug.log.b.a(a, "send()");
        if (!n.isEmpty())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        com.facebook.debug.log.b.a(a, "send(): no events in queue. Shutting down thread.");
        synchronized (m)
        {
            g();
            q = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        e e1;
        c c1;
        h.b();
        j.a(5000L);
        com.facebook.debug.log.b.a(a, "Initializing Service connection.");
        e1 = new e();
        c1 = new c(this, e1);
        if (!a(e1)) goto _L2; else goto _L1
_L1:
        com.google.common.d.a.i.a(e1.a(), c1, f);
_L4:
        synchronized (m)
        {
            g();
            q = false;
        }
        return;
        exception1;
        obj1;
        JVM INSTR monitorexit ;
        throw exception1;
_L2:
        i.a(b, "Failed to bind to service.");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception2;
        exception2;
        synchronized (m)
        {
            g();
            q = false;
        }
        throw exception2;
        exception3;
        obj2;
        JVM INSTR monitorexit ;
        throw exception3;
    }

    long a()
    {
        return o + p;
    }

    public void a(AnalyticsServiceEvent analyticsserviceevent)
    {
        com.facebook.debug.log.b.a(a, "offer()");
        synchronized (m)
        {
            n.add(analyticsserviceevent);
            com.facebook.debug.log.b.a(a, "Pending events: %d", new Object[] {
                Integer.valueOf(n.size())
            });
        }
        c();
        return;
        analyticsserviceevent;
        obj;
        JVM INSTR monitorexit ;
        throw analyticsserviceevent;
    }

    void a(cd cd1)
    {
        es es1;
        com.facebook.debug.log.b.a(a, "onReportEvents()");
        h.b();
        j.a(5000L);
        synchronized (m)
        {
            com.facebook.debug.log.b.a(a, "Copying %d events and clearing pending list.", new Object[] {
                Integer.valueOf(n.size())
            });
            es1 = es.a(n);
            n.clear();
        }
        try
        {
            if (!es1.isEmpty())
            {
                for (obj = hq.a(es1, 50).iterator(); ((Iterator) (obj)).hasNext(); cd1.a((List)((Iterator) (obj)).next())) { }
            }
        }
        // Misplaced declaration of an exception variable
        catch (cd cd1)
        {
            i.a(c, "Failed to send events.", cd1);
            return;
        }
        break MISSING_BLOCK_LABEL_151;
        cd1;
        obj;
        JVM INSTR monitorexit ;
        throw cd1;
        com.facebook.debug.log.b.b(a, "Reported %d events to service.", new Object[] {
            Integer.valueOf(es1.size())
        });
        return;
    }

    long b()
    {
        return Math.max(0L, a() - e.a());
    }

    void c()
    {
label0:
        {
            com.facebook.debug.log.b.a(a, "maybeSendEvents()");
            synchronized (m)
            {
                if (n.size() != 0)
                {
                    break label0;
                }
            }
            return;
        }
        if (!q)
        {
            com.facebook.debug.log.b.a(a, "Scheduling send on background thread in %d ms", new Object[] {
                Long.valueOf(b())
            });
            q = true;
            f.schedule(l, b(), TimeUnit.MILLISECONDS);
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void d()
    {
        long l1 = g.a(aj.m, 5000L);
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        if (l1 < 5000L)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        p = 5000L;
_L1:
        obj;
        JVM INSTR monitorexit ;
        com.facebook.debug.log.b.b(a, "onPreferencesChanged(): mSendInterval = %d ms", new Object[] {
            Long.valueOf(p)
        });
        return;
        p = l1;
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = com/facebook/analytics/a/a;
        b = (new StringBuilder()).append(a.getSimpleName()).append("_BIND_FAILED").toString();
        c = (new StringBuilder()).append(a.getSimpleName()).append("_REMOTE_EXCEPTION").toString();
    }
}
