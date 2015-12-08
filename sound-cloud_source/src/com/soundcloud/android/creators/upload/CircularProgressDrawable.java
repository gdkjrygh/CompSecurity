// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class CircularProgressDrawable extends Drawable
    implements Animatable
{

    private static final int ANGLE_ANIMATOR_DURATION = 2000;
    private static final Interpolator ANGLE_INTERPOLATOR = new LinearInterpolator();
    private static final int MIN_SWEEP_ANGLE = 30;
    private static final int START_ANGLE = 270;
    private static final int SWEEP_ANIMATOR_DURATION = 600;
    private static final Interpolator SWEEP_INTERPOLATOR = new DecelerateInterpolator();
    private final RectF fBounds = new RectF();
    private Property mAngleProperty;
    private float mBorderWidth;
    private float mCurrentGlobalAngle;
    private float mCurrentGlobalAngleOffset;
    private float mCurrentSweepAngle;
    private boolean mModeAppearing;
    private ObjectAnimator mObjectAnimatorAngle;
    private ObjectAnimator mObjectAnimatorProgress;
    private ObjectAnimator mObjectAnimatorSweep;
    private Paint mPaint;
    private boolean mRunning;
    private Property mSweepProperty;

    public CircularProgressDrawable(float f, int i)
    {
        mAngleProperty = new _cls1(java/lang/Float, "angle");
        mSweepProperty = new _cls2(java/lang/Float, "arc");
        mBorderWidth = f;
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mPaint.setStrokeWidth(f);
        mPaint.setColor(i);
        setupAnimations();
    }

    private void cancelProgressAnimation()
    {
        if (mObjectAnimatorProgress != null)
        {
            mObjectAnimatorProgress.cancel();
        }
    }

    private void setupAnimations()
    {
        mObjectAnimatorAngle = ObjectAnimator.ofFloat(this, mAngleProperty, new float[] {
            360F
        });
        mObjectAnimatorAngle.setInterpolator(ANGLE_INTERPOLATOR);
        mObjectAnimatorAngle.setDuration(2000L);
        mObjectAnimatorAngle.setRepeatMode(1);
        mObjectAnimatorAngle.setRepeatCount(-1);
        mObjectAnimatorSweep = ObjectAnimator.ofFloat(this, mSweepProperty, new float[] {
            300F
        });
        mObjectAnimatorSweep.setInterpolator(SWEEP_INTERPOLATOR);
        mObjectAnimatorSweep.setDuration(600L);
        mObjectAnimatorSweep.setRepeatMode(1);
        mObjectAnimatorSweep.setRepeatCount(-1);
        mObjectAnimatorSweep.addListener(new _cls3());
    }

    private void startProgress(int i)
    {
        mObjectAnimatorProgress = ObjectAnimator.ofFloat(this, mSweepProperty, new float[] {
            (360F * (float)i) / 100F
        });
        mObjectAnimatorProgress.setInterpolator(SWEEP_INTERPOLATOR);
        mObjectAnimatorProgress.setDuration(600L);
        mObjectAnimatorProgress.setRepeatMode(1);
        mObjectAnimatorProgress.setRepeatCount(0);
        mObjectAnimatorProgress.start();
    }

    private void toggleAppearingMode()
    {
        boolean flag;
        if (!mModeAppearing)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mModeAppearing = flag;
        if (mModeAppearing)
        {
            mCurrentGlobalAngleOffset = (mCurrentGlobalAngleOffset + 60F) % 360F;
        }
    }

    public void draw(Canvas canvas)
    {
        float f;
        float f1;
        if (mRunning)
        {
            f = mCurrentGlobalAngle - mCurrentGlobalAngleOffset;
            f1 = mCurrentSweepAngle;
            if (!mModeAppearing)
            {
                f += f1;
                f1 = 360F - f1 - 30F;
            } else
            {
                f1 = 30F + f1;
            }
        } else
        {
            f = 270F;
            f1 = mCurrentSweepAngle;
        }
        canvas.drawArc(fBounds, f, f1, false, mPaint);
    }

    public float getCurrentGlobalAngle()
    {
        return mCurrentGlobalAngle;
    }

    public float getCurrentSweepAngle()
    {
        return mCurrentSweepAngle;
    }

    public int getOpacity()
    {
        return -2;
    }

    public boolean isRunning()
    {
        return mRunning;
    }

    protected void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        fBounds.left = (float)rect.left + mBorderWidth / 2.0F + 0.5F;
        fBounds.right = (float)rect.right - mBorderWidth / 2.0F - 0.5F;
        fBounds.top = (float)rect.top + mBorderWidth / 2.0F + 0.5F;
        fBounds.bottom = (float)rect.bottom - mBorderWidth / 2.0F - 0.5F;
    }

    public void setAlpha(int i)
    {
        mPaint.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        mPaint.setColorFilter(colorfilter);
    }

    public void setCurrentGlobalAngle(float f)
    {
        mCurrentGlobalAngle = f;
        invalidateSelf();
    }

    public void setCurrentSweepAngle(float f)
    {
        mCurrentSweepAngle = f;
        invalidateSelf();
    }

    public void setProgress(int i)
    {
        startProgress(i);
        invalidateSelf();
    }

    public void start()
    {
        if (isRunning())
        {
            return;
        } else
        {
            mRunning = true;
            cancelProgressAnimation();
            mObjectAnimatorAngle.start();
            mObjectAnimatorSweep.start();
            invalidateSelf();
            return;
        }
    }

    public void stop()
    {
        if (!isRunning())
        {
            return;
        } else
        {
            mRunning = false;
            mCurrentSweepAngle = 0.0F;
            mObjectAnimatorAngle.cancel();
            mObjectAnimatorSweep.cancel();
            cancelProgressAnimation();
            invalidateSelf();
            return;
        }
    }



    private class _cls1 extends Property
    {

        final CircularProgressDrawable this$0;

        public Float get(CircularProgressDrawable circularprogressdrawable)
        {
            return Float.valueOf(circularprogressdrawable.getCurrentGlobalAngle());
        }

        public volatile Object get(Object obj)
        {
            return get((CircularProgressDrawable)obj);
        }

        public void set(CircularProgressDrawable circularprogressdrawable, Float float1)
        {
            circularprogressdrawable.setCurrentGlobalAngle(float1.floatValue());
        }

        public volatile void set(Object obj, Object obj1)
        {
            set((CircularProgressDrawable)obj, (Float)obj1);
        }

        _cls1(Class class1, String s)
        {
            this$0 = CircularProgressDrawable.this;
            super(class1, s);
        }
    }


    private class _cls2 extends Property
    {

        final CircularProgressDrawable this$0;

        public Float get(CircularProgressDrawable circularprogressdrawable)
        {
            return Float.valueOf(circularprogressdrawable.getCurrentSweepAngle());
        }

        public volatile Object get(Object obj)
        {
            return get((CircularProgressDrawable)obj);
        }

        public void set(CircularProgressDrawable circularprogressdrawable, Float float1)
        {
            circularprogressdrawable.setCurrentSweepAngle(float1.floatValue());
        }

        public volatile void set(Object obj, Object obj1)
        {
            set((CircularProgressDrawable)obj, (Float)obj1);
        }

        _cls2(Class class1, String s)
        {
            this$0 = CircularProgressDrawable.this;
            super(class1, s);
        }
    }


    private class _cls3
        implements android.animation.Animator.AnimatorListener
    {

        final CircularProgressDrawable this$0;

        public void onAnimationCancel(Animator animator)
        {
        }

        public void onAnimationEnd(Animator animator)
        {
        }

        public void onAnimationRepeat(Animator animator)
        {
            toggleAppearingMode();
        }

        public void onAnimationStart(Animator animator)
        {
        }

        _cls3()
        {
            this$0 = CircularProgressDrawable.this;
            super();
        }
    }

}
