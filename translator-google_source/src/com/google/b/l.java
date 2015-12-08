// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.b:
//            n, m, p

public final class l extends b
{

    public n a[];
    public m b[];
    public p c[];
    private int d;
    private float e;
    private int f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private int m;
    private String n;
    private String o;

    public l()
    {
        d = 0;
        e = 0.0F;
        f = 0;
        a = com.google.b.n.a();
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        b = com.google.b.m.a();
        l = "";
        m = 1;
        n = "";
        c = com.google.b.p.a();
        o = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if ((d & 1) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(1) + 4);
        }
        i1 = j1;
        if ((d & 2) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(2, f);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                for (j1 = 0; j1 < a.length;)
                {
                    n n1 = a[j1];
                    int k1 = i1;
                    if (n1 != null)
                    {
                        k1 = i1 + CodedOutputByteBufferNano.c(3, n1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if ((d & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, g);
        }
        j1 = i1;
        if ((d & 8) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, h);
        }
        i1 = j1;
        if ((d & 0x10) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, i);
        }
        j1 = i1;
        if ((d & 0x20) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, j);
        }
        i1 = j1;
        if ((d & 0x40) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, k);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                for (j1 = 0; j1 < b.length;)
                {
                    m m1 = b[j1];
                    int l1 = i1;
                    if (m1 != null)
                    {
                        l1 = i1 + CodedOutputByteBufferNano.c(9, m1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if ((d & 0x80) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, l);
        }
        j1 = i1;
        if ((d & 0x100) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(11, m);
        }
        i1 = j1;
        if ((d & 0x200) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, n);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= c.length)
                    {
                        break;
                    }
                    p p1 = c[i2];
                    j1 = i1;
                    if (p1 != null)
                    {
                        j1 = i1 + CodedOutputByteBufferNano.c(13, p1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if ((d & 0x400) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, o);
        }
        return i1;
    }

    public final g mergeFrom(a a1)
    {
_L17:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 15: default 136
    //                   0: 145
    //                   13: 147
    //                   16: 171
    //                   26: 192
    //                   34: 316
    //                   42: 337
    //                   50: 359
    //                   58: 381
    //                   66: 403
    //                   74: 425
    //                   82: 549
    //                   88: 572
    //                   98: 631
    //                   106: 654
    //                   114: 778;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L17; else goto _L2
_L2:
        return this;
_L3:
        e = Float.intBitsToFloat(a1.g());
        d = d | 1;
          goto _L17
_L4:
        f = a1.e();
        d = d | 2;
          goto _L17
_L5:
        int j2 = com.google.protobuf.nano.j.a(a1, 26);
        n an[];
        int j1;
        if (a == null)
        {
            j1 = 0;
        } else
        {
            j1 = a.length;
        }
        an = new n[j2 + j1];
        j2 = j1;
        if (j1 != 0)
        {
            System.arraycopy(a, 0, an, 0, j1);
            j2 = j1;
        }
        for (; j2 < an.length - 1; j2++)
        {
            an[j2] = new n();
            a1.a(an[j2]);
            a1.a();
        }

        an[j2] = new n();
        a1.a(an[j2]);
        a = an;
          goto _L17
_L6:
        g = a1.c();
        d = d | 4;
          goto _L17
_L7:
        h = a1.c();
        d = d | 8;
          goto _L17
_L8:
        i = a1.c();
        d = d | 0x10;
          goto _L17
_L9:
        j = a1.c();
        d = d | 0x20;
          goto _L17
_L10:
        k = a1.c();
        d = d | 0x40;
          goto _L17
_L11:
        int k2 = com.google.protobuf.nano.j.a(a1, 74);
        m am[];
        int k1;
        if (b == null)
        {
            k1 = 0;
        } else
        {
            k1 = b.length;
        }
        am = new m[k2 + k1];
        k2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(b, 0, am, 0, k1);
            k2 = k1;
        }
        for (; k2 < am.length - 1; k2++)
        {
            am[k2] = new m();
            a1.a(am[k2]);
            a1.a();
        }

        am[k2] = new m();
        a1.a(am[k2]);
        b = am;
          goto _L17
_L12:
        l = a1.c();
        d = d | 0x80;
          goto _L17
_L13:
        int l1 = a1.e();
        switch (l1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            m = l1;
            d = d | 0x100;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        n = a1.c();
        d = d | 0x200;
        continue; /* Loop/switch isn't completed */
_L15:
        int l2 = com.google.protobuf.nano.j.a(a1, 106);
        p ap[];
        int i2;
        if (c == null)
        {
            i2 = 0;
        } else
        {
            i2 = c.length;
        }
        ap = new p[l2 + i2];
        l2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(c, 0, ap, 0, i2);
            l2 = i2;
        }
        for (; l2 < ap.length - 1; l2++)
        {
            ap[l2] = new p();
            a1.a(ap[l2]);
            a1.a();
        }

        ap[l2] = new p();
        a1.a(ap[l2]);
        c = ap;
        continue; /* Loop/switch isn't completed */
_L16:
        o = a1.c();
        d = d | 0x400;
        if (true) goto _L17; else goto _L18
_L18:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, e);
        }
        if ((d & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, f);
        }
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                n n1 = a[i1];
                if (n1 != null)
                {
                    codedoutputbytebuffernano.a(3, n1);
                }
            }

        }
        if ((d & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, g);
        }
        if ((d & 8) != 0)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        if ((d & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(6, i);
        }
        if ((d & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(7, j);
        }
        if ((d & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(8, k);
        }
        if (b != null && b.length > 0)
        {
            for (int j1 = 0; j1 < b.length; j1++)
            {
                m m1 = b[j1];
                if (m1 != null)
                {
                    codedoutputbytebuffernano.a(9, m1);
                }
            }

        }
        if ((d & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(10, l);
        }
        if ((d & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(11, m);
        }
        if ((d & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(12, n);
        }
        if (c != null && c.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < c.length; k1++)
            {
                p p1 = c[k1];
                if (p1 != null)
                {
                    codedoutputbytebuffernano.a(13, p1);
                }
            }

        }
        if ((d & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(14, o);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
