// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class ap extends b
{

    private int a;
    private String b;
    private int c;
    private int d;

    public ap()
    {
        a = 0;
        b = "";
        c = 1;
        d = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((a & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(1, b);
        }
        j = i;
        if ((a & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, c);
        }
        i = j;
        if ((a & 4) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(3, d);
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
    //                   10: 59
    //                   16: 80
    //                   24: 141;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(a1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        b = a1.c();
        a = a | 1;
          goto _L6
_L4:
        int j = a1.e();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            c = j;
            a = a | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k = a1.e();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
            d = k;
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
