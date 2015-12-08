// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;

public class CollapseAnimation extends TranslateAnimation
    implements android.view.animation.Animation.AnimationListener
{

    int panelWidth;
    private LinearLayout slidingLayout;

    public CollapseAnimation(LinearLayout linearlayout, int i, int j, float f, int k, float f1, int l, 
            float f2, int i1, float f3)
    {
        super(j, f, k, f1, l, f2, i1, f3);
        slidingLayout = linearlayout;
        panelWidth = i;
        setDuration(400L);
        setFillAfter(false);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
        linearlayout = (android.widget.FrameLayout.LayoutParams)slidingLayout.getLayoutParams();
        linearlayout.rightMargin = 0;
        linearlayout.leftMargin = 0;
        slidingLayout.setLayoutParams(linearlayout);
        slidingLayout.requestLayout();
        slidingLayout.startAnimation(this);
    }

    public void onAnimationEnd(Animation animation)
    {
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
