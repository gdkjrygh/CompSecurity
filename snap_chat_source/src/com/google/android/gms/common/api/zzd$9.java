// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import java.util.Map;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzd, Api

class zzNg
    implements ApiClient.OnConnectionFailedListener
{

    final zzd zzNb;
    final int zzNf;
    final Api zzNg;

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        zzd.zza(zzNb).lock();
        boolean flag = zzNb.isConnecting();
        if (!flag)
        {
            zzd.zza(zzNb).unlock();
            return;
        }
        if (zzNf != 2)
        {
            int i = zzNg.zzhT().getPriority();
            if (zzd.zza(zzNb, i, zzNf, connectionresult))
            {
                zzd.zza(zzNb, connectionresult);
                zzd.zzb(zzNb, i);
            }
        }
        zzd.zzm(zzNb).put(zzNg.zzhV(), connectionresult);
        zzd.zzc(zzNb);
        zzd.zza(zzNb).unlock();
        return;
        connectionresult;
        zzd.zza(zzNb).unlock();
        throw connectionresult;
    }

    Result(zzd zzd1, int i, Api api)
    {
        zzNb = zzd1;
        zzNf = i;
        zzNg = api;
        super();
    }
}
