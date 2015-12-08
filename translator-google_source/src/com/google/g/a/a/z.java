// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class z extends b
{

    public String a[];
    private int b;
    private boolean c;
    private float d;
    private boolean e;
    private boolean f;
    private boolean g;

    public z()
    {
        b = 0;
        c = false;
        d = 1.0F;
        e = true;
        a = j.f;
        f = false;
        g = false;
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
            i = k + (CodedOutputByteBufferNano.b(1) + 1);
        }
        k = i;
        if ((b & 2) != 0)
        {
            k = i + (CodedOutputByteBufferNano.b(2) + 4);
        }
        i = k;
        if ((b & 4) != 0)
        {
            i = k + (CodedOutputByteBufferNano.b(3) + 1);
        }
        k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (k = ((flag) ? 1 : 0); k < a.length;)
                {
                    String s = a[k];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + CodedOutputByteBufferNano.a(s);
                    }
                    k++;
                    l = k1;
                    i1 = j1;
                }

                k = i + l + i1 * 1;
            }
        }
        i = k;
        if ((b & 8) != 0)
        {
            i = k + (CodedOutputByteBufferNano.b(5) + 1);
        }
        k = i;
        if ((b & 0x10) != 0)
        {
            k = i + (CodedOutputByteBufferNano.b(6) + 1);
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

            case 8: // '\b'
                c = a1.b();
                b = b | 1;
                break;

            case 21: // '\025'
                d = Float.intBitsToFloat(a1.g());
                b = b | 2;
                break;

            case 24: // '\030'
                e = a1.b();
                b = b | 4;
                break;

            case 34: // '"'
                int l = j.a(a1, 34);
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

            case 40: // '('
                f = a1.b();
                b = b | 8;
                break;

            case 48: // '0'
                g = a1.b();
                b = b | 0x10;
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
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                String s = a[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(4, s);
                }
            }

        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
