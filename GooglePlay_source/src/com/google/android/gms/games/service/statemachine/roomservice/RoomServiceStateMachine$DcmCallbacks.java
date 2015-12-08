// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.realtime.PeerConnectionInfo;
import com.google.android.gms.games.realtime.network.DataConnectionCallbacks;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.service.PlayRoomAndroidService;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomservice:
//            RoomServiceStateMachine

final class this._cls0
    implements DataConnectionCallbacks
{

    final RoomServiceStateMachine this$0;

    public final void onDataConnectionFailed(PeerConnectionInfo peerconnectioninfo)
    {
        sendMessage(new t>(peerconnectioninfo));
    }

    public final void onDataConnectionSucceeded(PeerConnectionInfo peerconnectioninfo)
    {
        sendMessage(new init>(peerconnectioninfo));
    }

    public final void onNetworkDisconnected()
    {
        sendMessage(new t>());
    }

    public final void onNetworkFailedForMatch()
    {
        sendMessage(new t>());
    }

    public final void onNetworkReadyForMatch(String s, int i)
    {
        sendMessage(new t>(s, i));
    }

    public final void onReceiveBuzzNotification(String s, String s1)
    {
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.d("RoomServiceStateMachine", "ReceivedBuzzNotification");
        }
        s = (new JSONArray(s)).getString(0);
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.v("RoomServiceStateMachine", (new StringBuilder("Received notification ")).append(s).toString());
        }
        s1 = s1.substring(s1.indexOf("{"));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        boolean flag = "STATUS".equals(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        s = PlayRoomAndroidService.parseJsonRoomStatus(s1);
        GamesLog.d("RoomServiceStateMachine", s.toString());
        sendMessage(new >(s));
        return;
        s;
        try
        {
            GamesLog.e("RoomServiceStateMachine", "MatchStatus parsing error for payload");
            throw new IllegalArgumentException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.e("RoomServiceStateMachine", "Json parsing error for payload");
        }
        throw new IllegalArgumentException(s);
        GamesLog.e("RoomServiceStateMachine", (new StringBuilder("Invalid notification type :")).append(s).toString());
        return;
    }

    public final void onReliableReceiveData(String s, byte abyte0[])
    {
        sendMessage(new >(abyte0, s, 1));
    }

    public final void onReliableSendResult(int i, String s, boolean flag)
    {
        int j = 0;
        if (RoomServiceStateMachine.DBG)
        {
            GamesLog.pii("RoomServiceStateMachine", String.format("Message Send: to %s, result = %s, token = %s", new Object[] {
                s, Boolean.valueOf(flag), Integer.valueOf(i)
            }));
        }
        if (!flag)
        {
            j = 7001;
        }
        sendMessage(new (i, j, s));
    }

    public final void onUnreliableReceiveData(String s, byte abyte0[])
    {
        sendMessage(new (abyte0, s, 0));
    }

    ()
    {
        this$0 = RoomServiceStateMachine.this;
        super();
    }
}
