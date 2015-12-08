// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.ah;
import com.google.android.gms.analytics.internal.c;
import com.google.android.gms.analytics.internal.e;
import com.google.android.gms.analytics.internal.l;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.r;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.analytics.internal.u;
import com.google.android.gms.analytics.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.je;
import com.google.android.gms.internal.jh;
import com.google.android.gms.internal.jj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            c

public final class g extends q
{
    private final class a extends q
        implements c.a
    {

        final g a;
        private boolean b;
        private int c;
        private long d;
        private boolean e;
        private long f;

        protected final void a()
        {
        }

        public final void a(Activity activity)
        {
            if (c == 0)
            {
                Intent intent;
                Object obj;
                HashMap hashmap;
                g g1;
                boolean flag;
                if (l().b() >= f + Math.max(1000L, d))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    e = true;
                }
            }
            c = c + 1;
            if (!b) goto _L2; else goto _L1
_L1:
            intent = activity.getIntent();
            if (intent != null)
            {
                a.a(intent.getData());
            }
            hashmap = new HashMap();
            hashmap.put("&t", "screenview");
            g1 = a;
            String s;
            if (g.k(a) != null)
            {
                obj = g.k(a);
                s = activity.getClass().getCanonicalName();
                obj = (String)((l) (obj)).a.get(s);
                if (obj != null)
                {
                    s = ((String) (obj));
                }
            } else
            {
                s = activity.getClass().getCanonicalName();
            }
            g1.a("&cd", s);
            if (!TextUtils.isEmpty((CharSequence)hashmap.get("&dr"))) goto _L4; else goto _L3
_L3:
            y.a(activity);
            activity = activity.getIntent();
            if (activity != null) goto _L6; else goto _L5
_L5:
            activity = null;
_L8:
            if (!TextUtils.isEmpty(activity))
            {
                hashmap.put("&dr", activity);
            }
_L4:
            a.a(hashmap);
_L2:
            return;
_L6:
            String s1 = activity.getStringExtra("android.intent.extra.REFERRER_NAME");
            activity = s1;
            if (TextUtils.isEmpty(s1))
            {
                activity = null;
            }
            if (true) goto _L8; else goto _L7
_L7:
        }

        public final void b()
        {
            d = 5000L;
            if (d >= 0L || b)
            {
                q().a(com.google.android.gms.analytics.g.a(a));
                return;
            } else
            {
                q().b(com.google.android.gms.analytics.g.a(a));
                return;
            }
        }

        public final boolean c()
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

        public final void c_()
        {
            c = c - 1;
            c = Math.max(0, c);
            if (c == 0)
            {
                f = l().b();
            }
        }

