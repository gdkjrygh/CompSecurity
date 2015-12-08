// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class b extends com.google.protobuf.nano.b
{

    private static volatile b b[];
    public String a;
    private int c;
    private float d;

    public b()
    {
        c = 0;
        a = "";
        d = 0.0F;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static b[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new b[0];
                }
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize() + CodedOutputByteBufferNano.b(1, a);
        int i = j;
        if ((c & 1) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(2) + 4);
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
                a = a1.c();
                break;

            case 21: // '\025'
                d = Float.intBitsToFloat(a1.g());
                c = c | 1;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.a(1, a);
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(2, d);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
