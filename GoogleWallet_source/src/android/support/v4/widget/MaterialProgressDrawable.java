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
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.util.ArrayList;

final class MaterialProgressDrawable extends Drawable
    implements Animatable
{
    static final class EndCurveInterpolator extends AccelerateDecelerateInterpolator
    {

        public final float getInterpolation(float f)
        {
            return super.getInterpolation(Math.max(0.0F, (f - 0.5F) * 2.0F));
        }

        private EndCurveInterpolator()
        {
        }

    }

    static final class Ring
    {

        private int mAlpha;
        private Path mArrow;
        private int mArrowHeight;
        private final Paint mArrowPaint = new Paint();
        private float mArrowScale;
        private int mArrowWidth;
        private int mBackgroundColor;
        private final android.graphics.drawable.Drawable.Callback mCallback;
        private final Paint mCirclePaint = new Paint();
        private int mColorIndex;
        private int mColors[];
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
                mArrowPaint.setColor(mColors[mColorIndex]);
                canvas.rotate((f + f1) - 5F, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(mArrow, mArrowPaint);
            }
        }

        private void invalidateSelf()
        {
            mCallback.invalidateDrawable(null);
        }

        public final void draw(Canvas canvas, Rect rect)
        {
            RectF rectf = mTempBounds;
            rectf.set(rect);
            rectf.inset(mStrokeInset, mStrokeInset);
            float f = (mStartTrim + mRotation) * 360F;
            float f1 = (mEndTrim + mRotation) * 360F - f;
            mPaint.setColor(mColors[mColorIndex]);
            canvas.drawArc(rectf, f, f1, false, mPaint);
            drawTriangle(canvas, f, f1, rect);
            if (mAlpha < 255)
            {
                mCirclePaint.setColor(mBackgroundColor);
                mCirclePaint.setAlpha(255 - mAlpha);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, mCirclePaint);
            }
        }

        public final int getAlpha()
        {
            return mAlpha;
        }

        public final double getCenterRadius()
        {
            return mRingCenterRadius;
        }

        public final float getEndTrim()
        {
            return mEndTrim;
        }

        public final float getStartTrim()
        {
            return mStartTrim;
        }

        public final float getStartingEndTrim()
        {
            return mStartingEndTrim;
        }

        public final float getStartingRotation()
        {
            return mStartingRotation;
        }

        public final float getStartingStartTrim()
        {
            return mStartingStartTrim;
        }

        public final float getStrokeWidth()
        {
            return mStrokeWidth;
        }

        public final void goToNextColor()
        {
            mColorIndex = (mColorIndex + 1) % mColors.length;
        }

        public final void resetOriginals()
        {
            mStartingStartTrim = 0.0F;
            mStartingEndTrim = 0.0F;
            mStartingRotation = 0.0F;
            setStartTrim(0.0F);
            setEndTrim(0.0F);
            setRotation(0.0F);
        }

        public final void setAlpha(int i)
        {
            mAlpha = i;
        }

        public final void setArrowDimensions(float f, float f1)
        {
            mArrowWidth = (int)f;
            mArrowHeight = (int)f1;
        }

        public final void setArrowScale(float f)
        {
            if (f != mArrowScale)
            {
                mArrowScale = f;
                invalidateSelf();
            }
        }

        public final void setBackgroundColor(int i)
        {
            mBackgroundColor = i;
        }

        public final void setCenterRadius(double d)
        {
            mRingCenterRadius = d;
        }

        public final void setColorFilter(ColorFilter colorfilter)
        {
            mPaint.setColorFilter(colorfilter);
            invalidateSelf();
        }

        public final void setColorIndex(int i)
        {
            mColorIndex = i;
        }

        public final void setColors(int ai[])
        {
            mColors = ai;
            setColorIndex(0);
        }

        public final void setEndTrim(float f)
        {
            mEndTrim = f;
            invalidateSelf();
        }

        public final void setInsets(int i, int j)
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

        public final void setRotation(float f)
        {
            mRotation = f;
            invalidateSelf();
        }

        public final void setShowArrow(boolean flag)
        {
            if (mShowArrow != flag)
            {
                mShowArrow = flag;
                invalidateSelf();
            }
        }

        public final void setStartTrim(float f)
        {
            mStartTrim = f;
            invalidateSelf();
        }

        public final void setStrokeWidth(float f)
        {
            mStrokeWidth = f;
            mPaint.setStrokeWidth(f);
            invalidateSelf();
        }

        public final void storeOriginals()
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

    static final class StartCurveInterpolator extends AccelerateDecelerateInterpolator
    {

        public final float getInterpolation(float f)
        {
            return super.getInterpolation(Math.min(1.0F, 2.0F * f));
        }

        private StartCurveInterpolator()
        {
        }

    }


    private static final Interpolator EASE_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    private static final Interpolator END_CURVE_INTERPOLATOR = new EndCurveInterpolator();
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator START_CURVE_INTERPOLATOR = new StartCurveInterpolator();
    private final int COLORS[] = {
        0xff000000
    };
    private Animation mAnimation;
    private final ArrayList mAnimators = new ArrayList();
    private final android.graphics.drawable.Drawable.Callback mCallback = new android.graphics.drawable.Drawable.Callback() {

        final MaterialProgressDrawable this$0;

        public final void invalidateDrawable(Drawable drawable)
        {
            invalidateSelf();
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
        {
            scheduleSelf(runnable, l);
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable)
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

    private static void applyFinishTranslation(float f, Ring ring)
    {
        float f1 = (float)(Math.floor(ring.getStartingRotation() / 0.8F) + 1.0D);
        ring.setStartTrim(ring.getStartingStartTrim() + (ring.getStartingEndTrim() - ring.getStartingStartTrim()) * f);
        ring.setRotation(ring.getStartingRotation() + (f1 - ring.getStartingRotation()) * f);
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

            public final void applyTransformation(float f, Transformation transformation)
            {
                if (mFinishing)
                {
                    MaterialProgressDrawable.applyFinishTranslation(MaterialProgressDrawable.this, f, ring);
                    return;
                } else
                {
                    float f3 = (float)Math.toRadians((double)ring.getStrokeWidth() / (6.2831853071795862D * ring.getCenterRadius()));
                    float f4 = ring.getStartingEndTrim();
                    float f1 = ring.getStartingStartTrim();
                    float f2 = ring.getStartingRotation();
                    float f5 = MaterialProgressDrawable.START_CURVE_INTERPOLATOR.getInterpolation(f);
                    ring.setEndTrim(f4 + f5 * (0.8F - f3));
                    f3 = MaterialProgressDrawable.END_CURVE_INTERPOLATOR.getInterpolation(f);
                    ring.setStartTrim(f1 + 0.8F * f3);
                    ring.setRotation(f2 + 0.25F * f);
                    f1 = mRotationCount / 5F;
                    setRotation(144F * f + 720F * f1);
                    return;
                }
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

            public final void onAnimationEnd(Animation animation1)
            {
            }

            public final void onAnimationRepeat(Animation animation1)
            {
                ring.storeOriginals();
                ring.goToNextColor();
                ring.setStartTrim(ring.getEndTrim());
                if (mFinishing)
                {
                    mFinishing = false;
                    animation1.setDuration(1333L);
                    ring.setShowArrow(false);
                    return;
                } else
                {
                    mRotationCount = (mRotationCount + 1.0F) % 5F;
                    return;
                }
            }

            public final void onAnimationStart(Animation animation1)
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

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i = canvas.save();
        canvas.rotate(mRotation, rect.exactCenterX(), rect.exactCenterY());
        mRing.draw(canvas, rect);
        canvas.restoreToCount(i);
    }

    public final int getAlpha()
    {
        return mRing.getAlpha();
    }

    public final int getIntrinsicHeight()
    {
        return (int)mHeight;
    }

    public final int getIntrinsicWidth()
    {
        return (int)mWidth;
    }

    public final int getOpacity()
    {
        return -3;
    }

    public final boolean isRunning()
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

    public final void setAlpha(int i)
    {
        mRing.setAlpha(i);
    }

    public final void setArrowScale(float f)
    {
        mRing.setArrowScale(f);
    }

    public final void setBackgroundColor(int i)
    {
        mRing.setBackgroundColor(i);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        mRing.setColorFilter(colorfilter);
    }

    public final transient void setColorSchemeColors(int ai[])
    {
        mRing.setColors(ai);
        mRing.setColorIndex(0);
    }

    public final void setProgressRotation(float f)
    {
        mRing.setRotation(f);
    }

    final void setRotation(float f)
    {
        mRotation = f;
        invalidateSelf();
    }

    public final void setStartEndTrim(float f, float f1)
    {
        mRing.setStartTrim(f);
        mRing.setEndTrim(f1);
    }

    public final void showArrow(boolean flag)
    {
        mRing.setShowArrow(flag);
    }

    public final void start()
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
            mAnimation.setDuration(1333L);
            mParent.startAnimation(mAnimation);
            return;
        }
    }

    public final void stop()
    {
        mParent.clearAnimation();
        setRotation(0.0F);
        mRing.setShowArrow(false);
        mRing.setColorIndex(0);
        mRing.resetOriginals();
    }

    public final void updateSizes(int i)
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
    static float access$502(MaterialProgressDrawable materialprogressdrawable, float f)
    {
        materialprogressdrawable.mRotationCount = f;
        return f;
    }

*/
}
