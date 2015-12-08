// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.f.a;

import com.google.f.d.a.h;
import com.google.f.d.a.i;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.g;

public final class d extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/f/a/d, 0x9907caL);
    private static final d h[] = new d[0];
    public i b;
    public com.google.f.d.a.d c;
    public com.google.f.d.a.b d;
    public com.google.f.d.a.c e;
    public h f;
    public String g;
    private int i;
    private String j;

    public d()
    {
        i = 0;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = "";
        j = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int k = l;
        if (b != null)
        {
            k = l + CodedOutputByteBufferNano.c(1, b);
        }
        l = k;
        if (c != null)
        {
            l = k + CodedOutputByteBufferNano.c(2, c);
        }
        k = l;
        if ((i & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(3, g);
        }
        l = k;
        if ((i & 2) != 0)
        {
            l = k + CodedOutputByteBufferNano.b(4, j);
        }
        k = l;
        if (d != null)
        {
            k = l + CodedOutputByteBufferNano.c(5, d);
        }
        l = k;
        if (e != null)
        {
            l = k + CodedOutputByteBufferNano.c(6, e);
        }
        k = l;
        if (f != null)
        {
            k = l + CodedOutputByteBufferNano.c(7, f);
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
                if (b == null)
                {
                    b = new i();
                }
                a1.a(b);
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new com.google.f.d.a.d();
                }
                a1.a(c);
                break;

            case 26: // '\032'
                g = a1.c();
                i = i | 1;
                break;

            case 34: // '"'
                j = a1.c();
                i = i | 2;
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new com.google.f.d.a.b();
                }
                a1.a(d);
                break;

            case 50: // '2'
                if (e == null)
                {
                    e = new com.google.f.d.a.c();
                }
                a1.a(e);
                break;

            case 58: // ':'
                if (f == null)
                {
                    f = new h();
                }
                a1.a(f);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if ((i & 1) != 0)
        {
            codedoutputbytebuffernano.a(3, g);
        }
        if ((i & 2) != 0)
        {
            codedoutputbytebuffernano.a(4, j);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(6, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
