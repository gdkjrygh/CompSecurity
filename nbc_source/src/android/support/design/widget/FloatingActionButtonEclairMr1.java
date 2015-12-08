// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButtonImpl, StateListAnimator, AnimationUtils, ShadowDrawableWrapper, 
//            ShadowViewDelegate

class FloatingActionButtonEclairMr1 extends FloatingActionButtonImpl
{
    private abstract class BaseShadowAnimation extends Animation
    {

        private float mShadowSizeDiff;
        private float mShadowSizeStart;
        final FloatingActionButtonEclairMr1 this$0;

        protected void applyTransformation(float f, Transformation transformation)
        {
            mShadowDrawable.setShadowSize(mShadowSizeStart + mShadowSizeDiff * f);
        }

        protected abstract float getTargetShadowSize();

        public void reset()
        {
            super.reset();
            mShadowSizeStart = mShadowDrawable.getShadowSize();
            mShadowSizeDiff = getTargetShadowSize() - mShadowSizeStart;
        }

        private BaseShadowAnimation()
        {
            this$0 = FloatingActionButtonEclairMr1.this;
            super();
        }

    }

    private class ElevateToTranslationZAnimation extends BaseShadowAnimation
    {

        final FloatingActionButtonEclairMr1 this$0;

        protected float getTargetShadowSize()
        {
            return mElevation + mPressedTranslationZ;
        }

        private ElevateToTranslationZAnimation()
        {
            this$0 = FloatingActionButtonEclairMr1.this;
            super();
        }

    }

    private class ResetElevationAnimation extends BaseShadowAnimation
    {

        final FloatingActionButtonEclairMr1 this$0;

        protected float getTargetShadowSize()
        {
            return mElevation;
        }

        private ResetElevationAnimation()
        {
            this$0 = FloatingActionButtonEclairMr1.this;
            super();
        }

    }


    private int mAnimationDuration;
    private Drawable mBorderDrawable;
    private float mElevation;
    private boolean mIsHiding;
    private float mPressedTranslationZ;
    private Drawable mRippleDrawable;
    ShadowDrawableWrapper mShadowDrawable;
    private Drawable mShapeDrawable;
    private StateListAnimator mStateListAnimator;

    FloatingActionButtonEclairMr1(View view, ShadowViewDelegate shadowviewdelegate)
    {
        super(view, shadowviewdelegate);
        mAnimationDuration = view.getResources().getInteger(0x10e0000);
        mStateListAnimator = new StateListAnimator();
        mStateListAnimator.setTarget(view);
        mStateListAnimator.addState(PRESSED_ENABLED_STATE_SET, setupAnimation(new ElevateToTranslationZAnimation()));
        mStateListAnimator.addState(FOCUSED_ENABLED_STATE_SET, setupAnimation(new ElevateToTranslationZAnimation()));
        mStateListAnimator.addState(EMPTY_STATE_SET, setupAnimation(new ResetElevationAnimation()));
    }

    private static ColorStateList createColorStateList(int i)
    {
        int ai[][] = new int[3][];
        int ai1[] = new int[3];
        ai[0] = FOCUSED_ENABLED_STATE_SET;
        ai1[0] = i;
        int j = 0 + 1;
        ai[j] = PRESSED_ENABLED_STATE_SET;
        ai1[j] = i;
        i = j + 1;
        ai[i] = new int[0];
        ai1[i] = 0;
        return new ColorStateList(ai, ai1);
    }

    private Animation setupAnimation(Animation animation)
    {
        animation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        animation.setDuration(mAnimationDuration);
        return animation;
    }

