// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ContainerHolder;

// Referenced classes of package com.google.android.gms.internal:
//            zztb, zzsz

class zzatH
    implements ResultCallback
{

    final zztb zzatH;

    public void onResult(Result result)
    {
        zza((ContainerHolder)result);
    }

    public void zza(ContainerHolder containerholder)
    {
        if (containerholder.getStatus().isSuccess())
        {
            containerholder = containerholder.getContainer();
        } else
        {
            containerholder = null;
        }
        containerholder = new zzsz(zztb.zza(zzatH), containerholder, zzatH.zzrB());
        zztb.zza(zzatH, containerholder.zzrv());
        zztb.zzb(zzatH);
    }

    inerHolder(zztb zztb1)
    {
        zzatH = zztb1;
        super();
    }
}
