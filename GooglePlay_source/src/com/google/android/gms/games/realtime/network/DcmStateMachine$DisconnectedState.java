// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.realtime.network;

import android.os.Message;
import com.google.android.gms.games.jingle.Libjingle;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.realtime.network:
//            DcmStateMachine

static final class Data extends Data
{

    public final boolean processMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 6002: 
            message = (Data)message.obj;
            mData.e.nativeConnectAndSignin(((Data) (message)).authToken, true);
            mStates.tate.ansitionToState();
            return HANDLED;

        case 6001: 
            mData.e.release();
            mSm.quit();
            return HANDLED;
        }
    }

    public Data(DcmStateMachine dcmstatemachine)
    {
        super(dcmstatemachine);
    }
}
