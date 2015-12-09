// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.swipedismiss;

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

public final class SwipeDismissTouchListener
    implements android.view.View.OnTouchListener
{
    public static interface DismissCallbacks
    {

        public abstract boolean canDismiss(Object obj);

        public abstract void onDismiss(View view, Object obj);
    }


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
        mMinFlingVelocity = viewconfiguration.getScaledMinimumFlingVelocity() << 4;
        mMaxFlingVelocity = viewconfiguration.getScaledMaximumFlingVelocity();
        mAnimationTime = view.getContext().getResources().getInteger(0x10e0000);
        mView = view;
        mToken = obj;
        mCallbacks = dismisscallbacks;
    }

    private void performDismiss()
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

            public final void onAnimationEnd(Animator animator)
            {
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

            public final void onAnimationUpdate(ValueAnimator valueanimator1)
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

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.offsetLocation(mTranslationX, 0.0F);
        if (mViewWidth < 2)
        {
            mViewWidth = mView.getWidth();
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 64
    //                   0 66
    //                   1 115
    //                   2 593
    //                   3 524;
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
        }
        return false;
_L3:
        if (mVelocityTracker != null)
        {
            float f = motionevent.getRawX() - mDownX;
            mVelocityTracker.addMovement(motionevent);
            mVelocityTracker.computeCurrentVelocity(1000);
            float f2 = mVelocityTracker.getXVelocity();
            float f4 = Math.abs(f2);
            float f6 = Math.abs(mVelocityTracker.getYVelocity());
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag;
            boolean flag1;
            if (Math.abs(f) > (float)(mViewWidth / 2))
            {
                flag1 = true;
                if (f > 0.0F)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag1 = flag2;
                flag = flag3;
                if ((float)mMinFlingVelocity <= f4)
                {
                    flag1 = flag2;
                    flag = flag3;
                    if (f4 <= (float)mMaxFlingVelocity)
                    {
                        flag1 = flag2;
                        flag = flag3;
                        if (f6 < f4)
                        {
                            flag1 = flag2;
                            flag = flag3;
                            if (f6 < f4)
                            {
                                flag1 = flag2;
                                flag = flag3;
                                if (mSwiping)
                                {
                                    if (f2 < 0.0F)
                                    {
                                        flag = true;
                                    } else
                                    {
                                        flag = false;
                                    }
                                    if (f < 0.0F)
                                    {
                                        flag1 = true;
                                    } else
                                    {
                                        flag1 = false;
                                    }
                                    if (flag == flag1)
                                    {
                                        flag1 = true;
                                    } else
                                    {
                                        flag1 = false;
                                    }
                                    if (mVelocityTracker.getXVelocity() > 0.0F)
                                    {
                                        flag = true;
                                    } else
                                    {
                                        flag = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (flag1)
            {
                mCallbacks.onDismiss(mView, mToken);
                view = mView.animate();
                if (flag)
                {
                    f = mViewWidth;
                } else
                {
                    f = -mViewWidth;
                }
                view.translationX(f).alpha(0.0F).setDuration(mAnimationTime).setListener(new AnimatorListenerAdapter() {

                    final SwipeDismissTouchListener this$0;

                    public final void onAnimationEnd(Animator animator)
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
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (mVelocityTracker != null)
        {
            mVelocityTracker.addMovement(motionevent);
            float f1 = motionevent.getRawX() - mDownX;
            float f3 = motionevent.getRawY();
            float f5 = mDownY;
            if (Math.abs(f1) > (float)mSlop && Math.abs(f3 - f5) < Math.abs(f1) / 2.0F)
            {
                mSwiping = true;
                int i;
                if (f1 > 0.0F)
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
                mTranslationX = f1;
                mView.setTranslationX(f1 - (float)mSwipingSlop);
                mView.setAlpha(Math.max(0.0F, Math.min(1.0F, 1.0F - (2.0F * Math.abs(f1)) / (float)mViewWidth)));
                return true;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }


}
