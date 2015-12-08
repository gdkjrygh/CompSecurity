// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.a:
//            d

public final class e extends b
{

    public d a[];
    public int b;
    private int c;
    private int d;

    public e()
    {
        c = 0;
        a = com.google.f.a.d.a();
        b = 0;
        d = 0;
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
                    d d1 = a[k];
                    i1 = i;
                    if (d1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.c(1, d1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        int l = CodedOutputByteBufferNano.d(2, b) + i1;
        i = l;
        if ((c & 1) != 0)
        {
            i = l + CodedOutputByteBufferNano.d(3, d);
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
                int l = j.a(a1, 10);
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

            case 16: // '\020'
                b = a1.e();
                break;

            case 24: // '\030'
                d = a1.e();
                c = c | 1;
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
                    codedoutputbytebuffernano.a(1, d1);
                }
            }

        }
        codedoutputbytebuffernano.a(2, b);
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
