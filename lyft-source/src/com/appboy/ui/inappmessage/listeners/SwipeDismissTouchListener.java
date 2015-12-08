// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;

public class SwipeDismissTouchListener
    implements android.view.View.OnTouchListener
{

    private long mAnimationTime;
    private DismissCallbacks mCallbacks;
    private float mDownX;
    private float mDownY;
    private int mMaxFlingVelocity;
    private int mMinFlingVelocity;
    private int mSlop;
    private boolean mSwiping;
    private int mSwipingSlop;
    private Object mToken;
    private float mTranslationX;
    private VelocityTracker mVelocityTracker;
    private View mView;
    private int mViewWidth;

    public SwipeDismissTouchListener(View view, Object obj, DismissCallbacks dismisscallbacks)
    {
        mViewWidth = 1;
        ViewConfiguration viewconfiguration = ViewConfiguration.get(view.getContext());
        mSlop = viewconfiguration.getScaledTouchSlop();
        mMinFlingVelocity = viewconfiguration.getScaledMinimumFlingVelocity() * 16;
        mMaxFlingVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
        mAnimationTime = view.getContext().getResources().getInteger(0x10e0000);
        mView = view;
        mToken = obj;
        mCallbacks = dismisscallbacks;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        motionevent.offsetLocation(mTranslationX, 0.0F);
        if (mViewWidth < 2)
        {
            mViewWidth = mView.getWidth();
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 68
    //                   0 70
    //                   1 119
    //                   2 549
    //                   3 481;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return false;
_L2:
        mDownX = motionevent.getRawX();
        mDownY = motionevent.getRawY();
        if (mCallbacks.canDismiss(mToken))
        {
            mVelocityTracker = VelocityTracker.obtain();
            mVelocityTracker.addMovement(motionevent);
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mVelocityTracker != null)
        {
            float f = motionevent.getRawX() - mDownX;
            mVelocityTracker.addMovement(motionevent);
            mVelocityTracker.computeCurrentVelocity(1000);
            float f1 = mVelocityTracker.getXVelocity();
            float f2 = Math.abs(f1);
            float f3 = Math.abs(mVelocityTracker.getYVelocity());
            int i;
            if (Math.abs(f) > (float)(mViewWidth / 2) && mSwiping)
            {
                if (f > 0.0F)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
            } else
            if ((float)mMinFlingVelocity <= f2 && f2 <= (float)mMaxFlingVelocity && f3 < f2 && f3 < f2 && mSwiping)
            {
                if (f1 < 0.0F)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (f < 0.0F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (i == flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (mVelocityTracker.getXVelocity() > 0.0F)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                flag1 = i;
                i = ((flag) ? 1 : 0);
                flag = flag1;
            } else
            {
                i = 0;
                flag = false;
            }
            if (flag)
            {
                view = mView.animate();
                if (i != 0)
                {
                    f = mViewWidth;
                } else
                {
                    f = -mViewWidth;
                }
                view.translationX(f).alpha(0.0F).setDuration(mAnimationTime).setListener(new AnimatorListenerAdapter() {

                    final SwipeDismissTouchListener this$0;

                    public void onAnimationEnd(Animator animator)
                    {
                        performDismiss();
                    }

            
            {
                this$0 = SwipeDismissTouchListener.this;
                super();
            }
                });
            } else
            if (mSwiping)
            {
                mView.animate().translationX(0.0F).alpha(1.0F).setDuration(mAnimationTime).setListener(null);
            }
            mVelocityTracker.recycle();
            mVelocityTracker = null;
            mTranslationX = 0.0F;
            mDownX = 0.0F;
            mDownY = 0.0F;
            mSwiping = false;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (mVelocityTracker != null)
        {
            mView.animate().translationX(0.0F).alpha(1.0F).setDuration(mAnimationTime).setListener(null);
            mVelocityTracker.recycle();
            mVelocityTracker = null;
            mTranslationX = 0.0F;
            mDownX = 0.0F;
            mDownY = 0.0F;
            mSwiping = false;
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (mVelocityTracker != null)
        {
            mVelocityTracker.addMovement(motionevent);
            f = motionevent.getRawX() - mDownX;
            f1 = motionevent.getRawY();
            f2 = mDownY;
            if (Math.abs(f) > (float)mSlop && Math.abs(f1 - f2) < Math.abs(f) / 2.0F)
            {
                mSwiping = true;
                if (f > 0.0F)
                {
                    i = mSlop;
                } else
                {
                    i = -mSlop;
                }
                mSwipingSlop = i;
                mView.getParent().requestDisallowInterceptTouchEvent(true);
                view = MotionEvent.obtain(motionevent);
                view.setAction(motionevent.getActionIndex() << 8 | 3);
                mView.onTouchEvent(view);
                view.recycle();
            }
            if (mSwiping)
            {
                mTranslationX = f;
                mView.setTranslationX(f - (float)mSwipingSlop);
                return true;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void performDismiss()
    {
        final android.view.ViewGroup.LayoutParams lp = mView.getLayoutParams();
        final int originalHeight = mView.getHeight();
        ValueAnimator valueanimator = ValueAnimator.ofInt(new int[] {
            originalHeight, 1
        }).setDuration(mAnimationTime);
        valueanimator.addListener(new AnimatorListenerAdapter() {

            final SwipeDismissTouchListener this$0;
            final android.view.ViewGroup.LayoutParams val$lp;
            final int val$originalHeight;

            public void onAnimationEnd(Animator animator)
            {
                mCallbacks.onDismiss(mView, mToken);
                mView.setAlpha(1.0F);
                mView.setTranslationX(0.0F);
                lp.height = originalHeight;
                mView.setLayoutParams(lp);
            }

            
            {
                this$0 = SwipeDismissTouchListener.this;
                lp = layoutparams;
                originalHeight = i;
                super();
            }
        });
        valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

            final SwipeDismissTouchListener this$0;
            final android.view.ViewGroup.LayoutParams val$lp;

            public void onAnimationUpdate(ValueAnimator valueanimator1)
            {
                lp.height = ((Integer)valueanimator1.getAnimatedValue()).intValue();
                mView.setLayoutParams(lp);
            }

            
            {
                this$0 = SwipeDismissTouchListener.this;
                lp = layoutparams;
                super();
            }
        });
        valueanimator.start();
    }




    private class DismissCallbacks
    {

        public abstract boolean canDismiss(Object obj);

        public abstract void onDismiss(View view, Object obj);
    }

}
