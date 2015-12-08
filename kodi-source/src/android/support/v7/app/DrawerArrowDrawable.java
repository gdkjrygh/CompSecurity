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
    private float mProgress;
    private final int mSize;
    private final boolean mSpin;
    private final float mTopBottomArrowSize;
    private boolean mVerticalMirror;

    DrawerArrowDrawable(Context context)
    {
        mVerticalMirror = false;
        context = context.getTheme().obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.DrawerArrowToggle, android.support.v7.appcompat.R.attr.drawerArrowStyle, android.support.v7.appcompat.R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        mPaint.setAntiAlias(true);
        mPaint.setColor(context.getColor(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_color, 0));
        mSize = context.getDimensionPixelSize(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_drawableSize, 0);
        mBarSize = Math.round(context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_barSize, 0.0F));
        mTopBottomArrowSize = Math.round(context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_topBottomBarArrowSize, 0.0F));
        mBarThickness = context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_thickness, 0.0F);
        mBarGap = Math.round(context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0F));
        mSpin = context.getBoolean(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_spinBars, true);
        mMiddleArrowSize = context.getDimension(android.support.v7.appcompat.R.styleable.DrawerArrowToggle_middleBarArrowSize, 0.0F);
        mCenterOffset = ((int)((float)mSize - mBarThickness * 3F - mBarGap * 2.0F) / 4) * 2;
        mCenterOffset = (float)((double)mCenterOffset + ((double)mBarThickness * 1.5D + (double)mBarGap));
        context.recycle();
        mPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mPaint.setStrokeJoin(android.graphics.Paint.Join.MITER);
        mPaint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        mPaint.setStrokeWidth(mBarThickness);
        mMaxCutForBarSize = (float)((double)(mBarThickness / 2.0F) * Math.cos(ARROW_HEAD_ANGLE));
    }

    private static float lerp(float f, float f1, float f2)
    {
        return (f1 - f) * f2 + f;
    }

    public void draw(Canvas canvas)
    {
        boolean flag;
        Rect rect = getBounds();
        flag = isLayoutRtl();
        float f4 = lerp(mBarSize, mTopBottomArrowSize, mProgress);
        float f2 = lerp(mBarSize, mMiddleArrowSize, mProgress);
        float f3 = Math.round(lerp(0.0F, mMaxCutForBarSize, mProgress));
        float f5 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
        float f;
        float f1;
        float f6;
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
        f = lerp(f, f1, mProgress);
        f1 = Math.round((double)f4 * Math.cos(f5));
        f4 = Math.round((double)f4 * Math.sin(f5));
        mPath.rewind();
        f5 = lerp(mBarGap + mBarThickness, -mMaxCutForBarSize, mProgress);
        f6 = -f2 / 2.0F;
        mPath.moveTo(f6 + f3, 0.0F);
        mPath.rLineTo(f2 - 2.0F * f3, 0.0F);
        mPath.moveTo(f6, f5);
        mPath.rLineTo(f1, f4);
        mPath.moveTo(f6, -f5);
        mPath.rLineTo(f1, -f4);
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
        canvas.rotate((float)i * f);
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

    public void setProgress(float f)
    {
        mProgress = f;
        invalidateSelf();
    }

    protected void setVerticalMirror(boolean flag)
    {
        mVerticalMirror = flag;
    }

}
