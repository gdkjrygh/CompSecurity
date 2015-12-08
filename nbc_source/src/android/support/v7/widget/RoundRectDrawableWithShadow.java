// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

class RoundRectDrawableWithShadow extends Drawable
{
    static interface RoundRectHelper
    {

        public abstract void drawRoundRect(Canvas canvas, RectF rectf, float f, Paint paint);
    }


    static final double COS_45 = Math.cos(Math.toRadians(45D));
    static RoundRectHelper sRoundRectHelper;
    private boolean mAddPaddingForCorners;
    final RectF mCardBounds = new RectF();
    float mCornerRadius;
    Paint mCornerShadowPaint;
    Path mCornerShadowPath;
    private boolean mDirty;
    Paint mEdgeShadowPaint;
    final int mInsetShadow;
    float mMaxShadowSize;
    Paint mPaint;
    private boolean mPrintedShadowClipWarning;
    float mRawMaxShadowSize;
    float mRawShadowSize;
    private final int mShadowEndColor;
    float mShadowSize;
    private final int mShadowStartColor;

    RoundRectDrawableWithShadow(Resources resources, int i, float f, float f1, float f2)
    {
        mDirty = true;
        mAddPaddingForCorners = true;
        mPrintedShadowClipWarning = false;
        mShadowStartColor = resources.getColor(android.support.v7.cardview.R.color.cardview_shadow_start_color);
        mShadowEndColor = resources.getColor(android.support.v7.cardview.R.color.cardview_shadow_end_color);
        mInsetShadow = resources.getDimensionPixelSize(android.support.v7.cardview.R.dimen.cardview_compat_inset_shadow);
        mPaint = new Paint(5);
        mPaint.setColor(i);
        mCornerShadowPaint = new Paint(5);
        mCornerShadowPaint.setStyle(android.graphics.Paint.Style.FILL);
        mCornerRadius = (int)(0.5F + f);
        mEdgeShadowPaint = new Paint(mCornerShadowPaint);
        mEdgeShadowPaint.setAntiAlias(false);
        setShadowSize(f1, f2);
    }

    private void buildComponents(Rect rect)
    {
        float f = mRawMaxShadowSize * 1.5F;
        mCardBounds.set((float)rect.left + mRawMaxShadowSize, (float)rect.top + f, (float)rect.right - mRawMaxShadowSize, (float)rect.bottom - f);
        buildShadowCorners();
    }

    private void buildShadowCorners()
    {
        Object obj = new RectF(-mCornerRadius, -mCornerRadius, mCornerRadius, mCornerRadius);
        Object obj1 = new RectF(((RectF) (obj)));
        ((RectF) (obj1)).inset(-mShadowSize, -mShadowSize);
        float f;
        float f1;
        float f2;
        float f3;
        int i;
        int j;
        int k;
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
        mCornerShadowPath.arcTo(((RectF) (obj1)), 180F, 90F, false);
        mCornerShadowPath.arcTo(((RectF) (obj)), 270F, -90F, false);
        mCornerShadowPath.close();
        f = mCornerRadius / (mCornerRadius + mShadowSize);
        obj = mCornerShadowPaint;
        f1 = mCornerRadius;
        f2 = mShadowSize;
        i = mShadowStartColor;
        j = mShadowStartColor;
        k = mShadowEndColor;
        obj1 = android.graphics.Shader.TileMode.CLAMP;
        ((Paint) (obj)).setShader(new RadialGradient(0.0F, 0.0F, f1 + f2, new int[] {
            i, j, k
        }, new float[] {
            0.0F, f, 1.0F
        }, ((android.graphics.Shader.TileMode) (obj1))));
        obj = mEdgeShadowPaint;
        f = -mCornerRadius;
        f1 = mShadowSize;
        f2 = -mCornerRadius;
        f3 = mShadowSize;
        i = mShadowStartColor;
        j = mShadowStartColor;
        k = mShadowEndColor;
        obj1 = android.graphics.Shader.TileMode.CLAMP;
        ((Paint) (obj)).setShader(new LinearGradient(0.0F, f + f1, 0.0F, f2 - f3, new int[] {
            i, j, k
        }, new float[] {
            0.0F, 0.5F, 1.0F
        }, ((android.graphics.Shader.TileMode) (obj1))));
        mEdgeShadowPaint.setAntiAlias(false);
    }

    static float calculateHorizontalPadding(float f, float f1, boolean flag)
    {
        float f2 = f;
        if (flag)
        {
            f2 = (float)((double)f + (1.0D - COS_45) * (double)f1);
        }
        return f2;
    }

