// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class e extends b
{

    private int a;
    private int b;
    private int c;
    private int d;
    private String e;
    private boolean f;
    private int g;

    public e()
    {
        a = 0;
        b = 1;
        c = 0;
        d = 0;
        e = "";
        f = false;
        g = 0;
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
        i = j;
        if ((a & 4) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(3, d);
        }
        j = i;
        if ((a & 8) != 0)
        {
            j = i + CodedOutputByteBufferNano.b(4, e);
        }
        i = j;
        if ((a & 0x20) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(5, g);
        }
        j = i;
        if ((a & 0x10) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(6) + 1);
        }
        return j;
    }

    public final g mergeFrom(a a1)
    {
_L9:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   16: 145
    //                   24: 166
    //                   34: 187
    //                   40: 209
    //                   48: 231;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(a1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = a1.e();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            b = j;
            a = a | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = a1.e();
        a = a | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        d = a1.e();
        a = a | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        e = a1.c();
        a = a | 8;
        continue; /* Loop/switch isn't completed */
_L7:
        g = a1.e();
        a = a | 0x20;
        continue; /* Loop/switch isn't completed */
_L8:
        f = a1.b();
        a = a | 0x10;
        if (true) goto _L9; else goto _L10
_L10:
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
        if ((a & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(5, g);
        }
        if ((a & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(6, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
