// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GmsIntents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesRecyclerAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationGamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameSmallCardAdapter, GameVisitPlayStoreAdapter

public abstract class GameExploreFragment extends DestinationGamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, LoggablePage, GameSmallCardAdapter.GameSmallCardEventListener, com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.OnPageScrolledToListener
{
    public static final class GameFeaturedFragment extends GameExploreFragment
        implements GameVisitPlayStoreAdapter.VisitPlayStoreEventListener
    {

        protected final GamesRecyclerAdapter createAdapter()
        {
            com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
            builder.addAdapter(new GameVisitPlayStoreAdapter(mParent, this));
            builder.addAdapter(createAdapter());
            return builder.build();
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
            onResult((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result);
        }

        public final void onVisitPlayStoreClicked()
        {
            DestinationFragmentActivity destinationfragmentactivity = mParent;
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

        public GameFeaturedFragment()
        {
        }
    }

    public static final class GamePopularFragment extends GameExploreFragment
    {

        protected final int getLatencyId()
        {
            return 14;
        }

        public final int getLoggingListType()
        {
            return 6;
        }

        protected final int getPlaylogElementType()
        {
            return 17;
        }

        protected final void loadData(GoogleApiClient googleapiclient)
        {
            PlayGames.GamesMetadata.loadGames(googleapiclient, 2, PageSizeUtils.getSmallCardPageSize(mParent), false).setResultCallback(this);
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
                PlayGames.GamesMetadata.loadMoreGames(googleapiclient, 2, PageSizeUtils.getSmallCardPageSize(mParent)).setResultCallback(this);
                return;
            }
        }

        public final volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result);
        }

        public GamePopularFragment()
        {
        }
    }

    public static final class GamePopularMultiplayerFragment extends GameExploreFragment
    {

        protected final int getLatencyId()
        {
            return 15;
        }

        public final int getLoggingListType()
        {
            return 2;
        }

        protected final int getPlaylogElementType()
        {
            return 18;
        }

        protected final void loadData(GoogleApiClient googleapiclient)
        {
            PlayGames.GamesMetadata.loadGames(googleapiclient, 1, PageSizeUtils.getSmallCardPageSize(mParent), false).setResultCallback(this);
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
                PlayGames.GamesMetadata.loadMoreGames(googleapiclient, 1, PageSizeUtils.getSmallCardPageSize(mParent)).setResultCallback(this);
                return;
            }
        }

        public final volatile void onResult(Result result)
        {
            onResult((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result);
        }

        public GamePopularMultiplayerFragment()
        {
        }
    }


    protected GameSmallCardAdapter mAdapter;
    protected LatencyLogger mLatencyLogger;

    public GameExploreFragment()
    {
    }

    protected GamesRecyclerAdapter createAdapter()
    {
        mAdapter = new GameSmallCardAdapter(mParent, 2, 0, this);
        mAdapter.mOnEndOfWindowReachedListener = this;
        return mAdapter;
    }

    public abstract int getLatencyId();

    public abstract int getLoggingListType();

    public abstract void loadData(GoogleApiClient googleapiclient);

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
        setEmptyViewElements(0x7f020123, 0x7f1001fa, 0);
        super.mTopPaddingResId = 0x7f0c0284;
        setAdapter(createAdapter());
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
            GamesLog.w("GameExploreFragment", "onRetry: not connected; ignoring...");
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
