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
//            z

public final class y extends b
{

    public z a[];
    private int b;
    private boolean c;

    public y()
    {
        b = 0;
        a = com.google.f.c.z.a();
        c = false;
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
                    z z1 = a[l];
                    k = i;
                    if (z1 != null)
                    {
                        k = i + CodedOutputByteBufferNano.c(1, z1);
                    }
                    l++;
                    i = k;
                } while (true);
            }
        }
        i = k;
        if ((b & 1) != 0)
        {
            i = k + (CodedOutputByteBufferNano.b(2) + 1);
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
                z az[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                az = new z[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, az, 0, k);
                    l = k;
                }
                for (; l < az.length - 1; l++)
                {
                    az[l] = new z();
                    a1.a(az[l]);
                    a1.a();
                }

                az[l] = new z();
                a1.a(az[l]);
                a = az;
                break;

            case 16: // '\020'
                c = a1.b();
                b = b | 1;
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
                z z1 = a[i];
                if (z1 != null)
                {
                    codedoutputbytebuffernano.a(1, z1);
                }
            }

        }
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
