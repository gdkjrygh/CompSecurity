// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            kv, g, lf, kz, 
//            ku, kt, lb

public static final class s extends kv
{

    private static volatile c k[];
    public int a[];
    public int b[];
    public int c[];
    public int d[];
    public int e[];
    public int f[];
    public int g[];
    public int h[];
    public int i[];
    public int j[];

    public static s[] b()
    {
        if (k == null)
        {
            synchronized (kz.a)
            {
                if (k == null)
                {
                    k = new k[0];
                }
            }
        }
        return k;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        boolean flag = false;
        int k1 = super.a();
        int i1;
        int j1;
        if (a != null && a.length > 0)
        {
            int l = 0;
            j1 = 0;
            for (; l < a.length; l++)
            {
                j1 += ku.a(a[l]);
            }

            j1 = k1 + j1 + a.length * 1;
        } else
        {
            j1 = k1;
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1;
            if (b.length > 0)
            {
                i1 = 0;
                k1 = 0;
                for (; i1 < b.length; i1++)
                {
                    k1 += ku.a(b[i1]);
                }

                i1 = j1 + k1 + b.length * 1;
            }
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1;
            if (c.length > 0)
            {
                j1 = 0;
                k1 = 0;
                for (; j1 < c.length; j1++)
                {
                    k1 += ku.a(c[j1]);
                }

                j1 = i1 + k1 + c.length * 1;
            }
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1;
            if (d.length > 0)
            {
                i1 = 0;
                k1 = 0;
                for (; i1 < d.length; i1++)
                {
                    k1 += ku.a(d[i1]);
                }

                i1 = j1 + k1 + d.length * 1;
            }
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                j1 = 0;
                k1 = 0;
                for (; j1 < e.length; j1++)
                {
                    k1 += ku.a(e[j1]);
                }

                j1 = i1 + k1 + e.length * 1;
            }
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1;
            if (f.length > 0)
            {
                i1 = 0;
                k1 = 0;
                for (; i1 < f.length; i1++)
                {
                    k1 += ku.a(f[i1]);
                }

                i1 = j1 + k1 + f.length * 1;
            }
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1;
            if (g.length > 0)
            {
                j1 = 0;
                k1 = 0;
                for (; j1 < g.length; j1++)
                {
                    k1 += ku.a(g[j1]);
                }

                j1 = i1 + k1 + g.length * 1;
            }
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1;
            if (h.length > 0)
            {
                i1 = 0;
                k1 = 0;
                for (; i1 < h.length; i1++)
                {
                    k1 += ku.a(h[i1]);
                }

                i1 = j1 + k1 + h.length * 1;
            }
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                j1 = 0;
                k1 = 0;
                for (; j1 < i.length; j1++)
                {
                    k1 += ku.a(i[j1]);
                }

                j1 = i1 + k1 + i.length * 1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1;
            if (j.length > 0)
            {
                k1 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < j.length; i1++)
                {
                    k1 += ku.a(j[i1]);
                }

                i1 = j1 + k1 + j.length * 1;
            }
        }
        return i1;
    }

    public final lb a(kt kt1)
        throws IOException
    {
        do
        {
            int l = kt1.a();
            switch (l)
            {
            default:
                if (a(kt1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                int i6 = lf.a(kt1, 8);
                int ai[];
                int i1;
                if (a == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = a.length;
                }
                ai = new int[i6 + i1];
                i6 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(a, 0, ai, 0, i1);
                    i6 = i1;
                }
                for (; i6 < ai.length - 1; i6++)
                {
                    ai[i6] = kt1.f();
                    kt1.a();
                }

                ai[i6] = kt1.f();
                a = ai;
                break;

            case 10: // '\n'
                int i11 = kt1.c(kt1.f());
                int j1 = kt1.j();
                int j6;
                for (j6 = 0; kt1.i() > 0; j6++)
                {
                    kt1.f();
                }

                kt1.e(j1);
                int ai1[];
                if (a == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = a.length;
                }
                ai1 = new int[j6 + j1];
                j6 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, ai1, 0, j1);
                    j6 = j1;
                }
                for (; j6 < ai1.length; j6++)
                {
                    ai1[j6] = kt1.f();
                }

                a = ai1;
                kt1.d(i11);
                break;

            case 16: // '\020'
                int k6 = lf.a(kt1, 16);
                int ai2[];
                int k1;
                if (b == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = b.length;
                }
                ai2 = new int[k6 + k1];
                k6 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(b, 0, ai2, 0, k1);
                    k6 = k1;
                }
                for (; k6 < ai2.length - 1; k6++)
                {
                    ai2[k6] = kt1.f();
                    kt1.a();
                }

                ai2[k6] = kt1.f();
                b = ai2;
                break;

            case 18: // '\022'
                int j11 = kt1.c(kt1.f());
                int l1 = kt1.j();
                int l6;
                for (l6 = 0; kt1.i() > 0; l6++)
                {
                    kt1.f();
                }

                kt1.e(l1);
                int ai3[];
                if (b == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = b.length;
                }
                ai3 = new int[l6 + l1];
                l6 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(b, 0, ai3, 0, l1);
                    l6 = l1;
                }
                for (; l6 < ai3.length; l6++)
                {
                    ai3[l6] = kt1.f();
                }

                b = ai3;
                kt1.d(j11);
                break;

            case 24: // '\030'
                int i7 = lf.a(kt1, 24);
                int ai4[];
                int i2;
                if (c == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = c.length;
                }
                ai4 = new int[i7 + i2];
                i7 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(c, 0, ai4, 0, i2);
                    i7 = i2;
                }
                for (; i7 < ai4.length - 1; i7++)
                {
                    ai4[i7] = kt1.f();
                    kt1.a();
                }

                ai4[i7] = kt1.f();
                c = ai4;
                break;

            case 26: // '\032'
                int k11 = kt1.c(kt1.f());
                int j2 = kt1.j();
                int j7;
                for (j7 = 0; kt1.i() > 0; j7++)
                {
                    kt1.f();
                }

                kt1.e(j2);
                int ai5[];
                if (c == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = c.length;
                }
                ai5 = new int[j7 + j2];
                j7 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(c, 0, ai5, 0, j2);
                    j7 = j2;
                }
                for (; j7 < ai5.length; j7++)
                {
                    ai5[j7] = kt1.f();
                }

                c = ai5;
                kt1.d(k11);
                break;

            case 32: // ' '
                int k7 = lf.a(kt1, 32);
                int ai6[];
                int k2;
                if (d == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = d.length;
                }
                ai6 = new int[k7 + k2];
                k7 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(d, 0, ai6, 0, k2);
                    k7 = k2;
                }
                for (; k7 < ai6.length - 1; k7++)
                {
                    ai6[k7] = kt1.f();
                    kt1.a();
                }

                ai6[k7] = kt1.f();
                d = ai6;
                break;

            case 34: // '"'
                int l11 = kt1.c(kt1.f());
                int l2 = kt1.j();
                int l7;
                for (l7 = 0; kt1.i() > 0; l7++)
                {
                    kt1.f();
                }

                kt1.e(l2);
                int ai7[];
                if (d == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = d.length;
                }
                ai7 = new int[l7 + l2];
                l7 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(d, 0, ai7, 0, l2);
                    l7 = l2;
                }
                for (; l7 < ai7.length; l7++)
                {
                    ai7[l7] = kt1.f();
                }

                d = ai7;
                kt1.d(l11);
                break;

            case 40: // '('
                int i8 = lf.a(kt1, 40);
                int ai8[];
                int i3;
                if (e == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = e.length;
                }
                ai8 = new int[i8 + i3];
                i8 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(e, 0, ai8, 0, i3);
                    i8 = i3;
                }
                for (; i8 < ai8.length - 1; i8++)
                {
                    ai8[i8] = kt1.f();
                    kt1.a();
                }

                ai8[i8] = kt1.f();
                e = ai8;
                break;

            case 42: // '*'
                int i12 = kt1.c(kt1.f());
                int j3 = kt1.j();
                int j8;
                for (j8 = 0; kt1.i() > 0; j8++)
                {
                    kt1.f();
                }

                kt1.e(j3);
                int ai9[];
                if (e == null)
                {
                    j3 = 0;
                } else
                {
                    j3 = e.length;
                }
                ai9 = new int[j8 + j3];
                j8 = j3;
                if (j3 != 0)
                {
                    System.arraycopy(e, 0, ai9, 0, j3);
                    j8 = j3;
                }
                for (; j8 < ai9.length; j8++)
                {
                    ai9[j8] = kt1.f();
                }

                e = ai9;
                kt1.d(i12);
                break;

            case 48: // '0'
                int k8 = lf.a(kt1, 48);
                int ai10[];
                int k3;
                if (f == null)
                {
                    k3 = 0;
                } else
                {
                    k3 = f.length;
                }
                ai10 = new int[k8 + k3];
                k8 = k3;
                if (k3 != 0)
                {
                    System.arraycopy(f, 0, ai10, 0, k3);
                    k8 = k3;
                }
                for (; k8 < ai10.length - 1; k8++)
                {
                    ai10[k8] = kt1.f();
                    kt1.a();
                }

                ai10[k8] = kt1.f();
                f = ai10;
                break;

            case 50: // '2'
                int j12 = kt1.c(kt1.f());
                int l3 = kt1.j();
                int l8;
                for (l8 = 0; kt1.i() > 0; l8++)
                {
                    kt1.f();
                }

                kt1.e(l3);
                int ai11[];
                if (f == null)
                {
                    l3 = 0;
                } else
                {
                    l3 = f.length;
                }
                ai11 = new int[l8 + l3];
                l8 = l3;
                if (l3 != 0)
                {
                    System.arraycopy(f, 0, ai11, 0, l3);
                    l8 = l3;
                }
                for (; l8 < ai11.length; l8++)
                {
                    ai11[l8] = kt1.f();
                }

                f = ai11;
                kt1.d(j12);
                break;

            case 56: // '8'
                int i9 = lf.a(kt1, 56);
                int ai12[];
                int i4;
                if (g == null)
                {
                    i4 = 0;
                } else
                {
                    i4 = g.length;
                }
                ai12 = new int[i9 + i4];
                i9 = i4;
                if (i4 != 0)
                {
                    System.arraycopy(g, 0, ai12, 0, i4);
                    i9 = i4;
                }
                for (; i9 < ai12.length - 1; i9++)
                {
                    ai12[i9] = kt1.f();
                    kt1.a();
                }

                ai12[i9] = kt1.f();
                g = ai12;
                break;

            case 58: // ':'
                int k12 = kt1.c(kt1.f());
                int j4 = kt1.j();
                int j9;
                for (j9 = 0; kt1.i() > 0; j9++)
                {
                    kt1.f();
                }

                kt1.e(j4);
                int ai13[];
                if (g == null)
                {
                    j4 = 0;
                } else
                {
                    j4 = g.length;
                }
                ai13 = new int[j9 + j4];
                j9 = j4;
                if (j4 != 0)
                {
                    System.arraycopy(g, 0, ai13, 0, j4);
                    j9 = j4;
                }
                for (; j9 < ai13.length; j9++)
                {
                    ai13[j9] = kt1.f();
                }

                g = ai13;
                kt1.d(k12);
                break;

            case 64: // '@'
                int k9 = lf.a(kt1, 64);
                int ai14[];
                int k4;
                if (h == null)
                {
                    k4 = 0;
                } else
                {
                    k4 = h.length;
                }
                ai14 = new int[k9 + k4];
                k9 = k4;
                if (k4 != 0)
                {
                    System.arraycopy(h, 0, ai14, 0, k4);
                    k9 = k4;
                }
                for (; k9 < ai14.length - 1; k9++)
                {
                    ai14[k9] = kt1.f();
                    kt1.a();
                }

                ai14[k9] = kt1.f();
                h = ai14;
                break;

            case 66: // 'B'
                int l12 = kt1.c(kt1.f());
                int l4 = kt1.j();
                int l9;
                for (l9 = 0; kt1.i() > 0; l9++)
                {
                    kt1.f();
                }

                kt1.e(l4);
                int ai15[];
                if (h == null)
                {
                    l4 = 0;
                } else
                {
                    l4 = h.length;
                }
                ai15 = new int[l9 + l4];
                l9 = l4;
                if (l4 != 0)
                {
                    System.arraycopy(h, 0, ai15, 0, l4);
                    l9 = l4;
                }
                for (; l9 < ai15.length; l9++)
                {
                    ai15[l9] = kt1.f();
                }

                h = ai15;
                kt1.d(l12);
                break;

            case 72: // 'H'
                int i10 = lf.a(kt1, 72);
                int ai16[];
                int i5;
                if (i == null)
                {
                    i5 = 0;
                } else
                {
                    i5 = i.length;
                }
                ai16 = new int[i10 + i5];
                i10 = i5;
                if (i5 != 0)
                {
                    System.arraycopy(i, 0, ai16, 0, i5);
                    i10 = i5;
                }
                for (; i10 < ai16.length - 1; i10++)
                {
                    ai16[i10] = kt1.f();
                    kt1.a();
                }

                ai16[i10] = kt1.f();
                i = ai16;
                break;

            case 74: // 'J'
                int i13 = kt1.c(kt1.f());
                int j5 = kt1.j();
                int j10;
                for (j10 = 0; kt1.i() > 0; j10++)
                {
                    kt1.f();
                }

                kt1.e(j5);
                int ai17[];
                if (i == null)
                {
                    j5 = 0;
                } else
                {
                    j5 = i.length;
                }
                ai17 = new int[j10 + j5];
                j10 = j5;
                if (j5 != 0)
                {
                    System.arraycopy(i, 0, ai17, 0, j5);
                    j10 = j5;
                }
                for (; j10 < ai17.length; j10++)
                {
                    ai17[j10] = kt1.f();
                }

                i = ai17;
                kt1.d(i13);
                break;

            case 80: // 'P'
                int k10 = lf.a(kt1, 80);
                int ai18[];
                int k5;
                if (j == null)
                {
                    k5 = 0;
                } else
                {
                    k5 = j.length;
                }
                ai18 = new int[k10 + k5];
                k10 = k5;
                if (k5 != 0)
                {
                    System.arraycopy(j, 0, ai18, 0, k5);
                    k10 = k5;
                }
                for (; k10 < ai18.length - 1; k10++)
                {
                    ai18[k10] = kt1.f();
                    kt1.a();
                }

                ai18[k10] = kt1.f();
                j = ai18;
                break;

            case 82: // 'R'
                int j13 = kt1.c(kt1.f());
                int l5 = kt1.j();
                int l10;
                for (l10 = 0; kt1.i() > 0; l10++)
                {
                    kt1.f();
                }

                kt1.e(l5);
                int ai19[];
                if (j == null)
                {
                    l5 = 0;
                } else
                {
                    l5 = j.length;
                }
                ai19 = new int[l10 + l5];
                l10 = l5;
                if (l5 != 0)
                {
                    System.arraycopy(j, 0, ai19, 0, l5);
                    l10 = l5;
                }
                for (; l10 < ai19.length; l10++)
                {
                    ai19[l10] = kt1.f();
                }

                j = ai19;
                kt1.d(j13);
                break;
            }
        } while (true);
    }

    public final void a(ku ku1)
        throws IOException
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int l = 0; l < a.length; l++)
            {
                ku1.a(1, a[l]);
            }

        }
        if (b != null && b.length > 0)
        {
            for (int i1 = 0; i1 < b.length; i1++)
            {
                ku1.a(2, b[i1]);
            }

        }
        if (c != null && c.length > 0)
        {
            for (int j1 = 0; j1 < c.length; j1++)
            {
                ku1.a(3, c[j1]);
            }

        }
        if (d != null && d.length > 0)
        {
            for (int k1 = 0; k1 < d.length; k1++)
            {
                ku1.a(4, d[k1]);
            }

        }
        if (e != null && e.length > 0)
        {
            for (int l1 = 0; l1 < e.length; l1++)
            {
                ku1.a(5, e[l1]);
            }

        }
        if (f != null && f.length > 0)
        {
            for (int i2 = 0; i2 < f.length; i2++)
            {
                ku1.a(6, f[i2]);
            }

        }
        if (g != null && g.length > 0)
        {
            for (int j2 = 0; j2 < g.length; j2++)
            {
                ku1.a(7, g[j2]);
            }

        }
        if (h != null && h.length > 0)
        {
            for (int k2 = 0; k2 < h.length; k2++)
            {
                ku1.a(8, h[k2]);
            }

        }
        if (i != null && i.length > 0)
        {
            for (int l2 = 0; l2 < i.length; l2++)
            {
                ku1.a(9, i[l2]);
            }

        }
        if (j != null && j.length > 0)
        {
            for (int i3 = ((flag) ? 1 : 0); i3 < j.length; i3++)
            {
                ku1.a(10, j[i3]);
            }

        }
        super.a(ku1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof )
            {
                obj = ()obj;
                flag = flag1;
                if (kz.a(a, ((a) (obj)).a))
                {
                    flag = flag1;
                    if (kz.a(b, ((b) (obj)).b))
                    {
                        flag = flag1;
                        if (kz.a(c, ((c) (obj)).c))
                        {
                            flag = flag1;
                            if (kz.a(d, ((d) (obj)).d))
                            {
                                flag = flag1;
                                if (kz.a(e, ((e) (obj)).e))
                                {
                                    flag = flag1;
                                    if (kz.a(f, ((f) (obj)).f))
                                    {
                                        flag = flag1;
                                        if (kz.a(g, ((g) (obj)).g))
                                        {
                                            flag = flag1;
                                            if (kz.a(h, ((h) (obj)).h))
                                            {
                                                flag = flag1;
                                                if (kz.a(i, ((i) (obj)).i))
                                                {
                                                    flag = flag1;
                                                    if (kz.a(j, ((j) (obj)).j))
                                                    {
                                                        return a(((kv) (obj)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return ((((((((((kz.a(a) + 527) * 31 + kz.a(b)) * 31 + kz.a(c)) * 31 + kz.a(d)) * 31 + kz.a(e)) * 31 + kz.a(f)) * 31 + kz.a(g)) * 31 + kz.a(h)) * 31 + kz.a(i)) * 31 + kz.a(j)) * 31 + c();
    }

    public ()
    {
        a = lf.a;
        b = lf.a;
        c = lf.a;
        d = lf.a;
        e = lf.a;
        f = lf.a;
        g = lf.a;
        h = lf.a;
        i = lf.a;
        j = lf.a;
        r = null;
        s = -1;
    }
}
