// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.notifications;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.service.WrappedGamesCallbacks;

public final class GetInboxActivityCountsOperation
    implements com.google.android.gms.games.service.PlayGamesAsyncService.Operation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final GamesClientContext mGamesContext;

    public GetInboxActivityCountsOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        mGamesContext = gamesclientcontext;
        mCallbacks = wrappedgamescallbacks;
    }

    public final void execute(Context context, DataBroker databroker)
    {
        context = new Bundle();
        int i = databroker.getInboxCounts(mGamesContext, context);
        try
        {
            mCallbacks.onInboxCountsLoaded(i, context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("InboxCountsOp", "Failed to provide callback", context);
        }
    }

    public final void postExecute()
    {
    }
}
