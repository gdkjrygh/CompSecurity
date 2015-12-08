// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            l, ak, ap, zzb, 
//            k, an, zzau

abstract class n
{

    private final HashMap a = new HashMap();

    n()
    {
    }

    public final void a(IBinder ibinder)
    {
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        ak ak1;
        Iterator iterator;
        ibinder = l.a(ibinder);
        ak1 = new ak();
        iterator = a.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        ap ap1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_182;
        }
        entry = (java.util.Map.Entry)iterator.next();
        ap1 = (ap)entry.getValue();
        ibinder.a(ak1, new zzb(ap1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder("onPostInitHandler: added: ")).append(entry.getKey()).append("/").append(ap1).toString());
        }
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        Log.d("WearableClient", (new StringBuilder("onPostInitHandler: Didn't add: ")).append(entry.getKey()).append("/").append(ap1).toString());
          goto _L1
        ibinder;
        hashmap;
        JVM INSTR monitorexit ;
        throw ibinder;
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final void a(an an1)
    {
        HashMap hashmap = a;
        hashmap;
        JVM INSTR monitorenter ;
        ak ak1;
        Iterator iterator;
        ak1 = new ak();
        iterator = a.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        ap ap1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_204;
            }
            entry = (java.util.Map.Entry)iterator.next();
            ap1 = (ap)entry.getValue();
        } while (ap1 == null);
        boolean flag;
        ap1.a();
        flag = an1.c();
        if (!flag) goto _L2; else goto _L1
_L1:
        ((k)an1.l()).a(ak1, new zzau(ap1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder("disconnect: removed: ")).append(entry.getKey()).append("/").append(ap1).toString());
        }
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        Log.w("WearableClient", (new StringBuilder("disconnect: Didn't remove: ")).append(entry.getKey()).append("/").append(ap1).toString());
          goto _L2
        an1;
        hashmap;
        JVM INSTR monitorexit ;
        throw an1;
        a.clear();
        hashmap;
        JVM INSTR monitorexit ;
    }
}
