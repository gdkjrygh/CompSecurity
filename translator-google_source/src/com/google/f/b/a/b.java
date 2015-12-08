// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.b.a:
//            c

public final class b extends com.google.protobuf.nano.b
{

    public float a;
    public float b;
    public float c;
    public float d;
    public c e[];
    private int f;
    private String g;
    private String h;
    private String i;
    private String j;
    private int k;

    public b()
    {
        f = 0;
        a = 0.0F;
        b = 0.0F;
        c = 0.0F;
        d = 0.0F;
        e = com.google.f.b.a.c.a();
        g = "";
        h = "";
        i = "";
        j = "";
        k = 1;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int i1 = CodedOutputByteBufferNano.b(1);
        int j1 = CodedOutputByteBufferNano.b(2);
        int l1 = CodedOutputByteBufferNano.b(3);
        l = CodedOutputByteBufferNano.b(4) + 4 + (l + (i1 + 4) + (j1 + 4) + (l1 + 4));
        i1 = l;
        if (e != null)
        {
            i1 = l;
            if (e.length > 0)
            {
                int k1 = 0;
                do
                {
                    i1 = l;
                    if (k1 >= e.length)
                    {
                        break;
                    }
                    c c1 = e[k1];
                    i1 = l;
                    if (c1 != null)
                    {
                        i1 = l + CodedOutputByteBufferNano.b(5, c1);
                    }
                    k1++;
                    l = i1;
                } while (true);
            }
        }
        l = i1;
        if ((f & 1) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(17, g);
        }
        i1 = l;
        if ((f & 2) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.b(18, h);
        }
        l = i1;
        if ((f & 4) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(19, i);
        }
        i1 = l;
        if ((f & 8) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.b(20, j);
        }
        l = i1;
        if ((f & 0x10) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.d(21, k);
        }
        return l;
    }

    public final g mergeFrom(a a1)
    {
_L13:
        int l = a1.a();
        l;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   13: 115
    //                   21: 129
    //                   29: 143
    //                   37: 157
    //                   43: 171
    //                   138: 297
    //                   146: 318
    //                   154: 339
    //                   162: 360
    //                   168: 382;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.storeUnknownField(a1, l)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        a = Float.intBitsToFloat(a1.g());
          goto _L13
_L4:
        b = Float.intBitsToFloat(a1.g());
          goto _L13
_L5:
        c = Float.intBitsToFloat(a1.g());
          goto _L13
_L6:
        d = Float.intBitsToFloat(a1.g());
          goto _L13
_L7:
        int k1 = com.google.protobuf.nano.j.a(a1, 43);
        c ac[];
        int i1;
        if (e == null)
        {
            i1 = 0;
        } else
        {
            i1 = e.length;
        }
        ac = new c[k1 + i1];
        k1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(e, 0, ac, 0, i1);
            k1 = i1;
        }
        for (; k1 < ac.length - 1; k1++)
        {
            ac[k1] = new c();
            a1.a(ac[k1], 5);
            a1.a();
        }

        ac[k1] = new c();
        a1.a(ac[k1], 5);
        e = ac;
          goto _L13
_L8:
        g = a1.c();
        f = f | 1;
          goto _L13
_L9:
        h = a1.c();
        f = f | 2;
          goto _L13
_L10:
        i = a1.c();
        f = f | 4;
          goto _L13
_L11:
        j = a1.c();
        f = f | 8;
          goto _L13
_L12:
        int j1 = a1.e();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            k = j1;
            f = f | 0x10;
            break;
        }
        if (true) goto _L13; else goto _L14
_L14:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.a(1, a);
        codedoutputbytebuffernano.a(2, b);
        codedoutputbytebuffernano.a(3, c);
        codedoutputbytebuffernano.a(4, d);
        if (e != null && e.length > 0)
        {
            for (int l = 0; l < e.length; l++)
            {
                c c1 = e[l];
                if (c1 != null)
                {
                    codedoutputbytebuffernano.f(5, 3);
                    c1.writeTo(codedoutputbytebuffernano);
                    codedoutputbytebuffernano.f(5, 4);
                }
            }

        }
        if ((f & 1) != 0)
        {
            codedoutputbytebuffernano.a(17, g);
        }
        if ((f & 2) != 0)
        {
            codedoutputbytebuffernano.a(18, h);
        }
        if ((f & 4) != 0)
        {
            codedoutputbytebuffernano.a(19, i);
        }
        if ((f & 8) != 0)
        {
            codedoutputbytebuffernano.a(20, j);
        }
        if ((f & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(21, k);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
