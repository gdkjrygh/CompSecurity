// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class AspectRatioEnforcingFrameLayout extends RelativeLayout
{

    public float a;

    public AspectRatioEnforcingFrameLayout(Context context)
    {
        this(context, null);
    }

    public AspectRatioEnforcingFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AspectRatioEnforcingFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void a(float f)
    {
        a = f;
        requestLayout();
    }

    protected void onMeasure(int i, int j)
    {
        if (a == 0.0F)
        {
            super.onMeasure(i, j);
            return;
        }
        int k1 = getPaddingLeft() + getPaddingRight();
        int j1 = getPaddingTop() + getPaddingBottom();
        int i1 = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        int k = android.view.View.MeasureSpec.getMode(i);
        int l1 = android.view.View.MeasureSpec.getMode(j);
        float f;
        if (k == 0)
        {
            k = (int)(a * (float)l);
        } else
        {
            k = i1;
            if (l1 == 0)
            {
                l = (int)((float)i1 / a);
                k = i1;
            }
        }
        i = android.view.View.MeasureSpec.getSize(i) - k1;
        j = android.view.View.MeasureSpec.getSize(j) - j1;
        f = (float)i / (float)j;
        if (a > f)
        {
            i = (int)((float)j - (float)i / a);
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec((j - i) + j1, 0x40000000));
            return;
        } else
        {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec((i - (int)((float)i - (float)j * a)) + k1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000));
            return;
        }
    }
}
