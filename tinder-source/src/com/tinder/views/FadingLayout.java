// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class FadingLayout extends FrameLayout
{

    private int mColorPrimary;
    private int mColorSecondary;
    private ArgbEvaluator mEvaluator;
    private View mOverlay;

    public FadingLayout(Context context)
    {
        super(context);
        init(context);
    }

    public FadingLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context, attributeset, 0, 0);
    }

    public FadingLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context, attributeset, 0, 0);
    }

    public FadingLayout(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        init(context, attributeset, i, j);
    }

    private void init(Context context)
    {
        mEvaluator = new ArgbEvaluator();
        mOverlay = new View(context);
        mOverlay.setVisibility(8);
    }

    private void init(Context context, AttributeSet attributeset, int i, int j)
    {
        init(context);
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, com.tinder.a.a.FadingLayout, i, j);
        mColorPrimary = attributeset.getColor(0, context.getResources().getColor(0x7f0d0113));
        mColorSecondary = attributeset.getColor(1, context.getResources().getColor(0x7f0d000f));
        attributeset.recycle();
        return;
        context;
        attributeset.recycle();
        throw context;
    }

    protected void onFinishInflate()
    {
        addView(mOverlay, new android.widget.FrameLayout.LayoutParams(-1, -1));
        super.onFinishInflate();
    }

    public void setColorPrimary(int i)
    {
        mColorPrimary = i;
    }

    public void setColorSecondary(int i)
    {
        mColorSecondary = i;
    }

    public void setTransitionPercent(float f)
    {
        mOverlay.setAlpha(f);
        mOverlay.setBackgroundColor(((Integer)mEvaluator.evaluate(f, Integer.valueOf(mColorPrimary), Integer.valueOf(mColorSecondary))).intValue());
        boolean flag;
        if (f <= 0.0F || f >= 1.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && mOverlay.getVisibility() == 0)
        {
            mOverlay.setVisibility(8);
        } else
        if (!flag && mOverlay.getVisibility() == 8)
        {
            mOverlay.setVisibility(0);
            return;
        }
    }
}
