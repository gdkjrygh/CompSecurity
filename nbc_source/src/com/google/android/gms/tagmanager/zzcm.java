// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzs

class zzcm
    implements zzp.zze
{
    static interface zza
    {
    }

    static interface zzb
    {

        public abstract ScheduledExecutorService zzzm();
    }


    private boolean mClosed;
    private final Context mContext;
    private String zzaKV;
    private final String zzaKy;
    private zzs zzaMV;
    private final ScheduledExecutorService zzaMX;
    private final zza zzaMY;
    private ScheduledFuture zzaMZ;

    public zzcm(Context context, String s, zzs zzs)
    {
        this(context, s, zzs, null, null);
    }

    zzcm(Context context, String s, zzs zzs, zzb zzb1, zza zza1)
    {
        zzaMV = zzs;
        mContext = context;
        zzaKy = s;
        context = zzb1;
        if (zzb1 == null)
        {
            context = new zzb() {

                final zzcm zzaNa;

                public ScheduledExecutorService zzzm()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                zzaNa = zzcm.this;
                super();
            }
            };
        }
        zzaMX = context.zzzm();
        if (zza1 == null)
        {
            zzaMY = new zza() {

                final zzcm zzaNa;

            
            {
                zzaNa = zzcm.this;
                super();
            }
            };
            return;
        } else
        {
            zzaMY = zza1;
            return;
        }
    }

    private void zzzl()
    {
        this;
        JVM INSTR monitorenter ;
        if (mClosed)
        {
            throw new IllegalStateException("called method after closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        zzzl();
        if (zzaMZ != null)
        {
            zzaMZ.cancel(false);
        }
        zzaMX.shutdown();
        mClosed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void zzem(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzzl();
        zzaKV = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
