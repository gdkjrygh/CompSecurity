// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.g;
import com.google.android.gms.internal.xn;
import com.google.android.gms.internal.xo;
import com.google.android.gms.internal.xp;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ai, be, y, bf, 
//            bg, ao, bh, au, 
//            r, av, aa, s, 
//            al, an, ar, ap, 
//            at, ah, c, q, 
//            bm, as

final class aq
{

    private static final ai a = new ai(be.a(), true);
    private final r b;
    private final Map c;
    private final Map d;
    private final Map e;
    private final bh f;
    private final bh g;
    private final Set h;
    private final c i;
    private final Map j;
    private volatile String k;
    private int l;

    private ai a(g g1, Set set, bf bf1)
    {
        if (!g1.l)
        {
            return new ai(g1, true);
        }
        g g4;
        int k1;
        switch (g1.a)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            y.a((new StringBuilder("Unknown type: ")).append(g1.a).toString());
            return a;

        case 2: // '\002'
            g g2 = xn.a(g1);
            g2.c = new g[g1.c.length];
            for (int i1 = 0; i1 < g1.c.length; i1++)
            {
                ai ai1 = a(g1.c[i1], set, bf1.a());
                if (ai1 == a)
                {
                    return a;
                }
                g2.c[i1] = (g)ai1.a();
            }

            return new ai(g2, false);

        case 3: // '\003'
            g g3 = xn.a(g1);
            if (g1.d.length != g1.e.length)
            {
                y.a((new StringBuilder("Invalid serving value: ")).append(g1.toString()).toString());
                return a;
            }
            g3.d = new g[g1.d.length];
            g3.e = new g[g1.d.length];
            for (int j1 = 0; j1 < g1.d.length; j1++)
            {
                ai ai2 = a(g1.d[j1], set, bf1.b());
                ai ai4 = a(g1.e[j1], set, bf1.c());
                if (ai2 == a || ai4 == a)
                {
                    return a;
                }
                g3.d[j1] = (g)ai2.a();
                g3.e[j1] = (g)ai4.a();
            }

            return new ai(g3, false);

        case 4: // '\004'
            if (set.contains(g1.f))
            {
                y.a((new StringBuilder("Macro cycle detected.  Current macro reference: ")).append(g1.f).append(".  Previous macro references: ").append(set.toString()).append(".").toString());
                return a;
            } else
            {
                set.add(g1.f);
                bf1 = bg.a(a(g1.f, set, bf1.e()), g1.k);
                set.remove(g1.f);
                return bf1;
            }

        case 7: // '\007'
            g4 = xn.a(g1);
            g4.j = new g[g1.j.length];
            k1 = 0;
            break;
        }
        for (; k1 < g1.j.length; k1++)
        {
            ai ai3 = a(g1.j[k1], set, bf1.d());
            if (ai3 == a)
            {
                return a;
            }
            g4.j[k1] = (g)ai3.a();
        }

