// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationGamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameSmallCardAdapter

public final class GameSearchResultsFragment extends DestinationGamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, com.google.android.gms.games.ui.util.SearchHelper.SearchProvider
{

    private boolean mDiscardQueryResults;
    private View mEmptyViewInitialState;
    private boolean mIsConnected;
    private String mPendingQuery;
    private String mQuery;
    private boolean mResetResultsListToTop;
    private GameSmallCardAdapter mResultsAdapter;

    public GameSearchResultsFragment()
    {
        super(0x7f040082);
        mIsConnected = false;
        mDiscardQueryResults = false;
        mResetResultsListToTop = false;
    }

    public final void doSearch(String s)
    {
        if (!mIsConnected)
        {
            GamesLog.d("GameSearchResFrag", "doSearch: not connected yet! Stashing away mPendingQuery...");
            mPendingQuery = s;
        } else
        {
            GoogleApiClient googleapiclient = getGoogleApiClient();
            if (!UiUtils.checkClientDisconnected(googleapiclient, mParent))
            {
                if (TextUtils.isEmpty(s))
                {
                    mResultsAdapter.clearData();
                    mLoadingDataViewManager.setViewState(4);
                    mEmptyViewInitialState.setVisibility(0);
                    mDiscardQueryResults = true;
                    return;
                } else
                {
                    mParent.logSearchEvent(2, s);
                    mQuery = s;
                    PlayGames.GamesMetadata.searchForGames$4189436a(googleapiclient, mQuery, PageSizeUtils.getGameSearchTilePageSize(mParent)).setResultCallback(this);
                    mEmptyViewInitialState.setVisibility(8);
                    mLoadingDataViewManager.setViewState(1);
                    mDiscardQueryResults = false;
                    mResetResultsListToTop = true;
                    return;
                }
            }
        }
    }

    protected final int getPlaylogElementType()
    {
        return 14;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = new HeaderItemRecyclerAdapter(mParent);
        bundle.setTitle(0x7f100259);
        Asserts.checkState(mParent instanceof GameSmallCardAdapter.GameSmallCardEventListener, "Parent must implement GameSmallCardEventListener.");
        mResultsAdapter = new GameSmallCardAdapter(mParent, 2, 0, (GameSmallCardAdapter.GameSmallCardEventListener)mParent);
        mResultsAdapter.mOnEndOfWindowReachedListener = this;
        com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        builder.addAdapter(bundle);
        builder.addAdapter(mResultsAdapter);
        setAdapter(builder.build());
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        mEmptyViewInitialState = layoutinflater.findViewById(0x7f0d01b2);
        setEmptyViewElements(0x7f020123, 0x7f10025b, 0);
        mLoadingDataViewManager.setViewState(4);
        mEmptyViewInitialState.setVisibility(0);
        return layoutinflater;
    }

    public final void onEndOfWindowReached(int i)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            GamesLog.w("GameSearchResFrag", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            PlayGames.GamesMetadata.searchForMoreGames(googleapiclient, mQuery, PageSizeUtils.getGameSearchTilePageSize(mParent)).setResultCallback(this);
            return;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mIsConnected = true;
        if (mPendingQuery != null)
        {
            GamesLog.d("GameSearchResFrag", (new StringBuilder("onGoogleApiClientConnected: running pending query '")).append(mPendingQuery).append("'...").toString());
            doSearch(mPendingQuery);
            mPendingQuery = null;
        }
    }

    public final volatile void onResult(Result result)
    {
        com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult loadgamesresult;
        int i;
        loadgamesresult = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result;
        i = loadgamesresult.getStatus().mStatusCode;
        result = loadgamesresult.getGames();
        boolean flag = canUseResult(loadgamesresult);
        if (!flag)
        {
            result.release();
            return;
        }
        if (!mDiscardQueryResults)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        GamesLog.d("GameSearchResFrag", "onExtendedGamesLoaded: discarding stray result");
        result.release();
        return;
        if (UiUtils.isNetworkError(i))
        {
            mResultsAdapter.showFooterErrorState();
        }
        mResultsAdapter.setDataBuffer(result);
        if (mResetResultsListToTop)
        {
            mResetResultsListToTop = false;
            if (result.getCount() > 0)
            {
                ((RecyclerView)super.mView.findViewById(0x102000a)).scrollToPosition(0);
            }
        }
        mLoadingDataViewManager.handleViewState(i, result.getCount(), false);
        return;
        Exception exception;
        exception;
        result.release();
        throw exception;
    }

    public final void onRetry()
    {
        doSearch(mQuery);
    }
}
