// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

final class IV extends com.google.android.gms.internal.lback
{

    final GamesClientImpl IJ;
    private final String IV;

    protected void a(Object obj)
    {
        b((OnInvitationReceivedListener)obj);
    }

    protected void b(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        oninvitationreceivedlistener.onInvitationRemoved(IV);
    }

    protected void dx()
    {
    }

    (GamesClientImpl gamesclientimpl, OnInvitationReceivedListener oninvitationreceivedlistener, String s)
    {
        IJ = gamesclientimpl;
        super(gamesclientimpl, oninvitationreceivedlistener);
        IV = s;
    }
}
