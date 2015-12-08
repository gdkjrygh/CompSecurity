// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class c extends b
{

    private static volatile c a[];
    private int b;
    private float c;
    private float d;

    public c()
    {
        b = 0;
        c = 0.0F;
        d = 0.0F;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static c[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new c[0];
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
            i = j + (CodedOutputByteBufferNano.b(1) + 4);
        }
        j = i;
        if ((b & 2) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(2) + 4);
        }
        return j;
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
                c = Float.intBitsToFloat(a1.g());
                b = b | 1;
                break;

            case 21: // '\025'
                d = Float.intBitsToFloat(a1.g());
                b = b | 2;
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
        super.writeTo(codedoutputbytebuffernano);
    }
}
