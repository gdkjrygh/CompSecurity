// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class f extends b
{

    private static volatile f e[];
    public int a;
    public int b;
    public int c;
    public int d;

    public f()
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static f[] a()
    {
        if (e == null)
        {
            synchronized (com.google.protobuf.nano.f.a)
            {
                if (e == null)
                {
                    e = new f[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        return super.computeSerializedSize() + CodedOutputByteBufferNano.d(1, a) + CodedOutputByteBufferNano.d(2, b) + CodedOutputByteBufferNano.d(3, c) + CodedOutputByteBufferNano.d(4, d);
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
                a = a1.e();
                break;

            case 16: // '\020'
                b = a1.e();
                break;

            case 24: // '\030'
                c = a1.e();
                break;

            case 32: // ' '
                d = a1.e();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.a(1, a);
        codedoutputbytebuffernano.a(2, b);
        codedoutputbytebuffernano.a(3, c);
        codedoutputbytebuffernano.a(4, d);
        super.writeTo(codedoutputbytebuffernano);
    }
}
