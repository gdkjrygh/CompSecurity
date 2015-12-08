// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ac.a;
import java.io.DataInput;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ac

public final class g
    implements Comparable
{

    public int a;
    public int b;
    public int c;

    public g()
    {
    }

    public g(int i, int j)
    {
        a = i;
        b = j;
    }

    public g(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public g(g g1)
    {
        a = g1.a;
        b = g1.b;
        c = g1.c;
    }

    public static double a(double d1)
    {
        return 536870912D / (20015115.070354454D * Math.cos(0.017453292519943295D * d1));
    }

    public static float a(g g1, g g2, g g3, g g4)
    {
        float f1 = c(g1, g2, g3);
        if (f1 <= 0.0F)
        {
            g4.b(g1);
        } else
        if (f1 >= 1.0F)
        {
            g4.b(g2);
        } else
        {
            a(g1, g2, f1, g4);
        }
        return g3.d(g4);
    }

    public static int a(int i)
    {
        int j;
        do
        {
            j = i;
            if (i >= 0xe0000000)
            {
                break;
            }
            i += 0x40000000;
        } while (true);
        for (; j >= 0x20000000; j -= 0x40000000) { }
        return j;
    }

    public static g a(double d1, double d2)
    {
        g g1 = new g();
        d1 = Math.log(Math.tan(d1 * 0.017453292519943295D * 0.5D + 0.78539816339744828D));
        g1.d((int)Math.round(0.017453292519943295D * d2 * 170891318.89410791D), (int)Math.round(d1 * 170891318.89410791D));
        return g1;
    }

    public static g a(int i, int j)
    {
        return a((double)i * 9.9999999999999995E-08D, (double)j * 9.9999999999999995E-08D);
    }

    public static g a(a a1)
    {
        return a(a1.d(1), a1.d(2));
    }

    public static g a(g g1)
    {
        return new g(g1.a, g1.b, g1.c);
    }

    public static g a(g g1, g g2)
    {
        g g3 = new g();
        if (Math.abs(g2.a) >= 0x10000000 && (g1.a >= 0 || g2.a >= 0) && (g1.a < 0 || g2.a < 0)) goto _L2; else goto _L1
_L1:
        int i = g2.a - g1.a;
_L4:
        g3.a((int)((float)i * -0.2F) + g1.a, (int)((float)(g2.b - g1.b) * -0.2F) + g1.b, (int)((float)(g2.c - g1.c) * -0.2F) + g1.c);
        return g3;
_L2:
        int j = 0x40000000 - (Math.abs(g1.a) + Math.abs(g2.a));
        i = j;
        if (g1.a < 0)
        {
            i = -j;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static g a(DataInput datainput, ac ac1)
    {
        if (ac1.g < 0)
        {
            int i = -ac1.g;
            short word0 = datainput.readShort();
            int k = ac1.e;
            short word2 = datainput.readShort();
            return new g((word0 >> i) + k, ac1.f + (word2 >> i));
        } else
        {
            int j = ac1.g;
            short word1 = datainput.readShort();
            int l = ac1.e;
            short word3 = datainput.readShort();
            return new g((word1 << j) + l, ac1.f + (word3 << j));
        }
    }

    public static void a(g g1, float f1, g g2)
    {
        g2.a = (int)((float)g1.a * f1);
        g2.b = (int)((float)g1.b * f1);
        g2.c = (int)((float)g1.c * f1);
    }

    public static void a(g g1, g g2, float f1, g g3)
    {
        g3.a = (int)((float)(g2.a - g1.a) * f1) + g1.a;
        g3.b = (int)((float)(g2.b - g1.b) * f1) + g1.b;
        g3.c = (int)((float)(g2.c - g1.c) * f1) + g1.c;
    }

    public static void a(g g1, g g2, g g3)
    {
        g3.a = g1.a + g2.a;
        g3.b = g1.b + g2.b;
        g3.c = g1.c + g2.c;
    }

    static void a(DataInput datainput, ac ac1, int ai[], int i)
    {
        i *= 3;
        if (ac1.g < 0)
        {
            int j = -ac1.g;
            int l = i + 1;
            ai[i] = (datainput.readShort() >> j) + ac1.e;
            ai[l] = (datainput.readShort() >> j) + ac1.f;
            ai[l + 1] = 0;
            return;
        } else
        {
            int k = ac1.g;
            int i1 = i + 1;
            ai[i] = (datainput.readShort() << k) + ac1.e;
            ai[i1] = (datainput.readShort() << k) + ac1.f;
            ai[i1 + 1] = 0;
            return;
        }
    }

    public static float b(g g1, g g2)
    {
        return (float)g1.a * (float)g2.a + (float)g1.b * (float)g2.b + (float)g1.c * (float)g2.c;
    }

    public static g b(int i, int j)
    {
        return a((double)i * 9.9999999999999995E-07D, (double)j * 9.9999999999999995E-07D);
    }

    public static void b(g g1, float f1, g g2)
    {
        float f2 = g1.e();
        g2.a = (int)(((float)g1.a * f1) / f2);
        g2.b = (int)(((float)g1.b * f1) / f2);
        g2.c = (int)(((float)g1.c * f1) / f2);
    }

    public static void b(g g1, g g2, g g3)
    {
        g3.a = g1.a - g2.a;
        g3.b = g1.b - g2.b;
        g3.c = g1.c - g2.c;
    }

    static void b(DataInput datainput, ac ac1, int ai[], int i)
    {
        i *= 3;
        if (ac1.g < 0)
        {
            int j = -ac1.g;
            int l = i + 1;
            ai[i] = (datainput.readShort() >> j) + ac1.e;
            ai[l] = (datainput.readShort() >> j) + ac1.f;
            ai[l + 1] = datainput.readInt() >> j;
            return;
        } else
        {
            int k = ac1.g;
            int i1 = i + 1;
            ai[i] = (datainput.readShort() << k) + ac1.e;
            ai[i1] = (datainput.readShort() << k) + ac1.f;
            ai[i1 + 1] = datainput.readInt() << k;
            return;
        }
    }

    public static float c(g g1, g g2, g g3)
    {
        float f1 = g2.a - g1.a;
        float f2 = g2.b - g1.b;
        float f3 = g2.c - g1.c;
        return ((float)(g3.a - g1.a) * f1 + (float)(g3.b - g1.b) * f2 + f3 * (float)(g3.c - g1.c)) / (f1 * f1 + f2 * f2 + f3 * f3);
    }

    public static g c(int i, int j)
    {
        return a((double)i * 1.0000000000000001E-05D, (double)j * 1.0000000000000001E-05D);
    }

    public static boolean e(int i, int j)
    {
        return i < 0xe0000000 || i >= 0x20000000 || j < 0xe0000000 || j >= 0x20000000;
    }

    public final int a()
    {
        return (int)Math.round(b() * 1000000D);
    }

    public final g a(g g1, float f1)
    {
        g g2 = new g();
        a(this, g1, f1, g2);
        return g2;
    }

    public final void a(float f1, float f2)
    {
        f1 = (3.141593F * f1) / 180F;
        d((int)((double)f2 * Math.sin(f1)), (int)((double)f2 * Math.cos(f1)));
    }

    public final void a(int i, int j, int k)
    {
        a = i;
        b = j;
        c = k;
    }

    public final void a(int ai[], int i)
    {
        i *= 3;
        ai[i] = a;
        ai[i + 1] = b;
        ai[i + 2] = c;
    }

    public final double b()
    {
        return (Math.atan(Math.exp((double)b * 5.8516723170686385E-09D)) - 0.78539816339744828D) * 2D * 57.295779513082323D;
    }

    public final void b(g g1)
    {
        a = g1.a;
        b = g1.b;
        c = g1.c;
    }

    public final float c(g g1)
    {
        float f1 = a - g1.a;
        float f2 = b - g1.b;
        float f3 = c - g1.c;
        return (float)Math.sqrt(f1 * f1 + f2 * f2 + f3 * f3);
    }

    public final int c()
    {
        return (int)Math.round(d() * 1000000D);
    }

    public final int compareTo(Object obj)
    {
        obj = (g)obj;
        if (a == ((g) (obj)).a)
        {
            if (b == ((g) (obj)).b)
            {
                return c - ((g) (obj)).c;
            } else
            {
                return b - ((g) (obj)).b;
            }
        } else
        {
            return a - ((g) (obj)).a;
        }
    }

    public final double d()
    {
        double d1 = (double)a * 5.8516723170686385E-09D * 57.295779513082323D;
        double d2;
        do
        {
            d2 = d1;
            if (d1 <= 180D)
            {
                break;
            }
            d1 -= 360D;
        } while (true);
        for (; d2 < -180D; d2 += 360D) { }
        return d2;
    }

    public final float d(g g1)
    {
        float f1 = a - g1.a;
        float f2 = b - g1.b;
        float f3 = c - g1.c;
        return f1 * f1 + f2 * f2 + f3 * f3;
    }

    public final void d(int i, int j)
    {
        a = i;
        b = j;
        c = 0;
    }

    public final float e()
    {
        return (float)Math.sqrt((float)a * (float)a + (float)b * (float)b + (float)c * (float)c);
    }

    public final g e(g g1)
    {
        return new g(a + g1.a, b + g1.b, c + g1.c);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof g)
        {
            obj = (g)obj;
            flag = flag1;
            if (a == ((g) (obj)).a)
            {
                flag = flag1;
                if (b == ((g) (obj)).b)
                {
                    flag = flag1;
                    if (c == ((g) (obj)).c)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final g f(g g1)
    {
        return new g(a - g1.a, b - g1.b, c - g1.c);
    }

    public final String f()
    {
        return String.format(Locale.US, "%f,%f", new Object[] {
            Double.valueOf(b()), Double.valueOf(d())
        });
    }

    public final g g(g g1)
    {
        g g2 = new g();
        long l = a;
        long l1 = b;
        long l2 = c;
        long l3 = g1.a;
        long l4 = g1.b;
        long l5 = g1.c;
        g2.a = (int)(l1 * l5 - l2 * l4);
        g2.b = (int)(l2 * l3 - l5 * l);
        g2.c = (int)(l * l4 - l1 * l3);
        return g2;
    }

    public final void h(g g1)
    {
        g1.a = a(a);
        g1.b = b;
        g1.c = c;
    }

    public final int hashCode()
    {
        int j = a;
        int k = b;
        int i = c;
        j = j - k - i ^ i >> 13;
        k = k - i - j ^ j << 8;
        i = i - j - k ^ k >> 13;
        j = j - k - i ^ i >> 12;
        k = k - i - j ^ j << 16;
        i = i - j - k ^ k >> 5;
        j = j - k - i ^ i >> 3;
        k = k - i - j ^ j << 10;
        return i - j - k ^ k >> 15;
    }

    public final String toString()
    {
        int i = a;
        int j = b;
        int k = c;
        return (new StringBuilder(37)).append("(").append(i).append(",").append(j).append(",").append(k).append(")").toString();
    }
}
