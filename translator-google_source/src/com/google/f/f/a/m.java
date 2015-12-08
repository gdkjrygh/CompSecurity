// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.f.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.g;

public final class m extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/f/a/m, 0xd533172L);
    private static final m g[] = new m[0];
    public int b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    private String h;
    private int i;
    private int j;

    public m()
    {
        b = 0;
        h = "";
        i = 0;
        j = 0;
        c = "";
        d = false;
        e = "";
        f = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if ((b & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(1, h);
        }
        l = k;
        if ((b & 2) != 0)
        {
            l = k + (CodedOutputByteBufferNano.b(2) + 4);
        }
        k = l;
        if ((b & 4) != 0)
        {
            k = l + (CodedOutputByteBufferNano.b(3) + 4);
        }
        l = k;
        if ((b & 8) != 0)
        {
            l = k + CodedOutputByteBufferNano.b(4, c);
        }
        k = l;
        if ((b & 0x10) != 0)
        {
            k = l + (CodedOutputByteBufferNano.b(5) + 1);
        }
        l = k;
        if ((b & 0x20) != 0)
        {
            l = k + CodedOutputByteBufferNano.b(6, e);
        }
        k = l;
        if ((b & 0x40) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(7, f);
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

            case 10: // '\n'
                h = a1.c();
                b = b | 1;
                break;

            case 21: // '\025'
                i = a1.g();
                b = b | 2;
                break;

            case 29: // '\035'
                j = a1.g();
                b = b | 4;
                break;

            case 34: // '"'
                c = a1.c();
                b = b | 8;
                break;

            case 40: // '('
                d = a1.b();
                b = b | 0x10;
                break;

            case 50: // '2'
                e = a1.c();
                b = b | 0x20;
                break;

            case 58: // ':'
                f = a1.c();
                b = b | 0x40;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, h);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.b(2, i);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.b(3, j);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, c);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, e);
        }
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
