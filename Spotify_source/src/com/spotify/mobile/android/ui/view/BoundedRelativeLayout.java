// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import gmr;

public class BoundedRelativeLayout extends RelativeLayout
{

    private final int a;
    private final int b;

    public BoundedRelativeLayout(Context context)
    {
        super(context);
        b = 0;
        a = 0;
    }

    public BoundedRelativeLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, gmr.b);
        a = context.getDimensionPixelSize(0, 0);
        b = context.getDimensionPixelSize(1, 0);
        context.recycle();
    }

    public BoundedRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        int l = android.view.View.MeasureSpec.getSize(i);
        int k = i;
        if (a > 0)
        {
            k = i;
            if (l > a)
            {
                i = android.view.View.MeasureSpec.getMode(i);
                k = android.view.View.MeasureSpec.makeMeasureSpec(a, i);
            }
        }
        l = android.view.View.MeasureSpec.getSize(j);
        i = j;
        if (b > 0)
        {
            i = j;
            if (l > b)
            {
                i = android.view.View.MeasureSpec.getMode(j);
                i = android.view.View.MeasureSpec.makeMeasureSpec(b, i);
            }
        }
        super.onMeasure(k, i);
    }
}
