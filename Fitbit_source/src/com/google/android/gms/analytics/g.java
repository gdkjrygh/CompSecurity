// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.bl;
import com.google.android.gms.internal.bn;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            aj, t, ag, o, 
//            y, aa, p, z, 
//            s, h, b, c

public class g
{
    private class a
        implements c.a
    {

        final g a;
        private boolean b;
        private int c;
        private long d;
        private boolean e;
        private long f;
        private bl g;

        private void e()
        {
            c c1 = com.google.android.gms.analytics.c.a();
            if (c1 == null)
            {
                com.google.android.gms.analytics.p.a("GoogleAnalytics isn't initialized for the Tracker!");
                return;
            }
            if (d >= 0L || b)
            {
                c1.a(g.a(a));
                return;
            } else
            {
                c1.b(g.a(a));
                return;
            }
        }

        public long a()
        {
            return d;
        }

        public void a(long l1)
        {
            d = l1;
            e();
        }

        public void a(Activity activity)
        {
            y.a().a(y.a.ai);
            if (c == 0 && d())
            {
                e = true;
            }
            c = c + 1;
            if (b)
            {
                Object obj = activity.getIntent();
                if (obj != null)
                {
                    a.a(((Intent) (obj)).getData());
                }
                obj = new HashMap();
                ((Map) (obj)).put("&t", "screenview");
                y.a().a(true);
                g g1 = a;
                if (g.b(a) != null)
                {
                    activity = g.b(a).a(activity);
                } else
                {
                    activity = activity.getClass().getCanonicalName();
                }
                g1.a("&cd", activity);
                a.a(((Map) (obj)));
                y.a().a(false);
            }
        }

        public void a(boolean flag)
        {
            b = flag;
            e();
        }

        public void b(Activity activity)
        {
            y.a().a(y.a.aj);
            c = c - 1;
            c = Math.max(0, c);
            if (c == 0)
            {
                f = g.b();
            }
        }

        public boolean b()
        {
            return b;
        }

        public boolean c()
        {
            boolean flag = e;
            e = false;
            return flag;
        }

        boolean d()
        {
            return g.b() >= f + Math.max(1000L, d);
        }

        public a()
        {
            a = g.this;
            super();
            b = false;
            c = 0;
            d = -1L;
            e = false;
            g = bn.c();
        }
    }


    private final h a;
    private Context b;
    private final Map c;
    private final Map d;
    private s e;
    private final aj f;
    private final t g;
    private final ag h;
    private boolean i;
    private a j;
    private z k;
    private b l;

    g(String s1, h h1, Context context)
    {
        this(s1, h1, aj.a(), t.a(), ag.a(), ((s) (new o("tracking"))), context);
    }

    g(String s1, h h1, aj aj1, t t1, ag ag1, s s2, Context context)
    {
        c = new HashMap();
        d = new HashMap();
        a = h1;
        if (context != null)
        {
            b = context.getApplicationContext();
        }
        if (s1 != null)
        {
            c.put("&tid", s1);
        }
        c.put("useSecure", "1");
        f = aj1;
        g = t1;
        h = ag1;
        c.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        e = s2;
        j = new a();
        e(false);
    }

    static a a(g g1)
    {
        return g1.j;
    }

    static z b(g g1)
    {
        return g1.k;
    }

    long a()
    {
        return j.a();
    }

    public String a(String s1)
    {
        y.a().a(y.a.j);
        if (!TextUtils.isEmpty(s1))
        {
            if (c.containsKey(s1))
            {
                return (String)c.get(s1);
            }
            if (s1.equals("&ul"))
            {
                return aa.a(Locale.getDefault());
            }
            if (f != null && f.b(s1))
            {
                return f.a(s1);
            }
            if (g != null && g.b(s1))
            {
                return g.a(s1);
            }
            if (h != null && h.b(s1))
            {
                return h.a(s1);
            }
        }
        return null;
    }

    public void a(double d1)
    {
        a("&sf", Double.toHexString(d1));
    }

    public void a(int i1, int j1)
    {
        if (i1 < 0 && j1 < 0)
        {
            com.google.android.gms.analytics.p.d("Invalid width or height. The values should be non-negative.");
            return;
        } else
        {
            a("&sr", (new StringBuilder()).append(i1).append("x").append(j1).toString());
            return;
        }
    }

    public void a(long l1)
    {
        j.a(1000L * l1);
    }

    public void a(Uri uri)
    {
        if (uri != null)
        {
            if (!TextUtils.isEmpty(uri = uri.getQueryParameter("referrer")))
            {
                uri = Uri.parse((new StringBuilder()).append("http://hostname/?").append(uri).toString());
                String s1 = uri.getQueryParameter("utm_id");
                if (s1 != null)
                {
                    d.put("&ci", s1);
                }
                s1 = uri.getQueryParameter("utm_campaign");
                if (s1 != null)
                {
                    d.put("&cn", s1);
                }
                s1 = uri.getQueryParameter("utm_content");
                if (s1 != null)
                {
                    d.put("&cc", s1);
                }
                s1 = uri.getQueryParameter("utm_medium");
                if (s1 != null)
                {
                    d.put("&cm", s1);
                }
                s1 = uri.getQueryParameter("utm_source");
                if (s1 != null)
                {
                    d.put("&cs", s1);
                }
                s1 = uri.getQueryParameter("utm_term");
                if (s1 != null)
                {
                    d.put("&ck", s1);
                }
                s1 = uri.getQueryParameter("dclid");
                if (s1 != null)
                {
                    d.put("&dclid", s1);
                }
                uri = uri.getQueryParameter("gclid");
                if (uri != null)
                {
                    d.put("&gclid", uri);
                    return;
                }
            }
        }
    }

