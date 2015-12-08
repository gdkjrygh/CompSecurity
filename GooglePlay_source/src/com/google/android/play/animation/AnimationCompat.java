// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.animation;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public final class AnimationCompat
{

    public float mAlpha;
    public float mScale;
    private float mTranslationX;
    public float mTranslationY;
    public final View mView;

    public AnimationCompat(View view)
    {
        mAlpha = 1.0F;
        mTranslationY = 0.0F;
        mTranslationX = 0.0F;
        mScale = 1.0F;
        mView = view;
    }

    public final void animateAlpha$2549578(final float toAlpha)
    {
        if (mView == null)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            mView.animate().alpha(toAlpha).setDuration(200L);
            return;
        }
        AlphaAnimation alphaanimation = new AlphaAnimation(mAlpha, toAlpha);
        alphaanimation.setDuration(200L);
        alphaanimation.setFillAfter(true);
        if (android.os.Build.VERSION.SDK_INT < 12)
        {
            alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final AnimationCompat this$0;
                final float val$toAlpha;

                public final void onAnimationEnd(Animation animation)
                {
                    mAlpha = toAlpha;
                }

                public final void onAnimationRepeat(Animation animation)
                {
                }

                public final void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$0 = AnimationCompat.this;
                toAlpha = f;
                super();
            }
            });
        }
        mView.startAnimation(alphaanimation);
    }

    public final void animateZ(float f, int i, int j)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mView.animate().z(f).setDuration(i).setStartDelay(j);
        }
    }

    public final void setAlpha(float f)
    {
        if (mView != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                mView.setAlpha(f);
                return;
            }
            if (mAlpha != f)
            {
                mAlpha = f;
                AlphaAnimation alphaanimation = new AlphaAnimation(f, f);
                alphaanimation.setDuration(0L);
                alphaanimation.setFillAfter(true);
                mView.startAnimation(alphaanimation);
                return;
            }
        }
    }

    public final void setTranslationY(float f)
    {
        if (mView == null)
        {
            mTranslationY = f;
        } else
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                mView.setTranslationY(f);
                return;
            }
            if (mTranslationY != f)
            {
                mTranslationY = f;
                TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, f, f);
                translateanimation.setDuration(0L);
                translateanimation.setFillAfter(true);
                mView.startAnimation(translateanimation);
                return;
            }
        }
    }

    // Unreferenced inner class com/google/android/play/animation/AnimationCompat$2

/* anonymous class */
    public final class _cls2
        implements android.view.animation.Animation.AnimationListener
    {

        final AnimationCompat this$0;
        final float val$toScale;

        public final void onAnimationEnd(Animation animation)
        {
            mScale = toScale;
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
        }

            public 
            {
                this$0 = AnimationCompat.this;
                toScale = f;
                super();
            }
    }

}
