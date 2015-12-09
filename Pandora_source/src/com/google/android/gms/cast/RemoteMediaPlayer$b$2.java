// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class a
    implements aChannelResult
{

    final Status a;
    final a b;

    public JSONObject getCustomData()
    {
        return null;
    }

    public Status getStatus()
    {
        return a;
    }

    aChannelResult(aChannelResult achannelresult, Status status)
    {
        b = achannelresult;
        a = status;
        super();
    }
}
