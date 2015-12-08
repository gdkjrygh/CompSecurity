// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

public class ExpandAnimation extends TranslateAnimation
    implements android.view.animation.Animation.AnimationListener
{

    int panelWidth;
    private LinearLayout slidingLayout;

    public ExpandAnimation(LinearLayout linearlayout, int i, int j, float f, int k, float f1, int l, 
            float f2, int i1, float f3)
    {
        super(j, f, k, f1, l, f2, i1, f3);
        slidingLayout = linearlayout;
        panelWidth = i;
        setDuration(400L);
        setFillAfter(false);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
        slidingLayout.startAnimation(this);
    }

    public void onAnimationEnd(Animation animation)
    {
        animation = (android.widget.FrameLayout.LayoutParams)slidingLayout.getLayoutParams();
        animation.leftMargin = panelWidth;
        animation.gravity = 3;
        slidingLayout.clearAnimation();
        slidingLayout.setLayoutParams(animation);
        slidingLayout.requestLayout();
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
