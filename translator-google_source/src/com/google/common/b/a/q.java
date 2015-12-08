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
//            o, ab, p

public final class q extends b
{

    public o a[];
    public o b[];
    public o c[];
    public ab d[];
    public p e[];
    public p f[];

    public q()
    {
        a = com.google.common.b.a.o.a();
        b = com.google.common.b.a.o.a();
        c = com.google.common.b.a.o.a();
        d = com.google.common.b.a.ab.a();
        e = com.google.common.b.a.p.a();
        f = com.google.common.b.a.p.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int k = super.computeSerializedSize();
        int i = k;
        if (a != null)
        {
            i = k;
            if (a.length > 0)
            {
                i = k;
                for (k = 0; k < a.length;)
                {
                    o o1 = a[k];
                    int j1 = i;
                    if (o1 != null)
                    {
                        j1 = i + CodedOutputByteBufferNano.c(1, o1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                for (k = 0; k < b.length;)
                {
                    o o2 = b[k];
                    int k1 = i;
                    if (o2 != null)
                    {
                        k1 = i + CodedOutputByteBufferNano.c(2, o2);
                    }
                    k++;
                    i = k1;
                }

                k = i;
            }
        }
        i = k;
        if (c != null)
        {
            i = k;
            if (c.length > 0)
            {
                i = k;
                for (k = 0; k < c.length;)
                {
                    o o3 = c[k];
                    int l1 = i;
                    if (o3 != null)
                    {
                        l1 = i + CodedOutputByteBufferNano.c(3, o3);
                    }
                    k++;
                    i = l1;
                }

            }
        }
        k = i;
        if (d != null)
        {
            k = i;
            if (d.length > 0)
            {
                for (k = 0; k < d.length;)
                {
                    ab ab1 = d[k];
                    int i2 = i;
                    if (ab1 != null)
                    {
                        i2 = i + CodedOutputByteBufferNano.c(4, ab1);
                    }
                    k++;
                    i = i2;
                }

                k = i;
            }
        }
        i = k;
        if (e != null)
        {
            i = k;
            if (e.length > 0)
            {
                i = k;
                for (int l = 0; l < e.length;)
                {
                    p p1 = e[l];
                    int j2 = i;
                    if (p1 != null)
                    {
                        j2 = i + CodedOutputByteBufferNano.c(5, p1);
                    }
                    l++;
                    i = j2;
                }

            }
        }
        int k2 = i;
        if (f != null)
        {
            k2 = i;
            if (f.length > 0)
            {
                int i1 = ((flag) ? 1 : 0);
                do
                {
                    k2 = i;
                    if (i1 >= f.length)
                    {
                        break;
                    }
                    p p2 = f[i1];
                    k2 = i;
                    if (p2 != null)
                    {
                        k2 = i + CodedOutputByteBufferNano.c(6, p2);
                    }
                    i1++;
                    i = k2;
                } while (true);
            }
        }
        return k2;
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
                int i2 = j.a(a1, 10);
                o ao[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                ao = new o[i2 + k];
                i2 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, ao, 0, k);
                    i2 = k;
                }
                for (; i2 < ao.length - 1; i2++)
                {
                    ao[i2] = new o();
                    a1.a(ao[i2]);
                    a1.a();
                }

                ao[i2] = new o();
                a1.a(ao[i2]);
                a = ao;
                break;

            case 18: // '\022'
                int j2 = j.a(a1, 18);
                o ao1[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                ao1 = new o[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, ao1, 0, l);
                    j2 = l;
                }
                for (; j2 < ao1.length - 1; j2++)
                {
                    ao1[j2] = new o();
                    a1.a(ao1[j2]);
                    a1.a();
                }

                ao1[j2] = new o();
                a1.a(ao1[j2]);
                b = ao1;
                break;

            case 26: // '\032'
                int k2 = j.a(a1, 26);
                o ao2[];
                int i1;
                if (c == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = c.length;
                }
                ao2 = new o[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(c, 0, ao2, 0, i1);
                    k2 = i1;
                }
                for (; k2 < ao2.length - 1; k2++)
                {
                    ao2[k2] = new o();
                    a1.a(ao2[k2]);
                    a1.a();
                }

                ao2[k2] = new o();
                a1.a(ao2[k2]);
                c = ao2;
                break;

            case 34: // '"'
                int l2 = j.a(a1, 34);
                ab aab[];
                int j1;
                if (d == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = d.length;
                }
                aab = new ab[l2 + j1];
                l2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(d, 0, aab, 0, j1);
                    l2 = j1;
                }
                for (; l2 < aab.length - 1; l2++)
                {
                    aab[l2] = new ab();
                    a1.a(aab[l2]);
                    a1.a();
                }

                aab[l2] = new ab();
                a1.a(aab[l2]);
                d = aab;
                break;

            case 42: // '*'
                int i3 = j.a(a1, 42);
                p ap[];
                int k1;
                if (e == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = e.length;
                }
                ap = new p[i3 + k1];
                i3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(e, 0, ap, 0, k1);
                    i3 = k1;
                }
                for (; i3 < ap.length - 1; i3++)
                {
                    ap[i3] = new p();
                    a1.a(ap[i3]);
                    a1.a();
                }

                ap[i3] = new p();
                a1.a(ap[i3]);
                e = ap;
                break;

            case 50: // '2'
                int j3 = j.a(a1, 50);
                p ap1[];
                int l1;
                if (f == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = f.length;
                }
                ap1 = new p[j3 + l1];
                j3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(f, 0, ap1, 0, l1);
                    j3 = l1;
                }
                for (; j3 < ap1.length - 1; j3++)
                {
                    ap1[j3] = new p();
                    a1.a(ap1[j3]);
                    a1.a();
                }

                ap1[j3] = new p();
                a1.a(ap1[j3]);
                f = ap1;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                o o1 = a[i];
                if (o1 != null)
                {
                    codedoutputbytebuffernano.a(1, o1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int k = 0; k < b.length; k++)
            {
                o o2 = b[k];
                if (o2 != null)
                {
                    codedoutputbytebuffernano.a(2, o2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int l = 0; l < c.length; l++)
            {
                o o3 = c[l];
                if (o3 != null)
                {
                    codedoutputbytebuffernano.a(3, o3);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                ab ab1 = d[i1];
                if (ab1 != null)
                {
                    codedoutputbytebuffernano.a(4, ab1);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                p p1 = e[j1];
                if (p1 != null)
                {
                    codedoutputbytebuffernano.a(5, p1);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < f.length; k1++)
            {
                p p2 = f[k1];
                if (p2 != null)
                {
                    codedoutputbytebuffernano.a(6, p2);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
