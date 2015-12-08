// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.af;
import android.support.v4.view.aj;
import android.support.v4.view.ak;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewPropertyAnimatorCompatSet
{

    private final ArrayList mAnimators = new ArrayList();
    private long mDuration;
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    private aj mListener;
    private final ak mProxyListener = new ak() {

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
        for (Iterator iterator = mAnimators.iterator(); iterator.hasNext(); ((af)iterator.next()).a()) { }
        mIsStarted = false;
    }

    public ViewPropertyAnimatorCompatSet play(af af1)
    {
        if (!mIsStarted)
        {
            mAnimators.add(af1);
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet playSequentially(af af1, af af2)
    {
        mAnimators.add(af1);
        af1 = (View)af1.a.get();
        long l;
        if (af1 != null)
        {
            l = af.b.a(af1);
        } else
        {
            l = 0L;
        }
        af2.b(l);
        mAnimators.add(af2);
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

    public ViewPropertyAnimatorCompatSet setListener(aj aj)
    {
        if (!mIsStarted)
        {
            mListener = aj;
        }
        return this;
    }

    public void start()
    {
        if (mIsStarted)
        {
            return;
        }
        af af1;
        for (Iterator iterator = mAnimators.iterator(); iterator.hasNext(); af1.b())
        {
            af1 = (af)iterator.next();
            if (mDuration >= 0L)
            {
                af1.a(mDuration);
            }
            if (mInterpolator != null)
            {
                af1.a(mInterpolator);
            }
            if (mListener != null)
            {
                af1.a(mProxyListener);
            }
        }

        mIsStarted = true;
    }



}
