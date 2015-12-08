// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.OnRequestReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class Ox extends com.google.android.gms.internal.lback
{

    final GamesClientImpl NB;
    private final GameRequest Ox;

    protected void b(OnRequestReceivedListener onrequestreceivedlistener)
    {
        onrequestreceivedlistener.onRequestReceived(Ox);
    }

    protected void d(Object obj)
    {
        b((OnRequestReceivedListener)obj);
    }

    protected void fp()
    {
    }

    (GamesClientImpl gamesclientimpl, OnRequestReceivedListener onrequestreceivedlistener, GameRequest gamerequest)
    {
        NB = gamesclientimpl;
        super(gamesclientimpl, onrequestreceivedlistener);
        Ox = gamerequest;
    }
}
