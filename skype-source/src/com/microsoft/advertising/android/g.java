// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.microsoft.advertising.android.a.a;
import com.microsoft.advertising.android.a.e;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;

// Referenced classes of package com.microsoft.advertising.android:
//            w, f, q, p, 
//            ah, ad, ab, bx, 
//            af, av, j, b, 
//            d, l, ae, ag, 
//            AdViewFactory, bo, bj, k, 
//            h, i, t, by, 
//            AdControl, bk, m, c, 
//            ai

final class g
    implements ad.a, b.a
{
    final class a
    {

        final g a;
        private TimerTask b;
        private Timer c;

        private void a(long l1)
        {
            this;
            JVM INSTR monitorenter ;
            com.microsoft.advertising.android.av.a("FETCH_TIMER", (new StringBuilder("startTime(adReloadPeriodMillis=")).append(l1).toString());
            boolean flag;
            if (l1 > 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag = com.microsoft.advertising.android.af.a(flag);
            if (flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            f();
            b = new TimerTask(this) {

                final a a;

                public final void run()
                {
                    a.a.k();
                }

            
            {
                a = a1;
                super();
            }
            };
            com.microsoft.advertising.android.av.a("FETCH_TIMER", (new StringBuilder("starting timer interval=")).append(l1).toString());
            c.schedule(b, l1);
            com.microsoft.advertising.android.g.a(a).i().c("AdControl.startTimer", String.valueOf(l1 / 1000L));
            continue; /* Loop/switch isn't completed */
            Object obj;
            obj;
            com.microsoft.advertising.android.g.a(a).i().a(((Exception) (obj)), e.a);
            if (true) goto _L1; else goto _L3
_L3:
            obj;
            throw obj;
        }

        static void a(a a1)
        {
            a1.f();
        }

        static void a(a a1, long l1)
        {
            a1.a(l1);
        }

        private void f()
        {
            this;
            JVM INSTR monitorenter ;
            if (b != null)
            {
                b.cancel();
                b = null;
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void a()
        {
            if (a.a(new b[] {
        b.b
    }))
            {
                f();
            }
        }

        public final void a(int i1, Long long1)
        {
            long l2 = i1;
            long l1 = l2;
            if (long1 != null)
            {
                l1 = l2;
                if (long1.longValue() > 0L)
                {
                    l1 = l2;
                    if (long1.longValue() < (long)i1)
                    {
                        l1 = (long)i1 - long1.longValue();
                    }
                }
            }
            com.microsoft.advertising.android.av.a("FETCH_TIMER", (new StringBuilder("starting Auto Refresh timer for fetching with ")).append(l1).toString());
            a(l1);
        }

        public final void a(b b1)
        {
            if (b.b == b1)
            {
                if (!af.b(false, "should never get here"));
            } else
            {
                if (b.f == b1)
                {
                    com.microsoft.advertising.android.av.a("FETCH_TIMER", "starting short timer for SHOW_WAIT");
                    a(5000L);
                    return;
                }
                if (b.c == b1)
                {
                    com.microsoft.advertising.android.av.a("FETCH_TIMER", "starting short timer for fetching");
                    a(5000L);
                    return;
                }
            }
        }

        public final boolean b()
        {
            return b != null && c != null;
        }

        public final boolean c()
        {
            return c != null;
        }

        public final void d()
        {
            this;
            JVM INSTR monitorenter ;
            c = new Timer();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public final void e()
        {
            this;
            JVM INSTR monitorenter ;
            Timer timer = c;
            if (timer == null)
            {
                break MISSING_BLOCK_LABEL_28;
            }
            c.cancel();
            c = null;
            b = null;
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
            Object obj;
            obj;
            com.microsoft.advertising.android.g.a(a).i().c(((Exception) (obj)).getMessage(), e.a);
            if (true) goto _L2; else goto _L1
_L1:
            obj;
            throw obj;
        }

        a()
        {
            a = g.this;
            super();
            b = null;
            c = null;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        private static final Map h = new TreeMap() {

            
            {
                put(com.microsoft.advertising.android.b.a, Arrays.asList(new b[] {
                    b.b, b.g
                }));
                put(b.b, Arrays.asList(new b[] {
                    b.c, b.g
                }));
                put(b.c, Arrays.asList(new b[] {
                    b.d, b.g, b.b
                }));
                put(b.d, Arrays.asList(new b[] {
                    b.b, com.microsoft.advertising.android.b.e, b.g
                }));
                put(com.microsoft.advertising.android.b.e, Arrays.asList(new b[] {
                    b.g, b.f
                }));
                put(b.f, Arrays.asList(new b[] {
                    b.c, b.g, b.b
                }));
                put(b.g, Arrays.asList(new b[] {
                    b.b, b.c, b.d, com.microsoft.advertising.android.b.e
                }));
            }
        };
        private static final b i[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/microsoft/advertising/android/g$b, s1);
        }

        public static b[] values()
        {
            b ab1[] = i;
            int i1 = ab1.length;
            b ab2[] = new b[i1];
            System.arraycopy(ab1, 0, ab2, 0, i1);
            return ab2;
        }

        public final boolean a(b b1)
        {
            return h.containsKey(this) && h.get(this) != null && ((List)h.get(this)).contains(b1);
        }

        static 
        {
            a = new b("NOT_READY", 0);
            b = new b("WAITING_TO_FETCH", 1);
            c = new b("FETCHING", 2);
            d = new b("PRE_RENDER", 3);
            e = new b("PUBLISHER_SHOW_WAIT", 4);
            f = new b("SHOW_WAIT", 5);
            g = new b("SUSPENDED", 6);
            i = (new b[] {
                a, b, c, d, e, f, g
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    abstract class c
        implements Runnable
    {

        protected final b b;
        final g c;

        c(b b1)
        {
            c = g.this;
            super();
            b = b1;
        }
    }

    public final class d
    {

        public b a;
        public boolean b;
        public int c;
        final g d;

        d(b b1, boolean flag, int i1)
        {
            d = g.this;
            super();
            a = b1;
            b = flag;
            c = i1;
        }
    }


    final a a = new a();
    final w b = new w();
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Context d;
    private Integer e;
    private Integer f;
    private d g;
    private final f h;
    private final ad i;
    private final q j;
    private boolean k;
    private int l;
    private b m;
    private boolean n;
    private boolean o;
    private com.microsoft.advertising.android.d p;
    private com.microsoft.advertising.android.b q;
    private bo r;
    private boolean s;

    g(f f1)
    {
        e = null;
        f = null;
        g = null;
        k = false;
        m = com.microsoft.advertising.android.b.a;
        n = false;
        o = true;
        p = null;
        q = null;
        r = null;
        s = false;
        h = f1;
        d = f1.c();
        j = new q(d, com.microsoft.advertising.android.p.a(), new ah(f1));
        i = new ad(com.microsoft.advertising.android.p.a().n(), j.i());
        l = com.microsoft.advertising.android.ab.a().a("STANDARD_AD_REFRESH_INTERVAL_MS");
        com.microsoft.advertising.android.p.a().a(this, d);
    }

    static q a(g g1)
    {
        return g1.j;
    }

    private void a(b b1, b b2)
    {
        boolean flag3;
        boolean flag4;
        flag3 = true;
        flag4 = false;
        af.b();
        com.microsoft.advertising.android.af.a(new Object[] {
            m
        });
        com.microsoft.advertising.android.af.a(new Object[] {
            b2
        });
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L2; else goto _L1
_L1:
        a(new Runnable(b1, b2) {

            final g a;
            private final b b;
            private final b c;

            public final void run()
            {
                com.microsoft.advertising.android.g.a(a, b, c);
            }

            
            {
                a = g.this;
                b = b1;
                c = b2;
                super();
            }
        });
_L4:
        return;
_L2:
        if (m == b2)
        {
            av.c("FETCH_STATE", (new StringBuilder("Current State is ")).append(m).append(" which is same as newState").toString());
            return;
        }
        if (m != b1)
        {
            av.c("FETCH_STATE", (new StringBuilder("State Mismatch - Current State is ")).append(m).append(" but State Passed to Runnable is ").append(b1).toString());
            return;
        }
        boolean flag;
        if (com.microsoft.advertising.android.b.a != b2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        af.b(flag, "we never move to NOT_READY");
        af.b(m.a(b2), (new StringBuilder("cannot move from ")).append(m).append(" to ").append(b2).toString());
        if (m == b.c)
        {
            i.a();
        } else
        if (m == b.g)
        {
            a.d();
            h.q();
        } else
        if (m == com.microsoft.advertising.android.b.a)
        {
            a.d();
        } else
        if (m == b.f)
        {
            com.microsoft.advertising.android.a.a(a);
        }
        com.microsoft.advertising.android.av.a("FETCH_STATE", (new StringBuilder("state change to ")).append(b2.toString()).toString());
        m = b2;
        if (m != com.microsoft.advertising.android.b.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.advertising.android.af.a(flag);
        com.microsoft.advertising.android.av.a("FETCH_STATE", (new StringBuilder("onStateEnter(")).append(m.name()).append(")").toString());
        if (m == b.b)
        {
            if (g.b || !k)
            {
                if (n && k)
                {
                    b1 = h.m().b();
                    if (b1 != null && b1.longValue() > 0L)
                    {
                        a(((Long) (b1)));
                        return;
                    }
                }
                a(((Long) (null)));
                return;
            } else
            {
                com.microsoft.advertising.android.av.a("FETCH_TIMER", (new StringBuilder("entered WAITING_TO_FETCH but not starting timer auto=")).append(g.b).append(" fetchedFirstAd=").append(k).toString());
                return;
            }
        }
        if (m == b.c)
        {
            v();
            return;
        }
        if (m != b.d)
        {
            break; /* Loop/switch isn't completed */
        }
        af.b();
        if (a(new b[] {
    b.d
}))
        {
            if (q != null)
            {
                if (q.o() != com.microsoft.advertising.android.b.b.a)
                {
                    g = new d(m, o, l);
                    if (com.microsoft.advertising.android.af.a(new Object[] {
    q
}))
                    {
                        q.t();
                    }
                    t();
                    b(new c(m) {

                        final g a;

                        public final void run()
                        {
                            com.microsoft.advertising.android.g.a(a, b, b.b);
                        }

            
            {
                a = g.this;
                super(b1);
            }
                    });
                    return;
                }
            } else
            {
                boolean flag1;
                if (p != null)
                {
                    flag1 = flag3;
                } else
                {
                    flag1 = false;
                }
                com.microsoft.advertising.android.af.a(flag1);
                p.c().b(com.microsoft.advertising.android.a.a.a.g);
                j.i().a(this, ae.g);
                if (p.f() && !h.a())
                {
                    q = com.microsoft.advertising.android.ag.a().c().getAdLayout(p, h.i(), h.b(), this, h.d());
                    if (q.a(p, this))
                    {
                        p = null;
                        return;
                    }
                    com.microsoft.advertising.android.av.a("FETCH_STATE", "setAd() failed in startPreRenderingAd()");
                    g = new d(m, o, l);
                    if (q != null)
                    {
                        q.t();
                    }
                    t();
                    b(new c(m) {

                        final g a;

                        public final void run()
                        {
                            com.microsoft.advertising.android.g.a(a, b, b.b);
                        }

            
            {
                a = g.this;
                super(b1);
            }
                    });
                    return;
                } else
                {
                    b1 = p;
                    b1.c().b(com.microsoft.advertising.android.a.a.a.h);
                    b(new Runnable(b1) {

                        final g a;
                        private final com.microsoft.advertising.android.d b;

                        public final void run()
                        {
                            com.microsoft.advertising.android.g.a(a, b);
                        }

            
            {
                a = g.this;
                b = d1;
                super();
            }
                    });
                    return;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (m != com.microsoft.advertising.android.b.e)
        {
            break; /* Loop/switch isn't completed */
        }
        af.b();
        if (a(new b[] {
    com.microsoft.advertising.android.b.e
}))
        {
            boolean flag2;
            if (p == null && q == null)
            {
                flag2 = flag4;
            } else
            {
                flag2 = true;
            }
            com.microsoft.advertising.android.af.a(flag2);
            r = new bo(h, c, new Runnable() {

                final g a;

                public final void run()
                {
                    g.d(a);
                }

            
            {
                a = g.this;
                super();
            }
            });
            j.i().a(r);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (m == b.f)
        {
            w();
            return;
        }
        if (m == b.g)
        {
            a.e();
            h.p();
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    static void a(g g1, com.microsoft.advertising.android.d d1)
    {
        g1.c(d1);
    }

    static void a(g g1, b b1, b b2)
    {
        g1.a(b1, b2);
    }

    private void a(Long long1)
    {
        StringBuilder stringbuilder = (new StringBuilder("startAutoFetchingOrStartFetchTimer() autoRefresh=")).append(o).append(" state=").append(m.toString()).append(" partiallyElapsedInterval=");
        Object obj;
        if (long1 != null)
        {
            obj = long1;
        } else
        {
            obj = "null";
        }
        com.microsoft.advertising.android.av.a("FETCH_TIMER", stringbuilder.append(obj).toString());
        if (a(new b[] {
    com.microsoft.advertising.android.b.a, b.b
}))
        {
            g = new d(m, o, l);
            if (g.b || !k)
            {
                if (h.a(g.b))
                {
                    if (a.b())
                    {
                        com.microsoft.advertising.android.av.a("FETCH_STATE", "ad is still fresh and timer is still running");
                        return;
                    } else
                    {
                        com.microsoft.advertising.android.av.a("FETCH_STATE", "ad is still fresh; starting timer");
                        a.a(g.c, long1);
                        return;
                    }
                }
                if (a.b())
                {
                    com.microsoft.advertising.android.av.a("FETCH_STATE", "in startAutoFetchingOrStartFetchTimer(); timer already running");
                    return;
                }
                int i1 = e(false);
                com.microsoft.advertising.android.av.a("FETCH_TIMER", (new StringBuilder("canStartFetching()=")).append(i1).toString());
                if (i1 != 0)
                {
                    if (-2 == i1)
                    {
                        a.a(g.c, long1);
                        return;
                    }
                    if (1 == i1)
                    {
                        b(new c(m) {

                            final g a;

                            public final void run()
                            {
                                if (a.a(new b[] {
                            b.b, com.microsoft.advertising.android.b.a
                        }))
                                {
                                    com.microsoft.advertising.android.g.a(a, b, b.c);
                                }
                            }

            
            {
                a = g.this;
                super(b1);
            }
                        });
                        return;
                    } else
                    {
                        com.microsoft.advertising.android.af.a(false);
                        return;
                    }
                }
            }
        }
    }

    static void b(g g1)
    {
        g1.v();
    }

    private void c(com.microsoft.advertising.android.d d1)
    {
        if (com.microsoft.advertising.android.af.a(new Object[] {
    d1
}))
        {
            com.microsoft.advertising.android.af.a(d1.c().a(com.microsoft.advertising.android.a.a.a.g));
            com.microsoft.advertising.android.af.a(d1.c().a(com.microsoft.advertising.android.a.a.a.h));
            b.a(true);
            j.i().a(this, ae.j);
            if (a(new b[] {
    b.d
}))
            {
                a(m, com.microsoft.advertising.android.b.e);
                return;
            }
        }
    }

    static void c(g g1)
    {
        g1.w();
    }

    static void d(g g1)
    {
        if (g1.a(new b[] {
    com.microsoft.advertising.android.b.e
}))
        {
            g1.r.b();
            g1.r = null;
            g1.a(g1.m, b.f);
        }
    }

    private int e(boolean flag)
    {
        boolean flag1 = false;
        af.b();
        while (!d(flag) || a(new b[] {
            b.c
        })) 
        {
            return 0;
        }
        if (a(new b[] {
    b.b
}) && (q != null && q.o() == b.b.c))
        {
            j.i().a("Failed to load the ad.", flag, "");
            q.t();
            t();
            return -2;
        }
        if (!a(new b[] {
    b.b
}))
        {
            j.i().a("Ad Control not ready to refresh ad.", flag, (new StringBuilder("not in WAITING_TO_FETCH, in: ")).append(m.toString()).toString());
            return 0;
        }
        if (!h.h())
        {
            j.i().a("Ad control is not attached to window.", flag, null);
            return 0;
        }
        if (!h.g())
        {
            j.i().a("Ad control is not in view tree.", flag, null);
            return 0;
        }
        if (h.l())
        {
            j.i().a("Ad control skipping refresh(); userEngaged = true.", flag, null);
            return 0;
        }
        if (flag && g.b)
        {
            j.i().a("Cannot manually refresh while auto refresh is enabled.", flag, null);
            return 0;
        }
        if (!j.h())
        {
            j.i().a("no internet connection", flag, null);
            return 0;
        }
        f f1 = h;
        if (!flag)
        {
            flag1 = true;
        }
        if (f1.a(flag1))
        {
            if (flag)
            {
                j.i().a("Ad Control not ready to refresh ad", flag, "isShowingFreshAd()=true");
            }
            return -2;
        }
        if (n && b.a(g.c))
        {
            if (flag)
            {
                com.microsoft.advertising.android.av.a("FETCH_STATE", "backing off from a manual refresh");
                j.i().a("too many ad call failures, delaying manual refresh", flag, null);
            }
            return -2;
        } else
        {
            return 1;
        }
    }

    static void e(g g1)
    {
        if (!g1.a(new b[] {
            b.f
        })) goto _L2; else goto _L1
_L1:
        if (g1.q == null) goto _L4; else goto _L3
_L3:
        if (g1.q.o() == b.b.b)
        {
            com.microsoft.advertising.android.af.a(g1.q.p().c().a(com.microsoft.advertising.android.a.a.a.g));
            com.microsoft.advertising.android.af.a(g1.q.p().c().a(com.microsoft.advertising.android.a.a.a.h));
            g1.h.m().a(g1.q);
            g1.p = null;
            g1.q = null;
        } else
        {
            g1.q.t();
            g1.t();
        }
_L6:
        g1.j.j().b("initalize_to_first_fetch");
        g1.g = g1. new d(g1.m, g1.o, g1.l);
        g1.b(g1. new c(g1.m) {

            final g a;

            public final void run()
            {
                com.microsoft.advertising.android.g.a(a, b, b.b);
            }

            
            {
                a = g.this;
                super(b1);
            }
        });
_L2:
        return;
_L4:
        if (g1.p != null)
        {
            com.microsoft.advertising.android.af.a(g1.p.c().a(com.microsoft.advertising.android.a.a.a.g));
            com.microsoft.advertising.android.af.a(g1.p.c().a(com.microsoft.advertising.android.a.a.a.h));
            g1.h.a(g1.p);
            g1.p = null;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void t()
    {
        p = null;
        if (q != null && q.getParent() != null)
        {
            q.removeAllViews();
        }
        q = null;
    }

    private void u()
    {
        af.b();
        if (!a(new b[] {
            com.microsoft.advertising.android.b.a
        })) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!s && h.h())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a(new b[] {
            b.g
        })) goto _L1; else goto _L3
_L3:
        a(m, b.g);
        return;
        if (!a(new b[] {
            b.g
        })) goto _L1; else goto _L4
_L4:
        if (p != null && p.a() > System.currentTimeMillis() - (long)com.microsoft.advertising.android.ab.a().a("MAX_AD_CACHE_WHILE_SUSPENDED_MILLISECONDS"))
        {
            a(m, b.d);
            return;
        }
        if (q != null && q.o() == com.microsoft.advertising.android.b.b.a)
        {
            com.microsoft.advertising.android.av.a("AdController");
            a(m, b.d);
            return;
        }
        if (q != null && q.o() == b.b.b && !q.m())
        {
            com.microsoft.advertising.android.av.a("AdController");
            j.i().a(this, ae.l);
            a(m, com.microsoft.advertising.android.b.e);
            return;
        }
        if (q != null)
        {
            q.t();
        }
        j.i().a(this, ae.k);
        t();
        g = new d(m, o, l);
        a(m, b.b);
        return;
    }

    private void v()
    {
        af.b();
        if (!a(new b[] {
    b.c
}))
        {
            return;
        }
        Object obj;
        try
        {
            obj = com.microsoft.advertising.android.p.a().e();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Object obj1 = j.i();
            PackageManager packagemanager;
            if (com/microsoft/advertising/android/i.isAssignableFrom(obj.getClass()))
            {
                ((ah) (obj1)).c(((Exception) (obj)).getMessage(), ((i)obj).a());
            } else
            {
                ((ah) (obj1)).a(((Exception) (obj)), e.a);
            }
            a.a(b.c);
            return;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((k) (obj)).a(j.f());
_L4:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        com.microsoft.advertising.android.af.a(((com.microsoft.advertising.android.d) (obj)));
        j.i().b(new h(h.b(), com.microsoft.advertising.android.ae.e));
        p = ((com.microsoft.advertising.android.d) (obj));
        a(new c(m) {

            final g a;

            public final void run()
            {
                com.microsoft.advertising.android.g.a(a, b, b.d);
            }

            
            {
                a = g.this;
                super(b1);
            }
        });
        return;
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
        obj = new t(com.microsoft.advertising.android.p.a().d(), j.f(), j.g(), j.c(), j.d(), com.microsoft.advertising.android.p.a().j(), com.microsoft.advertising.android.p.a());
        obj1 = d;
        packagemanager = ((Context) (obj1)).getPackageManager();
        if (packagemanager.checkPermission("android.permission.INTERNET", ((Context) (obj1)).getPackageName()) == -1)
        {
            j.i().a("Mandatory Permission INTERNET Missing", e.d);
        }
        if (packagemanager.checkPermission("android.permission.ACCESS_NETWORK_STATE", ((Context) (obj1)).getPackageName()) == -1)
        {
            av.c("AdControl", "Optional ACCESS_NETWORK_STATE permission is missing");
        }
        i.a(this, ((t) (obj)), j.i());
        return;
    }

    private void w()
    {
        bk bk1;
        int i1;
        int j1;
        af.b();
        if (!a(new b[] {
    b.f
}))
        {
            return;
        }
        com.microsoft.advertising.android.av.a("ShowWait", "entering SHOW_WAIT");
        if (!by.b(d) || by.c(d))
        {
            com.microsoft.advertising.android.av.a("ShowWait", "Can't show ad: screen is not ON or the key Gaurd is ON");
            j.i().a(this, ae.m);
            a.a(b.f);
            return;
        }
        if (h.l())
        {
            com.microsoft.advertising.android.av.a("ShowWait", "Can't show ad: user is engaged");
            j.i().a(this, ae.m);
            a.a(b.f);
            return;
        }
        if (h.a(com.microsoft.advertising.android.AdControl.a.a))
        {
            com.microsoft.advertising.android.av.a("ShowWait", "show wait skipping onScreen check because the control is collapsed");
        } else
        if (!h.k())
        {
            com.microsoft.advertising.android.av.a("ShowWait", "Can't show ad: not collapsed, and its not on the screen");
            j.i().c("Cannot show ad; ad control is not on the screen", e.d);
            j.i().a(this, ae.m);
            a.a(b.f);
            return;
        }
        if (h.a(g.b))
        {
            com.microsoft.advertising.android.av.a("ShowWait", "Can't show ad: ad control has fresh ad");
            j.i().a(this, ae.m);
            a.a(b.f);
            return;
        }
        bk1 = h.b().a();
        j1 = h.b().a;
        i1 = h.b().b;
        if (j1 != -1 && i1 != -1) goto _L2; else goto _L1
_L1:
        b(new Runnable() {

            final g a;

            public final void run()
            {
                com.microsoft.advertising.android.g.e(a);
            }

            
            {
                a = g.this;
                super();
            }
        });
        return;
_L2:
        int k1 = android.view.View.MeasureSpec.getMode(j1);
        if (0x40000000 == k1 || 0x80000000 == k1)
        {
            int l1 = bk1.a();
            if (android.view.View.MeasureSpec.getSize(j1) + 2 < l1)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j1 = android.view.View.MeasureSpec.getMode(i1);
        if (0x40000000 == j1 || 0x80000000 == j1)
        {
            bk1.b();
            android.view.View.MeasureSpec.getSize(i1);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    final void a()
    {
        com.microsoft.advertising.android.av.a("AdController", "detach mode enabled");
        n = true;
    }

    public final void a(int i1)
    {
        if (i1 < 30 || i1 > 600)
        {
            j.i().a("Invalid Auto Refresh value. The value is outside the range of 30 to 120 Seconds.", e.d);
        } else
        {
            l = i1 * 1000;
            if (a(new b[] {
    b.b
}))
            {
                g.c = l;
                return;
            }
        }
    }

    public final void a(com.microsoft.advertising.android.a.b.a a1)
    {
        a1 = new Runnable(a1) {

            final g a;
            private final com.microsoft.advertising.android.a.b.a b;

            public final void run()
            {
                com.microsoft.advertising.android.g.a(a).i().a(b);
                if (b != com.microsoft.advertising.android.a.b.a.c)
                {
                    a.p();
                }
            }

            
            {
                a = g.this;
                b = a1;
                super();
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            a(((Runnable) (a1)));
            return;
        } else
        {
            a1.run();
            return;
        }
    }

    public final void a(com.microsoft.advertising.android.b b1, String s1, int i1)
    {
        j.i().a(this, ae.h);
        com.microsoft.advertising.android.av.a("FETCH_STATE", (new StringBuilder("onAdLoadError(")).append(i1).append(")").toString());
        if (b1 == q)
        {
            j.i().a(String.format("Unable to display ad:  message=%s reason=%d", new Object[] {
                s1, Integer.valueOf(i1)
            }), e.g);
            g = new d(m, o, l);
            if (q != null)
            {
                q.t();
            }
            t();
            b.a(false);
            j.i().a(this, ae.i);
            if (!a(new b[] {
    b.d
}))
            {
                return;
            } else
            {
                a(m, b.b);
                return;
            }
        } else
        {
            j.i().a("ad threw AdError, but it is not in the preloading state", e.g);
            return;
        }
    }

    public final void a(bk bk1)
    {
        j.a(new m(bk1, j.i()));
        g = new d(m, o, l);
        j();
    }

    public final void a(com.microsoft.advertising.android.d d1)
    {
        d1.c().b(com.microsoft.advertising.android.a.a.a.h);
        c(d1);
    }

    public final void a(n.b b1)
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            b(new Runnable(b1) {

                final g a;
                private final n.b b;

                public final void run()
                {
                    a.a(b);
                }

            
            {
                a = g.this;
                b = b1;
                super();
            }
            });
        } else
        {
            Object obj = b1.a;
            String s1 = b1.b;
            i i1 = b1.c;
            boolean flag = b1.d;
            k = true;
            if (!flag && a(new b[] {
    b.c
}))
            {
                if (s1 != null || i1 != null || obj == null)
                {
                    b.a(false);
                    if (i1 != null)
                    {
                        j.i().a(i1);
                    } else
                    {
                        obj = j.i();
                        String.format("requestGet result[%d][ERROR]", new Object[] {
                            Integer.valueOf(com.microsoft.advertising.android.p.a().h())
                        });
                        if (s1 != null)
                        {
                            b1 = s1;
                        } else
                        {
                            b1 = "empty response";
                        }
                        ((ah) (obj)).c(b1, e.e);
                    }
                    g = new d(m, o, l);
                    if (!o)
                    {
                        a(((Runnable) (new c(m) {

                            final g a;

                            public final void run()
                            {
                                com.microsoft.advertising.android.g.a(a, b, b.b);
                            }

            
            {
                a = g.this;
                super(b1);
            }
                        })));
                        return;
                    }
                    int j1 = com.microsoft.advertising.android.ab.a().a("STANDARD_AD_REFRESH_INTERVAL_MS");
                    if (j1 >= l)
                    {
                        j1 = l;
                    }
                    com.microsoft.advertising.android.a.a(a, j1);
                    h.n();
                    return;
                }
                if (q != null)
                {
                    q.t();
                }
                t();
                p = ((com.microsoft.advertising.android.d) (obj));
                if (com.microsoft.advertising.android.af.a())
                {
                    com.microsoft.advertising.android.af.a(((com.microsoft.advertising.android.d) (obj)));
                }
                j.i().b(new h(h.b(), com.microsoft.advertising.android.a.a.a.d, ((com.microsoft.advertising.android.d) (obj))));
                a(((Runnable) (new c(m) {

                    final g a;

                    public final void run()
                    {
                        com.microsoft.advertising.android.g.a(a, b, b.d);
                    }

            
            {
                a = g.this;
                super(b1);
            }
                })));
                return;
            }
        }
    }

    public final void a(Integer integer)
    {
        if (e == null)
        {
            j.a(integer.intValue());
        }
        e = integer;
        j();
    }

    public final void a(Runnable runnable)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            runnable.run();
            return;
        } else
        {
            c.post(runnable);
            return;
        }
    }

    public final void a(String s1)
    {
        j.i().a(s1, e.g);
    }

    public final void a(boolean flag)
    {
        s = flag;
        u();
    }

    final transient boolean a(b ab1[])
    {
        int j1 = ab1.length;
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                return false;
            }
            b b1 = ab1[i1];
            if (m == b1)
            {
                return true;
            }
            i1++;
        } while (true);
    }

    public final f b()
    {
        return h;
    }

    public final void b(com.microsoft.advertising.android.d d1)
    {
        d1 = new h(h.b(), com.microsoft.advertising.android.a.a.a.c, d1);
        if (com.microsoft.advertising.android.af.a())
        {
            com.microsoft.advertising.android.af.a(((l)d1.a("adLog")).a(com.microsoft.advertising.android.a.a.a.g));
            com.microsoft.advertising.android.af.a(((l)d1.a("adLog")).a(com.microsoft.advertising.android.a.a.a.h));
            boolean flag;
            if (((l)d1.a("adLog")).a(2) > -1L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.microsoft.advertising.android.af.a(flag);
        }
        j.i().b(d1);
        h.n();
    }

    public final void b(Integer integer)
    {
        if (f == null)
        {
            j.b(integer.intValue());
        }
        f = integer;
        j();
    }

    public final void b(Runnable runnable)
    {
        c.post(runnable);
    }

    public final void b(String s1)
    {
        j.a(s1);
        j();
    }

    public final void b(boolean flag)
    {
        j.b().a(flag);
        Object obj = h.b();
        if (obj != null && ((AdControl) (obj)).w() != null)
        {
            obj = ((AdControl) (obj)).w().j();
            if (obj != null)
            {
                ((com.microsoft.advertising.android.b) (obj)).s();
            }
        }
        j.i().a(this, com.microsoft.advertising.android.ae.a);
    }

    public final ai c()
    {
        return j.i();
    }

    public final void c(boolean flag)
    {
        if (o == flag)
        {
            return;
        }
        o = flag;
        if (a(new b[] {
    b.b
}))
        {
            g.b = flag;
        }
        p();
    }

    public final ad d()
    {
        return i;
    }

    final boolean d(boolean flag)
    {
        af.b();
        com.microsoft.advertising.android.af.a(new Object[] {
            j, j.i(), h
        });
        if (!a(new b[] {
    com.microsoft.advertising.android.b.a
}))
        {
            return true;
        }
        if (TextUtils.isEmpty(com.microsoft.advertising.android.p.a().d()))
        {
            if (flag)
            {
                j.i().b("Wrong ApplicationId or AdUnitId", e.d);
            }
            return false;
        }
        if (TextUtils.isEmpty(j.f()))
        {
            if (flag)
            {
                j.i().b("Wrong ApplicationId or AdUnitId", e.d);
            }
            return false;
        }
        if (!j.e())
        {
            if (flag)
            {
                j.i().b("AdControl does not have a valid width and height", e.d);
            }
            return false;
        }
        if (!h.h())
        {
            if (flag)
            {
                j.i().b("AdControl is not attached to a window", e.d);
            }
            return false;
        }
        if (s)
        {
            a(m, b.g);
            return false;
        } else
        {
            g = new d(m, o, l);
            a(m, b.b);
            return true;
        }
    }

    public final Integer e()
    {
        return e;
    }

    public final Integer f()
    {
        return f;
    }

    public final q g()
    {
        return j;
    }

    public final void h()
    {
        if (a(new b[] {
    com.microsoft.advertising.android.b.a
}))
        {
            d(false);
            return;
        } else
        {
            u();
            return;
        }
    }

    public final boolean i()
    {
        return o;
    }

    final void j()
    {
        a(new Runnable() {

            final g a;

            public final void run()
            {
                a.d(false);
            }

            
            {
                a = g.this;
                super();
            }
        });
    }

    final void k()
    {
        com.microsoft.advertising.android.av.a("FETCH_TIMER", "onTimer()");
        com.microsoft.advertising.android.a.a(a);
        a(new Runnable() {

            final g a;

            public final void run()
            {
                if (a.a(new b[] {
            com.microsoft.advertising.android.b.a
        }))
                {
                    a.j();
                } else
                {
                    if (a.a(new b[] {
            b.b
        }))
                    {
                        a.o();
                        return;
                    }
                    if (a.a(new b[] {
            b.c
        }))
                    {
                        g.b(a);
                        return;
                    }
                    if (a.a(new b[] {
            b.f
        }))
                    {
                        g.c(a);
                        return;
                    }
                }
            }

            
            {
                a = g.this;
                super();
            }
        });
    }

    final void l()
    {
        boolean flag;
        if (a(new b[] {
    b.g
}))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        com.microsoft.advertising.android.af.a(flag);
        if (a(new b[] {
    b.b
}) && o)
        {
            a(m, b.c);
        }
    }

    final void m()
    {
        if (1 == e(true))
        {
            a(m, b.c);
            return;
        } else
        {
            com.microsoft.advertising.android.av.a("FETCH_STATE", "manual refresh: canStartFetching did not return YES");
            return;
        }
    }

    final boolean n()
    {
        return k;
    }

    final void o()
    {
        a(((Long) (null)));
    }

    final void p()
    {
        af.b();
        if (!a(new b[] {
            com.microsoft.advertising.android.b.a
        })) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (h.j() != 0 || h.f() != 0 || h.l())
        {
            break; /* Loop/switch isn't completed */
        }
        if (a(new b[] {
    b.b
}))
        {
            com.microsoft.advertising.android.av.a("FETCH_TIMER", "messing with auto fetch because of UI change");
            a(((Long) (null)));
            return;
        }
        if (a(new b[] {
    b.f
}))
        {
            w();
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (a(new b[] {
    b.b
}))
        {
            a.a();
            return;
        }
        if (a(new b[] {
    b.c
}))
        {
            g = new d(m, o, l);
            a(m, b.b);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final boolean q()
    {
        return s;
    }

    public final int r()
    {
        return g.c / 1000;
    }

    public final void s()
    {
        c.removeCallbacksAndMessages(null);
        if (j.i() != null)
        {
            j.i().b();
        }
        if (q != null)
        {
            q.t();
        }
        t();
        if (a.c())
        {
            a.e();
        }
        if (i != null)
        {
            i.a();
        }
    }
}
