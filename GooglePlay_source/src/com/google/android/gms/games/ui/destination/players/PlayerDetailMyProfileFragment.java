// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.Batch;
import com.google.android.gms.common.api.BatchResult;
import com.google.android.gms.common.api.BatchResultToken;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.experience.ExperienceEvent;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.LoadingStateAdapter;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter;
import com.google.android.gms.games.ui.destination.games.MyGamesListActivity;
import com.google.android.gms.games.ui.destination.main.ProfileVisibilityButterbarAdapter;
import com.google.android.gms.games.ui.dialog.ProfileVisibilityDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailBaseFragment, PlayerDetailProfileBannerAdapter, PlayerDetailXpPerGenreAdapter, XpEventAdapter, 
//            PlayerProfileErrorAdapter

public final class PlayerDetailMyProfileFragment extends PlayerDetailBaseFragment
    implements ResultCallback, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, com.google.android.gms.games.ui.destination.main.ProfileVisibilityButterbarAdapter.ProfileVisibilityButterbarEventListener, PlayerProfileErrorAdapter.ProfileErrorEventListener, XpEventAdapter.XpEventEventListener, com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer
{

    private PlayerProfileErrorAdapter mErrorStateAdapter;
    private UpsellCardAdapter mNoPlusUpsellAdapter;
    private ProfileVisibilityButterbarAdapter mProfileVisibilityButterbarAdapter;
    private boolean mPublicProfile;
    ContinuePlayingAdapter mRecentlyPlayedAdapter;
    HeaderItemRecyclerAdapter mRecentlyPlayedHeaderAdapter;
    private HeaderItemRecyclerAdapter mXpHistoryHeaderAdapter;
    private XpEventAdapter mXpHistoryTileAdapter;
    private PlayerDetailXpPerGenreAdapter mXpPerGenreTileAdapter;

    public PlayerDetailMyProfileFragment()
    {
        super(false);
    }

    protected final void createAdapters()
    {
        super.createAdapters();
        Object obj = getResources();
        mNoPlusUpsellAdapter = UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new com.google.android.gms.games.ui.common.UpsellCardAdapter.Data(((Resources) (obj)).getColor(0x7f0b0087), 0x7f10012b), 3, null);
        mNoPlusUpsellAdapter.setVisible(false);
        mProfileVisibilityButterbarAdapter = new ProfileVisibilityButterbarAdapter(mParent, this);
        mProfileVisibilityButterbarAdapter.setVisible(false);
        mXpPerGenreTileAdapter = new PlayerDetailXpPerGenreAdapter(mParent);
        mXpPerGenreTileAdapter.setVisible(false);
        mRecentlyPlayedHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mRecentlyPlayedHeaderAdapter.setTitle(0x7f100128);
        mRecentlyPlayedHeaderAdapter.setVisible(false);
        mRecentlyPlayedAdapter = new ContinuePlayingAdapter(mParent, this);
        mXpHistoryHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mXpHistoryHeaderAdapter.setTitle(((Resources) (obj)).getString(0x7f1000e0));
        mXpHistoryHeaderAdapter.setVisible(false);
        mXpHistoryTileAdapter = new XpEventAdapter(mParent, this);
        mXpHistoryTileAdapter.mOnEndOfWindowReachedListener = this;
        mXpHistoryTileAdapter.setAdapterVisible(false);
        mErrorStateAdapter = new PlayerProfileErrorAdapter(mParent, this);
        obj = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        if (!PlatformVersion.checkVersion(11))
        {
            ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mBannerAdapter);
        }
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mLoadingStateAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mNoPlusUpsellAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mProfileVisibilityButterbarAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mXpPerGenreTileAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mRecentlyPlayedHeaderAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mRecentlyPlayedAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mXpHistoryHeaderAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mXpHistoryTileAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mErrorStateAdapter);
        setAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).build());
    }

    protected final int getPlaylogElementType()
    {
        return 28;
    }

    public final boolean getProfileVisibility()
    {
        return mPublicProfile;
    }

    protected final void loadData(final GoogleApiClient myLoadPlayerResultToken)
    {
        mMainPlayer = Games.Players.getCurrentPlayer(myLoadPlayerResultToken);
        onMainPlayerChanged();
        if (!((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
        {
            mLoadingStateAdapter.setVisible(false);
            if (super.mDetached || super.mRemoving || mViewDestroyed)
            {
                return;
            } else
            {
                onMainPlayerChanged();
                mNoPlusUpsellAdapter.setVisible(true);
                Games.Players.loadXpForGameCategoriesFirstParty(myLoadPlayerResultToken, null).setResultCallback(new ResultCallback() {

                    final PlayerDetailMyProfileFragment this$0;

                    public final volatile void onResult(Result result)
                    {
                        result = (com.google.android.gms.games.Players.LoadXpForGameCategoriesResult)result;
                        mLatencyLogger.logEvents(new int[] {
                            8
                        });
                        List list = result.getGameCategories();
                        
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = PlayerDetailMyProfileFragment.this;
                super();
            }
                });
                mLatencyLogger.logEvents(new int[] {
                    2
                });
                return;
            }
        } else
        {
            final BatchResultToken myRecentlyPlayedResultToken = getResources();
            String s = mMainPlayer.getPlayerId();
            com.google.android.gms.common.api.Batch.Builder builder = new Builder(myLoadPlayerResultToken);
            final BatchResultToken profileVisibilityResultToken = builder.add(Games.Players.loadProfileSettingsInternal$4b6585cf(myLoadPlayerResultToken));
            final BatchResultToken myXpForGameCategoriesResultToken = builder.add(Games.Players.loadXpForGameCategoriesFirstParty(myLoadPlayerResultToken, s));
            final int numRecentToShow = myRecentlyPlayedResultToken.getInteger(0x7f0e0052);
            myRecentlyPlayedResultToken = builder.add(PlayGames.GamesMetadata.loadRecentlyPlayedGamesForPlayer$4189436a(myLoadPlayerResultToken, s, numRecentToShow + 1));
            final BatchResultToken myXpStreamResultToken = builder.add(Games.Players.loadXpStreamFirstParty(myLoadPlayerResultToken, s, PageSizeUtils.getXpEventTilePageSize(mParent)));
            myLoadPlayerResultToken = builder.add(Games.Players.loadPlayer$70b7f367(myLoadPlayerResultToken, s));
            builder.build().setResultCallback(new ResultCallback() {

                final PlayerDetailMyProfileFragment this$0;
                final BatchResultToken val$myLoadPlayerResultToken;
                final BatchResultToken val$myRecentlyPlayedResultToken;
                final BatchResultToken val$myXpForGameCategoriesResultToken;
                final BatchResultToken val$myXpStreamResultToken;
                final int val$numRecentToShow;
                final BatchResultToken val$profileVisibilityResultToken;

                public final volatile void onResult(Result result)
                {
                    GameFirstPartyBuffer gamefirstpartybuffer;
                    Object obj;
                    Object obj1 = (BatchResult)result;
                    mLoadingStateAdapter.setVisible(false);
                    if (UiUtils.isNetworkError(((BatchResult) (obj1)).mStatus.mStatusCode))
                    {
                        .setViewState(5);
                        mLatencyLogger.logEvents(new int[] {
                            7
                        });
                        return;
                    }
                    onPlayerResult((com.google.android.gms.games.Players.LoadPlayersResult)((BatchResult) (obj1)).take(myLoadPlayerResultToken));
                    com.google.android.gms.games.Players.LoadProfileSettingsResult loadprofilesettingsresult = (com.google.android.gms.games.Players.LoadProfileSettingsResult)((BatchResult) (obj1)).take(profileVisibilityResultToken);
                    obj = (com.google.android.gms.games.Players.LoadXpForGameCategoriesResult)((BatchResult) (obj1)).take(myXpForGameCategoriesResultToken);
                    result = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)((BatchResult) (obj1)).take(myRecentlyPlayedResultToken);
                    gamefirstpartybuffer = result.getGames();
                    mPublicProfile = loadprofilesettingsresult.isProfileVisible();
                    mProfileVisibilityButterbarAdapter.updateButterBarVisibility(mPublicProfile);
                    obj1 = (com.google.android.gms.games.Players.LoadXpStreamResult)((BatchResult) (obj1)).take(myXpStreamResultToken);
                    PlayerDetailMyProfileFragment.this.onResult(((com.google.android.gms.games.Players.LoadXpStreamResult) (obj1)));
                    mLatencyLogger.logEvents(new int[] {
                        8
                    });
                    boolean flag;
                    if (mDetached || mRemoving)
                    {
                        break MISSING_BLOCK_LABEL_234;
                    }
                    flag = mViewDestroyed;
                    if (!flag)
                    {
                        break MISSING_BLOCK_LABEL_241;
                    }
                    result.release();
                    return;
                    ObjectDataBuffer objectdatabuffer;
                    int j;
                    int k;
                    int l;
                    List list = result.getGameCategories();
                    obj = PlayerDetailMyProfileFragment.this;
                    j = numRecentToShow;
                    k = result.getStatus().mStatusCode;
                    l = gamefirstpartybuffer.getCount();
                    objectdatabuffer = new ObjectDataBuffer();
                    int i = 0;
_L2:
                    if (i >= l || i >= j)
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    objectdatabuffer.add(((GameFirstParty)gamefirstpartybuffer.get(i)).freeze());
                    i++;
                    if (true) goto _L2; else goto _L1
_L1:
                    if (k != 0 || l <= 0)
                    {
                        break MISSING_BLOCK_LABEL_397;
                    }
                    ((PlayerDetailMyProfileFragment) (obj)).mRecentlyPlayedHeaderAdapter.setVisible(true);
                    if (l <= j)
                    {
                        break MISSING_BLOCK_LABEL_370;
                    }
                    ((PlayerDetailMyProfileFragment) (obj)).mRecentlyPlayedHeaderAdapter.setButton(((com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener) (obj)), 0x7f1000b5, 0x7f1000b6, "moreRecentGames");
_L3:
                    ((PlayerDetailMyProfileFragment) (obj)).mRecentlyPlayedAdapter.setDataBuffer(objectdatabuffer);
                    .setViewState(2);
                    result.release();
                    return;
                    ((PlayerDetailMyProfileFragment) (obj)).mRecentlyPlayedAdapter.setAdapterVisible(false);
                      goto _L3
                    Exception exception;
                    exception;
                    result.release();
                    throw exception;
                }

            
            {
                this$0 = PlayerDetailMyProfileFragment.this;
                myLoadPlayerResultToken = batchresulttoken;
                profileVisibilityResultToken = batchresulttoken1;
                myXpForGameCategoriesResultToken = batchresulttoken2;
                myRecentlyPlayedResultToken = batchresulttoken3;
                myXpStreamResultToken = batchresulttoken4;
                numRecentToShow = i;
                super();
            }
            });
            mLatencyLogger.logEvents(new int[] {
                2
            });
            return;
        }
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        powerupplaylogger.logBasicAction(6, PowerUpUtils.getExperimentIdsForLogging());
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mLoadingDataViewManager.setViewState(2);
        mLoadingStateAdapter.setVisible(true);
    }

    public final void onChangeSettingsClicked()
    {
        DialogFragmentUtil.show(mParent, new ProfileVisibilityDialogFragment(), "com.google.android.gms.games.ui.dialog.privateLevelDialog");
    }

    public final void onEndOfWindowReached(int i)
    {
        Asserts.checkNotNull(mMainPlayer);
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("MyProfileFragment", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            Games.Players.loadMoreXpStreamFirstParty(googleapiclient, mMainPlayer.getPlayerId(), PageSizeUtils.getXpEventTilePageSize(mParent)).setResultCallback(this);
            return;
        }
    }

    public final void onErrorRetryEvent()
    {
        onRetry();
    }

    public final void onHeaderClicked(String s)
    {
        if (s != null && "moreRecentGames".equals(s))
        {
            s = new Intent(mParent, com/google/android/gms/games/ui/destination/games/MyGamesListActivity);
            s.putExtra("com.google.android.gms.games.ui.extras.tab", 0);
            startActivity(s);
            return;
        } else
        {
            GamesLog.w("MyProfileFragment", (new StringBuilder("onHeaderClicked: unexpected tag '")).append(s).toString());
            return;
        }
    }

    public final void onPlayerResult(com.google.android.gms.games.Players.LoadPlayersResult loadplayersresult)
    {
        int i = loadplayersresult.getStatus().mStatusCode;
        loadplayersresult = loadplayersresult.getPlayers();
        if (loadplayersresult.getCount() == 1)
        {
            mMainPlayer = (Player)loadplayersresult.get(0).freeze();
            onMainPlayerChanged();
        }
        loadplayersresult.release();
        return;
        Exception exception;
        exception;
        loadplayersresult.release();
        throw exception;
    }

    public final volatile void onResult(Result result)
    {
        onResult((com.google.android.gms.games.Players.LoadXpStreamResult)result);
    }

    public final void onResult(com.google.android.gms.games.Players.LoadXpStreamResult loadxpstreamresult)
    {
        ExperienceEventBuffer experienceeventbuffer;
        boolean flag;
        boolean flag1;
        int i;
        i = loadxpstreamresult.getStatus().mStatusCode;
        experienceeventbuffer = loadxpstreamresult.getExperienceEvents();
        flag1 = true;
        flag = flag1;
        mXpHistoryTileAdapter.setAdapterVisible(true);
        flag = flag1;
        boolean flag2 = canUseResult(loadxpstreamresult);
        if (!flag2)
        {
            experienceeventbuffer.release();
            return;
        }
        flag = flag1;
        if (!UiUtils.isNetworkError(i))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        flag = flag1;
        mXpHistoryTileAdapter.showFooterErrorState();
        flag = flag1;
        mXpHistoryTileAdapter.setDataBuffer(experienceeventbuffer);
        flag1 = false;
        flag = flag1;
        if (experienceeventbuffer.getCount() != 0)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        flag = flag1;
        mErrorStateAdapter.setVisible(true);
        flag = flag1;
        mXpHistoryHeaderAdapter.setVisible(false);
        return;
        loadxpstreamresult;
        if (flag)
        {
            experienceeventbuffer.release();
        }
        throw loadxpstreamresult;
        flag = flag1;
        mErrorStateAdapter.setVisible(false);
        flag = flag1;
        mXpHistoryHeaderAdapter.setVisible(false);
        return;
        flag = flag1;
        mErrorStateAdapter.setVisible(false);
        flag = flag1;
        mXpHistoryHeaderAdapter.setVisible(true);
        return;
    }

    public final void onRetry()
    {
        if (mMainPlayer != null)
        {
            GoogleApiClient googleapiclient = getGoogleApiClient();
            if (!googleapiclient.isConnected())
            {
                GamesLog.w("MyProfileFragment", "onRetryClick: not connected; ignoring...");
                return;
            } else
            {
                mErrorStateAdapter.setVisible(false);
                mLatencyLogger.onConnected(googleapiclient);
                mLatencyLogger.ensureStarted(new int[] {
                    3, 4, 2
                });
                loadData(googleapiclient);
                return;
            }
        } else
        {
            GamesLog.w("MyProfileFragment", "onRetryClick: can't load recently played games, player is null.");
            return;
        }
    }

    public final void onXpEventClicked(ExperienceEvent experienceevent)
    {
        experienceevent = experienceevent.getGame();
        if (experienceevent != null)
        {
            PowerUpUtils.viewGameDetail(mParent, experienceevent, 10);
        }
    }

    public final void updateProfileVisibility(boolean flag)
    {
        if (!isAttachedToParent())
        {
            return;
        } else
        {
            mProfileVisibilityButterbarAdapter.updateButterBarVisibility(flag);
            return;
        }
    }




/*
    static boolean access$102(PlayerDetailMyProfileFragment playerdetailmyprofilefragment, boolean flag)
    {
        playerdetailmyprofilefragment.mPublicProfile = flag;
        return flag;
    }

*/



/*
    static void access$300(PlayerDetailMyProfileFragment playerdetailmyprofilefragment, com.google.android.gms.games.Players.LoadXpForGameCategoriesResult loadxpforgamecategoriesresult)
    {
        List list = loadxpforgamecategoriesresult.getGameCategories();
        ArrayList arraylist = new ArrayList();
        int k = list.size();
        if (k > 0)
        {
            TreeSet treeset = new TreeSet();
            for (int i = 0; i < k; i++)
            {
                String s = (String)list.get(i);
                treeset.add(new PlayerDetailXpPerGenreAdapter.PlayerXpData(loadxpforgamecategoriesresult.getXpForCategory(s), s));
            }

            for (loadxpforgamecategoriesresult = treeset.iterator(); loadxpforgamecategoriesresult.hasNext(); arraylist.add((PlayerDetailXpPerGenreAdapter.PlayerXpData)loadxpforgamecategoriesresult.next())) { }
        } else
        {
            GamesLog.w("PlayerDetailUtil", "buildComparisonXpDataList: no categories!");
        }
        if (arraylist.size() > 0)
        {
            int j = playerdetailmyprofilefragment.getResources().getInteger(0x7f0e001c);
            loadxpforgamecategoriesresult = playerdetailmyprofilefragment.mXpPerGenreTileAdapter;
            Player player = playerdetailmyprofilefragment.mMainPlayer;
            com.google.android.gms.games.ui.widget.MetagameAvatarView metagameavatarview = playerdetailmyprofilefragment.mBannerAdapter.mAvatarView;
            boolean flag1 = playerdetailmyprofilefragment.mAnimateLevelProgress;
            boolean flag;
            if (j >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            Asserts.checkNotNull(player);
            loadxpforgamecategoriesresult.mPlayer = (Player)player.freeze();
            loadxpforgamecategoriesresult.mXpDataList = arraylist;
            loadxpforgamecategoriesresult.mRowLimit = j;
            loadxpforgamecategoriesresult.mBannerAvatarView = metagameavatarview;
            loadxpforgamecategoriesresult.mAnimateLevelProgress = flag1;
            loadxpforgamecategoriesresult.setVisible(true);
            playerdetailmyprofilefragment.mXpPerGenreTileAdapter.setVisible(true);
        }
        return;
    }

*/


}
