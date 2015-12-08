// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;

public final class ccv
    implements TimeInterpolator
{

    private final TimeInterpolator a = new AccelerateInterpolator();

    public ccv()
    {
    }

    public final float getInterpolation(float f)
    {
        if (f <= 0.5F)
        {
            return a.getInterpolation(f * 2.0F);
        } else
        {
            return a.getInterpolation((1.0F - f) * 2.0F);
        }
    }
}
