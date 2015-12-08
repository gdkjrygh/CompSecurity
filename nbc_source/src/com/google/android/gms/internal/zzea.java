// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzdz

public final class zzea extends zzeh.zza
{

    private final Object zzqt = new Object();
    private zzec.zza zzxO;
    private zzdz zzxP;

    public zzea()
    {
    }

    public void onAdClicked()
    {
        synchronized (zzqt)
        {
            if (zzxP != null)
            {
                zzxP.zzaX();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdClosed()
    {
        synchronized (zzqt)
        {
            if (zzxP != null)
            {
                zzxP.zzaY();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdFailedToLoad(int i)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzxO == null)
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
        zzxO.zzs(i);
        zzxO = null;
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdLeftApplication()
    {
        synchronized (zzqt)
        {
            if (zzxP != null)
            {
                zzxP.zzaZ();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdLoaded()
    {
label0:
        {
            synchronized (zzqt)
            {
                if (zzxO == null)
                {
                    break label0;
                }
                zzxO.zzs(0);
                zzxO = null;
            }
            return;
        }
        if (zzxP != null)
        {
            zzxP.zzbb();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAdOpened()
    {
        synchronized (zzqt)
        {
            if (zzxP != null)
            {
                zzxP.zzba();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzdz zzdz1)
    {
        synchronized (zzqt)
        {
            zzxP = zzdz1;
        }
        return;
        zzdz1;
        obj;
        JVM INSTR monitorexit ;
        throw zzdz1;
    }

    public void zza(zzec.zza zza1)
    {
        synchronized (zzqt)
        {
            zzxO = zza1;
        }
        return;
        zza1;
        obj;
        JVM INSTR monitorexit ;
        throw zza1;
    }
}
