// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.view.animation.Interpolator;

// Referenced classes of package android.support.wearable.view:
//            BackgroundCrossfader

private static class range
    implements Interpolator
{

    private float end;
    private float range;
    private float start;

    public float getInterpolation(float f)
    {
        if (f < start)
        {
            return 0.0F;
        }
        if (f > end)
        {
            return 1.0F;
        } else
        {
            return (f - start) / range;
        }
    }

    public (float f, float f1)
    {
        start = f;
        end = f1;
        range = f1 - f;
    }
}
