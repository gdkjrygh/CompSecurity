// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api:
//            zzd

class f extends f
{

    final zzd zzNb;

    public void onConnected(Bundle bundle)
    {
        zzd.zza(zzNb).lock();
        boolean flag = zzNb.isConnecting();
        if (!flag)
        {
            zzd.zza(zzNb).unlock();
            return;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        zzd.zzb(zzNb).putAll(bundle);
        zzd.zzc(zzNb);
        zzd.zza(zzNb).unlock();
        return;
        bundle;
        zzd.zza(zzNb).unlock();
        throw bundle;
    }

    f(zzd zzd1)
    {
        zzNb = zzd1;
        super(zzd1, null);
    }
}
