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
//            o, p

public final class k extends b
{

    public p a;
    public o b[];
    private int c;
    private int d;
    private int e;
    private int f;

    public k()
    {
        c = 0;
        d = 0;
        a = null;
        b = com.google.bionics.goggles.api2.o.a();
        e = -1;
        f = -1;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int l = i;
        if ((c & 1) != 0)
        {
            l = i + CodedOutputByteBufferNano.d(1, d);
        }
        i = l;
        if (a != null)
        {
            i = l + CodedOutputByteBufferNano.c(2, a);
        }
        l = i;
        if (b != null)
        {
            l = i;
            if (b.length > 0)
            {
                for (l = 0; l < b.length;)
                {
                    o o1 = b[l];
                    int i1 = i;
                    if (o1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.c(3, o1);
                    }
                    l++;
                    i = i1;
                }

                l = i;
            }
        }
        i = l;
        if ((c & 2) != 0)
        {
            i = l + CodedOutputByteBufferNano.d(4, e);
        }
        l = i;
        if ((c & 4) != 0)
        {
            l = i + CodedOutputByteBufferNano.d(5, f);
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

            case 8: // '\b'
                d = a1.e();
                c = c | 1;
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new p();
                }
                a1.a(a);
                break;

            case 26: // '\032'
                int i1 = j.a(a1, 26);
                o ao[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                ao = new o[i1 + l];
                i1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, ao, 0, l);
                    i1 = l;
                }
                for (; i1 < ao.length - 1; i1++)
                {
                    ao[i1] = new o();
                    a1.a(ao[i1]);
                    a1.a();
                }

                ao[i1] = new o();
                a1.a(ao[i1]);
                b = ao;
                break;

            case 32: // ' '
                e = a1.e();
                c = c | 2;
                break;

            case 40: // '('
                f = a1.e();
                c = c | 4;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                o o1 = b[i];
                if (o1 != null)
                {
                    codedoutputbytebuffernano.a(3, o1);
                }
            }

        }
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
