// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class u extends b
{

    public int a[];
    private int b;
    private String c;
    private String d;

    public u()
    {
        b = 0;
        a = j.a;
        c = "";
        d = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i = 0;
        int l = super.computeSerializedSize();
        int k;
        if (a != null && a.length > 0)
        {
            k = 0;
            for (; i < a.length; i++)
            {
                k += CodedOutputByteBufferNano.a(a[i]);
            }

            k = l + k + a.length * 1;
        } else
        {
            k = l;
        }
        i = k;
        if ((b & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(2, c);
        }
        k = i;
        if ((b & 2) != 0)
        {
            k = i + CodedOutputByteBufferNano.b(3, d);
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
                int i1 = j.a(a1, 8);
                int ai[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ai = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ai, 0, k);
                    i1 = k;
                }
                for (; i1 < ai.length - 1; i1++)
                {
                    ai[i1] = a1.e();
                    a1.a();
                }

                ai[i1] = a1.e();
                a = ai;
                break;

            case 10: // '\n'
                int k1 = a1.c(a1.e());
                int l = a1.j();
                int j1;
                for (j1 = 0; a1.i() > 0; j1++)
                {
                    a1.e();
                }

                a1.e(l);
                int ai1[];
                if (a == null)
                {
                    l = 0;
                } else
                {
                    l = a.length;
                }
                ai1 = new int[j1 + l];
                j1 = l;
                if (l != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, l);
                    j1 = l;
                }
                for (; j1 < ai1.length; j1++)
                {
                    ai1[j1] = a1.e();
                }

                a = ai1;
                a1.d(k1);
                break;

            case 18: // '\022'
                c = a1.c();
                b = b | 1;
                break;

            case 26: // '\032'
                d = a1.c();
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
                codedoutputbytebuffernano.a(1, a[i]);
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
