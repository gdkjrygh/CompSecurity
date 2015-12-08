// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;

// Referenced classes of package com.google.f.a.a:
//            h

public final class g extends b
{

    private static volatile g b[];
    public h a;
    private int c;
    private String d;

    public g()
    {
        c = 0;
        d = "";
        a = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static g[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new g[0];
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
        int j = super.computeSerializedSize();
        int i = j;
        if ((c & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(1, d);
        }
        j = i;
        if (a != null)
        {
            j = i + CodedOutputByteBufferNano.c(2, a);
        }
        return j;
    }

    public final com.google.protobuf.nano.g mergeFrom(a a1)
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
                d = a1.c();
                c = c | 1;
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new h();
                }
                a1.a(a);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(2, a);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
