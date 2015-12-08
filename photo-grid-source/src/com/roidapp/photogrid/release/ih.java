// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import com.roidapp.baselib.d.a;
import com.roidapp.cloudlib.template.d;
import com.roidapp.cloudlib.template.e;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import com.roidapp.imagelib.filter.groupinfo.IGroupInfo;
import com.roidapp.photogrid.common.az;
import com.roidapp.videolib.b.u;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;

// Referenced classes of package com.roidapp.photogrid.release:
//            ao, ig

public final class ih
{

    private static ih aZ = new ih();
    private boolean A;
    private boolean B;
    private boolean C;
    private String D;
    private String E;
    private boolean F;
    private boolean G;
    private boolean H;
    private List I;
    private List J;
    private List K;
    private List L;
    private List M;
    private List N;
    private List O;
    private List P;
    private List Q;
    private float R[];
    private List S;
    private int T;
    private String U;
    private int V;
    private boolean W;
    private boolean X;
    private String Y;
    private int Z;
    private String a;
    private Stack aA;
    private d aB;
    private List aC;
    private List aD;
    private boolean aE;
    private boolean aF;
    private boolean aG;
    private boolean aH;
    private boolean aI;
    private String aJ;
    private float aK;
    private float aL;
    private int aM;
    private int aN;
    private int aO;
    private boolean aP;
    private List aQ;
    private float aR;
    private int aS;
    private int aT;
    private int aU;
    private boolean aV;
    private String aW;
    private int aX;
    private boolean aY;
    private int aa;
    private int ab;
    private int ac;
    private boolean ad;
    private int ae;
    private int af;
    private int ag;
    private int ah;
    private int ai;
    private float aj;
    private float ak;
    private List al;
    private int am;
    private float an;
    private float ao;
    private float ap;
    private float aq;
    private int ar;
    private int as;
    private boolean at;
    private int au;
    private boolean av;
    private List aw;
    private String ax;
    private String ay;
    private boolean az;
    private ig b[];
    private u ba;
    private String bb;
    private u bc[];
    private boolean bd;
    private int be;
    private IFilterInfo bf;
    private int bg;
    private IGroupInfo bh;
    private ig c[];
    private ig d;
    private String e;
    private int f;
    private boolean g;
    private String h[];
    private int i;
    private int j;
    private HashMap k;
    private HashMap l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;
    private List r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private int x;
    private float y;
    private int z;

    private ih()
    {
        o = 4;
        p = 4;
        q = -20;
        s = 100F;
        t = 0.64F;
        u = 0.64F;
        v = 0.0F;
        x = 0;
        A = false;
        C = false;
        T = 0;
        V = 0;
        W = false;
        X = false;
        aa = 0;
        ab = 4;
        ac = 4;
        ad = false;
        ae = -20;
        an = 0.0F;
        at = true;
        av = true;
        aE = false;
        aF = false;
        aG = false;
        aH = false;
        aM = 0;
        ba = u.a;
        bc = null;
        bd = false;
        be = 15;
        bf = null;
        bg = 100;
        bh = null;
        f = 0;
        i = 0;
        j = 0;
        g = true;
        a = "main_page";
        k = new HashMap();
        l = new HashMap();
        y = 1.0F;
        z = 0;
        A = false;
    }

    public static ih C()
    {
        if (aZ == null)
        {
            aZ = new ih();
        }
        return aZ;
    }

    public final int A()
    {
        return n;
    }

    public final boolean B()
    {
        return m;
    }

    public final void D()
    {
        B = true;
        if (az.q == 5 || az.q == 4)
        {
            b = null;
        }
        e = null;
        ak();
        aM = 0;
        h = null;
        i = 0;
        D = null;
        E = null;
        F = false;
        G = false;
        H = false;
        I = null;
        M = null;
        N = null;
        O = null;
        R = null;
        g = true;
        a = "main_page";
        j = 0;
        n = 0;
        o = 4;
        p = 4;
        m = false;
        q = -20;
        s = 100F;
        t = 0.64F;
        u = 0.64F;
        v = 0.0F;
        y = 1.0F;
        z = 0;
        A = false;
        x = 0;
        Q = null;
        ah();
        F();
        S = null;
        T = 0;
        U = null;
        V = 0;
        W = false;
        Y = null;
        X = false;
        Z = 0;
        aa = 0;
        ab = 4;
        ac = 4;
        ad = false;
        ae = -20;
        ao = 0.0F;
        ap = 0.0F;
        aq = 0.0F;
        at = false;
        au = 0;
        av = false;
        aw = null;
        ax = null;
        az = true;
        az.C = false;
        aD = null;
        aE = false;
        aA = null;
        aB = null;
        aC = null;
        aH = false;
        aI = false;
        com.roidapp.imagelib.filter.aa.a().f();
        E();
        aX = 50;
        aY = false;
    }

