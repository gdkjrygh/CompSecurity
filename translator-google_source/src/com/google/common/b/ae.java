// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import b.a.a.a.a.e;
import com.google.common.b.a.c;
import com.google.f.c.w;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.common.b:
//            at, au, ao, d, 
//            q, s, ay, ap, 
//            ad, j, aj, v, 
//            t, r, u, p, 
//            af, aq, ac, z, 
//            ab, e, am, m, 
//            al, h, i, x, 
//            aw, ar, az, ba, 
//            ah, ai, k

public final class ae extends b
{

    public ab A;
    public com.google.common.b.e B;
    public am C;
    public am D;
    public String E;
    public com.google.common.b.b.b F;
    public com.google.common.b.b.a.b G;
    public m H;
    public String I;
    public az J;
    public al K;
    public h L;
    public at M[];
    public c N;
    public i O;
    public x P;
    public e Q;
    public aw R;
    public ar S;
    public ba T;
    public ah U;
    public ai V;
    public k W;
    public long X;
    private int Y;
    private String Z;
    public int a;
    private boolean aA;
    private float aB;
    private float aC;
    private int aD;
    private int aE;
    private long aF;
    private int aG;
    private String aH;
    private boolean aI;
    private int aJ;
    private int aK;
    private byte aL[];
    private int aM;
    private int aN;
    private String aO;
    private String aP;
    private String aQ;
    private String aR;
    private String aS;
    private int aT;
    private int aU;
    private long aV;
    private int aW;
    private long aX;
    private long aY;
    private String aZ;
    private String aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private boolean ah;
    private int ai;
    private int aj;
    private String ak;
    private String al;
    private String am;
    private int an;
    private int ao;
    private int ap;
    private boolean aq;
    private boolean ar;
    private boolean as;
    private int at;
    private String au;
    private float av;
    private float aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    public int b;
    private String ba;
    private long bb;
    private String bc;
    private String bd;
    public long c;
    public String d;
    public long e;
    public au f;
    public ao g;
    public d h;
    public af i;
    public q j;
    public w k;
    public aq l;
    public s m;
    public t n;
    public r o;
    public u p;
    public ay q;
    public ap r;
    public ad s;
    public com.google.common.b.j t;
    public aj u;
    public v v;
    public p w;
    public com.google.a.a.a.b x;
    public ac y;
    public z z;

