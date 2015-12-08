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

public final class a
    implements ServiceConnection
{

    boolean Rh;
    private final BlockingQueue Ri = new LinkedBlockingQueue();

    public a()
    {
        Rh = false;
    }

    public final IBinder hO()
        throws InterruptedException
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        }
        if (Rh)
        {
            throw new IllegalStateException();
        } else
        {
            Rh = true;
            return (IBinder)Ri.take();
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Ri.add(ibinder);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }
}
