// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ltb
{

    private static final lsj a = new lsj(ltw.f(), true);
    private final lfv b;
    private final lri c;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final luh g;
    private final luh h;
    private final Set i;
    private final lpu j;
    private final Map k = new HashMap();
    private volatile String l;
    private int m;

    public ltb(Context context, lfv lfv1, lpu lpu1, luo luo, luo luo1, lri lri1)
    {
        if (lfv1 == null)
        {
            throw new NullPointerException("resource cannot be null");
        }
        b = lfv1;
        i = new HashSet(lfv1.a);
        j = lpu1;
        c = lri1;
        lfv1 = new ltc(this);
        g = (new lui()).a(0x100000, lfv1);
        lfv1 = new ltd(this);
        h = (new lui()).a(0x100000, lfv1);
        b(new lue(context));
        b(new lun(luo1));
        b(new lux(lpu1));
        b(new lqy(context, lpu1));
        b(new ltt(context, lpu1));
        c(new lum());
        c(new lvc());
        c(new lqc());
        c(new lrk());
        c(new lrl());
        c(new lsa());
        c(new lsb());
        c(new lss());
        c(new ltr());
        a(new lrg(context));
        a(new lsh(context));
        a(new ltz(context));
        a(new lua(context));
        a(new lub(context));
        a(new luc(context));
        a(new lud(context));
        a(new luk());
        a(new lul(b.c));
        a(new lun(luo));
        a(new luq(lpu1));
        a(new luy(context));
        a(new luz());
        a(new lvb());
        a(new lrj(this));
        a(new lrm());
        a(new lrn());
        a(new lru(context));
        a(new lrv());
        a(new lqg());
        a(new lsd());
        a(new lsf(context));
        a(new lsk());
        a(new lso());
        a(new lsp());
        a(new lsr());
        a(new lst(context));
        a(new ltj());
        a(new ltk());
        a(new lts());
        a(new ltx());
        for (lpu1 = i.iterator(); lpu1.hasNext();)
        {
            luo = (lfx)lpu1.next();
            for (int i1 = 0; i1 < ((lfx) (luo)).e.size(); i1++)
            {
                lri1 = (lft)((lfx) (luo)).e.get(i1);
                luo1 = a(k, a(lri1));
                luo1.a(luo);
                lfv1 = (List)((lti) (luo1)).b.get(luo);
                context = lfv1;
                if (lfv1 == null)
                {
                    context = new ArrayList();
                    ((lti) (luo1)).b.put(luo, context);
                }
                context.add(lri1);
                lfv1 = (List)((lti) (luo1)).d.get(luo);
                context = lfv1;
                if (lfv1 == null)
                {
                    context = new ArrayList();
                    ((lti) (luo1)).d.put(luo, context);
                }
                context.add("Unknown");
            }

            int j1 = 0;
            while (j1 < ((lfx) (luo)).f.size()) 
            {
                lri1 = (lft)((lfx) (luo)).f.get(j1);
                luo1 = a(k, a(lri1));
                luo1.a(luo);
                lfv1 = (List)((lti) (luo1)).c.get(luo);
                context = lfv1;
                if (lfv1 == null)
                {
                    context = new ArrayList();
                    ((lti) (luo1)).c.put(luo, context);
                }
                context.add(lri1);
                lfv1 = (List)((lti) (luo1)).e.get(luo);
                context = lfv1;
                if (lfv1 == null)
                {
                    context = new ArrayList();
                    ((lti) (luo1)).e.put(luo, context);
                }
                context.add("Unknown");
                j1++;
            }
        }

        for (context = b.b.entrySet().iterator(); context.hasNext();)
        {
            lfv1 = (java.util.Map.Entry)context.next();
            lpu1 = ((List)lfv1.getValue()).iterator();
            while (lpu1.hasNext()) 
            {
                luo = (lft)lpu1.next();
                if (!ltw.d((ksp)Collections.unmodifiableMap(((lft) (luo)).a).get(ksf.C.toString())).booleanValue())
                {
                    a(k, (String)lfv1.getKey()).f = luo;
                }
            }
        }

    }

    private static String a(lft lft1)
    {
        return ltw.a((ksp)Collections.unmodifiableMap(lft1.a).get(ksf.u.toString()));
    }

    private lsj a(String s, Set set, lse lse1)
    {
        m = m + 1;
        Object obj = (lth)h.a(s);
        if (obj != null)
        {
            a(((lth) (obj)).b, set);
            m = m - 1;
            return ((lth) (obj)).a;
        }
        obj = (lti)k.get(s);
        if (obj == null)
        {
            lqh.a((new StringBuilder()).append(b()).append("Invalid macro: ").append(s).toString());
            m = m - 1;
            return a;
        }
        lsj lsj1 = a(((lti) (obj)).a, ((lti) (obj)).b, ((lti) (obj)).d, ((lti) (obj)).c, ((lti) (obj)).e, set, lse1.b());
        if (((Set)lsj1.a).isEmpty())
        {
            obj = ((lti) (obj)).f;
        } else
        {
            if (((Set)lsj1.a).size() > 1)
            {
                lqh.b((new StringBuilder()).append(b()).append("Multiple macros active for macroName ").append(s).toString());
            }
            obj = (lft)((Set)lsj1.a).iterator().next();
        }
        if (obj == null)
        {
            m = m - 1;
            return a;
        }
        lse1 = a(f, ((lft) (obj)), set, lse1.a());
        boolean flag;
        if (lsj1.b && ((lsj) (lse1)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (lse1 == a)
        {
            lse1 = a;
        } else
        {
            lse1 = new lsj(((lsj) (lse1)).a, flag);
        }
        obj = ((lft) (obj)).b;
        if (((lsj) (lse1)).b)
        {
            h.a(s, new lth(lse1, ((ksp) (obj))));
        }
        a(((ksp) (obj)), set);
        m = m - 1;
        return lse1;
    }

    private lsj a(Map map, lft lft1, Set set, lsu lsu1)
    {
        Object obj = (ksp)Collections.unmodifiableMap(lft1.a).get(ksf.p.toString());
        if (obj == null)
        {
            lqh.a("No function id in properties");
            map = a;
        } else
        {
            String s = ((ksp) (obj)).i;
            lqd lqd1 = (lqd)map.get(s);
            if (lqd1 == null)
            {
                lqh.a((new StringBuilder()).append(s).append(" has no backing implementation.").toString());
                return a;
            }
            obj = (lsj)g.a(lft1);
            map = ((Map) (obj));
            if (obj == null)
            {
                map = new HashMap();
                boolean flag = true;
                Iterator iterator = Collections.unmodifiableMap(lft1.a).entrySet().iterator();
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    entry.getKey();
                    Object obj1 = lsu1.a();
                    ksp ksp1 = (ksp)entry.getValue();
                    entry.getValue();
                    obj1 = a(ksp1, set, ((lsv) (obj1)).a());
                    if (obj1 == a)
                    {
                        return a;
                    }
                    if (((lsj) (obj1)).b)
                    {
                        String s1 = (String)entry.getKey();
                        ksp ksp2 = (ksp)((lsj) (obj1)).a;
                        lft1.a.put(s1, ksp2);
                    } else
                    {
                        flag = false;
                    }
                    map.put(entry.getKey(), ((lsj) (obj1)).a);
                }
                if (!map.keySet().containsAll(lqd1.a))
                {
                    lqh.a((new StringBuilder("Incorrect keys for function ")).append(s).append(" required ").append(lqd1.c()).append(" had ").append(map.keySet()).toString());
                    return a;
                }
                boolean flag1;
                if (flag && lqd1.b())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                map = new lsj(lqd1.a(map), flag1);
                if (flag1)
                {
                    g.a(lft1, map);
                }
                return map;
            }
        }
        return map;
    }

    private lsj a(Set set, Map map, Map map1, Map map2, Map map3, Set set1, lta lta1)
    {
        return a(set, set1, ((ltg) (new lte(this, map, map1, map2, map3))), lta1);
    }

    private lsj a(Set set, Set set1, ltg ltg1, lta lta1)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        set = set.iterator();
        boolean flag = true;
        while (set.hasNext()) 
        {
            lfx lfx1 = (lfx)set.next();
            lsw lsw1 = lta1.a();
            lsj lsj1 = a(lfx1, set1, lsw1);
            if (((Boolean)lsj1.a).booleanValue())
            {
                ltg1.a(lfx1, hashset, hashset1, lsw1);
            }
            if (flag && lsj1.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        hashset.removeAll(hashset1);
        return new lsj(hashset, flag);
    }

    private lsj a(ksp ksp1, Set set, lty lty1)
    {
        if (!ksp1.n)
        {
            return new lsj(ksp1, true);
        }
        ksp ksp4;
        int k1;
        switch (ksp1.c)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            lqh.a((new StringBuilder("Unknown type: ")).append(ksp1.c).toString());
            return a;

        case 2: // '\002'
            ksp ksp2 = b.a(ksp1);
            ksp2.e = new ksp[ksp1.e.length];
            for (int i1 = 0; i1 < ksp1.e.length; i1++)
            {
                lsj lsj1 = a(ksp1.e[i1], set, lty1.a());
                if (lsj1 == a)
                {
                    return a;
                }
                ksp2.e[i1] = (ksp)lsj1.a;
            }

            return new lsj(ksp2, false);

        case 3: // '\003'
            ksp ksp3 = b.a(ksp1);
            if (ksp1.f.length != ksp1.g.length)
            {
                lqh.a((new StringBuilder("Invalid serving value: ")).append(ksp1.toString()).toString());
                return a;
            }
            ksp3.f = new ksp[ksp1.f.length];
            ksp3.g = new ksp[ksp1.f.length];
            for (int j1 = 0; j1 < ksp1.f.length; j1++)
            {
                lsj lsj2 = a(ksp1.f[j1], set, lty1.b());
                lsj lsj4 = a(ksp1.g[j1], set, lty1.c());
                if (lsj2 == a || lsj4 == a)
                {
                    return a;
                }
                ksp3.f[j1] = (ksp)lsj2.a;
                ksp3.g[j1] = (ksp)lsj4.a;
            }

            return new lsj(ksp3, false);

        case 4: // '\004'
            if (set.contains(ksp1.h))
            {
                lqh.a((new StringBuilder("Macro cycle detected.  Current macro reference: ")).append(ksp1.h).append(".  Previous macro references: ").append(set.toString()).append(".").toString());
                return a;
            } else
            {
                set.add(ksp1.h);
                lty1 = b.a(a(ksp1.h, set, lty1.e()), ksp1.m);
                set.remove(ksp1.h);
                return lty1;
            }

        case 7: // '\007'
            ksp4 = b.a(ksp1);
            ksp4.l = new ksp[ksp1.l.length];
            k1 = 0;
            break;
        }
        for (; k1 < ksp1.l.length; k1++)
        {
            lsj lsj3 = a(ksp1.l[k1], set, lty1.d());
            if (lsj3 == a)
            {
                return a;
            }
            ksp4.l[k1] = (ksp)lsj3.a;
        }

        return new lsj(ksp4, false);
    }

    private lsj a(lft lft1, Set set, lsu lsu1)
    {
        lft1 = a(e, lft1, set, lsu1);
        set = ltw.d((ksp)((lsj) (lft1)).a);
        ltw.a(set);
        return new lsj(set, ((lsj) (lft1)).b);
    }

    private lsj a(lfx lfx1, Set set, lsw lsw1)
    {
        Iterator iterator = lfx1.b.iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            lsj lsj2 = a((lft)iterator.next(), set, lsw1.a());
            if (((Boolean)lsj2.a).booleanValue())
            {
                ltw.a(Boolean.valueOf(false));
                return new lsj(Boolean.valueOf(false), lsj2.b);
            }
            if (flag && lsj2.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (lfx1 = lfx1.a.iterator(); lfx1.hasNext();)
        {
            lsj lsj1 = a((lft)lfx1.next(), set, lsw1.b());
            if (!((Boolean)lsj1.a).booleanValue())
            {
                ltw.a(Boolean.valueOf(false));
                return new lsj(Boolean.valueOf(false), lsj1.b);
            }
            if (flag && lsj1.b)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }

        ltw.a(Boolean.valueOf(true));
        return new lsj(Boolean.valueOf(true), flag);
    }

    private static lti a(Map map, String s)
    {
        lti lti2 = (lti)map.get(s);
        lti lti1 = lti2;
        if (lti2 == null)
        {
            lti1 = new lti();
            map.put(s, lti1);
        }
        return lti1;
    }

    private static void a(Map map, lqd lqd1)
    {
        if (map.containsKey(lqd1.a()))
        {
            throw new IllegalArgumentException((new StringBuilder("Duplicate function type name: ")).append(lqd1.a()).toString());
        } else
        {
            map.put(lqd1.a(), lqd1);
            return;
        }
    }

    private void a(ksp ksp1, Set set)
    {
        if (ksp1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((ksp1 = a(ksp1, set, new lty())) != a)
        {
            ksp1 = ((ksp) (ltw.e((ksp)((lsj) (ksp1)).a)));
            if (ksp1 instanceof Map)
            {
                ksp1 = (Map)ksp1;
                j.a(ksp1);
                return;
            }
            if (ksp1 instanceof List)
            {
                ksp1 = ((List)ksp1).iterator();
                while (ksp1.hasNext()) 
                {
                    set = ((Set) (ksp1.next()));
                    if (set instanceof Map)
                    {
                        set = (Map)set;
                        j.a(set);
                    } else
                    {
                        lqh.b("pushAfterEvaluate: value not a Map");
                    }
                }
            } else
            {
                lqh.b("pushAfterEvaluate: value not a Map or List");
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void a(lqd lqd1)
    {
        a(f, lqd1);
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

    private void b(lqd lqd1)
    {
        a(d, lqd1);
    }

    private void c(String s)
    {
        this;
        JVM INSTR monitorenter ;
        l = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void c(lqd lqd1)
    {
        a(e, lqd1);
    }

    final String a()
    {
        this;
        JVM INSTR monitorenter ;
        String s = l;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        c(s);
        s = c.b().b();
        Object obj = i;
        Object obj1 = s.b();
        for (obj = ((Set)a(((Set) (obj)), ((Set) (new HashSet())), ((ltg) (new ltf(this))), ((lta) (obj1))).a).iterator(); ((Iterator) (obj)).hasNext(); a(d, ((lft) (obj1)), ((Set) (new HashSet())), s.a()))
        {
            obj1 = (lft)((Iterator) (obj)).next();
        }

        break MISSING_BLOCK_LABEL_109;
        s;
        throw s;
        c(((String) (null)));
        this;
        JVM INSTR monitorexit ;
    }

    public final lsj b(String s)
    {
        m = 0;
        lrh lrh1 = c.a();
        return a(s, new HashSet(), lrh1.a());
    }

}
