// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.games.service.statemachine.FutureMessage;
import com.google.android.gms.games.service.statemachine.MessageBase;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DataConnectionManager, SocketProxy

public final class DcmMessages
{
    public static final class ConnectPeerData extends MessageBase
    {

        public final String fullPeerJid;
        public final boolean isPeerInitiator;
        public final int peerCapabilities;

        public ConnectPeerData(String s, boolean flag, int i)
        {
            super(6009);
            fullPeerJid = s;
            isPeerInitiator = flag;
            peerCapabilities = i;
        }
    }

    public static final class CreateNativeSocketData extends FutureMessage
    {

        public final String peerJid;

        public CreateNativeSocketData(String s)
        {
            super(6005);
            peerJid = s;
        }
    }

    public static final class CreateObsoleteSocketData extends FutureMessage
    {

        public final DataConnectionManager dcm;
        public final String peerJid;

        public CreateObsoleteSocketData(String s, DataConnectionManager dataconnectionmanager)
        {
            super(6006);
            dcm = dataconnectionmanager;
            peerJid = s;
        }
    }

    public static final class DisconnectPeerData extends MessageBase
    {

        public final String peerJid;

        public DisconnectPeerData(String s)
        {
            super(6010);
            peerJid = s;
        }
    }

    public static final class GetDiagnosticsForPeer extends FutureMessage
    {

        public final String peerJid;

        public GetDiagnosticsForPeer(String s)
        {
            super(6004);
            peerJid = s;
        }
    }

    public static final class PrepareNetworkForMatchData extends MessageBase
    {

        public final String authToken;
        public final String currentPlayerId;

        public PrepareNetworkForMatchData(String s, String s1)
        {
            super(6002);
            authToken = s;
            currentPlayerId = s1;
        }
    }

    public static final class RegisterBuzzbotData extends MessageBase
    {

        public final String roomId;

        public RegisterBuzzbotData(String s)
        {
            super(6011);
            roomId = s;
        }
    }

    public static final class SendReliableData extends FutureMessage
    {

        public final byte messageData[];
        public final String recipientJid;

        public SendReliableData(byte abyte0[], String s)
        {
            super(6007);
            messageData = abyte0;
            recipientJid = s;
        }
    }

    public static final class SendUnreliableData extends MessageBase
    {

        public final byte messageData[];
        public final String recipientJids[];

        public SendUnreliableData(byte abyte0[], String as[])
        {
            super(6008);
            messageData = abyte0;
            recipientJids = as;
        }
    }

    public static final class SocketProxyClosedSocketData extends MessageBase
    {

        public final String remoteJid;
        public final SocketProxy sender;

        public SocketProxyClosedSocketData(String s, SocketProxy socketproxy)
        {
            super(6013);
            sender = socketproxy;
            remoteJid = s;
        }
    }

    public static final class TearDownData extends MessageBase
    {

        public TearDownData()
        {
            super(6003);
        }
    }

    public static final class UnregisterBuzzbotData extends MessageBase
    {

        public UnregisterBuzzbotData()
        {
            super(6012);
        }
    }

}
