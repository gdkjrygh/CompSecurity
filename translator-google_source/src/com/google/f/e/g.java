// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.e;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;

public final class g extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/e/g, 0xd04a4b2L);
    private static final g b[] = new g[0];
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public g()
    {
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((c & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(1, d);
        }
        j = i;
        if ((c & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, e);
        }
        i = j;
        if ((c & 4) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(3, f);
        }
        j = i;
        if ((c & 8) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(4, g);
        }
        i = j;
        if ((c & 0x10) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(5, h);
        }
        return i;
    }

    public final com.google.protobuf.nano.g mergeFrom(a a1)
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
                d = a1.e();
                c = c | 1;
                break;

            case 16: // '\020'
                e = a1.e();
                c = c | 2;
                break;

            case 24: // '\030'
                f = a1.e();
                c = c | 4;
                break;

            case 32: // ' '
                g = a1.e();
                c = c | 8;
                break;

            case 40: // '('
                h = a1.e();
                c = c | 0x10;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, f);
        }
        if ((c & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, g);
        }
        if ((c & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
