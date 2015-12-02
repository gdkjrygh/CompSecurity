// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import android.content.Context;
import com.facebook.analytics.a;
import com.facebook.analytics.am;
import com.facebook.analytics.bq;
import com.facebook.analytics.c.e;
import com.facebook.analytics.c.g;
import com.facebook.analytics.ca;
import com.facebook.analytics.periodicreporters.ServicePeriodicReporters;
import com.facebook.analytics.periodicreporters.l;
import com.facebook.base.a.d;
import com.facebook.common.process.c;
import com.facebook.common.v.f;
import com.facebook.common.w.m;
import com.facebook.debug.log.b;
import com.facebook.inject.t;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.analytics.service:
//            l, k

public class i
{

    private static final Class d = com/facebook/analytics/service/i;
    Set a;
    Set b;
    com.facebook.analytics.c.f c;
    private final Context e;
    private final com.facebook.common.time.a f;
    private final e g;
    private final g h;
    private final d i;
    private final Executor j;
    private final LinkedBlockingQueue k;
    private final bq l;
    private final ObjectMapper m;
    private final f n;
    private final com.facebook.common.process.d o;
    private final long p;
    private final Object q;
    private final com.facebook.analytics.service.l r;
    private Map s;
    private int t;
    private long u;
    private long v;
    private boolean w;

    public i(Context context, e e1, g g1, d d1, com.facebook.common.time.a a1, Executor executor, bq bq1, 
            ObjectMapper objectmapper, f f1, com.facebook.common.process.d d2)
    {
        this(context, e1, g1, d1, a1, executor, bq1, objectmapper, f1, d2, 5000L);
    }

    i(Context context, e e1, g g1, d d1, com.facebook.common.time.a a1, Executor executor, bq bq1, 
            ObjectMapper objectmapper, f f1, com.facebook.common.process.d d2, long l1)
    {
        q = new Object();
        b = null;
        t = 0;
        u = -1L;
        v = -1L;
        w = true;
        e = context;
        f = a1;
        g = e1;
        h = g1;
        j = executor;
        i = d1;
        l = bq1;
        m = objectmapper;
        n = f1;
        p = l1;
        o = d2;
        k = new LinkedBlockingQueue();
        r = new com.facebook.analytics.service.l(this, null);
        s = new ConcurrentHashMap();
    }

