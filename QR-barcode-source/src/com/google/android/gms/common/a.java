// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class a
    implements ServiceConnection
{

    boolean HC;
    private final BlockingQueue HD = new LinkedBlockingQueue();

    public a()
    {
        HC = false;
    }

    public IBinder fW()
        throws InterruptedException
    {
        if (HC)
        {
            throw new IllegalStateException();
        } else
        {
            HC = true;
            return (IBinder)HD.take();
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        HD.add(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }
}
