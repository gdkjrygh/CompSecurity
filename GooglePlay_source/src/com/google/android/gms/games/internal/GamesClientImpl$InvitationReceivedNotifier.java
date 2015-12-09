// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mInvitation
    implements com.google.android.gms.common.api.internal.tation
{

    private final Invitation mInvitation;

    public final volatile void notifyListener(Object obj)
    {
        ((OnInvitationReceivedListener)obj).onInvitationReceived$4945a01a();
    }

    public final void onNotifyListenerFailed()
    {
    }

    (Invitation invitation)
    {
        mInvitation = invitation;
    }
}
