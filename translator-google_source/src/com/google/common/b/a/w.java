// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class w extends b
{

    private int a;
    private long b;
    private long c;
    private long d;
    private boolean e;

    public w()
    {
        a = 0;
        b = 0L;
        c = 0L;
        d = 0L;
        e = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((a & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(1, b);
        }
        j = i;
        if ((a & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, c);
        }
        i = j;
        if ((a & 4) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(3, d);
        }
        j = i;
        if ((a & 8) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(4) + 1);
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

            case 8: // '\b'
                b = a1.f();
                a = a | 1;
                break;

            case 16: // '\020'
                c = a1.f();
                a = a | 2;
                break;

            case 24: // '\030'
                d = a1.f();
                a = a | 4;
                break;

            case 32: // ' '
                e = a1.b();
                a = a | 8;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.b(1, b);
        }
        if ((a & 2) != 0)
        {
            codedoutputbytebuffernano.b(2, c);
        }
        if ((a & 4) != 0)
        {
            codedoutputbytebuffernano.b(3, d);
        }
        if ((a & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
