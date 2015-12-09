// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.f.a;

import java.util.Formatter;

// Referenced classes of package com.google.b.f.a:
//            a, i, d, j, 
//            c

final class h
{

    private final a a;
    private final i b[];
    private c c;
    private final int d;

    h(a a1, c c1)
    {
        a = a1;
        d = a1.a();
        c = c1;
        b = new i[d + 2];
    }

    private static int a(int k, int l, d d1)
    {
        while (d1 == null || d1.a()) 
        {
            return l;
        }
        if (d1.a(k))
        {
            d1.b(k);
            return 0;
        } else
        {
            return l + 1;
        }
    }

    private void a(int k, int l, d ad[])
    {
        d d1 = ad[l];
        d ad2[] = b[k - 1].b();
        d ad1[];
        d ad3[];
        if (b[k + 1] != null)
        {
            ad1 = b[k + 1].b();
        } else
        {
            ad1 = ad2;
        }
        ad3 = new d[14];
        ad3[2] = ad2[l];
        ad3[3] = ad1[l];
        if (l > 0)
        {
            ad3[0] = ad[l - 1];
            ad3[4] = ad2[l - 1];
            ad3[5] = ad1[l - 1];
        }
        if (l > 1)
        {
            ad3[8] = ad[l - 2];
            ad3[10] = ad2[l - 2];
            ad3[11] = ad1[l - 2];
        }
        if (l < ad.length - 1)
        {
            ad3[1] = ad[l + 1];
            ad3[6] = ad2[l + 1];
            ad3[7] = ad1[l + 1];
        }
        if (l < ad.length - 2)
        {
            ad3[9] = ad[l + 2];
            ad3[12] = ad2[l + 2];
            ad3[13] = ad1[l + 2];
        }
        l = ad3.length;
        k = 0;
        do
        {
            if (k >= l || a(d1, ad3[k]))
            {
                return;
            }
            k++;
        } while (true);
    }

    private void a(i k)
    {
        if (k != null)
        {
            ((j)k).a(a);
        }
    }

    private static boolean a(d d1, d d2)
    {
        while (d2 == null || !d2.a() || d2.f() != d1.f()) 
        {
            return false;
        }
        d1.b(d2.h());
        return true;
    }

    private int f()
    {
        int i1 = g();
        if (i1 == 0)
        {
            return 0;
        }
label0:
        for (int k = 1; k < d + 1; k++)
        {
            d ad[] = b[k].b();
            int l = 0;
            do
            {
                if (l >= ad.length)
                {
                    continue label0;
                }
                if (ad[l] != null && !ad[l].a())
                {
                    a(k, l, ad);
                }
                l++;
            } while (true);
        }

        return i1;
    }

    private int g()
    {
        h();
        return j() + i();
    }

    private void h()
    {
        int k = 0;
        if (b[0] != null && b[d + 1] != null)
        {
            d ad[] = b[0].b();
            d ad1[] = b[d + 1].b();
            while (k < ad.length) 
            {
                if (ad[k] != null && ad1[k] != null && ad[k].h() == ad1[k].h())
                {
                    int l = 1;
                    while (l <= d) 
                    {
                        d d1 = b[l].b()[k];
                        if (d1 != null)
                        {
                            d1.b(ad[k].h());
                            if (!d1.a())
                            {
                                b[l].b()[k] = null;
                            }
                        }
                        l++;
                    }
                }
                k++;
            }
        }
    }

    private int i()
    {
        if (b[d + 1] == null)
        {
            return 0;
        }
        d ad[] = b[d + 1].b();
        int l = 0;
        int k = 0;
        while (l < ad.length) 
        {
            if (ad[l] != null)
            {
                int i2 = ad[l].h();
                int i1 = d + 1;
                int l1 = 0;
                while (i1 > 0 && l1 < 2) 
                {
                    d d1 = b[i1].b()[l];
                    int j1 = l1;
                    int k1 = k;
                    if (d1 != null)
                    {
                        l1 = a(i2, l1, d1);
                        j1 = l1;
                        k1 = k;
                        if (!d1.a())
                        {
                            k1 = k + 1;
                            j1 = l1;
                        }
                    }
                    i1--;
                    l1 = j1;
                    k = k1;
                }
            }
            l++;
        }
        return k;
    }

    private int j()
    {
        if (b[0] == null)
        {
            return 0;
        }
        d ad[] = b[0].b();
        int l = 0;
        int k = 0;
        while (l < ad.length) 
        {
            if (ad[l] != null)
            {
                int i2 = ad[l].h();
                int i1 = 1;
                int l1 = 0;
                while (i1 < d + 1 && l1 < 2) 
                {
                    d d1 = b[i1].b()[l];
                    int j1 = l1;
                    int k1 = k;
                    if (d1 != null)
                    {
                        l1 = a(i2, l1, d1);
                        j1 = l1;
                        k1 = k;
                        if (!d1.a())
                        {
                            k1 = k + 1;
                            j1 = l1;
                        }
                    }
                    i1++;
                    l1 = j1;
                    k = k1;
                }
            }
            l++;
        }
        return k;
    }

    i a(int k)
    {
        return b[k];
    }

    void a(int k, i l)
    {
        b[k] = l;
    }

    public void a(c c1)
    {
        c = c1;
    }

    i[] a()
    {
        a(b[0]);
        a(b[d + 1]);
        int k = 928;
        do
        {
            int l = f();
            if (l <= 0 || l >= k)
            {
                return b;
            }
            k = l;
        } while (true);
    }

    int b()
    {
        return d;
    }

    int c()
    {
        return a.c();
    }

    int d()
    {
        return a.b();
    }

    c e()
    {
        return c;
    }

    public String toString()
    {
        Object obj1 = b[0];
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = b[d + 1];
        }
        obj1 = new Formatter();
        for (int k = 0; k < ((i) (obj)).b().length; k++)
        {
            ((Formatter) (obj1)).format("CW %3d:", new Object[] {
                Integer.valueOf(k)
            });
            int l = 0;
            while (l < d + 2) 
            {
                if (b[l] == null)
                {
                    ((Formatter) (obj1)).format("    |   ", new Object[0]);
                } else
                {
                    d d1 = b[l].b()[k];
                    if (d1 == null)
                    {
                        ((Formatter) (obj1)).format("    |   ", new Object[0]);
                    } else
                    {
                        ((Formatter) (obj1)).format(" %3d|%3d", new Object[] {
                            Integer.valueOf(d1.h()), Integer.valueOf(d1.g())
                        });
                    }
                }
                l++;
            }
            ((Formatter) (obj1)).format("%n", new Object[0]);
        }

        obj = ((Formatter) (obj1)).toString();
        ((Formatter) (obj1)).close();
        return ((String) (obj));
    }
}
