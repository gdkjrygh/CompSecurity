// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.d;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;

public final class a
{

    private static Interpolator a = new AccelerateInterpolator();
    private static Interpolator b = new DecelerateInterpolator();

    public static Animation a(float f)
    {
        return a(((Animation) (new TranslateAnimation(1, 0.0F, 1, f, 2, 0.0F, 2, 0.0F))), 400L, false);
    }

    public static Animation a(float f, float f1)
    {
        return a(((Animation) (new TranslateAnimation(2, 0.0F, 2, 0.0F, 1, f, 1, f1))), 400L, false);
    }

    public static Animation a(Animation animation, long l, boolean flag)
    {
        animation.setDuration(l);
        if (flag)
        {
            animation.setInterpolator(a);
            return animation;
        } else
        {
            animation.setInterpolator(b);
            return animation;
        }
    }

}
