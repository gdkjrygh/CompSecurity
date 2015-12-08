// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.ColorUtils;

class CircularBorderDrawable extends Drawable
{

    private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333F;
    private ColorStateList mBorderTint;
    float mBorderWidth;
    private int mBottomInnerStrokeColor;
    private int mBottomOuterStrokeColor;
    private int mCurrentBorderTintColor;
    private boolean mInvalidateShader;
    final Paint mPaint = new Paint(1);
    final Rect mRect = new Rect();
    final RectF mRectF = new RectF();
    private float mRotation;
    private int mTopInnerStrokeColor;
    private int mTopOuterStrokeColor;

    public CircularBorderDrawable()
    {
        mInvalidateShader = true;
        mPaint.setStyle(android.graphics.Paint.Style.STROKE);
    }

    private Shader createGradientShader()
    {
        Object obj = mRect;
        copyBounds(((Rect) (obj)));
        float f = mBorderWidth / (float)((Rect) (obj)).height();
        int i = ColorUtils.compositeColors(mTopOuterStrokeColor, mCurrentBorderTintColor);
        int j = ColorUtils.compositeColors(mTopInnerStrokeColor, mCurrentBorderTintColor);
        int k = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(mTopInnerStrokeColor, 0), mCurrentBorderTintColor);
        int l = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(mBottomInnerStrokeColor, 0), mCurrentBorderTintColor);
        int i1 = ColorUtils.compositeColors(mBottomInnerStrokeColor, mCurrentBorderTintColor);
        int j1 = ColorUtils.compositeColors(mBottomOuterStrokeColor, mCurrentBorderTintColor);
        float f1 = ((Rect) (obj)).top;
        float f2 = ((Rect) (obj)).bottom;
        obj = android.graphics.Shader.TileMode.CLAMP;
        return new LinearGradient(0.0F, f1, 0.0F, f2, new int[] {
            i, j, k, l, i1, j1
        }, new float[] {
            0.0F, f, 0.5F, 0.5F, 1.0F - f, 1.0F
        }, ((android.graphics.Shader.TileMode) (obj)));
    }

    public void draw(Canvas canvas)
    {
        if (mInvalidateShader)
        {
            mPaint.setShader(createGradientShader());
            mInvalidateShader = false;
        }
        float f = mPaint.getStrokeWidth() / 2.0F;
        RectF rectf = mRectF;
        copyBounds(mRect);
        rectf.set(mRect);
        rectf.left = rectf.left + f;
        rectf.top = rectf.top + f;
        rectf.right = rectf.right - f;
        rectf.bottom = rectf.bottom - f;
        canvas.save();
        canvas.rotate(mRotation, rectf.centerX(), rectf.centerY());
        canvas.drawOval(rectf, mPaint);
        canvas.restore();
    }

    public int getOpacity()
    {
        return mBorderWidth <= 0.0F ? -2 : -3;
    }

    public boolean getPadding(Rect rect)
    {
        int i = Math.round(mBorderWidth);
        rect.set(i, i, i, i);
        return true;
    }

    public boolean isStateful()
    {
        return mBorderTint != null && mBorderTint.isStateful() || super.isStateful();
    }

    protected void onBoundsChange(Rect rect)
    {
        mInvalidateShader = true;
    }

    protected boolean onStateChange(int ai[])
    {
        if (mBorderTint != null)
        {
            int i = mBorderTint.getColorForState(ai, mCurrentBorderTintColor);
            if (i != mCurrentBorderTintColor)
            {
                mInvalidateShader = true;
                mCurrentBorderTintColor = i;
            }
        }
        if (mInvalidateShader)
        {
            invalidateSelf();
        }
        return mInvalidateShader;
    }

    public void setAlpha(int i)
    {
        mPaint.setAlpha(i);
        invalidateSelf();
    }

    void setBorderTint(ColorStateList colorstatelist)
    {
        if (colorstatelist != null)
        {
            mCurrentBorderTintColor = colorstatelist.getColorForState(getState(), mCurrentBorderTintColor);
        }
        mBorderTint = colorstatelist;
        mInvalidateShader = true;
        invalidateSelf();
    }

    void setBorderWidth(float f)
    {
        if (mBorderWidth != f)
        {
            mBorderWidth = f;
            mPaint.setStrokeWidth(1.3333F * f);
            mInvalidateShader = true;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
        invalidateSelf();
    }

    void setGradientColors(int i, int j, int k, int l)
    {
        mTopOuterStrokeColor = i;
        mTopInnerStrokeColor = j;
        mBottomOuterStrokeColor = k;
        mBottomInnerStrokeColor = l;
    }

    final void setRotation(float f)
    {
        if (f != mRotation)
        {
            mRotation = f;
            invalidateSelf();
        }
    }
}
