// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.ActivityNotFoundException;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.GmsIntents;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.util.PageSizeUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameExploreFragment, GameVisitPlayStoreAdapter

public static final class ventListener extends GameExploreFragment
    implements ventListener
{

    protected final GamesRecyclerAdapter createAdapter()
    {
        com.google.android.gms.games.ui.er.VisitPlayStoreEventListener visitplaystoreeventlistener = new com.google.android.gms.games.ui.er.VisitPlayStoreEventListener();
        visitplaystoreeventlistener.VisitPlayStoreEventListener(new GameVisitPlayStoreAdapter(mParent, this));
        visitplaystoreeventlistener.VisitPlayStoreEventListener(super.createAdapter());
        return visitplaystoreeventlistener.ateAdapter();
    }

    protected final int getLatencyId()
    {
        return 13;
    }

    public final int getLoggingListType()
    {
        return 1;
    }

    protected final int getPlaylogElementType()
    {
        return 16;
    }

    protected final void loadData(GoogleApiClient googleapiclient)
    {
        PlayGames.GamesMetadata.loadGames(googleapiclient, 0, PageSizeUtils.getSmallCardPageSize(mParent), false).setResultCallback(this);
    }

    public final void onEndOfWindowReached(int i)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("GameExploreFragment", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            PlayGames.GamesMetadata.loadMoreGames(googleapiclient, 0, PageSizeUtils.getSmallCardPageSize(mParent)).setResultCallback(this);
            return;
        }
    }

    public final volatile void onResult(Result result)
    {
        super.onResult((com.google.android.gms.games.client.games.ragment)result);
    }

    public final void onVisitPlayStoreClicked()
    {
        com.google.android.gms.games.ui.destination.DestinationFragmentActivity destinationfragmentactivity = mParent;
        android.content.Intent intent = GmsIntents.createPlayStoreGamesIntent(destinationfragmentactivity);
        try
        {
            destinationfragmentactivity.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            GamesLog.e("UiUtils", "Unable to launch play store intent", activitynotfoundexception);
        }
    }

    public ventListener()
    {
    }
}
