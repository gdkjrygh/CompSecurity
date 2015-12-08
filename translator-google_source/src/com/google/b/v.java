// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.b:
//            u

public final class v extends b
{

    private static volatile v b[];
    public u a[];

    public v()
    {
        a = com.google.b.u.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static v[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new v[0];
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
                    u u1 = a[k];
                    l = i;
                    if (u1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(1, u1);
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

            case 10: // '\n'
                int l = j.a(a1, 10);
                u au[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                au = new u[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, au, 0, k);
                    l = k;
                }
                for (; l < au.length - 1; l++)
                {
                    au[l] = new u();
                    a1.a(au[l]);
                    a1.a();
                }

                au[l] = new u();
                a1.a(au[l]);
                a = au;
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
                u u1 = a[i];
                if (u1 != null)
                {
                    codedoutputbytebuffernano.a(1, u1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
