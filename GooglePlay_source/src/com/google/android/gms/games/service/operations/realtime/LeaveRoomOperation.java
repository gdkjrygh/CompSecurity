// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.realtime;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.server.api.RoomLeaveDiagnostics;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class LeaveRoomOperation extends AbstractStatusReportingOperation
{

    private final com.google.android.gms.games.service.PlayGamesAsyncService.RoomLeftCallback mCallback;
    private final String mExternalRoomId;
    private final RoomLeaveDiagnostics mLeaveDiagnostics;
    private final String mReason;

    public LeaveRoomOperation(ClientContext clientcontext, com.google.android.gms.games.service.PlayGamesAsyncService.RoomLeftCallback roomleftcallback, String s, String s1, RoomLeaveDiagnostics roomleavediagnostics)
    {
        super(clientcontext);
        mCallback = roomleftcallback;
        mExternalRoomId = s;
        mReason = s1;
        mLeaveDiagnostics = roomleavediagnostics;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.leaveRoom(context, mClientContext, mExternalRoomId, mReason, mLeaveDiagnostics);
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
        if (mCallback != null)
        {
            mCallback.onLeftRoom(i, mExternalRoomId);
        }
    }
}
