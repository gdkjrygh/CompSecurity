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
//            bz, di, l, i, 
//            s, w, dj, q, 
//            ad, ae, al, am, 
//            bd, be, ci, dc, 
//            b, c, e, f, 
//            g, h, m, p, 
//            u, z, aa, ac, 
//            ah, an, ao, ax, 
//            az, bc, bj, bl, 
//            ca, cc, cf, ch, 
//            cj, cu, cv, de, 
//            dk, ag, bh, cr, 
//            dl, dm, k, bk, 
//            aj, ck, cm, cs, 
//            bx, DataLayer, cn, af, 
//            t, ai, cl

class ct
{
    static interface a
    {

        public abstract void a(cr.e e1, Set set, Set set1, cn cn1);
    }

    private static class b
    {

        private com.google.android.gms.internal.d.a asN;
        private bz ats;

        public int getSize()
        {
            int i1 = ((com.google.android.gms.internal.d.a)ats.getObject()).rY();
            int j;
            if (asN == null)
            {
                j = 0;
            } else
            {
                j = asN.rY();
            }
            return j + i1;
        }

        public bz qG()
        {
            return ats;
        }

        public com.google.android.gms.internal.d.a qm()
        {
            return asN;
        }

        public b(bz bz1, com.google.android.gms.internal.d.a a1)
        {
            ats = bz1;
            asN = a1;
        }
    }

    private static class c
    {

        private final Set atj = new HashSet();
        private final Map att = new HashMap();
        private final Map atu = new HashMap();
        private final Map atv = new HashMap();
        private final Map atw = new HashMap();
        private cr.a atx;

        public void a(cr.e e1, cr.a a1)
        {
            List list = (List)att.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                att.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public void a(cr.e e1, String s1)
        {
            List list = (List)atv.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                atv.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public void b(cr.e e1)
        {
            atj.add(e1);
        }

        public void b(cr.e e1, cr.a a1)
        {
            List list = (List)atu.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                atu.put(e1, obj);
            }
            ((List) (obj)).add(a1);
        }

        public void b(cr.e e1, String s1)
        {
            List list = (List)atw.get(e1);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                atw.put(e1, obj);
            }
            ((List) (obj)).add(s1);
        }

        public void i(cr.a a1)
        {
            atx = a1;
        }

        public Set qH()
        {
            return atj;
        }

        public Map qI()
        {
            return att;
        }

        public Map qJ()
        {
            return atv;
        }

        public Map qK()
        {
            return atw;
        }

        public Map qL()
        {
            return atu;
        }

        public cr.a qM()
        {
            return atx;
        }

        public c()
        {
        }
    }


    private static final bz atb = new bz(di.rb(), true);
    private final DataLayer aqn;
    private final cr.c atc;
    private final ag atd;
    private final Map ate = new HashMap();
    private final Map atf = new HashMap();
    private final Map atg = new HashMap();
    private final k ath;
    private final k ati;
    private final Set atj;
    private final Map atk = new HashMap();
    private volatile String atl;
    private int atm;

