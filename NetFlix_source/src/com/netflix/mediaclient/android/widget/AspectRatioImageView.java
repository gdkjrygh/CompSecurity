// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AspectRatioImageView extends ImageView
{

    public static final int MEASURE_BY_HEIGHT = 1;
    public static final int MEASURE_BY_WIDTH = 0;
    private int mMeasureBy;

    public AspectRatioImageView(Context context)
    {
        super(context);
        mMeasureBy = 1;
    }

    public AspectRatioImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mMeasureBy = 1;
        context = context.obtainStyledAttributes(attributeset, com.netflix.mediaclient.R.styleable.AspectRatioImageView);
        mMeasureBy = context.getInt(0, 1);
        context.recycle();
    }

    public AspectRatioImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mMeasureBy = 1;
    }

    public int getMeasureBy()
    {
        return mMeasureBy;
    }

    protected void onMeasure(int i, int j)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            if (mMeasureBy == 0)
            {
                int k = android.view.View.MeasureSpec.getSize(i);
                int i1 = drawable.getIntrinsicWidth();
                if (i1 <= 0)
                {
                    super.onMeasure(i, j);
                    return;
                }
                i = (drawable.getIntrinsicHeight() * k) / i1;
                j = k;
            } else
            {
                int l = android.view.View.MeasureSpec.getSize(j);
                int j1 = drawable.getIntrinsicHeight();
                if (j1 <= 0)
                {
                    super.onMeasure(i, j);
                    return;
                }
                j = (drawable.getIntrinsicWidth() * l) / j1;
                i = l;
            }
            setMeasuredDimension(j, i);
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public void setMeasureBy(int i)
    {
        if (i != 1 && i != 0)
        {
            throw new IllegalArgumentException("nvalid measureBy type");
        } else
        {
            mMeasureBy = i;
            requestLayout();
            return;
        }
    }
}
