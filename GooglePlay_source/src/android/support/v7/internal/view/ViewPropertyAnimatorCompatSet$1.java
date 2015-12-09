// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.view:
//            ViewPropertyAnimatorCompatSet

final class mProxyEndCount extends ViewPropertyAnimatorListenerAdapter
{

    private int mProxyEndCount;
    private boolean mProxyStarted;
    final ViewPropertyAnimatorCompatSet this$0;

    public final void onAnimationEnd(View view)
    {
        int i = mProxyEndCount + 1;
        mProxyEndCount = i;
        if (i == mAnimators.size())
        {
            if (mListener != null)
            {
                mListener.onAnimationEnd(null);
            }
            mProxyEndCount = 0;
            mProxyStarted = false;
            mIsStarted = false;
        }
    }

    public final void onAnimationStart(View view)
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

    ()
    {
        this$0 = ViewPropertyAnimatorCompatSet.this;
        super();
        mProxyStarted = false;
        mProxyEndCount = 0;
    }
}
