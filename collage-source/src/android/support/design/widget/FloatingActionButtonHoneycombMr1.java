// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButtonEclairMr1, ShadowDrawableWrapper, CircularBorderDrawable, AnimationUtils, 
//            ShadowViewDelegate

class FloatingActionButtonHoneycombMr1 extends FloatingActionButtonEclairMr1
{

    private boolean mIsHiding;

    FloatingActionButtonHoneycombMr1(View view, ShadowViewDelegate shadowviewdelegate)
    {
        super(view, shadowviewdelegate);
    }

    private void updateFromViewRotation(float f)
    {
        if (mShadowDrawable != null)
        {
            mShadowDrawable.setRotation(-f);
        }
        if (mBorderDrawable != null)
        {
            mBorderDrawable.setRotation(-f);
        }
    }

    void hide(final FloatingActionButtonImpl.InternalVisibilityChangedListener listener)
    {
        if (mIsHiding || mView.getVisibility() != 0)
        {
            if (listener != null)
            {
                listener.onHidden();
            }
        } else
        if (!ViewCompat.isLaidOut(mView) || mView.isInEditMode())
        {
            mView.setVisibility(8);
            if (listener != null)
            {
                listener.onHidden();
                return;
            }
        } else
        {
            mView.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F).setDuration(200L).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new AnimatorListenerAdapter() {

                final FloatingActionButtonHoneycombMr1 this$0;
                final FloatingActionButtonImpl.InternalVisibilityChangedListener val$listener;

                public void onAnimationCancel(Animator animator)
                {
                    mIsHiding = false;
                }

                public void onAnimationEnd(Animator animator)
                {
                    mIsHiding = false;
                    mView.setVisibility(8);
                    if (listener != null)
                    {
                        listener.onHidden();
                    }
                }

                public void onAnimationStart(Animator animator)
                {
                    mIsHiding = true;
                    mView.setVisibility(0);
                }

            
            {
                this$0 = FloatingActionButtonHoneycombMr1.this;
                listener = internalvisibilitychangedlistener;
                super();
            }
            });
            return;
        }
    }

    void onPreDraw()
    {
        updateFromViewRotation(mView.getRotation());
    }

    boolean requirePreDrawListener()
    {
        return true;
    }

    void show(final FloatingActionButtonImpl.InternalVisibilityChangedListener listener)
    {
        if (mView.getVisibility() != 0)
        {
            if (ViewCompat.isLaidOut(mView) && !mView.isInEditMode())
            {
                mView.setAlpha(0.0F);
                mView.setScaleY(0.0F);
                mView.setScaleX(0.0F);
                mView.animate().scaleX(1.0F).scaleY(1.0F).alpha(1.0F).setDuration(200L).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setListener(new AnimatorListenerAdapter() {

                    final FloatingActionButtonHoneycombMr1 this$0;
                    final FloatingActionButtonImpl.InternalVisibilityChangedListener val$listener;

                    public void onAnimationEnd(Animator animator)
                    {
                        if (listener != null)
                        {
                            listener.onShown();
                        }
                    }

                    public void onAnimationStart(Animator animator)
                    {
                        mView.setVisibility(0);
                    }

            
            {
                this$0 = FloatingActionButtonHoneycombMr1.this;
                listener = internalvisibilitychangedlistener;
                super();
            }
                });
            } else
            {
                mView.setVisibility(0);
                mView.setAlpha(1.0F);
                mView.setScaleY(1.0F);
                mView.setScaleX(1.0F);
                if (listener != null)
                {
                    listener.onShown();
                    return;
                }
            }
        }
    }


/*
    static boolean access$002(FloatingActionButtonHoneycombMr1 floatingactionbuttonhoneycombmr1, boolean flag)
    {
        floatingactionbuttonhoneycombmr1.mIsHiding = flag;
        return flag;
    }

*/
}
