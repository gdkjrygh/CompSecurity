// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;

public class ScalableLine extends View
{

    private Bitmap mBitmapLeft;
    private Bitmap mBitmapRight;
    private boolean mIsScalingFromCenter;
    private float mLengthOriginal;
    private float mLengthRequested;
    private Paint mPaint;
    private float mPosX;
    private float mPosXAtScaleStart;
    private float mScaleFactor;
    private float mScaleFromWidth;
    private float mWidthMiddle;
    private float mWidthSide;

    public ScalableLine(Context context)
    {
        super(context);
        init(context);
    }

    public ScalableLine(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    public ScalableLine(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        mPaint = new Paint();
        mPaint.setColor(context.getResources().getColor(0x7f0d0101));
        mPaint.setColorFilter(new PorterDuffColorFilter(context.getResources().getColor(0x7f0d0101), android.graphics.PorterDuff.Mode.SRC_IN));
        mBitmapLeft = BitmapFactory.decodeResource(getResources(), 0x7f02022c);
        mBitmapRight = BitmapFactory.decodeResource(getResources(), 0x7f02022d);
        mWidthSide = mBitmapLeft.getWidth();
    }

    public float getLength()
    {
        return 2.0F * mWidthSide + mWidthMiddle;
    }

    public float getScaleFactor()
    {
        return mScaleFactor;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        (new StringBuilder("mPosX=")).append(mPosX).append(", mIsScalingFromCenter=").append(mIsScalingFromCenter).append(", mScaleFromWidth=").append(mScaleFromWidth).append(", mLengthRequested=").append(mLengthRequested);
        canvas.drawBitmap(mBitmapLeft, mPosX, 0.0F, mPaint);
        float f = mWidthSide;
        float f1 = mPosX;
        float f2 = mWidthMiddle;
        float f3 = mWidthSide;
        canvas.drawRect(f1 + f, 0.0F, mPosX + (f2 + f3), getHeight(), mPaint);
        canvas.drawBitmap(mBitmapRight, mWidthMiddle + mWidthSide + mPosX, 0.0F, mPaint);
    }

    public void scaleFromCenter(float f)
    {
        mScaleFactor = f;
        float f1 = mLengthOriginal * f;
        (new StringBuilder("scaleFactor=")).append(f).append(", mLengthOriginal=").append(mLengthOriginal).append(", newLength=").append(f1);
        if (!mIsScalingFromCenter)
        {
            mScaleFromWidth = mLengthRequested;
            mPosXAtScaleStart = mPosX;
            (new StringBuilder("mScaleFromWidth=")).append(mScaleFromWidth);
        }
        setLength(f1, true);
    }

    public void setLength(float f, boolean flag)
    {
        (new StringBuilder("newLength=")).append(f).append(", isScalingFromCenter=").append(flag);
        mLengthRequested = f;
        mIsScalingFromCenter = flag;
        if (mLengthOriginal == 0.0F)
        {
            mLengthOriginal = f;
        }
        mWidthMiddle = f - mWidthSide * 2.0F;
        (new StringBuilder("mWidthMiddle=")).append(mWidthMiddle);
        if (mIsScalingFromCenter)
        {
            f = (mScaleFromWidth - mLengthRequested) / 2.0F;
            (new StringBuilder("mPosX=")).append(mPosX).append(", offset=").append(f);
            setX(f + mPosXAtScaleStart);
        }
        invalidate();
    }

    public void setX(float f)
    {
        mPosX = f;
    }
}
