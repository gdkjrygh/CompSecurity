// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class m extends b
{

    public String a;
    public String b[];
    public String c[];
    public String d;
    public int e;
    public boolean f;
    private int g;
    private boolean h;
    private int i;
    private int j;

    public m()
    {
        g = 0;
        a = "";
        h = false;
        b = j.f;
        c = j.f;
        d = "";
        i = 0;
        j = 0;
        e = 0;
        f = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public final m a()
    {
        i = 10000;
        g = g | 8;
        return this;
    }

    public final m a(int k)
    {
        e = k;
        g = g | 0x20;
        return this;
    }

    public final m a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            a = s;
            g = g | 1;
            return this;
        }
    }

    public final m a(boolean flag)
    {
        h = flag;
        g = g | 2;
        return this;
    }

    public final m b()
    {
        j = 20000;
        g = g | 0x10;
        return this;
    }

    public final m b(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            d = s;
            g = g | 4;
            return this;
        }
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int k = l;
        if ((g & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(1, a);
        }
        l = k;
        if (b != null)
        {
            l = k;
            if (b.length > 0)
            {
                l = 0;
                int i1 = 0;
                int k1;
                int i2;
                for (k1 = 0; l < b.length; k1 = i2)
                {
                    String s = b[l];
                    int k2 = i1;
                    i2 = k1;
                    if (s != null)
                    {
                        i2 = k1 + 1;
                        k2 = i1 + CodedOutputByteBufferNano.a(s);
                    }
                    l++;
                    i1 = k2;
                }

                l = k + i1 + k1 * 1;
            }
        }
        k = l;
        if (c != null)
        {
            k = l;
            if (c.length > 0)
            {
                int j1 = 0;
                int l1 = 0;
                for (k = ((flag) ? 1 : 0); k < c.length;)
                {
                    String s1 = c[k];
                    int l2 = j1;
                    int j2 = l1;
                    if (s1 != null)
                    {
                        j2 = l1 + 1;
                        l2 = j1 + CodedOutputByteBufferNano.a(s1);
                    }
                    k++;
                    j1 = l2;
                    l1 = j2;
                }

                k = l + j1 + l1 * 1;
            }
        }
        l = k;
        if ((g & 4) != 0)
        {
            l = k + CodedOutputByteBufferNano.b(4, d);
        }
        k = l;
        if ((g & 8) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(5, i);
        }
        l = k;
        if ((g & 0x10) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(6, j);
        }
        k = l;
        if ((g & 0x20) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(7, e);
        }
        l = k;
        if ((g & 0x40) != 0)
        {
            l = k + (CodedOutputByteBufferNano.b(8) + 1);
        }
        k = l;
        if ((g & 2) != 0)
        {
            k = l + (CodedOutputByteBufferNano.b(9) + 1);
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
                a = a1.c();
                g = g | 1;
                break;

            case 18: // '\022'
                int j1 = com.google.protobuf.nano.j.a(a1, 18);
                String as[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                as = new String[j1 + l];
                j1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, as, 0, l);
                    j1 = l;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = a1.c();
                    a1.a();
                }

                as[j1] = a1.c();
                b = as;
                break;

            case 26: // '\032'
                int k1 = com.google.protobuf.nano.j.a(a1, 26);
                String as1[];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                as1 = new String[k1 + i1];
                k1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, as1, 0, i1);
                    k1 = i1;
                }
                for (; k1 < as1.length - 1; k1++)
                {
                    as1[k1] = a1.c();
                    a1.a();
                }

                as1[k1] = a1.c();
                c = as1;
                break;

            case 34: // '"'
                d = a1.c();
                g = g | 4;
                break;

            case 40: // '('
                i = a1.e();
                g = g | 8;
                break;

            case 48: // '0'
                j = a1.e();
                g = g | 0x10;
                break;

            case 56: // '8'
                e = a1.e();
                g = g | 0x20;
                break;

            case 64: // '@'
                f = a1.b();
                g = g | 0x40;
                break;

            case 72: // 'H'
                h = a1.b();
                g = g | 2;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((g & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int k = 0; k < b.length; k++)
            {
                String s = b[k];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(2, s);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < c.length; l++)
            {
                String s1 = c[l];
                if (s1 != null)
                {
                    codedoutputbytebuffernano.a(3, s1);
                }
            }

        }
        if ((g & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, d);
        }
        if ((g & 8) != 0)
        {
            codedoutputbytebuffernano.a(5, i);
        }
        if ((g & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(6, j);
        }
        if ((g & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(7, e);
        }
        if ((g & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(8, f);
        }
        if ((g & 2) != 0)
        {
            codedoutputbytebuffernano.a(9, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
