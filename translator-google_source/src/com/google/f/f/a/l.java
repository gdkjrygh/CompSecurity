// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.f.a;

import com.google.f.e.j;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.g;

public final class l extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/f/a/l, 0xd45d032L);
    private static final l j[] = new l[0];
    public int b;
    public String c;
    public j d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public boolean i;

    public l()
    {
        b = 0;
        c = "";
        d = null;
        e = "";
        f = "";
        g = "";
        h = false;
        i = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int k = i1;
        if ((b & 1) != 0)
        {
            k = i1 + CodedOutputByteBufferNano.b(1, c);
        }
        i1 = k;
        if (d != null)
        {
            i1 = k + CodedOutputByteBufferNano.c(2, d);
        }
        k = i1;
        if ((b & 2) != 0)
        {
            k = i1 + CodedOutputByteBufferNano.b(3, e);
        }
        i1 = k;
        if ((b & 4) != 0)
        {
            i1 = k + CodedOutputByteBufferNano.b(4, f);
        }
        k = i1;
        if ((b & 8) != 0)
        {
            k = i1 + CodedOutputByteBufferNano.b(5, g);
        }
        i1 = k;
        if ((b & 0x10) != 0)
        {
            i1 = k + (CodedOutputByteBufferNano.b(6) + 1);
        }
        k = i1;
        if ((b & 0x20) != 0)
        {
            k = i1 + (CodedOutputByteBufferNano.b(7) + 1);
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
                c = a1.c();
                b = b | 1;
                break;

            case 18: // '\022'
                if (d == null)
                {
                    d = new j();
                }
                a1.a(d);
                break;

            case 26: // '\032'
                e = a1.c();
                b = b | 2;
                break;

            case 34: // '"'
                f = a1.c();
                b = b | 4;
                break;

            case 42: // '*'
                g = a1.c();
                b = b | 8;
                break;

            case 48: // '0'
                h = a1.b();
                b = b | 0x10;
                break;

            case 56: // '8'
                i = a1.b();
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
        if (d != null)
        {
            codedoutputbytebuffernano.a(2, d);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, f);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(5, g);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(6, h);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(7, i);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
