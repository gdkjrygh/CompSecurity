// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class j extends b
{

    public double a;
    public double b;

    public j()
    {
        a = 0.0D;
        b = 0.0D;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        return super.computeSerializedSize() + (CodedOutputByteBufferNano.b(1) + 8) + (CodedOutputByteBufferNano.b(2) + 8);
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
                a = Double.longBitsToDouble(a1.h());
                break;

            case 17: // '\021'
                b = Double.longBitsToDouble(a1.h());
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.a(1, a);
        codedoutputbytebuffernano.a(2, b);
        super.writeTo(codedoutputbytebuffernano);
    }
}
