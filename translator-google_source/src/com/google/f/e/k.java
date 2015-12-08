// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.e;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class k extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/e/k, 0x23e382L);
    private static final k i[] = new k[0];
    public int b;
    public String c;
    public String d[];
    public int e;
    public int f;
    public int g;
    public String h[];
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;

    public k()
    {
        b = 0;
        j = "";
        c = "";
        d = j.f;
        k = "";
        l = "";
        m = "";
        n = "";
        o = "";
        e = 0;
        f = 0;
        g = 0;
        h = j.f;
        p = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    public final k a(String s)
    {
        j = s;
        b = b | 1;
        return this;
    }

    public final k b(String s)
    {
        k = s;
        b = b | 4;
        return this;
    }

    public final k c(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            l = s;
            b = b | 8;
            return this;
        }
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((b & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(1, j);
        }
        j1 = i1;
        if ((b & 0x10) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, m);
        }
        i1 = j1;
        if ((b & 2) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int i2;
                int k2;
                for (i2 = 0; j1 < d.length; i2 = k2)
                {
                    String s = d[j1];
                    int i3 = k1;
                    k2 = i2;
                    if (s != null)
                    {
                        k2 = i2 + 1;
                        i3 = k1 + CodedOutputByteBufferNano.a(s);
                    }
                    j1++;
                    k1 = i3;
                }

                j1 = i1 + k1 + i2 * 1;
            }
        }
        i1 = j1;
        if ((b & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, k);
        }
        j1 = i1;
        if ((b & 8) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, l);
        }
        i1 = j1;
        if ((b & 0x20) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, n);
        }
        j1 = i1;
        if ((b & 0x40) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, o);
        }
        i1 = j1;
        if ((b & 0x80) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(12, e);
        }
        j1 = i1;
        if ((b & 0x100) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(13, f);
        }
        i1 = j1;
        if ((b & 0x200) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(14, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                int l1 = 0;
                int j2 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < h.length;)
                {
                    String s1 = h[j1];
                    int j3 = l1;
                    int l2 = j2;
                    if (s1 != null)
                    {
                        l2 = j2 + 1;
                        j3 = l1 + CodedOutputByteBufferNano.a(s1);
                    }
                    j1++;
                    l1 = j3;
                    j2 = l2;
                }

                j1 = i1 + l1 + j2 * 1;
            }
        }
        i1 = j1;
        if ((b & 0x400) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(16, p);
        }
        return i1;
    }

    public final k d(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            m = s;
            b = b | 0x10;
            return this;
        }
    }

    public final k e(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            n = s;
            b = b | 0x20;
            return this;
        }
    }

    public final k f(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            o = s;
            b = b | 0x40;
            return this;
        }
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                j = a1.c();
                b = b | 1;
                break;

            case 18: // '\022'
                m = a1.c();
                b = b | 0x10;
                break;

            case 34: // '"'
                c = a1.c();
                b = b | 2;
                break;

            case 42: // '*'
                int l1 = com.google.protobuf.nano.j.a(a1, 42);
                String as[];
                int j1;
                if (d == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = d.length;
                }
                as = new String[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(d, 0, as, 0, j1);
                    l1 = j1;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = a1.c();
                    a1.a();
                }

                as[l1] = a1.c();
                d = as;
                break;

            case 66: // 'B'
                k = a1.c();
                b = b | 4;
                break;

            case 74: // 'J'
                l = a1.c();
                b = b | 8;
                break;

            case 82: // 'R'
                n = a1.c();
                b = b | 0x20;
                break;

            case 90: // 'Z'
                o = a1.c();
                b = b | 0x40;
                break;

            case 96: // '`'
                e = a1.e();
                b = b | 0x80;
                break;

            case 104: // 'h'
                f = a1.e();
                b = b | 0x100;
                break;

            case 112: // 'p'
                g = a1.e();
                b = b | 0x200;
                break;

            case 122: // 'z'
                int i2 = com.google.protobuf.nano.j.a(a1, 122);
                String as1[];
                int k1;
                if (h == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = h.length;
                }
                as1 = new String[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(h, 0, as1, 0, k1);
                    i2 = k1;
                }
                for (; i2 < as1.length - 1; i2++)
                {
                    as1[i2] = a1.c();
                    a1.a();
                }

                as1[i2] = a1.c();
                h = as1;
                break;

            case 130: 
                p = a1.c();
                b = b | 0x400;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, j);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(2, m);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(4, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                String s = d[i1];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(5, s);
                }
            }

        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(8, k);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(9, l);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(10, n);
        }
        if ((b & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(11, o);
        }
        if ((b & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(12, e);
        }
        if ((b & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(13, f);
        }
        if ((b & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(14, g);
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < h.length; j1++)
            {
                String s1 = h[j1];
                if (s1 != null)
                {
                    codedoutputbytebuffernano.a(15, s1);
                }
            }

        }
        if ((b & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(16, p);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
