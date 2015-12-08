// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Intent;
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
import com.google.android.gms.games.ui.AddToCirclesHelper;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.card.OnyxGotItCardAdapter;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationGamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiUtils;

public final class PlayerYouMayKnowFragment extends DestinationGamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.AddToCirclesHelper.OneTouchCirclesListener, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.GotItEventListener, com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter.PlayerAvatarEventListener, LoggablePage
{

    private AddToCirclesHelper mAddToCirclesHelper;
    private OnyxGotItCardAdapter mGamersYouMayKnowWelcomeAdapter;
    protected LatencyLogger mLatencyLogger;
    private UpsellCardAdapter mUpsellCardAdapter;
    private PlayerAvatarAdapter mYouMayKnowPlayersAdapter;

    public PlayerYouMayKnowFragment()
    {
    }

    private void loadData(GoogleApiClient googleapiclient)
    {
        boolean flag1 = ((GamesFragmentActivity) (mParent)).mIsPlusEnabled;
        UpsellCardAdapter upsellcardadapter = mUpsellCardAdapter;
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        upsellcardadapter.setVisible(flag);
        if (flag1)
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
            Games.Players.loadPlayersFirstParty$4189436a(googleapiclient, "you_may_know", PageSizeUtils.getMixedTilePageSize(mParent)).setResultCallback(this);
        } else
        {
            mGamersYouMayKnowWelcomeAdapter.setVisible(false);
            mLoadingDataViewManager.setViewState(2);
            mLatencyLogger.logEvents(new int[] {
                8
            });
        }
        mAddToCirclesHelper.loadData(googleapiclient);
    }

    protected final int getPlaylogElementType()
    {
        return 33;
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
        Resources resources = mParent.getResources();
        mGamersYouMayKnowWelcomeAdapter = new OnyxGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0b0061, 0x7f0200e2, 0x7f100150, 0x7f1002ca), this, "gamersYouMayKnowWelcomeButton");
        boolean flag = SharedPrefsConfig.getBoolean(mParent, "showYouMayKnowWelcome", true);
        mGamersYouMayKnowWelcomeAdapter.setVisible(flag);
        mYouMayKnowPlayersAdapter = new PlayerAvatarAdapter(mParent, this, 0);
        mYouMayKnowPlayersAdapter.mOnEndOfWindowReachedListener = this;
        mUpsellCardAdapter = UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new com.google.android.gms.games.ui.common.UpsellCardAdapter.Data(resources.getColor(0x7f0b0089), 0x7f10021e), 14, null);
        super.mTopPaddingResId = 0x7f0c0284;
        setAdapter((new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder()).addAdapter(mGamersYouMayKnowWelcomeAdapter).addAdapter(mUpsellCardAdapter).addAdapter(mYouMayKnowPlayersAdapter).build());
        mAddToCirclesHelper = new AddToCirclesHelper(super.mActivity);
        mAddToCirclesHelper.registerCircleModificationListener(mYouMayKnowPlayersAdapter);
        mAddToCirclesHelper.registerOneTouchCirclesListener(this);
        mAddToCirclesHelper.registerOneTouchCirclesListener(mYouMayKnowPlayersAdapter);
        mAddToCirclesHelper.restoreSavedInstanceState(this, bundle);
        mLatencyLogger = LatencyLogger.createDestAppLatencyLogger(mParent, 12);
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

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
    }

    public final void onEmptyActionTextClicked()
    {
        PowerUpUtils.launchPlayerSearch(mParent);
    }

    public final void onEndOfWindowReached(int i)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            GamesLog.w("PlayerListYouMayKnow", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            Games.Players.loadMorePlayersFirstParty(googleapiclient, "you_may_know", PageSizeUtils.getMixedTilePageSize(mParent)).setResultCallback(this);
            return;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mLatencyLogger.onConnected(googleapiclient);
        loadData(googleapiclient);
    }

    public final void onGotItClicked(String s)
    {
        com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable playheaderlistwrappable = UiUtils.findPlayHeaderListWrappable(this);
        if (s.equals("gamersYouMayKnowWelcomeButton"))
        {
            mGamersYouMayKnowWelcomeAdapter.setVisible(false);
            SharedPrefsConfig.setBoolean(mParent, "showYouMayKnowWelcome", false);
            if (playheaderlistwrappable != null)
            {
                playheaderlistwrappable.showActionBar$1385ff();
            }
        }
    }

    public final void onLearnMoreClicked(String s)
    {
    }

    public final void onOneTouchCircleAddFailed(String s)
    {
        getLogger().logOneTouchCirclesAction(3, 3);
    }

    public final void onOneTouchCircleAddSucceeded(String s, String s1)
    {
        getLogger().logOneTouchCirclesAction(1, 3);
    }

    public final void onOneTouchCircleLoadFailed(String s)
    {
        getLogger().logOneTouchCirclesAction(5, 3);
    }

    public final void onOneTouchCircleRemoveFailed(String s)
    {
        getLogger().logOneTouchCirclesAction(4, 3);
    }

    public final void onOneTouchCircleRemoveSucceeded$16da05f7(String s)
    {
        getLogger().logOneTouchCirclesAction(2, 3);
    }

    public final void onPlayerAvatarClicked(Player player, SharedElementTransition sharedelementtransition)
    {
        String s = ((GamesFragmentActivity) (mParent)).mConfiguration.getCurrentPlayerId();
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
        playeravataradapter = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(playeravataradapter, mParent))
        {
            GamesLog.w("PlayerListYouMayKnow", "onPlayerFollowClicked: not connected; ignoring...");
            return;
        } else
        {
            mAddToCirclesHelper.onPlayerFollowClicked(this, playeravataradapter, 5, player);
            return;
        }
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
        playeravataradapter = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(playeravataradapter, mParent))
        {
            GamesLog.w("PlayerListYouMayKnow", "onPlayerUnfollowClicked: not connected; ignoring...");
            return;
        } else
        {
            mAddToCirclesHelper.onPlayerUnfollowClicked(playeravataradapter, player);
            return;
        }
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
        mYouMayKnowPlayersAdapter.showFooterErrorState();
_L3:
        mYouMayKnowPlayersAdapter.setDataBuffer(playerbuffer);
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
            GamesLog.w("PlayerListYouMayKnow", "onRetry: not connected; ignoring...");
            return;
        } else
        {
            mLoadingDataViewManager.setViewState(1);
            loadData(googleapiclient);
            return;
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        mAddToCirclesHelper.saveInstanceState(bundle);
    }

    public final void onStop()
    {
        mLatencyLogger.logEvents(new int[] {
            6
        });
        super.onStop();
    }
}
