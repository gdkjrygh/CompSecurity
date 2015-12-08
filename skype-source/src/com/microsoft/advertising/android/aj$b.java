// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.microsoft.advertising.android:
//            aj

private static final class <init>
    implements ServiceConnection
{

    boolean a;
    private final LinkedBlockingQueue b;

    public final IBinder a()
        throws InterruptedException
    {
        if (a)
        {
            throw new IllegalStateException();
        } else
        {
            a = true;
            return (IBinder)b.poll(2L, TimeUnit.SECONDS);
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
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

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }

    private e()
    {
        a = false;
        b = new LinkedBlockingQueue(1);
    }

    e(byte byte0)
    {
        this();
    }
}
