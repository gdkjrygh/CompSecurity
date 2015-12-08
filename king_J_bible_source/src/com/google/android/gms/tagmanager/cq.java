// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            dh, bh

class cq
{
    public static class a
    {

        private final Map Zp;
        private final com.google.android.gms.internal.d.a Zq;

        public static b ld()
        {
            return new b();
        }

        public void a(String s, com.google.android.gms.internal.d.a a1)
        {
            Zp.put(s, a1);
        }

        public Map le()
        {
            return Collections.unmodifiableMap(Zp);
        }

        public com.google.android.gms.internal.d.a lf()
        {
            return Zq;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Properties: ").append(le()).append(" pushAfterEvaluate: ").append(Zq).toString();
        }

        private a(Map map, com.google.android.gms.internal.d.a a1)
        {
            Zp = map;
            Zq = a1;
        }

    }

    public static class b
    {

        private final Map Zp;
        private com.google.android.gms.internal.d.a Zq;

        public b b(String s, com.google.android.gms.internal.d.a a1)
        {
            Zp.put(s, a1);
            return this;
        }

        public b i(com.google.android.gms.internal.d.a a1)
        {
            Zq = a1;
            return this;
        }

        public a lg()
        {
            return new a(Zp, Zq);
        }

        private b()
        {
            Zp = new HashMap();
        }

    }

    public static class c
    {

        private final String Xl;
        private final List Zr;
        private final Map Zs;
        private final int Zt;

        public static d lh()
        {
            return new d();
        }

        public String getVersion()
        {
            return Xl;
        }

        public List li()
        {
            return Zr;
        }

        public Map lj()
        {
            return Zs;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Rules: ").append(li()).append("  Macros: ").append(Zs).toString();
        }

        private c(List list, Map map, String s, int i)
        {
            Zr = Collections.unmodifiableList(list);
            Zs = Collections.unmodifiableMap(map);
            Xl = s;
            Zt = i;
        }

    }

    public static class d
    {

        private String Xl;
        private final List Zr;
        private final Map Zs;
        private int Zt;

        public d a(a a1)
        {
            String s = dh.j((com.google.android.gms.internal.d.a)a1.le().get(com.google.android.gms.internal.b.cI.toString()));
            List list = (List)Zs.get(s);
            Object obj = list;
            if (list == null)
            {
                obj = new ArrayList();
                Zs.put(s, obj);
            }
            ((List) (obj)).add(a1);
            return this;
        }

        public d a(e e1)
        {
            Zr.add(e1);
            return this;
        }

        public d bM(String s)
        {
            Xl = s;
            return this;
        }

        public d ch(int i)
        {
            Zt = i;
            return this;
        }

        public c lk()
        {
            return new c(Zr, Zs, Xl, Zt);
        }

        private d()
        {
            Zr = new ArrayList();
            Zs = new HashMap();
            Xl = "";
            Zt = 0;
        }

    }

    public static class e
    {

        private final List ZA;
        private final List ZB;
        private final List ZC;
        private final List ZD;
        private final List Zu;
        private final List Zv;
        private final List Zw;
        private final List Zx;
        private final List Zy;
        private final List Zz;

        public static f ll()
        {
            return new f();
        }

        public List lm()
        {
            return Zu;
        }

        public List ln()
        {
            return Zv;
        }

        public List lo()
        {
            return Zw;
        }

        public List lp()
        {
            return Zx;
        }

        public List lq()
        {
            return Zy;
        }

        public List lr()
        {
            return ZA;
        }

        public List ls()
        {
            return ZB;
        }

        public List lt()
        {
            return ZC;
        }

        public List lu()
        {
            return ZD;
        }

        public List lv()
        {
            return Zz;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Positive predicates: ").append(lm()).append("  Negative predicates: ").append(ln()).append("  Add tags: ").append(lo()).append("  Remove tags: ").append(lp()).append("  Add macros: ").append(lq()).append("  Remove macros: ").append(lv()).toString();
        }

