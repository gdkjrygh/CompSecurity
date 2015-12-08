// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class DynamicImageView extends ImageView
{

    public DynamicImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            i = android.view.View.MeasureSpec.getSize(i);
            setMeasuredDimension(i, (int)Math.ceil(((float)i * (float)drawable.getIntrinsicHeight()) / (float)drawable.getIntrinsicWidth()));
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
    }
}
