// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;


// Referenced classes of package com.google.android.m4b.maps.bo:
//            g

public final class i
{

    public static float a(int j, int k)
    {
        float f1 = 90F - (float)((Math.atan2(k, j) * 180D) / 3.1415926535897931D);
        float f = f1;
        if (f1 < 0.0F)
        {
            f = f1 + 360F;
        }
        return f;
    }

    public static int a(g g1, g g2, g g3)
    {
        long l = (long)(g3.a - g1.a) * (long)(g3.b - g2.b) - (long)(g3.b - g1.b) * (long)(g3.a - g2.a);
        int j;
        if (l != 0L)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        return (int)((long)j | l >> 63);
    }

    public static void a(g g1, float f, g g2)
    {
        float f1 = (float)Math.hypot(g1.a, g1.b);
        if (f1 == 0.0F)
        {
            g2.a = (int)f;
            g2.b = 0;
            return;
        } else
        {
            f /= f1;
            g2.a = (int)((float)(-g1.b) * f);
            g2.b = (int)(f * (float)g1.a);
            return;
        }
    }

    public static void a(g g1, g g2)
    {
        g2.a = -g1.b;
        g2.b = g1.a;
    }

    public static boolean a(g g1, g g2, g g3, g g4)
    {
        int j = g2.a - g1.a;
        int k = g2.b - g1.b;
        int l = g4.a - g3.a;
        int i1 = g4.b - g3.b;
        int j1 = g3.a - g1.a;
        int k1 = g3.b - g1.b;
        long l1 = (long)l * (long)k - (long)i1 * (long)j;
        if (l1 == 0L)
        {
            if (j1 == 0 && k1 == 0)
            {
                return true;
            }
            if ((long)j1 * (long)k - (long)k1 * (long)j != 0L)
            {
                return false;
            }
            if (j == 0 && k == 0)
            {
                return e(g3, g4, g1);
            }
            if (l == 0 && i1 == 0)
            {
                return e(g1, g2, g3);
            }
            return e(g1, g2, g3) || e(g1, g2, g4) || e(g3, g4, g1) || e(g3, g4, g2);
        }
        long l2 = -j1;
        long l3 = k;
        long l4 = k1;
        double d1 = (double)((long)j * l4 + l2 * l3) / (double)l1;
        if (d1 < 0.0D || d1 > 1.0D)
        {
            return false;
        }
        l2 = j1;
        l3 = i1;
        l4 = k1;
        d1 = (double)(l2 * l3 - (long)l * l4) / (double)(-l1);
        return d1 >= 0.0D && d1 <= 1.0D;
    }

    public static boolean a(g g1, g g2, g g3, g g4, g g5)
    {
        int j = g1.b - g2.b;
        int k = g2.a - g1.a;
        long l = (long)(g4.a - g3.a) * (long)j + (long)(g4.b - g3.b) * (long)k;
        if (l == 0L)
        {
            if (a(g1, g2, g3) == 0)
            {
                g5.b(g3);
                return true;
            }
            if (a(g1, g2, g4) == 0)
            {
                g5.b(g4);
                return true;
            } else
            {
                return false;
            }
        }
        long l1 = g1.a - g3.a;
        long l2 = j;
        long l3 = g1.b - g3.b;
        double d1 = (double)((long)k * l3 + l1 * l2) / (double)l;
        if (d1 < 0.0D || d1 > 1.0D)
        {
            return false;
        } else
        {
            g5.a = (int)((double)g3.a + (double)(g4.a - g3.a) * d1);
            double d2 = g3.b;
            g5.b = (int)(d1 * (double)(g4.b - g3.b) + d2);
            return true;
        }
    }

    public static float b(g g1, g g2)
    {
        return a(g2.a - g1.a, g2.b - g1.b);
    }

    public static boolean b(g g1, g g2, g g3)
    {
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        j = g1.a;
        k = g1.b;
        l = g2.a;
        i1 = g2.b;
        j1 = g3.a;
        k1 = g3.b;
        break MISSING_BLOCK_LABEL_35;
        while (true) 
        {
            do
            {
                do
                {
                    return false;
                } while (k <= k1 && i1 <= k1 || j1 >= j && j1 >= l || j1 < j && j1 < l);
                if (l < j)
                {
                    break;
                }
                long l1 = j1 - j;
                long l3 = i1 - k;
                long l5 = k1 - k;
                if (l1 * l3 > (long)(l - j) * l5)
                {
                    return true;
                }
            } while (true);
            long l2 = j1 - j;
            long l4 = i1 - k;
            long l6 = k1 - k;
            if (l2 * l4 < (long)(l - j) * l6)
            {
                return true;
            }
        }
    }

    public static long c(g g1, g g2)
    {
        return (long)g1.a * (long)g2.b - (long)g1.b * (long)g2.a;
    }

    public static void c(g g1, g g2, g g3)
    {
        g3.a = g1.a + g2.a;
        g3.b = g1.b + g2.b;
    }

    public static void d(g g1, g g2, g g3)
    {
        g3.a = g1.a - g2.a;
        g3.b = g1.b - g2.b;
    }

    private static boolean e(g g1, g g2, g g3)
    {
        long l = g2.a - g1.a;
        long l1 = g2.b - g1.b;
        long l2 = (long)(g3.a - g1.a) * l + (long)(g3.b - g1.b) * l1;
        return l2 >= 0L && l2 <= l * l + l1 * l1;
    }
}
