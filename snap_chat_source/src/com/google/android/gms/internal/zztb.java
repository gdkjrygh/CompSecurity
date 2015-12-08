// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.TagManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzta, zzsz

public class zztb
{
    public static interface zza
    {

        public abstract void zzaE();
    }


    private static zztb zzatE;
    private Context mContext;
    private boolean mStarted;
    private final Set zzatF = new HashSet();
    private TagManager zzatG;
    private zzta zzmB;

    zztb(Context context, TagManager tagmanager)
    {
        zzatG = null;
        mContext = context;
        zzatG = tagmanager;
    }

    static Context zza(zztb zztb1)
    {
        return zztb1.mContext;
    }

    static zzta zza(zztb zztb1, zzta zzta1)
    {
        zztb1.zzmB = zzta1;
        return zzta1;
    }

    public static zztb zzah(Context context)
    {
        zzx.zzl(context);
        if (zzatE != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zztb;
        JVM INSTR monitorenter ;
        if (zzatE == null)
        {
            zzatE = new zztb(context, TagManager.getInstance(context.getApplicationContext()));
        }
        com/google/android/gms/internal/zztb;
        JVM INSTR monitorexit ;
_L2:
        return zzatE;
        context;
        com/google/android/gms/internal/zztb;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzb(zztb zztb1)
    {
        zztb1.zzrC();
    }

    private void zzrC()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = zzatF.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzaE()) { }
        break MISSING_BLOCK_LABEL_43;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void start()
    {
        this;
        JVM INSTR monitorenter ;
        if (mStarted)
        {
            throw new IllegalStateException("Method start() has already been called");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (zzmB == null)
        {
            throw new IllegalStateException("No settings configured");
        }
        mStarted = true;
        zzatG.zzc(zzmB.zzrx(), -1, "admob").setResultCallback(new ResultCallback() {

            final zztb zzatH;

            public void onResult(Result result)
            {
                zza((ContainerHolder)result);
            }

            public void zza(ContainerHolder containerholder)
            {
                if (containerholder.getStatus().isSuccess())
                {
                    containerholder = containerholder.getContainer();
                } else
                {
                    containerholder = null;
                }
                containerholder = new zzsz(zztb.zza(zzatH), containerholder, zzatH.zzrB());
                zztb.zza(zzatH, containerholder.zzrv());
                zztb.zzb(zzatH);
            }

            
            {
                zzatH = zztb.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(zzta zzta1)
    {
        this;
        JVM INSTR monitorenter ;
        if (mStarted)
        {
            throw new IllegalStateException("Settings can't be changed after TagManager has been started");
        }
        break MISSING_BLOCK_LABEL_24;
        zzta1;
        this;
        JVM INSTR monitorexit ;
        throw zzta1;
        zzmB = zzta1;
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(zza zza1)
    {
        this;
        JVM INSTR monitorenter ;
        zzatF.add(zza1);
        this;
        JVM INSTR monitorexit ;
        return;
        zza1;
        this;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    public zzta zzrB()
    {
        this;
        JVM INSTR monitorenter ;
        zzta zzta1 = zzmB;
        this;
        JVM INSTR monitorexit ;
        return zzta1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
