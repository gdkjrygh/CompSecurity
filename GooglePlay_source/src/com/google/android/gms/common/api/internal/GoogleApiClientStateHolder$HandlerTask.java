// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientStateHolder, GoogleApiClientState

static abstract class mOwner
{

    private final GoogleApiClientState mOwner;

    public final void run(GoogleApiClientStateHolder googleapiclientstateholder)
    {
        googleapiclientstateholder.mLock.lock();
        GoogleApiClientState googleapiclientstate;
        GoogleApiClientState googleapiclientstate1;
        googleapiclientstate = googleapiclientstateholder.mState;
        googleapiclientstate1 = mOwner;
        if (googleapiclientstate != googleapiclientstate1)
        {
            googleapiclientstateholder.mLock.unlock();
            return;
        }
        runLocked();
        googleapiclientstateholder.mLock.unlock();
        return;
        Exception exception;
        exception;
        googleapiclientstateholder.mLock.unlock();
        throw exception;
    }

    protected abstract void runLocked();

    protected (GoogleApiClientState googleapiclientstate)
    {
        mOwner = googleapiclientstate;
    }
}
