// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public class MessageMomentBackgroundDrawable extends Drawable
{

    private final boolean hasImage;
    private final boolean isRight;
    private final Paint mChatBgPaint = new Paint();
    private final float mCornerRadius;
    private final int mImageHeight;
    private Paint mImagePaint;
    private final RectF mImageRect = new RectF();
    private final RectF mOverallRect = new RectF();
    private final Paint mRoundPaint = new Paint();
    private final RectF mSquareEdge = new RectF();
    private int mTextAreaHeight;
    private Path mTriangle;
    private final RectF mTriangleGap = new RectF();
    private final int mTriangleRadius;
    private final int mTriangleSize;

    public MessageMomentBackgroundDrawable(Bitmap bitmap, int i, float f, int j, boolean flag)
    {
        mImageHeight = i;
        boolean flag1;
        if (bitmap != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        hasImage = flag1;
        mCornerRadius = f;
        mTriangleSize = (int)((double)mCornerRadius * 1.2D);
        mTriangleRadius = (int)mCornerRadius / 2;
        if (hasImage)
        {
            bitmap = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            mImagePaint = new Paint();
            mImagePaint.setAntiAlias(true);
            mImagePaint.setShader(bitmap);
        }
        mChatBgPaint.setColor(j);
        mRoundPaint.setColor(j);
        mRoundPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        mRoundPaint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        mRoundPaint.setPathEffect(new CornerPathEffect(mTriangleRadius));
        isRight = flag;
    }

    private void setupLeftAttachedTriangle(Rect rect)
    {
        int i;
        if (hasImage)
        {
            mImageRect.set(mTriangleSize, rect.top, rect.right, mImageHeight);
            mSquareEdge.set(mTriangleSize, (float)mImageHeight - mCornerRadius, rect.right, (float)mImageHeight + mCornerRadius);
            mOverallRect.set(mTriangleSize, (float)mImageHeight - mCornerRadius, rect.right, rect.bottom);
        } else
        {
            mOverallRect.set(mTriangleSize, rect.top, rect.right, rect.bottom);
        }
        i = (int)((double)mTriangleSize * 1.5D);
        mTriangle = new Path();
        mTriangle.moveTo(0.0F, rect.bottom);
        mTriangle.lineTo(i, (float)((double)rect.bottom - (double)mTriangleSize * 1.5D));
        mTriangle.lineTo(i, rect.bottom);
        mTriangle.close();
        mTriangleGap.set(i - mTriangleRadius, (float)((double)rect.bottom - (double)mTriangleSize * 1.5D), i + mTriangleRadius, rect.bottom);
    }

    private void setupRightAttachedTriangle(Rect rect)
    {
        int i;
        int j;
        int k;
        if (hasImage)
        {
            mImageRect.set(rect.left, rect.top, rect.right - mTriangleSize, mImageHeight);
            mSquareEdge.set(rect.left, (float)mImageHeight - mCornerRadius, rect.right - mTriangleSize, (float)mImageHeight + mCornerRadius);
            mOverallRect.set(rect.left, (float)mImageHeight - mCornerRadius, rect.right - mTriangleSize, rect.bottom);
        } else
        {
            mOverallRect.set(rect.left, rect.top, rect.right - mTriangleSize, rect.bottom);
        }
        i = rect.right;
        j = rect.bottom;
        k = (int)((double)mTriangleSize * 1.5D);
        mTriangle = new Path();
        mTriangle.moveTo(i, j);
        mTriangle.lineTo(i - k, j);
        mTriangle.lineTo(i - k, (float)((double)j - (double)mTriangleSize * 1.5D));
        mTriangle.close();
        mTriangleGap.set(i - k, (float)((double)j - (double)mTriangleSize * 1.5D), (i - k) + mTriangleRadius, j);
    }

    public void draw(Canvas canvas)
    {
        if (hasImage)
        {
            canvas.drawRoundRect(mImageRect, mCornerRadius, mCornerRadius, mImagePaint);
        }
        canvas.drawRoundRect(mOverallRect, mCornerRadius, mCornerRadius, mChatBgPaint);
        if (hasImage)
        {
            canvas.drawRect(mSquareEdge, mChatBgPaint);
        }
        canvas.drawPath(mTriangle, mRoundPaint);
        (new Paint()).setColor(0xffff0000);
        canvas.drawRect(mTriangleGap, mChatBgPaint);
    }

    public int getOpacity()
    {
        return -3;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        if (isRight)
        {
            setupRightAttachedTriangle(rect);
            return;
        } else
        {
            setupLeftAttachedTriangle(rect);
            return;
        }
    }

    public void setAlpha(int i)
    {
        mImagePaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mImagePaint.setColorFilter(colorfilter);
    }

    public void setTextAreaHeight(int i)
    {
        mTextAreaHeight = i;
    }
}
