// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;


// Referenced classes of package com.google.android.m4b.maps.bk:
//            g, m, l, j

final class b
{

    final m a;
    final m b;
    final m c;
    private final m d;

    public b(g g1)
    {
        a = g1.b();
        b = g1.b();
        d = g1.b();
        c = g1.b();
    }

    public b(m m1)
    {
        a = m1.c();
        b = m1.c();
        d = m1.c();
        c = m1.c();
    }

    private b(m m1, m m2, m m3, m m4)
    {
        a = m1;
        b = m2;
        d = m3;
        c = m4;
    }

    private double a(int k, double d1)
    {
        double d2 = a.g(k);
        double d3 = a.h(k);
        if (d2 != d1)
        {
            double d5 = b.g(k);
            double d4 = b.h(k);
            if (d5 == d1)
            {
                return d4;
            }
            d5 -= d2;
            if (d5 == 0.0D)
            {
                if (d3 <= d4)
                {
                    return d4;
                }
            } else
            {
                return d3 + ((d4 - d3) * (d1 - d2)) / d5;
            }
        }
        return d3;
    }

    private void b(int k)
    {
        a.a(k);
        b.a(k);
        d.a(k);
        c.a(k);
    }

    private static int d(int k, int i1, int j1)
    {
        if (k <= i1)
        {
            return k;
        } else
        {
            return k - j1;
        }
    }

    private boolean g(int k, int i1)
    {
        if (k >= 0 && k < a.c && i1 >= 0 && i1 < a.c)
        {
            double d1 = a.g(k);
            double d2 = a.h(k);
            double d3 = b.g(k);
            double d4 = b.h(k);
            double d5 = a.g(i1);
            double d6 = a.h(i1);
            double d7 = b.g(i1);
            double d8 = b.h(i1);
            if (d1 == d7 && d2 == d8 || d5 == d3 && d6 == d4)
            {
                return false;
            }
            if (d1 == d5 && d2 == d6 || d3 == d7 && d4 == d8)
            {
                if (d1 == d5 && d2 == d6 && d3 == d7 && d4 == d8)
                {
                    int k1 = a.j(k);
                    int j1 = a.j(i1);
                    k = b.j(k);
                    i1 = b.j(i1);
                    if (a.d(k1) == k)
                    {
                        k = 1;
                    } else
                    {
                        k = 0;
                    }
                    if (a.d(j1) == i1)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    return k == i1;
                } else
                {
                    return false;
                }
            }
            double d9 = l.a(d1, d2, d3, d4, d5, d6);
            if (l.a(d1, d2, d3, d4, d7, d8) * d9 > 0.0D)
            {
                return false;
            }
            return l.a(d5, d6, d7, d8, d1, d2) * l.a(d5, d6, d7, d8, d3, d4) <= 0.0D;
        } else
        {
            return false;
        }
    }

    private int h(int k, int i1)
    {
        int j1;
        for (j1 = b.h(i1, 0); j1 != -1 && !i(j1, k); j1 = b.h(i1, j1 + 1)) { }
        if (j1 == -1)
        {
            throw new NullPointerException("Could not find egde in EdgeList.");
        } else
        {
            return j1;
        }
    }

    private boolean i(int k, int i1)
    {
        return a.i(i1, k);
    }

    final int a(int k)
    {
        int i1 = 0;
        double d1 = a.b(k);
        double d2 = a.c(k);
        for (k = 0; a(k, d1) < d2 && k < a.c; k++) { }
        if (k > 0)
        {
            i1 = k - 1;
        }
        return i1;
    }

