// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bk:
//            a, h, m, j, 
//            l, b

class g extends a
{

    private double b[];

    protected g(double ad[])
    {
        if (ad.length % 2 != 0)
        {
            throw new IllegalArgumentException("Cannot create PolygonVertexList from incomplete array.");
        } else
        {
            a = ad.length / 2;
            b = ad;
            return;
        }
    }

    static g a(double ad[])
    {
        return new g(ad);
    }

    static g a(double ad[], int ai[])
    {
        if (ad.length % 2 != 0 || ai.length < 2 || ai[0] != 0 || ai[ai.length - 1] != ad.length / 2)
        {
            throw new IllegalArgumentException("ChainStartIndices for PolygonVertexList.create invalid.");
        }
        if (ai.length == 2)
        {
            return new g(ad);
        } else
        {
            return new h(ad, ai);
        }
    }

    private boolean a(int k, int i1, int j1, int k1)
    {
        boolean flag1 = false;
        if (a(k, i1, j1) >= 0.0D) goto _L2; else goto _L1
_L1:
        boolean flag;
label0:
        {
            if (a(k, i1, k1) < 0.0D)
            {
                flag = flag1;
                if (a(i1, j1, k1) < 0.0D)
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        flag = flag1;
        if (a(k, i1, k1) > 0.0D)
        {
            flag = flag1;
            if (a(i1, j1, k1) > 0.0D)
            {
                return true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean b(int k, int i1, int j1)
    {
        if (a(i1, j1) != 0)
        {
            if (a(k, i1) == 0 || a(k, j1) == 0)
            {
                return false;
            }
            if (a(k, i1) != a(k, j1))
            {
                return false;
            }
            if (a(k, i1, j1) != 0.0D)
            {
                return false;
            }
        }
        return true;
    }

    public final double a(int k)
    {
        return b[k * 2];
    }

    public int a()
    {
        return 0;
    }

    final void a(int k, double ad[], int i1, int j1)
    {
        System.arraycopy(b, k * 2, ad, i1 * 2, j1 * 2);
    }

    protected boolean a(Object obj)
    {
        return obj instanceof g;
    }

    public final double b(int k)
    {
        return b[k * 2 + 1];
    }

    public final m b()
    {
        return new m(this);
    }

    protected final String b(int k, int i1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[(");
        stringbuilder.append(b[k * 2]);
        stringbuilder.append(", ");
        stringbuilder.append(b[k * 2 + 1]);
        stringbuilder.append(")");
        for (k++; k < i1; k++)
        {
            stringbuilder.append(", (");
            stringbuilder.append(b[k * 2]);
            stringbuilder.append(", ");
            stringbuilder.append(b[k * 2 + 1]);
            stringbuilder.append(")");
        }

        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public int c(int k)
    {
        return h(k - 1);
    }

    public final j c()
    {
        return new j(this);
    }

    public int d(int k)
    {
        return h(k + 1);
    }

    public final boolean d()
    {
        int i1;
        int j1;
        for (int k = 0; k < a; k++)
        {
            i1 = c(k);
            j1 = d(k);
            if (a(i1, k, j1) != 0.0D)
            {
                continue;
            }
            double d1 = a(i1);
            double d2 = b(i1);
            double d3 = a(k);
            double d4 = b(k);
            double d5 = a(j1);
            double d6 = b(j1);
            if ((d1 == d3 || d5 == d3) && (d1 != d3 || d5 != d3))
            {
                break;
            }
            if (l.a(d1, d2, d3, d4) < 0 || l.a(d1, d2, d3, d4) == 0 && d2 < d4)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (l.a(d5, d6, d3, d4) < 0 || l.a(d5, d6, d3, d4) < 0 && d6 < d4)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (i1 == j1)
            {
                return true;
            }
        }

        return false;
    }

    public final a.b e(int k)
    {
        boolean flag1;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
label0:
        {
            int i1 = c(k);
            int j1 = d(k);
            double d1 = a(i1, k, j1);
            double d2;
            double d3;
            boolean flag2;
            if (d1 < 0.0D)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            d2 = b[k * 2];
            d3 = b[i1 * 2];
            if (d3 < d2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (d3 == d2)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            if (d3 > d2)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            d3 = b[j1 * 2];
            if (d3 < d2)
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (d3 == d2)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            if (d3 > d2)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            if (flag6 && flag7)
            {
                if (b[j1 * 2 + 1] < b[k * 2 + 1])
                {
                    if (b[i1 * 2 + 1] < b[k * 2 + 1])
                    {
                        return a.b.f;
                    } else
                    {
                        return a.b.d;
                    }
                }
                if (b[i1 * 2 + 1] > b[k * 2 + 1])
                {
                    return a.b.e;
                } else
                {
                    return a.b.c;
                }
            }
            boolean flag = flag2;
            if (d1 != 0.0D)
            {
                break label0;
            }
            if (!flag6)
            {
                flag = flag2;
                if (!flag7)
                {
                    break label0;
                }
            }
            if (flag6)
            {
                if (b[i1 * 2 + 1] < b[k * 2 + 1])
                {
                    flag = flag5;
                } else
                {
                    flag = flag4;
                }
            } else
            if (b[j1 * 2 + 1] < b[k * 2 + 1])
            {
                flag = flag1;
            } else
            {
                flag = flag3;
            }
        }
        if (flag)
        {
            if (flag3 && (flag5 || flag7))
            {
                return a.b.a;
            }
            if (flag1 && (flag4 || flag7))
            {
                return a.b.b;
            }
        } else
        {
            if ((flag3 || flag6) && flag5)
            {
                return a.b.e;
            }
            if ((flag1 || flag6) && flag4)
            {
                return a.b.f;
            }
        }
        if ((flag1 || flag6) && (flag5 || flag7))
        {
            return a.b.c;
        } else
        {
            return a.b.d;
        }
    }

    public final boolean e()
    {
        j j1;
        b b1;
        int k1;
        boolean flag1;
        flag1 = false;
        j1 = c();
        b1 = new b(this);
        k1 = 0;
_L5:
        if (k1 >= j1.c) goto _L2; else goto _L1
_L1:
        boolean flag;
        int k = j1.j(k1);
        int l1 = j1.d(k);
        int j2 = j1.e(k);
        if (j1.g(l1, k) == 0 || j1.g(k, j2) == 0)
        {
            k = 1;
        } else
        {
            a.b b2 = e(k);
            if (b2 == a.b.d && (b1.a(l1, k) || b1.b(k, j2)) || b2 == a.b.c && (b1.a(k, j2) || b1.b(l1, k)) || b2 == a.b.a && (b1.a(l1, k) || b1.a(k, j2)) || b2 == a.b.b && (b1.b(k, j2) || b1.b(l1, k)) || b2 == a.b.e && (b1.a(k, j2) || b1.a(l1, k)) || b2 == a.b.f && (b1.b(l1, k) || b1.b(k, j2)))
            {
                k = 1;
            } else
            {
                k = 0;
            }
        }
        if (k == 0) goto _L4; else goto _L3
_L3:
        flag = true;
_L7:
        return flag;
_L4:
        k1++;
          goto _L5
_L2:
        k1 = 0;
_L8:
        flag = flag1;
        if (k1 >= a) goto _L7; else goto _L6
_L6:
        int i2 = k1 + 1;
        do
        {
            if (i2 >= a)
            {
                break;
            }
            if (a(k1, i2) == 0)
            {
                int k2 = c(k1);
                int l2 = d(k1);
                if (k2 != i2 && l2 != i2)
                {
                    int i1 = c(k1);
                    int i3 = d(k1);
                    int j3 = c(i2);
                    int k3 = d(i2);
                    if (a(i1, k1) == 0 || a(k1, i3) == 0 || a(j3, i2) == 0 || a(i2, k3) == 0 || b(k1, i1, i3) || b(k1, i1, j3) || b(k1, i1, k3) || b(k1, i3, j3) || b(k1, i3, k3) || b(k1, j3, k3))
                    {
                        i1 = 0;
                    } else
                    if (a(i1, k1, i3, j3) && a(i1, k1, i3, k3) && a(k1, i3, i1, k3, j3))
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 == 0 && !a(k1, k2, c(i2), l2, d(i2)))
                    {
                        break;
                    }
                }
                return true;
            }
            i2++;
        } while (true);
        k1++;
          goto _L8
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof g))
            {
                return false;
            }
            obj = (g)obj;
            if (!((g) (obj)).a(this) || !Arrays.equals(b, ((g) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(b);
    }

    final double i(int k)
    {
        int i1 = g(k);
        int j1 = g(k + 1);
        if (j1 - i1 < 3)
        {
            return 0.0D;
        }
        double d6 = b[(j1 - 1) * 2];
        double d7 = b[(j1 - 1) * 2 + 1];
        double d1 = 0.0D;
        double d3 = 0.0D;
        k = i1;
        double d4;
        for (double d2 = 0.0D; k < j1; d2 = d4)
        {
            d4 = b[k * 2] - d6;
            double d5 = b[k * 2 + 1] - d7;
            d3 = (d2 * d5 - d1 * d4) + d3;
            k++;
            d1 = d5;
        }

        return d3 / 2D;
    }

    public String toString()
    {
        return b(0, g(1));
    }
}
