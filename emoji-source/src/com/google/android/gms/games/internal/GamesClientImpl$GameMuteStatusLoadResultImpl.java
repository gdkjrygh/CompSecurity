// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class NM
    implements com.google.android.gms.games.sultImpl
{

    private final String NL;
    private final boolean NM;
    private final Status yz;

    public Status getStatus()
    {
        return yz;
    }

    public (DataHolder dataholder)
    {
        yz = new Status(dataholder.getStatusCode());
        if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
        NL = dataholder.c("external_game_id", 0, 0);
        NM = dataholder.d("muted", 0, 0);
_L4:
        dataholder.close();
        return;
_L2:
        NL = null;
        NM = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
    }
}
