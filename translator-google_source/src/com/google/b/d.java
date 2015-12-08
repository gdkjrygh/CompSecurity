// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.b:
//            f

public final class d extends b
{

    private static volatile d c[];
    public com.google.b.f a;
    public com.google.b.f b[];
    private int d;
    private String e;

    public d()
    {
        d = 0;
        a = null;
        e = "";
        b = com.google.b.f.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static d[] a()
    {
        if (c == null)
        {
            synchronized (f.a)
            {
                if (c == null)
                {
                    c = new d[0];
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
        int i = super.computeSerializedSize();
        int k = i;
        if (a != null)
        {
            k = i + CodedOutputByteBufferNano.c(1, a);
        }
        i = k;
        if ((d & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(2, e);
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                for (k = 0; k < b.length;)
                {
                    com.google.b.f f1 = b[k];
                    int l = i;
                    if (f1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(3, f1);
                    }
                    k++;
                    i = l;
                }

                k = i;
            }
        }
        return k;
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
                    a = new com.google.b.f();
                }
                a1.a(a);
                break;

            case 18: // '\022'
                e = a1.c();
                d = d | 1;
                break;

            case 26: // '\032'
                int l = j.a(a1, 26);
                com.google.b.f af[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                af = new com.google.b.f[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, af, 0, k);
                    l = k;
                }
                for (; l < af.length - 1; l++)
                {
                    af[l] = new com.google.b.f();
                    a1.a(af[l]);
                    a1.a();
                }

                af[l] = new com.google.b.f();
                a1.a(af[l]);
                b = af;
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
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                com.google.b.f f1 = b[i];
                if (f1 != null)
                {
                    codedoutputbytebuffernano.a(3, f1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
