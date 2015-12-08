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

        Tuple(int ai[], Animation animation, _cls1 _pcls1)
        {
            this(ai, animation);
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
        mAnimationListener = new _cls1();
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

    public final void addState(int ai[], Animation animation)
    {
        ai = new Tuple(ai, animation, null);
        animation.setAnimationListener(mAnimationListener);
        mTuples.add(ai);
    }

    final Animation getRunningAnimation()
    {
        return mRunningAnimation;
    }

    final View getTarget()
    {
        if (mViewRef == null)
        {
            return null;
        } else
        {
            return (View)mViewRef.get();
        }
    }

    final ArrayList getTuples()
    {
        return mTuples;
    }

    public final void jumpToCurrentState()
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

    final void setState(int ai[])
    {
        int i;
        int j;
        j = mTuples.size();
        i = 0;
_L5:
        Tuple tuple;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        tuple = (Tuple)mTuples.get(i);
        if (!StateSet.stateSetMatches(tuple.mSpecs, ai)) goto _L2; else goto _L1
_L1:
        ai = tuple;
_L7:
        if (ai != mLastMatch) goto _L4; else goto _L3
_L3:
        return;
_L2:
        i++;
          goto _L5
_L4:
        if (mLastMatch != null)
        {
            cancel();
        }
        mLastMatch = ai;
        if (ai == null) goto _L3; else goto _L6
_L6:
        start(ai);
        return;
        ai = null;
          goto _L7
    }

    final void setTarget(View view)
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

    private class _cls1
        implements android.view.animation.Animation.AnimationListener
    {

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

        _cls1()
        {
            this$0 = StateListAnimator.this;
            super();
        }
    }

}
