// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class am extends b
{

    public String a;
    public String b[];

    public am()
    {
        a = "";
        b = j.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i = 0;
        int k1 = super.computeSerializedSize() + CodedOutputByteBufferNano.b(1, a);
        if (b != null && b.length > 0)
        {
            int k = 0;
            int l;
            int i1;
            for (l = 0; i < b.length; l = i1)
            {
                String s = b[i];
                int j1 = k;
                i1 = l;
                if (s != null)
                {
                    i1 = l + 1;
                    j1 = k + CodedOutputByteBufferNano.a(s);
                }
                i++;
                k = j1;
            }

            return k1 + k + l * 1;
        } else
        {
            return k1;
        }
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
                a = a1.c();
                break;

            case 18: // '\022'
                int l = j.a(a1, 18);
                String as[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                as = new String[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, as, 0, k);
                    l = k;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = a1.c();
                    a1.a();
                }

                as[l] = a1.c();
                b = as;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.a(1, a);
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(2, s);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
