// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.a.a:
//            g

public final class i extends b
{

    public com.google.f.a.a.g a[];

    public i()
    {
        a = com.google.f.a.a.g.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i1 = k;
        if (a != null)
        {
            i1 = k;
            if (a.length > 0)
            {
                int l = 0;
                do
                {
                    i1 = k;
                    if (l >= a.length)
                    {
                        break;
                    }
                    com.google.f.a.a.g g1 = a[l];
                    i1 = k;
                    if (g1 != null)
                    {
                        i1 = k + CodedOutputByteBufferNano.c(1, g1);
                    }
                    l++;
                    k = i1;
                } while (true);
            }
        }
        return i1;
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
                int i1 = j.a(a1, 10);
                com.google.f.a.a.g ag[];
                int l;
                if (a == null)
                {
                    l = 0;
                } else
                {
                    l = a.length;
                }
                ag = new com.google.f.a.a.g[i1 + l];
                i1 = l;
                if (l != 0)
                {
                    System.arraycopy(a, 0, ag, 0, l);
                    i1 = l;
                }
                for (; i1 < ag.length - 1; i1++)
                {
                    ag[i1] = new com.google.f.a.a.g();
                    a1.a(ag[i1]);
                    a1.a();
                }

                ag[i1] = new com.google.f.a.a.g();
                a1.a(ag[i1]);
                a = ag;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (a != null && a.length > 0)
        {
            for (int k = 0; k < a.length; k++)
            {
                com.google.f.a.a.g g1 = a[k];
                if (g1 != null)
                {
                    codedoutputbytebuffernano.a(1, g1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
