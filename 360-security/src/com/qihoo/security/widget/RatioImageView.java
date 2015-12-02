// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public class RatioImageView extends ImageView
{

    private float a;
    private int b;
    protected WeakReference c;
    private int d;

    public RatioImageView(Context context)
    {
        this(context, null);
    }

    public RatioImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RatioImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = 1.0F;
        d = 1;
        context = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.RatioImageView);
        a = context.getFloat(1, 1.0F);
        d = context.getInt(0, 1);
        context.recycle();
    }

    protected void onMeasure(int i, int j)
    {
        if (d == 1)
        {
            if (b > 0)
            {
                i = android.view.View.MeasureSpec.makeMeasureSpec(b, 0x40000000);
            }
            j = android.view.View.MeasureSpec.makeMeasureSpec((int)((float)android.view.View.MeasureSpec.getSize(i) / a), 0x40000000);
        } else
        {
            i = android.view.View.MeasureSpec.makeMeasureSpec((int)((float)android.view.View.MeasureSpec.getSize(j) * a), 0x40000000);
        }
        super.onMeasure(i, j);
    }

    public void setRatio(float f)
    {
        a = f;
        requestLayout();
    }

    public void setWidth(int i)
    {
        b = i;
    }
}
