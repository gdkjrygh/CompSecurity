// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;
import com.google.android.apps.photos.stories.StoryLayout;

final class irl
    implements Interpolator
{

    private irj a;

    irl(irj irj1)
    {
        a = irj1;
        super();
    }

    private static float a(float f, float f1)
    {
        return f1 * f + -9F * f * f;
    }

    public final float getInterpolation(float f)
    {
        a.f.computeScroll();
        if ((double)f < 0.66000000000000003D)
        {
            return a(f, 6F);
        } else
        {
            return a(f - 0.66F, 3F);
        }
    }
}
