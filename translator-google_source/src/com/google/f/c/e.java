// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class e extends b
{

    private static volatile e b[];
    public float a[];

    public e()
    {
        a = j.c;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static e[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new e[0];
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
        if (a != null)
        {
            i = k;
            if (a.length > 0)
            {
                i = k + a.length * 4 + a.length * 1;
            }
        }
        return i;
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

            case 13: // '\r'
                int i1 = j.a(a1, 13);
                float af[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                af = new float[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, af, 0, k);
                    i1 = k;
                }
                for (; i1 < af.length - 1; i1++)
                {
                    af[i1] = Float.intBitsToFloat(a1.g());
                    a1.a();
                }

                af[i1] = Float.intBitsToFloat(a1.g());
                a = af;
                break;

            case 10: // '\n'
                int l = a1.e();
                int k1 = a1.c(l);
                int j1 = l / 4;
                float af1[];
                if (a == null)
                {
                    l = 0;
                } else
                {
                    l = a.length;
                }
                af1 = new float[j1 + l];
                j1 = l;
                if (l != 0)
                {
                    System.arraycopy(a, 0, af1, 0, l);
                    j1 = l;
                }
                for (; j1 < af1.length; j1++)
                {
                    af1[j1] = Float.intBitsToFloat(a1.g());
                }

                a = af1;
                a1.d(k1);
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
        super.writeTo(codedoutputbytebuffernano);
    }
}
