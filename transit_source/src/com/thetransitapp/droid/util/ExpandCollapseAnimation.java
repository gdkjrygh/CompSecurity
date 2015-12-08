// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.util;

import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class ExpandCollapseAnimation
{

    private static final long DURATION = 200L;

    private ExpandCollapseAnimation()
    {
    }

    public static void collapse(final View v)
    {
        Animation animation = new Animation() {

            private final int val$initialHeight;
            private final View val$v;

            protected void applyTransformation(float f, Transformation transformation)
            {
                if (f == 1.0F)
                {
                    v.setVisibility(8);
                    return;
                } else
                {
                    v.getLayoutParams().height = initialHeight - (int)((float)initialHeight * f);
                    v.requestLayout();
                    return;
                }
            }

            public boolean willChangeBounds()
            {
                return true;
            }

            
            {
                v = view;
                initialHeight = i;
                super();
            }
        };
        animation.setInterpolator(new AccelerateInterpolator());
        animation.setDuration(200L);
        v.startAnimation(animation);
    }

    public static void expand(final View v, android.view.animation.Animation.AnimationListener animationlistener)
    {
        v.measure(-1, -2);
        final int targtetHeight = v.getMeasuredHeight();
        v.getLayoutParams().height = 0;
        v.setVisibility(0);
        Animation animation = new Animation() {

            private final int val$targtetHeight;
            private final View val$v;

            protected void applyTransformation(float f, Transformation transformation)
            {
                transformation = v.getLayoutParams();
                int i;
                if (f == 1.0F)
                {
                    i = -2;
                } else
                {
                    i = (int)((float)targtetHeight * f);
                }
                transformation.height = i;
                v.requestLayout();
            }

            public boolean willChangeBounds()
            {
                return true;
            }

            
            {
                v = view;
                targtetHeight = i;
                super();
            }
        };
        animation.setInterpolator(new AccelerateInterpolator());
        animation.setDuration(200L);
        animation.setAnimationListener(animationlistener);
        v.startAnimation(animation);
    }
}
