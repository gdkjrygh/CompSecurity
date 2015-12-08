// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzdl

public final class zzdm extends zzdt.zza
{

    private final Object zznh = new Object();
    private zzdo.zza zzsA;
    private zzdl zzsB;

    public zzdm()
    {
    }

    public final void onAdClicked()
    {
        synchronized (zznh)
        {
            if (zzsB != null)
            {
                zzsB.zzah();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onAdClosed()
    {
        synchronized (zznh)
        {
            if (zzsB != null)
            {
                zzsB.zzai();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onAdFailedToLoad(int i)
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        if (zzsA == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        Exception exception;
        if (i == 3)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        zzsA.zzm(i);
        zzsA = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onAdLeftApplication()
    {
        synchronized (zznh)
        {
            if (zzsB != null)
            {
                zzsB.zzaj();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onAdLoaded()
    {
label0:
        {
            synchronized (zznh)
            {
                if (zzsA == null)
                {
                    break label0;
                }
                zzsA.zzm(0);
                zzsA = null;
            }
            return;
        }
        if (zzsB != null)
        {
            zzsB.zzal();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void onAdOpened()
    {
        synchronized (zznh)
        {
            if (zzsB != null)
            {
                zzsB.zzak();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void zza(zzdl zzdl1)
    {
        synchronized (zznh)
        {
            zzsB = zzdl1;
        }
        return;
        zzdl1;
        obj;
        JVM INSTR monitorexit ;
        throw zzdl1;
    }

    public final void zza(zzdo.zza zza1)
    {
        synchronized (zznh)
        {
            zzsA = zza1;
        }
        return;
        zza1;
        obj;
        JVM INSTR monitorexit ;
        throw zza1;
    }
}
