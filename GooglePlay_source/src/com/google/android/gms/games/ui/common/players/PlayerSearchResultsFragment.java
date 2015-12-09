// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.players;

import android.os.Bundle;
import android.os.SystemClock;
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
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.AddToCirclesHelper;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.players:
//            PlayerAvatarAdapter

public final class PlayerSearchResultsFragment extends GamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.AddToCirclesHelper.OneTouchCirclesListener, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, PlayerAvatarAdapter.PlayerAvatarEventListener, com.google.android.gms.games.ui.util.SearchHelper.SearchProvider
{

    private AddToCirclesHelper mAddToCirclesHelper;
    private boolean mDiscardQueryResults;
    private View mEmptyViewInitialState;
    private boolean mIsConnected;
    private long mMoreSearchIssuedTimeInMillis;
    private String mPendingQuery;
    private String mQuery;
    private boolean mResetResultsListToTop;
    private PlayerAvatarAdapter mResultsAdapter;
    private boolean mWaitingOnMorePendingResults;

    public PlayerSearchResultsFragment()
    {
        super(0x7f040082);
        mAddToCirclesHelper = null;
        mIsConnected = false;
        mDiscardQueryResults = false;
        mResetResultsListToTop = false;
    }

    public final void doSearch(String s)
    {
        if (!mIsConnected)
        {
            GamesLog.d("PlayerSearchResFrag", "doSearch: not connected yet! Stashing away mPendingQuery...");
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
                    mParent.logSearchEvent(1, s);
                    mQuery = s;
                    Games.Players.searchForPlayersInternal$4189436a(googleapiclient, mQuery, PageSizeUtils.getMixedTilePageSize(mParent)).setResultCallback(this);
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
        return 8;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = new HeaderItemRecyclerAdapter(mParent);
        bundle.setTitle(0x7f10025c);
        boolean flag = mParent.mConfiguration.isClientUi();
        com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder;
        int i;
        if (flag)
        {
            i = 0x7f12001b;
        } else
        {
            i = 0;
        }
        mResultsAdapter = new PlayerAvatarAdapter(mParent, (PlayerAvatarAdapter.PlayerAvatarEventListener)mParent, flag, i, 0, 0);
        mResultsAdapter.mOnEndOfWindowReachedListener = this;
        mAddToCirclesHelper = new AddToCirclesHelper(super.mActivity);
        mAddToCirclesHelper.registerCircleModificationListener(mResultsAdapter);
        mAddToCirclesHelper.registerOneTouchCirclesListener(mResultsAdapter);
        builder = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        builder.addAdapter(bundle);
        builder.addAdapter(mResultsAdapter);
        setAdapter(builder.build());
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        mEmptyViewInitialState = layoutinflater.findViewById(0x7f0d01b2);
        setEmptyViewElements(0x7f02014c, 0x7f10025e, 0);
        mLoadingDataViewManager.setViewState(4);
        mEmptyViewInitialState.setVisibility(0);
        return layoutinflater;
    }

    public final void onEndOfWindowReached(int i)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            GamesLog.w("PlayerSearchResFrag", "onEndOfWindowReached: not connected; ignoring...");
        } else
        if (!mWaitingOnMorePendingResults || mMoreSearchIssuedTimeInMillis + 2500L < SystemClock.elapsedRealtime())
        {
            mWaitingOnMorePendingResults = true;
            mMoreSearchIssuedTimeInMillis = SystemClock.elapsedRealtime();
            Games.Players.searchForMorePlayersInternal(googleapiclient, mQuery, PageSizeUtils.getMixedTilePageSize(mParent)).setResultCallback(this);
            return;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mIsConnected = true;
        mResultsAdapter.mCurrentPlayerId = mParent.mConfiguration.getCurrentPlayerId();
        if (mPendingQuery != null)
        {
            GamesLog.d("PlayerSearchResFrag", (new StringBuilder("onGoogleApiClientConnected: running pending query '")).append(mPendingQuery).append("'...").toString());
            doSearch(mPendingQuery);
            mPendingQuery = null;
        }
        mAddToCirclesHelper.loadData(googleapiclient);
    }

    public final void onOneTouchCircleAddFailed(String s)
    {
    }

    public final void onOneTouchCircleAddSucceeded(String s, String s1)
    {
    }

    public final void onOneTouchCircleLoadFailed(String s)
    {
    }

    public final void onOneTouchCircleRemoveFailed(String s)
    {
    }

    public final void onOneTouchCircleRemoveSucceeded$16da05f7(String s)
    {
    }

    public final void onPlayerAvatarClicked(Player player, SharedElementTransition sharedelementtransition)
    {
    }

    public final void onPlayerFollowClicked(PlayerAvatarAdapter playeravataradapter, Player player)
    {
        playeravataradapter = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(playeravataradapter, mParent))
        {
            GamesLog.w("PlayerSearchResFrag", "onPlayerFollowClicked: not connected; ignoring...");
            return;
        } else
        {
            mAddToCirclesHelper.onPlayerFollowClicked(this, playeravataradapter, 3, player);
            return;
        }
    }

    public final void onPlayerOverflowMenuClicked(Player player)
    {
    }

    public final void onPlayerSubtitleClicked(Player player, SharedElementTransition sharedelementtransition)
    {
    }

    public final void onPlayerUnfollowClicked(PlayerAvatarAdapter playeravataradapter, Player player)
    {
        playeravataradapter = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(playeravataradapter, mParent))
        {
            GamesLog.w("PlayerSearchResFrag", "onPlayerUnfollowClicked: not connected; ignoring...");
            return;
        } else
        {
            mAddToCirclesHelper.onPlayerUnfollowClicked(playeravataradapter, player);
            return;
        }
    }

    public final volatile void onResult(Result result)
    {
        com.google.android.gms.games.Players.LoadPlayersResult loadplayersresult;
        int i;
        loadplayersresult = (com.google.android.gms.games.Players.LoadPlayersResult)result;
        i = loadplayersresult.getStatus().mStatusCode;
        result = loadplayersresult.getPlayers();
        mWaitingOnMorePendingResults = false;
        boolean flag = canUseResult(loadplayersresult);
        if (!flag)
        {
            result.release();
            return;
        }
        if (!mDiscardQueryResults)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        GamesLog.d("PlayerSearchResFrag", "onPlayersLoaded: discarding stray result");
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
