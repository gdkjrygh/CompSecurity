// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;


public final class k
{

    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    private k(float f1, float f2, float f3, float f4, float f5, float f6, float f7, 
            float f8, float f9)
    {
        a = f1;
        b = f4;
        c = f7;
        d = f2;
        e = f5;
        f = f8;
        g = f3;
        h = f6;
        i = f9;
    }

    public static k a(float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8)
    {
        float f9 = ((f1 - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0F && f10 == 0.0F)
        {
            return new k(f3 - f1, f5 - f3, f1, f4 - f2, f6 - f4, f2, 0.0F, 0.0F, 1.0F);
        } else
        {
            float f11 = f3 - f5;
            float f12 = f7 - f5;
            f5 = f4 - f6;
            float f13 = f8 - f6;
            f6 = f11 * f13 - f12 * f5;
            f12 = (f13 * f9 - f12 * f10) / f6;
            f5 = (f10 * f11 - f9 * f5) / f6;
            return new k((f3 - f1) + f12 * f3, (f7 - f1) + f5 * f7, f1, f12 * f4 + (f4 - f2), f5 * f8 + (f8 - f2), f2, f12, f5, 1.0F);
        }
    }

    public static k a(float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, 
            float f9, float f10, float f11, float f12, float f13, float f14, float f15, 
            float f16)
    {
        k k1 = b(f1, f2, f3, f4, f5, f6, f7, f8);
        return a(f9, f10, f11, f12, f13, f14, f15, f16).a(k1);
    }

    public static k b(float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8)
    {
        return a(f1, f2, f3, f4, f5, f6, f7, f8).a();
    }

    k a()
    {
        return new k(e * i - f * h, f * g - d * i, d * h - e * g, c * h - b * i, a * i - c * g, b * g - a * h, b * f - c * e, c * d - a * f, a * e - b * d);
    }

    k a(k k1)
    {
        return new k(a * k1.a + d * k1.b + g * k1.c, a * k1.d + d * k1.e + g * k1.f, a * k1.g + d * k1.h + g * k1.i, b * k1.a + e * k1.b + h * k1.c, b * k1.d + e * k1.e + h * k1.f, b * k1.g + e * k1.h + h * k1.i, c * k1.a + f * k1.b + i * k1.c, c * k1.d + f * k1.e + i * k1.f, c * k1.g + f * k1.h + i * k1.i);
    }

    public void a(float af[])
    {
        int l = af.length;
        float f1 = a;
        float f2 = b;
        float f3 = c;
        float f4 = d;
        float f5 = e;
        float f6 = f;
        float f7 = g;
        float f8 = h;
        float f9 = i;
        for (int j = 0; j < l; j += 2)
        {
            float f10 = af[j];
            float f11 = af[j + 1];
            float f12 = f3 * f10 + f6 * f11 + f9;
            af[j] = (f1 * f10 + f4 * f11 + f7) / f12;
            af[j + 1] = (f10 * f2 + f11 * f5 + f8) / f12;
        }

    }
}
