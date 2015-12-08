// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.view.animation.Interpolator;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity

public static class 
    implements Interpolator
{

    private float a(float f)
    {
        float f1 = 1.0F;
        if (f < 0.04166667F)
        {
            f1 = 0.0F;
        } else
        {
            if (f < 0.08333334F)
            {
                return -0.0192037F;
            }
            if ((double)f < 0.125D)
            {
                return -0.05487037F;
            }
            if (f < 0.1666667F)
            {
                return -0.07407407F;
            }
            if (f < 0.2083333F)
            {
                return 0.008916667F;
            }
            if ((double)f < 0.25D)
            {
                return 0.2163889F;
            }
            if (f < 0.2916667F)
            {
                return 0.4861111F;
            }
            if (f < 0.3333333F)
            {
                return 0.7558333F;
            }
            if ((double)f < 0.375D)
            {
                return 0.9633055F;
            }
            if (f < 0.4166667F)
            {
                return 1.046296F;
            }
            if (f < 0.4583333F)
            {
                return 1.0455F;
            }
            if ((double)f < 0.5D)
            {
                return 1.041741F;
            }
            if (f < 0.5416667F)
            {
                return 1.0315F;
            }
            if (f < 0.5833333F)
            {
                return 1.020981F;
            }
            if (f < 0.625F)
            {
                return 1.014546F;
            }
            if (f < 0.6666667F)
            {
                return 1.010315F;
            }
            if (f < 0.7083333F)
            {
                return 1.007315F;
            }
            if (f < 0.75F)
            {
                return 1.005111F;
            }
            if (f < 0.7916667F)
            {
                return 1.003472F;
            }
            if (f < 0.8333333F)
            {
                return 1.002241F;
            }
            if (f < 0.875F)
            {
                return 1.001352F;
            }
            if (f < 0.9166667F)
            {
                return 1.000713F;
            }
            if (f < 0.9583333F)
            {
                return 1.000306F;
            }
            if (f < 1.0F)
            {
                return 1.000074F;
            }
        }
        return f1;
    }

    public float getInterpolation(float f)
    {
        float f1 = a(f);
        float f2 = Math.min(1.0F, (float)((int)(24F * f) + 1) / 24F);
        float f3 = Math.min((float)(int)(24F * f) / 24F, 1.0F);
        f3 = (f - f3) / (f2 - f3);
        f = f1;
        if (!Double.isNaN(f3))
        {
            f = f1 + (a(f2) - f1) * f3;
        }
        return f;
    }

    public ()
    {
    }
}
