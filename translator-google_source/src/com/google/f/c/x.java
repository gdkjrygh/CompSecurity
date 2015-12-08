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
//            v

public final class x extends b
{

    private static volatile x b[];
    public v a[];
    private int c;
    private int d;
    private int e;
    private int f;
    private long g;

    public x()
    {
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0L;
        a = com.google.f.c.v.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static x[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new x[0];
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
            i = k + CodedOutputByteBufferNano.d(1, d);
        }
        k = i;
        if ((c & 2) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(2, e);
        }
        int l = k;
        if ((c & 4) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(3, f);
        }
        i = l;
        if ((c & 8) != 0)
        {
            i = l + CodedOutputByteBufferNano.d(4, g);
        }
        k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                for (k = 0; k < a.length;)
                {
                    v v1 = a[k];
                    int i1 = i;
                    if (v1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.c(5, v1);
                    }
                    k++;
                    i = i1;
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

            case 8: // '\b'
                d = a1.e();
                c = c | 1;
                break;

            case 16: // '\020'
                e = a1.e();
                c = c | 2;
                break;

            case 24: // '\030'
                f = a1.e();
                c = c | 4;
                break;

            case 32: // ' '
                g = a1.f();
                c = c | 8;
                break;

            case 42: // '*'
                int l = j.a(a1, 42);
                v av[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                av = new v[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, av, 0, k);
                    l = k;
                }
                for (; l < av.length - 1; l++)
                {
                    av[l] = new v();
                    a1.a(av[l]);
                    a1.a();
                }

                av[l] = new v();
                a1.a(av[l]);
                a = av;
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
        if ((c & 8) != 0)
        {
            codedoutputbytebuffernano.b(4, g);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                v v1 = a[i];
                if (v1 != null)
                {
                    codedoutputbytebuffernano.a(5, v1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
