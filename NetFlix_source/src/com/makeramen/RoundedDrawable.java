// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.makeramen;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

public class RoundedDrawable extends Drawable
{

    public static final int DEFAULT_BORDER_COLOR = 0xff000000;
    public static final String TAG = "RoundedDrawable";
    private final int mBitmapHeight;
    private final Paint mBitmapPaint = new Paint();
    private final RectF mBitmapRect = new RectF();
    private final BitmapShader mBitmapShader;
    private final int mBitmapWidth;
    private ColorStateList mBorderColor;
    private final Paint mBorderPaint = new Paint();
    private final RectF mBorderRect = new RectF();
    private float mBorderWidth;
    private final RectF mBounds = new RectF();
    private float mCornerRadius;
    private final RectF mDrawableRect = new RectF();
    private boolean mOval;
    private android.widget.ImageView.ScaleType mScaleType;
    private final Matrix mShaderMatrix = new Matrix();

    public RoundedDrawable(Bitmap bitmap)
    {
        mCornerRadius = 0.0F;
        mOval = false;
        mBorderWidth = 0.0F;
        mBorderColor = ColorStateList.valueOf(0xff000000);
        mScaleType = android.widget.ImageView.ScaleType.FIT_CENTER;
        mBitmapWidth = bitmap.getWidth();
        mBitmapHeight = bitmap.getHeight();
        mBitmapRect.set(0.0F, 0.0F, mBitmapWidth, mBitmapHeight);
        mBitmapShader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        mBitmapShader.setLocalMatrix(mShaderMatrix);
        mBitmapPaint.setStyle(android.graphics.Paint.Style.FILL);
        mBitmapPaint.setAntiAlias(true);
        mBitmapPaint.setShader(mBitmapShader);
        mBorderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mBorderPaint.setAntiAlias(true);
        mBorderPaint.setColor(mBorderColor.getColorForState(getState(), 0xff000000));
        mBorderPaint.setStrokeWidth(mBorderWidth);
    }

