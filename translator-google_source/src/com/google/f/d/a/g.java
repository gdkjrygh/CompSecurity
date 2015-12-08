// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.d.a:
//            f, e, m

public final class g extends b
{

    public f a[];
    public com.google.f.b.a.b b;
    public com.google.f.b.a.b c;
    public com.google.f.b.a.b d;
    public com.google.f.b.b.a.b e[];
    public com.google.f.d.a.a.b f;
    public e g[];
    public m h[];
    private int i;
    private long j;
    private long k;
    private float l;
    private boolean m;
    private long n;
    private long o;
    private byte p[];

    public g()
    {
        i = 0;
        a = com.google.f.d.a.f.a();
        j = 0L;
        k = 0L;
        b = null;
        c = null;
        d = null;
        e = com.google.f.b.b.a.b.a();
        f = null;
        l = 0.0F;
        m = false;
        n = 0L;
        o = 0L;
        p = j.h;
        g = com.google.f.d.a.e.a();
        h = com.google.f.d.a.m.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1;
            if (a.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < a.length;)
                {
                    f f1 = a[j1];
                    int i2 = i1;
                    if (f1 != null)
                    {
                        i2 = i1 + CodedOutputByteBufferNano.c(1, f1);
                    }
                    j1++;
                    i1 = i2;
                }

            }
        }
        j1 = i1;
        if ((i & 1) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(2, j);
        }
        i1 = j1;
        if ((i & 2) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(3, k);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(4, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(5, c);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                for (j1 = 0; j1 < e.length;)
                {
                    com.google.f.b.b.a.b b1 = e[j1];
                    int j2 = i1;
                    if (b1 != null)
                    {
                        j2 = i1 + CodedOutputByteBufferNano.c(6, b1);
                    }
                    j1++;
                    i1 = j2;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(7, f);
        }
        j1 = i1;
        if ((i & 4) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(8) + 4);
        }
        i1 = j1;
        if ((i & 8) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(9) + 1);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(10, d);
        }
        i1 = j1;
        if ((i & 0x10) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(11, n);
        }
        int k2 = i1;
        if ((i & 0x20) != 0)
        {
            k2 = i1 + CodedOutputByteBufferNano.d(12, o);
        }
        j1 = k2;
        if ((i & 0x40) != 0)
        {
            j1 = k2 + CodedOutputByteBufferNano.b(13, p);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1;
            if (g.length > 0)
            {
                i1 = j1;
                for (int k1 = 0; k1 < g.length;)
                {
                    e e1 = g[k1];
                    k2 = i1;
                    if (e1 != null)
                    {
                        k2 = i1 + CodedOutputByteBufferNano.c(14, e1);
                    }
                    k1++;
                    i1 = k2;
                }

            }
        }
        k2 = i1;
        if (h != null)
        {
            k2 = i1;
            if (h.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    k2 = i1;
                    if (l1 >= h.length)
                    {
                        break;
                    }
                    m m1 = h[l1];
                    k2 = i1;
                    if (m1 != null)
                    {
                        k2 = i1 + CodedOutputByteBufferNano.c(15, m1);
                    }
                    l1++;
                    i1 = k2;
                } while (true);
            }
        }
        return k2;
    }

    public final com.google.protobuf.nano.g mergeFrom(a a1)
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
                int j2 = com.google.protobuf.nano.j.a(a1, 10);
                f af[];
                int j1;
                if (a == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = a.length;
                }
                af = new f[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, af, 0, j1);
                    j2 = j1;
                }
                for (; j2 < af.length - 1; j2++)
                {
                    af[j2] = new f();
                    a1.a(af[j2]);
                    a1.a();
                }

                af[j2] = new f();
                a1.a(af[j2]);
                a = af;
                break;

            case 16: // '\020'
                j = a1.f();
                i = i | 1;
                break;

            case 24: // '\030'
                k = a1.f();
                i = i | 2;
                break;

            case 34: // '"'
                if (b == null)
                {
                    b = new com.google.f.b.a.b();
                }
                a1.a(b);
                break;

            case 42: // '*'
                if (c == null)
                {
                    c = new com.google.f.b.a.b();
                }
                a1.a(c);
                break;

            case 50: // '2'
                int k2 = com.google.protobuf.nano.j.a(a1, 50);
                com.google.f.b.b.a.b ab[];
                int k1;
                if (e == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = e.length;
                }
                ab = new com.google.f.b.b.a.b[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(e, 0, ab, 0, k1);
                    k2 = k1;
                }
                for (; k2 < ab.length - 1; k2++)
                {
                    ab[k2] = new com.google.f.b.b.a.b();
                    a1.a(ab[k2]);
                    a1.a();
                }

                ab[k2] = new com.google.f.b.b.a.b();
                a1.a(ab[k2]);
                e = ab;
                break;

            case 58: // ':'
                if (f == null)
                {
                    f = new com.google.f.d.a.a.b();
                }
                a1.a(f);
                break;

            case 69: // 'E'
                l = Float.intBitsToFloat(a1.g());
                i = i | 4;
                break;

            case 72: // 'H'
                m = a1.b();
                i = i | 8;
                break;

            case 82: // 'R'
                if (d == null)
                {
                    d = new com.google.f.b.a.b();
                }
                a1.a(d);
                break;

            case 88: // 'X'
                n = a1.f();
                i = i | 0x10;
                break;

            case 96: // '`'
                o = a1.f();
                i = i | 0x20;
                break;

            case 106: // 'j'
                p = a1.d();
                i = i | 0x40;
                break;

            case 114: // 'r'
                int l2 = com.google.protobuf.nano.j.a(a1, 114);
                e ae[];
                int l1;
                if (g == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = g.length;
                }
                ae = new e[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(g, 0, ae, 0, l1);
                    l2 = l1;
                }
                for (; l2 < ae.length - 1; l2++)
                {
                    ae[l2] = new e();
                    a1.a(ae[l2]);
                    a1.a();
                }

                ae[l2] = new e();
                a1.a(ae[l2]);
                g = ae;
                break;

            case 122: // 'z'
                int i3 = com.google.protobuf.nano.j.a(a1, 122);
                m am[];
                int i2;
                if (h == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = h.length;
                }
                am = new m[i3 + i2];
                i3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(h, 0, am, 0, i2);
                    i3 = i2;
                }
                for (; i3 < am.length - 1; i3++)
                {
                    am[i3] = new m();
                    a1.a(am[i3]);
                    a1.a();
                }

                am[i3] = new m();
                a1.a(am[i3]);
                h = am;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                f f1 = a[i1];
                if (f1 != null)
                {
                    codedoutputbytebuffernano.a(1, f1);
                }
            }

        }
        if ((i & 1) != 0)
        {
            codedoutputbytebuffernano.b(2, j);
        }
        if ((i & 2) != 0)
        {
            codedoutputbytebuffernano.b(3, k);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(4, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(5, c);
        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                com.google.f.b.b.a.b b1 = e[j1];
                if (b1 != null)
                {
                    codedoutputbytebuffernano.a(6, b1);
                }
            }

        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if ((i & 4) != 0)
        {
            codedoutputbytebuffernano.a(8, l);
        }
        if ((i & 8) != 0)
        {
            codedoutputbytebuffernano.a(9, m);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(10, d);
        }
        if ((i & 0x10) != 0)
        {
            codedoutputbytebuffernano.b(11, n);
        }
        if ((i & 0x20) != 0)
        {
            codedoutputbytebuffernano.b(12, o);
        }
        if ((i & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(13, p);
        }
        if (g != null && g.length > 0)
        {
            for (int k1 = 0; k1 < g.length; k1++)
            {
                e e1 = g[k1];
                if (e1 != null)
                {
                    codedoutputbytebuffernano.a(14, e1);
                }
            }

        }
        if (h != null && h.length > 0)
        {
            for (int l1 = ((flag) ? 1 : 0); l1 < h.length; l1++)
            {
                m m1 = h[l1];
                if (m1 != null)
                {
                    codedoutputbytebuffernano.a(15, m1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
