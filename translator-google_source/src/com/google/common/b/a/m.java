// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class m extends b
{

    private static volatile m b[];
    public com.google.common.b.b.a.b a;
    private int c;
    private long d;
    private int e;
    private String f;
    private int g;
    private int h;
    private int i;
    private String j;
    private String k;
    private String l;
    private long m;
    private int n;

    public m()
    {
        c = 0;
        d = 0L;
        e = 0;
        f = "";
        g = 0;
        h = 0;
        i = 1;
        j = "";
        k = "";
        l = "";
        a = null;
        m = 0L;
        n = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static m[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new m[0];
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
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((c & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(1, d);
        }
        j1 = i1;
        if ((c & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(2, e);
        }
        i1 = j1;
        if ((c & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, f);
        }
        j1 = i1;
        if ((c & 8) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(4, g);
        }
        i1 = j1;
        if ((c & 0x10) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(5, h);
        }
        j1 = i1;
        if ((c & 0x20) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(6, i);
        }
        i1 = j1;
        if ((c & 0x40) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, j);
        }
        j1 = i1;
        if ((c & 0x80) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(8, k);
        }
        i1 = j1;
        if ((c & 0x100) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, l);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(10, a);
        }
        i1 = j1;
        if ((c & 0x200) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(11, m);
        }
        j1 = i1;
        if ((c & 0x400) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(12, n);
        }
        return j1;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                d = a1.f();
                c = c | 1;
                break;

            case 16: // '\020'
                e = a1.e();
                c = c | 2;
                break;

            case 26: // '\032'
                f = a1.c();
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

            case 48: // '0'
                i = a1.e();
                c = c | 0x20;
                break;

            case 58: // ':'
                j = a1.c();
                c = c | 0x40;
                break;

            case 66: // 'B'
                k = a1.c();
                c = c | 0x80;
                break;

            case 74: // 'J'
                l = a1.c();
                c = c | 0x100;
                break;

            case 82: // 'R'
                if (a == null)
                {
                    a = new com.google.common.b.b.a.b();
                }
                a1.a(a);
                break;

            case 88: // 'X'
                m = a1.f();
                c = c | 0x200;
                break;

            case 96: // '`'
                n = a1.e();
                c = c | 0x400;
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
        if ((c & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, i);
        }
        if ((c & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, j);
        }
        if ((c & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, k);
        }
        if ((c & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(9, l);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(10, a);
        }
        if ((c & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(11, m);
        }
        if ((c & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(12, n);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
