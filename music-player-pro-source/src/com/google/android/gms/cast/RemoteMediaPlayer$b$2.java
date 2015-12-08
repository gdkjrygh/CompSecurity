// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class DS
    implements aChannelResult
{

    final Status DS;
    final DS GS;

    public JSONObject getCustomData()
    {
        return null;
    }

    public Status getStatus()
    {
        return DS;
    }

    aChannelResult(aChannelResult achannelresult, Status status)
    {
        GS = achannelresult;
        DS = status;
        super();
    }
}
