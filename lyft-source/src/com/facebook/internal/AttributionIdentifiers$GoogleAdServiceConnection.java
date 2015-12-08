// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

final class <init>
    implements ServiceConnection
{

    private AtomicBoolean consumed;
    private final BlockingQueue queue;

    public IBinder getBinder()
    {
        if (consumed.compareAndSet(true, true))
        {
            throw new IllegalStateException("Binder already consumed");
        } else
        {
            return (IBinder)queue.take();
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            queue.put(ibinder);
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

    private ()
    {
        consumed = new AtomicBoolean(false);
        queue = new LinkedBlockingDeque();
    }

    queue(queue queue1)
    {
        this();
    }
}
