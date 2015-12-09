// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.TagManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzmg, k

public class zzmh
{
    public static interface zza
    {

        public abstract void zzaI();
    }


    private static zzmh zzaGH;
    private Context mContext;
    private boolean mStarted;
    private final Set zzaGI = new HashSet();
    private TagManager zzaGJ;
    private zzmg zznw;

    zzmh(Context context, TagManager tagmanager)
    {
        zzaGJ = null;
        mContext = context;
        zzaGJ = tagmanager;
    }

    static Context zza(zzmh zzmh1)
    {
        return zzmh1.mContext;
    }

    static zzmg zza(zzmh zzmh1, zzmg zzmg1)
    {
        zzmh1.zznw = zzmg1;
        return zzmg1;
    }

    public static zzmh zzat(Context context)
    {
        zzv.zzr(context);
        if (zzaGH != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzmh;
        JVM INSTR monitorenter ;
        if (zzaGH == null)
        {
            zzaGH = new zzmh(context, TagManager.getInstance(context.getApplicationContext()));
        }
        com/google/android/gms/internal/zzmh;
        JVM INSTR monitorexit ;
_L2:
        return zzaGH;
        context;
        com/google/android/gms/internal/zzmh;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzb(zzmh zzmh1)
    {
        zzmh1.zzfm();
    }

    private void zzfm()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = zzaGI.iterator(); iterator.hasNext(); ((zza)iterator.next()).zzaI()) { }
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
        if (zznw == null)
        {
            throw new IllegalStateException("No settings configured");
        }
        mStarted = true;
        zzaGJ.zzc(zznw.zzxZ(), -1, "admob").setResultCallback(new ResultCallback() {

            final zzmh a;

            public void a(ContainerHolder containerholder)
            {
                if (containerholder.getStatus().isSuccess())
                {
                    containerholder = containerholder.getContainer();
                } else
                {
                    containerholder = null;
                }
                containerholder = new k(zzmh.zza(a), containerholder, a.zzyd());
                zzmh.zza(a, containerholder.a());
                zzmh.zzb(a);
            }

            public void onResult(Result result)
            {
                a((ContainerHolder)result);
            }

            
            {
                a = zzmh.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(zzmg zzmg1)
    {
        this;
        JVM INSTR monitorenter ;
        if (mStarted)
        {
            throw new IllegalStateException("Settings can't be changed after TagManager has been started");
        }
        break MISSING_BLOCK_LABEL_24;
        zzmg1;
        this;
        JVM INSTR monitorexit ;
        throw zzmg1;
        zznw = zzmg1;
        this;
        JVM INSTR monitorexit ;
    }

    public void zza(zza zza1)
    {
        this;
        JVM INSTR monitorenter ;
        zzaGI.add(zza1);
        this;
        JVM INSTR monitorexit ;
        return;
        zza1;
        this;
        JVM INSTR monitorexit ;
        throw zza1;
    }

    public zzmg zzyd()
    {
        this;
        JVM INSTR monitorenter ;
        zzmg zzmg1 = zznw;
        this;
        JVM INSTR monitorexit ;
        return zzmg1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
