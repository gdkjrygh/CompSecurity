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

final class MaterialProgressDrawable extends Drawable
    implements Animatable
{
    private class Ring
    {

        int mAlpha;
        Path mArrow;
        int mArrowHeight;
        final Paint mArrowPaint = new Paint();
        float mArrowScale;
        int mArrowWidth;
        int mBackgroundColor;
        private final android.graphics.drawable.Drawable.Callback mCallback;
        final Paint mCirclePaint = new Paint(1);
        int mColorIndex;
        int mColors[];
        int mCurrentColor;
        float mEndTrim;
        final Paint mPaint = new Paint();
        double mRingCenterRadius;
        float mRotation;
        boolean mShowArrow;
        float mStartTrim;
        float mStartingEndTrim;
        float mStartingRotation;
        float mStartingStartTrim;
        float mStrokeInset;
        float mStrokeWidth;
        final RectF mTempBounds = new RectF();

        final int getNextColorIndex()
        {
            return (mColorIndex + 1) % mColors.length;
        }

        final void invalidateSelf()
        {
            mCallback.invalidateDrawable(null);
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

        public final void setColorIndex(int i)
        {
            mColorIndex = i;
            mCurrentColor = mColors[mColorIndex];
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


    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
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
    final Ring mRing;
    private float mRotation;
    private float mRotationCount;
    private double mWidth;

    public MaterialProgressDrawable(final Context ring, View view)
    {
        mParent = view;
        mResources = ring.getResources();
        mRing = new Ring(mCallback);
        mRing.setColors(COLORS);
        ring = mRing;
        float f = mResources.getDisplayMetrics().density;
        mWidth = (double)f * 40D;
        mHeight = (double)f * 40D;
        float f1 = 2.5F * f;
        ring.mStrokeWidth = f1;
        ((Ring) (ring)).mPaint.setStrokeWidth(f1);
        ring.invalidateSelf();
        ring.mRingCenterRadius = 8.75D * (double)f;
        ring.setColorIndex(0);
        ring.mArrowWidth = (int)(10F * f);
        ring.mArrowHeight = (int)(f * 5F);
        f = Math.min((int)mWidth, (int)mHeight);
        if (((Ring) (ring)).mRingCenterRadius <= 0.0D || f < 0.0F)
        {
            f = (float)Math.ceil(((Ring) (ring)).mStrokeWidth / 2.0F);
        } else
        {
            f = (float)((double)(f / 2.0F) - ((Ring) (ring)).mRingCenterRadius);
        }
        ring.mStrokeInset = f;
        ring = mRing;
        view = new Animation() {

            final MaterialProgressDrawable this$0;
            final Ring val$ring;

            public final void applyTransformation(float f2, Transformation transformation)
            {
                if (mFinishing)
                {
                    MaterialProgressDrawable.updateRingColor(MaterialProgressDrawable.this, f2, ring);
                    return;
                }
                float f3 = MaterialProgressDrawable.getMinProgressArc(ring);
                float f4 = ring.mStartingEndTrim;
                float f6 = ring.mStartingStartTrim;
                float f5 = ring.mStartingRotation;
                MaterialProgressDrawable.updateRingColor(MaterialProgressDrawable.this, f2, ring);
                if (f2 <= 0.5F)
                {
                    float f8 = f2 / 0.5F;
                    f8 = MaterialProgressDrawable.MATERIAL_INTERPOLATOR.getInterpolation(f8);
                    ring.setStartTrim(f6 + (0.8F - f3) * f8);
                }
                if (f2 > 0.5F)
                {
                    float f7 = (f2 - 0.5F) / 0.5F;
                    f7 = MaterialProgressDrawable.MATERIAL_INTERPOLATOR.getInterpolation(f7);
                    ring.setEndTrim(f4 + f7 * (0.8F - f3));
                }
                ring.setRotation(f5 + 0.25F * f2);
                f3 = mRotationCount / 5F;
                setRotation(216F * f2 + 1080F * f3);
            }

            
            {
                this$0 = MaterialProgressDrawable.this;
                ring = ring1;
                super();
            }
        };
        view.setRepeatCount(-1);
        view.setRepeatMode(1);
        view.setInterpolator(LINEAR_INTERPOLATOR);
        view.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final MaterialProgressDrawable this$0;
            final Ring val$ring;

            public final void onAnimationEnd(Animation animation)
            {
            }

            public final void onAnimationRepeat(Animation animation)
            {
                ring.storeOriginals();
                Ring ring1 = ring;
                ring1.setColorIndex(ring1.getNextColorIndex());
                ring.setStartTrim(ring.mEndTrim);
                if (mFinishing)
                {
                    mFinishing = false;
                    animation.setDuration(1332L);
                    ring.setShowArrow(false);
                    return;
                } else
                {
                    mRotationCount = (mRotationCount + 1.0F) % 5F;
                    return;
                }
            }

            public final void onAnimationStart(Animation animation)
            {
                mRotationCount = 0.0F;
            }

            
            {
                this$0 = MaterialProgressDrawable.this;
                ring = ring1;
                super();
            }
        });
        mAnimation = view;
    }

    private static float getMinProgressArc(Ring ring)
    {
        return (float)Math.toRadians((double)ring.mStrokeWidth / (6.2831853071795862D * ring.mRingCenterRadius));
    }

    private static void updateRingColor(float f, Ring ring)
    {
        if (f > 0.75F)
        {
            f = (f - 0.75F) / 0.25F;
            int i = ring.mColors[ring.mColorIndex];
            int i1 = ring.mColors[ring.getNextColorIndex()];
            int l = Integer.valueOf(i).intValue();
            i = l >> 24 & 0xff;
            int j = l >> 16 & 0xff;
            int k = l >> 8 & 0xff;
            l &= 0xff;
            i1 = Integer.valueOf(i1).intValue();
            int j1 = (int)((float)((i1 >> 24 & 0xff) - i) * f);
            int k1 = (int)((float)((i1 >> 16 & 0xff) - j) * f);
            int l1 = (int)((float)((i1 >> 8 & 0xff) - k) * f);
            ring.mCurrentColor = (int)(f * (float)((i1 & 0xff) - l)) + l | (i + j1 << 24 | j + k1 << 16 | l1 + k << 8);
        }
    }

    public final void draw(Canvas canvas)
    {
        Rect rect = getBounds();
        int i = canvas.save();
        canvas.rotate(mRotation, rect.exactCenterX(), rect.exactCenterY());
        Ring ring = mRing;
        RectF rectf = ring.mTempBounds;
        rectf.set(rect);
        rectf.inset(ring.mStrokeInset, ring.mStrokeInset);
        float f = 360F * (ring.mStartTrim + ring.mRotation);
        float f1 = (ring.mEndTrim + ring.mRotation) * 360F - f;
        ring.mPaint.setColor(ring.mCurrentColor);
        canvas.drawArc(rectf, f, f1, false, ring.mPaint);
        if (ring.mShowArrow)
        {
            float f2;
            float f3;
            float f4;
            float f5;
            if (ring.mArrow == null)
            {
                ring.mArrow = new Path();
                ring.mArrow.setFillType(android.graphics.Path.FillType.EVEN_ODD);
            } else
            {
                ring.mArrow.reset();
            }
            f2 = (int)ring.mStrokeInset / 2;
            f3 = ring.mArrowScale;
            f4 = (float)(ring.mRingCenterRadius * Math.cos(0.0D) + (double)rect.exactCenterX());
            f5 = (float)(ring.mRingCenterRadius * Math.sin(0.0D) + (double)rect.exactCenterY());
            ring.mArrow.moveTo(0.0F, 0.0F);
            ring.mArrow.lineTo((float)ring.mArrowWidth * ring.mArrowScale, 0.0F);
            ring.mArrow.lineTo(((float)ring.mArrowWidth * ring.mArrowScale) / 2.0F, (float)ring.mArrowHeight * ring.mArrowScale);
            ring.mArrow.offset(f4 - f2 * f3, f5);
            ring.mArrow.close();
            ring.mArrowPaint.setColor(ring.mCurrentColor);
            canvas.rotate((f + f1) - 5F, rect.exactCenterX(), rect.exactCenterY());
            canvas.drawPath(ring.mArrow, ring.mArrowPaint);
        }
        if (ring.mAlpha < 255)
        {
            ring.mCirclePaint.setColor(ring.mBackgroundColor);
            ring.mCirclePaint.setAlpha(255 - ring.mAlpha);
            canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), rect.width() / 2, ring.mCirclePaint);
        }
        canvas.restoreToCount(i);
    }

    public final int getAlpha()
    {
        return mRing.mAlpha;
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
        mRing.mAlpha = i;
    }

    public final void setArrowScale(float f)
    {
        Ring ring = mRing;
        if (f != ring.mArrowScale)
        {
            ring.mArrowScale = f;
            ring.invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        Ring ring = mRing;
        ring.mPaint.setColorFilter(colorfilter);
        ring.invalidateSelf();
    }

    final void setRotation(float f)
    {
        mRotation = f;
        invalidateSelf();
    }

    public final void setStartEndTrim$2548a35(float f)
    {
        mRing.setStartTrim(0.0F);
        mRing.setEndTrim(f);
    }

    public final void showArrow(boolean flag)
    {
        mRing.setShowArrow(flag);
    }

    public final void start()
    {
        mAnimation.reset();
        mRing.storeOriginals();
        if (mRing.mEndTrim != mRing.mStartTrim)
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

    public final void stop()
    {
        mParent.clearAnimation();
        setRotation(0.0F);
        mRing.setShowArrow(false);
        mRing.setColorIndex(0);
        mRing.resetOriginals();
    }



/*
    static void access$000(MaterialProgressDrawable materialprogressdrawable, float f, Ring ring)
    {
        updateRingColor(f, ring);
        float f1 = (float)(Math.floor(ring.mStartingRotation / 0.8F) + 1.0D);
        float f2 = getMinProgressArc(ring);
        float f3 = ring.mStartingStartTrim;
        ring.setStartTrim((ring.mStartingEndTrim - f2 - ring.mStartingStartTrim) * f + f3);
        ring.setEndTrim(ring.mStartingEndTrim);
        f2 = ring.mStartingRotation;
        ring.setRotation((f1 - ring.mStartingRotation) * f + f2);
        return;
    }

*/






/*
    static float access$402(MaterialProgressDrawable materialprogressdrawable, float f)
    {
        materialprogressdrawable.mRotationCount = f;
        return f;
    }

*/
}
