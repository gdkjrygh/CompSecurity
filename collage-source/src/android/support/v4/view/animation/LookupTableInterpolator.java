// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.animation;

import android.view.animation.Interpolator;

abstract class LookupTableInterpolator
    implements Interpolator
{

    private final float mStepSize;
    private final float mValues[];

    public LookupTableInterpolator(float af[])
    {
        mValues = af;
        mStepSize = 1.0F / (float)(mValues.length - 1);
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
            int i = Math.min((int)((float)(mValues.length - 1) * f), mValues.length - 2);
            f = (f - (float)i * mStepSize) / mStepSize;
            float f1 = mValues[i];
            return (mValues[i + 1] - mValues[i]) * f + f1;
        }
    }
}
