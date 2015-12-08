// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class b extends com.google.protobuf.nano.b
{

    private static volatile b d[];
    public String a;
    public int b;
    public int c;

    public b()
    {
        a = "";
        b = 0;
        c = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static b[] a()
    {
        if (d == null)
        {
            synchronized (f.a)
            {
                if (d == null)
                {
                    d = new b[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        return super.computeSerializedSize() + CodedOutputByteBufferNano.b(1, a) + CodedOutputByteBufferNano.e(2, b) + CodedOutputByteBufferNano.e(3, c);
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

            case 16: // '\020'
                b = a1.e();
                break;

            case 24: // '\030'
                c = a1.e();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.a(1, a);
        codedoutputbytebuffernano.c(2, b);
        codedoutputbytebuffernano.c(3, c);
        super.writeTo(codedoutputbytebuffernano);
    }
}
