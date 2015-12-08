// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class bd extends b
{

    private int a;
    private boolean b;
    private boolean c;
    private boolean d;

    public bd()
    {
        a = 0;
        b = false;
        c = false;
        d = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((a & 1) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(1) + 1);
        }
        j = i;
        if ((a & 2) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(2) + 1);
        }
        i = j;
        if ((a & 4) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(3) + 1);
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

            case 8: // '\b'
                b = a1.b();
                a = a | 1;
                break;

            case 16: // '\020'
                c = a1.b();
                a = a | 2;
                break;

            case 24: // '\030'
                d = a1.b();
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
