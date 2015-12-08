// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            by, dh, l, i, 
//            s, w, di, q, 
//            ad, ae, al, am, 
//            bd, be, ch, db, 
//            b, c, e, f, 
//            g, h, m, p, 
//            u, z, aa, ac, 
//            ah, an, ao, ax, 
//            az, bc, bk, bz, 
//            cb, ce, cg, ci, 
//            ct, cu, dd, ag, 
//            bh, cq, dj, dk, 
//            k, bj, aj, cj, 
//            cl, cr, bw, DataLayer, 
//            cm, af, t, ai, 
//            ck

class cs
{
    static interface a
    {

        public abstract void a(cq.e e1, Set set, Set set1, cm cm1);
    }

    private static class b
    {

        private com.google.android.gms.internal.d.a agV;
        private by ahA;

        public int getSize()
        {
            int i1 = ((com.google.android.gms.internal.d.a)ahA.getObject()).nU();
            int j;
            if (agV == null)
            {
                j = 0;
            } else
            {
                j = agV.nU();
            }
            return j + i1;
        }

        public by mE()
        {
            return ahA;
        }

        public com.google.android.gms.internal.d.a mk()
        {
            return agV;
        }

        public b(by by1, com.google.android.gms.internal.d.a a1)
        {
            ahA = by1;
            agV = a1;
        }
    }

    private static class c
    {

        private final Map ahB = new HashMap();
        private final Map ahC = new HashMap();
        private final Map ahD = new HashMap();
        private final Map ahE = new HashMap();
        private cq.a ahF;
        private final Set ahr = new HashSet();

