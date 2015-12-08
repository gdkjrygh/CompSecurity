// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.e;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class j extends b
{

    private static volatile j d[];
    public int a;
    public String b;
    public int c;

    public j()
    {
        a = 0;
        b = "";
        c = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static j[] a()
    {
        if (d == null)
        {
            synchronized (f.a)
            {
                if (d == null)
                {
                    d = new j[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if ((a & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(1, b);
        }
        k = i;
        if ((a & 2) != 0)
        {
            k = i + CodedOutputByteBufferNano.d(2, c);
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
                b = a1.c();
                a = a | 1;
                break;

            case 16: // '\020'
                c = a1.e();
                a = a | 2;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if ((a & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
