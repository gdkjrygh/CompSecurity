// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationGamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiUtils;

public final class PlayerFriendsPlayingFragment extends DestinationGamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter.PlayerAvatarEventListener, LoggablePage
{

    private PlayerAvatarAdapter mAdapter;
    protected LatencyLogger mLatencyLogger;
    private UpsellCardAdapter mUpsellCardAdapter;

    public PlayerFriendsPlayingFragment()
    {
    }

    private void loadData(GoogleApiClient googleapiclient)
    {
        UpsellCardAdapter upsellcardadapter = mUpsellCardAdapter;
        boolean flag;
        if (!((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        upsellcardadapter.setVisible(flag);
        if (((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
        {
            if (super.mUserVisibleHint)
            {
                mLatencyLogger.ensureStarted(new int[] {
                    3, 4, 2
                });
            } else
            {
                mLatencyLogger.ensureStarted(new int[] {
                    2
                });
            }
            Games.Players.loadPlayersFirstParty$4189436a(googleapiclient, "circled", PageSizeUtils.getRecentPlayerTilePageSize(mParent)).setResultCallback(this);
            return;
        } else
        {
            mLoadingDataViewManager.setViewState(2);
            mLatencyLogger.logEvents(new int[] {
                8
            });
            return;
        }
    }

    protected final int getPlaylogElementType()
    {
        return 30;
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        mLatencyLogger.logEvents(new int[] {
            3, 4
        });
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        setEmptyViewElements(0x7f02014c, 0x7f100137, 0x7f100136);
        bundle = mParent.getResources();
        mAdapter = new PlayerAvatarAdapter(mParent, this, 0);
        mUpsellCardAdapter = UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new com.google.android.gms.games.ui.common.UpsellCardAdapter.Data(bundle.getColor(0x7f0b0088), 0x7f10021d), 13, null);
        super.mTopPaddingResId = 0x7f0c0284;
        setAdapter((new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder()).addAdapter(mUpsellCardAdapter).addAdapter(mAdapter).build());
        mAdapter.mOnEndOfWindowReachedListener = this;
        mLatencyLogger = LatencyLogger.createDestAppLatencyLogger(mParent, 11);
        if (super.mUserVisibleHint)
        {
            mLatencyLogger.ensureStarted(new int[] {
                3, 4
            });
            return;
        } else
        {
            mLatencyLogger.ensureStarted(new int[0]);
            return;
        }
    }

    public final void onEmptyActionTextClicked()
    {
        PowerUpUtils.launchPlayerSearch(mParent);
    }

    public final void onEndOfWindowReached(int i)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("PlayerFriendsPlay", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            Games.Players.loadMorePlayersFirstParty(googleapiclient, "circled", PageSizeUtils.getRecentPlayerTilePageSize(mParent)).setResultCallback(this);
            return;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mLatencyLogger.onConnected(googleapiclient);
        loadData(googleapiclient);
    }

    public final void onPlayerAvatarClicked(Player player, SharedElementTransition sharedelementtransition)
    {
        String s = ((GamesFragmentActivity) (mParent)).mConfiguration.getCurrentPlayerId();
        if (player == null || player.getPlayerId() == null)
        {
            return;
        }
        if (player.getPlayerId().equals(s))
        {
            UiUtils.viewMyProfile(mParent, player, sharedelementtransition);
            return;
        } else
        {
            UiUtils.viewProfileComparison(mParent, player, sharedelementtransition);
            return;
        }
    }

    public final void onPlayerFollowClicked(PlayerAvatarAdapter playeravataradapter, Player player)
    {
    }

    public final void onPlayerOverflowMenuClicked(Player player)
    {
    }

    public final void onPlayerSubtitleClicked(Player player, SharedElementTransition sharedelementtransition)
    {
        PowerUpUtils.viewMostRecentGameForPlayer(mParent, player, sharedelementtransition);
    }

    public final void onPlayerUnfollowClicked(PlayerAvatarAdapter playeravataradapter, Player player)
    {
    }

    public final volatile void onResult(Result result)
    {
        PlayerBuffer playerbuffer;
        boolean flag;
        int i;
        flag = true;
        result = (com.google.android.gms.games.Players.LoadPlayersResult)result;
        i = result.getStatus().mStatusCode;
        playerbuffer = result.getPlayers();
        if (canUseResult(result))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        mLatencyLogger.logEvents(new int[] {
            7
        });
        playerbuffer.release();
        return;
        if (!UiUtils.isNetworkError(i)) goto _L2; else goto _L1
_L1:
        mLatencyLogger.logEvents(new int[] {
            7
        });
        mAdapter.showFooterErrorState();
_L3:
        mAdapter.setDataBuffer(playerbuffer);
        mLoadingDataViewManager.handleViewState(i, playerbuffer.getCount(), false);
        return;
        result;
        flag = false;
_L4:
        if (flag)
        {
            playerbuffer.release();
        }
        throw result;
_L2:
        mLatencyLogger.logEvents(new int[] {
            8
        });
          goto _L3
        result;
          goto _L4
    }

    public final void onRetry()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("PlayerFriendsPlay", "onRetry: not connected; ignoring...");
            return;
        } else
        {
            mLoadingDataViewManager.setViewState(1);
            loadData(googleapiclient);
            return;
        }
    }

    public final void onStop()
    {
        mLatencyLogger.logEvents(new int[] {
            6
        });
        super.onStop();
    }
}
