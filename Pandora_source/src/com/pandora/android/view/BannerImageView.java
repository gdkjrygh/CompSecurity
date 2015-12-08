// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class BannerImageView extends ImageView
{

    public BannerImageView(Context context)
    {
        super(context);
    }

    public BannerImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BannerImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        i = android.view.View.MeasureSpec.getSize(i);
        setMeasuredDimension(i, (getDrawable().getIntrinsicHeight() * i) / getDrawable().getIntrinsicWidth());
    }
}
