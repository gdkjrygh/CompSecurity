// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class Jn extends back
    implements com.google.android.gms.games.request.lback
{

    final GamesClientImpl IJ;
    private final GameRequest Jn = null;

    protected void a(com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        ack.ack(this);
    }

    protected volatile void a(Object obj, DataHolder dataholder)
    {
        a((com.google.android.gms.common.api.ack.a)obj, dataholder);
    }

    back(GamesClientImpl gamesclientimpl, com.google.android.gms.common.api.ack ack, DataHolder dataholder)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, ack, dataholder);
        gamesclientimpl = new GameRequestBuffer(dataholder);
        if (gamesclientimpl.getCount() <= 0) goto _L2; else goto _L1
_L1:
        Jn = (GameRequest)((GameRequest)gamesclientimpl.get(0)).freeze();
_L4:
        gamesclientimpl.close();
        return;
_L2:
        if (true) goto _L4; else goto _L3
_L3:
        ack;
        gamesclientimpl.close();
        throw ack;
    }
}
