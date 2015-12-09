// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.ai;
import com.google.android.gms.analytics.internal.c;
import com.google.android.gms.analytics.internal.e;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.js;
import com.google.android.gms.internal.ju;
import com.google.android.gms.internal.zzof;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            c, b

public class g extends r
{
    private class a extends r
        implements c.a
    {

        final g a;
        private boolean b;
        private int c;
        private long d;
        private boolean e;
        private long f;

        private void d()
        {
            if (d >= 0L || b)
            {
                s().a(com.google.android.gms.analytics.g.a(a));
                return;
            } else
            {
                s().b(com.google.android.gms.analytics.g.a(a));
                return;
            }
        }

        protected void a()
        {
        }

        public void a(long l)
        {
            d = l;
            d();
        }

        public void a(Activity activity)
        {
            if (c == 0 && c())
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
                HashMap hashmap = new HashMap();
                hashmap.put("&t", "screenview");
                g g1 = a;
                if (g.k(a) != null)
                {
                    obj = g.k(a).a(activity);
                } else
                {
                    obj = activity.getClass().getCanonicalName();
                }
                g1.a("&cd", ((String) (obj)));
                if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
                {
                    activity = com.google.android.gms.analytics.g.a(activity);
                    if (!TextUtils.isEmpty(activity))
                    {
                        hashmap.put("&dr", activity);
                    }
                }
                a.a(hashmap);
            }
        }

        public void a(boolean flag)
        {
            b = flag;
            d();
        }

        public void b(Activity activity)
        {
            c = c - 1;
            c = Math.max(0, c);
            if (c == 0)
            {
                f = n().b();
            }
        }

        public boolean b()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            flag = e;
            e = false;
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        boolean c()
        {
            return n().b() >= f + Math.max(1000L, d);
        }

