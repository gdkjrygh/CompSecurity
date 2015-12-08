// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.c:
//            r

public final class q extends b
{

    public r a[];

    public q()
    {
        a = com.google.f.c.r.a();
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
                    r r1 = a[k];
                    l = i;
                    if (r1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(3, r1);
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

            case 26: // '\032'
                int l = j.a(a1, 26);
                r ar[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ar = new r[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ar, 0, k);
                    l = k;
                }
                for (; l < ar.length - 1; l++)
                {
                    ar[l] = new r();
                    a1.a(ar[l]);
                    a1.a();
                }

                ar[l] = new r();
                a1.a(ar[l]);
                a = ar;
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
                r r1 = a[i];
                if (r1 != null)
                {
                    codedoutputbytebuffernano.a(3, r1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
