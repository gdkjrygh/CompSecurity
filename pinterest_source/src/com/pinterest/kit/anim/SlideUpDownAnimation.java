// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.anim;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class SlideUpDownAnimation extends Animation
{

    private boolean slideIn;
    private int targetHeight;
    private View view;

    public SlideUpDownAnimation(View view1, boolean flag, int i)
    {
        view = view1;
        targetHeight = i;
        slideIn = flag;
        init();
    }

    private void init()
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        int i;
        if (slideIn)
        {
            i = 0;
        } else
        {
            i = targetHeight;
        }
        layoutparams.height = i;
        view.setVisibility(0);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        int i;
        if (slideIn)
        {
            i = (int)((float)targetHeight * f);
        } else
        {
            i = (int)((float)targetHeight * (1.0F - f));
        }
        view.getLayoutParams().height = i;
        view.requestLayout();
    }

    public boolean willChangeBounds()
    {
        return true;
    }
}
