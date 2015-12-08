// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.imageview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class FullSizeImageView extends ImageView
{

    public FullSizeImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        Drawable drawable = getDrawable();
        if (drawable == null)
        {
            super.onMeasure(i, j);
            return;
        } else
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(drawable.getIntrinsicWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(drawable.getIntrinsicHeight(), 0x40000000));
            return;
        }
    }
}
