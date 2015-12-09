// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;

public final class cso extends bsc
{

    private crw a;
    private crw b;
    private crw c;
    private final crw d = new crw();
    private final crw e = new crw();
    private crw j;
    private crw k;
    private final Map l = new HashMap();

    public cso(Context context, Looper looper, bqw bqw, bqx bqx, bry bry)
    {
        super(context, looper, 14, bry, bqw, bqx);
        Executors.newCachedThreadPool();
        a = new crw();
        b = new crw();
        c = new crw();
        j = new crw();
        k = new crw();
    }

    protected final IInterface a(IBinder ibinder)
    {
        return cru.a(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.wearable.BIND";
    }

    protected final void a(int i, IBinder ibinder, Bundle bundle, int i1)
    {
        if (Log.isLoggable("WearableClient", 2))
        {
            Log.d("WearableClient", (new StringBuilder("onPostInitHandler: statusCode ")).append(i).toString());
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        a.a(ibinder);
        b.a(ibinder);
        c.a(ibinder);
        d.a(ibinder);
        e.a(ibinder);
        j.a(ibinder);
        k.a(ibinder);
        Map map = l;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = l.values().iterator(); iterator.hasNext(); ((crw)iterator.next()).a(ibinder)) { }
        break MISSING_BLOCK_LABEL_149;
        ibinder;
        map;
        JVM INSTR monitorexit ;
        throw ibinder;
        map;
        JVM INSTR monitorexit ;
_L2:
        super.a(i, ibinder, bundle, i1);
        return;
    }

    protected final String b()
    {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    public final void c()
    {
        a.a(this);
        b.a(this);
        c.a(this);
        d.a(this);
        e.a(this);
        j.a(this);
        k.a(this);
        Map map = l;
        map;
        JVM INSTR monitorenter ;
        for (Iterator iterator = l.values().iterator(); iterator.hasNext(); ((crw)iterator.next()).a(this)) { }
        break MISSING_BLOCK_LABEL_108;
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
        map;
        JVM INSTR monitorexit ;
        super.c();
        return;
    }
}
