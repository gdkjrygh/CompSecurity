// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationGamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameSmallCardAdapter, ShopGamesActivity, ContinuePlayingAdapter

public abstract class GameListMyGamesFragment extends DestinationGamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, LoggablePage, ContinuePlayingAdapter.ContinuePlayingEventListener, GameSmallCardAdapter.GameSmallCardEventListener, com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.OnPageScrolledToListener
{
    public static final class GameListAllMyGamesRecyclerFragment extends GameListMyGamesFragment
    {

        protected final int getLatencyId()
        {
            return 6;
        }

        protected final int getLoggingListType()
        {
            return 5;
        }

        protected final int getPlaylogElementType()
        {
            return 21;
        }

        protected final void loadData(GoogleApiClient googleapiclient)
        {
            PlayGames.GamesMetadata.loadGames(googleapiclient, 5, PageSizeUtils.getSmallCardPageSize(mParent), false).setResultCallback(this);
        }

        public final void onEndOfWindowReached(int i)
        {
            GoogleApiClient googleapiclient = getGoogleApiClient();
            if (!googleapiclient.isConnected())
            {
                GamesLog.w("GameListMyGamesFragment", "onEndOfWindowReached: not connected; ignoring...");
                return;
            } else
            {
                PlayGames.GamesMetadata.loadMoreGames(googleapiclient, 5, PageSizeUtils.getSmallCardPageSize(mParent)).setResultCallback(this);
                return;
            }
        }

