// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class YF
    implements com.google.android.gms.common.api.ier
{

    private final Invitation YF;

    public void a(OnInvitationReceivedListener oninvitationreceivedlistener)
    {
        oninvitationreceivedlistener.onInvitationReceived(YF);
    }

    public void c(Object obj)
    {
        a((OnInvitationReceivedListener)obj);
    }

    public void gG()
    {
    }

    (Invitation invitation)
    {
        YF = invitation;
    }
}
