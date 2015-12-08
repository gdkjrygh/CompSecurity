// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;

class MaterialProgressDrawable extends Drawable
    implements Animatable
{
    private static class Ring
    {

        private int mAlpha;
        private Path mArrow;
        private int mArrowHeight;
        private final Paint mArrowPaint = new Paint();
        private float mArrowScale;
        private int mArrowWidth;
        private int mBackgroundColor;
        private final android.graphics.drawable.Drawable.Callback mCallback;
        private final Paint mCirclePaint = new Paint(1);
        private int mColorIndex;
        private int mColors[];
        private int mCurrentColor;
        private float mEndTrim;
        private final Paint mPaint = new Paint();
        private double mRingCenterRadius;
        private float mRotation;
        private boolean mShowArrow;
        private float mStartTrim;
        private float mStartingEndTrim;
        private float mStartingRotation;
        private float mStartingStartTrim;
        private float mStrokeInset;
        private float mStrokeWidth;
        private final RectF mTempBounds = new RectF();

        private void drawTriangle(Canvas canvas, float f, float f1, Rect rect)
        {
            if (mShowArrow)
            {
                float f2;
                float f3;
                float f4;
                float f5;
                if (mArrow == null)
                {
                    mArrow = new Path();
                    mArrow.setFillType(android.graphics.Path.FillType.EVEN_ODD);
                } else
                {
                    mArrow.reset();
                }
                f2 = (int)mStrokeInset / 2;
                f3 = mArrowScale;
                f4 = (float)(mRingCenterRadius * Math.cos(0.0D) + (double)rect.exactCenterX());
                f5 = (float)(mRingCenterRadius * Math.sin(0.0D) + (double)rect.exactCenterY());
                mArrow.moveTo(0.0F, 0.0F);
                mArrow.lineTo((float)mArrowWidth * mArrowScale, 0.0F);
                mArrow.lineTo(((float)mArrowWidth * mArrowScale) / 2.0F, (float)mArrowHeight * mArrowScale);
                mArrow.offset(f4 - f2 * f3, f5);
                mArrow.close();
                mArrowPaint.setColor(mCurrentColor);
                canvas.rotate((f + f1) - 5F, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(mArrow, mArrowPaint);
            }
        }

        private int getNextColorIndex()
        {
            return (mColorIndex + 1) % mColors.length;
        }

        private void invalidateSelf()
        {
            mCallback.invalidateDrawable(null);
        }

        public void draw(Canvas canvas, Rect rect)
        {
            RectF rectf = mTempBounds;
            rectf.set(rect);
            rectf.inset(mStrokeInset, mStrokeInset);
            float f = (mStartTrim + mRotation) * 360F;
            float f1 = (mEndTrim + mRotation) * 360F - f;
            mPaint.setColor(mCurrentColor);
            canvas.drawArc(rectf, f, f1, false, mPaint);
            drawTriangle(canvas, f, f1, rect);
            if (mAlpha < 255)
            {
                mCirclePaint.setColor(mBackgroundColor);
                mCirclePaint.setAlpha(255 - mAlpha);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, mCirclePaint);
            }
        }

        public int getAlpha()
        {
            return mAlpha;
        }

        public double getCenterRadius()
        {
            return mRingCenterRadius;
        }

        public float getEndTrim()
        {
            return mEndTrim;
        }

        public int getNextColor()
        {
            return mColors[getNextColorIndex()];
        }

        public float getStartTrim()
        {
            return mStartTrim;
        }

        public int getStartingColor()
        {
            return mColors[mColorIndex];
        }

        public float getStartingEndTrim()
        {
            return mStartingEndTrim;
        }

        public float getStartingRotation()
        {
            return mStartingRotation;
        }

        public float getStartingStartTrim()
        {
            return mStartingStartTrim;
        }

        public float getStrokeWidth()
        {
            return mStrokeWidth;
        }

        public void goToNextColor()
        {
            setColorIndex(getNextColorIndex());
        }

        public void resetOriginals()
        {
            mStartingStartTrim = 0.0F;
            mStartingEndTrim = 0.0F;
            mStartingRotation = 0.0F;
            setStartTrim(0.0F);
            setEndTrim(0.0F);
            setRotation(0.0F);
        }

        public void setAlpha(int i)
        {
            mAlpha = i;
        }

        public void setArrowDimensions(float f, float f1)
        {
            mArrowWidth = (int)f;
            mArrowHeight = (int)f1;
        }

        public void setArrowScale(float f)
        {
            if (f != mArrowScale)
            {
                mArrowScale = f;
                invalidateSelf();
            }
        }

        public void setBackgroundColor(int i)
        {
            mBackgroundColor = i;
        }

        public void setCenterRadius(double d)
        {
            mRingCenterRadius = d;
        }

        public void setColor(int i)
        {
            mCurrentColor = i;
        }

        public void setColorFilter(ColorFilter colorfilter)
        {
            mPaint.setColorFilter(colorfilter);
            invalidateSelf();
        }

        public void setColorIndex(int i)
        {
            mColorIndex = i;
            mCurrentColor = mColors[mColorIndex];
        }

        public void setColors(int ai[])
        {
            mColors = ai;
            setColorIndex(0);
        }

        public void setEndTrim(float f)
        {
            mEndTrim = f;
            invalidateSelf();
        }

        public void setInsets(int i, int j)
        {
            float f = Math.min(i, j);
            if (mRingCenterRadius <= 0.0D || f < 0.0F)
            {
                f = (float)Math.ceil(mStrokeWidth / 2.0F);
            } else
            {
                f = (float)((double)(f / 2.0F) - mRingCenterRadius);
            }
            mStrokeInset = f;
        }

        public void setRotation(float f)
        {
            mRotation = f;
            invalidateSelf();
        }

        public void setShowArrow(boolean flag)
        {
            if (mShowArrow != flag)
            {
                mShowArrow = flag;
                invalidateSelf();
            }
        }

        public void setStartTrim(float f)
        {
            mStartTrim = f;
            invalidateSelf();
        }

        public void setStrokeWidth(float f)
        {
            mStrokeWidth = f;
            mPaint.setStrokeWidth(f);
            invalidateSelf();
        }

        public void storeOriginals()
        {
            mStartingStartTrim = mStartTrim;
            mStartingEndTrim = mEndTrim;
            mStartingRotation = mRotation;
        }

        public Ring(android.graphics.drawable.Drawable.Callback callback)
        {
            mStartTrim = 0.0F;
            mEndTrim = 0.0F;
            mRotation = 0.0F;
            mStrokeWidth = 5F;
            mStrokeInset = 2.5F;
            mCallback = callback;
            mPaint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            mPaint.setAntiAlias(true);
            mPaint.setStyle(android.graphics.Paint.Style.STROKE);
            mArrowPaint.setStyle(android.graphics.Paint.Style.FILL);
            mArrowPaint.setAntiAlias(true);
        }
    }


    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private final int COLORS[] = {
        0xff000000
    };
    private Animation mAnimation;
    private final ArrayList mAnimators = new ArrayList();
    private final android.graphics.drawable.Drawable.Callback mCallback = new android.graphics.drawable.Drawable.Callback() {

        final MaterialProgressDrawable this$0;

        public void invalidateDrawable(Drawable drawable)
        {
            invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
        {
            scheduleSelf(runnable, l);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable)
        {
            unscheduleSelf(runnable);
        }

            
            {
                this$0 = MaterialProgressDrawable.this;
                super();
            }
    };
    boolean mFinishing;
    private double mHeight;
    private View mParent;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    private float mRotationCount;
    private double mWidth;

    public MaterialProgressDrawable(Context context, View view)
    {
        mParent = view;
        mResources = context.getResources();
        mRing = new Ring(mCallback);
        mRing.setColors(COLORS);
        updateSizes(1);
        setupAnimators();
    }

    private void applyFinishTranslation(float f, Ring ring)
    {
        updateRingColor(f, ring);
        float f1 = (float)(Math.floor(ring.getStartingRotation() / 0.8F) + 1.0D);
        float f2 = getMinProgressArc(ring);
        ring.setStartTrim(ring.getStartingStartTrim() + (ring.getStartingEndTrim() - f2 - ring.getStartingStartTrim()) * f);
        ring.setEndTrim(ring.getStartingEndTrim());
        ring.setRotation(ring.getStartingRotation() + (f1 - ring.getStartingRotation()) * f);
    }

    private int evaluateColorChange(float f, int i, int j)
    {
        int i1 = Integer.valueOf(i).intValue();
        i = i1 >> 24 & 0xff;
        int k = i1 >> 16 & 0xff;
        int l = i1 >> 8 & 0xff;
        i1 &= 0xff;
        j = Integer.valueOf(j).intValue();
        return (int)((float)((j >> 24 & 0xff) - i) * f) + i << 24 | (int)((float)((j >> 16 & 0xff) - k) * f) + k << 16 | (int)((float)((j >> 8 & 0xff) - l) * f) + l << 8 | (int)((float)((j & 0xff) - i1) * f) + i1;
    }

    private float getMinProgressArc(Ring ring)
    {
        return (float)Math.toRadians((double)ring.getStrokeWidth() / (6.2831853071795862D * ring.getCenterRadius()));
    }

    private void setSizeParameters(double d, double d1, double d2, double d3, float f, float f1)
    {
        Ring ring = mRing;
        float f2 = mResources.getDisplayMetrics().density;
        mWidth = (double)f2 * d;
        mHeight = (double)f2 * d1;
        ring.setStrokeWidth((float)d3 * f2);
        ring.setCenterRadius((double)f2 * d2);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f * f2, f1 * f2);
        ring.setInsets((int)mWidth, (int)mHeight);
    }

    private void setupAnimators()
    {
        final Ring ring = mRing;
        Animation animation = new Animation() {

            final MaterialProgressDrawable this$0;
            final Ring val$ring;

            public void applyTransformation(float f, Transformation transformation)
            {
                if (mFinishing)
                {
                    applyFinishTranslation(f, ring);
                    return;
                }
                float f1 = getMinProgressArc(ring);
                float f2 = ring.getStartingEndTrim();
                float f4 = ring.getStartingStartTrim();
                float f3 = ring.getStartingRotation();
                updateRingColor(f, ring);
                if (f <= 0.5F)
                {
                    float f6 = f / 0.5F;
                    f6 = MaterialProgressDrawable.MATERIAL_INTERPOLATOR.getInterpolation(f6);
                    ring.setStartTrim(f4 + (0.8F - f1) * f6);
                }
                if (f > 0.5F)
                {
                    float f5 = (f - 0.5F) / 0.5F;
                    f5 = MaterialProgressDrawable.MATERIAL_INTERPOLATOR.getInterpolation(f5);
                    ring.setEndTrim(f2 + f5 * (0.8F - f1));
                }
                ring.setRotation(f3 + 0.25F * f);
                f1 = mRotationCount / 5F;
                setRotation(216F * f + 1080F * f1);
            }

            
            {
                this$0 = MaterialProgressDrawable.this;
                ring = ring1;
                super();
            }
        };
        animation.setRepeatCount(-1);
        animation.setRepeatMode(1);
        animation.setInterpolator(LINEAR_INTERPOLATOR);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MaterialProgressDrawable this$0;
            final Ring val$ring;

            public void onAnimationEnd(Animation animation1)
            {
            }

            public void onAnimationRepeat(Animation animation1)
            {
                ring.storeOriginals();
                ring.goToNextColor();
                ring.setStartTrim(ring.getEndTrim());
                if (mFinishing)
                {
                    mFinishing = false;
                    animation1.setDuration(1332L);
                    ring.setShowArrow(false);
                    return;
                } else
                {
                    mRotationCount = (mRotationCount + 1.0F) % 5F;
                    return;
                }
            }

            public void onAnimationStart(Animation animation1)
            {
                mRotationCount = 0.0F;
            }

            
            {
                this$0 = MaterialProgressDrawable.this;
                ring = ring1;
                super();
            }
        });
        mAnimation = animation;
    }

    private void updateRingColor(float f, Ring ring)
    {
        if (f > 0.75F)
        {
            ring.setColor(evaluateColorChange((f - 0.75F) / 0.25F, ring.getStartingColor(), ring.getNextColor()));
        }
    }

    public void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i = canvas.save();
        canvas.rotate(mRotation, rect.exactCenterX(), rect.exactCenterY());
        mRing.draw(canvas, rect);
        canvas.restoreToCount(i);
    }

    public int getAlpha()
    {
        return mRing.getAlpha();
    }

    public int getIntrinsicHeight()
    {
        return (int)mHeight;
    }

    public int getIntrinsicWidth()
    {
        return (int)mWidth;
    }

    public int getOpacity()
    {
        return -3;
    }

    public boolean isRunning()
    {
        ArrayList arraylist = mAnimators;
        int j = arraylist.size();
        for (int i = 0; i < j; i++)
        {
            Animation animation = (Animation)arraylist.get(i);
            if (animation.hasStarted() && !animation.hasEnded())
            {
                return true;
            }
        }

        return false;
    }

    public void setAlpha(int i)
    {
        mRing.setAlpha(i);
    }

    public void setArrowScale(float f)
    {
        mRing.setArrowScale(f);
    }

    public void setBackgroundColor(int i)
    {
        mRing.setBackgroundColor(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mRing.setColorFilter(colorfilter);
    }

    public transient void setColorSchemeColors(int ai[])
    {
        mRing.setColors(ai);
        mRing.setColorIndex(0);
    }

    public void setProgressRotation(float f)
    {
        mRing.setRotation(f);
    }

    void setRotation(float f)
    {
        mRotation = f;
        invalidateSelf();
    }

    public void setStartEndTrim(float f, float f1)
    {
        mRing.setStartTrim(f);
        mRing.setEndTrim(f1);
    }

    public void showArrow(boolean flag)
    {
        mRing.setShowArrow(flag);
    }

    public void start()
    {
        mAnimation.reset();
        mRing.storeOriginals();
        if (mRing.getEndTrim() != mRing.getStartTrim())
        {
            mFinishing = true;
            mAnimation.setDuration(666L);
            mParent.startAnimation(mAnimation);
            return;
        } else
        {
            mRing.setColorIndex(0);
            mRing.resetOriginals();
            mAnimation.setDuration(1332L);
            mParent.startAnimation(mAnimation);
            return;
        }
    }

    public void stop()
    {
        mParent.clearAnimation();
        setRotation(0.0F);
        mRing.setShowArrow(false);
        mRing.setColorIndex(0);
        mRing.resetOriginals();
    }

    public void updateSizes(int i)
    {
        if (i == 0)
        {
            setSizeParameters(56D, 56D, 12.5D, 3D, 12F, 6F);
            return;
        } else
        {
            setSizeParameters(40D, 40D, 8.75D, 2.5D, 10F, 5F);
            return;
        }
    }








/*
    static float access$402(MaterialProgressDrawable materialprogressdrawable, float f)
    {
        materialprogressdrawable.mRotationCount = f;
        return f;
    }

*/
}
