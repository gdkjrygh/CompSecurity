// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.c:
//            b

public final class c extends b
{

    private static volatile c b[];
    public com.google.f.c.b a[];
    private int c;
    private int d;
    private int e;
    private float f;

    public c()
    {
        c = 0;
        d = 0;
        e = 0;
        a = com.google.f.c.b.a();
        f = 0.0F;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static c[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new c[0];
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
        int i = super.computeSerializedSize();
        int k = i;
        if ((c & 1) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(1, d);
        }
        i = k;
        if ((c & 2) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(2, e);
        }
        k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                for (k = 0; k < a.length;)
                {
                    com.google.f.c.b b1 = a[k];
                    int l = i;
                    if (b1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(3, b1);
                    }
                    k++;
                    i = l;
                }

                k = i;
            }
        }
        i = k;
        if ((c & 4) != 0)
        {
            i = k + (CodedOutputByteBufferNano.b(4) + 4);
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

            case 8: // '\b'
                d = a1.e();
                c = c | 1;
                break;

            case 16: // '\020'
                e = a1.e();
                c = c | 2;
                break;

            case 26: // '\032'
                int l = j.a(a1, 26);
                com.google.f.c.b ab[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ab = new com.google.f.c.b[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ab, 0, k);
                    l = k;
                }
                for (; l < ab.length - 1; l++)
                {
                    ab[l] = new com.google.f.c.b();
                    a1.a(ab[l]);
                    a1.a();
                }

                ab[l] = new com.google.f.c.b();
                a1.a(ab[l]);
                a = ab;
                break;

            case 37: // '%'
                f = Float.intBitsToFloat(a1.g());
                c = c | 4;
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
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                com.google.f.c.b b1 = a[i];
                if (b1 != null)
                {
                    codedoutputbytebuffernano.a(3, b1);
                }
            }

        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
