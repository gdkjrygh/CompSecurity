// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.c:
//            o

public final class n extends b
{

    public String a[];
    public o b[];
    private int c;
    private String d;
    private String e;
    private String f;
    private boolean g;
    private String h;
    private String i;
    private int j;
    private int k;
    private String l;
    private String m;

    public n()
    {
        c = 0;
        d = "";
        e = "";
        f = "";
        g = false;
        h = "";
        i = "";
        j = 0;
        k = 0;
        l = "";
        m = "";
        a = j.f;
        b = com.google.f.c.o.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((c & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(1, d);
        }
        j1 = i1;
        if ((c & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, e);
        }
        i1 = j1;
        if ((c & 4) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, f);
        }
        j1 = i1;
        if ((c & 8) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(4) + 1);
        }
        i1 = j1;
        if ((c & 0x10) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(5, h);
        }
        j1 = i1;
        if ((c & 0x20) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(6, i);
        }
        i1 = j1;
        if ((c & 0x40) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(7, j);
        }
        j1 = i1;
        if ((c & 0x80) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(8, k);
        }
        i1 = j1;
        if ((c & 0x100) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, l);
        }
        j1 = i1;
        if ((c & 0x200) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, m);
        }
        i1 = j1;
        if (a != null)
        {
            i1 = j1;
            if (a.length > 0)
            {
                i1 = 0;
                int l1 = 0;
                int j2;
                int k2;
                for (j2 = 0; i1 < a.length; j2 = k2)
                {
                    String s = a[i1];
                    int l2 = l1;
                    k2 = j2;
                    if (s != null)
                    {
                        k2 = j2 + 1;
                        l2 = l1 + CodedOutputByteBufferNano.a(s);
                    }
                    i1++;
                    l1 = l2;
                }

                i1 = j1 + l1 + j2 * 1;
            }
        }
        int i2 = i1;
        if (b != null)
        {
            i2 = i1;
            if (b.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    i2 = i1;
                    if (k1 >= b.length)
                    {
                        break;
                    }
                    o o1 = b[k1];
                    i2 = i1;
                    if (o1 != null)
                    {
                        i2 = i1 + CodedOutputByteBufferNano.c(12, o1);
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
                d = a1.c();
                c = c | 1;
                break;

            case 18: // '\022'
                e = a1.c();
                c = c | 2;
                break;

            case 26: // '\032'
                f = a1.c();
                c = c | 4;
                break;

            case 32: // ' '
                g = a1.b();
                c = c | 8;
                break;

            case 42: // '*'
                h = a1.c();
                c = c | 0x10;
                break;

            case 50: // '2'
                i = a1.c();
                c = c | 0x20;
                break;

            case 56: // '8'
                j = a1.e();
                c = c | 0x40;
                break;

            case 64: // '@'
                k = a1.e();
                c = c | 0x80;
                break;

            case 74: // 'J'
                l = a1.c();
                c = c | 0x100;
                break;

            case 82: // 'R'
                m = a1.c();
                c = c | 0x200;
                break;

            case 90: // 'Z'
                int l1 = com.google.protobuf.nano.j.a(a1, 90);
                String as[];
                int j1;
                if (a == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = a.length;
                }
                as = new String[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, as, 0, j1);
                    l1 = j1;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = a1.c();
                    a1.a();
                }

                as[l1] = a1.c();
                a = as;
                break;

            case 98: // 'b'
                int i2 = com.google.protobuf.nano.j.a(a1, 98);
                o ao[];
                int k1;
                if (b == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = b.length;
                }
                ao = new o[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(b, 0, ao, 0, k1);
                    i2 = k1;
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
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, f);
        }
        if ((c & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, g);
        }
        if ((c & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        if ((c & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, i);
        }
        if ((c & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(7, j);
        }
        if ((c & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(8, k);
        }
        if ((c & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(9, l);
        }
        if ((c & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(10, m);
        }
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                String s = a[i1];
                if (s != null)
                {
                    codedoutputbytebuffernano.a(11, s);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < b.length; j1++)
            {
                o o1 = b[j1];
                if (o1 != null)
                {
                    codedoutputbytebuffernano.a(12, o1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
