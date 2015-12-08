// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;


// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room

public interface RoomUpdateListener
{

    public abstract void onJoinedRoom(int i, Room room);

    public abstract void onLeftRoom(int i, String s);

    public abstract void onRoomConnected(int i, Room room);

    public abstract void onRoomCreated(int i, Room room);
}
