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
//            an

public final class ao extends b
{

    public an a[];
    private int b;
    private int c;
    private boolean d;
    private int e;

    public ao()
    {
        b = 0;
        c = 0;
        d = false;
        e = 0;
        a = com.google.common.b.an.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if ((b & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(1, c);
        }
        k = i;
        if ((b & 2) != 0)
        {
            k = i + (CodedOutputByteBufferNano.b(2) + 1);
        }
        i = k;
        if ((b & 4) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(3, e);
        }
        k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                for (k = 0; k < a.length;)
                {
                    an an1 = a[k];
                    int l = i;
                    if (an1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(4, an1);
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
                c = a1.e();
                b = b | 1;
                break;

            case 16: // '\020'
                d = a1.b();
                b = b | 2;
                break;

            case 24: // '\030'
                e = a1.e();
                b = b | 4;
                break;

            case 34: // '"'
                int l = j.a(a1, 34);
                an aan[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                aan = new an[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, aan, 0, k);
                    l = k;
                }
                for (; l < aan.length - 1; l++)
                {
                    aan[l] = new an();
                    a1.a(aan[l]);
                    a1.a();
                }

                aan[l] = new an();
                a1.a(aan[l]);
                a = aan;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, d);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                an an1 = a[i];
                if (an1 != null)
                {
                    codedoutputbytebuffernano.a(4, an1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
