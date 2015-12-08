// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import kik.android.chat.KikApplication;

// Referenced classes of package kik.android.widget:
//            IconImageView

public class HeightClampedIconImageView extends IconImageView
{

    private float a;
    private float b;

    public HeightClampedIconImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public HeightClampedIconImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 1.6F;
        b = 0.0F;
        setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        context = context.obtainStyledAttributes(attributeset, kik.android.ag.b.c);
        a = context.getFloat(0, 1.6F);
        b = context.getDimension(1, KikApplication.a(16));
    }

    protected void onMeasure(int i, int j)
    {
        android.view.View.MeasureSpec.getSize(i);
        j = (int)b;
        Drawable drawable = getDrawable();
        if (drawable != null)
        {
            i = drawable.getIntrinsicHeight();
            float f = (float)drawable.getIntrinsicWidth() / (float)i;
            if (f > a)
            {
                i = (int)Math.ceil((double)j * (double)a);
            } else
            {
                i = (int)Math.ceil(f * (float)j);
            }
            setMeasuredDimension(i, j);
            return;
        } else
        {
            setMeasuredDimension(0, 0);
            return;
        }
    }
}
