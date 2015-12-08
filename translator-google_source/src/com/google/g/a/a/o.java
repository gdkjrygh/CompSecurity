// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.g.a.a:
//            h

public final class o extends b
{

    private static volatile o b[];
    public h a[];
    private int c;
    private String d;

    public o()
    {
        c = 0;
        d = "";
        a = com.google.g.a.a.h.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static o[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new o[0];
                }
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if ((c & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(1, d);
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
                        l = i + CodedOutputByteBufferNano.c(2, h1);
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

            case 10: // '\n'
                d = a1.c();
                c = c | 1;
                break;

            case 18: // '\022'
                int l = j.a(a1, 18);
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
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                h h1 = a[i];
                if (h1 != null)
                {
                    codedoutputbytebuffernano.a(2, h1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