        protected a(s s)
        {
            a = g.this;
            super(s);
            d = -1L;
        }
    }


    private boolean a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final e d = new e("tracking", (byte)0);
    private final a e;
    private l f;

    g(s s, String s1)
    {
        super(s);
        if (s1 != null)
        {
            b.put("&tid", s1);
        }
        b.put("useSecure", "1");
        b.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        e = new a(s);
    }

    static a a(g g1)
    {
        return g1.e;
    }

    private static String a(java.util.Map.Entry entry)
    {
        String s = (String)entry.getKey();
        entry.getValue();
        boolean flag;
        if (!s.startsWith("&") || s.length() < 2)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            return null;
        } else
        {
            return ((String)entry.getKey()).substring(1);
        }
    }

    private static void a(Map map, Map map1)
    {
        y.a(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = a(entry);
                if (s != null)
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    static com.google.android.gms.analytics.internal.a b(g g1)
    {
        return g1.w();
    }

    private static void b(Map map, Map map1)
    {
        y.a(map1);
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                String s = a(entry);
                if (s != null && !map1.containsKey(s))
                {
                    map1.put(s, entry.getValue());
                }
            }
        }
    }

    static x c(g g1)
    {
        return g1.x();
    }

    static ah d(g g1)
    {
        return g1.y();
    }

    static ah e(g g1)
    {
        return g1.y();
    }

    static e f(g g1)
    {
        return g1.d;
    }

    static com.google.android.gms.analytics.internal.g g(g g1)
    {
        return g1.n();
    }

    static com.google.android.gms.analytics.internal.g h(g g1)
    {
        return g1.n();
    }

    static o i(g g1)
    {
        return g1.r();
    }

    static o j(g g1)
    {
        return g1.r();
    }

    static l k(g g1)
    {
        return g1.f;
    }

    protected final void a()
    {
        e.C();
        String s = t().c();
        if (s != null)
        {
            a("&an", s);
        }
        s = t().b();
        if (s != null)
        {
            a("&av", s);
        }
    }

    public final void a(Uri uri)
    {
        if (uri != null && !uri.isOpaque())
        {
            if (!TextUtils.isEmpty(uri = uri.getQueryParameter("referrer")))
            {
                uri = Uri.parse((new StringBuilder("http://hostname/?")).append(uri).toString());
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

    public final void a(String s)
    {
        a("&cd", s);
    }

    public final void a(String s, String s1)
    {
        y.a(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            b.put(s, s1);
            return;
        }
    }

    public final void a(Map map)
    {
        HashMap hashmap;
        String s;
        long l1;
        boolean flag;
        boolean flag1;
        l1 = l().a();
        if (q().f())
        {
            d("AppOptOut is set to true. Not sending Google Analytics hit");
            return;
        }
        flag = q().d();
        hashmap = new HashMap();
        a(b, ((Map) (hashmap)));
        a(map, ((Map) (hashmap)));
        flag1 = m.c((String)b.get("useSecure"));
        b(c, hashmap);
        c.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            n().a(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            n().a(hashmap, "Missing tracking id parameter");
            return;
        }
        boolean flag2 = a;
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_256;
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
        p().a(new Runnable(hashmap, flag2, map, l1, flag, flag1, s) {

            final Map a;
            final boolean b;
            final String c;
            final long d;
            final boolean e;
            final boolean f;
            final String g;
            final g h;

            public final void run()
            {
                boolean flag4 = true;
                if (com.google.android.gms.analytics.g.a(h).c())
                {
                    a.put("sc", "start");
                }
                m.b(a, "cid", h.q().g());
                Object obj = (String)a.get("sf");
                if (obj != null)
                {
                    double d1 = m.a(((String) (obj)));
                    if (m.a(d1, (String)a.get("cid")))
                    {
                        h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                        return;
                    }
                }
                obj = g.b(h);
                boolean flag3;
                if (b)
                {
                    m.a(a, "ate", ((com.google.android.gms.analytics.internal.a) (obj)).b());
                    m.a(a, "adid", ((com.google.android.gms.analytics.internal.a) (obj)).c());
                } else
                {
                    a.remove("ate");
                    a.remove("adid");
                }
                obj = com.google.android.gms.analytics.g.c(h).b();
                m.a(a, "an", ((jh) (obj)).a());
                m.a(a, "av", ((jh) (obj)).b());
                m.a(a, "aid", ((jh) (obj)).c());
                m.a(a, "aiid", ((jh) (obj)).d());
                a.put("v", "1");
                a.put("_v", r.b);
                m.a(a, "ul", g.d(h).b().a());
                m.a(a, "sr", com.google.android.gms.analytics.g.e(h).c());
                if (c.equals("transaction") || c.equals("item"))
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3 && !g.f(h).a())
                {
                    g.g(h).a(a, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long l3 = m.b((String)a.get("ht"));
                long l2 = l3;
                if (l3 == 0L)
                {
                    l2 = d;
                }
                if (e)
                {
                    obj = new c(h, a, l2, f);
                    g.h(h).c("Dry run enabled. Would have sent hit", obj);
                    return;
                }
                obj = (String)a.get("cid");
                HashMap hashmap1 = new HashMap();
                m.a(hashmap1, "uid", a);
                m.a(hashmap1, "an", a);
                m.a(hashmap1, "aid", a);
                m.a(hashmap1, "av", a);
                m.a(hashmap1, "aiid", a);
                String s1 = g;
                if (TextUtils.isEmpty((CharSequence)a.get("adid")))
                {
                    flag4 = false;
                }
                obj = new u(((String) (obj)), s1, flag4, 0L, hashmap1);
                l3 = g.i(h).a(((u) (obj)));
                a.put("_s", String.valueOf(l3));
                obj = new c(h, a, l2, f);
                g.j(h).a(((c) (obj)));
            }

            
            {
                h = g.this;
                a = map;
                b = flag;
                c = s;
                d = l;
                e = flag1;
                f = flag2;
                g = s1;
                super();
            }
        });
        return;
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
    }

    public final void a(boolean flag)
    {
        a = flag;
    }

    public final void b()
    {
        e.b();
    }

    public final void b(String s)
    {
        a("&an", s);
    }
}
