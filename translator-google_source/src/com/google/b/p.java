// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class p extends b
{

    private static volatile p a[];
    private int b;
    private int c;
    private String d;
    private String e;
    private int f;

    public p()
    {
        b = 0;
        c = 0;
        d = "";
        e = "";
        f = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static p[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new p[0];
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
            j = i + CodedOutputByteBufferNano.b(2, d);
        }
        i = j;
        if ((b & 8) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(3, f);
        }
        j = i;
        if ((b & 4) != 0)
        {
            j = i + CodedOutputByteBufferNano.b(4, e);
        }
        return j;
    }

    public final g mergeFrom(a a1)
    {
_L7:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   18: 117
    //                   24: 138
    //                   34: 160;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(a1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = a1.e();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
            c = j;
            b = b | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        d = a1.c();
        b = b | 2;
        continue; /* Loop/switch isn't completed */
_L5:
        f = a1.e();
        b = b | 8;
        continue; /* Loop/switch isn't completed */
_L6:
        e = a1.c();
        b = b | 4;
        if (true) goto _L7; else goto _L8
_L8:
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
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(3, f);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
