// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class ImageBannerView extends View
{

    private Drawable image;

    public ImageBannerView(Context context)
    {
        super(context);
    }

    public ImageBannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        if (image != null)
        {
            i = android.view.View.MeasureSpec.getSize(i);
            setMeasuredDimension(i, (image.getIntrinsicHeight() * i) / image.getIntrinsicWidth());
            return;
        } else
        {
            setMeasuredDimension(i, j);
            return;
        }
    }

    public void setImage(int i)
    {
        setImage(getContext().getResources().getDrawable(i));
    }

    public void setImage(Drawable drawable)
    {
        image = drawable;
        setBackgroundDrawable(drawable);
    }
}
