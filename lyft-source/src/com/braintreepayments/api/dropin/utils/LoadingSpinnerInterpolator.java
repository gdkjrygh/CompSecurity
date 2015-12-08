// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.utils;

import android.view.animation.Interpolator;

public class LoadingSpinnerInterpolator
    implements Interpolator
{

    private static final float A_X = 1.87F;
    private static final float A_Y = -1.865F;
    private static final float B_X = -2.805F;
    private static final float B_Y = 2.73F;
    private static final float C_X = 1.935F;
    private static final float C_Y = 0.135F;
    private static final float END_X = 0.355F;
    private static final float END_Y = 1F;
    private static final float START_X = 0.645F;
    private static final float START_Y = 0.045F;

    public LoadingSpinnerInterpolator()
    {
    }

    private float getBezierCoordinateX(float f)
    {
        return (1.935F + (-2.805F + 1.87F * f) * f) * f;
    }

    private float getXDerivate(float f)
    {
        return 1.935F + (-5.61F + 5.61F * f) * f;
    }

    private float getXForTime(float f)
    {
        int i = 1;
        float f1 = f;
        do
        {
            float f2;
label0:
            {
                if (i < 14)
                {
                    f2 = getBezierCoordinateX(f1) - f;
                    if ((double)Math.abs(f2) >= 0.001D)
                    {
                        break label0;
                    }
                }
                return f1;
            }
            f1 -= f2 / getXDerivate(f1);
            i++;
        } while (true);
    }

    protected float getBezierCoordinateY(float f)
    {
        return (0.135F + (2.73F + -1.865F * f) * f) * f;
    }

    public float getInterpolation(float f)
    {
        return getBezierCoordinateY(getXForTime(f));
    }
}
