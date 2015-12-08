// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrq, zzrf, zzrg, 
//            zzrl, zzrn

public final class a extends zzrh
{

    public byte a[];
    public String b;
    public double c;
    public float d;
    public long e;
    public int f;
    public int g;
    public boolean h;
    public d i[];
    public d j[];
    public String k[];
    public long l[];
    public float m[];
    public long n;

    public a a()
    {
        a = zzrq.h;
        b = "";
        c = 0.0D;
        d = 0.0F;
        e = 0L;
        f = 0;
        g = 0;
        h = false;
        i = i();
        j = j();
        k = zzrq.f;
        l = zzrq.b;
        m = zzrq.c;
        n = 0L;
        o = null;
        p = -1;
        return this;
    }

    public p a(zzrf zzrf1)
    {
        do
        {
            int i1 = zzrf1.a();
            switch (i1)
            {
            default:
                if (a(zzrf1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = zzrf1.i();
                break;

            case 18: // '\022'
                b = zzrf1.h();
                break;

            case 25: // '\031'
                c = zzrf1.c();
                break;

            case 37: // '%'
                d = zzrf1.d();
                break;

            case 40: // '('
                e = zzrf1.e();
                break;

            case 48: // '0'
                f = zzrf1.f();
                break;

            case 56: // '8'
                g = zzrf1.j();
                break;

            case 64: // '@'
                h = zzrf1.g();
                break;

            case 74: // 'J'
                int i3 = zzrq.a(zzrf1, 74);
                p ap[];
                int j1;
                if (i == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = i.length;
                }
                ap = new i[i3 + j1];
                i3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(i, 0, ap, 0, j1);
                    i3 = j1;
                }
                for (; i3 < ap.length - 1; i3++)
                {
                    ap[i3] = new i();
                    zzrf1.a(ap[i3]);
                    zzrf1.a();
                }

                ap[i3] = new i();
                zzrf1.a(ap[i3]);
                i = ap;
                break;

            case 82: // 'R'
                int j3 = zzrq.a(zzrf1, 82);
                p ap1[];
                int k1;
                if (j == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = j.length;
                }
                ap1 = new j[j3 + k1];
                j3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(j, 0, ap1, 0, k1);
                    j3 = k1;
                }
                for (; j3 < ap1.length - 1; j3++)
                {
                    ap1[j3] = new t>();
                    zzrf1.a(ap1[j3]);
                    zzrf1.a();
                }

                ap1[j3] = new t>();
                zzrf1.a(ap1[j3]);
                j = ap1;
                break;

            case 90: // 'Z'
                int k3 = zzrq.a(zzrf1, 90);
                String as[];
                int l1;
                if (k == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = k.length;
                }
                as = new String[k3 + l1];
                k3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(k, 0, as, 0, l1);
                    k3 = l1;
                }
                for (; k3 < as.length - 1; k3++)
                {
                    as[k3] = zzrf1.h();
                    zzrf1.a();
                }

                as[k3] = zzrf1.h();
                k = as;
                break;

            case 96: // '`'
                int l3 = zzrq.a(zzrf1, 96);
                long al[];
                int i2;
                if (l == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = l.length;
                }
                al = new long[l3 + i2];
                l3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(l, 0, al, 0, i2);
                    l3 = i2;
                }
                for (; l3 < al.length - 1; l3++)
                {
                    al[l3] = zzrf1.e();
                    zzrf1.a();
                }

                al[l3] = zzrf1.e();
                l = al;
                break;

            case 98: // 'b'
                int l4 = zzrf1.d(zzrf1.k());
                int j2 = zzrf1.q();
                int i4;
                for (i4 = 0; zzrf1.o() > 0; i4++)
                {
                    zzrf1.e();
                }

                zzrf1.f(j2);
                long al1[];
                if (l == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = l.length;
                }
                al1 = new long[i4 + j2];
                i4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(l, 0, al1, 0, j2);
                    i4 = j2;
                }
                for (; i4 < al1.length; i4++)
                {
                    al1[i4] = zzrf1.e();
                }

