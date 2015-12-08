// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bk;

import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.bk:
//            l

abstract class com.google.android.m4b.maps.bk.a
{
    public static final class a
        implements Comparator
    {

        private final com.google.android.m4b.maps.bk.a a;
        private final double b;
        private final double c;

        public final int a(int ai[], int ai1[])
        {
            double d1 = a.a(ai[1]);
            double d2 = a.b(ai[1]);
            double d3 = a.a(ai1[1]);
            double d4 = a.b(ai1[1]);
            if (b == d1 && c == d2)
            {
                return -1;
            }
            if (b == d3 && c == d4)
            {
                return 1;
            }
            boolean flag;
            boolean flag1;
            if (l.a(d1, d2, b, c) < 0 || l.a(d1, d2, b, c) == 0 && d2 < c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (l.a(d3, d4, b, c) < 0 || l.a(d3, d4, b, c) < 0 && d4 < c)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag == flag1)
            {
                double d5 = l.a(b, c, d3, d4, d1, d2);
                if (d5 == 0.0D)
                {
                    return l.a(d1, d2, d3, d4) <= 0 ? -1 : 1;
                }
                return d5 <= 0.0D ? -1 : 1;
            }
            return !flag ? 1 : -1;
        }

        public final int compare(Object obj, Object obj1)
        {
            return a((int[])obj, (int[])obj1);
        }

        public a(com.google.android.m4b.maps.bk.a a1, int i)
        {
            a = a1;
            b = a1.a(i);
            c = a1.b(i);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        private static b g;
        private static final b h[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/google/android/m4b/maps/bk/a$b, s);
        }

        public static b[] values()
        {
            return (b[])h.clone();
        }

        static 
        {
            a = new b("SPLIT_VERTEX", 0);
            b = new b("MERGE_VERTEX", 1);
            c = new b("RIGHT_VERTEX", 2);
            d = new b("LEFT_VERTEX", 3);
            e = new b("START_VERTEX", 4);
            f = new b("END_VERTEX", 5);
            g = new b("INTERSECTION_VERTEX", 6);
            h = (new b[] {
                a, b, c, d, e, f, g
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    protected int a;

    com.google.android.m4b.maps.bk.a()
    {
    }

    private int b(int i, int j, int k)
    {
        double d1 = a(i, j, k);
        if (d1 > 0.0D)
        {
            return 1;
        }
        return d1 != 0.0D ? -1 : 0;
    }

    public abstract double a(int i);

    public final double a(int i, int j, int k)
    {
        return l.a(a(i), b(i), a(j), b(j), a(k), b(k));
    }

    public abstract int a();

    public final int a(int i, int j)
    {
        return l.a(a(i), b(i), a(j), b(j));
    }

    abstract void a(int i, double ad[], int j, int k);

    public final boolean a(int i, int j, int k, int i1, int j1)
    {
        if (a(i, j) == 0 || a(i, k) == 0 || a(i, i1) == 0 || a(i, j1) == 0)
        {
            return false;
        }
        if (b(j, i, k) == 0 && b(i1, i, j1) == 0 || b(j, i, j1) == 0 && b(i1, i, k) == 0)
        {
            return false;
        }
        if (b(j, i, i1) == 0 && b(k, i, j1) == 0)
        {
            return a(j, i) != a(i1, i) && a(k, i) != a(j1, i);
        }
        if (b(j, i, i1) == 0)
        {
            return a(j, i) != a(i1, i) && b(j, i, k) != b(j, i, j1);
        }
        if (b(k, i, j1) == 0)
        {
            return a(k, i) != a(j1, i) && b(k, i, j) != b(k, i, i1);
        }
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (b(j, i, k) == 0)
        {
            j2 = j1;
            i2 = i1;
            l1 = k;
            k1 = j;
        } else
        {
            j2 = -1;
            i2 = -1;
            l1 = -1;
            k1 = -1;
        }
        if (b(j, i, j1) == 0)
        {
            j2 = k;
            i2 = i1;
            l1 = j1;
            k1 = j;
        }
        if (b(k, i, i1) == 0)
        {
            j2 = j;
            i2 = j1;
            l1 = i1;
            k1 = k;
        }
        k2 = k1;
        if (b(i1, i, j1) == 0)
        {
            k1 = k;
            i2 = j;
            l1 = j1;
            k2 = i1;
            j2 = k1;
        }
        if (k2 != -1)
        {
            return a(i, k2) != a(i, l1) && b(k2, i, i2) == b(k2, i, j2) && b(i2, i, k2) == b(i2, i, j2);
        }
        if (b(j, i, k) != b(j, i, j1))
        {
            if (b(j, i, i1) != b(j, i, k))
            {
                k = j1;
            }
            return b(k, i, j) != b(k, i, i1);
        }
        return b(j, i, k) == b(j, i, i1) && b(i1, i, k) != b(i1, i, j1);
    }

    public abstract double b(int i);

    public abstract int c(int i);

    public abstract int d(int i);

    public abstract b e(int i);

    public int f(int i)
    {
        if (i < 0 || i >= a)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return 0;
        }
    }

    public int g(int i)
    {
        if (i == 0)
        {
            return 0;
        }
        if (i == 1)
        {
            return a;
        } else
        {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    protected final int h(int i)
    {
        if (a == 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        int j = i % a;
        i = j;
        if (j < 0)
        {
            i = j + a;
        }
        return i;
    }
}
