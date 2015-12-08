// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;


public final class h
{

    float a;
    float b;
    float c;
    float d;
    float e;
    private float f;
    private float g;
    private float h;
    private float i;

    public h()
    {
        f = 0.0F;
        g = 1.0F;
        h = 0.0F;
        i = 1.0F;
        a = -1F;
        b = 2.0F;
        c = 10F;
        d = c - b;
        e = 1.0F;
    }

    private void a()
    {
        h = 0.0F + f * 0.4F;
        i = 0.6F + g * 0.4F;
    }

    final float a(float f1)
    {
        float f2 = f1;
        if (f1 > 1.0F)
        {
            f2 = 1.0F;
        }
        if (f2 < f)
        {
            f = f2;
            a();
        }
        if (f2 > g)
        {
            g = f2;
            a();
        }
        f1 = (f2 - h) / (i - h);
        if (a < 0.0F)
        {
            a = f1;
            return f1;
        }
        f2 = a - f1;
        if (Math.abs(f2) > 0.1F)
        {
            f1 = a - Math.signum(f2) * 0.1F;
        }
        a = f1;
        return f1;
    }

    public final float b(float f1)
    {
        f1 = a(f1);
        float f2 = b;
        return f1 * f1 * d + f2;
    }
}
