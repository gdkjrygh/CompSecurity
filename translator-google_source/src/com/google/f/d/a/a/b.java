// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.f.d.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

public final class b extends com.google.protobuf.nano.b
{

    private float A;
    private float B;
    private float C;
    public float a[];
    public boolean b[];
    public boolean c[];
    public boolean d[];
    public boolean e[];
    public boolean f[];
    public boolean g[];
    public boolean h[];
    public boolean i[];
    public boolean j[];
    public boolean k[];
    public boolean l[];
    public boolean m[];
    private int n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public b()
    {
        n = 0;
        o = 0.0F;
        p = 0.0F;
        a = j.c;
        q = 0.0F;
        r = 0.0F;
        s = 0.0F;
        t = 0.0F;
        u = 0.0F;
        v = 0.0F;
        w = 0.0F;
        x = 0.0F;
        y = 0.0F;
        z = 0.0F;
        A = 0.0F;
        B = 0.0F;
        C = 0.0F;
        b = j.e;
        c = j.e;
        d = j.e;
        e = j.e;
        f = j.e;
        g = j.e;
        h = j.e;
        i = j.e;
        j = j.e;
        k = j.e;
        l = j.e;
        m = j.e;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int j1 = super.computeSerializedSize();
        int i1 = j1;
        if ((n & 1) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(1) + 4);
        }
        j1 = i1;
        if ((n & 2) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(2) + 4);
        }
        i1 = j1;
        if (a != null)
        {
            i1 = j1;
            if (a.length > 0)
            {
                i1 = j1 + a.length * 4 + a.length * 1;
            }
        }
        j1 = i1;
        if ((n & 4) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(4) + 4);
        }
        i1 = j1;
        if ((n & 8) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(8) + 4);
        }
        j1 = i1;
        if ((n & 0x10) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(9) + 4);
        }
        i1 = j1;
        if ((n & 0x20) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(10) + 4);
        }
        j1 = i1;
        if ((n & 0x40) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(11) + 4);
        }
        i1 = j1;
        if ((n & 0x80) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(12) + 4);
        }
        j1 = i1;
        if ((n & 0x100) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(13) + 4);
        }
        i1 = j1;
        if ((n & 0x200) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(14) + 4);
        }
        j1 = i1;
        if ((n & 0x400) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(15) + 4);
        }
        i1 = j1;
        if ((n & 0x800) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(16) + 4);
        }
        j1 = i1;
        if ((n & 0x1000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(17) + 4);
        }
        i1 = j1;
        if ((n & 0x2000) != 0)
        {
            i1 = j1 + (CodedOutputByteBufferNano.b(18) + 4);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                j1 = i1 + h.length * 1 + h.length * 2;
            }
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1;
            if (i.length > 0)
            {
                i1 = j1 + i.length * 1 + i.length * 2;
            }
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1;
            if (j.length > 0)
            {
                j1 = i1 + j.length * 1 + j.length * 2;
            }
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1;
            if (k.length > 0)
            {
                i1 = j1 + k.length * 1 + k.length * 2;
            }
        }
        j1 = i1;
        if ((n & 0x4000) != 0)
        {
            j1 = i1 + (CodedOutputByteBufferNano.b(23) + 4);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1;
            if (l.length > 0)
            {
                i1 = j1 + l.length * 1 + l.length * 2;
            }
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                j1 = i1 + m.length * 1 + m.length * 2;
            }
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1;
            if (b.length > 0)
            {
                i1 = j1 + b.length * 1 + b.length * 2;
            }
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                j1 = i1 + c.length * 1 + c.length * 2;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1;
            if (d.length > 0)
            {
                i1 = j1 + d.length * 1 + d.length * 2;
            }
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                j1 = i1 + e.length * 1 + e.length * 2;
            }
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1;
            if (f.length > 0)
            {
                i1 = j1 + f.length * 1 + f.length * 2;
            }
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                j1 = i1 + g.length * 1 + g.length * 2;
            }
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

            case 13: // '\r'
                o = Float.intBitsToFloat(a1.g());
                n = n | 1;
                break;

            case 21: // '\025'
                p = Float.intBitsToFloat(a1.g());
                n = n | 2;
                break;

            case 29: // '\035'
                int l7 = com.google.protobuf.nano.j.a(a1, 29);
                float af[];
                int j1;
                if (a == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = a.length;
                }
                af = new float[l7 + j1];
                l7 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, af, 0, j1);
                    l7 = j1;
                }
                for (; l7 < af.length - 1; l7++)
                {
                    af[l7] = Float.intBitsToFloat(a1.g());
                    a1.a();
                }

                af[l7] = Float.intBitsToFloat(a1.g());
                a = af;
                break;

            case 26: // '\032'
                int k1 = a1.e();
                int j14 = a1.c(k1);
                int i8 = k1 / 4;
                float af1[];
                if (a == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = a.length;
                }
                af1 = new float[i8 + k1];
                i8 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(a, 0, af1, 0, k1);
                    i8 = k1;
                }
                for (; i8 < af1.length; i8++)
                {
                    af1[i8] = Float.intBitsToFloat(a1.g());
                }

                a = af1;
                a1.d(j14);
                break;

            case 37: // '%'
                q = Float.intBitsToFloat(a1.g());
                n = n | 4;
                break;

            case 69: // 'E'
                r = Float.intBitsToFloat(a1.g());
                n = n | 8;
                break;

            case 77: // 'M'
                s = Float.intBitsToFloat(a1.g());
                n = n | 0x10;
                break;

            case 85: // 'U'
                t = Float.intBitsToFloat(a1.g());
                n = n | 0x20;
                break;

            case 93: // ']'
                u = Float.intBitsToFloat(a1.g());
                n = n | 0x40;
                break;

            case 101: // 'e'
                v = Float.intBitsToFloat(a1.g());
                n = n | 0x80;
                break;

            case 109: // 'm'
                w = Float.intBitsToFloat(a1.g());
                n = n | 0x100;
                break;

            case 117: // 'u'
                x = Float.intBitsToFloat(a1.g());
                n = n | 0x200;
                break;

            case 125: // '}'
                y = Float.intBitsToFloat(a1.g());
                n = n | 0x400;
                break;

            case 133: 
                z = Float.intBitsToFloat(a1.g());
                n = n | 0x800;
                break;

            case 141: 
                A = Float.intBitsToFloat(a1.g());
                n = n | 0x1000;
                break;

            case 149: 
                B = Float.intBitsToFloat(a1.g());
                n = n | 0x2000;
                break;

            case 152: 
                int j8 = com.google.protobuf.nano.j.a(a1, 152);
                boolean aflag[];
                int l1;
                if (h == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = h.length;
                }
                aflag = new boolean[j8 + l1];
                j8 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(h, 0, aflag, 0, l1);
                    j8 = l1;
                }
                for (; j8 < aflag.length - 1; j8++)
                {
                    aflag[j8] = a1.b();
                    a1.a();
                }

                aflag[j8] = a1.b();
                h = aflag;
                break;

            case 154: 
                int k14 = a1.c(a1.e());
                int i2 = a1.j();
                int k8;
                for (k8 = 0; a1.i() > 0; k8++)
                {
                    a1.b();
                }

                a1.e(i2);
                boolean aflag1[];
                if (h == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = h.length;
                }
                aflag1 = new boolean[k8 + i2];
                k8 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(h, 0, aflag1, 0, i2);
                    k8 = i2;
                }
                for (; k8 < aflag1.length; k8++)
                {
                    aflag1[k8] = a1.b();
                }

                h = aflag1;
                a1.d(k14);
                break;

            case 160: 
                int l8 = com.google.protobuf.nano.j.a(a1, 160);
                boolean aflag2[];
                int j2;
                if (i == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = i.length;
                }
                aflag2 = new boolean[l8 + j2];
                l8 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(i, 0, aflag2, 0, j2);
                    l8 = j2;
                }
                for (; l8 < aflag2.length - 1; l8++)
                {
                    aflag2[l8] = a1.b();
                    a1.a();
                }

                aflag2[l8] = a1.b();
                i = aflag2;
                break;

            case 162: 
                int l14 = a1.c(a1.e());
                int k2 = a1.j();
                int i9;
                for (i9 = 0; a1.i() > 0; i9++)
                {
                    a1.b();
                }

                a1.e(k2);
                boolean aflag3[];
                if (i == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = i.length;
                }
                aflag3 = new boolean[i9 + k2];
                i9 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(i, 0, aflag3, 0, k2);
                    i9 = k2;
                }
                for (; i9 < aflag3.length; i9++)
                {
                    aflag3[i9] = a1.b();
                }

                i = aflag3;
                a1.d(l14);
                break;

            case 168: 
                int j9 = com.google.protobuf.nano.j.a(a1, 168);
                boolean aflag4[];
                int l2;
                if (j == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = j.length;
                }
                aflag4 = new boolean[j9 + l2];
                j9 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(j, 0, aflag4, 0, l2);
                    j9 = l2;
                }
                for (; j9 < aflag4.length - 1; j9++)
                {
                    aflag4[j9] = a1.b();
                    a1.a();
                }

                aflag4[j9] = a1.b();
                j = aflag4;
                break;

            case 170: 
                int i15 = a1.c(a1.e());
                int i3 = a1.j();
                int k9;
                for (k9 = 0; a1.i() > 0; k9++)
                {
                    a1.b();
                }

                a1.e(i3);
                boolean aflag5[];
                if (j == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = j.length;
                }
                aflag5 = new boolean[k9 + i3];
                k9 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(j, 0, aflag5, 0, i3);
                    k9 = i3;
                }
                for (; k9 < aflag5.length; k9++)
                {
                    aflag5[k9] = a1.b();
                }

                j = aflag5;
                a1.d(i15);
                break;

            case 176: 
                int l9 = com.google.protobuf.nano.j.a(a1, 176);
                boolean aflag6[];
                int j3;
                if (k == null)
                {
                    j3 = 0;
                } else
                {
                    j3 = k.length;
                }
                aflag6 = new boolean[l9 + j3];
                l9 = j3;
                if (j3 != 0)
                {
                    System.arraycopy(k, 0, aflag6, 0, j3);
                    l9 = j3;
                }
                for (; l9 < aflag6.length - 1; l9++)
                {
                    aflag6[l9] = a1.b();
                    a1.a();
                }

                aflag6[l9] = a1.b();
                k = aflag6;
                break;

            case 178: 
                int j15 = a1.c(a1.e());
                int k3 = a1.j();
                int i10;
                for (i10 = 0; a1.i() > 0; i10++)
                {
                    a1.b();
                }

                a1.e(k3);
                boolean aflag7[];
                if (k == null)
                {
                    k3 = 0;
                } else
                {
                    k3 = k.length;
                }
                aflag7 = new boolean[i10 + k3];
                i10 = k3;
                if (k3 != 0)
                {
                    System.arraycopy(k, 0, aflag7, 0, k3);
                    i10 = k3;
                }
                for (; i10 < aflag7.length; i10++)
                {
                    aflag7[i10] = a1.b();
                }

                k = aflag7;
                a1.d(j15);
                break;

            case 189: 
                C = Float.intBitsToFloat(a1.g());
                n = n | 0x4000;
                break;

            case 192: 
                int j10 = com.google.protobuf.nano.j.a(a1, 192);
                boolean aflag8[];
                int l3;
                if (l == null)
                {
                    l3 = 0;
                } else
                {
                    l3 = l.length;
                }
                aflag8 = new boolean[j10 + l3];
                j10 = l3;
                if (l3 != 0)
                {
                    System.arraycopy(l, 0, aflag8, 0, l3);
                    j10 = l3;
                }
                for (; j10 < aflag8.length - 1; j10++)
                {
                    aflag8[j10] = a1.b();
                    a1.a();
                }

                aflag8[j10] = a1.b();
                l = aflag8;
                break;

            case 194: 
                int k15 = a1.c(a1.e());
                int i4 = a1.j();
                int k10;
                for (k10 = 0; a1.i() > 0; k10++)
                {
                    a1.b();
                }

                a1.e(i4);
                boolean aflag9[];
                if (l == null)
                {
                    i4 = 0;
                } else
                {
                    i4 = l.length;
                }
                aflag9 = new boolean[k10 + i4];
                k10 = i4;
                if (i4 != 0)
                {
                    System.arraycopy(l, 0, aflag9, 0, i4);
                    k10 = i4;
                }
                for (; k10 < aflag9.length; k10++)
                {
                    aflag9[k10] = a1.b();
                }

                l = aflag9;
                a1.d(k15);
                break;

            case 200: 
                int l10 = com.google.protobuf.nano.j.a(a1, 200);
                boolean aflag10[];
                int j4;
                if (m == null)
                {
                    j4 = 0;
                } else
                {
                    j4 = m.length;
                }
                aflag10 = new boolean[l10 + j4];
                l10 = j4;
                if (j4 != 0)
                {
                    System.arraycopy(m, 0, aflag10, 0, j4);
                    l10 = j4;
                }
                for (; l10 < aflag10.length - 1; l10++)
                {
                    aflag10[l10] = a1.b();
                    a1.a();
                }

                aflag10[l10] = a1.b();
                m = aflag10;
                break;

            case 202: 
                int l15 = a1.c(a1.e());
                int k4 = a1.j();
                int i11;
                for (i11 = 0; a1.i() > 0; i11++)
                {
                    a1.b();
                }

                a1.e(k4);
                boolean aflag11[];
                if (m == null)
                {
                    k4 = 0;
                } else
                {
                    k4 = m.length;
                }
                aflag11 = new boolean[i11 + k4];
                i11 = k4;
                if (k4 != 0)
                {
                    System.arraycopy(m, 0, aflag11, 0, k4);
                    i11 = k4;
                }
                for (; i11 < aflag11.length; i11++)
                {
                    aflag11[i11] = a1.b();
                }

                m = aflag11;
                a1.d(l15);
                break;

            case 208: 
                int j11 = com.google.protobuf.nano.j.a(a1, 208);
                boolean aflag12[];
                int l4;
                if (b == null)
                {
                    l4 = 0;
                } else
                {
                    l4 = b.length;
                }
                aflag12 = new boolean[j11 + l4];
                j11 = l4;
                if (l4 != 0)
                {
                    System.arraycopy(b, 0, aflag12, 0, l4);
                    j11 = l4;
                }
                for (; j11 < aflag12.length - 1; j11++)
                {
                    aflag12[j11] = a1.b();
                    a1.a();
                }

                aflag12[j11] = a1.b();
                b = aflag12;
                break;

            case 210: 
                int i16 = a1.c(a1.e());
                int i5 = a1.j();
                int k11;
                for (k11 = 0; a1.i() > 0; k11++)
                {
                    a1.b();
                }

                a1.e(i5);
                boolean aflag13[];
                if (b == null)
                {
                    i5 = 0;
                } else
                {
                    i5 = b.length;
                }
                aflag13 = new boolean[k11 + i5];
                k11 = i5;
                if (i5 != 0)
                {
                    System.arraycopy(b, 0, aflag13, 0, i5);
                    k11 = i5;
                }
                for (; k11 < aflag13.length; k11++)
                {
                    aflag13[k11] = a1.b();
                }

                b = aflag13;
                a1.d(i16);
                break;

            case 216: 
                int l11 = com.google.protobuf.nano.j.a(a1, 216);
                boolean aflag14[];
                int j5;
                if (c == null)
                {
                    j5 = 0;
                } else
                {
                    j5 = c.length;
                }
                aflag14 = new boolean[l11 + j5];
                l11 = j5;
                if (j5 != 0)
                {
                    System.arraycopy(c, 0, aflag14, 0, j5);
                    l11 = j5;
                }
                for (; l11 < aflag14.length - 1; l11++)
                {
                    aflag14[l11] = a1.b();
                    a1.a();
                }

                aflag14[l11] = a1.b();
                c = aflag14;
                break;

            case 218: 
                int j16 = a1.c(a1.e());
                int k5 = a1.j();
                int i12;
                for (i12 = 0; a1.i() > 0; i12++)
                {
                    a1.b();
                }

                a1.e(k5);
                boolean aflag15[];
                if (c == null)
                {
                    k5 = 0;
                } else
                {
                    k5 = c.length;
                }
                aflag15 = new boolean[i12 + k5];
                i12 = k5;
                if (k5 != 0)
                {
                    System.arraycopy(c, 0, aflag15, 0, k5);
                    i12 = k5;
                }
                for (; i12 < aflag15.length; i12++)
                {
                    aflag15[i12] = a1.b();
                }

                c = aflag15;
                a1.d(j16);
                break;

            case 224: 
                int j12 = com.google.protobuf.nano.j.a(a1, 224);
                boolean aflag16[];
                int l5;
                if (d == null)
                {
                    l5 = 0;
                } else
                {
                    l5 = d.length;
                }
                aflag16 = new boolean[j12 + l5];
                j12 = l5;
                if (l5 != 0)
                {
                    System.arraycopy(d, 0, aflag16, 0, l5);
                    j12 = l5;
                }
                for (; j12 < aflag16.length - 1; j12++)
                {
                    aflag16[j12] = a1.b();
                    a1.a();
                }

                aflag16[j12] = a1.b();
                d = aflag16;
                break;

            case 226: 
                int k16 = a1.c(a1.e());
                int i6 = a1.j();
                int k12;
                for (k12 = 0; a1.i() > 0; k12++)
                {
                    a1.b();
                }

                a1.e(i6);
                boolean aflag17[];
                if (d == null)
                {
                    i6 = 0;
                } else
                {
                    i6 = d.length;
                }
                aflag17 = new boolean[k12 + i6];
                k12 = i6;
                if (i6 != 0)
                {
                    System.arraycopy(d, 0, aflag17, 0, i6);
                    k12 = i6;
                }
                for (; k12 < aflag17.length; k12++)
                {
                    aflag17[k12] = a1.b();
                }

                d = aflag17;
                a1.d(k16);
                break;

            case 232: 
                int l12 = com.google.protobuf.nano.j.a(a1, 232);
                boolean aflag18[];
                int j6;
                if (e == null)
                {
                    j6 = 0;
                } else
                {
                    j6 = e.length;
                }
                aflag18 = new boolean[l12 + j6];
                l12 = j6;
                if (j6 != 0)
                {
                    System.arraycopy(e, 0, aflag18, 0, j6);
                    l12 = j6;
                }
                for (; l12 < aflag18.length - 1; l12++)
                {
                    aflag18[l12] = a1.b();
                    a1.a();
                }

                aflag18[l12] = a1.b();
                e = aflag18;
                break;

            case 234: 
                int l16 = a1.c(a1.e());
                int k6 = a1.j();
                int i13;
                for (i13 = 0; a1.i() > 0; i13++)
                {
                    a1.b();
                }

                a1.e(k6);
                boolean aflag19[];
                if (e == null)
                {
                    k6 = 0;
                } else
                {
                    k6 = e.length;
                }
                aflag19 = new boolean[i13 + k6];
                i13 = k6;
                if (k6 != 0)
                {
                    System.arraycopy(e, 0, aflag19, 0, k6);
                    i13 = k6;
                }
                for (; i13 < aflag19.length; i13++)
                {
                    aflag19[i13] = a1.b();
                }

                e = aflag19;
                a1.d(l16);
                break;

            case 240: 
                int j13 = com.google.protobuf.nano.j.a(a1, 240);
                boolean aflag20[];
                int l6;
                if (f == null)
                {
                    l6 = 0;
                } else
                {
                    l6 = f.length;
                }
                aflag20 = new boolean[j13 + l6];
                j13 = l6;
                if (l6 != 0)
                {
                    System.arraycopy(f, 0, aflag20, 0, l6);
                    j13 = l6;
                }
                for (; j13 < aflag20.length - 1; j13++)
                {
                    aflag20[j13] = a1.b();
                    a1.a();
                }

                aflag20[j13] = a1.b();
                f = aflag20;
                break;

            case 242: 
                int i17 = a1.c(a1.e());
                int i7 = a1.j();
                int k13;
                for (k13 = 0; a1.i() > 0; k13++)
                {
                    a1.b();
                }

                a1.e(i7);
                boolean aflag21[];
                if (f == null)
                {
                    i7 = 0;
                } else
                {
                    i7 = f.length;
                }
                aflag21 = new boolean[k13 + i7];
                k13 = i7;
                if (i7 != 0)
                {
                    System.arraycopy(f, 0, aflag21, 0, i7);
                    k13 = i7;
                }
                for (; k13 < aflag21.length; k13++)
                {
                    aflag21[k13] = a1.b();
                }

                f = aflag21;
                a1.d(i17);
                break;

            case 248: 
                int l13 = com.google.protobuf.nano.j.a(a1, 248);
                boolean aflag22[];
                int j7;
                if (g == null)
                {
                    j7 = 0;
                } else
                {
                    j7 = g.length;
                }
                aflag22 = new boolean[l13 + j7];
                l13 = j7;
                if (j7 != 0)
                {
                    System.arraycopy(g, 0, aflag22, 0, j7);
                    l13 = j7;
                }
                for (; l13 < aflag22.length - 1; l13++)
                {
                    aflag22[l13] = a1.b();
                    a1.a();
                }

                aflag22[l13] = a1.b();
                g = aflag22;
                break;

            case 250: 
                int j17 = a1.c(a1.e());
                int k7 = a1.j();
                int i14;
                for (i14 = 0; a1.i() > 0; i14++)
                {
                    a1.b();
                }

                a1.e(k7);
                boolean aflag23[];
                if (g == null)
                {
                    k7 = 0;
                } else
                {
                    k7 = g.length;
                }
                aflag23 = new boolean[i14 + k7];
                i14 = k7;
                if (k7 != 0)
                {
                    System.arraycopy(g, 0, aflag23, 0, k7);
                    i14 = k7;
                }
                for (; i14 < aflag23.length; i14++)
                {
                    aflag23[i14] = a1.b();
                }

                g = aflag23;
                a1.d(j17);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if ((n & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, o);
        }
        if ((n & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, p);
        }
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                codedoutputbytebuffernano.a(3, a[i1]);
            }

        }
        if ((n & 4) != 0)
        {
            codedoutputbytebuffernano.a(4, q);
        }
        if ((n & 8) != 0)
        {
            codedoutputbytebuffernano.a(8, r);
        }
        if ((n & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(9, s);
        }
        if ((n & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(10, t);
        }
        if ((n & 0x40) != 0)
        {
            codedoutputbytebuffernano.a(11, u);
        }
        if ((n & 0x80) != 0)
        {
            codedoutputbytebuffernano.a(12, v);
        }
        if ((n & 0x100) != 0)
        {
            codedoutputbytebuffernano.a(13, w);
        }
        if ((n & 0x200) != 0)
        {
            codedoutputbytebuffernano.a(14, x);
        }
        if ((n & 0x400) != 0)
        {
            codedoutputbytebuffernano.a(15, y);
        }
        if ((n & 0x800) != 0)
        {
            codedoutputbytebuffernano.a(16, z);
        }
        if ((n & 0x1000) != 0)
        {
            codedoutputbytebuffernano.a(17, A);
        }
        if ((n & 0x2000) != 0)
        {
            codedoutputbytebuffernano.a(18, B);
        }
        if (h != null && h.length > 0)
        {
            for (int j1 = 0; j1 < h.length; j1++)
            {
                codedoutputbytebuffernano.a(19, h[j1]);
            }

        }
        if (i != null && i.length > 0)
        {
            for (int k1 = 0; k1 < i.length; k1++)
            {
                codedoutputbytebuffernano.a(20, i[k1]);
            }

        }
        if (j != null && j.length > 0)
        {
            for (int l1 = 0; l1 < j.length; l1++)
            {
                codedoutputbytebuffernano.a(21, j[l1]);
            }

        }
        if (k != null && k.length > 0)
        {
            for (int i2 = 0; i2 < k.length; i2++)
            {
                codedoutputbytebuffernano.a(22, k[i2]);
            }

        }
        if ((n & 0x4000) != 0)
        {
            codedoutputbytebuffernano.a(23, C);
        }
        if (l != null && l.length > 0)
        {
            for (int j2 = 0; j2 < l.length; j2++)
            {
                codedoutputbytebuffernano.a(24, l[j2]);
            }

        }
        if (m != null && m.length > 0)
        {
            for (int k2 = 0; k2 < m.length; k2++)
            {
                codedoutputbytebuffernano.a(25, m[k2]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int l2 = 0; l2 < b.length; l2++)
            {
                codedoutputbytebuffernano.a(26, b[l2]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int i3 = 0; i3 < c.length; i3++)
            {
                codedoutputbytebuffernano.a(27, c[i3]);
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j3 = 0; j3 < d.length; j3++)
            {
                codedoutputbytebuffernano.a(28, d[j3]);
            }

        }
        if (e != null && e.length > 0)
        {
            for (int k3 = 0; k3 < e.length; k3++)
            {
                codedoutputbytebuffernano.a(29, e[k3]);
            }

        }
        if (f != null && f.length > 0)
        {
            for (int l3 = 0; l3 < f.length; l3++)
            {
                codedoutputbytebuffernano.a(30, f[l3]);
            }

        }
        if (g != null && g.length > 0)
        {
            for (int i4 = ((flag) ? 1 : 0); i4 < g.length; i4++)
            {
                codedoutputbytebuffernano.a(31, g[i4]);
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
