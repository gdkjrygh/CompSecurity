// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

private static final class Fl
    implements diaChannelResult
{

    private final Status CM;
    private final JSONObject Fl;

    public JSONObject getCustomData()
    {
        return Fl;
    }

    public Status getStatus()
    {
        return CM;
    }

    diaChannelResult(Status status, JSONObject jsonobject)
    {
        CM = status;
        Fl = jsonobject;
    }
}