        private e(List list, List list1, List list2, List list3, List list4, List list5, List list6, 
                List list7, List list8, List list9)
        {
            Zu = Collections.unmodifiableList(list);
            Zv = Collections.unmodifiableList(list1);
            Zw = Collections.unmodifiableList(list2);
            Zx = Collections.unmodifiableList(list3);
            Zy = Collections.unmodifiableList(list4);
            Zz = Collections.unmodifiableList(list5);
            ZA = Collections.unmodifiableList(list6);
            ZB = Collections.unmodifiableList(list7);
            ZC = Collections.unmodifiableList(list8);
            ZD = Collections.unmodifiableList(list9);
        }

    }

    public static class f
    {

        private final List ZA;
        private final List ZB;
        private final List ZC;
        private final List ZD;
        private final List Zu;
        private final List Zv;
        private final List Zw;
        private final List Zx;
        private final List Zy;
        private final List Zz;

        public f b(a a1)
        {
            Zu.add(a1);
            return this;
        }

        public f bN(String s)
        {
            ZC.add(s);
            return this;
        }

        public f bO(String s)
        {
            ZD.add(s);
            return this;
        }

        public f bP(String s)
        {
            ZA.add(s);
            return this;
        }

        public f bQ(String s)
        {
            ZB.add(s);
            return this;
        }

        public f c(a a1)
        {
            Zv.add(a1);
            return this;
        }

        public f d(a a1)
        {
            Zw.add(a1);
            return this;
        }

        public f e(a a1)
        {
            Zx.add(a1);
            return this;
        }

        public f f(a a1)
        {
            Zy.add(a1);
            return this;
        }

        public f g(a a1)
        {
            Zz.add(a1);
            return this;
        }

        public e lw()
        {
            return new e(Zu, Zv, Zw, Zx, Zy, Zz, ZA, ZB, ZC, ZD);
        }

        private f()
        {
            Zu = new ArrayList();
            Zv = new ArrayList();
            Zw = new ArrayList();
            Zx = new ArrayList();
            Zy = new ArrayList();
            Zz = new ArrayList();
            ZA = new ArrayList();
            ZB = new ArrayList();
            ZC = new ArrayList();
            ZD = new ArrayList();
        }

    }

    public static class g extends Exception
    {

        public g(String s)
        {
            super(s);
        }
    }


    private static com.google.android.gms.internal.d.a a(int i, com.google.android.gms.internal.c.f f1, com.google.android.gms.internal.d.a aa[], Set set)
        throws g
    {
        Object obj;
        com.google.android.gms.internal.d.a a1;
        int j1;
        int i2;
        int l2;
        i2 = 0;
        l2 = 0;
        j1 = 0;
        if (set.contains(Integer.valueOf(i)))
        {
            bL((new StringBuilder()).append("Value cycle detected.  Current value reference: ").append(i).append(".").append("  Previous value references: ").append(set).append(".").toString());
        }
        a1 = (com.google.android.gms.internal.d.a)a(((Object []) (f1.eX)), i, "values");
        if (aa[i] != null)
        {
            return aa[i];
        }
        obj = null;
        set.add(Integer.valueOf(i));
        a1.type;
        JVM INSTR tableswitch 1 8: default 152
    //                   1 653
    //                   2 199
    //                   3 291
    //                   4 525
    //                   5 653
    //                   6 653
    //                   7 557
    //                   8 653;
           goto _L1 _L2 _L3 _L4 _L5 _L2 _L2 _L6 _L2
_L1:
        if (obj == null)
        {
            bL((new StringBuilder()).append("Invalid value: ").append(a1).toString());
        }
        aa[i] = ((com.google.android.gms.internal.d.a) (obj));
        set.remove(Integer.valueOf(i));
        return ((com.google.android.gms.internal.d.a) (obj));
_L3:
        obj = h(a1);
        com.google.android.gms.internal.d.a a2 = g(a1);
        a2.fO = new com.google.android.gms.internal.d.a[((com.google.android.gms.internal.c.h) (obj)).fz.length];
        int ai[] = ((com.google.android.gms.internal.c.h) (obj)).fz;
        i2 = ai.length;
        int j = 0;
        do
        {
            obj = a2;
            if (j1 >= i2)
            {
                continue; /* Loop/switch isn't completed */
            }
            l2 = ai[j1];
            a2.fO[j] = a(l2, f1, aa, set);
            j1++;
            j++;
        } while (true);
_L4:
        com.google.android.gms.internal.d.a a3 = g(a1);
        obj = h(a1);
        if (((com.google.android.gms.internal.c.h) (obj)).fA.length != ((com.google.android.gms.internal.c.h) (obj)).fB.length)
        {
            bL((new StringBuilder()).append("Uneven map keys (").append(((com.google.android.gms.internal.c.h) (obj)).fA.length).append(") and map values (").append(((com.google.android.gms.internal.c.h) (obj)).fB.length).append(")").toString());
        }
        a3.fP = new com.google.android.gms.internal.d.a[((com.google.android.gms.internal.c.h) (obj)).fA.length];
        a3.fQ = new com.google.android.gms.internal.d.a[((com.google.android.gms.internal.c.h) (obj)).fA.length];
        int ai1[] = ((com.google.android.gms.internal.c.h) (obj)).fA;
        l2 = ai1.length;
        int k1 = 0;
        for (int k = 0; k1 < l2; k++)
        {
            int j3 = ai1[k1];
            a3.fP[k] = a(j3, f1, aa, set);
            k1++;
        }

        ai1 = ((com.google.android.gms.internal.c.h) (obj)).fB;
        l2 = ai1.length;
        int l = 0;
        k1 = i2;
        do
        {
            obj = a3;
            if (k1 >= l2)
            {
                continue; /* Loop/switch isn't completed */
            }
            int j2 = ai1[k1];
            a3.fQ[l] = a(j2, f1, aa, set);
            k1++;
            l++;
        } while (true);
_L5:
        obj = g(a1);
        obj.fR = dh.j(a(h(a1).fE, f1, aa, set));
        continue; /* Loop/switch isn't completed */
_L6:
        com.google.android.gms.internal.d.a a4 = g(a1);
        obj = h(a1);
        a4.fV = new com.google.android.gms.internal.d.a[((com.google.android.gms.internal.c.h) (obj)).fD.length];
        int ai2[] = ((com.google.android.gms.internal.c.h) (obj)).fD;
        int k2 = ai2.length;
        int i1 = 0;
        int l1 = l2;
        do
        {
            obj = a4;
            if (l1 >= k2)
            {
                continue; /* Loop/switch isn't completed */
            }
            int i3 = ai2[l1];
            a4.fV[i1] = a(i3, f1, aa, set);
            l1++;
            i1++;
        } while (true);
_L2:
        obj = a1;
        if (true) goto _L1; else goto _L7
_L7:
    }

