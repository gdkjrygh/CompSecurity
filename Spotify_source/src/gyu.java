// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

final class gyu
    implements ServiceConnection
{

    private boolean a;
    private final LinkedBlockingQueue b;

    private gyu()
    {
        a = false;
        b = new LinkedBlockingQueue(1);
    }

    gyu(byte byte0)
    {
        this();
    }

    public final IBinder a()
    {
        if (a)
        {
            gya.a().e("Fabric", "getBinder already called");
        }
        a = true;
        IBinder ibinder;
        try
        {
            ibinder = (IBinder)b.poll(200L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return ibinder;
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
        b.clear();
    }
}
