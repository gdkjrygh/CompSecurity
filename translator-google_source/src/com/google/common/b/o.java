// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class o extends b
{

    private int a;
    private int b;
    private int c;

    public o()
    {
        a = 0;
        b = 0;
        c = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((a & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(1, b);
        }
        j = i;
        if ((a & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, c);
        }
        return j;
    }

    public final g mergeFrom(a a1)
    {
_L5:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   16: 121;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(a1, i)) goto _L5; else goto _L2
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
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            b = j;
            a = a | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = a1.e();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            c = k;
            a = a | 2;
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
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
        super.writeTo(codedoutputbytebuffernano);
    }
}
