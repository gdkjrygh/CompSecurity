// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ScaledImageView extends ImageView
{

    private int height;
    private int width;

    public ScaledImageView(Context context)
    {
        super(context);
        width = 0;
        height = 0;
    }

    public ScaledImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        width = 0;
        height = 0;
    }

    protected void onMeasure(int i, int j)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            if (android.view.View.MeasureSpec.getSize(j) > android.view.View.MeasureSpec.getSize(i))
            {
                i = android.view.View.MeasureSpec.getSize(i);
                j = (int)Math.ceil(((float)i * (float)drawable.getIntrinsicHeight()) / (float)drawable.getIntrinsicWidth());
                if (i > width)
                {
                    width = i;
                }
                if (j > height)
                {
                    height = j;
                }
                setMeasuredDimension(width, height);
                return;
            }
            i = android.view.View.MeasureSpec.getSize(j);
            j = (int)Math.ceil(((float)i * (float)drawable.getIntrinsicWidth()) / (float)drawable.getIntrinsicHeight());
            if (j > width)
            {
                width = j;
            }
            if (i > height)
            {
                height = i;
            }
            setMeasuredDimension(width, height);
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }

    public void setMaxHeight(int i)
    {
        height = i;
        super.setMaxHeight(i);
    }
}
