// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
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
//            bb, ba, af, ar, 
//            b

abstract class ag
{
    private static class a extends az.a
    {

        private WeakReference axP;
        private WeakReference axQ;

        public void a(Status status)
        {
            Map map;
            Object obj;
            map = (Map)axP.get();
            obj = axQ.get();
            if (status.getStatus().isSuccess() || map == null || obj == null) goto _L2; else goto _L1
_L1:
            map;
            JVM INSTR monitorenter ;
            obj = (bb)map.remove(obj);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ((bb) (obj)).clear();
            map;
            JVM INSTR monitorexit ;
_L2:
            A(status);
            return;
            status;
            map;
            JVM INSTR monitorexit ;
            throw status;
        }

        a(Map map, Object obj, com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
            axP = new WeakReference(map);
            axQ = new WeakReference(obj);
        }
    }

    static final class b extends ag
    {

        bb a(com.google.android.gms.wearable.DataApi.DataListener datalistener, IntentFilter aintentfilter[])
        {
            return bb.b(datalistener, aintentfilter);
        }

        volatile bb a(Object obj, IntentFilter aintentfilter[])
        {
            return a((com.google.android.gms.wearable.DataApi.DataListener)obj, aintentfilter);
        }

        b()
        {
        }
    }

    static final class c extends ag
    {

        bb a(com.google.android.gms.wearable.MessageApi.MessageListener messagelistener, IntentFilter aintentfilter[])
        {
            return bb.b(messagelistener, aintentfilter);
        }

        volatile bb a(Object obj, IntentFilter aintentfilter[])
        {
            return a((com.google.android.gms.wearable.MessageApi.MessageListener)obj, aintentfilter);
        }

        c()
        {
        }
    }

    static final class d extends ag
    {

        bb a(com.google.android.gms.wearable.NodeApi.NodeListener nodelistener, IntentFilter aintentfilter[])
        {
            return bb.a(nodelistener);
        }

        volatile bb a(Object obj, IntentFilter aintentfilter[])
        {
            return a((com.google.android.gms.wearable.NodeApi.NodeListener)obj, aintentfilter);
        }

        d()
        {
        }
    }

    private static class e extends az.a
    {

        private WeakReference axP;
        private WeakReference axQ;

        public void a(Status status)
        {
            Map map;
            Object obj;
            map = (Map)axP.get();
            obj = axQ.get();
            if (status.getStatus().getStatusCode() != 4002 || map == null || obj == null) goto _L2; else goto _L1
_L1:
            map;
            JVM INSTR monitorenter ;
            obj = (bb)map.remove(obj);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_61;
            }
            ((bb) (obj)).clear();
            map;
            JVM INSTR monitorexit ;
_L2:
            A(status);
            return;
            status;
            map;
            JVM INSTR monitorexit ;
            throw status;
        }

        e(Map map, Object obj, com.google.android.gms.common.api.BaseImplementation.b b1)
        {
            super(b1);
            axP = new WeakReference(map);
            axQ = new WeakReference(obj);
        }
    }


    private final HashMap agU = new HashMap();

    ag()
    {
    }

    abstract bb a(Object obj, IntentFilter aintentfilter[]);

    public void a(ba ba1, com.google.android.gms.common.api.BaseImplementation.b b1, Object obj)
        throws RemoteException
    {
        HashMap hashmap = agU;
        hashmap;
        JVM INSTR monitorenter ;
        bb bb1 = (bb)agU.remove(obj);
        if (bb1 != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        b1.b(new Status(4002));
        hashmap;
        JVM INSTR monitorexit ;
        return;
        bb1.clear();
        ((af)ba1.hw()).a(new e(agU, obj, b1), new ar(bb1));
        hashmap;
        JVM INSTR monitorexit ;
        return;
        ba1;
        hashmap;
        JVM INSTR monitorexit ;
        throw ba1;
    }

    public void a(ba ba1, com.google.android.gms.common.api.BaseImplementation.b b1, Object obj, IntentFilter aintentfilter[])
        throws RemoteException
    {
        bb bb1;
label0:
        {
            bb1 = a(obj, aintentfilter);
            synchronized (agU)
            {
                if (agU.get(obj) == null)
                {
                    break label0;
                }
                b1.b(new Status(4001));
            }
            return;
        }
        agU.put(obj, bb1);
        ((af)ba1.hw()).a(new a(agU, obj, b1), new com.google.android.gms.wearable.internal.b(bb1));
        aintentfilter;
        JVM INSTR monitorexit ;
        return;
        ba1;
        aintentfilter;
        JVM INSTR monitorexit ;
        throw ba1;
        ba1;
        agU.remove(obj);
        throw ba1;
    }

    public void b(ba ba1)
    {
        HashMap hashmap = agU;
        hashmap;
        JVM INSTR monitorenter ;
        az.h h;
        Iterator iterator;
        h = new az.h();
        iterator = agU.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        bb bb1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_210;
            }
            entry = (java.util.Map.Entry)iterator.next();
            bb1 = (bb)entry.getValue();
        } while (bb1 == null);
        boolean flag;
        bb1.clear();
        flag = ba1.isConnected();
        if (!flag) goto _L2; else goto _L1
_L1:
        ((af)ba1.hw()).a(h, new ar(bb1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("disconnect: removed: ").append(entry.getKey()).append("/").append(bb1).toString());
        }
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        Log.w("WearableClient", (new StringBuilder()).append("disconnect: Didn't remove: ").append(entry.getKey()).append("/").append(bb1).toString());
          goto _L2
        ba1;
        hashmap;
        JVM INSTR monitorexit ;
        throw ba1;
        agU.clear();
        hashmap;
        JVM INSTR monitorexit ;
    }

    public void ca(IBinder ibinder)
    {
        HashMap hashmap = agU;
        hashmap;
        JVM INSTR monitorenter ;
        az.h h;
        Iterator iterator;
        ibinder = af.a.bZ(ibinder);
        h = new az.h();
        iterator = agU.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        bb bb1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_188;
        }
        entry = (java.util.Map.Entry)iterator.next();
        bb1 = (bb)entry.getValue();
        ibinder.a(h, new com.google.android.gms.wearable.internal.b(bb1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: added: ").append(entry.getKey()).append("/").append(bb1).toString());
        }
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: Didn't add: ").append(entry.getKey()).append("/").append(bb1).toString());
          goto _L1
        ibinder;
        hashmap;
        JVM INSTR monitorexit ;
        throw ibinder;
        hashmap;
        JVM INSTR monitorexit ;
    }
}
