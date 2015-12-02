// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.mobvista.sdk.m.core:
//            l

final class n
    implements ServiceConnection
{

    boolean a;
    final l b;
    private final LinkedBlockingQueue c;

    private n(l l)
    {
        b = l;
        super();
        a = false;
        c = new LinkedBlockingQueue(1);
    }

    n(l l, byte byte0)
    {
        this(l);
    }

    public final IBinder a()
    {
        if (a)
        {
            throw new IllegalStateException();
        } else
        {
            a = true;
            return (IBinder)c.take();
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            c.put(ibinder);
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
}
