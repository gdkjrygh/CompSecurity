// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cvs extends qlw
{

    private cvu A;
    public float a;
    public cvw b;
    public cwf c;
    public float d[];
    public float e[];
    public float f[];
    public float g[];
    public float h;
    public float i;
    public float j[];
    public cwf k;
    public float l;
    public cwf m;
    public cwf n;
    public cwf o;
    public cwf p;
    public float q[];
    public float r[];
    private float s[];
    private cvt t[];
    private cwf u;
    private cwf v;
    private float w[];
    private cvt x[];
    private float y[];
    private float z[];

    public cvs()
    {
        a = (0.0F / 0.0F);
        b = null;
        c = null;
        d = qmb.c;
        e = qmb.c;
        f = qmb.c;
        g = qmb.c;
        s = qmb.c;
        t = cvt.b();
        h = (0.0F / 0.0F);
        i = (0.0F / 0.0F);
        j = qmb.c;
        k = null;
        l = (0.0F / 0.0F);
        u = null;
        v = null;
        w = qmb.c;
        x = cvt.b();
        m = null;
        n = null;
        o = null;
        p = null;
        y = qmb.c;
        z = qmb.c;
        q = qmb.c;
        r = qmb.c;
        A = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (Float.floatToIntBits(a) != Float.floatToIntBits((0.0F / 0.0F)))
        {
            float f1 = a;
            i1 = j1 + (qlp.c(1) + 4);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.c(2, b);
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + qlp.c(3, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1;
            if (d.length > 0)
            {
                j1 = i1 + d.length * 4 + d.length * 1;
            }
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1;
            if (e.length > 0)
            {
                i1 = j1 + e.length * 4 + e.length * 1;
            }
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                j1 = i1 + f.length * 4 + f.length * 1;
            }
        }
        int k1 = j1;
        if (g != null)
        {
            k1 = j1;
            if (g.length > 0)
            {
                k1 = j1 + g.length * 4 + g.length * 1;
            }
        }
        i1 = k1;
        if (s != null)
        {
            i1 = k1;
            if (s.length > 0)
            {
                i1 = k1 + s.length * 4 + s.length * 1;
            }
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1;
            if (t.length > 0)
            {
                for (j1 = 0; j1 < t.length;)
                {
                    cvt cvt1 = t[j1];
                    k1 = i1;
                    if (cvt1 != null)
                    {
                        k1 = i1 + qlp.c(9, cvt1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (Float.floatToIntBits(h) != Float.floatToIntBits((0.0F / 0.0F)))
        {
            float f2 = h;
            i1 = j1 + (qlp.c(10) + 4);
        }
        j1 = i1;
        if (Float.floatToIntBits(i) != Float.floatToIntBits((0.0F / 0.0F)))
        {
            float f3 = i;
            j1 = i1 + (qlp.c(11) + 4);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1;
            if (j.length > 0)
            {
                i1 = j1 + j.length * 4 + j.length * 1;
            }
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.c(13, k);
        }
        i1 = j1;
        if (Float.floatToIntBits(l) != Float.floatToIntBits((0.0F / 0.0F)))
        {
            float f4 = l;
            i1 = j1 + (qlp.c(14) + 4);
        }
        j1 = i1;
        if (u != null)
        {
            j1 = i1 + qlp.c(15, u);
        }
        k1 = j1;
        if (v != null)
        {
            k1 = j1 + qlp.c(16, v);
        }
        i1 = k1;
        if (w != null)
        {
            i1 = k1;
            if (w.length > 0)
            {
                i1 = k1 + w.length * 4 + w.length * 2;
            }
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1;
            if (x.length > 0)
            {
                int l1 = ((flag) ? 1 : 0);
                do
                {
                    j1 = i1;
                    if (l1 >= x.length)
                    {
                        break;
                    }
                    cvt cvt2 = x[l1];
                    j1 = i1;
                    if (cvt2 != null)
                    {
                        j1 = i1 + qlp.c(18, cvt2);
                    }
                    l1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + qlp.c(19, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + qlp.c(20, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.c(21, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + qlp.c(22, p);
        }
        i1 = j1;
        if (y != null)
        {
            i1 = j1;
            if (y.length > 0)
            {
                i1 = j1 + y.length * 4 + y.length * 2;
            }
        }
        j1 = i1;
        if (z != null)
        {
            j1 = i1;
            if (z.length > 0)
            {
                j1 = i1 + z.length * 4 + z.length * 2;
            }
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1;
            if (q.length > 0)
            {
                i1 = j1 + q.length * 4 + q.length * 2;
            }
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1;
            if (r.length > 0)
            {
                j1 = i1 + r.length * 4 + r.length * 2;
            }
        }
        i1 = j1;
        if (A != null)
        {
            i1 = j1 + qlp.c(27, A);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
        do
        {
            int i1 = qlo1.a();
            switch (i1)
            {
            default:
                if (qmb.a(qlo1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 13: // '\r'
                a = Float.intBitsToFloat(qlo1.k());
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new cvw();
                }
                qlo1.a(b);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new cwf();
                }
                qlo1.a(c);
                break;

            case 37: // '%'
                int j7 = qmb.b(qlo1, 37);
                float af[];
                int j1;
                if (d == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = d.length;
                }
                af = new float[j7 + j1];
                j7 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(d, 0, af, 0, j1);
                    j7 = j1;
                }
                for (; j7 < af.length - 1; j7++)
                {
                    af[j7] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af[j7] = Float.intBitsToFloat(qlo1.k());
                d = af;
                break;

            case 34: // '"'
                int k1 = qlo1.i();
                int j13 = qlo1.c(k1);
                int k7 = k1 / 4;
                float af1[];
                if (d == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = d.length;
                }
                af1 = new float[k7 + k1];
                k7 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(d, 0, af1, 0, k1);
                    k7 = k1;
                }
                for (; k7 < af1.length; k7++)
                {
                    af1[k7] = Float.intBitsToFloat(qlo1.k());
                }

                d = af1;
                qlo1.d(j13);
                break;

            case 45: // '-'
                int l7 = qmb.b(qlo1, 45);
                float af2[];
                int l1;
                if (e == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = e.length;
                }
                af2 = new float[l7 + l1];
                l7 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(e, 0, af2, 0, l1);
                    l7 = l1;
                }
                for (; l7 < af2.length - 1; l7++)
                {
                    af2[l7] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af2[l7] = Float.intBitsToFloat(qlo1.k());
                e = af2;
                break;

            case 42: // '*'
                int i2 = qlo1.i();
                int k13 = qlo1.c(i2);
                int i8 = i2 / 4;
                float af3[];
                if (e == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = e.length;
                }
                af3 = new float[i8 + i2];
                i8 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(e, 0, af3, 0, i2);
                    i8 = i2;
                }
                for (; i8 < af3.length; i8++)
                {
                    af3[i8] = Float.intBitsToFloat(qlo1.k());
                }

                e = af3;
                qlo1.d(k13);
                break;

            case 53: // '5'
                int j8 = qmb.b(qlo1, 53);
                float af4[];
                int j2;
                if (f == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = f.length;
                }
                af4 = new float[j8 + j2];
                j8 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(f, 0, af4, 0, j2);
                    j8 = j2;
                }
                for (; j8 < af4.length - 1; j8++)
                {
                    af4[j8] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af4[j8] = Float.intBitsToFloat(qlo1.k());
                f = af4;
                break;

            case 50: // '2'
                int k2 = qlo1.i();
                int l13 = qlo1.c(k2);
                int k8 = k2 / 4;
                float af5[];
                if (f == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = f.length;
                }
                af5 = new float[k8 + k2];
                k8 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(f, 0, af5, 0, k2);
                    k8 = k2;
                }
                for (; k8 < af5.length; k8++)
                {
                    af5[k8] = Float.intBitsToFloat(qlo1.k());
                }

                f = af5;
                qlo1.d(l13);
                break;

            case 61: // '='
                int l8 = qmb.b(qlo1, 61);
                float af6[];
                int l2;
                if (g == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = g.length;
                }
                af6 = new float[l8 + l2];
                l8 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(g, 0, af6, 0, l2);
                    l8 = l2;
                }
                for (; l8 < af6.length - 1; l8++)
                {
                    af6[l8] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af6[l8] = Float.intBitsToFloat(qlo1.k());
                g = af6;
                break;

            case 58: // ':'
                int i3 = qlo1.i();
                int i14 = qlo1.c(i3);
                int i9 = i3 / 4;
                float af7[];
                if (g == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = g.length;
                }
                af7 = new float[i9 + i3];
                i9 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(g, 0, af7, 0, i3);
                    i9 = i3;
                }
                for (; i9 < af7.length; i9++)
                {
                    af7[i9] = Float.intBitsToFloat(qlo1.k());
                }

                g = af7;
                qlo1.d(i14);
                break;

            case 69: // 'E'
                int j9 = qmb.b(qlo1, 69);
                float af8[];
                int j3;
                if (s == null)
                {
                    j3 = 0;
                } else
                {
                    j3 = s.length;
                }
                af8 = new float[j9 + j3];
                j9 = j3;
                if (j3 != 0)
                {
                    System.arraycopy(s, 0, af8, 0, j3);
                    j9 = j3;
                }
                for (; j9 < af8.length - 1; j9++)
                {
                    af8[j9] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af8[j9] = Float.intBitsToFloat(qlo1.k());
                s = af8;
                break;

            case 66: // 'B'
                int k3 = qlo1.i();
                int j14 = qlo1.c(k3);
                int k9 = k3 / 4;
                float af9[];
                if (s == null)
                {
                    k3 = 0;
                } else
                {
                    k3 = s.length;
                }
                af9 = new float[k9 + k3];
                k9 = k3;
                if (k3 != 0)
                {
                    System.arraycopy(s, 0, af9, 0, k3);
                    k9 = k3;
                }
                for (; k9 < af9.length; k9++)
                {
                    af9[k9] = Float.intBitsToFloat(qlo1.k());
                }

                s = af9;
                qlo1.d(j14);
                break;

            case 74: // 'J'
                int l9 = qmb.b(qlo1, 74);
                cvt acvt[];
                int l3;
                if (t == null)
                {
                    l3 = 0;
                } else
                {
                    l3 = t.length;
                }
                acvt = new cvt[l9 + l3];
                l9 = l3;
                if (l3 != 0)
                {
                    System.arraycopy(t, 0, acvt, 0, l3);
                    l9 = l3;
                }
                for (; l9 < acvt.length - 1; l9++)
                {
                    acvt[l9] = new cvt();
                    qlo1.a(acvt[l9]);
                    qlo1.a();
                }

                acvt[l9] = new cvt();
                qlo1.a(acvt[l9]);
                t = acvt;
                break;

            case 85: // 'U'
                h = Float.intBitsToFloat(qlo1.k());
                break;

            case 93: // ']'
                i = Float.intBitsToFloat(qlo1.k());
                break;

            case 101: // 'e'
                int i10 = qmb.b(qlo1, 101);
                float af10[];
                int i4;
                if (j == null)
                {
                    i4 = 0;
                } else
                {
                    i4 = j.length;
                }
                af10 = new float[i10 + i4];
                i10 = i4;
                if (i4 != 0)
                {
                    System.arraycopy(j, 0, af10, 0, i4);
                    i10 = i4;
                }
                for (; i10 < af10.length - 1; i10++)
                {
                    af10[i10] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af10[i10] = Float.intBitsToFloat(qlo1.k());
                j = af10;
                break;

            case 98: // 'b'
                int j4 = qlo1.i();
                int k14 = qlo1.c(j4);
                int j10 = j4 / 4;
                float af11[];
                if (j == null)
                {
                    j4 = 0;
                } else
                {
                    j4 = j.length;
                }
                af11 = new float[j10 + j4];
                j10 = j4;
                if (j4 != 0)
                {
                    System.arraycopy(j, 0, af11, 0, j4);
                    j10 = j4;
                }
                for (; j10 < af11.length; j10++)
                {
                    af11[j10] = Float.intBitsToFloat(qlo1.k());
                }

                j = af11;
                qlo1.d(k14);
                break;

            case 106: // 'j'
                if (k == null)
                {
                    k = new cwf();
                }
                qlo1.a(k);
                break;

            case 117: // 'u'
                l = Float.intBitsToFloat(qlo1.k());
                break;

            case 122: // 'z'
                if (u == null)
                {
                    u = new cwf();
                }
                qlo1.a(u);
                break;

            case 130: 
                if (v == null)
                {
                    v = new cwf();
                }
                qlo1.a(v);
                break;

            case 141: 
                int k10 = qmb.b(qlo1, 141);
                float af12[];
                int k4;
                if (w == null)
                {
                    k4 = 0;
                } else
                {
                    k4 = w.length;
                }
                af12 = new float[k10 + k4];
                k10 = k4;
                if (k4 != 0)
                {
                    System.arraycopy(w, 0, af12, 0, k4);
                    k10 = k4;
                }
                for (; k10 < af12.length - 1; k10++)
                {
                    af12[k10] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af12[k10] = Float.intBitsToFloat(qlo1.k());
                w = af12;
                break;

            case 138: 
                int l4 = qlo1.i();
                int l14 = qlo1.c(l4);
                int l10 = l4 / 4;
                float af13[];
                if (w == null)
                {
                    l4 = 0;
                } else
                {
                    l4 = w.length;
                }
                af13 = new float[l10 + l4];
                l10 = l4;
                if (l4 != 0)
                {
                    System.arraycopy(w, 0, af13, 0, l4);
                    l10 = l4;
                }
                for (; l10 < af13.length; l10++)
                {
                    af13[l10] = Float.intBitsToFloat(qlo1.k());
                }

                w = af13;
                qlo1.d(l14);
                break;

            case 146: 
                int i11 = qmb.b(qlo1, 146);
                cvt acvt1[];
                int i5;
                if (x == null)
                {
                    i5 = 0;
                } else
                {
                    i5 = x.length;
                }
                acvt1 = new cvt[i11 + i5];
                i11 = i5;
                if (i5 != 0)
                {
                    System.arraycopy(x, 0, acvt1, 0, i5);
                    i11 = i5;
                }
                for (; i11 < acvt1.length - 1; i11++)
                {
                    acvt1[i11] = new cvt();
                    qlo1.a(acvt1[i11]);
                    qlo1.a();
                }

                acvt1[i11] = new cvt();
                qlo1.a(acvt1[i11]);
                x = acvt1;
                break;

            case 154: 
                if (m == null)
                {
                    m = new cwf();
                }
                qlo1.a(m);
                break;

            case 162: 
                if (n == null)
                {
                    n = new cwf();
                }
                qlo1.a(n);
                break;

            case 170: 
                if (o == null)
                {
                    o = new cwf();
                }
                qlo1.a(o);
                break;

            case 178: 
                if (p == null)
                {
                    p = new cwf();
                }
                qlo1.a(p);
                break;

            case 189: 
                int j11 = qmb.b(qlo1, 189);
                float af14[];
                int j5;
                if (y == null)
                {
                    j5 = 0;
                } else
                {
                    j5 = y.length;
                }
                af14 = new float[j11 + j5];
                j11 = j5;
                if (j5 != 0)
                {
                    System.arraycopy(y, 0, af14, 0, j5);
                    j11 = j5;
                }
                for (; j11 < af14.length - 1; j11++)
                {
                    af14[j11] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af14[j11] = Float.intBitsToFloat(qlo1.k());
                y = af14;
                break;

            case 186: 
                int k5 = qlo1.i();
                int i15 = qlo1.c(k5);
                int k11 = k5 / 4;
                float af15[];
                if (y == null)
                {
                    k5 = 0;
                } else
                {
                    k5 = y.length;
                }
                af15 = new float[k11 + k5];
                k11 = k5;
                if (k5 != 0)
                {
                    System.arraycopy(y, 0, af15, 0, k5);
                    k11 = k5;
                }
                for (; k11 < af15.length; k11++)
                {
                    af15[k11] = Float.intBitsToFloat(qlo1.k());
                }

                y = af15;
                qlo1.d(i15);
                break;

            case 197: 
                int l11 = qmb.b(qlo1, 197);
                float af16[];
                int l5;
                if (z == null)
                {
                    l5 = 0;
                } else
                {
                    l5 = z.length;
                }
                af16 = new float[l11 + l5];
                l11 = l5;
                if (l5 != 0)
                {
                    System.arraycopy(z, 0, af16, 0, l5);
                    l11 = l5;
                }
                for (; l11 < af16.length - 1; l11++)
                {
                    af16[l11] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af16[l11] = Float.intBitsToFloat(qlo1.k());
                z = af16;
                break;

            case 194: 
                int i6 = qlo1.i();
                int j15 = qlo1.c(i6);
                int i12 = i6 / 4;
                float af17[];
                if (z == null)
                {
                    i6 = 0;
                } else
                {
                    i6 = z.length;
                }
                af17 = new float[i12 + i6];
                i12 = i6;
                if (i6 != 0)
                {
                    System.arraycopy(z, 0, af17, 0, i6);
                    i12 = i6;
                }
                for (; i12 < af17.length; i12++)
                {
                    af17[i12] = Float.intBitsToFloat(qlo1.k());
                }

                z = af17;
                qlo1.d(j15);
                break;

            case 205: 
                int j12 = qmb.b(qlo1, 205);
                float af18[];
                int j6;
                if (q == null)
                {
                    j6 = 0;
                } else
                {
                    j6 = q.length;
                }
                af18 = new float[j12 + j6];
                j12 = j6;
                if (j6 != 0)
                {
                    System.arraycopy(q, 0, af18, 0, j6);
                    j12 = j6;
                }
                for (; j12 < af18.length - 1; j12++)
                {
                    af18[j12] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af18[j12] = Float.intBitsToFloat(qlo1.k());
                q = af18;
                break;

            case 202: 
                int k6 = qlo1.i();
                int k15 = qlo1.c(k6);
                int k12 = k6 / 4;
                float af19[];
                if (q == null)
                {
                    k6 = 0;
                } else
                {
                    k6 = q.length;
                }
                af19 = new float[k12 + k6];
                k12 = k6;
                if (k6 != 0)
                {
                    System.arraycopy(q, 0, af19, 0, k6);
                    k12 = k6;
                }
                for (; k12 < af19.length; k12++)
                {
                    af19[k12] = Float.intBitsToFloat(qlo1.k());
                }

                q = af19;
                qlo1.d(k15);
                break;

            case 213: 
                int l12 = qmb.b(qlo1, 213);
                float af20[];
                int l6;
                if (r == null)
                {
                    l6 = 0;
                } else
                {
                    l6 = r.length;
                }
                af20 = new float[l12 + l6];
                l12 = l6;
                if (l6 != 0)
                {
                    System.arraycopy(r, 0, af20, 0, l6);
                    l12 = l6;
                }
                for (; l12 < af20.length - 1; l12++)
                {
                    af20[l12] = Float.intBitsToFloat(qlo1.k());
                    qlo1.a();
                }

                af20[l12] = Float.intBitsToFloat(qlo1.k());
                r = af20;
                break;

            case 210: 
                int i7 = qlo1.i();
                int l15 = qlo1.c(i7);
                int i13 = i7 / 4;
                float af21[];
                if (r == null)
                {
                    i7 = 0;
                } else
                {
                    i7 = r.length;
                }
                af21 = new float[i13 + i7];
                i13 = i7;
                if (i7 != 0)
                {
                    System.arraycopy(r, 0, af21, 0, i7);
                    i13 = i7;
                }
                for (; i13 < af21.length; i13++)
                {
                    af21[i13] = Float.intBitsToFloat(qlo1.k());
                }

                r = af21;
                qlo1.d(l15);
                break;

            case 218: 
                if (A == null)
                {
                    A = new cvu();
                }
                qlo1.a(A);
                break;
            }
        } while (true);
    }

    public final void a(qlp qlp1)
    {
        boolean flag = false;
        if (Float.floatToIntBits(a) != Float.floatToIntBits((0.0F / 0.0F)))
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (c != null)
        {
            qlp1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i1 = 0; i1 < d.length; i1++)
            {
                qlp1.a(4, d[i1]);
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j1 = 0; j1 < e.length; j1++)
            {
                qlp1.a(5, e[j1]);
            }

        }
        if (f != null && f.length > 0)
        {
            for (int k1 = 0; k1 < f.length; k1++)
            {
                qlp1.a(6, f[k1]);
            }

        }
        if (g != null && g.length > 0)
        {
            for (int l1 = 0; l1 < g.length; l1++)
            {
                qlp1.a(7, g[l1]);
            }

        }
        if (s != null && s.length > 0)
        {
            for (int i2 = 0; i2 < s.length; i2++)
            {
                qlp1.a(8, s[i2]);
            }

        }
        if (t != null && t.length > 0)
        {
            for (int j2 = 0; j2 < t.length; j2++)
            {
                cvt cvt1 = t[j2];
                if (cvt1 != null)
                {
                    qlp1.a(9, cvt1);
                }
            }

        }
        if (Float.floatToIntBits(h) != Float.floatToIntBits((0.0F / 0.0F)))
        {
            qlp1.a(10, h);
        }
        if (Float.floatToIntBits(i) != Float.floatToIntBits((0.0F / 0.0F)))
        {
            qlp1.a(11, i);
        }
        if (j != null && j.length > 0)
        {
            for (int k2 = 0; k2 < j.length; k2++)
            {
                qlp1.a(12, j[k2]);
            }

        }
        if (k != null)
        {
            qlp1.a(13, k);
        }
        if (Float.floatToIntBits(l) != Float.floatToIntBits((0.0F / 0.0F)))
        {
            qlp1.a(14, l);
        }
        if (u != null)
        {
            qlp1.a(15, u);
        }
        if (v != null)
        {
            qlp1.a(16, v);
        }
        if (w != null && w.length > 0)
        {
            for (int l2 = 0; l2 < w.length; l2++)
            {
                qlp1.a(17, w[l2]);
            }

        }
        if (x != null && x.length > 0)
        {
            for (int i3 = 0; i3 < x.length; i3++)
            {
                cvt cvt2 = x[i3];
                if (cvt2 != null)
                {
                    qlp1.a(18, cvt2);
                }
            }

        }
        if (m != null)
        {
            qlp1.a(19, m);
        }
        if (n != null)
        {
            qlp1.a(20, n);
        }
        if (o != null)
        {
            qlp1.a(21, o);
        }
        if (p != null)
        {
            qlp1.a(22, p);
        }
        if (y != null && y.length > 0)
        {
            for (int j3 = 0; j3 < y.length; j3++)
            {
                qlp1.a(23, y[j3]);
            }

        }
        if (z != null && z.length > 0)
        {
            for (int k3 = 0; k3 < z.length; k3++)
            {
                qlp1.a(24, z[k3]);
            }

        }
        if (q != null && q.length > 0)
        {
            for (int l3 = 0; l3 < q.length; l3++)
            {
                qlp1.a(25, q[l3]);
            }

        }
        if (r != null && r.length > 0)
        {
            for (int i4 = ((flag) ? 1 : 0); i4 < r.length; i4++)
            {
                qlp1.a(26, r[i4]);
            }

        }
        if (A != null)
        {
            qlp1.a(27, A);
        }
        super.a(qlp1);
    }
}
