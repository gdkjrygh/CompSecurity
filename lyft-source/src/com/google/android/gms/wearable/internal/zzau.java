// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzbl, AddListenerRequest, zzat, zzbk, 
//            RemoveListenerRequest

final class zzau
{

    private final Map a = new HashMap();

    zzau()
    {
    }

    public void a(IBinder ibinder)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        zzbj.zzo zzo;
        Iterator iterator;
        ibinder = zzat.zza.a(ibinder);
        zzo = new zzbj.zzo();
        iterator = a.entrySet().iterator();
_L1:
        java.util.Map.Entry entry;
        zzbl zzbl1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_190;
        }
        entry = (java.util.Map.Entry)iterator.next();
        zzbl1 = (zzbl)entry.getValue();
        ibinder.a(zzo, new AddListenerRequest(zzbl1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: added: ").append(entry.getKey()).append("/").append(zzbl1).toString());
        }
          goto _L1
        RemoteException remoteexception;
        remoteexception;
        Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: Didn't add: ").append(entry.getKey()).append("/").append(zzbl1).toString());
          goto _L1
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
    }

    public void a(zzbk zzbk1)
    {
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        zzbj.zzo zzo;
        Iterator iterator;
        zzo = new zzbj.zzo();
        iterator = a.entrySet().iterator();
_L2:
        java.util.Map.Entry entry;
        zzbl zzbl1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_212;
            }
            entry = (java.util.Map.Entry)iterator.next();
            zzbl1 = (zzbl)entry.getValue();
        } while (zzbl1 == null);
        boolean flag;
        zzbl1.a();
        flag = zzbk1.b();
        if (!flag) goto _L2; else goto _L1
_L1:
        ((zzat)zzbk1.m()).a(zzo, new RemoveListenerRequest(zzbl1));
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("disconnect: removed: ").append(entry.getKey()).append("/").append(zzbl1).toString());
        }
          goto _L2
        RemoteException remoteexception;
        remoteexception;
        Log.w("WearableClient", (new StringBuilder()).append("disconnect: Didn't remove: ").append(entry.getKey()).append("/").append(zzbl1).toString());
          goto _L2
        zzbk1;
        map;
        JVM INSTR monitorexit ;
        throw zzbk1;
        a.clear();
        map;
        JVM INSTR monitorexit ;
    }
}
