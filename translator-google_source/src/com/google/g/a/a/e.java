// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.g.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.g.a.a:
//            o, r, p, u, 
//            n, i, x, l, 
//            k, s, aa, y, 
//            c, t, f, d, 
//            v, m, j, b, 
//            z

public final class e extends b
{

    public String a;
    public o b[];
    public r c[];
    public u d;
    public p e[];
    public n f;
    public i g;
    public aa h;
    public y i;
    public x j;
    public t k;
    public m l;
    public l m;
    public k n;
    public s o;
    public c p;
    public f q;
    public d r;
    public v s;
    public com.google.g.a.a.j t;
    public com.google.g.a.a.b u;
    public z v;

    public e()
    {
        a = "";
        b = com.google.g.a.a.o.a();
        c = com.google.g.a.a.r.a();
        d = null;
        e = com.google.g.a.a.p.a();
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize() + CodedOutputByteBufferNano.b(1, a);
        int i1 = j1;
        if (b != null)
        {
            i1 = j1;
            if (b.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < b.length;)
                {
                    o o1 = b[j1];
                    int k1 = i1;
                    if (o1 != null)
                    {
                        k1 = i1 + CodedOutputByteBufferNano.c(2, o1);
                    }
                    j1++;
                    i1 = k1;
                }

            }
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                for (j1 = 0; j1 < c.length;)
                {
                    r r1 = c[j1];
                    int l1 = i1;
                    if (r1 != null)
                    {
                        l1 = i1 + CodedOutputByteBufferNano.c(4, r1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(5, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (i2 >= e.length)
                    {
                        break;
                    }
                    p p1 = e[i2];
                    j1 = i1;
                    if (p1 != null)
                    {
                        j1 = i1 + CodedOutputByteBufferNano.c(6, p1);
                    }
                    i2++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(7, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(8, g);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(9, j);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(10, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(11, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(12, o);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(13, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(14, i);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(15, p);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(16, k);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(17, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(18, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(19, s);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(20, l);
        }
        i1 = j1;
        if (t != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(21, t);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(22, u);
        }
        i1 = j1;
        if (v != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(23, v);
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
                a = a1.c();
                break;

            case 18: // '\022'
                int i2 = com.google.protobuf.nano.j.a(a1, 18);
                o ao[];
                int j1;
                if (b == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = b.length;
                }
                ao = new o[i2 + j1];
                i2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(b, 0, ao, 0, j1);
                    i2 = j1;
                }
                for (; i2 < ao.length - 1; i2++)
                {
                    ao[i2] = new o();
                    a1.a(ao[i2]);
                    a1.a();
                }

                ao[i2] = new o();
                a1.a(ao[i2]);
                b = ao;
                break;

            case 34: // '"'
                int j2 = com.google.protobuf.nano.j.a(a1, 34);
                r ar[];
                int k1;
                if (c == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = c.length;
                }
                ar = new r[j2 + k1];
                j2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(c, 0, ar, 0, k1);
                    j2 = k1;
                }
                for (; j2 < ar.length - 1; j2++)
                {
                    ar[j2] = new r();
                    a1.a(ar[j2]);
                    a1.a();
                }

                ar[j2] = new r();
                a1.a(ar[j2]);
                c = ar;
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new u();
                }
                a1.a(d);
                break;

            case 50: // '2'
                int k2 = com.google.protobuf.nano.j.a(a1, 50);
                p ap[];
                int l1;
                if (e == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = e.length;
                }
                ap = new p[k2 + l1];
                k2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(e, 0, ap, 0, l1);
                    k2 = l1;
                }
                for (; k2 < ap.length - 1; k2++)
                {
                    ap[k2] = new p();
                    a1.a(ap[k2]);
                    a1.a();
                }

                ap[k2] = new p();
                a1.a(ap[k2]);
                e = ap;
                break;

            case 58: // ':'
                if (f == null)
                {
                    f = new n();
                }
                a1.a(f);
                break;

            case 66: // 'B'
                if (g == null)
                {
                    g = new i();
                }
                a1.a(g);
                break;

            case 74: // 'J'
                if (j == null)
                {
                    j = new x();
                }
                a1.a(j);
                break;

            case 82: // 'R'
                if (m == null)
                {
                    m = new l();
                }
                a1.a(m);
                break;

            case 90: // 'Z'
                if (n == null)
                {
                    n = new k();
                }
                a1.a(n);
                break;

            case 98: // 'b'
                if (o == null)
                {
                    o = new s();
                }
                a1.a(o);
                break;

            case 106: // 'j'
                if (h == null)
                {
                    h = new aa();
                }
                a1.a(h);
                break;

            case 114: // 'r'
                if (i == null)
                {
                    i = new y();
                }
                a1.a(i);
                break;

            case 122: // 'z'
                if (p == null)
                {
                    p = new c();
                }
                a1.a(p);
                break;

            case 130: 
                if (k == null)
                {
                    k = new t();
                }
                a1.a(k);
                break;

            case 138: 
                if (q == null)
                {
                    q = new f();
                }
                a1.a(q);
                break;

            case 146: 
                if (r == null)
                {
                    r = new d();
                }
                a1.a(r);
                break;

            case 154: 
                if (s == null)
                {
                    s = new v();
                }
                a1.a(s);
                break;

            case 162: 
                if (l == null)
                {
                    l = new m();
                }
                a1.a(l);
                break;

            case 170: 
                if (t == null)
                {
                    t = new com.google.g.a.a.j();
                }
                a1.a(t);
                break;

            case 178: 
                if (u == null)
                {
                    u = new com.google.g.a.a.b();
                }
                a1.a(u);
                break;

            case 186: 
                if (v == null)
                {
                    v = new z();
                }
                a1.a(v);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        codedoutputbytebuffernano.a(1, a);
        if (b != null && b.length > 0)
        {
            for (int i1 = 0; i1 < b.length; i1++)
            {
                o o1 = b[i1];
                if (o1 != null)
                {
                    codedoutputbytebuffernano.a(2, o1);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j1 = 0; j1 < c.length; j1++)
            {
                r r1 = c[j1];
                if (r1 != null)
                {
                    codedoutputbytebuffernano.a(4, r1);
                }
            }

        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if (e != null && e.length > 0)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < e.length; k1++)
            {
                p p1 = e[k1];
                if (p1 != null)
                {
                    codedoutputbytebuffernano.a(6, p1);
                }
            }

        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(8, g);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(10, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(11, n);
        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(12, o);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(13, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(14, i);
        }
        if (p != null)
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(16, k);
        }
        if (q != null)
        {
            codedoutputbytebuffernano.a(17, q);
        }
        if (r != null)
        {
            codedoutputbytebuffernano.a(18, r);
        }
        if (s != null)
        {
            codedoutputbytebuffernano.a(19, s);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(20, l);
        }
        if (t != null)
        {
            codedoutputbytebuffernano.a(21, t);
        }
        if (u != null)
        {
            codedoutputbytebuffernano.a(22, u);
        }
        if (v != null)
        {
            codedoutputbytebuffernano.a(23, v);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
