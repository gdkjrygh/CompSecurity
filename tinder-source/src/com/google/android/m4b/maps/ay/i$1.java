// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.m4b.maps.y.j;
import java.util.Queue;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            i, ab

final class a
    implements ServiceConnection
{

    private i a;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ServiceConnection serviceconnection = i.a(a);
        serviceconnection;
        JVM INSTR monitorenter ;
        if (ab.a(i.d(), 3))
        {
            String s = i.d();
            componentname = String.valueOf(componentname);
            Log.d(s, (new StringBuilder(String.valueOf(componentname).length() + 22)).append("Connected to service: ").append(componentname).toString());
        }
        i.a(a, (IInterface)j.a(a.a(ibinder)));
        i.a(a, 3);
        for (; i.c(a).size() > 0; i.d(a).execute((Runnable)i.c(a).poll())) { }
        break MISSING_BLOCK_LABEL_146;
        componentname;
        serviceconnection;
        JVM INSTR monitorexit ;
        throw componentname;
        serviceconnection;
        JVM INSTR monitorexit ;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        synchronized (i.a(a))
        {
            if (ab.a(i.d(), 3))
            {
                String s = i.d();
                componentname = String.valueOf(componentname);
                Log.d(s, (new StringBuilder(String.valueOf(componentname).length() + 27)).append("Disconnected from service: ").append(componentname).toString());
            }
            i.a(a, null);
            i.a(a, 2);
        }
        return;
        componentname;
        serviceconnection;
        JVM INSTR monitorexit ;
        throw componentname;
    }

    (i k)
    {
        a = k;
        super();
    }
}
