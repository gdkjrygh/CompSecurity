// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.common.SlimGotItCardAdapter;
import com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

public final class GameDetailFriendsFragment extends GamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.GotItEventListener, com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter.PlayerAvatarEventListener, LoggablePage
{

    private HeaderItemRecyclerAdapter mFriendsHeaderAdapter;
    private SlimGotItCardAdapter mNoPlusUpsellAdapter;
    private GameDetailActivity mParentActivity;
    private PlayerAvatarAdapter mPlayerAvatarAdapter;

    public GameDetailFriendsFragment()
    {
    }

    private void loadData(GoogleApiClient googleapiclient)
    {
        boolean flag1 = mParent.mIsPlusEnabled;
        mFriendsHeaderAdapter.setVisible(flag1);
        SlimGotItCardAdapter slimgotitcardadapter = mNoPlusUpsellAdapter;
        boolean flag;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        slimgotitcardadapter.setVisible(flag);
        if (!flag1)
        {
            mLoadingDataViewManager.setViewState(2);
            return;
        } else
        {
            String s = mParentActivity.mCurrentGame.getApplicationId();
            Games.Players.loadPlayersFirstParty(googleapiclient, "circled", s, 15, false).setResultCallback(this);
            return;
        }
    }

    protected final int getPlaylogElementType()
    {
        return 29;
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        powerupplaylogger.logGameAction(mParentActivity.mCurrentGame, 4, false);
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof GameDetailActivity);
        mParentActivity = (GameDetailActivity)mParent;
        setEmptyViewElements(0x7f02014c, 0x7f100166, 0);
        mFriendsHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mFriendsHeaderAdapter.setTitle(0x7f1000d8);
        mPlayerAvatarAdapter = new PlayerAvatarAdapter(mParent, this, 0);
        mPlayerAvatarAdapter.mOnEndOfWindowReachedListener = this;
        mNoPlusUpsellAdapter = new SlimGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0b0061, 0x7f020120, 0x7f1000dd, 0x7f1000bc), this);
        if (PlatformVersion.checkVersion(21) && bundle == null && super.mActivity.getIntent().getIntExtra("com.google.android.gms.games.ANIMATION", -1) != -1)
        {
            postponeInitialReveal();
        }
        bundle = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        bundle.addAdapter(mFriendsHeaderAdapter);
        bundle.addAdapter(mPlayerAvatarAdapter);
        bundle.addAdapter(mNoPlusUpsellAdapter);
        setAdapter(bundle.build());
    }

    public final void onEndOfWindowReached(int i)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("GameDetailFriendFrag", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            String s = mParentActivity.mCurrentGame.getApplicationId();
            Games.Players.loadMorePlayersFirstParty(googleapiclient, "circled", s, 15).setResultCallback(this);
            return;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        int i;
        if (mParentActivity.mStateManager.mFriendsBuffer != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            googleapiclient = mParentActivity.mStateManager;
            PlayerBuffer playerbuffer = ((GameDetailActivity.GameDetailStateManager) (googleapiclient)).mFriendsBuffer;
            googleapiclient.mFriendsBuffer = null;
            i = mParentActivity.mStateManager.mFriendsStatusCode;
            mPlayerAvatarAdapter.setDataBuffer(playerbuffer);
            mNoPlusUpsellAdapter.setVisible(false);
            mFriendsHeaderAdapter.setVisible(true);
            mLoadingDataViewManager.handleViewState(i, playerbuffer.getCount(), false);
            return;
        } else
        {
            loadData(googleapiclient);
            return;
        }
    }

    public final void onGotItClicked(String s)
    {
        mParent.launchPlusUpgradeFlow(6, null);
    }

    public final void onLearnMoreClicked(String s)
    {
    }

    public final void onPlayerAvatarClicked(Player player, SharedElementTransition sharedelementtransition)
    {
        String s = mParent.mConfiguration.getCurrentPlayerId();
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
        flag = false;
        result = (com.google.android.gms.games.Players.LoadPlayersResult)result;
        i = result.getStatus().mStatusCode;
        playerbuffer = result.getPlayers();
        boolean flag1 = canUseResult(result);
        if (!flag1)
        {
            playerbuffer.release();
            return;
        }
        mPlayerAvatarAdapter.setDataBuffer(playerbuffer);
        mLoadingDataViewManager.handleViewState(i, playerbuffer.getCount(), false);
        return;
        result;
_L2:
        if (flag)
        {
            playerbuffer.release();
        }
        throw result;
        result;
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void onRetry()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            loadData(googleapiclient);
            mLoadingDataViewManager.setViewState(1);
            return;
        } else
        {
            GamesLog.w("GameDetailFriendFrag", "onRetry(): client not connected yet...");
            return;
        }
    }
}