    public final void E()
    {
        aN = 0;
        aO = 0;
        aP = false;
        aQ = null;
        aR = 0.0F;
        aS = -20;
        aT = 4;
        aU = 4;
        aV = false;
        aW = null;
    }

    public final void F()
    {
        if (r != null)
        {
            Iterator iterator = r.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ao ao1 = (ao)iterator.next();
                if (ao1 != null)
                {
                    ao1.a();
                }
            } while (true);
            r.clear();
            r = null;
        }
    }

    public final void G()
    {
        Iterator iterator = k.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Bitmap bitmap = (Bitmap)k.get(iterator.next());
            if (bitmap != null && !bitmap.isRecycled())
            {
                bitmap.recycle();
                iterator.remove();
            }
        } while (true);
        k.clear();
    }

    public final int H()
    {
        return j;
    }

    public final int I()
    {
        return i;
    }

    public final String[] J()
    {
        return h;
    }

    public final int K()
    {
        return f;
    }

    public final String L()
    {
        return e;
    }

    public final ig[] M()
    {
        return b;
    }

    public final int N()
    {
        if (b != null)
        {
            return b.length;
        } else
        {
            return 0;
        }
    }

    public final ig[] O()
    {
        return c;
    }

    public final boolean P()
    {
        return g;
    }

    public final float Q()
    {
        return s;
    }

    public final float R()
    {
        if (b != null && b.length == 1)
        {
            return 0.0F;
        } else
        {
            return t;
        }
    }

    public final float S()
    {
        return u;
    }

    public final void T()
    {
        w = u;
    }

    public final float U()
    {
        return w;
    }

    public final float V()
    {
        return v;
    }

    public final int W()
    {
        return x;
    }

    public final List X()
    {
        return P;
    }

    public final String Y()
    {
        return E;
    }

    public final float[] Z()
    {
        return R;
    }

    public final void a()
    {
        af = q;
        ag = n;
        ah = o;
        ai = p;
        aj = u;
        ak = v;
    }

    public final void a(float f1)
    {
        an = f1;
    }

    public final void a(int i1)
    {
        aM = i1;
    }

    public final void a(d d1)
    {
        aB = d1;
    }

    public final void a(IFilterInfo ifilterinfo)
    {
        bf = ifilterinfo;
    }

    public final void a(IGroupInfo igroupinfo)
    {
        bh = igroupinfo;
    }

    public final void a(ig ig1)
    {
        d = ig1;
    }

    public final void a(u u1)
    {
        ba = u1;
    }

    public final void a(String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        Object obj;
        return;
_L2:
        if (!((File) (obj = new File(s1))).exists()) goto _L1; else goto _L3
_L3:
        if (al == null)
        {
            al = new ArrayList();
        }
        obj = ((File) (obj)).getCanonicalPath();
        s1 = ((String) (obj));
_L5:
        for (Iterator iterator = al.iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            if (s2 != null && s2.equals(s1))
            {
                return;
            }
        }

        al.add(s1);
        return;
        Exception exception;
        exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(List list)
    {
        I = list;
    }

    public final void a(Stack stack)
    {
        aA = stack;
    }

    public final void a(boolean flag)
    {
        F = flag;
    }

    public final void a(float af1[])
    {
        R = af1;
    }

    public final void a(ig aig[])
    {
        b = aig;
    }

    public final void a(u au1[])
    {
        bc = au1;
    }

    public final void a(String as1[])
    {
        h = as1;
    }

    public final int aA()
    {
        return au;
    }

    public final String aB()
    {
        return ax;
    }

    public final String aC()
    {
        return ay;
    }

    public final boolean aD()
    {
        return az;
    }

    public final Stack aE()
    {
        return aA;
    }

    public final d aF()
    {
        return aB;
    }

    public final List aG()
    {
        return aD;
    }

    public final boolean aH()
    {
        return aE;
    }

    public final boolean aI()
    {
        return aH;
    }

    public final String aJ()
    {
        return aJ;
    }

    public final boolean aK()
    {
        return aI;
    }

    public final String aL()
    {
        return bb;
    }

    public final boolean aM()
    {
        return aF;
    }

    public final boolean aN()
    {
        return aG;
    }

    public final float aO()
    {
        return ao;
    }

    public final float aP()
    {
        return aq;
    }

    public final float aQ()
    {
        return ap;
    }

    public final float aR()
    {
        return aK;
    }

    public final float aS()
    {
        return aL;
    }

    public final int aT()
    {
        return aO;
    }

    public final String aU()
    {
        return aW;
    }

    public final int aV()
    {
        return aN;
    }

    public final int aW()
    {
        return aS;
    }

    public final int aX()
    {
        return aT;
    }

    public final int aY()
    {
        return aU;
    }

    public final boolean aZ()
    {
        return aP;
    }

    public final u[] aa()
    {
        return bc;
    }

    public final u ab()
    {
        return ba;
    }

    public final IFilterInfo ac()
    {
        return bf;
    }

    public final IGroupInfo ad()
    {
        return bh;
    }

    public final int ae()
    {
        return bg;
    }

    public final boolean af()
    {
        return bd;
    }

    public final int ag()
    {
        return be;
    }

    public final void ah()
    {
        if (b != null)
        {
            ig aig[] = b;
            int j1 = aig.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ig ig1 = aig[i1];
                if (ig1 != null)
                {
                    ig1.p = 0;
                    ig1.r = 1;
                    ig1.s = 1;
                    ig1.t = 0.0F;
                    ig1.u = 0.0F;
                    ig1.v = 1.0F;
                    ig1.x = 0;
                    ig1.B = false;
                }
            }

        }
    }

    public final void ai()
    {
        if (b != null)
        {
            ig aig[] = b;
            int j1 = aig.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ig ig1 = aig[i1];
                if (ig1 != null)
                {
                    ig1.p = 0;
                    ig1.t = 0.0F;
                    ig1.u = 0.0F;
                    ig1.v = 1.0F;
                    ig1.x = 0;
                    ig1.B = false;
                }
            }

        }
    }

    public final void aj()
    {
        if (b != null)
        {
            ig aig[] = b;
            int j1 = aig.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                ig ig1 = aig[i1];
                if (ig1 != null)
                {
                    ig1.b();
                }
            }

        }
    }

    public final int ak()
    {
        f = 9;
        az.q;
        JVM INSTR tableswitch 0 8: default 60
    //                   0 65
    //                   1 74
    //                   2 99
    //                   3 108
    //                   4 117
    //                   5 83
    //                   6 128
    //                   7 60
    //                   8 91;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L1 _L9
_L1:
        return f;
_L2:
        f = 15;
        continue; /* Loop/switch isn't completed */
_L3:
        f = 9;
        continue; /* Loop/switch isn't completed */
_L7:
        f = 1;
        continue; /* Loop/switch isn't completed */
_L9:
        f = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        f = 9;
        continue; /* Loop/switch isn't completed */
_L5:
        f = 9;
        continue; /* Loop/switch isn't completed */
_L6:
        f = ar;
        continue; /* Loop/switch isn't completed */
_L8:
        f = 50;
        if (true) goto _L1; else goto _L10
_L10:
    }

    public final void al()
    {
        j = 0;
        n = 0;
        o = 4;
        p = 4;
        m = false;
        q = -20;
        u = 0.0F;
        v = 0.0F;
        i = 0;
        aY = false;
    }

    public final void am()
    {
        j = Z;
        n = aa;
        o = ab;
        p = ac;
        u = ao;
        m = ad;
        q = ae;
        v = aq;
        i = au;
    }

    public final void an()
    {
        Z = j;
        aa = n;
        ab = o;
        ac = p;
        ad = m;
        ae = q;
        ao = u;
        aq = v;
        au = i;
    }

    public final List ao()
    {
        return S;
    }

    public final int ap()
    {
        return T;
    }

    public final String aq()
    {
        return Y;
    }

    public final String ar()
    {
        return U;
    }

    public final int as()
    {
        return V;
    }

    public final boolean at()
    {
        return W;
    }

    public final ig au()
    {
        return d;
    }

    public final boolean av()
    {
        return X;
    }

    public final int aw()
    {
        return as;
    }

    public final boolean ax()
    {
        return at;
    }

    public final boolean ay()
    {
        if (b != null && b.length > 15)
        {
            return true;
        } else
        {
            return av;
        }
    }

    public final List az()
    {
        return aw;
    }

    public final void b()
    {
        q = af;
        n = ag;
        o = ah;
        p = ai;
        u = aj;
        v = ak;
    }

    public final void b(float f1)
    {
        y = f1;
    }

    public final void b(IGroupInfo igroupinfo)
    {
        if (b != null)
        {
            ig aig[] = b;
            int j1 = aig.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                ig ig1 = aig[i1];
                if (ig1.j == igroupinfo && ig1.b == null)
                {
                    ig1.j = null;
                    ig1.i = new b();
                }
                i1++;
            }
        }
    }

    public final void b(List list)
    {
        J = list;
    }

    public final void b(boolean flag)
    {
        G = flag;
    }

    public final void b(ig aig[])
    {
        c = aig;
    }

    public final boolean b(int i1)
    {
        if (Q == null)
        {
            return false;
        }
        if (i1 >= Q.size())
        {
            return false;
        }
        return (e)Q.get(i1) != null;
    }

    public final boolean b(String s1)
    {
        if (s1 == null)
        {
            return true;
        }
        Object obj;
        File file;
        boolean flag;
        try
        {
            obj = new File(s1);
            file = new File(com.roidapp.baselib.d.a.d());
            if (!((File) (obj)).exists() || !file.exists())
            {
                break MISSING_BLOCK_LABEL_141;
            }
        }
        catch (Exception exception)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((File) (obj)).getCanonicalPath();
        s1 = ((String) (obj));
        flag = s1.startsWith(file.getCanonicalPath());
        if (flag)
        {
            return true;
        }
_L2:
label0:
        {
            if (al == null || al.size() <= 0)
            {
                return false;
            }
            break label0;
        }
        for (Iterator iterator = al.iterator(); iterator.hasNext();)
        {
            String s2 = (String)iterator.next();
            if (s2 != null && s2.equals(s1))
            {
                return true;
            }
        }

        return false;
        Exception exception1;
        exception1;
        if (true) goto _L2; else goto _L1
_L1:
        return false;
    }

    public final List ba()
    {
        return aQ;
    }

    public final boolean bb()
    {
        return aV;
    }

    public final float bc()
    {
        return aR;
    }

    public final int bd()
    {
        return aX;
    }

    public final boolean be()
    {
        return aY;
    }

    public final float c()
    {
        return an;
    }

    public final void c(float f1)
    {
        s = f1;
    }

    public final void c(int i1)
    {
        z = i1;
    }

    public final void c(String s1)
    {
        D = s1;
    }

    public final void c(List list)
    {
        K = list;
    }

    public final void c(boolean flag)
    {
        H = flag;
    }

    public final int d()
    {
        return aM;
    }

    public final void d(float f1)
    {
        t = f1;
    }

    public final void d(int i1)
    {
        q = i1;
    }

    public final void d(String s1)
    {
        e = s1;
    }

    public final void d(List list)
    {
        L = list;
    }

    public final void d(boolean flag)
    {
        C = flag;
    }

    public final String e()
    {
        return D;
    }

    public final void e(float f1)
    {
        u = f1;
    }

    public final void e(int i1)
    {
        o = i1;
    }

    public final void e(String s1)
    {
        E = s1;
    }

    public final void e(List list)
    {
        aC = list;
    }

    public final void e(boolean flag)
    {
        B = flag;
    }

    public final void f(float f1)
    {
        v = f1;
    }

    public final void f(int i1)
    {
        p = i1;
    }

    public final void f(String s1)
    {
        Y = s1;
    }

    public final void f(List list)
    {
        M = list;
    }

    public final void f(boolean flag)
    {
        A = flag;
    }

    public final boolean f()
    {
        return F;
    }

    public final void g(float f1)
    {
        ao = f1;
    }

    public final void g(int i1)
    {
        n = i1;
    }

    public final void g(String s1)
    {
        U = s1;
    }

    public final void g(List list)
    {
        Q = list;
    }

    public final void g(boolean flag)
    {
        m = flag;
    }

    public final boolean g()
    {
        return G;
    }

    public final void h(float f1)
    {
        aq = f1;
    }

    public final void h(int i1)
    {
        j = i1;
    }

    public final void h(String s1)
    {
        ax = s1;
    }

    public final void h(List list)
    {
        N = list;
    }

    public final void h(boolean flag)
    {
        g = flag;
    }

    public final boolean h()
    {
        return H;
    }

    public final List i()
    {
        return I;
    }

    public final void i(float f1)
    {
        ap = f1;
    }

    public final void i(int i1)
    {
        i = i1;
    }

    public final void i(String s1)
    {
        ay = s1;
    }

    public final void i(List list)
    {
        O = list;
    }

    public final void i(boolean flag)
    {
        bd = flag;
    }

    public final List j()
    {
        return J;
    }

    public final void j(float f1)
    {
        aK = f1;
    }

    public final void j(int i1)
    {
        f = i1;
    }

    public final void j(String s1)
    {
        aJ = s1;
    }

    public final void j(List list)
    {
        r = list;
    }

    public final void j(boolean flag)
    {
        W = flag;
    }

    public final List k()
    {
        return K;
    }

    public final void k(float f1)
    {
        aL = f1;
    }

    public final void k(int i1)
    {
        x = i1;
    }

    public final void k(String s1)
    {
        bb = s1;
    }

    public final void k(List list)
    {
        P = list;
    }

    public final void k(boolean flag)
    {
        X = flag;
    }

    public final List l()
    {
        return L;
    }

    public final void l(float f1)
    {
        aR = f1;
    }

    public final void l(int i1)
    {
        bg = i1;
    }

    public final void l(String s1)
    {
        aW = s1;
    }

    public final void l(List list)
    {
        S = list;
    }

    public final void l(boolean flag)
    {
        at = flag;
    }

    public final List m()
    {
        return aC;
    }

    public final void m(int i1)
    {
        be = i1;
    }

    public final void m(List list)
    {
        aw = list;
    }

    public final void m(boolean flag)
    {
        av = flag;
    }

    public final List n()
    {
        return M;
    }

    public final void n(int i1)
    {
        T = i1;
    }

    public final void n(List list)
    {
        aD = list;
    }

    public final void n(boolean flag)
    {
        az = flag;
    }

    public final List o()
    {
        return Q;
    }

    public final void o(int i1)
    {
        V = i1;
    }

    public final void o(List list)
    {
        aQ = list;
    }

    public final void o(boolean flag)
    {
        aE = flag;
    }

    public final List p()
    {
        return N;
    }

    public final void p(int i1)
    {
        ar = i1;
    }

    public final void p(boolean flag)
    {
        aH = flag;
    }

    public final List q()
    {
        return O;
    }

    public final void q(int i1)
    {
        as = i1;
    }

    public final void q(boolean flag)
    {
        aI = flag;
    }

    public final void r(int i1)
    {
        au = i1;
    }

    public final void r(boolean flag)
    {
        aF = flag;
    }

    public final boolean r()
    {
        return C;
    }

    public final void s(int i1)
    {
        aO = i1;
    }

    public final void s(boolean flag)
    {
        aG = flag;
    }

    public final boolean s()
    {
        return B;
    }

    public final float t()
    {
        return y;
    }

    public final void t(int i1)
    {
        aN = i1;
    }

    public final void t(boolean flag)
    {
        aP = flag;
    }

    public final int u()
    {
        return z;
    }

    public final void u(int i1)
    {
        aS = i1;
    }

    public final void u(boolean flag)
    {
        aV = flag;
    }

    public final void v(int i1)
    {
        aT = i1;
    }

    public final void v(boolean flag)
    {
        aY = flag;
    }

    public final boolean v()
    {
        return A;
    }

    public final List w()
    {
        return r;
    }

    public final void w(int i1)
    {
        aU = i1;
    }

    public final int x()
    {
        return q;
    }

    public final void x(int i1)
    {
        aX = i1;
    }

    public final int y()
    {
        return o;
    }

    public final void y(int i1)
    {
        am = i1;
    }

    public final int z()
    {
        return p;
    }

}
