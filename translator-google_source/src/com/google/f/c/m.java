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
//            c

public final class m extends b
{

    public c a[];
    private int b;
    private int c;
    private int d;

    public m()
    {
        b = 0;
        a = com.google.f.c.c.a();
        c = 0;
        d = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int l = 0;
                do
                {
                    k = i;
                    if (l >= a.length)
                    {
                        break;
                    }
                    c c1 = a[l];
                    k = i;
                    if (c1 != null)
                    {
                        k = i + CodedOutputByteBufferNano.c(1, c1);
                    }
                    l++;
                    i = k;
                } while (true);
            }
        }
        i = k;
        if ((b & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(2, c);
        }
        k = i;
        if ((b & 2) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(3, d);
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

            case 16: // '\020'
                c = a1.e();
                b = b | 1;
                break;

            case 24: // '\030'
                d = a1.e();
                b = b | 2;
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
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
