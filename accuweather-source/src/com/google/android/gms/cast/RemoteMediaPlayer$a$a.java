// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gp;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private final class Bl
    implements ResultCallback
{

    private final long Bl;
    final k Bm;

    public void k(Status status)
    {
        if (!status.isSuccess())
        {
            RemoteMediaPlayer.e(Bm.).a(Bl, status.getStatusCode());
        }
    }

    public void onResult(Result result)
    {
        k((Status)result);
    }

    ( , long l)
    {
        Bm = ;
        super();
        Bl = l;
    }
}
