// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;


// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room

public interface RoomStatusUpdateListener
{

    public abstract void onConnectedToRoom(Room room);

    public abstract void onDisconnectedFromRoom(Room room);

    public abstract void onPeerDeclined$40879e9d(Room room);

    public abstract void onPeerInvitedToRoom$40879e9d(Room room);

    public abstract void onPeerJoined$40879e9d(Room room);

    public abstract void onPeerLeft$40879e9d(Room room);

    public abstract void onPeersConnected$40879e9d(Room room);

    public abstract void onPeersDisconnected$40879e9d(Room room);

    public abstract void onRoomAutoMatching(Room room);

    public abstract void onRoomConnecting(Room room);
}