    public ct(Context context, cr.c c1, DataLayer datalayer, s.a a1, s.a a2, ag ag1)
    {
        if (c1 == null)
        {
            throw new NullPointerException("resource cannot be null");
        }
        atc = c1;
        atj = new HashSet(c1.qp());
        aqn = datalayer;
        atd = ag1;
        c1 = new l.a() {

            final ct atn;

            public int a(cr.a a3, bz bz1)
            {
                return ((com.google.android.gms.internal.d.a)bz1.getObject()).rY();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((cr.a)obj, (bz)obj1);
            }

            
            {
                atn = ct.this;
                super();
            }
        };
        ath = (new l()).a(0x100000, c1);
        c1 = new l.a() {

            final ct atn;

            public int a(String s1, b b1)
            {
                return s1.length() + b1.getSize();
            }

            public int sizeOf(Object obj, Object obj1)
            {
                return a((String)obj, (b)obj1);
            }

            
            {
                atn = ct.this;
                super();
            }
        };
        ati = (new l()).a(0x100000, c1);
        b(new i(context));
        b(new s(a2));
        b(new w(datalayer));
        b(new dj(context, datalayer));
        c(new q());
        c(new ad());
        c(new ae());
        c(new al());
        c(new am());
        c(new bd());
        c(new be());
        c(new ci());
        c(new dc());
        a(new com.google.android.gms.tagmanager.b(context));
        a(new com.google.android.gms.tagmanager.c(context));
        a(new e(context));
        a(new f(context));
        a(new g(context));
        a(new h(context));
        a(new m());
        a(new p(atc.getVersion()));
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
        a(new bj());
        a(new bl(context));
        a(new ca());
        a(new cc());
        a(new cf());
        a(new ch());
        a(new cj(context));
        a(new cu());
        a(new cv());
        a(new de());
        a(new dk());
        for (datalayer = atj.iterator(); datalayer.hasNext();)
        {
            a1 = (cr.e)datalayer.next();
            if (ag1.pH())
            {
                a(a1.qx(), a1.qy(), "add macro");
                a(a1.qC(), a1.qz(), "remove macro");
                a(a1.qv(), a1.qA(), "add tag");
                a(a1.qw(), a1.qB(), "remove tag");
            }
            for (int j = 0; j < a1.qx().size(); j++)
            {
                a2 = (cr.a)a1.qx().get(j);
                c1 = "Unknown";
                context = c1;
                if (ag1.pH())
                {
                    context = c1;
                    if (j < a1.qy().size())
                    {
                        context = (String)a1.qy().get(j);
                    }
                }
                c1 = e(atk, h(a2));
                c1.b(a1);
                c1.a(a1, a2);
                c1.a(a1, context);
            }

            int i1 = 0;
            while (i1 < a1.qC().size()) 
            {
                a2 = (cr.a)a1.qC().get(i1);
                c1 = "Unknown";
                context = c1;
                if (ag1.pH())
                {
                    context = c1;
                    if (i1 < a1.qz().size())
                    {
                        context = (String)a1.qz().get(i1);
                    }
                }
                c1 = e(atk, h(a2));
                c1.b(a1);
                c1.b(a1, a2);
                c1.b(a1, context);
                i1++;
            }
        }

        for (context = atc.qq().entrySet().iterator(); context.hasNext();)
        {
            c1 = (java.util.Map.Entry)context.next();
            datalayer = ((List)c1.getValue()).iterator();
            while (datalayer.hasNext()) 
            {
                a1 = (cr.a)datalayer.next();
                if (!di.n((com.google.android.gms.internal.d.a)a1.ql().get(com.google.android.gms.internal.b.dG.toString())).booleanValue())
                {
                    e(atk, (String)c1.getKey()).i(a1);
                }
            }
        }

    }

