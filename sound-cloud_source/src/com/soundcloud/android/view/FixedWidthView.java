// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class FixedWidthView extends View
{

    private int width;

    public FixedWidthView(Context context)
    {
        super(context);
    }

    public FixedWidthView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public FixedWidthView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void onMeasure(int i, int j)
    {
        setMeasuredDimension(width, getDefaultSize(getSuggestedMinimumHeight(), j));
    }

    public void setWidth(int i)
    {
        width = i;
    }
}
