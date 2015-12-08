// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private final class NP extends com.google.android.gms.internal.lback
{

    final GamesClientImpl NE;
    private final Invitation NP;

    protected void b(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        oninvitationreceivedlistener.onInvitationReceived(NP);
    }

    protected void d(Object obj)
    {
        b((OnInvitationReceivedListener)obj);
    }

    protected void fu()
    {
    }

    (GamesClientImpl gamesclientimpl, OnInvitationReceivedListener oninvitationreceivedlistener, Invitation invitation)
    {
        NE = gamesclientimpl;
        super(gamesclientimpl, oninvitationreceivedlistener);
        NP = invitation;
    }
}
