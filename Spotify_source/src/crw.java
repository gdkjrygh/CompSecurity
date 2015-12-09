// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class crw
{

    private final Map a = new HashMap();

    crw()
    {
    }

    public final void a(IBinder ibinder)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        csm csm1;
        Iterator iterator;
        ibinder = cru.a(ibinder);
        csm1 = new csm();
        iterator = a.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        csp csp1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_184;
        }
        entry = (java.util.Map.Entry)iterator.next();
        csp1 = (csp)entry.getValue();
        ibinder.a(csm1, new AddListenerRequest(csp1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder("onPostInitHandler: added: ")).append(entry.getKey()).append("/").append(csp1).toString());
        }
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        Log.d("WearableClient", (new StringBuilder("onPostInitHandler: Didn't add: ")).append(entry.getKey()).append("/").append(csp1).toString());
          goto _L1
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
    }

    public final void a(cso cso1)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        csm csm1;
        Iterator iterator;
        csm1 = new csm();
        iterator = a.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        csp csp1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_201;
            }
            entry = (java.util.Map.Entry)iterator.next();
            csp1 = (csp)entry.getValue();
        } while (csp1 == null);
        boolean flag = cso1.k();
        if (!flag) goto _L2; else goto _L1
_L1:
        ((crt)cso1.p()).a(csm1, new RemoveListenerRequest(csp1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder("disconnect: removed: ")).append(entry.getKey()).append("/").append(csp1).toString());
        }
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        Log.w("WearableClient", (new StringBuilder("disconnect: Didn't remove: ")).append(entry.getKey()).append("/").append(csp1).toString());
          goto _L2
        cso1;
        map;
        JVM INSTR monitorexit ;
        throw cso1;
        a.clear();
        map;
        JVM INSTR monitorexit ;
    }
}
