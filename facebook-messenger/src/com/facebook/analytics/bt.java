// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.WindowManager;
import com.facebook.analytics.h.a;
import com.facebook.analytics.h.b;
import com.facebook.analytics.h.e;
import com.facebook.analytics.periodicreporters.ClientPeriodicReporters;
import com.facebook.base.activity.h;
import com.facebook.base.c;
import com.facebook.common.process.d;
import com.facebook.debug.log.l;
import com.facebook.inject.t;
import com.google.common.a.kl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.analytics:
//            av, al, bx, bw, 
//            by, bz, cb, c, 
//            ca, d, bv, ci, 
//            bu, ak, AnalyticsServiceEvent, e

public class bt
    implements av, c
{

    private static final Class b = com/facebook/analytics/bt;
    private static final l c = new l();
    private boolean A;
    private al B;
    private long C;
    private AtomicBoolean D;
    private Queue E;
    private final bw F = new bw(this, null);
    private final by G = new by(this, null);
    private Set H;
    private Runnable I;
    private int J;
    private long K;
    private final com.facebook.analytics.h.c L = new com.facebook.analytics.h.c();
    private NetworkInfo M;
    private String N;
    Set a;
    private final Context d;
    private final javax.inject.a e;
    private final ak f;
    private final com.facebook.common.executors.a g;
    private final ExecutorService h;
    private final d i;
    private final com.facebook.analytics.a.a j;
    private final a k;
    private final PowerManager l;
    private final AlarmManager m;
    private final WindowManager n;
    private final com.facebook.common.time.a o;
    private final javax.inject.a p;
    private final javax.inject.a q;
    private final javax.inject.a r;
    private final com.facebook.analytics.i.a s;
    private final com.facebook.analytics.g.a t;
    private final Handler u = new Handler(Looper.getMainLooper());
    private final bx v = new bx(this);
    private BroadcastReceiver w;
    private String x;
    private boolean y;
    private boolean z;

    public bt(Context context, javax.inject.a a1, ak ak1, com.facebook.common.executors.a a2, ExecutorService executorservice, d d1, com.facebook.analytics.a.a a3, 
            PowerManager powermanager, AlarmManager alarmmanager, WindowManager windowmanager, com.facebook.common.time.a a4, javax.inject.a a5, javax.inject.a a6, javax.inject.a a7, 
            com.facebook.analytics.i.a a8, com.facebook.analytics.g.a a9)
    {
        a = null;
        y = true;
        z = true;
        B = al.NONE;
        H = kl.a();
        I = null;
        J = -1;
        K = -1L;
        d = context;
        e = a1;
        f = ak1;
        g = a2;
        h = executorservice;
        i = d1;
        j = a3;
        l = powermanager;
        m = alarmmanager;
        n = windowmanager;
        o = a4;
        p = a5;
        q = a6;
        r = a7;
        k = new a(a4.a());
        s = a8;
        t = a9;
        C = a4.a();
        E = new ConcurrentLinkedQueue();
        D = new AtomicBoolean(false);
        context = new IntentFilter();
        context.addAction("android.intent.action.DATE_CHANGED");
        context.addAction("android.intent.action.TIME_SET");
        d.registerReceiver(new bz(this), context);
    }

    static al a(bt bt1, al al1)
    {
        bt1.B = al1;
        return al1;
    }

    private cb a(long l1, com.facebook.analytics.c c1)
    {
        c1 = (new cb("app_state")).b("state", c1.toString()).e("app");
        c1.a(l1);
        s.e(c1);
        return c1;
    }

    static String a(bt bt1, String s1)
    {
        bt1.x = s1;
        return s1;
    }

    private void a(int i1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        cb cb1 = (new cb("orientation")).b("module", "device").b("containermodule", N).a("orientation_start", J).a("orientation_end", i1);
        String s1;
        if (flag)
        {
            s1 = "foreground";
        } else
        {
            s1 = "orientation_change";
        }
        b(cb1.b("event_trigger", s1));
        J = i1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(long l1)
    {
        if (y)
        {
            y = false;
            b(a(l1, c.FOREGROUNDED).a("key_ui_event", "1").a("new_session", "1"));
        }
    }

    private void a(long l1, String s1)
    {
        cb cb1 = new cb("session_end");
        cb1.h(s1).a("session_timeout", "1").a("stop_upload", "1").a(l1);
        s.a(M, cb1);
        s.e(cb1);
        b(cb1);
        z = true;
    }

    private void a(Context context)
    {
        context = c(context);
        if (context != null && context.getState() == android.net.NetworkInfo.State.DISCONNECTED)
        {
            z = true;
        }
        if (!s.a(M, context) || z)
        {
            a(((NetworkInfo) (context)));
            M = context;
            z = false;
        }
    }

    private void a(NetworkInfo networkinfo)
    {
        this;
        JVM INSTR monitorenter ;
        cb cb1;
        cb1 = new cb("connection_change");
        cb1.e("device");
        s.a(cb1);
        s.a(cb1, M);
        s.a(M, cb1);
        s.e(cb1);
        if (networkinfo == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        cb1.b("state", networkinfo.getState().toString());
        b(cb1);
        this;
        JVM INSTR monitorexit ;
        return;
        networkinfo;
        throw networkinfo;
    }

    static void a(bt bt1, int i1, boolean flag)
    {
        bt1.a(i1, flag);
    }

    static void a(bt bt1, long l1)
    {
        bt1.b(l1);
    }

    static void a(bt bt1, Context context)
    {
        bt1.a(context);
    }

    static void a(bt bt1, e e1, boolean flag)
    {
        bt1.a(e1, flag);
    }

    static void a(bt bt1, h h1)
    {
        bt1.b(h1);
    }

    private void a(com.facebook.analytics.d d1)
    {
        a(d1.g_().toString(), true);
    }

    private void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        if (b1 != b.FORCE && b1 != b.FORCE_RESET) goto _L2; else goto _L1
_L1:
        k.c();
_L6:
        cb cb1 = k.b();
        if (cb1 == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        b(cb1);
        if (b1 != b.FORCE_RESET) goto _L4; else goto _L3
_L3:
        k.a();
_L8:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (b1 != b.CLOCK_RESET) goto _L6; else goto _L5
_L5:
        k.d();
          goto _L6
        b1;
        throw b1;
_L4:
        if (b1 != b.CLOCK_RESET) goto _L8; else goto _L7
_L7:
        d(o.a());
          goto _L8
    }

    private void a(e e1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (!j()) goto _L2; else goto _L1
_L1:
        b b1 = null;
        if (e1 != e.CLOCK_CHANGE) goto _L4; else goto _L3
_L3:
        b1 = b.CLOCK_RESET;
_L9:
        a(b1);
_L2:
        if (!k()) goto _L6; else goto _L5
_L5:
        e1 = L.a(o.a(), e1);
        if (e1 == null) goto _L6; else goto _L7
_L7:
        b(e1);
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (e1 != e.FOREGROUNDED && e1 != e.BACKGROUNDED) goto _L9; else goto _L8
_L8:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        b1 = b.FORCE_RESET;
          goto _L9
        b1 = b.FORCE;
          goto _L9
        e1;
        throw e1;
    }

    static boolean a(bt bt1)
    {
        return bt1.y;
    }

    static boolean a(bt bt1, ca ca1)
    {
        return bt1.e(ca1);
    }

    static WindowManager b(bt bt1)
    {
        return bt1.n;
    }

    private void b(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!y)
        {
            Object obj = c.BACKGROUNDED;
            if (!l.isScreenOn())
            {
                obj = c.RESIGN;
            }
            obj = a(l1, ((com.facebook.analytics.c) (obj)));
            ((cb) (obj)).a("key_ui_event", "1").a("new_session", "1");
            s.a(M, ((cb) (obj)));
            b(((ca) (obj)));
            y = true;
            N = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(Context context)
    {
        if (w == null)
        {
            w = new bv(this);
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(w, intentfilter);
        }
    }

    static void b(bt bt1, Context context)
    {
        bt1.b(context);
    }

    static void b(bt bt1, ca ca1)
    {
        bt1.h(ca1);
    }

    static void b(bt bt1, h h1)
    {
        bt1.c(h1);
    }

    private void b(com.facebook.analytics.d d1)
    {
        c(d1.g_().toString());
    }

    private void b(h h1)
    {
        this;
        JVM INSTR monitorenter ;
    }

    private NetworkInfo c(Context context)
    {
        return ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    static ak c(bt bt1)
    {
        return bt1.f;
    }

    private void c(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (k.a(l1))
        {
            a(b.PASSIVE);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void c(bt bt1, h h1)
    {
        bt1.d(h1);
    }

    private void c(ca ca1)
    {
        if (-1L == ca1.b())
        {
            ca1.a(o.a());
        }
        ca1.a(y);
    }

    private void c(h h1)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = o.a();
        H.add(h1);
        h();
        a(l1);
        if (!(h1 instanceof com.facebook.analytics.d)) goto _L2; else goto _L1
_L1:
        a((com.facebook.analytics.d)h1);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!(h1 instanceof ci))
        {
            a(h1);
        }
        h.execute(G);
        if (true) goto _L4; else goto _L3
_L3:
        h1;
        throw h1;
    }

    static AtomicBoolean d(bt bt1)
    {
        return bt1.D;
    }

    private void d(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        K = l1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void d(bt bt1, h h1)
    {
        bt1.e(h1);
    }

    private void d(ca ca1)
    {
        if ("AUTO_SET".equals(ca1.c()))
        {
            ca1.c(g());
        }
        if ("AUTO_SET".endsWith(ca1.f()))
        {
            ca1.d(i.b().b());
        }
    }

    private void d(h h1)
    {
        this;
        JVM INSTR monitorenter ;
        if (h1 instanceof com.facebook.analytics.d)
        {
            b((com.facebook.analytics.d)h1);
        }
        if (H.remove(h1) && H.isEmpty())
        {
            long l1 = o.a();
            if (I != null)
            {
                com.facebook.debug.log.b.a(c, b, "Previous sendToBackgroundDetector is still alive");
                u.removeCallbacks(I);
                I = null;
            }
            if (!A)
            {
                I = new bu(this, l1);
                u.postDelayed(I, 5000L);
            }
            h1 = h1.h();
            if (A)
            {
                a(l1, h1);
                A = false;
                B = al.NONE;
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        h1;
        throw h1;
    }

    static void e(bt bt1)
    {
        bt1.i();
    }

    private void e(h h1)
    {
        this;
        JVM INSTR monitorenter ;
    }

    private boolean e(ca ca1)
    {
        return (ca1 instanceof cb) && "wildfire".equals(((cb)ca1).j());
    }

    static Class f()
    {
        return b;
    }

    private void f(ca ca1)
    {
        E.add(ca1);
        if (D.compareAndSet(false, true))
        {
            h.execute(F);
        }
    }

    static boolean f(bt bt1)
    {
        return bt1.A;
    }

    static al g(bt bt1)
    {
        return bt1.B;
    }

    private String g()
    {
        return (String)e.b();
    }

    private void g(ca ca1)
    {
        ca1.b(true);
        E.add(ca1);
        if (D.compareAndSet(false, true))
        {
            h.execute(F);
        }
    }

    static Queue h(bt bt1)
    {
        return bt1.E;
    }

    private void h()
    {
        if (I != null)
        {
            u.removeCallbacks(I);
            I = null;
        }
    }

    private void h(ca ca1)
    {
        g.b();
        if (f.b())
        {
            t.a(ca1);
        }
        d(ca1);
        j.a(new AnalyticsServiceEvent(ca1));
    }

    private void i()
    {
        if (a == null)
        {
            a = com.facebook.inject.t.a(d).c(com/facebook/analytics/periodicreporters/l, com/facebook/analytics/periodicreporters/ClientPeriodicReporters);
        }
        long l1 = o.a();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (com.facebook.analytics.periodicreporters.l)iterator.next();
            if (((com.facebook.analytics.periodicreporters.l) (obj)).a(l1))
            {
                obj = ((com.facebook.analytics.periodicreporters.l) (obj)).a(l1, g()).iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    b((ca)((Iterator) (obj)).next());
                }
            }
        } while (true);
    }

    private boolean j()
    {
        return ((Boolean)r.b()).booleanValue();
    }

    private boolean k()
    {
        return ((Boolean)q.b()).booleanValue();
    }

    public void a()
    {
        if (((Boolean)p.b()).booleanValue())
        {
            Object obj = (new Intent(d, com/facebook/analytics/periodicreporters/a)).setAction("com.facebook.analytics.periodicreporters.AnalyticsAlarmReceiver.alarm_action");
            obj = PendingIntent.getBroadcast(d, -1, ((Intent) (obj)), 0);
            m.cancel(((PendingIntent) (obj)));
            m.setInexactRepeating(1, o.a() + 0x36ee80L, 0x36ee80L, ((PendingIntent) (obj)));
        }
    }

    public void a(ca ca1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ca1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c(ca1);
        f(ca1);
        if (true) goto _L1; else goto _L3
_L3:
        ca1;
        throw ca1;
    }

    public void a(ca ca1, com.facebook.analytics.g.e e1)
    {
        if (!e1.a(ca1))
        {
            a(ca1);
        }
    }

    public void a(h h1)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = o.a();
        if (!(h1 instanceof com.facebook.analytics.d)) goto _L2; else goto _L1
_L1:
        String s1 = ((com.facebook.analytics.d)h1).g_().toString();
_L8:
        if (s1 != null) goto _L4; else goto _L3
_L3:
        s1 = h1.getClass().getSimpleName();
        String s2;
        String s3;
        s2 = s1;
        s3 = "unknown";
_L5:
        String s4;
        if (!(h1 instanceof com.facebook.analytics.e))
        {
            break MISSING_BLOCK_LABEL_209;
        }
        s4 = ((com.facebook.analytics.e)h1).a();
_L6:
        h1 = (new cb("navigation")).b("dest_module", s3).h(h1.h());
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        h1.b("dest_module_uri", s4);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        h1.b("dest_module_class", s2);
        if (x != null)
        {
            h1.b("click_point", x);
        }
        if (N != null)
        {
            h1.e(N);
        }
        b(h1.a(l1).a("resume_upload", "1"));
        N = s1;
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        s2 = s1;
        s4 = null;
        s3 = s1;
        s1 = s2;
        s2 = s4;
          goto _L5
        h1;
        throw h1;
        s4 = null;
          goto _L6
_L2:
        s1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(String s1)
    {
        x = s1;
    }

    public void a(String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        b(c(s1, flag));
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void a(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        cb cb1;
        cb1 = new cb("log_in");
        cb1.a("resume_upload", "1");
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); cb1.b((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        break MISSING_BLOCK_LABEL_90;
        map;
        throw map;
        b(cb1);
        a(e.FOREGROUNDED, true);
        this;
        JVM INSTR monitorexit ;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        A = true;
        b(((ca) (new cb("log_out"))));
        a(e.BACKGROUNDED, true);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(ca ca1)
    {
        this;
        JVM INSTR monitorenter ;
        if (ca1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c(ca1);
        g(ca1);
        if (true) goto _L1; else goto _L3
_L3:
        ca1;
        throw ca1;
    }

    public void b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        a(d(s1));
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void b(String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a(c(s1, flag));
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public cb c(String s1, boolean flag)
    {
        return (new cb("show_module")).b("click_point", x).b("source_module", N).b("dest_module", s1).a("is_modal", flag);
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        A = false;
        b((new cb("silent_login")).a("resume_upload", "1"));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        b(d(s1));
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public cb d(String s1)
    {
        return (new cb("hide_module")).b("click_point", x).b("source_module", s1).b("dest_module", N);
    }

    public void d()
    {
        if (j())
        {
            long l1 = o.a();
            if (l1 - K > 500L)
            {
                d(l1);
                c(l1);
            }
        }
        if (k())
        {
            a(e.USER_ACTION, false);
        }
    }

    public bx e()
    {
        return v;
    }

}
