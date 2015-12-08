// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.b;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.common.b:
//            ax, bc, b, aw

public final class e extends b
{

    public com.google.e.a.a.a.b a;
    public ax b[];
    public bc c;
    public com.google.common.b.b d;
    public aw e;
    private int f;
    private String g;
    private int h;

    public e()
    {
        f = 0;
        a = null;
        b = com.google.common.b.ax.a();
        g = "";
        c = null;
        h = 0;
        d = null;
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int i = k;
        if (a != null)
        {
            i = k + CodedOutputByteBufferNano.c(1, a);
        }
        k = i;
        if (b != null)
        {
            k = i;
            if (b.length > 0)
            {
                for (k = 0; k < b.length;)
                {
                    ax ax1 = b[k];
                    int l = i;
                    if (ax1 != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(2, ax1);
                    }
                    k++;
                    i = l;
                }

                k = i;
            }
        }
        i = k;
        if ((f & 1) != 0)
        {
            i = k + CodedOutputByteBufferNano.b(3, g);
        }
        k = i;
        if (c != null)
        {
            k = i + CodedOutputByteBufferNano.c(4, c);
        }
        i = k;
        if ((f & 2) != 0)
        {
            i = k + CodedOutputByteBufferNano.d(5, h);
        }
        k = i;
        if (d != null)
        {
            k = i + CodedOutputByteBufferNano.c(6, d);
        }
        i = k;
        if (e != null)
        {
            i = k + CodedOutputByteBufferNano.c(7, e);
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
                    a = new com.google.e.a.a.a.b();
                }
                a1.a(a);
                break;

            case 18: // '\022'
                int l = j.a(a1, 18);
                ax aax[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aax = new ax[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aax, 0, k);
                    l = k;
                }
                for (; l < aax.length - 1; l++)
                {
                    aax[l] = new ax();
                    a1.a(aax[l]);
                    a1.a();
                }

                aax[l] = new ax();
                a1.a(aax[l]);
                b = aax;
                break;

            case 26: // '\032'
                g = a1.c();
                f = f | 1;
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new bc();
                }
                a1.a(c);
                break;

            case 40: // '('
                h = a1.e();
                f = f | 2;
                break;

            case 50: // '2'
                if (d == null)
                {
                    d = new com.google.common.b.b();
                }
                a1.a(d);
                break;

            case 58: // ':'
                if (e == null)
                {
                    e = new aw();
                }
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (a != null)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                ax ax1 = b[i];
                if (ax1 != null)
                {
                    codedoutputbytebuffernano.a(2, ax1);
                }
            }

        }
        if ((f & 1) != 0)
        {
            codedoutputbytebuffernano.a(3, g);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(4, c);
        }
        if ((f & 2) != 0)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(6, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(7, e);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