        return new ai(g4, false);
    }

    private ai a(xo xo1, Set set, al al1)
    {
        xo1 = a(d, xo1, set, al1);
        set = be.b((g)xo1.a());
        be.a(set);
        return new ai(set, xo1.b());
    }

    private ai a(xp xp1, Set set, ao ao1)
    {
        Iterator iterator = xp1.b().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            ai ai2 = a((xo)iterator.next(), set, ao1.a());
            if (((Boolean)ai2.a()).booleanValue())
            {
                be.a(Boolean.valueOf(false));
                return new ai(Boolean.valueOf(false), ai2.b());
            }
            if (flag && ai2.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (xp1 = xp1.a().iterator(); xp1.hasNext();)
        {
            ai ai1 = a((xo)xp1.next(), set, ao1.b());
            if (!((Boolean)ai1.a()).booleanValue())
            {
                be.a(Boolean.valueOf(false));
                return new ai(Boolean.valueOf(false), ai1.b());
            }
            if (flag && ai1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }

        be.a(Boolean.valueOf(true));
        return new ai(Boolean.valueOf(true), flag);
    }

    private ai a(String s1, Set set, aa aa1)
    {
        l = l + 1;
        Object obj = (au)g.a();
        if (obj != null && !b.b())
        {
            a(((au) (obj)).b(), set);
            l = l - 1;
            return ((au) (obj)).a();
        }
        av av1 = (av)j.get(s1);
        if (av1 == null)
        {
            y.a((new StringBuilder()).append(a()).append("Invalid macro: ").append(s1).toString());
            l = l - 1;
            return a;
        }
        obj = a(av1.a(), av1.b(), av1.c(), av1.e(), av1.d(), set, aa1.b());
        if (((Set)((ai) (obj)).a()).isEmpty())
        {
            s1 = av1.f();
        } else
        {
            if (((Set)((ai) (obj)).a()).size() > 1)
            {
                y.b((new StringBuilder()).append(a()).append("Multiple macros active for macroName ").append(s1).toString());
            }
            s1 = (xo)((Set)((ai) (obj)).a()).iterator().next();
        }
        if (s1 == null)
        {
            l = l - 1;
            return a;
        }
        aa1 = a(e, ((xo) (s1)), set, aa1.a());
        boolean flag;
        if (((ai) (obj)).b() && aa1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (aa1 == a)
        {
            aa1 = a;
        } else
        {
            aa1 = new ai(aa1.a(), flag);
        }
        s1 = s1.b();
        if (aa1.b())
        {
            new au(aa1, s1);
        }
        a(((g) (s1)), set);
        l = l - 1;
        return aa1;
    }

    private ai a(Map map, xo xo1, Set set, al al1)
    {
        boolean flag1 = true;
        Object obj = (g)xo1.a().get(e.aZ.toString());
        if (obj == null)
        {
            y.a("No function id in properties");
            map = a;
        } else
        {
            obj = ((g) (obj)).g;
            s s1 = (s)map.get(obj);
            if (s1 == null)
            {
                y.a((new StringBuilder()).append(((String) (obj))).append(" has no backing implementation.").toString());
                return a;
            }
            map = (ai)f.a();
            if (map == null || b.b())
            {
                map = new HashMap();
                Iterator iterator = xo1.a().entrySet().iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    entry.getKey();
                    Object obj1 = al1.a();
                    g g1 = (g)entry.getValue();
                    entry.getValue();
                    obj1 = a(g1, set, ((an) (obj1)).a());
                    if (obj1 == a)
                    {
                        return a;
                    }
                    if (((ai) (obj1)).b())
                    {
                        xo1.a((String)entry.getKey(), (g)((ai) (obj1)).a());
                    } else
                    {
                        flag = false;
                    }
                    map.put(entry.getKey(), ((ai) (obj1)).a());
                }
                if (!s1.a(map.keySet()))
                {
                    y.a((new StringBuilder("Incorrect keys for function ")).append(((String) (obj))).append(" required ").append(s1.c()).append(" had ").append(map.keySet()).toString());
                    return a;
                }
                if (!flag || !s1.a())
                {
                    flag1 = false;
                }
                return new ai(s1.b(), flag1);
            }
        }
        return map;
    }

    private ai a(Set set, Map map, Map map1, Map map2, Map map3, Set set1, ap ap1)
    {
        return a(set, set1, ((at) (new ar(this, map, map1, map2, map3))), ap1);
    }

    private ai a(Set set, Set set1, at at1, ap ap1)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        set = set.iterator();
        boolean flag = true;
        while (set.hasNext()) 
        {
            xp xp1 = (xp)set.next();
            ao ao1 = ap1.a();
            ai ai1 = a(xp1, set1, ao1);
            if (((Boolean)ai1.a()).booleanValue())
            {
                at1.a(xp1, hashset, hashset1, ao1);
            }
            if (flag && ai1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        hashset.removeAll(hashset1);
        return new ai(hashset, flag);
    }

    private String a()
    {
        if (l <= 1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toString(l));
        for (int i1 = 2; i1 < l; i1++)
        {
            stringbuilder.append(' ');
        }

        stringbuilder.append(": ");
        return stringbuilder.toString();
    }

    private void a(g g1, Set set)
    {
        if (g1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((g1 = a(g1, set, ((bf) (new ah())))) != a)
        {
            g1 = ((g) (be.c((g)g1.a())));
            if (g1 instanceof Map)
            {
                g1 = (Map)g1;
                i.a(g1);
                return;
            }
            if (g1 instanceof List)
            {
                g1 = ((List)g1).iterator();
                while (g1.hasNext()) 
                {
                    set = ((Set) (g1.next()));
                    if (set instanceof Map)
                    {
                        set = (Map)set;
                        i.a(set);
                    } else
                    {
                        y.b("pushAfterEvaluate: value not a Map");
                    }
                }
            } else
            {
                y.b("pushAfterEvaluate: value not a Map or List");
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        k = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public final void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        b(s1);
        s1 = b.a().a();
        Object obj = h;
        Object obj1 = s1.b();
        for (obj = ((Set)a(((Set) (obj)), ((Set) (new HashSet())), ((at) (new as(this))), ((ap) (obj1))).a()).iterator(); ((Iterator) (obj)).hasNext(); a(c, ((xo) (obj1)), ((Set) (new HashSet())), s1.a()))
        {
            obj1 = (xo)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_117;
        s1;
        throw s1;
        b(null);
        this;
        JVM INSTR monitorexit ;
    }

}
