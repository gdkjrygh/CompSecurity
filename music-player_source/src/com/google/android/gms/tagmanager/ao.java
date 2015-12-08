// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.as;
import com.google.android.gms.internal.ej;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ad, ay, t, ak, 
//            az, ba, am, al, 
//            aj, bb, as, p, 
//            at, v, q, ag, 
//            ai, ap, an, ar, 
//            ac, b, o, bf, 
//            aq

final class ao
{

    private static final ad a = new ad(ay.a(), true);
    private final p b;
    private final Map c;
    private final Map d;
    private final Map e;
    private final bb f;
    private final bb g;
    private final Set h;
    private final b i;
    private final Map j;
    private volatile String k;
    private int l;

    private ad a(ej ej1, Set set, az az1)
    {
        if (!ej1.l)
        {
            return new ad(ej1, true);
        }
        ej ej4;
        int k1;
        switch (ej1.a)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            t.a((new StringBuilder("Unknown type: ")).append(ej1.a).toString());
            return a;

        case 2: // '\002'
            ej ej2 = ak.a(ej1);
            ej2.c = new ej[ej1.c.length];
            for (int i1 = 0; i1 < ej1.c.length; i1++)
            {
                ad ad1 = a(ej1.c[i1], set, az1.a());
                if (ad1 == a)
                {
                    return a;
                }
                ej2.c[i1] = (ej)ad1.a();
            }

            return new ad(ej2, false);

        case 3: // '\003'
            ej ej3 = ak.a(ej1);
            if (ej1.d.length != ej1.e.length)
            {
                t.a((new StringBuilder("Invalid serving value: ")).append(ej1.toString()).toString());
                return a;
            }
            ej3.d = new ej[ej1.d.length];
            ej3.e = new ej[ej1.d.length];
            for (int j1 = 0; j1 < ej1.d.length; j1++)
            {
                ad ad2 = a(ej1.d[j1], set, az1.b());
                ad ad4 = a(ej1.e[j1], set, az1.c());
                if (ad2 == a || ad4 == a)
                {
                    return a;
                }
                ej3.d[j1] = (ej)ad2.a();
                ej3.e[j1] = (ej)ad4.a();
            }

            return new ad(ej3, false);

        case 4: // '\004'
            if (set.contains(ej1.f))
            {
                t.a((new StringBuilder("Macro cycle detected.  Current macro reference: ")).append(ej1.f).append(".  Previous macro references: ").append(set.toString()).append(".").toString());
                return a;
            } else
            {
                set.add(ej1.f);
                az1 = ba.a(a(ej1.f, set, az1.e()), ej1.k);
                set.remove(ej1.f);
                return az1;
            }

        case 7: // '\007'
            ej4 = ak.a(ej1);
            ej4.j = new ej[ej1.j.length];
            k1 = 0;
            break;
        }
        for (; k1 < ej1.j.length; k1++)
        {
            ad ad3 = a(ej1.j[k1], set, az1.d());
            if (ad3 == a)
            {
                return a;
            }
            ej4.j[k1] = (ej)ad3.a();
        }

