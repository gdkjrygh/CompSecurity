// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//            GoogleApiClientConnecting, GoogleApiClientStateHolder

private abstract class <init>
    implements Runnable
{

    final GoogleApiClientConnecting this$0;

    public void run()
    {
        mLock.lock();
        boolean flag = Thread.interrupted();
        if (flag)
        {
            mLock.unlock();
            return;
        }
        runLocked();
        mLock.unlock();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        GoogleApiClientStateHolder googleapiclientstateholder = mHolder;
        android.os.Message message = googleapiclientstateholder.mHandlerForTasks.inMessage(2, runtimeexception);
        googleapiclientstateholder.mHandlerForTasks.Message(message);
        mLock.unlock();
        return;
        Exception exception;
        exception;
        mLock.unlock();
        throw exception;
    }

    protected abstract void runLocked();

    private ()
    {
        this$0 = GoogleApiClientConnecting.this;
        super();
    }

    this._cls0(byte byte0)
    {
        this();
    }
}
