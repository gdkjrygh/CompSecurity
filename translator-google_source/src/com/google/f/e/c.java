// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.e;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class c extends b
{

    public static final com.google.protobuf.nano.c a = com.google.protobuf.nano.c.a(com/google/f/e/c, 0x23c762L);
    public static final com.google.protobuf.nano.c b = com.google.protobuf.nano.c.a(com/google/f/e/c, 0x1f002892L);
    private static final c f[] = new c[0];
    public int c;
    public int d;
    public float e;
    private int g;

    public c()
    {
        c = 0;
        d = 0;
        e = 0.0F;
        g = 1;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((c & 2) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(2) + 4);
        }
        j = i;
        if ((c & 1) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(3, d);
        }
        i = j;
        if ((c & 4) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(4, g);
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
    //                   21: 59
    //                   24: 83
    //                   32: 165;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(a1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        e = Float.intBitsToFloat(a1.g());
        c = c | 2;
          goto _L6
_L4:
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
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            d = j;
            c = c | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        g = a1.e();
        c = c | 4;
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, g);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
