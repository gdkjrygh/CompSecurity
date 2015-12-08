// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class l extends b
{

    public c.b a[];

    public l()
    {
        a = c.b.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int i1 = i;
        if (a != null)
        {
            i1 = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    c.b b1 = a[k];
                    i1 = i;
                    if (b1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.c(1, b1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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
                int i1 = j.a(a1, 10);
                c.b ab[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ab = new c.b[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ab, 0, k);
                    i1 = k;
                }
                for (; i1 < ab.length - 1; i1++)
                {
                    ab[i1] = new c.b();
                    a1.a(ab[i1]);
                    a1.a();
                }

                ab[i1] = new c.b();
                a1.a(ab[i1]);
                a = ab;
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
                c.b b1 = a[i];
                if (b1 != null)
                {
                    codedoutputbytebuffernano.a(1, b1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
