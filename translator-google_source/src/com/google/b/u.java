// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class u extends b
{

    private static volatile u b[];
    public String a;
    private int c;
    private String d;
    private int e;
    private boolean f;

    public u()
    {
        c = 0;
        a = "";
        d = "";
        e = 0;
        f = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static u[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new u[0];
                }
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize() + CodedOutputByteBufferNano.b(1, a);
        int i = j;
        if ((c & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(2, d);
        }
        j = i;
        if ((c & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(3, e);
        }
        i = j;
        if ((c & 4) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(4) + 1);
        }
        return i;
    }

    public final g mergeFrom(a a1)
    {
_L7:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   18: 78
    //                   24: 99
    //                   32: 197;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(a1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        a = a1.c();
          goto _L7
_L4:
        d = a1.c();
        c = c | 1;
          goto _L7
_L5:
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
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
            e = j;
            c = c | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        f = a1.b();
        c = c | 4;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.a(1, a);
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(2, d);
        }
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
