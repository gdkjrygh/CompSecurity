// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            RoomConfig, RealTimeSocket, Room, RoomUpdateListener

public interface RealTimeMultiplayer
{
    public static interface ReliableMessageSentCallback
    {

        public abstract void onRealTimeMessageSent(int i, int j, String s);
    }


    public static final int REAL_TIME_MESSAGE_FAILED = -1;

    public abstract void create(GoogleApiClient googleapiclient, RoomConfig roomconfig);

    public abstract void declineInvitation(GoogleApiClient googleapiclient, String s);

    public abstract void dismissInvitation(GoogleApiClient googleapiclient, String s);

    public abstract Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j);

    public abstract Intent getSelectOpponentsIntent(GoogleApiClient googleapiclient, int i, int j, boolean flag);

    public abstract RealTimeSocket getSocketForParticipant(GoogleApiClient googleapiclient, String s, String s1);

    public abstract Intent getWaitingRoomIntent(GoogleApiClient googleapiclient, Room room, int i);

    public abstract void join(GoogleApiClient googleapiclient, RoomConfig roomconfig);

    public abstract void leave(GoogleApiClient googleapiclient, RoomUpdateListener roomupdatelistener, String s);

    public abstract int sendReliableMessage(GoogleApiClient googleapiclient, ReliableMessageSentCallback reliablemessagesentcallback, byte abyte0[], String s, String s1);

    public abstract int sendUnreliableMessage(GoogleApiClient googleapiclient, byte abyte0[], String s, String s1);

    public abstract int sendUnreliableMessage(GoogleApiClient googleapiclient, byte abyte0[], String s, List list);

    public abstract int sendUnreliableMessageToOthers(GoogleApiClient googleapiclient, byte abyte0[], String s);
}
