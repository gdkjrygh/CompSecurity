// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.f.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;

public final class b extends com.google.protobuf.nano.b
{

    private int a;
    private String b;
    private float c;
    private float d;

    public b()
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
        int j = super.computeSerializedSize();
        int i = j;
        if ((a & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(1, b);
        }
        j = i;
        if ((a & 2) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(2) + 4);
        }
        i = j;
        if ((a & 4) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(3) + 4);
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
