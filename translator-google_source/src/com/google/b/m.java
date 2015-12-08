// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.b:
//            n

public final class m extends b
{

    private static volatile m b[];
    public n a;
    private int c;
    private String d;
    private String e;
    private String f;

    public m()
    {
        c = 0;
        d = "";
        e = "";
        f = "";
        a = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static m[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new m[0];
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
        if ((c & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.b(2, e);
        }
        i = j;
        if ((c & 4) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(3, f);
        }
        j = i;
        if (a != null)
        {
            j = i + CodedOutputByteBufferNano.c(5, a);
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
                d = a1.c();
                c = c | 1;
                break;

            case 18: // '\022'
                e = a1.c();
                c = c | 2;
                break;

            case 26: // '\032'
                f = a1.c();
                c = c | 4;
                break;

            case 42: // '*'
                if (a == null)
                {
                    a = new n();
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
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, f);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(5, a);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
