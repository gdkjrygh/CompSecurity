// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MapsProgressBar extends View
{

    private static final int progressBarHeight = 8;
    private int mBackgroudPaintColor;
    private Paint mBackgroundPaint;
    private Paint mProgressPaint;
    private int mProgressValue;
    private int maxProgressValue;
    private int minProgressValue;

    public MapsProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mBackgroundPaint = new Paint();
        mProgressPaint = new Paint();
        mBackgroudPaintColor = getResources().getColor(com.accuweather.android.R.color.progress_green);
        minProgressValue = 0;
        maxProgressValue = 100;
        mProgressValue = minProgressValue;
        initAttributes(context, attributeset);
        init(context);
    }

    private void init(Context context)
    {
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        mBackgroundPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        mBackgroundPaint.setColor(mBackgroudPaintColor);
        mProgressPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        mProgressPaint.setColor(-1);
    }

    private void initAttributes(Context context, AttributeSet attributeset)
    {
        context = context.getTheme().obtainStyledAttributes(attributeset, com.accuweather.android.R.styleable.MapsProgressBar, 0, 0);
        mBackgroudPaintColor = context.getColor(0, getResources().getColor(com.accuweather.android.R.color.progress_green));
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    public int getMaxProgressValue()
    {
        return maxProgressValue;
    }

    public int getMinProgressValue()
    {
        return minProgressValue;
    }

    protected void onDraw(Canvas canvas)
    {
        float f = (float)getHeight() / 2.0F - 4F;
        float f1 = getWidth();
        float f2 = (float)mProgressValue / (float)maxProgressValue;
        canvas.drawRect(0.0F, f, getWidth(), f + 8F, mBackgroundPaint);
        canvas.drawRect(f1 * f2, f, getWidth(), f + 8F, mProgressPaint);
    }

    public void setProgress(int i)
    {
        mProgressValue = i;
        invalidate();
    }
}
