// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class SpaceCompat extends View
{

    public SpaceCompat(Context context)
    {
        this(context, null);
    }

    public SpaceCompat(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SpaceCompat(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        if (getVisibility() == 0)
        {
            setVisibility(4);
        }
    }

    private static int a(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        switch (k)
        {
        case 0: // '\0'
        default:
            return i;

        case -2147483648: 
            return Math.min(i, j);

        case 1073741824: 
            return j;
        }
    }

    public void draw(Canvas canvas)
    {
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i), a(getSuggestedMinimumHeight(), j));
    }
}
