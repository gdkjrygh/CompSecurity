// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.ads.internal:
//            f

private static final class <init>
    implements ServiceConnection
{

    private AtomicBoolean a;
    private final BlockingQueue b;

    public IBinder a()
    {
        if (a.compareAndSet(true, true))
        {
            throw new IllegalStateException("Binder already consumed");
        } else
        {
            return (IBinder)b.take();
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            b.put(ibinder);
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
        a = new AtomicBoolean(false);
        b = new LinkedBlockingDeque();
    }

    ckingDeque(ckingDeque ckingdeque)
    {
        this();
    }
}
