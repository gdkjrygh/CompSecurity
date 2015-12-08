// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.JingleLog;
import com.google.android.gms.games.jingle.Libjingle;
import com.google.android.gms.games.jingle.PeerDiagnostics;
import com.google.android.gms.games.realtime.PeerConnectionInfo;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DataConnectionCallbacks, SocketProxy, DataConnectionManager

final class PeerStateMachine
{
    private final class AcceptingUnsolicitedRemoteConnection extends ContextState
    {

        private final String mSessionId;
        final PeerStateMachine this$0;

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 6009: 
                DcmMessages.ConnectPeerData connectpeerdata = (DcmMessages.ConnectPeerData)message.obj;
                if (connectpeerdata.isPeerInitiator)
                {
                    mNextState = new WaitingForConnectionData(remoteJid, connectpeerdata.peerCapabilities, mSessionId, mPresenceCount, mPeerLog);
                } else
                {
                    GamesLog.wtf(GmsApplicationContext.getInstance(), "PeerStateMachine", "Confused about who is connecting to who");
                    mDeferredMessage = message;
                    mNextState = new WaitingForConnectionData(remoteJid, connectpeerdata.peerCapabilities, mSessionId, mPresenceCount, mPeerLog);
                }
                return true;

            case 301: 
                message = (com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult)message.obj;
                break;
            }
            if (((com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult) (message)).success)
            {
                mNextState = new ConnectedToUnsolicitedRemote(remoteJid, mSessionId, new PeerConnectionInfo(remoteJid, Integer.valueOf(((com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult) (message)).latencyMs), null), mPresenceCount, mPeerLog);
            } else
            {
                mNextState = new EntryState(remoteJid, mPeerLog);
            }
            return true;
        }

        public AcceptingUnsolicitedRemoteConnection(String s, String s1, int i, com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmppeerlog)
        {
            this$0 = PeerStateMachine.this;
            super(s, s1, i, rtmppeerlog);
            mSessionId = (String)Preconditions.checkNotNull(s1);
            mPeerLog.enteredState(5);
        }
    }

    private final class ConnectedState extends ContextState
    {

        private final PeerConnectionInfo mConnectionInfo;
        private final String mSessionId;
        private SocketProxy socketProxy;
        final PeerStateMachine this$0;

        private void terminatePeerConnection()
        {
            mLibjingle.nativeEndCall(mSessionId);
            if (socketProxy != null)
            {
                try
                {
                    socketProxy.close();
                }
                catch (IOException ioexception) { }
                socketProxy = null;
            }
        }

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 302: 
                Object obj = (com.google.android.gms.games.jingle.JingleMessages.P2pDataReceive)message.obj;
                if (socketProxy != null && socketProxy.mSocketReady.get())
                {
                    message = socketProxy;
                    obj = ((com.google.android.gms.games.jingle.JingleMessages.P2pDataReceive) (obj)).recieveData;
                    try
                    {
                        ((SocketProxy) (message)).mLocalSocket.getOutputStream().write(((byte []) (obj)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        try
                        {
                            message.close();
                        }
                        catch (IOException ioexception1)
                        {
                            JingleLog.e("SocketProxy", (new StringBuilder("Error closing socket:")).append(ioexception1).toString());
                        }
                        JingleLog.e("SocketProxy", (new StringBuilder("IOException writing data to socket.")).append(obj).toString());
                        ((SocketProxy) (message)).mDataConnectionManager.onObsoleteSocketClosed(new DcmMessages.SocketProxyClosedSocketData(((SocketProxy) (message)).mPeerJid, message));
                    }
                } else
                {
                    mCallbacks.onUnreliableReceiveData(remoteJid, ((com.google.android.gms.games.jingle.JingleMessages.P2pDataReceive) (obj)).recieveData);
                }
                return true;

            case 102: // 'f'
                message = (com.google.android.gms.games.jingle.JingleMessages.IbbSendResultData)message.obj;
                mCallbacks.onReliableSendResult(((com.google.android.gms.games.jingle.JingleMessages.IbbSendResultData) (message)).token, ((com.google.android.gms.games.jingle.JingleMessages.IbbSendResultData) (message)).peerJid, ((com.google.android.gms.games.jingle.JingleMessages.IbbSendResultData) (message)).success);
                return true;

            case 101: // 'e'
                message = (com.google.android.gms.games.jingle.JingleMessages.IbbDataReceiveData)message.obj;
                mCallbacks.onReliableReceiveData(((com.google.android.gms.games.jingle.JingleMessages.IbbDataReceiveData) (message)).fromJid, ((com.google.android.gms.games.jingle.JingleMessages.IbbDataReceiveData) (message)).recieveData);
                return true;

            case 301: 
                if (!((com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult)message.obj).success)
                {
                    mCallbacks.onDataConnectionFailed(new PeerConnectionInfo(remoteJid, Integer.valueOf(0), "P2P_FAILED"));
                }
                return true;

            case 2: // '\002'
                switch (((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData)message.obj).newState)
                {
                case 14: // '\016'
                default:
                    return true;

                case 12: // '\f'
                case 13: // '\r'
                case 15: // '\017'
                    terminatePeerConnection();
                    break;
                }
                mNextState = new EntryState(remoteJid, mPeerLog);
                return true;

            case 6007: 
                message = (DcmMessages.SendReliableData)message.obj;
                int j = mLibjingle.nativeSendIbbData(((DcmMessages.SendReliableData) (message)).recipientJid, ((DcmMessages.SendReliableData) (message)).messageData);
                int i = j;
                if (j == Libjingle.FAILURE_OPS_ID)
                {
                    i = -1;
                }
                message.setResult(Integer.valueOf(i));
                return true;

            case 6008: 
                message = (DcmMessages.SendUnreliableData)message.obj;
                mLibjingle.nativeSendData(mSessionId, ((DcmMessages.SendUnreliableData) (message)).messageData);
                return true;

            case 6010: 
                terminatePeerConnection();
                mNextState = new EntryState(remoteJid, mPeerLog);
                return true;

            case 6005: 
                message = (DcmMessages.CreateNativeSocketData)message.obj;
                message.setResult(Integer.valueOf(mLibjingle.nativeCreateSocketConnection(((DcmMessages.CreateNativeSocketData) (message)).peerJid)));
                return true;

            case 6013: 
                if (((DcmMessages.SocketProxyClosedSocketData)message.obj).sender.equals(socketProxy))
                {
                    socketProxy = null;
                }
                return true;

            case 6006: 
                message = (DcmMessages.CreateObsoleteSocketData)message.obj;
                try
                {
                    if (socketProxy == null)
                    {
                        Object obj1 = ((DcmMessages.CreateObsoleteSocketData) (message)).peerJid;
                        DataConnectionManager dataconnectionmanager = ((DcmMessages.CreateObsoleteSocketData) (message)).dcm;
                        String s = (new StringBuilder("com.android.games")).append(((String) (obj1))).toString();
                        obj1 = new SocketProxy(((String) (obj1)), dataconnectionmanager, s, new LocalServerSocket(s));
                        ((SocketProxy) (obj1)).createConnection();
                        socketProxy = ((SocketProxy) (obj1));
                    }
                    message.setResult(socketProxy.mSocketAddress);
                }
                catch (IOException ioexception)
                {
                    GamesLog.i("PeerStateMachine", "Unable to create socket proxy.", ioexception);
                    message.setResult(null);
                }
                catch (InterruptedException interruptedexception)
                {
                    GamesLog.i("PeerStateMachine", "Unable to create socket proxy.", interruptedexception);
                    message.setResult(null);
                }
                return true;

            case 6009: 
                mCallbacks.onDataConnectionSucceeded(mConnectionInfo);
                return true;
            }
        }

        public ConnectedState(String s, String s1, int i, PeerConnectionInfo peerconnectioninfo, com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmppeerlog)
        {
            this$0 = PeerStateMachine.this;
            super(s, s1, i, rtmppeerlog);
            mSessionId = (String)Preconditions.checkNotNull(s1);
            mConnectionInfo = (PeerConnectionInfo)Preconditions.checkNotNull(peerconnectioninfo);
            mPeerLog.enteredState(7);
        }
    }

    private final class ConnectedToUnsolicitedRemote extends ContextState
    {

        private final PeerConnectionInfo mPeerConnectionInfo;
        private String mSessionId;
        final PeerStateMachine this$0;

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 6009: 
                mCallbacks.onDataConnectionSucceeded(mPeerConnectionInfo);
                mNextState = new ConnectedState(remoteJid, mSessionId, mPresenceCount, mPeerConnectionInfo, mPeerLog);
                return true;

            case 101: // 'e'
            case 302: 
                mDeferredMessage = message;
                return true;
            }
        }

        public ConnectedToUnsolicitedRemote(String s, String s1, PeerConnectionInfo peerconnectioninfo, int i, com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmppeerlog)
        {
            this$0 = PeerStateMachine.this;
            super(s, s1, i, rtmppeerlog);
            mSessionId = (String)Preconditions.checkNotNull(s1);
            mPeerConnectionInfo = (PeerConnectionInfo)Preconditions.checkNotNull(peerconnectioninfo);
            mPeerLog.enteredState(6);
        }
    }

    private abstract class ContextState
    {

        protected final com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog mPeerLog;
        protected int mPresenceCount;
        public final String remoteJid;
        final String sessionId;
        final PeerStateMachine this$0;

        public final String getName()
        {
            String s = getClass().getName();
            int i = s.lastIndexOf('$');
            return (new StringBuilder()).append(s.substring(i + 1)).append("-").append(remoteJid).toString();
        }

        public abstract boolean processMessage(Message message);

        protected ContextState(String s, String s1, int i, com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmppeerlog)
        {
            this$0 = PeerStateMachine.this;
            super();
            remoteJid = s;
            sessionId = s1;
            mPresenceCount = i;
            mPeerLog = rtmppeerlog;
        }
    }

    private final class DeferedMessageByJid extends DeferredMessage
    {

        public final String jid;
        final PeerStateMachine this$0;

        public final void dispatch()
        {
            dispatchMessageByJid(jid, msg);
        }

        public DeferedMessageByJid(Message message, String s)
        {
            this$0 = PeerStateMachine.this;
            super(message);
            jid = s;
        }
    }

    private abstract class DeferredMessage
    {

        public final Message msg;
        final PeerStateMachine this$0;

        public abstract void dispatch();

        protected DeferredMessage(Message message)
        {
            this$0 = PeerStateMachine.this;
            super();
            msg = message;
        }
    }

    private final class DeferredMessageBySession extends DeferredMessage
    {

        public final String sessionId;
        final PeerStateMachine this$0;

        public final void dispatch()
        {
            dispatchMessageBySession(sessionId, msg);
        }

        public DeferredMessageBySession(Message message, String s)
        {
            this$0 = PeerStateMachine.this;
            super(message);
            sessionId = s;
        }
    }

    private final class EntryState extends ContextState
    {

        final PeerStateMachine this$0;

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 2: // '\002'
                message = (com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData)message.obj;
                if (((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData) (message)).newState == 2)
                {
                    mLibjingle.nativeAcceptCall(((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData) (message)).sessionId);
                    mNextState = new AcceptingUnsolicitedRemoteConnection(((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData) (message)).remoteJid, ((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData) (message)).sessionId, mPresenceCount, mPeerLog);
                }
                return true;

            case 6009: 
                message = (DcmMessages.ConnectPeerData)message.obj;
                mSm.logNote((new StringBuilder("Setting peer ")).append(((DcmMessages.ConnectPeerData) (message)).fullPeerJid).append(" capabilities to ").append(((DcmMessages.ConnectPeerData) (message)).peerCapabilities).toString());
                mLibjingle.nativeSetPeerCapabilities(((DcmMessages.ConnectPeerData) (message)).fullPeerJid, ((DcmMessages.ConnectPeerData) (message)).peerCapabilities);
                break;
            }
            if (((DcmMessages.ConnectPeerData) (message)).isPeerInitiator)
            {
                mNextState = new WaitingForExpectedConnection(remoteJid, ((DcmMessages.ConnectPeerData) (message)).peerCapabilities, mPresenceCount, mPeerLog);
            } else
            {
                mLibjingle.nativeCall("", ((DcmMessages.ConnectPeerData) (message)).fullPeerJid, 0);
                mNextState = new WaitingForOutgoingRemoteConnectionNoSessionId(remoteJid, ((DcmMessages.ConnectPeerData) (message)).peerCapabilities, mPresenceCount, mPeerLog);
            }
            return true;
        }

        public EntryState(String s, com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmppeerlog)
        {
            this$0 = PeerStateMachine.this;
            super(s, null, 0, rtmppeerlog);
            mPeerLog.enteredState(1);
        }
    }

    private final class WaitingForConnectionData extends ContextState
    {

        private final int mPeerCapabilities;
        private final String mSessionId;
        final PeerStateMachine this$0;

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 301: 
                message = (com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult)message.obj;
                break;
            }
            if (((com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult) (message)).success)
            {
                message = new PeerConnectionInfo(remoteJid, Integer.valueOf(((com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult) (message)).latencyMs), null);
                mCallbacks.onDataConnectionSucceeded(message);
                mNextState = new ConnectedState(remoteJid, mSessionId, mPresenceCount, message, mPeerLog);
            } else
            {
                message = new PeerConnectionInfo(remoteJid, Integer.valueOf(((com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult) (message)).latencyMs), "P2P_FAILED");
                mCallbacks.onDataConnectionFailed(message);
                mNextState = new EntryState(remoteJid, mPeerLog);
            }
            return true;
        }

        public WaitingForConnectionData(String s, int i, String s1, int j, com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmppeerlog)
        {
            this$0 = PeerStateMachine.this;
            super(s, s1, j, rtmppeerlog);
            mPeerCapabilities = ((Integer)Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
            mSessionId = (String)Preconditions.checkNotNull(s1);
            mPeerLog.enteredState(4);
        }
    }

    private final class WaitingForExpectedConnection extends ContextState
    {

        int mPeerCapabilities;
        final PeerStateMachine this$0;

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 2: // '\002'
                message = (com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData)message.obj;
                break;
            }
            if (((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData) (message)).newState == 2)
            {
                mLibjingle.nativeAcceptCall(((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData) (message)).sessionId);
                mNextState = new WaitingForConnectionData(remoteJid, mPeerCapabilities, ((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData) (message)).sessionId, mPresenceCount, mPeerLog);
            }
            return true;
        }

        public WaitingForExpectedConnection(String s, int i, int j, com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmppeerlog)
        {
            this$0 = PeerStateMachine.this;
            super(s, null, j, rtmppeerlog);
            mPeerCapabilities = ((Integer)Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
            mPeerLog.enteredState(2);
        }
    }

    private final class WaitingForOutgoingRemoteConnectionNoSessionId extends ContextState
    {

        int mPeerCapabilities;
        final PeerStateMachine this$0;

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 2: // '\002'
                message = (com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData)message.obj;
                break;
            }
            if (((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData) (message)).newState == 1)
            {
                mNextState = new WaitingForConnectionData(remoteJid, mPeerCapabilities, ((com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData) (message)).sessionId, mPresenceCount, mPeerLog);
            }
            return true;
        }

        public WaitingForOutgoingRemoteConnectionNoSessionId(String s, int i, int j, com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog rtmppeerlog)
        {
            this$0 = PeerStateMachine.this;
            super(s, null, j, rtmppeerlog);
            mPeerCapabilities = ((Integer)Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
            mPeerLog.enteredState(3);
        }
    }


    private final HashMap jidToState = new HashMap();
    final DataConnectionCallbacks mCallbacks;
    private Message mDeferredMessage;
    private ArrayList mDeferredMessages;
    final Libjingle mLibjingle;
    ContextState mNextState;
    final IStateMachine mSm;
    private final HashMap sessionToState = new HashMap();

    public PeerStateMachine(Libjingle libjingle, DataConnectionCallbacks dataconnectioncallbacks, IStateMachine istatemachine)
    {
        mDeferredMessages = new ArrayList();
        mLibjingle = libjingle;
        mCallbacks = dataconnectioncallbacks;
        mSm = istatemachine;
    }

    private void log(String s)
    {
        mSm.logNote((new StringBuilder("PeerStateMachine: ")).append(s).toString());
    }

    private void processDeferredQueue()
    {
        if (mDeferredMessages.size() != 0)
        {
            ArrayList arraylist = mDeferredMessages;
            mDeferredMessages = new ArrayList();
            int i = 0;
            int j = arraylist.size();
            while (i < j) 
            {
                ((DeferredMessage)arraylist.get(i)).dispatch();
                i++;
            }
        }
    }

    private boolean processMessageForState(ContextState contextstate, Message message, DeferredMessage deferredmessage)
    {
        boolean flag;
        boolean flag1;
        mNextState = null;
        mDeferredMessage = null;
        log((new StringBuilder()).append(contextstate.getName()).append(" handle ").append(mSm.getWhatToString(message.what)).toString());
        flag1 = contextstate.processMessage(message);
        flag = flag1;
        if (flag1) goto _L2; else goto _L1
_L1:
        log((new StringBuilder("Not handled -- invoking default handler for:")).append(mSm.getWhatToString(message.what)).toString());
        message.what;
        JVM INSTR lookupswitch 6: default 164
    //                   401: 408
    //                   6004: 347
    //                   6005: 310
    //                   6006: 330
    //                   6007: 290
    //                   6009: 543;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        flag = false;
_L2:
        if (mDeferredMessage != null)
        {
            mDeferredMessages.add(deferredmessage);
        }
        if (mNextState != null)
        {
            sessionToState.remove(contextstate.sessionId);
            jidToState.put(contextstate.remoteJid, mNextState);
            log((new StringBuilder()).append(contextstate.getName()).append(" transitionTo ").append(mNextState.getName()).toString());
            if (mNextState.sessionId != null)
            {
                sessionToState.put(mNextState.sessionId, mNextState);
                processDeferredQueue();
            }
        }
        return flag;
_L8:
        ((DcmMessages.SendReliableData)message.obj).setResult(Integer.valueOf(-1));
        flag = true;
        continue; /* Loop/switch isn't completed */
_L6:
        ((DcmMessages.CreateNativeSocketData)message.obj).setResult(Integer.valueOf(-1));
        flag = true;
        continue; /* Loop/switch isn't completed */
_L7:
        ((DcmMessages.CreateObsoleteSocketData)message.obj).setResult(null);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L5:
        message = (DcmMessages.GetDiagnosticsForPeer)message.obj;
        Libjingle libjingle = mLibjingle;
        String s = ((DcmMessages.GetDiagnosticsForPeer) (message)).peerJid;
        PeerDiagnostics peerdiagnostics = new PeerDiagnostics();
        libjingle.nativeGetPeerDiagnosticMetrics(peerdiagnostics, s);
        message.setResult(new DataConnectionManager.SessionDiagnostics(peerdiagnostics, contextstate.mPeerLog));
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
        message = (com.google.android.gms.games.jingle.JingleMessages.DirectedPresenceReceipt)message.obj;
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession playloggamesrtmppeersession = contextstate.mPeerLog.mSession;
        playloggamesrtmppeersession.directPresenceRecieved = playloggamesrtmppeersession.directPresenceRecieved + 1;
        contextstate.mPresenceCount = contextstate.mPresenceCount + 1;
        if (contextstate.mPresenceCount <= 2)
        {
            com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession playloggamesrtmppeersession1 = contextstate.mPeerLog.mSession;
            playloggamesrtmppeersession1.directPresenceSent = playloggamesrtmppeersession1.directPresenceSent + 1;
            log((new StringBuilder("sending response to directed presence request ")).append(contextstate.mPresenceCount).toString());
            mLibjingle.nativeSendDirectedPresence(((com.google.android.gms.games.jingle.JingleMessages.DirectedPresenceReceipt) (message)).barePeerJid);
        } else
        {
            log((new StringBuilder("ignoring directed presence request ")).append(contextstate.mPresenceCount).toString());
        }
        flag = true;
        continue; /* Loop/switch isn't completed */
_L9:
        mCallbacks.onDataConnectionFailed(new PeerConnectionInfo(contextstate.remoteJid, Integer.valueOf(0), "P2P_FAILED"));
        flag = true;
        if (true) goto _L2; else goto _L10
_L10:
    }

    public final boolean dispatchMessageByJid(String s, Message message)
    {
        Object obj;
        ContextState contextstate;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, (new StringBuilder("JID must not be empty or null: message ")).append(mSm.getWhatToString(message.what)).toString());
        contextstate = (ContextState)jidToState.get(s);
        obj = contextstate;
        if (contextstate == null)
        {
            log((new StringBuilder("Creating state for ")).append(s).toString());
            obj = new EntryState(s, new com.google.android.gms.games.service.statemachine.roomclient.RtmpSessionLog.RtmpPeerLog(s));
            jidToState.put(s, obj);
        }
        return processMessageForState(((ContextState) (obj)), message, new DeferedMessageByJid(message, s));
    }

    public final boolean dispatchMessageBySession(String s, Message message)
    {
        ContextState contextstate;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, (new StringBuilder("Session ID must not be empty or null: message ")).append(mSm.getWhatToString(message.what)).toString());
        contextstate = (ContextState)sessionToState.get(s);
        if (contextstate == null)
        {
            mSm.logNote((new StringBuilder("No session mapped for ")).append(s).toString());
            return false;
        } else
        {
            return processMessageForState(contextstate, message, new DeferredMessageBySession(message, s));
        }
    }

    public final void dispatchToAll(Message message)
    {
        for (Iterator iterator = jidToState.keySet().iterator(); iterator.hasNext(); dispatchMessageByJid((String)iterator.next(), message)) { }
    }


/*
    static void access$400(PeerStateMachine peerstatemachine, Message message)
    {
        peerstatemachine.mDeferredMessage = Message.obtain();
        peerstatemachine.mDeferredMessage.copyFrom(message);
        peerstatemachine.log((new StringBuilder("deferMessage: ")).append(peerstatemachine.mSm.getWhatToString(message.what)).toString());
        return;
    }

*/
}
