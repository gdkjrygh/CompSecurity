// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.b;

import android.view.animation.Interpolator;

abstract class b
    implements Interpolator
{

    private final float a[];
    private final float b;

    public b(float af[])
    {
        a = af;
        b = 1.0F / (float)(a.length - 1);
    }

    public float getInterpolation(float f)
    {
        if (f >= 1.0F)
        {
            return 1.0F;
        }
        if (f <= 0.0F)
        {
            return 0.0F;
        } else
        {
            int i = Math.min((int)((float)(a.length - 1) * f), a.length - 2);
            f = (f - (float)i * b) / b;
            float f1 = a[i];
            return (a[i + 1] - a[i]) * f + f1;
        }
    }
}
