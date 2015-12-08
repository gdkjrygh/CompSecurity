// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tinder.utils.k;

public class RoundedLinearLayout extends LinearLayout
{

    private boolean mHasRadiusBeenSet;
    private int mRadius;
    private Path mRoundingPath;

    public RoundedLinearLayout(Context context)
    {
        super(context);
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setOrientation(1);
        if (k.a() < 18 && k.a() > 10)
        {
            setLayerType(1, null);
        }
        context = context.obtainStyledAttributes(attributeset, com.tinder.a.a.com_tinder_views_RoundedRelativeLayout, 0, 0);
        mRadius = context.getDimensionPixelSize(0, 0);
        context.recycle();
        configureRounding();
    }

    private void clipPath(Canvas canvas)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16 || !isHardwareAccelerated())
        {
            configureRounding();
            canvas.clipPath(mRoundingPath);
        }
    }

    private void configureRounding()
    {
        int i = getWidth();
        int j = getHeight();
        if (i > 0 && j > 0 && !mHasRadiusBeenSet)
        {
            mHasRadiusBeenSet = true;
            mRoundingPath = new Path();
            RectF rectf = new RectF(0.0F, 0.0F, i, j);
            mRoundingPath.addRoundRect(rectf, mRadius, mRadius, android.graphics.Path.Direction.CCW);
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        clipPath(canvas);
        super.dispatchDraw(canvas);
    }

    public void draw(Canvas canvas)
    {
        clipPath(canvas);
        super.draw(canvas);
    }
}
