// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzau, zzat

public class zzbk extends zzi
{

    private final ExecutorService d = Executors.newCachedThreadPool();
    private final zzau e = new zzau();
    private final zzau f = new zzau();
    private final zzau g = new zzau();
    private final zzau h = new zzau();
    private final zzau i = new zzau();
    private final zzau j = new zzau();
    private final Map k = new HashMap();

    public zzbk(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, zze zze)
    {
        super(context, looper, 14, connectioncallbacks, onconnectionfailedlistener, zze);
    }

    protected IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    public void a()
    {
        e.a(this);
        g.a(this);
        h.a(this);
        i.a(this);
        j.a(this);
        Map map = k;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.values().iterator(); iterator.hasNext(); ((zzau)iterator.next()).a(this)) { }
        break MISSING_BLOCK_LABEL_92;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        super.a();
        return;
    }

    protected void a(int l, IBinder ibinder, Bundle bundle, int i1)
    {
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder()).append("onPostInitHandler: statusCode ").append(l).toString());
        }
        if (l != 0) goto _L2; else goto _L1
_L1:
        e.a(ibinder);
        g.a(ibinder);
        h.a(ibinder);
        i.a(ibinder);
        j.a(ibinder);
        Map map = k;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = k.values().iterator(); iterator.hasNext(); ((zzau)iterator.next()).a(ibinder)) { }
        break MISSING_BLOCK_LABEL_136;
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
_L2:
        super.a(l, ibinder, bundle, i1);
        return;
    }

    public void a(com.google.android.gms.common.api.zza.zzb zzb, Uri uri, int l)
    {
        ((zzat)m()).b(new zzbj.zze(zzb), uri, l);
    }

    protected zzat b(IBinder ibinder)
    {
        return zzat.zza.a(ibinder);
    }

    protected String d()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected String e()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }
}
