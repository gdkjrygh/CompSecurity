// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class WN extends com.google.android.gms.common.internal.N
{

    final GamesClientImpl WC;
    private final Invitation WN;

    protected void b(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        oninvitationreceivedlistener.onInvitationReceived(WN);
    }

    protected void g(Object obj)
    {
        b((OnInvitationReceivedListener)obj);
    }

    protected void gT()
    {
    }

    (GamesClientImpl gamesclientimpl, OnInvitationReceivedListener oninvitationreceivedlistener, Invitation invitation)
    {
        WC = gamesclientimpl;
        super(gamesclientimpl, oninvitationreceivedlistener);
        WN = invitation;
    }
}
