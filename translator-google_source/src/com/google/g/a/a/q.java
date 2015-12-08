// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class q extends b
{

    private static volatile q a[];
    private int b;
    private String c;
    private String d;
    private boolean e;
    private int f;

    public q()
    {
        b = 0;
        c = "";
        d = "";
        e = false;
        f = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static q[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new q[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((b & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.b(1, c);
        }
        j = i;
        if ((b & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.b(2, d);
        }
        i = j;
        if ((b & 4) != 0)
        {
            i = j + (CodedOutputByteBufferNano.b(3) + 1);
        }
        j = i;
        if ((b & 8) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(4, f);
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

            case 10: // '\n'
                c = a1.c();
                b = b | 1;
                break;

            case 18: // '\022'
                d = a1.c();
                b = b | 2;
                break;

            case 24: // '\030'
                e = a1.b();
                b = b | 4;
                break;

            case 32: // ' '
                f = a1.e();
                b = b | 8;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, d);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
