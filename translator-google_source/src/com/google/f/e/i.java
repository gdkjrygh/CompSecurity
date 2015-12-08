// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.e;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class i extends b
{

    private static volatile i b[];
    public int a[];
    private int c;
    private String d;
    private String e;
    private boolean f;
    private long g;
    private String h;
    private int i;

    public i()
    {
        c = 0;
        d = "";
        e = "";
        f = false;
        g = 0L;
        h = "";
        i = 0;
        a = j.a;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static i[] a()
    {
        if (b == null)
        {
            synchronized (f.a)
            {
                if (b == null)
                {
                    b = new i[0];
                }
            }
        }
        return b;
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
        if ((c & 1) != 0)
        {
            k = l + CodedOutputByteBufferNano.b(1, d);
        }
        l = k;
        if ((c & 2) != 0)
        {
            l = k + CodedOutputByteBufferNano.b(2, e);
        }
        k = l;
        if ((c & 8) != 0)
        {
            k = l + CodedOutputByteBufferNano.d(3, g);
        }
        l = k;
        if ((c & 0x20) != 0)
        {
            l = k + CodedOutputByteBufferNano.d(4, i);
        }
        int i1 = l;
        if ((c & 0x10) != 0)
        {
            i1 = l + CodedOutputByteBufferNano.b(5, h);
        }
        k = i1;
        if ((c & 4) != 0)
        {
            k = i1 + (CodedOutputByteBufferNano.b(7) + 1);
        }
        l = k;
        if (a != null)
        {
            l = k;
            if (a.length > 0)
            {
                int j1 = 0;
                for (l = ((flag) ? 1 : 0); l < a.length; l++)
                {
                    j1 += CodedOutputByteBufferNano.a(a[l]);
                }

                l = k + j1 + a.length * 1;
            }
        }
        return l;
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
                d = a1.c();
                c = c | 1;
                break;

            case 18: // '\022'
                e = a1.c();
                c = c | 2;
                break;

            case 24: // '\030'
                g = a1.f();
                c = c | 8;
                break;

            case 32: // ' '
                i = a1.e();
                c = c | 0x20;
                break;

            case 42: // '*'
                h = a1.c();
                c = c | 0x10;
                break;

            case 56: // '8'
                f = a1.b();
                c = c | 4;
                break;

            case 64: // '@'
                int j1 = j.a(a1, 64);
                int ai[];
                int l;
                if (a == null)
                {
                    l = 0;
                } else
                {
                    l = a.length;
                }
                ai = new int[j1 + l];
                j1 = l;
                if (l != 0)
                {
                    System.arraycopy(a, 0, ai, 0, l);
                    j1 = l;
                }
                for (; j1 < ai.length - 1; j1++)
                {
                    ai[j1] = a1.e();
                    a1.a();
                }

                ai[j1] = a1.e();
                a = ai;
                break;

            case 66: // 'B'
                int l1 = a1.c(a1.e());
                int i1 = a1.j();
                int k1;
                for (k1 = 0; a1.i() > 0; k1++)
                {
                    a1.e();
                }

                a1.e(i1);
                int ai1[];
                if (a == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = a.length;
                }
                ai1 = new int[k1 + i1];
                k1 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, i1);
                    k1 = i1;
                }
                for (; k1 < ai1.length; k1++)
                {
                    ai1[k1] = a1.e();
                }

                a = ai1;
                a1.d(l1);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((c & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, d);
        }
        if ((c & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, e);
        }
        if ((c & 8) != 0)
        {
            codedoutputbytebuffernano.b(3, g);
        }
        if ((c & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(4, i);
        }
        if ((c & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(5, h);
        }
        if ((c & 4) != 0)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if (a != null && a.length > 0)
        {
            for (int k = 0; k < a.length; k++)
            {
                codedoutputbytebuffernano.a(8, a[k]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
