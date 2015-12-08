// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzk, zzm, zzl

abstract class zzPS extends zzPS
{

    public final int statusCode;
    public final Bundle zzPS;
    final zzk zzPT;

    protected void zzc(Boolean boolean1)
    {
        if (boolean1 != null) goto _L2; else goto _L1
_L1:
        zzk.zza(zzPT, 1, null);
_L4:
        return;
_L2:
        switch (statusCode)
        {
        default:
            if (zzPS != null)
            {
                boolean1 = (PendingIntent)zzPS.getParcelable("pendingIntent");
            } else
            {
                boolean1 = null;
            }
            if (zzk.zzf(zzPT) != null)
            {
                zzk.zzg(zzPT).zzb(zzPT.zzcF(), zzk.zzf(zzPT), zzPT.zziZ());
                zzk.zza(zzPT, null);
            }
            zzk.zza(zzPT, 1, null);
            zzf(new ConnectionResult(statusCode, boolean1));
            return;

        case 0: // '\0'
            if (!zzje())
            {
                if (zzk.zzf(zzPT) != null)
                {
                    zzk.zzg(zzPT).zzb(zzPT.zzcF(), zzk.zzf(zzPT), zzPT.zziZ());
                    zzk.zza(zzPT, null);
                }
                zzk.zza(zzPT, 1, null);
                zzf(new ConnectionResult(8, null));
                return;
            }
            break;

        case 10: // '\n'
            zzk.zza(zzPT, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void zzf(ConnectionResult connectionresult)
    {
        zzk.zza(zzPT).zzg(connectionresult);
    }

    protected void zzi(Object obj)
    {
        zzc((Boolean)obj);
    }

    protected abstract boolean zzje();

    protected void zzjf()
    {
    }

    protected (zzk zzk1, int i, Bundle bundle)
    {
        zzPT = zzk1;
        super(zzk1, Boolean.valueOf(true));
        statusCode = i;
        zzPS = bundle;
    }
}