    private bz a(com.google.android.gms.internal.d.a a1, Set set, dl dl1)
    {
        if (!a1.gF)
        {
            return new bz(a1, true);
        }
        com.google.android.gms.internal.d.a a4;
        int j1;
        switch (a1.type)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            bh.T((new StringBuilder()).append("Unknown type: ").append(a1.type).toString());
            return atb;

        case 2: // '\002'
            com.google.android.gms.internal.d.a a2 = com.google.android.gms.tagmanager.cr.g(a1);
            a2.gw = new com.google.android.gms.internal.d.a[a1.gw.length];
            for (int j = 0; j < a1.gw.length; j++)
            {
                bz bz1 = a(a1.gw[j], set, dl1.fK(j));
                if (bz1 == atb)
                {
                    return atb;
                }
                a2.gw[j] = (com.google.android.gms.internal.d.a)bz1.getObject();
            }

            return new bz(a2, false);

        case 3: // '\003'
            com.google.android.gms.internal.d.a a3 = com.google.android.gms.tagmanager.cr.g(a1);
            if (a1.gx.length != a1.gy.length)
            {
                bh.T((new StringBuilder()).append("Invalid serving value: ").append(a1.toString()).toString());
                return atb;
            }
            a3.gx = new com.google.android.gms.internal.d.a[a1.gx.length];
            a3.gy = new com.google.android.gms.internal.d.a[a1.gx.length];
            for (int i1 = 0; i1 < a1.gx.length; i1++)
            {
                bz bz2 = a(a1.gx[i1], set, dl1.fL(i1));
                bz bz4 = a(a1.gy[i1], set, dl1.fM(i1));
                if (bz2 == atb || bz4 == atb)
                {
                    return atb;
                }
                a3.gx[i1] = (com.google.android.gms.internal.d.a)bz2.getObject();
                a3.gy[i1] = (com.google.android.gms.internal.d.a)bz4.getObject();
            }

            return new bz(a3, false);

        case 4: // '\004'
            if (set.contains(a1.gz))
            {
                bh.T((new StringBuilder()).append("Macro cycle detected.  Current macro reference: ").append(a1.gz).append(".").append("  Previous macro references: ").append(set.toString()).append(".").toString());
                return atb;
            } else
            {
                set.add(a1.gz);
                dl1 = dm.a(a(a1.gz, set, dl1.pW()), a1.gE);
                set.remove(a1.gz);
                return dl1;
            }

        case 7: // '\007'
            a4 = com.google.android.gms.tagmanager.cr.g(a1);
            a4.gD = new com.google.android.gms.internal.d.a[a1.gD.length];
            j1 = 0;
            break;
        }
        for (; j1 < a1.gD.length; j1++)
        {
            bz bz3 = a(a1.gD[j1], set, dl1.fN(j1));
            if (bz3 == atb)
            {
                return atb;
            }
            a4.gD[j1] = (com.google.android.gms.internal.d.a)bz3.getObject();
        }

