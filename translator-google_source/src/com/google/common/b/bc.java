// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.common.b:
//            bg, be, bf, bd

public final class bc extends b
{

    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private String L;
    private int M;
    private int N;
    private int O;
    private String P;
    private int Q;
    private String R;
    private boolean S;
    public int a[];
    public be b;
    public bg c;
    public bg d[];
    public bg e[];
    public bd f;
    public bf g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private String n;
    private String o;
    private int p;
    private String q;
    private String r;
    private boolean s;
    private int t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    public bc()
    {
        h = 0;
        i = 0;
        j = 0;
        k = 1;
        l = 1;
        m = 0;
        n = "";
        o = "";
        p = 22;
        a = j.a;
        b = null;
        q = "";
        r = "";
        c = null;
        d = com.google.common.b.bg.a();
        e = com.google.common.b.bg.a();
        s = false;
        t = 0;
        u = false;
        v = 0;
        w = 0;
        x = 0;
        y = 0;
        z = 0;
        A = 0;
        f = null;
        B = 0;
        C = 0;
        D = 0;
        E = 0;
        F = 0;
        G = 0;
        H = 0;
        I = 0;
        J = 0;
        K = 0;
        L = "";
        M = 0;
        N = 0;
        O = 0;
        P = "";
        g = null;
        Q = 0;
        R = "";
        S = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((h & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(1, j);
        }
        j1 = i1;
        if ((h & 0x10) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, n);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(3, b);
        }
        j1 = i1;
        if ((h & 0x80) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(4, q);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(5, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                for (j1 = 0; j1 < d.length;)
                {
                    bg bg1 = d[j1];
                    int k1 = i1;
                    if (bg1 != null)
                    {
                        k1 = i1 + CodedOutputByteBufferNano.c(6, bg1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if ((h & 0x800) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(7) + 1);
        }
        j1 = i1;
        if ((h & 0x1000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(8, v);
        }
        i1 = j1;
        if ((h & 0x2000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(9, w);
        }
        j1 = i1;
        if ((h & 0x4000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(10, x);
        }
        i1 = j1;
        if ((h & 0x8000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(11, y);
        }
        j1 = i1;
        if ((h & 0x20000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(12, A);
        }
        i1 = j1;
        if ((h & 0x400000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(13, F);
        }
        j1 = i1;
        if ((h & 0x40000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(14, B);
        }
        i1 = j1;
        if ((h & 0x100000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(15, D);
        }
        j1 = i1;
        if ((h & 0x200000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(16, E);
        }
        i1 = j1;
        if ((h & 0x1000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(17, H);
        }
        j1 = i1;
        if ((h & 0x2000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(18, I);
        }
        i1 = j1;
        if ((h & 0x4000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(19, J);
        }
        j1 = i1;
        if ((h & 0x8000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(20, K);
        }
        i1 = j1;
        if ((h & 0x10000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(21, L);
        }
        j1 = i1;
        if ((h & 0x10000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(22, z);
        }
        i1 = j1;
        if ((h & 0x40) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(23, p);
        }
        j1 = i1;
        if ((h & 0x80000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(24, C);
        }
        i1 = j1;
        if ((h & 0x800000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(25, G);
        }
        j1 = i1;
        if ((i & 1) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(26, P);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(27, g);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(28, f);
        }
        int l1 = j1;
        if ((h & 2) != 0)
        {
            l1 = j1 + CodedOutputByteBufferNano.d(29, k);
        }
        i1 = l1;
        if ((h & 4) != 0)
        {
            i1 = l1 + CodedOutputByteBufferNano.d(30, l);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                j1 = 0;
                l1 = 0;
                for (; j1 < a.length; j1++)
                {
                    l1 += CodedOutputByteBufferNano.a(a[j1]);
                }

                j1 = i1 + l1 + a.length * 2;
            }
        }
        i1 = j1;
        if ((h & 8) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(32, m);
        }
        j1 = i1;
        if ((h & 0x20) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(33, o);
        }
        i1 = j1;
        if ((h & 0x20000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(34, M);
        }
        j1 = i1;
        if ((h & 0x40000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(35, N);
        }
        i1 = j1;
        if ((h & 0x80000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.e(36, O);
        }
        j1 = i1;
        if ((h & 0x400) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.e(37, t);
        }
        l1 = j1;
        if ((h & 0x200) != 0)
        {
            l1 = j1 + (CodedOutputByteBufferNano.b(38) + 1);
        }
        i1 = l1;
        if ((i & 2) != 0)
        {
            i1 = l1 + CodedOutputByteBufferNano.d(39, Q);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= e.length)
                    {
                        break;
                    }
                    bg bg2 = e[i2];
                    j1 = i1;
                    if (bg2 != null)
                    {
                        j1 = i1 + CodedOutputByteBufferNano.c(40, bg2);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if ((h & 0x100) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(41, r);
        }
        j1 = i1;
        if ((i & 4) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(42, R);
        }
        i1 = j1;
        if ((i & 8) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(43) + 1);
        }
        return i1;
    }

    public final g mergeFrom(a a1)
    {
_L47:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 45: default 380
    //                   0: 390
    //                   8: 392
    //                   18: 458
    //                   26: 480
    //                   34: 509
    //                   42: 532
    //                   50: 561
    //                   56: 692
    //                   64: 715
    //                   72: 738
    //                   80: 761
    //                   88: 784
    //                   96: 806
    //                   104: 828
    //                   112: 850
    //                   120: 872
    //                   128: 894
    //                   136: 916
    //                   144: 938
    //                   152: 960
    //                   160: 982
    //                   170: 1004
    //                   176: 1026
    //                   184: 1048
    //                   192: 1183
    //                   200: 1205
    //                   210: 1227
    //                   218: 1248
    //                   226: 1277
    //                   232: 1306
    //                   240: 1362
    //                   248: 1418
    //                   250: 1628
    //                   256: 1882
    //                   266: 1904
    //                   272: 1926
    //                   280: 1948
    //                   288: 1970
    //                   296: 1992
    //                   304: 2015
    //                   312: 2038
    //                   322: 2102
    //                   330: 2234
    //                   338: 2257
    //                   344: 2278;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L47; else goto _L2
_L2:
        return this;
_L3:
        i1 = a1.e();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            j = i1;
            h = h | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        n = a1.c();
        h = h | 0x10;
        continue; /* Loop/switch isn't completed */
_L5:
        if (b == null)
        {
            b = new be();
        }
        a1.a(b);
        continue; /* Loop/switch isn't completed */
_L6:
        q = a1.c();
        h = h | 0x80;
        continue; /* Loop/switch isn't completed */
_L7:
        if (c == null)
        {
            c = new bg();
        }
        a1.a(c);
        continue; /* Loop/switch isn't completed */
_L8:
        int l1 = com.google.protobuf.nano.j.a(a1, 50);
        bg abg[];
        if (d == null)
        {
            i1 = 0;
        } else
        {
            i1 = d.length;
        }
        abg = new bg[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(d, 0, abg, 0, i1);
            l1 = i1;
        }
        for (; l1 < abg.length - 1; l1++)
        {
            abg[l1] = new bg();
            a1.a(abg[l1]);
            a1.a();
        }

        abg[l1] = new bg();
        a1.a(abg[l1]);
        d = abg;
        continue; /* Loop/switch isn't completed */
_L9:
        u = a1.b();
        h = h | 0x800;
        continue; /* Loop/switch isn't completed */
_L10:
        v = a1.e();
        h = h | 0x1000;
        continue; /* Loop/switch isn't completed */
_L11:
        w = a1.e();
        h = h | 0x2000;
        continue; /* Loop/switch isn't completed */
_L12:
        x = a1.e();
        h = h | 0x4000;
        continue; /* Loop/switch isn't completed */
_L13:
        y = a1.e();
        h = h | 0x8000;
        continue; /* Loop/switch isn't completed */
_L14:
        A = a1.e();
        h = h | 0x20000;
        continue; /* Loop/switch isn't completed */
_L15:
        F = a1.e();
        h = h | 0x400000;
        continue; /* Loop/switch isn't completed */
_L16:
        B = a1.e();
        h = h | 0x40000;
        continue; /* Loop/switch isn't completed */
_L17:
        D = a1.e();
        h = h | 0x100000;
        continue; /* Loop/switch isn't completed */
_L18:
        E = a1.e();
        h = h | 0x200000;
        continue; /* Loop/switch isn't completed */
_L19:
        H = a1.e();
        h = h | 0x1000000;
        continue; /* Loop/switch isn't completed */
_L20:
        I = a1.e();
        h = h | 0x2000000;
        continue; /* Loop/switch isn't completed */
_L21:
        J = a1.e();
        h = h | 0x4000000;
        continue; /* Loop/switch isn't completed */
_L22:
        K = a1.e();
        h = h | 0x8000000;
        continue; /* Loop/switch isn't completed */
_L23:
        L = a1.c();
        h = h | 0x10000000;
        continue; /* Loop/switch isn't completed */
_L24:
        z = a1.e();
        h = h | 0x10000;
        continue; /* Loop/switch isn't completed */
_L25:
        i1 = a1.e();
        switch (i1)
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
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
            p = i1;
            h = h | 0x40;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L26:
        C = a1.e();
        h = h | 0x80000;
        continue; /* Loop/switch isn't completed */
_L27:
        G = a1.e();
        h = h | 0x800000;
        continue; /* Loop/switch isn't completed */
_L28:
        P = a1.c();
        i = i | 1;
        continue; /* Loop/switch isn't completed */
_L29:
        if (g == null)
        {
            g = new bf();
        }
        a1.a(g);
        continue; /* Loop/switch isn't completed */
_L30:
        if (f == null)
        {
            f = new bd();
        }
        a1.a(f);
        continue; /* Loop/switch isn't completed */
_L31:
        i1 = a1.e();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            k = i1;
            h = h | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L32:
        i1 = a1.e();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            l = i1;
            h = h | 4;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L33:
        int ai[];
        int i2;
        int i3;
        i3 = com.google.protobuf.nano.j.a(a1, 248);
        ai = new int[i3];
        i2 = 0;
        i1 = 0;
_L53:
        if (i2 >= i3) goto _L49; else goto _L48
_L48:
        int j3;
        if (i2 != 0)
        {
            a1.a();
        }
        j3 = a1.e();
        j3;
        JVM INSTR tableswitch 1 9: default 1512
    //                   1 1521
    //                   2 1521
    //                   3 1521
    //                   4 1521
    //                   5 1521
    //                   6 1521
    //                   7 1521
    //                   8 1521
    //                   9 1521;
           goto _L50 _L51 _L51 _L51 _L51 _L51 _L51 _L51 _L51 _L51
_L50:
        i2++;
        continue; /* Loop/switch isn't completed */
_L51:
        int k2 = i1 + 1;
        ai[i1] = j3;
        i1 = k2;
        if (true) goto _L50; else goto _L49
_L49:
        if (i1 != 0)
        {
            if (a == null)
            {
                i2 = 0;
            } else
            {
                i2 = a.length;
            }
            if (i2 == 0 && i1 == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[i2 + i1];
                if (i2 != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, i2);
                }
                System.arraycopy(ai, 0, ai1, i2, i1);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L53; else goto _L52
_L52:
_L34:
        int l2;
        l2 = a1.c(a1.e());
        i1 = a1.j();
        i2 = 0;
_L59:
        if (a1.i() > 0)
        {
            switch (a1.e())
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
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i2 == 0) goto _L55; else goto _L54
_L54:
        a1.e(i1);
        if (a == null)
        {
            i1 = 0;
        } else
        {
            i1 = a.length;
        }
        ai = new int[i2 + i1];
        i2 = i1;
        if (i1 != 0)
        {
            System.arraycopy(a, 0, ai, 0, i1);
            i2 = i1;
        }
_L57:
        if (a1.i() > 0)
        {
            i1 = a1.e();
            switch (i1)
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
                ai[i2] = i1;
                i2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
_L55:
        a1.d(l2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L57; else goto _L56
_L56:
        if (true) goto _L59; else goto _L58
_L58:
_L35:
        m = a1.e();
        h = h | 8;
        continue; /* Loop/switch isn't completed */
_L36:
        o = a1.c();
        h = h | 0x20;
        continue; /* Loop/switch isn't completed */
_L37:
        M = a1.e();
        h = h | 0x20000000;
        continue; /* Loop/switch isn't completed */
_L38:
        N = a1.e();
        h = h | 0x40000000;
        continue; /* Loop/switch isn't completed */
_L39:
        O = a1.e();
        h = h | 0x80000000;
        continue; /* Loop/switch isn't completed */
_L40:
        t = a1.e();
        h = h | 0x400;
        continue; /* Loop/switch isn't completed */
_L41:
        s = a1.b();
        h = h | 0x200;
        continue; /* Loop/switch isn't completed */
_L42:
        int j1 = a1.e();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            Q = j1;
            i = i | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L43:
        int j2 = com.google.protobuf.nano.j.a(a1, 322);
        bg abg1[];
        int k1;
        if (e == null)
        {
            k1 = 0;
        } else
        {
            k1 = e.length;
        }
        abg1 = new bg[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(e, 0, abg1, 0, k1);
            j2 = k1;
        }
        for (; j2 < abg1.length - 1; j2++)
        {
            abg1[j2] = new bg();
            a1.a(abg1[j2]);
            a1.a();
        }

        abg1[j2] = new bg();
        a1.a(abg1[j2]);
        e = abg1;
        continue; /* Loop/switch isn't completed */
_L44:
        r = a1.c();
        h = h | 0x100;
        continue; /* Loop/switch isn't completed */
_L45:
        R = a1.c();
        i = i | 4;
        continue; /* Loop/switch isn't completed */
_L46:
        S = a1.b();
        i = i | 8;
        if (true) goto _L47; else goto _L60
_L60:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((h & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, j);
        }
        if ((h & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(2, n);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(3, b);
        }
        if ((h & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(4, q);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(5, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                bg bg1 = d[i1];
                if (bg1 != null)
                {
                    codedoutputbytebuffernano.a(6, bg1);
                }
            }

        }
        if ((h & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(7, u);
        }
        if ((h & 0x1000) != 0)
        {
            codedoutputbytebuffernano.c(8, v);
        }
        if ((h & 0x2000) != 0)
        {
            codedoutputbytebuffernano.c(9, w);
        }
        if ((h & 0x4000) != 0)
        {
            codedoutputbytebuffernano.c(10, x);
        }
        if ((h & 0x8000) != 0)
        {
            codedoutputbytebuffernano.c(11, y);
        }
        if ((h & 0x20000) != 0)
        {
            codedoutputbytebuffernano.c(12, A);
        }
        if ((h & 0x400000) != 0)
        {
            codedoutputbytebuffernano.c(13, F);
        }
        if ((h & 0x40000) != 0)
        {
            codedoutputbytebuffernano.c(14, B);
        }
        if ((h & 0x100000) != 0)
        {
            codedoutputbytebuffernano.c(15, D);
        }
        if ((h & 0x200000) != 0)
        {
            codedoutputbytebuffernano.c(16, E);
        }
        if ((h & 0x1000000) != 0)
        {
            codedoutputbytebuffernano.c(17, H);
        }
        if ((h & 0x2000000) != 0)
        {
            codedoutputbytebuffernano.c(18, I);
        }
        if ((h & 0x4000000) != 0)
        {
            codedoutputbytebuffernano.c(19, J);
        }
        if ((h & 0x8000000) != 0)
        {
            codedoutputbytebuffernano.c(20, K);
        }
        if ((h & 0x10000000) != 0)
        {
            codedoutputbytebuffernano.a(21, L);
        }
        if ((h & 0x10000) != 0)
        {
            codedoutputbytebuffernano.c(22, z);
        }
        if ((h & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(23, p);
        }
        if ((h & 0x80000) != 0)
        {
            codedoutputbytebuffernano.c(24, C);
        }
        if ((h & 0x800000) != 0)
        {
            codedoutputbytebuffernano.c(25, G);
        }
        if ((i & 1) != 0)
        {
            codedoutputbytebuffernano.a(26, P);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(27, g);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(28, f);
        }
        if ((h & 2) != 0)
        {
            codedoutputbytebuffernano.a(29, k);
        }
        if ((h & 4) != 0)
        {
            codedoutputbytebuffernano.a(30, l);
        }
        if (a != null && a.length > 0)
        {
            for (int j1 = 0; j1 < a.length; j1++)
            {
                codedoutputbytebuffernano.a(31, a[j1]);
            }

        }
        if ((h & 8) != 0)
        {
            codedoutputbytebuffernano.c(32, m);
        }
        if ((h & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(33, o);
        }
        if ((h & 0x20000000) != 0)
        {
            codedoutputbytebuffernano.c(34, M);
        }
        if ((h & 0x40000000) != 0)
        {
            codedoutputbytebuffernano.c(35, N);
        }
        if ((h & 0x80000000) != 0)
        {
            codedoutputbytebuffernano.c(36, O);
        }
        if ((h & 0x400) != 0)
        {
            codedoutputbytebuffernano.c(37, t);
        }
        if ((h & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(38, s);
        }
        if ((i & 2) != 0)
        {
            codedoutputbytebuffernano.a(39, Q);
        }
        if (e != null && e.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < e.length; k1++)
            {
                bg bg2 = e[k1];
                if (bg2 != null)
                {
                    codedoutputbytebuffernano.a(40, bg2);
                }
            }

        }
        if ((h & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(41, r);
        }
        if ((i & 4) != 0)
        {
            codedoutputbytebuffernano.a(42, R);
        }
        if ((i & 8) != 0)
        {
            codedoutputbytebuffernano.a(43, S);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
