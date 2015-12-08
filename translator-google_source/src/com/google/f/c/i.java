// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class i extends b
{

    private int a;
    private String b;
    private float c;
    private float d;

    public i()
    {
        a = 0;
        b = "";
        c = 0.0F;
        d = 0.0F;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if ((a & 1) != 0)
        {
            j = k + CodedOutputByteBufferNano.b(1, b);
        }
        k = j;
        if ((a & 2) != 0)
        {
            k = j + (CodedOutputByteBufferNano.b(2) + 4);
        }
        j = k;
        if ((a & 4) != 0)
        {
            j = k + (CodedOutputByteBufferNano.b(3) + 4);
        }
        return j;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int j = a1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(a1, j))
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

            case 21: // '\025'
                c = Float.intBitsToFloat(a1.g());
                a = a | 2;
                break;

            case 29: // '\035'
                d = Float.intBitsToFloat(a1.g());
                a = a | 4;
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
        super.writeTo(codedoutputbytebuffernano);
    }
}
