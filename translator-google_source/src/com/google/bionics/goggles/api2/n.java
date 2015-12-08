// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class n extends b
{

    private int a;
    private double b;
    private double c;
    private float d;
    private float e;

    public n()
    {
        a = 0;
        b = 0.0D;
        c = 0.0D;
        d = 0.0F;
        e = 0.0F;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((a & 1) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(1) + 8);
        }
        j = i;
        if ((a & 2) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(2) + 8);
        }
        i = j;
        if ((a & 4) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(3) + 4);
        }
        j = i;
        if ((a & 8) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(4) + 4);
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

            case 9: // '\t'
                b = Double.longBitsToDouble(a1.h());
                a = a | 1;
                break;

            case 17: // '\021'
                c = Double.longBitsToDouble(a1.h());
                a = a | 2;
                break;

            case 29: // '\035'
                d = Float.intBitsToFloat(a1.g());
                a = a | 4;
                break;

            case 37: // '%'
                e = Float.intBitsToFloat(a1.g());
                a = a | 8;
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
        if ((a & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if ((a & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
