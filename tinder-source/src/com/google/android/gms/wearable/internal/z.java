// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            aq, AddListenerRequest, y, ap, 
//            RemoveListenerRequest

final class z
{
    private static final class a extends ao.a
    {

        private WeakReference a;
        private WeakReference b;

        public final void a(Status status)
        {
            Map map;
            Object obj;
            map = (Map)a.get();
            obj = b.get();
            if (status.b() || map == null || obj == null) goto _L2; else goto _L1
_L1:
            map;
            JVM INSTR monitorenter ;
            obj = (aq)map.remove(obj);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_55;
            }
            ((aq) (obj)).a();
            map;
            JVM INSTR monitorexit ;
_L2:
            a(status);
            return;
            status;
            map;
            JVM INSTR monitorexit ;
            throw status;
        }

        a(Map map, Object obj, com.google.android.gms.internal.dg.b b1)
        {
            super(b1);
            a = new WeakReference(map);
            b = new WeakReference(obj);
        }
    }

    private static final class b extends ao.a
    {

        private WeakReference a;
        private WeakReference b;

        public final void a(Status status)
        {
            Map map;
            Object obj;
            map = (Map)a.get();
            obj = b.get();
            if (status.g != 4002 || map == null || obj == null) goto _L2; else goto _L1
_L1:
            map;
            JVM INSTR monitorenter ;
            obj = (aq)map.remove(obj);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ((aq) (obj)).a();
            map;
            JVM INSTR monitorexit ;
_L2:
            a(status);
            return;
            status;
            map;
            JVM INSTR monitorexit ;
            throw status;
        }

        b(Map map, Object obj, com.google.android.gms.internal.dg.b b1)
        {
            super(b1);
            a = new WeakReference(map);
            b = new WeakReference(obj);
        }
    }


    private final Map a = new HashMap();

    z()
    {
    }

    public final void a(IBinder ibinder)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        ao.c c;
        Iterator iterator;
        ibinder = y.a.a(ibinder);
        c = new ao.c();
        iterator = a.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        aq aq1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_184;
        }
        entry = (java.util.Map.Entry)iterator.next();
        aq1 = (aq)entry.getValue();
        ibinder.a(c, new AddListenerRequest(aq1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder("onPostInitHandler: added: ")).append(entry.getKey()).append("/").append(aq1).toString());
        }
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        Log.d("WearableClient", (new StringBuilder("onPostInitHandler: Didn't add: ")).append(entry.getKey()).append("/").append(aq1).toString());
          goto _L1
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
    }

    public final void a(ap ap1)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        ao.c c;
        Iterator iterator;
        c = new ao.c();
        iterator = a.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        aq aq1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_206;
            }
            entry = (java.util.Map.Entry)iterator.next();
            aq1 = (aq)entry.getValue();
        } while (aq1 == null);
        boolean flag;
        aq1.a();
        flag = ap1.b();
        if (!flag) goto _L2; else goto _L1
_L1:
        ((y)ap1.m()).a(c, new RemoveListenerRequest(aq1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder("disconnect: removed: ")).append(entry.getKey()).append("/").append(aq1).toString());
        }
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        Log.w("WearableClient", (new StringBuilder("disconnect: Didn't remove: ")).append(entry.getKey()).append("/").append(aq1).toString());
          goto _L2
        ap1;
        map;
        JVM INSTR monitorexit ;
        throw ap1;
        a.clear();
        map;
        JVM INSTR monitorexit ;
    }

    public final void a(ap ap1, com.google.android.gms.internal.dg.b b1, Object obj)
        throws RemoteException
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        aq aq1 = (aq)a.remove(obj);
        if (aq1 != null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        b1.a(new Status(4002));
        map;
        JVM INSTR monitorexit ;
        return;
        aq1.a();
        ((y)ap1.m()).a(new b(a, obj, b1), new RemoveListenerRequest(aq1));
        map;
        JVM INSTR monitorexit ;
        return;
        ap1;
        map;
        JVM INSTR monitorexit ;
        throw ap1;
    }

    public final void a(ap ap1, com.google.android.gms.internal.dg.b b1, Object obj, aq aq1)
        throws RemoteException
    {
label0:
        {
            synchronized (a)
            {
                if (a.get(obj) == null)
                {
                    break label0;
                }
                b1.a(new Status(4001));
            }
            return;
        }
        a.put(obj, aq1);
        ((y)ap1.m()).a(new a(a, obj, b1), new AddListenerRequest(aq1));
        map;
        JVM INSTR monitorexit ;
        return;
        ap1;
        map;
        JVM INSTR monitorexit ;
        throw ap1;
        ap1;
        a.remove(obj);
        throw ap1;
    }
}