    static float calculateVerticalPadding(float f, float f1, boolean flag)
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
        float f = -mCornerRadius - mShadowSize;
        float f1 = mCornerRadius + (float)mInsetShadow + mRawShadowSize / 2.0F;
        int i;
        boolean flag;
        int j;
        if (mCardBounds.width() - 2.0F * f1 > 0.0F)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (mCardBounds.height() - 2.0F * f1 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = canvas.save();
        canvas.translate(mCardBounds.left + f1, mCardBounds.top + f1);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (i != 0)
        {
            canvas.drawRect(0.0F, f, mCardBounds.width() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
        }
        canvas.restoreToCount(j);
        j = canvas.save();
        canvas.translate(mCardBounds.right - f1, mCardBounds.bottom - f1);
        canvas.rotate(180F);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (i != 0)
        {
            float f2 = mCardBounds.width();
            float f3 = -mCornerRadius;
            canvas.drawRect(0.0F, f, f2 - 2.0F * f1, mShadowSize + f3, mEdgeShadowPaint);
        }
        canvas.restoreToCount(j);
        i = canvas.save();
        canvas.translate(mCardBounds.left + f1, mCardBounds.bottom - f1);
        canvas.rotate(270F);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (flag)
        {
            canvas.drawRect(0.0F, f, mCardBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
        }
        canvas.restoreToCount(i);
        i = canvas.save();
        canvas.translate(mCardBounds.right - f1, mCardBounds.top + f1);
        canvas.rotate(90F);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (flag)
        {
            canvas.drawRect(0.0F, f, mCardBounds.height() - 2.0F * f1, -mCornerRadius, mEdgeShadowPaint);
        }
        canvas.restoreToCount(i);
    }

    private int toEven(float f)
    {
        int j = (int)(0.5F + f);
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
        canvas.translate(0.0F, mRawShadowSize / 2.0F);
        drawShadow(canvas);
        canvas.translate(0.0F, -mRawShadowSize / 2.0F);
        sRoundRectHelper.drawRoundRect(canvas, mCardBounds, mCornerRadius, mPaint);
    }

    float getCornerRadius()
    {
        return mCornerRadius;
    }

    void getMaxShadowAndCornerPadding(Rect rect)
    {
        getPadding(rect);
    }

    float getMaxShadowSize()
    {
        return mRawMaxShadowSize;
    }

    float getMinHeight()
    {
        float f = Math.max(mRawMaxShadowSize, mCornerRadius + (float)mInsetShadow + (mRawMaxShadowSize * 1.5F) / 2.0F);
        return (mRawMaxShadowSize * 1.5F + (float)mInsetShadow) * 2.0F + 2.0F * f;
    }

    float getMinWidth()
    {
        float f = Math.max(mRawMaxShadowSize, mCornerRadius + (float)mInsetShadow + mRawMaxShadowSize / 2.0F);
        return (mRawMaxShadowSize + (float)mInsetShadow) * 2.0F + 2.0F * f;
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

    float getShadowSize()
    {
        return mRawShadowSize;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        mDirty = true;
    }

    public void setAddPaddingForCorners(boolean flag)
    {
        mAddPaddingForCorners = flag;
        invalidateSelf();
    }

    public void setAlpha(int i)
    {
        mPaint.setAlpha(i);
        mCornerShadowPaint.setAlpha(i);
        mEdgeShadowPaint.setAlpha(i);
    }

    public void setColor(int i)
    {
        mPaint.setColor(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
        mCornerShadowPaint.setColorFilter(colorfilter);
        mEdgeShadowPaint.setColorFilter(colorfilter);
    }

    void setCornerRadius(float f)
    {
        f = (int)(0.5F + f);
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

    void setMaxShadowSize(float f)
    {
        setShadowSize(mRawShadowSize, f);
    }

    void setShadowSize(float f)
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
        float f3 = toEven(f1);
        f = f2;
        if (f2 > f3)
        {
            f1 = f3;
            f = f1;
            if (!mPrintedShadowClipWarning)
            {
                mPrintedShadowClipWarning = true;
                f = f1;
            }
        }
        if (mRawShadowSize == f && mRawMaxShadowSize == f3)
        {
            return;
        } else
        {
            mRawShadowSize = f;
            mRawMaxShadowSize = f3;
            mShadowSize = (int)(1.5F * f + (float)mInsetShadow + 0.5F);
            mMaxShadowSize = (float)mInsetShadow + f3;
            mDirty = true;
            invalidateSelf();
            return;
        }
    }

}
