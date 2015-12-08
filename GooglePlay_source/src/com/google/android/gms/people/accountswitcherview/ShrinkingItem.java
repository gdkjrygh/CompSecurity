// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

class ShrinkingItem extends FrameLayout
{

    float mAnimatedHeightFraction;

    public ShrinkingItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mAnimatedHeightFraction = 1.0F;
    }

    public ShrinkingItem(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mAnimatedHeightFraction = 1.0F;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        j = getMeasuredHeight();
        if (mAnimatedHeightFraction != 1.0F)
        {
            j = Math.round(mAnimatedHeightFraction * (float)j);
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), j);
    }
}
