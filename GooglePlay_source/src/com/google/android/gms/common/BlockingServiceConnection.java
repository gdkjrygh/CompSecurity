// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class BlockingServiceConnection
    implements ServiceConnection
{

    private final BlockingQueue mBlockingQueue = new LinkedBlockingQueue();
    boolean mUsed;

    public BlockingServiceConnection()
    {
        mUsed = false;
    }

    public final IBinder getService()
        throws InterruptedException
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        }
        if (mUsed)
        {
            throw new IllegalStateException();
        } else
        {
            mUsed = true;
            return (IBinder)mBlockingQueue.take();
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        mBlockingQueue.add(ibinder);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }
}
