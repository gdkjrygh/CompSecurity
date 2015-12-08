// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzgb, zzic, zzab, zzhp, 
//            zzhx, zzid

public abstract class zzfy extends zzgb
    implements zzid.zza
{

    private boolean zzsg;
    private final zzid zzvy;
    protected boolean zzvz;

    protected zzfy(Context context, zzhe.zza zza1, zzic zzic1, zzgc.zza zza2)
    {
        super(context, zza1, zzic1, zza2);
        zzvz = false;
        zzsg = false;
        zzvy = zzic1.zzeG();
    }

    private boolean zzd(long l)
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 1L)
        {
            return false;
        }
        try
        {
            zznh.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new zzgb.zza("Ad request cancelled.", -1);
        }
        return true;
    }

    public void onStop()
    {
        synchronized (zzvM)
        {
            zzmu.stopLoading();
            zzab.zzaO().zza(zzmu.getWebView());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzic zzic1, boolean flag)
    {
        boolean flag1 = true;
        zzic1 = ((zzic) (zznh));
        zzic1;
        JVM INSTR monitorenter ;
        zzhx.zzY("WebView finished loading.");
        zzvz = true;
        Exception exception;
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzsg = flag;
        zznh.notify();
        zzic1;
        JVM INSTR monitorexit ;
        return;
        exception;
        zzic1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzf(long l)
    {
        do
        {
            if (!zzd(l))
            {
                throw new zzgb.zza("Timed out waiting for WebView to finish loading.", 2);
            }
            if (zzsg)
            {
                throw new zzgb.zza("Received cancellation request from creative.", 0);
            }
        } while (!zzvz);
    }
}
