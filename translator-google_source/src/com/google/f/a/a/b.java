// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.a.a:
//            c

public final class b extends com.google.protobuf.nano.b
{

    private boolean A;
    private String B;
    public String a[];
    public String b[];
    public String c[];
    public c d[];
    private int e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private String j;
    private String k;
    private int l;
    private int m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private boolean s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public b()
    {
        e = 0;
        f = "";
        g = "";
        h = "";
        i = false;
        j = "";
        k = "";
        l = 0;
        m = 0;
        n = "";
        o = "";
        p = "";
        a = j.f;
        b = j.f;
        q = "";
        r = "";
        s = false;
        t = "";
        c = j.f;
        u = "";
        v = "";
        w = "";
        x = "";
        y = "";
        d = com.google.f.a.a.c.a();
        z = "";
        A = false;
        B = "";
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((e & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(1, f);
        }
        j1 = i1;
        if ((e & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, g);
        }
        i1 = j1;
        if ((e & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, h);
        }
        j1 = i1;
        if ((e & 8) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(4) + 1);
        }
        i1 = j1;
        if ((e & 0x10) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(5, j);
        }
        j1 = i1;
        if ((e & 0x20) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(6, k);
        }
        i1 = j1;
        if ((e & 0x40) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(7, l);
        }
        j1 = i1;
        if ((e & 0x80) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(8, m);
        }
        i1 = j1;
        if ((e & 0x100) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, n);
        }
        j1 = i1;
        if ((e & 0x800) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, q);
        }
        i1 = j1;
        if ((e & 0x1000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, r);
        }
        j1 = i1;
        if ((e & 0x2000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(12) + 1);
        }
        i1 = j1;
        if ((e & 0x4000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, t);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                j1 = 0;
                int k1 = 0;
                int k2;
                int j3;
                for (k2 = 0; j1 < c.length; k2 = j3)
                {
                    String s1 = c[j1];
                    int i4 = k1;
                    j3 = k2;
                    if (s1 != null)
                    {
                        j3 = k2 + 1;
                        i4 = k1 + CodedOutputByteBufferNano.a(s1);
                    }
                    j1++;
                    k1 = i4;
                }

                j1 = i1 + k1 + k2 * 1;
            }
        }
        i1 = j1;
        if ((e & 0x8000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(15, u);
        }
        j1 = i1;
        if ((e & 0x10000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(16, v);
        }
        i1 = j1;
        if ((e & 0x20000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(17, w);
        }
        j1 = i1;
        if ((e & 0x40000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(18, x);
        }
        i1 = j1;
        if ((e & 0x80000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(19, y);
        }
        j1 = i1;
        if ((e & 0x200) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(20, o);
        }
        i1 = j1;
        if ((e & 0x400) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(21, p);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                for (j1 = 0; j1 < d.length;)
                {
                    c c1 = d[j1];
                    int l1 = i1;
                    if (c1 != null)
                    {
                        l1 = i1 + CodedOutputByteBufferNano.c(22, c1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (a != null)
        {
            i1 = j1;
            if (a.length > 0)
            {
                i1 = 0;
                int i2 = 0;
                int l2;
                int k3;
                for (l2 = 0; i1 < a.length; l2 = k3)
                {
                    String s2 = a[i1];
                    int j4 = i2;
                    k3 = l2;
                    if (s2 != null)
                    {
                        k3 = l2 + 1;
                        j4 = i2 + CodedOutputByteBufferNano.a(s2);
                    }
                    i1++;
                    i2 = j4;
                }

                i1 = j1 + i2 + l2 * 2;
            }
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1;
            if (b.length > 0)
            {
                int j2 = 0;
                int i3 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < b.length;)
                {
                    String s3 = b[j1];
                    int k4 = j2;
                    int l3 = i3;
                    if (s3 != null)
                    {
                        l3 = i3 + 1;
                        k4 = j2 + CodedOutputByteBufferNano.a(s3);
                    }
                    j1++;
                    j2 = k4;
                    i3 = l3;
                }

                j1 = i1 + j2 + i3 * 2;
            }
        }
        i1 = j1;
        if ((e & 0x100000) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(25, z);
        }
        j1 = i1;
        if ((e & 0x400000) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(26, B);
        }
        i1 = j1;
        if ((e & 0x200000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(27) + 1);
        }
        return i1;
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
                f = a1.c();
                e = e | 1;
                break;

            case 18: // '\022'
                g = a1.c();
                e = e | 2;
                break;

            case 26: // '\032'
                h = a1.c();
                e = e | 4;
                break;

            case 32: // ' '
                i = a1.b();
                e = e | 8;
                break;

            case 42: // '*'
                j = a1.c();
                e = e | 0x10;
                break;

            case 50: // '2'
                k = a1.c();
                e = e | 0x20;
                break;

            case 56: // '8'
                l = a1.e();
                e = e | 0x40;
                break;

            case 64: // '@'
                m = a1.e();
                e = e | 0x80;
                break;

            case 74: // 'J'
                n = a1.c();
                e = e | 0x100;
                break;

            case 82: // 'R'
                q = a1.c();
                e = e | 0x800;
                break;

            case 90: // 'Z'
                r = a1.c();
                e = e | 0x1000;
                break;

            case 96: // '`'
                s = a1.b();
                e = e | 0x2000;
                break;

            case 106: // 'j'
                t = a1.c();
                e = e | 0x4000;
                break;

            case 114: // 'r'
                int j2 = com.google.protobuf.nano.j.a(a1, 114);
                String as[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                as = new String[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, as, 0, j1);
                    j2 = j1;
                }
                for (; j2 < as.length - 1; j2++)
                {
                    as[j2] = a1.c();
                    a1.a();
                }

                as[j2] = a1.c();
                c = as;
                break;

            case 122: // 'z'
                u = a1.c();
                e = e | 0x8000;
                break;

            case 130: 
                v = a1.c();
                e = e | 0x10000;
                break;

            case 138: 
                w = a1.c();
                e = e | 0x20000;
                break;

            case 146: 
                x = a1.c();
                e = e | 0x40000;
                break;

            case 154: 
                y = a1.c();
                e = e | 0x80000;
                break;

            case 162: 
                o = a1.c();
                e = e | 0x200;
                break;

            case 170: 
                p = a1.c();
                e = e | 0x400;
                break;

            case 178: 
                int k2 = com.google.protobuf.nano.j.a(a1, 178);
                c ac[];
                int k1;
                if (d == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = d.length;
                }
                ac = new c[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(d, 0, ac, 0, k1);
                    k2 = k1;
                }
                for (; k2 < ac.length - 1; k2++)
                {
                    ac[k2] = new c();
                    a1.a(ac[k2]);
                    a1.a();
                }

                ac[k2] = new c();
                a1.a(ac[k2]);
                d = ac;
                break;

            case 186: 
                int l2 = com.google.protobuf.nano.j.a(a1, 186);
                String as1[];
                int l1;
                if (a == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = a.length;
                }
                as1 = new String[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(a, 0, as1, 0, l1);
                    l2 = l1;
                }
                for (; l2 < as1.length - 1; l2++)
                {
                    as1[l2] = a1.c();
                    a1.a();
                }

                as1[l2] = a1.c();
                a = as1;
                break;

            case 194: 
                int i3 = com.google.protobuf.nano.j.a(a1, 194);
                String as2[];
                int i2;
                if (b == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = b.length;
                }
                as2 = new String[i3 + i2];
                i3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(b, 0, as2, 0, i2);
                    i3 = i2;
                }
                for (; i3 < as2.length - 1; i3++)
                {
                    as2[i3] = a1.c();
                    a1.a();
                }

                as2[i3] = a1.c();
                b = as2;
                break;

            case 202: 
                z = a1.c();
                e = e | 0x100000;
                break;

            case 210: 
                B = a1.c();
                e = e | 0x400000;
                break;

            case 216: 
                A = a1.b();
                e = e | 0x200000;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((e & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, f);
        }
        if ((e & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, g);
        }
        if ((e & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, h);
        }
        if ((e & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, i);
        }
        if ((e & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, j);
        }
        if ((e & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, k);
        }
        if ((e & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, l);
        }
        if ((e & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, m);
        }
        if ((e & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(9, n);
        }
        if ((e & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(10, q);
        }
        if ((e & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(11, r);
        }
        if ((e & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(12, s);
        }
        if ((e & 0x4000) != 0)
        {
            codedoutputbytebuffernano.a(13, t);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = 0; i1 < c.length; i1++)
            {
                String s1 = c[i1];
                if (s1 != null)
                {
                    codedoutputbytebuffernano.a(14, s1);
                }
            }

        }
        if ((e & 0x8000) != 0)
        {
            codedoutputbytebuffernano.a(15, u);
        }
        if ((e & 0x10000) != 0)
        {
            codedoutputbytebuffernano.a(16, v);
        }
        if ((e & 0x20000) != 0)
        {
            codedoutputbytebuffernano.a(17, w);
        }
        if ((e & 0x40000) != 0)
        {
            codedoutputbytebuffernano.a(18, x);
        }
        if ((e & 0x80000) != 0)
        {
            codedoutputbytebuffernano.a(19, y);
        }
        if ((e & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(20, o);
        }
        if ((e & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(21, p);
        }
        if (d != null && d.length > 0)
        {
            for (int j1 = 0; j1 < d.length; j1++)
            {
                c c1 = d[j1];
                if (c1 != null)
                {
                    codedoutputbytebuffernano.a(22, c1);
                }
            }

        }
        if (a != null && a.length > 0)
        {
            for (int k1 = 0; k1 < a.length; k1++)
            {
                String s2 = a[k1];
                if (s2 != null)
                {
                    codedoutputbytebuffernano.a(23, s2);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < b.length; l1++)
            {
                String s3 = b[l1];
                if (s3 != null)
                {
                    codedoutputbytebuffernano.a(24, s3);
                }
            }

        }
        if ((e & 0x100000) != 0)
        {
            codedoutputbytebuffernano.a(25, z);
        }
        if ((e & 0x400000) != 0)
        {
            codedoutputbytebuffernano.a(26, B);
        }
        if ((e & 0x200000) != 0)
        {
            codedoutputbytebuffernano.a(27, A);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
