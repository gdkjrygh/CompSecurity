// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class wz
    implements aChannelResult
{

    final Status wz;
    final wz yX;

    public Status getStatus()
    {
        return wz;
    }

    aChannelResult(aChannelResult achannelresult, Status status)
    {
        yX = achannelresult;
        wz = status;
        super();
    }
}
