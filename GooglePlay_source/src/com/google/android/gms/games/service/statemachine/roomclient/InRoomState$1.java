// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.MultiplayerUtils;
import com.google.android.gms.games.service.statemachine.IStateMachine;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            InRoomState

final class this._cls0
    implements com.google.android.gms.games.service.Service.P2pStatusReportCallback
{

    final InRoomState this$0;

    public final void onReportedStatus(DataHolder dataholder)
    {
        String s;
        if (dataholder.mStatusCode == 0)
        {
            s = MultiplayerUtils.roomStatusDataHolderToJsonString(dataholder);
        } else
        {
            s = (new StringBuilder("Error ")).append(dataholder.mStatusCode).toString();
        }
        mSm.sendMessage(new StatusReportedData(dataholder.mStatusCode, s));
    }

    StatusReportedData()
    {
        this$0 = InRoomState.this;
        super();
    }
}
