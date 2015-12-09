// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bx, de, bg, co, 
//            dh, di, ck, l, 
//            ag, bi, aj, ch, 
//            cj, cp, DataLayer, af, 
//            u

final class cq
{
    static interface a
    {

        public abstract void a(co.e e, Set set, Set set1, ck ck1);
    }

    static final class b
    {

        private bx aPG;
        private com.google.android.gms.internal.d.a aPb;

        public final bx tR()
        {
            return aPG;
        }

        public final com.google.android.gms.internal.d.a tx()
        {
            return aPb;
        }

        public b(bx bx1, com.google.android.gms.internal.d.a a1)
        {
            aPG = bx1;
            aPb = a1;
        }
    }

    static final class c
    {

        private final Map aPH = new HashMap();
        private final Map aPI = new HashMap();
        private final Map aPJ = new HashMap();
        private final Map aPK = new HashMap();
        private co.a aPL;
        private final Set aPx = new HashSet();

        public final Set tS()
        {
            return aPx;
        }

        public final Map tT()
        {
            return aPH;
        }

        public final Map tU()
        {
            return aPJ;
        }

        public final Map tV()
        {
            return aPK;
        }

        public final Map tW()
        {
            return aPI;
        }

        public final co.a tX()
        {
            return aPL;
        }

        public c()
        {
        }
    }


    private static final bx aPp = new bx(de.ul(), true);
    private final DataLayer aMx;
    private int aPA;
    private final ag aPr;
    private final Map aPs;
    private final Map aPt;
    private final Map aPu;
    private final l aPv;
    private final l aPw;
    private final Set aPx;
    private final Map aPy;
    private volatile String aPz;

    private bx a(com.google.android.gms.internal.d.a a1, Set set, dh dh1)
    {
        if (!a1.gE)
        {
            return new bx(a1, true);
        }
        com.google.android.gms.internal.d.a a4;
        int k;
        switch (a1.type)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            bg.e((new StringBuilder("Unknown type: ")).append(a1.type).toString());
            return aPp;

        case 2: // '\002'
            com.google.android.gms.internal.d.a a2 = co.g(a1);
            a2.gv = new com.google.android.gms.internal.d.a[a1.gv.length];
            for (int i = 0; i < a1.gv.length; i++)
            {
                bx bx1 = a(a1.gv[i], set, dh1.kH(i));
                if (bx1 == aPp)
                {
                    return aPp;
                }
                a2.gv[i] = (com.google.android.gms.internal.d.a)bx1.getObject();
            }

            return new bx(a2, false);

        case 3: // '\003'
            com.google.android.gms.internal.d.a a3 = co.g(a1);
            if (a1.gw.length != a1.gx.length)
            {
                bg.e((new StringBuilder("Invalid serving value: ")).append(a1.toString()).toString());
                return aPp;
            }
            a3.gw = new com.google.android.gms.internal.d.a[a1.gw.length];
            a3.gx = new com.google.android.gms.internal.d.a[a1.gw.length];
            for (int j = 0; j < a1.gw.length; j++)
            {
                bx bx2 = a(a1.gw[j], set, dh1.kI(j));
                bx bx4 = a(a1.gx[j], set, dh1.kJ(j));
                if (bx2 == aPp || bx4 == aPp)
                {
                    return aPp;
                }
                a3.gw[j] = (com.google.android.gms.internal.d.a)bx2.getObject();
                a3.gx[j] = (com.google.android.gms.internal.d.a)bx4.getObject();
            }

            return new bx(a3, false);

        case 4: // '\004'
            if (set.contains(a1.gy))
            {
                bg.e((new StringBuilder("Macro cycle detected.  Current macro reference: ")).append(a1.gy).append(".  Previous macro references: ").append(set.toString()).append(".").toString());
                return aPp;
            } else
            {
                set.add(a1.gy);
                dh1 = di.a(a(a1.gy, set, dh1.ti()), a1.gD);
                set.remove(a1.gy);
                return dh1;
            }

        case 7: // '\007'
            a4 = co.g(a1);
            a4.gC = new com.google.android.gms.internal.d.a[a1.gC.length];
            k = 0;
            break;
        }
        for (; k < a1.gC.length; k++)
        {
            bx bx3 = a(a1.gC[k], set, dh1.kK(k));
            if (bx3 == aPp)
            {
                return aPp;
            }
            a4.gC[k] = (com.google.android.gms.internal.d.a)bx3.getObject();
        }

