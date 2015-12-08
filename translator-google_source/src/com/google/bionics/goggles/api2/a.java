// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.bionics.goggles.api2:
//            c

public final class a extends b
{

    private static volatile a b[];
    public c a[];

    public a()
    {
        a = c.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static a[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new a[0];
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
        int l = i;
        if (a != null)
        {
            l = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    c c1 = a[k];
                    l = i;
                    if (c1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(1, c1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final g mergeFrom(com.google.protobuf.nano.a a1)
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
                int l = j.a(a1, 10);
                c ac[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ac = new c[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ac, 0, k);
                    l = k;
                }
                for (; l < ac.length - 1; l++)
                {
                    ac[l] = new c();
                    a1.a(ac[l]);
                    a1.a();
                }

                ac[l] = new c();
                a1.a(ac[l]);
                a = ac;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                c c1 = a[i];
                if (c1 != null)
                {
                    codedoutputbytebuffernano.a(1, c1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
