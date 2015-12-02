// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.loom.core.TraceEvents;
import com.facebook.loom.logger.Logger;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook.tools.dextr.runtime.detour:
//            ChainedWeakReference

public class ServiceConnectionDetour
    implements ServiceConnection
{

    private static final ChainedWeakReference d = ChainedWeakReference.a();
    private static final ReferenceQueue e = new ReferenceQueue();
    private static final AtomicInteger f = new AtomicInteger(0);
    private ServiceConnection a;
    private int b;
    private int c;

    private ServiceConnectionDetour()
    {
    }

    private static ServiceConnectionDetour a(ServiceConnection serviceconnection, boolean flag)
    {
        a();
        ChainedWeakReference chainedweakreference = d;
        chainedweakreference;
        JVM INSTR monitorenter ;
        Object obj;
        ChainedWeakReference chainedweakreference1;
        obj = ChainedWeakReference.a(d, serviceconnection);
        if (obj == d)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        chainedweakreference1 = ((ChainedWeakReference) (obj)).b;
        if (chainedweakreference1 == obj)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (chainedweakreference1.get() == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        serviceconnection = (ServiceConnectionDetour)chainedweakreference1.get();
        chainedweakreference;
        JVM INSTR monitorexit ;
        return serviceconnection;
        chainedweakreference1.b();
        ((ChainedWeakReference) (obj)).b();
        serviceconnection = a(serviceconnection, flag);
        chainedweakreference;
        JVM INSTR monitorexit ;
        return serviceconnection;
        serviceconnection;
        chainedweakreference;
        JVM INSTR monitorexit ;
        throw serviceconnection;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        serviceconnection = new ChainedWeakReference(serviceconnection, e);
        obj = new ServiceConnectionDetour();
        serviceconnection.a(new ChainedWeakReference(obj));
        d.b(serviceconnection);
        chainedweakreference;
        JVM INSTR monitorexit ;
        return ((ServiceConnectionDetour) (obj));
        chainedweakreference;
        JVM INSTR monitorexit ;
        return null;
    }

    private static void a()
    {
        while (f.incrementAndGet() < 5 || Thread.currentThread().getId() == 1L) 
        {
            return;
        }
        ChainedWeakReference chainedweakreference = d;
        chainedweakreference;
        JVM INSTR monitorenter ;
_L1:
        java.lang.ref.Reference reference = e.poll();
        if (reference == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        ((ChainedWeakReference)reference).b();
          goto _L1
        Exception exception;
        exception;
        chainedweakreference;
        JVM INSTR monitorexit ;
        throw exception;
        chainedweakreference;
        JVM INSTR monitorexit ;
        f.set(0);
        return;
    }

    public static void a(Context context, ServiceConnection serviceconnection, int i)
    {
        ServiceConnectionDetour serviceconnectiondetour = a(serviceconnection, false);
        if (serviceconnectiondetour == null)
        {
            context.unbindService(serviceconnection);
            return;
        } else
        {
            serviceconnectiondetour.a(serviceconnection, Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.ASYNC_CALL, i), i);
            context.unbindService(serviceconnectiondetour);
            return;
        }
    }

    private void a(ServiceConnection serviceconnection, int i, int j)
    {
        a = serviceconnection;
        c = i;
        b = j;
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceconnection, int i, int j)
    {
        if (!TraceEvents.a(8))
        {
            return context.bindService(intent, serviceconnection, i);
        } else
        {
            int k = Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.ASYNC_CALL, j);
            ServiceConnectionDetour serviceconnectiondetour = a(serviceconnection, true);
            serviceconnectiondetour.a(serviceconnection, k, j);
            return context.bindService(intent, serviceconnectiondetour, i);
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        int i = Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.SERV_CONN, b, c);
        a.onServiceConnected(componentname, ibinder);
        Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.SERV_END, b, i);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        int i = Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.SERV_DISCONN, b, c);
        a.onServiceDisconnected(componentname);
        Logger.a(1, com.facebook.loom.logger.LogEntry.EntryType.SERV_END, b, i);
    }

}
