// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.common.api.Batch;
import com.google.android.gms.common.api.BatchResult;
import com.google.android.gms.common.api.BatchResultToken;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.audience.dialogs.CircleSelection;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.GmsIntents;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
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
import com.google.android.gms.games.internal.player.MostRecentGameInfo;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.LoadingStateAdapter;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter;
import com.google.android.gms.games.ui.destination.games.GameSmallCardAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.People;
import com.google.android.gms.people.internal.PeopleUtils;
import com.google.android.gms.people.model.Circle;
import com.google.android.gms.people.model.CircleBuffer;
import com.google.android.gms.people.model.Person;
import com.google.android.gms.people.model.PersonBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            PlayerDetailBaseFragment, PlayerDetailXpComparisonAdapter, PlayerDetailProfileBannerAdapter, LastPlayedGameAdapter, 
//            PlayerDetailGameComparisonActivity

public final class PlayerDetailProfileComparisonFragment extends PlayerDetailBaseFragment
    implements com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter.ContinuePlayerCompareEventListener, com.google.android.gms.games.ui.destination.games.GameSmallCardAdapter.GameSmallCardEventListener, LastPlayedGameAdapter.LastPlayedGameEventListener, com.google.android.gms.games.ui.util.GamesMenuItemClickListener.OnMenuItemClickListener
{

    private String mBelongingCircleIds[];
    private ArrayList mBelongingCircles;
    private ContinuePlayingAdapter mGamesInCommonAdapter;
    private HeaderItemRecyclerAdapter mGamesInCommonHeaderAdapter;
    private LastPlayedGameAdapter mLastPlayedGameAdapter;
    private String mMainPlayerId;
    private GameSmallCardAdapter mOtherPlayerGamesAdapter;
    private HeaderItemRecyclerAdapter mOtherPlayerGamesHeaderAdapter;
    private ArrayList mPlayerCircles;
    private PlayerDetailXpComparisonAdapter mXpComparisonTileAdapter;

    public PlayerDetailProfileComparisonFragment()
    {
        super(true);
    }

    private void computeBelongingCircles()
    {
        if (mBelongingCircles == null)
        {
            mBelongingCircles = new ArrayList();
        } else
        {
            mBelongingCircles.clear();
        }
        if (mBelongingCircleIds != null && mPlayerCircles != null)
        {
            int i = 0;
            for (int k = mBelongingCircleIds.length; i < k; i++)
            {
                String s = mBelongingCircleIds[i];
                int j = 0;
                for (int l = mPlayerCircles.size(); j < l; j++)
                {
                    AudienceMember audiencemember = (AudienceMember)mPlayerCircles.get(j);
                    if (s.equals(audiencemember.mCircleId))
                    {
                        mBelongingCircles.add(audiencemember);
                    }
                }

            }

        }
        if (mBannerAdapter != null)
        {
            PlayerDetailProfileBannerAdapter playerdetailprofilebanneradapter = mBannerAdapter;
            playerdetailprofilebanneradapter.mBelongingCircles = mBelongingCircles;
            playerdetailprofilebanneradapter.notifySingleItemChanged();
        }
    }

    protected final void createAdapters()
    {
        super.createAdapters();
        Object obj = getResources();
        mXpComparisonTileAdapter = new PlayerDetailXpComparisonAdapter(mParent);
        mXpComparisonTileAdapter.setVisible(false);
        mLastPlayedGameAdapter = new LastPlayedGameAdapter(mParent, this);
        mGamesInCommonHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mGamesInCommonHeaderAdapter.setTitle(((Resources) (obj)).getString(0x7f1000d2));
        mGamesInCommonHeaderAdapter.setVisible(false);
        mGamesInCommonAdapter = new ContinuePlayingAdapter(mParent, this, this, (byte)0);
        mOtherPlayerGamesHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mOtherPlayerGamesHeaderAdapter.setTitle(((Resources) (obj)).getString(0x7f1000d4));
        mOtherPlayerGamesHeaderAdapter.setVisible(false);
        mOtherPlayerGamesAdapter = new GameSmallCardAdapter(mParent, 2, 0x7f0e001b, this);
        obj = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        if (!PlatformVersion.checkVersion(11))
        {
            ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mBannerAdapter);
        }
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mLoadingStateAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mXpComparisonTileAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mLastPlayedGameAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mGamesInCommonHeaderAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mGamesInCommonAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mOtherPlayerGamesHeaderAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mOtherPlayerGamesAdapter);
        setAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).build());
    }

    protected final int getPlaylogElementType()
    {
        return 31;
    }

    protected final void loadData(final GoogleApiClient circleResultToken)
    {
        if (!isAttachedToParent())
        {
            return;
        }
        final BatchResultToken gamesInCommon = mMePlayer.getPlayerId();
        final boolean isUserPlusEnabled = ((GamesFragmentActivity) (mParent)).mIsPlusEnabled;
        final BatchResultToken otherPlayerResultToken = mBannerAdapter;
        if (((PlayerDetailProfileBannerAdapter) (otherPlayerResultToken)).mIsUserPlusEnabled != isUserPlusEnabled)
        {
            otherPlayerResultToken.mIsUserPlusEnabled = isUserPlusEnabled;
            otherPlayerResultToken.notifySingleItemChanged();
        }
        if (!isUserPlusEnabled)
        {
            mParent.logPlusUpgradeViewEvent(15, null);
        }
        com.google.android.gms.common.api.Batch.Builder builder = new com.google.android.gms.common.api.Batch.Builder(circleResultToken);
        final BatchResultToken myXpForGameCategoriesResultToken;
        final BatchResultToken theirXpForGameCategoriesResultToken;
        final BatchResultToken otherPlayerGames;
        final BatchResultToken peopleResultToken;
        Object obj;
        final int numCommonToShow;
        final int numOtherPlayerToShow;
        if (mMainPlayer == null || mMainPlayer.getLevelInfo() == null || mMainPlayer.getMostRecentGameInfo() == null)
        {
            otherPlayerResultToken = builder.add(Games.Players.loadPlayer(circleResultToken, mMainPlayerId));
        } else
        {
            otherPlayerResultToken = null;
        }
        myXpForGameCategoriesResultToken = builder.add(Games.Players.loadXpForGameCategoriesFirstParty(circleResultToken, gamesInCommon));
        theirXpForGameCategoriesResultToken = builder.add(Games.Players.loadXpForGameCategoriesFirstParty(circleResultToken, mMainPlayerId));
        gamesInCommon = mParent.getResources();
        numCommonToShow = gamesInCommon.getInteger(0x7f0e003c);
        numCommonToShow = (int)((float)(gamesInCommon.getInteger(0x7f0e001a) * numCommonToShow) * 1.2F);
        if (isUserPlusEnabled)
        {
            gamesInCommon = builder.add(PlayGames.GamesMetadata.loadCommonGames$4189436a(circleResultToken, mMainPlayerId, numCommonToShow + 2));
        } else
        {
            gamesInCommon = null;
        }
        otherPlayerGames = mParent.getResources();
        numOtherPlayerToShow = otherPlayerGames.getInteger(0x7f0e0037);
        numOtherPlayerToShow = (int)((float)(otherPlayerGames.getInteger(0x7f0e001b) * numOtherPlayerToShow) * 1.2F);
        otherPlayerGames = builder.add(PlayGames.GamesMetadata.loadRecentlyPlayedGamesForPlayer$4189436a(circleResultToken, mMainPlayerId, numOtherPlayerToShow + 2));
        peopleResultToken = new com.google.android.gms.people.Graph.LoadPeopleOptions();
        obj = new ArrayList();
        ((ArrayList) (obj)).add(PeopleUtils.gaiaIdToPeopleQualifiedId(mMainPlayerId));
        peopleResultToken.mQualifiedIds = ((java.util.Collection) (obj));
        peopleResultToken = builder.add(People.GraphApi.loadPeople$7acb640d(circleResultToken, mCurrentAccountName, peopleResultToken));
        obj = new com.google.android.gms.people.Graph.LoadCirclesOptions();
        obj.mFilterCircleType = -1;
        circleResultToken = builder.add(People.GraphApi.loadCircles$3c0ce7d1(circleResultToken, mCurrentAccountName, ((com.google.android.gms.people.Graph.LoadCirclesOptions) (obj))));
        builder.build().setResultCallback(new ResultCallback() {

            final PlayerDetailProfileComparisonFragment this$0;
            final BatchResultToken val$circleResultToken;
            final BatchResultToken val$gamesInCommon;
            final boolean val$isUserPlusEnabled;
            final BatchResultToken val$myXpForGameCategoriesResultToken;
            final int val$numCommonToShow;
            final int val$numOtherPlayerToShow;
            final BatchResultToken val$otherPlayerGames;
            final BatchResultToken val$otherPlayerResultToken;
            final BatchResultToken val$peopleResultToken;
            final BatchResultToken val$theirXpForGameCategoriesResultToken;

            public final volatile void onResult(Result result)
            {
                Object obj3;
                int i;
                int j;
                j = 0;
                obj3 = (BatchResult)result;
                i = ((BatchResult) (obj3)).mStatus.mStatusCode;
                if (!UiUtils.isNetworkError(i)) goto _L2; else goto _L1
_L1:
                PlayerDetailProfileComparisonFragment.this.circleResultToken.setViewState(5);
                mLatencyLogger.logEvents(new int[] {
                    7
                });
_L4:
                return;
_L2:
                GameFirstPartyBuffer gamefirstpartybuffer;
                Object obj1;
                Exception exception;
                GameFirstPartyBuffer gamefirstpartybuffer1;
                Object obj2;
                com.google.android.gms.games.Players.LoadXpForGameCategoriesResult loadxpforgamecategoriesresult;
                com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult loadgamesresult;
                Object obj4;
                com.google.android.gms.people.Graph.LoadCirclesResult loadcirclesresult;
                boolean flag;
                if (otherPlayerResultToken != null)
                {
                    result = ((com.google.android.gms.games.Players.LoadPlayersResult)((BatchResult) (obj3)).take(otherPlayerResultToken)).getPlayers();
                } else
                {
                    result = null;
                }
                obj2 = (com.google.android.gms.games.Players.LoadXpForGameCategoriesResult)((BatchResult) (obj3)).take(myXpForGameCategoriesResultToken);
                loadxpforgamecategoriesresult = (com.google.android.gms.games.Players.LoadXpForGameCategoriesResult)((BatchResult) (obj3)).take(theirXpForGameCategoriesResultToken);
                if (isUserPlusEnabled)
                {
                    obj1 = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)((BatchResult) (obj3)).take(gamesInCommon);
                } else
                {
                    obj1 = null;
                }
                loadgamesresult = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)((BatchResult) (obj3)).take(otherPlayerGames);
                if (isUserPlusEnabled)
                {
                    gamefirstpartybuffer = ((com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult) (obj1)).getGames();
                } else
                {
                    gamefirstpartybuffer = null;
                }
                gamefirstpartybuffer1 = loadgamesresult.getGames();
                obj4 = (com.google.android.gms.people.Graph.LoadPeopleResult)((BatchResult) (obj3)).take(peopleResultToken);
                loadcirclesresult = (com.google.android.gms.people.Graph.LoadCirclesResult)((BatchResult) (obj3)).take(circleResultToken);
                obj3 = ((com.google.android.gms.people.Graph.LoadPeopleResult) (obj4)).getPeople();
                obj4 = loadcirclesresult.getCircles();
                if (mDetached || mRemoving)
                {
                    break MISSING_BLOCK_LABEL_247;
                }
                flag = mViewDestroyed;
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_299;
                }
                if (result != null)
                {
                    result.release();
                }
                if (gamefirstpartybuffer != null)
                {
                    gamefirstpartybuffer.release();
                }
                gamefirstpartybuffer1.release();
                if (obj3 != null)
                {
                    ((PersonBuffer) (obj3)).release();
                }
                if (obj4 == null) goto _L4; else goto _L3
_L3:
                ((CircleBuffer) (obj4)).release();
                return;
                if (otherPlayerResultToken == null) goto _L6; else goto _L5
_L5:
                if (result.getCount() <= 0) goto _L8; else goto _L7
_L7:
                mMainPlayer = (Player)result.get(0).freeze();
_L6:
                Asserts.checkNotNull(mMainPlayer);
                onMainPlayerChanged();
                List list = result.getGameCategories();
                obj2 = mMainPlayer.getMostRecentGameInfo();
                if (obj2 == null)
                {
                    break MISSING_BLOCK_LABEL_406;
                }
                mLastPlayedGameAdapter.setDataBuffer(new ObjectDataBuffer(new MostRecentGameInfo[] {
                    obj2
                }));
                if (isUserPlusEnabled)
                {
                    int l = 0;
                }
                int j = ((getMostRecentGameInfo) (result.getStatus())).getMostRecentGameInfo;
                if (obj3 == null)
                {
                    break MISSING_BLOCK_LABEL_479;
                }
                if (((PersonBuffer) (obj3)).getCount() > 0)
                {
                    obj1 = ((PersonBuffer) (obj3)).get(0);
                    mBelongingCircleIds = ((Person) (obj1)).getBelongingCircleIds();
                }
                mPlayerCircles = new ArrayList();
                if (obj4 != null)
                {
                    break MISSING_BLOCK_LABEL_613;
                }
                i = 0;
_L9:
                if (j >= i)
                {
                    break MISSING_BLOCK_LABEL_623;
                }
                obj1 = ((CircleBuffer) (obj4)).get(j);
                obj1 = AudienceMember.forCircle(((Circle) (obj1)).getCircleId(), ((Circle) (obj1)).getCircleName());
                mPlayerCircles.add(obj1);
                j++;
                  goto _L9
_L8:
                PlayerDetailProfileComparisonFragment.this.circleResultToken.handleViewState(i, result.getCount(), false);
                if (result != null)
                {
                    result.release();
                }
                if (gamefirstpartybuffer != null)
                {
                    gamefirstpartybuffer.release();
                }
                gamefirstpartybuffer1.release();
                if (obj3 != null)
                {
                    ((PersonBuffer) (obj3)).release();
                }
                if (obj4 == null) goto _L4; else goto _L10
_L10:
                ((CircleBuffer) (obj4)).release();
                return;
                i = ((CircleBuffer) (obj4)).getCount();
                  goto _L9
                computeBelongingCircles();
                PlayerDetailProfileComparisonFragment.this.circleResultToken.setViewState(2);
                mLoadingStateAdapter.setVisible(false);
                mLatencyLogger.logEvents(new int[] {
                    8
                });
                if (result != null)
                {
                    result.release();
                }
                if (gamefirstpartybuffer != null)
                {
                    gamefirstpartybuffer.release();
                }
                gamefirstpartybuffer1.release();
                if (obj3 != null)
                {
                    ((PersonBuffer) (obj3)).release();
                }
                if (obj4 == null) goto _L4; else goto _L11
_L11:
                ((CircleBuffer) (obj4)).release();
                return;
                exception;
                if (result != null)
                {
                    result.release();
                }
                if (gamefirstpartybuffer != null)
                {
                    gamefirstpartybuffer.release();
                }
                gamefirstpartybuffer1.release();
                if (obj3 != null)
                {
                    ((PersonBuffer) (obj3)).release();
                }
                if (obj4 != null)
                {
                    ((CircleBuffer) (obj4)).release();
                }
                throw exception;
            }

            
            {
                this$0 = PlayerDetailProfileComparisonFragment.this;
                otherPlayerResultToken = batchresulttoken;
                myXpForGameCategoriesResultToken = batchresulttoken1;
                theirXpForGameCategoriesResultToken = batchresulttoken2;
                isUserPlusEnabled = flag;
                gamesInCommon = batchresulttoken3;
                otherPlayerGames = batchresulttoken4;
                peopleResultToken = batchresulttoken5;
                circleResultToken = batchresulttoken6;
                numCommonToShow = i;
                numOtherPlayerToShow = j;
                super();
            }
        });
        mLatencyLogger.logEvents(new int[] {
            2
        });
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        powerupplaylogger.logBasicAction(9, PowerUpUtils.getExperimentIdsForLogging());
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (mMainPlayer == null)
        {
            mMainPlayerId = mParent.getIntent().getStringExtra("com.google.android.gms.games.PLAYER_ID");
            if (mMainPlayerId == null)
            {
                GamesLog.w("ProfileCompareFrag", "We don't have another player to compare to, something went wrong. Finishing the activity");
                mParent.finish();
                return;
            } else
            {
                mParent.setTitle("");
                return;
            }
        } else
        {
            mMainPlayerId = mMainPlayer.getPlayerId();
            mLoadingDataViewManager.setViewState(2);
            mLoadingStateAdapter.setVisible(true);
            return;
        }
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 3 && j == -1)
        {
            intent = CircleSelection.getResults(intent);
            ArrayList arraylist;
            boolean flag;
            if (!intent.getAddedCirclesDelta().isEmpty() || !intent.getRemovedCirclesDelta().isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            GamesPlayLogger.logAddToCirclesAction(mParent, "", mCurrentAccountName, 4, flag);
            intent = intent.getSelectedCircles();
            j = intent.size();
            arraylist = new ArrayList(intent.size());
            for (i = 0; i < j; i++)
            {
                arraylist.add(((AudienceMember)intent.get(i)).mCircleId);
            }

            mBelongingCircleIds = (String[])arraylist.toArray(new String[j]);
            computeBelongingCircles();
        }
    }

    public final void onContinuePlayingCompareAchievementClicked(GameFirstParty gamefirstparty)
    {
        Asserts.checkNotNull(gamefirstparty);
        Asserts.checkNotNull(mMainPlayer);
        PowerUpUtils.viewAchievementComparison(mParent, gamefirstparty, mMainPlayer);
    }

    public final void onGameClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view)
    {
        mParent.logClickEvent(1100, view);
        PowerUpUtils.viewGameDetail(mParent, gamefirstparty, sharedelementtransition);
    }

    public final void onHeaderClicked(String s)
    {
        if (s != null)
        {
            if ("moreGamesInCommon".equals(s))
            {
                s = new Intent(mParent, com/google/android/gms/games/ui/destination/players/PlayerDetailGameComparisonActivity);
                s.putExtra("com.google.android.gms.games.TAB", 0);
                s.putExtra("com.google.android.gms.games.PLAYER", (Parcelable)mMainPlayer.freeze());
                startActivity(s);
            } else
            if ("moreOtherPlayerGames".equals(s))
            {
                s = new Intent(mParent, com/google/android/gms/games/ui/destination/players/PlayerDetailGameComparisonActivity);
                s.putExtra("com.google.android.gms.games.TAB", 1);
                s.putExtra("com.google.android.gms.games.PLAYER", (Parcelable)mMainPlayer.freeze());
                startActivity(s);
                return;
            }
        }
    }

    public final void onLastPlayedGameClicked(MostRecentGameInfo mostrecentgameinfo)
    {
        PowerUpUtils.viewGameDetail(mParent, mostrecentgameinfo.getGameId());
    }

    public final boolean onMenuItemClick(MenuItem menuitem, View view)
    {
        view = ((View) (UiUtils.getValidTag(view)));
        if (!(view instanceof GameFirstParty)) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = (GameFirstParty)view;
        view = super.mActivity;
        obj = ((GameFirstParty) (obj)).getGame().getInstancePackageName();
        menuitem.getItemId();
        JVM INSTR tableswitch 2131559261 2131559261: default 60
    //                   2131559261 62;
           goto _L2 _L3
_L2:
        return false;
_L3:
        UiUtils.viewInPlayStore(view, ((String) (obj)), "GPG_overflowMenu");
        return true;
    }

    public final void onPlayNowClicked(Game game, View view)
    {
        mParent.logClickEvent(1148, view);
        UiUtils.launchGame(mParent, game, null);
    }

    public final void onProfileBannerEditCirclesClicked()
    {
        if (((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
        {
            UiUtils.startActivityForResultFromFragment(this, UiUtils.createAddUpdateCirclesIntent(mParent, mCurrentAccountName, mMainPlayerId, mBelongingCircles), 3);
            return;
        } else
        {
            mParent.launchPlusUpgradeFlow(15, null);
            return;
        }
    }

    public final void onProfileBannerGplusClicked()
    {
        DestinationFragmentActivity destinationfragmentactivity = mParent;
        Intent intent = GmsIntents.createShowProfileIntent(destinationfragmentactivity, mMainPlayer.getPlayerId());
        try
        {
            destinationfragmentactivity.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            GamesLog.e("UiUtils", "Unable to launch show profile intent", activitynotfoundexception);
        }
    }

    public final void onRetry()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("ProfileCompareFrag", "onRetry: not connected; ignoring...");
            return;
        } else
        {
            mLatencyLogger.onConnected(googleapiclient);
            mLatencyLogger.ensureStarted(new int[] {
                3, 4, 2
            });
            mLoadingDataViewManager.setViewState(1);
            loadData(googleapiclient);
            return;
        }
    }

    public final void onShareGameClicked(String s, String s1, View view)
    {
        mParent.logClickEvent(1141, view);
        mParent.shareGame(s, s1);
    }

    public final void onViewInPlayStoreClicked(GameFirstParty gamefirstparty, View view)
    {
        mParent.logClickEvent(1155, view);
        UiUtils.viewInPlayStore(mParent, gamefirstparty.getGame().getInstancePackageName(), "GPG_overflowMenu");
    }




/*
    static void access$200(PlayerDetailProfileComparisonFragment playerdetailprofilecomparisonfragment, com.google.android.gms.games.Players.LoadXpForGameCategoriesResult loadxpforgamecategoriesresult, com.google.android.gms.games.Players.LoadXpForGameCategoriesResult loadxpforgamecategoriesresult1)
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
                treeset.add(new PlayerDetailXpComparisonAdapter.PlayerComparisonXpData(loadxpforgamecategoriesresult.getXpForCategory(s), loadxpforgamecategoriesresult1.getXpForCategory(s), s));
            }

            for (loadxpforgamecategoriesresult = treeset.iterator(); loadxpforgamecategoriesresult.hasNext(); arraylist.add((PlayerDetailXpComparisonAdapter.PlayerComparisonXpData)loadxpforgamecategoriesresult.next())) { }
        } else
        {
            GamesLog.w("PlayerDetailUtil", "buildComparisonXpDataList: no categories!");
        }
        if (arraylist.size() > 0)
        {
            int j = playerdetailprofilecomparisonfragment.getResources().getInteger(0x7f0e001c);
            loadxpforgamecategoriesresult = playerdetailprofilecomparisonfragment.mXpComparisonTileAdapter;
            loadxpforgamecategoriesresult1 = playerdetailprofilecomparisonfragment.mMePlayer;
            Player player = playerdetailprofilecomparisonfragment.mMainPlayer;
            boolean flag;
            if (j >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            Asserts.checkNotNull(loadxpforgamecategoriesresult1);
            Asserts.checkNotNull(player);
            loadxpforgamecategoriesresult.mPlayer1 = (Player)loadxpforgamecategoriesresult1.freeze();
            loadxpforgamecategoriesresult.mPlayer2 = (Player)player.freeze();
            loadxpforgamecategoriesresult.mXpDataList = arraylist;
            loadxpforgamecategoriesresult.mRowLimit = j;
            loadxpforgamecategoriesresult.setVisible(true);
            playerdetailprofilecomparisonfragment.mXpComparisonTileAdapter.setVisible(true);
        }
        return;
    }

*/



/*
    static void access$400(PlayerDetailProfileComparisonFragment playerdetailprofilecomparisonfragment, com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult loadgamesresult, GameFirstPartyBuffer gamefirstpartybuffer, int i, MostRecentGameInfo mostrecentgameinfo)
    {
        int l = 0;
        int j = loadgamesresult.getStatus().mStatusCode;
        int i1 = gamefirstpartybuffer.getCount();
        if (j != 0 || i1 == 0)
        {
            playerdetailprofilecomparisonfragment.mGamesInCommonHeaderAdapter.setVisible(false);
        } else
        {
            int k;
            if (mostrecentgameinfo != null && mostrecentgameinfo.getGameId().equals(((GameFirstParty)gamefirstpartybuffer.get(0)).getGame().getApplicationId()))
            {
                k = 1;
            } else
            {
                k = 0;
            }
            loadgamesresult = new ObjectDataBuffer();
            if (i1 - k <= 0)
            {
                playerdetailprofilecomparisonfragment.mGamesInCommonHeaderAdapter.setVisible(false);
                return;
            }
            for (; l < i && l + k < i1; l++)
            {
                loadgamesresult.add(((GameFirstParty)gamefirstpartybuffer.get(l + k)).freeze());
            }

            playerdetailprofilecomparisonfragment.mGamesInCommonAdapter.setDataBuffer(loadgamesresult);
            playerdetailprofilecomparisonfragment.mGamesInCommonHeaderAdapter.setVisible(true);
            if (i1 > i + k)
            {
                playerdetailprofilecomparisonfragment.mGamesInCommonHeaderAdapter.setButton(playerdetailprofilecomparisonfragment, 0x7f1000b5, 0x7f1000b6, "moreGamesInCommon");
                return;
            }
        }
        return;
    }

*/


/*
    static void access$500(PlayerDetailProfileComparisonFragment playerdetailprofilecomparisonfragment, com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult loadgamesresult, GameFirstPartyBuffer gamefirstpartybuffer, int i, MostRecentGameInfo mostrecentgameinfo)
    {
        int j = loadgamesresult.getStatus().mStatusCode;
        int i1 = gamefirstpartybuffer.getCount();
        if (j != 0 || i1 == 0)
        {
            playerdetailprofilecomparisonfragment.mOtherPlayerGamesHeaderAdapter.setVisible(false);
        } else
        {
            int k;
            if (mostrecentgameinfo != null)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            loadgamesresult = new ObjectDataBuffer();
            if (i1 - k <= 0)
            {
                playerdetailprofilecomparisonfragment.mOtherPlayerGamesHeaderAdapter.setVisible(false);
                return;
            }
            for (int l = 0; l < i && l + k < i1; l++)
            {
                loadgamesresult.add(((GameFirstParty)gamefirstpartybuffer.get(l + k)).freeze());
            }

            playerdetailprofilecomparisonfragment.mOtherPlayerGamesAdapter.setDataBuffer(loadgamesresult);
            playerdetailprofilecomparisonfragment.mOtherPlayerGamesHeaderAdapter.setVisible(true);
            if (i1 > i + k)
            {
                playerdetailprofilecomparisonfragment.mOtherPlayerGamesHeaderAdapter.setButton(playerdetailprofilecomparisonfragment, 0x7f1000b5, 0x7f1000b6, "moreOtherPlayerGames");
                return;
            }
        }
        return;
    }

*/


/*
    static String[] access$602(PlayerDetailProfileComparisonFragment playerdetailprofilecomparisonfragment, String as[])
    {
        playerdetailprofilecomparisonfragment.mBelongingCircleIds = as;
        return as;
    }

*/



/*
    static ArrayList access$702(PlayerDetailProfileComparisonFragment playerdetailprofilecomparisonfragment, ArrayList arraylist)
    {
        playerdetailprofilecomparisonfragment.mPlayerCircles = arraylist;
        return arraylist;
    }

*/


}
