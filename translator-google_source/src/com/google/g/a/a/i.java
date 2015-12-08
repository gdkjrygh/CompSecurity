// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.g.a.a:
//            k

public final class i extends b
{

    public k a;
    private int b;
    private int c;
    private int d;
    private int e;
    private float f;
    private int g;
    private int h;
    private int i;

    public i()
    {
        b = 0;
        c = 10;
        d = 250;
        e = 200;
        f = 0.9F;
        g = 15;
        h = 50;
        a = null;
        i = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int j = l;
        if ((b & 1) != 0)
        {
            j = l + CodedOutputByteBufferNano.d(1, c);
        }
        l = j;
        if ((b & 2) != 0)
        {
            l = j + CodedOutputByteBufferNano.d(2, d);
        }
        j = l;
        if ((b & 4) != 0)
        {
            j = l + CodedOutputByteBufferNano.d(3, e);
        }
        l = j;
        if ((b & 8) != 0)
        {
            l = j + (CodedOutputByteBufferNano.b(4) + 4);
        }
        j = l;
        if ((b & 0x10) != 0)
        {
            j = l + CodedOutputByteBufferNano.d(5, g);
        }
        l = j;
        if ((b & 0x20) != 0)
        {
            l = j + CodedOutputByteBufferNano.d(6, h);
        }
        j = l;
        if (a != null)
        {
            j = l + CodedOutputByteBufferNano.c(7, a);
        }
        l = j;
        if ((b & 0x40) != 0)
        {
            l = j + CodedOutputByteBufferNano.d(8, i);
        }
        return l;
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
                c = a1.e();
                b = b | 1;
                break;

            case 16: // '\020'
                d = a1.e();
                b = b | 2;
                break;

            case 24: // '\030'
                e = a1.e();
                b = b | 4;
                break;

            case 37: // '%'
                f = Float.intBitsToFloat(a1.g());
                b = b | 8;
                break;

            case 40: // '('
                g = a1.e();
                b = b | 0x10;
                break;

            case 48: // '0'
                h = a1.e();
                b = b | 0x20;
                break;

            case 58: // ':'
                if (a == null)
                {
                    a = new k();
                }
                a1.a(a);
                break;

            case 64: // '@'
                i = a1.e();
                b = b | 0x40;
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
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, g);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, h);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(7, a);
        }
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
