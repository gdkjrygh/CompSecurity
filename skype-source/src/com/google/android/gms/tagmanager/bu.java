// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.ke;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ba, cl, cy, cv, 
//            df, dj, cm, ch, 
//            dd, j, k, q, 
//            r, ag, ah, bk, 
//            cd, ad, be, cq, 
//            cr, cs, ct, cu, 
//            cz, dc, dh, f, 
//            g, i, n, s, 
//            t, aa, ac, af, 
//            am, ao, bb, bd, 
//            bh, bj, bl, bv, 
//            bw, cg, cn, ak, 
//            co, cp, bp, cx, 
//            an, o, bm, bo, 
//            bt, ay, c, m, 
//            l, dg

final class bu
{
    static interface a
    {

        public abstract void a(com.google.android.gms.internal.ke.e e1, Set set, Set set1, bp bp1);
    }

    private static final class b
    {

        private ba a;
        private com.google.android.gms.internal.h.a b;

        public final ba a()
        {
            return a;
        }

        public final com.google.android.gms.internal.h.a b()
        {
            return b;
        }

        public final int c()
        {
            int j1 = ((com.google.android.gms.internal.h.a)a.a()).e();
            int i1;
            if (b == null)
            {
                i1 = 0;
            } else
            {
                i1 = b.e();
            }
            return i1 + j1;
        }

        public b(ba ba1, com.google.android.gms.internal.h.a a1)
        {
            a = ba1;
            b = a1;
        }
    }

    private static final class c
    {

        private final Set a = new HashSet();
        private final Map b = new HashMap();
        private final Map c = new HashMap();
        private final Map d = new HashMap();
        private final Map e = new HashMap();
        private com.google.android.gms.internal.ke.a f;

        public final Set a()
        {
            return a;
        }

        public final void a(com.google.android.gms.internal.ke.a a1)
        {
            f = a1;
        }

        public final void a(com.google.android.gms.internal.ke.e e1)
        {
            a.add(e1);
        }

