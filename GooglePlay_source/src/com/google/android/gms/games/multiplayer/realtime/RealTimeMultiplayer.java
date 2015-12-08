// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            WaitingRoomListener, Room

public interface RealTimeMultiplayer
{

    public abstract void declineInvitation(GoogleApiClient googleapiclient, String s);

    public abstract void declineInvitationFirstParty(GoogleApiClient googleapiclient, String s, String s1);

    public abstract void dismissInvitation(GoogleApiClient googleapiclient, String s);

    public abstract void dismissInvitationFirstParty(GoogleApiClient googleapiclient, String s, String s1);

    public abstract Room registerWaitingRoomListenerRestricted(GoogleApiClient googleapiclient, WaitingRoomListener waitingroomlistener, String s);

    public abstract int unregisterWaitingRoomListenerRestricted(GoogleApiClient googleapiclient, String s);
}
