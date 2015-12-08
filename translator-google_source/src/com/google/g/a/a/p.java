// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.g.a.a:
//            q

public final class p extends b
{

    private static volatile p e[];
    public String a;
    public String b[];
    public int c[];
    public q d[];
    private int f;
    private String g;
    private int h;
    private int i;
    private String j;
    private int k;
    private String l;
    private int m;

    public p()
    {
        f = 0;
        a = "";
        b = j.f;
        g = "";
        h = 0;
        i = 0;
        j = "";
        c = j.a;
        k = 0;
        l = "";
        m = 0;
        d = com.google.g.a.a.q.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static p[] a()
    {
        if (e == null)
        {
            synchronized (f.a)
            {
                if (e == null)
                {
                    e = new p[0];
                }
            }
        }
        return e;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((f & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                j1 = 0;
                int l1 = 0;
                int j2;
                int k2;
                for (j2 = 0; j1 < b.length; j2 = k2)
                {
                    String s = b[j1];
                    int l2 = l1;
                    k2 = j2;
                    if (s != null)
                    {
                        k2 = j2 + 1;
                        l2 = l1 + CodedOutputByteBufferNano.a(s);
                    }
                    j1++;
                    l1 = l2;
                }

                j1 = i1 + l1 + j2 * 1;
            }
        }
        i1 = j1;
        if ((f & 2) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, g);
        }
        j1 = i1;
        if ((f & 4) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(4, h);
        }
        int i2 = j1;
        if ((f & 8) != 0)
        {
            i2 = j1 + CodedOutputByteBufferNano.d(5, i);
        }
        i1 = i2;
        if ((f & 0x10) != 0)
        {
            i1 = i2 + CodedOutputByteBufferNano.b(6, j);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                j1 = 0;
                i2 = 0;
                for (; j1 < c.length; j1++)
                {
                    i2 += CodedOutputByteBufferNano.a(c[j1]);
                }

                j1 = i1 + i2 + c.length * 1;
            }
        }
        i1 = j1;
        if ((f & 0x20) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(8, k);
        }
        j1 = i1;
        if ((f & 0x40) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, l);
        }
        i1 = j1;
        if ((f & 0x80) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(10, m);
        }
        i2 = i1;
        if (d != null)
        {
            i2 = i1;
            if (d.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    i2 = i1;
                    if (k1 >= d.length)
                    {
                        break;
                    }
                    q q1 = d[k1];
                    i2 = i1;
                    if (q1 != null)
                    {
                        i2 = i1 + CodedOutputByteBufferNano.c(11, q1);
                    }
                    k1++;
                    i1 = i2;
                } while (true);
            }
        }
        return i2;
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
                a = a1.c();
                f = f | 1;
                break;

            case 18: // '\022'
                int j2 = com.google.protobuf.nano.j.a(a1, 18);
                String as[];
                int j1;
                if (b == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = b.length;
                }
                as = new String[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(b, 0, as, 0, j1);
                    j2 = j1;
                }
                for (; j2 < as.length - 1; j2++)
                {
                    as[j2] = a1.c();
                    a1.a();
                }

                as[j2] = a1.c();
                b = as;
                break;

            case 26: // '\032'
                g = a1.c();
                f = f | 2;
                break;

            case 32: // ' '
                h = a1.e();
                f = f | 4;
                break;

            case 40: // '('
                i = a1.e();
                f = f | 8;
                break;

            case 50: // '2'
                j = a1.c();
                f = f | 0x10;
                break;

            case 56: // '8'
                int k2 = com.google.protobuf.nano.j.a(a1, 56);
                int ai[];
                int k1;
                if (c == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = c.length;
                }
                ai = new int[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(c, 0, ai, 0, k1);
                    k2 = k1;
                }
                for (; k2 < ai.length - 1; k2++)
                {
                    ai[k2] = a1.e();
                    a1.a();
                }

                ai[k2] = a1.e();
                c = ai;
                break;

            case 58: // ':'
                int j3 = a1.c(a1.e());
                int l1 = a1.j();
                int l2;
                for (l2 = 0; a1.i() > 0; l2++)
                {
                    a1.e();
                }

                a1.e(l1);
                int ai1[];
                if (c == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = c.length;
                }
                ai1 = new int[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(c, 0, ai1, 0, l1);
                    l2 = l1;
                }
                for (; l2 < ai1.length; l2++)
                {
                    ai1[l2] = a1.e();
                }

                c = ai1;
                a1.d(j3);
                break;

            case 64: // '@'
                k = a1.e();
                f = f | 0x20;
                break;

            case 74: // 'J'
                l = a1.c();
                f = f | 0x40;
                break;

            case 80: // 'P'
                m = a1.e();
                f = f | 0x80;
                break;

            case 90: // 'Z'
                int i3 = com.google.protobuf.nano.j.a(a1, 90);
                q aq[];
                int i2;
                if (d == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = d.length;
                }
                aq = new q[i3 + i2];
                i3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(d, 0, aq, 0, i2);
                    i3 = i2;
                }
                for (; i3 < aq.length - 1; i3++)
                {
                    aq[i3] = new q();
                    a1.a(aq[i3]);
                    a1.a();
                }

                aq[i3] = new q();
                a1.a(aq[i3]);
                d = aq;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((f & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i1 = 0; i1 < b.length; i1++)
            {
                String s = b[i1];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(2, s);
                }
            }

        }
        if ((f & 2) != 0)
        {
            codedoutputbytebuffernano.a(3, g);
        }
        if ((f & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, h);
        }
        if ((f & 8) != 0)
        {
            codedoutputbytebuffernano.a(5, i);
        }
        if ((f & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(6, j);
        }
        if (c != null && c.length > 0)
        {
            for (int j1 = 0; j1 < c.length; j1++)
            {
                codedoutputbytebuffernano.a(7, c[j1]);
            }

        }
        if ((f & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(8, k);
        }
        if ((f & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(9, l);
        }
        if ((f & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(10, m);
        }
        if (d != null && d.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < d.length; k1++)
            {
                q q1 = d[k1];
                if (q1 != null)
                {
                    codedoutputbytebuffernano.a(11, q1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