        public void a(cq.e e1, cq.a a1)
        {
            List list = (List)ahB.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ahB.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public void a(cq.e e1, String s1)
        {
            List list = (List)ahD.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ahD.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public void b(cq.e e1)
        {
            ahr.add(e1);
        }

        public void b(cq.e e1, cq.a a1)
        {
            List list = (List)ahC.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ahC.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public void b(cq.e e1, String s1)
        {
            List list = (List)ahE.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ahE.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public void i(cq.a a1)
        {
            ahF = a1;
        }

        public Set mF()
        {
            return ahr;
        }

        public Map mG()
        {
            return ahB;
        }

        public Map mH()
        {
            return ahD;
        }

        public Map mI()
        {
            return ahE;
        }

        public Map mJ()
        {
            return ahC;
        }

        public cq.a mK()
        {
            return ahF;
        }

        public c()
        {
        }
    }


    private static final by ahj = new by(dh.mY(), true);
    private final DataLayer aer;
    private final cq.c ahk;
    private final ag ahl;
    private final Map ahm = new HashMap();
    private final Map ahn = new HashMap();
    private final Map aho = new HashMap();
    private final k ahp;
    private final k ahq;
    private final Set ahr;
    private final Map ahs = new HashMap();
    private volatile String aht;
    private int ahu;

    public cs(Context context, cq.c c1, DataLayer datalayer, s.a a1, s.a a2, ag ag1)
    {
        if (c1 == null)
        {
            throw new NullPointerException("resource cannot be null");
        }
        ahk = c1;
        ahr = new HashSet(c1.mn());
        aer = datalayer;
        ahl = ag1;
        c1 = new l.a() {

            final cs ahv;

            public int a(cq.a a3, by by1)
            {
                return ((com.google.android.gms.internal.d.a)by1.getObject()).nU();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((cq.a)obj, (by)obj1);
            }

            
            {
                ahv = cs.this;
                super();
            }
        };
        ahp = (new l()).a(0x100000, c1);
        c1 = new l.a() {

            final cs ahv;

            public int a(String s1, b b1)
            {
                return s1.length() + b1.getSize();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((String)obj, (b)obj1);
            }

            
            {
                ahv = cs.this;
                super();
            }
        };
        ahq = (new l()).a(0x100000, c1);
        b(new i(context));
        b(new s(a2));
        b(new w(datalayer));
        b(new di(context, datalayer));
        c(new q());
        c(new ad());
        c(new ae());
        c(new al());
        c(new am());
        c(new bd());
        c(new be());
        c(new ch());
        c(new db());
        a(new com.google.android.gms.tagmanager.b(context));
        a(new com.google.android.gms.tagmanager.c(context));
        a(new e(context));
        a(new f(context));
        a(new g(context));
        a(new h(context));
        a(new m());
        a(new p(ahk.getVersion()));
        a(new s(a1));
        a(new u(datalayer));
        a(new z(context));
        a(new aa());
        a(new ac());
        a(new ah(this));
        a(new an());
        a(new ao());
        a(new ax(context));
        a(new az());
        a(new bc());
        a(new bk(context));
        a(new bz());
        a(new cb());
        a(new ce());
        a(new cg());
        a(new ci(context));
        a(new ct());
        a(new cu());
        a(new dd());
        for (datalayer = ahr.iterator(); datalayer.hasNext();)
        {
            a1 = (cq.e)datalayer.next();
            if (ag1.lF())
            {
                a(a1.mv(), a1.mw(), "add macro");
                a(a1.mA(), a1.mx(), "remove macro");
                a(a1.mt(), a1.my(), "add tag");
                a(a1.mu(), a1.mz(), "remove tag");
            }
            for (int j = 0; j < a1.mv().size(); j++)
            {
                a2 = (cq.a)a1.mv().get(j);
                c1 = "Unknown";
                context = c1;
                if (ag1.lF())
                {
                    context = c1;
                    if (j < a1.mw().size())
                    {
                        context = (String)a1.mw().get(j);
                    }
                }
                c1 = d(ahs, h(a2));
                c1.b(a1);
                c1.a(a1, a2);
                c1.a(a1, context);
            }

            int i1 = 0;
            while (i1 < a1.mA().size()) 
            {
                a2 = (cq.a)a1.mA().get(i1);
                c1 = "Unknown";
                context = c1;
                if (ag1.lF())
                {
                    context = c1;
                    if (i1 < a1.mx().size())
                    {
                        context = (String)a1.mx().get(i1);
                    }
                }
                c1 = d(ahs, h(a2));
                c1.b(a1);
                c1.b(a1, a2);
                c1.b(a1, context);
                i1++;
            }
        }

        for (context = ahk.mo().entrySet().iterator(); context.hasNext();)
        {
            c1 = (java.util.Map.Entry)context.next();
            datalayer = ((List)c1.getValue()).iterator();
            while (datalayer.hasNext()) 
            {
                a1 = (cq.a)datalayer.next();
                if (!dh.n((com.google.android.gms.internal.d.a)a1.mj().get(com.google.android.gms.internal.b.dh.toString())).booleanValue())
                {
                    d(ahs, (String)c1.getKey()).i(a1);
                }
            }
        }

    }

    private by a(com.google.android.gms.internal.d.a a1, Set set, dj dj1)
    {
        if (!a1.fX)
        {
            return new by(a1, true);
        }
        com.google.android.gms.internal.d.a a4;
        int j1;
        switch (a1.type)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            bh.A((new StringBuilder()).append("Unknown type: ").append(a1.type).toString());
            return ahj;

        case 2: // '\002'
            com.google.android.gms.internal.d.a a2 = cq.g(a1);
            a2.fO = new com.google.android.gms.internal.d.a[a1.fO.length];
            for (int j = 0; j < a1.fO.length; j++)
            {
                by by1 = a(a1.fO[j], set, dj1.dq(j));
                if (by1 == ahj)
                {
                    return ahj;
                }
                a2.fO[j] = (com.google.android.gms.internal.d.a)by1.getObject();
            }

            return new by(a2, false);

        case 3: // '\003'
            com.google.android.gms.internal.d.a a3 = cq.g(a1);
            if (a1.fP.length != a1.fQ.length)
            {
                bh.A((new StringBuilder()).append("Invalid serving value: ").append(a1.toString()).toString());
                return ahj;
            }
            a3.fP = new com.google.android.gms.internal.d.a[a1.fP.length];
            a3.fQ = new com.google.android.gms.internal.d.a[a1.fP.length];
            for (int i1 = 0; i1 < a1.fP.length; i1++)
            {
                by by2 = a(a1.fP[i1], set, dj1.dr(i1));
                by by4 = a(a1.fQ[i1], set, dj1.ds(i1));
                if (by2 == ahj || by4 == ahj)
                {
                    return ahj;
                }
                a3.fP[i1] = (com.google.android.gms.internal.d.a)by2.getObject();
                a3.fQ[i1] = (com.google.android.gms.internal.d.a)by4.getObject();
            }

            return new by(a3, false);

        case 4: // '\004'
            if (set.contains(a1.fR))
            {
                bh.A((new StringBuilder()).append("Macro cycle detected.  Current macro reference: ").append(a1.fR).append(".").append("  Previous macro references: ").append(set.toString()).append(".").toString());
                return ahj;
            } else
            {
                set.add(a1.fR);
                dj1 = dk.a(a(a1.fR, set, dj1.lU()), a1.fW);
                set.remove(a1.fR);
                return dj1;
            }

        case 7: // '\007'
            a4 = cq.g(a1);
            a4.fV = new com.google.android.gms.internal.d.a[a1.fV.length];
            j1 = 0;
            break;
        }
        for (; j1 < a1.fV.length; j1++)
        {
            by by3 = a(a1.fV[j1], set, dj1.dt(j1));
            if (by3 == ahj)
            {
                return ahj;
            }
            a4.fV[j1] = (com.google.android.gms.internal.d.a)by3.getObject();
        }

        return new by(a4, false);
    }

    private by a(String s1, Set set, bj bj1)
    {
        ahu = ahu + 1;
        Object obj = (b)ahq.get(s1);
        if (obj != null && !ahl.lF())
        {
            a(((b) (obj)).mk(), set);
            ahu = ahu - 1;
            return ((b) (obj)).mE();
        }
        obj = (c)ahs.get(s1);
        if (obj == null)
        {
            bh.A((new StringBuilder()).append(mD()).append("Invalid macro: ").append(s1).toString());
            ahu = ahu - 1;
            return ahj;
        }
        by by1 = a(s1, ((c) (obj)).mF(), ((c) (obj)).mG(), ((c) (obj)).mH(), ((c) (obj)).mJ(), ((c) (obj)).mI(), set, bj1.lw());
        if (((Set)by1.getObject()).isEmpty())
        {
            obj = ((c) (obj)).mK();
        } else
        {
            if (((Set)by1.getObject()).size() > 1)
            {
                bh.D((new StringBuilder()).append(mD()).append("Multiple macros active for macroName ").append(s1).toString());
            }
            obj = (cq.a)((Set)by1.getObject()).iterator().next();
        }
        if (obj == null)
        {
            ahu = ahu - 1;
            return ahj;
        }
        bj1 = a(aho, ((cq.a) (obj)), set, bj1.lL());
        boolean flag;
        if (by1.lV() && bj1.lV())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bj1 == ahj)
        {
            bj1 = ahj;
        } else
        {
            bj1 = new by(bj1.getObject(), flag);
        }
        obj = ((cq.a) (obj)).mk();
        if (bj1.lV())
        {
            ahq.e(s1, new b(bj1, ((com.google.android.gms.internal.d.a) (obj))));
        }
        a(((com.google.android.gms.internal.d.a) (obj)), set);
        ahu = ahu - 1;
        return bj1;
    }

    private by a(Map map, cq.a a1, Set set, cj cj1)
    {
        boolean flag1 = true;
        Object obj = (com.google.android.gms.internal.d.a)a1.mj().get(com.google.android.gms.internal.b.cx.toString());
        if (obj == null)
        {
            bh.A("No function id in properties");
            map = ahj;
        } else
        {
            obj = ((com.google.android.gms.internal.d.a) (obj)).fS;
            aj aj1 = (aj)map.get(obj);
            if (aj1 == null)
            {
                bh.A((new StringBuilder()).append(((String) (obj))).append(" has no backing implementation.").toString());
                return ahj;
            }
            map = (by)ahp.get(a1);
            if (map == null || ahl.lF())
            {
                map = new HashMap();
                Iterator iterator = a1.mj().entrySet().iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    Object obj1 = cj1.bZ((String)entry.getKey());
                    obj1 = a((com.google.android.gms.internal.d.a)entry.getValue(), set, ((cl) (obj1)).e((com.google.android.gms.internal.d.a)entry.getValue()));
                    if (obj1 == ahj)
                    {
                        return ahj;
                    }
                    if (((by) (obj1)).lV())
                    {
                        a1.a((String)entry.getKey(), (com.google.android.gms.internal.d.a)((by) (obj1)).getObject());
                    } else
                    {
                        flag = false;
                    }
                    map.put(entry.getKey(), ((by) (obj1)).getObject());
                }
                if (!aj1.a(map.keySet()))
                {
                    bh.A((new StringBuilder()).append("Incorrect keys for function ").append(((String) (obj))).append(" required ").append(aj1.lH()).append(" had ").append(map.keySet()).toString());
                    return ahj;
                }
                if (!flag || !aj1.lc())
                {
                    flag1 = false;
                }
                map = new by(aj1.w(map), flag1);
                if (flag1)
                {
                    ahp.e(a1, map);
                }
                cj1.d((com.google.android.gms.internal.d.a)map.getObject());
                return map;
            }
        }
        return map;
    }

