// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.state.StateMachine;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.JingleLog;
import com.google.android.gms.games.jingle.Libjingle;
import com.google.android.gms.games.jingle.OsUtil;
import com.google.android.gms.games.service.statemachine.IStateMachine;
import com.google.android.gms.games.service.statemachine.MultiFileStateMachine;
import com.google.android.gms.games.service.statemachine.TypeSafeTransitionState;
import com.google.android.gsf.Gservices;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DataConnectionCallbacks, PeerStateMachine

final class DcmStateMachine extends MultiFileStateMachine
{
    static final class ConnectedState extends DcmState
    {

        private String mLocalJid;
        private PeerStateMachine mPeerSm;

        public final void exit()
        {
            mPeerSm = null;
        }

        public final boolean processMessage(Message message)
        {
            message.what;
            JVM INSTR lookupswitch 18: default 160
        //                       1: 699
        //                       2: 162
        //                       101: 296
        //                       102: 275
        //                       202: 538
        //                       301: 359
        //                       302: 254
        //                       401: 338
        //                       6003: 644
        //                       6004: 517
        //                       6005: 422
        //                       6006: 401
        //                       6007: 380
        //                       6008: 443
        //                       6009: 317
        //                       6010: 496
        //                       6011: 570
        //                       6012: 615;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
            return false;
_L3:
            com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData callstatechangedopdata = (com.google.android.gms.games.jingle.JingleMessages.CallStateChangedOpData)message.obj;
            mSm.logNote((new StringBuilder("OP: ")).append(com.google.android.gms.games.jingle.LibjingleEventCallback.LibjingleCallState.toString(callstatechangedopdata.newState)).toString());
            if (callstatechangedopdata.newState != 15)
            {
                mSm.logNote((new StringBuilder("CALL_STATE_CHANGED_OP: New state: ")).append(com.google.android.gms.games.jingle.LibjingleEventCallback.LibjingleCallState.toString(callstatechangedopdata.newState)).toString());
                return mPeerSm.dispatchMessageByJid(callstatechangedopdata.remoteJid, message);
            }
              goto _L1
_L8:
            com.google.android.gms.games.jingle.JingleMessages.P2pDataReceive p2pdatareceive = (com.google.android.gms.games.jingle.JingleMessages.P2pDataReceive)message.obj;
            return mPeerSm.dispatchMessageBySession(p2pdatareceive.sessionId, message);
_L5:
            com.google.android.gms.games.jingle.JingleMessages.IbbSendResultData ibbsendresultdata = (com.google.android.gms.games.jingle.JingleMessages.IbbSendResultData)message.obj;
            return mPeerSm.dispatchMessageByJid(ibbsendresultdata.peerJid, message);
_L4:
            com.google.android.gms.games.jingle.JingleMessages.IbbDataReceiveData ibbdatareceivedata = (com.google.android.gms.games.jingle.JingleMessages.IbbDataReceiveData)message.obj;
            return mPeerSm.dispatchMessageByJid(ibbdatareceivedata.fromJid, message);
_L16:
            DcmMessages.ConnectPeerData connectpeerdata = (DcmMessages.ConnectPeerData)message.obj;
            return mPeerSm.dispatchMessageByJid(connectpeerdata.fullPeerJid, message);
_L9:
            com.google.android.gms.games.jingle.JingleMessages.DirectedPresenceReceipt directedpresencereceipt = (com.google.android.gms.games.jingle.JingleMessages.DirectedPresenceReceipt)message.obj;
            return mPeerSm.dispatchMessageByJid(directedpresencereceipt.barePeerJid, message);
_L7:
            com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult p2pdataconnectionresult = (com.google.android.gms.games.jingle.JingleMessages.P2pDataConnectionResult)message.obj;
            return mPeerSm.dispatchMessageBySession(p2pdataconnectionresult.sessionId, message);
_L14:
            DcmMessages.SendReliableData sendreliabledata = (DcmMessages.SendReliableData)message.obj;
            return mPeerSm.dispatchMessageByJid(sendreliabledata.recipientJid, message);
_L13:
            DcmMessages.CreateObsoleteSocketData createobsoletesocketdata = (DcmMessages.CreateObsoleteSocketData)message.obj;
            return mPeerSm.dispatchMessageByJid(createobsoletesocketdata.peerJid, message);
_L12:
            DcmMessages.CreateNativeSocketData createnativesocketdata = (DcmMessages.CreateNativeSocketData)message.obj;
            return mPeerSm.dispatchMessageByJid(createnativesocketdata.peerJid, message);
_L15:
            String as[] = ((DcmMessages.SendUnreliableData)message.obj).recipientJids;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                mPeerSm.dispatchMessageByJid(s, message);
            }