    private static a a(com.google.android.gms.internal.c.b b1, com.google.android.gms.internal.c.f f1, com.google.android.gms.internal.d.a aa[], int i)
        throws g
    {
        b b2 = a.ld();
        b1 = b1.eH;
        int j = b1.length;
        i = 0;
        while (i < j) 
        {
            int k = b1[i];
            Object obj = (com.google.android.gms.internal.c.e)a(((Object []) (f1.eY)), Integer.valueOf(k).intValue(), "properties");
            String s = (String)a(((Object []) (f1.eW)), ((com.google.android.gms.internal.c.e) (obj)).key, "keys");
            obj = (com.google.android.gms.internal.d.a)a(((Object []) (aa)), ((com.google.android.gms.internal.c.e) (obj)).value, "values");
            if (com.google.android.gms.internal.b.dB.toString().equals(s))
            {
                b2.i(((com.google.android.gms.internal.d.a) (obj)));
            } else
            {
                b2.b(s, ((com.google.android.gms.internal.d.a) (obj)));
            }
            i++;
        }
        return b2.lg();
    }

    private static e a(com.google.android.gms.internal.c.g g1, List list, List list1, List list2, com.google.android.gms.internal.c.f f1)
    {
        f f2 = e.ll();
        int ai[] = g1.fn;
        int k2 = ai.length;
        for (int i = 0; i < k2; i++)
        {
            f2.b((a)list2.get(Integer.valueOf(ai[i]).intValue()));
        }

        ai = g1.fo;
        k2 = ai.length;
        for (int j = 0; j < k2; j++)
        {
            f2.c((a)list2.get(Integer.valueOf(ai[j]).intValue()));
        }

        list2 = g1.fp;
        k2 = list2.length;
        for (int k = 0; k < k2; k++)
        {
            f2.d((a)list.get(Integer.valueOf(list2[k]).intValue()));
        }

        list2 = g1.fr;
        k2 = list2.length;
        for (int l = 0; l < k2; l++)
        {
            int l2 = list2[l];
            f2.bN(f1.eX[Integer.valueOf(l2).intValue()].fN);
        }

        list2 = g1.fq;
        k2 = list2.length;
        for (int i1 = 0; i1 < k2; i1++)
        {
            f2.e((a)list.get(Integer.valueOf(list2[i1]).intValue()));
        }

        list = g1.fs;
        k2 = list.length;
        for (int j1 = 0; j1 < k2; j1++)
        {
            int i3 = list[j1];
            f2.bO(f1.eX[Integer.valueOf(i3).intValue()].fN);
        }

        list = g1.ft;
        k2 = list.length;
        for (int k1 = 0; k1 < k2; k1++)
        {
            f2.f((a)list1.get(Integer.valueOf(list[k1]).intValue()));
        }

        list = g1.fv;
        k2 = list.length;
        for (int l1 = 0; l1 < k2; l1++)
        {
            int j3 = list[l1];
            f2.bP(f1.eX[Integer.valueOf(j3).intValue()].fN);
        }

        list = g1.fu;
        k2 = list.length;
        for (int i2 = 0; i2 < k2; i2++)
        {
            f2.g((a)list1.get(Integer.valueOf(list[i2]).intValue()));
        }

        g1 = g1.fw;
        k2 = g1.length;
        for (int j2 = 0; j2 < k2; j2++)
        {
            int k3 = g1[j2];
            f2.bQ(f1.eX[Integer.valueOf(k3).intValue()].fN);
        }

        return f2.lw();
    }

