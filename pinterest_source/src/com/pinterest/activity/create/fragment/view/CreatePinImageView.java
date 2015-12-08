// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.pinterest.base.Device;
import com.pinterest.ui.imageview.WebImageView;

public class CreatePinImageView extends WebImageView
{

    public CreatePinImageView(Context context)
    {
        this(context, null);
    }

    public CreatePinImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CreatePinImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setCornerRadius(0.0F);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        float f = 1.0F;
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            f = (float)drawable.getIntrinsicHeight() / (float)drawable.getIntrinsicWidth();
        }
        int k = android.view.View.MeasureSpec.getSize(i);
        i = (int)Math.floor(f * (float)k);
        j = (int)((double)Device.getScreenHeight() * 0.40000000000000002D);
        if (i > j)
        {
            i = j;
        }
        setMeasuredDimension(k, i);
    }
}
