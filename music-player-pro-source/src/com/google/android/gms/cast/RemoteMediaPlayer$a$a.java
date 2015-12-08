// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.it;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private final class GP
    implements ResultCallback
{

    private final long GP;
    final j GQ;

    public void j(Status status)
    {
        if (!status.isSuccess())
        {
            RemoteMediaPlayer.e(GQ.).b(GP, status.getStatusCode());
        }
    }

    public void onResult(Result result)
    {
        j((Status)result);
    }

    ( , long l)
    {
        GQ = ;
        super();
        GP = l;
    }
}
