// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.WaitingRoomListener;

public final class RealTimeMultiplayerImpl
    implements RealTimeMultiplayer
{

    public RealTimeMultiplayerImpl()
    {
    }

    public final void declineInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.declineInvitation(s, 0);
        }
    }

    public final void declineInvitationFirstParty(GoogleApiClient googleapiclient, String s, String s1)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.declineInvitationFirstParty(s, s1, 0);
        }
    }

    public final void dismissInvitation(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.dismissInvitation(s, 0);
        }
    }

    public final void dismissInvitationFirstParty(GoogleApiClient googleapiclient, String s, String s1)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.dismissInvitationFirstParty(s, s1, 0);
        }
    }

    public final Room registerWaitingRoomListenerRestricted(GoogleApiClient googleapiclient, WaitingRoomListener waitingroomlistener, String s)
    {
        waitingroomlistener = googleapiclient.registerListener(waitingroomlistener);
        return Games.getConnectedClientImpl(googleapiclient).registerWaitingRoomListenerRestricted(waitingroomlistener, s);
    }

    public final int unregisterWaitingRoomListenerRestricted(GoogleApiClient googleapiclient, String s)
    {
        return Games.getConnectedClientImpl(googleapiclient).unregisterWaitingRoomListenerRestricted(s);
    }
}
