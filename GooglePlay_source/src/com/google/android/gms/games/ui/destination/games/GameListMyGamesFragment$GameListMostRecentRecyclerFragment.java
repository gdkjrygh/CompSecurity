// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.res.Resources;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameListMyGamesFragment, ContinuePlayingAdapter

public static final class  extends GameListMyGamesFragment
{

    protected final DatabufferRecyclerAdapter createGameAdapter()
    {
        return new ContinuePlayingAdapter(mParent, this);
    }

    protected final UpsellCardAdapter createUpsellAdapter()
    {
        Resources resources = mParent.getResources();
        return UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new com.google.android.gms.games.ui.common.erFragment.mParent(resources.getColor(0x7f0b0071), 0x7f1000fa), 9, null);
    }

    protected final int getLatencyId()
    {
        return 5;
    }

    protected final int getLoggingListType()
    {
        return 3;
    }

    protected final int getPlaylogElementType()
    {
        return 19;
    }

    protected final void loadData(GoogleApiClient googleapiclient)
    {
        if (((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
        {
            mUpsellCardAdapter.setVisible(false);
            PlayGames.GamesMetadata.loadRecentlyPlayedGames$91af0f4(googleapiclient, PageSizeUtils.getContinuePlayingTilePageSize(mParent)).setResultCallback(this);
            return;
        } else
        {
            mUpsellCardAdapter.setVisible(true);
            mLoadingDataViewManager.setViewState(2);
            return;
        }
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
            PlayGames.GamesMetadata.loadMoreRecentlyPlayedGames(googleapiclient, PageSizeUtils.getContinuePlayingTilePageSize(mParent)).setResultCallback(this);
            return;
        }
    }

    public final volatile void onResult(Result result)
    {
        super.onResult((com.google.android.gms.games.client.games.ragment)result);
    }

    public ()
    {
    }
}
