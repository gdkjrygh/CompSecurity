// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.f.d.a:
//            j, g

public final class i extends b
{

    public int a;
    public j b;
    public com.google.f.d.a.g c;
    public j d;
    public j e;
    private int f;
    private int g;
    private long h;

    public i()
    {
        f = 0;
        a = 0;
        g = 0;
        b = null;
        c = null;
        d = null;
        e = null;
        h = 0L;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if ((f & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(1, a);
        }
        l = k;
        if ((f & 2) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(2, g);
        }
        k = l;
        if (b != null)
        {
            k = l + CodedOutputByteBufferNano.c(3, b);
        }
        l = k;
        if (c != null)
        {
            l = k + CodedOutputByteBufferNano.c(4, c);
        }
        k = l;
        if (d != null)
        {
            k = l + CodedOutputByteBufferNano.c(5, d);
        }
        l = k;
        if ((f & 4) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(6, h);
        }
        k = l;
        if (e != null)
        {
            k = l + CodedOutputByteBufferNano.c(7, e);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L10:
        int k = a1.a();
        k;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   8: 91
    //                   16: 149
    //                   26: 209
    //                   34: 238
    //                   42: 267
    //                   48: 296
    //                   58: 317;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(a1, k)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        int l = a1.e();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = l;
            f = f | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int i1 = a1.e();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            g = i1;
            f = f | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (b == null)
        {
            b = new j();
        }
        a1.a(b);
        continue; /* Loop/switch isn't completed */
_L6:
        if (c == null)
        {
            c = new com.google.f.d.a.g();
        }
        a1.a(c);
        continue; /* Loop/switch isn't completed */
_L7:
        if (d == null)
        {
            d = new j();
        }
        a1.a(d);
        continue; /* Loop/switch isn't completed */
_L8:
        h = a1.f();
        f = f | 4;
        continue; /* Loop/switch isn't completed */
_L9:
        if (e == null)
        {
            e = new j();
        }
        a1.a(e);
        if (true) goto _L10; else goto _L11
_L11:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((f & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if ((f & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, g);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(3, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(4, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if ((f & 4) != 0)
        {
            codedoutputbytebuffernano.b(6, h);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(7, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
