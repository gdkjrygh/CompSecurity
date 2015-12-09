// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

// Referenced classes of package com.google.android.play.image:
//            BitmapTransformation

public final class AvatarCropTransformation
    implements BitmapTransformation
{

    private static AvatarCropTransformation sInstanceNoRing;
    private static AvatarCropTransformation sInstanceWithRing;
    private final Paint mCropPaint = new Paint(2);
    private final int mDecorationThresholdMax;
    private final int mDecorationThresholdMin;
    private final Paint mDefaultOutlinePaint = new Paint();
    private final Paint mDefaultRingPaint = new Paint();
    private final Rect mDestinationRectangle = new Rect();
    private final boolean mDrawRingAboveThreshold;
    private final float mDropShadowSizeMax;
    private final float mDropShadowSizeMin;
    private final Paint mFillToSizePaint = new Paint();
    private final int mFocusedOutlineColor;
    private boolean mForceFill;
    private final Paint mHighlightOutlinePaint = new Paint();
    private final Paint mPressedFillPaint = new Paint();
    private final int mPressedOutlineColor;
    private final RectF mRectangle = new RectF();
    private final Paint mResizePaint = new Paint(2);
    private final int mRingSizeMax;
    private final int mRingSizeMin;
    private final Rect mSourceRectangle = new Rect();

    private AvatarCropTransformation(Resources resources, boolean flag)
    {
        mForceFill = false;
        mDecorationThresholdMin = resources.getDimensionPixelSize(0x7f0c02aa);
        mDecorationThresholdMax = resources.getDimensionPixelSize(0x7f0c02a9);
        mRingSizeMin = resources.getDimensionPixelSize(0x7f0c02af);
        mRingSizeMax = resources.getDimensionPixelSize(0x7f0c02ae);
        mDropShadowSizeMin = (float)resources.getDimensionPixelSize(0x7f0c02ac) * 0.5F;
        mDropShadowSizeMax = (float)resources.getDimensionPixelSize(0x7f0c02ab) * 0.5F;
        int i = resources.getColor(0x7f0b0235);
        int j = resources.getColor(0x7f0b0292);
        float f = 0.5F * (float)resources.getDimensionPixelSize(0x7f0c02ad);
        mDefaultOutlinePaint.setColor(i);
        mDefaultOutlinePaint.setStrokeWidth(f);
        mDefaultOutlinePaint.setStyle(android.graphics.Paint.Style.STROKE);
        mDefaultOutlinePaint.setAntiAlias(true);
        mDefaultRingPaint.setColor(j);
        mDefaultRingPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mDefaultRingPaint.setAntiAlias(true);
        mCropPaint.setAntiAlias(true);
        mPressedFillPaint.setColor(resources.getColor(0x7f0b0236));
        mPressedFillPaint.setAntiAlias(true);
        mPressedFillPaint.setStyle(android.graphics.Paint.Style.FILL);
        mPressedOutlineColor = resources.getColor(0x7f0b0237);
        mFocusedOutlineColor = resources.getColor(0x7f0b0234);
        mHighlightOutlinePaint.setAntiAlias(true);
        mHighlightOutlinePaint.setStrokeWidth(f);
        mHighlightOutlinePaint.setStyle(android.graphics.Paint.Style.STROKE);
        mFillToSizePaint.setColor(resources.getColor(0x7f0b0292));
        mFillToSizePaint.setStyle(android.graphics.Paint.Style.FILL);
        mDrawRingAboveThreshold = flag;
    }

    private void drawAvatar(Canvas canvas, int i, float f, float f1, float f2)
    {
        float f3 = mRectangle.left;
        float f4 = mRectangle.right;
        float f5 = mRectangle.top;
        float f6 = mRectangle.bottom;
        mRectangle.left = 0.0F;
        mRectangle.top = 0.0F;
        mRectangle.right = i;
        mRectangle.bottom = i;
        canvas.save();
        canvas.scale(f2, f2);
        canvas.translate(f1, f1);
        canvas.drawRoundRect(mRectangle, f, f, mCropPaint);
        canvas.restore();
        mRectangle.left = f3;
        mRectangle.right = f4;
        mRectangle.top = f5;
        mRectangle.bottom = f6;
    }

    private void drawOutline(Canvas canvas, float f, int i)
    {
        float f1 = mRectangle.left;
        float f2 = mRectangle.right;
        float f3 = mRectangle.top;
        float f4 = mRectangle.bottom;
        mDefaultOutlinePaint.setStrokeWidth(2.0F * f);
        float f5 = mDefaultOutlinePaint.getStrokeWidth() / 2.0F;
        RectF rectf = mRectangle;
        rectf.left = rectf.left + (f5 - f / 3F);
        rectf = mRectangle;
        rectf.top = rectf.top + (f5 + f);
        rectf = mRectangle;
        rectf.right = rectf.right - (f5 - f / 3F);
        rectf = mRectangle;
        rectf.bottom = rectf.bottom - (f5 - f);
        mDefaultOutlinePaint.setColor(i);
        canvas.drawOval(mRectangle, mDefaultOutlinePaint);
        mRectangle.left = f1;
        mRectangle.right = f2;
        mRectangle.top = f3;
        mRectangle.bottom = f4;
    }

    private float getDropShadowSize(int i, int j)
    {
        i = Math.max(i, j);
        if (i < mDecorationThresholdMin)
        {
            return 0.0F;
        } else
        {
            return interpolate(mDecorationThresholdMin, mDecorationThresholdMax, mDropShadowSizeMin, mDropShadowSizeMax, i);
        }
    }

    public static AvatarCropTransformation getFullAvatarCrop(Resources resources)
    {
        com/google/android/play/image/AvatarCropTransformation;
        JVM INSTR monitorenter ;
        if (sInstanceWithRing == null)
        {
            sInstanceWithRing = new AvatarCropTransformation(resources, true);
        }
        resources = sInstanceWithRing;
        com/google/android/play/image/AvatarCropTransformation;
        JVM INSTR monitorexit ;
        return resources;
        resources;
        throw resources;
    }

    public static AvatarCropTransformation getNoRingAvatarCrop(Resources resources)
    {
        com/google/android/play/image/AvatarCropTransformation;
        JVM INSTR monitorenter ;
        if (sInstanceNoRing == null)
        {
            sInstanceNoRing = new AvatarCropTransformation(resources, false);
        }
        resources = sInstanceNoRing;
        com/google/android/play/image/AvatarCropTransformation;
        JVM INSTR monitorexit ;
        return resources;
        resources;
        throw resources;
    }

    private float getRingOutlineSize(int i, int j)
    {
        i = Math.max(i, j);
        return interpolate(mDecorationThresholdMin, mDecorationThresholdMax, mRingSizeMin, mRingSizeMax, i);
    }

    private static float interpolate(float f, float f1, float f2, float f3, float f4)
    {
        if (f4 > f)
        {
            if (f4 >= f1)
            {
                return f3;
            }
            if (f != f1)
            {
                return f2 + ((f4 - f) * (f3 - f2)) / (f1 - f);
            }
        }
        return f2;
    }

    public final void drawFocusedOverlay(Canvas canvas, int i, int j)
    {
        float f = getDropShadowSize(i, j);
        i = (int)((float)i - f);
        j = (int)((float)j - f);
        canvas.save();
        canvas.translate(f / 2.0F, 0.0F);
        f = Math.min((float)i / 2.0F, (float)j / 2.0F);
        float f1 = mHighlightOutlinePaint.getStrokeWidth();
        mHighlightOutlinePaint.setColor(mFocusedOutlineColor);
        canvas.drawCircle(f, f, f - f1 / 2.0F, mHighlightOutlinePaint);
        canvas.restore();
    }

    public final void drawPressedOverlay(Canvas canvas, int i, int j)
    {
        float f = getDropShadowSize(i, j);
        i = (int)((float)i - f);
        j = (int)((float)j - f);
        canvas.save();
        canvas.translate(f / 2.0F, 0.0F);
        f = Math.min((float)i / 2.0F, (float)j / 2.0F);
        canvas.drawCircle(f, f, f, mPressedFillPaint);
        float f1 = mHighlightOutlinePaint.getStrokeWidth();
        mHighlightOutlinePaint.setColor(mPressedOutlineColor);
        canvas.drawCircle(f, f, f - f1 / 2.0F, mHighlightOutlinePaint);
        canvas.restore();
    }

    public final int getTransformationInset(int i, int j)
    {
        if (Math.max(i, j) < mDecorationThresholdMin)
        {
            return 0;
        } else
        {
            return (int)(2.0F * getRingOutlineSize(i, j) + getDropShadowSize(i, j));
        }
    }

    public final Bitmap transform(Bitmap bitmap, int i, int j)
    {
        if (bitmap == null)
        {
            return null;
        }
        int l = Math.max(i, j);
        float f;
        float f3;
        float f4;
        Object obj;
        int k;
        boolean flag;
        int i1;
        int j1;
        int l1;
        int j2;
        if (l >= mDecorationThresholdMin)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mDrawRingAboveThreshold)
        {
            f = getRingOutlineSize(i, j);
        } else
        {
            f = 0.0F;
        }
        f3 = getDropShadowSize(i, j);
        i1 = (int)interpolate(mDecorationThresholdMin, mDecorationThresholdMax, 48F, 64F, l);
        j1 = getTransformationInset(i, j);
        if (bitmap == null)
        {
            k = i;
        } else
        {
            k = bitmap.getWidth();
        }
        if (bitmap != null)
        {
            j = bitmap.getHeight();
        }
        l1 = Math.max(k, j);
        j2 = Math.min(k, j);
        if (Math.abs(k - j) > 1 || l1 < l - j1 || j2 > l)
        {
            obj = Bitmap.createBitmap(l, l, android.graphics.Bitmap.Config.ARGB_8888);
            Object obj1 = new Canvas(((Bitmap) (obj)));
            ((Canvas) (obj1)).drawRect(0.0F, 0.0F, l, l, mFillToSizePaint);
            if (bitmap != null)
            {
                mSourceRectangle.set(0, 0, k, j);
                float f1 = (float)l / (float)Math.max(k, j);
                k = (int)((float)k * f1);
                j = (int)((float)j * f1);
                int k1 = (l - k) / 2;
                int i2 = (l - j) / 2;
                mDestinationRectangle.set(k1, i2, k1 + k, i2 + j);
                ((Canvas) (obj1)).drawBitmap(bitmap, mSourceRectangle, mDestinationRectangle, mResizePaint);
            }
            bitmap = ((Bitmap) (obj));
            float f2;
            float f5;
            if (obj == null)
            {
                j = i;
            } else
            {
                j = bitmap.getWidth();
            }
        } else
        {
            j = k;
        }
        bitmap = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        mCropPaint.setShader(bitmap);
        bitmap = Bitmap.createBitmap(l, l, android.graphics.Bitmap.Config.ARGB_8888);
        obj = new Canvas(bitmap);
        f4 = (float)l / 2.0F;
        f2 = 1.0F;
        if (flag)
        {
            f2 = 1.0F + f3;
            ((Canvas) (obj)).translate(f3 / 2.0F, 0.0F);
        }
        mRectangle.set(0.0F, 0.0F, (float)i - f2, (float)i - f2);
        if (flag)
        {
            drawOutline(((Canvas) (obj)), f3, i1 << 24);
            drawAvatar(((Canvas) (obj)), j, f4, f, ((float)l - f3 - Math.max(1.0F, 2.0F * f)) / (float)j);
            if (mDrawRingAboveThreshold)
            {
                f2 = mRectangle.left;
                f3 = mRectangle.right;
                f4 = mRectangle.top;
                f5 = mRectangle.bottom;
                mDefaultRingPaint.setStrokeWidth(f);
                f /= 2.0F;
                obj1 = mRectangle;
                obj1.left = ((RectF) (obj1)).left + f;
                obj1 = mRectangle;
                obj1.top = ((RectF) (obj1)).top + f;
                obj1 = mRectangle;
                obj1.right = ((RectF) (obj1)).right - f;
                obj1 = mRectangle;
                obj1.bottom = ((RectF) (obj1)).bottom - f;
                ((Canvas) (obj)).drawOval(mRectangle, mDefaultRingPaint);
                mRectangle.left = f2;
                mRectangle.right = f3;
                mRectangle.top = f4;
                mRectangle.bottom = f5;
            }
        } else
        {
            drawAvatar(((Canvas) (obj)), j, f4, 0.0F, 1.0F);
            drawOutline(((Canvas) (obj)), 0.0F, 0);
        }
        mCropPaint.setShader(null);
        return bitmap;
    }
}
