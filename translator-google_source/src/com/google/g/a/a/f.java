// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.g.a.a:
//            g

public final class f extends b
{

    public com.google.g.a.a.g a[];

    public f()
    {
        a = com.google.g.a.a.g.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int l = i;
        if (a != null)
        {
            l = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    com.google.g.a.a.g g1 = a[k];
                    l = i;
                    if (g1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(8, g1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
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

            case 66: // 'B'
                int l = j.a(a1, 66);
                com.google.g.a.a.g ag[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ag = new com.google.g.a.a.g[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ag, 0, k);
                    l = k;
                }
                for (; l < ag.length - 1; l++)
                {
                    ag[l] = new com.google.g.a.a.g();
                    a1.a(ag[l]);
                    a1.a();
                }

                ag[l] = new com.google.g.a.a.g();
                a1.a(ag[l]);
                a = ag;
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
                com.google.g.a.a.g g1 = a[i];
                if (g1 != null)
                {
                    codedoutputbytebuffernano.a(8, g1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
