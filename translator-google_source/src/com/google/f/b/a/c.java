// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class c extends b
{

    private static volatile c l[];
    public long a;
    public long b;
    public float c;
    public float d;
    public float e;
    public long f;
    public long g;
    public String h;
    public String i;
    public long j[];
    public float k;

    public c()
    {
        a = 0L;
        b = 0L;
        c = 0.0F;
        d = 0.0F;
        e = 0.0F;
        f = 0L;
        g = 0L;
        h = "";
        i = "";
        j = j.b;
        k = 0.0F;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static c[] a()
    {
        if (l == null)
        {
            synchronized (f.a)
            {
                if (l == null)
                {
                    l = new c[0];
                }
            }
        }
        return l;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int i1 = 0;
        int j1 = super.computeSerializedSize();
        int l1 = CodedOutputByteBufferNano.d(6, a);
        int i2 = CodedOutputByteBufferNano.d(7, b);
        int j2 = CodedOutputByteBufferNano.b(8);
        int k2 = CodedOutputByteBufferNano.b(9);
        int l2 = CodedOutputByteBufferNano.b(10);
        int i3 = CodedOutputByteBufferNano.d(11, f);
        int j3 = CodedOutputByteBufferNano.d(12, g);
        int k3 = CodedOutputByteBufferNano.b(13, h);
        l1 = CodedOutputByteBufferNano.b(14, i) + (j1 + l1 + i2 + (j2 + 4) + (k2 + 4) + (l2 + 4) + i3 + j3 + k3);
        if (j != null && j.length > 0)
        {
            int k1 = 0;
            for (; i1 < j.length; i1++)
            {
                k1 += CodedOutputByteBufferNano.a(j[i1]);
            }

            i1 = l1 + k1 + j.length * 1;
        } else
        {
            i1 = l1;
        }
        return i1 + (CodedOutputByteBufferNano.b(16) + 4);
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

            case 48: // '0'
                a = a1.f();
                break;

            case 56: // '8'
                b = a1.f();
                break;

            case 69: // 'E'
                e = Float.intBitsToFloat(a1.g());
                break;

            case 77: // 'M'
                c = Float.intBitsToFloat(a1.g());
                break;

            case 85: // 'U'
                d = Float.intBitsToFloat(a1.g());
                break;

            case 88: // 'X'
                f = a1.f();
                break;

            case 96: // '`'
                g = a1.f();
                break;

            case 106: // 'j'
                h = a1.c();
                break;

            case 114: // 'r'
                i = a1.c();
                break;

            case 120: // 'x'
                int l1 = com.google.protobuf.nano.j.a(a1, 120);
                long al[];
                int j1;
                if (j == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = j.length;
                }
                al = new long[l1 + j1];
                l1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(j, 0, al, 0, j1);
                    l1 = j1;
                }
                for (; l1 < al.length - 1; l1++)
                {
                    al[l1] = a1.f();
                    a1.a();
                }

                al[l1] = a1.f();
                j = al;
                break;

            case 122: // 'z'
                int j2 = a1.c(a1.e());
                int k1 = a1.j();
                int i2;
                for (i2 = 0; a1.i() > 0; i2++)
                {
                    a1.f();
                }

                a1.e(k1);
                long al1[];
                if (j == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = j.length;
                }
                al1 = new long[i2 + k1];
                i2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(j, 0, al1, 0, k1);
                    i2 = k1;
                }
                for (; i2 < al1.length; i2++)
                {
                    al1[i2] = a1.f();
                }

                j = al1;
                a1.d(j2);
                break;

            case 133: 
                k = Float.intBitsToFloat(a1.g());
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        codedoutputbytebuffernano.b(6, a);
        codedoutputbytebuffernano.b(7, b);
        codedoutputbytebuffernano.a(8, e);
        codedoutputbytebuffernano.a(9, c);
        codedoutputbytebuffernano.a(10, d);
        codedoutputbytebuffernano.b(11, f);
        codedoutputbytebuffernano.b(12, g);
        codedoutputbytebuffernano.a(13, h);
        codedoutputbytebuffernano.a(14, i);
        if (j != null && j.length > 0)
        {
            for (int i1 = 0; i1 < j.length; i1++)
            {
                codedoutputbytebuffernano.b(15, j[i1]);
            }

        }
        codedoutputbytebuffernano.a(16, k);
        super.writeTo(codedoutputbytebuffernano);
    }
}
