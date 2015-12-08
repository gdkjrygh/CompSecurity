// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.os.Message;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.jingle.Libjingle;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmStateMachine, PeerStateMachine, DataConnectionCallbacks

static final class  extends 
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
    //                   1: 699
    //                   2: 162
    //                   101: 296
    //                   102: 275
    //                   202: 538
    //                   301: 359
    //                   302: 254
    //                   401: 338
    //                   6003: 644
    //                   6004: 517
    //                   6005: 422
    //                   6006: 401
    //                   6007: 380
    //                   6008: 443
    //                   6009: 317
    //                   6010: 496
    //                   6011: 570
    //                   6012: 615;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        return false;
_L3:
        com.google.android.gms.games.jingle.OpData opdata = (com.google.android.gms.games.jingle.OpData)message.obj;
        mSm.logNote((new StringBuilder("OP: ")).append(com.google.android.gms.games.jingle.eCallState.toString(opdata.newState)).toString());
        if (opdata.newState != 15)
        {
            mSm.logNote((new StringBuilder("CALL_STATE_CHANGED_OP: New state: ")).append(com.google.android.gms.games.jingle.eCallState.toString(opdata.newState)).toString());
            return mPeerSm.dispatchMessageByJid(opdata.remoteJid, message);
        }
          goto _L1
_L8:
        com.google.android.gms.games.jingle.OpData opdata1 = (com.google.android.gms.games.jingle.OpData.remoteJid)message.obj;
        return mPeerSm.dispatchMessageBySession(opdata1.essionId, message);
_L5:
        com.google.android.gms.games.jingle.a a = (com.google.android.gms.games.jingle.a)message.obj;
        return mPeerSm.dispatchMessageByJid(a.peerJid, message);
_L4:
        com.google.android.gms.games.jingle.ta ta = (com.google.android.gms.games.jingle.ta)message.obj;
        return mPeerSm.dispatchMessageByJid(ta.fromJid, message);
_L16:
        mPeerSm mpeersm = ()message.obj;
        return mPeerSm.dispatchMessageByJid(mpeersm.lPeerJid, message);
_L9:
        com.google.android.gms.games.jingle.Receipt receipt = (com.google.android.gms.games.jingle.Receipt)message.obj;
        return mPeerSm.dispatchMessageByJid(receipt.barePeerJid, message);
_L7:
        com.google.android.gms.games.jingle.nResult nresult = (com.google.android.gms.games.jingle.nResult)message.obj;
        return mPeerSm.dispatchMessageBySession(nresult.sessionId, message);
_L14:
        mPeerSm mpeersm1 = (ssionId)message.obj;
        return mPeerSm.dispatchMessageByJid(mpeersm1.cipientJid, message);
_L13:
        tData tdata = (tData)message.obj;
        return mPeerSm.dispatchMessageByJid(tdata.peerJid, message);
_L12:
        ata ata = (ata)message.obj;
        return mPeerSm.dispatchMessageByJid(ata.peerJid, message);
_L15:
        String as[] = ((ata.peerJid)message.obj).recipientJids;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            mPeerSm.dispatchMessageByJid(s, message);
        }

        return HANDLED;
_L17:
        ata ata1 = (HANDLED)message.obj;
        return mPeerSm.dispatchMessageByJid(ata1.peerJid, message);
_L11:
        er er = (er)message.obj;
        return mPeerSm.dispatchMessageByJid(er.peerJid, message);
_L6:
        message = (com.google.android.gms.games.jingle.Data)message.obj;
        mData.llbacks.onReceiveBuzzNotification(((com.google.android.gms.games.jingle.Data) (message)).notification, ((com.google.android.gms.games.jingle.Data) (message)).recipientData);
        return HANDLED;
_L18:
        message = ()message.obj;
        if (((Boolean)G.enableBuzzbotSubscription.get()).booleanValue())
        {
            mData.ngle.nativeRegisterWithBuzzbot((() (message)).roomId, mLocalJid);
        }
        return HANDLED;
_L19:
        if (((Boolean)G.enableBuzzbotSubscription.get()).booleanValue())
        {
            mData.ngle.nativeUnregisterWithBuzzbot();
        }
        return HANDLED;
_L10:
        message = Message.obtain();
        message.what = 6010;
        mPeerSm.dispatchToAll(message);
        mData.ngle.nativeDisconnectAndSignout(mLocalJid);
        mStates.ctingState.transitionTo(new Runnable() {

            final DcmStateMachine.ConnectedState this$0;

            public final void run()
            {
                mData.dcmCallbacks.onNetworkDisconnected();
            }

            
            {
                this$0 = DcmStateMachine.ConnectedState.this;
                super();
            }
        });
        return HANDLED;
_L2:
        if (!((com.google.android.gms.games.jingle.edOpData)message.obj).signedIn)
        {
            mData.llbacks.onNetworkDisconnected();
            mStates.ctedState.transitionToState();
        }
        return HANDLED;
    }

    public final void transitionTo(String s)
    {
        mLocalJid = s;
        mPeerSm = new PeerStateMachine(mData.ngle, mData.llbacks, mSm);
        transitionToState();
    }

    public _cls1.this._cls0(DcmStateMachine dcmstatemachine)
    {
        super(dcmstatemachine);
    }
}
