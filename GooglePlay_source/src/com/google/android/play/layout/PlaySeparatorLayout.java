// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class PlaySeparatorLayout extends RelativeLayout
{

    private final int mHalfSeparatorThickness;
    private final int mSeparatorPaddingBottom;
    private final int mSeparatorPaddingLeft;
    private final int mSeparatorPaddingRight;
    private final int mSeparatorPaddingTop;
    private final Paint mSeparatorPaint;
    private final int mSeparatorThickness;
    private boolean mSeparatorVisible;

    public PlaySeparatorLayout(Context context)
    {
        this(context, null, 0);
    }

    public PlaySeparatorLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlaySeparatorLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setWillNotDraw(false);
        mSeparatorVisible = false;
        Resources resources = context.getResources();
        mSeparatorThickness = resources.getDimensionPixelSize(0x7f0c02f8);
        mHalfSeparatorThickness = (mSeparatorThickness + 1) / 2;
        mSeparatorPaint = new Paint();
        mSeparatorPaint.setColor(resources.getColor(0x7f0b0285));
        mSeparatorPaint.setStrokeWidth(mSeparatorThickness);
        context = context.obtainStyledAttributes(attributeset, com.google.android.play.R.styleable.PlaySeparatorLayout);
        mSeparatorPaddingTop = context.getDimensionPixelSize(0, 0);
        mSeparatorPaddingBottom = context.getDimensionPixelSize(1, 0);
        mSeparatorPaddingLeft = context.getDimensionPixelSize(2, 0);
        mSeparatorPaddingRight = context.getDimensionPixelSize(3, 0);
        context.recycle();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
    }
}
