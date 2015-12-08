// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.support.v4.util.ArrayMap;
import com.google.android.gms.games.internal.GamesLog;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            RtmpSessionLog

public static final class mSession.myJidHash
{
    private static final class ReconnectLog
    {

        public int retryCount;
        public int retrySuccessful;

        private ReconnectLog()
        {
        }

        ReconnectLog(byte byte0)
        {
            this();
        }
    }


    private final com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession mDcmSession = new com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession();
    public final ArrayList mPeerLogs = new ArrayList();
    private final ArrayMap mReconnectMap = new ArrayMap();

    public static com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession parse(byte abyte0[])
    {
        try
        {
            abyte0 = (com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession)MessageNano.mergeFrom$1ec43da(new com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession(), abyte0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            GamesLog.e("RtmpSessionLog", "Couldn't parse proto!");
            return new com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession();
        }
        return abyte0;
    }

    public final ReconnectLog getReconnectEntry(String s)
    {
        ReconnectLog reconnectlog1 = (ReconnectLog)mReconnectMap.get(s);
        ReconnectLog reconnectlog = reconnectlog1;
        if (reconnectlog1 == null)
        {
            reconnectlog = new ReconnectLog((byte)0);
            mReconnectMap.put(s, reconnectlog);
        }
        return reconnectlog;
    }

    public final com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession toPlayLog()
    {
        mDcmSession.peers = new com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession[mPeerLogs.size()];
        int i = 0;
        for (int k = mPeerLogs.size(); i < k; i++)
        {
            com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession aplayloggamesrtmppeersession[] = mDcmSession.peers;
              = ()mPeerLogs.get(i);
            .mSession.transitions = new com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition[.mStateLog.size()];
            int l = .mStateLog.size();
            for (int j = 0; j < l; j++)
            {
                .mSession.transitions[j] = (com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition).mStateLog.get(j);
            }

            aplayloggamesrtmppeersession[i] = .mSession;
        }

        mDcmSession.retryInfo = new com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo[mReconnectMap.size()];
        i = 0;
        for (Iterator iterator = mReconnectMap.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = (String)iterator.next();
            com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo playloggamesrtmppeerconnectionretryinfo = new com.google.android.gms.games.proto.Session.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo();
            playloggamesrtmppeerconnectionretryinfo.participantId = ((String) (obj));
            obj = (ReconnectLog)mReconnectMap.get(obj);
            playloggamesrtmppeerconnectionretryinfo.reconnectRetryCount = ((ReconnectLog) (obj)).retryCount;
            playloggamesrtmppeerconnectionretryinfo.reconnectRetrySucessfulCount = ((ReconnectLog) (obj)).retrySuccessful;
            mDcmSession.retryInfo[i] = playloggamesrtmppeerconnectionretryinfo;
            i++;
        }

        return mDcmSession;
    }

    public ReconnectLog(String s)
    {
        s = RtmpSessionLog.access$000(s);
        if (s != null)
        {
            mDcmSession.myJidHash = s;
        }
    }
}
