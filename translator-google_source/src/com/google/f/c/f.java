// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.c:
//            g

public final class f extends b
{

    private static volatile f b[];
    public com.google.f.c.g a;
    private int c;
    private byte d[];
    private float e;
    private int f;

    public f()
    {
        c = 0;
        d = j.h;
        e = 0.0F;
        f = 0;
        a = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static f[] a()
    {
        if (b == null)
        {
            synchronized (com.google.protobuf.nano.f.a)
            {
                if (b == null)
                {
                    b = new f[0];
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
        int k = super.computeSerializedSize();
        int i = k;
        if ((c & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(1, d);
        }
        k = i;
        if ((c & 2) != 0)
        {
            k = i + (CodedOutputByteBufferNano.b(3) + 4);
        }
        i = k;
        if ((c & 4) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(4, f);
        }
        k = i;
        if (a != null)
        {
            k = i + CodedOutputByteBufferNano.c(5, a);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
_L7:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   10: 67
    //                   29: 88
    //                   32: 112
    //                   42: 193;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(a1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        d = a1.d();
        c = c | 1;
          goto _L7
_L4:
        e = Float.intBitsToFloat(a1.g());
        c = c | 2;
          goto _L7
_L5:
        int k = a1.e();
        switch (k)
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
            f = k;
            c = c | 4;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (a == null)
        {
            a = new com.google.f.c.g();
        }
        a1.a(a);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(5, a);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
