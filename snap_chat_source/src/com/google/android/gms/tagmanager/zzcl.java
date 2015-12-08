// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzck, zzbf, zzbe, zzr

class zzcl
    implements zzo.zze
{
    static interface zza
    {

        public abstract zzck zza(zzr zzr);
    }

    static interface zzb
    {

        public abstract ScheduledExecutorService zztE();
    }


    private boolean mClosed;
    private final Context mContext;
    private final ScheduledExecutorService zzasc;
    private String zzaxT;
    private final String zzaxw;
    private zzbe zzazN;
    private zzr zzazO;
    private final zza zzazQ;
    private ScheduledFuture zzazR;

    public zzcl(Context context, String s, zzr zzr)
    {
        this(context, s, zzr, null, null);
    }

    zzcl(Context context, String s, zzr zzr, zzb zzb1, zza zza1)
    {
        zzazO = zzr;
        mContext = context;
        zzaxw = s;
        context = zzb1;
        if (zzb1 == null)
        {
            context = new zzb() {

                final zzcl zzazS;

                public ScheduledExecutorService zztE()
                {
                    return Executors.newSingleThreadScheduledExecutor();
                }

            
            {
                zzazS = zzcl.this;
                super();
            }
            };
        }
        zzasc = context.zztE();
        if (zza1 == null)
        {
            zzazQ = new zza() {

                final zzcl zzazS;

                public zzck zza(zzr zzr1)
                {
                    return new zzck(zzcl.zza(zzazS), zzcl.zzb(zzazS), zzr1);
                }

            
            {
                zzazS = zzcl.this;
                super();
            }
            };
            return;
        } else
        {
            zzazQ = zza1;
            return;
        }
    }

    static Context zza(zzcl zzcl1)
    {
        return zzcl1.mContext;
    }

    static String zzb(zzcl zzcl1)
    {
        return zzcl1.zzaxw;
    }

    private zzck zzdh(String s)
    {
        zzck zzck1 = zzazQ.zza(zzazO);
        zzck1.zza(zzazN);
        zzck1.zzcT(zzaxT);
        zzck1.zzdg(s);
        return zzck1;
    }

    private void zztD()
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
        zztD();
        if (zzazR != null)
        {
            zzazR.cancel(false);
        }
        zzasc.shutdown();
        mClosed = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void zzcT(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zztD();
        zzaxT = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void zze(long l, String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzbf.zzab((new StringBuilder("loadAfterDelay: containerId=")).append(zzaxw).append(" delay=").append(l).toString());
        zztD();
        if (zzazN == null)
        {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        break MISSING_BLOCK_LABEL_59;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (zzazR != null)
        {
            zzazR.cancel(false);
        }
        zzazR = zzasc.schedule(zzdh(s), l, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
    }
}
