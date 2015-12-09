// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

final class Jm extends AbstractGamesCallbacks
{

    final GamesClientImpl IJ;
    private final OnRequestReceivedListener Jm;

    public void m(DataHolder dataholder)
    {
        GameRequestBuffer gamerequestbuffer;
        gamerequestbuffer = new GameRequestBuffer(dataholder);
        dataholder = null;
        if (gamerequestbuffer.getCount() > 0)
        {
            dataholder = (GameRequest)((GameRequest)gamerequestbuffer.get(0)).freeze();
        }
        gamerequestbuffer.close();
        if (dataholder != null)
        {
            IJ.a(new (IJ, Jm, dataholder));
        }
        return;
        dataholder;
        gamerequestbuffer.close();
        throw dataholder;
    }

    public void onRequestRemoved(String s)
    {
        IJ.a(new IJ(IJ, Jm, s));
    }

    Y(GamesClientImpl gamesclientimpl, OnRequestReceivedListener onrequestreceivedlistener)
    {
        IJ = gamesclientimpl;
        super();
        Jm = onrequestreceivedlistener;
    }
}
