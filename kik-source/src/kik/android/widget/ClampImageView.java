// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ClampImageView extends ImageView
{

    public ClampImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ClampImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
    }

    protected void onMeasure(int i, int j)
    {
        i = android.view.View.MeasureSpec.getSize(i);
        j = android.view.View.MeasureSpec.getSize(j);
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            int k = drawable.getIntrinsicHeight();
            int i1 = drawable.getIntrinsicWidth();
            float f = (float)i / (float)i1;
            float f1 = (float)j / (float)k;
            if (f != 0.0F && f < f1 || f1 == 0.0F)
            {
                k = (int)((float)k * f);
                j = i;
                i = k;
            } else
            {
                int l = (int)((float)i1 * f1);
                i = j;
                j = l;
            }
            setMeasuredDimension(j, i);
        } else
        {
            setMeasuredDimension(0, 0);
        }
        ((ViewGroup)getParent()).getHeight();
    }
}
