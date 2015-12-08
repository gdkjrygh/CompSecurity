// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class i extends b
{

    private int a;
    private int b;
    private int c;
    private String d;
    private int e;

    public i()
    {
        a = 0;
        b = 1;
        c = 1;
        d = "";
        e = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if ((a & 1) != 0)
        {
            j = k + CodedOutputByteBufferNano.d(1, b);
        }
        k = j;
        if ((a & 2) != 0)
        {
            k = j + CodedOutputByteBufferNano.d(2, c);
        }
        j = k;
        if ((a & 4) != 0)
        {
            j = k + CodedOutputByteBufferNano.b(3, d);
        }
        k = j;
        if ((a & 8) != 0)
        {
            k = j + CodedOutputByteBufferNano.d(4, e);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L7:
        int j = a1.a();
        j;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 121
    //                   26: 185
    //                   32: 206;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(a1, j)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int k = a1.e();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            b = k;
            a = a | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = a1.e();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            c = l;
            a = a | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        d = a1.c();
        a = a | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        e = a1.e();
        a = a | 8;
        if (true) goto _L7; else goto _L8
_L8:
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
        if ((a & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
