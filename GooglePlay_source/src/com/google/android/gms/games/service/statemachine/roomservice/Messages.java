// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomservice;

import android.content.Context;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.realtime.PeerConnectionInfo;
import com.google.android.gms.games.server.api.RoomStatus;
import com.google.android.gms.games.service.statemachine.MessageBase;

public final class Messages
{
    public static final class ConnectNetworkData extends MessageBase
    {

        public final String accountBareJid;
        public final String authToken;
        public final String playerId;

        public ConnectNetworkData(String s, String s1, String s2)
        {
            super(14);
            playerId = s;
            authToken = s1;
            accountBareJid = s2;
        }
    }

    public static final class CreateNativeSocketConnectionData extends MessageBase
    {

        public String participantId;
        public int token;

        public CreateNativeSocketConnectionData(String s, int i)
        {
            super(1);
            participantId = s;
            token = i;
        }
    }

    public static final class CreateSocketConnectionData extends MessageBase
    {

        public String participantId;
        public int token;

        public CreateSocketConnectionData(String s, int i)
        {
            super(0);
            participantId = s;
            token = i;
        }
    }

    public static final class DcmConnectFailedData extends MessageBase
    {

        public DcmConnectFailedData()
        {
            super(16);
        }
    }

    public static final class DcmConnectOkData extends MessageBase
    {

        public final String fullJid;
        public final int registrationLatency;

        public DcmConnectOkData(String s, int i)
        {
            super(17);
            fullJid = s;
            registrationLatency = i;
        }
    }

    public static final class DisconnectNetworkData extends MessageBase
    {

        public DisconnectNetworkData()
        {
            super(19);
        }
    }

    public static final class DoneLeavingRoomData extends MessageBase
    {

        public boolean result;

        public DoneLeavingRoomData(boolean flag)
        {
            super(20);
            result = flag;
        }
    }

    public static final class EnterRoomData extends MessageBase
    {

        public final boolean enableSockets;
        public final Room room;

        public EnterRoomData(Room room1, boolean flag)
        {
            super(4);
            room = room1;
            enableSockets = flag;
        }
    }

    public static final class LeaveRoomData extends MessageBase
    {

        public LeaveRoomData()
        {
            super(3);
        }
    }

    public static final class LoadLibrariesData extends MessageBase
    {

        public final Context context;

        public LoadLibrariesData(Context context1)
        {
            super(15);
            context = context1;
        }
    }

    public static final class MessageReceivedData extends MessageBase
    {

        public final byte messageData[];
        public final int reliable;
        public final String senderJid;

        public MessageReceivedData(byte abyte0[], String s, int i)
        {
            super(9);
            messageData = abyte0;
            senderJid = s;
            reliable = i;
        }
    }

    public static final class MessageSendResultData extends MessageBase
    {

        public final int dcmToken;
        public final String peerJid;
        public final int statusCode;

        public MessageSendResultData(int i, int j, String s)
        {
            super(10);
            dcmToken = i;
            statusCode = j;
            peerJid = s;
        }
    }

    public static final class NetworkDisconnectedData extends MessageBase
    {

        public NetworkDisconnectedData()
        {
            super(2);
        }
    }

    public static final class P2pConnectionFailedData extends MessageBase
    {

        public final PeerConnectionInfo peerConnectionInfo;

        public P2pConnectionFailedData(PeerConnectionInfo peerconnectioninfo)
        {
            super(8);
            peerConnectionInfo = peerconnectioninfo;
        }
    }

    public static final class P2pConnectionSucceededData extends MessageBase
    {

        public final PeerConnectionInfo peerConnectionInfo;

        public P2pConnectionSucceededData(PeerConnectionInfo peerconnectioninfo)
        {
            super(7);
            peerConnectionInfo = peerconnectioninfo;
        }
    }

    public static final class SendReliableMessageData extends MessageBase
    {

        public final int clientToken;
        public final byte messageData[];
        public final String recipientParticipantId;

        public SendReliableMessageData(int i, byte abyte0[], String s)
        {
            super(11);
            clientToken = i;
            messageData = abyte0;
            recipientParticipantId = s;
        }
    }

    public static final class SendUnreliableMessageData extends MessageBase
    {

        public final byte messageData[];
        public final String recipientParticipantIds[];

        public SendUnreliableMessageData(byte abyte0[], String as[])
        {
            super(12);
            messageData = abyte0;
            recipientParticipantIds = as;
        }
    }

    public static final class StatusNotificationData extends MessageBase
    {

        public final RoomStatus roomStatus;

        public StatusNotificationData(RoomStatus roomstatus)
        {
            super(5);
            roomStatus = roomstatus;
        }
    }

    public static final class UnloadLibrariesData extends MessageBase
    {

        public final Context context;

        public UnloadLibrariesData(Context context1)
        {
            super(18);
            context = context1;
        }
    }

}