    void a(z z1)
    {
        com.google.android.gms.analytics.p.c("Loading Tracker config values.");
        k = z1;
        if (k.a())
        {
            z1 = k.b();
            a("&tid", ((String) (z1)));
            com.google.android.gms.analytics.p.c((new StringBuilder()).append("[Tracker] trackingId loaded: ").append(z1).toString());
        }
        if (k.c())
        {
            z1 = Double.toString(k.d());
            a("&sf", ((String) (z1)));
            com.google.android.gms.analytics.p.c((new StringBuilder()).append("[Tracker] sample frequency loaded: ").append(z1).toString());
        }
        if (k.e())
        {
            a(k.f());
            com.google.android.gms.analytics.p.c((new StringBuilder()).append("[Tracker] session timeout loaded: ").append(a()).toString());
        }
        if (k.g())
        {
            b(k.h());
            com.google.android.gms.analytics.p.c((new StringBuilder()).append("[Tracker] auto activity tracking loaded: ").append(b()).toString());
        }
        if (k.i())
        {
            if (k.j())
            {
                a("&aip", "1");
                com.google.android.gms.analytics.p.c("[Tracker] anonymize ip loaded: true");
            }
            com.google.android.gms.analytics.p.c("[Tracker] anonymize ip loaded: false");
        }
        a(k.k());
    }

    public void a(String s1, String s2)
    {
        am.a(s1, "Key should be non-null");
        y.a().a(y.a.k);
        c.put(s1, s2);
    }

    public void a(Map map)
    {
        y.a().a(y.a.l);
        HashMap hashmap = new HashMap();
        hashmap.putAll(c);
        if (map != null)
        {
            hashmap.putAll(map);
        }
        map = d.keySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            String s1 = (String)map.next();
            if (!hashmap.containsKey(s1))
            {
                hashmap.put(s1, d.get(s1));
            }
        } while (true);
        d.clear();
        if (TextUtils.isEmpty((CharSequence)hashmap.get("&tid")))
        {
            com.google.android.gms.analytics.p.d(String.format("Missing tracking id (%s) parameter.", new Object[] {
                "&tid"
            }));
        }
        String s2 = (String)hashmap.get("&t");
        map = s2;
        if (TextUtils.isEmpty(s2))
        {
            com.google.android.gms.analytics.p.d(String.format("Missing hit type (%s) parameter.", new Object[] {
                "&t"
            }));
            map = "";
        }
        if (j.c())
        {
            hashmap.put("&sc", "start");
        }
        map = map.toLowerCase();
        if ("screenview".equals(map) || "pageview".equals(map) || "appview".equals(map) || TextUtils.isEmpty(map))
        {
            int j1 = Integer.parseInt((String)c.get("&a")) + 1;
            int i1 = j1;
            if (j1 >= 0x7fffffff)
            {
                i1 = 1;
            }
            c.put("&a", Integer.toString(i1));
        }
        if (!map.equals("transaction") && !map.equals("item") && !e.a())
        {
            com.google.android.gms.analytics.p.d("Too many hits sent too quickly, rate limiting invoked.");
            return;
        } else
        {
            a.a(hashmap);
            return;
        }
    }

    public void a(boolean flag)
    {
        if (i == flag)
        {
            return;
        }
        i = flag;
        if (flag)
        {
            l = new b(this, Thread.getDefaultUncaughtExceptionHandler(), b);
            Thread.setDefaultUncaughtExceptionHandler(l);
            com.google.android.gms.analytics.p.c("Uncaught exceptions will be reported to Google Analytics.");
            return;
        }
        if (l != null)
        {
            Thread.setDefaultUncaughtExceptionHandler(l.c());
        } else
        {
            Thread.setDefaultUncaughtExceptionHandler(null);
        }
        com.google.android.gms.analytics.p.c("Uncaught exceptions will not be reported to Google Analytics.");
    }

    public void b(String s1)
    {
        a("&cd", s1);
    }

    public void b(boolean flag)
    {
        j.a(flag);
    }

    boolean b()
    {
        return j.b();
    }

    public void c(String s1)
    {
        a("&dl", s1);
    }

    public void c(boolean flag)
    {
        a("useSecure", aa.a(flag));
    }

    public void d(String s1)
    {
        a("&dr", s1);
    }

    public void d(boolean flag)
    {
        a("&aip", aa.a(flag));
    }

    public void e(String s1)
    {
        a("&dp", s1);
    }

    public void e(boolean flag)
    {
        if (!flag)
        {
            c.put("&ate", null);
            c.put("&adid", null);
        } else
        {
            if (c.containsKey("&ate"))
            {
                c.remove("&ate");
            }
            if (c.containsKey("&adid"))
            {
                c.remove("&adid");
                return;
            }
        }
    }

    public void f(String s1)
    {
        a("&dh", s1);
    }

    public void g(String s1)
    {
        a("&dt", s1);
    }

    public void h(String s1)
    {
        a("&ul", s1);
    }

    public void i(String s1)
    {
        a("&de", s1);
    }

    public void j(String s1)
    {
        a("&sd", s1);
    }

    public void k(String s1)
    {
        a("&vp", s1);
    }

    public void l(String s1)
    {
        a("&cid", s1);
    }

    public void m(String s1)
    {
        a("&an", s1);
    }

    public void n(String s1)
    {
        a("&aid", s1);
    }

    public void o(String s1)
    {
        a("&aiid", s1);
    }

    public void p(String s1)
    {
        a("&av", s1);
    }
}
