// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public final class PulsatingDotDrawable extends Drawable
    implements Animatable
{

    protected boolean mIsAnimating;
    protected final float mMinRadius = Math.max(0.0F, 0.1F);
    protected final long mOffsetMs;
    protected final Paint mPaint = new Paint();
    protected final long mPeriodMs = 800L;
    protected final float mRadiusSpan = Math.min(1.0F, 1.0F) - 0.1F;
    protected long mStartMs;

    public PulsatingDotDrawable(int i, long l)
    {
        mOffsetMs = l;
        mPaint.setAntiAlias(true);
        mPaint.setColor(i);
        mPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
    }

    public final void draw(Canvas canvas)
    {
        int i = canvas.getWidth();
        int j = canvas.getHeight();
        canvas.saveLayerAlpha(0.0F, 0.0F, i, j, 255, 31);
        float f = (float)Math.sin((double)((float)((System.currentTimeMillis() + mOffsetMs) % 800L) / 800F) * 6.2831853071795862D);
        float f1 = mMinRadius;
        f = (((f * 0.5F + 0.5F) * mRadiusSpan + f1) * (float)Math.min(i, j)) / 2.0F;
        canvas.drawCircle((float)i / 2.0F, (float)j / 2.0F, f, mPaint);
        canvas.restore();
        if (isRunning())
        {
            invalidateSelf();
        }
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final boolean isRunning()
    {
        return mIsAnimating;
    }

    public final void setAlpha(int i)
    {
        mPaint.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
    }

    public final void start()
    {
        if (!isRunning())
        {
            mStartMs = System.currentTimeMillis();
            mIsAnimating = true;
            invalidateSelf();
        }
    }

    public final void stop()
    {
        mIsAnimating = false;
    }
}
