// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class v extends b
{

    public String a[];

    public v()
    {
        a = j.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i = 0;
        int k1 = super.computeSerializedSize();
        if (a != null && a.length > 0)
        {
            int k = 0;
            int l;
            int i1;
            for (l = 0; i < a.length; l = i1)
            {
                String s = a[i];
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
                int l = j.a(a1, 10);
                String as[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                as = new String[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, as, 0, k);
                    l = k;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = a1.c();
                    a1.a();
                }

                as[l] = a1.c();
                a = as;
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
                String s = a[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(1, s);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
