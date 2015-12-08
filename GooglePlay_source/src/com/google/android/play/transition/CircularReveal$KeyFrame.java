// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.transition;

import android.animation.TimeInterpolator;

// Referenced classes of package com.google.android.play.transition:
//            CircularReveal

private static final class mInterpolator
    implements Comparable
{

    public Float mAmountPct;
    public TimeInterpolator mInterpolator;
    public Float mTimePct;

    public final volatile int compareTo(Object obj)
    {
        obj = (mInterpolator)obj;
        return mTimePct.compareTo(((mTimePct) (obj)).mTimePct);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof mTimePct) && mTimePct.equals(((mTimePct)obj).mTimePct);
    }

    public final int hashCode()
    {
        return mTimePct.hashCode();
    }

    public (float f, float f1)
    {
        if (f < 0.0F || f > 1.0F)
        {
            throw new IllegalArgumentException("Time value must be between [0,1]");
        }
        if (f1 < 0.0F || f1 > 1.0F)
        {
            throw new IllegalArgumentException("Value percentage must be between [0,1]");
        } else
        {
            mTimePct = Float.valueOf(f);
            mAmountPct = Float.valueOf(f1);
            mInterpolator = null;
            return;
        }
    }
}
