// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class d extends b
{

    public int a;
    private int b;
    private long c;
    private long d;
    private int e;
    private long f;

    public d()
    {
        b = 0;
        a = 0;
        c = 0L;
        d = 0L;
        e = 1;
        f = 0L;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((b & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(1, a);
        }
        j = i;
        if ((b & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, c);
        }
        i = j;
        if ((b & 4) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(3, d);
        }
        j = i;
        if ((b & 8) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(4, e);
        }
        i = j;
        if ((b & 0x10) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(5, f);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L8:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 6: default 64
    //                   0: 73
    //                   8: 75
    //                   16: 133
    //                   24: 154
    //                   32: 175
    //                   40: 230;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(a1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        int j = a1.e();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = j;
            b = b | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = a1.f();
        b = b | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        d = a1.f();
        b = b | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        int k = a1.e();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            e = k;
            b = b | 8;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        f = a1.f();
        b = b | 0x10;
        if (true) goto _L8; else goto _L9
_L9:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.b(2, c);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.b(3, d);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.b(5, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
