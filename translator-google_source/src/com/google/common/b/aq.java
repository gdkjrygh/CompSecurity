// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class aq extends b
{

    private int a;
    private int b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public aq()
    {
        a = 0;
        b = 1;
        c = false;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if ((a & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(1, b);
        }
        l = k;
        if ((a & 2) != 0)
        {
            l = k + (CodedOutputByteBufferNano.b(2) + 1);
        }
        k = l;
        if ((a & 4) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(3, d);
        }
        l = k;
        if ((a & 8) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(4, e);
        }
        k = l;
        if ((a & 0x10) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(5, f);
        }
        l = k;
        if ((a & 0x20) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(6, g);
        }
        k = l;
        if ((a & 0x40) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(7, h);
        }
        l = k;
        if ((a & 0x80) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(8, i);
        }
        k = l;
        if ((a & 0x100) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(9, j);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L12:
        int k = a1.a();
        k;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   16: 165
    //                   24: 186
    //                   32: 207
    //                   40: 229
    //                   48: 251
    //                   56: 273
    //                   64: 295
    //                   72: 318;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.storeUnknownField(a1, k)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int l = a1.e();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            b = l;
            a = a | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = a1.b();
        a = a | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        d = a1.e();
        a = a | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        e = a1.e();
        a = a | 8;
        continue; /* Loop/switch isn't completed */
_L7:
        f = a1.e();
        a = a | 0x10;
        continue; /* Loop/switch isn't completed */
_L8:
        g = a1.e();
        a = a | 0x20;
        continue; /* Loop/switch isn't completed */
_L9:
        h = a1.e();
        a = a | 0x40;
        continue; /* Loop/switch isn't completed */
_L10:
        i = a1.e();
        a = a | 0x80;
        continue; /* Loop/switch isn't completed */
_L11:
        j = a1.e();
        a = a | 0x100;
        if (true) goto _L12; else goto _L13
_L13:
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
        if ((a & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if ((a & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if ((a & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if ((a & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
