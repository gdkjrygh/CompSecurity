// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.e;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.g;

public final class n extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/e/n, 0xd1390a2L);
    private static final n b[] = new n[0];
    private int c;
    private String d;

    public n()
    {
        c = 0;
        d = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    public final n a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            d = s;
            c = c | 1;
            return this;
        }
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((c & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(1, d);
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
                d = a1.c();
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
