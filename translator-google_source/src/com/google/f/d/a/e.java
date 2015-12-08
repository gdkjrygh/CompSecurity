// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.d.a:
//            l

public final class e extends b
{

    private static volatile e h[];
    public String a;
    public l b;
    public com.google.f.b.a.b c;
    public com.google.f.b.a.b d;
    public com.google.f.b.a.b e;
    public com.google.f.b.b.a.b f[];
    public com.google.f.a.e g;
    private int i;
    private String j;
    private String k;
    private float l;
    private boolean m;
    private int n;
    private int o;
    private float p;

    public e()
    {
        i = 0;
        a = "";
        j = "";
        k = "";
        b = null;
        l = 0.0F;
        m = true;
        c = null;
        d = null;
        e = null;
        f = com.google.f.b.b.a.b.a();
        g = null;
        n = 0;
        o = 0;
        p = 0.0F;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static e[] a()
    {
        if (h == null)
        {
            synchronized (f.a)
            {
                if (h == null)
                {
                    h = new e[0];
                }
            }
        }
        return h;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean b()
    {
        return (i & 1) != 0;
    }

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((i & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(1, a);
        }
        j1 = i1;
        if ((i & 8) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(2) + 4);
        }
        int k1 = j1;
        if (d != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.c(3, d);
        }
        i1 = k1;
        if (e != null)
        {
            i1 = k1 + CodedOutputByteBufferNano.c(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                for (j1 = 0; j1 < f.length;)
                {
                    com.google.f.b.b.a.b b1 = f[j1];
                    int l1 = i1;
                    if (b1 != null)
                    {
                        l1 = i1 + CodedOutputByteBufferNano.c(5, b1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(6, g);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(7, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(10, c);
        }
        j1 = i1;
        if ((i & 0x10) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(11) + 1);
        }
        i1 = j1;
        if ((i & 2) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, j);
        }
        j1 = i1;
        if ((i & 4) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, k);
        }
        i1 = j1;
        if ((i & 0x20) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(14, n);
        }
        j1 = i1;
        if ((i & 0x40) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(15, o);
        }
        i1 = j1;
        if ((i & 0x80) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(16) + 4);
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
    //                   10: 147
    //                   21: 168
    //                   26: 193
    //                   34: 222
    //                   42: 251
    //                   50: 375
    //                   58: 404
    //                   82: 433
    //                   88: 462
    //                   98: 484
    //                   106: 505
    //                   112: 526
    //                   120: 670
    //                   133: 692;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        if (super.storeUnknownField(a1, i1)) goto _L17; else goto _L2
_L2:
        return this;
_L3:
        a = a1.c();
        i = i | 1;
          goto _L17
_L4:
        l = Float.intBitsToFloat(a1.g());
        i = i | 8;
          goto _L17
_L5:
        if (d == null)
        {
            d = new com.google.f.b.a.b();
        }
        a1.a(d);
          goto _L17
_L6:
        if (e == null)
        {
            e = new com.google.f.b.a.b();
        }
        a1.a(e);
          goto _L17
_L7:
        int l1 = com.google.protobuf.nano.j.a(a1, 42);
        com.google.f.b.b.a.b ab[];
        int j1;
        if (f == null)
        {
            j1 = 0;
        } else
        {
            j1 = f.length;
        }
        ab = new com.google.f.b.b.a.b[l1 + j1];
        l1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(f, 0, ab, 0, j1);
            l1 = j1;
        }
        for (; l1 < ab.length - 1; l1++)
        {
            ab[l1] = new com.google.f.b.b.a.b();
            a1.a(ab[l1]);
            a1.a();
        }

        ab[l1] = new com.google.f.b.b.a.b();
        a1.a(ab[l1]);
        f = ab;
          goto _L17
_L8:
        if (g == null)
        {
            g = new com.google.f.a.e();
        }
        a1.a(g);
          goto _L17
_L9:
        if (b == null)
        {
            b = new l();
        }
        a1.a(b);
          goto _L17
_L10:
        if (c == null)
        {
            c = new com.google.f.b.a.b();
        }
        a1.a(c);
          goto _L17
_L11:
        m = a1.b();
        i = i | 0x10;
          goto _L17
_L12:
        j = a1.c();
        i = i | 2;
          goto _L17
_L13:
        k = a1.c();
        i = i | 4;
          goto _L17
_L14:
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
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
            n = k1;
            i = i | 0x20;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        o = a1.e();
        i = i | 0x40;
        continue; /* Loop/switch isn't completed */
_L16:
        p = Float.intBitsToFloat(a1.g());
        i = i | 0x80;
        if (true) goto _L17; else goto _L18
_L18:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((i & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if ((i & 8) != 0)
        {
            codedoutputbytebuffernano.a(2, l);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null && f.length > 0)
        {
            for (int i1 = 0; i1 < f.length; i1++)
            {
                com.google.f.b.b.a.b b1 = f[i1];
                if (b1 != null)
                {
                    codedoutputbytebuffernano.a(5, b1);
                }
            }

        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(7, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(10, c);
        }
        if ((i & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(11, m);
        }
        if ((i & 2) != 0)
        {
            codedoutputbytebuffernano.a(12, j);
        }
        if ((i & 4) != 0)
        {
            codedoutputbytebuffernano.a(13, k);
        }
        if ((i & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(14, n);
        }
        if ((i & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(15, o);
        }
        if ((i & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(16, p);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