    public ae()
    {
        a = 0;
        b = 0;
        c = 0L;
        Y = 0;
        d = "";
        Z = "";
        e = 0L;
        aa = "";
        f = null;
        ab = 0;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        ac = 1;
        ad = 1;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        ae = 1;
        q = null;
        r = null;
        af = 0;
        ag = 0;
        ah = false;
        ai = 0;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        aj = 1;
        ak = "";
        al = "";
        am = "";
        an = 0;
        x = null;
        ao = 0;
        y = null;
        ap = 1;
        z = null;
        A = null;
        aq = false;
        ar = false;
        as = false;
        at = 0;
        B = null;
        au = "";
        av = 0.0F;
        aw = 0.0F;
        ax = false;
        ay = false;
        az = false;
        aA = false;
        aB = 0.0F;
        aC = 0.0F;
        aD = 0;
        aE = 0;
        aF = 0L;
        C = null;
        D = null;
        aG = 0;
        aH = "";
        aI = false;
        aJ = 0;
        aK = 0;
        E = "";
        aL = j.h;
        aM = 0;
        F = null;
        G = null;
        H = null;
        I = "";
        J = null;
        aN = 0;
        aO = "";
        K = null;
        aP = "";
        aQ = "";
        aR = "";
        aS = "";
        L = null;
        M = com.google.common.b.at.a();
        aT = 0;
        aU = 0;
        aV = 0L;
        N = null;
        O = null;
        P = null;
        Q = null;
        aW = 0;
        R = null;
        S = null;
        T = null;
        aX = 0L;
        U = null;
        V = null;
        aY = 0L;
        aZ = "";
        ba = "";
        bb = 0L;
        bc = "";
        W = null;
        X = 0L;
        bd = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    public final ae a(int i1)
    {
        Y = i1;
        a = a | 2;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((a & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(1, c);
        }
        j1 = i1;
        if ((a & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(2, Y);
        }
        i1 = j1;
        if ((a & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, d);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(4, f);
        }
        i1 = j1;
        if ((a & 0x40) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(5, ab);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(7, h);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(8, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(9, k);
        }
        j1 = i1;
        if ((a & 0x80) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(10, ac);
        }
        i1 = j1;
        if ((a & 0x100) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(11, ad);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(12, m);
        }
        i1 = j1;
        if ((a & 0x200) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(13, ae);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(14, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(15, r);
        }
        j1 = i1;
        if ((a & 0x400) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(16, af);
        }
        i1 = j1;
        if ((a & 0x800) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(17, ag);
        }
        j1 = i1;
        if ((a & 0x1000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(18) + 1);
        }
        i1 = j1;
        if ((a & 0x2000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(19, ai);
        }
        j1 = i1;
        if (s != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(20, s);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(21, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(22, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(23, v);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(24, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(25, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(26, p);
        }
        i1 = j1;
        if (w != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(27, w);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(28, i);
        }
        i1 = j1;
        if ((a & 0x4000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(29, aj);
        }
        j1 = i1;
        if ((a & 0x8000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(30, ak);
        }
        i1 = j1;
        if ((a & 0x10000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(31, al);
        }
        j1 = i1;
        if ((a & 0x20000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(32, am);
        }
        i1 = j1;
        if ((a & 0x40000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(33, an);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(34, x);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(35, l);
        }
        j1 = i1;
        if ((a & 0x80000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(36, ao);
        }
        i1 = j1;
        if ((a & 0x10) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(37, e);
        }
        j1 = i1;
        if (y != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(38, y);
        }
        i1 = j1;
        if ((a & 0x100000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(39, ap);
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(40, z);
        }
        i1 = j1;
        if ((a & 0x20) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(41, aa);
        }
        j1 = i1;
        if (A != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(42, A);
        }
        i1 = j1;
        if ((a & 8) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(43, Z);
        }
        j1 = i1;
        if ((a & 0x200000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(44) + 1);
        }
        i1 = j1;
        if ((a & 0x400000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(45) + 1);
        }
        j1 = i1;
        if ((a & 0x800000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(46) + 1);
        }
        i1 = j1;
        if (B != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(47, B);
        }
        j1 = i1;
        if ((a & 0x4000000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(48) + 4);
        }
        i1 = j1;
        if ((a & 0x8000000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(49) + 4);
        }
        j1 = i1;
        if ((b & 1) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(50) + 4);
        }
        i1 = j1;
        if ((b & 2) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(51) + 4);
        }
        j1 = i1;
        if ((a & 0x1000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(52, at);
        }
        i1 = j1;
        if ((b & 8) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(53, aE);
        }
        j1 = i1;
        if ((b & 0x10) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(54, aF);
        }
        i1 = j1;
        if (C != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(55, C);
        }
        j1 = i1;
        if (D != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(56, D);
        }
        i1 = j1;
        if ((b & 0x20) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(57, aG);
        }
        j1 = i1;
        if ((b & 4) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(58, aD);
        }
        i1 = j1;
        if ((b & 0x40) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(59, aH);
        }
        j1 = i1;
        if ((a & 0x10000000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(60) + 1);
        }
        i1 = j1;
        if ((a & 0x20000000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(61) + 1);
        }
        j1 = i1;
        if ((b & 0x80) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(62) + 1);
        }
        i1 = j1;
        if ((b & 0x100) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(63, aJ);
        }
        j1 = i1;
        if ((b & 0x200) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(64, aK);
        }
        i1 = j1;
        if (G != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(65, G);
        }
        j1 = i1;
        if (H != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(66, H);
        }
        i1 = j1;
        if ((b & 0x4000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(67, aN);
        }
        j1 = i1;
        if ((a & 0x2000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(68, au);
        }
        i1 = j1;
        if ((b & 0x8000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(69, aO);
        }
        j1 = i1;
        if (K != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(70, K);
        }
        i1 = j1;
        if ((b & 0x10000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(71, aP);
        }
        j1 = i1;
        if ((b & 0x20000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(72, aQ);
        }
        i1 = j1;
        if ((b & 0x40000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(73, aR);
        }
        j1 = i1;
        if ((b & 0x80000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(74, aS);
        }
        i1 = j1;
        if ((a & 0x40000000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(75) + 1);
        }
        j1 = i1;
        if ((a & 0x80000000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(76) + 1);
        }
        i1 = j1;
        if (L != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(77, L);
        }
        j1 = i1;
        if (M != null)
        {
            j1 = i1;
            if (M.length > 0)
            {
                for (j1 = 0; j1 < M.length;)
                {
                    at at1 = M[j1];
                    int k1 = i1;
                    if (at1 != null)
                    {
                        k1 = i1 + CodedOutputByteBufferNano.c(78, at1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if ((b & 0x100000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(79, aT);
        }
        j1 = i1;
        if ((b & 0x200000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(80, aU);
        }
        i1 = j1;
        if ((b & 0x400) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(81, E);
        }
        j1 = i1;
        if ((b & 0x800) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(82, aL);
        }
        i1 = j1;
        if ((b & 0x1000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(83, aM);
        }
        j1 = i1;
        if (N != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(84, N);
        }
        i1 = j1;
        if (O != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(85, O);
        }
        j1 = i1;
        if (P != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(86, P);
        }
        i1 = j1;
        if (Q != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(87, Q);
        }
        j1 = i1;
        if ((b & 0x800000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(88, aW);
        }
        i1 = j1;
        if (R != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(89, R);
        }
        j1 = i1;
        if (F != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(90, F);
        }
        i1 = j1;
        if (S != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(91, S);
        }
        j1 = i1;
        if (J != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(92, J);
        }
        i1 = j1;
        if (T != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(93, T);
        }
        j1 = i1;
        if ((b & 0x1000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(94, aX);
        }
        i1 = j1;
        if (U != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(95, U);
        }
        j1 = i1;
        if (V != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(96, V);
        }
        i1 = j1;
        if ((b & 0x2000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(97, I);
        }
        j1 = i1;
        if ((b & 0x400000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(98, aV);
        }
        i1 = j1;
        if ((b & 0x2000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(99, aY);
        }
        j1 = i1;
        if ((b & 0x4000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(100, aZ);
        }
        i1 = j1;
        if ((b & 0x8000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(101, ba);
        }
        j1 = i1;
        if ((b & 0x10000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(102, bb);
        }
        i1 = j1;
        if ((b & 0x20000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(103, bc);
        }
        j1 = i1;
        if (W != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(104, W);
        }
        i1 = j1;
        if ((b & 0x40000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(105, X);
        }
        j1 = i1;
        if ((b & 0x80000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(106, bd);
        }
        return j1;
    }

    public final g mergeFrom(a a1)
    {
_L109:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 107: default 872
    //                   0: 881
    //                   8: 883
    //                   16: 904
    //                   26: 925
    //                   34: 946
    //                   40: 975
    //                   50: 997
    //                   58: 1026
    //                   66: 1055
    //                   74: 1084
    //                   80: 1113
    //                   88: 1179
    //                   98: 1235
    //                   104: 1264
    //                   114: 1287
    //                   122: 1316
    //                   128: 1345
    //                   136: 1368
    //                   144: 1391
    //                   152: 1414
    //                   162: 1437
    //                   170: 1466
    //                   178: 1495
    //                   186: 1524
    //                   194: 1553
    //                   202: 1582
    //                   210: 1611
    //                   218: 1640
    //                   226: 1669
    //                   232: 1698
    //                   242: 1799
    //                   250: 1822
    //                   258: 1845
    //                   264: 1868
    //                   274: 1891
    //                   282: 1920
    //                   288: 1949
    //                   296: 2007
    //                   306: 2029
    //                   312: 2058
    //                   322: 2119
    //                   330: 2148
    //                   338: 2170
    //                   346: 2199
    //                   352: 2221
    //                   360: 2244
    //                   368: 2267
    //                   378: 2290
    //                   389: 2319
    //                   397: 2345
    //                   405: 2371
    //                   413: 2395
    //                   416: 2419
    //                   424: 2442
    //                   432: 2522
    //                   442: 2544
    //                   450: 2573
    //                   456: 2602
    //                   464: 2624
    //                   474: 2645
    //                   480: 2667
    //                   488: 2690
    //                   496: 2713
    //                   504: 2736
    //                   512: 2799
    //                   522: 2822
    //                   530: 2851
    //                   536: 2880
    //                   546: 2903
    //                   554: 2926
    //                   562: 2949
    //                   570: 2978
    //                   578: 3001
    //                   586: 3024
    //                   594: 3047
    //                   600: 3070
    //                   608: 3093
    //                   618: 3116
    //                   626: 3145
    //                   632: 3270
    //                   640: 3293
    //                   650: 3316
    //                   658: 3339
    //                   664: 3362
    //                   674: 3423
    //                   682: 3452
    //                   690: 3481
    //                   698: 3510
    //                   704: 3539
    //                   714: 3562
    //                   722: 3591
    //                   730: 3620
    //                   738: 3649
    //                   746: 3678
    //                   752: 3707
    //                   762: 3730
    //                   770: 3759
    //                   778: 3788
    //                   784: 3811
    //                   792: 3834
    //                   802: 3857
    //                   810: 3880
    //                   816: 3903
    //                   826: 3926
    //                   834: 3949
    //                   840: 3978
    //                   850: 4001;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L73 _L74 _L75 _L76 _L77 _L78 _L79 _L80 _L81 _L82 _L83 _L84 _L85 _L86 _L87 _L88 _L89 _L90 _L91 _L92 _L93 _L94 _L95 _L96 _L97 _L98 _L99 _L100 _L101 _L102 _L103 _L104 _L105 _L106 _L107 _L108
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L109; else goto _L2
_L2:
        return this;
_L3:
        c = a1.f();
        a = a | 1;
          goto _L109
_L4:
        Y = a1.e();
        a = a | 2;
          goto _L109
_L5:
        d = a1.c();
        a = a | 4;
          goto _L109
_L6:
        if (f == null)
        {
            f = new au();
        }
        a1.a(f);
          goto _L109
_L7:
        ab = a1.e();
        a = a | 0x40;
          goto _L109
_L8:
        if (g == null)
        {
            g = new ao();
        }
        a1.a(g);
          goto _L109
_L9:
        if (h == null)
        {
            h = new d();
        }
        a1.a(h);
          goto _L109
_L10:
        if (j == null)
        {
            j = new q();
        }
        a1.a(j);
          goto _L109
_L11:
        if (k == null)
        {
            k = new w();
        }
        a1.a(k);
          goto _L109
_L12:
        int j1 = a1.e();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            ac = j1;
            a = a | 0x80;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        int k1 = a1.e();
        switch (k1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            ad = k1;
            a = a | 0x100;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (m == null)
        {
            m = new s();
        }
        a1.a(m);
        continue; /* Loop/switch isn't completed */
_L15:
        ae = a1.e();
        a = a | 0x200;
        continue; /* Loop/switch isn't completed */
_L16:
        if (q == null)
        {
            q = new ay();
        }
        a1.a(q);
        continue; /* Loop/switch isn't completed */
_L17:
        if (r == null)
        {
            r = new ap();
        }
        a1.a(r);
        continue; /* Loop/switch isn't completed */
_L18:
        af = a1.e();
        a = a | 0x400;
        continue; /* Loop/switch isn't completed */
_L19:
        ag = a1.e();
        a = a | 0x800;
        continue; /* Loop/switch isn't completed */
_L20:
        ah = a1.b();
        a = a | 0x1000;
        continue; /* Loop/switch isn't completed */
_L21:
        ai = a1.e();
        a = a | 0x2000;
        continue; /* Loop/switch isn't completed */
_L22:
        if (s == null)
        {
            s = new ad();
        }
        a1.a(s);
        continue; /* Loop/switch isn't completed */
_L23:
        if (t == null)
        {
            t = new com.google.common.b.j();
        }
        a1.a(t);
        continue; /* Loop/switch isn't completed */
_L24:
        if (u == null)
        {
            u = new aj();
        }
        a1.a(u);
        continue; /* Loop/switch isn't completed */
_L25:
        if (v == null)
        {
            v = new v();
        }
        a1.a(v);
        continue; /* Loop/switch isn't completed */
_L26:
        if (n == null)
        {
            n = new t();
        }
        a1.a(n);
        continue; /* Loop/switch isn't completed */
_L27:
        if (o == null)
        {
            o = new r();
        }
        a1.a(o);
        continue; /* Loop/switch isn't completed */
_L28:
        if (p == null)
        {
            p = new u();
        }
        a1.a(p);
        continue; /* Loop/switch isn't completed */
_L29:
        if (w == null)
        {
            w = new p();
        }
        a1.a(w);
        continue; /* Loop/switch isn't completed */
_L30:
        if (i == null)
        {
            i = new af();
        }
        a1.a(i);
        continue; /* Loop/switch isn't completed */
_L31:
        int l1 = a1.e();
        switch (l1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            aj = l1;
            a = a | 0x4000;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L32:
        ak = a1.c();
        a = a | 0x8000;
        continue; /* Loop/switch isn't completed */
_L33:
        al = a1.c();
        a = a | 0x10000;
        continue; /* Loop/switch isn't completed */
_L34:
        am = a1.c();
        a = a | 0x20000;
        continue; /* Loop/switch isn't completed */
_L35:
        an = a1.e();
        a = a | 0x40000;
        continue; /* Loop/switch isn't completed */
_L36:
        if (x == null)
        {
            x = new com.google.a.a.a.b();
        }
        a1.a(x);
        continue; /* Loop/switch isn't completed */
_L37:
        if (l == null)
        {
            l = new aq();
        }
        a1.a(l);
        continue; /* Loop/switch isn't completed */
_L38:
        int i2 = a1.e();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            ao = i2;
            a = a | 0x80000;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L39:
        e = a1.f();
        a = a | 0x10;
        continue; /* Loop/switch isn't completed */
_L40:
        if (y == null)
        {
            y = new ac();
        }
        a1.a(y);
        continue; /* Loop/switch isn't completed */
_L41:
        int j2 = a1.e();
        switch (j2)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            ap = j2;
            a = a | 0x100000;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L42:
        if (z == null)
        {
            z = new z();
        }
        a1.a(z);
        continue; /* Loop/switch isn't completed */
_L43:
        aa = a1.c();
        a = a | 0x20;
        continue; /* Loop/switch isn't completed */
_L44:
        if (A == null)
        {
            A = new ab();
        }
        a1.a(A);
        continue; /* Loop/switch isn't completed */
_L45:
        Z = a1.c();
        a = a | 8;
        continue; /* Loop/switch isn't completed */
_L46:
        aq = a1.b();
        a = a | 0x200000;
        continue; /* Loop/switch isn't completed */
_L47:
        ar = a1.b();
        a = a | 0x400000;
        continue; /* Loop/switch isn't completed */
_L48:
        as = a1.b();
        a = a | 0x800000;
        continue; /* Loop/switch isn't completed */
_L49:
        if (B == null)
        {
            B = new com.google.common.b.e();
        }
        a1.a(B);
        continue; /* Loop/switch isn't completed */
_L50:
        av = Float.intBitsToFloat(a1.g());
        a = a | 0x4000000;
        continue; /* Loop/switch isn't completed */
_L51:
        aw = Float.intBitsToFloat(a1.g());
        a = a | 0x8000000;
        continue; /* Loop/switch isn't completed */
_L52:
        aB = Float.intBitsToFloat(a1.g());
        b = b | 1;
        continue; /* Loop/switch isn't completed */
_L53:
        aC = Float.intBitsToFloat(a1.g());
        b = b | 2;
        continue; /* Loop/switch isn't completed */
_L54:
        at = a1.e();
        a = a | 0x1000000;
        continue; /* Loop/switch isn't completed */
_L55:
        int k2 = a1.e();
        switch (k2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            aE = k2;
            b = b | 8;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L56:
        aF = a1.f();
        b = b | 0x10;
        continue; /* Loop/switch isn't completed */
_L57:
        if (C == null)
        {
            C = new am();
        }
        a1.a(C);
        continue; /* Loop/switch isn't completed */
_L58:
        if (D == null)
        {
            D = new am();
        }
        a1.a(D);
        continue; /* Loop/switch isn't completed */
_L59:
        aG = a1.e();
        b = b | 0x20;
        continue; /* Loop/switch isn't completed */
_L60:
        aD = a1.e();
        b = b | 4;
        continue; /* Loop/switch isn't completed */
_L61:
        aH = a1.c();
        b = b | 0x40;
        continue; /* Loop/switch isn't completed */
_L62:
        ax = a1.b();
        a = a | 0x10000000;
        continue; /* Loop/switch isn't completed */
_L63:
        ay = a1.b();
        a = a | 0x20000000;
        continue; /* Loop/switch isn't completed */
_L64:
        aI = a1.b();
        b = b | 0x80;
        continue; /* Loop/switch isn't completed */
_L65:
        int l2 = a1.e();
        switch (l2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            aJ = l2;
            b = b | 0x100;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L66:
        aK = a1.e();
        b = b | 0x200;
        continue; /* Loop/switch isn't completed */
_L67:
        if (G == null)
        {
            G = new com.google.common.b.b.a.b();
        }
        a1.a(G);
        continue; /* Loop/switch isn't completed */
_L68:
        if (H == null)
        {
            H = new m();
        }
        a1.a(H);
        continue; /* Loop/switch isn't completed */
_L69:
        aN = a1.e();
        b = b | 0x4000;
        continue; /* Loop/switch isn't completed */
_L70:
        au = a1.c();
        a = a | 0x2000000;
        continue; /* Loop/switch isn't completed */
_L71:
        aO = a1.c();
        b = b | 0x8000;
        continue; /* Loop/switch isn't completed */
_L72:
        if (K == null)
        {
            K = new al();
        }
        a1.a(K);
        continue; /* Loop/switch isn't completed */
_L73:
        aP = a1.c();
        b = b | 0x10000;
        continue; /* Loop/switch isn't completed */
_L74:
        aQ = a1.c();
        b = b | 0x20000;
        continue; /* Loop/switch isn't completed */
_L75:
        aR = a1.c();
        b = b | 0x40000;
        continue; /* Loop/switch isn't completed */
_L76:
        aS = a1.c();
        b = b | 0x80000;
        continue; /* Loop/switch isn't completed */
_L77:
        az = a1.b();
        a = a | 0x40000000;
        continue; /* Loop/switch isn't completed */
_L78:
        aA = a1.b();
        a = a | 0x80000000;
        continue; /* Loop/switch isn't completed */
_L79:
        if (L == null)
        {
            L = new h();
        }
        a1.a(L);
        continue; /* Loop/switch isn't completed */
_L80:
        int k3 = com.google.protobuf.nano.j.a(a1, 626);
        at aat[];
        int i3;
        if (M == null)
        {
            i3 = 0;
        } else
        {
            i3 = M.length;
        }
        aat = new at[k3 + i3];
        k3 = i3;
        if (i3 != 0)
        {
            System.arraycopy(M, 0, aat, 0, i3);
            k3 = i3;
        }
        for (; k3 < aat.length - 1; k3++)
        {
            aat[k3] = new at();
            a1.a(aat[k3]);
            a1.a();
        }

        aat[k3] = new at();
        a1.a(aat[k3]);
        M = aat;
        continue; /* Loop/switch isn't completed */
_L81:
        aT = a1.e();
        b = b | 0x100000;
        continue; /* Loop/switch isn't completed */
_L82:
        aU = a1.e();
        b = b | 0x200000;
        continue; /* Loop/switch isn't completed */
_L83:
        E = a1.c();
        b = b | 0x400;
        continue; /* Loop/switch isn't completed */
_L84:
        aL = a1.d();
        b = b | 0x800;
        continue; /* Loop/switch isn't completed */
_L85:
        int j3 = a1.e();
        switch (j3)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            aM = j3;
            b = b | 0x1000;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L86:
        if (N == null)
        {
            N = new c();
        }
        a1.a(N);
        continue; /* Loop/switch isn't completed */
_L87:
        if (O == null)
        {
            O = new i();
        }
        a1.a(O);
        continue; /* Loop/switch isn't completed */
_L88:
        if (P == null)
        {
            P = new x();
        }
        a1.a(P);
        continue; /* Loop/switch isn't completed */
_L89:
        if (Q == null)
        {
            Q = new e();
        }
        a1.a(Q);
        continue; /* Loop/switch isn't completed */
_L90:
        aW = a1.e();
        b = b | 0x800000;
        continue; /* Loop/switch isn't completed */
_L91:
        if (R == null)
        {
            R = new aw();
        }
        a1.a(R);
        continue; /* Loop/switch isn't completed */
_L92:
        if (F == null)
        {
            F = new com.google.common.b.b.b();
        }
        a1.a(F);
        continue; /* Loop/switch isn't completed */
_L93:
        if (S == null)
        {
            S = new ar();
        }
        a1.a(S);
        continue; /* Loop/switch isn't completed */
_L94:
        if (J == null)
        {
            J = new az();
        }
        a1.a(J);
        continue; /* Loop/switch isn't completed */
_L95:
        if (T == null)
        {
            T = new ba();
        }
        a1.a(T);
        continue; /* Loop/switch isn't completed */
_L96:
        aX = a1.f();
        b = b | 0x1000000;
        continue; /* Loop/switch isn't completed */
_L97:
        if (U == null)
        {
            U = new ah();
        }
        a1.a(U);
        continue; /* Loop/switch isn't completed */
_L98:
        if (V == null)
        {
            V = new ai();
        }
        a1.a(V);
        continue; /* Loop/switch isn't completed */
_L99:
        I = a1.c();
        b = b | 0x2000;
        continue; /* Loop/switch isn't completed */
_L100:
        aV = a1.f();
        b = b | 0x400000;
        continue; /* Loop/switch isn't completed */
_L101:
        aY = a1.f();
        b = b | 0x2000000;
        continue; /* Loop/switch isn't completed */
_L102:
        aZ = a1.c();
        b = b | 0x4000000;
        continue; /* Loop/switch isn't completed */
_L103:
        ba = a1.c();
        b = b | 0x8000000;
        continue; /* Loop/switch isn't completed */
_L104:
        bb = a1.f();
        b = b | 0x10000000;
        continue; /* Loop/switch isn't completed */
_L105:
        bc = a1.c();
        b = b | 0x20000000;
        continue; /* Loop/switch isn't completed */
_L106:
        if (W == null)
        {
            W = new k();
        }
        a1.a(W);
        continue; /* Loop/switch isn't completed */
_L107:
        X = a1.f();
        b = b | 0x40000000;
        continue; /* Loop/switch isn't completed */
_L108:
        bd = a1.c();
        b = b | 0x80000000;
        if (true) goto _L109; else goto _L110
_L110:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        if ((a & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, Y);
        }
        if ((a & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        if ((a & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(5, ab);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(8, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(9, k);
        }
        if ((a & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(10, ac);
        }
        if ((a & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(11, ad);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if ((a & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(13, ae);
        }
        if (q != null)
        {
            codedoutputbytebuffernano.a(14, q);
        }
        if (r != null)
        {
            codedoutputbytebuffernano.a(15, r);
        }
        if ((a & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(16, af);
        }
        if ((a & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(17, ag);
        }
        if ((a & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(18, ah);
        }
        if ((a & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(19, ai);
        }
        if (s != null)
        {
            codedoutputbytebuffernano.a(20, s);
        }
        if (t != null)
        {
            codedoutputbytebuffernano.a(21, t);
        }
        if (u != null)
        {
            codedoutputbytebuffernano.a(22, u);
        }
        if (v != null)
        {
            codedoutputbytebuffernano.a(23, v);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(24, n);
        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(25, o);
        }
        if (p != null)
        {
            codedoutputbytebuffernano.a(26, p);
        }
        if (w != null)
        {
            codedoutputbytebuffernano.a(27, w);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(28, i);
        }
        if ((a & 0x4000) != 0)
        {
            codedoutputbytebuffernano.a(29, aj);
        }
        if ((a & 0x8000) != 0)
        {
            codedoutputbytebuffernano.a(30, ak);
        }
        if ((a & 0x10000) != 0)
        {
            codedoutputbytebuffernano.a(31, al);
        }
        if ((a & 0x20000) != 0)
        {
            codedoutputbytebuffernano.a(32, am);
        }
        if ((a & 0x40000) != 0)
        {
            codedoutputbytebuffernano.a(33, an);
        }
        if (x != null)
        {
            codedoutputbytebuffernano.a(34, x);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(35, l);
        }
        if ((a & 0x80000) != 0)
        {
            codedoutputbytebuffernano.a(36, ao);
        }
        if ((a & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(37, e);
        }
        if (y != null)
        {
            codedoutputbytebuffernano.a(38, y);
        }
        if ((a & 0x100000) != 0)
        {
            codedoutputbytebuffernano.a(39, ap);
        }
        if (z != null)
        {
            codedoutputbytebuffernano.a(40, z);
        }
        if ((a & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(41, aa);
        }
        if (A != null)
        {
            codedoutputbytebuffernano.a(42, A);
        }
        if ((a & 8) != 0)
        {
            codedoutputbytebuffernano.a(43, Z);
        }
        if ((a & 0x200000) != 0)
        {
            codedoutputbytebuffernano.a(44, aq);
        }
        if ((a & 0x400000) != 0)
        {
            codedoutputbytebuffernano.a(45, ar);
        }
        if ((a & 0x800000) != 0)
        {
            codedoutputbytebuffernano.a(46, as);
        }
        if (B != null)
        {
            codedoutputbytebuffernano.a(47, B);
        }
        if ((a & 0x4000000) != 0)
        {
            codedoutputbytebuffernano.a(48, av);
        }
        if ((a & 0x8000000) != 0)
        {
            codedoutputbytebuffernano.a(49, aw);
        }
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(50, aB);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(51, aC);
        }
        if ((a & 0x1000000) != 0)
        {
            codedoutputbytebuffernano.a(52, at);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(53, aE);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(54, aF);
        }
        if (C != null)
        {
            codedoutputbytebuffernano.a(55, C);
        }
        if (D != null)
        {
            codedoutputbytebuffernano.a(56, D);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(57, aG);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(58, aD);
        }
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(59, aH);
        }
        if ((a & 0x10000000) != 0)
        {
            codedoutputbytebuffernano.a(60, ax);
        }
        if ((a & 0x20000000) != 0)
        {
            codedoutputbytebuffernano.a(61, ay);
        }
        if ((b & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(62, aI);
        }
        if ((b & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(63, aJ);
        }
        if ((b & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(64, aK);
        }
        if (G != null)
        {
            codedoutputbytebuffernano.a(65, G);
        }
        if (H != null)
        {
            codedoutputbytebuffernano.a(66, H);
        }
        if ((b & 0x4000) != 0)
        {
            codedoutputbytebuffernano.a(67, aN);
        }
        if ((a & 0x2000000) != 0)
        {
            codedoutputbytebuffernano.a(68, au);
        }
        if ((b & 0x8000) != 0)
        {
            codedoutputbytebuffernano.a(69, aO);
        }
        if (K != null)
        {
            codedoutputbytebuffernano.a(70, K);
        }
        if ((b & 0x10000) != 0)
        {
            codedoutputbytebuffernano.a(71, aP);
        }
        if ((b & 0x20000) != 0)
        {
            codedoutputbytebuffernano.a(72, aQ);
        }
        if ((b & 0x40000) != 0)
        {
            codedoutputbytebuffernano.a(73, aR);
        }
        if ((b & 0x80000) != 0)
        {
            codedoutputbytebuffernano.a(74, aS);
        }
        if ((a & 0x40000000) != 0)
        {
            codedoutputbytebuffernano.a(75, az);
        }
        if ((a & 0x80000000) != 0)
        {
            codedoutputbytebuffernano.a(76, aA);
        }
        if (L != null)
        {
            codedoutputbytebuffernano.a(77, L);
        }
        if (M != null && M.length > 0)
        {
            for (int i1 = 0; i1 < M.length; i1++)
            {
                at at1 = M[i1];
                if (at1 != null)
                {
                    codedoutputbytebuffernano.a(78, at1);
                }
            }

        }
        if ((b & 0x100000) != 0)
        {
            codedoutputbytebuffernano.a(79, aT);
        }
        if ((b & 0x200000) != 0)
        {
            codedoutputbytebuffernano.a(80, aU);
        }
        if ((b & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(81, E);
        }
        if ((b & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(82, aL);
        }
        if ((b & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(83, aM);
        }
        if (N != null)
        {
            codedoutputbytebuffernano.a(84, N);
        }
        if (O != null)
        {
            codedoutputbytebuffernano.a(85, O);
        }
        if (P != null)
        {
            codedoutputbytebuffernano.a(86, P);
        }
        if (Q != null)
        {
            codedoutputbytebuffernano.a(87, Q);
        }
        if ((b & 0x800000) != 0)
        {
            codedoutputbytebuffernano.a(88, aW);
        }
        if (R != null)
        {
            codedoutputbytebuffernano.a(89, R);
        }
        if (F != null)
        {
            codedoutputbytebuffernano.a(90, F);
        }
        if (S != null)
        {
            codedoutputbytebuffernano.a(91, S);
        }
        if (J != null)
        {
            codedoutputbytebuffernano.a(92, J);
        }
        if (T != null)
        {
            codedoutputbytebuffernano.a(93, T);
        }
        if ((b & 0x1000000) != 0)
        {
            codedoutputbytebuffernano.a(94, aX);
        }
        if (U != null)
        {
            codedoutputbytebuffernano.a(95, U);
        }
        if (V != null)
        {
            codedoutputbytebuffernano.a(96, V);
        }
        if ((b & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(97, I);
        }
        if ((b & 0x400000) != 0)
        {
            codedoutputbytebuffernano.a(98, aV);
        }
        if ((b & 0x2000000) != 0)
        {
            codedoutputbytebuffernano.a(99, aY);
        }
        if ((b & 0x4000000) != 0)
        {
            codedoutputbytebuffernano.a(100, aZ);
        }
        if ((b & 0x8000000) != 0)
        {
            codedoutputbytebuffernano.a(101, ba);
        }
        if ((b & 0x10000000) != 0)
        {
            codedoutputbytebuffernano.a(102, bb);
        }
        if ((b & 0x20000000) != 0)
        {
            codedoutputbytebuffernano.a(103, bc);
        }
        if (W != null)
        {
            codedoutputbytebuffernano.a(104, W);
        }
        if ((b & 0x40000000) != 0)
        {
            codedoutputbytebuffernano.a(105, X);
        }
        if ((b & 0x80000000) != 0)
        {
            codedoutputbytebuffernano.a(106, bd);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
