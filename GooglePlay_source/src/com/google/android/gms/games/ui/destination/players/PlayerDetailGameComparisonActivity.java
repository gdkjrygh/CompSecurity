// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationGamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.destination.DestinationMultiContainerFragment;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter;
import com.google.android.gms.games.ui.destination.games.GameExploreFragment;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.TabSpec;
import com.google.android.gms.games.ui.util.UiUtils;

public final class PlayerDetailGameComparisonActivity extends DestinationFragmentActivity
{
    public static final class GameCommonFragment extends DestinationGamesHeaderRecyclerViewFragment
        implements ResultCallback, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, LoggablePage, com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter.ContinuePlayerCompareEventListener, com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter.ContinuePlayingEventListener
    {

        private ContinuePlayingAdapter mContinueAdapter;
        private LatencyLogger mLatencyLogger;

        private void loadData(GoogleApiClient googleapiclient)
        {
            Asserts.checkState(mParent instanceof PlayerDetailGameComparisonActivity);
            String s = ((PlayerDetailGameComparisonActivity)mParent).getPlayerId();
            PlayGames.GamesMetadata.loadCommonGames$4189436a(googleapiclient, s, PageSizeUtils.getContinuePlayingTilePageSize(mParent)).setResultCallback(this);
            mLatencyLogger.onConnected(googleapiclient);
            if (super.mUserVisibleHint)
            {
                mLatencyLogger.ensureStarted(new int[] {
                    3, 4, 2
                });
                return;
            } else
            {
                mLatencyLogger.ensureStarted(new int[] {
                    2
                });
                return;
            }
        }

        protected final int getPlaylogElementType()
        {
            return 26;
        }

        public final void logPageView(PowerUpPlayLogger powerupplaylogger)
        {
            powerupplaylogger.logGameList(9);
            mLatencyLogger.logEvents(new int[] {
                3, 4
            });
        }

        public final void onActivityCreated(Bundle bundle)
        {
            super.onActivityCreated(bundle);
            mContinueAdapter = new ContinuePlayingAdapter(mParent, this, this);
            mContinueAdapter.mOnEndOfWindowReachedListener = this;
            setEmptyViewElements(0x7f020123, 0x7f1001fa, 0x7f1001f9);
            setAdapter(mContinueAdapter);
            mLatencyLogger = LatencyLogger.createDestAppLatencyLogger(mParent, 19);
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

        public final void onContinuePlayingClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view)
        {
            mParent.logClickEvent(1100, view);
            PowerUpUtils.viewGameDetail(mParent, gamefirstparty, sharedelementtransition);
        }

        public final void onContinuePlayingCompareAchievementClicked(GameFirstParty gamefirstparty)
        {
            Asserts.checkNotNull(gamefirstparty);
            Asserts.checkState(mParent instanceof PlayerDetailGameComparisonActivity);
            PlayerDetailGameComparisonActivity playerdetailgamecomparisonactivity = (PlayerDetailGameComparisonActivity)mParent;
            Player player = playerdetailgamecomparisonactivity.mOtherPlayer;
            Asserts.checkNotNull(player);
            PowerUpUtils.viewAchievementComparison(playerdetailgamecomparisonactivity, gamefirstparty, player);
        }

        public final void onContinuePlayingPlayButtonClicked(GameFirstParty gamefirstparty, View view)
        {
            getLogger().logLaunchFromHome(gamefirstparty.getGame());
            com.google.android.gms.games.snapshot.SnapshotMetadata snapshotmetadata = gamefirstparty.getSnapshot();
            if (snapshotmetadata != null)
            {
                mParent.logClickEvent(1152, view);
                view = (PlayerDetailGameComparisonActivity)mParent;
                UiUtils.launchGameForSnapshot(mParent, 
// JavaClassFileOutputException: get_constant: invalid tag

        public final void onContinuePlayingShareIconClicked(String s, String s1, View view)
        {
            mParent.logClickEvent(1141, view);
            mParent.shareGame(s, s1);
        }

        public final void onEndOfWindowReached(int i)
        {
            GoogleApiClient googleapiclient = getGoogleApiClient();
            if (!googleapiclient.isConnected())
            {
                GamesLog.w("PDGameComparisonA", "onEndOfWindowReached: not connected; ignoring...");
                return;
            } else
            {
                Asserts.checkState(mParent instanceof PlayerDetailGameComparisonActivity);
                String s = ((PlayerDetailGameComparisonActivity)mParent).getPlayerId();
                PlayGames.GamesMetadata.loadMoreCommonGames(googleapiclient, s, PageSizeUtils.getContinuePlayingTilePageSize(mParent)).setResultCallback(this);
                return;
            }
        }

        public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
        {
            loadData(googleapiclient);
        }

        public final volatile void onResult(Result result)
        {
            GameFirstPartyBuffer gamefirstpartybuffer;
            boolean flag;
            int i;
            flag = true;
            result = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result;
            i = result.getStatus().mStatusCode;
            gamefirstpartybuffer = result.getGames();
            if (canUseResult(result))
            {
                break MISSING_BLOCK_LABEL_53;
            }
            mLatencyLogger.logEvents(new int[] {
                7
            });
            gamefirstpartybuffer.release();
            return;
            if (!UiUtils.isNetworkError(i)) goto _L2; else goto _L1
_L1:
            mLatencyLogger.logEvents(new int[] {
                7
            });
            mContinueAdapter.showFooterErrorState();
_L3:
            mContinueAdapter.setDataBuffer(gamefirstpartybuffer);
            mLoadingDataViewManager.handleViewState(i, gamefirstpartybuffer.getCount(), false);
            return;
            result;
            flag = false;
_L4:
            if (flag)
            {
                gamefirstpartybuffer.release();
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
                GamesLog.w("PDGameComparisonA", "onRetry: not connected; ignoring...");
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

        public GameCommonFragment()
        {
        }
    }

    public static final class GameTheirGameFragment extends GameExploreFragment
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
            String s = ((PlayerDetailGameComparisonActivity)mParent).getPlayerId();
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
                String s = ((PlayerDetailGameComparisonActivity)mParent).getPlayerId();
                PlayGames.GamesMetadata.loadMoreRecentlyPlayedGamesForPlayer(googleapiclient, s, PageSizeUtils.getMixedTilePageSize(mParent)).setResultCallback(this);
                return;
            }
        }

        public GameTheirGameFragment()
        {
        }
    }

    public static final class PlayerDetailGameComparisonFragment extends DestinationMultiContainerFragment
    {

        private static final TabConfig TAB_CONFIG;
        private static final TabSpec TAB_SPECS[];

        protected final int getPlaylogElementType()
        {
            return 24;
        }

        public final boolean hasPlayHeader()
        {
            return true;
        }

        public final void onActivityCreated(Bundle bundle)
        {
            super.onActivityCreated(bundle);
            if (bundle == null)
            {
                int i = mParent.getIntent().getIntExtra("com.google.android.gms.games.TAB", 0);
                super.mViewPager.setCurrentItem(i);
            }
        }

        static 
        {
            Bundle bundle = new Bundle();
            bundle.putInt("FRAGMENT_TAGS", 616);
            Bundle bundle1 = new Bundle();
            bundle1.putInt("FRAGMENT_TAGS", 617);
            TAB_SPECS = (new TabSpec[] {
                new TabSpec(com/google/android/gms/games/ui/destination/players/PlayerDetailGameComparisonActivity$GameCommonFragment, 0x7f1000d2, bundle), new TabSpec(com/google/android/gms/games/ui/destination/players/PlayerDetailGameComparisonActivity$GameTheirGameFragment, 0x7f1000d4, bundle1)
            });
            TAB_CONFIG = new TabConfig(TAB_SPECS);
        }

        public PlayerDetailGameComparisonFragment()
        {
            super(TAB_CONFIG, 0x7f0400d7);
        }
    }


    private Player mOtherPlayer;

    public PlayerDetailGameComparisonActivity()
    {
        super(0x7f040069, 0);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mOtherPlayer = (Player)getIntent().getParcelableExtra("com.google.android.gms.games.PLAYER");
        Asserts.checkNotNull(mOtherPlayer, "otherPlayer cannot be null in game comparison screen.");
        setTitle(mOtherPlayer.getDisplayName());
    }



}
