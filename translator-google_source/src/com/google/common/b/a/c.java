// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.common.b.a:
//            i, m, g, z, 
//            k, q, ac

public final class c extends b
{

    public com.google.common.b.a.g a;
    public z b;
    public String c[];
    public k d;
    public i e[];
    public q f;
    public m g[];
    public ac h;

    public c()
    {
        a = null;
        b = null;
        c = j.f;
        d = null;
        e = com.google.common.b.a.i.a();
        f = null;
        g = com.google.common.b.a.m.a();
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public final c a(a a1)
    {
        do
        {
            int l = a1.a();
            switch (l)
            {
            default:
                if (super.storeUnknownField(a1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new com.google.common.b.a.g();
                }
                a1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new z();
                }
                a1.a(b);
                break;

            case 26: // '\032'
                int l1 = j.a(a1, 26);
                String as[];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                as = new String[l1 + i1];
                l1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, as, 0, i1);
                    l1 = i1;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = a1.c();
                    a1.a();
                }

                as[l1] = a1.c();
                c = as;
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new k();
                }
                a1.a(d);
                break;

            case 42: // '*'
                int i2 = j.a(a1, 42);
                i ai[];
                int j1;
                if (e == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = e.length;
                }
                ai = new i[i2 + j1];
                i2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(e, 0, ai, 0, j1);
                    i2 = j1;
                }
                for (; i2 < ai.length - 1; i2++)
                {
                    ai[i2] = new i();
                    a1.a(ai[i2]);
                    a1.a();
                }

                ai[i2] = new i();
                a1.a(ai[i2]);
                e = ai;
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new q();
                }
                a1.a(f);
                break;

            case 58: // ':'
                int j2 = j.a(a1, 58);
                m am[];
                int k1;
                if (g == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = g.length;
                }
                am = new m[j2 + k1];
                j2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(g, 0, am, 0, k1);
                    j2 = k1;
                }
                for (; j2 < am.length - 1; j2++)
                {
                    am[j2] = new m();
                    a1.a(am[j2]);
                    a1.a();
                }

                am[j2] = new m();
                a1.a(am[j2]);
                g = am;
                break;

            case 66: // 'B'
                if (h == null)
                {
                    h = new ac();
                }
                a1.a(h);
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if (a != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(1, a);
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int j2;
                int k2;
                for (j2 = 0; j1 < c.length; j2 = k2)
                {
                    String s = c[j1];
                    int l2 = k1;
                    k2 = j2;
                    if (s != null)
                    {
                        k2 = j2 + 1;
                        l2 = k1 + CodedOutputByteBufferNano.a(s);
                    }
                    j1++;
                    k1 = l2;
                }

                j1 = i1 + k1 + j2 * 1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    i l = e[j1];
                    int l1 = i1;
                    if (l != null)
                    {
                        l1 = i1 + CodedOutputByteBufferNano.c(5, l);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(6, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= g.length)
                    {
                        break;
                    }
                    m m1 = g[i2];
                    j1 = i1;
                    if (m1 != null)
                    {
                        j1 = i1 + CodedOutputByteBufferNano.c(7, m1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(8, h);
        }
        return i1;
    }

    public final g mergeFrom(a a1)
    {
        return a(a1);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (a != null)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                String s = c[i1];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(3, s);
                }
            }

        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(4, d);
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                i l = e[j1];
                if (l != null)
                {
                    codedoutputbytebuffernano.a(5, l);
                }
            }

        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(6, f);
        }
        if (g != null && g.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < g.length; k1++)
            {
                m m1 = g[k1];
                if (m1 != null)
                {
                    codedoutputbytebuffernano.a(7, m1);
                }
            }

        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(8, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
