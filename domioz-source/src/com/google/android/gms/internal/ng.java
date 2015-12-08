// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            nj, nr, ne, nf, 
//            nh, nn

public final class ng extends nj
{

    public byte a[];
    public String b;
    public double c;
    public float d;
    public long e;
    public int f;
    public int g;
    public boolean h;
    public ne i[];
    public nf j[];
    public String k[];
    public long l[];
    public float m[];
    public long n;

    public ng()
    {
        a = nr.h;
        b = "";
        c = 0.0D;
        d = 0.0F;
        e = 0L;
        f = 0;
        g = 0;
        h = false;
        i = ne.b();
        j = nf.b();
        k = nr.f;
        l = nr.b;
        m = nr.c;
        n = 0L;
        o = null;
        p = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j1 = super.a();
        int i1 = j1;
        if (!Arrays.equals(a, nr.h))
        {
            byte abyte0[] = a;
            i1 = nh.b(1);
            int k1 = nh.d(abyte0.length);
            i1 = j1 + (abyte0.length + k1 + i1);
        }
        j1 = i1;
        if (!b.equals(""))
        {
            j1 = i1 + nh.b(2, b);
        }
        i1 = j1;
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
        {
            i1 = j1 + (nh.b(3) + 8);
        }
        j1 = i1;
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            j1 = i1 + (nh.b(4) + 4);
        }
        int l1 = j1;
        if (e != 0L)
        {
            l1 = j1 + nh.b(5, e);
        }
        i1 = l1;
        if (f != 0)
        {
            i1 = l1 + nh.b(6, f);
        }
        j1 = i1;
        if (g != 0)
        {
            j1 = g;
            int i2 = nh.b(7);
            j1 = i1 + (nh.d(nh.e(j1)) + i2);
        }
        i1 = j1;
        if (h)
        {
            i1 = j1 + (nh.b(8) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1;
            if (i.length > 0)
            {
                for (j1 = 0; j1 < i.length;)
                {
                    ne ne1 = i[j1];
                    int j2 = i1;
                    if (ne1 != null)
                    {
                        j2 = i1 + nh.b(9, ne1);
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
                    nf nf1 = j[j1];
                    int k2 = i1;
                    if (nf1 != null)
                    {
                        k2 = i1 + nh.b(10, nf1);
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
                    String s = k[j1];
                    int l3 = l2;
                    k3 = j3;
                    if (s != null)
                    {
                        k3 = j3 + 1;
                        l3 = l2 + nh.a(s);
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
                    i3 += nh.a(l[i1]);
                }

                i1 = j1 + i3 + l.length * 1;
            }
        }
        j1 = i1;
        if (n != 0L)
        {
            j1 = i1 + nh.b(13, n);
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

    public final void a(nh nh1)
    {
        boolean flag = false;
        if (!Arrays.equals(a, nr.h))
        {
            byte abyte0[] = a;
            nh1.c(1, 2);
            nh1.c(abyte0.length);
            nh1.b(abyte0);
        }
        if (!b.equals(""))
        {
            nh1.a(2, b);
        }
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(0.0D))
        {
            nh1.a(3, c);
        }
        if (Float.floatToIntBits(d) != Float.floatToIntBits(0.0F))
        {
            nh1.a(4, d);
        }
        if (e != 0L)
        {
            nh1.a(5, e);
        }
        if (f != 0)
        {
            nh1.a(6, f);
        }
        if (g != 0)
        {
            int i1 = g;
            nh1.c(7, 0);
            nh1.c(nh.e(i1));
        }
        if (h)
        {
            nh1.a(8, h);
        }
        if (i != null && i.length > 0)
        {
            for (int j1 = 0; j1 < i.length; j1++)
            {
                ne ne1 = i[j1];
                if (ne1 != null)
                {
                    nh1.a(9, ne1);
                }
            }

        }
        if (j != null && j.length > 0)
        {
            for (int k1 = 0; k1 < j.length; k1++)
            {
                nf nf1 = j[k1];
                if (nf1 != null)
                {
                    nh1.a(10, nf1);
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
                    nh1.a(11, s);
                }
            }

        }
        if (l != null && l.length > 0)
        {
            for (int i2 = 0; i2 < l.length; i2++)
            {
                nh1.a(12, l[i2]);
            }

        }
        if (n != 0L)
        {
            nh1.a(13, n);
        }
        if (m != null && m.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < m.length; j2++)
            {
                nh1.a(14, m[j2]);
            }

        }
        super.a(nh1);
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
        if (!(obj instanceof ng))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (ng)obj;
        flag = flag1;
        if (!Arrays.equals(a, ((ng) (obj)).a))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (b != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((ng) (obj)).b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (Double.doubleToLongBits(c) == Double.doubleToLongBits(((ng) (obj)).c))
        {
            flag = flag1;
            if (Float.floatToIntBits(d) == Float.floatToIntBits(((ng) (obj)).d))
            {
                flag = flag1;
                if (e == ((ng) (obj)).e)
                {
                    flag = flag1;
                    if (f == ((ng) (obj)).f)
                    {
                        flag = flag1;
                        if (g == ((ng) (obj)).g)
                        {
                            flag = flag1;
                            if (h == ((ng) (obj)).h)
                            {
                                flag = flag1;
                                if (nn.a(i, ((ng) (obj)).i))
                                {
                                    flag = flag1;
                                    if (nn.a(j, ((ng) (obj)).j))
                                    {
                                        flag = flag1;
                                        if (nn.a(k, ((ng) (obj)).k))
                                        {
                                            flag = flag1;
                                            if (nn.a(l, ((ng) (obj)).l))
                                            {
                                                flag = flag1;
                                                if (nn.a(m, ((ng) (obj)).m))
                                                {
                                                    flag = flag1;
                                                    if (n == ((ng) (obj)).n)
                                                    {
                                                        return a(((nj) (obj)));
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
        if (!b.equals(((ng) (obj)).b))
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
        return (((((((c1 + ((((((i1 + (j1 + 527) * 31) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + nn.a(i)) * 31 + nn.a(j)) * 31 + nn.a(k)) * 31 + nn.a(l)) * 31 + nn.a(m)) * 31 + (int)(n ^ n >>> 32)) * 31 + c();
    }
}
