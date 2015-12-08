// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.animation;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.task.animation:
//            PagerAnimation

public class PagerSlideAnimation extends PagerAnimation
{

    private static PagerSlideAnimation _instance = new PagerSlideAnimation();
    private DecelerateInterpolator _interpolator;

    protected PagerSlideAnimation()
    {
        _interpolator = new DecelerateInterpolator();
    }

    public static PagerSlideAnimation getInstance()
    {
        return _instance;
    }

    public int getBackwardsDuration()
    {
        return 400;
    }

    public int getForwardsDuration()
    {
        return 440;
    }

    protected void transformBackgroundView(View view, float f, boolean flag)
    {
        float f1;
        float f2;
        if (flag)
        {
            f1 = (float)Math.pow(Math.exp(f), 3D);
            f2 = 0.75F + 0.25F * f1;
            f1 = f1 * 0.7F + 0.3F;
        } else
        {
            f2 = 0.15F * (1.0F + f) + 0.85F;
            f1 = (1.0F + f) * 0.5F + 0.5F;
        }
        view.setAlpha(f1);
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setTranslationX(-Device.getScreenWidth() * f);
    }

    protected void transformForegroundView(View view, float f, boolean flag)
    {
        float f1 = Device.getScreenWidth();
        view.setAlpha(1.0F);
        view.setScaleY(1.0F);
        view.setScaleX(1.0F);
        view.setTranslationX(1.0F);
        if (flag)
        {
            view.setTranslationX(f1 + (-f * f1 - _interpolator.getInterpolation(1.0F - f) * f1));
            return;
        } else
        {
            view.setTranslationX(0.0F);
            return;
        }
    }

}
