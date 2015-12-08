// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.util.Log;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzd

class zzNb
    implements ApiClient.zza
{

    final zzd zzNb;

    private void zzap(int i)
    {
        zzd.zza(zzNb).lock();
        if (zzd.zzh(zzNb) == i)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        Log.wtf("GoogleApiClientImpl", String.format("Internal error: step mismatch. Expected: %d, Actual: %d", new Object[] {
            Integer.valueOf(zzd.zzh(zzNb)), Integer.valueOf(i)
        }));
        zzd.zza(zzNb, 4);
        zzd.zza(zzNb).unlock();
        return;
        if (zzd.zzi(zzNb) == 1)
        {
            zzd.zzc(zzNb);
        }
        zzd.zza(zzNb).unlock();
        return;
        Exception exception;
        exception;
        zzd.zza(zzNb).unlock();
        throw exception;
    }

    public void zzia()
    {
        zzap(0);
    }

    public void zzib()
    {
        zzap(1);
    }

    ApiClient.zza(zzd zzd1)
    {
        zzNb = zzd1;
        super();
    }
}
