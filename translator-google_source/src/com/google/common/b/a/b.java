// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;

public final class b extends com.google.protobuf.nano.b
{

    private int a;
    private String b;
    private String c;
    private String d;
    private long e;
    private String f;
    private boolean g;
    private boolean h;
    private int i;
    private boolean j;
    private int k;

    public b()
    {
        a = 0;
        b = "";
        c = "";
        d = "";
        e = 0L;
        f = "";
        g = false;
        h = false;
        i = 0;
        j = false;
        k = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int l = i1;
        if ((a & 1) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(1, b);
        }
        i1 = l;
        if ((a & 2) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.b(2, c);
        }
        l = i1;
        if ((a & 4) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = l;
        if ((a & 8) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.d(4, e);
        }
        l = i1;
        if ((a & 0x10) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = l;
        if ((a & 0x20) != 0)
        {
            i1 = l + (CodedOutputByteBufferNano.b(6) + 1);
        }
        l = i1;
        if ((a & 0x40) != 0)
        {
            l = i1 + (CodedOutputByteBufferNano.b(7) + 1);
        }
        i1 = l;
        if ((a & 0x80) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.d(8, i);
        }
        l = i1;
        if ((a & 0x100) != 0)
        {
            l = i1 + (CodedOutputByteBufferNano.b(9) + 1);
        }
        i1 = l;
        if ((a & 0x200) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.d(10, k);
        }
        return i1;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int l = a1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(a1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = a1.c();
                a = a | 1;
                break;

            case 18: // '\022'
                c = a1.c();
                a = a | 2;
                break;

            case 26: // '\032'
                d = a1.c();
                a = a | 4;
                break;

            case 32: // ' '
                e = a1.f();
                a = a | 8;
                break;

            case 42: // '*'
                f = a1.c();
                a = a | 0x10;
                break;

            case 48: // '0'
                g = a1.b();
                a = a | 0x20;
                break;

            case 56: // '8'
                h = a1.b();
                a = a | 0x40;
                break;

            case 64: // '@'
                i = a1.e();
                a = a | 0x80;
                break;

            case 72: // 'H'
                j = a1.b();
                a = a | 0x100;
                break;

            case 80: // 'P'
                k = a1.e();
                a = a | 0x200;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if ((a & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if ((a & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if ((a & 8) != 0)
        {
            codedoutputbytebuffernano.b(4, e);
        }
        if ((a & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if ((a & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if ((a & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if ((a & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if ((a & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if ((a & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
