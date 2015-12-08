// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.zzbf;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzvu, zzvj, zzvt

public class zzvv
{

    private boolean mClosed;
    private final ScheduledExecutorService zzasc;
    private String zzaya;
    private ScheduledFuture zzazR;

    public zzvv()
    {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public zzvv(String s)
    {
        this(Executors.newSingleThreadScheduledExecutor());
        zzaya = s;
    }

    zzvv(ScheduledExecutorService scheduledexecutorservice)
    {
        zzazR = null;
        zzaya = null;
        zzasc = scheduledexecutorservice;
        mClosed = false;
    }

    public void zza(Context context, zzvj zzvj, long l, zzvt zzvt)
    {
        this;
        JVM INSTR monitorenter ;
        zzbf.zzab("ResourceLoaderScheduler: Loading new resource.");
        if (zzazR == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (zzaya == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        context = new zzvu(context, zzvj, zzvt, zzaya);
_L1:
        zzazR = zzasc.schedule(context, l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        context = new zzvu(context, zzvj, zzvt);
          goto _L1
    }
}
