// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.util.ArrayList;

public final class NoPauseAnimatorWrapper extends Animator
    implements android.animation.Animator.AnimatorListener
{

    private Animator mAnimator;
    ArrayList mListeners;

    public NoPauseAnimatorWrapper(Animator animator)
    {
        mListeners = null;
        mAnimator = animator;
        mAnimator.addListener(this);
    }

    private NoPauseAnimatorWrapper clone()
    {
        NoPauseAnimatorWrapper nopauseanimatorwrapper = (NoPauseAnimatorWrapper)super.clone();
        if (mListeners != null)
        {
            ArrayList arraylist = mListeners;
            nopauseanimatorwrapper.mListeners = new ArrayList();
            int j = arraylist.size();
            for (int i = 0; i < j; i++)
            {
                nopauseanimatorwrapper.mListeners.add(arraylist.get(i));
            }

        }
        return nopauseanimatorwrapper;
    }

    public final void addListener(android.animation.Animator.AnimatorListener animatorlistener)
    {
        if (mListeners == null)
        {
            mListeners = new ArrayList();
        }
        mListeners.add(animatorlistener);
    }

    public final void addPauseListener(android.animation.Animator.AnimatorPauseListener animatorpauselistener)
    {
    }

    public final void cancel()
    {
        mAnimator.cancel();
    }

    public final volatile Animator clone()
    {
        return clone();
    }

    public final volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final void end()
    {
        mAnimator.end();
    }

    public final long getDuration()
    {
        return mAnimator.getDuration();
    }

    public final TimeInterpolator getInterpolator()
    {
        return mAnimator.getInterpolator();
    }

    public final ArrayList getListeners()
    {
        return mListeners;
    }

    public final long getStartDelay()
    {
        return mAnimator.getStartDelay();
    }

    public final boolean isPaused()
    {
        return mAnimator.isPaused();
    }

    public final boolean isRunning()
    {
        return mAnimator.isRunning();
    }

    public final boolean isStarted()
    {
        return mAnimator.isStarted();
    }

    public final void onAnimationCancel(Animator animator)
    {
        animator = (ArrayList)mListeners.clone();
        int j = animator.size();
        for (int i = 0; i < j; i++)
        {
            ((android.animation.Animator.AnimatorListener)animator.get(i)).onAnimationCancel(this);
        }

    }

    public final void onAnimationEnd(Animator animator)
    {
        animator = (ArrayList)mListeners.clone();
        int j = animator.size();
        for (int i = 0; i < j; i++)
        {
            ((android.animation.Animator.AnimatorListener)animator.get(i)).onAnimationEnd(this);
        }

    }

    public final void onAnimationRepeat(Animator animator)
    {
        animator = (ArrayList)mListeners.clone();
        int j = animator.size();
        for (int i = 0; i < j; i++)
        {
            ((android.animation.Animator.AnimatorListener)animator.get(i)).onAnimationRepeat(this);
        }

    }

    public final void onAnimationStart(Animator animator)
    {
        animator = (ArrayList)mListeners.clone();
        int j = animator.size();
        for (int i = 0; i < j; i++)
        {
            ((android.animation.Animator.AnimatorListener)animator.get(i)).onAnimationStart(this);
        }

    }

    public final void pause()
    {
    }

    public final void removeAllListeners()
    {
        if (mListeners != null)
        {
            mListeners.clear();
            mListeners = null;
        }
    }

    public final void removeListener(android.animation.Animator.AnimatorListener animatorlistener)
    {
        if (mListeners != null)
        {
            mListeners.remove(animatorlistener);
            if (mListeners.size() == 0)
            {
                mListeners = null;
                return;
            }
        }
    }

    public final void removePauseListener(android.animation.Animator.AnimatorPauseListener animatorpauselistener)
    {
    }

    public final void resume()
    {
    }

    public final Animator setDuration(long l)
    {
        mAnimator.setDuration(l);
        return this;
    }

    public final void setInterpolator(TimeInterpolator timeinterpolator)
    {
        mAnimator.setInterpolator(timeinterpolator);
    }

    public final void setStartDelay(long l)
    {
        mAnimator.setStartDelay(l);
    }

    public final void setTarget(Object obj)
    {
        mAnimator.setTarget(obj);
    }

    public final void setupEndValues()
    {
        mAnimator.setupEndValues();
    }

    public final void setupStartValues()
    {
        mAnimator.setupStartValues();
    }

    public final void start()
    {
        mAnimator.start();
    }
}
