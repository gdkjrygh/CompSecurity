// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class x extends b
{

    public int a[];
    private int b;
    private String c;
    private int d;
    private String e;
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    public x()
    {
        b = 0;
        c = "";
        d = 0;
        e = "";
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = false;
        a = j.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int k = l;
        if ((b & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(1, c);
        }
        l = k;
        if ((b & 2) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(2, d);
        }
        k = l;
        if ((b & 4) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(3, e);
        }
        l = k;
        if ((b & 8) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(4, f);
        }
        k = l;
        if ((b & 0x10) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(5, g);
        }
        l = k;
        if ((b & 0x20) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(6, h);
        }
        int i1 = l;
        if ((b & 0x40) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.d(7, i);
        }
        k = i1;
        if ((b & 0x80) != 0)
        {
            k = i1 + (CodedOutputByteBufferNano.b(8) + 1);
        }
        l = k;
        if (a != null)
        {
            l = k;
            if (a.length > 0)
            {
                int j1 = 0;
                for (l = ((flag) ? 1 : 0); l < a.length; l++)
                {
                    j1 += CodedOutputByteBufferNano.a(a[l]);
                }

                l = k + j1 + a.length * 1;
            }
        }
        return l;
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

            case 16: // '\020'
                d = a1.e();
                b = b | 2;
                break;

            case 26: // '\032'
                e = a1.c();
                b = b | 4;
                break;

            case 32: // ' '
                f = a1.e();
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

            case 56: // '8'
                i = a1.e();
                b = b | 0x40;
                break;

            case 64: // '@'
                j = a1.b();
                b = b | 0x80;
                break;

            case 72: // 'H'
                int j1 = com.google.protobuf.nano.j.a(a1, 72);
                int ai[];
                int l;
                if (a == null)
                {
                    l = 0;
                } else
                {
                    l = a.length;
                }
                ai = new int[j1 + l];
                j1 = l;
                if (l != 0)
                {
                    System.arraycopy(a, 0, ai, 0, l);
                    j1 = l;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = a1.e();
                    a1.a();
                }

                ai[j1] = a1.e();
                a = ai;
                break;

            case 74: // 'J'
                int l1 = a1.c(a1.e());
                int i1 = a1.j();
                int k1;
                for (k1 = 0; a1.i() > 0; k1++)
                {
                    a1.e();
                }

                a1.e(i1);
                int ai1[];
                if (a == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = a.length;
                }
                ai1 = new int[k1 + i1];
                k1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, i1);
                    k1 = i1;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = a1.e();
                }

                a = ai1;
                a1.d(l1);
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
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, i);
        }
        if ((b & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, j);
        }
        if (a != null && a.length > 0)
        {
            for (int k = 0; k < a.length; k++)
            {
                codedoutputbytebuffernano.a(9, a[k]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
