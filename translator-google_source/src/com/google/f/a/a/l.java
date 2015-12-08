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
//            k

public final class l extends b
{

    public k a[];

    public l()
    {
        a = com.google.f.a.a.k.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j1 = i;
        if (a != null)
        {
            j1 = i;
            if (a.length > 0)
            {
                int i1 = 0;
                do
                {
                    j1 = i;
                    if (i1 >= a.length)
                    {
                        break;
                    }
                    k k1 = a[i1];
                    j1 = i;
                    if (k1 != null)
                    {
                        j1 = i + CodedOutputByteBufferNano.c(1, k1);
                    }
                    i1++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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
                int j1 = j.a(a1, 10);
                k ak[];
                int i1;
                if (a == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = a.length;
                }
                ak = new k[j1 + i1];
                j1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(a, 0, ak, 0, i1);
                    j1 = i1;
                }
                for (; j1 < ak.length - 1; j1++)
                {
                    ak[j1] = new k();
                    a1.a(ak[j1]);
                    a1.a();
                }

                ak[j1] = new k();
                a1.a(ak[j1]);
                a = ak;
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
                k k1 = a[i];
                if (k1 != null)
                {
                    codedoutputbytebuffernano.a(1, k1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
