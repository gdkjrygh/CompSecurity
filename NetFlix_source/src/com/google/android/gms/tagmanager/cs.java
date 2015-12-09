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

        private by ZV;
        private com.google.android.gms.internal.d.a Zq;

        public int getSize()
        {
            int i1 = ((com.google.android.gms.internal.d.a)ZV.getObject()).mF();
            int j;
            if (Zq == null)
            {
                j = 0;
            } else
            {
                j = Zq.mF();
            }
            return j + i1;
        }

        public com.google.android.gms.internal.d.a lf()
        {
            return Zq;
        }

        public by lz()
        {
            return ZV;
        }

        public b(by by1, com.google.android.gms.internal.d.a a1)
        {
            ZV = by1;
            Zq = a1;
        }
    }

    private static class c
    {

        private final Set ZM = new HashSet();
        private final Map ZW = new HashMap();
        private final Map ZX = new HashMap();
        private final Map ZY = new HashMap();
        private final Map ZZ = new HashMap();
        private cq.a aaa;

        public void a(cq.e e1, cq.a a1)
        {
            List list = (List)ZW.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ZW.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public void a(cq.e e1, String s1)
        {
            List list = (List)ZY.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ZY.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public void b(cq.e e1)
        {
            ZM.add(e1);
        }

        public void b(cq.e e1, cq.a a1)
        {
            List list = (List)ZX.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ZX.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public void b(cq.e e1, String s1)
        {
            List list = (List)ZZ.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                ZZ.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public void i(cq.a a1)
        {
            aaa = a1;
        }

        public Set lA()
        {
            return ZM;
        }

        public Map lB()
        {
            return ZW;
        }

        public Map lC()
        {
            return ZY;
        }

        public Map lD()
        {
            return ZZ;
        }

        public Map lE()
        {
            return ZX;
        }

        public cq.a lF()
        {
            return aaa;
        }

        public c()
        {
        }
    }


    private static final by ZE = new by(dh.lT(), true);
    private final DataLayer WK;
    private final cq.c ZF;
    private final ag ZG;
    private final Map ZH = new HashMap();
    private final Map ZI = new HashMap();
    private final Map ZJ = new HashMap();
    private final k ZK;
    private final k ZL;
    private final Set ZM;
    private final Map ZN = new HashMap();
    private volatile String ZO;
    private int ZP;

    public cs(Context context, cq.c c1, DataLayer datalayer, s.a a1, s.a a2, ag ag1)
    {
        if (c1 == null)
        {
            throw new NullPointerException("resource cannot be null");
        }
        ZF = c1;
        ZM = new HashSet(c1.li());
        WK = datalayer;
        ZG = ag1;
        c1 = new l.a() {

            final cs ZQ;

            public int a(cq.a a3, by by1)
            {
                return ((com.google.android.gms.internal.d.a)by1.getObject()).mF();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((cq.a)obj, (by)obj1);
            }

            
            {
                ZQ = cs.this;
                super();
            }
        };
        ZK = (new l()).a(0x100000, c1);
        c1 = new l.a() {

            final cs ZQ;

            public int a(String s1, b b1)
            {
                return s1.length() + b1.getSize();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((String)obj, (b)obj1);
            }

            
            {
                ZQ = cs.this;
                super();
            }
        };
        ZL = (new l()).a(0x100000, c1);
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
        a(new p(ZF.getVersion()));
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
        for (datalayer = ZM.iterator(); datalayer.hasNext();)
        {
            a1 = (cq.e)datalayer.next();
            if (ag1.kA())
            {
                a(a1.lq(), a1.lr(), "add macro");
                a(a1.lv(), a1.ls(), "remove macro");
                a(a1.lo(), a1.lt(), "add tag");
                a(a1.lp(), a1.lu(), "remove tag");
            }
            for (int j = 0; j < a1.lq().size(); j++)
            {
                a2 = (cq.a)a1.lq().get(j);
                c1 = "Unknown";
                context = c1;
                if (ag1.kA())
                {
                    context = c1;
                    if (j < a1.lr().size())
                    {
                        context = (String)a1.lr().get(j);
                    }
                }
                c1 = d(ZN, h(a2));
                c1.b(a1);
                c1.a(a1, a2);
                c1.a(a1, context);
            }

            int i1 = 0;
            while (i1 < a1.lv().size()) 
            {
                a2 = (cq.a)a1.lv().get(i1);
                c1 = "Unknown";
                context = c1;
                if (ag1.kA())
                {
                    context = c1;
                    if (i1 < a1.ls().size())
                    {
                        context = (String)a1.ls().get(i1);
                    }
                }
                c1 = d(ZN, h(a2));
                c1.b(a1);
                c1.b(a1, a2);
                c1.b(a1, context);
                i1++;
            }
        }

        for (context = ZF.lj().entrySet().iterator(); context.hasNext();)
        {
            c1 = (java.util.Map.Entry)context.next();
            datalayer = ((List)c1.getValue()).iterator();
            while (datalayer.hasNext()) 
            {
                a1 = (cq.a)datalayer.next();
                if (!dh.n((com.google.android.gms.internal.d.a)a1.le().get(com.google.android.gms.internal.b.dh.toString())).booleanValue())
                {
                    d(ZN, (String)c1.getKey()).i(a1);
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
            bh.w((new StringBuilder()).append("Unknown type: ").append(a1.type).toString());
            return ZE;

        case 2: // '\002'
            com.google.android.gms.internal.d.a a2 = cq.g(a1);
            a2.fO = new com.google.android.gms.internal.d.a[a1.fO.length];
            for (int j = 0; j < a1.fO.length; j++)
            {
                by by1 = a(a1.fO[j], set, dj1.cd(j));
                if (by1 == ZE)
                {
                    return ZE;
                }
                a2.fO[j] = (com.google.android.gms.internal.d.a)by1.getObject();
            }

            return new by(a2, false);

        case 3: // '\003'
            com.google.android.gms.internal.d.a a3 = cq.g(a1);
            if (a1.fP.length != a1.fQ.length)
            {
                bh.w((new StringBuilder()).append("Invalid serving value: ").append(a1.toString()).toString());
                return ZE;
            }
            a3.fP = new com.google.android.gms.internal.d.a[a1.fP.length];
            a3.fQ = new com.google.android.gms.internal.d.a[a1.fP.length];
            for (int i1 = 0; i1 < a1.fP.length; i1++)
            {
                by by2 = a(a1.fP[i1], set, dj1.ce(i1));
                by by4 = a(a1.fQ[i1], set, dj1.cf(i1));
                if (by2 == ZE || by4 == ZE)
                {
                    return ZE;
                }
                a3.fP[i1] = (com.google.android.gms.internal.d.a)by2.getObject();
                a3.fQ[i1] = (com.google.android.gms.internal.d.a)by4.getObject();
            }

            return new by(a3, false);

        case 4: // '\004'
            if (set.contains(a1.fR))
            {
                bh.w((new StringBuilder()).append("Macro cycle detected.  Current macro reference: ").append(a1.fR).append(".").append("  Previous macro references: ").append(set.toString()).append(".").toString());
                return ZE;
            } else
            {
                set.add(a1.fR);
                dj1 = dk.a(a(a1.fR, set, dj1.kP()), a1.fW);
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
            by by3 = a(a1.fV[j1], set, dj1.cg(j1));
            if (by3 == ZE)
            {
                return ZE;
            }
            a4.fV[j1] = (com.google.android.gms.internal.d.a)by3.getObject();
        }

        return new by(a4, false);
    }

    private by a(String s1, Set set, bj bj1)
    {
        ZP = ZP + 1;
        Object obj = (b)ZL.get(s1);
        if (obj != null && !ZG.kA())
        {
            a(((b) (obj)).lf(), set);
            ZP = ZP - 1;
            return ((b) (obj)).lz();
        }
        obj = (c)ZN.get(s1);
        if (obj == null)
        {
            bh.w((new StringBuilder()).append(ly()).append("Invalid macro: ").append(s1).toString());
            ZP = ZP - 1;
            return ZE;
        }
        by by1 = a(s1, ((c) (obj)).lA(), ((c) (obj)).lB(), ((c) (obj)).lC(), ((c) (obj)).lE(), ((c) (obj)).lD(), set, bj1.kr());
        if (((Set)by1.getObject()).isEmpty())
        {
            obj = ((c) (obj)).lF();
        } else
        {
            if (((Set)by1.getObject()).size() > 1)
            {
                bh.z((new StringBuilder()).append(ly()).append("Multiple macros active for macroName ").append(s1).toString());
            }
            obj = (cq.a)((Set)by1.getObject()).iterator().next();
        }
        if (obj == null)
        {
            ZP = ZP - 1;
            return ZE;
        }
        bj1 = a(ZJ, ((cq.a) (obj)), set, bj1.kG());
        boolean flag;
        if (by1.kQ() && bj1.kQ())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bj1 == ZE)
        {
            bj1 = ZE;
        } else
        {
            bj1 = new by(bj1.getObject(), flag);
        }
        obj = ((cq.a) (obj)).lf();
        if (bj1.kQ())
        {
            ZL.e(s1, new b(bj1, ((com.google.android.gms.internal.d.a) (obj))));
        }
        a(((com.google.android.gms.internal.d.a) (obj)), set);
        ZP = ZP - 1;
        return bj1;
    }

    private by a(Map map, cq.a a1, Set set, cj cj1)
    {
        boolean flag1 = true;
        Object obj = (com.google.android.gms.internal.d.a)a1.le().get(com.google.android.gms.internal.b.cx.toString());
        if (obj == null)
        {
            bh.w("No function id in properties");
            map = ZE;
        } else
        {
            obj = ((com.google.android.gms.internal.d.a) (obj)).fS;
            aj aj1 = (aj)map.get(obj);
            if (aj1 == null)
            {
                bh.w((new StringBuilder()).append(((String) (obj))).append(" has no backing implementation.").toString());
                return ZE;
            }
            map = (by)ZK.get(a1);
            if (map == null || ZG.kA())
            {
                map = new HashMap();
                Iterator iterator = a1.le().entrySet().iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    Object obj1 = cj1.bH((String)entry.getKey());
                    obj1 = a((com.google.android.gms.internal.d.a)entry.getValue(), set, ((cl) (obj1)).e((com.google.android.gms.internal.d.a)entry.getValue()));
                    if (obj1 == ZE)
                    {
                        return ZE;
                    }
                    if (((by) (obj1)).kQ())
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
                    bh.w((new StringBuilder()).append("Incorrect keys for function ").append(((String) (obj))).append(" required ").append(aj1.kC()).append(" had ").append(map.keySet()).toString());
                    return ZE;
                }
                if (!flag || !aj1.jX())
                {
                    flag1 = false;
                }
                map = new by(aj1.x(map), flag1);
                if (flag1)
                {
                    ZK.e(a1, map);
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
            cm cm1 = cr1.kO();
            by by1 = a(e1, set1, cm1);
            if (((Boolean)by1.getObject()).booleanValue())
            {
                a1.a(e1, hashset, hashset1, cm1);
            }
            if (flag && by1.kQ())
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
        if ((a1 = a(a1, set, ((dj) (new bw())))) != ZE)
        {
            a1 = ((com.google.android.gms.internal.d.a) (dh.o((com.google.android.gms.internal.d.a)a1.getObject())));
            if (a1 instanceof Map)
            {
                a1 = (Map)a1;
                WK.push(a1);
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
                        WK.push(set);
                    } else
                    {
                        bh.z("pushAfterEvaluate: value not a Map");
                    }
                }
            } else
            {
                bh.z("pushAfterEvaluate: value not a Map or List");
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
            bh.x((new StringBuilder()).append("Invalid resource: imbalance of rule names of functions for ").append(s1).append(" operation. Using default rule name instead").toString());
        }
    }

    private static void a(Map map, aj aj1)
    {
        if (map.containsKey(aj1.kB()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate function type name: ").append(aj1.kB()).toString());
        } else
        {
            map.put(aj1.kB(), aj1);
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
        return dh.j((com.google.android.gms.internal.d.a)a1.le().get(com.google.android.gms.internal.b.cI.toString()));
    }

    private String ly()
    {
        if (ZP <= 1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toString(ZP));
        for (int j = 2; j < ZP; j++)
        {
            stringbuilder.append(' ');
        }

        stringbuilder.append(": ");
        return stringbuilder.toString();
    }

    by a(cq.a a1, Set set, cj cj1)
    {
        a1 = a(ZI, a1, set, cj1);
        set = dh.n((com.google.android.gms.internal.d.a)a1.getObject());
        cj1.d(dh.r(set));
        return new by(set, a1.kQ());
    }

    by a(cq.e e1, Set set, cm cm1)
    {
        Iterator iterator = e1.ln().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            by by2 = a((cq.a)iterator.next(), set, cm1.kI());
            if (((Boolean)by2.getObject()).booleanValue())
            {
                cm1.f(dh.r(Boolean.valueOf(false)));
                return new by(Boolean.valueOf(false), by2.kQ());
            }
            if (flag && by2.kQ())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (e1 = e1.lm().iterator(); e1.hasNext();)
        {
            by by1 = a((cq.a)e1.next(), set, cm1.kJ());
            if (!((Boolean)by1.getObject()).booleanValue())
            {
                cm1.f(dh.r(Boolean.valueOf(false)));
                return new by(Boolean.valueOf(false), by1.kQ());
            }
            if (flag && by1.kQ())
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

            final cs ZQ;
            final Map ZR;
            final Map ZS;
            final Map ZT;
            final Map ZU;

            public void a(cq.e e1, Set set2, Set set3, cm cm1)
            {
                List list = (List)ZR.get(e1);
                List list1 = (List)ZS.get(e1);
                if (list != null)
                {
                    set2.addAll(list);
                    cm1.kK().b(list, list1);
                }
                set2 = (List)ZT.get(e1);
                e1 = (List)ZU.get(e1);
                if (set2 != null)
                {
                    set3.addAll(set2);
                    cm1.kL().b(set2, e1);
                }
            }

            
            {
                ZQ = cs.this;
                ZR = map;
                ZS = map1;
                ZT = map2;
                ZU = map3;
                super();
            }
        }, cr1);
    }

    by a(Set set, cr cr1)
    {
        return a(set, ((Set) (new HashSet())), new a() {

            final cs ZQ;

            public void a(cq.e e1, Set set1, Set set2, cm cm1)
            {
                set1.addAll(e1.lo());
                set2.addAll(e1.lp());
                cm1.kM().b(e1.lo(), e1.lt());
                cm1.kN().b(e1.lp(), e1.lu());
            }

            
            {
                ZQ = cs.this;
                super();
            }
        }, cr1);
    }

    void a(aj aj1)
    {
        a(ZJ, aj1);
    }

    void b(aj aj1)
    {
        a(ZH, aj1);
    }

    public by bR(String s1)
    {
        ZP = 0;
        af af1 = ZG.bA(s1);
        s1 = a(s1, new HashSet(), af1.kx());
        af1.kz();
        return s1;
    }

    void bS(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        ZO = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void bp(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        bS(s1);
        s1 = ZG.bB(s1);
        t t1 = s1.ky();
        cq.a a1;
        for (Iterator iterator = ((Set)a(ZM, t1.kr()).getObject()).iterator(); iterator.hasNext(); a(ZH, a1, new HashSet(), t1.kq()))
        {
            a1 = (cq.a)iterator.next();
        }

        break MISSING_BLOCK_LABEL_103;
        s1;
        throw s1;
        s1.kz();
        bS(null);
        this;
        JVM INSTR monitorexit ;
    }

    void c(aj aj1)
    {
        a(ZI, aj1);
    }

    public void e(List list)
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
            bh.y((new StringBuilder()).append("Ignored supplemental: ").append(j).toString());
        } while (true);
        list;
        throw list;
        ai.a(WK, j);
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
    }

    String lx()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = ZO;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

}
