// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.bionics.goggles.api2:
//            h

public final class m extends b
{

    public h a[];
    private int b;
    private int c;
    private String d;

    public m()
    {
        a();
    }

    public final m a()
    {
        b = 0;
        c = 0;
        d = "";
        a = com.google.bionics.goggles.api2.h.a();
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int k = i;
        if ((b & 1) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(1, c);
        }
        i = k;
        if ((b & 2) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(2, d);
        }
        k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                for (k = 0; k < a.length;)
                {
                    h h1 = a[k];
                    int l = i;
                    if (h1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(3, h1);
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

            case 18: // '\022'
                d = a1.c();
                b = b | 2;
                break;

            case 26: // '\032'
                int l = j.a(a1, 26);
                h ah[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ah = new h[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ah, 0, k);
                    l = k;
                }
                for (; l < ah.length - 1; l++)
                {
                    ah[l] = new h();
                    a1.a(ah[l]);
                    a1.a();
                }

                ah[l] = new h();
                a1.a(ah[l]);
                a = ah;
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
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                h h1 = a[i];
                if (h1 != null)
                {
                    codedoutputbytebuffernano.a(3, h1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
