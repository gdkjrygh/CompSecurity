// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.cardview;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;

// Referenced classes of package com.google.android.play.cardview:
//            CardViewBackgroundDrawable

public final class RoundRectDrawableWithShadow extends CardViewBackgroundDrawable
{

    private static RectF sCornerRect;
    private final RectF mCardBounds = new RectF();
    private Paint mCornerShadowPaint;
    private Path mCornerShadowPath;
    private boolean mDirty;
    private Paint mEdgeShadowPaint;
    private float mRawShadowSize;
    private final int mShadowEndColor;
    private float mShadowSize;
    private final int mShadowStartColor;

    public RoundRectDrawableWithShadow(Resources resources, ColorStateList colorstatelist, float f, float f1, float f2)
    {
        super(colorstatelist, f, f2);
        mDirty = true;
        mShadowStartColor = resources.getColor(0x7f0b0240);
        mShadowEndColor = resources.getColor(0x7f0b023f);
        if (f1 < 0.0F)
        {
            throw new IllegalArgumentException("invalid shadow size");
        }
        if (mRawShadowSize != f1)
        {
            mRawShadowSize = f1;
            mShadowSize = 1.5F * f1;
            mDirty = true;
            invalidateSelf();
        }
        mCornerShadowPaint = new Paint(5);
        mCornerShadowPaint.setStyle(android.graphics.Paint.Style.FILL);
        mCornerShadowPaint.setDither(true);
        mEdgeShadowPaint = new Paint(mCornerShadowPaint);
    }

    public final void draw(Canvas canvas)
    {
        int j;
        boolean flag;
        if (mDirty)
        {
            Object obj = getBounds();
            mCardBounds.set(((Rect) (obj)));
            mCardBounds.inset(mInset, mInset);
            obj = new RectF(-mCornerRadius, -mCornerRadius, mCornerRadius, mCornerRadius);
            Object obj1 = new RectF(((RectF) (obj)));
            ((RectF) (obj1)).inset(-mShadowSize, -mShadowSize);
            float f;
            float f3;
            float f6;
            float f8;
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
            mCornerShadowPath.arcTo(((RectF) (obj1)), 180F, 90F, false);
            mCornerShadowPath.arcTo(((RectF) (obj)), 270F, -90F, false);
            mCornerShadowPath.close();
            f = mCornerRadius / (mCornerRadius + mShadowSize);
            if (mCornerRadius + mShadowSize > 0.0F)
            {
                obj = mCornerShadowPaint;
                float f2 = mCornerRadius;
                float f5 = mShadowSize;
                int i = mShadowStartColor;
                int k = mShadowStartColor;
                int i1 = mShadowEndColor;
                obj1 = android.graphics.Shader.TileMode.CLAMP;
                ((Paint) (obj)).setShader(new RadialGradient(0.0F, 0.0F, f2 + f5, new int[] {
                    i, k, i1
                }, new float[] {
                    0.0F, f, 1.0F
                }, ((android.graphics.Shader.TileMode) (obj1))));
            }
            obj = mEdgeShadowPaint;
            f = -mCornerRadius;
            f3 = mShadowSize;
            f6 = -mCornerRadius;
            f8 = mShadowSize;
            j = mShadowStartColor;
            l = mShadowStartColor;
            j1 = mShadowEndColor;
            obj1 = android.graphics.Shader.TileMode.CLAMP;
            ((Paint) (obj)).setShader(new LinearGradient(0.0F, f + f3, 0.0F, f6 - f8, new int[] {
                j, l, j1
            }, new float[] {
                0.0F, 0.5F, 1.0F
            }, ((android.graphics.Shader.TileMode) (obj1))));
            mDirty = false;
        }
        canvas.translate(0.0F, mRawShadowSize / 2.0F);
        f = -mCornerRadius - mShadowSize;
        f3 = mCornerRadius + mRawShadowSize / 2.0F;
        if (mCardBounds.width() - 2.0F * f3 > 0.0F)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (mCardBounds.height() - 2.0F * f3 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = canvas.save();
        canvas.translate(mCardBounds.left + f3, mCardBounds.top + f3);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (j != 0)
        {
            canvas.drawRect(0.0F, f, mCardBounds.width() - 2.0F * f3, -mCornerRadius, mEdgeShadowPaint);
        }
        canvas.restoreToCount(j1);
        j1 = canvas.save();
        canvas.translate(mCardBounds.right - f3, mCardBounds.bottom - f3);
        canvas.rotate(180F);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (j != 0)
        {
            f6 = mCardBounds.width();
            f8 = -mCornerRadius;
            canvas.drawRect(0.0F, f, f6 - 2.0F * f3, mShadowSize + f8, mEdgeShadowPaint);
        }
        canvas.restoreToCount(j1);
        j = canvas.save();
        canvas.translate(mCardBounds.left + f3, mCardBounds.bottom - f3);
        canvas.rotate(270F);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (flag)
        {
            canvas.drawRect(0.0F, f, mCardBounds.height() - 2.0F * f3, -mCornerRadius, mEdgeShadowPaint);
        }
        canvas.restoreToCount(j);
        j = canvas.save();
        canvas.translate(mCardBounds.right - f3, mCardBounds.top + f3);
        canvas.rotate(90F);
        canvas.drawPath(mCornerShadowPath, mCornerShadowPaint);
        if (flag)
        {
            canvas.drawRect(0.0F, f, mCardBounds.height() - 2.0F * f3, -mCornerRadius, mEdgeShadowPaint);
        }
        canvas.restoreToCount(j);
        canvas.translate(0.0F, -mRawShadowSize / 2.0F);
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            canvas.drawRoundRect(mCardBounds, mCornerRadius, mCornerRadius, mPaint);
            return;
        }
        if (sCornerRect == null)
        {
            sCornerRect = new RectF();
        }
        float f1 = mCornerRadius * 2.0F;
        float f4 = mCardBounds.width() - f1;
        float f7 = mCardBounds.height();
        sCornerRect.set(mCardBounds.left, mCardBounds.top, mCardBounds.left + mCornerRadius * 2.0F, mCardBounds.top + mCornerRadius * 2.0F);
        canvas.drawArc(sCornerRect, 180F, 90F, true, mPaint);
        sCornerRect.offset(f4, 0.0F);
        canvas.drawArc(sCornerRect, 270F, 90F, true, mPaint);
        sCornerRect.offset(0.0F, f7 - f1);
        canvas.drawArc(sCornerRect, 0.0F, 90F, true, mPaint);
        sCornerRect.offset(-f4, 0.0F);
        canvas.drawArc(sCornerRect, 90F, 90F, true, mPaint);
        f1 = mCardBounds.left;
        f4 = mCornerRadius;
        f7 = mCardBounds.top;
        float f9 = mCardBounds.right;
        float f10 = mCornerRadius;
        float f11 = mCardBounds.top;
        canvas.drawRect(f4 + f1, f7, f9 - f10, mCornerRadius + f11, mPaint);
        f1 = mCardBounds.left;
        canvas.drawRect(mCornerRadius + f1, mCardBounds.bottom - mCornerRadius, mCardBounds.right - mCornerRadius, mCardBounds.bottom, mPaint);
        f1 = mCardBounds.left;
        f4 = mCardBounds.top;
        canvas.drawRect(f1, mCornerRadius + f4, mCardBounds.right, mCardBounds.bottom - mCornerRadius, mPaint);
    }

    public final int getOpacity()
    {
        return -1;
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
