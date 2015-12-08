// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.search;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class ArrowOrBurgerDrawable extends Drawable
{

    private static final float HALF_SQRT_2 = (float)(Math.sqrt(2D) / 2D);
    private float mArrowness;
    private final boolean mIsRtl = false;
    private final Paint mPaint = new Paint();
    private float mPreDrawScale;

    public ArrowOrBurgerDrawable(int i)
    {
        mArrowness = 1.0F;
        mPaint.setColor(i);
        mPaint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        mPaint.setStrokeWidth(0.286F);
        mPaint.setAntiAlias(true);
    }

    public final void draw(Canvas canvas)
    {
        canvas.save();
        canvas.translate(getBounds().centerX(), getBounds().centerY());
        canvas.scale(mPreDrawScale, mPreDrawScale);
        canvas.rotate((1.0F - mArrowness) * 180F + 0.0F);
        float f1 = 1.0F + (0.5F - mArrowness) * 0.286F;
        canvas.drawLine(-f1, 0.0F, f1, 0.0F, mPaint);
        float f = 45F * mArrowness;
        f1 += mArrowness * (HALF_SQRT_2 - f1);
        canvas.rotate(f);
        canvas.drawLine(-f1, HALF_SQRT_2, f1, HALF_SQRT_2, mPaint);
        canvas.rotate(-2F * f);
        canvas.drawLine(-f1, -HALF_SQRT_2, f1, -HALF_SQRT_2, mPaint);
        canvas.restore();
    }

    public final int getOpacity()
    {
        return -2;
    }

    protected final void onBoundsChange(Rect rect)
    {
        mPreDrawScale = (float)Math.min(rect.width(), rect.height()) / 2.572F;
        mPaint.setStrokeWidth(0.286F);
    }

    public final void setAlpha(int i)
    {
        mPaint.setAlpha(i);
    }

    public final void setAsBurger(boolean flag)
    {
        float f;
        if (flag)
        {
            f = 0.0F;
        } else
        {
            f = 1.0F;
        }
        setHowArrowIsTheBurger(f);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
    }

    public final void setHowArrowIsTheBurger(float f)
    {
        mArrowness = f;
        invalidateSelf();
    }

}
