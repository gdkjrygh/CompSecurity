// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class bmc extends bnd
{

    final Map a = new HashMap();
    final bmn b = new bmn("tracking", (byte)0);
    final bmd c;
    bls d;
    bmy e;
    private final Map g = new HashMap();

    bmc(bnf bnf1)
    {
        super(bnf1);
        g.put("useSecure", "1");
        g.put("&a", Integer.toString((new Random()).nextInt(0x7fffffff) + 1));
        c = new bmd(this, bnf1);
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
        btl.a(map1);
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

    private static void b(Map map, Map map1)
    {
        btl.a(map1);
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

    protected final void a()
    {
        c.n();
        String s = super.f.e().c();
        if (s != null)
        {
            a("&an", s);
        }
        s = super.f.e().b();
        if (s != null)
        {
            a("&av", s);
        }
    }

    public final void a(String s, String s1)
    {
        btl.a(s, "Key should be non-null");
        if (TextUtils.isEmpty(s))
        {
            return;
        } else
        {
            g.put(s, s1);
            return;
        }
    }

    public final void a(Map map)
    {
        HashMap hashmap;
        String s;
        long l;
        boolean flag;
        boolean flag1;
        l = super.f.c.a();
        flag = super.f.d().d;
        flag = super.f.d().c;
        hashmap = new HashMap();
        a(g, ((Map) (hashmap)));
        a(map, ((Map) (hashmap)));
        flag1 = bmz.c((String)g.get("useSecure"));
        b(a, hashmap);
        a.clear();
        map = (String)hashmap.get("t");
        if (TextUtils.isEmpty(map))
        {
            super.f.a().a(hashmap, "Missing hit type parameter");
            return;
        }
        s = (String)hashmap.get("tid");
        if (TextUtils.isEmpty(s))
        {
            super.f.a().a(hashmap, "Missing tracking id parameter");
            return;
        }
        this;
        JVM INSTR monitorenter ;
        int j;
        if (!"screenview".equalsIgnoreCase(map) && !"pageview".equalsIgnoreCase(map) && !"appview".equalsIgnoreCase(map) && !TextUtils.isEmpty(map))
        {
            break MISSING_BLOCK_LABEL_249;
        }
        j = Integer.parseInt((String)g.get("&a")) + 1;
        int i;
        i = j;
        if (j >= 0x7fffffff)
        {
            i = 1;
        }
        g.put("&a", Integer.toString(i));
        this;
        JVM INSTR monitorexit ;
        super.f.b().a(new Runnable(hashmap, map, l, flag, flag1, s) {

            private Map a;
            private String b;
            private long c;
            private boolean d;
            private boolean e;
            private String f;
            private bmc g;

            public final void run()
            {
                boolean flag3 = true;
                if (g.c.b())
                {
                    a.put("sc", "start");
                }
                Object obj = a;
                Object obj1 = ((bnc) (g)).f.d();
                btl.c("getClientId can not be called from the main thread");
                bmz.b(((Map) (obj)), "cid", ((bod) (obj1)).e.g().b());
                obj = (String)a.get("sf");
                if (obj != null)
                {
                    double d1 = bmz.a(((String) (obj)));
                    if (bmz.a(d1, (String)a.get("cid")))
                    {
                        g.b("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d1));
                        return;
                    }
                }
                ((bnc) (g)).f.f();
                a.remove("ate");
                a.remove("adid");
                obj = ((bnc) (g)).f.h().b();
                bmz.a(a, "an", ((coa) (obj)).a);
                bmz.a(a, "av", ((coa) (obj)).b);
                bmz.a(a, "aid", ((coa) (obj)).c);
                bmz.a(a, "aiid", ((coa) (obj)).d);
                a.put("v", "1");
                a.put("_v", bne.b);
                bmz.a(a, "ul", ((bnc) (g)).f.h.b().a);
                bmz.a(a, "sr", ((bnc) (g)).f.h.c());
                boolean flag2;
                if (b.equals("transaction") || b.equals("item"))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (!flag2 && !g.b.a())
                {
                    ((bnc) (g)).f.a().a(a, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
                long l2 = bmz.b((String)a.get("ht"));
                long l1 = l2;
                if (l2 == 0L)
                {
                    l1 = c;
                }
                if (d)
                {
                    obj = new bmj(g, a, l1, e);
                    ((bnc) (g)).f.a().c("Dry run enabled. Would have sent hit", obj);
                    return;
                }
                obj = (String)a.get("cid");
                obj1 = new HashMap();
                bmz.a(((Map) (obj1)), "uid", a);
                bmz.a(((Map) (obj1)), "an", a);
                bmz.a(((Map) (obj1)), "aid", a);
                bmz.a(((Map) (obj1)), "av", a);
                bmz.a(((Map) (obj1)), "aiid", a);
                String s1 = f;
                if (TextUtils.isEmpty((CharSequence)a.get("adid")))
                {
                    flag3 = false;
                }
                obj = new bnh(((String) (obj)), s1, flag3, 0L, ((Map) (obj1)));
                l2 = ((bnc) (g)).f.c().a(((bnh) (obj)));
                a.put("_s", String.valueOf(l2));
                obj = new bmj(g, a, l1, e);
                ((bnc) (g)).f.c().a(((bmj) (obj)));
            }

            
            {
                g = bmc.this;
                a = map;
                b = s;
                c = l;
                d = flag;
                e = flag1;
                f = s1;
                super();
            }
        });
        return;
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
    }
}
