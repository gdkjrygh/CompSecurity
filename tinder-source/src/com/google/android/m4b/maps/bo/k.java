// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.bk.i;
import java.io.DataInput;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            g, am, m, i, 
//            ac

public final class k
{
    public static final class a
    {

        int a[];
        public int b;

        public final k a()
        {
            int ai[] = new int[b * 3];
            System.arraycopy(a, 0, ai, 0, b * 3);
            return new k(ai, (byte)0);
        }

        public final boolean a(g g1)
        {
            int j = g1.a;
            int l = g1.b;
            int i1 = g1.c;
            if (b * 3 == a.length)
            {
                g1 = new int[a.length * 2];
                System.arraycopy(a, 0, g1, 0, b * 3);
                a = g1;
            }
            int j1 = b * 3;
            if (b > 0 && j == a[j1 - 3] && l == a[j1 - 2] && i1 == a[j1 - 1])
            {
                return false;
            } else
            {
                a[j1] = j;
                a[j1 + 1] = l;
                a[j1 + 2] = i1;
                b = b + 1;
                return true;
            }
        }

        public a()
        {
            this(16);
        }

        public a(int j)
        {
            if (j <= 0)
            {
                throw new AssertionError();
            } else
            {
                a = new int[j * 3];
                b = 0;
                return;
            }
        }
    }


    private static final ThreadLocal b = new ThreadLocal() {

        protected final Object initialValue()
        {
            return (new g[] {
                new g(), new g()
            });
        }

    };
    public final int a[];
    private volatile m c;
    private volatile float d;

    public k(int ai[])
    {
        a = ai;
        d = -1F;
    }

    k(int ai[], byte byte0)
    {
        this(ai);
    }

    private int a(float f1, int j, int l, int i1, g g1, g g2, g g3, 
            g g4, boolean aflag[])
    {
        a(l, g1);
        a(i1, g2);
        int i2 = -1;
        int j1 = l + j;
        float f2 = f1;
        for (; j1 <= i1 - 1; j1 += j)
        {
            a(j1, g4);
            float f3 = g.a(g1, g2, g4, g3);
            if (f3 > f2)
            {
                i2 = j1;
                f2 = f3;
            }
        }

        int l1 = 0;
        if (i2 >= 0)
        {
            int k1 = 1;
            aflag[i2] = true;
            if (i2 > l + 1)
            {
                k1 = a(f1, j, l, i2, g1, g2, g3, g4, aflag) + 1;
            }
            l1 = k1;
            if (i2 < i1 - 1)
            {
                l1 = k1 + a(f1, j, i2, i1, g1, g2, g3, g4, aflag);
            }
        }
        return l1;
    }

    public static k a(g g1, g g2)
    {
        int ai[] = new int[6];
        g1.a(ai, 0);
        g2.a(ai, 1);
        return new k(ai);
    }

    public static k a(DataInput datainput, ac ac)
    {
        int l = am.a(datainput);
        int ai[] = new int[l * 3];
        for (int j = 0; j < l; j++)
        {
            g.a(datainput, ac, ai, j);
        }

        return new k(ai);
    }

    public static k a(int ai[])
    {
        return new k(ai);
    }

    public final g a(float f1)
    {
        if (f1 <= 0.0F)
        {
            return a(0);
        }
        if (f1 >= 1.0F)
        {
            return b();
        }
        float f2 = c();
        int l = a.length / 3;
        f1 = f2 * f1;
        for (int j = 0; j < l - 1;)
        {
            float f3 = b(j);
            if (f3 >= f1)
            {
                f1 /= f3;
                g g1 = new g();
                g g2 = new g();
                a(j, g1);
                a(j + 1, g2);
                g.a(g1, g2, f1, g2);
                return g2;
            }
            j++;
            f1 -= f3;
        }

        return b();
    }

    public final g a(int j)
    {
        j *= 3;
        return new g(a[j], a[j + 1], a[j + 2]);
    }

    public final m a()
    {
        if (c == null)
        {
            if (a.length / 3 > 0)
            {
                g g1 = a(0);
                int l1 = g1.a;
                int l = g1.b;
                int j = 1;
                int k1 = l1;
                int j1 = l;
                while (j < a.length / 3) 
                {
                    a(j, g1);
                    int i1 = l1;
                    if (g1.a < l1)
                    {
                        i1 = g1.a;
                    }
                    l1 = k1;
                    if (g1.a > k1)
                    {
                        l1 = g1.a;
                    }
                    k1 = j1;
                    if (g1.b < j1)
                    {
                        k1 = g1.b;
                    }
                    j1 = l;
                    if (g1.b > l)
                    {
                        j1 = g1.b;
                    }
                    j++;
                    l = j1;
                    j1 = k1;
                    k1 = l1;
                    l1 = i1;
                }
                g1.d(l1, j1);
                c = new m(g1, new g(k1, l));
            } else
            {
                c = new m(new g(), new g());
            }
        }
        return c;
    }

    public final void a(int j, g g1)
    {
        j *= 3;
        g1.a = a[j];
        g1.b = a[j + 1];
        g1.c = a[j + 2];
    }

