// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.util.PageSizeUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameListMyGamesFragment, GameSmallCardAdapter

public static final class q extends GameListMyGamesFragment
{

    protected final DatabufferRecyclerAdapter createGameAdapter()
    {
        return new GameSmallCardAdapter(mParent, 3, 0, this);
    }

    protected final int getLatencyId()
    {
        return 7;
    }

    protected final int getLoggingListType()
    {
        return 8;
    }

    protected final int getPlaylogElementType()
    {
        return 20;
    }

    protected final void loadData(GoogleApiClient googleapiclient)
    {
        PlayGames.GamesMetadata.loadGames(googleapiclient, 6, PageSizeUtils.getSmallCardPageSize(mParent), false).setResultCallback(this);
    }

    public final void onEndOfWindowReached(int i)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("GameListMyGamesFragment", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            PlayGames.GamesMetadata.loadMoreGames(googleapiclient, 6, PageSizeUtils.getSmallCardPageSize(mParent)).setResultCallback(this);
            return;
        }
    }

    public final volatile void onResult(Result result)
    {
        super.onResult((com.google.android.gms.games.client.games.ragment)result);
    }

    public q()
    {
    }
}
