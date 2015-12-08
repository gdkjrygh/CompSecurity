// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.turnbased;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class FinishTurnBasedMatchOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final String mExternalMatchId;
    private final GamesClientContext mGamesContext;
    private final byte mMatchData[];
    private final ParticipantResult mResults[];

    public FinishTurnBasedMatchOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, byte abyte0[], ParticipantResult aparticipantresult[])
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
        mExternalMatchId = s;
        if (abyte0 == null)
        {
            mMatchData = null;
        } else
        {
            mMatchData = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, mMatchData, 0, abyte0.length);
        }
        mResults = aparticipantresult;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.finishMatch(mGamesContext, mExternalMatchId, mMatchData, mResults);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        mCallbacks.onTurnBasedMatchUpdated(dataholder);
    }
}
