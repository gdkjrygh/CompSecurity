// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

public class HeightWrappingViewPager extends ViewPager
{

    public HeightWrappingViewPager(Context context)
    {
        super(context);
    }

    public HeightWrappingViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    protected void onMeasure(int i, int j)
    {
        j = 0;
        int k;
        int l;
        for (k = 0; j < getChildCount(); k = l)
        {
            View view = getChildAt(j);
            view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            int i1 = view.getMeasuredHeight();
            l = k;
            if (i1 > k)
            {
                l = i1;
            }
            j++;
        }

        super.onMeasure(i, android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000));
    }
}
