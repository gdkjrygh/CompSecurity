// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicInteger;

public final class ApiClientTracker
{

    private final GoogleApiClient mApiClient;
    private final AtomicInteger mRefCountAtomic = new AtomicInteger(1);

    public ApiClientTracker(GoogleApiClient googleapiclient)
    {
        mApiClient = (GoogleApiClient)Preconditions.checkNotNull(googleapiclient);
    }

    public final void decRef()
    {
        boolean flag1 = true;
        int i = mRefCountAtomic.getAndDecrement();
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot decrement below 0!");
        if (i <= 1)
        {
            Looper looper = mApiClient.getLooper();
            if (looper != Looper.getMainLooper())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            looper.quit();
            mApiClient.disconnect();
        }
    }

    public final GoogleApiClient getApiClient()
    {
        boolean flag;
        if (mRefCountAtomic.get() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Referencing a dead tracker!");
        return mApiClient;
    }

    public final void incRef()
    {
        boolean flag = true;
        Preconditions.checkState(mApiClient.isConnected(), "Cannot add reference to a disconnected client!");
        if (mRefCountAtomic.getAndAdd(1) <= 0)
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Cannot revive a dead tracker!");
    }
}