    private void updatePadding()
    {
        Rect rect = new Rect();
        mShadowDrawable.getPadding(rect);
        mShadowViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    void hide()
    {
        if (mIsHiding)
        {
            return;
        } else
        {
            Animation animation = AnimationUtils.loadAnimation(mView.getContext(), android.support.design.R.anim.fab_out);
            animation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            animation.setDuration(200L);
            animation.setAnimationListener(new AnimationUtils.AnimationListenerAdapter() {

                final FloatingActionButtonEclairMr1 this$0;

                public void onAnimationEnd(Animation animation1)
                {
                    mIsHiding = false;
                    mView.setVisibility(8);
                }

                public void onAnimationStart(Animation animation1)
                {
                    mIsHiding = true;
                }

            
            {
                this$0 = FloatingActionButtonEclairMr1.this;
                super();
            }
            });
            mView.startAnimation(animation);
            return;
        }
    }

    void jumpDrawableToCurrentState()
    {
        mStateListAnimator.jumpToCurrentState();
    }

    void onDrawableStateChanged(int ai[])
    {
        mStateListAnimator.setState(ai);
    }

    void setBackgroundDrawable(Drawable drawable, ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int i, int j)
    {
        mShapeDrawable = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(mShapeDrawable, colorstatelist);
        if (mode != null)
        {
            DrawableCompat.setTintMode(mShapeDrawable, mode);
        }
        drawable = new GradientDrawable();
        drawable.setShape(1);
        drawable.setColor(-1);
        drawable.setCornerRadius(mShadowViewDelegate.getRadius());
        mRippleDrawable = DrawableCompat.wrap(drawable);
        DrawableCompat.setTintList(mRippleDrawable, createColorStateList(i));
        DrawableCompat.setTintMode(mRippleDrawable, android.graphics.PorterDuff.Mode.MULTIPLY);
        if (j > 0)
        {
            mBorderDrawable = createBorderDrawable(j, colorstatelist);
            drawable = new Drawable[3];
            drawable[0] = mBorderDrawable;
            drawable[1] = mShapeDrawable;
            drawable[2] = mRippleDrawable;
        } else
        {
            mBorderDrawable = null;
            drawable = new Drawable[2];
            drawable[0] = mShapeDrawable;
            drawable[1] = mRippleDrawable;
        }
        mShadowDrawable = new ShadowDrawableWrapper(mView.getResources(), new LayerDrawable(drawable), mShadowViewDelegate.getRadius(), mElevation, mElevation + mPressedTranslationZ);
        mShadowDrawable.setAddPaddingForCorners(false);
        mShadowViewDelegate.setBackgroundDrawable(mShadowDrawable);
        updatePadding();
    }

    void setBackgroundTintList(ColorStateList colorstatelist)
    {
        DrawableCompat.setTintList(mShapeDrawable, colorstatelist);
        if (mBorderDrawable != null)
        {
            DrawableCompat.setTintList(mBorderDrawable, colorstatelist);
        }
    }

    void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
    {
        DrawableCompat.setTintMode(mShapeDrawable, mode);
    }

    void setElevation(float f)
    {
        if (mElevation != f && mShadowDrawable != null)
        {
            mShadowDrawable.setShadowSize(f, mPressedTranslationZ + f);
            mElevation = f;
            updatePadding();
        }
    }

    void setPressedTranslationZ(float f)
    {
        if (mPressedTranslationZ != f && mShadowDrawable != null)
        {
            mPressedTranslationZ = f;
            mShadowDrawable.setMaxShadowSize(mElevation + f);
            updatePadding();
        }
    }

    void setRippleColor(int i)
    {
        DrawableCompat.setTintList(mRippleDrawable, createColorStateList(i));
    }

    void show()
    {
        Animation animation = AnimationUtils.loadAnimation(mView.getContext(), android.support.design.R.anim.fab_in);
        animation.setDuration(200L);
        animation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        mView.startAnimation(animation);
    }


/*
    static boolean access$202(FloatingActionButtonEclairMr1 floatingactionbuttoneclairmr1, boolean flag)
    {
        floatingactionbuttoneclairmr1.mIsHiding = flag;
        return flag;
    }

*/


}
