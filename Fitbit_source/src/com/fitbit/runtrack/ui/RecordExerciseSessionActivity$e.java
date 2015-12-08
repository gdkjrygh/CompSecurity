// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.view.animation.Interpolator;

// Referenced classes of package com.fitbit.runtrack.ui:
//            RecordExerciseSessionActivity

public static class c
    implements Interpolator
{

    private final float a;
    private final float b;
    private final float c;

    public float getInterpolation(float f)
    {
        float f1 = 1.0F;
        if (f < a)
        {
            f1 = f / a;
        } else
        if (f < 1.0F)
        {
            double d = (double)b * 3.1415926535897931D * 2D;
            double d1 = 1.0F / a;
            return 1.0F + (float)((Math.sin((double)(f - a) * d) / Math.exp(c * (f - a)) / d) * d1);
        }
        return f1;
    }

    public (float f, float f1, float f2)
    {
        a = f;
        b = f1;
        c = f2;
    }
}
