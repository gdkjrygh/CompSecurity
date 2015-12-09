// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.players;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.operations.AbstractStatusReportingOperation;

public final class RecordPlayerSuggestionActionOperation extends AbstractStatusReportingOperation
{

    private final int mAction;
    private final GamesClientContext mGamesContext;

    public RecordPlayerSuggestionActionOperation(GamesClientContext gamesclientcontext, int i)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mAction = i;
    }

    protected final int performOperation(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.recordPlayerSuggestionAction$11b7dad(mGamesContext);
    }

    protected final void provideResult(int i)
        throws RemoteException
    {
    }
}
