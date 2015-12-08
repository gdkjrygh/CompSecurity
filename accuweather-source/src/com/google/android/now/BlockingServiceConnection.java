// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.now;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

class BlockingServiceConnection
    implements ServiceConnection
{

    private static final String TAG = "BlockingServiceConnection";
    private final BlockingQueue mBlockingQueue = new LinkedBlockingQueue();
    private boolean mBound;
    private AtomicBoolean mUsed;

    BlockingServiceConnection()
    {
        mBound = false;
        mUsed = new AtomicBoolean(false);
    }

    public IBinder getService()
        throws InterruptedException
    {
        if (mUsed.get())
        {
            throw new IllegalStateException();
        } else
        {
            mUsed.set(true);
            return (IBinder)mBlockingQueue.take();
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        mBound = true;
        mBlockingQueue.clear();
        mBlockingQueue.add(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        mBound = false;
    }

    public void unbindServiceIfConnected(final Context context)
    {
        context = new Runnable() {

            final BlockingServiceConnection this$0;
            final Context val$context;

            public void run()
            {
                if (mBound)
                {
                    context.unbindService(BlockingServiceConnection.this);
                    return;
                } else
                {
                    Log.w("BlockingServiceConnection", "Service disconnected before unbinding");
                    return;
                }
            }

            
            {
                this$0 = BlockingServiceConnection.this;
                context = context1;
                super();
            }
        };
        (new Handler(Looper.getMainLooper())).post(context);
    }

}
