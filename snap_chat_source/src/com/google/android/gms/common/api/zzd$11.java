// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzd

class zzNb
    implements piClient.OnConnectionFailedListener
{

    final zzd zzNb;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzd.zza(zzNb).lock();
        zzd.zzb(zzNb, new ConnectionResult(8, null));
        zzd.zza(zzNb).unlock();
        return;
        connectionresult;
        zzd.zza(zzNb).unlock();
        throw connectionresult;
    }

    esult(zzd zzd1)
    {
        zzNb = zzd1;
        super();
    }
}