    private void a()
    {
        i.b();
        c = h.d();
        d();
_L2:
        Object obj;
        n.a(5000L);
        try
        {
            obj = (am)k.poll(p, TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Thread.currentThread().interrupt();
            return;
        }
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (a(((am) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d(((am) (obj))))
        {
            e(((am) (obj)));
        }
        h.c(c);
        if (c.h() == 0L)
        {
            a(((am) (obj)).b(), ((am) (obj)).c());
        }
        c(((am) (obj)));
        f(((am) (obj)));
        i(((am) (obj)));
        if (g(((am) (obj))))
        {
            com.facebook.debug.log.b.b(d, "Ending Analytics Session.");
            c = h.a(c, null);
            continue; /* Loop/switch isn't completed */
        }
        if (h(((am) (obj))))
        {
            com.facebook.debug.log.b.b(d, (new StringBuilder()).append("Truncating the current batch of events. Events in this batch: ").append(c.h()).toString());
            h.b(c);
        }
        if (true) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        obj = q;
        obj;
        JVM INSTR monitorenter ;
        if (k.size() != 0)
        {
            break MISSING_BLOCK_LABEL_251;
        }
        flag = true;
        w = true;
        obj;
        JVM INSTR monitorexit ;
        if (!flag) goto _L2; else goto _L3
_L3:
        b();
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(long l1)
    {
        u = l1;
        g.b(com.facebook.analytics.c.b.h, l1);
    }

    private void a(ca ca1, String s1)
    {
        if ("AUTO_SET".equals(ca1.f()))
        {
            ca1.d(o.b().b());
        }
        if ("AUTO_SET".equals(ca1.c()))
        {
            ca1.c(s1);
        }
    }

    static void a(i i1)
    {
        i1.a();
    }

    private String b(long l1)
    {
        return com.facebook.common.w.m.a("%02d:%02d.%03d", new Object[] {
            Long.valueOf(l1 / 60000L), Long.valueOf((l1 / 1000L) % 60L), Long.valueOf(l1 % 1000L)
        });
    }

    private void b()
    {
        c();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((k)iterator.next()).b()) { }
    }

    private void b(am am1)
    {
        c();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((k)iterator.next()).a(am1)) { }
    }

    private void c()
    {
        if (a == null)
        {
            a = (Set)Preconditions.checkNotNull(com.facebook.inject.t.a(e).c(com/facebook/analytics/service/k));
        }
    }

    private void c(am am1)
    {
        if (am1.a("connection") && am1.a("counters"))
        {
            l.a(am1.b(), am1.b("connection"), com.facebook.analytics.a.a(m, am1.b("counters")));
        }
    }

    private void d()
    {
        long l1 = f.a();
        long l2 = l1 - e();
        if (l2 > 0x7b98a00L || l2 < 0L)
        {
            com.facebook.debug.log.b.b(d, "Attempting to clean stale events from Analytics DB.");
            h.c();
            a(l1);
        }
    }

    private boolean d(am am1)
    {
        while (c == null || !c.d() || c.g() > 0L && f.a() - c.g() > 0x36ee80L || !Objects.equal(am1.c(), c.e()) || am1.a("new_session")) 
        {
            return true;
        }
        return false;
    }

    private long e()
    {
        if (u == -1L)
        {
            u = g.a(com.facebook.analytics.c.b.h, 0L);
        }
        return u;
    }

    private void e(am am1)
    {
        com.facebook.debug.log.b.b(d, "Starting new Analytics Session.");
        c = (com.facebook.analytics.c.f)Preconditions.checkNotNull(h.a(c, am1.c()));
    }

    private void f(am am1)
    {
        h.a(am1, c.j());
        c.i();
        c.b(am1.b());
        com.facebook.debug.log.b.b(d, (new StringBuilder()).append("Writing event to storage: ").append(am1.e()).toString());
        t = t + 1;
        v = f.a();
        b(am1);
    }

    private boolean g(am am1)
    {
        return am1.a("session_timeout");
    }

    private boolean h(am am1)
    {
        while (c.h() >= 50L || am1.a("truncate_batch")) 
        {
            return true;
        }
        return false;
    }

    private void i(am am1)
    {
        if (!am1.d() && (am1.a("key_ui_event") || c.f() <= 0L || am1.b() - c.f() > 30000L))
        {
            c.a(am1.b());
            h.a(c);
        }
    }

    void a(long l1, String s1)
    {
        if (b == null)
        {
            b = com.facebook.inject.t.a(e).c(com/facebook/analytics/periodicreporters/l, com/facebook/analytics/periodicreporters/ServicePeriodicReporters);
        }
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (l)iterator.next();
            if (((l) (obj)).a(l1))
            {
                obj = ((l) (obj)).a(l1, s1).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    ca ca1 = (ca)((Iterator) (obj)).next();
                    a(ca1, s1);
                    com.facebook.debug.log.b.a(d, (new StringBuilder()).append("Injecting periodic service event: ").append(ca1.a()).toString());
                    f(ca1);
                }
            }
        } while (true);
    }

    public void a(PrintWriter printwriter)
    {
        printwriter.println("AnalyticsEventDataStore: ");
        synchronized (q)
        {
            printwriter.println((new StringBuilder()).append(" mIdle: ").append(w).toString());
        }
        printwriter.println((new StringBuilder()).append(" pending in-memory events: ").append(k.size()).toString());
        long l1;
        if (c != null)
        {
            l1 = c.h();
        } else
        {
            l1 = 0L;
        }
        printwriter.println((new StringBuilder()).append(" pending events in current batch: ").append(l1).toString());
        printwriter.println((new StringBuilder()).append(" total events logged since start: ").append(t).toString());
        printwriter.println(com.facebook.common.w.m.a(" last event written: %s ago", new Object[] {
            b(f.a() - v)
        }));
        return;
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
    }

    public void a(List list)
    {
        synchronized (q)
        {
            k.addAll(list);
            if (w)
            {
                w = false;
                j.execute(r);
            }
        }
        return;
        list;
        obj;
        JVM INSTR monitorexit ;
        throw list;
    }

    boolean a(am am1)
    {
        if (am1.a("throttle_key") && am1.a("throttle_duration"))
        {
            String s1 = am1.b("throttle_key");
            long l1;
            long l2;
            try
            {
                l1 = Long.parseLong(am1.b("throttle_duration"));
            }
            // Misplaced declaration of an exception variable
            catch (am am1)
            {
                com.facebook.debug.log.b.a("Invalid throttle duration tag.", am1);
                return false;
            }
            l2 = f.a();
            am1 = (Long)s.get(s1);
            if (am1 == null || l2 - am1.longValue() > l1)
            {
                s.put(s1, Long.valueOf(l2));
                return false;
            } else
            {
                return true;
            }
        } else
        {
            return false;
        }
    }

}
