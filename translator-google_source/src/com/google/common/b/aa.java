// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.common.b:
//            av

public final class aa extends b
{

    private static volatile aa d[];
    public int a;
    public String b;
    public av c[];

    public aa()
    {
        a = 0;
        b = "";
        c = com.google.common.b.av.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static aa[] a()
    {
        if (d == null)
        {
            synchronized (f.a)
            {
                if (d == null)
                {
                    d = new aa[0];
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
        int k = super.computeSerializedSize();
        int i = k;
        if ((a & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(1, b);
        }
        k = i;
        if (c != null)
        {
            k = i;
            if (c.length > 0)
            {
                for (k = 0; k < c.length;)
                {
                    av av1 = c[k];
                    int l = i;
                    if (av1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(2, av1);
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
                b = a1.c();
                a = a | 1;
                break;

            case 18: // '\022'
                int l = j.a(a1, 18);
                av aav[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aav = new av[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aav, 0, k);
                    l = k;
                }
                for (; l < aav.length - 1; l++)
                {
                    aav[l] = new av();
                    a1.a(aav[l]);
                    a1.a();
                }

                aav[l] = new av();
                a1.a(aav[l]);
                c = aav;
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
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                av av1 = c[i];
                if (av1 != null)
                {
                    codedoutputbytebuffernano.a(2, av1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
