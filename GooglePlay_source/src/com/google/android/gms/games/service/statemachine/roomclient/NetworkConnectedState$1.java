// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            NetworkConnectedState

final class val.baseData
    implements com.google.android.gms.games.service.omEnteredCallback
{

    final NetworkConnectedState this$0;
    final m val$baseData;

    public final void onEnteredRoom(DataHolder dataholder)
    {
        dataholder = new ta(dataholder, val$baseData);
        mSm.sendMessage(dataholder);
    }

    ta()
    {
        this$0 = final_networkconnectedstate;
        val$baseData = val.baseData.this;
        super();
    }
}