            return HANDLED;
_L17:
            DcmMessages.DisconnectPeerData disconnectpeerdata = (DcmMessages.DisconnectPeerData)message.obj;
            return mPeerSm.dispatchMessageByJid(disconnectpeerdata.peerJid, message);
_L11:
            DcmMessages.GetDiagnosticsForPeer getdiagnosticsforpeer = (DcmMessages.GetDiagnosticsForPeer)message.obj;
            return mPeerSm.dispatchMessageByJid(getdiagnosticsforpeer.peerJid, message);
_L6:
            message = (com.google.android.gms.games.jingle.JingleMessages.BuzzNotifReceiveData)message.obj;
            mData.dcmCallbacks.onReceiveBuzzNotification(((com.google.android.gms.games.jingle.JingleMessages.BuzzNotifReceiveData) (message)).notification, ((com.google.android.gms.games.jingle.JingleMessages.BuzzNotifReceiveData) (message)).recipientData);
            return HANDLED;
_L18:
            message = (DcmMessages.RegisterBuzzbotData)message.obj;
            if (((Boolean)G.enableBuzzbotSubscription.get()).booleanValue())
            {
                mData.libjingle.nativeRegisterWithBuzzbot(((DcmMessages.RegisterBuzzbotData) (message)).roomId, mLocalJid);
            }
            return HANDLED;
_L19:
            if (((Boolean)G.enableBuzzbotSubscription.get()).booleanValue())
            {
                mData.libjingle.nativeUnregisterWithBuzzbot();
            }
            return HANDLED;
_L10:
            message = Message.obtain();
            message.what = 6010;
            mPeerSm.dispatchToAll(message);
            mData.libjingle.nativeDisconnectAndSignout(mLocalJid);
            mStates.disconnectingState.transitionTo(new Runnable() {

                final ConnectedState this$0;

                public final void run()
                {
                    mData.dcmCallbacks.onNetworkDisconnected();
                }

            
            {
                this$0 = ConnectedState.this;
                super();
            }
            });
            return HANDLED;
_L2:
            if (!((com.google.android.gms.games.jingle.JingleMessages.SigninStateChangedOpData)message.obj).signedIn)
            {
                mData.dcmCallbacks.onNetworkDisconnected();
                mStates.disconnectedState.transitionToState();
            }
            return HANDLED;
        }

        public final void transitionTo(String s)
        {
            mLocalJid = s;
            mPeerSm = new PeerStateMachine(mData.libjingle, mData.dcmCallbacks, mSm);
            transitionToState();
        }

