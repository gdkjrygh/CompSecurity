// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class d extends b
{

    public String a[];
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;

    public d()
    {
        b = 0;
        c = "";
        d = "";
        e = "";
        f = "";
        a = j.f;
        g = "";
        h = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int k = super.computeSerializedSize();
        int i = k;
        if ((b & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(1, c);
        }
        k = i;
        if ((b & 2) != 0)
        {
            k = i + CodedOutputByteBufferNano.b(2, d);
        }
        int l = k;
        if ((b & 4) != 0)
        {
            l = k + CodedOutputByteBufferNano.b(3, e);
        }
        i = l;
        if ((b & 8) != 0)
        {
            i = l + CodedOutputByteBufferNano.b(4, f);
        }
        k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int i1 = 0;
                int j1 = 0;
                for (k = ((flag) ? 1 : 0); k < a.length;)
                {
                    String s = a[k];
                    int l1 = i1;
                    int k1 = j1;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        l1 = i1 + CodedOutputByteBufferNano.a(s);
                    }
                    k++;
                    i1 = l1;
                    j1 = k1;
                }

                k = i + i1 + j1 * 1;
            }
        }
        i = k;
        if ((b & 0x10) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(6, g);
        }
        k = i;
        if ((b & 0x20) != 0)
        {
            k = i + CodedOutputByteBufferNano.b(7, h);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int i = a1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(a1, i))
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
                d = a1.c();
                b = b | 2;
                break;

            case 26: // '\032'
                e = a1.c();
                b = b | 4;
                break;

            case 34: // '"'
                f = a1.c();
                b = b | 8;
                break;

            case 42: // '*'
                int l = j.a(a1, 42);
                String as[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                as = new String[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, as, 0, k);
                    l = k;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = a1.c();
                    a1.a();
                }

                as[l] = a1.c();
                a = as;
                break;

            case 50: // '2'
                g = a1.c();
                b = b | 0x10;
                break;

            case 58: // ':'
                h = a1.c();
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
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(5, s);
                }
            }

        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