    public final int a(int k, int i1, a.b b1)
    {
        if (a.g(k, i1) < 0)
        {
            int j1 = b(k, i1, k);
            static final class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[com.google.android.m4b.maps.bk.a.b.values().length];
                    try
                    {
                        a[a.b.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[a.b.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1.a[b1.ordinal()])
            {
            default:
                throw new e.a("Impossible EdgeList start case.");

            case 1: // '\001'
                a(j1, k, i1, c(a.d(k), k, k));
                break;
            }
            return -1;
        } else
        {
            a(b(i1, k, i1), i1, k, -1);
            return e(a(i1), i1);
        }
    }

    public final b a(j j1, int k, int i1)
    {
        m m1;
        m m2;
        m m3;
        m1 = j1.c();
        m2 = j1.c();
        m3 = j1.c();
        j1 = j1.c();
        if (k <= i1) goto _L2; else goto _L1
_L1:
        int i2 = k - i1 - 1;
        int k1 = 0;
        while (k1 < a.c) 
        {
label0:
            {
                int k2 = a.j(k1);
                if (k2 <= i1 || k2 >= k)
                {
                    int i3 = b.j(k1);
                    if (i3 <= i1 || i3 >= k)
                    {
                        int k3 = d.j(k1);
                        int i4 = c.j(k1);
                        m1.b(new int[] {
                            d(k2, i1, i2)
                        });
                        m2.b(new int[] {
                            d(i3, i1, i2)
                        });
                        if (k3 <= i1 || k3 >= k)
                        {
                            m3.b(new int[] {
                                d(k3, i1, i2)
                            });
                        } else
                        {
                            m3.b(new int[] {
                                d(k2, i1, i2)
                            });
                        }
                        if (i4 > i1 && i4 < k)
                        {
                            break label0;
                        }
                        j1.b(new int[] {
                            d(i4, i1, i2)
                        });
                    }
                }
                k1++;
            }
        }
          goto _L3
        throw new e.a("When cutting edge list, we lost a merge vertex.");
_L2:
        int l1 = 0;
_L5:
        while (l1 < a.c) 
        {
            int j2 = a.j(l1);
            if (j2 >= k && j2 <= i1)
            {
                int l2 = b.j(l1);
                if (l2 >= k && l2 <= i1)
                {
                    int j3 = d.j(l1);
                    int l3 = c.j(l1);
                    m1.b(new int[] {
                        j2 - k
                    });
                    m2.b(new int[] {
                        l2 - k
                    });
                    if (j3 == -1)
                    {
                        m3.b(new int[] {
                            j3
                        });
                    } else
                    if (j3 >= k && j3 <= i1)
                    {
                        m3.b(new int[] {
                            j3 - k
                        });
                    } else
                    {
                        m3.b(new int[] {
                            j2 - k
                        });
                    }
                    if (l3 == -1)
                    {
                        j1.b(new int[] {
                            l3
                        });
                    } else
                    if (l3 >= k && l3 <= i1)
                    {
                        j1.b(new int[] {
                            l3 - k
                        });
                    } else
                    {
                        throw new e.a("When cutting edge list, we lost a merge vertex.");
                    }
                }
            }
            l1++;
        }
_L3:
        return new b(m1, m2, m3, j1);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(int k, int i1, int j1)
    {
        int k1 = 0;
        if (a.c != 0)
        {
            k1 = b(i1, j1, i1);
        }
        a(k1, i1, j1, i1);
        a(k1 + 1, i1, k, -1);
    }

    final void a(int k, int i1, int j1, int k1)
    {
        a.e(k, i1);
        b.e(k, j1);
        d.e(k, k1);
        c.e(k, -1);
    }

    public final boolean a(int k, int i1)
    {
        int j1;
        if (a.g(i1, k) >= 0)
        {
            int k1 = k;
            k = i1;
            i1 = k1;
        }
        j1 = b(i1, k, i1);
        a(j1, i1, k, -1);
        return g(j1 - 1, j1) || g(j1, j1 + 1);
    }

    final int b(int k, int i1, int j1)
    {
        double d1;
        double d2;
        d1 = a.b(j1);
        d2 = a.c(j1);
        j1 = 0;
_L6:
        if (j1 >= a.c) goto _L2; else goto _L1
_L1:
        double d3 = a(j1, d1);
        if (d3 <= d2) goto _L4; else goto _L3
_L3:
        return j1;
_L4:
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        if (d3 != d2)
        {
            continue; /* Loop/switch isn't completed */
        }
        d3 = b.g(j1);
        d4 = b.h(j1);
        d5 = a.b(k);
        d6 = a.c(k);
        d7 = a.b(i1);
        d8 = a.c(i1);
        if (l.a(d5, d6, d7, d8, d3, d4) > 0.0D || l.a(d3, d4, d7, d8) == 0 && j1 % 2 == 0) goto _L3; else goto _L5
_L5:
        j1++;
          goto _L6
_L2:
        return a.c;
    }

    public final int b(int k, int i1, a.b b1)
    {
        int j1 = -1;
        if (a.g(k, i1) >= 0) goto _L2; else goto _L1
_L1:
        int k1;
        k1 = h(k, i1);
        k = j1;
        if (!c.i(k1))
        {
            k = c.j(k1);
        }
        _cls1.a[b1.ordinal()];
        JVM INSTR tableswitch 2 2: default 76
    //                   2 86;
           goto _L3 _L4
_L3:
        i1 = k1;
_L6:
        b(i1);
        return k;
_L4:
        j1 = a(i1);
        if (!c.i(j1))
        {
            k = c.j(j1);
        }
        d.f(j1, i1);
        c.f(j1, i1);
        i1 = k1;
        continue; /* Loop/switch isn't completed */
_L2:
        int l1 = h(i1, k);
        int i2 = a(k);
        i1 = j1;
        if (!c.i(i2))
        {
            i1 = c.j(i2);
            c.f(i2, -1);
        }
        d.f(i2, k);
        j1 = l1;
        k = i1;
        i1 = j1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean b(int k, int i1)
    {
        if (a.g(k, i1) < 0)
        {
            k = h(k, i1);
        } else
        {
            k = h(i1, k);
        }
        b(k);
        return g(k - 1, k) || g(k, k + 1);
    }

    final int c(int k, int i1, int j1)
    {
        return f(h(k, i1), j1);
    }

    public final boolean c(int k, int i1)
    {
        boolean flag = false;
        int j1;
        for (j1 = b.h(i1, 0); j1 != -1 && !i(j1, k); j1 = b.h(i1, j1 + 1)) { }
        if (j1 != -1)
        {
            flag = true;
        }
        return flag;
    }

    public final void d(int k, int i1)
    {
        a(b(k, i1, i1), k, i1, k);
    }

    final int e(int k, int i1)
    {
        d.f(k, i1);
        i1 = c.j(k);
        if (i1 != -1)
        {
            c.f(k, -1);
        }
        return i1;
    }

    final int f(int k, int i1)
    {
        int j1 = d.j(k);
        double d1 = a.b(j1);
        double d2 = a.c(j1);
        double d3 = a.g(k);
        double d4 = a.h(k);
        if (l.a(d3, d4, b.g(k), b.h(k), d1, d2) <= 0.0D && l.a(d1, d2, d3, d4, a.b(i1), a.c(i1)) <= 0.0D)
        {
            return a.j(k);
        } else
        {
            return j1;
        }
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{start:  ");
        stringbuilder.append(a.m(3));
        stringbuilder.append("\n end:    ");
        stringbuilder.append(b.m(3));
        stringbuilder.append("\n helper: ");
        stringbuilder.append(d.m(3));
        stringbuilder.append("\n merge:  ");
        stringbuilder.append(c.m(3));
        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
