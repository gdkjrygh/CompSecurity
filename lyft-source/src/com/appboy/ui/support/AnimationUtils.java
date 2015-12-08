// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.support;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;

public class AnimationUtils
{

    private static Interpolator sAccelerateInterpolator = new AccelerateInterpolator();
    private static Interpolator sDecelerateInterpolator = new DecelerateInterpolator();

    public AnimationUtils()
    {
    }

    public static Animation createHorizontalAnimation(float f, float f1, long l, boolean flag)
    {
        return setAnimationParams(new TranslateAnimation(1, f, 1, f1, 2, 0.0F, 2, 0.0F), l, flag);
    }

    public static Animation createVerticalAnimation(float f, float f1, long l, boolean flag)
    {
        return setAnimationParams(new TranslateAnimation(2, 0.0F, 2, 0.0F, 1, f, 1, f1), l, flag);
    }

    public static Animation setAnimationParams(Animation animation, long l, boolean flag)
    {
        animation.setDuration(l);
        if (flag)
        {
            animation.setInterpolator(sAccelerateInterpolator);
            return animation;
        } else
        {
            animation.setInterpolator(sDecelerateInterpolator);
            return animation;
        }
    }

}
