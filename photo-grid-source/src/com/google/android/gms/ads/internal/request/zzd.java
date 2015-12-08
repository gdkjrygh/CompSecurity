// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.pe;
import com.google.android.gms.internal.pj;
import com.google.android.gms.internal.wg;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzg, zzj, AdResponseParcel, AdRequestInfoParcel

public abstract class zzd extends pj
    implements zzc.zza
{

    private final AdRequestInfoParcel a;
    private final zzc.zza b;
    private final Object c = new Object();
    private AdResponseParcel d;

    public zzd(AdRequestInfoParcel adrequestinfoparcel, zzc.zza zza)
    {
        a = adrequestinfoparcel;
        b = zza;
    }

    private boolean a(long l)
    {
        l = 60000L - (zzp.zzbz().b() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            c.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            return false;
        }
        return true;
    }

    private boolean a(zzj zzj1, AdRequestInfoParcel adrequestinfoparcel)
    {
        zzj1.zza(adrequestinfoparcel, new zzg(this));
        return true;
        zzj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service.", zzj1);
        zzp.zzby().a(zzj1, true);
_L2:
        b.zzb(new AdResponseParcel(0));
        return false;
        zzj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzj1);
        zzp.zzby().a(zzj1, true);
        continue; /* Loop/switch isn't completed */
        zzj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzj1);
        zzp.zzby().a(zzj1, true);
        continue; /* Loop/switch isn't completed */
        zzj1;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not fetch ad response from ad request service due to an Exception.", zzj1);
        zzp.zzby().a(zzj1, true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void onStop()
    {
        zzfH();
    }

    public void zzb(AdResponseParcel adresponseparcel)
    {
        synchronized (c)
        {
            d = adresponseparcel;
            c.notify();
        }
        return;
        adresponseparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adresponseparcel;
    }

    public void zzbn()
    {
        Object obj = zzfI();
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new AdResponseParcel(0);
        b.zzb(((AdResponseParcel) (obj)));
_L4:
        zzfH();
        return;
_L2:
        if (!a(((zzj) (obj)), a)) goto _L4; else goto _L3
_L3:
        long l = zzp.zzbz().b();
        if (true) goto _L6; else goto _L5
_L5:
        obj1;
        JVM INSTR monitorenter ;
_L6:
        synchronized (c)
        {
            if (d == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            b.zzb(d);
        }
          goto _L4
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        obj1;
        zzfH();
        throw obj1;
        if (a(l)) goto _L6; else goto _L7
_L7:
        if (d == null) goto _L9; else goto _L8
_L8:
        b.zzb(d);
_L10:
        obj1;
        JVM INSTR monitorexit ;
          goto _L4
_L9:
        b.zzb(new AdResponseParcel(0));
          goto _L10
    }

    public abstract void zzfH();

    public abstract zzj zzfI();
}
