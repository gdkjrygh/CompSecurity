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

// Referenced classes of package com.google.f.e:
//            i, j

public final class o extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/f/e/o, 0x23c442L);
    private static final o f[] = new o[0];
    public i b[];
    public com.google.f.e.j c;
    public com.google.f.e.j d[];
    public com.google.f.e.j e;
    private int g;
    private String h;
    private String i;
    private String j;
    private String k;
    private boolean l;
    private String m;

    public o()
    {
        g = 0;
        b = com.google.f.e.i.a();
        c = null;
        d = com.google.f.e.j.a();
        e = null;
        h = "";
        i = "";
        j = "";
        k = "";
        l = true;
        m = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    public final o a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            h = s;
            g = g | 1;
            return this;
        }
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int k1 = super.computeSerializedSize();
        int l1 = k1;
        if (c != null)
        {
            l1 = k1 + CodedOutputByteBufferNano.c(2, c);
        }
        k1 = l1;
        if (e != null)
        {
            k1 = l1 + CodedOutputByteBufferNano.c(3, e);
        }
        l1 = k1;
        if (d != null)
        {
            l1 = k1;
            if (d.length > 0)
            {
                for (l1 = 0; l1 < d.length;)
                {
                    com.google.f.e.j j1 = d[l1];
                    int i2 = k1;
                    if (j1 != null)
                    {
                        i2 = k1 + CodedOutputByteBufferNano.c(4, j1);
                    }
                    l1++;
                    k1 = i2;
                }

                l1 = k1;
            }
        }
        k1 = l1;
        if ((g & 1) != 0)
        {
            k1 = l1 + CodedOutputByteBufferNano.b(5, h);
        }
        l1 = k1;
        if ((g & 4) != 0)
        {
            l1 = k1 + CodedOutputByteBufferNano.b(6, j);
        }
        k1 = l1;
        if ((g & 8) != 0)
        {
            k1 = l1 + CodedOutputByteBufferNano.b(8, k);
        }
        l1 = k1;
        if (b != null)
        {
            l1 = k1;
            if (b.length > 0)
            {
                int j2 = ((flag) ? 1 : 0);
                do
                {
                    l1 = k1;
                    if (j2 >= b.length)
                    {
                        break;
                    }
                    i i1 = b[j2];
                    l1 = k1;
                    if (i1 != null)
                    {
                        l1 = k1 + CodedOutputByteBufferNano.c(9, i1);
                    }
                    j2++;
                    k1 = l1;
                } while (true);
            }
        }
        k1 = l1;
        if ((g & 2) != 0)
        {
            k1 = l1 + CodedOutputByteBufferNano.b(12, i);
        }
        l1 = k1;
        if ((g & 0x10) != 0)
        {
            l1 = k1 + (CodedOutputByteBufferNano.b(13) + 1);
        }
        k1 = l1;
        if ((g & 0x20) != 0)
        {
            k1 = l1 + CodedOutputByteBufferNano.b(14, m);
        }
        return k1;
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

            case 18: // '\022'
                if (c == null)
                {
                    c = new com.google.f.e.j();
                }
                a1.a(c);
                break;

            case 26: // '\032'
                if (e == null)
                {
                    e = new com.google.f.e.j();
                }
                a1.a(e);
                break;

            case 34: // '"'
                int l1 = com.google.protobuf.nano.j.a(a1, 34);
                com.google.f.e.j aj[];
                int j1;
                if (d == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = d.length;
                }
                aj = new com.google.f.e.j[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(d, 0, aj, 0, j1);
                    l1 = j1;
                }
                for (; l1 < aj.length - 1; l1++)
                {
                    aj[l1] = new com.google.f.e.j();
                    a1.a(aj[l1]);
                    a1.a();
                }

                aj[l1] = new com.google.f.e.j();
                a1.a(aj[l1]);
                d = aj;
                break;

            case 42: // '*'
                h = a1.c();
                g = g | 1;
                break;

            case 50: // '2'
                j = a1.c();
                g = g | 4;
                break;

            case 66: // 'B'
                k = a1.c();
                g = g | 8;
                break;

            case 74: // 'J'
                int i2 = com.google.protobuf.nano.j.a(a1, 74);
                i ai[];
                int k1;
                if (b == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = b.length;
                }
                ai = new i[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(b, 0, ai, 0, k1);
                    i2 = k1;
                }
                for (; i2 < ai.length - 1; i2++)
                {
                    ai[i2] = new i();
                    a1.a(ai[i2]);
                    a1.a();
                }

                ai[i2] = new i();
                a1.a(ai[i2]);
                b = ai;
                break;

            case 98: // 'b'
                i = a1.c();
                g = g | 2;
                break;

            case 104: // 'h'
                l = a1.b();
                g = g | 0x10;
                break;

            case 114: // 'r'
                m = a1.c();
                g = g | 0x20;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        if (d != null && d.length > 0)
        {
            for (int k1 = 0; k1 < d.length; k1++)
            {
                com.google.f.e.j j1 = d[k1];
                if (j1 != null)
                {
                    codedoutputbytebuffernano.a(4, j1);
                }
            }

        }
        if ((g & 1) != 0)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        if ((g & 4) != 0)
        {
            codedoutputbytebuffernano.a(6, j);
        }
        if ((g & 8) != 0)
        {
            codedoutputbytebuffernano.a(8, k);
        }
        if (b != null && b.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < b.length; l1++)
            {
                i i1 = b[l1];
                if (i1 != null)
                {
                    codedoutputbytebuffernano.a(9, i1);
                }
            }

        }
        if ((g & 2) != 0)
        {
            codedoutputbytebuffernano.a(12, i);
        }
        if ((g & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(13, l);
        }
        if ((g & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(14, m);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
