// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.f.d.a:
//            l

public final class f extends b
{

    private static volatile f e[];
    public int a;
    public String b;
    public double c;
    public l d;

    public f()
    {
        a = 0;
        b = "";
        c = 0.0D;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static f[] a()
    {
        if (e == null)
        {
            synchronized (com.google.protobuf.nano.f.a)
            {
                if (e == null)
                {
                    e = new f[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((a & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(1, b);
        }
        j = i;
        if ((a & 2) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(2) + 8);
        }
        i = j;
        if (d != null)
        {
            i = j + CodedOutputByteBufferNano.c(3, d);
        }
        return i;
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
                b = a1.c();
                a = a | 1;
                break;

            case 17: // '\021'
                c = Double.longBitsToDouble(a1.h());
                a = a | 2;
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new l();
                }
                a1.a(d);
                break;
            }
        } while (true);
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
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
