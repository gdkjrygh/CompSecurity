// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            zzfd, zzfg, zzfl, zzfh, 
//            zzfs, zzhx

class zzvd
    implements Runnable
{

    final zzfg zzvc;
    final Intent zzvd;
    final zzfd zzve;

    public void run()
    {
        if (zzfd.zza(zzve).zza(zzvc.zzvn, -1, zzvd))
        {
            zzfd.zzc(zzve).zza(new zzfh(zzfd.zzb(zzve), zzvc.zzvo, true, -1, zzvd, zzvc));
            return;
        }
        try
        {
            zzfd.zzc(zzve).zza(new zzfh(zzfd.zzb(zzve), zzvc.zzvo, false, -1, zzvd, zzvc));
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzhx.zzac("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (zzfd zzfd1, zzfg zzfg1, Intent intent)
    {
        zzve = zzfd1;
        zzvc = zzfg1;
        zzvd = intent;
        super();
    }
}
