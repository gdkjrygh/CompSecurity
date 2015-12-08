// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.common.b:
//            aa

public final class z extends b
{

    public int a;
    public int b;
    public aa c[];

    public z()
    {
        a = 0;
        b = 0;
        c = com.google.common.b.aa.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if ((a & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(1, b);
        }
        k = i;
        if (c != null)
        {
            k = i;
            if (c.length > 0)
            {
                for (k = 0; k < c.length;)
                {
                    aa aa1 = c[k];
                    int l = i;
                    if (aa1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(2, aa1);
                    }
                    k++;
                    i = l;
                }

                k = i;
            }
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

            case 8: // '\b'
                b = a1.e();
                a = a | 1;
                break;

            case 18: // '\022'
                int l = j.a(a1, 18);
                aa aaa[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aaa = new aa[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, aaa, 0, k);
                    l = k;
                }
                for (; l < aaa.length - 1; l++)
                {
                    aaa[l] = new aa();
                    a1.a(aaa[l]);
                    a1.a();
                }

                aaa[l] = new aa();
                a1.a(aaa[l]);
                c = aaa;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                aa aa1 = c[i];
                if (aa1 != null)
                {
                    codedoutputbytebuffernano.a(2, aa1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
