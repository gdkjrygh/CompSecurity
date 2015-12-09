// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.animation;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;

public final class ShuffleAnimation
{

    private static final float SQRT_2 = (float)Math.sqrt(2D);
    public static final boolean SUPPORTS_SHUFFLE_ANIMATION;
    private static int sContainerPos[] = new int[2];
    private static int sViewPos[] = new int[2];

    public static ViewPropertyAnimator shuffleAnimator$256b5262(View view, ViewGroup viewgroup)
    {
        if (!SUPPORTS_SHUFFLE_ANIMATION)
        {
            viewgroup = null;
        } else
        {
            Object obj = view.getRootView();
            view.getLocationInWindow(sViewPos);
            viewgroup.getLocationInWindow(sContainerPos);
            float f = (float)(sViewPos[1] - sContainerPos[1]) / (float)((View) (obj)).getHeight();
            float f1 = (float)(sViewPos[0] - sContainerPos[0]) / (float)((View) (obj)).getWidth();
            view.getWidth();
            view.setTranslationY(viewgroup.getHeight());
            view.setRotation(16F);
            long l = Math.min(250L + Math.max(0L, (long)(350F * f + 150F * f1)), 500L);
            obj = view.animate();
            ((ViewPropertyAnimator) (obj)).cancel();
            ((ViewPropertyAnimator) (obj)).translationY(0.0F).rotation(0.0F).setDuration(l);
            viewgroup = ((ViewGroup) (obj));
            if (android.os.Build.VERSION.SDK_INT >= 21)
            {
                ((ViewPropertyAnimator) (obj)).setInterpolator(AnimationUtils.loadInterpolator(view.getContext(), 0x10c000e));
                return ((ViewPropertyAnimator) (obj));
            }
        }
        return viewgroup;
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        SUPPORTS_SHUFFLE_ANIMATION = flag;
    }
}
