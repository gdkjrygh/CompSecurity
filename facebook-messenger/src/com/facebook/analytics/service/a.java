// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.service;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.facebook.analytics.am;
import com.facebook.analytics.c.b;
import com.facebook.analytics.c.e;
import com.facebook.analytics.c.g;
import com.facebook.base.c;
import com.facebook.common.w.m;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.google.common.a.ik;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.analytics.service:
//            k, h, f, t, 
//            e, g

public class a
    implements k, c
{

    static final String b = (new StringBuilder()).append(com/facebook/analytics/service/a.getCanonicalName()).append(".ACTION_ALARM").toString();
    private static final Class c = com/facebook/analytics/service/a;
    private static boolean e = false;
    private static boolean f = false;
    private int A;
    private boolean B;
    Set a;
    private long d;
    private final Context g;
    private final e h;
    private final g i;
    private final com.facebook.base.a.d j;
    private final com.facebook.common.time.a k;
    private final t l;
    private final d m;
    private final Executor n;
    private final h o;
    private final LinkedBlockingQueue p = new LinkedBlockingQueue();
    private final Object q = new Object();
    private final ConcurrentMap r = ik.c();
    private final AlarmManager s;
    private final Long t;
    private boolean u;
    private boolean v;
    private boolean w;
    private long x;
    private int y;
    private int z;

    public a(Context context, e e1, g g1, t t1, d d1, com.facebook.base.a.d d2, com.facebook.common.time.a a1, 
            Executor executor, AlarmManager alarmmanager, Long long1)
    {
        d = -1L;
        u = false;
        w = false;
        x = -1L;
        y = 0;
        z = 0;
        a = null;
        A = 0;
        B = true;
        g = context;
        h = e1;
        i = g1;
        j = d2;
        k = a1;
        l = t1;
        m = d1;
        n = executor;
        s = alarmmanager;
        t = long1;
        e1 = new IntentFilter();
        e1.addAction("android.intent.action.SCREEN_OFF");
        e1.addAction("android.intent.action.SCREEN_ON");
        o = new h(this, context, e1);
        n();
    }

    static long a(a a1, long l1)
    {
        a1.d = l1;
        return l1;
    }

    private void a(long l1)
    {
        x = l1;
        d = -1L;
        h.b(b.a, l1);
    }

    static void a(a a1)
    {
        a1.h();
    }

    static boolean a(a a1, boolean flag)
    {
        a1.v = flag;
        return flag;
    }

    static boolean a(boolean flag)
    {
        f = flag;
        return flag;
    }

    static com.facebook.common.time.a b(a a1)
    {
        return a1.k;
    }

    private String b(long l1)
    {
        return com.facebook.common.w.m.a("%02d:%02d.%03d", new Object[] {
            Long.valueOf(l1 / 60000L), Long.valueOf((l1 / 1000L) % 60L), Long.valueOf(l1 % 1000L)
        });
    }

    static boolean b(a a1, boolean flag)
    {
        a1.w = flag;
        return flag;
    }

    static void c(a a1)
    {
        a1.j();
    }

    static Class d()
    {
        return c;
    }

    static void d(a a1)
    {
        a1.i();
    }

    static boolean e()
    {
        return e;
    }

    static boolean e(a a1)
    {
        return a1.B;
    }

    static Executor f(a a1)
    {
        return a1.n;
    }

    private void f()
    {
        for (Iterator iterator = r.keySet().iterator(); iterator.hasNext(); ((f)iterator.next()).a()) { }
    }

    private long g()
    {
        return m.a(aj.m, 0x493e0L);
    }

    static void g(a a1)
    {
        a1.l();
    }

    private void h()
    {
        j.b();
        z = i.a();
        com.facebook.debug.log.b.a(c, "Running processor thread. %d events pending from DB.", new Object[] {
            Integer.valueOf(z)
        });
_L7:
        Object obj;
        boolean flag1;
        try
        {
            obj = (am)p.poll(t.longValue(), TimeUnit.MILLISECONDS);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Thread.currentThread().interrupt();
            return;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (!((am) (obj)).a("resume_upload")) goto _L4; else goto _L3
_L3:
        com.facebook.debug.log.b.a(c, "Resuming upload due to RESUME_UPLOAD tag.");
        u = false;
        flag1 = true;
_L8:
        if (((am) (obj)).a("upload_batch_now"))
        {
            com.facebook.debug.log.b.a(c, "Forcing upload due to EVENT_UPLOAD_BATCH_NOW_TAG tag.");
            w = true;
        }
        if (c())
        {
            l();
        }
        if (!((am) (obj)).a("stop_upload")) goto _L6; else goto _L5
_L5:
        com.facebook.debug.log.b.a(c, "Stopping upload due to STOP_UPLOAD tag.");
        u = true;
          goto _L7
_L4:
        if (!((am) (obj)).a("resume_upload_temporary"))
        {
            break MISSING_BLOCK_LABEL_279;
        }
        com.facebook.debug.log.b.a(c, "Temporarily resuming upload due to RESUME_UPLOAD_TEMPORARY tag.");
        flag1 = u;
        u = false;
          goto _L8
_L6:
        if (!((am) (obj)).a("resume_upload_temporary")) goto _L7; else goto _L9
_L9:
        u = flag1;
          goto _L7
_L2:
        obj = q;
        obj;
        JVM INSTR monitorenter ;
        if (p.size() != 0)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        B = true;
        boolean flag = true;
_L11:
        obj;
        JVM INSTR monitorexit ;
        if (!flag) goto _L7; else goto _L10
_L10:
        com.facebook.debug.log.b.a(c, "No more events pending. Stopping thread.");
        f();
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        flag = false;
          goto _L11
        flag1 = true;
          goto _L8
    }

    private void i()
    {
        s.setInexactRepeating(0, k.a(), 0x36ee80L, k());
        com.facebook.debug.log.b.a(c, "Setting alarm with one hour interval");
        e = true;
    }

    private void j()
    {
        s.cancel(k());
        e = false;
    }

    private PendingIntent k()
    {
        Intent intent = new Intent(b);
        return PendingIntent.getBroadcast(g, 0, intent, 0);
    }

    private void l()
    {
        a(k.a());
        com.facebook.debug.log.b.b(c, (new StringBuilder()).append("Uploading analytics report with ").append(z).append(" events.").toString());
        l.a();
        z = 0;
        if (f)
        {
            f = false;
            i();
        }
        w = false;
    }

    private long m()
    {
        if (x == -1L)
        {
            x = h.a(b.a, 0L);
        }
        return x;
    }

    private void n()
    {
        v = ((PowerManager)g.getSystemService("power")).isScreenOn();
    }

    public void a()
    {
        o.a();
        g.registerReceiver(new com.facebook.analytics.service.e(this), new IntentFilter(b));
        n();
    }

    public void a(am am1)
    {
        b(am1);
    }

    public void a(f f1)
    {
        r.put(f1, Boolean.TRUE);
    }

    public void a(PrintWriter printwriter)
    {
        printwriter.println("AnalyticsEventUploader: ");
        synchronized (q)
        {
            printwriter.println((new StringBuilder()).append(" idle: ").append(B).toString());
        }
        printwriter.println((new StringBuilder()).append(" pending batch event count: ").append(y).toString());
        printwriter.println((new StringBuilder()).append(" pending upload event count: ").append(z).toString());
        printwriter.println((new StringBuilder()).append(" total count: ").append(A).toString());
        printwriter.println((new StringBuilder()).append(" upload disabled: ").append(u).toString());
        printwriter.println(com.facebook.common.w.m.a(" last sent: %s ago", new Object[] {
            b(k.a() - x)
        }));
        return;
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
    }

    public void b()
    {
        b(((am) (null)));
    }

    public void b(am am1)
    {
        Object obj = q;
        obj;
        JVM INSTR monitorenter ;
        if (am1 == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        p.add(am1);
        if (B)
        {
            B = false;
            n.execute(new com.facebook.analytics.service.g(this, null));
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        am1;
        obj;
        JVM INSTR monitorexit ;
        throw am1;
    }

    public void b(f f1)
    {
        r.remove(f1);
    }

    boolean c()
    {
        if (!w) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        long l1;
        if (u)
        {
            return false;
        }
        if (!v)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = k.a();
        if (d == -1L)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l1 - d > 10000L) goto _L1; else goto _L3
_L3:
        return false;
        if (l1 - m() > g()) goto _L1; else goto _L4
_L4:
        return false;
    }

}
