// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.internal.Asserts;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

private static abstract class mFinished
    implements ResultCallback
{

    protected boolean mActive;
    protected boolean mFinished;
    protected final AppContentFragment mFragment;
    private PendingResult mPendingResult;

    public final void finish()
    {
        mFinished = true;
        if (mPendingResult != null)
        {
            mPendingResult.cancel();
            mPendingResult = null;
        }
        if (mActive)
        {
            mActive = false;
            AppContentFragment.access$300(mFragment, this);
        }
    }

    public final boolean isFinished()
    {
        return mFinished;
    }

    public final void load(GoogleApiClient googleapiclient)
    {
        mPendingResult = onLoad(googleapiclient);
        boolean flag;
        if (mFinished || mPendingResult != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (mFinished)
        {
            return;
        } else
        {
            mPendingResult.setResultCallback(this);
            mActive = true;
            AppContentFragment.access$200(mFragment, this);
            return;
        }
    }

    protected abstract PendingResult onLoad(GoogleApiClient googleapiclient);

    public Q(AppContentFragment appcontentfragment)
    {
        mFragment = appcontentfragment;
        mActive = false;
        mFinished = false;
    }
}