                l = al1;
                zzrf1.e(l4);
                break;

            case 104: // 'h'
                n = zzrf1.e();
                break;

            case 117: // 'u'
                int j4 = zzrq.a(zzrf1, 117);
                float af[];
                int k2;
                if (m == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = m.length;
                }
                af = new float[j4 + k2];
                j4 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(m, 0, af, 0, k2);
                    j4 = k2;
                }
                for (; j4 < af.length - 1; j4++)
                {
                    af[j4] = zzrf1.d();
                    zzrf1.a();
                }

                af[j4] = zzrf1.d();
                m = af;
                break;

            case 114: // 'r'
                int l2 = zzrf1.k();
                int i5 = zzrf1.d(l2);
                int k4 = l2 / 4;
                float af1[];
                if (m == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = m.length;
                }
                af1 = new float[k4 + l2];
                k4 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(m, 0, af1, 0, l2);
                    k4 = l2;
                }
                for (; k4 < af1.length; k4++)
                {
                    af1[k4] = zzrf1.d();
                }

                m = af1;
                zzrf1.e(i5);
                break;
            }
        } while (true);
    }

    public void a(zzrg zzrg1)
    {
        boolean flag = false;
        if (!Arrays.equals(a, zzrq.h))
        {
            zzrg1.a(1, a);
        }
        if (!b.equals(""))
        {
            zzrg1.a(2, b);
        }
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
        {
            zzrg1.a(3, c);
        }
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            zzrg1.a(4, d);
        }
        if (e != 0L)
        {
            zzrg1.a(5, e);
        }
        if (f != 0)
        {
            zzrg1.a(6, f);
        }
        if (g != 0)
        {
            zzrg1.b(7, g);
        }
        if (h)
        {
            zzrg1.a(8, h);
        }
        if (i != null && i.length > 0)
        {
            for (int i1 = 0; i1 < i.length; i1++)
            {
                m m1 = i[i1];
                if (m1 != null)
                {
                    zzrg1.a(9, m1);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int j1 = 0; j1 < j.length; j1++)
            {
                m m2 = j[j1];
                if (m2 != null)
                {
                    zzrg1.a(10, m2);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int k1 = 0; k1 < k.length; k1++)
            {
                String s = k[k1];
                if (s != null)
                {
                    zzrg1.a(11, s);
                }
            }

        }
        if (l != null && l.length > 0)
        {
            for (int l1 = 0; l1 < l.length; l1++)
            {
                zzrg1.a(12, l[l1]);
            }

        }
        if (n != 0L)
        {
            zzrg1.a(13, n);
        }
        if (m != null && m.length > 0)
        {
            for (int i2 = ((flag) ? 1 : 0); i2 < m.length; i2++)
            {
                zzrg1.a(14, m[i2]);
            }

        }
        super.a(zzrg1);
    }

    protected int b()
    {
        boolean flag = false;
        int j1 = super.b();
        int i1 = j1;
        if (!Arrays.equals(a, zzrq.h))
        {
            i1 = j1 + zzrg.b(1, a);
        }
        j1 = i1;
        if (!b.equals(""))
        {
            j1 = i1 + zzrg.b(2, b);
        }
        i1 = j1;
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
        {
            i1 = j1 + zzrg.b(3, c);
        }
        j1 = i1;
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            j1 = i1 + zzrg.b(4, d);
        }
        i1 = j1;
        if (e != 0L)
        {
            i1 = j1 + zzrg.b(5, e);
        }
        j1 = i1;
        if (f != 0)
        {
            j1 = i1 + zzrg.c(6, f);
        }
        int k1 = j1;
        if (g != 0)
        {
            k1 = j1 + zzrg.d(7, g);
        }
        i1 = k1;
        if (h)
        {
            i1 = k1 + zzrg.b(8, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    m m1 = i[j1];
                    int l1 = i1;
                    if (m1 != null)
                    {
                        l1 = i1 + zzrg.c(9, m1);
                    }
                    j1++;
                    i1 = l1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1;
            if (j.length > 0)
            {
                i1 = j1;
                for (j1 = 0; j1 < j.length;)
                {
                    m m2 = j[j1];
                    int i2 = i1;
                    if (m2 != null)
                    {
                        i2 = i1 + zzrg.c(10, m2);
                    }
                    j1++;
                    i1 = i2;
                }

            }
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                j1 = 0;
                int j2 = 0;
                int l2;
                int i3;
                for (l2 = 0; j1 < k.length; l2 = i3)
                {
                    String s = k[j1];
                    int j3 = j2;
                    i3 = l2;
                    if (s != null)
                    {
                        i3 = l2 + 1;
                        j3 = j2 + zzrg.b(s);
                    }
                    j1++;
                    j2 = j3;
                }

                j1 = i1 + j2 + l2 * 1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1;
            if (l.length > 0)
            {
                int k2 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < l.length; i1++)
                {
                    k2 += zzrg.b(l[i1]);
                }

                i1 = j1 + k2 + l.length * 1;
            }
        }
        j1 = i1;
        if (n != 0L)
        {
            j1 = i1 + zzrg.b(13, n);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1;
            if (m.length > 0)
            {
                i1 = j1 + m.length * 4 + m.length * 1;
            }
        }
        return i1;
    }

    public zzrn b(zzrf zzrf1)
    {
        return a(zzrf1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof a))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (a)obj;
        flag = flag1;
        if (!Arrays.equals(a, ((a) (obj)).a))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((b) (obj)).b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (Double.doubleToLongBits(c) == Double.doubleToLongBits(((c) (obj)).c))
        {
            flag = flag1;
            if (Float.floatToIntBits(d) == Float.floatToIntBits(((d) (obj)).d))
            {
                flag = flag1;
                if (e == ((e) (obj)).e)
                {
                    flag = flag1;
                    if (f == ((f) (obj)).f)
                    {
                        flag = flag1;
                        if (g == ((g) (obj)).g)
                        {
                            flag = flag1;
                            if (h == ((h) (obj)).h)
                            {
                                flag = flag1;
                                if (zzrl.a(i, ((i) (obj)).i))
                                {
                                    flag = flag1;
                                    if (zzrl.a(j, ((j) (obj)).j))
                                    {
                                        flag = flag1;
                                        if (zzrl.a(k, ((k) (obj)).k))
                                        {
                                            flag = flag1;
                                            if (zzrl.a(l, ((l) (obj)).l))
                                            {
                                                flag = flag1;
                                                if (zzrl.a(m, ((m) (obj)).m))
                                                {
                                                    flag = flag1;
                                                    if (n == ((n) (obj)).n)
                                                    {
                                                        return a(((zzrh) (obj)));
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
        if (true) goto _L4; else goto _L3
_L3:
        if (!b.equals(((b) (obj)).b))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j1 = Arrays.hashCode(a);
        int i1;
        char c1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        long l2;
        if (b == null)
        {
            i1 = 0;
        } else
        {
            i1 = b.hashCode();
        }
        l2 = Double.doubleToLongBits(c);
        k1 = (int)(l2 ^ l2 >>> 32);
        l1 = Float.floatToIntBits(d);
        i2 = (int)(e ^ e >>> 32);
        j2 = f;
        k2 = g;
        if (h)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        return (((((((c1 + ((((((i1 + (j1 + 527) * 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + zzrl.a(i)) * 31 + zzrl.a(j)) * 31 + zzrl.a(k)) * 31 + zzrl.a(l)) * 31 + zzrl.a(m)) * 31 + (int)(n ^ n >>> 32)) * 31 + d();
    }

    public ()
    {
        a();
    }
}
