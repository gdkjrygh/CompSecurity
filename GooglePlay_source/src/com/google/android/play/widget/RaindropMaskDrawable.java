// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.Random;

public final class RaindropMaskDrawable extends Drawable
    implements Animatable
{
    protected static final class Drop
    {

        public long startOffsetMs;
        public float x;
        public float y;

        protected Drop()
        {
        }
    }


    protected final int mDropCount;
    protected final Drop mDrops[];
    protected final long mDurationMs;
    protected Paint mErasingPaint;
    protected final Interpolator mInterpolator = new AccelerateInterpolator();
    protected boolean mIsAnimating;
    protected int mMaskColor;
    protected long mStartTimeMs;
    public Runnable mStoppedRunnable;

    public RaindropMaskDrawable(int i, int j, long l)
    {
        mMaskColor = i;
        mDropCount = j;
        mDurationMs = l;
        mDrops = new Drop[j];
        mErasingPaint = new Paint();
        mErasingPaint.setAntiAlias(true);
        mErasingPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        mErasingPaint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
    }

    public final void draw(Canvas canvas)
    {
        if (mStartTimeMs == 0L)
        {
            canvas.drawColor(mMaskColor);
            return;
        }
        long l = System.currentTimeMillis() - mStartTimeMs;
        Drop adrop[];
        boolean flag;
        int j;
        if (l >= mDurationMs)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        canvas.saveLayerAlpha(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight(), 255, 31);
        canvas.drawColor(mMaskColor);
        adrop = mDrops;
        j = adrop.length;
        for (int i = 0; i < j; i++)
        {
            Drop drop = adrop[i];
            float f = (float)l / (float)mDurationMs;
            f = mInterpolator.getInterpolation(f);
            Rect rect = getBounds();
            float f1 = Math.max(rect.width(), rect.height());
            float f2 = drop.x;
            float f3 = rect.width();
            float f4 = drop.y;
            canvas.drawCircle(f2 * f3, (float)rect.height() * f4, f * f1, mErasingPaint);
        }

        canvas.restore();
        if (flag)
        {
            stop();
            return;
        } else
        {
            invalidateSelf();
            return;
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
        mMaskColor = Color.argb(i, Color.red(mMaskColor), Color.green(mMaskColor), Color.blue(mMaskColor));
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        throw new UnsupportedOperationException();
    }

    public final void start()
    {
        if (!isRunning())
        {
            if (mStartTimeMs == 0L)
            {
                mStartTimeMs = System.currentTimeMillis();
                Random random = new Random();
                for (int i = 0; i < mDropCount; i++)
                {
                    Drop drop = new Drop();
                    drop.x = random.nextFloat() * 1.5F - 0.25F;
                    drop.y = random.nextFloat() * 1.5F - 0.25F;
                    drop.startOffsetMs = (long)(random.nextDouble() * (double)mDurationMs);
                    mDrops[i] = drop;
                }

            }
            mIsAnimating = true;
            invalidateSelf();
        }
    }

    public final void stop()
    {
        mIsAnimating = false;
        if (mStoppedRunnable != null)
        {
            mStoppedRunnable.run();
        }
    }
}
