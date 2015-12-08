// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.iq;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private final class FZ
    implements ResultCallback
{

    private final long FZ;
    final k Ga;

    public void k(Status status)
    {
        if (!status.isSuccess())
        {
            RemoteMediaPlayer.e(Ga.).b(FZ, status.getStatusCode());
        }
    }

    public void onResult(Result result)
    {
        k((Status)result);
    }

    ( , long l)
    {
        Ga = ;
        super();
        FZ = l;
    }
}
