// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class f extends b
{

    public byte a[][];

    public f()
    {
        a = j.g;
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
                byte abyte0[] = a[i];
                int j1 = k;
                i1 = l;
                if (abyte0 != null)
                {
                    i1 = l + 1;
                    j1 = k + CodedOutputByteBufferNano.a(abyte0);
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
                byte abyte0[][];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                abyte0 = new byte[l + k][];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, abyte0, 0, k);
                    l = k;
                }
                for (; l < abyte0.length - 1; l++)
                {
                    abyte0[l] = a1.d();
                    a1.a();
                }

                abyte0[l] = a1.d();
                a = abyte0;
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
                byte abyte0[] = a[i];
                if (abyte0 != null)
                {
                    codedoutputbytebuffernano.a(1, abyte0);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
