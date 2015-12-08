// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewPropertyAnimatorCompatSet
{

    private final ArrayList mAnimators = new ArrayList();
    private long mDuration;
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    private ViewPropertyAnimatorListener mListener;
    private final ViewPropertyAnimatorListenerAdapter mProxyListener = new ViewPropertyAnimatorListenerAdapter() {

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
        for (Iterator iterator = mAnimators.iterator(); iterator.hasNext(); ((ViewPropertyAnimatorCompat)iterator.next()).cancel()) { }
        mIsStarted = false;
    }

    public ViewPropertyAnimatorCompatSet play(ViewPropertyAnimatorCompat viewpropertyanimatorcompat)
    {
        if (!mIsStarted)
        {
            mAnimators.add(viewpropertyanimatorcompat);
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

    public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewpropertyanimatorlistener)
    {
        if (!mIsStarted)
        {
            mListener = viewpropertyanimatorlistener;
        }
        return this;
    }

    public void start()
    {
        if (mIsStarted)
        {
            return;
        }
        ViewPropertyAnimatorCompat viewpropertyanimatorcompat;
        for (Iterator iterator = mAnimators.iterator(); iterator.hasNext(); viewpropertyanimatorcompat.start())
        {
            viewpropertyanimatorcompat = (ViewPropertyAnimatorCompat)iterator.next();
            if (mDuration >= 0L)
            {
                viewpropertyanimatorcompat.setDuration(mDuration);
            }
            if (mInterpolator != null)
            {
                viewpropertyanimatorcompat.setInterpolator(mInterpolator);
            }
            if (mListener != null)
            {
                viewpropertyanimatorcompat.setListener(mProxyListener);
            }
        }

        mIsStarted = true;
    }



}