    public static Bitmap drawableToBitmap(Drawable drawable)
    {
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        int i = Math.max(drawable.getIntrinsicWidth(), 1);
        int j = Math.max(drawable.getIntrinsicHeight(), 1);
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            drawable.printStackTrace();
            return null;
        }
        return bitmap;
    }

    public static RoundedDrawable fromBitmap(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            return new RoundedDrawable(bitmap);
        } else
        {
            return null;
        }
    }

    public static Drawable fromDrawable(Drawable drawable)
    {
        if (drawable == null || (drawable instanceof RoundedDrawable))
        {
            return drawable;
        }
        if (drawable instanceof LayerDrawable)
        {
            drawable = (LayerDrawable)drawable;
            int j = drawable.getNumberOfLayers();
            for (int i = 0; i < j; i++)
            {
                Drawable drawable1 = drawable.getDrawable(i);
                drawable.setDrawableByLayerId(drawable.getId(i), fromDrawable(drawable1));
            }

            return drawable;
        }
        Bitmap bitmap = drawableToBitmap(drawable);
        if (bitmap != null)
        {
            return new RoundedDrawable(bitmap);
        } else
        {
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return drawable;
        }
    }

    private void updateShaderMatrix()
    {
        static class _cls1
        {

            static final int $SwitchMap$android$widget$ImageView$ScaleType[];

            static 
            {
                $SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.ImageView.ScaleType.values().length];
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.android.widget.ImageView.ScaleType[mScaleType.ordinal()];
        JVM INSTR tableswitch 1 7: default 52
    //                   1 155
    //                   2 249
    //                   3 436
    //                   4 52
    //                   5 646
    //                   6 729
    //                   7 812;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6 _L7
_L1:
        mBorderRect.set(mBitmapRect);
        mShaderMatrix.setRectToRect(mBitmapRect, mBounds, android.graphics.Matrix.ScaleToFit.CENTER);
        mShaderMatrix.mapRect(mBorderRect);
        mBorderRect.inset(mBorderWidth / 2.0F, mBorderWidth / 2.0F);
        mShaderMatrix.setRectToRect(mBitmapRect, mBorderRect, android.graphics.Matrix.ScaleToFit.FILL);
_L9:
        mDrawableRect.set(mBorderRect);
        mBitmapShader.setLocalMatrix(mShaderMatrix);
        return;
_L2:
        mBorderRect.set(mBounds);
        mBorderRect.inset(mBorderWidth / 2.0F, mBorderWidth / 2.0F);
        mShaderMatrix.set(null);
        mShaderMatrix.setTranslate((int)((mBorderRect.width() - (float)mBitmapWidth) * 0.5F + 0.5F), (int)((mBorderRect.height() - (float)mBitmapHeight) * 0.5F + 0.5F));
        continue; /* Loop/switch isn't completed */
_L3:
        mBorderRect.set(mBounds);
        mBorderRect.inset(mBorderWidth / 2.0F, mBorderWidth / 2.0F);
        mShaderMatrix.set(null);
        float f = 0.0F;
        float f2 = 0.0F;
        float f4;
        if ((float)mBitmapWidth * mBorderRect.height() > mBorderRect.width() * (float)mBitmapHeight)
        {
            f4 = mBorderRect.height() / (float)mBitmapHeight;
            f = (mBorderRect.width() - (float)mBitmapWidth * f4) * 0.5F;
        } else
        {
            f4 = mBorderRect.width() / (float)mBitmapWidth;
            f2 = (mBorderRect.height() - (float)mBitmapHeight * f4) * 0.5F;
        }
        mShaderMatrix.setScale(f4, f4);
        mShaderMatrix.postTranslate((float)(int)(f + 0.5F) + mBorderWidth, (float)(int)(f2 + 0.5F) + mBorderWidth);
        continue; /* Loop/switch isn't completed */
_L4:
        mShaderMatrix.set(null);
        float f1;
        float f3;
        float f5;
        if ((float)mBitmapWidth <= mBounds.width() && (float)mBitmapHeight <= mBounds.height())
        {
            f1 = 1.0F;
        } else
        {
            f1 = Math.min(mBounds.width() / (float)mBitmapWidth, mBounds.height() / (float)mBitmapHeight);
        }
        f3 = (int)((mBounds.width() - (float)mBitmapWidth * f1) * 0.5F + 0.5F);
        f5 = (int)((mBounds.height() - (float)mBitmapHeight * f1) * 0.5F + 0.5F);
        mShaderMatrix.setScale(f1, f1);
        mShaderMatrix.postTranslate(f3, f5);
        mBorderRect.set(mBitmapRect);
        mShaderMatrix.mapRect(mBorderRect);
        mBorderRect.inset(mBorderWidth / 2.0F, mBorderWidth / 2.0F);
        mShaderMatrix.setRectToRect(mBitmapRect, mBorderRect, android.graphics.Matrix.ScaleToFit.FILL);
        continue; /* Loop/switch isn't completed */
_L5:
        mBorderRect.set(mBitmapRect);
        mShaderMatrix.setRectToRect(mBitmapRect, mBounds, android.graphics.Matrix.ScaleToFit.END);
        mShaderMatrix.mapRect(mBorderRect);
        mBorderRect.inset(mBorderWidth / 2.0F, mBorderWidth / 2.0F);
        mShaderMatrix.setRectToRect(mBitmapRect, mBorderRect, android.graphics.Matrix.ScaleToFit.FILL);
        continue; /* Loop/switch isn't completed */
_L6:
        mBorderRect.set(mBitmapRect);
        mShaderMatrix.setRectToRect(mBitmapRect, mBounds, android.graphics.Matrix.ScaleToFit.START);
        mShaderMatrix.mapRect(mBorderRect);
        mBorderRect.inset(mBorderWidth / 2.0F, mBorderWidth / 2.0F);
        mShaderMatrix.setRectToRect(mBitmapRect, mBorderRect, android.graphics.Matrix.ScaleToFit.FILL);
        continue; /* Loop/switch isn't completed */
_L7:
        mBorderRect.set(mBounds);
        mBorderRect.inset(mBorderWidth / 2.0F, mBorderWidth / 2.0F);
        mShaderMatrix.set(null);
        mShaderMatrix.setRectToRect(mBitmapRect, mBorderRect, android.graphics.Matrix.ScaleToFit.FILL);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void draw(Canvas canvas)
    {
        if (mOval)
        {
            if (mBorderWidth > 0.0F)
            {
                canvas.drawOval(mDrawableRect, mBitmapPaint);
                canvas.drawOval(mBorderRect, mBorderPaint);
                return;
            } else
            {
                canvas.drawOval(mDrawableRect, mBitmapPaint);
                return;
            }
        }
        if (mBorderWidth > 0.0F)
        {
            canvas.drawRoundRect(mDrawableRect, Math.max(mCornerRadius, 0.0F), Math.max(mCornerRadius, 0.0F), mBitmapPaint);
            canvas.drawRoundRect(mBorderRect, mCornerRadius, mCornerRadius, mBorderPaint);
            return;
        } else
        {
            canvas.drawRoundRect(mDrawableRect, mCornerRadius, mCornerRadius, mBitmapPaint);
            return;
        }
    }

    public int getBorderColor()
    {
        return mBorderColor.getDefaultColor();
    }

    public ColorStateList getBorderColors()
    {
        return mBorderColor;
    }

    public float getBorderWidth()
    {
        return mBorderWidth;
    }

    public float getCornerRadius()
    {
        return mCornerRadius;
    }

    public int getIntrinsicHeight()
    {
        return mBitmapHeight;
    }

    public int getIntrinsicWidth()
    {
        return mBitmapWidth;
    }

    public int getOpacity()
    {
        return -3;
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return mScaleType;
    }

    public boolean isOval()
    {
        return mOval;
    }

    public boolean isStateful()
    {
        return mBorderColor.isStateful();
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        mBounds.set(rect);
        updateShaderMatrix();
    }

    protected boolean onStateChange(int ai[])
    {
        int i = mBorderColor.getColorForState(ai, 0);
        if (mBorderPaint.getColor() != i)
        {
            mBorderPaint.setColor(i);
            return true;
        } else
        {
            return super.onStateChange(ai);
        }
    }

    public void setAlpha(int i)
    {
        mBitmapPaint.setAlpha(i);
        invalidateSelf();
    }

    public RoundedDrawable setBorderColor(int i)
    {
        return setBorderColors(ColorStateList.valueOf(i));
    }

    public RoundedDrawable setBorderColors(ColorStateList colorstatelist)
    {
        if (colorstatelist == null)
        {
            colorstatelist = ColorStateList.valueOf(0);
        }
        mBorderColor = colorstatelist;
        mBorderPaint.setColor(mBorderColor.getColorForState(getState(), 0xff000000));
        return this;
    }

    public RoundedDrawable setBorderWidth(int i)
    {
        mBorderWidth = i;
        mBorderPaint.setStrokeWidth(mBorderWidth);
        return this;
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mBitmapPaint.setColorFilter(colorfilter);
        invalidateSelf();
    }

    public RoundedDrawable setCornerRadius(float f)
    {
        mCornerRadius = f;
        return this;
    }

    public void setDither(boolean flag)
    {
        mBitmapPaint.setDither(flag);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean flag)
    {
        mBitmapPaint.setFilterBitmap(flag);
        invalidateSelf();
    }

    public RoundedDrawable setOval(boolean flag)
    {
        mOval = flag;
        return this;
    }

    public RoundedDrawable setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        android.widget.ImageView.ScaleType scaletype1 = scaletype;
        if (scaletype == null)
        {
            scaletype1 = android.widget.ImageView.ScaleType.FIT_CENTER;
        }
        if (mScaleType != scaletype1)
        {
            mScaleType = scaletype1;
            updateShaderMatrix();
        }
        return this;
    }

    public Bitmap toBitmap()
    {
        return drawableToBitmap(this);
    }
}
