// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            kv, kr, lf, ku, 
//            kt, kz, lb

public static final class s extends kv
{

    public byte a[];
    public String b;
    public double c;
    public float d;
    public long e;
    public int f;
    public int g;
    public boolean h;
    public c i[];
    public c j[];
    public String k[];
    public long l[];
    public float m[];
    public long n;

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (!Arrays.equals(a, lf.h))
        {
            byte abyte0[] = a;
            i1 = ku.c(1);
            int k1 = ku.e(abyte0.length);
            i1 = j1 + (abyte0.length + k1 + i1);
        }
        j1 = i1;
        if (!b.equals(""))
        {
            j1 = i1 + ku.b(2, b);
        }
        i1 = j1;
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
        {
            i1 = j1 + (ku.c(3) + 8);
        }
        j1 = i1;
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            j1 = i1 + (ku.c(4) + 4);
        }
        int l1 = j1;
        if (e != 0L)
        {
            l1 = j1 + ku.b(5, e);
        }
        i1 = l1;
        if (f != 0)
        {
            i1 = l1 + ku.b(6, f);
        }
        j1 = i1;
        if (g != 0)
        {
            j1 = g;
            int i2 = ku.c(7);
            j1 = i1 + (ku.e(ku.f(j1)) + i2);
        }
        i1 = j1;
        if (h)
        {
            i1 = j1 + (ku.c(8) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    s s = i[j1];
                    int j2 = i1;
                    if (s != null)
                    {
                        j2 = i1 + ku.b(9, s);
                    }
                    j1++;
                    i1 = j2;
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
                    s s1 = j[j1];
                    int k2 = i1;
                    if (s1 != null)
                    {
                        k2 = i1 + ku.b(10, s1);
                    }
                    j1++;
                    i1 = k2;
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
                int l2 = 0;
                int j3;
                int k3;
                for (j3 = 0; j1 < k.length; j3 = k3)
                {
                    String s2 = k[j1];
                    int l3 = l2;
                    k3 = j3;
                    if (s2 != null)
                    {
                        k3 = j3 + 1;
                        l3 = l2 + ku.a(s2);
                    }
                    j1++;
                    l2 = l3;
                }

                j1 = i1 + l2 + j3 * 1;
            }
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1;
            if (l.length > 0)
            {
                int i3 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < l.length; i1++)
                {
                    i3 += ku.a(l[i1]);
                }

                i1 = j1 + i3 + l.length * 1;
            }
        }
        j1 = i1;
        if (n != 0L)
        {
            j1 = i1 + ku.b(13, n);
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

    public final lb a(kt kt1)
        throws IOException
    {
        do
        {
            int i1 = kt1.a();
            switch (i1)
            {
            default:
                if (a(kt1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = kt1.e();
                break;

            case 18: // '\022'
                b = kt1.d();
                break;

            case 25: // '\031'
                c = Double.longBitsToDouble(kt1.h());
                break;

            case 37: // '%'
                d = Float.intBitsToFloat(kt1.g());
                break;

            case 40: // '('
                e = kt1.b();
                break;

            case 48: // '0'
                f = kt1.f();
                break;

            case 56: // '8'
                int j1 = kt1.f();
                g = -(j1 & 1) ^ j1 >>> 1;
                break;

            case 64: // '@'
                h = kt1.c();
                break;

            case 74: // 'J'
                int j3 = lf.a(kt1, 74);
                m am[];
                int k1;
                if (i == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = i.length;
                }
                am = new i[j3 + k1];
                j3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(i, 0, am, 0, k1);
                    j3 = k1;
                }
                for (; j3 < am.length - 1; j3++)
                {
                    am[j3] = new t>();
                    kt1.a(am[j3]);
                    kt1.a();
                }

                am[j3] = new t>();
                kt1.a(am[j3]);
                i = am;
                break;

            case 82: // 'R'
                int k3 = lf.a(kt1, 82);
                m am1[];
                int l1;
                if (j == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = j.length;
                }
                am1 = new j[k3 + l1];
                k3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(j, 0, am1, 0, l1);
                    k3 = l1;
                }
                for (; k3 < am1.length - 1; k3++)
                {
                    am1[k3] = new nit>();
                    kt1.a(am1[k3]);
                    kt1.a();
                }

                am1[k3] = new nit>();
                kt1.a(am1[k3]);
                j = am1;
                break;

            case 90: // 'Z'
                int l3 = lf.a(kt1, 90);
                String as[];
                int i2;
                if (k == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = k.length;
                }
                as = new String[l3 + i2];
                l3 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(k, 0, as, 0, i2);
                    l3 = i2;
                }
                for (; l3 < as.length - 1; l3++)
                {
                    as[l3] = kt1.d();
                    kt1.a();
                }

                as[l3] = kt1.d();
                k = as;
                break;

            case 96: // '`'
                int i4 = lf.a(kt1, 96);
                long al[];
                int j2;
                if (l == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = l.length;
                }
                al = new long[i4 + j2];
                i4 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(l, 0, al, 0, j2);
                    i4 = j2;
                }
                for (; i4 < al.length - 1; i4++)
                {
                    al[i4] = kt1.b();
                    kt1.a();
                }

                al[i4] = kt1.b();
                l = al;
                break;

            case 98: // 'b'
                int i5 = kt1.c(kt1.f());
                int k2 = kt1.j();
                int j4;
                for (j4 = 0; kt1.i() > 0; j4++)
                {
                    kt1.b();
                }

                kt1.e(k2);
                long al1[];
                if (l == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = l.length;
                }
                al1 = new long[j4 + k2];
                j4 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(l, 0, al1, 0, k2);
                    j4 = k2;
                }
                for (; j4 < al1.length; j4++)
                {
                    al1[j4] = kt1.b();
                }

                l = al1;
                kt1.d(i5);
                break;

            case 104: // 'h'
                n = kt1.b();
                break;

            case 117: // 'u'
                int k4 = lf.a(kt1, 117);
                float af[];
                int l2;
                if (m == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = m.length;
                }
                af = new float[k4 + l2];
                k4 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(m, 0, af, 0, l2);
                    k4 = l2;
                }
                for (; k4 < af.length - 1; k4++)
                {
                    af[k4] = Float.intBitsToFloat(kt1.g());
                    kt1.a();
                }

                af[k4] = Float.intBitsToFloat(kt1.g());
                m = af;
                break;

            case 114: // 'r'
                int i3 = kt1.f();
                int j5 = kt1.c(i3);
                int l4 = i3 / 4;
                float af1[];
                if (m == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = m.length;
                }
                af1 = new float[l4 + i3];
                l4 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(m, 0, af1, 0, i3);
                    l4 = i3;
                }
                for (; l4 < af1.length; l4++)
                {
                    af1[l4] = Float.intBitsToFloat(kt1.g());
                }

                m = af1;
                kt1.d(j5);
                break;
            }
        } while (true);
    }

    public final void a(ku ku1)
        throws IOException
    {
        boolean flag = false;
        if (!Arrays.equals(a, lf.h))
        {
            byte abyte0[] = a;
            ku1.c(1, 2);
            ku1.d(abyte0.length);
            ku1.b(abyte0);
        }
        if (!b.equals(""))
        {
            ku1.a(2, b);
        }
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
        {
            double d1 = c;
            ku1.c(3, 1);
            long l2 = Double.doubleToLongBits(d1);
            ku1.b((int)l2 & 0xff);
            ku1.b((int)(l2 >> 8) & 0xff);
            ku1.b((int)(l2 >> 16) & 0xff);
            ku1.b((int)(l2 >> 24) & 0xff);
            ku1.b((int)(l2 >> 32) & 0xff);
            ku1.b((int)(l2 >> 40) & 0xff);
            ku1.b((int)(l2 >> 48) & 0xff);
            ku1.b((int)(l2 >> 56) & 0xff);
        }
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            ku1.a(4, d);
        }
        if (e != 0L)
        {
            ku1.a(5, e);
        }
        if (f != 0)
        {
            ku1.a(6, f);
        }
        if (g != 0)
        {
            int i1 = g;
            ku1.c(7, 0);
            ku1.d(ku.f(i1));
        }
        if (h)
        {
            ku1.a(8, h);
        }
        if (i != null && i.length > 0)
        {
            for (int j1 = 0; j1 < i.length; j1++)
            {
                m m1 = i[j1];
                if (m1 != null)
                {
                    ku1.a(9, m1);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int k1 = 0; k1 < j.length; k1++)
            {
                m m2 = j[k1];
                if (m2 != null)
                {
                    ku1.a(10, m2);
                }
            }

        }
        if (k != null && k.length > 0)
        {
            for (int l1 = 0; l1 < k.length; l1++)
            {
                String s = k[l1];
                if (s != null)
                {
                    ku1.a(11, s);
                }
            }

        }
        if (l != null && l.length > 0)
        {
            for (int i2 = 0; i2 < l.length; i2++)
            {
                ku1.a(12, l[i2]);
            }

        }
        if (n != 0L)
        {
            ku1.a(13, n);
        }
        if (m != null && m.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < m.length; j2++)
            {
                ku1.a(14, m[j2]);
            }

        }
        super.a(ku1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof m))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (m)obj;
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
                                if (kz.a(i, ((i) (obj)).i))
                                {
                                    flag = flag1;
                                    if (kz.a(j, ((j) (obj)).j))
                                    {
                                        flag = flag1;
                                        if (kz.a(k, ((k) (obj)).k))
                                        {
                                            flag = flag1;
                                            if (kz.a(l, ((l) (obj)).l))
                                            {
                                                flag = flag1;
                                                if (kz.a(m, ((m) (obj)).m))
                                                {
                                                    flag = flag1;
                                                    if (n == ((n) (obj)).n)
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

    public final int hashCode()
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
        return (((((((c1 + ((((((i1 + (j1 + 527) * 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + kz.a(i)) * 31 + kz.a(j)) * 31 + kz.a(k)) * 31 + kz.a(l)) * 31 + kz.a(m)) * 31 + (int)(n ^ n >>> 32)) * 31 + c();
    }

    public ()
    {
        a = lf.h;
        b = "";
        c = 0.0D;
        d = 0.0F;
        e = 0L;
        f = 0;
        g = 0;
        h = false;
        i = i();
        j = j();
        k = lf.f;
        l = lf.b;
        m = lf.c;
        n = 0L;
        r = null;
        s = -1;
    }
}
