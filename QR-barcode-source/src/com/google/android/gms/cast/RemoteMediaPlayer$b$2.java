// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class CW
    implements aChannelResult
{

    final Status CW;
    final CW Gc;

    public JSONObject getCustomData()
    {
        return null;
    }

    public Status getStatus()
    {
        return CW;
    }

    aChannelResult(aChannelResult achannelresult, Status status)
    {
        Gc = achannelresult;
        CW = status;
        super();
    }
}
