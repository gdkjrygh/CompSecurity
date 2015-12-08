// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzns;
import com.google.android.gms.internal.zznx;
import com.google.android.gms.internal.zznz;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            GoogleAnalytics, ExceptionReporter

public class Tracker extends zzd
{

    private boolean a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final zzad d;
    private final zza e;
    private ExceptionReporter f;
    private zzal g;

    Tracker(zzf zzf, String s, zzad zzad1)
    {
        super(zzf);
        if (s != null)
        {
            b.put("&tid", s);
        }
        b.put("useSecure", "1");
        b.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        if (zzad1 == null)
        {
            d = new zzad("tracking");
        } else
        {
            d = zzad1;
        }
        e = new zza(zzf);
    }

    static zza a(Tracker tracker)
    {
        return tracker.e;
    }

    static String a(Activity activity)
    {
        zzu.a(activity);
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
        zzu.a(map1);
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

    static com.google.android.gms.analytics.internal.zza b(Tracker tracker)
    {
        return tracker.y();
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
        zzu.a(map1);
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

    static zzk c(Tracker tracker)
    {
        return tracker.z();
    }

    private boolean c()
    {
        return f != null;
    }

    static com.google.android.gms.analytics.internal.zzu d(Tracker tracker)
    {
        return tracker.A();
    }

    static com.google.android.gms.analytics.internal.zzu e(Tracker tracker)
    {
        return tracker.A();
    }

    static zzad f(Tracker tracker)
    {
        return tracker.d;
    }

    static zzaf g(Tracker tracker)
    {
        return tracker.p();
    }

    static zzaf h(Tracker tracker)
    {
        return tracker.p();
    }

    static zzb i(Tracker tracker)
    {
        return tracker.t();
    }

    static zzb j(Tracker tracker)
    {
        return tracker.t();
    }

    static zzal k(Tracker tracker)
    {
        return tracker.g;
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

    void a(zzal zzal1)
    {
        b("Loading Tracker config values");
        g = zzal1;
        if (g.a())
        {
            zzal1 = g.b();
            a("&tid", ((String) (zzal1)));
            a("trackingId loaded", zzal1);
        }
        if (g.c())
        {
            zzal1 = Double.toString(g.d());
            a("&sf", ((String) (zzal1)));
            a("Sample frequency loaded", zzal1);
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
        zzu.a(s, "Key should be non-null");
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
        flag1 = zzam.a((String)b.get("useSecure"), true);
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
        r().a(new Runnable(hashmap, flag2, map, l1, flag, flag1, s) {

            final Map a;
            final boolean b;
            final String c;
            final long d;
            final boolean e;
            final boolean f;
            final String g;
            final Tracker h;

            public void run()
            {
                boolean flag4 = true;
                if (Tracker.a(h).b())
                {
                    a.put("sc", "start");
                }
                zzam.b(a, "cid", h.s().h());
                Object obj = (String)a.get("sf");
                if (obj != null)
                {
                    double d1 = zzam.a(((String) (obj)), 100D);
                    if (zzam.a(d1, (String)a.get("cid")))
                    {
                        h.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                        return;
                    }
                }
                obj = Tracker.b(h);
                boolean flag3;
                if (b)
                {
                    zzam.a(a, "ate", ((com.google.android.gms.analytics.internal.zza) (obj)).b());
                    zzam.a(a, "adid", ((com.google.android.gms.analytics.internal.zza) (obj)).c());
                } else
                {
                    a.remove("ate");
                    a.remove("adid");
                }
                obj = Tracker.c(h).c();
                zzam.a(a, "an", ((zznx) (obj)).a());
                zzam.a(a, "av", ((zznx) (obj)).b());
                zzam.a(a, "aid", ((zznx) (obj)).c());
                zzam.a(a, "aiid", ((zznx) (obj)).d());
                a.put("v", "1");
                a.put("_v", zze.b);
                zzam.a(a, "ul", Tracker.d(h).b().f());
                zzam.a(a, "sr", Tracker.e(h).c());
                if (c.equals("transaction") || c.equals("item"))
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (!flag3 && !Tracker.f(h).a())
                {
                    Tracker.g(h).a(a, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long l3 = zzam.a((String)a.get("ht"));
                long l2 = l3;
                if (l3 == 0L)
                {
                    l2 = d;
                }
                if (e)
                {
                    obj = new zzab(h, a, l2, f);
                    Tracker.h(h).c("Dry run enabled. Would have sent hit", obj);
                    return;
                }
                obj = (String)a.get("cid");
                HashMap hashmap1 = new HashMap();
                zzam.a(hashmap1, "uid", a);
                zzam.a(hashmap1, "an", a);
                zzam.a(hashmap1, "aid", a);
                zzam.a(hashmap1, "av", a);
                zzam.a(hashmap1, "aiid", a);
                String s1 = g;
                if (TextUtils.isEmpty((CharSequence)a.get("adid")))
                {
                    flag4 = false;
                }
                obj = new zzh(0L, ((String) (obj)), s1, flag4, 0L, hashmap1);
                l3 = Tracker.i(h).a(((zzh) (obj)));
                a.put("_s", String.valueOf(l3));
                obj = new zzab(h, a, l2, f);
                Tracker.j(h).a(((zzab) (obj)));
            }

            
            {
                h = Tracker.this;
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
        f = new ExceptionReporter(this, Thread.getDefaultUncaughtExceptionHandler(), context);
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

    private class zza extends zzd
        implements GoogleAnalytics.zza
    {

        final Tracker a;
        private boolean b;
        private int c;
        private long d;
        private boolean e;
        private long f;

        private void d()
        {
            if (d >= 0L || b)
            {
                s().a(Tracker.a(a));
                return;
            } else
            {
                s().b(Tracker.a(a));
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
                Tracker tracker = a;
                if (Tracker.k(a) != null)
                {
                    obj = Tracker.k(a).a(activity);
                } else
                {
                    obj = activity.getClass().getCanonicalName();
                }
                tracker.a("&cd", ((String) (obj)));
                if (TextUtils.isEmpty((CharSequence)hashmap.get("&dr")))
                {
                    activity = Tracker.a(activity);
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

        protected zza(zzf zzf)
        {
            a = Tracker.this;
            super(zzf);
            d = -1L;
        }
    }

}
