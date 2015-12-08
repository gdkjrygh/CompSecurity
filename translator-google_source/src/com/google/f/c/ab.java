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
//            ac, ad

public final class ab extends b
{

    public ac a;
    public ac b[];
    public ad c[];

    public ab()
    {
        a = null;
        b = com.google.f.c.ac.a();
        c = com.google.f.c.ad.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int k = i;
        if (a != null)
        {
            k = i + CodedOutputByteBufferNano.c(1, a);
        }
        i = k;
        if (b != null)
        {
            i = k;
            if (b.length > 0)
            {
                i = k;
                for (int l = 0; l < b.length;)
                {
                    ac ac1 = b[l];
                    int j1 = i;
                    if (ac1 != null)
                    {
                        j1 = i + CodedOutputByteBufferNano.c(2, ac1);
                    }
                    l++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (c != null)
        {
            k1 = i;
            if (c.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (i1 >= c.length)
                    {
                        break;
                    }
                    ad ad1 = c[i1];
                    k1 = i;
                    if (ad1 != null)
                    {
                        k1 = i + CodedOutputByteBufferNano.c(3, ad1);
                    }
                    i1++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
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
                if (a == null)
                {
                    a = new ac();
                }
                a1.a(a);
                break;

            case 18: // '\022'
                int i1 = j.a(a1, 18);
                ac aac[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aac = new ac[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aac, 0, k);
                    i1 = k;
                }
                for (; i1 < aac.length - 1; i1++)
                {
                    aac[i1] = new ac();
                    a1.a(aac[i1]);
                    a1.a();
                }

                aac[i1] = new ac();
                a1.a(aac[i1]);
                b = aac;
                break;

            case 26: // '\032'
                int j1 = j.a(a1, 26);
                ad aad[];
                int l;
                if (c == null)
                {
                    l = 0;
                } else
                {
                    l = c.length;
                }
                aad = new ad[j1 + l];
                j1 = l;
                if (l != 0)
                {
                    System.arraycopy(c, 0, aad, 0, l);
                    j1 = l;
                }
                for (; j1 < aad.length - 1; j1++)
                {
                    aad[j1] = new ad();
                    a1.a(aad[j1]);
                    a1.a();
                }

                aad[j1] = new ad();
                a1.a(aad[j1]);
                c = aad;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (a != null)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ac ac1 = b[i];
                if (ac1 != null)
                {
                    codedoutputbytebuffernano.a(2, ac1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < c.length; k++)
            {
                ad ad1 = c[k];
                if (ad1 != null)
                {
                    codedoutputbytebuffernano.a(3, ad1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
