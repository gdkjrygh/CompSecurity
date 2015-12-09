// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.os.Message;
import com.google.android.gms.games.jingle.Libjingle;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmStateMachine, DataConnectionCallbacks

static final class _cls1.this._cls0 extends _cls1.this._cls0
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
            if (((com.google.android.gms.games.jingle.Data)message.obj).result)
            {
                mData.s.onNetworkReadyForMatch(mLocalJid, mLatencyMs);
                mStates..tionTo(mLocalJid);
            } else
            {
                mData.mData.nativeDisconnectAndSignout(mLocalJid);
                mStates.tate.ansitionTo(new Runnable() {

                    final DcmStateMachine.SubscribingBuzzState this$0;

                    public final void run()
                    {
                        mData.dcmCallbacks.onNetworkFailedForMatch();
                    }

            
            {
                this$0 = DcmStateMachine.SubscribingBuzzState.this;
                super();
            }
                });
            }
            return HANDLED;

        case 1: // '\001'
            if (!((com.google.android.gms.games.jingle.ta)message.obj).signedIn)
            {
                mData.s.onNetworkDisconnected();
                mStates.ate.nsitionToState();
            }
            return HANDLED;

        case 6001: 
            mData.mData.release();
            mSm.quit();
            return HANDLED;
        }
    }

    public _cls1.this._cls0(DcmStateMachine dcmstatemachine)
    {
        super(dcmstatemachine);
    }
}
