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

    boolean CN;
    private final BlockingQueue CO = new LinkedBlockingQueue();

    public a()
    {
        CN = false;
    }

    public IBinder er()
        throws InterruptedException
    {
        if (CN)
        {
            throw new IllegalStateException();
        } else
        {
            CN = true;
            return (IBinder)CO.take();
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            CO.put(ibinder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }
}
