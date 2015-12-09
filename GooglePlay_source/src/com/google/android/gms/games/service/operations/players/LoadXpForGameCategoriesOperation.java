// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.operations.players;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.broker.DataBroker;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.service.WrappedGamesCallbacks;
import com.google.android.gms.games.service.operations.AbstractDataHolderOperation;
import java.util.ArrayList;

public final class LoadXpForGameCategoriesOperation extends AbstractDataHolderOperation
{

    private final WrappedGamesCallbacks mCallbacks;
    private final GamesClientContext mGamesContext;

    public LoadXpForGameCategoriesOperation(GamesClientContext gamesclientcontext, WrappedGamesCallbacks wrappedgamescallbacks)
    {
        super(gamesclientcontext.mClientContext);
        mCallbacks = wrappedgamescallbacks;
        mGamesContext = gamesclientcontext;
    }

    protected final DataHolder fetchData(Context context, DataBroker databroker)
        throws GoogleAuthException
    {
        return databroker.loadPlayerXpForGameCategories(mGamesContext);
    }

    protected final void provideResult(DataHolder dataholder)
        throws RemoteException
    {
        int j = dataholder.mStatusCode;
        WrappedGamesCallbacks wrappedgamescallbacks = mCallbacks;
        int k = dataholder.mRowCount;
        ArrayList arraylist = new ArrayList(k);
        Bundle bundle = new Bundle();
        for (int i = 0; i < k; i++)
        {
            int l = dataholder.getWindowIndex(i);
            String s = dataholder.getString("game_category", i, l);
            bundle.putLong(s, Long.valueOf(dataholder.getLong("xp_for_game", i, l)).longValue());
            arraylist.add(s);
        }

        bundle.putStringArrayList("game_category_list", arraylist);
        wrappedgamescallbacks.onXpForGameCategoriesLoaded(j, bundle);
    }
}
