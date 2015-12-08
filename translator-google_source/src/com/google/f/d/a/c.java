// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

public final class c extends b
{

    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private float j;
    private int k;

    public c()
    {
        a = 0;
        b = 0L;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = false;
        j = 0.0F;
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
            l = i1 + CodedOutputByteBufferNano.d(1, b);
        }
        i1 = l;
        if ((a & 2) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.d(2, c);
        }
        l = i1;
        if ((a & 4) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.d(3, d);
        }
        i1 = l;
        if ((a & 0x200) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.d(5, k);
        }
        l = i1;
        if ((a & 0x80) != 0)
        {
            l = i1 + (CodedOutputByteBufferNano.b(6) + 1);
        }
        i1 = l;
        if ((a & 0x100) != 0)
        {
            i1 = l + (CodedOutputByteBufferNano.b(7) + 4);
        }
        l = i1;
        if ((a & 8) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.d(8, e);
        }
        i1 = l;
        if ((a & 0x10) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.d(9, f);
        }
        l = i1;
        if ((a & 0x20) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.d(10, g);
        }
        i1 = l;
        if ((a & 0x40) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.d(11, h);
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

            case 8: // '\b'
                b = a1.f();
                a = a | 1;
                break;

            case 16: // '\020'
                c = a1.e();
                a = a | 2;
                break;

            case 24: // '\030'
                d = a1.e();
                a = a | 4;
                break;

            case 40: // '('
                k = a1.e();
                a = a | 0x200;
                break;

            case 48: // '0'
                i = a1.b();
                a = a | 0x80;
                break;

            case 61: // '='
                j = Float.intBitsToFloat(a1.g());
                a = a | 0x100;
                break;

            case 64: // '@'
                e = a1.e();
                a = a | 8;
                break;

            case 72: // 'H'
                f = a1.e();
                a = a | 0x10;
                break;

            case 80: // 'P'
                g = a1.e();
                a = a | 0x20;
                break;

            case 88: // 'X'
                h = a1.e();
                a = a | 0x40;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((a & 1) != 0)
        {
            codedoutputbytebuffernano.b(1, b);
        }
        if ((a & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if ((a & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if ((a & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(5, k);
        }
        if ((a & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(6, i);
        }
        if ((a & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(7, j);
        }
        if ((a & 8) != 0)
        {
            codedoutputbytebuffernano.a(8, e);
        }
        if ((a & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(9, f);
        }
        if ((a & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(10, g);
        }
        if ((a & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(11, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
