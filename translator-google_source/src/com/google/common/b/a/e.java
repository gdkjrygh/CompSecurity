// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class e extends b
{

    private int a;
    private String b;
    private int c;
    private int d;
    private boolean e;
    private int f;

    public e()
    {
        a = 0;
        b = "";
        c = 0;
        d = 0;
        e = false;
        f = 0;
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
        j = i;
        if ((a & 8) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(4) + 1);
        }
        i = j;
        if ((a & 0x10) != 0)
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
    //                   10: 75
    //                   16: 96
    //                   24: 149
    //                   32: 201
    //                   40: 223;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        if (super.storeUnknownField(a1, i)) goto _L8; else goto _L2
_L2:
        return this;
_L3:
        b = a1.c();
        a = a | 1;
          goto _L8
_L4:
        int j = a1.e();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
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
        case 2: // '\002'
            d = k;
            a = a | 4;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        e = a1.b();
        a = a | 8;
        continue; /* Loop/switch isn't completed */
_L7:
        f = a1.e();
        a = a | 0x10;
        if (true) goto _L8; else goto _L9
_L9:
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
        if ((a & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
