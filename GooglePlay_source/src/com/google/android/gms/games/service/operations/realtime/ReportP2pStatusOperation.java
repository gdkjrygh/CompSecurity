// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.realtime;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;
import java.util.ArrayList;

public final class ReportP2pStatusOperation extends AbstractDataHolderOperation
{

    private final com.google.android.gms.games.service.PlayGamesAsyncService.P2pStatusReportCallback mCallback;
    private final String mRoomId;
    private final ArrayList mRoomP2PStatuses;

    public ReportP2pStatusOperation(ClientContext clientcontext, com.google.android.gms.games.service.PlayGamesAsyncService.P2pStatusReportCallback p2pstatusreportcallback, String s, ArrayList arraylist)
    {
        super(clientcontext);
        mCallback = p2pstatusreportcallback;
        mRoomId = s;
        mRoomP2PStatuses = arraylist;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.p2pStatus(context, mClientContext, mRoomId, mRoomP2PStatuses);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        mCallback.onReportedStatus(dataholder);
    }
}
