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

    boolean Ae;
    private final BlockingQueue Af = new LinkedBlockingQueue();

    public a()
    {
        Ae = false;
    }

    public IBinder dV()
        throws InterruptedException
    {
        if (Ae)
        {
            throw new IllegalStateException();
        } else
        {
            Ae = true;
            return (IBinder)Af.take();
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            Af.put(ibinder);
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