        public final volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result);
        }

        public GameListAllMyGamesRecyclerFragment()
        {
        }
    }

    public static final class GameListInstalledRecyclerFragment extends GameListMyGamesFragment
    {

        protected final DatabufferRecyclerAdapter createGameAdapter()
        {
            return new GameSmallCardAdapter(mParent, 3, 0, this);
        }

        protected final int getLatencyId()
        {
            return 7;
        }

        protected final int getLoggingListType()
        {
            return 8;
        }

        protected final int getPlaylogElementType()
        {
            return 20;
        }

        protected final void loadData(GoogleApiClient googleapiclient)
        {
            PlayGames.GamesMetadata.loadGames(googleapiclient, 6, PageSizeUtils.getSmallCardPageSize(mParent), false).setResultCallback(this);
        }

        public final void onEndOfWindowReached(int i)
        {
            GoogleApiClient googleapiclient = getGoogleApiClient();
            if (!googleapiclient.isConnected())
            {
                GamesLog.w("GameListMyGamesFragment", "onEndOfWindowReached: not connected; ignoring...");
                return;
            } else
            {
                PlayGames.GamesMetadata.loadMoreGames(googleapiclient, 6, PageSizeUtils.getSmallCardPageSize(mParent)).setResultCallback(this);
                return;
            }
        }

        public final volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result);
        }

        public GameListInstalledRecyclerFragment()
        {
        }
    }

    public static final class GameListMostRecentRecyclerFragment extends GameListMyGamesFragment
    {

        protected final DatabufferRecyclerAdapter createGameAdapter()
        {
            return new ContinuePlayingAdapter(mParent, this);
        }

        protected final UpsellCardAdapter createUpsellAdapter()
        {
            Resources resources = mParent.getResources();
            return UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new com.google.android.gms.games.ui.common.UpsellCardAdapter.Data(resources.getColor(0x7f0b0071), 0x7f1000fa), 9, null);
        }

        protected final int getLatencyId()
        {
            return 5;
        }

        protected final int getLoggingListType()
        {
            return 3;
        }

        protected final int getPlaylogElementType()
        {
            return 19;
        }

        protected final void loadData(GoogleApiClient googleapiclient)
        {
            if (((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
            {
                mUpsellCardAdapter.setVisible(false);
                PlayGames.GamesMetadata.loadRecentlyPlayedGames$91af0f4(googleapiclient, PageSizeUtils.getContinuePlayingTilePageSize(mParent)).setResultCallback(this);
                return;
            } else
            {
                mUpsellCardAdapter.setVisible(true);
                mLoadingDataViewManager.setViewState(2);
                return;
            }
        }

        public final void onEndOfWindowReached(int i)
        {
            GoogleApiClient googleapiclient = getGoogleApiClient();
            if (!googleapiclient.isConnected())
            {
                GamesLog.w("GameListMyGamesFragment", "onEndOfWindowReached: not connected; ignoring...");
                return;
            } else
            {
                PlayGames.GamesMetadata.loadMoreRecentlyPlayedGames(googleapiclient, PageSizeUtils.getContinuePlayingTilePageSize(mParent)).setResultCallback(this);
                return;
            }
        }

        public final volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result);
        }

        public GameListMostRecentRecyclerFragment()
        {
        }
    }


    protected DatabufferRecyclerAdapter mAdapter;
    protected LatencyLogger mLatencyLogger;
    protected UpsellCardAdapter mUpsellCardAdapter;

    public GameListMyGamesFragment()
    {
    }

    protected DatabufferRecyclerAdapter createGameAdapter()
    {
        return new GameSmallCardAdapter(mParent, 1, 0, this);
    }

    protected UpsellCardAdapter createUpsellAdapter()
    {
        return null;
    }

    protected abstract int getLatencyId();

    protected abstract int getLoggingListType();

    protected abstract void loadData(GoogleApiClient googleapiclient);

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        powerupplaylogger.logGameList(getLoggingListType());
        mLatencyLogger.logEvents(new int[] {
            3, 4
        });
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mAdapter = createGameAdapter();
        mAdapter.mOnEndOfWindowReachedListener = this;
        mUpsellCardAdapter = createUpsellAdapter();
        super.mTopPaddingResId = 0x7f0c0284;
        bundle = (new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder()).addAdapter(mAdapter);
        if (mUpsellCardAdapter != null)
        {
            bundle.addAdapter(mUpsellCardAdapter);
        }
        setAdapter(bundle.build());
        setEmptyViewElements(0x7f02015a, 0x7f1001fa, 0x7f1001f9);
        mLatencyLogger = LatencyLogger.createDestAppLatencyLogger(mParent, getLatencyId());
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

    public final void onContinuePlayingPlayButtonClicked(GameFirstParty gamefirstparty, View view)
    {
        com.google.android.gms.games.snapshot.SnapshotMetadata snapshotmetadata = gamefirstparty.getSnapshot();
        if (snapshotmetadata != null)
        {
            mParent.logClickEvent(1152, view);
            view = Games.getCurrentAccountName(getGoogleApiClient());
            UiUtils.launchGameForSnapshot(mParent, view, gamefirstparty.getGame(), snapshotmetadata);
            return;
        } else
        {
            mParent.logClickEvent(1148, view);
            UiUtils.launchGame(mParent, gamefirstparty.getGame(), null);
            return;
        }
    }

    public final void onContinuePlayingShareIconClicked(String s, String s1, View view)
    {
        mParent.logClickEvent(1141, view);
        mParent.shareGame(s, s1);
    }

    public final void onEmptyActionTextClicked()
    {
        Intent intent = new Intent(mParent, com/google/android/gms/games/ui/destination/games/ShopGamesActivity);
        intent.putExtra("com.google.android.gms.games.TAB", 0);
        startActivity(intent);
    }

    public final void onGameClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view)
    {
        mParent.logClickEvent(1100, view);
        PowerUpUtils.viewGameDetail(mParent, gamefirstparty, sharedelementtransition);
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mLatencyLogger.onConnected(googleapiclient);
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
        loadData(googleapiclient);
    }

    public final void onPageScrolledTo()
    {
    }

    public final void onPageSelected()
    {
    }

    public final void onPlayNowClicked(Game game, View view)
    {
        mParent.logClickEvent(1148, view);
        UiUtils.launchGame(mParent, game, null);
    }

    public volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result);
    }

    public final void onResult(com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult loadgamesresult)
    {
        GameFirstPartyBuffer gamefirstpartybuffer;
        boolean flag;
        boolean flag1;
        int i;
        i = loadgamesresult.getStatus().mStatusCode;
        gamefirstpartybuffer = loadgamesresult.getGames();
        flag1 = true;
        flag = flag1;
        if (canUseResult(loadgamesresult))
        {
            break MISSING_BLOCK_LABEL_55;
        }
        flag = flag1;
        mLatencyLogger.logEvents(new int[] {
            7
        });
        gamefirstpartybuffer.release();
        return;
        flag = flag1;
        if (!UiUtils.isNetworkError(i)) goto _L2; else goto _L1
_L1:
        flag = flag1;
        mLatencyLogger.logEvents(new int[] {
            7
        });
        flag = flag1;
        mAdapter.showFooterErrorState();
_L3:
        flag = flag1;
        mAdapter.setDataBuffer(gamefirstpartybuffer);
        flag = false;
        mLoadingDataViewManager.handleViewState(i, gamefirstpartybuffer.getCount(), false);
        return;
        loadgamesresult;
        if (flag)
        {
            gamefirstpartybuffer.release();
        }
        throw loadgamesresult;
_L2:
        flag = flag1;
        mLatencyLogger.logEvents(new int[] {
            8
        });
          goto _L3
    }

    public final void onRetry()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("GameListMyGamesFragment", "onRetry: not connected; ignoring...");
            return;
        }
        mLoadingDataViewManager.setViewState(1);
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
        loadData(googleapiclient);
    }

    public final void onShareGameClicked(String s, String s1, View view)
    {
        mParent.logClickEvent(1141, view);
        mParent.shareGame(s, s1);
    }

    public final void onStop()
    {
        mLatencyLogger.logEvents(new int[] {
            6
        });
        super.onStop();
    }

    public final void onViewInPlayStoreClicked(GameFirstParty gamefirstparty, View view)
    {
        mParent.logClickEvent(1155, view);
        UiUtils.viewInPlayStore(mParent, gamefirstparty.getGame().getInstancePackageName(), "GPG_overflowMenu");
    }
}
