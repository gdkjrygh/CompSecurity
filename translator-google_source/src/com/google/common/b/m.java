// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.common.b:
//            l, o, n

public final class m extends b
{

    public l a;
    public o b;
    public n c;
    private int d;
    private String e;
    private int f;
    private int g;
    private long h;
    private long i;

    public m()
    {
        d = 0;
        e = "";
        f = 1;
        g = 0;
        a = null;
        b = null;
        c = null;
        h = 0L;
        i = 0L;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if ((d & 1) != 0)
        {
            j = k + CodedOutputByteBufferNano.b(1, e);
        }
        k = j;
        if ((d & 2) != 0)
        {
            k = j + CodedOutputByteBufferNano.d(2, f);
        }
        j = k;
        if ((d & 4) != 0)
        {
            j = k + CodedOutputByteBufferNano.d(3, g);
        }
        k = j;
        if (a != null)
        {
            k = j + CodedOutputByteBufferNano.c(4, a);
        }
        j = k;
        if (b != null)
        {
            j = k + CodedOutputByteBufferNano.c(5, b);
        }
        k = j;
        if (c != null)
        {
            k = j + CodedOutputByteBufferNano.c(6, c);
        }
        j = k;
        if ((d & 8) != 0)
        {
            j = k + CodedOutputByteBufferNano.d(7, h);
        }
        k = j;
        if ((d & 0x10) != 0)
        {
            k = j + CodedOutputByteBufferNano.d(8, i);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L11:
        int j = a1.a();
        j;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   16: 120
    //                   24: 173
    //                   34: 233
    //                   42: 262
    //                   50: 291
    //                   56: 320
    //                   64: 342;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(a1, j)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        e = a1.c();
        d = d | 1;
          goto _L11
_L4:
        int k = a1.e();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            f = k;
            d = d | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = a1.e();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            g = i1;
            d = d | 4;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (a == null)
        {
            a = new l();
        }
        a1.a(a);
        continue; /* Loop/switch isn't completed */
_L7:
        if (b == null)
        {
            b = new o();
        }
        a1.a(b);
        continue; /* Loop/switch isn't completed */
_L8:
        if (c == null)
        {
            c = new n();
        }
        a1.a(c);
        continue; /* Loop/switch isn't completed */
_L9:
        h = a1.f();
        d = d | 8;
        continue; /* Loop/switch isn't completed */
_L10:
        i = a1.f();
        d = d | 0x10;
        if (true) goto _L11; else goto _L12
_L12:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, e);
        }
        if ((d & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, f);
        }
        if ((d & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, g);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(4, a);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(5, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(6, c);
        }
        if ((d & 8) != 0)
        {
            codedoutputbytebuffernano.b(7, h);
        }
        if ((d & 0x10) != 0)
        {
            codedoutputbytebuffernano.b(8, i);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
