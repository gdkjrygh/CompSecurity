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

        private com.google.android.gms.internal.d.a agY;
        private by ahD;

        public int getSize()
        {
            int i1 = ((com.google.android.gms.internal.d.a)ahD.getObject()).nZ();
            int j;
            if (agY == null)
            {
                j = 0;
            } else
            {
                j = agY.nZ();
            }
            return j + i1;
        }

        public by mJ()
        {
            return ahD;
        }

        public com.google.android.gms.internal.d.a mp()
        {
            return agY;
        }

        public b(by by1, com.google.android.gms.internal.d.a a1)
        {
            ahD = by1;
            agY = a1;
        }
    }

    private static class c
    {

        private final Map ahE = new HashMap();
        private final Map ahF = new HashMap();
        private final Map ahG = new HashMap();
        private final Map ahH = new HashMap();
        private cq.a ahI;
        private final Set ahu = new HashSet();

        public void a(cq.e e1, cq.a a1)
        {
            List list = (List)ahE.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ahE.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public void a(cq.e e1, String s1)
        {
            List list = (List)ahG.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ahG.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public void b(cq.e e1)
        {
            ahu.add(e1);
        }

        public void b(cq.e e1, cq.a a1)
        {
            List list = (List)ahF.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ahF.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public void b(cq.e e1, String s1)
        {
            List list = (List)ahH.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ahH.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public void i(cq.a a1)
        {
            ahI = a1;
        }

        public Set mK()
        {
            return ahu;
        }

        public Map mL()
        {
            return ahE;
        }

        public Map mM()
        {
            return ahG;
        }

        public Map mN()
        {
            return ahH;
        }

        public Map mO()
        {
            return ahF;
        }

        public cq.a mP()
        {
            return ahI;
        }

        public c()
        {
        }
    }


    private static final by ahm = new by(dh.nd(), true);
    private final DataLayer aeu;
    private final cq.c ahn;
    private final ag aho;
    private final Map ahp = new HashMap();
    private final Map ahq = new HashMap();
    private final Map ahr = new HashMap();
    private final k ahs;
    private final k aht;
    private final Set ahu;
    private final Map ahv = new HashMap();
    private volatile String ahw;
    private int ahx;

    public cs(Context context, cq.c c1, DataLayer datalayer, s.a a1, s.a a2, ag ag1)
    {
        if (c1 == null)
        {
            throw new NullPointerException("resource cannot be null");
        }
        ahn = c1;
        ahu = new HashSet(c1.ms());
        aeu = datalayer;
        aho = ag1;
        c1 = new l.a() {

            final cs ahy;

            public int a(cq.a a3, by by1)
            {
                return ((com.google.android.gms.internal.d.a)by1.getObject()).nZ();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((cq.a)obj, (by)obj1);
            }

            
            {
                ahy = cs.this;
                super();
            }
        };
        ahs = (new l()).a(0x100000, c1);
        c1 = new l.a() {

            final cs ahy;

            public int a(String s1, b b1)
            {
                return s1.length() + b1.getSize();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((String)obj, (b)obj1);
            }

            
            {
                ahy = cs.this;
                super();
            }
        };
        aht = (new l()).a(0x100000, c1);
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
        a(new p(ahn.getVersion()));
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
        for (datalayer = ahu.iterator(); datalayer.hasNext();)
        {
            a1 = (cq.e)datalayer.next();
            if (ag1.lK())
            {
                a(a1.mA(), a1.mB(), "add macro");
                a(a1.mF(), a1.mC(), "remove macro");
                a(a1.my(), a1.mD(), "add tag");
                a(a1.mz(), a1.mE(), "remove tag");
            }
            for (int j = 0; j < a1.mA().size(); j++)
            {
                a2 = (cq.a)a1.mA().get(j);
                c1 = "Unknown";
                context = c1;
                if (ag1.lK())
                {
                    context = c1;
                    if (j < a1.mB().size())
                    {
                        context = (String)a1.mB().get(j);
                    }
                }
                c1 = d(ahv, h(a2));
                c1.b(a1);
                c1.a(a1, a2);
                c1.a(a1, context);
            }

            int i1 = 0;
            while (i1 < a1.mF().size()) 
            {
                a2 = (cq.a)a1.mF().get(i1);
                c1 = "Unknown";
                context = c1;
                if (ag1.lK())
                {
                    context = c1;
                    if (i1 < a1.mC().size())
                    {
                        context = (String)a1.mC().get(i1);
                    }
                }
                c1 = d(ahv, h(a2));
                c1.b(a1);
                c1.b(a1, a2);
                c1.b(a1, context);
                i1++;
            }
        }

        for (context = ahn.mt().entrySet().iterator(); context.hasNext();)
        {
            c1 = (java.util.Map.Entry)context.next();
            datalayer = ((List)c1.getValue()).iterator();
            while (datalayer.hasNext()) 
            {
                a1 = (cq.a)datalayer.next();
                if (!dh.n((com.google.android.gms.internal.d.a)a1.mo().get(com.google.android.gms.internal.b.dh.toString())).booleanValue())
                {
                    d(ahv, (String)c1.getKey()).i(a1);
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
            return ahm;

        case 2: // '\002'
            com.google.android.gms.internal.d.a a2 = cq.g(a1);
            a2.fO = new com.google.android.gms.internal.d.a[a1.fO.length];
            for (int j = 0; j < a1.fO.length; j++)
            {
                by by1 = a(a1.fO[j], set, dj1.dq(j));
                if (by1 == ahm)
                {
                    return ahm;
                }
                a2.fO[j] = (com.google.android.gms.internal.d.a)by1.getObject();
            }

            return new by(a2, false);

        case 3: // '\003'
            com.google.android.gms.internal.d.a a3 = cq.g(a1);
            if (a1.fP.length != a1.fQ.length)
            {
                bh.A((new StringBuilder()).append("Invalid serving value: ").append(a1.toString()).toString());
                return ahm;
            }
            a3.fP = new com.google.android.gms.internal.d.a[a1.fP.length];
            a3.fQ = new com.google.android.gms.internal.d.a[a1.fP.length];
            for (int i1 = 0; i1 < a1.fP.length; i1++)
            {
                by by2 = a(a1.fP[i1], set, dj1.dr(i1));
                by by4 = a(a1.fQ[i1], set, dj1.ds(i1));
                if (by2 == ahm || by4 == ahm)
                {
                    return ahm;
                }
                a3.fP[i1] = (com.google.android.gms.internal.d.a)by2.getObject();
                a3.fQ[i1] = (com.google.android.gms.internal.d.a)by4.getObject();
            }

            return new by(a3, false);

        case 4: // '\004'
            if (set.contains(a1.fR))
            {
                bh.A((new StringBuilder()).append("Macro cycle detected.  Current macro reference: ").append(a1.fR).append(".").append("  Previous macro references: ").append(set.toString()).append(".").toString());
                return ahm;
            } else
            {
                set.add(a1.fR);
                dj1 = dk.a(a(a1.fR, set, dj1.lZ()), a1.fW);
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
            if (by3 == ahm)
            {
                return ahm;
            }
            a4.fV[j1] = (com.google.android.gms.internal.d.a)by3.getObject();
        }

        return new by(a4, false);
    }

    private by a(String s1, Set set, bj bj1)
    {
        ahx = ahx + 1;
        Object obj = (b)aht.get(s1);
        if (obj != null && !aho.lK())
        {
            a(((b) (obj)).mp(), set);
            ahx = ahx - 1;
            return ((b) (obj)).mJ();
        }
        obj = (c)ahv.get(s1);
        if (obj == null)
        {
            bh.A((new StringBuilder()).append(mI()).append("Invalid macro: ").append(s1).toString());
            ahx = ahx - 1;
            return ahm;
        }
        by by1 = a(s1, ((c) (obj)).mK(), ((c) (obj)).mL(), ((c) (obj)).mM(), ((c) (obj)).mO(), ((c) (obj)).mN(), set, bj1.lB());
        if (((Set)by1.getObject()).isEmpty())
        {
            obj = ((c) (obj)).mP();
        } else
        {
            if (((Set)by1.getObject()).size() > 1)
            {
                bh.D((new StringBuilder()).append(mI()).append("Multiple macros active for macroName ").append(s1).toString());
            }
            obj = (cq.a)((Set)by1.getObject()).iterator().next();
        }
        if (obj == null)
        {
            ahx = ahx - 1;
            return ahm;
        }
        bj1 = a(ahr, ((cq.a) (obj)), set, bj1.lQ());
        boolean flag;
        if (by1.ma() && bj1.ma())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bj1 == ahm)
        {
            bj1 = ahm;
        } else
        {
            bj1 = new by(bj1.getObject(), flag);
        }
        obj = ((cq.a) (obj)).mp();
        if (bj1.ma())
        {
            aht.e(s1, new b(bj1, ((com.google.android.gms.internal.d.a) (obj))));
        }
        a(((com.google.android.gms.internal.d.a) (obj)), set);
        ahx = ahx - 1;
        return bj1;
    }

    private by a(Map map, cq.a a1, Set set, cj cj1)
    {
        boolean flag1 = true;
        Object obj = (com.google.android.gms.internal.d.a)a1.mo().get(com.google.android.gms.internal.b.cx.toString());
        if (obj == null)
        {
            bh.A("No function id in properties");
            map = ahm;
        } else
        {
            obj = ((com.google.android.gms.internal.d.a) (obj)).fS;
            aj aj1 = (aj)map.get(obj);
            if (aj1 == null)
            {
                bh.A((new StringBuilder()).append(((String) (obj))).append(" has no backing implementation.").toString());
                return ahm;
            }
            map = (by)ahs.get(a1);
            if (map == null || aho.lK())
            {
                map = new HashMap();
                Iterator iterator = a1.mo().entrySet().iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    Object obj1 = cj1.bZ((String)entry.getKey());
                    obj1 = a((com.google.android.gms.internal.d.a)entry.getValue(), set, ((cl) (obj1)).e((com.google.android.gms.internal.d.a)entry.getValue()));
                    if (obj1 == ahm)
                    {
                        return ahm;
                    }
                    if (((by) (obj1)).ma())
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
                    bh.A((new StringBuilder()).append("Incorrect keys for function ").append(((String) (obj))).append(" required ").append(aj1.lM()).append(" had ").append(map.keySet()).toString());
                    return ahm;
                }
                if (!flag || !aj1.lh())
                {
                    flag1 = false;
                }
                map = new by(aj1.w(map), flag1);
                if (flag1)
                {
                    ahs.e(a1, map);
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
            cm cm1 = cr1.lY();
            by by1 = a(e1, set1, cm1);
            if (((Boolean)by1.getObject()).booleanValue())
            {
                a1.a(e1, hashset, hashset1, cm1);
            }
            if (flag && by1.ma())
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
        if ((a1 = a(a1, set, ((dj) (new bw())))) != ahm)
        {
            a1 = ((com.google.android.gms.internal.d.a) (dh.o((com.google.android.gms.internal.d.a)a1.getObject())));
            if (a1 instanceof Map)
            {
                a1 = (Map)a1;
                aeu.push(a1);
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
                        aeu.push(set);
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
        if (map.containsKey(aj1.lL()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate function type name: ").append(aj1.lL()).toString());
        } else
        {
            map.put(aj1.lL(), aj1);
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
        return dh.j((com.google.android.gms.internal.d.a)a1.mo().get(com.google.android.gms.internal.b.cI.toString()));
    }

    private String mI()
    {
        if (ahx <= 1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toString(ahx));
        for (int j = 2; j < ahx; j++)
        {
            stringbuilder.append(' ');
        }

        stringbuilder.append(": ");
        return stringbuilder.toString();
    }

    by a(cq.a a1, Set set, cj cj1)
    {
        a1 = a(ahq, a1, set, cj1);
        set = dh.n((com.google.android.gms.internal.d.a)a1.getObject());
        cj1.d(dh.r(set));
        return new by(set, a1.ma());
    }

    by a(cq.e e1, Set set, cm cm1)
    {
        Iterator iterator = e1.mx().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            by by2 = a((cq.a)iterator.next(), set, cm1.lS());
            if (((Boolean)by2.getObject()).booleanValue())
            {
                cm1.f(dh.r(Boolean.valueOf(false)));
                return new by(Boolean.valueOf(false), by2.ma());
            }
            if (flag && by2.ma())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (e1 = e1.mw().iterator(); e1.hasNext();)
        {
            by by1 = a((cq.a)e1.next(), set, cm1.lT());
            if (!((Boolean)by1.getObject()).booleanValue())
            {
                cm1.f(dh.r(Boolean.valueOf(false)));
                return new by(Boolean.valueOf(false), by1.ma());
            }
            if (flag && by1.ma())
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

            final Map ahA;
            final Map ahB;
            final Map ahC;
            final cs ahy;
            final Map ahz;

            public void a(cq.e e1, Set set2, Set set3, cm cm1)
            {
                List list = (List)ahz.get(e1);
                List list1 = (List)ahA.get(e1);
                if (list != null)
                {
                    set2.addAll(list);
                    cm1.lU().b(list, list1);
                }
                set2 = (List)ahB.get(e1);
                e1 = (List)ahC.get(e1);
                if (set2 != null)
                {
                    set3.addAll(set2);
                    cm1.lV().b(set2, e1);
                }
            }

            
            {
                ahy = cs.this;
                ahz = map;
                ahA = map1;
                ahB = map2;
                ahC = map3;
                super();
            }
        }, cr1);
    }

    by a(Set set, cr cr1)
    {
        return a(set, ((Set) (new HashSet())), new a() {

            final cs ahy;

            public void a(cq.e e1, Set set1, Set set2, cm cm1)
            {
                set1.addAll(e1.my());
                set2.addAll(e1.mz());
                cm1.lW().b(e1.my(), e1.mD());
                cm1.lX().b(e1.mz(), e1.mE());
            }

            
            {
                ahy = cs.this;
                super();
            }
        }, cr1);
    }

    void a(aj aj1)
    {
        a(ahr, aj1);
    }

    void b(aj aj1)
    {
        a(ahp, aj1);
    }

    public void bH(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ck(s1);
        s1 = aho.bT(s1);
        t t1 = s1.lI();
        cq.a a1;
        for (Iterator iterator = ((Set)a(ahu, t1.lB()).getObject()).iterator(); iterator.hasNext(); a(ahp, a1, new HashSet(), t1.lA()))
        {
            a1 = (cq.a)iterator.next();
        }

        break MISSING_BLOCK_LABEL_103;
        s1;
        throw s1;
        s1.lJ();
        ck(null);
        this;
        JVM INSTR monitorexit ;
    }

    void c(aj aj1)
    {
        a(ahq, aj1);
    }

    public by cj(String s1)
    {
        ahx = 0;
        af af1 = aho.bS(s1);
        s1 = a(s1, new HashSet(), af1.lH());
        af1.lJ();
        return s1;
    }

    void ck(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ahw = s1;
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
        ai.a(aeu, j);
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
    }

    String mH()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ahw;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

}
