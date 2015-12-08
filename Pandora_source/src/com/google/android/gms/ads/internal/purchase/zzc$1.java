// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzdv;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzc, zzf, zzk, zzg

class b
    implements Runnable
{

    final zzf a;
    final Intent b;
    final zzc c;

    public void run()
    {
        if (zzc.zza(c).zza(a.zzxH, -1, b))
        {
            zzc.zzc(c).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(c), a.zzxI, true, -1, b, a));
            return;
        }
        try
        {
            zzc.zzc(c).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(c), a.zzxI, false, -1, b, a));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzan("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (zzc zzc1, zzf zzf1, Intent intent)
    {
        c = zzc1;
        a = zzf1;
        b = intent;
        super();
    }
}
