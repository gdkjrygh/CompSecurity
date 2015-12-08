// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawableWrapper;

class ShadowDrawableWrapper extends DrawableWrapper
{

    static final double COS_45 = Math.cos(Math.toRadians(45D));
    static final float SHADOW_BOTTOM_SCALE = 1F;
    static final float SHADOW_HORIZ_SCALE = 0.5F;
    static final float SHADOW_MULTIPLIER = 1.5F;
    static final float SHADOW_TOP_SCALE = 0.25F;
    private boolean mAddPaddingForCorners;
    final RectF mContentBounds = new RectF();
    float mCornerRadius;
    final Paint mCornerShadowPaint = new Paint(5);
    Path mCornerShadowPath;
    private boolean mDirty;
    final Paint mEdgeShadowPaint;
    float mMaxShadowSize;
    private boolean mPrintedShadowClipWarning;
    float mRawMaxShadowSize;
    float mRawShadowSize;
    private float mRotation;
    private final int mShadowEndColor;
    private final int mShadowMiddleColor;
    float mShadowSize;
    private final int mShadowStartColor;

    public ShadowDrawableWrapper(Resources resources, Drawable drawable, float f, float f1, float f2)
    {
        super(drawable);
        mDirty = true;
        mAddPaddingForCorners = true;
        mPrintedShadowClipWarning = false;
        mShadowStartColor = resources.getColor(android.support.design.R.color.design_fab_shadow_start_color);
        mShadowMiddleColor = resources.getColor(android.support.design.R.color.design_fab_shadow_mid_color);
        mShadowEndColor = resources.getColor(android.support.design.R.color.design_fab_shadow_end_color);
        mCornerShadowPaint.setStyle(android.graphics.Paint.Style.FILL);
        mCornerRadius = Math.round(f);
        mEdgeShadowPaint = new Paint(mCornerShadowPaint);
        mEdgeShadowPaint.setAntiAlias(false);
        setShadowSize(f1, f2);
    }

    private void buildComponents(Rect rect)
    {
        float f = mRawMaxShadowSize * 1.5F;
        mContentBounds.set((float)rect.left + mRawMaxShadowSize, (float)rect.top + f, (float)rect.right - mRawMaxShadowSize, (float)rect.bottom - f);
        getWrappedDrawable().setBounds((int)mContentBounds.left, (int)mContentBounds.top, (int)mContentBounds.right, (int)mContentBounds.bottom);
        buildShadowCorners();
    }

    private void buildShadowCorners()
    {
        Object obj = new RectF(-mCornerRadius, -mCornerRadius, mCornerRadius, mCornerRadius);
        RectF rectf = new RectF(((RectF) (obj)));
        rectf.inset(-mShadowSize, -mShadowSize);
        float f;
        float f2;
        Paint paint1;
        int j;
        int l;
        int j1;
        if (mCornerShadowPath == null)
        {
            mCornerShadowPath = new Path();
        } else
        {
            mCornerShadowPath.reset();
        }
        mCornerShadowPath.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        mCornerShadowPath.moveTo(-mCornerRadius, 0.0F);
        mCornerShadowPath.rLineTo(-mShadowSize, 0.0F);
        mCornerShadowPath.arcTo(rectf, 180F, 90F, false);
        mCornerShadowPath.arcTo(((RectF) (obj)), 270F, -90F, false);
        mCornerShadowPath.close();
        f = -rectf.top;
        if (f > 0.0F)
        {
            float f1 = mCornerRadius / f;
            float f3 = (1.0F - f1) / 2.0F;
            Paint paint = mCornerShadowPaint;
            int i = mShadowStartColor;
            int k = mShadowMiddleColor;
            int i1 = mShadowEndColor;
            android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
            paint.setShader(new RadialGradient(0.0F, 0.0F, f, new int[] {
                0, i, k, i1
            }, new float[] {
                0.0F, f1, f1 + f3, 1.0F
            }, tilemode));
        }
        paint1 = mEdgeShadowPaint;
        f = ((RectF) (obj)).top;
        f2 = rectf.top;
        j = mShadowStartColor;
        l = mShadowMiddleColor;
        j1 = mShadowEndColor;
        obj = android.graphics.Shader.TileMode.CLAMP;
        paint1.setShader(new LinearGradient(0.0F, f, 0.0F, f2, new int[] {
            j, l, j1
        }, new float[] {
            0.0F, 0.5F, 1.0F
        }, ((android.graphics.Shader.TileMode) (obj))));
        mEdgeShadowPaint.setAntiAlias(false);
    }

    public static float calculateHorizontalPadding(float f, float f1, boolean flag)
    {
        float f2 = f;
        if (flag)
        {
            f2 = (float)((double)f + (1.0D - COS_45) * (double)f1);
        }
        return f2;
    }

    public static float calculateVerticalPadding(float f, float f1, boolean flag)
    {
        if (flag)
        {
            return (float)((double)(1.5F * f) + (1.0D - COS_45) * (double)f1);
        } else
        {
            return 1.5F * f;
        }
    }

