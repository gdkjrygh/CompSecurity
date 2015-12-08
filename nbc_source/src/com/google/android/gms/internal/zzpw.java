// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.TagManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzpv, zzpu

public class zzpw
{
    public static interface zza
    {

        public abstract void zzbm();
    }


    private static zzpw zzaOV;
    private Context mContext;
    private boolean mStarted;
    private final Set zzaOW = new HashSet();
    private TagManager zzaOX;
    private zzpv zzoY;

    zzpw(Context context, TagManager tagmanager)
    {
        zzaOX = null;
        mContext = context;
        zzaOX = tagmanager;
    }

    static Context zza(zzpw zzpw1)
    {
        return zzpw1.mContext;
    }

    static zzpv zza(zzpw zzpw1, zzpv zzpv1)
    {
        zzpw1.zzoY = zzpv1;
        return zzpv1;
    }

    public static zzpw zzaK(Context context)
    {
        zzu.zzu(context);
        if (zzaOV != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzpw;
        JVM INSTR monitorenter ;
        if (zzaOV == null)
        {
            zzaOV = new zzpw(context, TagManager.getInstance(context.getApplicationContext()));
        }
        com/google/android/gms/internal/zzpw;
        JVM INSTR monitorexit ;
_L2:
        return zzaOV;
        context;
        com/google/android/gms/internal/zzpw;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzb(zzpw zzpw1)
    {
        zzpw1.zzgy();
    }

    private void zzgy()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = zzaOW.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzbm()) { }
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
        throws IllegalStateException
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
        if (zzoY == null)
        {
            throw new IllegalStateException("No settings configured");
        }
        mStarted = true;
        zzaOX.zzc(zzoY.zzzT(), -1, "admob").setResultCallback(new ResultCallback() {

            final zzpw zzaOY;

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
                containerholder = new zzpu(zzpw.zza(zzaOY), containerholder, zzaOY.zzzX());
                zzpw.zza(zzaOY, containerholder.zzzR());
                zzpw.zzb(zzaOY);
            }

            
            {
                zzaOY = zzpw.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(zzpv zzpv1)
    {
        this;
        JVM INSTR monitorenter ;
        if (mStarted)
        {
            throw new IllegalStateException("Settings can't be changed after TagManager has been started");
        }
        break MISSING_BLOCK_LABEL_24;
        zzpv1;
        this;
        JVM INSTR monitorexit ;
        throw zzpv1;
        zzoY = zzpv1;
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(zza zza1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaOW.add(zza1);
        this;
        JVM INSTR monitorexit ;
        return;
        zza1;
        this;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    public zzpv zzzX()
    {
        this;
        JVM INSTR monitorenter ;
        zzpv zzpv1 = zzoY;
        this;
        JVM INSTR monitorexit ;
        return zzpv1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