        public final void a(com.google.android.gms.internal.ke.e e1, com.google.android.gms.internal.ke.a a1)
        {
            List list = (List)b.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                b.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public final void a(com.google.android.gms.internal.ke.e e1, String s1)
        {
            List list = (List)d.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                d.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public final Map b()
        {
            return b;
        }

        public final void b(com.google.android.gms.internal.ke.e e1, com.google.android.gms.internal.ke.a a1)
        {
            List list = (List)c.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                c.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public final void b(com.google.android.gms.internal.ke.e e1, String s1)
        {
            List list = (List)e.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                e.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public final Map c()
        {
            return d;
        }

        public final Map d()
        {
            return e;
        }

        public final Map e()
        {
            return c;
        }

        public final com.google.android.gms.internal.ke.a f()
        {
            return f;
        }

        public c()
        {
        }
    }


    private static final ba a = new ba(com.google.android.gms.tagmanager.cl.f(), true);
    private final com.google.android.gms.internal.ke.c b;
    private final m c;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final cx g;
    private final cx h;
    private final Set i;
    private final com.google.android.gms.tagmanager.c j;
    private final Map k = new HashMap();
    private volatile String l;
    private int m;

    public bu(Context context, com.google.android.gms.internal.ke.c c1, com.google.android.gms.tagmanager.c c2, df.a a1, df.a a2, m m1)
    {
        if (c1 == null)
        {
            throw new NullPointerException("resource cannot be null");
        }
        b = c1;
        i = new HashSet(c1.a());
        j = c2;
        c = m1;
        c1 = new cy.a() {

            final bu a;

            public final int a(Object obj, Object obj1)
            {
                return ((com.google.android.gms.internal.h.a)((ba)obj1).a()).e();
            }

            
            {
                a = bu.this;
                super();
            }
        };
        new cy();
        g = cy.a(c1);
        c1 = new cy.a() {

            final bu a;

            public final int a(Object obj, Object obj1)
            {
                obj = (String)obj;
                obj1 = (b)obj1;
                return ((String) (obj)).length() + ((b) (obj1)).c();
            }

            
            {
                a = bu.this;
                super();
            }
        };
        new cy();
        h = cy.a(c1);
        b(new cv(context));
        b(new df(a2));
        b(new dj(c2));
        b(new cm(context, c2));
        b(new ch(context, c2));
        c(new dd());
        c(new j());
        c(new k());
        c(new q());
        c(new r());
        c(new ag());
        c(new ah());
        c(new bk());
        c(new cd());
        a(new ad(context));
        a(new be(context));
        a(new cq(context));
        a(new cr(context));
        a(new cs(context));
        a(new ct(context));
        a(new cu(context));
        a(new cz());
        a(new dc(b.b()));
        a(new df(a1));
        a(new dh(c2));
        a(new com.google.android.gms.tagmanager.f(context));
        a(new g());
        a(new i());
        a(new n(this));
        a(new s());
        a(new t());
        a(new aa(context));
        a(new ac());
        a(new af());
        a(new am());
        a(new ao(context));
        a(new bb());
        a(new bd());
        a(new bh());
        a(new bj());
        a(new bl(context));
        a(new bv());
        a(new bw());
        a(new cg());
        a(new cn());
        for (context = i.iterator(); context.hasNext();)
        {
            c1 = (com.google.android.gms.internal.ke.e)context.next();
            for (int i1 = 0; i1 < c1.e().size(); i1++)
            {
                c2 = (com.google.android.gms.internal.ke.a)c1.e().get(i1);
                a1 = a(k, a(c2));
                a1.a(c1);
                a1.a(c1, c2);
                a1.a(c1, "Unknown");
            }

            int j1 = 0;
            while (j1 < c1.f().size()) 
            {
                c2 = (com.google.android.gms.internal.ke.a)c1.f().get(j1);
                a1 = a(k, a(c2));
                a1.a(c1);
                a1.b(c1, c2);
                a1.b(c1, "Unknown");
                j1++;
            }
        }

        for (context = b.c().entrySet().iterator(); context.hasNext();)
        {
            c1 = (java.util.Map.Entry)context.next();
            c2 = ((List)c1.getValue()).iterator();
            while (c2.hasNext()) 
            {
                a1 = (com.google.android.gms.internal.ke.a)c2.next();
                if (!cl.d((com.google.android.gms.internal.h.a)a1.a().get(f.bM.toString())).booleanValue())
                {
                    a(k, (String)c1.getKey()).a(a1);
                }
            }
        }

    }

    private ba a(com.google.android.gms.internal.h.a a1, Set set, co co1)
    {
        if (!a1.l)
        {
            return new ba(a1, true);
        }
        com.google.android.gms.internal.h.a a4;
        int k1;
        switch (a1.a)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            ak.a((new StringBuilder("Unknown type: ")).append(a1.a).toString());
            return a;

        case 2: // '\002'
            com.google.android.gms.internal.h.a a2 = ke.a(a1);
            a2.c = new com.google.android.gms.internal.h.a[a1.c.length];
            for (int i1 = 0; i1 < a1.c.length; i1++)
            {
                ba ba1 = a(a1.c[i1], set, co1.a());
                if (ba1 == a)
                {
                    return a;
                }
                a2.c[i1] = (com.google.android.gms.internal.h.a)ba1.a();
            }

            return new ba(a2, false);

        case 3: // '\003'
            com.google.android.gms.internal.h.a a3 = ke.a(a1);
            if (a1.d.length != a1.e.length)
            {
                ak.a((new StringBuilder("Invalid serving value: ")).append(a1.toString()).toString());
                return a;
            }
            a3.d = new com.google.android.gms.internal.h.a[a1.d.length];
            a3.e = new com.google.android.gms.internal.h.a[a1.d.length];
            for (int j1 = 0; j1 < a1.d.length; j1++)
            {
                ba ba2 = a(a1.d[j1], set, co1.b());
                ba ba4 = a(a1.e[j1], set, co1.c());
                if (ba2 == a || ba4 == a)
                {
                    return a;
                }
                a3.d[j1] = (com.google.android.gms.internal.h.a)ba2.a();
                a3.e[j1] = (com.google.android.gms.internal.h.a)ba4.a();
            }

            return new ba(a3, false);

        case 4: // '\004'
            if (set.contains(a1.f))
            {
                ak.a((new StringBuilder("Macro cycle detected.  Current macro reference: ")).append(a1.f).append(".  Previous macro references: ").append(set.toString()).append(".").toString());
                return a;
            } else
            {
                set.add(a1.f);
                co1 = cp.a(a(a1.f, set, co1.e()), a1.k);
                set.remove(a1.f);
                return co1;
            }

        case 7: // '\007'
            a4 = ke.a(a1);
            a4.j = new com.google.android.gms.internal.h.a[a1.j.length];
            k1 = 0;
            break;
        }
        for (; k1 < a1.j.length; k1++)
        {
            ba ba3 = a(a1.j[k1], set, co1.d());
            if (ba3 == a)
            {
                return a;
            }
            a4.j[k1] = (com.google.android.gms.internal.h.a)ba3.a();
        }

        return new ba(a4, false);
    }

    private ba a(com.google.android.gms.internal.ke.a a1, Set set, bm bm1)
    {
        a1 = a(e, a1, set, bm1);
        set = cl.d((com.google.android.gms.internal.h.a)a1.a());
        cl.a(set);
        return new ba(set, a1.b());
    }

    private ba a(com.google.android.gms.internal.ke.e e1, Set set, bp bp1)
    {
        Iterator iterator = e1.b().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            ba ba2 = a((com.google.android.gms.internal.ke.a)iterator.next(), set, bp1.a());
            if (((Boolean)ba2.a()).booleanValue())
            {
                cl.a(Boolean.valueOf(false));
                return new ba(Boolean.valueOf(false), ba2.b());
            }
            if (flag && ba2.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (e1 = e1.a().iterator(); e1.hasNext();)
        {
            ba ba1 = a((com.google.android.gms.internal.ke.a)e1.next(), set, bp1.b());
            if (!((Boolean)ba1.a()).booleanValue())
            {
                cl.a(Boolean.valueOf(false));
                return new ba(Boolean.valueOf(false), ba1.b());
            }
            if (flag && ba1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }

        cl.a(Boolean.valueOf(true));
        return new ba(Boolean.valueOf(true), flag);
    }

    private ba a(String s1, Set set, an an1)
    {
        m = m + 1;
        Object obj = (b)h.a(s1);
        if (obj != null)
        {
            a(((b) (obj)).b(), set);
            m = m - 1;
            return ((b) (obj)).a();
        }
        obj = (c)k.get(s1);
        if (obj == null)
        {
            ak.a((new StringBuilder()).append(b()).append("Invalid macro: ").append(s1).toString());
            m = m - 1;
            return a;
        }
        ba ba1 = a(((c) (obj)).a(), ((c) (obj)).b(), ((c) (obj)).c(), ((c) (obj)).e(), ((c) (obj)).d(), set, an1.b());
        if (((Set)ba1.a()).isEmpty())
        {
            obj = ((c) (obj)).f();
        } else
        {
            if (((Set)ba1.a()).size() > 1)
            {
                ak.b((new StringBuilder()).append(b()).append("Multiple macros active for macroName ").append(s1).toString());
            }
            obj = (com.google.android.gms.internal.ke.a)((Set)ba1.a()).iterator().next();
        }
        if (obj == null)
        {
            m = m - 1;
            return a;
        }
        an1 = a(f, ((com.google.android.gms.internal.ke.a) (obj)), set, an1.a());
        boolean flag;
        if (ba1.b() && an1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (an1 == a)
        {
            an1 = a;
        } else
        {
            an1 = new ba(an1.a(), flag);
        }
        obj = ((com.google.android.gms.internal.ke.a) (obj)).b();
        if (an1.b())
        {
            h.a(s1, new b(an1, ((com.google.android.gms.internal.h.a) (obj))));
        }
        a(((com.google.android.gms.internal.h.a) (obj)), set);
        m = m - 1;
        return an1;
    }

    private ba a(Map map, com.google.android.gms.internal.ke.a a1, Set set, bm bm1)
    {
        boolean flag1 = true;
        Object obj = (com.google.android.gms.internal.h.a)a1.a().get(f.aZ.toString());
        if (obj == null)
        {
            ak.a("No function id in properties");
            map = a;
        } else
        {
            String s1 = ((com.google.android.gms.internal.h.a) (obj)).g;
            o o1 = (o)map.get(s1);
            if (o1 == null)
            {
                ak.a((new StringBuilder()).append(s1).append(" has no backing implementation.").toString());
                return a;
            }
            obj = (ba)g.a(a1);
            map = ((Map) (obj));
            if (obj == null)
            {
                map = new HashMap();
                Iterator iterator = a1.a().entrySet().iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    entry.getKey();
                    Object obj1 = bm1.a();
                    com.google.android.gms.internal.h.a a2 = (com.google.android.gms.internal.h.a)entry.getValue();
                    entry.getValue();
                    obj1 = a(a2, set, ((bo) (obj1)).a());
                    if (obj1 == a)
                    {
                        return a;
                    }
                    if (((ba) (obj1)).b())
                    {
                        a1.a((String)entry.getKey(), (com.google.android.gms.internal.h.a)((ba) (obj1)).a());
                    } else
                    {
                        flag = false;
                    }
                    map.put(entry.getKey(), ((ba) (obj1)).a());
                }
                if (!o1.a(map.keySet()))
                {
                    ak.a((new StringBuilder("Incorrect keys for function ")).append(s1).append(" required ").append(o1.c()).append(" had ").append(map.keySet()).toString());
                    return a;
                }
                if (!flag || !o1.a())
                {
                    flag1 = false;
                }
                set = new ba(o1.a(map), flag1);
                map = set;
                if (flag1)
                {
                    g.a(a1, set);
                    return set;
                }
            }
        }
        return map;
    }

    private ba a(Set set, Map map, Map map1, Map map2, Map map3, Set set1, bt bt1)
    {
        return a(set, set1, new a(map, map1, map2, map3) {

            final Map a;
            final Map b;
            final Map c;
            final Map d;
            final bu e;

            public final void a(com.google.android.gms.internal.ke.e e1, Set set2, Set set3, bp bp1)
            {
                List list = (List)a.get(e1);
                b.get(e1);
                if (list != null)
                {
                    set2.addAll(list);
                    bp1.c();
                }
                set2 = (List)c.get(e1);
                d.get(e1);
                if (set2 != null)
                {
                    set3.addAll(set2);
                    bp1.d();
                }
            }

            
            {
                e = bu.this;
                a = map;
                b = map1;
                c = map2;
                d = map3;
                super();
            }
        }, bt1);
    }

    private ba a(Set set, Set set1, a a1, bt bt1)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        set = set.iterator();
        boolean flag = true;
        while (set.hasNext()) 
        {
            com.google.android.gms.internal.ke.e e1 = (com.google.android.gms.internal.ke.e)set.next();
            bp bp1 = bt1.a();
            ba ba1 = a(e1, set1, bp1);
            if (((Boolean)ba1.a()).booleanValue())
            {
                a1.a(e1, hashset, hashset1, bp1);
            }
            if (flag && ba1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        hashset.removeAll(hashset1);
        return new ba(hashset, flag);
    }

    private static c a(Map map, String s1)
    {
        c c2 = (c)map.get(s1);
        c c1 = c2;
        if (c2 == null)
        {
            c1 = new c();
            map.put(s1, c1);
        }
        return c1;
    }

    private static String a(com.google.android.gms.internal.ke.a a1)
    {
        return cl.a((com.google.android.gms.internal.h.a)a1.a().get(f.bk.toString()));
    }

    private void a(com.google.android.gms.internal.h.a a1, Set set)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((a1 = a(a1, set, ((co) (new ay())))) != a)
        {
            a1 = ((com.google.android.gms.internal.h.a) (cl.e((com.google.android.gms.internal.h.a)a1.a())));
            if (a1 instanceof Map)
            {
                a1 = (Map)a1;
                j.a(a1);
                return;
            }
            if (a1 instanceof List)
            {
                a1 = ((List)a1).iterator();
                while (a1.hasNext()) 
                {
                    set = ((Set) (a1.next()));
                    if (set instanceof Map)
                    {
                        set = (Map)set;
                        j.a(set);
                    } else
                    {
                        ak.b("pushAfterEvaluate: value not a Map");
                    }
                }
            } else
            {
                ak.b("pushAfterEvaluate: value not a Map or List");
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void a(o o1)
    {
        a(f, o1);
    }

    private static void a(Map map, o o1)
    {
        if (map.containsKey(o1.b()))
        {
            throw new IllegalArgumentException((new StringBuilder("Duplicate function type name: ")).append(o1.b()).toString());
        } else
        {
            map.put(o1.b(), o1);
            return;
        }
    }

    private String b()
    {
        if (m <= 1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toString(m));
        for (int i1 = 2; i1 < m; i1++)
        {
            stringbuilder.append(' ');
        }

        stringbuilder.append(": ");
        return stringbuilder.toString();
    }

    private void b(o o1)
    {
        a(d, o1);
    }

    private void c(o o1)
    {
        a(e, o1);
    }

    private void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        l = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    final String a()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = l;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        c(s1);
        s1 = c.b().b();
        Object obj = i;
        Object obj1 = s1.b();
        for (obj = ((Set)a(((Set) (obj)), ((Set) (new HashSet())), new a() {

        final bu a;

        public final void a(com.google.android.gms.internal.ke.e e1, Set set, Set set1, bp bp1)
        {
            set.addAll(e1.c());
            set1.addAll(e1.d());
            bp1.e();
            bp1.f();
        }

            
            {
                a = bu.this;
                super();
            }
    }, ((bt) (obj1))).a()).iterator(); ((Iterator) (obj)).hasNext(); a(d, ((com.google.android.gms.internal.ke.a) (obj1)), ((Set) (new HashSet())), s1.a()))
        {
            obj1 = (com.google.android.gms.internal.ke.a)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_117;
        s1;
        throw s1;
        c(((String) (null)));
        this;
        JVM INSTR monitorexit ;
    }

    public final ba b(String s1)
    {
        m = 0;
        l l1 = c.a();
        return a(s1, new HashSet(), l1.a());
    }

}
