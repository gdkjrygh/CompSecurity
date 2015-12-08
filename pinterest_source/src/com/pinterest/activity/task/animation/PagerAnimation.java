// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.animation;

import android.view.View;

public abstract class PagerAnimation
{

    public PagerAnimation()
    {
    }

    public abstract int getBackwardsDuration();

    public abstract int getForwardsDuration();

    abstract void transformBackgroundView(View view, float f, boolean flag);

    abstract void transformForegroundView(View view, float f, boolean flag);

    protected void transformUnderlyingView(View view, float f, boolean flag)
    {
        view.setAlpha(1.0F);
        view.setScaleX(1.0F);
        view.setScaleY(1.0F);
        view.setTranslationX(0.0F);
        view.setVisibility(4);
    }

    public void transformView(View view, float f, boolean flag, int i)
    {
        if (!flag && i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f <= -1F || f > 1.0F)
        {
            transformUnderlyingView(view, f, flag);
            return;
        }
        if (view.getVisibility() != 0)
        {
            view.setVisibility(0);
        }
        if (f >= 0.0F)
        {
            transformForegroundView(view, f, flag);
            return;
        } else
        {
            transformBackgroundView(view, f, flag);
            return;
        }
    }
}