    public final void a(int j, g g1, g g2)
    {
        j *= 3;
        g2.a = a[j] - g1.a;
        g2.b = a[j + 1] - g1.b;
        g2.c = a[j + 2] - g1.c;
    }

    public final void a(g g1)
    {
        int j = a.length - 3;
        g1.a = a[j];
        g1.b = a[j + 1];
        g1.c = a[j + 2];
    }

    public final float b(int j)
    {
        int i1 = j * 3;
        j = i1 + 3;
        int ai[] = a;
        int l = i1 + 1;
        i1 = ai[i1];
        ai = a;
        int j1 = j + 1;
        float f1 = i1 - ai[j];
        float f2 = a[l] - a[j1];
        float f3 = a[l + 1] - a[j1 + 1];
        return (float)Math.sqrt(f1 * f1 + f2 * f2 + f3 * f3);
    }

    public final g b()
    {
        int j = a.length - 3;
        return new g(a[j], a[j + 1], a[j + 2]);
    }

    public final k b(float f1)
    {
        int j = 0;
        if (a.length > 6)
        {
            int k1 = a.length / 3;
            boolean aflag[] = new boolean[k1];
            aflag[0] = true;
            aflag[k1 - 1] = true;
            int l = a(f1 * f1, 1, 0, k1 - 1, new g(), new g(), new g(), new g(), aflag) + 2;
            if (l != k1)
            {
                int ai[] = new int[l * 3];
                int j1;
                for (int i1 = 0; j < k1; i1 = j1)
                {
                    j1 = i1;
                    if (aflag[j])
                    {
                        int i2 = j * 3;
                        j1 = i1 + 1;
                        int ai1[] = a;
                        int l1 = i2 + 1;
                        ai[i1] = ai1[i2];
                        i1 = j1 + 1;
                        ai[j1] = a[l1];
                        j1 = i1 + 1;
                        ai[i1] = a[l1 + 1];
                    }
                    j++;
                }

                return new k(ai);
            }
        }
        return this;
    }

    public final k b(g g1)
    {
        int ai[] = new int[a.length];
        for (int j = 0; j < a.length; j += 3)
        {
            ai[j] = a[j] + g1.a;
            ai[j + 1] = a[j + 1] + g1.b;
            ai[j + 2] = a[j + 2] + g1.c;
        }

        return new k(ai);
    }

    public final float c()
    {
        float f1 = 0.0F;
        if (d < 0.0F)
        {
            int l = a.length / 3;
            for (int j = 0; j < l - 1; j++)
            {
                f1 += b(j);
            }

            d = f1;
        }
        return d;
    }

