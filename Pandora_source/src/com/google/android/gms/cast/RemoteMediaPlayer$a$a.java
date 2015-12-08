// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private final class b
    implements ResultCallback
{

    final a a;
    private final long b;

    public void a(Status status)
    {
        if (!status.isSuccess())
        {
            RemoteMediaPlayer.zze(a.a).zzb(b, status.getStatusCode());
        }
    }

    public void onResult(Result result)
    {
        a((Status)result);
    }

    ( , long l)
    {
        a = ;
        super();
        b = l;
    }
}
