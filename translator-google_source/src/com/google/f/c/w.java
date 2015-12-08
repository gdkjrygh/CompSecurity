// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.c:
//            f, v, x, h, 
//            k, n, j, d, 
//            y, i, aa, l

public final class w extends b
{

    private float A;
    private String B;
    private String C;
    private String D;
    private String E;
    private int F;
    private float G;
    private float H;
    private float I;
    private int J;
    private boolean K;
    private String L;
    private int M;
    private int N;
    private int O;
    private float P;
    private int Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private int V;
    private boolean W;
    private long X;
    private int Y;
    private boolean Z;
    public i a;
    private boolean aa;
    private int ab;
    private boolean ac;
    private String ad;
    private int ae;
    private int af;
    private String ag;
    private int ah;
    private boolean ai;
    public l b;
    public d c;
    public f d[];
    public aa e;
    public n f;
    public v g;
    public v h[];
    public String i[];
    public x j[];
    public com.google.f.c.j k;
    public h l[];
    public k m[];
    public y n;
    private int o;
    private int p;
    private String q;
    private byte r[];
    private byte s[];
    private byte t[];
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private float z;

    public w()
    {
        o = 0;
        p = 0;
        q = "";
        r = j.h;
        s = j.h;
        t = j.h;
        u = 0;
        v = 0;
        w = 0;
        x = 0;
        y = 0;
        a = null;
        b = null;
        c = null;
        z = 0.0F;
        A = 0.0F;
        d = com.google.f.c.f.a();
        e = null;
        f = null;
        B = "";
        C = "";
        D = "";
        E = "";
        F = 0;
        G = 0.0F;
        H = 0.0F;
        I = 0.0F;
        J = 0;
        K = false;
        g = null;
        h = com.google.f.c.v.a();
        L = "";
        M = 0;
        N = 0;
        O = 0;
        P = 0.0F;
        Q = 0;
        R = "";
        i = j.f;
        S = "";
        j = com.google.f.c.x.a();
        T = "";
        U = "";
        V = 0;
        W = false;
        X = 0L;
        k = null;
        Y = 999;
        Z = false;
        aa = false;
        ab = 999;
        ac = false;
        l = com.google.f.c.h.a();
        m = com.google.f.c.k.a();
        n = null;
        ad = "";
        ae = 0;
        af = 0;
        ag = "";
        ah = 0;
        ai = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((o & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(1, q);
        }
        j1 = i1;
        if ((o & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, r);
        }
        i1 = j1;
        if ((o & 0x40) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(3, w);
        }
        j1 = i1;
        if ((o & 0x200) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(4) + 4);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(5, f);
        }
        j1 = i1;
        if ((o & 0x800) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(6, B);
        }
        i1 = j1;
        if ((o & 0x1000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, C);
        }
        j1 = i1;
        if ((o & 0x2000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(8, D);
        }
        i1 = j1;
        if ((o & 0x4000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, E);
        }
        j1 = i1;
        if ((o & 0x8000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(10, F);
        }
        i1 = j1;
        if ((o & 0x10000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(11) + 4);
        }
        j1 = i1;
        if ((o & 0x20000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(12) + 4);
        }
        i1 = j1;
        if ((o & 0x40000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(13) + 4);
        }
        j1 = i1;
        if ((o & 0x80000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(14, J);
        }
        i1 = j1;
        if ((o & 0x100000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(15) + 1);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(16, g);
        }
        i1 = j1;
        if ((o & 0x400000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(17, M);
        }
        j1 = i1;
        if ((o & 0x2000000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(18) + 4);
        }
        i1 = j1;
        if ((o & 0x4000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(19, Q);
        }
        j1 = i1;
        if ((o & 0x8000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(20, R);
        }
        i1 = j1;
        if ((o & 0x10000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(21, S);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                for (j1 = 0; j1 < j.length;)
                {
                    x x1 = j[j1];
                    int l1 = i1;
                    if (x1 != null)
                    {
                        l1 = i1 + CodedOutputByteBufferNano.c(22, x1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if ((o & 0x20000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(23, T);
        }
        j1 = i1;
        if ((o & 0x80000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(24, V);
        }
        i1 = j1;
        if ((p & 1) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(25) + 1);
        }
        j1 = i1;
        if ((p & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(26, X);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(27, k);
        }
        j1 = i1;
        if ((o & 0x40000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(28, U);
        }
        i1 = j1;
        if ((o & 0x10) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(29, u);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(30, c);
        }
        i1 = j1;
        if ((p & 0x40) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(31) + 1);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                for (j1 = 0; j1 < l.length;)
                {
                    h h1 = l[j1];
                    int i2 = i1;
                    if (h1 != null)
                    {
                        i2 = i1 + CodedOutputByteBufferNano.c(32, h1);
                    }
                    j1++;
                    i1 = i2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1;
            if (i.length > 0)
            {
                i1 = 0;
                int j2 = 0;
                int k3;
                int l3;
                for (k3 = 0; i1 < i.length; k3 = l3)
                {
                    String s1 = i[i1];
                    int i4 = j2;
                    l3 = k3;
                    if (s1 != null)
                    {
                        l3 = k3 + 1;
                        i4 = j2 + CodedOutputByteBufferNano.a(s1);
                    }
                    i1++;
                    j2 = i4;
                }

                i1 = j1 + j2 + k3 * 2;
            }
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                for (j1 = 0; j1 < m.length;)
                {
                    k k1 = m[j1];
                    int k2 = i1;
                    if (k1 != null)
                    {
                        k2 = i1 + CodedOutputByteBufferNano.c(34, k1);
                    }
                    j1++;
                    i1 = k2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if ((o & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(35, s);
        }
        j1 = i1;
        if ((o & 8) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(36, t);
        }
        i1 = j1;
        if ((o & 0x20) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(37, v);
        }
        j1 = i1;
        if ((o & 0x80) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(38, x);
        }
        i1 = j1;
        if ((o & 0x400) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(39) + 4);
        }
        j1 = i1;
        if ((p & 0x100) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(40, ae);
        }
        i1 = j1;
        if ((p & 0x200) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(41, af);
        }
        j1 = i1;
        if ((p & 0x80) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(42, ad);
        }
        i1 = j1;
        if ((o & 0x800000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(43, N);
        }
        j1 = i1;
        if ((o & 0x1000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(44, O);
        }
        i1 = j1;
        if ((p & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(45, Y);
        }
        j1 = i1;
        if ((o & 0x100) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(46, y);
        }
        i1 = j1;
        if ((p & 0x800) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(47, ah);
        }
        j1 = i1;
        if ((p & 0x400) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(48, ag);
        }
        i1 = j1;
        if ((o & 0x200000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(49, L);
        }
        j1 = i1;
        if ((p & 0x1000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(50) + 1);
        }
        int l2 = j1;
        if ((p & 0x20) != 0)
        {
            l2 = j1 + CodedOutputByteBufferNano.d(51, ab);
        }
        i1 = l2;
        if (n != null)
        {
            i1 = l2 + CodedOutputByteBufferNano.c(52, n);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                for (j1 = 0; j1 < h.length;)
                {
                    v v1 = h[j1];
                    int i3 = i1;
                    if (v1 != null)
                    {
                        i3 = i1 + CodedOutputByteBufferNano.c(53, v1);
                    }
                    j1++;
                    i1 = i3;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (a != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(54, a);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                int j3 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (j3 >= d.length)
                    {
                        break;
                    }
                    f f1 = d[j3];
                    j1 = i1;
                    if (f1 != null)
                    {
                        j1 = i1 + CodedOutputByteBufferNano.c(55, f1);
                    }
                    j3++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(56, e);
        }
        j1 = i1;
        if ((p & 8) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(57) + 1);
        }
        i1 = j1;
        if ((p & 0x10) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(58) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(59, b);
        }
        return j1;
    }

    public final g mergeFrom(a a1)
    {
_L62:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 60: default 496
    //                   0: 505
    //                   10: 507
    //                   18: 528
    //                   24: 549
    //                   37: 630
    //                   42: 656
    //                   50: 685
    //                   58: 708
    //                   66: 731
    //                   74: 754
    //                   80: 777
    //                   93: 800
    //                   101: 826
    //                   109: 852
    //                   112: 878
    //                   120: 901
    //                   130: 924
    //                   136: 953
    //                   149: 976
    //                   152: 1002
    //                   162: 1055
    //                   170: 1078
    //                   178: 1101
    //                   186: 1226
    //                   192: 1249
    //                   200: 1272
    //                   208: 1293
    //                   218: 1314
    //                   226: 1343
    //                   232: 1366
    //                   242: 1388
    //                   248: 1417
    //                   258: 1439
    //                   266: 1564
    //                   274: 1667
    //                   282: 1792
    //                   290: 1813
    //                   296: 1835
    //                   304: 1857
    //                   317: 1939
    //                   320: 1965
    //                   328: 1988
    //                   338: 2011
    //                   344: 2034
    //                   352: 2057
    //                   360: 2080
    //                   368: 2229
    //                   376: 2307
    //                   386: 2330
    //                   394: 2353
    //                   400: 2376
    //                   408: 2399
    //                   418: 2550
    //                   426: 2579
    //                   434: 2704
    //                   442: 2733
    //                   450: 2858
    //                   456: 2887
    //                   464: 2909
    //                   474: 2931;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L62; else goto _L2
_L2:
        return this;
_L3:
        q = a1.c();
        o = o | 1;
          goto _L62
_L4:
        r = a1.d();
        o = o | 2;
          goto _L62
_L5:
        int j1 = a1.e();
        switch (j1)
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
        case 9: // '\t'
            w = j1;
            o = o | 0x40;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        z = Float.intBitsToFloat(a1.g());
        o = o | 0x200;
        continue; /* Loop/switch isn't completed */
_L7:
        if (f == null)
        {
            f = new n();
        }
        a1.a(f);
        continue; /* Loop/switch isn't completed */
_L8:
        B = a1.c();
        o = o | 0x800;
        continue; /* Loop/switch isn't completed */
_L9:
        C = a1.c();
        o = o | 0x1000;
        continue; /* Loop/switch isn't completed */
_L10:
        D = a1.c();
        o = o | 0x2000;
        continue; /* Loop/switch isn't completed */
_L11:
        E = a1.c();
        o = o | 0x4000;
        continue; /* Loop/switch isn't completed */
_L12:
        F = a1.e();
        o = o | 0x8000;
        continue; /* Loop/switch isn't completed */
_L13:
        G = Float.intBitsToFloat(a1.g());
        o = o | 0x10000;
        continue; /* Loop/switch isn't completed */
_L14:
        H = Float.intBitsToFloat(a1.g());
        o = o | 0x20000;
        continue; /* Loop/switch isn't completed */
_L15:
        I = Float.intBitsToFloat(a1.g());
        o = o | 0x40000;
        continue; /* Loop/switch isn't completed */
_L16:
        J = a1.e();
        o = o | 0x80000;
        continue; /* Loop/switch isn't completed */
_L17:
        K = a1.b();
        o = o | 0x100000;
        continue; /* Loop/switch isn't completed */
_L18:
        if (g == null)
        {
            g = new v();
        }
        a1.a(g);
        continue; /* Loop/switch isn't completed */
_L19:
        M = a1.e();
        o = o | 0x400000;
        continue; /* Loop/switch isn't completed */
_L20:
        P = Float.intBitsToFloat(a1.g());
        o = o | 0x2000000;
        continue; /* Loop/switch isn't completed */
_L21:
        int k1 = a1.e();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
            Q = k1;
            o = o | 0x4000000;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L22:
        R = a1.c();
        o = o | 0x8000000;
        continue; /* Loop/switch isn't completed */
_L23:
        S = a1.c();
        o = o | 0x10000000;
        continue; /* Loop/switch isn't completed */
_L24:
        int j4 = com.google.protobuf.nano.j.a(a1, 178);
        x ax[];
        int l1;
        if (j == null)
        {
            l1 = 0;
        } else
        {
            l1 = j.length;
        }
        ax = new x[j4 + l1];
        j4 = l1;
        if (l1 != 0)
        {
            System.arraycopy(j, 0, ax, 0, l1);
            j4 = l1;
        }
        for (; j4 < ax.length - 1; j4++)
        {
            ax[j4] = new x();
            a1.a(ax[j4]);
            a1.a();
        }

        ax[j4] = new x();
        a1.a(ax[j4]);
        j = ax;
        continue; /* Loop/switch isn't completed */
_L25:
        T = a1.c();
        o = o | 0x20000000;
        continue; /* Loop/switch isn't completed */
_L26:
        V = a1.e();
        o = o | 0x80000000;
        continue; /* Loop/switch isn't completed */
_L27:
        W = a1.b();
        p = p | 1;
        continue; /* Loop/switch isn't completed */
_L28:
        X = a1.f();
        p = p | 2;
        continue; /* Loop/switch isn't completed */
_L29:
        if (k == null)
        {
            k = new com.google.f.c.j();
        }
        a1.a(k);
        continue; /* Loop/switch isn't completed */
_L30:
        U = a1.c();
        o = o | 0x40000000;
        continue; /* Loop/switch isn't completed */
_L31:
        u = a1.e();
        o = o | 0x10;
        continue; /* Loop/switch isn't completed */
_L32:
        if (c == null)
        {
            c = new d();
        }
        a1.a(c);
        continue; /* Loop/switch isn't completed */
_L33:
        ac = a1.b();
        p = p | 0x40;
        continue; /* Loop/switch isn't completed */
_L34:
        int k4 = com.google.protobuf.nano.j.a(a1, 258);
        h ah1[];
        int i2;
        if (l == null)
        {
            i2 = 0;
        } else
        {
            i2 = l.length;
        }
        ah1 = new h[k4 + i2];
        k4 = i2;
        if (i2 != 0)
        {
            System.arraycopy(l, 0, ah1, 0, i2);
            k4 = i2;
        }
        for (; k4 < ah1.length - 1; k4++)
        {
            ah1[k4] = new h();
            a1.a(ah1[k4]);
            a1.a();
        }

        ah1[k4] = new h();
        a1.a(ah1[k4]);
        l = ah1;
        continue; /* Loop/switch isn't completed */
_L35:
        int l4 = com.google.protobuf.nano.j.a(a1, 266);
        String as[];
        int j2;
        if (i == null)
        {
            j2 = 0;
        } else
        {
            j2 = i.length;
        }
        as = new String[l4 + j2];
        l4 = j2;
        if (j2 != 0)
        {
            System.arraycopy(i, 0, as, 0, j2);
            l4 = j2;
        }
        for (; l4 < as.length - 1; l4++)
        {
            as[l4] = a1.c();
            a1.a();
        }

        as[l4] = a1.c();
        i = as;
        continue; /* Loop/switch isn't completed */
_L36:
        int i5 = com.google.protobuf.nano.j.a(a1, 274);
        k ak[];
        int k2;
        if (m == null)
        {
            k2 = 0;
        } else
        {
            k2 = m.length;
        }
        ak = new k[i5 + k2];
        i5 = k2;
        if (k2 != 0)
        {
            System.arraycopy(m, 0, ak, 0, k2);
            i5 = k2;
        }
        for (; i5 < ak.length - 1; i5++)
        {
            ak[i5] = new k();
            a1.a(ak[i5]);
            a1.a();
        }

        ak[i5] = new k();
        a1.a(ak[i5]);
        m = ak;
        continue; /* Loop/switch isn't completed */
_L37:
        s = a1.d();
        o = o | 4;
        continue; /* Loop/switch isn't completed */
_L38:
        t = a1.d();
        o = o | 8;
        continue; /* Loop/switch isn't completed */
_L39:
        v = a1.e();
        o = o | 0x20;
        continue; /* Loop/switch isn't completed */
_L40:
        int l2 = a1.e();
        switch (l2)
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
        case 9: // '\t'
            x = l2;
            o = o | 0x80;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L41:
        A = Float.intBitsToFloat(a1.g());
        o = o | 0x400;
        continue; /* Loop/switch isn't completed */
_L42:
        ae = a1.e();
        p = p | 0x100;
        continue; /* Loop/switch isn't completed */
_L43:
        af = a1.e();
        p = p | 0x200;
        continue; /* Loop/switch isn't completed */
_L44:
        ad = a1.c();
        p = p | 0x80;
        continue; /* Loop/switch isn't completed */
_L45:
        N = a1.e();
        o = o | 0x800000;
        continue; /* Loop/switch isn't completed */
_L46:
        O = a1.e();
        o = o | 0x1000000;
        continue; /* Loop/switch isn't completed */
_L47:
        int i3 = a1.e();
        switch (i3)
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
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 998: 
        case 999: 
            Y = i3;
            p = p | 4;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L48:
        int j3 = a1.e();
        switch (j3)
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
            y = j3;
            o = o | 0x100;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L49:
        ah = a1.e();
        p = p | 0x800;
        continue; /* Loop/switch isn't completed */
_L50:
        ag = a1.c();
        p = p | 0x400;
        continue; /* Loop/switch isn't completed */
_L51:
        L = a1.c();
        o = o | 0x200000;
        continue; /* Loop/switch isn't completed */
_L52:
        ai = a1.b();
        p = p | 0x1000;
        continue; /* Loop/switch isn't completed */
_L53:
        int k3 = a1.e();
        switch (k3)
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
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 998: 
        case 999: 
            ab = k3;
            p = p | 0x20;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L54:
        if (n == null)
        {
            n = new y();
        }
        a1.a(n);
        continue; /* Loop/switch isn't completed */
_L55:
        int j5 = com.google.protobuf.nano.j.a(a1, 426);
        v av[];
        int l3;
        if (h == null)
        {
            l3 = 0;
        } else
        {
            l3 = h.length;
        }
        av = new v[j5 + l3];
        j5 = l3;
        if (l3 != 0)
        {
            System.arraycopy(h, 0, av, 0, l3);
            j5 = l3;
        }
        for (; j5 < av.length - 1; j5++)
        {
            av[j5] = new v();
            a1.a(av[j5]);
            a1.a();
        }

        av[j5] = new v();
        a1.a(av[j5]);
        h = av;
        continue; /* Loop/switch isn't completed */
_L56:
        if (a == null)
        {
            a = new i();
        }
        a1.a(a);
        continue; /* Loop/switch isn't completed */
_L57:
        int k5 = com.google.protobuf.nano.j.a(a1, 442);
        f af1[];
        int i4;
        if (d == null)
        {
            i4 = 0;
        } else
        {
            i4 = d.length;
        }
        af1 = new f[k5 + i4];
        k5 = i4;
        if (i4 != 0)
        {
            System.arraycopy(d, 0, af1, 0, i4);
            k5 = i4;
        }
        for (; k5 < af1.length - 1; k5++)
        {
            af1[k5] = new f();
            a1.a(af1[k5]);
            a1.a();
        }

        af1[k5] = new f();
        a1.a(af1[k5]);
        d = af1;
        continue; /* Loop/switch isn't completed */
_L58:
        if (e == null)
        {
            e = new aa();
        }
        a1.a(e);
        continue; /* Loop/switch isn't completed */
_L59:
        Z = a1.b();
        p = p | 8;
        continue; /* Loop/switch isn't completed */
_L60:
        aa = a1.b();
        p = p | 0x10;
        continue; /* Loop/switch isn't completed */
_L61:
        if (b == null)
        {
            b = new l();
        }
        a1.a(b);
        if (true) goto _L62; else goto _L63
_L63:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((o & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, q);
        }
        if ((o & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, r);
        }
        if ((o & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(3, w);
        }
        if ((o & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(4, z);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if ((o & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(6, B);
        }
        if ((o & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(7, C);
        }
        if ((o & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(8, D);
        }
        if ((o & 0x4000) != 0)
        {
            codedoutputbytebuffernano.a(9, E);
        }
        if ((o & 0x8000) != 0)
        {
            codedoutputbytebuffernano.a(10, F);
        }
        if ((o & 0x10000) != 0)
        {
            codedoutputbytebuffernano.a(11, G);
        }
        if ((o & 0x20000) != 0)
        {
            codedoutputbytebuffernano.a(12, H);
        }
        if ((o & 0x40000) != 0)
        {
            codedoutputbytebuffernano.a(13, I);
        }
        if ((o & 0x80000) != 0)
        {
            codedoutputbytebuffernano.a(14, J);
        }
        if ((o & 0x100000) != 0)
        {
            codedoutputbytebuffernano.a(15, K);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(16, g);
        }
        if ((o & 0x400000) != 0)
        {
            codedoutputbytebuffernano.a(17, M);
        }
        if ((o & 0x2000000) != 0)
        {
            codedoutputbytebuffernano.a(18, P);
        }
        if ((o & 0x4000000) != 0)
        {
            codedoutputbytebuffernano.a(19, Q);
        }
        if ((o & 0x8000000) != 0)
        {
            codedoutputbytebuffernano.a(20, R);
        }
        if ((o & 0x10000000) != 0)
        {
            codedoutputbytebuffernano.a(21, S);
        }
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                x x1 = j[i1];
                if (x1 != null)
                {
                    codedoutputbytebuffernano.a(22, x1);
                }
            }

        }
        if ((o & 0x20000000) != 0)
        {
            codedoutputbytebuffernano.a(23, T);
        }
        if ((o & 0x80000000) != 0)
        {
            codedoutputbytebuffernano.a(24, V);
        }
        if ((p & 1) != 0)
        {
            codedoutputbytebuffernano.a(25, W);
        }
        if ((p & 2) != 0)
        {
            codedoutputbytebuffernano.b(26, X);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(27, k);
        }
        if ((o & 0x40000000) != 0)
        {
            codedoutputbytebuffernano.a(28, U);
        }
        if ((o & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(29, u);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(30, c);
        }
        if ((p & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(31, ac);
        }
        if (l != null && l.length > 0)
        {
            for (int j1 = 0; j1 < l.length; j1++)
            {
                h h1 = l[j1];
                if (h1 != null)
                {
                    codedoutputbytebuffernano.a(32, h1);
                }
            }

        }
        if (i != null && i.length > 0)
        {
            for (int l1 = 0; l1 < i.length; l1++)
            {
                String s1 = i[l1];
                if (s1 != null)
                {
                    codedoutputbytebuffernano.a(33, s1);
                }
            }

        }
        if (m != null && m.length > 0)
        {
            for (int i2 = 0; i2 < m.length; i2++)
            {
                k k1 = m[i2];
                if (k1 != null)
                {
                    codedoutputbytebuffernano.a(34, k1);
                }
            }

        }
        if ((o & 4) != 0)
        {
            codedoutputbytebuffernano.a(35, s);
        }
        if ((o & 8) != 0)
        {
            codedoutputbytebuffernano.a(36, t);
        }
        if ((o & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(37, v);
        }
        if ((o & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(38, x);
        }
        if ((o & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(39, A);
        }
        if ((p & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(40, ae);
        }
        if ((p & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(41, af);
        }
        if ((p & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(42, ad);
        }
        if ((o & 0x800000) != 0)
        {
            codedoutputbytebuffernano.a(43, N);
        }
        if ((o & 0x1000000) != 0)
        {
            codedoutputbytebuffernano.a(44, O);
        }
        if ((p & 4) != 0)
        {
            codedoutputbytebuffernano.a(45, Y);
        }
        if ((o & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(46, y);
        }
        if ((p & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(47, ah);
        }
        if ((p & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(48, ag);
        }
        if ((o & 0x200000) != 0)
        {
            codedoutputbytebuffernano.a(49, L);
        }
        if ((p & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(50, ai);
        }
        if ((p & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(51, ab);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(52, n);
        }
        if (h != null && h.length > 0)
        {
            for (int j2 = 0; j2 < h.length; j2++)
            {
                v v1 = h[j2];
                if (v1 != null)
                {
                    codedoutputbytebuffernano.a(53, v1);
                }
            }

        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(54, a);
        }
        if (d != null && d.length > 0)
        {
            for (int k2 = ((flag) ? 1 : 0); k2 < d.length; k2++)
            {
                f f1 = d[k2];
                if (f1 != null)
                {
                    codedoutputbytebuffernano.a(55, f1);
                }
            }

        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(56, e);
        }
        if ((p & 8) != 0)
        {
            codedoutputbytebuffernano.a(57, Z);
        }
        if ((p & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(58, aa);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(59, b);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
