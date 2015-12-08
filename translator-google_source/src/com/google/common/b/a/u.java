// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.common.b.a:
//            f, t, x, r

public final class u extends b
{

    private int A;
    public int a[];
    public t b;
    public t c;
    public t d;
    public t e;
    public t f;
    public x g;
    public r h;
    public f i[];
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private long w;
    private String x;
    private String y;
    private String z;

    public u()
    {
        j = 0;
        k = false;
        l = false;
        m = false;
        n = false;
        o = false;
        p = false;
        q = false;
        r = false;
        s = false;
        t = false;
        u = false;
        v = false;
        w = 0L;
        x = "";
        y = "";
        a = j.a;
        z = "";
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        A = 0;
        g = null;
        h = null;
        i = com.google.common.b.a.f.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((j & 1) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(1) + 1);
        }
        j1 = i1;
        if ((j & 2) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(2) + 1);
        }
        i1 = j1;
        if ((j & 4) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(3) + 1);
        }
        j1 = i1;
        if ((j & 8) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(4) + 1);
        }
        i1 = j1;
        if ((j & 0x10) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(5) + 1);
        }
        j1 = i1;
        if ((j & 0x20) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(6) + 1);
        }
        i1 = j1;
        if ((j & 0x40) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(7) + 1);
        }
        j1 = i1;
        if ((j & 0x80) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(8) + 1);
        }
        i1 = j1;
        if ((j & 0x100) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(9) + 1);
        }
        j1 = i1;
        if ((j & 0x200) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(10) + 1);
        }
        i1 = j1;
        if ((j & 0x400) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(11) + 1);
        }
        j1 = i1;
        if ((j & 0x800) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(12) + 1);
        }
        i1 = j1;
        if ((j & 0x1000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(13, w);
        }
        j1 = i1;
        if ((j & 0x2000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(14, x);
        }
        i1 = j1;
        if ((j & 0x4000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(15, y);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                j1 = 0;
                int l1 = 0;
                for (; j1 < a.length; j1++)
                {
                    l1 += CodedOutputByteBufferNano.a(a[j1]);
                }

                j1 = i1 + l1 + a.length * 2;
            }
        }
        i1 = j1;
        if ((j & 0x8000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(17, z);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(18, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(19, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(20, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(21, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(22, f);
        }
        i1 = j1;
        if ((j & 0x10000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(23, A);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(24, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(25, h);
        }
        int i2 = i1;
        if (i != null)
        {
            i2 = i1;
            if (i.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    i2 = i1;
                    if (k1 >= i.length)
                    {
                        break;
                    }
                    f f1 = i[k1];
                    i2 = i1;
                    if (f1 != null)
                    {
                        i2 = i1 + CodedOutputByteBufferNano.c(26, f1);
                    }
                    k1++;
                    i1 = i2;
                } while (true);
            }
        }
        return i2;
    }

    public final g mergeFrom(a a1)
    {
_L30:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 28: default 240
    //                   0: 249
    //                   8: 251
    //                   16: 272
    //                   24: 293
    //                   32: 314
    //                   40: 336
    //                   48: 358
    //                   56: 380
    //                   64: 402
    //                   72: 425
    //                   80: 448
    //                   88: 471
    //                   96: 494
    //                   104: 517
    //                   114: 540
    //                   122: 563
    //                   128: 586
    //                   130: 688
    //                   138: 816
    //                   146: 838
    //                   154: 867
    //                   162: 896
    //                   170: 925
    //                   178: 954
    //                   184: 983
    //                   194: 1034
    //                   202: 1063
    //                   210: 1092;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L30; else goto _L2
_L2:
        return this;
_L3:
        k = a1.b();
        j = j | 1;
          goto _L30
_L4:
        l = a1.b();
        j = j | 2;
          goto _L30
_L5:
        m = a1.b();
        j = j | 4;
          goto _L30
_L6:
        n = a1.b();
        j = j | 8;
          goto _L30
_L7:
        o = a1.b();
        j = j | 0x10;
          goto _L30
_L8:
        p = a1.b();
        j = j | 0x20;
          goto _L30
_L9:
        q = a1.b();
        j = j | 0x40;
          goto _L30
_L10:
        r = a1.b();
        j = j | 0x80;
          goto _L30
_L11:
        s = a1.b();
        j = j | 0x100;
          goto _L30
_L12:
        t = a1.b();
        j = j | 0x200;
          goto _L30
_L13:
        u = a1.b();
        j = j | 0x400;
          goto _L30
_L14:
        v = a1.b();
        j = j | 0x800;
          goto _L30
_L15:
        w = a1.f();
        j = j | 0x1000;
          goto _L30
_L16:
        x = a1.c();
        j = j | 0x2000;
          goto _L30
_L17:
        y = a1.c();
        j = j | 0x4000;
          goto _L30
_L18:
        int j2 = com.google.protobuf.nano.j.a(a1, 128);
        int ai[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        ai = new int[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, ai, 0, j1);
            j2 = j1;
        }
        for (; j2 < ai.length - 1; j2++)
        {
            ai[j2] = a1.e();
            a1.a();
        }

        ai[j2] = a1.e();
        a = ai;
          goto _L30
_L19:
        int i3 = a1.c(a1.e());
        int k1 = a1.j();
        int k2;
        for (k2 = 0; a1.i() > 0; k2++)
        {
            a1.e();
        }

        a1.e(k1);
        int ai1[];
        if (a == null)
        {
            k1 = 0;
        } else
        {
            k1 = a.length;
        }
        ai1 = new int[k2 + k1];
        k2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(a, 0, ai1, 0, k1);
            k2 = k1;
        }
        for (; k2 < ai1.length; k2++)
        {
            ai1[k2] = a1.e();
        }

        a = ai1;
        a1.d(i3);
          goto _L30
_L20:
        z = a1.c();
        j = j | 0x8000;
          goto _L30
_L21:
        if (b == null)
        {
            b = new t();
        }
        a1.a(b);
          goto _L30
_L22:
        if (c == null)
        {
            c = new t();
        }
        a1.a(c);
          goto _L30
_L23:
        if (d == null)
        {
            d = new t();
        }
        a1.a(d);
          goto _L30
_L24:
        if (e == null)
        {
            e = new t();
        }
        a1.a(e);
          goto _L30
_L25:
        if (f == null)
        {
            f = new t();
        }
        a1.a(f);
          goto _L30
_L26:
        int l1 = a1.e();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
            A = l1;
            j = j | 0x10000;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L27:
        if (g == null)
        {
            g = new x();
        }
        a1.a(g);
        continue; /* Loop/switch isn't completed */
_L28:
        if (h == null)
        {
            h = new r();
        }
        a1.a(h);
        continue; /* Loop/switch isn't completed */
_L29:
        int l2 = com.google.protobuf.nano.j.a(a1, 210);
        f af[];
        int i2;
        if (i == null)
        {
            i2 = 0;
        } else
        {
            i2 = i.length;
        }
        af = new f[l2 + i2];
        l2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(i, 0, af, 0, i2);
            l2 = i2;
        }
        for (; l2 < af.length - 1; l2++)
        {
            af[l2] = new f();
            a1.a(af[l2]);
            a1.a();
        }

        af[l2] = new f();
        a1.a(af[l2]);
        i = af;
        if (true) goto _L30; else goto _L31
_L31:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((j & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, k);
        }
        if ((j & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, l);
        }
        if ((j & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, m);
        }
        if ((j & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, n);
        }
        if ((j & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, o);
        }
        if ((j & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, p);
        }
        if ((j & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, q);
        }
        if ((j & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, r);
        }
        if ((j & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(9, s);
        }
        if ((j & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(10, t);
        }
        if ((j & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(11, u);
        }
        if ((j & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(12, v);
        }
        if ((j & 0x1000) != 0)
        {
            codedoutputbytebuffernano.b(13, w);
        }
        if ((j & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(14, x);
        }
        if ((j & 0x4000) != 0)
        {
            codedoutputbytebuffernano.a(15, y);
        }
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                codedoutputbytebuffernano.a(16, a[i1]);
            }

        }
        if ((j & 0x8000) != 0)
        {
            codedoutputbytebuffernano.a(17, z);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(18, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(19, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(20, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(21, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(22, f);
        }
        if ((j & 0x10000) != 0)
        {
            codedoutputbytebuffernano.a(23, A);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(24, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(25, h);
        }
        if (i != null && i.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < i.length; j1++)
            {
                f f1 = i[j1];
                if (f1 != null)
                {
                    codedoutputbytebuffernano.a(26, f1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
