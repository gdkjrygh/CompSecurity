// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

public abstract class Animator
    implements Cloneable
{
    public static interface AnimatorListener
    {

        public abstract void onAnimationCancel(Animator animator);

        public abstract void onAnimationEnd(Animator animator);

        public abstract void onAnimationRepeat(Animator animator);

        public abstract void onAnimationStart(Animator animator);
    }


    ArrayList mListeners;

    public Animator()
    {
        mListeners = null;
    }

    public void addListener(AnimatorListener animatorlistener)
    {
        if (mListeners == null)
        {
            mListeners = new ArrayList();
        }
        mListeners.add(animatorlistener);
    }

    public void cancel()
    {
    }

    public Animator clone()
    {
        Object obj;
        ArrayList arraylist;
        int j;
        obj = (Animator)super.clone();
        if (mListeners == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        arraylist = mListeners;
        obj.mListeners = new ArrayList();
        j = arraylist.size();
        int i = 0;
        while (i < j) 
        {
            try
            {
                ((Animator) (obj)).mListeners.add(arraylist.get(i));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new AssertionError();
            }
            i++;
        }
        return ((Animator) (obj));
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public void end()
    {
    }

    public abstract long getDuration();

    public ArrayList getListeners()
    {
        return mListeners;
    }

    public abstract long getStartDelay();

    public abstract boolean isRunning();

    public boolean isStarted()
    {
        return isRunning();
    }

    public void removeAllListeners()
    {
        if (mListeners != null)
        {
            mListeners.clear();
            mListeners = null;
        }
    }

    public void removeListener(AnimatorListener animatorlistener)
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

    public abstract Animator setDuration(long l);

    public abstract void setInterpolator(Interpolator interpolator);

    public abstract void setStartDelay(long l);

    public void setTarget(Object obj)
    {
    }

    public void setupEndValues()
    {
    }

    public void setupStartValues()
    {
    }

    public void start()
    {
    }
}
