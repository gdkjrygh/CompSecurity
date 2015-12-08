// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeSocket;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import java.util.List;

public final class RealTimeMultiplayerImpl
    implements RealTimeMultiplayer
{

    public RealTimeMultiplayerImpl()
    {
    }

    public void create(GoogleApiClient googleapiclient, RoomConfig roomconfig)
    {
        Games.c(googleapiclient).a(roomconfig);
    }

    public void declineInvitation(GoogleApiClient googleapiclient, String s)
    {
        Games.c(googleapiclient).n(s, 0);
    }

    public void dismissInvitation(GoogleApiClient googleapiclient, String s)
    {
        Games.c(googleapiclient).m(s, 0);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j)
    {
        return Games.c(googleapiclient).b(i, j, true);
    }

    public Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j, boolean flag)
    {
        return Games.c(googleapiclient).b(i, j, flag);
    }

    public RealTimeSocket getSocketForParticipant(GoogleApiClient googleapiclient, String s, String s1)
    {
        return Games.c(googleapiclient).l(s, s1);
    }

    public Intent getWaitingRoomIntent(GoogleApiClient googleapiclient, Room room, int i)
    {
        return Games.c(googleapiclient).a(room, i);
    }

    public void join(GoogleApiClient googleapiclient, RoomConfig roomconfig)
    {
        Games.c(googleapiclient).b(roomconfig);
    }

    public void leave(GoogleApiClient googleapiclient, RoomUpdateListener roomupdatelistener, String s)
    {
        Games.c(googleapiclient).a(roomupdatelistener, s);
    }

    public int sendReliableMessage(GoogleApiClient googleapiclient, com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback, byte abyte0[], String s, String s1)
    {
        return Games.c(googleapiclient).a(reliablemessagesentcallback, abyte0, s, s1);
    }

    public int sendUnreliableMessage(GoogleApiClient googleapiclient, byte abyte0[], String s, String s1)
    {
        return Games.c(googleapiclient).a(abyte0, s, new String[] {
            s1
        });
    }

    public int sendUnreliableMessage(GoogleApiClient googleapiclient, byte abyte0[], String s, List list)
    {
        list = (String[])list.toArray(new String[list.size()]);
        return Games.c(googleapiclient).a(abyte0, s, list);
    }

    public int sendUnreliableMessageToOthers(GoogleApiClient googleapiclient, byte abyte0[], String s)
    {
        return Games.c(googleapiclient).d(abyte0, s);
    }
}
