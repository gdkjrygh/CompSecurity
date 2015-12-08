// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import java.util.List;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room

public interface RoomStatusUpdateListener
{

    public abstract void onConnectedToRoom(Room room);

    public abstract void onDisconnectedFromRoom(Room room);

    public abstract void onP2PConnected(String s);

    public abstract void onP2PDisconnected(String s);

    public abstract void onPeerDeclined(Room room, List list);

    public abstract void onPeerInvitedToRoom(Room room, List list);

    public abstract void onPeerJoined(Room room, List list);

    public abstract void onPeerLeft(Room room, List list);

    public abstract void onPeersConnected(Room room, List list);

    public abstract void onPeersDisconnected(Room room, List list);

    public abstract void onRoomAutoMatching(Room room);

    public abstract void onRoomConnecting(Room room);
}