        public ConnectedState(DcmStateMachine dcmstatemachine)
        {
            super(dcmstatemachine);
        }
    }

    static final class ConnectingState extends DcmState
    {

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                mSm.deferMessage(message);
                return HANDLED;

            case 1: // '\001'
                message = (com.google.android.gms.games.jingle.JingleMessages.SigninStateChangedOpData)message.obj;
                if (((com.google.android.gms.games.jingle.JingleMessages.SigninStateChangedOpData) (message)).signedIn)
                {
                    mData.libjingle.nativeSubscribeToBuzzChannels(((Boolean)G.enableBuzzbotSubscription.get()).booleanValue());
                    mData.libjingle.nativeListenForBuzzNotifications();
                    SubscribingBuzzState subscribingbuzzstate = mStates.subscribingBuzzState;
                    String s = ((com.google.android.gms.games.jingle.JingleMessages.SigninStateChangedOpData) (message)).localJid;
                    int i = ((com.google.android.gms.games.jingle.JingleMessages.SigninStateChangedOpData) (message)).latencyMs;
                    subscribingbuzzstate.mLocalJid = s;
                    subscribingbuzzstate.mLatencyMs = i;
                    subscribingbuzzstate.transitionToState();
                } else
                {
                    mData.dcmCallbacks.onNetworkFailedForMatch();
                    mStates.disconnectedState.transitionToState();
                }
                return HANDLED;

            case 6001: 
                mData.libjingle.release();
                mSm.quit();
                return HANDLED;
            }
        }

        public ConnectingState(DcmStateMachine dcmstatemachine)
        {
            super(dcmstatemachine);
        }
    }

    static abstract class DcmState extends TypeSafeTransitionState
    {

        protected final StateData mData;
        protected final DcmStateMachine mRsm;
        protected final IStateMachine mSm;
        protected final States mStates;

        protected DcmState(DcmStateMachine dcmstatemachine)
        {
            super(((MultiFileStateMachine) (dcmstatemachine)).mStateMachine);
            mRsm = dcmstatemachine;
            mData = (StateData)((MultiFileStateMachine) (dcmstatemachine)).mData;
            mSm = ((MultiFileStateMachine) (dcmstatemachine)).mStateMachine;
            mStates = (States)((MultiFileStateMachine) (dcmstatemachine)).mStates;
        }
    }

    static final class DefaultHandlerState extends DcmState
    {

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 6004: 
                ((DcmMessages.GetDiagnosticsForPeer)message.obj).setResult(null);
                return HANDLED;

            case 6007: 
                ((DcmMessages.SendReliableData)message.obj).setResult(Integer.valueOf(-1));
                return HANDLED;

            case 6006: 
                ((DcmMessages.CreateObsoleteSocketData)message.obj).setResult(null);
                return HANDLED;

            case 6005: 
                ((DcmMessages.CreateNativeSocketData)message.obj).setResult(Integer.valueOf(-1));
                return HANDLED;
            }
        }

        public DefaultHandlerState(DcmStateMachine dcmstatemachine)
        {
            super(dcmstatemachine);
        }
    }

    static final class DisconnectedState extends DcmState
    {

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 6002: 
                message = (DcmMessages.PrepareNetworkForMatchData)message.obj;
                mData.libjingle.nativeConnectAndSignin(((DcmMessages.PrepareNetworkForMatchData) (message)).authToken, true);
                mStates.connectingState.transitionToState();
                return HANDLED;

            case 6001: 
                mData.libjingle.release();
                mSm.quit();
                return HANDLED;
            }
        }

        public DisconnectedState(DcmStateMachine dcmstatemachine)
        {
            super(dcmstatemachine);
        }
    }

    static final class DisconnectingState extends DcmState
    {

        Runnable mAfterDone;

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return false;

            case 1: // '\001'
                if (((com.google.android.gms.games.jingle.JingleMessages.SigninStateChangedOpData)message.obj).signedIn)
                {
                    GamesLog.wtf(GmsApplicationContext.getInstance(), "DcmStateMachine", "Libjingle didn't disconnect");
                    System.exit(0);
                } else
                {
                    mAfterDone.run();
                    mStates.disconnectedState.transitionToState();
                }
                return HANDLED;

            case 6001: 
                mData.libjingle.release();
                mSm.quit();
                return HANDLED;
            }
        }

        public final void transitionTo(Runnable runnable)
        {
            mAfterDone = runnable;
            transitionToState();
        }

        public DisconnectingState(DcmStateMachine dcmstatemachine)
        {
            super(dcmstatemachine);
        }
    }

    protected static final class StateData
    {

        public int clientCapabilities;
        public DataConnectionCallbacks dcmCallbacks;
        public Libjingle libjingle;

        protected StateData()
        {
        }
    }

    protected static final class States
    {

        public ConnectedState connectedState;
        public ConnectingState connectingState;
        public DefaultHandlerState defaultHandlerState;
        public DisconnectedState disconnectedState;
        public DisconnectingState disconnectingState;
        public SubscribingBuzzState subscribingBuzzState;

        protected States()
        {
        }
    }

    static final class SubscribingBuzzState extends DcmState
    {

        int mLatencyMs;
        String mLocalJid;

        public final boolean processMessage(Message message)
        {
            switch (message.what)
            {
            default:
                mSm.deferMessage(message);
                return HANDLED;

            case 201: 
                if (((com.google.android.gms.games.jingle.JingleMessages.BuzzSubscriptionResultData)message.obj).result)
                {
                    mData.dcmCallbacks.onNetworkReadyForMatch(mLocalJid, mLatencyMs);
                    mStates.connectedState.transitionTo(mLocalJid);
                } else
                {
                    mData.libjingle.nativeDisconnectAndSignout(mLocalJid);
                    mStates.disconnectingState.transitionTo(new Runnable() {

                        final SubscribingBuzzState this$0;

                        public final void run()
                        {
                            mData.dcmCallbacks.onNetworkFailedForMatch();
                        }

            
            {
                this$0 = SubscribingBuzzState.this;
                super();
            }
                    });
                }
                return HANDLED;

            case 1: // '\001'
                if (!((com.google.android.gms.games.jingle.JingleMessages.SigninStateChangedOpData)message.obj).signedIn)
                {
                    mData.dcmCallbacks.onNetworkDisconnected();
                    mStates.disconnectedState.transitionToState();
                }
                return HANDLED;

            case 6001: 
                mData.libjingle.release();
                mSm.quit();
                return HANDLED;
            }
        }

        public SubscribingBuzzState(DcmStateMachine dcmstatemachine)
        {
            super(dcmstatemachine);
        }
    }


    protected static final boolean DBG;

    public DcmStateMachine(Context context, int i, DataConnectionCallbacks dataconnectioncallbacks)
    {
        super("DcmStateMachine");
        super.mData = new StateData();
        Object obj = (States)setupStates(new States());
        obj.defaultHandlerState = new DefaultHandlerState(this);
        obj.disconnectedState = new DisconnectedState(this);
        obj.connectingState = new ConnectingState(this);
        obj.connectedState = new ConnectedState(this);
        obj.subscribingBuzzState = new SubscribingBuzzState(this);
        obj.disconnectingState = new DisconnectingState(this);
        obj = (StateData)super.mData;
        obj.clientCapabilities = i;
        obj.libjingle = new Libjingle(context, super.mSmHandler);
        context = ((StateData) (obj)).libjingle;
        String s = JingleLog.getTag();
        if (((Libjingle) (context)).mInitialized)
        {
            Libjingle.log("init: already initialized");
        } else
        {
            context.mInitialized = true;
            context.nativeSetup(new WeakReference(context), false, i);
            android.content.ContentResolver contentresolver = ((Libjingle) (context)).mContext.getContentResolver();
            String as[][] = Libjingle.ANDROID_SETTINGS_KEYS_MAP;
            int j = as.length;
            i = 0;
            while (i < j) 
            {
                String as1[] = as[i];
                String s1 = as1[0];
                String s2 = as1[1];
                if ("games.use_default_networks_only".equals(s2))
                {
                    int k = Gservices.getInt(contentresolver, s1, 1);
                    if (k == 1 && !OsUtil.isAtLeastL() || k == 2)
                    {
                        context.nativeSetGServicesOverride("games.use_default_networks_only", "true");
                        Log.i("games_rtmp:Libjingle", "Only using default networks!");
                    }
                } else
                {
                    s1 = Gservices.getString(contentresolver, s1);
                    if (s1 != null)
                    {
                        context.nativeSetGServicesOverride(s2, s1);
                    }
                }
                i++;
            }
            Libjingle.nativeSetLoggingLevel(Libjingle.logTagToInt(s));
        }
        obj.dcmCallbacks = dataconnectioncallbacks;
        ((States)mStates).disconnectedState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).connectingState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).connectedState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).subscribingBuzzState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).disconnectingState.addState(((States)mStates).defaultHandlerState);
        ((States)mStates).disconnectedState.setInitialState();
        setDbg(DBG);
        if (DBG)
        {
            i = 4096;
        } else
        {
            i = 128;
        }
        setLogRecSize(i);
    }

    protected final String getWhatToString(int i)
    {
        i;
        JVM INSTR lookupswitch 14: default 124
    //                   1: 138
    //                   2: 144
    //                   3: 150
    //                   4: 156
    //                   5: 162
    //                   6: 168
    //                   7: 132
    //                   101: 174
    //                   102: 181
    //                   201: 188
    //                   202: 195
    //                   301: 202
    //                   302: 209
    //                   401: 216;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        String s = null;
_L17:
        if (s != null)
        {
            return s;
        }
        break; /* Loop/switch isn't completed */
_L8:
        s = "XMPP_SESSION_STANZA_OP";
        continue; /* Loop/switch isn't completed */
_L2:
        s = "SIGNIN_STATE_CHANGED_OP";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "CALL_STATE_CHANGED_OP";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "STATS_OP";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "ENDPOINT_EVENT_OP";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "MEDIA_SOURCES_OP";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "AUDIO_LEVELS_OP";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "IBB_DATA_RECEIVE";
        continue; /* Loop/switch isn't completed */
_L10:
        s = "IBB_SEND_RESULT";
        continue; /* Loop/switch isn't completed */
_L11:
        s = "BUZZ_SUBSCRIPTION_RESULT";
        continue; /* Loop/switch isn't completed */
_L12:
        s = "BUZZ_NOTIF_RECEIVE";
        continue; /* Loop/switch isn't completed */
_L13:
        s = "P2P_DATA_CONNECTION_RESULT";
        continue; /* Loop/switch isn't completed */
_L14:
        s = "P2P_DATA_RECEIVE";
        continue; /* Loop/switch isn't completed */
_L15:
        s = "DIRECTED_PRESENCE_RECEIPT";
        if (true) goto _L17; else goto _L16
_L16:
        i;
        JVM INSTR tableswitch 6001 6013: default 292
    //                   6001 300
    //                   6002 307
    //                   6003 314
    //                   6004 321
    //                   6005 328
    //                   6006 335
    //                   6007 342
    //                   6008 349
    //                   6009 356
    //                   6010 363
    //                   6011 370
    //                   6012 377
    //                   6013 384;
           goto _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31
_L31:
        break MISSING_BLOCK_LABEL_384;
_L18:
        s = null;
_L32:
        if (s != null)
        {
            return s;
        } else
        {
            return super.getWhatToString(i);
        }
_L19:
        s = "CLEANUP";
          goto _L32
_L20:
        s = "PREPARE_NETWORK";
          goto _L32
_L21:
        s = "TEAR_DOWN";
          goto _L32
_L22:
        s = "GET_DIAGNOSTICS_FOR_PEER";
          goto _L32
_L23:
        s = "CREATE_NATIVE_SOCKET";
          goto _L32
_L24:
        s = "CREATE_OBSOLETE_SOCKET";
          goto _L32
_L25:
        s = "SEND_RELIABLE";
          goto _L32
_L26:
        s = "SEND_UNRELIABLE";
          goto _L32
_L27:
        s = "CONNECT_PEER";
          goto _L32
_L28:
        s = "DISCONNECT_PEER";
          goto _L32
_L29:
        s = "REGISTER_BUZZBOT";
          goto _L32
_L30:
        s = "UNREGISTER_BUZZBOT";
          goto _L32
        s = "SOCKET_PROXY_CLOSED_SOCKET";
          goto _L32
    }

    static 
    {
        DBG = ((Boolean)G.enableVerboseRealtimeMultiplayerLogging.getBinderSafe()).booleanValue();
    }
}
