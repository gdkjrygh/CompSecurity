// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.e;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class b extends com.google.protobuf.nano.b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/e/b, 0x23c76aL);
    public static final c b = com.google.protobuf.nano.c.a(com/google/f/e/b, 0x1de8d3f2L);
    private static final b e[] = new b[0];
    public int c;
    public byte d[];

    public b()
    {
        c = 0;
        d = j.h;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if ((c & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(1, d);
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
                d = a1.d();
                c = c | 1;
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
        super.writeTo(codedoutputbytebuffernano);
    }

}
