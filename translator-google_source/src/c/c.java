// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;

import com.google.f.a.e;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class c extends b
{

    private static volatile c g[];
    public String a;
    public String b;
    public c c[];
    public c.a.b d[];
    public c.a.b e[];
    public e f;
    private int h;
    private String i;
    private float j;
    private String k;

    public c()
    {
        h = 0;
        a = "";
        b = "";
        i = "";
        j = -1F;
        c = a();
        d = c.a.b.a();
        k = "";
        e = c.a.b.a();
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static c[] a()
    {
        if (g == null)
        {
            synchronized (f.a)
            {
                if (g == null)
                {
                    g = new c[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize() + CodedOutputByteBufferNano.b(1, a) + CodedOutputByteBufferNano.b(2, b);
        int i1 = l;
        if ((h & 2) != 0)
        {
            i1 = l + (CodedOutputByteBufferNano.b(3) + 4);
        }
        l = i1;
        if ((h & 1) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.b(4, i);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l;
            if (c.length > 0)
            {
                for (i1 = 0; i1 < c.length;)
                {
                    c c1 = c[i1];
                    int j1 = l;
                    if (c1 != null)
                    {
                        j1 = l + CodedOutputByteBufferNano.c(5, c1);
                    }
                    i1++;
                    l = j1;
                }

                i1 = l;
            }
        }
        int k1 = i1;
        if (d != null)
        {
            k1 = i1;
            if (d.length > 0)
            {
                l = i1;
                for (i1 = 0; i1 < d.length;)
                {
                    c.a.b b1 = d[i1];
                    k1 = l;
                    if (b1 != null)
                    {
                        k1 = l + CodedOutputByteBufferNano.c(7, b1);
                    }
                    i1++;
                    l = k1;
                }

                k1 = l;
            }
        }
        l = k1;
        if ((h & 4) != 0)
        {
            l = k1 + CodedOutputByteBufferNano.b(8, k);
        }
        i1 = l;
        if (e != null)
        {
            i1 = l;
            if (e.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    i1 = l;
                    if (l1 >= e.length)
                    {
                        break;
                    }
                    c.a.b b2 = e[l1];
                    i1 = l;
                    if (b2 != null)
                    {
                        i1 = l + CodedOutputByteBufferNano.c(9, b2);
                    }
                    l1++;
                    l = i1;
                } while (true);
            }
        }
        l = i1;
        if (f != null)
        {
            l = i1 + CodedOutputByteBufferNano.c(18, f);
        }
        return l;
    }

    public final g mergeFrom(a a1)
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
                a = a1.c();
                break;

            case 18: // '\022'
                b = a1.c();
                break;

            case 29: // '\035'
                j = Float.intBitsToFloat(a1.g());
                h = h | 2;
                break;

            case 34: // '"'
                i = a1.c();
                h = h | 1;
                break;

            case 42: // '*'
                int l1 = com.google.protobuf.nano.j.a(a1, 42);
                c ac[];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                ac = new c[l1 + i1];
                l1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, ac, 0, i1);
                    l1 = i1;
                }
                for (; l1 < ac.length - 1; l1++)
                {
                    ac[l1] = new c();
                    a1.a(ac[l1]);
                    a1.a();
                }

                ac[l1] = new c();
                a1.a(ac[l1]);
                c = ac;
                break;

            case 58: // ':'
                int i2 = com.google.protobuf.nano.j.a(a1, 58);
                c.a.b ab[];
                int j1;
                if (d == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = d.length;
                }
                ab = new c.a.b[i2 + j1];
                i2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(d, 0, ab, 0, j1);
                    i2 = j1;
                }
                for (; i2 < ab.length - 1; i2++)
                {
                    ab[i2] = new c.a.b();
                    a1.a(ab[i2]);
                    a1.a();
                }

                ab[i2] = new c.a.b();
                a1.a(ab[i2]);
                d = ab;
                break;

            case 66: // 'B'
                k = a1.c();
                h = h | 4;
                break;

            case 74: // 'J'
                int j2 = com.google.protobuf.nano.j.a(a1, 74);
                c.a.b ab1[];
                int k1;
                if (e == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = e.length;
                }
                ab1 = new c.a.b[j2 + k1];
                j2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(e, 0, ab1, 0, k1);
                    j2 = k1;
                }
                for (; j2 < ab1.length - 1; j2++)
                {
                    ab1[j2] = new c.a.b();
                    a1.a(ab1[j2]);
                    a1.a();
                }

                ab1[j2] = new c.a.b();
                a1.a(ab1[j2]);
                e = ab1;
                break;

            case 146: 
                if (f == null)
                {
                    f = new e();
                }
                a1.a(f);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        codedoutputbytebuffernano.a(1, a);
        codedoutputbytebuffernano.a(2, b);
        if ((h & 2) != 0)
        {
            codedoutputbytebuffernano.a(3, j);
        }
        if ((h & 1) != 0)
        {
            codedoutputbytebuffernano.a(4, i);
        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                c c1 = c[l];
                if (c1 != null)
                {
                    codedoutputbytebuffernano.a(5, c1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                c.a.b b1 = d[i1];
                if (b1 != null)
                {
                    codedoutputbytebuffernano.a(7, b1);
                }
            }

        }
        if ((h & 4) != 0)
        {
            codedoutputbytebuffernano.a(8, k);
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < e.length; j1++)
            {
                c.a.b b2 = e[j1];
                if (b2 != null)
                {
                    codedoutputbytebuffernano.a(9, b2);
                }
            }

        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(18, f);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
