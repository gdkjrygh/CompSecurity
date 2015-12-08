// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.a.a:
//            n

public final class o extends b
{

    public n a[];

    public o()
    {
        a = com.google.f.a.a.n.a();
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
                    n n1 = a[k];
                    l = i;
                    if (n1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(1, n1);
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

            case 10: // '\n'
                int l = j.a(a1, 10);
                n an[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                an = new n[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, an, 0, k);
                    l = k;
                }
                for (; l < an.length - 1; l++)
                {
                    an[l] = new n();
                    a1.a(an[l]);
                    a1.a();
                }

                an[l] = new n();
                a1.a(an[l]);
                a = an;
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
                n n1 = a[i];
                if (n1 != null)
                {
                    codedoutputbytebuffernano.a(1, n1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
