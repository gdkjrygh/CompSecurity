// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class IQ extends com.google.android.gms.internal.lback
    implements com.google.android.gms.games.Callback
{

    final GamesClientImpl IJ;
    private final String IP;
    private final boolean IQ;
    private final Status wJ;

    protected void a(Object obj)
    {
        c((com.google.android.gms.common.api.ack.c)obj);
    }

    protected void c(com.google.android.gms.common.api.ack ack)
    {
        ack.ack(this);
    }

    protected void dx()
    {
    }

    public Status getStatus()
    {
        return wJ;
    }

    public (GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack);
        wJ = new Status(dataholder.getStatusCode());
        if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
        IP = dataholder.getString("external_game_id", 0, 0);
        IQ = dataholder.getBoolean("muted", 0, 0);
_L4:
        dataholder.close();
        return;
_L2:
        IP = null;
        IQ = false;
        if (true) goto _L4; else goto _L3
_L3:
        gamesclientimpl;
        dataholder.close();
        throw gamesclientimpl;
    }
}
