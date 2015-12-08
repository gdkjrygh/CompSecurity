// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class aa extends b
{

    private static volatile aa a[];
    private int b;
    private long c;
    private long d;
    private long e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;

    public aa()
    {
        b = 0;
        c = 0L;
        d = 0L;
        e = 0L;
        f = "";
        g = "";
        h = false;
        i = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static aa[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new aa[0];
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
        int k = super.computeSerializedSize();
        int j = k;
        if ((b & 1) != 0)
        {
            j = k + CodedOutputByteBufferNano.d(1, c);
        }
        k = j;
        if ((b & 2) != 0)
        {
            k = j + CodedOutputByteBufferNano.d(2, d);
        }
        j = k;
        if ((b & 4) != 0)
        {
            j = k + CodedOutputByteBufferNano.d(3, e);
        }
        k = j;
        if ((b & 8) != 0)
        {
            k = j + CodedOutputByteBufferNano.b(4, f);
        }
        j = k;
        if ((b & 0x10) != 0)
        {
            j = k + CodedOutputByteBufferNano.b(5, g);
        }
        k = j;
        if ((b & 0x20) != 0)
        {
            k = j + (CodedOutputByteBufferNano.b(6) + 1);
        }
        j = k;
        if ((b & 0x40) != 0)
        {
            j = k + (CodedOutputByteBufferNano.b(7) + 1);
        }
        return j;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int j = a1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(a1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                c = a1.f();
                b = b | 1;
                break;

            case 16: // '\020'
                d = a1.f();
                b = b | 2;
                break;

            case 24: // '\030'
                e = a1.f();
                b = b | 4;
                break;

            case 34: // '"'
                f = a1.c();
                b = b | 8;
                break;

            case 42: // '*'
                g = a1.c();
                b = b | 0x10;
                break;

            case 48: // '0'
                h = a1.b();
                b = b | 0x20;
                break;

            case 56: // '8'
                i = a1.b();
                b = b | 0x40;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.b(1, c);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.b(2, d);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.b(3, e);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, g);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, h);
        }
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, i);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
