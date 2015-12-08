// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.common.b.a:
//            aa

public final class i extends b
{

    private static volatile i d[];
    public aa a[];
    public aa b[];
    public aa c[];
    private int e;
    private String f;
    private int g;
    private int h;

    public i()
    {
        e = 0;
        f = "";
        g = 0;
        h = 0;
        a = com.google.common.b.a.aa.a();
        b = com.google.common.b.a.aa.a();
        c = com.google.common.b.a.aa.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static i[] a()
    {
        if (d == null)
        {
            synchronized (f.a)
            {
                if (d == null)
                {
                    d = new i[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int k = l;
        if ((e & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(1, f);
        }
        l = k;
        if ((e & 2) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(2, g);
        }
        k = l;
        if ((e & 4) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(3, h);
        }
        l = k;
        if (a != null)
        {
            l = k;
            if (a.length > 0)
            {
                for (l = 0; l < a.length;)
                {
                    aa aa1 = a[l];
                    int k1 = k;
                    if (aa1 != null)
                    {
                        k1 = k + CodedOutputByteBufferNano.c(4, aa1);
                    }
                    l++;
                    k = k1;
                }

                l = k;
            }
        }
        k = l;
        if (b != null)
        {
            k = l;
            if (b.length > 0)
            {
                k = l;
                for (int i1 = 0; i1 < b.length;)
                {
                    aa aa2 = b[i1];
                    int l1 = k;
                    if (aa2 != null)
                    {
                        l1 = k + CodedOutputByteBufferNano.c(5, aa2);
                    }
                    i1++;
                    k = l1;
                }

            }
        }
        int i2 = k;
        if (c != null)
        {
            i2 = k;
            if (c.length > 0)
            {
                int j1 = ((flag) ? 1 : 0);
                do
                {
                    i2 = k;
                    if (j1 >= c.length)
                    {
                        break;
                    }
                    aa aa3 = c[j1];
                    i2 = k;
                    if (aa3 != null)
                    {
                        i2 = k + CodedOutputByteBufferNano.c(6, aa3);
                    }
                    j1++;
                    k = i2;
                } while (true);
            }
        }
        return i2;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (super.storeUnknownField(a1, k))
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

            case 16: // '\020'
                g = a1.e();
                e = e | 2;
                break;

            case 24: // '\030'
                h = a1.e();
                e = e | 4;
                break;

            case 34: // '"'
                int k1 = j.a(a1, 34);
                aa aaa[];
                int l;
                if (a == null)
                {
                    l = 0;
                } else
                {
                    l = a.length;
                }
                aaa = new aa[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(a, 0, aaa, 0, l);
                    k1 = l;
                }
                for (; k1 < aaa.length - 1; k1++)
                {
                    aaa[k1] = new aa();
                    a1.a(aaa[k1]);
                    a1.a();
                }

                aaa[k1] = new aa();
                a1.a(aaa[k1]);
                a = aaa;
                break;

            case 42: // '*'
                int l1 = j.a(a1, 42);
                aa aaa1[];
                int i1;
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                aaa1 = new aa[l1 + i1];
                l1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, aaa1, 0, i1);
                    l1 = i1;
                }
                for (; l1 < aaa1.length - 1; l1++)
                {
                    aaa1[l1] = new aa();
                    a1.a(aaa1[l1]);
                    a1.a();
                }

                aaa1[l1] = new aa();
                a1.a(aaa1[l1]);
                b = aaa1;
                break;

            case 50: // '2'
                int i2 = j.a(a1, 50);
                aa aaa2[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                aaa2 = new aa[i2 + j1];
                i2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, aaa2, 0, j1);
                    i2 = j1;
                }
                for (; i2 < aaa2.length - 1; i2++)
                {
                    aaa2[i2] = new aa();
                    a1.a(aaa2[i2]);
                    a1.a();
                }

                aaa2[i2] = new aa();
                a1.a(aaa2[i2]);
                c = aaa2;
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
        if (a != null && a.length > 0)
        {
            for (int k = 0; k < a.length; k++)
            {
                aa aa1 = a[k];
                if (aa1 != null)
                {
                    codedoutputbytebuffernano.a(4, aa1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int l = 0; l < b.length; l++)
            {
                aa aa2 = b[l];
                if (aa2 != null)
                {
                    codedoutputbytebuffernano.a(5, aa2);
                }
            }

        }
        if (c != null && c.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < c.length; i1++)
            {
                aa aa3 = c[i1];
                if (aa3 != null)
                {
                    codedoutputbytebuffernano.a(6, aa3);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