        protected a(t t)
        {
            a = g.this;
            super(t);
            d = -1L;
        }
    }


    private boolean a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final e d;
    private final a e;
    private b f;
    private m g;

    g(t t, String s, e e1)
    {
        super(t);
        if (s != null)
        {
            b.put("&tid", s);
        }
        b.put("useSecure", "1");
        b.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        if (e1 == null)
        {
            d = new e("tracking");
        } else
        {
            d = e1;
        }
        e = new a(t);
    }

    static a a(g g1)
    {
        return g1.e;
    }

    static String a(Activity activity)
    {
        z.a(activity);
        activity = activity.getIntent();
        if (activity != null)
        {
            if (!TextUtils.isEmpty(activity = activity.getStringExtra("android.intent.extra.REFERRER_NAME")))
            {
                return activity;
            }
        }
        return null;
    }

    private static void a(Map map, Map map1)
    {
        z.a(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = b(entry);
                if (s != null)
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    private static boolean a(java.util.Map.Entry entry)
    {
        String s = (String)entry.getKey();
        entry = (String)entry.getValue();
        return s.startsWith("&") && s.length() >= 2;
    }

    static com.google.android.gms.analytics.internal.a b(g g1)
    {
        return g1.y();
    }

    private static String b(java.util.Map.Entry entry)
    {
        if (!a(entry))
        {
            return null;
        } else
        {
            return ((String)entry.getKey()).substring(1);
        }
    }

    private static void b(Map map, Map map1)
    {
        z.a(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = b(entry);
                if (s != null && !map1.containsKey(s))
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    static y c(g g1)
    {
        return g1.z();
    }

    private boolean c()
    {
        return f != null;
    }

    static ai d(g g1)
    {
        return g1.A();
    }

    static ai e(g g1)
    {
        return g1.A();
    }

    static e f(g g1)
    {
        return g1.d;
    }

    static com.google.android.gms.analytics.internal.g g(g g1)
    {
        return g1.p();
    }

    static com.google.android.gms.analytics.internal.g h(g g1)
    {
        return g1.p();
    }

    static p i(g g1)
    {
        return g1.t();
    }

    static p j(g g1)
    {
        return g1.t();
    }

    static m k(g g1)
    {
        return g1.g;
    }

    protected void a()
    {
        e.E();
        String s = v().c();
        if (s != null)
        {
            a("&an", s);
        }
        s = v().b();
        if (s != null)
        {
            a("&av", s);
        }
    }

    public void a(long l)
    {
        e.a(1000L * l);
    }

    public void a(Uri uri)
    {
        if (uri != null && !uri.isOpaque())
        {
            if (!TextUtils.isEmpty(uri = uri.getQueryParameter("referrer")))
            {
                uri = Uri.parse((new StringBuilder()).append("http://hostname/?").append(uri).toString());
                String s = uri.getQueryParameter("utm_id");
                if (s != null)
                {
                    c.put("&ci", s);
                }
                s = uri.getQueryParameter("anid");
                if (s != null)
                {
                    c.put("&anid", s);
                }
                s = uri.getQueryParameter("utm_campaign");
                if (s != null)
                {
                    c.put("&cn", s);
                }
                s = uri.getQueryParameter("utm_content");
                if (s != null)
                {
                    c.put("&cc", s);
                }
                s = uri.getQueryParameter("utm_medium");
                if (s != null)
                {
                    c.put("&cm", s);
                }
                s = uri.getQueryParameter("utm_source");
                if (s != null)
                {
                    c.put("&cs", s);
                }
                s = uri.getQueryParameter("utm_term");
                if (s != null)
                {
                    c.put("&ck", s);
                }
                s = uri.getQueryParameter("dclid");
                if (s != null)
                {
                    c.put("&dclid", s);
                }
                s = uri.getQueryParameter("gclid");
                if (s != null)
                {
                    c.put("&gclid", s);
                }
                uri = uri.getQueryParameter("aclid");
                if (uri != null)
                {
                    c.put("&aclid", uri);
                    return;
                }
            }
        }
    }

    void a(m m1)
    {
        b("Loading Tracker config values");
        g = m1;
        if (g.a())
        {
            m1 = g.b();
            a("&tid", ((String) (m1)));
            a("trackingId loaded", m1);
        }
        if (g.c())
        {
            m1 = Double.toString(g.d());
            a("&sf", ((String) (m1)));
            a("Sample frequency loaded", m1);
        }
        if (g.e())
        {
            int l = g.f();
            a(l);
            a("Session timeout loaded", Integer.valueOf(l));
        }
        if (g.g())
        {
            boolean flag = g.h();
            b(flag);
            a("Auto activity tracking loaded", Boolean.valueOf(flag));
        }
        if (g.i())
        {
            boolean flag1 = g.j();
            if (flag1)
            {
                a("&aip", "1");
            }
            a("Anonymize ip loaded", Boolean.valueOf(flag1));
        }
        a(g.k());
    }

    public void a(String s)
    {
        a("&cd", s);
    }

    public void a(String s, String s1)
    {
        z.a(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            b.put(s, s1);
            return;
        }
    }

    public void a(Map map)
    {
        HashMap hashmap;
        String s;
        long l1;
        boolean flag;
        boolean flag1;
        l1 = n().a();
        if (s().f())
        {
            c("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = s().e();
        hashmap = new HashMap();
        a(b, ((Map) (hashmap)));
        a(map, ((Map) (hashmap)));
        flag1 = n.a((String)b.get("useSecure"), true);
        b(c, hashmap);
        c.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            p().a(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            p().a(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = b();
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        i1 = Integer.parseInt((String)b.get("&a")) + 1;
        int l;
        l = i1;
        if (i1 >= 0x7fffffff)
        {
            l = 1;
        }
        b.put("&a", Integer.toString(l));
        this;
        JVM INSTR monitorexit ;
        r().a(new Tracker._cls1(hashmap, flag2, map, l1, flag, flag1, s));
        return;
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (c() != flag)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        android.content.Context context = o();
        f = new b(this, Thread.getDefaultUncaughtExceptionHandler(), context);
        Thread.setDefaultUncaughtExceptionHandler(f);
        b("Uncaught exceptions will be reported to Google Analytics");
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        Thread.setDefaultUncaughtExceptionHandler(f.b());
        b("Uncaught exceptions will not be reported to Google Analytics");
          goto _L1
    }

    public void b(boolean flag)
    {
        e.a(flag);
    }

    boolean b()
    {
        return a;
    }

    public void c(boolean flag)
    {
        a = flag;
    }

    // Unreferenced inner class com/google/android/gms/analytics/Tracker$1

/* anonymous class */
    class Tracker._cls1
        implements Runnable
    {

        final Map a;
        final boolean b;
        final String c;
        final long d;
        final boolean e;
        final boolean f;
        final String g;
        final g h;

        public void run()
        {
            boolean flag1 = true;
            if (com.google.android.gms.analytics.g.a(h).b())
            {
                a.put("sc", "start");
            }
            n.b(a, "cid", h.s().h());
            Object obj = (String)a.get("sf");
            if (obj != null)
            {
                double d1 = n.a(((String) (obj)), 100D);
                if (n.a(d1, (String)a.get("cid")))
                {
                    h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                    return;
                }
            }
            obj = g.b(h);
            boolean flag;
            if (b)
            {
                n.a(a, "ate", ((com.google.android.gms.analytics.internal.a) (obj)).b());
                n.a(a, "adid", ((com.google.android.gms.analytics.internal.a) (obj)).c());
            } else
            {
                a.remove("ate");
                a.remove("adid");
            }
            obj = com.google.android.gms.analytics.g.c(h).c();
            n.a(a, "an", ((js) (obj)).a());
            n.a(a, "av", ((js) (obj)).b());
            n.a(a, "aid", ((js) (obj)).c());
            n.a(a, "aiid", ((js) (obj)).d());
            a.put("v", "1");
            a.put("_v", s.b);
            n.a(a, "ul", g.d(h).b().f());
            n.a(a, "sr", com.google.android.gms.analytics.g.e(h).c());
            if (c.equals("transaction") || c.equals("item"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && !g.f(h).a())
            {
                g.g(h).a(a, "Too many hits sent too quickly, rate limiting invoked");
                return;
            }
            long l1 = n.a((String)a.get("ht"));
            long l = l1;
            if (l1 == 0L)
            {
                l = d;
            }
            if (e)
            {
                obj = new c(h, a, l, f);
                g.h(h).c("Dry run enabled. Would have sent hit", obj);
                return;
            }
            obj = (String)a.get("cid");
            HashMap hashmap = new HashMap();
            n.a(hashmap, "uid", a);
            n.a(hashmap, "an", a);
            n.a(hashmap, "aid", a);
            n.a(hashmap, "av", a);
            n.a(hashmap, "aiid", a);
            String s1 = g;
            if (TextUtils.isEmpty((CharSequence)a.get("adid")))
            {
                flag1 = false;
            }
            obj = new v(0L, ((String) (obj)), s1, flag1, 0L, hashmap);
            l1 = g.i(h).a(((v) (obj)));
            a.put("_s", String.valueOf(l1));
            obj = new c(h, a, l, f);
            g.j(h).a(((c) (obj)));
        }

            
            {
                h = g.this;
                a = map;
                b = flag;
                c = s1;
                d = l;
                e = flag1;
                f = flag2;
                g = s2;
                super();
            }
    }

}
