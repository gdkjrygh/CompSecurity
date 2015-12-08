// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.es;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private final class yU
    implements ResultCallback
{

    private final long yU;
    final i yV;

    public void i(Status status)
    {
        if (!status.isSuccess())
        {
            RemoteMediaPlayer.e(yV.).a(yU, status.getStatusCode());
        }
    }

    public void onResult(Result result)
    {
        i((Status)result);
    }

    ( , long l)
    {
        yV = ;
        super();
        yU = l;
    }
}
