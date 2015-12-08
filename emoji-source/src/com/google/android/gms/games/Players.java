// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerBuffer

public interface Players
{
    public static interface LoadOwnerCoverPhotoUrisResult
        extends Result
    {
    }

    public static interface LoadPlayersResult
        extends Releasable, Result
    {

        public abstract PlayerBuffer getPlayers();
    }

    public static interface LoadXpForGameCategoriesResult
        extends Result
    {
    }

    public static interface LoadXpForGamesResult
        extends Result
    {
    }

    public static interface LoadXpStreamResult
        extends Result
    {
    }


    public static final String EXTRA_PLAYER_SEARCH_RESULTS = "player_search_results";

    public abstract Player getCurrentPlayer(GoogleApiClient googleapiclient);

    public abstract String getCurrentPlayerId(GoogleApiClient googleapiclient);

    public abstract Intent getPlayerSearchIntent(GoogleApiClient googleapiclient);

    public abstract PendingResult loadConnectedPlayers(GoogleApiClient googleapiclient, boolean flag);

    public abstract PendingResult loadInvitablePlayers(GoogleApiClient googleapiclient, int i, boolean flag);

    public abstract PendingResult loadMoreInvitablePlayers(GoogleApiClient googleapiclient, int i);

    public abstract PendingResult loadMoreRecentlyPlayedWithPlayers(GoogleApiClient googleapiclient, int i);

    public abstract PendingResult loadPlayer(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult loadRecentlyPlayedWithPlayers(GoogleApiClient googleapiclient, int i, boolean flag);
}