    private void drawShadow(Canvas canvas)
    {
        int j = canvas.save();
        canvas.rotate(mRotation, mContentBounds.centerX(), mContentBounds.centerY());
        float f = -mCornerRadius - mShadowSize;
        float f1 = mCornerRadius;
        float f2;
        float f3;
        float f4;
        float f6;
        float f7;
        float f9;
        int i;
        boolean flag;
        int k;
        if (mContentBounds.width() - 2.0F * f1 > 0.0F)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (mContentBounds.height() - 2.0F * f1 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f6 = mRawShadowSize;
        f7 = mRawShadowSize;
        f2 = mRawShadowSize;
        f9 = mRawShadowSize;
        f3 = mRawShadowSize;
        f4 = mRawShadowSize;
        f2 = f1 / ((f2 - f9 * 0.5F) + f1);
        f6 = f1 / ((f6 - f7 * 0.25F) + f1);
        f3 = f1 / (f1 + (f3 - f4 * 1.0F));
        k = canvas.save();
        canvas.translate(mContentBounds.left + f1, mContentBounds.top + f1);
        canvas.scale(f2, f6);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (i != 0)
        {
            canvas.scale(1.0F / f2, 1.0F);
            canvas.drawRect(0.0F, f, mContentBounds.width() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
        }
        canvas.restoreToCount(k);
        k = canvas.save();
        canvas.translate(mContentBounds.right - f1, mContentBounds.bottom - f1);
        canvas.scale(f2, f3);
        canvas.rotate(180F);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (i != 0)
        {
            canvas.scale(1.0F / f2, 1.0F);
            float f5 = mContentBounds.width();
            float f8 = -mCornerRadius;
            canvas.drawRect(0.0F, f, f5 - 2.0F * f1, mShadowSize + f8, mEdgeShadowPaint);
        }
        canvas.restoreToCount(k);
        i = canvas.save();
        canvas.translate(mContentBounds.left + f1, mContentBounds.bottom - f1);
        canvas.scale(f2, f3);
        canvas.rotate(270F);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (flag)
        {
            canvas.scale(1.0F / f3, 1.0F);
            canvas.drawRect(0.0F, f, mContentBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
        }
        canvas.restoreToCount(i);
        i = canvas.save();
        canvas.translate(mContentBounds.right - f1, mContentBounds.top + f1);
        canvas.scale(f2, f6);
        canvas.rotate(90F);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (flag)
        {
            canvas.scale(1.0F / f6, 1.0F);
            canvas.drawRect(0.0F, f, mContentBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
        }
        canvas.restoreToCount(i);
        canvas.restoreToCount(j);
    }

    private static int toEven(float f)
    {
        int j = Math.round(f);
        int i = j;
        if (j % 2 == 1)
        {
            i = j - 1;
        }
        return i;
    }

    public void draw(Canvas canvas)
    {
        if (mDirty)
        {
            buildComponents(getBounds());
            mDirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public float getCornerRadius()
    {
        return mCornerRadius;
    }

    public float getMaxShadowSize()
    {
        return mRawMaxShadowSize;
    }

    public float getMinHeight()
    {
        return Math.max(mRawMaxShadowSize, mCornerRadius + (mRawMaxShadowSize * 1.5F) / 2.0F) * 2.0F + mRawMaxShadowSize * 1.5F * 2.0F;
    }

    public float getMinWidth()
    {
        return Math.max(mRawMaxShadowSize, mCornerRadius + mRawMaxShadowSize / 2.0F) * 2.0F + mRawMaxShadowSize * 2.0F;
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean getPadding(Rect rect)
    {
        int i = (int)Math.ceil(calculateVerticalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
        int j = (int)Math.ceil(calculateHorizontalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
        rect.set(j, i, j, i);
        return true;
    }

    public float getShadowSize()
    {
        return mRawShadowSize;
    }

    protected void onBoundsChange(Rect rect)
    {
        mDirty = true;
    }

    public void setAddPaddingForCorners(boolean flag)
    {
        mAddPaddingForCorners = flag;
        invalidateSelf();
    }

    public void setAlpha(int i)
    {
        super.setAlpha(i);
        mCornerShadowPaint.setAlpha(i);
        mEdgeShadowPaint.setAlpha(i);
    }

    public void setCornerRadius(float f)
    {
        f = Math.round(f);
        if (mCornerRadius == f)
        {
            return;
        } else
        {
            mCornerRadius = f;
            mDirty = true;
            invalidateSelf();
            return;
        }
    }

    public void setMaxShadowSize(float f)
    {
        setShadowSize(mRawShadowSize, f);
    }

    final void setRotation(float f)
    {
        if (mRotation != f)
        {
            mRotation = f;
            invalidateSelf();
        }
    }

    public void setShadowSize(float f)
    {
        setShadowSize(f, mRawMaxShadowSize);
    }

    void setShadowSize(float f, float f1)
    {
        if (f < 0.0F || f1 < 0.0F)
        {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float f2 = toEven(f);
        f1 = toEven(f1);
        f = f2;
        if (f2 > f1)
        {
            if (!mPrintedShadowClipWarning)
            {
                mPrintedShadowClipWarning = true;
            }
            f = f1;
        }
        if (mRawShadowSize == f && mRawMaxShadowSize == f1)
        {
            return;
        } else
        {
            mRawShadowSize = f;
            mRawMaxShadowSize = f1;
            mShadowSize = Math.round(f * 1.5F);
            mMaxShadowSize = f1;
            mDirty = true;
            invalidateSelf();
            return;
        }
    }

}
