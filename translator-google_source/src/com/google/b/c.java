// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.b:
//            d

public final class c extends b
{

    public d a[];

    public c()
    {
        a = com.google.b.d.a();
        unknownFieldData = null;
        cachedSize = -1;
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
                    d d1 = a[k];
                    l = i;
                    if (d1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(2, d1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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

            case 18: // '\022'
                int l = j.a(a1, 18);
                d ad[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ad = new d[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ad, 0, k);
                    l = k;
                }
                for (; l < ad.length - 1; l++)
                {
                    ad[l] = new d();
                    a1.a(ad[l]);
                    a1.a();
                }

                ad[l] = new d();
                a1.a(ad[l]);
                a = ad;
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
                d d1 = a[i];
                if (d1 != null)
                {
                    codedoutputbytebuffernano.a(2, d1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
