// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.go;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private final class Bo
    implements ResultCallback
{

    private final long Bo;
    final k Bp;

    public void k(Status status)
    {
        if (!status.isSuccess())
        {
            RemoteMediaPlayer.e(Bp.).a(Bo, status.getStatusCode());
        }
    }

    public void onResult(Result result)
    {
        k((Status)result);
    }

    ( , long l)
    {
        Bp = ;
        super();
        Bo = l;
    }
}
