// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zzj, zzv

protected final class nit> extends nit>
{

    final zzi zzTz;

    protected void zzi(ConnectionResult connectionresult)
    {
        if (com.google.android.gms.common.internal.zzi.zza(zzTz))
        {
            com.google.android.gms.common.internal.zzi.zzb(zzTz).zza(connectionresult);
            return;
        } else
        {
            com.google.android.gms.common.internal.zzi.zzc(zzTz).zzj(connectionresult);
            return;
        }
    }

    protected boolean zzma()
    {
        if (com.google.android.gms.common.internal.zzi.zza(zzTz))
        {
            boolean flag;
            if (com.google.android.gms.common.internal.zzi.zzb(zzTz) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzv.zza(flag, "mConnectionProgressReportCallbacks should not be null if mReportProgress");
            com.google.android.gms.common.internal.zzi.zzb(zzTz).zza(ConnectionResult.zzOI);
            return true;
        } else
        {
            zzTz.zza(null, com.google.android.gms.common.internal.zzi.zze(zzTz));
            return true;
        }
    }

    public nt.zza(zzi zzi1)
    {
        zzTz = zzi1;
        super(zzi1, 0, null);
    }
}