    private by a(Set set, Set set1, a a1, cr cr1)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        set = set.iterator();
        boolean flag = true;
        while (set.hasNext()) 
        {
            cq.e e1 = (cq.e)set.next();
            cm cm1 = cr1.lT();
            by by1 = a(e1, set1, cm1);
            if (((Boolean)by1.getObject()).booleanValue())
            {
                a1.a(e1, hashset, hashset1, cm1);
            }
            if (flag && by1.lV())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        hashset.removeAll(hashset1);
        cr1.b(hashset);
        return new by(hashset, flag);
    }

    private void a(com.google.android.gms.internal.d.a a1, Set set)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((a1 = a(a1, set, ((dj) (new bw())))) != ahj)
        {
            a1 = ((com.google.android.gms.internal.d.a) (dh.o((com.google.android.gms.internal.d.a)a1.getObject())));
            if (a1 instanceof Map)
            {
                a1 = (Map)a1;
                aer.push(a1);
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
                        aer.push(set);
                    } else
                    {
                        bh.D("pushAfterEvaluate: value not a Map");
                    }
                }
            } else
            {
                bh.D("pushAfterEvaluate: value not a Map or List");
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static void a(List list, List list1, String s1)
    {
        if (list.size() != list1.size())
        {
            bh.B((new StringBuilder()).append("Invalid resource: imbalance of rule names of functions for ").append(s1).append(" operation. Using default rule name instead").toString());
        }
    }

    private static void a(Map map, aj aj1)
    {
        if (map.containsKey(aj1.lG()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate function type name: ").append(aj1.lG()).toString());
        } else
        {
            map.put(aj1.lG(), aj1);
            return;
        }
    }

    private static c d(Map map, String s1)
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

    private static String h(cq.a a1)
    {
        return dh.j((com.google.android.gms.internal.d.a)a1.mj().get(com.google.android.gms.internal.b.cI.toString()));
    }

    private String mD()
    {
        if (ahu <= 1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toString(ahu));
        for (int j = 2; j < ahu; j++)
        {
            stringbuilder.append(' ');
        }

        stringbuilder.append(": ");
        return stringbuilder.toString();
    }

    by a(cq.a a1, Set set, cj cj1)
    {
        a1 = a(ahn, a1, set, cj1);
        set = dh.n((com.google.android.gms.internal.d.a)a1.getObject());
        cj1.d(dh.r(set));
        return new by(set, a1.lV());
    }

    by a(cq.e e1, Set set, cm cm1)
    {
        Iterator iterator = e1.ms().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            by by2 = a((cq.a)iterator.next(), set, cm1.lN());
            if (((Boolean)by2.getObject()).booleanValue())
            {
                cm1.f(dh.r(Boolean.valueOf(false)));
                return new by(Boolean.valueOf(false), by2.lV());
            }
            if (flag && by2.lV())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (e1 = e1.mr().iterator(); e1.hasNext();)
        {
            by by1 = a((cq.a)e1.next(), set, cm1.lO());
            if (!((Boolean)by1.getObject()).booleanValue())
            {
                cm1.f(dh.r(Boolean.valueOf(false)));
                return new by(Boolean.valueOf(false), by1.lV());
            }
            if (flag && by1.lV())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }

        cm1.f(dh.r(Boolean.valueOf(true)));
        return new by(Boolean.valueOf(true), flag);
    }

    by a(String s1, Set set, Map map, Map map1, Map map2, Map map3, Set set1, 
            cr cr1)
    {
        return a(set, set1, new a(map, map1, map2, map3) {

            final cs ahv;
            final Map ahw;
            final Map ahx;
            final Map ahy;
            final Map ahz;

            public void a(cq.e e1, Set set2, Set set3, cm cm1)
            {
                List list = (List)ahw.get(e1);
                List list1 = (List)ahx.get(e1);
                if (list != null)
                {
                    set2.addAll(list);
                    cm1.lP().b(list, list1);
                }
                set2 = (List)ahy.get(e1);
                e1 = (List)ahz.get(e1);
                if (set2 != null)
                {
                    set3.addAll(set2);
                    cm1.lQ().b(set2, e1);
                }
            }

            
            {
                ahv = cs.this;
                ahw = map;
                ahx = map1;
                ahy = map2;
                ahz = map3;
                super();
            }
        }, cr1);
    }

    by a(Set set, cr cr1)
    {
        return a(set, ((Set) (new HashSet())), new a() {

            final cs ahv;

            public void a(cq.e e1, Set set1, Set set2, cm cm1)
            {
                set1.addAll(e1.mt());
                set2.addAll(e1.mu());
                cm1.lR().b(e1.mt(), e1.my());
                cm1.lS().b(e1.mu(), e1.mz());
            }

            
            {
                ahv = cs.this;
                super();
            }
        }, cr1);
    }

    void a(aj aj1)
    {
        a(aho, aj1);
    }

    void b(aj aj1)
    {
        a(ahm, aj1);
    }

    public void bH(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ck(s1);
        s1 = ahl.bT(s1);
        t t1 = s1.lD();
        cq.a a1;
        for (Iterator iterator = ((Set)a(ahr, t1.lw()).getObject()).iterator(); iterator.hasNext(); a(ahm, a1, new HashSet(), t1.lv()))
        {
            a1 = (cq.a)iterator.next();
        }

        break MISSING_BLOCK_LABEL_103;
        s1;
        throw s1;
        s1.lE();
        ck(null);
        this;
        JVM INSTR monitorexit ;
    }

    void c(aj aj1)
    {
        a(ahn, aj1);
    }

    public by cj(String s1)
    {
        ahu = 0;
        af af1 = ahl.bS(s1);
        s1 = a(s1, new HashSet(), af1.lC());
        af1.lE();
        return s1;
    }

    void ck(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        aht = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void h(List list)
    {
        this;
        JVM INSTR monitorenter ;
        list = list.iterator();
_L2:
        com.google.android.gms.internal.c.i j;
        do
        {
            if (!list.hasNext())
            {
                break MISSING_BLOCK_LABEL_90;
            }
            j = (com.google.android.gms.internal.c.i)list.next();
            if (j.name != null && j.name.startsWith("gaExperiment:"))
            {
                break MISSING_BLOCK_LABEL_79;
            }
            bh.C((new StringBuilder()).append("Ignored supplemental: ").append(j).toString());
        } while (true);
        list;
        throw list;
        ai.a(aer, j);
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
    }

    String mC()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = aht;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

}
