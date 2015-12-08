// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FitWidthImageView extends ImageView
{

    public FitWidthImageView(Context context)
    {
        super(context);
    }

    public FitWidthImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FitWidthImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            i = android.view.View.MeasureSpec.getSize(i);
            j = drawable.getIntrinsicWidth();
            if (j > 0)
            {
                float f = i;
                setMeasuredDimension(i, (int)(((float)drawable.getIntrinsicHeight() * f) / (float)j));
            }
        }
    }
}
