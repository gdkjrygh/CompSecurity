// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class z extends b
{

    private static volatile z a[];
    private int b;
    private int c;

    public z()
    {
        b = 0;
        c = 1;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static z[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new z[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((b & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(1, c);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L4:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 2: default 32
    //                   0: 41
    //                   8: 43;
           goto _L1 _L2 _L3
_L1:
        if (super.storeUnknownField(a1, i)) goto _L4; else goto _L2
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
        case 6: // '\006'
        case 7: // '\007'
        case 100: // 'd'
            c = j;
            b = b | 1;
            break;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
