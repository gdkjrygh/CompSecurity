// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import me.lyft.android.logging.L;

public class AspectRatioImageView extends ImageView
{

    public AspectRatioImageView(Context context)
    {
        super(context);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public AspectRatioImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        j = android.view.View.MeasureSpec.getSize(i);
        i = (j * 3) / 4;
        if (getDrawable() != null)
        {
            i = (getDrawable().getIntrinsicHeight() * j) / getDrawable().getIntrinsicWidth();
        } else
        {
            L.e(new NullPointerException("AspectRatioImageView initialized with null drawable"), "onMeasure", new Object[0]);
        }
        setMeasuredDimension(j, i);
    }
}
