// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.Message;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.JingleLog;
import com.google.android.gms.games.jingle.Libjingle;
import com.google.android.gms.games.realtime.PeerConnectionInfo;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            PeerStateMachine, SocketProxy, DataConnectionManager, DataConnectionCallbacks

private final class mpPeerLog.enteredState extends mpPeerLog.enteredState
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
            Object obj = (com.google.android.gms.games.jingle.yClosedSocketData)message.obj;
            if (socketProxy != null && socketProxy.mSocketReady.get())
            {
                message = socketProxy;
                obj = ((com.google.android.gms.games.jingle.ctedState.socketProxy) (obj)).cieveData;
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
                    ((SocketProxy) (message)).mDataConnectionManager.onObsoleteSocketClosed(new ketData(((SocketProxy) (message)).mPeerJid, message));
                }
            } else
            {
                mCallbacks.onUnreliableReceiveData(remoteJid, ((com.google.android.gms.games.jingle.ctedState.remoteJid) (obj)).cieveData);
            }
            return true;

        case 102: // 'f'
            message = (com.google.android.gms.games.jingle.)message.obj;
            mCallbacks.onReliableSendResult(((com.google.android.gms.games.jingle.) (message)).token, ((com.google.android.gms.games.jingle.) (message)).peerJid, ((com.google.android.gms.games.jingle.) (message)).success);
            return true;

        case 101: // 'e'
            message = (com.google.android.gms.games.jingle.a)message.obj;
            mCallbacks.onReliableReceiveData(((com.google.android.gms.games.jingle.a) (message)).fromJid, ((com.google.android.gms.games.jingle.a) (message)).recieveData);
            return true;

        case 301: 
            if (!((com.google.android.gms.games.jingle.Result)message.obj).success)
            {
                mCallbacks.onDataConnectionFailed(new PeerConnectionInfo(remoteJid, Integer.valueOf(0), "P2P_FAILED"));
            }
            return true;

        case 2: // '\002'
            switch (((com.google.android.gms.games.jingle.pData)message.obj).newState)
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
            mNextState = new t>(PeerStateMachine.this, remoteJid, mPeerLog);
            return true;

        case 6007: 
            message = (mPeerLog)message.obj;
            int j = mLibjingle.nativeSendIbbData(((mPeerLog) (message)).ipientJid, ((ipientJid) (message)).sageData);
            int i = j;
            if (j == Libjingle.FAILURE_OPS_ID)
            {
                i = -1;
            }
            message.Result(Integer.valueOf(i));
            return true;

        case 6008: 
            message = (Result)message.obj;
            mLibjingle.nativeSendData(mSessionId, ((mSessionId) (message)).essageData);
            return true;

        case 6010: 
            terminatePeerConnection();
            mNextState = new t>(PeerStateMachine.this, remoteJid, mPeerLog);
            return true;

        case 6005: 
            message = (ta)message.obj;
            message.setResult(Integer.valueOf(mLibjingle.nativeCreateSocketConnection(((ta) (message)).peerJid)));
            return true;

        case 6013: 
            if (((ketData)message.obj).sender.equals(socketProxy))
            {
                socketProxy = null;
            }
            return true;

        case 6006: 
            message = (Data)message.obj;
            try
            {
                if (socketProxy == null)
                {
                    Object obj1 = ((Data) (message)).peerJid;
                    DataConnectionManager dataconnectionmanager = ((Data) (message)).dcm;
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

    public mpPeerLog(String s, String s1, int i, PeerConnectionInfo peerconnectioninfo, com.google.android.gms.games.service.statemachine.roomclient. )
    {
        this$0 = PeerStateMachine.this;
        super(PeerStateMachine.this, s, s1, i, );
        mSessionId = (String)Preconditions.checkNotNull(s1);
        mConnectionInfo = (PeerConnectionInfo)Preconditions.checkNotNull(peerconnectioninfo);
        mPeerLog.edState(7);
    }
}
