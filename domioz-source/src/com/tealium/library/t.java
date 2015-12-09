// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.tealium.library:
//            f, k, l, n, 
//            u, d, Tealium, C

final class t
    implements f, k, l, n, Runnable, Thread.UncaughtExceptionHandler
{

    private static boolean a = false;
    private final Thread.UncaughtExceptionHandler b;
    private final SharedPreferences c;
    private final Calendar d = Calendar.getInstance();
    private final SimpleDateFormat e;
    private final SimpleDateFormat f;
    private c.a g;
    private String h;
    private boolean i;
    private d j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;

    private t(Context context, String s1, boolean flag)
    {
        if (!flag)
        {
            b = null;
        } else
        {
            b = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
        i = false;
        c = context.getSharedPreferences("tealium.lifecycle", 0);
        e = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ROOT);
        f = new SimpleDateFormat("MM/dd/yyyy", Locale.ROOT);
        h = s1;
        g = new c.a(s1, (byte)0);
        k = c.getLong("ts_f_l", 0L);
        o = c.getLong("ts_l_u", 0L);
        n = c.getLong("ts_l_w", 0L);
        l = 0L;
        m = 0L;
        t = c.getInt(com.tealium.library.c.a.a(g), 0);
        r = c.getInt(com.tealium.library.c.a.b(g), 0);
        s = c.getInt(com.tealium.library.c.a.c(g), 0);
        u = c.getInt(com.tealium.library.c.a.d(g), 0);
        v = c.getInt("c_tot_l", 0);
        w = c.getInt("c_tot_w", 0);
        x = c.getInt("c_tot_t", 0);
        y = c.getInt("c_tot_s", 0);
        p = c.getLong("tot_w_s", 0L);
        q = c.getLong("tot_s_s_l", 0L);
    }

    static int A(t t1)
    {
        int i1 = t1.x;
        t1.x = i1 + 1;
        return i1;
    }

    static long a(t t1, long l1)
    {
        t1.n = l1;
        return l1;
    }

    static t a(Tealium.Config config)
    {
        String s1;
        try
        {
            s1 = config.f().getPackageManager().getPackageInfo(config.f().getPackageName(), 0).versionName;
        }
        catch (Throwable throwable)
        {
            com.tealium.library.u.d("Version name must be specified in the application manifest for accurate lifecycle tracking.");
            throwable = "unknown";
        }
        return new t(config.f(), s1, config.c());
    }

    static Calendar a(t t1)
    {
        return t1.d;
    }

    static boolean a(t t1, boolean flag)
    {
        t1.i = flag;
        return flag;
    }

    static long b(t t1)
    {
        return t1.n;
    }

    static long b(t t1, long l1)
    {
        l1 = t1.p + l1;
        t1.p = l1;
        return l1;
    }

    static long c(t t1, long l1)
    {
        l1 = t1.q + l1;
        t1.q = l1;
        return l1;
    }

    static SharedPreferences c(t t1)
    {
        return t1.c;
    }

    static long d(t t1)
    {
        return t1.k;
    }

    static long d(t t1, long l1)
    {
        t1.k = l1;
        return l1;
    }

    static long e(t t1, long l1)
    {
        t1.q = 0L;
        return 0L;
    }

    static SimpleDateFormat e(t t1)
    {
        return t1.e;
    }

    static long f(t t1, long l1)
    {
        t1.o = l1;
        return l1;
    }

    static SimpleDateFormat f(t t1)
    {
        return t1.f;
    }

    static int g(t t1)
    {
        return t1.r;
    }

    static long h(t t1)
    {
        return t1.o;
    }

    static int i(t t1)
    {
        return t1.u;
    }

    static int j(t t1)
    {
        return t1.t;
    }

    static int k(t t1)
    {
        return t1.s;
    }

    static int l(t t1)
    {
        return t1.v;
    }

    static int m(t t1)
    {
        return t1.x;
    }

    static int n(t t1)
    {
        return t1.w;
    }

    static int o(t t1)
    {
        return t1.y;
    }

    static long p(t t1)
    {
        return t1.p;
    }

    static c.a q(t t1)
    {
        return t1.g;
    }

    static int r(t t1)
    {
        int i1 = t1.t;
        t1.t = i1 + 1;
        return i1;
    }

    static int s(t t1)
    {
        int i1 = t1.w;
        t1.w = i1 + 1;
        return i1;
    }

    static long t(t t1)
    {
        return t1.q;
    }

    static int u(t t1)
    {
        int i1 = t1.r;
        t1.r = i1 + 1;
        return i1;
    }

    static int v(t t1)
    {
        int i1 = t1.v;
        t1.v = i1 + 1;
        return i1;
    }

    static String w(t t1)
    {
        return t1.h;
    }

    static int x(t t1)
    {
        int i1 = t1.s;
        t1.s = i1 + 1;
        return i1;
    }

    static int y(t t1)
    {
        int i1 = t1.y;
        t1.y = i1 + 1;
        return i1;
    }

    static int z(t t1)
    {
        int i1 = t1.u;
        t1.u = i1 + 1;
        return i1;
    }

    public final void a()
    {
        if (b != null)
        {
            Thread.setDefaultUncaughtExceptionHandler(b);
        }
    }

    public final void a(Activity activity)
    {
        long l1 = System.currentTimeMillis();
        if (j == d.a)
        {
            com.tealium.library.u.d("A duplicate Tealium.onResume(Activity) was detected, please ensure Tealium.onResume(Activity) is followed by Tealium.onPause(Activity).");
        } else
        {
            j = d.a;
            l = l1;
            com.tealium.library.d.a().removeCallbacks(this);
            if (l - m > 10000L)
            {
                long l2 = c.getLong("ts_t", 0L);
                if (l2 > 0L)
                {
                    c.edit().remove("ts_t").apply();
                    Tealium.track(null, (new h(l2)).b(), "link");
                }
                if (a)
                {
                    com.tealium.library.d.i();
                    activity = (new f(l1)).b();
                } else
                {
                    activity = (new c(l1)).b();
                    a = true;
                }
                Tealium.track(null, activity, "link");
                return;
            }
        }
    }

    public final void a(Object obj, C c1, String s1)
    {
        long l1 = System.currentTimeMillis();
        d.setTime(new Date(l1));
        c1.c("lifecycle_dayofweek_local", Integer.toString(d.get(7)));
        int i1;
        if (n == 0L)
        {
            i1 = 0;
        } else
        {
            i1 = (int)((l1 - n) / 0x5265c00L);
        }
        c1.c("lifecycle_dayssincelastwake", Integer.toString(i1));
        c1.c("lifecycle_dayssincelaunch", Long.toString((l1 - k) / 0x5265c00L));
        obj = Integer.toString(r);
        if (o > 0L)
        {
            c1.c("lifecycle_dayssinceupdate", Long.toString((l1 - o) / 0x5265c00L));
            c1.c("lifecycle_updatelaunchdate", e.format(Long.valueOf(o)));
        }
        c1.c("lifecycle_firstlaunchdate", e.format(Long.valueOf(k)));
        c1.c("lifecycle_firstlaunchdate_mmddyyy", f.format(Long.valueOf(k)));
        c1.c("lifecycle_hourofday_local", Integer.toString(d.get(11)));
        c1.c("lifecycle_launchcount", obj);
        c1.c("lifecycle_sleepcount", Integer.toString(s));
        c1.c("lifecycle_terminatecount", Integer.toString(u));
        c1.c("lifecycle_totallaunchcount", Integer.toString(v));
        if (i)
        {
            c1.c("lifecycle_totalsecondsawake", Long.toString((long)Math.round((float)(l1 - n) / 1000F) + p));
        } else
        {
            c1.c("lifecycle_totalsecondsawake", Long.toString(p));
        }
        c1.c("lifecycle_totalsleepcount", Integer.toString(y));
        c1.c("lifecycle_totalterminatecount", Integer.toString(x));
        c1.c("lifecycle_totalwakecount", Integer.toString(w));
        c1.c("lifecycle_wakecount", Integer.toString(t));
    }

    public final void b()
    {
        long l1 = System.currentTimeMillis();
        if (j == d.b)
        {
            com.tealium.library.u.d("A duplicate Tealium.onPause(Activity) was detected, please ensure Tealium.onPause(Activity) is followed by Tealium.onResume(Activity).");
            return;
        }
        j = d.b;
        m = l1;
        c.edit().putLong("ts_t", m).apply();
        com.tealium.library.d.a().removeCallbacks(this);
        if (10000L > 0L)
        {
            com.tealium.library.d.a().postDelayed(this, 10000L);
            return;
        } else
        {
            run();
            return;
        }
    }

    public final void run()
    {
        if (m > l)
        {
            Tealium.track(null, (new e(c.getLong("ts_t", System.currentTimeMillis()))).b(), "link");
        }
        c.edit().remove("ts_t").apply();
    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        int i1 = c.getInt("c_tot_c", 0);
        c.edit().putInt("c_tot_c", i1 + 1).apply();
        Map map = (new b(System.currentTimeMillis())).b();
        map.put("autotracked", "true");
        map.put("exception_type", "uncaught");
        map.put("exception_totalcrashcount", Integer.toString(i1));
        Tealium.track(throwable, map, "link");
        b.uncaughtException(thread, throwable);
    }


    private class d extends Enum
    {

        public static final d a;
        public static final d b;
        private static final d c[];

        static 
        {
            a = new d("ON_RESUME", 0);
            b = new d("ON_PAUSE", 1);
            c = (new d[] {
                a, b
            });
        }

        private d(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class h extends g
    {
        private class g extends a
        {
            private class a
            {

                protected final long a;
                private final Map b = new HashMap(26);
                private t c;

                protected abstract String a();

                protected abstract void a(android.content.SharedPreferences.Editor editor, Map map);

                final Map b()
                {
                    android.content.SharedPreferences.Editor editor = t.c(c).edit();
                    a(editor, b);
                    b.put("call_eventtype", "lifecycle");
                    b.put("lifecycle_dayssincelaunch", Long.toString((a - t.d(c)) / 0x5265c00L));
                    b.put("lifecycle_firstlaunchdate", t.e(c).format(Long.valueOf(t.d(c))));
                    b.put("lifecycle_firstlaunchdate_mmddyyy", t.f(c).format(Long.valueOf(t.d(c))));
                    String s1 = Integer.toString(t.g(c));
                    b.put("lifecycle_launchcount", s1);
                    if (t.h(c) > 0L)
                    {
                        b.put("lifecycle_dayssinceupdate", Long.toString((a - t.h(c)) / 0x5265c00L));
                        b.put("lifecycle_updatelaunchdate", t.e(c).format(Long.valueOf(t.h(c))));
                    }
                    b.put("lifecycle_terminatecount", Integer.toString(t.i(c)));
                    b.put("lifecycle_wakecount", Integer.toString(t.j(c)));
                    b.put("lifecycle_sleepcount", Integer.toString(t.k(c)));
                    b.put("lifecycle_totallaunchcount", Integer.toString(t.l(c)));
                    b.put("lifecycle_totalterminatecount", Integer.toString(t.m(c)));
                    b.put("lifecycle_totalwakecount", Integer.toString(t.n(c)));
                    b.put("lifecycle_totalsleepcount", Integer.toString(t.o(c)));
                    b.put("lifecycle_totalsecondsawake", Long.toString(t.p(c)));
                    s1 = a();
                    b.put("lifecycle_type", s1);
                    s1 = com.tealium.library.c.a.a(t.q(c), s1);
                    long l1 = t.c(c).getLong(s1, 0L);
                    if (l1 > 0L)
                    {
                        b.put("lifecycle_lastsimilarcalldate", t.e(c).format(new Date(l1)));
                    }
                    editor.putLong(s1, a);
                    editor.apply();
                    return b;
                }

                a(long l1)
                {
                    c = t.this;
                    super();
                    a = l1;
                    Date date = new Date(l1);
                    t.a(t.this).setTime(date);
                    b.put("link_id", "lifecycle");
                    b.put("tealium_id", "LIFE");
                    b.put("autotracked", "true");
                    b.put("call_type", "link");
                    b.put("call_eventtype", "lifecycle");
                    b.put("lifecycle_dayofweek_local", Integer.toString(t.a(t.this).get(7)));
                    b.put("lifecycle_hourofday_local", Integer.toString(t.a(t.this).get(11)));
                    int i1;
                    if (t.b(t.this) == 0L)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = (int)((l1 - t.b(t.this)) / 0x5265c00L);
                    }
                    b.put("lifecycle_dayssincelastwake", Integer.toString(i1));
                }
            }


            private t b;

            protected void a(android.content.SharedPreferences.Editor editor, Map map)
            {
                long l1 = Math.round((float)(a - t.b(b)) / 1000F);
                t.b(b, l1);
                editor.putLong("tot_w_s", t.p(b));
                map.put("lifecycle_totalsecondsawake", Long.toString(t.p(b)));
                map.put("lifecycle_secondsawake", Long.toString(l1));
                t.c(b, l1);
                editor.putLong("lifecycle_priorsecondsawake", t.t(b));
            }

            g(long l1)
            {
                b = t.this;
                super(l1);
                t.a(t.this, false);
            }
        }


        private t b;

        protected final String a()
        {
            return "terminate";
        }

        protected final void a(android.content.SharedPreferences.Editor editor, Map map)
        {
            super.a(editor, map);
            t.z(b);
            editor.putInt(com.tealium.library.c.a.d(t.q(b)), t.i(b));
            t.A(b);
            editor.putInt("c_tot_t", t.m(b));
        }

        h(long l1)
        {
            b = t.this;
            super(l1);
        }
    }


    private class f extends i
    {
        private class i extends a
        {

            private t b;

            protected void a(android.content.SharedPreferences.Editor editor, Map map)
            {
                t.a(b, a);
                editor.putLong("ts_l_w", a);
                t.r(b);
                editor.putInt(com.tealium.library.c.a.a(t.q(b)), t.j(b));
                t.s(b);
                editor.putInt("c_tot_w", t.n(b));
                int j1 = t.a(b).get(1) * 1000;
                int i1 = t.a(b).get(6) + j1;
                j1 += t.a(b).get(2);
                if (t.c(b).getInt("d_l_w", -1) != i1)
                {
                    editor.putInt("d_l_w", i1);
                    map.put("lifecycle_isfirstwaketoday", "true");
                }
                if (t.c(b).getInt("m_l_w", -1) != j1)
                {
                    editor.putInt("m_l_w", j1);
                    map.put("lifecycle_isfirstwakemonth", "true");
                }
            }

            i(long l1)
            {
                b = t.this;
                super(l1);
                t.a(t.this, true);
            }
        }


        protected final String a()
        {
            return "wake";
        }

        f(long l1)
        {
            super(l1);
        }
    }


    private class c extends i
    {

        private String b;
        private t c;

        protected final String a()
        {
            return b;
        }

        protected final void a(android.content.SharedPreferences.Editor editor, Map map)
        {
            super.a(editor, map);
            t.u(c);
            editor.putInt(com.tealium.library.c.a.b(t.q(c)), t.g(c));
            t.v(c);
            editor.putInt("c_tot_l", t.l(c));
            b = "launch";
            String s1;
            if (t.d(c) == 0L)
            {
                map.put("lifecycle_isfirstlaunch", "true");
                editor.putLong("ts_f_l", a);
                t.d(c, a);
            } else
            {
                map.put("lifecycle_priorsecondsawake", Long.toString(t.t(c)));
                t.e(c, 0L);
                editor.putLong("tot_s_s_l", 0L);
            }
            s1 = t.c(c).getString("v_n", null);
            if (s1 == null)
            {
                editor.putString("v_n", t.w(c));
            } else
            if (!t.w(c).equals(s1))
            {
                editor.putString("v_n", t.w(c));
                editor.putLong("ts_l_u", a);
                t.f(c, a);
                map.put("lifecycle_isfirstlaunchupdate", "true");
                return;
            }
        }

        c(long l1)
        {
            c = t.this;
            super(l1);
            b = null;
        }
    }


    private class e extends g
    {

        private t b;

        protected final String a()
        {
            return "sleep";
        }

        protected final void a(android.content.SharedPreferences.Editor editor, Map map)
        {
            super.a(editor, map);
            t.x(b);
            editor.putInt(com.tealium.library.c.a.c(t.q(b)), t.k(b));
            t.y(b);
            editor.putInt("c_tot_s", t.o(b));
        }

        e(long l1)
        {
            b = t.this;
            super(l1);
        }
    }


    private class b extends a
    {

        protected final String a()
        {
            return "crash";
        }

        protected final void a(android.content.SharedPreferences.Editor editor, Map map)
        {
        }

        b(long l1)
        {
            super(l1);
            t.a(t.this, false);
        }
    }

}
