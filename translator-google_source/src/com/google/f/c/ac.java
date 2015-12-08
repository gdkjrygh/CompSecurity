// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class ac extends b
{

    private static volatile ac a[];
    private int b;
    private double c;
    private double d;
    private double e;

    public ac()
    {
        b = 0;
        c = 0.0D;
        d = 0.0D;
        e = 0.0D;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ac[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new ac[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((b & 1) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(1) + 8);
        }
        j = i;
        if ((b & 2) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(2) + 8);
        }
        i = j;
        if ((b & 4) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(3) + 8);
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

            case 9: // '\t'
                c = Double.longBitsToDouble(a1.h());
                b = b | 1;
                break;

            case 17: // '\021'
                d = Double.longBitsToDouble(a1.h());
                b = b | 2;
                break;

            case 25: // '\031'
                e = Double.longBitsToDouble(a1.h());
                b = b | 4;
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
        super.writeTo(codedoutputbytebuffernano);
    }
}
