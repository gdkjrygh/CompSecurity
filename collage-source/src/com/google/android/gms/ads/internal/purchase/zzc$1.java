// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.es;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzc, zzf, zzk, zzg

class val.intent
    implements Runnable
{

    final Intent val$intent;
    final zzf zzBU;
    final zzc zzBV;

    public void run()
    {
        if (zzc.zza(zzBV).zza(zzBU.zzCe, -1, val$intent))
        {
            zzc.zzc(zzBV).a(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzBV), zzBU.zzCf, true, -1, val$intent, zzBU));
            return;
        }
        try
        {
            zzc.zzc(zzBV).a(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzBV), zzBU.zzCf, false, -1, val$intent, zzBU));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzaE("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (zzf zzf1, Intent intent1)
    {
        zzBV = final_zzc1;
        zzBU = zzf1;
        val$intent = intent1;
        super();
    }
}
