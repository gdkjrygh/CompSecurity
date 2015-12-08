// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

abstract class DrawerArrowDrawable extends Drawable
{

    private static final float ARROW_HEAD_ANGLE = (float)Math.toRadians(45D);
    private final float mBarGap;
    private final float mBarSize;
    private final float mBarThickness;
    private float mCenterOffset;
    private float mMaxCutForBarSize;
    private final float mMiddleArrowSize;
    private final Paint mPaint = new Paint();
    private final Path mPath = new Path();
    float mProgress;
    private final int mSize;
    private final boolean mSpin;
    private final float mTopBottomArrowSize;
    boolean mVerticalMirror;

    DrawerArrowDrawable(Context context)
    {
        mVerticalMirror = false;
        context = context.getTheme().obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.DrawerArrowToggle, 0x7f010006, 0x7f110072);
        mPaint.setAntiAlias(true);
        mPaint.setColor(context.getColor(0, 0));
        mSize = context.getDimensionPixelSize(2, 0);
        mBarSize = Math.round(context.getDimension(6, 0.0F));
        mTopBottomArrowSize = Math.round(context.getDimension(4, 0.0F));
        mBarThickness = context.getDimension(7, 0.0F);
        mBarGap = Math.round(context.getDimension(3, 0.0F));
        mSpin = context.getBoolean(1, true);
        mMiddleArrowSize = context.getDimension(5, 0.0F);
        mCenterOffset = ((int)((float)mSize - mBarThickness * 3F - mBarGap * 2.0F) / 4) * 2;
        mCenterOffset = (float)((double)mCenterOffset + ((double)mBarThickness * 1.5D + (double)mBarGap));
        context.recycle();
        mPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mPaint.setStrokeJoin(android.graphics.Paint.Join.MITER);
        mPaint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        mPaint.setStrokeWidth(mBarThickness);
        mMaxCutForBarSize = (float)((double)(mBarThickness / 2.0F) * Math.cos(ARROW_HEAD_ANGLE));
    }

    public void draw(Canvas canvas)
    {
        boolean flag;
        Rect rect = getBounds();
        flag = isLayoutRtl();
        float f = mBarSize;
        float f4 = f + (mTopBottomArrowSize - f) * mProgress;
        f = mBarSize;
        float f2 = f + (mMiddleArrowSize - f) * mProgress;
        float f3 = Math.round(0.0F + (mMaxCutForBarSize - 0.0F) * mProgress);
        float f5 = 0.0F + (ARROW_HEAD_ANGLE - 0.0F) * mProgress;
        float f1;
        float f6;
        float f7;
        float f8;
        if (flag)
        {
            f = 0.0F;
        } else
        {
            f = -180F;
        }
        if (flag)
        {
            f1 = 180F;
        } else
        {
            f1 = 0.0F;
        }
        f6 = mProgress;
        f7 = Math.round((double)f4 * Math.cos(f5));
        f4 = Math.round((double)f4 * Math.sin(f5));
        mPath.rewind();
        f5 = mBarGap + mBarThickness;
        f5 += (-mMaxCutForBarSize - f5) * mProgress;
        f8 = -f2 / 2.0F;
        mPath.moveTo(f8 + f3, 0.0F);
        mPath.rLineTo(f2 - 2.0F * f3, 0.0F);
        mPath.moveTo(f8, f5);
        mPath.rLineTo(f7, f4);
        mPath.moveTo(f8, -f5);
        mPath.rLineTo(f7, -f4);
        mPath.close();
        canvas.save();
        canvas.translate(rect.centerX(), mCenterOffset);
        if (!mSpin) goto _L2; else goto _L1
_L1:
        int i;
        if (mVerticalMirror ^ flag)
        {
            i = -1;
        } else
        {
            i = 1;
        }
        canvas.rotate((float)i * (f + (f1 - f) * f6));
_L4:
        canvas.drawPath(mPath, mPaint);
        canvas.restore();
        return;
_L2:
        if (flag)
        {
            canvas.rotate(180F);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int getIntrinsicHeight()
    {
        return mSize;
    }

    public int getIntrinsicWidth()
    {
        return mSize;
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isAutoMirrored()
    {
        return true;
    }

    abstract boolean isLayoutRtl();

    public void setAlpha(int i)
    {
        mPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
    }

}
