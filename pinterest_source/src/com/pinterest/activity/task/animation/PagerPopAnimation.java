// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.animation;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.task.animation:
//            PagerAnimation

public class PagerPopAnimation extends PagerAnimation
{

    private static PagerPopAnimation _instance = new PagerPopAnimation();
    private AccelerateDecelerateInterpolator _interpolator;

    protected PagerPopAnimation()
    {
        _interpolator = new AccelerateDecelerateInterpolator();
    }

    public static PagerPopAnimation getInstance()
    {
        return _instance;
    }

    public int getBackwardsDuration()
    {
        return 1000;
    }

    public int getForwardsDuration()
    {
        return 1000;
    }

    protected void transformBackgroundView(View view, float f, boolean flag)
    {
        view.setAlpha((float)Math.pow(Math.exp(f), 3D) * 0.7F + 0.3F);
        view.setScaleX(1.0F);
        view.setScaleY(1.0F);
        view.setTranslationX(-Device.getScreenWidth() * f);
    }

    protected void transformForegroundView(View view, float f, boolean flag)
    {
        float f1;
        float f2;
        if (flag)
        {
            f1 = _interpolator.getInterpolation(1.0F - f) * 0.5F + 0.5F;
            f2 = f1;
        } else
        {
            f1 = 1.0F - f;
            f2 = (float)Math.pow(f1, 8D);
        }
        view.setScaleX(f1);
        view.setScaleY(f1);
        view.setAlpha(f2);
        view.setTranslationX(-Device.getScreenWidth() * f);
    }

    protected void transformUnderlyingView(View view, float f, boolean flag)
    {
        transformBackgroundView(view, f, flag);
    }

}
