// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class SquareFrameLayout extends FrameLayout
{

    private static final int DEFAULT_DOMINANT_MEASUREMENT = 0;
    public static final int MEASUREMENT_HEIGHT = 1;
    public static final int MEASUREMENT_WIDTH = 0;
    private final int dominantMeasurement;

    public SquareFrameLayout(Context context)
    {
        this(context, null);
    }

    public SquareFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, com.soundcloud.android.R.styleable.SquareFrameLayout);
        dominantMeasurement = context.getInt(0, 0);
        context.recycle();
    }

    public void onMeasure(int i, int j)
    {
        switch (dominantMeasurement)
        {
        default:
            super.onMeasure(i, j);
            return;

        case 0: // '\0'
            super.onMeasure(i, i);
            return;

        case 1: // '\001'
            super.onMeasure(j, j);
            break;
        }
    }
}