    private static Object a(Object aobj[], int i, String s)
        throws g
    {
        if (i < 0 || i >= aobj.length)
        {
            bL((new StringBuilder()).append("Index out of bounds detected: ").append(i).append(" in ").append(s).toString());
        }
        return aobj[i];
    }

    public static c b(com.google.android.gms.internal.c.f f1)
        throws g
    {
        boolean flag = false;
        Object aobj[] = new com.google.android.gms.internal.d.a[f1.eX.length];
        for (int i = 0; i < f1.eX.length; i++)
        {
            a(i, f1, ((com.google.android.gms.internal.d.a []) (aobj)), new HashSet(0));
        }

        d d1 = c.lh();
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < f1.fa.length; j++)
        {
            arraylist.add(a(f1.fa[j], f1, ((com.google.android.gms.internal.d.a []) (aobj)), j));
        }

        ArrayList arraylist1 = new ArrayList();
        for (int k = 0; k < f1.fb.length; k++)
        {
            arraylist1.add(a(f1.fb[k], f1, ((com.google.android.gms.internal.d.a []) (aobj)), k));
        }

        ArrayList arraylist2 = new ArrayList();
        for (int l = 0; l < f1.eZ.length; l++)
        {
            a a1 = a(f1.eZ[l], f1, ((com.google.android.gms.internal.d.a []) (aobj)), l);
            d1.a(a1);
            arraylist2.add(a1);
        }

        aobj = f1.fc;
        int j1 = aobj.length;
        for (int i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            d1.a(a(aobj[i1], arraylist, arraylist2, arraylist1, f1));
        }

        d1.bM(f1.fg);
        d1.ch(f1.fl);
        return d1.lk();
    }

    public static void b(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                return;
            }
            outputstream.write(abyte0, 0, i);
        } while (true);
    }

    private static void bL(String s)
        throws g
    {
        bh.w(s);
        throw new g(s);
    }

    public static com.google.android.gms.internal.d.a g(com.google.android.gms.internal.d.a a1)
    {
        com.google.android.gms.internal.d.a a2 = new com.google.android.gms.internal.d.a();
        a2.type = a1.type;
        a2.fW = (int[])a1.fW.clone();
        if (a1.fX)
        {
            a2.fX = a1.fX;
        }
        return a2;
    }

    private static com.google.android.gms.internal.c.h h(com.google.android.gms.internal.d.a a1)
        throws g
    {
        if ((com.google.android.gms.internal.c.h)a1.a(com.google.android.gms.internal.c.h.fx) == null)
        {
            bL((new StringBuilder()).append("Expected a ServingValue and didn't get one. Value is: ").append(a1).toString());
        }
        return (com.google.android.gms.internal.c.h)a1.a(com.google.android.gms.internal.c.h.fx);
    }
}