    public final k c(float f1)
    {
        int k1;
        int l1;
        boolean flag;
        flag = d();
        k1 = a.length / 3;
        l1 = k1 - 1;
        if (k1 > 2 && f1 > 0.0F && (k1 > 3 || !flag)) goto _L2; else goto _L1
_L1:
        return this;
_L2:
        a a1;
        g g1;
        g g2;
        g g3;
        g g4;
        g g5;
        int j;
        int l;
        int j1;
        a1 = new a(k1);
        int i1;
        int i2;
        if (flag)
        {
            j = l1 - 1;
        } else
        {
            j = 1;
        }
        l = (j - 1) * 3;
        j1 = j * 3;
        i2 = ((j + 1) % k1) * 3;
        i1 = ((j + 2) % k1) * 3;
        g1 = new g(a[l], a[l + 1], 0);
        g2 = new g(a[j1], a[j1 + 1], 0);
        g3 = new g(a[i2], a[i2 + 1], 0);
        g4 = new g(a[i1], a[i1 + 1], 0);
        g5 = new g();
        if (flag && g2.c(g3) <= f1)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        j = i1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_434;
        }
        a1.a(g1);
        l = i1;
        if (i1 == 0)
        {
            if (g1.c(g2) > f1 && g2.c(g3) > f1)
            {
                a1.a(g2);
            }
            a1.a(g3);
            return a1.a();
        }
label0:
        do
        {
            j = l;
            if (g1.c(g2) > f1)
            {
                break label0;
            }
            l += 3;
            if (l != k1 * 3)
            {
                g2.b(g3);
                g3.b(g4);
                g4.a(a[l], a[l + 1], 0);
            } else
            {
                if (g1.c(g3) > f1 && g3.c(g4) > f1)
                {
                    a1.a(g3);
                }
                a1.a(g4);
                return a1.a();
            }
        } while (true);
        l = j;
_L9:
        if (l >= k1 * 3) goto _L4; else goto _L3
_L3:
        g4.d(a[l], a[l + 1]);
        if (!j1) goto _L6; else goto _L5
_L5:
        if (l != (l1 - 1) * 3) goto _L8; else goto _L7
_L7:
        g4.b(g5);
_L6:
        float f2 = g2.c(g3);
        if (f2 > f1)
        {
            if (flag && l == j)
            {
                g5.b(g2);
            } else
            {
                a1.a(g2);
            }
            g1.b(g2);
            g2.b(g3);
            g3.b(g4);
        } else
        {
            float f3 = g1.c(g2);
            float f4 = g3.c(g4);
            double d2 = f3 + f2;
            double d3 = f2 + f4;
            double d1 = ((double)g2.a * d2 + (double)g3.a * d3) / (d2 + d3);
            d2 = ((double)g2.b * d2 + (double)g3.b * d3) / (d3 + d2);
            g2.d((int)Math.round(d1), (int)Math.round(d2));
            g3.b(g4);
        }
_L10:
        l += 3;
          goto _L9
_L8:
        if (l == l1 * 3) goto _L10; else goto _L6
_L4:
        if (flag || g2.c(g3) > f1)
        {
            a1.a(g2);
        }
        if (flag)
        {
            a1.a(new g(a1.a[0], a1.a[1], a1.a[2]));
        } else
        {
            a1.a(g3);
        }
        if (a1.b != k1)
        {
            return a1.a();
        }
        if (true) goto _L1; else goto _L11
_L11:
    }

    public final k c(int j)
    {
        boolean flag = false;
        if (j != 0xe0000000) goto _L2; else goto _L1
_L1:
        return this;
_L2:
        a a1;
        g g1;
        boolean flag1;
        int l;
        int i1;
        if (j < 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i1 = a.length / 3;
        a1 = new a(i1);
        g1 = new g();
        l = 0;
        if (l >= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        a(l, g1);
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (g1.a < j)
        {
            g1.a = g1.a + 0x40000000;
            flag = true;
        }
_L6:
        a1.a(g1);
        l++;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_48;
_L3:
        if (g1.a > j)
        {
            g1.a = g1.a - 0x40000000;
            flag = true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!flag) goto _L1; else goto _L7
_L7:
        return a1.a();
    }

    public final float d(int j)
    {
        j *= 3;
        return i.a(a[j + 3] - a[j], a[j + 3 + 1] - a[j + 1]);
    }

    public final boolean d()
    {
        if (a.length > 0)
        {
            int j = a.length - 3;
            return a[0] == a[j] && a[1] == a[j + 1] && a[2] == a[j + 2];
        } else
        {
            return false;
        }
    }

    public final int e()
    {
        int k1 = a.length / 3;
        if (k1 == 0)
        {
            return 0xe0000000;
        }
        i l = new i(3.1415926535897931D, -3.1415926535897931D);
        g g1 = new g();
        a(0).h(g1);
        int j1 = 1;
        while (j1 < k1) 
        {
            Object obj = new g(g1);
            a(j1).h(g1);
            double d3 = i.a(g.a(((g) (obj)).a));
            double d5 = i.a(g.a(g1.a));
            double d1 = d3;
            if (d3 == -3.1415926535897931D)
            {
                d1 = 3.1415926535897931D;
            }
            d3 = d5;
            if (d5 == -3.1415926535897931D)
            {
                d3 = 3.1415926535897931D;
            }
            i i1;
            if (i.a(d1, d3) <= 3.1415926535897931D)
            {
                i1 = new i(d1, d3);
            } else
            {
                i1 = new i(d3, d1);
            }
            if (i1.c())
            {
                obj = l;
            } else
            if (l.a(i1.a))
            {
                if (l.a(i1.b))
                {
                    boolean flag;
                    if (l.d())
                    {
                        if (i1.d())
                        {
                            if (i1.a >= l.a && i1.b <= l.b)
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                        } else
                        if ((i1.a >= l.a || i1.b <= l.b) && !l.c())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    } else
                    if (i1.d())
                    {
                        if (l.b() || i1.c())
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                    } else
                    if (i1.a >= l.a && i1.b <= l.b)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        obj = l;
                    } else
                    {
                        obj = i.a();
                    }
                } else
                {
                    obj = new i(l.a, i1.b);
                }
            } else
            if (l.a(i1.b))
            {
                obj = new i(i1.a, l.b);
            } else
            {
                obj = i1;
                if (!l.c())
                {
                    obj = i1;
                    if (!i1.a(l.a))
                    {
                        if (i.a(i1.b, l.a) < i.a(l.b, i1.a))
                        {
                            obj = new i(i1.a, l.b);
                        } else
                        {
                            obj = new i(l.a, i1.b);
                        }
                    }
                }
            }
            j1++;
            l = ((i) (obj));
        }
        if (l.b())
        {
            return 0xe0000000;
        }
        double d4 = i.a(0xe0000000);
        double d2 = d4;
        if (d4 == -3.1415926535897931D)
        {
            d2 = 3.1415926535897931D;
        }
        if (!l.a(d2))
        {
            return 0xe0000000;
        }
        i j;
        if (l.a == l.b)
        {
            j = i.a();
        } else
        {
            j = new i(l.b, l.a);
        }
        d2 = 0.5D * (j.a + j.b);
        if (j.d())
        {
            if (d2 <= 0.0D)
            {
                d2 = 3.1415926535897931D + d2;
            } else
            {
                d2 -= 3.1415926535897931D;
            }
        }
        return g.a((int)((d2 / 3.1415926535897931D) * 536870912D));
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof k)
        {
            obj = (k)obj;
            return Arrays.equals(a, ((k) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int f()
    {
        return a.length * 4 + 160;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a);
    }

}
