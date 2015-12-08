// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.e.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.e.a.a.a:
//            d, c

public final class b extends com.google.protobuf.nano.b
{

    public d a[];
    public c b[];
    private int c;
    private long d;
    private int e;
    private int f;
    private boolean g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private long n;
    private long o;
    private int p;
    private int q;

    public b()
    {
        c = 0;
        d = 0L;
        e = 0;
        f = 0;
        g = false;
        h = 0;
        i = 0;
        j = false;
        k = false;
        l = false;
        m = 0;
        n = 0L;
        o = 0L;
        p = 0;
        q = 0;
        a = com.google.e.a.a.a.d.a();
        b = com.google.e.a.a.a.c.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((c & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(1, d);
        }
        j1 = i1;
        if ((c & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(2, e);
        }
        i1 = j1;
        if ((c & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(3, f);
        }
        j1 = i1;
        if ((c & 0x10) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(4, h);
        }
        i1 = j1;
        if ((c & 0x20) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(5, i);
        }
        j1 = i1;
        if ((c & 0x200) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(6, m);
        }
        int k1 = j1;
        if ((c & 0x400) != 0)
        {
            k1 = j1 + CodedOutputByteBufferNano.d(7, n);
        }
        i1 = k1;
        if ((c & 0x2000) != 0)
        {
            i1 = k1 + CodedOutputByteBufferNano.d(8, q);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                for (j1 = 0; j1 < a.length;)
                {
                    d d1 = a[j1];
                    k1 = i1;
                    if (d1 != null)
                    {
                        k1 = i1 + CodedOutputByteBufferNano.c(9, d1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        k1 = j1;
        if ((c & 0x1000) != 0)
        {
            k1 = j1 + CodedOutputByteBufferNano.d(10, p);
        }
        i1 = k1;
        if ((c & 8) != 0)
        {
            i1 = k1 + (CodedOutputByteBufferNano.b(11) + 1);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= b.length)
                    {
                        break;
                    }
                    c c1 = b[l1];
                    j1 = i1;
                    if (c1 != null)
                    {
                        j1 = i1 + CodedOutputByteBufferNano.c(12, c1);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if ((c & 0x800) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(13, o);
        }
        j1 = i1;
        if ((c & 0x40) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(14) + 1);
        }
        i1 = j1;
        if ((c & 0x80) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(15) + 1);
        }
        j1 = i1;
        if ((c & 0x100) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(16) + 1);
        }
        return j1;
    }

    public final g mergeFrom(a a1)
    {
_L19:
        int i1 = a1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   8: 163
    //                   16: 184
    //                   24: 205
    //                   32: 226
    //                   40: 248
    //                   48: 270
    //                   56: 293
    //                   64: 316
    //                   74: 383
    //                   80: 507
    //                   88: 603
    //                   98: 625
    //                   104: 749
    //                   112: 772
    //                   120: 794
    //                   128: 817;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        d = a1.f();
        c = c | 1;
          goto _L19
_L4:
        e = a1.e();
        c = c | 2;
          goto _L19
_L5:
        f = a1.e();
        c = c | 4;
          goto _L19
_L6:
        h = a1.e();
        c = c | 0x10;
          goto _L19
_L7:
        i = a1.e();
        c = c | 0x20;
          goto _L19
_L8:
        m = a1.e();
        c = c | 0x200;
          goto _L19
_L9:
        n = a1.f();
        c = c | 0x400;
          goto _L19
_L10:
        int j1 = a1.e();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            q = j1;
            c = c | 0x2000;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        int j2 = com.google.protobuf.nano.j.a(a1, 74);
        d ad[];
        int k1;
        if (a == null)
        {
            k1 = 0;
        } else
        {
            k1 = a.length;
        }
        ad = new d[j2 + k1];
        j2 = k1;
        if (k1 != 0)
        {
            System.arraycopy(a, 0, ad, 0, k1);
            j2 = k1;
        }
        for (; j2 < ad.length - 1; j2++)
        {
            ad[j2] = new d();
            a1.a(ad[j2]);
            a1.a();
        }

        ad[j2] = new d();
        a1.a(ad[j2]);
        a = ad;
        continue; /* Loop/switch isn't completed */
_L12:
        int l1 = a1.e();
        switch (l1)
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
            p = l1;
            c = c | 0x1000;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        g = a1.b();
        c = c | 8;
        continue; /* Loop/switch isn't completed */
_L14:
        int k2 = com.google.protobuf.nano.j.a(a1, 98);
        c ac[];
        int i2;
        if (b == null)
        {
            i2 = 0;
        } else
        {
            i2 = b.length;
        }
        ac = new c[k2 + i2];
        k2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(b, 0, ac, 0, i2);
            k2 = i2;
        }
        for (; k2 < ac.length - 1; k2++)
        {
            ac[k2] = new c();
            a1.a(ac[k2]);
            a1.a();
        }

        ac[k2] = new c();
        a1.a(ac[k2]);
        b = ac;
        continue; /* Loop/switch isn't completed */
_L15:
        o = a1.f();
        c = c | 0x800;
        continue; /* Loop/switch isn't completed */
_L16:
        j = a1.b();
        c = c | 0x40;
        continue; /* Loop/switch isn't completed */
_L17:
        k = a1.b();
        c = c | 0x80;
        continue; /* Loop/switch isn't completed */
_L18:
        l = a1.b();
        c = c | 0x100;
        if (true) goto _L19; else goto _L20
_L20:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.b(1, d);
        }
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, f);
        }
        if ((c & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(4, h);
        }
        if ((c & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(5, i);
        }
        if ((c & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(6, m);
        }
        if ((c & 0x400) != 0)
        {
            codedoutputbytebuffernano.b(7, n);
        }
        if ((c & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(8, q);
        }
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                d d1 = a[i1];
                if (d1 != null)
                {
                    codedoutputbytebuffernano.a(9, d1);
                }
            }

        }
        if ((c & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(10, p);
        }
        if ((c & 8) != 0)
        {
            codedoutputbytebuffernano.a(11, g);
        }
        if (b != null && b.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < b.length; j1++)
            {
                c c1 = b[j1];
                if (c1 != null)
                {
                    codedoutputbytebuffernano.a(12, c1);
                }
            }

        }
        if ((c & 0x800) != 0)
        {
            codedoutputbytebuffernano.b(13, o);
        }
        if ((c & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(14, j);
        }
        if ((c & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(15, k);
        }
        if ((c & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(16, l);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
