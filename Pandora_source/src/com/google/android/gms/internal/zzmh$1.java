// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ContainerHolder;

// Referenced classes of package com.google.android.gms.internal:
//            zzmh, k

class a
    implements ResultCallback
{

    final zzmh a;

    public void a(ContainerHolder containerholder)
    {
        if (containerholder.getStatus().isSuccess())
        {
            containerholder = containerholder.getContainer();
        } else
        {
            containerholder = null;
        }
        containerholder = new k(zzmh.zza(a), containerholder, a.zzyd());
        zzmh.zza(a, containerholder.a());
        zzmh.zzb(a);
    }

    public void onResult(Result result)
    {
        a((ContainerHolder)result);
    }

    t(zzmh zzmh1)
    {
        a = zzmh1;
        super();
    }
}
