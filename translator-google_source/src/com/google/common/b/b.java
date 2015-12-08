// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;

public final class b extends com.google.protobuf.nano.b
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public b()
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
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
            j = k + CodedOutputByteBufferNano.d(3, d);
        }
        k = j;
        if ((a & 8) != 0)
        {
            k = j + CodedOutputByteBufferNano.d(4, e);
        }
        j = k;
        if ((a & 0x20) != 0)
        {
            j = k + CodedOutputByteBufferNano.d(5, g);
        }
        k = j;
        if ((a & 0x40) != 0)
        {
            k = j + CodedOutputByteBufferNano.d(6, h);
        }
        j = k;
        if ((a & 0x10) != 0)
        {
            j = k + CodedOutputByteBufferNano.d(7, f);
        }
        k = j;
        if ((a & 0x80) != 0)
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
    //                   8: 99
    //                   16: 165
    //                   24: 186
    //                   32: 253
    //                   40: 318
    //                   48: 386
    //                   56: 454
    //                   64: 522;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(a1, j)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        int k = a1.e();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            b = k;
            a = a | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        c = a1.e();
        a = a | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        int l = a1.e();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            d = l;
            a = a | 4;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = a1.e();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            e = i1;
            a = a | 8;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = a1.e();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            g = j1;
            a = a | 0x20;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int k1 = a1.e();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            h = k1;
            a = a | 0x40;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        int l1 = a1.e();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            f = l1;
            a = a | 0x10;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        int i2 = a1.e();
        switch (i2)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            i = i2;
            a = a | 0x80;
            break;
        }
        if (true) goto _L11; else goto _L12
_L12:
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
        if ((a & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(6, h);
        }
        if ((a & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if ((a & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
