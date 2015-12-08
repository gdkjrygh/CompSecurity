// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.leaderboards:
//            LeaderboardAdapter, LeaderboardHeaderAdapter

public abstract class LeaderboardFragment extends GamesHeaderRecyclerViewFragment
    implements ResultCallback, LeaderboardAdapter.LeaderboardEventListener
{

    private LeaderboardAdapter mLeaderboardAdapter;
    private LeaderboardHeaderAdapter mLeaderboardHeaderAdapter;

    public LeaderboardFragment()
    {
    }

    public final int getHeaderHeight(Context context)
    {
        context = context.getResources();
        return context.getDimensionPixelSize(0x7f0c00e6) - context.getDimensionPixelSize(0x7f0c00e5);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        boolean flag = mParent.mConfiguration.isClientUi();
        int i;
        if (flag)
        {
            i = 0x7f020153;
        } else
        {
            i = 0x7f020152;
        }
        setEmptyViewElements(i, 0x7f1001b8, 0);
        if (flag)
        {
            bundle = mParent.getResources();
            setEmptyViewElementsColor(bundle.getColor(0x106000b), bundle.getColor(0x7f0b0257));
        }
        mLeaderboardAdapter = new LeaderboardAdapter(mParent, this);
        bundle = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        if (hasPlayHeader())
        {
            mLeaderboardHeaderAdapter = new LeaderboardHeaderAdapter(mParent);
            bundle.addAdapter(mLeaderboardHeaderAdapter);
        }
        bundle.addAdapter(mLeaderboardAdapter);
        setAdapter(bundle.build());
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        GamesUiConfiguration gamesuiconfiguration = mParent.mConfiguration;
        if (gamesuiconfiguration.is3PContext())
        {
            Games.Leaderboards.loadLeaderboardMetadata$4b6585cf(googleapiclient).setResultCallback(this);
            return;
        } else
        {
            Games.Leaderboards.loadLeaderboardMetadataFirstParty$70b7f367(googleapiclient, gamesuiconfiguration.getCurrentGameId()).setResultCallback(this);
            return;
        }
    }

    public final void onLeaderboardClicked(Leaderboard leaderboard)
    {
        showLeaderboardScoreUi(leaderboard);
    }

    public final volatile void onResult(Result result)
    {
        com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult leaderboardmetadataresult;
        int i;
        leaderboardmetadataresult = (com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult)result;
        i = leaderboardmetadataresult.getStatus().mStatusCode;
        result = leaderboardmetadataresult.getLeaderboards();
        boolean flag = canUseResult(leaderboardmetadataresult);
        if (!flag)
        {
            result.release();
            return;
        }
        mLeaderboardAdapter.setDataBuffer(result);
        mLoadingDataViewManager.handleViewState(i, result.getCount(), false);
        return;
        Exception exception;
        exception;
        result.release();
        throw exception;
    }

    public final void onRetry()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            GamesLog.w("LeaderboardFrag", "onRetry: not connected; ignoring...");
            return;
        }
        GamesUiConfiguration gamesuiconfiguration = mParent.mConfiguration;
        if (gamesuiconfiguration.is3PContext())
        {
            Games.Leaderboards.loadLeaderboardMetadata$4b6585cf(googleapiclient).setResultCallback(this);
        } else
        {
            Games.Leaderboards.loadLeaderboardMetadataFirstParty$70b7f367(googleapiclient, gamesuiconfiguration.getCurrentGameId()).setResultCallback(this);
        }
        mLoadingDataViewManager.setViewState(1);
    }

    public abstract void showLeaderboardScoreUi(Leaderboard leaderboard);
}
