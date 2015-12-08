// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.client.games:
//            GameFirstPartyBuffer

public interface GamesMetadata
{
    public static interface LoadGamesResult
        extends Releasable, Result
    {

        public abstract GameFirstPartyBuffer getGames();
    }


    public abstract PendingResult loadCommonGames$4189436a(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult loadGame(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult loadGames(GoogleApiClient googleapiclient, int i, int j, boolean flag);

    public abstract PendingResult loadMoreCommonGames(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult loadMoreGames(GoogleApiClient googleapiclient, int i, int j);

    public abstract PendingResult loadMoreRecentlyPlayedGames(GoogleApiClient googleapiclient, int i);

    public abstract PendingResult loadMoreRecentlyPlayedGamesForPlayer(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult loadRecentlyPlayedGames$91af0f4(GoogleApiClient googleapiclient, int i);

    public abstract PendingResult loadRecentlyPlayedGamesForPlayer$4189436a(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult searchForGames$4189436a(GoogleApiClient googleapiclient, String s, int i);

    public abstract PendingResult searchForMoreGames(GoogleApiClient googleapiclient, String s, int i);
}
