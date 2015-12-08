// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.a:
//            b

public final class d extends b
{

    private static volatile d d[];
    public int a;
    public int b;
    public com.google.f.a.b c[];
    private int e;
    private float f;

    public d()
    {
        e = 0;
        a = 0;
        b = 0;
        c = com.google.f.a.b.a();
        f = 0.0F;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static d[] a()
    {
        if (d == null)
        {
            synchronized (f.a)
            {
                if (d == null)
                {
                    d = new d[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = CodedOutputByteBufferNano.d(1, a);
        i = CodedOutputByteBufferNano.d(2, b) + (i + k);
        k = i;
        if (c != null)
        {
            k = i;
            if (c.length > 0)
            {
                int l = 0;
                do
                {
                    k = i;
                    if (l >= c.length)
                    {
                        break;
                    }
                    com.google.f.a.b b1 = c[l];
                    k = i;
                    if (b1 != null)
                    {
                        k = i + CodedOutputByteBufferNano.c(3, b1);
                    }
                    l++;
                    i = k;
                } while (true);
            }
        }
        i = k;
        if ((e & 1) != 0)
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
                a = a1.e();
                break;

            case 16: // '\020'
                b = a1.e();
                break;

            case 26: // '\032'
                int l = j.a(a1, 26);
                com.google.f.a.b ab[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ab = new com.google.f.a.b[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ab, 0, k);
                    l = k;
                }
                for (; l < ab.length - 1; l++)
                {
                    ab[l] = new com.google.f.a.b();
                    a1.a(ab[l]);
                    a1.a();
                }

                ab[l] = new com.google.f.a.b();
                a1.a(ab[l]);
                c = ab;
                break;

            case 37: // '%'
                f = Float.intBitsToFloat(a1.g());
                e = e | 1;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.a(1, a);
        codedoutputbytebuffernano.a(2, b);
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                com.google.f.a.b b1 = c[i];
                if (b1 != null)
                {
                    codedoutputbytebuffernano.a(3, b1);
                }
            }

        }
        if ((e & 1) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
