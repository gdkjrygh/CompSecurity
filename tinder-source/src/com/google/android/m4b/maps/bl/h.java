// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bl;


public abstract class h
{

    private Float a;
    private Float b;

    public h()
    {
    }

    public static float a(float f1, float f2, float f3, float f4)
    {
        return (float)Math.atan2(f3 - f1, f4 - f2);
    }

    public abstract float a(int i);

    public abstract long a();

    public abstract float b(int i);

    public abstract int b();

    public abstract float c();

    public abstract float d();

    public abstract void e();

    public final float f()
    {
        if (a == null)
        {
            a = Float.valueOf(a(a(0), b(0), a(b() - 1), b(b() - 1)));
        }
        return a.floatValue();
    }

    public final float g()
    {
        if (b == null)
        {
            float f1 = a(0) - a(b() - 1);
            float f2 = b(0) - b(b() - 1);
            b = Float.valueOf((float)Math.sqrt(f1 * f1 + f2 * f2));
        }
        return b.floatValue();
    }
}
