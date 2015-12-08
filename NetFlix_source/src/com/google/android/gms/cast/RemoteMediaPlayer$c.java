// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private static final class yn
    implements diaChannelResult
{

    private final Status wJ;
    private final JSONObject yn;

    public Status getStatus()
    {
        return wJ;
    }

    diaChannelResult(Status status, JSONObject jsonobject)
    {
        wJ = status;
        yn = jsonobject;
    }
}
