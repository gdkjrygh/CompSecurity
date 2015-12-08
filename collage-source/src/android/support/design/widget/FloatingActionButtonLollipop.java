// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButtonHoneycombMr1, CircularBorderDrawableLollipop, ShadowViewDelegate, CircularBorderDrawable

class FloatingActionButtonLollipop extends FloatingActionButtonHoneycombMr1
{

    private Interpolator mInterpolator;

    FloatingActionButtonLollipop(View view, ShadowViewDelegate shadowviewdelegate)
    {
        super(view, shadowviewdelegate);
        if (!view.isInEditMode())
        {
            mInterpolator = AnimationUtils.loadInterpolator(mView.getContext(), 0x10c000d);
        }
    }

    private Animator setupAnimator(Animator animator)
    {
        animator.setInterpolator(mInterpolator);
        return animator;
    }

    void jumpDrawableToCurrentState()
    {
    }

    CircularBorderDrawable newCircularDrawable()
    {
        return new CircularBorderDrawableLollipop();
    }

    void onDrawableStateChanged(int ai[])
    {
    }

    boolean requirePreDrawListener()
    {
        return false;
    }

    void setBackgroundDrawable(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode, int i, int j)
    {
        mShapeDrawable = DrawableCompat.wrap(createShapeDrawable());
        DrawableCompat.setTintList(mShapeDrawable, colorstatelist);
        if (mode != null)
        {
            DrawableCompat.setTintMode(mShapeDrawable, mode);
        }
        if (j > 0)
        {
            mBorderDrawable = createBorderDrawable(j, colorstatelist);
            colorstatelist = new LayerDrawable(new Drawable[] {
                mBorderDrawable, mShapeDrawable
            });
        } else
        {
            mBorderDrawable = null;
            colorstatelist = mShapeDrawable;
        }
        mRippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), colorstatelist, null);
        mShadowViewDelegate.setBackgroundDrawable(mRippleDrawable);
        mShadowViewDelegate.setShadowPadding(0, 0, 0, 0);
    }

    public void setElevation(float f)
    {
        ViewCompat.setElevation(mView, f);
    }

    void setPressedTranslationZ(float f)
    {
        StateListAnimator statelistanimator = new StateListAnimator();
        statelistanimator.addState(PRESSED_ENABLED_STATE_SET, setupAnimator(ObjectAnimator.ofFloat(mView, "translationZ", new float[] {
            f
        })));
        statelistanimator.addState(FOCUSED_ENABLED_STATE_SET, setupAnimator(ObjectAnimator.ofFloat(mView, "translationZ", new float[] {
            f
        })));
        statelistanimator.addState(EMPTY_STATE_SET, setupAnimator(ObjectAnimator.ofFloat(mView, "translationZ", new float[] {
            0.0F
        })));
        mView.setStateListAnimator(statelistanimator);
    }

    void setRippleColor(int i)
    {
        if (mRippleDrawable instanceof RippleDrawable)
        {
            ((RippleDrawable)mRippleDrawable).setColor(ColorStateList.valueOf(i));
            return;
        } else
        {
            super.setRippleColor(i);
            return;
        }
    }
}
