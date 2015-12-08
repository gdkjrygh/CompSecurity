// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.PowerManager;
import android.support.v4.content.j;
import com.pandora.android.PandoraApp;
import com.pandora.android.PandoraService;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.provider.b;
import com.pandora.android.util.aj;
import com.pandora.android.util.s;
import com.pandora.radio.data.a;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import com.pandora.radio.data.af;
import com.pandora.radio.data.o;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;
import p.bz.g;
import p.cx.n;
import p.cx.q;
import p.cx.t;
import p.cx.y;
import p.dd.an;
import p.dd.at;
import p.dd.ay;
import p.dd.ba;
import p.dd.bh;
import p.dd.bo;
import p.dd.bq;
import p.dd.f;
import p.dd.m;
import p.dd.p;

// Referenced classes of package com.pandora.android.ads:
//            g, t, a, h, 
//            VideoAdManager, d, i

public class com.pandora.android.ads.c
    implements a.a, e.a, com.pandora.android.ads.g
{
    public static interface a
    {

        public abstract void b(String s1);
    }

    public static class b extends com.pandora.radio.util.b
    {

        private static volatile com.pandora.android.ads.g a;

        public static com.pandora.android.ads.g a()
        {
            if (a == null)
            {
                Application application = com.pandora.android.provider.b.a.h();
                if (application == null)
                {
                    throw new IllegalStateException("AdManager has no available context to use.");
                }
                p.cw.c c1 = com.pandora.android.provider.b.a.b();
                if (c1 == null)
                {
                    throw new IllegalStateException("AdManager has no available radio to use.");
                }
                a = new com.pandora.android.ads.c(application, c1);
            }
            return a;
        }

        static com.pandora.android.ads.g a(com.pandora.android.ads.g g1)
        {
            a = g1;
            return g1;
        }

        static com.pandora.android.ads.g b()
        {
            return a;
        }
    }

    protected class c
        implements Runnable
    {

        final com.pandora.android.ads.c a;
        private final com.pandora.android.ads.a b;
        private String c;
        private final boolean d;
        private final long e;
        private Future f;

        static com.pandora.android.ads.a a(c c1)
        {
            return c1.b;
        }

        private com.pandora.radio.data.a a(long l1, boolean flag, boolean flag1)
        {
            com.pandora.android.ads.a a1;
            boolean flag2;
            flag2 = false;
            a1 = b;
            if (a1 == null)
            {
                return null;
            }
            if (a1.c == -1)
            {
                return null;
            }
            if (System.currentTimeMillis() - l1 > 0x1d4c0L)
            {
                com.pandora.android.ads.c.a(c, "not rotating banner.  failed to fetch a track.");
                return com.pandora.android.ads.c.q();
            }
            if (a1.c == 3)
            {
                if (com.pandora.android.ads.c.f(a) == null)
                {
                    com.pandora.android.ads.c.a(c, "waiting for genre category");
                    return null;
                }
            } else
            if (com.pandora.android.ads.c.g(a) == null)
            {
                com.pandora.android.ads.c.a(c, "waiting for track data");
                return null;
            }
            if (com.pandora.android.ads.c.h(a) == null)
            {
                com.pandora.android.ads.c.a(c, "Not requesting banner, because userData is null");
                return com.pandora.android.ads.c.q();
            }
            if (a1.c != 0) goto _L2; else goto _L1
_L1:
            Object obj = com.pandora.android.ads.c.h(a).v();
            if (obj == null) goto _L2; else goto _L3
_L3:
            flag2 = true;
_L19:
            if (obj != null) goto _L5; else goto _L4
_L4:
            if (a1.c != 3) goto _L7; else goto _L6
_L6:
            Object obj1 = com.pandora.android.ads.c.a(a, com.pandora.android.ads.c.f(a), b);
            obj = obj1;
_L5:
            if (!com.pandora.android.ads.c.h(a).a() && !flag2)
            {
                com.pandora.android.ads.c.a(c, "Not requesting banner, because isAdSupported == false");
                return com.pandora.android.ads.c.q();
            }
            break; /* Loop/switch isn't completed */
_L7:
            obj1 = com.pandora.android.ads.c.a(a, com.pandora.android.ads.c.g(a), b, c, flag, flag1);
            obj = obj1;
            continue; /* Loop/switch isn't completed */
            Exception exception;
            exception;
            obj = null;
            flag2 = false;
_L16:
            com.pandora.android.ads.c.a(c, "Exception getting af url", exception);
            if (true) goto _L5; else goto _L8
_L8:
            if (com.pandora.android.util.s.a(((String) (obj))))
            {
                com.pandora.android.ads.c.a(c, "not requesting banner - we have no ad url");
                return com.pandora.android.ads.c.q();
            }
            com.pandora.android.ads.c.a(c, "requesting banner");
            com.pandora.android.util.b.a().b(((String) (obj)));
            exception = com.pandora.android.ads.c.p()[a1.c].a;
            static class _cls6
            {

                static final int a[];
                static final int b[];
                static final int c[];
                static final int d[];

                static 
                {
                    d = new int[p.cx.e.a.values().length];
                    try
                    {
                        d[p.cx.e.a.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror15) { }
                    try
                    {
                        d[p.cx.e.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror14) { }
                    try
                    {
                        d[p.cx.e.a.d.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror13) { }
                    try
                    {
                        d[p.cx.e.a.c.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror12) { }
                    c = new int[p.dd.bh.a.values().length];
                    try
                    {
                        c[p.dd.bh.a.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror11) { }
                    try
                    {
                        c[p.dd.bh.a.e.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror10) { }
                    try
                    {
                        c[p.dd.bh.a.a.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror9) { }
                    try
                    {
                        c[p.dd.bh.a.c.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        c[p.dd.bh.a.d.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    b = new int[p.dd.ay.a.values().length];
                    try
                    {
                        b[p.dd.ay.a.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        b[p.dd.ay.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        b[p.dd.ay.a.d.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        b[p.dd.ay.a.a.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    a = new int[com.pandora.android.ads.t.a.values().length];
                    try
                    {
                        a[com.pandora.android.ads.t.a.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[t.a.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.pandora.android.ads.t.a.a.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            com.pandora.android.ads._cls6.a[exception.ordinal()];
            JVM INSTR tableswitch 1 3: default 587
        //                       1 434
        //                       2 458
        //                       3 567;
               goto _L9 _L10 _L11 _L12
_L9:
            throw new InvalidParameterException((new StringBuilder()).append("unknown ZoneFormat: ").append(exception).toString());
_L13:
            return com.pandora.android.ads.c.q();
_L10:
            try
            {
                obj = (new com.pandora.radio.data.a.b(com.pandora.android.ads.d.a(((String) (obj))), 0, com.pandora.radio.data.a.a.a)).a();
                continue; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.pandora.android.ads.c.a(c, (new StringBuilder()).append("exception requesting ad from dart: ").append(((Exception) (obj)).getMessage()).toString(), ((Exception) (obj)));
            }
              goto _L13
_L11:
            flag = com.pandora.android.ads.c.e(((String) (obj)));
            flag1 = a.a.b().a(p.dj.b.a.g);
            exception = ((PandoraApp)com.pandora.android.provider.b.a.h()).b().a();
            if (!flag1 || flag) goto _L15; else goto _L14
_L14:
            obj = com.pandora.android.ads.c.i(a).p().a(((String) (obj)));
            a.a(a1.b, ((String) (obj)), c, exception);
            obj = null;
            continue; /* Loop/switch isn't completed */
_L15:
            obj = com.pandora.android.ads.d.a(((String) (obj)), exception);
            continue; /* Loop/switch isn't completed */
_L12:
            obj = null;
            continue; /* Loop/switch isn't completed */
            exception;
              goto _L16
_L2:
            obj = null;
            continue; /* Loop/switch isn't completed */
            if (obj == null) goto _L13; else goto _L17
_L17:
            return ((com.pandora.radio.data.a) (obj));
            if (true) goto _L19; else goto _L18
_L18:
        }

        private void a(com.pandora.android.ads.a a1, String s1, boolean flag)
        {
            com.pandora.android.ads.c.a(s1, (new StringBuilder()).append("issuing request to rotate ad [").append(s1).append("]").toString());
            if (a1.b.k()) goto _L2; else goto _L1
_L1:
            com.pandora.android.ads.c.a(s1, "not ready - skipping rotateAd");
_L4:
            return;
_L2:
            boolean flag3;
            boolean flag4;
            if (com.pandora.android.ads.c.c(a))
            {
                com.pandora.android.ads.c.a(s1, "not fetching ads because coachmark is currently shown");
                return;
            }
            if (a.a.c().i())
            {
                com.pandora.android.ads.c.a(s1, "chromecast connected - skipping rotateAd");
                return;
            }
            if (c())
            {
                continue; /* Loop/switch isn't completed */
            }
            com.pandora.radio.data.a a2 = a.h();
            com.pandora.radio.data.a a4 = a1.e;
            boolean flag1;
            boolean flag2;
            if (a4 != null && a4.W())
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (a4 != null && a4.V())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (a4 != null && a4.X())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1 || flag3 || flag2)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (a2 != null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if ((flag1 || flag4) && a1.c != -1 && !com.pandora.android.ads.c.p()[a1.c].c)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (flag4 && !flag1 && ("return".equals(s1) || "post_audio_ad".equals(s1)))
            {
                com.pandora.android.ads.c.d("re-displaying current follow on");
                com.pandora.android.ads.c.a(a, a1, com.pandora.android.ads.h.b.b, a4, s1, true);
                return;
            }
            if (!flag1)
            {
                break; /* Loop/switch isn't completed */
            }
            if ((!a2.X() || com.pandora.android.ads.c.a(a, s1)) && com.pandora.android.ads.c.a(a, a1, com.pandora.android.ads.h.b.b, a2, s1, false))
            {
                com.pandora.android.ads.c.a(s1, "doFetchBannerAd: not requesting a DART ad, using followon banner data");
                a1.a(s1, true, com.pandora.android.ads.c.d(a));
                a.a(null);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (com.pandora.android.ads.c.e(a))
            {
                com.pandora.android.ads.c.a(a, false);
                s1 = "station";
                c = "station";
            }
            if (!flag && !com.pandora.android.ads.c.a(a, s1)) goto _L4; else goto _L5
_L5:
            a1.a(s1, false, com.pandora.android.ads.c.d(a));
            if (c()) goto _L4; else goto _L6
_L6:
            long l1 = System.currentTimeMillis();
_L9:
            if (c()) goto _L4; else goto _L7
_L7:
            com.pandora.radio.data.a a3 = a(l1, flag4, flag3);
            if (c() || a3 == com.pandora.android.ads.c.q() || com.pandora.android.ads.c.a(a, a3, a1, s1)) goto _L4; else goto _L8
_L8:
            Thread.sleep(3000L);
              goto _L9
            a1;
        }

        static long b(c c1)
        {
            return c1.e;
        }

        private boolean c()
        {
            return f != null && f.isCancelled();
        }

        public void a()
        {
            f = com.pandora.android.ads.c.a(a).submit(this);
        }

        public void b()
        {
            if (f != null)
            {
                f.cancel(true);
            }
        }

        public void run()
        {
            a(b, c, d);
            synchronized (a)
            {
                if (com.pandora.android.ads.c.b(a) == this)
                {
                    com.pandora.android.ads.c.a(a, null);
                }
            }
            return;
            exception1;
            c1;
            JVM INSTR monitorexit ;
            throw exception1;
            Exception exception;
            exception;
            com.pandora.android.ads.c.a(c, "error downloading ad", exception);
            synchronized (a)
            {
                if (com.pandora.android.ads.c.b(a) == this)
                {
                    com.pandora.android.ads.c.a(a, null);
                }
            }
            return;
            exception2;
            c2;
            JVM INSTR monitorexit ;
            throw exception2;
            Exception exception3;
            exception3;
            synchronized (a)
            {
                if (com.pandora.android.ads.c.b(a) == this)
                {
                    com.pandora.android.ads.c.a(a, null);
                }
            }
            throw exception3;
            exception4;
            c3;
            JVM INSTR monitorexit ;
            throw exception4;
        }

        private c(com.pandora.android.ads.a a1, String s1, boolean flag)
        {
            a = com.pandora.android.ads.c.this;
            super();
            b = a1;
            c = s1;
            d = flag;
            e = System.currentTimeMillis();
        }

    }

    private static class d
    {

        String a;

        d(String s1, String s2, String s3)
        {
            a = s3;
        }
    }


    private static final com.pandora.radio.data.a H;
    private static final com.pandora.android.ads.t e[];
    private boolean A;
    private long B;
    private boolean C;
    private Handler D;
    private String E;
    private boolean F;
    private Map G;
    private BroadcastReceiver I;
    private BroadcastReceiver J;
    private com.pandora.android.util.aj.a K;
    com.pandora.android.provider.b a;
    private boolean f;
    private aa g;
    private KeyguardManager h;
    private com.pandora.android.ads.a i[];
    private com.pandora.android.ads.a j;
    private com.pandora.android.ads.a k;
    private Object l;
    private Object m;
    private int n;
    private Integer o;
    private ExecutorService p;
    private c q;
    private boolean r;
    private d s;
    private com.pandora.radio.data.a t;
    private boolean u;
    private int v;
    private int w;
    private final p.cw.c x;
    private com.pandora.radio.data.y y;
    private af z;

    protected com.pandora.android.ads.c(Application application, p.cw.c c1)
    {
        l = new Object();
        m = new Object();
        n = 0;
        o = null;
        r = true;
        v = 5;
        A = false;
        a = com.pandora.android.provider.b.a;
        C = false;
        F = false;
        I = new BroadcastReceiver() {

            final com.pandora.android.ads.c a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (context.equals("android.intent.action.USER_PRESENT"))
                {
                    intent = a;
                    if (com.pandora.android.ads.c.g(a) == null)
                    {
                        context = "station_change";
                    } else
                    {
                        context = "return";
                    }
                    intent.a(-1, context, true);
                } else
                {
                    if (context.equals("android.intent.action.SCREEN_ON"))
                    {
                        com.pandora.android.ads.c.b(a, true);
                        a.a(-1, "screen_on", false);
                        return;
                    }
                    if (context.equals("android.intent.action.SCREEN_OFF"))
                    {
                        com.pandora.android.ads.c.b(a, false);
                        return;
                    }
                }
            }

            
            {
                a = com.pandora.android.ads.c.this;
                super();
            }
        };
        J = new BroadcastReceiver() {

            final com.pandora.android.ads.c a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (context.equals(PandoraIntent.a("handle_listener_interaction")))
                {
                    context = intent.getStringExtra("intent_interaction_name");
                    a.a(-1, context, false);
                } else
                {
                    if (context.equals(PandoraIntent.a("hide_banner_ad")))
                    {
                        context = (com.pandora.radio.util.k.a)intent.getSerializableExtra("ad_close_extra");
                        boolean flag = intent.getBooleanExtra("hide_all_banners", true);
                        com.pandora.android.ads.c.a(a, context, flag);
                        return;
                    }
                    if (context.equals(PandoraIntent.a("cmd_subscription_expired")))
                    {
                        com.pandora.android.ads.c.j(a);
                        return;
                    }
                    if (context.equals(PandoraIntent.a("cmd_ack_trial_expired_success")))
                    {
                        com.pandora.android.ads.c.k(a);
                        return;
                    }
                }
            }

            
            {
                a = com.pandora.android.ads.c.this;
                super();
            }
        };
        K = new com.pandora.android.util.aj.a() {

            final com.pandora.android.ads.c a;

            public void a(int i1)
            {
                if (com.pandora.android.ads.c.l(a) > System.currentTimeMillis())
                {
                    com.pandora.android.ads.c.a(a, 0L);
                    com.pandora.android.ads.c.d("skipping volume change because it is too soon since the last headset event");
                } else
                if (com.pandora.android.ads.c.m(a) != i1)
                {
                    com.pandora.android.ads.a a1 = com.pandora.android.ads.c.n(a);
                    if (a1 != null && com.pandora.android.ads.c.a(a, "test_volume_change", a1, false))
                    {
                        a.a(a1.d, "volume_change", false);
                    }
                    com.pandora.android.ads.c.a(a, i1);
                    return;
                }
            }

            
            {
                a = com.pandora.android.ads.c.this;
                super();
            }
        };
        x = c1;
        c1.b(this);
        a.e().c(this);
        p = Executors.newFixedThreadPool(1);
        h = (KeyguardManager)application.getSystemService("keyguard");
        i = new com.pandora.android.ads.a[6];
        f = ((PowerManager)application.getSystemService("power")).isScreenOn();
        c1 = new IntentFilter();
        c1.addAction("android.intent.action.USER_PRESENT");
        c1.addAction("android.intent.action.SCREEN_ON");
        c1.addAction("android.intent.action.SCREEN_OFF");
        application.registerReceiver(I, c1);
        application = new PandoraIntentFilter();
        application.a("handle_listener_interaction");
        application.a("hide_banner_ad");
        application.a("cmd_subscription_expired");
        application.a("cmd_ack_trial_expired_success");
        a.C().a(J, application);
        D = new Handler();
    }

    static int a(com.pandora.android.ads.c c1, int i1)
    {
        c1.w = i1;
        return i1;
    }

    static long a(com.pandora.android.ads.c c1, long l1)
    {
        c1.B = l1;
        return l1;
    }

    static c a(com.pandora.android.ads.c c1, c c2)
    {
        c1.q = c2;
        return c2;
    }

    private String a(d d1, com.pandora.android.ads.a a1)
        throws q, n, JSONException, y
    {
        Object obj1 = null;
        Object obj = obj1;
        if (a1.c == 3)
        {
            if (y != null && y.A())
            {
                obj = obj1;
            } else
            {
                d1 = d1.a;
                obj = d1;
                if (C)
                {
                    d1 = b(d1, "vx");
                    i((new StringBuilder()).append("getAdUrl(ZONE_GENRE_CATEGORY) --> activeValueExchangeReward.  adding vx=1 to adUrl:").append(d1).toString());
                    return d1;
                }
            }
        }
        return ((String) (obj));
    }

    static String a(com.pandora.android.ads.c c1, d d1, com.pandora.android.ads.a a1)
        throws q, n, JSONException, y
    {
        return c1.a(d1, a1);
    }

    static String a(com.pandora.android.ads.c c1, aa aa1, com.pandora.android.ads.a a1, String s1, boolean flag, boolean flag1)
        throws q, n, JSONException, y
    {
        return c1.a(aa1, a1, s1, flag, flag1);
    }

    private String a(aa aa1, com.pandora.android.ads.a a1, String s1, boolean flag, boolean flag1)
        throws q, n, JSONException, y
    {
        Object obj = null;
        if (a1.c == 0)
        {
            a1 = aa1.x();
        } else
        {
label0:
            {
                if (a1.c != 1)
                {
                    break label0;
                }
                a1 = aa1.y();
            }
        }
        aa1 = a1;
        if (!com.pandora.android.util.s.a(a1))
        {
            aa1 = a1;
            if (!com.pandora.android.util.s.a(s1))
            {
                aa1 = a1;
                if (a1.indexOf("__INTERACTION__") != -1)
                {
                    aa1 = a1.replaceAll("__INTERACTION__", s1);
                }
            }
            if (flag1)
            {
                a1 = "1";
            } else
            {
                a1 = "0";
            }
            a1 = aa1.replaceAll("__AFTERVIDEO__", a1);
            if (a.l())
            {
                aa1 = "newUser=1;";
            } else
            {
                aa1 = "";
            }
            a1 = a1.replaceAll("__AFTERREG__", aa1);
            aa1 = a1;
            if (flag)
            {
                aa1 = a1.replaceAll("__INDEX__", "");
            }
            if (o != null)
            {
                a1 = Integer.valueOf(o.intValue() + 1);
                o = a1;
                a1 = String.valueOf(a1);
            } else
            {
                a1 = "";
            }
            a1 = aa1.replaceAll("__P1INDEX__", a1);
            aa1 = a1;
            if (C)
            {
                aa1 = b(a1, "vx");
                i("getAdUrl(...) --> activeValueExchangeReward.  adding vx=1 to adUrl");
            }
        }
        return aa1;
        aa1 = obj;
        if (a1.c == 5)
        {
            return null;
        }
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_177;
_L1:
    }

    static ExecutorService a(com.pandora.android.ads.c c1)
    {
        return c1.p;
    }

    private void a(com.pandora.android.ads.a a1)
    {
        if (!a1.b.k() || !a.a(a1.c))
        {
            a(a1, ((com.pandora.radio.util.k.a) (null)));
        } else
        {
            a1 = g;
            if (a1 != null)
            {
                if (a(((aa) (a1))))
                {
                    w();
                    return;
                } else
                {
                    x();
                    return;
                }
            }
        }
    }

    private void a(com.pandora.android.ads.a a1, com.pandora.radio.util.k.a a2)
    {
        a1.b.b(a2);
    }

    private void a(com.pandora.android.ads.a a1, String s1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (q != null && com.pandora.android.ads.c.a(q).c == a1.c && com.pandora.android.ads.c.b(q) + 30000L >= System.currentTimeMillis())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        a(s1);
        q = new c(a1, s1, flag);
        q.a();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        d(s1, "skipping fetchBannerAd");
        if (true) goto _L2; else goto _L1
_L1:
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    static void a(com.pandora.android.ads.c c1, com.pandora.radio.util.k.a a1, boolean flag)
    {
        c1.a(a1, flag);
    }

    private void a(aa aa1, com.pandora.radio.data.y y1)
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 != null && a1.b != null)
        {
            a1.b.a(aa1, y1);
        }
    }

    private void a(com.pandora.radio.util.k.a a1)
    {
        com.pandora.android.ads.a a2 = j;
        if (a2 != null)
        {
            a(a2, a1);
        }
    }

    private void a(com.pandora.radio.util.k.a a1, boolean flag)
    {
        if (flag)
        {
            com.pandora.android.ads.a aa1[] = i;
            int j1 = aa1.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                com.pandora.android.ads.a a2 = aa1[i1];
                if (a2 != null)
                {
                    a(a2, a1);
                }
            }

        } else
        {
            a(a1);
        }
    }

    static void a(String s1, String s2)
    {
        d(s1, s2);
    }

    static void a(String s1, String s2, Exception exception)
    {
        b(s1, s2, exception);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            o = Integer.valueOf(0);
        }
    }

    private boolean a(com.pandora.android.ads.a a1, h.b b1, com.pandora.radio.data.a a2, String s1, boolean flag)
    {
        Runnable runnable = null;
        if (b1 == com.pandora.android.ads.h.b.b)
        {
            boolean flag1;
            if (a2 != null && a2.U())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                if (!g.m())
                {
                    d(s1, "showAd: skipping showAd() since we're playing a track that doesn't support banner ads");
                    return false;
                }
                runnable = new Runnable(a1, a2) {

                    final com.pandora.android.ads.a a;
                    final com.pandora.radio.data.a b;
                    final com.pandora.android.ads.c c;

                    public void run()
                    {
                        if (a.e == b && com.pandora.android.ads.c.a(c, "show_ad_test", a, true))
                        {
                            a.e = null;
                        }
                    }

            
            {
                c = com.pandora.android.ads.c.this;
                a = a1;
                b = a2;
                super();
            }
                };
            }
            a1.e = a2;
        } else
        {
            runnable = null;
        }
        a1.b.a(b1, a2, s1, flag, runnable);
        return true;
    }

    static boolean a(com.pandora.android.ads.c c1, com.pandora.android.ads.a a1, h.b b1, com.pandora.radio.data.a a2, String s1, boolean flag)
    {
        return c1.a(a1, b1, a2, s1, flag);
    }

    static boolean a(com.pandora.android.ads.c c1, com.pandora.radio.data.a a1, com.pandora.android.ads.a a2, String s1)
    {
        return c1.a(a1, a2, s1);
    }

    static boolean a(com.pandora.android.ads.c c1, String s1)
    {
        return c1.h(s1);
    }

    static boolean a(com.pandora.android.ads.c c1, String s1, com.pandora.android.ads.a a1, boolean flag)
    {
        return c1.a(s1, a1, flag);
    }

    static boolean a(com.pandora.android.ads.c c1, boolean flag)
    {
        c1.u = flag;
        return flag;
    }

    private boolean a(com.pandora.radio.data.a a1, com.pandora.android.ads.a a2, String s1)
    {
        if (a1 == null)
        {
            return false;
        }
        if (!f())
        {
            i("Just retrieved new banner ad data while screen was not on!");
        }
        if (a1.ah() == com.pandora.radio.data.a.a.a && com.pandora.android.util.s.a(a1.L()))
        {
            i("Empty banner ad data retrieved. There's no ad HTML.");
            a2.a(s1, false, v);
        } else
        {
            a(a2, com.pandora.android.ads.h.b.b, a1, s1, false);
        }
        return true;
    }

    private boolean a(aa aa1)
    {
        return aa1.l() == ac.b;
    }

    private boolean a(String s1, com.pandora.android.ads.a a1, boolean flag)
    {
        if (!z())
        {
            d(s1, "not rotating ads because the AdView says so");
        } else
        if (!a.c().i())
        {
            if (com.pandora.android.ads.VideoAdManager.c.a().l())
            {
                d(s1, "not rotating ads because we are showing a video ad");
                return false;
            }
            if (!flag && !a1.b())
            {
                d(s1, "not rotating ads because  it was too soon since the last refresh");
                return false;
            }
            if (!a.a(a1.c))
            {
                d(s1, "not rotating ads because this listener is not ad supported");
                return false;
            }
            if (!v())
            {
                d(s1, "not rotating ads because the activity is not visible");
                return false;
            }
            if (!f())
            {
                d(s1, "not rotating ads because the display is off");
                return false;
            }
            if (g())
            {
                d(s1, "not rotating ads because the keyguard is in restricted input mode");
                return false;
            }
            if (!e())
            {
                d(s1, "not rotating ads because current track does not support banner ads");
                return false;
            } else
            {
                return true;
            }
        }
        return false;
    }

    static c b(com.pandora.android.ads.c c1)
    {
        return c1.q;
    }

    public static com.pandora.android.ads.g b()
    {
        return com.pandora.android.ads.b.a();
    }

    private String b(String s1, String s2)
    {
        String s3;
        int j1;
        s3 = (new StringBuilder()).append(s2).append("=1;").toString();
        if (s1.contains(s3))
        {
            return s1;
        }
        String s4 = (new StringBuilder()).append(s2).append("=").toString();
        if (s1.contains((new StringBuilder()).append(";").append(s4).toString()))
        {
            s3 = (new StringBuilder()).append(s2).append("=1").toString();
            s2 = s1.split(";");
            for (int i1 = 0; i1 < s2.length; i1++)
            {
                if (s2[i1].contains(s4))
                {
                    return s1.replace(s2[i1], s3);
                }
            }

        }
        s1 = new StringBuffer(s1);
        j1 = s1.indexOf("u=l");
        if (j1 == -1) goto _L2; else goto _L1
_L1:
        s1.insert(j1, s3);
        s1.insert(s1.indexOf(";", j1 + s3.length()), (new StringBuilder()).append("!").append(s3.replace(";", "").replace("=", "*")).toString());
_L4:
        return s1.toString();
_L2:
        int k1 = s1.indexOf(";");
        if (k1 != -1 && s1.length() > k1 + 1)
        {
            s1.insert(k1 + 1, s3);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(com.pandora.android.ads.c c1, String s1)
    {
        c1.g(s1);
    }

    private static void b(String s1, String s2, Exception exception)
    {
        p.df.a.b("AdManager", c(s1, s2), exception);
    }

    static boolean b(com.pandora.android.ads.c c1, boolean flag)
    {
        c1.f = flag;
        return flag;
    }

    private static String c(String s1, String s2)
    {
        return String.format("ADMANAGER [interaction=%s] - %s", new Object[] {
            s1, s2
        });
    }

    public static void c()
    {
        b();
    }

    static boolean c(com.pandora.android.ads.c c1)
    {
        return c1.F;
    }

    static int d(com.pandora.android.ads.c c1)
    {
        return c1.v;
    }

    static void d(String s1)
    {
        i(s1);
    }

    private static void d(String s1, String s2)
    {
        b(s1, s2, ((Exception) (null)));
    }

    public static String e(int i1)
    {
        if (i1 == 1)
        {
            return "backstage_load";
        }
        if (i1 == 5)
        {
            return "audio_ads_zone_load";
        } else
        {
            return "genre_category_load";
        }
    }

    static boolean e(com.pandora.android.ads.c c1)
    {
        return c1.u;
    }

    static boolean e(String s1)
    {
        return f(s1);
    }

    private com.pandora.android.ads.a f(int i1)
    {
        com.pandora.android.ads.a aa1[] = i;
        int k1 = aa1.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            com.pandora.android.ads.a a1 = aa1[j1];
            if (a1 != null && a1.d == i1)
            {
                return a1;
            }
        }

        return null;
    }

    static d f(com.pandora.android.ads.c c1)
    {
        return c1.s;
    }

    private static boolean f(String s1)
    {
        return "dartCreative.jsp".equals(Uri.parse(s1).getLastPathSegment());
    }

    static aa g(com.pandora.android.ads.c c1)
    {
        return c1.g;
    }

    private void g(String s1)
    {
        if (com.pandora.radio.util.i.a(s1))
        {
            return;
        }
        try
        {
            Object obj = com.pandora.android.ads.d.a(s1);
            if (!com.pandora.android.util.s.a(((String) (obj))))
            {
                obj = (new com.pandora.radio.data.a.b(((String) (obj)), 50, com.pandora.radio.data.a.a.a)).a(true).a();
                x.a(new p.dd.s(((com.pandora.radio.data.a) (obj))));
                return;
            }
        }
        catch (Exception exception)
        {
            p.df.a.c("AdManager", (new StringBuilder()).append("error downloading follow on ad html ").append(s1).toString());
            return;
        }
        p.df.a.c("AdManager", (new StringBuilder()).append("error downloading follow on ad html ").append(s1).toString());
        return;
    }

    static af h(com.pandora.android.ads.c c1)
    {
        return c1.z;
    }

    private boolean h(String s1)
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 == null)
        {
            return false;
        } else
        {
            return a(s1, a1, false);
        }
    }

    static p.cw.c i(com.pandora.android.ads.c c1)
    {
        return c1.x;
    }

    private static void i(String s1)
    {
        p.df.a.c("AdManager", String.format("ADMANAGER %s", new Object[] {
            s1
        }));
    }

    static void j(com.pandora.android.ads.c c1)
    {
        c1.s();
    }

    public static void k()
    {
        com.pandora.android.ads.c c1 = (com.pandora.android.ads.c)com.pandora.android.ads.b.b();
        if (c1 != null)
        {
            c1.l();
        }
        com.pandora.android.ads.b.a(null);
    }

    static void k(com.pandora.android.ads.c c1)
    {
        c1.r();
    }

    static long l(com.pandora.android.ads.c c1)
    {
        return c1.B;
    }

    static int m(com.pandora.android.ads.c c1)
    {
        return c1.w;
    }

    static com.pandora.android.ads.a n(com.pandora.android.ads.c c1)
    {
        return c1.j;
    }

    static com.pandora.android.ads.t[] p()
    {
        return e;
    }

    static com.pandora.radio.data.a q()
    {
        return H;
    }

    private void r()
    {
        a(((com.pandora.radio.util.k.a) (null)));
    }

    private void s()
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 != null)
        {
            a1.a();
        }
    }

    private void t()
    {
        com.pandora.android.ads.a a1 = null;
        a(((com.pandora.radio.util.k.a) (null)));
        if (h() != null)
        {
            a1 = u();
        }
        if (a1 != null)
        {
            a(a1, "post_audio_ad", true);
            return;
        } else
        {
            a(-1, "post_audio_ad", false);
            return;
        }
    }

    private com.pandora.android.ads.a u()
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 == null || !a1.b.k()) goto _L2; else goto _L1
_L1:
        return a1;
_L2:
        com.pandora.android.ads.a a2;
        a2 = k;
        if (a2 == null || f(a2.d) == null)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = a2;
        if (a2.b.k()) goto _L1; else goto _L3
_L3:
        com.pandora.android.ads.a aa1[] = i;
        int j1 = aa1.length;
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= j1)
                {
                    break label1;
                }
                com.pandora.android.ads.a a3 = aa1[i1];
                a1 = a3;
                if (a3 != null)
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L1; else goto _L4
_L4:
        return null;
    }

    private boolean v()
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 != null)
        {
            return a1.b.j();
        } else
        {
            return false;
        }
    }

    private void w()
    {
        com.pandora.android.ads.a a1;
        for (a1 = j; a1 == null || a1.c == -1 || !e[j.c].b;)
        {
            return;
        }

        a(a1, com.pandora.android.ads.h.b.a, ((com.pandora.radio.data.a) (null)), "WhyAds", false);
    }

    private void x()
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 != null)
        {
            a1.b.i();
        }
    }

    private void y()
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 != null)
        {
            a(a1, h.b.c, ((com.pandora.radio.data.a) (null)), "MiniBanner ", false);
        }
    }

    private boolean z()
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 != null)
        {
            return a1.b.k();
        } else
        {
            i("canShowAds=false because there's no active registered actvity");
            return false;
        }
    }

    public int a()
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 != null)
        {
            return a1.c;
        } else
        {
            return -1;
        }
    }

    public int a(Activity activity, h h1, int i1)
    {
        if (activity == null)
        {
            throw new IllegalArgumentException("registerActivity with null activity");
        }
        if (i1 < 0 || i1 >= 6)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("registerActivity invalid zone: ").append(i1).toString());
        }
        com.pandora.android.ads.a a1 = i[i1];
        if (a1 != null && activity == a1.a && h1 == a1.b && i1 == a1.c)
        {
            return a1.d;
        }
        if (k != null)
        {
            k = null;
        }
        n = n + 1;
        i[i1] = new com.pandora.android.ads.a(this, activity, h1, i1, n);
        return n;
    }

    public void a(int i1)
    {
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        com.pandora.android.ads.a a1 = f(i1);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        j = a1;
        k = null;
        j.b.h();
        w = aj.a(K);
        if (r && j.b.k())
        {
            a(i1, "app_start", true);
            r = false;
        }
        a(a1);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        i((new StringBuilder()).append("setActive - id '").append(i1).append("' not found").toString());
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(int i1, String s1, boolean flag)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("requestAdRotate, id =").append(i1).append(", force: ").append(flag);
        Object obj;
        if (u)
        {
            obj = " interaction=station";
        } else
        {
            obj = "";
        }
        d(s1, stringbuilder.append(((String) (obj))).toString());
        if (i1 == -1)
        {
            obj = j;
        } else
        {
            obj = f(i1);
        }
        if (obj != null)
        {
            com.pandora.android.ads.a a1 = j;
            if (a1 != null && a1.d == ((com.pandora.android.ads.a) (obj)).d)
            {
                a(((com.pandora.android.ads.a) (obj)), s1, flag);
                return;
            } else
            {
                d(s1, (new StringBuilder()).append("not rotating ads because the AdActivityInfo for id is not the active AdActivity: ").append(i1).toString());
                return;
            }
        } else
        {
            d(s1, (new StringBuilder()).append("not rotating ads because the AdActivityInfo could not be found for id: ").append(i1).toString());
            return;
        }
    }

    public void a(long l1, h.b b1)
    {
        com.pandora.android.ads.a a1 = j;
        if (a1 != null)
        {
            a1.a(l1);
            com.pandora.android.provider.b.a.b().o().a(b1.name(), (int)l1 / 1000, a1.b.getAdId());
        }
    }

    protected void a(h h1, String s1, String s2, com.pandora.radio.util.a.a a1)
    {
        D.post(new com.pandora.android.ads.i(h1, s1, this, s2, a1));
        h1 = ((h) (m));
        h1;
        JVM INSTR monitorenter ;
        p.df.a.a("AdManager", "FetchAdTask: waiting for Google SDK request ad");
        m.wait();
_L1:
        p.df.a.a("AdManager", "FetchAdTask: done waiting for Google SDK request ad");
        return;
        s1;
        p.df.a.a("AdManager", "FetchAdTask interrupted!");
          goto _L1
        s1;
        h1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void a(com.pandora.radio.data.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (!a1.X() || t == null || t.X())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        t = a1;
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void a(com.pandora.radio.data.a a1, String s1)
    {
        p.df.a.a("AdManager", " onGoogleAdData");
        if (a1 != null)
        {
            com.pandora.android.ads.a a2 = j;
            if (a2 != null)
            {
                a(a1, a2, s1);
            } else
            {
                p.df.a.b("AdManager", c(s1, "AdManager.onGoogleAdData() -- no AdActivityInfo, dropping ad!!!"));
            }
        }
        if (q != null)
        {
            synchronized (m)
            {
                m.notify();
            }
        }
        return;
        s1;
        a1;
        JVM INSTR monitorexit ;
        throw s1;
    }

    void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        if (q != null)
        {
            d(s1, "cancelFetchAd");
            if (j != null && j.b != null)
            {
                j.b.e();
            }
            q.b();
            q = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void a(String s1, String s2, String s3)
    {
        s = new d(s1, s2, s3);
    }

    public void a(bh bh1)
    {
        if (p.dd.bh.a.b.equals(bh1.a))
        {
            if (z == null)
            {
                i("No user data, ignoring event");
                return;
            }
            bh1 = bh1.b;
            if (bh1.M())
            {
                a(((com.pandora.radio.util.k.a) (null)));
            }
            boolean flag;
            if (g != null && !g.m() && bh1.m())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            g = bh1;
            if (g != null)
            {
                if (!a(g) && flag)
                {
                    t();
                }
                if (g.m())
                {
                    a(g, y);
                    return;
                }
            }
        }
    }

    public void b(int i1)
    {
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        com.pandora.android.ads.a a1 = f(i1);
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        a(a1);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(int i1, String s1, boolean flag)
    {
        com.pandora.android.ads.a a1 = f(i1);
        if (a1 != null)
        {
            a1.a(s1, flag, v);
        }
    }

    public boolean b(String s1)
    {
        if (com.pandora.android.ads.VideoAdManager.c.a().l())
        {
            d(s1, "not playing video ad because we are already showing a video ad");
            return false;
        }
        if (!a.f())
        {
            d(s1, "not playing video ad because this listener is not ad supported");
            return false;
        }
        if (!v())
        {
            d(s1, "not playing video ad because the activity is not visible");
            return false;
        }
        if (!f())
        {
            d(s1, "not playing video ad because the display is off");
            return false;
        }
        if (g())
        {
            d(s1, "not playing video ad because the keyguard is in restricted input mode");
            return false;
        }
        if (!e())
        {
            d(s1, "not playing video ad because current track does not support ads");
            return false;
        } else
        {
            return true;
        }
    }

    public void c(int i1)
    {
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        if (j != null)
        {
            if (j.d != i1)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            k = j;
            aj.b(K);
            j = null;
        }
_L2:
        return;
        i((new StringBuilder()).append("setInactive - id '").append(i1).append("' not found").toString());
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c(String s1)
    {
        E = s1;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    public void d()
    {
    }

    public void d(int i1)
    {
        com.pandora.android.ads.a a1 = f(i1);
        if (a1 != null)
        {
            a(a1, ((com.pandora.radio.util.k.a) (null)));
            int j1 = a();
            if (j1 == -1 || j1 == a1.c)
            {
                a("unregister");
            }
            if (a1 == j)
            {
                c(i1);
            }
            if (a1 == k)
            {
                k = null;
            }
            i[a1.c] = null;
        }
    }

    public boolean e()
    {
        if (g == null)
        {
            return true;
        } else
        {
            return g.m();
        }
    }

    public boolean f()
    {
        return f;
    }

    protected boolean g()
    {
        return h.inKeyguardRestrictedInputMode();
    }

    public com.pandora.radio.data.a h()
    {
        return t;
    }

    public boolean i()
    {
        return h() != null;
    }

    public String j()
    {
        return E;
    }

    public void l()
    {
        x.c(this);
        a.e().b(this);
        p.shutdownNow();
    }

    public boolean m()
    {
        return y != null && y.A();
    }

    public boolean n()
    {
        if (z == null || !A)
        {
            i("Interstitial ad cannot be shown: no logged in user");
            return false;
        }
        if (!PandoraService.d())
        {
            Object obj = new GregorianCalendar();
            ((Calendar) (obj)).set(11, 4);
            ((Calendar) (obj)).set(12, 0);
            ((Calendar) (obj)).set(13, 0);
            ((Calendar) (obj)).set(14, 0);
            if (System.currentTimeMillis() < ((Calendar) (obj)).getTimeInMillis())
            {
                ((Calendar) (obj)).roll(5, -1);
            }
            long l1 = ((Calendar) (obj)).getTimeInMillis();
            ((Calendar) (obj)).roll(5, -1);
            long l2 = ((Calendar) (obj)).getTimeInMillis();
            obj = x.j();
            long l3 = Math.max(((o) (obj)).m(), ((o) (obj)).o());
            if (l3 > l1 || l3 > l2 && System.currentTimeMillis() < l1)
            {
                i("Interstitial ad cannot be shown: it was already shown 'today'");
                return false;
            }
        }
        if (i())
        {
            i("Interstitial ad cannot be shown: followon ad pending");
            return false;
        }
        if (com.pandora.android.ads.VideoAdManager.c.a().l())
        {
            i("Interstitial ad cannot be shown: video ad playing");
            return false;
        }
        if (!e())
        {
            i("Interstitial ad cannot be shown: track data doesn't support banner ads");
            return false;
        }
        if (!a.n())
        {
            i("Interstitial ad cannot be shown: visual ads disabled");
            return false;
        }
        if (!z.a())
        {
            i("Interstitial ad cannot be shown: user is not ad supported");
            return false;
        }
        if (y != null && y.A())
        {
            i("Interstitial ad cannot be shown: station is advertiser station");
            return false;
        }
        if (x.j().g())
        {
            i("Interstitial ad cannot be shown: first app launch after install or version update");
            return false;
        }
        if (com.pandora.android.util.s.u())
        {
            i("Interstitial ad cannot be shown: this device is a tablet");
            return false;
        } else
        {
            i("Interstitial ad can be shown");
            return true;
        }
    }

    public Map o()
    {
        return G;
    }

    public void onBannerAdRefreshIntervalChange(f f1)
    {
        v = f1.a;
    }

    public void onCastingState(p.dd.k k1)
    {
        if (!k1.a)
        {
            a(-1, "casting_off", false);
        }
    }

    public void onCoachmarkVisibility(g g1)
    {
        boolean flag;
        if (g1.a == p.bz.g.a.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        F = flag;
        if (F)
        {
            if (j != null && j.e != null && !j.e.U())
            {
                a(((com.pandora.radio.util.k.a) (null)));
            }
            i("coachmark showing, cancelling any in-progress ad fetch");
            a("coachmarkShown");
        }
    }

    public void onCreateStationTaskCompleted(m m1)
    {
        g = null;
        String s1 = m1.d;
        boolean flag;
        if (s1 != null && s1.startsWith("G"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (m1.b && !m1.a.k() && !flag)
        {
            (new AsyncTask(m1.e) {

                final String a;
                final com.pandora.android.ads.c b;

                public transient Void a(Object aobj[])
                {
                    com.pandora.android.ads.c.b(b, a);
                    return null;
                }

                public Object doInBackground(Object aobj[])
                {
                    return a(aobj);
                }

            
            {
                b = com.pandora.android.ads.c.this;
                a = s1;
                super();
            }
            }).execute(new Object[0]);
        }
    }

    public void onDeleteStationSuccess(p p1)
    {
        if (y == null || y.c().equals(p1.a))
        {
            g = null;
        }
    }

    public void onFollowOnBannerChange(p.dd.s s1)
    {
        s1 = s1.a;
        a(s1);
        if (s1 != null && s1.Y())
        {
            a(-1, "start_value_exchange", true);
        }
    }

    public void onHeadsetStateChange(p.bz.j j1)
    {
        B = System.currentTimeMillis() + 2000L;
    }

    public void onSignInState(an an1)
    {
        z = an1.a;
        boolean flag;
        if (an1.b == p.cx.e.a.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        A = flag;
        switch (_cls6.d[an1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onSignInState called with unknown signInState: ").append(an1.b).toString());

        case 4: // '\004'
            g = null;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onStartValueExchangeSuccess(p.bz.s s1)
    {
        a(com.pandora.radio.util.k.a.l, true);
    }

    public void onStationData(at at1)
    {
        y = at1.a;
    }

    public void onStationStateChange(ay ay1)
    {
        switch (com.pandora.android.ads._cls6.b[ay1.b.ordinal()])
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());

        case 4: // '\004'
            a("station_change");
            if (h() != null && !h().X())
            {
                a(((com.pandora.radio.data.a) (null)));
            }
            u = true;
            a(((com.pandora.radio.util.k.a) (null)));
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return;
        }
    }

    public void onThirdPartyTrackingUrls(ba ba1)
    {
        G = ba1.a;
    }

    public void onTrackState(bh bh1)
    {
        aa aa1;
        boolean flag;
        flag = true;
        aa1 = g;
        _cls6.c[bh1.a.ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 83
    //                   2 134
    //                   3 158
    //                   4 164
    //                   5 164;
           goto _L1 _L2 _L3 _L4 _L5 _L5
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("onTrackState: unknown event type ").append(bh1.a).toString());
_L2:
        a(bh1);
        if (g == null || !g.M()) goto _L7; else goto _L6
_L6:
        w();
        int i1 = a();
        if (i1 == 1 || i1 == 5)
        {
            y();
        }
_L9:
        return;
_L7:
        x();
        return;
_L3:
        if (aa1 == null || !aa1.M())
        {
            flag = false;
        }
        a(flag);
        return;
_L4:
        g = null;
        return;
_L5:
        if (bh1.b.M())
        {
            w();
            return;
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void onUserStateChange(bo bo1)
    {
        z = bo1.a;
    }

    public void onValueExchangeRewardEvent(bq bq1)
    {
        C = bq1.a();
    }

    public void onVideoComplete(p.bz.aa aa1)
    {
        o = Integer.valueOf(0);
    }

    static 
    {
        e = (new com.pandora.android.ads.t[] {
            b, b, b, c, c, d
        });
        H = (new com.pandora.radio.data.a.b(null, 0, com.pandora.radio.data.a.a.a)).a();
    }
}
