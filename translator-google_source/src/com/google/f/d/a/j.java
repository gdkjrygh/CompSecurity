// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.d.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package com.google.f.d.a:
//            e, k

public final class j extends b
{

    public e a[];
    public k b;
    public String c[];
    private int d;
    private long e;
    private long f;
    private byte g[];
    private byte h[];
    private boolean i;

    public j()
    {
        d = 0;
        e = 0L;
        f = 0L;
        a = com.google.f.d.a.e.a();
        b = null;
        g = com.google.protobuf.nano.j.h;
        h = com.google.protobuf.nano.j.h;
        c = com.google.protobuf.nano.j.f;
        i = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int i1 = l;
        if ((d & 1) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.d(1, e);
        }
        l = i1;
        if ((d & 2) != 0)
        {
            l = i1 + CodedOutputByteBufferNano.d(2, f);
        }
        i1 = l;
        if (a != null)
        {
            i1 = l;
            if (a.length > 0)
            {
                for (i1 = 0; i1 < a.length;)
                {
                    e e1 = a[i1];
                    int j1 = l;
                    if (e1 != null)
                    {
                        j1 = l + CodedOutputByteBufferNano.c(3, e1);
                    }
                    i1++;
                    l = j1;
                }

                i1 = l;
            }
        }
        int k1 = i1;
        if ((d & 4) != 0)
        {
            k1 = i1 + CodedOutputByteBufferNano.b(4, g);
        }
        l = k1;
        if (b != null)
        {
            l = k1 + CodedOutputByteBufferNano.c(5, b);
        }
        i1 = l;
        if (c != null)
        {
            i1 = l;
            if (c.length > 0)
            {
                int l1 = 0;
                int i2 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < c.length;)
                {
                    String s = c[i1];
                    int k2 = l1;
                    int j2 = i2;
                    if (s != null)
                    {
                        j2 = i2 + 1;
                        k2 = l1 + CodedOutputByteBufferNano.a(s);
                    }
                    i1++;
                    l1 = k2;
                    i2 = j2;
                }

                i1 = l + l1 + i2 * 1;
            }
        }
        l = i1;
        if ((d & 0x10) != 0)
        {
            l = i1 + (CodedOutputByteBufferNano.b(7) + 1);
        }
        i1 = l;
        if ((d & 8) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.b(8, h);
        }
        return i1;
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

            case 8: // '\b'
                e = a1.f();
                d = d | 1;
                break;

            case 16: // '\020'
                f = a1.f();
                d = d | 2;
                break;

            case 26: // '\032'
                int k1 = com.google.protobuf.nano.j.a(a1, 26);
                e ae[];
                int i1;
                if (a == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = a.length;
                }
                ae = new e[k1 + i1];
                k1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(a, 0, ae, 0, i1);
                    k1 = i1;
                }
                for (; k1 < ae.length - 1; k1++)
                {
                    ae[k1] = new e();
                    a1.a(ae[k1]);
                    a1.a();
                }

                ae[k1] = new e();
                a1.a(ae[k1]);
                a = ae;
                break;

            case 34: // '"'
                g = a1.d();
                d = d | 4;
                break;

            case 42: // '*'
                if (b == null)
                {
                    b = new k();
                }
                a1.a(b);
                break;

            case 50: // '2'
                int l1 = com.google.protobuf.nano.j.a(a1, 50);
                String as[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                as = new String[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, as, 0, j1);
                    l1 = j1;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = a1.c();
                    a1.a();
                }

                as[l1] = a1.c();
                c = as;
                break;

            case 56: // '8'
                i = a1.b();
                d = d | 0x10;
                break;

            case 66: // 'B'
                h = a1.d();
                d = d | 8;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.b(1, e);
        }
        if ((d & 2) != 0)
        {
            codedoutputbytebuffernano.b(2, f);
        }
        if (a != null && a.length > 0)
        {
            for (int l = 0; l < a.length; l++)
            {
                e e1 = a[l];
                if (e1 != null)
                {
                    codedoutputbytebuffernano.a(3, e1);
                }
            }

        }
        if ((d & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, g);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(5, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < c.length; i1++)
            {
                String s = c[i1];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(6, s);
                }
            }

        }
        if ((d & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(7, i);
        }
        if ((d & 8) != 0)
        {
            codedoutputbytebuffernano.a(8, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
