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
//            n

public final class k extends b
{

    public n a;
    public int b[];
    public int c[];

    public k()
    {
        a = null;
        b = j.a;
        c = j.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        boolean flag = false;
        int l = super.computeSerializedSize();
        int i = l;
        if (a != null)
        {
            i = l + CodedOutputByteBufferNano.c(1, a);
        }
        l = i;
        if (b != null)
        {
            l = i;
            if (b.length > 0)
            {
                l = 0;
                int i1 = 0;
                for (; l < b.length; l++)
                {
                    i1 += CodedOutputByteBufferNano.a(b[l]);
                }

                l = i + i1 + b.length * 1;
            }
        }
        i = l;
        if (c != null)
        {
            i = l;
            if (c.length > 0)
            {
                int j1 = 0;
                for (i = ((flag) ? 1 : 0); i < c.length; i++)
                {
                    j1 += CodedOutputByteBufferNano.a(c[i]);
                }

                i = l + j1 + c.length * 1;
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
                if (a == null)
                {
                    a = new n();
                }
                a1.a(a);
                break;

            case 16: // '\020'
                int l1 = j.a(a1, 16);
                int ai[];
                int l;
                if (b == null)
                {
                    l = 0;
                } else
                {
                    l = b.length;
                }
                ai = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(b, 0, ai, 0, l);
                    l1 = l;
                }
                for (; l1 < ai.length - 1; l1++)
                {
                    ai[l1] = a1.e();
                    a1.a();
                }

                ai[l1] = a1.e();
                b = ai;
                break;

            case 18: // '\022'
                int l2 = a1.c(a1.e());
                int i1 = a1.j();
                int i2;
                for (i2 = 0; a1.i() > 0; i2++)
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
                ai1 = new int[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(b, 0, ai1, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ai1.length; i2++)
                {
                    ai1[i2] = a1.e();
                }

                b = ai1;
                a1.d(l2);
                break;

            case 24: // '\030'
                int j2 = j.a(a1, 24);
                int ai2[];
                int j1;
                if (c == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = c.length;
                }
                ai2 = new int[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(c, 0, ai2, 0, j1);
                    j2 = j1;
                }
                for (; j2 < ai2.length - 1; j2++)
                {
                    ai2[j2] = a1.e();
                    a1.a();
                }

                ai2[j2] = a1.e();
                c = ai2;
                break;

            case 26: // '\032'
                int i3 = a1.c(a1.e());
                int k1 = a1.j();
                int k2;
                for (k2 = 0; a1.i() > 0; k2++)
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
                ai3 = new int[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(c, 0, ai3, 0, k1);
                    k2 = k1;
                }
                for (; k2 < ai3.length; k2++)
                {
                    ai3[k2] = a1.e();
                }

                c = ai3;
                a1.d(i3);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (a != null)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                codedoutputbytebuffernano.a(2, b[i]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < c.length; l++)
            {
                codedoutputbytebuffernano.a(3, c[l]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
