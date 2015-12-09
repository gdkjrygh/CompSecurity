// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.onboard;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class OnboardBaseFragment extends Fragment
{

    protected final Handler mHandler = new Handler();
    private final int mLayoutResourceId = 0x7f04011f;
    private View mRootView;

    protected OnboardBaseFragment(int i)
    {
    }

    private Runnable makeSafeRunnable(final Runnable runnable)
    {
        return new Runnable() {

            final OnboardBaseFragment this$0;
            final Runnable val$runnable;

            public final void run()
            {
                if (isAdded())
                {
                    runnable.run();
                }
            }

            
            {
                this$0 = OnboardBaseFragment.this;
                runnable = runnable1;
                super();
            }
        };
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mRootView = layoutinflater.inflate(mLayoutResourceId, viewgroup, false);
        return mRootView;
    }

    protected final void safelyPost(Runnable runnable)
    {
        mHandler.post(makeSafeRunnable(runnable));
    }

    protected final void safelyPostDelayed(Runnable runnable, long l)
    {
        mHandler.postDelayed(makeSafeRunnable(runnable), l);
    }
}
