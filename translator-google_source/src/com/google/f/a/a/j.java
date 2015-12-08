// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.f.a.a:
//            e

public final class j extends b
{

    public e a[];

    public j()
    {
        a = com.google.f.a.a.e.a();
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
                    e e1 = a[k];
                    l = i;
                    if (e1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(1, e1);
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
                int l = com.google.protobuf.nano.j.a(a1, 10);
                e ae[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ae = new e[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ae, 0, k);
                    l = k;
                }
                for (; l < ae.length - 1; l++)
                {
                    ae[l] = new e();
                    a1.a(ae[l]);
                    a1.a();
                }

                ae[l] = new e();
                a1.a(ae[l]);
                a = ae;
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
                e e1 = a[i];
                if (e1 != null)
                {
                    codedoutputbytebuffernano.a(1, e1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