        return new bx(a4, false);
    }

    private bx a(co.a a1, Set set, ch ch1)
    {
        a1 = a(aPt, a1, set, ch1);
        set = de.n((com.google.android.gms.internal.d.a)a1.getObject());
        de.A(set);
        return new bx(set, a1.tj());
    }

    private bx a(co.e e, Set set, ck ck1)
    {
        Iterator iterator = e.tF().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            bx bx2 = a((co.a)iterator.next(), set, ck1.tb());
            if (((Boolean)bx2.getObject()).booleanValue())
            {
                de.A(Boolean.valueOf(false));
                return new bx(Boolean.valueOf(false), bx2.tj());
            }
            if (flag && bx2.tj())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (e = e.tE().iterator(); e.hasNext();)
        {
            bx bx1 = a((co.a)e.next(), set, ck1.tc());
            if (!((Boolean)bx1.getObject()).booleanValue())
            {
                de.A(Boolean.valueOf(false));
                return new bx(Boolean.valueOf(false), bx1.tj());
            }
            if (flag && bx1.tj())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }

        de.A(Boolean.valueOf(true));
        return new bx(Boolean.valueOf(true), flag);
    }

    private bx a(String s, Set set, bi bi1)
    {
        aPA = aPA + 1;
        Object obj = (b)aPw.get(s);
        if (obj != null && !aPr.sT())
        {
            a(((b) (obj)).tx(), set);
            aPA = aPA - 1;
            return ((b) (obj)).tR();
        }
        c c1 = (c)aPy.get(s);
        if (c1 == null)
        {
            bg.e((new StringBuilder()).append(tQ()).append("Invalid macro: ").append(s).toString());
            aPA = aPA - 1;
            return aPp;
        }
        obj = a(s, c1.tS(), c1.tT(), c1.tU(), c1.tW(), c1.tV(), set, bi1.sK());
        if (((Set)((bx) (obj)).getObject()).isEmpty())
        {
            s = c1.tX();
        } else
        {
            if (((Set)((bx) (obj)).getObject()).size() > 1)
            {
                bg.w((new StringBuilder()).append(tQ()).append("Multiple macros active for macroName ").append(s).toString());
            }
            s = (co.a)((Set)((bx) (obj)).getObject()).iterator().next();
        }
        if (s == null)
        {
            aPA = aPA - 1;
            return aPp;
        }
        bi1 = a(aPu, ((co.a) (s)), set, bi1.sZ());
        boolean flag;
        if (((bx) (obj)).tj() && bi1.tj())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bi1 == aPp)
        {
            bi1 = aPp;
        } else
        {
            bi1 = new bx(bi1.getObject(), flag);
        }
        s = s.tx();
        if (bi1.tj())
        {
            l l1 = aPw;
            new b(bi1, s);
        }
        a(((com.google.android.gms.internal.d.a) (s)), set);
        aPA = aPA - 1;
        return bi1;
    }

    private bx a(String s, Set set, Map map, Map map1, Map map2, Map map3, Set set1, 
            cp cp1)
    {
        return a(set, set1, new a(map, map1, map2, map3) {

            final cq aPB;
            final Map aPC;
            final Map aPD;
            final Map aPE;
            final Map aPF;

            public final void a(co.e e, Set set2, Set set3, ck ck1)
            {
                List list = (List)aPC.get(e);
                aPD.get(e);
                if (list != null)
                {
                    set2.addAll(list);
                    ck1.td();
                }
                set2 = (List)aPE.get(e);
                aPF.get(e);
                if (set2 != null)
                {
                    set3.addAll(set2);
                    ck1.te();
                }
            }

            
            {
                aPB = cq.this;
                aPC = map;
                aPD = map1;
                aPE = map2;
                aPF = map3;
                super();
            }
        }, cp1);
    }

    private bx a(Map map, co.a a1, Set set, ch ch1)
    {
        boolean flag1 = true;
        Object obj = (com.google.android.gms.internal.d.a)a1.tw().get(com.google.android.gms.internal.b.cU.toString());
        if (obj == null)
        {
            bg.e("No function id in properties");
            map = aPp;
        } else
        {
            obj = ((com.google.android.gms.internal.d.a) (obj)).gz;
            aj aj1 = (aj)map.get(obj);
            if (aj1 == null)
            {
                bg.e((new StringBuilder()).append(((String) (obj))).append(" has no backing implementation.").toString());
                return aPp;
            }
            map = (bx)aPv.get(a1);
            if (map == null || aPr.sT())
            {
                map = new HashMap();
                Iterator iterator = a1.tw().entrySet().iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    Object obj1 = ch1.dJ((String)entry.getKey());
                    obj1 = a((com.google.android.gms.internal.d.a)entry.getValue(), set, ((cj) (obj1)).e((com.google.android.gms.internal.d.a)entry.getValue()));
                    if (obj1 == aPp)
                    {
                        return aPp;
                    }
                    if (((bx) (obj1)).tj())
                    {
                        a1.a((String)entry.getKey(), (com.google.android.gms.internal.d.a)((bx) (obj1)).getObject());
                    } else
                    {
                        flag = false;
                    }
                    map.put(entry.getKey(), ((bx) (obj1)).getObject());
                }
                if (!aj1.a(map.keySet()))
                {
                    bg.e((new StringBuilder("Incorrect keys for function ")).append(((String) (obj))).append(" required ").append(aj1.sV()).append(" had ").append(map.keySet()).toString());
                    return aPp;
                }
                if (!flag || !aj1.sq())
                {
                    flag1 = false;
                }
                map = new bx(aj1.D(map), flag1);
                if (flag1)
                {
                    a1 = aPv;
                }
                map.getObject();
                return map;
            }
        }
        return map;
    }

    private bx a(Set set, cp cp1)
    {
        return a(set, ((Set) (new HashSet())), new a() {

            final cq aPB;

            public final void a(co.e e, Set set1, Set set2, ck ck1)
            {
                set1.addAll(e.tG());
                set2.addAll(e.tH());
                ck1.tf();
                e.tG();
                e.tL();
                ck1.tg();
                e.tH();
                e.tM();
            }

            
            {
                aPB = cq.this;
                super();
            }
        }, cp1);
    }

    private bx a(Set set, Set set1, a a1, cp cp1)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        set = set.iterator();
        boolean flag = true;
        while (set.hasNext()) 
        {
            co.e e = (co.e)set.next();
            ck ck1 = cp1.th();
            bx bx1 = a(e, set1, ck1);
            if (((Boolean)bx1.getObject()).booleanValue())
            {
                a1.a(e, hashset, hashset1, ck1);
            }
            if (flag && bx1.tj())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        hashset.removeAll(hashset1);
        return new bx(hashset, flag);
    }

    private void a(com.google.android.gms.internal.d.a a1, Set set)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((a1 = a(a1, set, new dh())) != aPp)
        {
            a1 = ((com.google.android.gms.internal.d.a) (de.o((com.google.android.gms.internal.d.a)a1.getObject())));
            if (a1 instanceof Map)
            {
                a1 = (Map)a1;
                aMx.push(a1);
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
                        aMx.push(set);
                    } else
                    {
                        bg.w("pushAfterEvaluate: value not a Map");
                    }
                }
            } else
            {
                bg.w("pushAfterEvaluate: value not a Map or List");
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void dU(String s)
    {
        this;
        JVM INSTR monitorenter ;
        aPz = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private String tQ()
    {
        if (aPA <= 1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toString(aPA));
        for (int i = 2; i < aPA; i++)
        {
            stringbuilder.append(' ');
        }

        stringbuilder.append(": ");
        return stringbuilder.toString();
    }

    public final void ds(String s)
    {
        this;
        JVM INSTR monitorenter ;
        dU(s);
        s = aPr.dD(s).sR();
        co.a a1;
        for (Iterator iterator = ((Set)a(aPx, s.sK()).getObject()).iterator(); iterator.hasNext(); a(aPs, a1, new HashSet(), s.sJ()))
        {
            a1 = (co.a)iterator.next();
        }

        break MISSING_BLOCK_LABEL_99;
        s;
        throw s;
        dU(null);
        this;
        JVM INSTR monitorexit ;
    }

}
