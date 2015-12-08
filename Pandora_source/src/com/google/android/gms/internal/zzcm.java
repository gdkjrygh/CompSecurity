// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzcl

public final class zzcm extends zzct.zza
{

    private final Object zzoe = new Object();
    private zzco.zza zzuJ;
    private zzcl zzuK;

    public zzcm()
    {
    }

    public void onAdClicked()
    {
        synchronized (zzoe)
        {
            if (zzuK != null)
            {
                zzuK.zzal();
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
        synchronized (zzoe)
        {
            if (zzuK != null)
            {
                zzuK.zzam();
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
        Object obj = zzoe;
        obj;
        JVM INSTR monitorenter ;
        if (zzuJ == null)
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
        zzuJ.zzm(i);
        zzuJ = null;
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
        synchronized (zzoe)
        {
            if (zzuK != null)
            {
                zzuK.zzan();
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
            synchronized (zzoe)
            {
                if (zzuJ == null)
                {
                    break label0;
                }
                zzuJ.zzm(0);
                zzuJ = null;
            }
            return;
        }
        if (zzuK != null)
        {
            zzuK.zzap();
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
        synchronized (zzoe)
        {
            if (zzuK != null)
            {
                zzuK.zzao();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzcl zzcl1)
    {
        synchronized (zzoe)
        {
            zzuK = zzcl1;
        }
        return;
        zzcl1;
        obj;
        JVM INSTR monitorexit ;
        throw zzcl1;
    }

    public void zza(zzco.zza zza1)
    {
        synchronized (zzoe)
        {
            zzuJ = zza1;
        }
        return;
        zza1;
        obj;
        JVM INSTR monitorexit ;
        throw zza1;
    }
}
