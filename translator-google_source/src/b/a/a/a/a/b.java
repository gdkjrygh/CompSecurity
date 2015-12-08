// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;

public final class b extends com.google.protobuf.nano.b
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public b()
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if ((a & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(1, b);
        }
        l = k;
        if ((a & 2) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(2, c);
        }
        k = l;
        if ((a & 4) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(3, d);
        }
        l = k;
        if ((a & 8) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(4, e);
        }
        k = l;
        if ((a & 0x10) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(5, f);
        }
        l = k;
        if ((a & 0x20) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(6, g);
        }
        k = l;
        if ((a & 0x40) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(7, h);
        }
        l = k;
        if ((a & 0x80) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(8, i);
        }
        k = l;
        if ((a & 0x100) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(9, j);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(a1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                b = a1.e();
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

            case 32: // ' '
                e = a1.e();
                a = a | 8;
                break;

            case 40: // '('
                f = a1.e();
                a = a | 0x10;
                break;

            case 48: // '0'
                g = a1.e();
                a = a | 0x20;
                break;

            case 56: // '8'
                h = a1.e();
                a = a | 0x40;
                break;

            case 64: // '@'
                i = a1.e();
                a = a | 0x80;
                break;

            case 72: // 'H'
                j = a1.e();
                a = a | 0x100;
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
            codedoutputbytebuffernano.a(4, e);
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
        super.writeTo(codedoutputbytebuffernano);
    }
}
