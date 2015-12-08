// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.common.b.a:
//            v

public final class t extends b
{

    private long A;
    private int B;
    private long C;
    private String D;
    private String E;
    private String F;
    private String G;
    private String H;
    private String I;
    private String J;
    private String K;
    public v a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private long t;
    private String u;
    private int v;
    private int w;
    private String x;
    private int y;
    private boolean z;

    public t()
    {
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = false;
        i = false;
        j = false;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = 0L;
        u = "";
        v = 0;
        w = 0;
        x = "";
        y = 0;
        z = false;
        A = 0L;
        B = 0;
        a = null;
        C = 0L;
        D = "";
        E = "";
        F = "";
        G = "";
        H = "";
        I = "";
        J = "";
        K = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((b & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(1, d);
        }
        j1 = i1;
        if ((b & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(2, e);
        }
        i1 = j1;
        if ((b & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(3, f);
        }
        j1 = i1;
        if ((b & 8) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(4, g);
        }
        i1 = j1;
        if ((b & 0x10) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(5) + 1);
        }
        j1 = i1;
        if ((b & 0x20) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(6) + 1);
        }
        i1 = j1;
        if ((b & 0x40) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(7) + 1);
        }
        j1 = i1;
        if ((b & 0x80) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(8) + 1);
        }
        i1 = j1;
        if ((b & 0x100) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(9) + 1);
        }
        j1 = i1;
        if ((b & 0x200) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(10) + 1);
        }
        i1 = j1;
        if ((b & 0x400) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(11) + 1);
        }
        j1 = i1;
        if ((b & 0x800) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(12) + 1);
        }
        i1 = j1;
        if ((b & 0x1000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(13) + 1);
        }
        j1 = i1;
        if ((b & 0x2000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(14) + 1);
        }
        i1 = j1;
        if ((b & 0x4000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(15) + 1);
        }
        j1 = i1;
        if ((b & 0x8000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(16) + 1);
        }
        i1 = j1;
        if ((b & 0x10000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(17, t);
        }
        j1 = i1;
        if ((b & 0x20000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(18, u);
        }
        i1 = j1;
        if ((b & 0x40000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(19, v);
        }
        j1 = i1;
        if ((b & 0x80000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(20, w);
        }
        i1 = j1;
        if ((b & 0x100000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(21, x);
        }
        j1 = i1;
        if ((b & 0x200000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(22, y);
        }
        i1 = j1;
        if ((b & 0x400000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(23) + 1);
        }
        j1 = i1;
        if ((b & 0x800000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(24, A);
        }
        i1 = j1;
        if ((b & 0x1000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(25, B);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(26, a);
        }
        i1 = j1;
        if ((b & 0x2000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(27, C);
        }
        j1 = i1;
        if ((b & 0x4000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(28, D);
        }
        i1 = j1;
        if ((b & 0x8000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(29, E);
        }
        j1 = i1;
        if ((b & 0x10000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(30, F);
        }
        i1 = j1;
        if ((b & 0x20000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(31, G);
        }
        j1 = i1;
        if ((b & 0x40000000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(32, H);
        }
        i1 = j1;
        if ((b & 0x80000000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(33, I);
        }
        j1 = i1;
        if ((c & 1) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(34, J);
        }
        i1 = j1;
        if ((c & 2) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(35, K);
        }
        return i1;
    }

    public final g mergeFrom(a a1)
    {
_L38:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 36: default 304
    //                   0: 313
    //                   8: 315
    //                   16: 393
    //                   24: 489
    //                   32: 549
    //                   40: 571
    //                   48: 593
    //                   56: 615
    //                   64: 637
    //                   72: 660
    //                   80: 683
    //                   88: 706
    //                   96: 729
    //                   104: 752
    //                   112: 775
    //                   120: 798
    //                   128: 821
    //                   136: 843
    //                   146: 865
    //                   152: 887
    //                   160: 909
    //                   170: 931
    //                   176: 953
    //                   184: 975
    //                   192: 997
    //                   200: 1019
    //                   210: 1041
    //                   216: 1070
    //                   226: 1092
    //                   234: 1114
    //                   242: 1136
    //                   250: 1158
    //                   258: 1180
    //                   266: 1202
    //                   274: 1224
    //                   282: 1245;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L38; else goto _L2
_L2:
        return this;
_L3:
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
            d = j1;
            b = b | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k1 = a1.e();
        switch (k1)
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
        case 12: // '\f'
        case 13: // '\r'
            e = k1;
            b = b | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l1 = a1.e();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            f = l1;
            b = b | 4;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        g = a1.e();
        b = b | 8;
        continue; /* Loop/switch isn't completed */
_L7:
        h = a1.b();
        b = b | 0x10;
        continue; /* Loop/switch isn't completed */
_L8:
        i = a1.b();
        b = b | 0x20;
        continue; /* Loop/switch isn't completed */
_L9:
        j = a1.b();
        b = b | 0x40;
        continue; /* Loop/switch isn't completed */
_L10:
        k = a1.b();
        b = b | 0x80;
        continue; /* Loop/switch isn't completed */
_L11:
        l = a1.b();
        b = b | 0x100;
        continue; /* Loop/switch isn't completed */
_L12:
        m = a1.b();
        b = b | 0x200;
        continue; /* Loop/switch isn't completed */
_L13:
        n = a1.b();
        b = b | 0x400;
        continue; /* Loop/switch isn't completed */
_L14:
        o = a1.b();
        b = b | 0x800;
        continue; /* Loop/switch isn't completed */
_L15:
        p = a1.b();
        b = b | 0x1000;
        continue; /* Loop/switch isn't completed */
_L16:
        q = a1.b();
        b = b | 0x2000;
        continue; /* Loop/switch isn't completed */
_L17:
        r = a1.b();
        b = b | 0x4000;
        continue; /* Loop/switch isn't completed */
_L18:
        s = a1.b();
        b = b | 0x8000;
        continue; /* Loop/switch isn't completed */
_L19:
        t = a1.f();
        b = b | 0x10000;
        continue; /* Loop/switch isn't completed */
_L20:
        u = a1.c();
        b = b | 0x20000;
        continue; /* Loop/switch isn't completed */
_L21:
        v = a1.e();
        b = b | 0x40000;
        continue; /* Loop/switch isn't completed */
_L22:
        w = a1.e();
        b = b | 0x80000;
        continue; /* Loop/switch isn't completed */
_L23:
        x = a1.c();
        b = b | 0x100000;
        continue; /* Loop/switch isn't completed */
_L24:
        y = a1.e();
        b = b | 0x200000;
        continue; /* Loop/switch isn't completed */
_L25:
        z = a1.b();
        b = b | 0x400000;
        continue; /* Loop/switch isn't completed */
_L26:
        A = a1.f();
        b = b | 0x800000;
        continue; /* Loop/switch isn't completed */
_L27:
        B = a1.e();
        b = b | 0x1000000;
        continue; /* Loop/switch isn't completed */
_L28:
        if (a == null)
        {
            a = new v();
        }
        a1.a(a);
        continue; /* Loop/switch isn't completed */
_L29:
        C = a1.f();
        b = b | 0x2000000;
        continue; /* Loop/switch isn't completed */
_L30:
        D = a1.c();
        b = b | 0x4000000;
        continue; /* Loop/switch isn't completed */
_L31:
        E = a1.c();
        b = b | 0x8000000;
        continue; /* Loop/switch isn't completed */
_L32:
        F = a1.c();
        b = b | 0x10000000;
        continue; /* Loop/switch isn't completed */
_L33:
        G = a1.c();
        b = b | 0x20000000;
        continue; /* Loop/switch isn't completed */
_L34:
        H = a1.c();
        b = b | 0x40000000;
        continue; /* Loop/switch isn't completed */
_L35:
        I = a1.c();
        b = b | 0x80000000;
        continue; /* Loop/switch isn't completed */
_L36:
        J = a1.c();
        c = c | 1;
        continue; /* Loop/switch isn't completed */
_L37:
        K = a1.c();
        c = c | 2;
        if (true) goto _L38; else goto _L39
_L39:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, f);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, g);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, i);
        }
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, j);
        }
        if ((b & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, k);
        }
        if ((b & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(9, l);
        }
        if ((b & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(10, m);
        }
        if ((b & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(11, n);
        }
        if ((b & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(12, o);
        }
        if ((b & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(13, p);
        }
        if ((b & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(14, q);
        }
        if ((b & 0x4000) != 0)
        {
            codedoutputbytebuffernano.a(15, r);
        }
        if ((b & 0x8000) != 0)
        {
            codedoutputbytebuffernano.a(16, s);
        }
        if ((b & 0x10000) != 0)
        {
            codedoutputbytebuffernano.b(17, t);
        }
        if ((b & 0x20000) != 0)
        {
            codedoutputbytebuffernano.a(18, u);
        }
        if ((b & 0x40000) != 0)
        {
            codedoutputbytebuffernano.a(19, v);
        }
        if ((b & 0x80000) != 0)
        {
            codedoutputbytebuffernano.a(20, w);
        }
        if ((b & 0x100000) != 0)
        {
            codedoutputbytebuffernano.a(21, x);
        }
        if ((b & 0x200000) != 0)
        {
            codedoutputbytebuffernano.a(22, y);
        }
        if ((b & 0x400000) != 0)
        {
            codedoutputbytebuffernano.a(23, z);
        }
        if ((b & 0x800000) != 0)
        {
            codedoutputbytebuffernano.b(24, A);
        }
        if ((b & 0x1000000) != 0)
        {
            codedoutputbytebuffernano.a(25, B);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(26, a);
        }
        if ((b & 0x2000000) != 0)
        {
            codedoutputbytebuffernano.b(27, C);
        }
        if ((b & 0x4000000) != 0)
        {
            codedoutputbytebuffernano.a(28, D);
        }
        if ((b & 0x8000000) != 0)
        {
            codedoutputbytebuffernano.a(29, E);
        }
        if ((b & 0x10000000) != 0)
        {
            codedoutputbytebuffernano.a(30, F);
        }
        if ((b & 0x20000000) != 0)
        {
            codedoutputbytebuffernano.a(31, G);
        }
        if ((b & 0x40000000) != 0)
        {
            codedoutputbytebuffernano.a(32, H);
        }
        if ((b & 0x80000000) != 0)
        {
            codedoutputbytebuffernano.a(33, I);
        }
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(34, J);
        }
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(35, K);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