        return new bz(a4, false);
    }

    private bz a(String s1, Set set, bk bk1)
    {
        atm = atm + 1;
        Object obj = (b)ati.get(s1);
        if (obj != null && !atd.pH())
        {
            a(((b) (obj)).qm(), set);
            atm = atm - 1;
            return ((b) (obj)).qG();
        }
        obj = (c)atk.get(s1);
        if (obj == null)
        {
            bh.T((new StringBuilder()).append(qF()).append("Invalid macro: ").append(s1).toString());
            atm = atm - 1;
            return atb;
        }
        bz bz1 = a(s1, ((c) (obj)).qH(), ((c) (obj)).qI(), ((c) (obj)).qJ(), ((c) (obj)).qL(), ((c) (obj)).qK(), set, bk1.py());
        if (((Set)bz1.getObject()).isEmpty())
        {
            obj = ((c) (obj)).qM();
        } else
        {
            if (((Set)bz1.getObject()).size() > 1)
            {
                bh.W((new StringBuilder()).append(qF()).append("Multiple macros active for macroName ").append(s1).toString());
            }
            obj = (cr.a)((Set)bz1.getObject()).iterator().next();
        }
        if (obj == null)
        {
            atm = atm - 1;
            return atb;
        }
        bk1 = a(atg, ((cr.a) (obj)), set, bk1.pN());
        boolean flag;
        if (bz1.pX() && bk1.pX())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (bk1 == atb)
        {
            bk1 = atb;
        } else
        {
            bk1 = new bz(bk1.getObject(), flag);
        }
        obj = ((cr.a) (obj)).qm();
        if (bk1.pX())
        {
            ati.e(s1, new b(bk1, ((com.google.android.gms.internal.d.a) (obj))));
        }
        a(((com.google.android.gms.internal.d.a) (obj)), set);
        atm = atm - 1;
        return bk1;
    }

    private bz a(Map map, cr.a a1, Set set, ck ck1)
    {
        boolean flag1 = true;
        Object obj = (com.google.android.gms.internal.d.a)a1.ql().get(com.google.android.gms.internal.b.cU.toString());
        if (obj == null)
        {
            bh.T("No function id in properties");
            map = atb;
        } else
        {
            obj = ((com.google.android.gms.internal.d.a) (obj)).gA;
            aj aj1 = (aj)map.get(obj);
            if (aj1 == null)
            {
                bh.T((new StringBuilder()).append(((String) (obj))).append(" has no backing implementation.").toString());
                return atb;
            }
            map = (bz)ath.get(a1);
            if (map == null || atd.pH())
            {
                map = new HashMap();
                Iterator iterator = a1.ql().entrySet().iterator();
                boolean flag = true;
                while (iterator.hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                    Object obj1 = ck1.cJ((String)entry.getKey());
                    obj1 = a((com.google.android.gms.internal.d.a)entry.getValue(), set, ((cm) (obj1)).e((com.google.android.gms.internal.d.a)entry.getValue()));
                    if (obj1 == atb)
                    {
                        return atb;
                    }
                    if (((bz) (obj1)).pX())
                    {
                        a1.a((String)entry.getKey(), (com.google.android.gms.internal.d.a)((bz) (obj1)).getObject());
                    } else
                    {
                        flag = false;
                    }
                    map.put(entry.getKey(), ((bz) (obj1)).getObject());
                }
                if (!aj1.a(map.keySet()))
                {
                    bh.T((new StringBuilder()).append("Incorrect keys for function ").append(((String) (obj))).append(" required ").append(aj1.pJ()).append(" had ").append(map.keySet()).toString());
                    return atb;
                }
                if (!flag || !aj1.pe())
                {
                    flag1 = false;
                }
                map = new bz(aj1.B(map), flag1);
                if (flag1)
                {
                    ath.e(a1, map);
                }
                ck1.d((com.google.android.gms.internal.d.a)map.getObject());
                return map;
            }
        }
        return map;
    }

    private bz a(Set set, Set set1, a a1, cs cs1)
    {
        HashSet hashset = new HashSet();
        HashSet hashset1 = new HashSet();
        set = set.iterator();
        boolean flag = true;
        while (set.hasNext()) 
        {
            cr.e e1 = (cr.e)set.next();
            cn cn1 = cs1.pV();
            bz bz1 = a(e1, set1, cn1);
            if (((Boolean)bz1.getObject()).booleanValue())
            {
                a1.a(e1, hashset, hashset1, cn1);
            }
            if (flag && bz1.pX())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        hashset.removeAll(hashset1);
        cs1.b(hashset);
        return new bz(hashset, flag);
    }

    private void a(com.google.android.gms.internal.d.a a1, Set set)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((a1 = a(a1, set, ((dl) (new bx())))) != atb)
        {
            a1 = ((com.google.android.gms.internal.d.a) (di.o((com.google.android.gms.internal.d.a)a1.getObject())));
            if (a1 instanceof Map)
            {
                a1 = (Map)a1;
                aqn.push(a1);
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
                        aqn.push(set);
                    } else
                    {
                        bh.W("pushAfterEvaluate: value not a Map");
                    }
                }
            } else
            {
                bh.W("pushAfterEvaluate: value not a Map or List");
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
            bh.U((new StringBuilder()).append("Invalid resource: imbalance of rule names of functions for ").append(s1).append(" operation. Using default rule name instead").toString());
        }
    }

    private static void a(Map map, aj aj1)
    {
        if (map.containsKey(aj1.pI()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Duplicate function type name: ").append(aj1.pI()).toString());
        } else
        {
            map.put(aj1.pI(), aj1);
            return;
        }
    }

    private static c e(Map map, String s1)
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

    private static String h(cr.a a1)
    {
        return di.j((com.google.android.gms.internal.d.a)a1.ql().get(com.google.android.gms.internal.b.df.toString()));
    }

    private String qF()
    {
        if (atm <= 1)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(Integer.toString(atm));
        for (int j = 2; j < atm; j++)
        {
            stringbuilder.append(' ');
        }

        stringbuilder.append(": ");
        return stringbuilder.toString();
    }

    bz a(cr.a a1, Set set, ck ck1)
    {
        a1 = a(atf, a1, set, ck1);
        set = di.n((com.google.android.gms.internal.d.a)a1.getObject());
        ck1.d(di.u(set));
        return new bz(set, a1.pX());
    }

    bz a(cr.e e1, Set set, cn cn1)
    {
        Iterator iterator = e1.qu().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            bz bz2 = a((cr.a)iterator.next(), set, cn1.pP());
            if (((Boolean)bz2.getObject()).booleanValue())
            {
                cn1.f(di.u(Boolean.valueOf(false)));
                return new bz(Boolean.valueOf(false), bz2.pX());
            }
            if (flag && bz2.pX())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        for (e1 = e1.qt().iterator(); e1.hasNext();)
        {
            bz bz1 = a((cr.a)e1.next(), set, cn1.pQ());
            if (!((Boolean)bz1.getObject()).booleanValue())
            {
                cn1.f(di.u(Boolean.valueOf(false)));
                return new bz(Boolean.valueOf(false), bz1.pX());
            }
            if (flag && bz1.pX())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }

        cn1.f(di.u(Boolean.valueOf(true)));
        return new bz(Boolean.valueOf(true), flag);
    }

    bz a(String s1, Set set, Map map, Map map1, Map map2, Map map3, Set set1, 
            cs cs1)
    {
        return a(set, set1, new a(map, map1, map2, map3) {

            final ct atn;
            final Map ato;
            final Map atp;
            final Map atq;
            final Map atr;

            public void a(cr.e e1, Set set2, Set set3, cn cn1)
            {
                List list = (List)ato.get(e1);
                List list1 = (List)atp.get(e1);
                if (list != null)
                {
                    set2.addAll(list);
                    cn1.pR().c(list, list1);
                }
                set2 = (List)atq.get(e1);
                e1 = (List)atr.get(e1);
                if (set2 != null)
                {
                    set3.addAll(set2);
                    cn1.pS().c(set2, e1);
                }
            }

            
            {
                atn = ct.this;
                ato = map;
                atp = map1;
                atq = map2;
                atr = map3;
                super();
            }
        }, cs1);
    }

    bz a(Set set, cs cs1)
    {
        return a(set, ((Set) (new HashSet())), new a() {

            final ct atn;

            public void a(cr.e e1, Set set1, Set set2, cn cn1)
            {
                set1.addAll(e1.qv());
                set2.addAll(e1.qw());
                cn1.pT().c(e1.qv(), e1.qA());
                cn1.pU().c(e1.qw(), e1.qB());
            }

            
            {
                atn = ct.this;
                super();
            }
        }, cs1);
    }

    void a(aj aj1)
    {
        a(atg, aj1);
    }

    void b(aj aj1)
    {
        a(ate, aj1);
    }

    void c(aj aj1)
    {
        a(atf, aj1);
    }

    public bz cT(String s1)
    {
        atm = 0;
        af af1 = atd.cC(s1);
        s1 = a(s1, new HashSet(), af1.pE());
        af1.pG();
        return s1;
    }

    void cU(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        atl = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public void cr(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        cU(s1);
        s1 = atd.cD(s1);
        t t1 = s1.pF();
        cr.a a1;
        for (Iterator iterator = ((Set)a(atj, t1.py()).getObject()).iterator(); iterator.hasNext(); a(ate, a1, new HashSet(), t1.px()))
        {
            a1 = (cr.a)iterator.next();
        }

        break MISSING_BLOCK_LABEL_103;
        s1;
        throw s1;
        s1.pG();
        cU(null);
        this;
        JVM INSTR monitorexit ;
    }

    public void l(List list)
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
            bh.V((new StringBuilder()).append("Ignored supplemental: ").append(j).toString());
        } while (true);
        list;
        throw list;
        ai.a(aqn, j);
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
    }

    String qE()
    {
        this;
        JVM INSTR monitorenter ;
        String s1 = atl;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

}
