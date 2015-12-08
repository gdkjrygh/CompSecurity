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
import java.lang.annotation.Annotation;
import java.util.ArrayList;

class MaterialProgressDrawable extends Drawable
    implements Animatable
{
    private static class EndCurveInterpolator extends AccelerateDecelerateInterpolator
    {

        public float getInterpolation(float f)
        {
            return super.getInterpolation(Math.max(0.0F, (f - 0.5F) * 2.0F));
        }

        private EndCurveInterpolator()
        {
        }

    }

    public static interface ProgressDrawableSize
        extends Annotation
    {
    }

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

        public void draw(Canvas canvas, Rect rect)
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

        public float getInsets()
        {
            return mStrokeInset;
        }

        public float getRotation()
        {
            return mRotation;
        }

        public float getStartTrim()
        {
            return mStartTrim;
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
            mColorIndex = (mColorIndex + 1) % mColors.length;
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

        public void setColorFilter(ColorFilter colorfilter)
        {
            mPaint.setColorFilter(colorfilter);
            invalidateSelf();
        }

        public void setColorIndex(int i)
        {
            mColorIndex = i;
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

    private static class StartCurveInterpolator extends AccelerateDecelerateInterpolator
    {

        public float getInterpolation(float f)
        {
            return super.getInterpolation(Math.min(1.0F, 2.0F * f));
        }

        private StartCurveInterpolator()
        {
        }

    }


    private static final int ANIMATION_DURATION = 1333;
    private static final int ARROW_HEIGHT = 5;
    private static final int ARROW_HEIGHT_LARGE = 6;
    private static final float ARROW_OFFSET_ANGLE = 5F;
    private static final int ARROW_WIDTH = 10;
    private static final int ARROW_WIDTH_LARGE = 12;
    private static final float CENTER_RADIUS = 8.75F;
    private static final float CENTER_RADIUS_LARGE = 12.5F;
    private static final int CIRCLE_DIAMETER = 40;
    private static final int CIRCLE_DIAMETER_LARGE = 56;
    static final int DEFAULT = 1;
    private static final Interpolator EASE_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    private static final Interpolator END_CURVE_INTERPOLATOR = new EndCurveInterpolator();
    static final int LARGE = 0;
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final float MAX_PROGRESS_ARC = 0.8F;
    private static final float NUM_POINTS = 5F;
    private static final Interpolator START_CURVE_INTERPOLATOR = new StartCurveInterpolator();
    private static final float STROKE_WIDTH = 2.5F;
    private static final float STROKE_WIDTH_LARGE = 3F;
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
    private Animation mFinishAnimation;
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

    private float getRotation()
    {
        return mRotation;
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
                float f1 = (float)(Math.floor(ring.getStartingRotation() / 0.8F) + 1.0D);
                float f2 = ring.getStartingStartTrim();
                float f3 = ring.getStartingEndTrim();
                float f4 = ring.getStartingStartTrim();
                ring.setStartTrim(f2 + (f3 - f4) * f);
                f2 = ring.getStartingRotation();
                f3 = ring.getStartingRotation();
                ring.setRotation(f2 + (f1 - f3) * f);
                ring.setArrowScale(1.0F - f);
            }

            
            {
                this$0 = MaterialProgressDrawable.this;
                ring = ring1;
                super();
            }
        };
        animation.setInterpolator(EASE_INTERPOLATOR);
        animation.setDuration(666L);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MaterialProgressDrawable this$0;
            final Ring val$ring;

            public void onAnimationEnd(Animation animation2)
            {
                ring.goToNextColor();
                ring.storeOriginals();
                ring.setShowArrow(false);
                mParent.startAnimation(mAnimation);
            }

            public void onAnimationRepeat(Animation animation2)
            {
            }

            public void onAnimationStart(Animation animation2)
            {
            }

            
            {
                this$0 = MaterialProgressDrawable.this;
                ring = ring1;
                super();
            }
        });
        Animation animation1 = new Animation() {

            final MaterialProgressDrawable this$0;
            final Ring val$ring;

            public void applyTransformation(float f, Transformation transformation)
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
            }

            
            {
                this$0 = MaterialProgressDrawable.this;
                ring = ring1;
                super();
            }
        };
        animation1.setRepeatCount(-1);
        animation1.setRepeatMode(1);
        animation1.setInterpolator(LINEAR_INTERPOLATOR);
        animation1.setDuration(1333L);
        animation1.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MaterialProgressDrawable this$0;
            final Ring val$ring;

            public void onAnimationEnd(Animation animation2)
            {
            }

            public void onAnimationRepeat(Animation animation2)
            {
                ring.storeOriginals();
                ring.goToNextColor();
                ring.setStartTrim(ring.getEndTrim());
                mRotationCount = (mRotationCount + 1.0F) % 5F;
            }

            public void onAnimationStart(Animation animation2)
            {
                mRotationCount = 0.0F;
            }

            
            {
                this$0 = MaterialProgressDrawable.this;
                ring = ring1;
                super();
            }
        });
        mFinishAnimation = animation;
        mAnimation = animation1;
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
            mParent.startAnimation(mFinishAnimation);
            return;
        } else
        {
            mRing.setColorIndex(0);
            mRing.resetOriginals();
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
    static float access$602(MaterialProgressDrawable materialprogressdrawable, float f)
    {
        materialprogressdrawable.mRotationCount = f;
        return f;
    }

*/
}
