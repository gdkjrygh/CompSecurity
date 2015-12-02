// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.view.View;
import android.view.animation.Interpolator;
import ei;
import em;
import en;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewPropertyAnimatorCompatSet
{

    private final ArrayList mAnimators = new ArrayList();
    private long mDuration;
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    private em mListener;
    private final en mProxyListener = new en() {

        private int mProxyEndCount;
        private boolean mProxyStarted;
        final ViewPropertyAnimatorCompatSet this$0;

        public void onAnimationEnd(View view)
        {
            int i = mProxyEndCount + 1;
            mProxyEndCount = i;
            if (i == mAnimators.size())
            {
                if (mListener != null)
                {
                    mListener.onAnimationEnd(null);
                }
                onEnd();
            }
        }

        public void onAnimationStart(View view)
        {
            if (!mProxyStarted)
            {
                mProxyStarted = true;
                if (mListener != null)
                {
                    mListener.onAnimationStart(null);
                    return;
                }
            }
        }

        void onEnd()
        {
            mProxyEndCount = 0;
            mProxyStarted = false;
            onAnimationsEnded();
        }

            
            {
                this$0 = ViewPropertyAnimatorCompatSet.this;
                super();
                mProxyStarted = false;
                mProxyEndCount = 0;
            }
    };

    public ViewPropertyAnimatorCompatSet()
    {
        mDuration = -1L;
    }

    private void onAnimationsEnded()
    {
        mIsStarted = false;
    }

    public void cancel()
    {
        if (!mIsStarted)
        {
            return;
        }
        for (Iterator iterator = mAnimators.iterator(); iterator.hasNext(); ((ei)iterator.next()).a()) { }
        mIsStarted = false;
    }

    public ViewPropertyAnimatorCompatSet play(ei ei1)
    {
        if (!mIsStarted)
        {
            mAnimators.add(ei1);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setDuration(long l)
    {
        if (!mIsStarted)
        {
            mDuration = l;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator)
    {
        if (!mIsStarted)
        {
            mInterpolator = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setListener(em em)
    {
        if (!mIsStarted)
        {
            mListener = em;
        }
        return this;
    }

    public void start()
    {
        if (mIsStarted)
        {
            return;
        }
        ei ei1;
        for (Iterator iterator = mAnimators.iterator(); iterator.hasNext(); ei1.b())
        {
            ei1 = (ei)iterator.next();
            if (mDuration >= 0L)
            {
                ei1.a(mDuration);
            }
            if (mInterpolator != null)
            {
                ei1.a(mInterpolator);
            }
            if (mListener != null)
            {
                ei1.a(mProxyListener);
            }
        }

        mIsStarted = true;
    }



}
