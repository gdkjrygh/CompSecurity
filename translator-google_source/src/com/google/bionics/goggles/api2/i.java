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
//            g

public final class i extends b
{

    public String a;
    public com.google.bionics.goggles.api2.g b[];
    private int c;

    public i()
    {
        c = 0;
        a = "";
        b = com.google.bionics.goggles.api2.g.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if ((c & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(1, a);
        }
        l = k;
        if (b != null)
        {
            l = k;
            if (b.length > 0)
            {
                for (l = 0; l < b.length;)
                {
                    com.google.bionics.goggles.api2.g g1 = b[l];
                    int i1 = k;
                    if (g1 != null)
                    {
                        i1 = k + CodedOutputByteBufferNano.c(2, g1);
                    }
                    l++;
                    k = i1;
                }

                l = k;
            }
        }
        return l;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(a1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = a1.c();
                c = c | 1;
                break;

            case 18: // '\022'
                int i1 = j.a(a1, 18);
                com.google.bionics.goggles.api2.g ag[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                ag = new com.google.bionics.goggles.api2.g[i1 + l];
                i1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, ag, 0, l);
                    i1 = l;
                }
                for (; i1 < ag.length - 1; i1++)
                {
                    ag[i1] = new com.google.bionics.goggles.api2.g();
                    a1.a(ag[i1]);
                    a1.a();
                }

                ag[i1] = new com.google.bionics.goggles.api2.g();
                a1.a(ag[i1]);
                b = ag;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int k = 0; k < b.length; k++)
            {
                com.google.bionics.goggles.api2.g g1 = b[k];
                if (g1 != null)
                {
                    codedoutputbytebuffernano.a(2, g1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
