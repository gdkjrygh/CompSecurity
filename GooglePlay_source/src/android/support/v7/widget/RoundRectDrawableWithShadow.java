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

final class RoundRectDrawableWithShadow extends Drawable
{
    static interface RoundRectHelper
    {

        public abstract void drawRoundRect(Canvas canvas, RectF rectf, float f, Paint paint);
    }


    static final double COS_45 = Math.cos(Math.toRadians(45D));
    static RoundRectHelper sRoundRectHelper;
    boolean mAddPaddingForCorners;
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
        mShadowStartColor = resources.getColor(0x7f0b001e);
        mShadowEndColor = resources.getColor(0x7f0b001d);
        mInsetShadow = resources.getDimensionPixelSize(0x7f0c0047);
        mPaint = new Paint(5);
        mPaint.setColor(i);
        mCornerShadowPaint = new Paint(5);
        mCornerShadowPaint.setStyle(android.graphics.Paint.Style.FILL);
        mCornerRadius = (int)(f + 0.5F);
        mEdgeShadowPaint = new Paint(mCornerShadowPaint);
        mEdgeShadowPaint.setAntiAlias(false);
        if (f1 < 0.0F || f2 < 0.0F)
        {
            throw new IllegalArgumentException("invalid shadow size");
        }
        f1 = toEven(f1);
        f2 = toEven(f2);
        f = f1;
        if (f1 > f2)
        {
            if (!mPrintedShadowClipWarning)
            {
                mPrintedShadowClipWarning = true;
            }
            f = f2;
        }
        if (mRawShadowSize != f || mRawMaxShadowSize != f2)
        {
            mRawShadowSize = f;
            mRawMaxShadowSize = f2;
            mShadowSize = (int)(f * 1.5F + (float)mInsetShadow + 0.5F);
            mMaxShadowSize = (float)mInsetShadow + f2;
            mDirty = true;
            invalidateSelf();
        }
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

    private static int toEven(float f)
    {
        int j = (int)(0.5F + f);
        int i = j;
        if (j % 2 == 1)
        {
            i = j - 1;
        }
        return i;
    }

    public final void draw(Canvas canvas)
    {
        boolean flag = true;
        int i;
        if (mDirty)
        {
            Object obj = getBounds();
            float f = mRawMaxShadowSize * 1.5F;
            mCardBounds.set((float)((Rect) (obj)).left + mRawMaxShadowSize, (float)((Rect) (obj)).top + f, (float)((Rect) (obj)).right - mRawMaxShadowSize, (float)((Rect) (obj)).bottom - f);
            obj = new RectF(-mCornerRadius, -mCornerRadius, mCornerRadius, mCornerRadius);
            Object obj1 = new RectF(((RectF) (obj)));
            ((RectF) (obj1)).inset(-mShadowSize, -mShadowSize);
            float f1;
            float f2;
            float f3;
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
            mDirty = false;
        }
        canvas.translate(0.0F, mRawShadowSize / 2.0F);
        f = -mCornerRadius - mShadowSize;
        f1 = mCornerRadius + (float)mInsetShadow + mRawShadowSize / 2.0F;
        if (mCardBounds.width() - 2.0F * f1 > 0.0F)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (mCardBounds.height() - 2.0F * f1 <= 0.0F)
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
            f2 = mCardBounds.width();
            f3 = -mCornerRadius;
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
        canvas.translate(0.0F, -mRawShadowSize / 2.0F);
        sRoundRectHelper.drawRoundRect(canvas, mCardBounds, mCornerRadius, mPaint);
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final boolean getPadding(Rect rect)
    {
        int i = (int)Math.ceil(calculateVerticalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
        int j = (int)Math.ceil(calculateHorizontalPadding(mRawMaxShadowSize, mCornerRadius, mAddPaddingForCorners));
        rect.set(j, i, j, i);
        return true;
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        mDirty = true;
    }

    public final void setAlpha(int i)
    {
        mPaint.setAlpha(i);
        mCornerShadowPaint.setAlpha(i);
        mEdgeShadowPaint.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
        mCornerShadowPaint.setColorFilter(colorfilter);
        mEdgeShadowPaint.setColorFilter(colorfilter);
    }

}
