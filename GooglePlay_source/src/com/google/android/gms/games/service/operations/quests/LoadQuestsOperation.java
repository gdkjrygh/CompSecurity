// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.quests;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;

public final class LoadQuestsOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final String mExternalQuestIds[];
    private final GamesClientContext mGamesContext;
    private final int mQuestSelectors[];
    private final int mSortOrder;

    public LoadQuestsOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, int ai[], int i)
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mCallbacks = wrappedgamescallbacks;
        mQuestSelectors = ai;
        mSortOrder = i;
        mExternalQuestIds = null;
    }

    public LoadQuestsOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks, String as[])
    {
        super(gamesclientcontext.mClientContext);
        mGamesContext = gamesclientcontext;
        mCallbacks = wrappedgamescallbacks;
        mExternalQuestIds = as;
        mSortOrder = 0;
        mQuestSelectors = Quests.SELECT_ALL_QUESTS;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        if (mGamesContext.mIsFirstParty)
        {
            return databroker.loadQuests1P(mGamesContext, mQuestSelectors, mSortOrder, mExternalQuestIds);
        } else
        {
            return databroker.loadQuests3P(mGamesContext, mQuestSelectors, mSortOrder, mExternalQuestIds);
        }
    }

    public final void postExecute()
    {
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        WrappedGamesCallbacks wrappedgamescallbacks = mCallbacks;
        wrappedgamescallbacks.audit(new DataHolder[] {
            dataholder
        });
        wrappedgamescallbacks.mCallbacks.onQuestsLoaded(dataholder);
    }
}
