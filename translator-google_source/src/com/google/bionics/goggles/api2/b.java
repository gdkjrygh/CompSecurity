// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;

public final class b extends com.google.protobuf.nano.b
{

    public com.google.d.a.b a;
    private int b;
    private String c;
    private float d;
    private float e;
    private boolean f;
    private boolean g;
    private boolean h;
    private String i;

    public b()
    {
        b = 0;
        c = "";
        d = 0.0F;
        e = 0.0F;
        a = null;
        f = true;
        g = false;
        h = false;
        i = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if ((b & 1) != 0)
        {
            j = k + CodedOutputByteBufferNano.b(1, c);
        }
        k = j;
        if ((b & 4) != 0)
        {
            k = j + (CodedOutputByteBufferNano.b(2) + 4);
        }
        j = k;
        if ((b & 0x40) != 0)
        {
            j = k + CodedOutputByteBufferNano.b(10, i);
        }
        k = j;
        if ((b & 2) != 0)
        {
            k = j + (CodedOutputByteBufferNano.b(12) + 4);
        }
        j = k;
        if (a != null)
        {
            j = k + CodedOutputByteBufferNano.c(13, a);
        }
        k = j;
        if ((b & 8) != 0)
        {
            k = j + (CodedOutputByteBufferNano.b(17) + 1);
        }
        j = k;
        if ((b & 0x10) != 0)
        {
            j = k + (CodedOutputByteBufferNano.b(18) + 1);
        }
        k = j;
        if ((b & 0x20) != 0)
        {
            k = j + (CodedOutputByteBufferNano.b(19) + 1);
        }
        return k;
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

            case 10: // '\n'
                c = a1.c();
                b = b | 1;
                break;

            case 21: // '\025'
                e = Float.intBitsToFloat(a1.g());
                b = b | 4;
                break;

            case 82: // 'R'
                i = a1.c();
                b = b | 0x40;
                break;

            case 101: // 'e'
                d = Float.intBitsToFloat(a1.g());
                b = b | 2;
                break;

            case 106: // 'j'
                if (a == null)
                {
                    a = new com.google.d.a.b();
                }
                a1.a(a);
                break;

            case 136: 
                f = a1.b();
                b = b | 8;
                break;

            case 144: 
                g = a1.b();
                b = b | 0x10;
                break;

            case 152: 
                h = a1.b();
                b = b | 0x20;
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
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(10, i);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(12, d);
        }
        if (a != null)
        {
            codedoutputbytebuffernano.a(13, a);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(17, f);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(18, g);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(19, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
