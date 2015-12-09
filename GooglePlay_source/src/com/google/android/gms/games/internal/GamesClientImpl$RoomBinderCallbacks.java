// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

// Referenced classes of package com.google.android.gms.games.internal:
//            AbstractGamesCallbacks, GamesClientImpl

private static final class mRoomStatusCallbacks extends AbstractGamesCallbacks
{

    private final ListenerHolder mRealTimeMessageReceivedCallbacks = null;
    private final ListenerHolder mRoomCallbacks;
    private final ListenerHolder mRoomStatusCallbacks;

    public final void onConnectedToRoom(DataHolder dataholder)
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new ier(dataholder));
        }
    }

    public final void onDisconnectedFromRoom(DataHolder dataholder)
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new Notifier(dataholder));
        }
    }

    public final void onJoinedRoom(DataHolder dataholder)
    {
        mRoomCallbacks.notifyListener(new init>(dataholder));
    }

    public final void onLeftRoom(int i, String s)
    {
        mRoomCallbacks.notifyListener(new it>(i, s));
    }

    public final void onP2PConnected(String s)
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new (s));
        }
    }

    public final void onP2PDisconnected(String s)
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new ier(s));
        }
    }

    public final void onPeerConnected(DataHolder dataholder, String as[])
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new r(dataholder, as));
        }
    }

    public final void onPeerDeclined(DataHolder dataholder, String as[])
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new (dataholder, as));
        }
    }

    public final void onPeerDisconnected(DataHolder dataholder, String as[])
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new fier(dataholder, as));
        }
    }

    public final void onPeerInvitedToRoom(DataHolder dataholder, String as[])
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new ifier(dataholder, as));
        }
    }

    public final void onPeerJoinedRoom(DataHolder dataholder, String as[])
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new er(dataholder, as));
        }
    }

    public final void onPeerLeftRoom(DataHolder dataholder, String as[])
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new (dataholder, as));
        }
    }

    public final void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
    {
    }

    public final void onRoomAutoMatching(DataHolder dataholder)
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new fier(dataholder));
        }
    }

    public final void onRoomConnected(DataHolder dataholder)
    {
        mRoomCallbacks.notifyListener(new r(dataholder));
    }

    public final void onRoomConnecting(DataHolder dataholder)
    {
        if (mRoomStatusCallbacks != null)
        {
            mRoomStatusCallbacks.notifyListener(new er(dataholder));
        }
    }

    public final void onRoomCreated(DataHolder dataholder)
    {
        mRoomCallbacks.notifyListener(new <init>(dataholder));
    }

    public er(ListenerHolder listenerholder, ListenerHolder listenerholder1)
    {
        mRoomCallbacks = (ListenerHolder)Preconditions.checkNotNull(listenerholder, "Callbacks must not be null");
        mRoomStatusCallbacks = listenerholder1;
    }
}
