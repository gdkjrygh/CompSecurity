// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class y extends b
{

    private static volatile y a[];
    private int b;
    private int c;
    private int d;

    public y()
    {
        b = 0;
        c = 1;
        d = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static y[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new y[0];
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
        j = i;
        if ((b & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, d);
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
    //                   16: 125;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(a1, i)) goto _L5; else goto _L2
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
        case 8: // '\b'
            c = j;
            b = b | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        d = a1.e();
        b = b | 2;
        if (true) goto _L5; else goto _L6
_L6:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, d);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
