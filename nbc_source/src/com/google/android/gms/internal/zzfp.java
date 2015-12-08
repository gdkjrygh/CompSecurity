// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzfs, zzid, zzhm, zzie

public abstract class zzfp extends zzfs
    implements zzie.zza
{

    private final zzie zzBd;
    protected boolean zzBe;
    private boolean zzxo;

    protected zzfp(Context context, zzha.zza zza1, zzid zzid1, zzft.zza zza2)
    {
        super(context, zza1, zzid1, zza2);
        zzBe = false;
        zzxo = false;
        zzBd = zzid1.zzgF();
    }

    private boolean zze(long l)
        throws zzfs.zza
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 1L)
        {
            return false;
        }
        try
        {
            zzqt.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            throw new zzfs.zza("Ad request cancelled.", -1);
        }
        return true;
    }

    public void onStop()
    {
        synchronized (zzBr)
        {
            zzoA.stopLoading();
            zzo.zzbx().zza(zzoA.getWebView());
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zza(zzid zzid1, boolean flag)
    {
        boolean flag1 = true;
        zzid1 = ((zzid) (zzqt));
        zzid1;
        JVM INSTR monitorenter ;
        zzb.zzay("WebView finished loading.");
        zzBe = true;
        Exception exception;
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzxo = flag;
        zzqt.notify();
        zzid1;
        JVM INSTR monitorexit ;
        return;
        exception;
        zzid1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzg(long l)
        throws zzfs.zza
    {
        do
        {
            if (!zze(l))
            {
                throw new zzfs.zza("Timed out waiting for WebView to finish loading.", 2);
            }
            if (zzxo)
            {
                throw new zzfs.zza("Received cancellation request from creative.", 0);
            }
        } while (!zzBe);
    }
}
