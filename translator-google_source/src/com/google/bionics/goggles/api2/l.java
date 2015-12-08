// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class l extends b
{

    public int a;
    public int b;
    public byte c[];
    private int d;

    public l()
    {
        a = 0;
        b = 1;
        c = j.h;
        d = 1;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if ((a & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(1, b);
        }
        k = i;
        if ((a & 2) != 0)
        {
            k = i + CodedOutputByteBufferNano.b(2, c);
        }
        i = k;
        if ((a & 4) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(3, d);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L6:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 109
    //                   24: 130;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(a1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int k = a1.e();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
            b = k;
            a = a | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = a1.d();
        a = a | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = a1.e();
        switch (i1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = i1;
            a = a | 4;
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if ((a & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if ((a & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
