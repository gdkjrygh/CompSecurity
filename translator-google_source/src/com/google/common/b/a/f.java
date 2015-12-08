// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.common.b.a:
//            t, b

public final class f extends b
{

    private static volatile f c[];
    public t a;
    public com.google.common.b.a.b b;

    public f()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static f[] a()
    {
        if (c == null)
        {
            synchronized (com.google.protobuf.nano.f.a)
            {
                if (c == null)
                {
                    c = new f[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + CodedOutputByteBufferNano.c(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + CodedOutputByteBufferNano.c(2, b);
        }
        return j;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int i = a1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new t();
                }
                a1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new com.google.common.b.a.b();
                }
                a1.a(b);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (a != null)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
