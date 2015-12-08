// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.b.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class b extends com.google.protobuf.nano.b
{

    private static volatile b a[];
    private int b;
    private float c;
    private boolean d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;

    public b()
    {
        b = 0;
        c = 0.0F;
        d = false;
        e = 0.0F;
        f = 0.0F;
        g = 0.0F;
        h = 0.0F;
        i = 0.0F;
        j = 0.0F;
        k = 0.0F;
        l = 0.0F;
        m = 0.0F;
        n = 0.0F;
        o = 0.0F;
        p = 0.0F;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static b[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new b[0];
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
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((b & 1) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(1) + 4);
        }
        j1 = i1;
        if ((b & 4) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(2) + 4);
        }
        i1 = j1;
        if ((b & 8) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(3) + 4);
        }
        j1 = i1;
        if ((b & 0x10) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(4) + 4);
        }
        i1 = j1;
        if ((b & 0x20) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(5) + 4);
        }
        j1 = i1;
        if ((b & 0x40) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(6) + 4);
        }
        i1 = j1;
        if ((b & 0x80) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(7) + 4);
        }
        j1 = i1;
        if ((b & 0x100) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(8) + 4);
        }
        i1 = j1;
        if ((b & 0x200) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(9) + 4);
        }
        j1 = i1;
        if ((b & 0x400) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(10) + 4);
        }
        i1 = j1;
        if ((b & 0x800) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(11) + 4);
        }
        j1 = i1;
        if ((b & 0x1000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(12) + 4);
        }
        i1 = j1;
        if ((b & 0x2000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(13) + 4);
        }
        j1 = i1;
        if ((b & 2) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(14) + 1);
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

            case 13: // '\r'
                c = Float.intBitsToFloat(a1.g());
                b = b | 1;
                break;

            case 21: // '\025'
                e = Float.intBitsToFloat(a1.g());
                b = b | 4;
                break;

            case 29: // '\035'
                f = Float.intBitsToFloat(a1.g());
                b = b | 8;
                break;

            case 37: // '%'
                g = Float.intBitsToFloat(a1.g());
                b = b | 0x10;
                break;

            case 45: // '-'
                h = Float.intBitsToFloat(a1.g());
                b = b | 0x20;
                break;

            case 53: // '5'
                i = Float.intBitsToFloat(a1.g());
                b = b | 0x40;
                break;

            case 61: // '='
                j = Float.intBitsToFloat(a1.g());
                b = b | 0x80;
                break;

            case 69: // 'E'
                k = Float.intBitsToFloat(a1.g());
                b = b | 0x100;
                break;

            case 77: // 'M'
                l = Float.intBitsToFloat(a1.g());
                b = b | 0x200;
                break;

            case 85: // 'U'
                m = Float.intBitsToFloat(a1.g());
                b = b | 0x400;
                break;

            case 93: // ']'
                n = Float.intBitsToFloat(a1.g());
                b = b | 0x800;
                break;

            case 101: // 'e'
                o = Float.intBitsToFloat(a1.g());
                b = b | 0x1000;
                break;

            case 109: // 'm'
                p = Float.intBitsToFloat(a1.g());
                b = b | 0x2000;
                break;

            case 112: // 'p'
                d = a1.b();
                b = b | 2;
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
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(3, f);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(4, g);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(6, i);
        }
        if ((b & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(7, j);
        }
        if ((b & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(8, k);
        }
        if ((b & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(9, l);
        }
        if ((b & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(10, m);
        }
        if ((b & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(11, n);
        }
        if ((b & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(12, o);
        }
        if ((b & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(13, p);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(14, d);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
