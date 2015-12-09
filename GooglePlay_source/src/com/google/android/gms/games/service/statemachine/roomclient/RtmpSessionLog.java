// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.support.v4.util.ArrayMap;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class RtmpSessionLog
{
    public static final class RtmpDcmLog
    {

        private final com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession mDcmSession = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession();
        public final ArrayList mPeerLogs = new ArrayList();
        private final ArrayMap mReconnectMap = new ArrayMap();

        public static com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession parse(byte abyte0[])
        {
            try
            {
                abyte0 = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession)MessageNano.mergeFrom$1ec43da(new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession(), abyte0, abyte0.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                GamesLog.e("RtmpSessionLog", "Couldn't parse proto!");
                return new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession();
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

        public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession toPlayLog()
        {
            mDcmSession.peers = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession[mPeerLogs.size()];
            int i = 0;
            for (int k = mPeerLogs.size(); i < k; i++)
            {
                com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession aplayloggamesrtmppeersession[] = mDcmSession.peers;
                RtmpPeerLog rtmppeerlog = (RtmpPeerLog)mPeerLogs.get(i);
                rtmppeerlog.mSession.transitions = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition[rtmppeerlog.mStateLog.size()];
                int l = rtmppeerlog.mStateLog.size();
                for (int j = 0; j < l; j++)
                {
                    rtmppeerlog.mSession.transitions[j] = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition)rtmppeerlog.mStateLog.get(j);
                }

                aplayloggamesrtmppeersession[i] = rtmppeerlog.mSession;
            }

            mDcmSession.retryInfo = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo[mReconnectMap.size()];
            i = 0;
            for (Iterator iterator = mReconnectMap.keySet().iterator(); iterator.hasNext();)
            {
                Object obj = (String)iterator.next();
                com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo playloggamesrtmppeerconnectionretryinfo = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo();
                playloggamesrtmppeerconnectionretryinfo.participantId = ((String) (obj));
                obj = (ReconnectLog)mReconnectMap.get(obj);
                playloggamesrtmppeerconnectionretryinfo.reconnectRetryCount = ((ReconnectLog) (obj)).retryCount;
                playloggamesrtmppeerconnectionretryinfo.reconnectRetrySucessfulCount = ((ReconnectLog) (obj)).retrySuccessful;
                mDcmSession.retryInfo[i] = playloggamesrtmppeerconnectionretryinfo;
                i++;
            }

            return mDcmSession;
        }

        public RtmpDcmLog(String s)
        {
            s = this = this.getBytes(Charset.forName("UTF-8"));
            if (s != null)
            {
                mDcmSession.myJidHash = s;
            }
        }
    }

    private static final class RtmpDcmLog.ReconnectLog
    {

        public int retryCount;
        public int retrySuccessful;

        private RtmpDcmLog.ReconnectLog()
        {
        }

        RtmpDcmLog.ReconnectLog(byte byte0)
        {
            this();
        }
    }

    public static final class RtmpPeerLog
    {

        public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession mSession = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession();
        final ArrayList mStateLog = new ArrayList();

        public final void enteredState(int i)
        {
            if (mStateLog.size() < 256)
            {
                com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition peerstatetransition = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition();
                peerstatetransition.deltaMs = SystemClock.elapsedRealtime();
                peerstatetransition.state = i;
                mStateLog.add(peerstatetransition);
            }
        }

        public RtmpPeerLog(String s)
        {
            mSession.remoteJidHash = this = this.getBytes(Charset.forName("UTF-8"));
        }
    }


    private final ClientContext mClientContext;
    private final Context mContext;
    private final String mExternalGameId;
    private boolean mHasBeenDispatched;
    final com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession mLog = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession();
    private final long mRealTimeAtStart = SystemClock.elapsedRealtime();

    public RtmpSessionLog(Context context, ClientContext clientcontext, int i, String s, boolean flag)
    {
        mHasBeenDispatched = false;
        mContext = context;
        mClientContext = clientcontext;
        mExternalGameId = s;
        mLog.sessionStartTimeMs = System.currentTimeMillis();
        clientcontext = (TelephonyManager)context.getSystemService("phone");
        mLog.simCellNetworkOperator = clientcontext.getSimOperator();
        mLog.activeCellNetworkOperator = clientcontext.getNetworkOperator();
        mLog.activeCellNetworkType = clientcontext.getNetworkType();
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context != null)
        {
            mLog.networkType = context.getType();
            mLog.networkSubtype = context.getSubtype();
        }
        mLog.sessionInitiator = i;
        mLog.requestedSockets = flag;
    }

    final long deltaNow()
    {
        return SystemClock.elapsedRealtime() - mRealTimeAtStart;
    }

    public final void dispatchLog()
    {
        boolean flag;
        if (!mHasBeenDispatched)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Cannot log the same log twice!");
        mHasBeenDispatched = true;
        if (mLog.dcmSession != null)
        {
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession aplayloggamesrtmppeersession[] = mLog.dcmSession.peers;
            int k = aplayloggamesrtmppeersession.length;
            for (int i = 0; i < k; i++)
            {
                com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition apeerstatetransition[] = aplayloggamesrtmppeersession[i].transitions;
                int l = apeerstatetransition.length;
                for (int j = 0; j < l; j++)
                {
                    com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition peerstatetransition = apeerstatetransition[j];
                    peerstatetransition.deltaMs = peerstatetransition.deltaMs - mRealTimeAtStart;
                }

            }

        }
        GamesPlayLogger.logRtmpEvent(mContext, mClientContext.mCallingPackageName, mExternalGameId, mClientContext.getResolvedAccountName(), mLog);
    }

    public final void onConnectNetworkDone(boolean flag)
    {
        mLog.connectXmppResult = flag;
        mLog.connectXmppEndTimeMs = deltaNow();
    }

    public final void onLeavingRoom(int i)
    {
        mLog.roomLeaveTimeMs = deltaNow();
        mLog.inRoomLeaveType = i;
    }

    public final void onRoomLeaveDone(boolean flag)
    {
        mLog.roomLeaveDoneMs = deltaNow();
        mLog.roomLeaveResult = flag;
    }

    public final void oneupLeaveCallStart()
    {
        mLog.waitForDiagEndLeaveStartTimeMs = deltaNow();
    }

    public final void processedInState(int i)
    {
        if (mLog.entryState == 0)
        {
            mLog.entryState = i;
        }
    }


/*
    static String access$000(String s)
    {
        s = s.getBytes(Charset.forName("UTF-8"));
        MessageDigest messagedigest = AndroidUtils.getMessageDigest("SHA-1");
        if (messagedigest == null)
        {
            GamesLog.e("RtmpSessionLog", "no support for SHA-1");
            return null;
        } else
        {
            messagedigest.update(s);
            return Base64.encodeToString(messagedigest.digest(), 2);
        }
    }

*/
}