        return new ad(ej4, false);
    }

    private ad a(al al1, Set set, ag ag1)
    {
        al1 = a(d, al1, set, ag1);
        set = ay.b((ej)al1.a());
        ay.a(set);
        return new ad(set, al1.b());
    }

    private ad a(am am1, Set set, aj aj1)
    {
        Iterator iterator = am1.b().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            ad ad2 = a((al)iterator.next(), set, aj1.a());
            if (((Boolean)ad2.a()).booleanValue())
            {
                ay.a(Boolean.valueOf(false));
                return new ad(Boolean.valueOf(false), ad2.b());
            }
            if (flag && ad2.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (am1 = am1.a().iterator(); am1.hasNext();)
        {
            ad ad1 = a((al)am1.next(), set, aj1.b());
            if (!((Boolean)ad1.a()).booleanValue())
            {
                ay.a(Boolean.valueOf(false));
                return new ad(Boolean.valueOf(false), ad1.b());
            }
            if (flag && ad1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }

        ay.a(Boolean.valueOf(true));
        return new ad(Boolean.valueOf(true), flag);
    }

    private ad a(String s, Set set, v v1)
    {
        l = l + 1;
        Object obj = (com.google.android.gms.tagmanager.as)g.a();
        if (obj != null && !b.b())
        {
            a(((com.google.android.gms.tagmanager.as) (obj)).b(), set);
            l = l - 1;
            return ((com.google.android.gms.tagmanager.as) (obj)).a();
        }
        at at1 = (at)j.get(s);
        if (at1 == null)
        {
            t.a((new StringBuilder()).append(a()).append("Invalid macro: ").append(s).toString());
            l = l - 1;
            return a;
        }
        obj = a(at1.a(), at1.b(), at1.c(), at1.e(), at1.d(), set, v1.b());
        if (((Set)((ad) (obj)).a()).isEmpty())
        {
            s = at1.f();
        } else
        {
            if (((Set)((ad) (obj)).a()).size() > 1)
            {
                t.b((new StringBuilder()).append(a()).append("Multiple macros active for macroName ").append(s).toString());
            }
            s = (al)((Set)((ad) (obj)).a()).iterator().next();
        }
        if (s == null)
        {
            l = l - 1;
            return a;
        }
        v1 = a(e, ((al) (s)), set, v1.a());
        boolean flag;
        if (((ad) (obj)).b() && v1.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (v1 == a)
        {
            v1 = a;
        } else
        {
            v1 = new ad(v1.a(), flag);
        }
        s = s.b();
        if (v1.b())
        {
            bb bb1 = g;
            new com.google.android.gms.tagmanager.as(v1, s);
        }
        a(((ej) (s)), set);
        l = l - 1;
        return v1;
    }

    private ad a(Map map, al al1, Set set, ag ag1)
    {
        boolean flag1 = true;
        Object obj = (ej)al1.a().get(as.aC.toString());
        if (obj == null)
        {
            t.a("No function id in properties");
            map = a;
        } else
        {
            obj = ((ej) (obj)).g;
            q q1 = (q)map.get(obj);
            if (q1 == null)
            {
                t.a((new StringBuilder()).append(((String) (obj))).append(" has no backing implementation.").toString());
                return a;
            }
            map = (ad)f.a();
            if (map == null || b.b())
            {
                map = new HashMap();
                Iterator iterator = al1.a().entrySet().iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    entry.getKey();
                    Object obj1 = ag1.a();
                    ej ej1 = (ej)entry.getValue();
                    entry.getValue();
                    obj1 = a(ej1, set, ((ai) (obj1)).a());
                    if (obj1 == a)
                    {
                        return a;
                    }
                    if (((ad) (obj1)).b())
                    {
                        al1.a((String)entry.getKey(), (ej)((ad) (obj1)).a());
                    } else
                    {
                        flag = false;
                    }
                    map.put(entry.getKey(), ((ad) (obj1)).a());
                }
                if (!q1.a(map.keySet()))
                {
                    t.a((new StringBuilder("Incorrect keys for function ")).append(((String) (obj))).append(" required ").append(q1.c()).append(" had ").append(map.keySet()).toString());
                    return a;
                }
                if (!flag || !q1.a())
                {
                    flag1 = false;
                }
                map = new ad(q1.b(), flag1);
                if (flag1)
                {
                    al1 = f;
                }
                map.a();
                return map;
            }
        }
        return map;
    }

    private ad a(Set set, Map map, Map map1, Map map2, Map map3, Set set1, an an1)
    {
        return a(set, set1, ((ar) (new ap(this, map, map1, map2, map3))), an1);
    }

    private ad a(Set set, Set set1, ar ar1, an an1)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        set = set.iterator();
        boolean flag = true;
        while (set.hasNext()) 
        {
            am am1 = (am)set.next();
            aj aj1 = an1.a();
            ad ad1 = a(am1, set1, aj1);
            if (((Boolean)ad1.a()).booleanValue())
            {
                ar1.a(am1, hashset, hashset1, aj1);
            }
            if (flag && ad1.b())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        hashset.removeAll(hashset1);
        return new ad(hashset, flag);
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

    private void a(ej ej1, Set set)
    {
        if (ej1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((ej1 = a(ej1, set, ((az) (new ac())))) != a)
        {
            ej1 = ((ej) (ay.c((ej)ej1.a())));
            if (ej1 instanceof Map)
            {
                ej1 = (Map)ej1;
                i.a(ej1);
                return;
            }
            if (ej1 instanceof List)
            {
                ej1 = ((List)ej1).iterator();
                while (ej1.hasNext()) 
                {
                    set = ((Set) (ej1.next()));
                    if (set instanceof Map)
                    {
                        set = (Map)set;
                        i.a(set);
                    } else
                    {
                        t.b("pushAfterEvaluate: value not a Map");
                    }
                }
            } else
            {
                t.b("pushAfterEvaluate: value not a Map or List");
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        k = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        b(s);
        s = b.a().a();
        Object obj = h;
        Object obj1 = s.b();
        for (obj = ((Set)a(((Set) (obj)), ((Set) (new HashSet())), ((ar) (new aq(this))), ((an) (obj1))).a()).iterator(); ((Iterator) (obj)).hasNext(); a(c, ((al) (obj1)), ((Set) (new HashSet())), s.a()))
        {
            obj1 = (al)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_117;
        s;
        throw s;
        b(null);
        this;
        JVM INSTR monitorexit ;
    }

}
