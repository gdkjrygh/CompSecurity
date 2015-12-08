// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public class BackgroundView extends View
{

    private static final int BLUE_COEFF_INDEX = 12;
    private static final int GREEN_COEFF_INDEX = 6;
    private static final int RED_COEFF_INDEX = 0;
    private static final String TAG = "BackgroundView";
    private float mBrightness;
    private float mColorMatrix[] = {
        1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 
        0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F
    };
    private Drawable mDrawable;
    private final android.graphics.drawable.Drawable.Callback mDrawableCallback;
    private float mGutterRatio;
    private Matrix mImageMatrix;
    private Paint mImagePaint;
    private float mPosX;
    private float mPosY;
    private int mRightStops;

    public BackgroundView(Context context)
    {
        this(context, null, 0);
    }

    public BackgroundView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BackgroundView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mImageMatrix = new Matrix();
        mImagePaint = new Paint();
        mBrightness = 0.0F;
        mPosX = 0.0F;
        mPosY = 0.0F;
        mRightStops = 1;
        mGutterRatio = 0.2F;
        mDrawableCallback = new android.graphics.drawable.Drawable.Callback() {

            final BackgroundView this$0;

            public void invalidateDrawable(Drawable drawable)
            {
                calculateMatrix(mPosX, mPosY);
                invalidate();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
            {
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable)
            {
            }

            
            {
                this$0 = BackgroundView.this;
                super();
            }
        };
        mImagePaint.setFilterBitmap(true);
    }

    private void calculateMatrix(float f, float f1)
    {
        int i;
        int j;
        mImageMatrix.reset();
        i = getMeasuredWidth();
        j = getMeasuredHeight();
        break MISSING_BLOCK_LABEL_19;
        if (i != 0 && j != 0 && mDrawable != null && mDrawable != null)
        {
            int k = mDrawable.getIntrinsicWidth();
            int l = mDrawable.getIntrinsicHeight();
            if (l != -1 || k != -1)
            {
                float f3 = (float)j * mGutterRatio;
                int i1 = (int)Math.ceil((float)i + 2.0F * f3);
                int j1 = (int)Math.ceil((float)j + 2.0F * f3);
                float f4 = (float)k / (float)l;
                float f2;
                if (f4 > (float)i / (float)j)
                {
                    f2 = f4 * (float)j1;
                } else
                {
                    f2 = i1;
                    f4 = f2 / f4;
                }
                f4 = f2 / (float)k;
                f2 = Math.min(f3, (f2 - (float)i - f3) / (float)mRightStops);
                if (f <= 0.0F)
                {
                    f = f3 + f * f3;
                } else
                {
                    f = f3 + f2 * f;
                }
                mImageMatrix.setScale(f4, f4);
                mImageMatrix.postTranslate(-f, -(f3 + f1 * f3));
                mDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                return;
            }
        }
        return;
    }

    protected void onDraw(Canvas canvas)
    {
        if (mDrawable != null && mImageMatrix != null)
        {
            Object obj = mDrawable.getCurrent();
            if (obj instanceof ColorDrawable)
            {
                canvas.drawColor(((ColorDrawable)obj).getColor());
                return;
            }
            if (obj instanceof BitmapDrawable)
            {
                obj = (BitmapDrawable)obj;
                canvas.drawColor(0);
                canvas.drawBitmap(((BitmapDrawable) (obj)).getBitmap(), mImageMatrix, mImagePaint);
                return;
            }
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        if (i != k || j != l)
        {
            calculateMatrix(mPosX, mPosY);
            invalidate();
        }
    }

    public void setBackgroundBrightness(float f)
    {
        if (f != mBrightness)
        {
            mBrightness = f;
            mColorMatrix[0] = f;
            mColorMatrix[6] = f;
            mColorMatrix[12] = f;
            mImagePaint.setColorFilter(new ColorMatrixColorFilter(mColorMatrix));
            invalidate();
        }
    }

    public void setBackgroundPosition(float f, float f1)
    {
        mPosX = Math.max(-1F, Math.min(mRightStops, f));
        mPosY = Math.max(-1F, Math.min(1.0F, f1));
        calculateMatrix(mPosX, mPosY);
        invalidate();
    }

    public void setBackgroundPositionX(float f)
    {
        setBackgroundPosition(f, mPosY);
    }

    public void setBackgroundPositionY(float f)
    {
        setBackgroundPosition(mPosX, f);
    }

    public void setDrawable(Drawable drawable)
    {
        if (mDrawable != null)
        {
            mDrawable.setCallback(null);
        }
        mDrawable = drawable;
        if (mDrawable != null)
        {
            mDrawable.setCallback(mDrawableCallback);
        }
        calculateMatrix(mPosX, mPosY);
        invalidate();
    }

    public void setHorizontalStops(int i)
    {
        mRightStops = Math.max(1, i);
        calculateMatrix(mPosX, mPosY);
        invalidate();
    }



}
