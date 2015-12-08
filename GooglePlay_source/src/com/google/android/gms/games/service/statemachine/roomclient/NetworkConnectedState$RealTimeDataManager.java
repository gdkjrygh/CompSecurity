// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.api.RoomStatus;

// Referenced classes of package com.google.android.gms.games.service.statemachine.roomclient:
//            NetworkConnectedState

public static final class mClientContext
{

    final ClientContext mClientContext;
    final Context mContext;

    public final DataHolder getRoom(String s)
    {
        DataBroker databroker = DataBroker.acquireBroker(mContext);
        s = databroker.getRoom(mContext, mClientContext, s);
        databroker.release();
        return s;
        s;
        s = DataHolder.empty(2);
        databroker.release();
        return s;
        s;
        databroker.release();
        throw s;
    }

    public final boolean updateRoom(RoomStatus roomstatus)
    {
        DataBroker databroker;
        DataHolder dataholder;
        databroker = DataBroker.acquireBroker(mContext);
        dataholder = databroker.updateRoom(mContext, mClientContext, roomstatus);
        if (dataholder.mRowCount != 0)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        GamesLog.e("RealTimeDataManager", (new StringBuilder("Empty data holder with status ")).append(dataholder.mStatusCode).append(" returned for status update to room ").append(roomstatus.getRoomId()).toString());
        dataholder.close();
        databroker.release();
        return false;
        dataholder.close();
        databroker.release();
        return true;
        roomstatus;
        dataholder.close();
        databroker.release();
        throw roomstatus;
    }

    public (Context context, ClientContext clientcontext)
    {
        AndroidUtils.assertMainGmsProcess();
        mContext = context;
        mClientContext = clientcontext;
    }
}
