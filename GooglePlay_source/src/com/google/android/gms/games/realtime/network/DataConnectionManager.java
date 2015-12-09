// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.jingle.PeerDiagnostics;

public interface DataConnectionManager
{
    public static final class SessionDiagnostics
    {

        public final PeerDiagnostics peerDiagnostics;
        public final com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmpPeerLog;

        public SessionDiagnostics(PeerDiagnostics peerdiagnostics, com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmppeerlog)
        {
            peerDiagnostics = peerdiagnostics;
            rtmpPeerLog = (com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog)Preconditions.checkNotNull(rtmppeerlog, "Must supply rtmpPeerLog");
        }
    }


    public abstract void cleanup();

    public abstract void connectToPeer(String s, boolean flag, int i);

    public abstract int createNativeLibjingleSocket(String s);

    public abstract String createSocketConnection(String s);

    public abstract void disconnectPeerConnection(String s);

    public abstract SessionDiagnostics getNetworkDiagnosticsForPeer(String s);

    public abstract void onObsoleteSocketClosed(DcmMessages.SocketProxyClosedSocketData socketproxyclosedsocketdata);

    public abstract void prepareNetworkForMatch(String s, String s1);

    public abstract void registerWithBuzzbot(String s);

    public abstract int sendReliableMessage(byte abyte0[], String s);

    public abstract void sendUnreliableMessage(byte abyte0[], String as[]);

    public abstract void tearDown();

    public abstract void unregisterWithBuzzbot();
}
