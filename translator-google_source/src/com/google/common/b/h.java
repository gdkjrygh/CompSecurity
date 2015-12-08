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
//            f, g

public final class h extends b
{

    public int a[];
    public com.google.common.b.g b;
    public f c[];
    private int d;
    private String e;
    private long f;
    private int g;
    private long h;
    private boolean i;

    public h()
    {
        d = 0;
        e = "";
        f = 0L;
        a = j.a;
        b = null;
        c = com.google.common.b.f.a();
        g = 0;
        h = 0L;
        i = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int k = super.computeSerializedSize();
        int l = k;
        if ((d & 1) != 0)
        {
            l = k + CodedOutputByteBufferNano.b(1, e);
        }
        k = l;
        if ((d & 2) != 0)
        {
            k = l + CodedOutputByteBufferNano.c(2, f);
        }
        l = k;
        if (a != null)
        {
            l = k;
            if (a.length > 0)
            {
                l = 0;
                int i1 = 0;
                for (; l < a.length; l++)
                {
                    i1 += CodedOutputByteBufferNano.a(a[l]);
                }

                l = k + i1 + a.length * 1;
            }
        }
        k = l;
        if (b != null)
        {
            k = l + CodedOutputByteBufferNano.c(4, b);
        }
        l = k;
        if (c != null)
        {
            l = k;
            if (c.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    l = k;
                    if (j1 >= c.length)
                    {
                        break;
                    }
                    f f1 = c[j1];
                    l = k;
                    if (f1 != null)
                    {
                        l = k + CodedOutputByteBufferNano.c(5, f1);
                    }
                    j1++;
                    k = l;
                } while (true);
            }
        }
        k = l;
        if ((d & 4) != 0)
        {
            k = l + CodedOutputByteBufferNano.e(6, g);
        }
        l = k;
        if ((d & 8) != 0)
        {
            l = k + CodedOutputByteBufferNano.c(7, h);
        }
        k = l;
        if ((d & 0x10) != 0)
        {
            k = l + (CodedOutputByteBufferNano.b(8) + 1);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L26:
        int k = a1.a();
        k;
        JVM INSTR lookupswitch 10: default 100
    //                   0: 110
    //                   10: 112
    //                   16: 133
    //                   24: 154
    //                   26: 336
    //                   34: 534
    //                   42: 563
    //                   48: 694
    //                   56: 715
    //                   64: 737;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(a1, k))
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return this;
_L3:
        e = a1.c();
        d = d | 1;
        continue; /* Loop/switch isn't completed */
_L4:
        f = a1.f();
        d = d | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        int ai[];
        int i1;
        int i2;
        i2 = j.a(a1, 24);
        ai = new int[i2];
        i1 = 0;
        k = 0;
_L18:
        if (i1 >= i2) goto _L13; else goto _L12
_L12:
        int j2;
        if (i1 != 0)
        {
            a1.a();
        }
        j2 = a1.e();
        j2;
        JVM INSTR tableswitch 0 1: default 220
    //                   0 229
    //                   1 229;
           goto _L14 _L15 _L15
_L14:
        i1++;
          goto _L16
_L15:
        int k1 = k + 1;
        ai[k] = j2;
        k = k1;
        if (true) goto _L14; else goto _L16
_L16:
        if (true) goto _L18; else goto _L17
_L17:
_L13:
        if (k != 0)
        {
            if (a == null)
            {
                i1 = 0;
            } else
            {
                i1 = a.length;
            }
            if (i1 == 0 && k == ai.length)
            {
                a = ai;
            } else
            {
                int ai1[] = new int[i1 + k];
                if (i1 != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, i1);
                }
                System.arraycopy(ai, 0, ai1, i1, k);
                a = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int l1;
        l1 = a1.c(a1.e());
        k = a1.j();
        i1 = 0;
_L24:
        if (a1.i() > 0)
        {
            switch (a1.e())
            {
            case 0: // '\0'
            case 1: // '\001'
                i1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 0) goto _L20; else goto _L19
_L19:
        a1.e(k);
        if (a == null)
        {
            k = 0;
        } else
        {
            k = a.length;
        }
        ai = new int[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(a, 0, ai, 0, k);
            i1 = k;
        }
_L22:
        if (a1.i() > 0)
        {
            k = a1.e();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
                ai[i1] = k;
                i1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        a = ai;
          goto _L20
        if (true) goto _L22; else goto _L21
_L21:
        if (true) goto _L24; else goto _L23
_L23:
_L20:
        a1.d(l1);
        continue; /* Loop/switch isn't completed */
_L7:
        if (b == null)
        {
            b = new com.google.common.b.g();
        }
        a1.a(b);
        continue; /* Loop/switch isn't completed */
_L8:
        int j1 = j.a(a1, 42);
        f af[];
        int l;
        if (c == null)
        {
            l = 0;
        } else
        {
            l = c.length;
        }
        af = new f[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(c, 0, af, 0, l);
            j1 = l;
        }
        for (; j1 < af.length - 1; j1++)
        {
            af[j1] = new f();
            a1.a(af[j1]);
            a1.a();
        }

        af[j1] = new f();
        a1.a(af[j1]);
        c = af;
        continue; /* Loop/switch isn't completed */
_L9:
        g = a1.e();
        d = d | 4;
        continue; /* Loop/switch isn't completed */
_L10:
        h = a1.f();
        d = d | 8;
        continue; /* Loop/switch isn't completed */
_L11:
        i = a1.b();
        d = d | 0x10;
        if (true) goto _L26; else goto _L25
_L25:
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
            for (int k = 0; k < a.length; k++)
            {
                codedoutputbytebuffernano.a(3, a[k]);
            }

        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(4, b);
        }
        if (c != null && c.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < c.length; l++)
            {
                f f1 = c[l];
                if (f1 != null)
                {
                    codedoutputbytebuffernano.a(5, f1);
                }
            }

        }
        if ((d & 4) != 0)
        {
            codedoutputbytebuffernano.c(6, g);
        }
        if ((d & 8) != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if ((d & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
