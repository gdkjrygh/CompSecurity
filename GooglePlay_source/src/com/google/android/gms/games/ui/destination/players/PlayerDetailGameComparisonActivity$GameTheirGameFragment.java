// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.ui.destination.games.GameExploreFragment;
import com.google.android.gms.games.ui.util.PageSizeUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailGameComparisonActivity

public static final class  extends GameExploreFragment
{

    protected final int getLatencyId()
    {
        return 20;
    }

    protected final int getLoggingListType()
    {
        return 10;
    }

    protected final int getPlaylogElementType()
    {
        return 27;
    }

    protected final void loadData(GoogleApiClient googleapiclient)
    {
        Asserts.checkState(mParent instanceof PlayerDetailGameComparisonActivity);
        String s = PlayerDetailGameComparisonActivity.access$000((PlayerDetailGameComparisonActivity)mParent);
        PlayGames.GamesMetadata.loadRecentlyPlayedGamesForPlayer$4189436a(googleapiclient, s, PageSizeUtils.getMixedTilePageSize(mParent)).setResultCallback(this);
    }

    public final void onEndOfWindowReached(int i)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            return;
        } else
        {
            Asserts.checkState(mParent instanceof PlayerDetailGameComparisonActivity);
            String s = PlayerDetailGameComparisonActivity.access$000((PlayerDetailGameComparisonActivity)mParent);
            PlayGames.GamesMetadata.loadMoreRecentlyPlayedGamesForPlayer(googleapiclient, s, PageSizeUtils.getMixedTilePageSize(mParent)).setResultCallback(this);
            return;
        }
    }

    public ()
    {
    }
}
