// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class CircledImageView extends FrameLayout
{

    private int mCircleBorderColor;
    private float mCircleBorderWidth;
    private ColorStateList mCircleColor;
    private boolean mCircleHidden;
    float mCircleRadius;
    private float mCircleRadiusPressed;
    private ImageView mImageView;
    private float mInitialCircleRadius;
    private final RectF mOval;
    private final Paint mPaint;
    private boolean mPressed;
    protected float mProgress;
    private float mShadowVisibility;
    private final float mShadowWidth;

    public CircledImageView(Context context)
    {
        this(context, null);
    }

    public CircledImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CircledImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mProgress = 1.0F;
        mCircleHidden = false;
        mPressed = false;
        mImageView = new ImageView(context);
        context = new android.widget.FrameLayout.LayoutParams(-2, -2);
        context.gravity = 17;
        mImageView.setLayoutParams(context);
        addView(mImageView);
        context = getContext().obtainStyledAttributes(attributeset, android.support.wearable.R.styleable.CircledImageView);
        attributeset = context.getDrawable(0);
        if (attributeset != null)
        {
            mImageView.setImageDrawable(attributeset);
        }
        mCircleColor = context.getColorStateList(1);
        if (mCircleColor == null)
        {
            mCircleColor = ColorStateList.valueOf(0x1060000);
        }
        mCircleRadius = context.getDimension(2, 0.0F);
        mInitialCircleRadius = mCircleRadius;
        mCircleRadiusPressed = context.getDimension(3, mCircleRadius);
        mCircleBorderColor = context.getColor(5, 0xff000000);
        mCircleBorderWidth = context.getDimension(4, 0.0F);
        if (mCircleBorderWidth > 0.0F)
        {
            mCircleRadius = mCircleRadius - mCircleBorderWidth;
            mCircleRadiusPressed = mCircleRadiusPressed - mCircleBorderWidth;
        }
        float f = context.getDimension(6, 0.0F);
        if (f > 0.0F)
        {
            mCircleRadius = mCircleRadius - f;
            mCircleRadiusPressed = mCircleRadiusPressed - f;
        }
        mShadowWidth = context.getDimension(7, 0.0F);
        context.recycle();
        mOval = new RectF();
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        setWillNotDraw(false);
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    public float getCircleRadius()
    {
        return mCircleRadius;
    }

    public float getInitialCircleRadius()
    {
        return mInitialCircleRadius;
    }

    protected void onDraw(Canvas canvas)
    {
        int i = getPaddingLeft();
        int j = getPaddingTop();
        float f;
        if (mPressed)
        {
            f = mCircleRadiusPressed;
        } else
        {
            f = mCircleRadius;
        }
        if (mShadowWidth > 0.0F && mShadowVisibility > 0.0F)
        {
            mOval.set(i, j, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            float f1 = mCircleBorderWidth + f + mShadowWidth * mShadowVisibility;
            mPaint.setColor(0xff000000);
            mPaint.setStyle(android.graphics.Paint.Style.FILL);
            Paint paint = mPaint;
            float f3 = mOval.centerX();
            float f5 = mOval.centerY();
            android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.MIRROR;
            paint.setShader(new RadialGradient(f3, f5, f1, new int[] {
                0xff000000, 0
            }, new float[] {
                0.6F, 1.0F
            }, tilemode));
            canvas.drawCircle(mOval.centerX(), mOval.centerY(), f1, mPaint);
            mPaint.setShader(null);
        }
        if (mCircleBorderWidth > 0.0F)
        {
            mOval.set(i, j, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            mOval.set(mOval.centerX() - f, mOval.centerY() - f, mOval.centerX() + f, mOval.centerY() + f);
            mPaint.setColor(mCircleBorderColor);
            mPaint.setStyle(android.graphics.Paint.Style.STROKE);
            mPaint.setStrokeWidth(mCircleBorderWidth);
            canvas.drawArc(mOval, -90F, 360F * mProgress, false, mPaint);
        }
        if (!mCircleHidden)
        {
            mOval.set(i, j, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            i = mCircleColor.getColorForState(getDrawableState(), mCircleColor.getDefaultColor());
            mPaint.setColor(i);
            mPaint.setStyle(android.graphics.Paint.Style.FILL);
            float f2 = mOval.centerX();
            float f4 = mOval.centerY();
            if (mImageView.getDrawable() != null)
            {
                f2 = Math.round((float)mImageView.getLeft() + (float)mImageView.getWidth() / 2.0F);
                f4 = Math.round((float)mImageView.getTop() + (float)mImageView.getHeight() / 2.0F);
            }
            canvas.drawCircle(f2, f4, f, mPaint);
        }
        super.onDraw(canvas);
    }

    public void setCircleBorderColor(int i)
    {
        mCircleBorderColor = i;
    }

    public void setCircleColor(int i)
    {
        mCircleColor = ColorStateList.valueOf(i);
        invalidate();
    }

    public void setCircleHidden(boolean flag)
    {
        mCircleHidden = flag;
        invalidate();
    }

    public void setCircleRadius(float f)
    {
        mCircleRadius = f;
        invalidate();
    }

    public void setCircleRadiusPressed(float f)
    {
        mCircleRadiusPressed = f;
        invalidate();
    }

    public void setImageDrawable(Drawable drawable)
    {
        mImageView.setImageDrawable(drawable);
        invalidate();
    }

    public void setImageResource(int i)
    {
        mImageView.setImageResource(i);
        invalidate();
    }

    public void setPressed(boolean flag)
    {
        super.setPressed(flag);
        mPressed = flag;
        invalidate();
    }

    public void setProgress(float f)
    {
        mProgress = f;
        invalidate();
    }

    public void setShadowVisibility(float f)
    {
        if (f != mShadowVisibility)
        {
            mShadowVisibility = f;
            invalidate();
        }
    }
}
