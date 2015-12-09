// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.telephony.TelephonyManager;
import com.pandora.radio.data.af;
import com.pandora.radio.data.aj;
import com.pandora.radio.data.b;
import com.pandora.radio.data.f;
import com.pandora.radio.data.o;
import com.pandora.radio.data.q;
import com.pandora.radio.data.y;
import com.pandora.radio.data.z;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.NameValuePair;
import org.apache.http.conn.util.InetAddressUtils;
import p.cw.c;
import p.cx.ab;
import p.cx.t;
import p.dd.ae;
import p.dd.ag;
import p.dd.an;
import p.dd.bh;
import p.dd.d;
import p.df.a;

// Referenced classes of package com.pandora.radio.util:
//            f, l, NetworkUtil, i, 
//            a

public class com.pandora.radio.util.k
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        private static final a m[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/radio/util/k$a, s);
        }

        public static a[] values()
        {
            return (a[])m.clone();
        }

        static 
        {
            a = new a("close_ad_tapped", 0);
            b = new a("close_ad_api_called", 1);
            c = new a("why_ads_tapped", 2);
            d = new a("why_ads_api_called", 3);
            e = new a("close_ad_swipe", 4);
            f = new a("close_ad_scroll", 5);
            g = new a("landing_page_open", 6);
            h = new a("landing_page_done", 7);
            i = new a("landing_page_app_resign", 8);
            j = new a("landing_page_app_active", 9);
            k = new a("web_view_error", 10);
            l = new a("value_exchange_started", 11);
            m = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/pandora/radio/util/k$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("unknown_quality_audio", 0);
            b = new b("default_quality_audio", 1);
            c = new b("high_quality_audio", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static final c c[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/pandora/radio/util/k$c, s);
        }

        public static c[] values()
        {
            return (c[])c.clone();
        }

        static 
        {
            a = new c("manual", 0);
            b = new c("app_update", 1);
            c = (new c[] {
                a, b
            });
        }

        private c(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        public static final d f;
        private static final d g[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/pandora/radio/util/k$d, s);
        }

        public static d[] values()
        {
            return (d[])g.clone();
        }

        static 
        {
            a = new d("resume", 0);
            b = new d("pause", 1);
            c = new d("skip", 2);
            d = new d("thumb_up", 3);
            e = new d("thumb_down", 4);
            f = new d("foreground_app", 5);
            g = (new d[] {
                a, b, c, d, e, f
            });
        }

        private d(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        public static final e c;
        private static final e d[];

        public static e valueOf(String s)
        {
            return (e)Enum.valueOf(com/pandora/radio/util/k$e, s);
        }

        public static e[] values()
        {
            return (e[])d.clone();
        }

        static 
        {
            a = new e("appwidget", 0);
            b = new e("notification", 1);
            c = new e("external", 2);
            d = (new e[] {
                a, b, c
            });
        }

        private e(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static class f
    {

        protected int a;
        protected List b;
        private Object c;

        public Future a(a a1)
        {
            return ab.a().a(new Runnable(this, a1) {

                final f.a a;
                final f b;

                public void run()
                {
                    b.b(a);
                }

            
            {
                b = f1;
                a = a1;
                super();
            }
            });
        }

        public void a(int i1)
        {
            a = i1;
        }

        public boolean a(m m1)
        {
            boolean flag;
            synchronized (c)
            {
                flag = b.add(m1);
            }
            return flag;
            m1;
            obj;
            JVM INSTR monitorexit ;
            throw m1;
        }

        protected void b(a a1)
        {
            List list;
            int i1;
            synchronized (c)
            {
                list = b;
                b = Collections.synchronizedList(new ArrayList());
            }
            obj = new ArrayList(Math.min(a, b.size()));
            i1 = 0;
_L5:
            if (list.isEmpty()) goto _L2; else goto _L1
_L1:
            int j1 = 0;
_L3:
            if (j1 >= a || list.isEmpty())
            {
                a1.a(((List) (obj)), i1);
                i1++;
                ((List) (obj)).clear();
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_114;
            a1;
            obj;
            JVM INSTR monitorexit ;
            throw a1;
            ((List) (obj)).add(list.remove(0));
            j1++;
            if (true) goto _L3; else goto _L2
_L2:
            return;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public f()
        {
            a = 300;
            b = Collections.synchronizedList(new ArrayList());
            c = new Object();
        }
    }

    public static interface f.a
    {

        public abstract void a(List list, int i1);
    }

    public static final class g extends Enum
    {

        public static final g a;
        public static final g b;
        public static final g c;
        public static final g d;
        private static final g e[];

        public static g valueOf(String s)
        {
            return (g)Enum.valueOf(com/pandora/radio/util/k$g, s);
        }

        public static g[] values()
        {
            return (g[])e.clone();
        }

        static 
        {
            a = new g("start", 0);
            b = new g("stop", 1);
            c = new g("available", 2);
            d = new g("volume", 3);
            e = (new g[] {
                a, b, c, d
            });
        }

        private g(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class h extends Enum
    {

        public static final h a;
        public static final h b;
        public static final h c;
        public static final h d;
        public static final h e;
        public static final h f;
        private static final h g[];

        public static h valueOf(String s)
        {
            return (h)Enum.valueOf(com/pandora/radio/util/k$h, s);
        }

        public static h[] values()
        {
            return (h[])g.clone();
        }

        static 
        {
            a = new h("impression", 0);
            b = new h("initiation", 1);
            c = new h("conversion_success", 2);
            d = new h("conversion_failure", 3);
            e = new h("privacy_policy_viewed", 4);
            f = new h("learn_more_pressed", 5);
            g = (new h[] {
                a, b, c, d, e, f
            });
        }

        private h(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class i extends Enum
    {

        public static final i a;
        public static final i b;
        public static final i c;
        public static final i d;
        private static final i e[];

        public static i valueOf(String s)
        {
            return (i)Enum.valueOf(com/pandora/radio/util/k$i, s);
        }

        public static i[] values()
        {
            return (i[])e.clone();
        }

        static 
        {
            a = new i("promo_shown", 0);
            b = new i("rec_shown", 1);
            c = new i("promo_response_timing", 2);
            d = new i("rec_added", 3);
            e = (new i[] {
                a, b, c, d
            });
        }

        private i(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class j extends Enum
    {

        public static final j a;
        public static final j b;
        public static final j c;
        public static final j d;
        private static final j e[];

        public static j valueOf(String s)
        {
            return (j)Enum.valueOf(com/pandora/radio/util/k$j, s);
        }

        public static j[] values()
        {
            return (j[])e.clone();
        }

        static 
        {
            a = new j("recommendation_screen", 0);
            b = new j("station_list", 1);
            c = new j("station_list_top", 2);
            d = new j("station_creation", 3);
            e = (new j[] {
                a, b, c, d
            });
        }

        private j(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class k extends Enum
    {

        public static final k a;
        public static final k b;
        public static final k c;
        public static final k d;
        public static final k e;
        public static final k f;
        public static final k g;
        public static final k h;
        public static final k i;
        public static final k j;
        public static final k k;
        public static final k l;
        public static final k m;
        public static final k n;
        public static final k o;
        private static final k p[];

        public static k valueOf(String s)
        {
            return (k)Enum.valueOf(com/pandora/radio/util/k$k, s);
        }

        public static k[] values()
        {
            return (k[])p.clone();
        }

        static 
        {
            a = new k("app_install", 0);
            b = new k("initial_app_load", 1);
            c = new k("login_screen_shown", 2);
            d = new k("login_button_tapped", 3);
            e = new k("login_failed", 4);
            f = new k("login_succeeded", 5);
            g = new k("forget_password_tapped", 6);
            h = new k("go_back_button_tapped_from_forgot_password", 7);
            i = new k("registration_screen_shown", 8);
            j = new k("register_button_tapped", 9);
            k = new k("registration_failed", 10);
            l = new k("go_back_button_tapped_from_registration", 11);
            m = new k("registration_succeeded", 12);
            n = new k("welcome_screen_dismissed", 13);
            o = new k("initial_station_created", 14);
            p = (new k[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o
            });
        }

        private k(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class l extends Enum
    {

        public static final l a;
        public static final l b;
        private static final l c[];

        public static l valueOf(String s)
        {
            return (l)Enum.valueOf(com/pandora/radio/util/k$l, s);
        }

        public static l[] values()
        {
            return (l[])c.clone();
        }

        static 
        {
            a = new l("copy_url", 0);
            b = new l("open_in_external_browser", 1);
            c = (new l[] {
                a, b
            });
        }

        private l(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static class m
    {

        public final String a;
        public final List b;

        public List a(int i1)
        {
            ArrayList arraylist = new ArrayList(b.size());
            arraylist.add(new com.pandora.radio.util.f((new StringBuilder()).append("type").append(i1).toString(), a));
            Iterator iterator = b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.pandora.radio.util.f f1 = (com.pandora.radio.util.f)iterator.next();
                String s = f1.getValue();
                if (s != null && s.length() > 0)
                {
                    arraylist.add(new com.pandora.radio.util.f((new StringBuilder()).append("type").append(i1).append(".").append(f1.getName()).toString(), s));
                }
            } while (true);
            return arraylist;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("eventType \"").append(a).append("\"").append(" : ").append(b.toString());
            return stringbuilder.toString();
        }

        public transient m(String s, com.pandora.radio.util.f af1[])
        {
            af1 = new ArrayList(Arrays.asList(af1));
            af1.removeAll(Collections.singleton(null));
            af1.add(new com.pandora.radio.util.f("client_timestamp", com.pandora.radio.util.k.a(System.currentTimeMillis())));
            a = s;
            b = af1;
        }
    }

    public static final class n extends Enum
    {

        public static final n a;
        public static final n b;
        public static final n c;
        public static final n d;
        public static final n e;
        public static final n f;
        public static final n g;
        public static final n h;
        public static final n i;
        private static final n j[];

        public static n valueOf(String s)
        {
            return (n)Enum.valueOf(com/pandora/radio/util/k$n, s);
        }

        public static n[] values()
        {
            return (n[])j.clone();
        }

        static 
        {
            a = new n("skipped", 0);
            b = new n("thumbed_down", 1);
            c = new n("station_changed", 2);
            d = new n("completed", 3);
            e = new n("discarded", 4);
            f = new n("error", 5);
            g = new n("expired", 6);
            h = new n("test_ad", 7);
            i = new n("premature_end_of_play", 8);
            j = (new n[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private n(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class o extends Enum
    {

        public static final o a;
        public static final o b;
        public static final o c;
        public static final o d;
        private static final o e[];

        public static o valueOf(String s)
        {
            return (o)Enum.valueOf(com/pandora/radio/util/k$o, s);
        }

        public static o[] values()
        {
            return (o[])e.clone();
        }

        static 
        {
            a = new o("value_exchange_end", 0);
            b = new o("vx_lead_in_audio_played", 1);
            c = new o("vx_status_bar_shown", 2);
            d = new o("vx_status_bar_cta_clicked", 3);
            e = (new o[] {
                a, b, c, d
            });
        }

        private o(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class p extends Enum
    {

        public static final p a;
        public static final p b;
        public static final p c;
        public static final p d;
        public static final p e;
        public static final p f;
        public static final p g;
        public static final p h;
        public static final p i;
        public static final p j;
        public static final p k;
        public static final p l;
        public static final p m;
        public static final p n;
        public static final p o;
        public static final p p;
        public static final p q;
        public static final p r;
        public static final p s;
        public static final p t;
        public static final p u;
        public static final p v;
        public static final p w;
        public static final p x;
        public static final p y;
        private static final p z[];

        public static p valueOf(String s1)
        {
            return (p)Enum.valueOf(com/pandora/radio/util/k$p, s1);
        }

        public static p[] values()
        {
            return (p[])z.clone();
        }

        static 
        {
            a = new p("initiate", 0);
            b = new p("start", 1);
            c = new p("first_quartile", 2);
            d = new p("second_quartile", 3);
            e = new p("third_quartile", 4);
            f = new p("more_info", 5);
            g = new p("complete", 6);
            h = new p("resume", 7);
            i = new p("error", 8);
            j = new p("skip", 9);
            k = new p("pause", 10);
            l = new p("unpause", 11);
            m = new p("background", 12);
            n = new p("screen_locked", 13);
            o = new p("mute", 14);
            p = new p("unmute", 15);
            q = new p("banner_render", 16);
            r = new p("banner_render_dark", 17);
            s = new p("banner_display_after_dark", 18);
            t = new p("skip_prompt_shown", 19);
            u = new p("skip_prompt_resume_touched", 20);
            v = new p("buffer_error", 21);
            w = new p("resume_from_coachmark", 22);
            x = new p("resume_coachmark_displayed", 23);
            y = new p("skip_from_coachmark", 24);
            z = (new p[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y
            });
        }

        private p(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    protected static long a = 0L;
    protected static long b = 0L;
    protected static long c = 0L;
    static final SimpleDateFormat k;
    protected f d;
    protected af e;
    protected q f;
    protected String g;
    protected z h;
    protected p.cw.b.a i;
    protected int j;
    private p.cw.c l;
    private long m;
    private p.cx.e.a n;
    private com.pandora.radio.util.a o;

    public com.pandora.radio.util.k(p.cw.c c1, String s, com.pandora.radio.util.a a1)
    {
        d = new f();
        j = 60;
        m = System.currentTimeMillis();
        l = c1;
        g = (new StringBuilder()).append(s).append("v2").toString();
        o = a1;
        c1.b(this);
    }

    static com.pandora.radio.util.a a(com.pandora.radio.util.k k1)
    {
        return k1.o;
    }

    static String a(long l1)
    {
        return b(l1);
    }

    private void a(a.a a1)
    {
        Object obj;
        long l1;
        long l2;
        l2 = 0L;
        obj = l.s().getPackageName();
        l1 = l2;
        obj = l.s().getPackageManager().getPackageInfo(((String) (obj)), 0);
        l1 = l2;
        l2 = ((PackageInfo) (obj)).firstInstallTime;
        l1 = l2;
        int i1 = ((PackageInfo) (obj)).versionCode;
        l1 = l2;
_L1:
        com.pandora.radio.data.f f1 = l.l();
        Object obj1;
        if (a1 != null)
        {
            obj1 = "ANDROID_AD_ID";
            a1 = a1.a();
        } else
        {
            obj1 = "ANDROID_ID";
            a1 = f1.d();
        }
        a("mobile_fresh_install", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("device_id", f1.e()), new com.pandora.radio.util.f("tracking_id_type", ((String) (obj1))), new com.pandora.radio.util.f("tracking_id", a1), new com.pandora.radio.util.f("ip_address", c()), new com.pandora.radio.util.f("installation_timestamp", b(l1))
        });
        a1 = l.j();
        if (!a1.w() && i1 >= 6200)
        {
            a1.f(true);
        }
        d(true);
        return;
        obj1;
        p.df.a.b("StatsCollectorManager", ((Throwable) (obj1)));
        i1 = 0;
          goto _L1
    }

    static void a(com.pandora.radio.util.k k1, a.a a1)
    {
        k1.a(a1);
    }

    private static String b(long l1)
    {
        if (l1 == 0L)
        {
            return "";
        } else
        {
            k.setTimeZone(TimeZone.getTimeZone("GMT"));
            Date date = new Date(l1);
            return k.format(date);
        }
    }

    private void d(boolean flag)
    {
        Future future;
        long l1 = (System.currentTimeMillis() - m) / 1000L;
        g((new StringBuilder()).append("flush(force: ").append(flag).append(");  ** FLUSHING NOW **  lastFlush : ").append(l1).append("s").toString());
        m = System.currentTimeMillis();
        future = d.a(new f.a() {

            final com.pandora.radio.util.k a;

            public void a(List list, int i1)
            {
                a.b(list);
            }

            
            {
                a = com.pandora.radio.util.k.this;
                super();
            }
        });
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        g("flush(force: true) : blocking for up to 2 sec for flush to complete!");
        future.get(2000L, TimeUnit.MILLISECONDS);
        return;
        Object obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
        return;
        obj;
        ((ExecutionException) (obj)).printStackTrace();
        return;
        obj;
        p.df.a.a("StatsCollectorManager", (new StringBuilder()).append("flush timed out while shutting down.").append(obj).toString());
        return;
    }

    private String f()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.d();
        }
    }

    private String g()
    {
        Object obj;
        NetworkInfo networkinfo;
        ConnectivityManager connectivitymanager = (ConnectivityManager)com.pandora.radio.util.l.a(l.s(), "connectivity");
        obj = (TelephonyManager)com.pandora.radio.util.l.a(l.s(), "phone");
        networkinfo = connectivitymanager.getActiveNetworkInfo();
        if (networkinfo != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((String) (obj));
_L2:
        String s;
        if (!com.pandora.radio.util.NetworkUtil.b(networkinfo.getType()))
        {
            break; /* Loop/switch isn't completed */
        }
        s = com.pandora.radio.util.NetworkUtil.c(((TelephonyManager) (obj)).getNetworkType());
        obj = s;
        if (s != null) goto _L4; else goto _L3
_L3:
        return com.pandora.radio.util.NetworkUtil.a(networkinfo.getType());
    }

    private boolean h()
    {
        if (e == null)
        {
            f("skipping registerTrackLifetimeEvent because we don't have any UserData");
            return false;
        }
        if (!e.h())
        {
            f("skipping registerTrackLifetimeEvent because we're not configured for such events");
            return false;
        } else
        {
            return true;
        }
    }

    private List i()
    {
        return Arrays.asList(new NameValuePair[] {
            new com.pandora.radio.util.f("shared.app_version", l.B()), new com.pandora.radio.util.f("shared.listener_id", f()), new com.pandora.radio.util.f("shared.vendor_id", k()), new com.pandora.radio.util.f("shared.device_model", j()), new com.pandora.radio.util.f("shared.device_code", j()), new com.pandora.radio.util.f("shared.device_os", com.pandora.radio.data.f.j()), new com.pandora.radio.util.f("shared.is_pandora_link", Boolean.toString(l.C()))
        });
    }

    private String j()
    {
        String s;
        String s1;
        try
        {
            s = l.l().c();
        }
        catch (p.cw.e.d d1)
        {
            p.df.a.a("StatsCollectorManager", (new StringBuilder()).append("Caught Exception: ").append(d1.getStackTrace().toString()).toString());
            d1 = null;
        }
        s1 = s;
        if (s == null)
        {
            s1 = "-unknown-";
        }
        return s1;
    }

    private String k()
    {
        if (f == null)
        {
            return "-unknown-";
        } else
        {
            return f.a();
        }
    }

    private void l()
    {
        if (o == null)
        {
            a(((a.a) (null)));
            return;
        } else
        {
            (new AsyncTask() {

                final com.pandora.radio.util.k a;

                protected transient Void a(Void avoid[])
                {
                    com.pandora.radio.util.k.a(a, com.pandora.radio.util.k.a(a).a());
                    return null;
                }

                protected Object doInBackground(Object aobj[])
                {
                    return a((Void[])aobj);
                }

            
            {
                a = com.pandora.radio.util.k.this;
                super();
            }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
    }

    protected List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(i());
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            arraylist.addAll(((m)list.get(i1)).a(i1));
        }

        return arraylist;
    }

    public void a()
    {
        a("event_daydream_upgrade", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("device_id", j())
        });
    }

    public void a(float f1, float f2, float f3, float f4, com.pandora.radio.data.b b1, String s)
    {
        com.pandora.radio.util.f f5 = new com.pandora.radio.util.f("x", f1);
        com.pandora.radio.util.f f6 = new com.pandora.radio.util.f("y", f2);
        com.pandora.radio.util.f f7 = new com.pandora.radio.util.f("ad_width", f3);
        com.pandora.radio.util.f f8 = new com.pandora.radio.util.f("ad_height", f4);
        Object obj;
        if (b1 != null)
        {
            obj = b1.a();
        } else
        {
            obj = "";
        }
        obj = new com.pandora.radio.util.f("creative_id", ((String) (obj)));
        if (b1 != null)
        {
            b1 = b1.b();
        } else
        {
            b1 = "";
        }
        a("ad_touch_position", new com.pandora.radio.util.f[] {
            f5, f6, f7, f8, obj, new com.pandora.radio.util.f("line_id", b1), new com.pandora.radio.util.f("station_id", s)
        });
    }

    public void a(int i1)
    {
        a("mobile_ab_test", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("ab_test_id", i1)
        });
    }

    public void a(int i1, int j1)
    {
        int k1 = i1;
        if (i1 < 0)
        {
            k1 = 60;
        }
        j = k1;
        f f1 = d;
        if (j1 <= 0)
        {
            i1 = 300;
        } else
        {
            i1 = j1;
        }
        f1.a(i1);
        g((new StringBuilder()).append("setConfig --> batchDelaySeconds=").append(j).append(", batchMaxCount=").append(j1).toString());
    }

    public void a(int i1, int j1, String s)
    {
        NetworkUtil networkutil = l.u();
        a("android_video_ad_error", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("error_what", i1), new com.pandora.radio.util.f("error_extra", j1), new com.pandora.radio.util.f("video_asset_path", s), new com.pandora.radio.util.f("wifi_connected", networkutil.c())
        });
    }

    public void a(int i1, String s, int j1)
    {
        a("tab_click_count", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("count", j1), new com.pandora.radio.util.f("name", s), new com.pandora.radio.util.f("tab_index", i1)
        });
    }

    public void a(int i1, String s, String s1)
    {
        a("android_rpc_error", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("error_code", String.valueOf(i1)), new com.pandora.radio.util.f("request", s), new com.pandora.radio.util.f("response", s1)
        });
    }

    public void a(int i1, boolean flag)
    {
        a("ab_exposure", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("experiment_id", i1), new com.pandora.radio.util.f("in_treatment", flag)
        });
    }

    public void a(int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        String s;
        if (i1 == 1)
        {
            s = "station";
        } else
        {
            s = "song";
        }
        a("share", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("source", s), new com.pandora.radio.util.f("email", flag), new com.pandora.radio.util.f("pandora", flag1), new com.pandora.radio.util.f("facebook", flag2), new com.pandora.radio.util.f("twitter", flag3)
        });
    }

    public void a(long l1, long l2, long l3, long l4, long l5, long l6, long l7, 
            boolean flag, boolean flag1, boolean flag2)
    {
        a("view_mode", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("nowplaying_track_classic_view", String.format("%.3f", new Object[] {
                Double.valueOf((double)l1 / 1000D)
            })), new com.pandora.radio.util.f("nowplaying_track_tile_view", String.format("%.3f", new Object[] {
                Double.valueOf((double)l2 / 1000D)
            })), new com.pandora.radio.util.f("history_classic_view", String.format("%.3f", new Object[] {
                Double.valueOf((double)l3 / 1000D)
            })), new com.pandora.radio.util.f("history_tile_view", String.format("%.3f", new Object[] {
                Double.valueOf((double)l4 / 1000D)
            })), new com.pandora.radio.util.f("in_nowplaying_view", Boolean.toString(flag)), new com.pandora.radio.util.f("in_classic_view", Boolean.toString(flag1)), new com.pandora.radio.util.f("portrait_view", String.format("%.3f", new Object[] {
                Double.valueOf((double)l5 / 1000D)
            })), new com.pandora.radio.util.f("landscape_view", String.format("%.3f", new Object[] {
                Double.valueOf((double)l6 / 1000D)
            })), new com.pandora.radio.util.f("third_drawer_view", String.format("%.3f", new Object[] {
                Double.valueOf((double)l7 / 1000D)
            })), new com.pandora.radio.util.f("in_tablet_view", Boolean.toString(flag2))
        });
    }

    public void a(com.pandora.radio.data.b b1)
    {
        a("interstitial_skipped", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("ad_id", b1.b())
        });
    }

    public void a(com.pandora.radio.data.b b1, long l1)
    {
        a("interstitial_auto_dismissed", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("ad_id", b1.b()), new com.pandora.radio.util.f("timeout_secs", l1 / 1000L)
        });
    }

    public void a(com.pandora.radio.data.b b1, long l1, long l2)
    {
        a("interstitial_shown", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("ad_id", b1.b()), new com.pandora.radio.util.f("page_load_time_ms", l1), new com.pandora.radio.util.f("ad_fetch_time_ms", l2)
        });
    }

    public void a(z z1)
    {
        a("time_to_music", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("accessory_id", l.l().m()), new com.pandora.radio.util.f("client_ip", c()), new com.pandora.radio.util.f("milliseconds_to_music", z1.a()), new com.pandora.radio.util.f("action", z1.a.name())
        });
    }

    public void a(a a1, String s, String s1, com.pandora.radio.data.b b1)
    {
        com.pandora.radio.util.f f1 = null;
        if (s1 != null)
        {
            f1 = new com.pandora.radio.util.f("adUnitId", s1);
        }
        a("ad", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("action", a1.name()), new com.pandora.radio.util.f("action_location", s), f1, new com.pandora.radio.util.f("creative_id", b1.a()), new com.pandora.radio.util.f("line_id", b1.b())
        });
    }

    public void a(b b1, c c1)
    {
        a("audio_quality", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("audio_setting", b1.name()), new com.pandora.radio.util.f("change_type", c1.name())
        });
    }

    public void a(d d1, e e1, String s)
    {
        if (l == null || l.l() == null)
        {
            return;
        } else
        {
            a("mobile_background_play_command", new com.pandora.radio.util.f[] {
                new com.pandora.radio.util.f("device_id", l.l().e()), new com.pandora.radio.util.f("accessory_id", l.l().m()), new com.pandora.radio.util.f("bluetooth_device_name", b()), new com.pandora.radio.util.f("command", d1.name()), new com.pandora.radio.util.f("source", e1.name()), new com.pandora.radio.util.f("station_id", s)
            });
            return;
        }
    }

    public void a(g g1, String s, String s1)
    {
        if (s1 != null)
        {
            a("casting", new com.pandora.radio.util.f[] {
                new com.pandora.radio.util.f("casting_state", g1.toString()), new com.pandora.radio.util.f("play_state", s), new com.pandora.radio.util.f("view_mode", s1)
            });
            return;
        } else
        {
            a("casting", new com.pandora.radio.util.f[] {
                new com.pandora.radio.util.f("casting_state", g1.toString()), new com.pandora.radio.util.f("play_state", s)
            });
            return;
        }
    }

    public void a(h h1, com.pandora.radio.data.b b1)
    {
        a("tap_to_register_v2", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("listener_id", f()), new com.pandora.radio.util.f("action", h1.name()), new com.pandora.radio.util.f("creative_id", b1.a()), new com.pandora.radio.util.f("line_id", b1.b())
        });
    }

    public void a(i i1, String s, String s1, String s2)
    {
        a("promoted_stations", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("action", i1.toString()), new com.pandora.radio.util.f("token", s), new com.pandora.radio.util.f("token_type", s1), new com.pandora.radio.util.f("failover_reason", s2)
        });
    }

    public void a(k k1)
    {
        a("mobile_registration", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("device_id", l.l().e()), new com.pandora.radio.util.f("accessory_id", l.l().m()), new com.pandora.radio.util.f("client_ip", c()), new com.pandora.radio.util.f("action", k1.name())
        });
    }

    public void a(n n1, String s, String s1, int i1, int j1)
    {
        if (h())
        {
            a("track_end", new com.pandora.radio.util.f[] {
                new com.pandora.radio.util.f("reason", n1.name()), new com.pandora.radio.util.f("elapsed_seconds", i1), new com.pandora.radio.util.f("remaining_seconds", j1), new com.pandora.radio.util.f("audio_token", s), new com.pandora.radio.util.f("station_id", s1)
            });
        }
    }

    public void a(o o1, aj aj1)
    {
        com.pandora.radio.data.b b1 = new com.pandora.radio.data.b(aj1.a("creativeId"), aj1.a("lineId"));
        y y1 = l.d().t();
        boolean flag;
        if (y1 != null && y1.A())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a("value_exchange", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("action", o1.name()), new com.pandora.radio.util.f("offer_name", aj1.c()), new com.pandora.radio.util.f("line_id", b1.b()), new com.pandora.radio.util.f("creative_id", b1.a()), new com.pandora.radio.util.f("is_advertiser_station", flag), new com.pandora.radio.util.f("correlation_id", aj1.i())
        });
        f(String.format("registerValueExchangeAction action:%s, offerName:%s, creativeId:%s, lineId:%s, isAdvertiserStation:%s", new Object[] {
            o1.name(), aj1.c(), b1.a(), b1.b(), Boolean.valueOf(flag)
        }));
    }

    public void a(p p1, com.pandora.radio.data.b b1, int i1, int j1, boolean flag, String s, boolean flag1, 
            int k1, String s1)
    {
        a("event_tap_to_video", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("event_type", p1.name()), new com.pandora.radio.util.f("line_id", b1.b()), new com.pandora.radio.util.f("creative_id", b1.a()), new com.pandora.radio.util.f("playback_pos", i1), new com.pandora.radio.util.f("duration", j1), new com.pandora.radio.util.f("network", l.u().d()), new com.pandora.radio.util.f("device_id", l.l().e()), new com.pandora.radio.util.f("accessory_id", l.l().m()), new com.pandora.radio.util.f("bluetooth_device_name", b()), new com.pandora.radio.util.f("has_scrubbed", Boolean.toString(flag)), 
            new com.pandora.radio.util.f("station_id", s), new com.pandora.radio.util.f("progress_enforced", flag1), new com.pandora.radio.util.f("enforced_seconds", k1), new com.pandora.radio.util.f("ad_server_correlation_id", s1)
        });
    }

    public void a(p p1, com.pandora.radio.data.b b1, String s, String s1, String s2, int i1, long l1, String s3)
    {
        com.pandora.radio.util.f f1 = null;
        if (!com.pandora.radio.util.i.a(s3))
        {
            f1 = new com.pandora.radio.util.f("info", s3);
        }
        a("event_mobile_video_ad", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("device_id", l.l().e()), new com.pandora.radio.util.f("ad_type", s), new com.pandora.radio.util.f("ad_id", b1.b()), new com.pandora.radio.util.f("ad_product", s1), new com.pandora.radio.util.f("line_id", b1.b()), new com.pandora.radio.util.f("creative_id", b1.a()), new com.pandora.radio.util.f("correlation_id", s2), new com.pandora.radio.util.f("event_type", p1.name()), new com.pandora.radio.util.f("complete_pct", i1), new com.pandora.radio.util.f("load_time", l1), 
            f1, new com.pandora.radio.util.f("network", l.u().d()), new com.pandora.radio.util.f("carrier", l.l().i())
        });
    }

    public void a(String s)
    {
        a("promoted_stations", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("action", "rec_added"), new com.pandora.radio.util.f("token", s), new com.pandora.radio.util.f("token_type", "music"), new com.pandora.radio.util.f("listener_id", f()), new com.pandora.radio.util.f("network_status", g())
        });
    }

    public void a(String s, float f1, boolean flag)
    {
        a("station_personalization", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("entry_point", s), new com.pandora.radio.util.f("time_spent", Float.toString(f1)), new com.pandora.radio.util.f("expand_thumb_history", flag), new com.pandora.radio.util.f("device_id", j())
        });
    }

    public void a(String s, int i1, int j1, boolean flag)
    {
        com.pandora.radio.util.f f1 = null;
        NetworkUtil networkutil = l.u();
        String s1;
        if (!com.pandora.radio.util.i.a(s))
        {
            s = new com.pandora.radio.util.f("error_source", s);
        } else
        {
            s = null;
        }
        s1 = l.l().i();
        if (!com.pandora.radio.util.i.a(s1))
        {
            f1 = new com.pandora.radio.util.f("carrier", s1);
        }
        a("android_audio_error_v2", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("error_what", i1), new com.pandora.radio.util.f("error_extra", j1), new com.pandora.radio.util.f("track_loaded", flag), new com.pandora.radio.util.f("wifi_connected", networkutil.c()), s, f1
        });
    }

    public void a(String s, int i1, com.pandora.radio.data.b b1)
    {
        com.pandora.radio.util.f f1 = new com.pandora.radio.util.f("adtype", s);
        com.pandora.radio.util.f f2 = new com.pandora.radio.util.f("refreshtimehaspassed", i1);
        com.pandora.radio.util.f f3;
        if (b1 != null)
        {
            s = b1.a();
        } else
        {
            s = "";
        }
        f3 = new com.pandora.radio.util.f("creative_id", s);
        if (b1 != null)
        {
            s = b1.b();
        } else
        {
            s = "";
        }
        a("ad_capacity", new com.pandora.radio.util.f[] {
            f1, f2, f3, new com.pandora.radio.util.f("line_id", s)
        });
    }

    public void a(String s, int i1, String s1, boolean flag)
    {
        Object obj = null;
        com.pandora.radio.util.f f1 = obj;
        if (s != null)
        {
            f1 = obj;
            if (s.contains("fired"))
            {
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                f1 = new com.pandora.radio.util.f("is_original_fire", flag);
            }
        }
        a("alarm_clock", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("action", s), new com.pandora.radio.util.f("minutes_since_midnight", i1), new com.pandora.radio.util.f("station_id", s1), f1
        });
    }

    public void a(String s, long l1)
    {
        if (e != null)
        {
            a("sleep_timer", new com.pandora.radio.util.f[] {
                new com.pandora.radio.util.f("action", s), new com.pandora.radio.util.f("amount_of_time", String.format("%.3f", new Object[] {
                    Double.valueOf((double)l1 / 1000D)
                }))
            });
        }
    }

    public void a(String s, j j1, String s1, int i1, boolean flag, boolean flag1, boolean flag2)
    {
        a("user_recommendations", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("recommendation_id", s), new com.pandora.radio.util.f("device_id", l.l().e()), new com.pandora.radio.util.f("music_token", s1), new com.pandora.radio.util.f("placement", j1.name()), new com.pandora.radio.util.f("indx", Integer.toString(i1)), new com.pandora.radio.util.f("seen", Boolean.toString(flag)), new com.pandora.radio.util.f("selected", Boolean.toString(flag1)), new com.pandora.radio.util.f("dismissed", Boolean.toString(flag2))
        });
    }

    public void a(String s, l l1, long l2)
    {
        a("in_app_browser", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("url", s), new com.pandora.radio.util.f("action", l1.name()), new com.pandora.radio.util.f("am_id", Long.toString(l2))
        });
    }

    public void a(String s, l l1, com.pandora.radio.data.b b1)
    {
        a("in_app_browser", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("url", s), new com.pandora.radio.util.f("action", l1.name()), new com.pandora.radio.util.f("dfp_id", b1.b()), new com.pandora.radio.util.f("creative_id", b1.a())
        });
    }

    protected void a(String s, Exception exception)
    {
        p.df.a.c("StatsCollectorManager", (new StringBuilder()).append("stats --> ").append(s).toString(), exception);
    }

    public void a(String s, String s1)
    {
        a(s, new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("station_id", s1)
        });
    }

    public void a(String s, String s1, String s2)
    {
        a("mobile_view_mode", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("page_view", s), new com.pandora.radio.util.f("view_mode", s1), new com.pandora.radio.util.f("orientation", s2), new com.pandora.radio.util.f("device_id", j())
        });
    }

    public void a(String s, String s1, String s2, String s3)
    {
        a("social_autoshare_station_created", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("shared_station_id", s1), new com.pandora.radio.util.f("shared_listener_token", s3), new com.pandora.radio.util.f("station_id", s2), new com.pandora.radio.util.f("accessory_id", l.l().m()), new com.pandora.radio.util.f("social_network_id", s)
        });
    }

    public void a(String s, String s1, boolean flag, String s2)
    {
        a("coachmark", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("coachmark_id", s), new com.pandora.radio.util.f("coachmark_type", s1), new com.pandora.radio.util.f("clicked", flag), new com.pandora.radio.util.f("reason", s2)
        });
    }

    public void a(String s, boolean flag)
    {
        a("event_daydream", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("device_id", j()), new com.pandora.radio.util.f("viewing", s), new com.pandora.radio.util.f("is_subscriber", flag)
        });
    }

    public void a(String s, boolean flag, boolean flag1)
    {
        a("skip_limit", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("at_daily_skip_limit", flag), new com.pandora.radio.util.f("at_station_skip_limit", flag1), new com.pandora.radio.util.f("station_id", s)
        });
    }

    protected transient void a(String s, com.pandora.radio.util.f af1[])
    {
        int i1 = 0;
        if (com.pandora.radio.util.i.a(s))
        {
            g("registerEvent - skipping stats call, eventType is empty!");
            return;
        }
        if (af1 == null || af1.length == 0 || af1.length == 1 && af1[0] == null)
        {
            g("registerEvent - skipping stats call, invalid params!");
            return;
        }
        if (p.df.a.a())
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("registering eventType: ");
            stringbuilder.append(s);
            stringbuilder.append(": ");
            for (int j1 = af1.length; i1 < j1; i1++)
            {
                com.pandora.radio.util.f f1 = af1[i1];
                if (f1 != null)
                {
                    stringbuilder.append(f1.toString());
                    stringbuilder.append("; ");
                }
            }

            g(stringbuilder.toString());
        }
        d.a(new m(s, af1));
    }

    public void a(p.cx.a a1)
    {
        com.pandora.radio.util.f f1 = null;
        com.pandora.radio.util.f f2;
        com.pandora.radio.util.f f3;
        if (e != null)
        {
            f3 = new com.pandora.radio.util.f("birth_year", String.valueOf(e.t()));
            f2 = new com.pandora.radio.util.f("gender", e.u());
            f1 = new com.pandora.radio.util.f("zip", e.m());
        } else
        {
            f2 = null;
            f3 = null;
        }
        a("ando", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("is_error", a1.a()), new com.pandora.radio.util.f("event", a1.c()), new com.pandora.radio.util.f("guid", a1.b()), f3, f2, f1
        });
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            if (a == 0L && b == 0L)
            {
                c = System.currentTimeMillis();
            }
            b = System.currentTimeMillis() - c - a;
            return;
        } else
        {
            a = System.currentTimeMillis() - c - b;
            return;
        }
    }

    public void a(boolean flag, String s, String s1)
    {
        if (h())
        {
            a("track_fetch", new com.pandora.radio.util.f[] {
                new com.pandora.radio.util.f("is_prefetch", flag), new com.pandora.radio.util.f("audio_token", s), new com.pandora.radio.util.f("station_id", s1)
            });
        }
    }

    protected String b()
    {
        p.cy.c c1 = p.cy.b.c();
        if (c1 != null)
        {
            return c1.b();
        } else
        {
            return null;
        }
    }

    public void b(int i1)
    {
        a("promoted_stations", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("action", "promo_added"), new com.pandora.radio.util.f("campaignId", i1), new com.pandora.radio.util.f("listener_id", f())
        });
    }

    public void b(z z1)
    {
        h = z1;
    }

    public void b(String s)
    {
        a("third_drawer", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("view_name", s)
        });
    }

    public void b(String s, long l1)
    {
        a("promoted_stations", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("action", "promo_response_timing"), new com.pandora.radio.util.f("token", s), new com.pandora.radio.util.f("token_type", "station"), new com.pandora.radio.util.f("listener_id", f()), new com.pandora.radio.util.f("timing_ms", l1), new com.pandora.radio.util.f("network_status", g())
        });
    }

    public void b(String s, String s1)
    {
        a("template_impression", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("station_id", s), new com.pandora.radio.util.f("track_id", s1)
        });
    }

    public void b(String s, String s1, String s2, String s3)
    {
        a("android_referrer", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("device_id", l.l().e()), new com.pandora.radio.util.f("scheme", s), new com.pandora.radio.util.f("host", s1), new com.pandora.radio.util.f("package", s2), new com.pandora.radio.util.f("dataUri", s3)
        });
    }

    protected void b(List list)
    {
        try
        {
            l.p().a(g, a(list), p.cx.t.a.a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            a("flush --> handleBatch : ** PING FAILED ** ", list);
        }
    }

    public void b(boolean flag)
    {
        a(flag);
        if (h())
        {
            a("time_in_state", new com.pandora.radio.util.f[] {
                new com.pandora.radio.util.f("in_foreground", Boolean.toString(flag)), new com.pandora.radio.util.f("foreground_listening", String.valueOf((new StringBuilder()).append((double)a / 1000D).append("").toString())), new com.pandora.radio.util.f("background_listening", String.valueOf((new StringBuilder()).append((double)b / 1000D).append("").toString())), new com.pandora.radio.util.f("in_pandoralink", Boolean.toString(l.C()))
            });
        }
    }

    protected String c()
    {
        Iterator iterator = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
_L2:
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_97;
        }
        iterator1 = Collections.list(((NetworkInterface)iterator.next()).getInetAddresses()).iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (InetAddress)iterator1.next();
        if (((InetAddress) (obj)).isLoopbackAddress()) goto _L4; else goto _L3
_L3:
        boolean flag;
        obj = ((InetAddress) (obj)).getHostAddress().toUpperCase(Locale.US);
        flag = InetAddressUtils.isIPv4Address(((String) (obj)));
        if (!flag) goto _L4; else goto _L5
_L5:
        return ((String) (obj));
        Exception exception;
        exception;
        exception.printStackTrace();
        return "";
    }

    protected void c(String s)
    {
        a("mobile_playback_state_change", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("device_id", l.l().e()), new com.pandora.radio.util.f("accessory_id", l.l().m()), new com.pandora.radio.util.f("client_ip", c()), new com.pandora.radio.util.f("station_id", s), new com.pandora.radio.util.f("action", "pause")
        });
    }

    public void c(String s, String s1)
    {
        a("google_ad_load_failed", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("error", s), new com.pandora.radio.util.f("interaction", s1)
        });
    }

    public boolean c(boolean flag)
    {
        boolean flag1;
        boolean flag3;
        flag3 = false;
        flag1 = false;
        if (!d.b.isEmpty()) goto _L2; else goto _L1
_L1:
        flag3 = flag1;
_L4:
        return flag3;
_L2:
        boolean flag2;
label0:
        {
            long l1 = (System.currentTimeMillis() - m) / 1000L;
            flag2 = flag3;
            if (n != p.cx.e.a.b)
            {
                break label0;
            }
            if (l1 < (long)j)
            {
                flag2 = flag3;
                if (!flag)
                {
                    break label0;
                }
            }
            flag2 = true;
        }
        flag3 = flag2;
        if (flag2)
        {
            d(flag);
            return flag2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void d(String s)
    {
        a("mobile_playback_state_change", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("device_id", l.l().e()), new com.pandora.radio.util.f("accessory_id", l.l().m()), new com.pandora.radio.util.f("client_ip", c()), new com.pandora.radio.util.f("station_id", s), new com.pandora.radio.util.f("action", "play")
        });
    }

    public boolean d()
    {
        return c(false);
    }

    public void e()
    {
        l.c(this);
    }

    public void e(String s)
    {
        a("zero_volume_auto_pause", new com.pandora.radio.util.f[] {
            new com.pandora.radio.util.f("action", s)
        });
    }

    protected void f(String s)
    {
        a(s, ((Exception) (null)));
    }

    protected void g(String s)
    {
        p.df.a.a("StatsCollectorManager", (new StringBuilder()).append("stats --> ").append(s).toString());
    }

    public void onPartnerData(ae ae1)
    {
        f = ae1.a;
        if (f != null)
        {
            boolean flag = l.j().D();
            if (flag)
            {
                l();
                l.j().E();
                a(com.pandora.radio.util.k.b);
            }
            l.a(new p.dd.d(flag));
        }
    }

    public void onPlayerStateChange(ag ag1)
    {
        static class _cls3
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.cw.b.a.values().length];
                try
                {
                    b[p.cw.b.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[p.cw.b.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[p.cw.b.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[p.cw.b.a.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    b[p.cw.b.a.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                a = new int[p.cx.e.a.values().length];
                try
                {
                    a[p.cx.e.a.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.pandora.radio.util._cls3.b[ag1.a.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 44
    //                   2 53
    //                   3 74
    //                   4 44
    //                   5 44;
           goto _L1 _L1 _L2 _L3 _L1 _L1
_L1:
        i = ag1.a;
        return;
_L2:
        if (i == p.cw.b.a.b)
        {
            c(ag1.b);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (i == p.cw.b.a.c)
        {
            d(ag1.b);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void onSignInState(an an1)
    {
        e = an1.a;
        com.pandora.radio.util._cls3.a[an1.b.ordinal()];
        JVM INSTR tableswitch 1 1: default 36
    //                   1 45;
           goto _L1 _L2
_L1:
        n = an1.b;
        return;
_L2:
        c(true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onTrackState(bh bh1)
    {
        if (bh1.a == p.dd.bh.a.c && h != null)
        {
            a(h);
            h = null;
        }
    }

    static 
    {
        k = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }
}
