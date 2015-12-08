// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.animation;

import android.view.View;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.task.animation:
//            PagerAnimation

public class PagerVerticalSlideAnimation extends PagerAnimation
{

    private static PagerVerticalSlideAnimation _instance = new PagerVerticalSlideAnimation();
    private final int BACKWARDS_DURATION = 1000;
    private final int FORWARDS_DURATION = 750;

    protected PagerVerticalSlideAnimation()
    {
    }

    public static PagerVerticalSlideAnimation getInstance()
    {
        return _instance;
    }

    public int getBackwardsDuration()
    {
        return 1000;
    }

    public int getForwardsDuration()
    {
        return 750;
    }

    protected void transformBackgroundView(View view, float f, boolean flag)
    {
        float f1 = 0.75F + 0.25F * (1.0F + f);
        view.setAlpha(0.3F + 0.7F * (1.0F + f));
        view.setScaleX(f1);
        view.setScaleY(f1);
        view.setTranslationX(-Device.getScreenWidth() * f);
    }

    protected void transformForegroundView(View view, float f, boolean flag)
    {
        view.setAlpha(1.0F);
        view.setScaleY(1.0F);
        view.setScaleX(1.0F);
        view.setTranslationX(-Device.getScreenWidth() * f);
        view.setTranslationY(Device.getScreenHeight() * f);
    }

}
