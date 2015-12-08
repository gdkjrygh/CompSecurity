// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.zzbg;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            zzmz, zzmo, zzmy

public class zzna
{

    private boolean mClosed;
    private String zzaCO;
    private final ScheduledExecutorService zzaEJ;
    private ScheduledFuture zzaEL;

    public zzna()
    {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public zzna(String s)
    {
        this(Executors.newSingleThreadScheduledExecutor());
        zzaCO = s;
    }

    zzna(ScheduledExecutorService scheduledexecutorservice)
    {
        zzaEL = null;
        zzaCO = null;
        zzaEJ = scheduledexecutorservice;
        mClosed = false;
    }

    public void zza(Context context, zzmo zzmo, long l, zzmy zzmy)
    {
        this;
        JVM INSTR monitorenter ;
        zzbg.zzam("ResourceLoaderScheduler: Loading new resource.");
        if (zzaEL == null)
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (zzaCO == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        context = new zzmz(context, zzmo, zzmy, zzaCO);
_L1:
        zzaEL = zzaEJ.schedule(context, l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        context = new zzmz(context, zzmo, zzmy);
          goto _L1
    }
}
