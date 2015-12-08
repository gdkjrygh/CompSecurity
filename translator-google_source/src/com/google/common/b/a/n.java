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
//            j

public final class n extends b
{

    public com.google.common.b.a.j a[];
    public int b[];
    public int c[];
    private int d;
    private long e;

    public n()
    {
        d = 0;
        a = com.google.common.b.a.j.a();
        e = 0L;
        b = j.a;
        c = j.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int k = i;
        if (a != null)
        {
            k = i;
            if (a.length > 0)
            {
                for (k = 0; k < a.length;)
                {
                    com.google.common.b.a.j j1 = a[k];
                    int l = i;
                    if (j1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(1, j1);
                    }
                    k++;
                    i = l;
                }

                k = i;
            }
        }
        i = k;
        if ((d & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(2, e);
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                k = 0;
                int i1 = 0;
                for (; k < b.length; k++)
                {
                    i1 += CodedOutputByteBufferNano.a(b[k]);
                }

                k = i + i1 + b.length * 1;
            }
        }
        i = k;
        if (c != null)
        {
            i = k;
            if (c.length > 0)
            {
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < c.length; i++)
                {
                    k1 += CodedOutputByteBufferNano.a(c[i]);
                }

                i = k + k1 + c.length * 1;
            }
        }
        return i;
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
                int l1 = j.a(a1, 10);
                com.google.common.b.a.j aj[];
                int k;
                if (a == null)
                {
                    k = 0;
                } else
                {
                    k = a.length;
                }
                aj = new com.google.common.b.a.j[l1 + k];
                l1 = k;
                if (k != 0)
                {
                    System.arraycopy(a, 0, aj, 0, k);
                    l1 = k;
                }
                for (; l1 < aj.length - 1; l1++)
                {
                    aj[l1] = new com.google.common.b.a.j();
                    a1.a(aj[l1]);
                    a1.a();
                }

                aj[l1] = new com.google.common.b.a.j();
                a1.a(aj[l1]);
                a = aj;
                break;

            case 16: // '\020'
                e = a1.f();
                d = d | 1;
                break;

            case 24: // '\030'
                int i2 = j.a(a1, 24);
                int ai[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                ai = new int[i2 + l];
                i2 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, ai, 0, l);
                    i2 = l;
                }
                for (; i2 < ai.length - 1; i2++)
                {
                    ai[i2] = a1.e();
                    a1.a();
                }

                ai[i2] = a1.e();
                b = ai;
                break;

            case 26: // '\032'
                int i3 = a1.c(a1.e());
                int i1 = a1.j();
                int j2;
                for (j2 = 0; a1.i() > 0; j2++)
                {
                    a1.e();
                }

                a1.e(i1);
                int ai1[];
                if (b == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = b.length;
                }
                ai1 = new int[j2 + i1];
                j2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, i1);
                    j2 = i1;
                }
                for (; j2 < ai1.length; j2++)
                {
                    ai1[j2] = a1.e();
                }

                b = ai1;
                a1.d(i3);
                break;

            case 32: // ' '
                int k2 = j.a(a1, 32);
                int ai2[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                ai2 = new int[k2 + j1];
                k2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, ai2, 0, j1);
                    k2 = j1;
                }
                for (; k2 < ai2.length - 1; k2++)
                {
                    ai2[k2] = a1.e();
                    a1.a();
                }

                ai2[k2] = a1.e();
                c = ai2;
                break;

            case 34: // '"'
                int j3 = a1.c(a1.e());
                int k1 = a1.j();
                int l2;
                for (l2 = 0; a1.i() > 0; l2++)
                {
                    a1.e();
                }

                a1.e(k1);
                int ai3[];
                if (c == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = c.length;
                }
                ai3 = new int[l2 + k1];
                l2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(c, 0, ai3, 0, k1);
                    l2 = k1;
                }
                for (; l2 < ai3.length; l2++)
                {
                    ai3[l2] = a1.e();
                }

                c = ai3;
                a1.d(j3);
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
                com.google.common.b.a.j j1 = a[i];
                if (j1 != null)
                {
                    codedoutputbytebuffernano.a(1, j1);
                }
            }

        }
        if ((d & 1) != 0)
        {
            codedoutputbytebuffernano.b(2, e);
        }
        if (b != null && b.length > 0)
        {
            for (int k = 0; k < b.length; k++)
            {
                codedoutputbytebuffernano.a(3, b[k]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < c.length; l++)
            {
                codedoutputbytebuffernano.a(4, c[l]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
