// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.c;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.f.c:
//            m

public final class v extends b
{

    private static volatile v d[];
    public float a[];
    public float b[];
    public m c;
    private int e;
    private String f;
    private String g;
    private boolean h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private int n;

    public v()
    {
        e = 0;
        f = "";
        g = "";
        h = false;
        a = j.c;
        b = j.c;
        i = 0.0F;
        j = 0.0F;
        k = 0.0F;
        l = 0.0F;
        m = 0.0F;
        c = null;
        n = 0;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static v[] a()
    {
        if (d == null)
        {
            synchronized (f.a)
            {
                if (d == null)
                {
                    d = new v[0];
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
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((e & 1) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(1, f);
        }
        j1 = i1;
        if ((e & 2) != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, g);
        }
        i1 = j1;
        if ((e & 8) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(3) + 4);
        }
        j1 = i1;
        if ((e & 0x10) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(4) + 4);
        }
        i1 = j1;
        if ((e & 0x20) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(5) + 4);
        }
        j1 = i1;
        if ((e & 0x40) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(6) + 4);
        }
        i1 = j1;
        if ((e & 4) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(7) + 1);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(8, c);
        }
        i1 = j1;
        if ((e & 0x100) != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(9, n);
        }
        j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                j1 = i1 + a.length * 4 + a.length * 1;
            }
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1;
            if (b.length > 0)
            {
                i1 = j1 + b.length * 4 + b.length * 1;
            }
        }
        j1 = i1;
        if ((e & 0x80) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(12) + 4);
        }
        return j1;
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
                f = a1.c();
                e = e | 1;
                break;

            case 18: // '\022'
                g = a1.c();
                e = e | 2;
                break;

            case 29: // '\035'
                i = Float.intBitsToFloat(a1.g());
                e = e | 8;
                break;

            case 37: // '%'
                j = Float.intBitsToFloat(a1.g());
                e = e | 0x10;
                break;

            case 45: // '-'
                k = Float.intBitsToFloat(a1.g());
                e = e | 0x20;
                break;

            case 53: // '5'
                l = Float.intBitsToFloat(a1.g());
                e = e | 0x40;
                break;

            case 56: // '8'
                h = a1.b();
                e = e | 4;
                break;

            case 66: // 'B'
                if (c == null)
                {
                    c = new m();
                }
                a1.a(c);
                break;

            case 72: // 'H'
                n = a1.e();
                e = e | 0x100;
                break;

            case 85: // 'U'
                int j2 = com.google.protobuf.nano.j.a(a1, 85);
                float af[];
                int j1;
                if (a == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = a.length;
                }
                af = new float[j2 + j1];
                j2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, af, 0, j1);
                    j2 = j1;
                }
                for (; j2 < af.length - 1; j2++)
                {
                    af[j2] = Float.intBitsToFloat(a1.g());
                    a1.a();
                }

                af[j2] = Float.intBitsToFloat(a1.g());
                a = af;
                break;

            case 82: // 'R'
                int k1 = a1.e();
                int j3 = a1.c(k1);
                int k2 = k1 / 4;
                float af1[];
                if (a == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = a.length;
                }
                af1 = new float[k2 + k1];
                k2 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(a, 0, af1, 0, k1);
                    k2 = k1;
                }
                for (; k2 < af1.length; k2++)
                {
                    af1[k2] = Float.intBitsToFloat(a1.g());
                }

                a = af1;
                a1.d(j3);
                break;

            case 93: // ']'
                int l2 = com.google.protobuf.nano.j.a(a1, 93);
                float af2[];
                int l1;
                if (b == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = b.length;
                }
                af2 = new float[l2 + l1];
                l2 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(b, 0, af2, 0, l1);
                    l2 = l1;
                }
                for (; l2 < af2.length - 1; l2++)
                {
                    af2[l2] = Float.intBitsToFloat(a1.g());
                    a1.a();
                }

                af2[l2] = Float.intBitsToFloat(a1.g());
                b = af2;
                break;

            case 90: // 'Z'
                int i2 = a1.e();
                int k3 = a1.c(i2);
                int i3 = i2 / 4;
                float af3[];
                if (b == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = b.length;
                }
                af3 = new float[i3 + i2];
                i3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(b, 0, af3, 0, i2);
                    i3 = i2;
                }
                for (; i3 < af3.length; i3++)
                {
                    af3[i3] = Float.intBitsToFloat(a1.g());
                }

                b = af3;
                a1.d(k3);
                break;

            case 101: // 'e'
                m = Float.intBitsToFloat(a1.g());
                e = e | 0x80;
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
        if ((e & 8) != 0)
        {
            codedoutputbytebuffernano.a(3, i);
        }
        if ((e & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(4, j);
        }
        if ((e & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(5, k);
        }
        if ((e & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(6, l);
        }
        if ((e & 4) != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(8, c);
        }
        if ((e & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(9, n);
        }
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                codedoutputbytebuffernano.a(10, a[i1]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < b.length; j1++)
            {
                codedoutputbytebuffernano.a(11, b[j1]);
            }

        }
        if ((e & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
