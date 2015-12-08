// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.leaderboards;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class SubmitScoreOperation extends AbstractDataHolderOperation
{

    private final long mAchievedTimestamp;
    private final WrappedGamesCallbacks mCallbacks;
    private final String mExternalLeaderboardId;
    private final GamesClientContext mGamesContext;
    private final long mRawScore;
    private final String mScoreTag;

    public SubmitScoreOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String s, long l, long l1, 
            String s1)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
        mExternalLeaderboardId = s;
        mRawScore = l;
        mAchievedTimestamp = l1;
        mScoreTag = s1;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        boolean flag;
        if (mCallbacks != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return databroker.submitScore(mGamesContext, mExternalLeaderboardId, mRawScore, mAchievedTimestamp, mScoreTag, flag).toDataHolder();
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
label0:
        {
            if (mCallbacks != null)
            {
                if (dataholder.mRowCount <= 0)
                {
                    break label0;
                }
                mCallbacks.onScoreSubmitted(dataholder);
            }
            return;
        }
        dataholder = (new ScoreSubmissionData(dataholder.mStatusCode, mExternalLeaderboardId, mGamesContext.mExternalTargetGameId)).toDataHolder();
        mCallbacks.onScoreSubmitted(dataholder);
        dataholder.close();
        return;
        Exception exception;
        exception;
        dataholder.close();
        throw exception;
    }
}
