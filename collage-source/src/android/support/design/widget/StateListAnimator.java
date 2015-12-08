// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.util.StateSet;
import android.view.View;
import android.view.animation.Animation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class StateListAnimator
{
    static class Tuple
    {

        final Animation mAnimation;
        final int mSpecs[];

        Animation getAnimation()
        {
            return mAnimation;
        }

        int[] getSpecs()
        {
            return mSpecs;
        }

        private Tuple(int ai[], Animation animation)
        {
            mSpecs = ai;
            mAnimation = animation;
        }

    }


    private android.view.animation.Animation.AnimationListener mAnimationListener;
    private Tuple mLastMatch;
    private Animation mRunningAnimation;
    private final ArrayList mTuples = new ArrayList();
    private WeakReference mViewRef;

    StateListAnimator()
    {
        mLastMatch = null;
        mRunningAnimation = null;
        mAnimationListener = new android.view.animation.Animation.AnimationListener() {

            final StateListAnimator this$0;

            public void onAnimationEnd(Animation animation)
            {
                if (mRunningAnimation == animation)
                {
                    mRunningAnimation = null;
                }
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
            }

            
            {
                this$0 = StateListAnimator.this;
                super();
            }
        };
    }

    private void cancel()
    {
        if (mRunningAnimation != null)
        {
            View view = getTarget();
            if (view != null && view.getAnimation() == mRunningAnimation)
            {
                view.clearAnimation();
            }
            mRunningAnimation = null;
        }
    }

    private void clearTarget()
    {
        View view = getTarget();
        int j = mTuples.size();
        for (int i = 0; i < j; i++)
        {
            Animation animation = ((Tuple)mTuples.get(i)).mAnimation;
            if (view.getAnimation() == animation)
            {
                view.clearAnimation();
            }
        }

        mViewRef = null;
        mLastMatch = null;
        mRunningAnimation = null;
    }

    private void start(Tuple tuple)
    {
        mRunningAnimation = tuple.mAnimation;
        tuple = getTarget();
        if (tuple != null)
        {
            tuple.startAnimation(mRunningAnimation);
        }
    }

    public void addState(int ai[], Animation animation)
    {
        ai = new Tuple(ai, animation);
        animation.setAnimationListener(mAnimationListener);
        mTuples.add(ai);
    }

    Animation getRunningAnimation()
    {
        return mRunningAnimation;
    }

    View getTarget()
    {
        if (mViewRef == null)
        {
            return null;
        } else
        {
            return (View)mViewRef.get();
        }
    }

    ArrayList getTuples()
    {
        return mTuples;
    }

    public void jumpToCurrentState()
    {
        if (mRunningAnimation != null)
        {
            View view = getTarget();
            if (view != null && view.getAnimation() == mRunningAnimation)
            {
                view.clearAnimation();
            }
        }
    }

    void setState(int ai[])
    {
        Object obj;
        int i;
        int j;
        obj = null;
        j = mTuples.size();
        i = 0;
_L8:
        Tuple tuple = obj;
        if (i >= j) goto _L2; else goto _L1
_L1:
        tuple = (Tuple)mTuples.get(i);
        if (!StateSet.stateSetMatches(tuple.mSpecs, ai)) goto _L3; else goto _L2
_L2:
        if (tuple != mLastMatch) goto _L5; else goto _L4
_L4:
        return;
_L3:
        i++;
        continue; /* Loop/switch isn't completed */
_L5:
        if (mLastMatch != null)
        {
            cancel();
        }
        mLastMatch = tuple;
        ai = (View)mViewRef.get();
        if (tuple == null || ai == null || ai.getVisibility() != 0) goto _L4; else goto _L6
_L6:
        start(tuple);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    void setTarget(View view)
    {
        View view1 = getTarget();
        if (view1 != view)
        {
            if (view1 != null)
            {
                clearTarget();
            }
            if (view != null)
            {
                mViewRef = new WeakReference(view);
                return;
            }
        }
    }



/*
    static Animation access$002(StateListAnimator statelistanimator, Animation animation)
    {
        statelistanimator.mRunningAnimation = animation;
        return animation;
    }

*/
}
