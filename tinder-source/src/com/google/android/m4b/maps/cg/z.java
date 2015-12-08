// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.RemoteException;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ay.m;
import com.google.android.m4b.maps.model.MapsEngineLayerInfo;
import com.google.android.m4b.maps.model.RuntimeRemoteException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            i

public final class z
    implements Runnable
{
    public static interface a
    {

        public abstract void a(com.google.android.m4b.maps.ac.a a1);
    }


    static long a;
    final ScheduledExecutorService b;
    volatile ScheduledFuture c;
    com.google.android.m4b.maps.ac.a d;
    a e;
    volatile boolean f;
    int g;
    private final m h;
    private final com.google.android.m4b.maps.df.z i;
    private final MapsEngineLayerInfo j;
    private volatile String k;

    z(MapsEngineLayerInfo mapsenginelayerinfo, com.google.android.m4b.maps.df.z z1, ScheduledExecutorService scheduledexecutorservice, m m1)
    {
        g = 0;
        b = scheduledexecutorservice;
        j = mapsenginelayerinfo;
        i = z1;
        h = m1;
    }

    public final com.google.android.m4b.maps.ac.a a()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ac.a a1 = d;
        this;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        e = a1;
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        throw a1;
    }

    public final void run()
    {
        try
        {
            if (f)
            {
                i.a(k);
                f = false;
            }
            k = i.i();
            if (k != null)
            {
                h.i = k;
            }
            h.c(new i(j, this));
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
    }

    static 
    {
        a = TimeUnit.MINUTES.toMillis(1L);
    }
}
