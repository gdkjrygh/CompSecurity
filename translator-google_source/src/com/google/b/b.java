// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.a.d;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.b:
//            v, f, h, j, 
//            l, c

public final class b extends com.google.protobuf.nano.b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/b/b, 0x77b62faL);
    private static final b p[] = new b[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public f f;
    public h g;
    public com.google.b.j h;
    public v i[];
    public String j;
    public l k;
    public com.google.b.c l;
    public boolean m;
    public com.google.b.a.b n;
    public d o;
    private int q;
    private String r;
    private String s;

    public b()
    {
        q = 0;
        b = "";
        c = "";
        d = "";
        e = "";
        f = null;
        g = null;
        h = null;
        r = "";
        i = com.google.b.v.a();
        j = "";
        k = null;
        l = null;
        m = false;
        s = "";
        n = null;
        o = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if (f != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(1, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(3, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(5, h);
        }
        j1 = i1;
        if ((q & 0x10) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(6, r);
        }
        i1 = j1;
        if ((q & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, b);
        }
        j1 = i1;
        if ((q & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(8, c);
        }
        int k1 = j1;
        if ((q & 4) != 0)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(9, d);
        }
        i1 = k1;
        if ((q & 0x80) != 0)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(12, s);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    v v1 = i[j1];
                    int l1 = i1;
                    if (v1 != null)
                    {
                        l1 = i1 + CodedOutputByteBufferNano.c(14, v1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if ((q & 0x20) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(19, j);
        }
        j1 = i1;
        if ((q & 8) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(20, e);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(21, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(22, l);
        }
        i1 = j1;
        if ((q & 0x40) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(26) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(29, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.c(30, o);
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
                if (f == null)
                {
                    f = new f();
                }
                a1.a(f);
                break;

            case 26: // '\032'
                if (g == null)
                {
                    g = new h();
                }
                a1.a(g);
                break;

            case 42: // '*'
                if (h == null)
                {
                    h = new com.google.b.j();
                }
                a1.a(h);
                break;

            case 50: // '2'
                r = a1.c();
                q = q | 0x10;
                break;

            case 58: // ':'
                b = a1.c();
                q = q | 1;
                break;

            case 66: // 'B'
                c = a1.c();
                q = q | 2;
                break;

            case 74: // 'J'
                d = a1.c();
                q = q | 4;
                break;

            case 98: // 'b'
                s = a1.c();
                q = q | 0x80;
                break;

            case 114: // 'r'
                int k1 = com.google.protobuf.nano.j.a(a1, 114);
                v av[];
                int j1;
                if (i == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = i.length;
                }
                av = new v[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(i, 0, av, 0, j1);
                    k1 = j1;
                }
                for (; k1 < av.length - 1; k1++)
                {
                    av[k1] = new v();
                    a1.a(av[k1]);
                    a1.a();
                }

                av[k1] = new v();
                a1.a(av[k1]);
                i = av;
                break;

            case 154: 
                j = a1.c();
                q = q | 0x20;
                break;

            case 162: 
                e = a1.c();
                q = q | 8;
                break;

            case 170: 
                if (k == null)
                {
                    k = new l();
                }
                a1.a(k);
                break;

            case 178: 
                if (l == null)
                {
                    l = new com.google.b.c();
                }
                a1.a(l);
                break;

            case 208: 
                m = a1.b();
                q = q | 0x40;
                break;

            case 234: 
                if (n == null)
                {
                    n = new com.google.b.a.b();
                }
                a1.a(n);
                break;

            case 242: 
                if (o == null)
                {
                    o = new d();
                }
                a1.a(o);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (f != null)
        {
            codedoutputbytebuffernano.a(1, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(3, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        if ((q & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(6, r);
        }
        if ((q & 1) != 0)
        {
            codedoutputbytebuffernano.a(7, b);
        }
        if ((q & 2) != 0)
        {
            codedoutputbytebuffernano.a(8, c);
        }
        if ((q & 4) != 0)
        {
            codedoutputbytebuffernano.a(9, d);
        }
        if ((q & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(12, s);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                v v1 = i[i1];
                if (v1 != null)
                {
                    codedoutputbytebuffernano.a(14, v1);
                }
            }

        }
        if ((q & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(19, j);
        }
        if ((q & 8) != 0)
        {
            codedoutputbytebuffernano.a(20, e);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(21, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(22, l);
        }
        if ((q & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(26, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(29, n);
        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(30, o);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

}
