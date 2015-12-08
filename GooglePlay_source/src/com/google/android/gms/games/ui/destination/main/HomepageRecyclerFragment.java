// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.main;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Batch;
import com.google.android.gms.common.api.BatchResult;
import com.google.android.gms.common.api.BatchResultToken;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.ExclusionFilteredDataBuffer;
import com.google.android.gms.common.data.FilteredDataBuffer;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
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
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.ui.AddToCirclesHelper;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.MergedRecyclerAdapter;
import com.google.android.gms.games.ui.RecyclerSpacerAdapter;
import com.google.android.gms.games.ui.card.OnyxGotItCardAdapter;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter;
import com.google.android.gms.games.ui.common.quests.DestinationQuestInboxHelper;
import com.google.android.gms.games.ui.common.quests.QuestInboxHelper;
import com.google.android.gms.games.ui.common.quests.QuestTileEventListener;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;
import com.google.android.gms.games.ui.destination.DestinationGamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter;
import com.google.android.gms.games.ui.destination.games.MyGamesListActivity;
import com.google.android.gms.games.ui.destination.players.FriendsArePlaying;
import com.google.android.gms.games.ui.destination.players.FriendsArePlayingAdapter;
import com.google.android.gms.games.ui.destination.players.PlayerActivity;
import com.google.android.gms.games.ui.destination.players.SlimProfileSummaryAdapter;
import com.google.android.gms.games.ui.destination.quests.QuestCarouselAdapter;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;
import com.google.android.gms.games.ui.destination.util.GamesShuffleFilteredDataBuffer;
import com.google.android.gms.games.ui.dialog.ProfileVisibilityDialogFragment;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.Connections;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.games.ui.destination.main:
//            ProfileVisibilityButterbarAdapter, FeaturedGamesAdapter

public final class HomepageRecyclerFragment extends DestinationGamesHeaderRecyclerViewFragment
    implements com.google.android.gms.games.ui.AddToCirclesHelper.OneTouchCirclesListener, com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.GotItEventListener, com.google.android.gms.games.ui.common.players.PlayerAvatarAdapter.PlayerAvatarEventListener, com.google.android.gms.games.ui.common.quests.QuestInboxHelper.QuestInboxHelperProvider, QuestTileEventListener, LoggablePage, com.google.android.gms.games.ui.destination.games.ContinuePlayingAdapter.ContinuePlayingEventListener, FeaturedGamesAdapter.FeaturedGamesEventListener, ProfileVisibilityButterbarAdapter.ProfileVisibilityButterbarEventListener, com.google.android.gms.games.ui.destination.players.FriendsArePlayingAdapter.FriendsArePlayingEventListener, com.google.android.gms.games.ui.destination.players.SlimProfileSummaryAdapter.SlimProfileSummaryEventListener, com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment.QuestAccountSwitcherProvider, com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer
{
    private final class FeaturedGamesLoadedCallback
        implements ResultCallback
    {

        final HomepageRecyclerFragment this$0;

        public final volatile void onResult(Result result)
        {
            GameFirstPartyBuffer gamefirstpartybuffer;
            boolean flag;
            boolean flag1;
            int j;
            flag = true;
            j = 1;
            result = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result;
            int i = result.getStatus().mStatusCode;
            gamefirstpartybuffer = result.getGames();
            GamesLog.d(HomepageRecyclerFragment.TAG, (new StringBuilder("FeaturedGamesLoadedListener... statusCode = ")).append(i).append(", data = ").append(gamefirstpartybuffer).toString());
            flag1 = flag;
            if (canUseResult(result)) goto _L2; else goto _L1
_L1:
            flag1 = flag;
            mLatencyLogger.logEvents(new int[] {
                7
            });
            gamefirstpartybuffer.release();
_L5:
            return;
_L2:
            flag1 = flag;
            int k = gamefirstpartybuffer.getCount();
            if (k != 0) goto _L4; else goto _L3
_L3:
            flag1 = flag;
            mFeaturedGamesHeaderAdapter.setVisible(false);
            flag1 = flag;
            mFeaturedGamesAdapter.clearData();
            flag = j;
_L6:
            flag1 = flag;
            onSectionLoaded();
            if (flag)
            {
                gamefirstpartybuffer.release();
                return;
            }
              goto _L5
_L4:
            flag1 = flag;
            mFeaturedGamesHeaderAdapter.setVisible(true);
            flag1 = flag;
            j = ((DatabufferRecyclerAdapter) (mFeaturedGamesAdapter)).mMaxNumItems;
            if (k > j)
            {
                break MISSING_BLOCK_LABEL_231;
            }
            flag1 = flag;
            mFeaturedGamesAdapter.setDataBuffer(gamefirstpartybuffer);
            flag = false;
              goto _L6
            flag1 = flag;
            result = new UnownedGamesDataBuffer(gamefirstpartybuffer, j);
            flag1 = flag;
            if (result.getCount() >= j)
            {
                break MISSING_BLOCK_LABEL_295;
            }
            flag1 = flag;
            result = new GamesShuffleFilteredDataBuffer(gamefirstpartybuffer, j, SharedPrefsConfig.getLong(, "shuffleHomePageSeed", System.currentTimeMillis()));
            flag1 = flag;
            HeaderItemRecyclerAdapter headeritemrecycleradapter = mFeaturedGamesHeaderAdapter;
            boolean flag2;
            if (k > j)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            flag1 = flag;
            headeritemrecycleradapter.showButton(flag2);
            flag1 = flag;
            mFeaturedGamesAdapter.setDataBuffer(result);
            flag = false;
              goto _L6
            result;
            if (flag1)
            {
                gamefirstpartybuffer.release();
            }
            throw result;
              goto _L6
        }

        private FeaturedGamesLoadedCallback()
        {
            this$0 = HomepageRecyclerFragment.this;
            super();
        }

        FeaturedGamesLoadedCallback(byte byte0)
        {
            this();
        }
    }

    private final class ProfileVisibilitySettingsCallback
        implements ResultCallback
    {

        final HomepageRecyclerFragment this$0;

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.Players.LoadProfileSettingsResult)result;
            int i = result.getStatus().mStatusCode;
            if (!canUseResult(result))
            {
                mLatencyLogger.logEvents(new int[] {
                    7
                });
                return;
            } else
            {
                mPublicProfile = result.isProfileVisible();
                mProfileVisibilityButterbarAdapter.updateButterBarVisibility(mPublicProfile);
                return;
            }
        }

        private ProfileVisibilitySettingsCallback()
        {
            this$0 = HomepageRecyclerFragment.this;
            super();
        }

        ProfileVisibilitySettingsCallback(byte byte0)
        {
            this();
        }
    }

    private final class RecentlyPlayedGamesLoadedCallback
        implements ResultCallback
    {

        final HomepageRecyclerFragment this$0;

        public final volatile void onResult(Result result)
        {
            GameFirstPartyBuffer gamefirstpartybuffer;
            boolean flag;
            boolean flag1;
            flag = true;
            flag1 = true;
            result = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result;
            int i = result.getStatus().mStatusCode;
            gamefirstpartybuffer = result.getGames();
            GamesLog.d(HomepageRecyclerFragment.TAG, (new StringBuilder("RecentlyPlayedGamesLoaded... statusCode = ")).append(i).append(", data = ").append(gamefirstpartybuffer).toString());
            if (canUseResult(result))
            {
                break MISSING_BLOCK_LABEL_94;
            }
            mLatencyLogger.logEvents(new int[] {
                7
            });
            gamefirstpartybuffer.release();
            return;
            mContinuePlayingAdapter.setDataBuffer(gamefirstpartybuffer);
            result = mContinuePlayingNullStateAdapter;
            if (gamefirstpartybuffer.getCount() != 0)
            {
                flag1 = false;
            }
            result.setVisible(flag1);
            onSectionLoaded();
            return;
            result;
            flag = false;
_L2:
            if (flag)
            {
                gamefirstpartybuffer.release();
            }
            throw result;
            result;
            if (true) goto _L2; else goto _L1
_L1:
        }

        private RecentlyPlayedGamesLoadedCallback()
        {
            this$0 = HomepageRecyclerFragment.this;
            super();
        }

        RecentlyPlayedGamesLoadedCallback(byte byte0)
        {
            this();
        }
    }

    private final class UnownedGamesDataBuffer extends FilteredDataBuffer
    {

        private final ArrayList mUnownedGamePositions = new ArrayList();
        final HomepageRecyclerFragment this$0;

        protected final int computeRealPosition(int i)
        {
            return ((Integer)mUnownedGamePositions.get(i)).intValue();
        }

        public final int getCount()
        {
            return mUnownedGamePositions.size();
        }

        public UnownedGamesDataBuffer(DataBuffer databuffer, int i)
        {
            this$0 = HomepageRecyclerFragment.this;
            super(databuffer);
            int k = 0;
            int j = 0;
            int i1 = databuffer.getCount();
            while (j < i1) 
            {
                homepagerecyclerfragment = (GameFirstParty)databuffer.get(j);
                int l;
                boolean flag;
                if (!isOwned() && !getGame().isInstanceInstalled())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                l = k;
                if (flag)
                {
                    mUnownedGamePositions.add(Integer.valueOf(j));
                    l = k + 1;
                    if (l == i)
                    {
                        break;
                    }
                }
                j++;
                k = l;
            }
        }
    }


    static final String TAG = com/google/android/gms/games/ui/destination/main/HomepageRecyclerFragment.getSimpleName();
    private final ConcurrentHashMap endpointIdToName = new ConcurrentHashMap();
    private AddToCirclesHelper mAddToCirclesHelper;
    String mCarouselCurrentQuestId;
    String mCarouselPreviousQuestId;
    private ContinuePlayingAdapter mContinuePlayingAdapter;
    private OnyxGotItCardAdapter mContinuePlayingNullStateAdapter;
    private CountDownLatch mCountDownLatch;
    private String mCurrentAccountName;
    private int mCurrentPackageVersion;
    private FeaturedGamesAdapter mFeaturedGamesAdapter;
    private HeaderItemRecyclerAdapter mFeaturedGamesHeaderAdapter;
    private FriendsArePlayingAdapter mFriendsArePlayingAdapter;
    private HeaderItemRecyclerAdapter mFriendsArePlayingHeaderAdapter;
    private OnyxGotItCardAdapter mFriendsArePlayingNullStateAdapter;
    private UpsellCardAdapter mFriendsArePlayingPlusUpsellAdapter;
    private OnyxGotItCardAdapter mGamersYouMayKnowNullStateAdapter;
    private PlayerAvatarAdapter mGamersYouMayKnowPlayersAdapter;
    private HeaderItemRecyclerAdapter mGamersYouMayKnowPlayersHeaderAdapter;
    private PlayerAvatarAdapter mGamersYouMayKnowPushAdapter;
    private HeaderItemRecyclerAdapter mGamersYouMayKnowPushHeaderAdapter;
    private OnyxGotItCardAdapter mGamersYouMayKnowWelcomeAdapter;
    private boolean mHasGYMKPushAdapter;
    LatencyLogger mLatencyLogger;
    private MergedRecyclerAdapter mMergedAdapter;
    private HeaderItemRecyclerAdapter mMyGamesHeaderAdapter;
    private ProfileVisibilityButterbarAdapter mProfileVisibilityButterbarAdapter;
    private boolean mPublicProfile;
    QuestCarouselAdapter mQuestCarouselAdapter;
    private DestinationQuestInboxHelper mQuestInboxHelper;
    private boolean mShowGYMKWelcome;
    private boolean mShowWelcome;
    private boolean mShowWhatsNew;
    private SlimProfileSummaryAdapter mSlimProfileSummaryAdapter;
    private RecyclerSpacerAdapter mSpacer;
    private OnyxGotItCardAdapter mWelcomeAdapter;
    private OnyxGotItCardAdapter mWhatsNewAdapter;

    public HomepageRecyclerFragment()
    {
    }

    private void addContinuePlayingAdapter(com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder)
    {
        builder.addAdapter(mMyGamesHeaderAdapter);
        builder.addAdapter(mContinuePlayingAdapter);
        builder.addAdapter(mContinuePlayingNullStateAdapter);
    }

    private void addFeaturedGamesAdapter(com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder)
    {
        builder.addAdapter(mFeaturedGamesHeaderAdapter);
        builder.addAdapter(mFeaturedGamesAdapter);
    }

    private void addFriendsArePlayingAdapter(com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder)
    {
        builder.addAdapter(mFriendsArePlayingHeaderAdapter);
        builder.addAdapter(mFriendsArePlayingAdapter);
        builder.addAdapter(mFriendsArePlayingNullStateAdapter);
        builder.addAdapter(mFriendsArePlayingPlusUpsellAdapter);
    }

    private void addGamersYouMayKnowAdapter(com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder)
    {
        builder.addAdapter(mGamersYouMayKnowPlayersHeaderAdapter);
        builder.addAdapter(mGamersYouMayKnowWelcomeAdapter);
        builder.addAdapter(mGamersYouMayKnowPlayersAdapter);
        builder.addAdapter(mGamersYouMayKnowNullStateAdapter);
    }

    private void addGamersYouMayKnowPushAdapter(com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder)
    {
        builder.addAdapter(mGamersYouMayKnowPushHeaderAdapter);
        builder.addAdapter(mGamersYouMayKnowPushAdapter);
        mHasGYMKPushAdapter = true;
    }

    private void addQuestCarouselAdapter(com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder)
    {
        builder.addAdapter(mQuestCarouselAdapter);
    }

    private void addSlimProfileSummaryAdapter(com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder)
    {
        builder.addAdapter(mSlimProfileSummaryAdapter);
    }

    private void onGameClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view)
    {
        GamesLog.d(TAG, (new StringBuilder("### Game clicked: ")).append(gamefirstparty).toString());
        mParent.logClickEvent(1100, view);
        PowerUpUtils.viewGameDetail(mParent, gamefirstparty, sharedelementtransition);
    }

    private void setGYMKNullState(boolean flag)
    {
        mGamersYouMayKnowPlayersAdapter.clearData();
        mGamersYouMayKnowWelcomeAdapter.setVisible(false);
        mGamersYouMayKnowPlayersHeaderAdapter.setVisible(flag);
        mGamersYouMayKnowNullStateAdapter.setVisible(flag);
    }

    private void shuffleAndPopulate(DataBuffer databuffer, int i, DatabufferRecyclerAdapter databufferrecycleradapter)
    {
        if (databuffer.getCount() <= i)
        {
            databufferrecycleradapter.setDataBuffer(databuffer);
            return;
        } else
        {
            databufferrecycleradapter.setDataBuffer(new GamesShuffleFilteredDataBuffer(databuffer, i, SharedPrefsConfig.getLong(mParent, "shuffleHomePageSeed", System.currentTimeMillis())));
            return;
        }
    }

    protected final int getPlaylogElementType()
    {
        return 1;
    }

    public final boolean getProfileVisibility()
    {
        return mPublicProfile;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment.QuestAccountSwitcher getQuestAccountSwitcher()
    {
        return mQuestInboxHelper;
    }

    public final QuestInboxHelper getQuestInboxHelper()
    {
        return mQuestInboxHelper;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        if (mLoadingDataViewManager.mViewState != 2)
        {
            mLatencyLogger.ensureStarted(new int[] {
                3, 4
            });
        } else
        {
            mLatencyLogger.ensureStarted(new int[0]);
        }
        getLogger().logBasicAction(1, PowerUpUtils.getExperimentIdsForLogging());
    }

    public final void onActivityCreated(Bundle bundle)
    {
        Object obj;
        int i;
        GamesLog.d(TAG, (new StringBuilder("onActivityCreated()...  this = ")).append(this).toString());
        super.onActivityCreated(bundle);
        obj = getResources();
        boolean flag1 = ((Resources) (obj)).getBoolean(0x7f0a0009);
        mLatencyLogger = LatencyLogger.createDestAppLatencyLogger(mParent, 1);
        mLatencyLogger.ensureStarted(new int[] {
            3, 4
        });
        if (bundle == null)
        {
            mShowWelcome = SharedPrefsConfig.getBoolean(mParent, "showWarmWelcome", true);
            i = SharedPrefsConfig.getInt$607b6e67(mParent, "lastVersionWhatsNewShown");
            mCurrentPackageVersion = PowerUpUtils.getPlayGamesVersionCode(mParent);
            int j;
            boolean flag;
            if (mCurrentPackageVersion > i)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0 && !mShowWelcome)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mShowWhatsNew = flag;
        } else
        {
            mShowWelcome = bundle.getBoolean("savedStateShowWelcome");
            mShowWhatsNew = bundle.getBoolean("savedStateShowWhatsNew");
            mCurrentPackageVersion = bundle.getInt("savedStateCurrentVersion");
        }
        if (mShowWelcome)
        {
            SharedPrefsConfig.setInt(mParent, "lastVersionWhatsNewShown", mCurrentPackageVersion);
        }
        mSpacer = new RecyclerSpacerAdapter(mParent, ((Resources) (obj)).getDimensionPixelSize(0x7f0c0130), false);
        mQuestInboxHelper = new DestinationQuestInboxHelper(mParent);
        mProfileVisibilityButterbarAdapter = new ProfileVisibilityButterbarAdapter(mParent, this);
        mProfileVisibilityButterbarAdapter.setVisible(false);
        mWelcomeAdapter = new OnyxGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0200e3, 0x7f100319, 0x7f100318, 0x7f10020a, 0x7f10031a, 1016), this, "welcomeButton");
        mWelcomeAdapter.setVisible(mShowWelcome);
        mWhatsNewAdapter = new OnyxGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0200e4, 0x7f10031d, 0x7f10031c, 0x7f10020a, 0x7f10031a, 1001), this, "whatsNewButton");
        mWhatsNewAdapter.setVisible(mShowWhatsNew);
        mSlimProfileSummaryAdapter = new SlimProfileSummaryAdapter(mParent, this);
        mGamersYouMayKnowPushHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mGamersYouMayKnowPushHeaderAdapter.setTitle(0x7f1000ea);
        mGamersYouMayKnowPushHeaderAdapter.setButton(this, 0x7f1000b5, 0x7f1000b6, "youMayKnow");
        mGamersYouMayKnowPushAdapter = new PlayerAvatarAdapter(mParent, this, 0x7f0e0067);
        mGamersYouMayKnowPushAdapter.disablePagination();
        mQuestCarouselAdapter = new QuestCarouselAdapter(mParent, mQuestInboxHelper, this);
        mQuestCarouselAdapter.setVisible(false);
        if (bundle == null)
        {
            mCarouselCurrentQuestId = null;
            mCarouselPreviousQuestId = null;
        } else
        {
            mCarouselCurrentQuestId = bundle.getString("savedStateCarouselCurrentQuestId");
            mCarouselPreviousQuestId = bundle.getString("savedStateCarouselPreviousQuestId");
        }
        mMyGamesHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mMyGamesHeaderAdapter.setTitle(0x7f1000f0);
        mMyGamesHeaderAdapter.setButton(this, 0x7f1000b5, 0x7f1000b6, "myGames");
        j = UiUtils.getOnyxCardType(((Integer)G.playNowCardType.get()).intValue(), flag1);
        j;
        JVM INSTR tableswitch 1 2: default 548
    //                   1 1371
    //                   2 1378;
           goto _L1 _L2 _L3
_L1:
        i = 0x7f0e0018;
_L12:
        mContinuePlayingAdapter = new ContinuePlayingAdapter(mParent, this, null, i, j);
        mContinuePlayingAdapter.disablePagination();
        mContinuePlayingNullStateAdapter = new OnyxGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0200df, 0, 0x7f10014f, 0x7f10014e, 0, 1009), this, "continuePlayingNullButton");
        mContinuePlayingNullStateAdapter.setVisible(false);
        mFriendsArePlayingHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mFriendsArePlayingHeaderAdapter.setTitle(0x7f1000e9);
        mFriendsArePlayingHeaderAdapter.setButton(this, 0x7f1000b5, 0x7f1000b6, "friendsArePlaying");
        mFriendsArePlayingAdapter = new FriendsArePlayingAdapter(mParent, this, UiUtils.getOnyxCardType(((Integer)G.playNowCardType.get()).intValue(), flag1));
        mFriendsArePlayingAdapter.disablePagination();
        mFriendsArePlayingNullStateAdapter = new OnyxGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0200de, 0, 0x7f10014d, 0x7f10014c, 0, 1012), this, "friendsArePlayingNullButton");
        mFriendsArePlayingNullStateAdapter.setVisible(false);
        mFeaturedGamesHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mFeaturedGamesHeaderAdapter.setTitle(0x7f1000eb);
        mFeaturedGamesHeaderAdapter.setButton(this, 0x7f1000b5, 0x7f1000b6, "featured");
        mFeaturedGamesAdapter = new FeaturedGamesAdapter(mParent, this, UiUtils.getOnyxCardType(((Integer)G.playNowCardType.get()).intValue(), flag1));
        mFeaturedGamesAdapter.disablePagination();
        mGamersYouMayKnowPlayersHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mGamersYouMayKnowPlayersHeaderAdapter.setTitle(0x7f1000ea);
        mGamersYouMayKnowPlayersHeaderAdapter.setButton(this, 0x7f1000b5, 0x7f1000b6, "youMayKnow");
        mGamersYouMayKnowWelcomeAdapter = new OnyxGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0200e2, 0, 0x7f100150, 0x7f1002ca, 0, 1013), this, "gamersYouMayKnowWelcomeButton");
        mShowGYMKWelcome = SharedPrefsConfig.getBoolean(mParent, "showYouMayKnowWelcome", true);
        mGamersYouMayKnowWelcomeAdapter.setVisible(mShowGYMKWelcome);
        mGamersYouMayKnowPlayersAdapter = new PlayerAvatarAdapter(mParent, this, 0x7f0e0067);
        mGamersYouMayKnowPlayersAdapter.disablePagination();
        mGamersYouMayKnowNullStateAdapter = new OnyxGotItCardAdapter(mParent, new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.Data(0x7f0200e1, 0, 0x7f10014d, 0x7f10014c, 0, 1015), this, "gamersYouMayKnowNullButton");
        mGamersYouMayKnowNullStateAdapter.setVisible(false);
        mFriendsArePlayingPlusUpsellAdapter = UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new com.google.android.gms.games.ui.common.UpsellCardAdapter.Data(((Resources) (obj)).getColor(0x7f0b00e3), 0x7f100326), 2, Integer.valueOf(2));
        obj = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mSpacer);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mProfileVisibilityButterbarAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mWelcomeAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mWhatsNewAdapter);
        i = ((Integer)G.gamesPlayNowOrdering.get()).intValue();
        i;
        JVM INSTR tableswitch 1 7: default 1152
    //                   1 1385
    //                   2 1423
    //                   3 1461
    //                   4 1499
    //                   5 1532
    //                   6 1565
    //                   7 1598;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L11:
        break MISSING_BLOCK_LABEL_1598;
_L4:
        if (i != 0 && i != 8)
        {
            GamesLog.e(TAG, "Unknown ordering flag provided. Using default.");
        }
        addSlimProfileSummaryAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowPushAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addQuestCarouselAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addContinuePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFriendsArePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFeaturedGamesAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
_L13:
        mMergedAdapter = ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).build();
        setAdapter(mMergedAdapter);
        mAddToCirclesHelper = new AddToCirclesHelper(mParent);
        mAddToCirclesHelper.registerCircleModificationListener(mGamersYouMayKnowPushAdapter);
        mAddToCirclesHelper.registerCircleModificationListener(mGamersYouMayKnowPlayersAdapter);
        mAddToCirclesHelper.registerOneTouchCirclesListener(mGamersYouMayKnowPushAdapter);
        mAddToCirclesHelper.registerOneTouchCirclesListener(mGamersYouMayKnowPlayersAdapter);
        mAddToCirclesHelper.registerOneTouchCirclesListener(this);
        mAddToCirclesHelper.restoreSavedInstanceState(this, bundle);
        return;
_L2:
        i = 0x7f0e0016;
          goto _L12
_L3:
        i = 0x7f0e0017;
          goto _L12
_L5:
        addSlimProfileSummaryAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowPushAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFeaturedGamesAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addQuestCarouselAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addContinuePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFriendsArePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
          goto _L13
_L6:
        addSlimProfileSummaryAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowPushAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFriendsArePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addQuestCarouselAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addContinuePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFeaturedGamesAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
          goto _L13
_L7:
        addSlimProfileSummaryAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowPushAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addQuestCarouselAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addContinuePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFeaturedGamesAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFriendsArePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
          goto _L13
_L8:
        addSlimProfileSummaryAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addQuestCarouselAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addContinuePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFriendsArePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFeaturedGamesAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
          goto _L13
_L9:
        addSlimProfileSummaryAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFeaturedGamesAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addQuestCarouselAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addContinuePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFriendsArePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
          goto _L13
_L10:
        addSlimProfileSummaryAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFriendsArePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addQuestCarouselAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addContinuePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFeaturedGamesAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
          goto _L13
        addSlimProfileSummaryAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addQuestCarouselAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addContinuePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFeaturedGamesAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addFriendsArePlayingAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
        addGamersYouMayKnowAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)));
          goto _L13
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
    }

    public final void onChangeSettingsClicked()
    {
        DialogFragmentUtil.show(mParent, new ProfileVisibilityDialogFragment(), "com.google.android.gms.games.ui.dialog.privateLevelDialog");
    }

    public final void onContinuePlayingClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view)
    {
        onGameClicked(gamefirstparty, sharedelementtransition, view);
    }

    public final void onContinuePlayingPlayButtonClicked(GameFirstParty gamefirstparty, View view)
    {
        GamesLog.d(TAG, (new StringBuilder("Play button clicked -- Launching ")).append(gamefirstparty).toString());
        getLogger().logLaunchFromHome(gamefirstparty.getGame());
        com.google.android.gms.games.snapshot.SnapshotMetadata snapshotmetadata = gamefirstparty.getSnapshot();
        if (snapshotmetadata != null)
        {
            mParent.logClickEvent(1152, view);
            UiUtils.launchGameForSnapshot(mParent, mCurrentAccountName, gamefirstparty.getGame(), snapshotmetadata);
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

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        mLoadingDataViewManager.setViewState(4);
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        GamesLog.d(TAG, "onDestroyView()...");
        mMergedAdapter.clearData();
        super.onDestroyView();
    }

    public final void onFeaturedGamesClicked(GameFirstParty gamefirstparty, SharedElementTransition sharedelementtransition, View view)
    {
        onGameClicked(gamefirstparty, sharedelementtransition, view);
    }

    public final void onFriendsArePlayingGameClicked(FriendsArePlaying friendsareplaying, SharedElementTransition sharedelementtransition)
    {
        friendsareplaying = friendsareplaying.mostRecentGameInfo;
        PowerUpUtils.viewGameDetail$2d82bf34(mParent, friendsareplaying.getGameId(), sharedelementtransition);
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        if (mLoadingDataViewManager.mViewState == 4)
        {
            mLoadingDataViewManager.setViewState(1);
        }
        Object obj = Games.Players.getCurrentPlayer(googleapiclient);
        if (obj == null)
        {
            GamesLog.w(TAG, "We don't have a current player, something went wrong. Finishing the activity");
            mParent.finish();
            return;
        }
        SlimProfileSummaryAdapter slimprofilesummaryadapter = mSlimProfileSummaryAdapter;
        slimprofilesummaryadapter.mPlayer = (Player)((Player) (obj)).freeze();
        slimprofilesummaryadapter.setVisible(true);
        mCurrentAccountName = Games.getCurrentAccountName(googleapiclient);
        if (mCurrentAccountName == null)
        {
            GamesLog.w(TAG, "We don't have a current account name, something went wrong. Finishing the activity");
            mParent.finish();
            return;
        }
        int i;
        boolean flag;
        if (((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
        {
            i = 4;
        } else
        {
            i = 1;
        }
        mCountDownLatch = new CountDownLatch(i);
        mLatencyLogger.onConnected(googleapiclient);
        if (mLoadingDataViewManager.mViewState != 2)
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
        mFriendsArePlayingHeaderAdapter.showButton(((GamesFragmentActivity) (mParent)).mIsPlusEnabled);
        obj = mFriendsArePlayingPlusUpsellAdapter;
        if (!((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((UpsellCardAdapter) (obj)).setVisible(flag);
        if (((GamesFragmentActivity) (mParent)).mIsPlusEnabled)
        {
            mAddToCirclesHelper.loadData(googleapiclient);
            Games.Players.loadProfileSettingsInternal$4b6585cf(googleapiclient).setResultCallback(new ProfileVisibilitySettingsCallback((byte)0));
            Object obj1 = Games.Players.getCurrentPlayerId(googleapiclient);
            Games.Quests.loadFirstParty(googleapiclient, null, ((String) (obj1)), new int[] {
                2
            }, 1, false).setResultCallback(new ResultCallback() {

                final HomepageRecyclerFragment this$0;

                public final volatile void onResult(Result result)
                {
                    QuestBuffer questbuffer;
                    Object obj2;
                    boolean flag1;
                    flag1 = true;
                    obj2 = (com.google.android.gms.games.quest.Quests.LoadQuestsResult)result;
                    result = HomepageRecyclerFragment.this;
                    int j = ((com.google.android.gms.games.quest.Quests.LoadQuestsResult) (obj2)).getStatus().mStatusCode;
                    questbuffer = ((com.google.android.gms.games.quest.Quests.LoadQuestsResult) (obj2)).getQuests();
                    GamesLog.d(HomepageRecyclerFragment.TAG, (new StringBuilder("onQuestsLoaded... statusCode = ")).append(j).append(", data = ").append(questbuffer).toString());
                    if (result.canUseResult(((Result) (obj2))))
                    {
                        break MISSING_BLOCK_LABEL_91;
                    }
                    ((HomepageRecyclerFragment) (result)).mLatencyLogger.logEvents(new int[] {
                        7
                    });
                    questbuffer.release();
                    return;
                    obj2 = ((HomepageRecyclerFragment) (result)).mQuestCarouselAdapter;
                    String s = ((HomepageRecyclerFragment) (result)).mCarouselCurrentQuestId;
                    String s1 = ((HomepageRecyclerFragment) (result)).mCarouselPreviousQuestId;
                    ((QuestCarouselAdapter) (obj2)).mPagerAdapter.setDataBuffer(questbuffer);
                    if (((QuestCarouselAdapter) (obj2)).mViewPager != null)
                    {
                        ((QuestCarouselAdapter) (obj2)).mViewPager.setAdapter(((QuestCarouselAdapter) (obj2)).mPagerAdapter);
                    }
                    ((QuestCarouselAdapter) (obj2)).scrollToQuestById(s, s1);
                    obj2 = ((HomepageRecyclerFragment) (result)).mQuestCarouselAdapter;
                    boolean flag2;
                    if (questbuffer.getCount() > 0)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    ((QuestCarouselAdapter) (obj2)).setVisible(flag2);
                    result.onSectionLoaded();
                    return;
                    result;
                    flag1 = false;
_L2:
                    if (flag1)
                    {
                        questbuffer.release();
                    }
                    throw result;
                    result;
                    if (true) goto _L2; else goto _L1
_L1:
                }

            
            {
                this$0 = HomepageRecyclerFragment.this;
                super();
            }
            });
            i = ((DatabufferRecyclerAdapter) (mContinuePlayingAdapter)).mMaxNumItems;
            PlayGames.GamesMetadata.loadRecentlyPlayedGames$91af0f4(googleapiclient, i).setResultCallback(new RecentlyPlayedGamesLoadedCallback((byte)0));
            obj1 = new com.google.android.gms.common.api.Batch.Builder(googleapiclient);
            final BatchResultToken friendsPlayingResultToken = ((com.google.android.gms.common.api.Batch.Builder) (obj1)).add(Games.Players.loadPlayersFirstParty$4189436a(googleapiclient, "circled", PageSizeUtils.getRecentPlayerTilePageSize(mParent)));
            final BatchResultToken gamersResultToken = ((com.google.android.gms.common.api.Batch.Builder) (obj1)).add(Games.Players.loadPlayersFirstParty$4189436a(googleapiclient, "you_may_know", PageSizeUtils.getMixedTilePageSize(mParent)));
            ((com.google.android.gms.common.api.Batch.Builder) (obj1)).build().setResultCallback(new ResultCallback() {

                final HomepageRecyclerFragment this$0;
                final BatchResultToken val$friendsPlayingResultToken;
                final BatchResultToken val$gamersResultToken;

                public final volatile void onResult(Result result)
                {
                    com.google.android.gms.games.Players.LoadPlayersResult loadplayersresult;
                    com.google.android.gms.games.Players.LoadPlayersResult loadplayersresult1;
                    result = (BatchResult)result;
                    loadplayersresult1 = (com.google.android.gms.games.Players.LoadPlayersResult)result.take(friendsPlayingResultToken);
                    int j = loadplayersresult1.getStatus().mStatusCode;
                    loadplayersresult = (com.google.android.gms.games.Players.LoadPlayersResult)result.take(gamersResultToken);
                    j = loadplayersresult.getStatus().mStatusCode;
                    boolean flag1 = isAttachedToParent();
                    if (flag1) goto _L2; else goto _L1
_L1:
                    loadplayersresult.getPlayers().release();
_L8:
                    return;
_L2:
                    String s;
                    PlayerBuffer playerbuffer;
                    ObjectDataBuffer objectdatabuffer;
                    ArrayMap arraymap;
                    int l;
                    int i1;
                    
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = HomepageRecyclerFragment.this;
                friendsPlayingResultToken = batchresulttoken;
                gamersResultToken = batchresulttoken1;
                super();
            }
            });
        } else
        {
            mGamersYouMayKnowPushHeaderAdapter.setVisible(false);
            mMyGamesHeaderAdapter.setVisible(false);
            mContinuePlayingAdapter.setAdapterVisible(false);
            mGamersYouMayKnowPlayersHeaderAdapter.setVisible(false);
            mGamersYouMayKnowWelcomeAdapter.setVisible(false);
            mFriendsArePlayingHeaderAdapter.setVisible(true);
        }
        PlayGames.GamesMetadata.loadGames(googleapiclient, 0, PageSizeUtils.getMixedTilePageSize(mParent), false).setResultCallback(new FeaturedGamesLoadedCallback((byte)0));
    }

    public final void onGotItClicked(String s)
    {
        com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable playheaderlistwrappable = UiUtils.findPlayHeaderListWrappable(this);
        if (!s.equals("welcomeButton")) goto _L2; else goto _L1
_L1:
        mShowWelcome = false;
        mWelcomeAdapter.setVisible(false);
        SharedPrefsConfig.setBoolean(mParent, "showWarmWelcome", false);
        if (playheaderlistwrappable != null)
        {
            playheaderlistwrappable.showActionBar$1385ff();
        }
_L4:
        return;
_L2:
        if (!s.equals("whatsNewButton"))
        {
            break; /* Loop/switch isn't completed */
        }
        mShowWhatsNew = false;
        mWhatsNewAdapter.setVisible(false);
        SharedPrefsConfig.setInt(mParent, "lastVersionWhatsNewShown", mCurrentPackageVersion);
        if (playheaderlistwrappable != null)
        {
            playheaderlistwrappable.showActionBar$1385ff();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (s.equals("continuePlayingNullButton"))
        {
            PowerUpUtils.launchFeaturedGamesList(mParent);
            return;
        }
        if (s.equals("friendsArePlayingNullButton") || s.equals("gamersYouMayKnowNullButton"))
        {
            PowerUpUtils.launchYouMayKnowPlayerSearch(mParent);
            return;
        }
        if (s.equals("gamersYouMayKnowWelcomeButton"))
        {
            mShowGYMKWelcome = false;
            mGamersYouMayKnowWelcomeAdapter.setVisible(false);
            SharedPrefsConfig.setBoolean(mParent, "showYouMayKnowWelcome", false);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final void onHeaderClicked(String s)
    {
        if ("myGames".equals(s))
        {
            s = new Intent(mParent, com/google/android/gms/games/ui/destination/games/MyGamesListActivity);
            s.putExtra("com.google.android.gms.games.ui.extras.tab", 0);
            startActivity(s);
        } else
        {
            if ("featured".equals(s))
            {
                PowerUpUtils.launchFeaturedGamesList(mParent);
                return;
            }
            if ("friendsArePlaying".equals(s))
            {
                s = new Intent(mParent, com/google/android/gms/games/ui/destination/players/PlayerActivity);
                s.putExtra("com.google.android.gms.games.ui.extras.tab", 0);
                startActivity(s);
                return;
            }
            if ("youMayKnow".equals(s))
            {
                s = new Intent(mParent, com/google/android/gms/games/ui/destination/players/PlayerActivity);
                s.putExtra("com.google.android.gms.games.ui.extras.tab", 1);
                startActivity(s);
                return;
            }
        }
    }

    public final void onLearnMoreClicked(String s)
    {
        if (s.equals("welcomeButton") || s.equals("whatsNewButton"))
        {
            s = new Intent("android.intent.action.VIEW");
            s.setData(Uri.parse(getString(0x7f10031b)));
            startActivity(s);
        }
    }

    public final void onOneTouchCircleAddFailed(String s)
    {
        getLogger().logOneTouchCirclesAction(3, 1);
    }

    public final void onOneTouchCircleAddSucceeded(String s, String s1)
    {
        getLogger().logOneTouchCirclesAction(1, 1);
    }

    public final void onOneTouchCircleLoadFailed(String s)
    {
        getLogger().logOneTouchCirclesAction(5, 1);
    }

    public final void onOneTouchCircleRemoveFailed(String s)
    {
        getLogger().logOneTouchCirclesAction(4, 1);
    }

    public final void onOneTouchCircleRemoveSucceeded$16da05f7(String s)
    {
        getLogger().logOneTouchCirclesAction(2, 1);
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
            GamesLog.w(TAG, "onPlayerFollowClicked: not connected; ignoring...");
            return;
        } else
        {
            mAddToCirclesHelper.onPlayerFollowClicked(this, playeravataradapter, 6, player);
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
            GamesLog.w(TAG, "onPlayerUnfollowClicked: not connected; ignoring...");
            return;
        } else
        {
            mAddToCirclesHelper.onPlayerUnfollowClicked(playeravataradapter, player);
            return;
        }
    }

    public final void onQuestTileClicked(Quest quest)
    {
        PowerUpUtils.viewQuests(mParent, quest.getGame());
    }

    public final void onRetry()
    {
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        Object obj;
        Object obj1;
        QuestBuffer questbuffer;
        obj1 = null;
        onSaveInstanceState(bundle);
        obj = mQuestCarouselAdapter;
        questbuffer = ((QuestCarouselAdapter) (obj)).mPagerAdapter.mDataBuffer;
        if (((QuestCarouselAdapter) (obj)).mViewPager == null || questbuffer == null) goto _L2; else goto _L1
_L1:
        int i = ((QuestCarouselAdapter) (obj)).mViewPager.mCurItem;
        if (i > questbuffer.getCount() - 1) goto _L2; else goto _L3
_L3:
        obj = ((Quest)questbuffer.get(i)).getQuestId();
_L5:
        mCarouselCurrentQuestId = ((String) (obj));
        QuestCarouselAdapter questcarouseladapter = mQuestCarouselAdapter;
        QuestBuffer questbuffer1 = questcarouseladapter.mPagerAdapter.mDataBuffer;
        obj = obj1;
        if (questcarouseladapter.mViewPager != null)
        {
            obj = obj1;
            if (questbuffer1 != null)
            {
                int j = questcarouseladapter.mViewPager.mCurItem - 1;
                obj = obj1;
                if (j >= 0)
                {
                    obj = obj1;
                    if (j <= questbuffer1.getCount() - 1)
                    {
                        obj = ((Quest)questbuffer1.get(j)).getQuestId();
                    }
                }
            }
        }
        mCarouselPreviousQuestId = ((String) (obj));
        bundle.putBoolean("savedStateShowWelcome", mShowWelcome);
        bundle.putBoolean("savedStateShowWhatsNew", mShowWhatsNew);
        bundle.putString("savedStateCarouselCurrentQuestId", mCarouselCurrentQuestId);
        bundle.putString("savedStateCarouselPreviousQuestId", mCarouselPreviousQuestId);
        bundle.putInt("savedStateCurrentVersion", mCurrentPackageVersion);
        mAddToCirclesHelper.saveInstanceState(bundle);
        return;
_L2:
        obj = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    final void onSectionLoaded()
    {
        mCountDownLatch.countDown();
        if (mCountDownLatch.getCount() == 0L)
        {
            mLoadingDataViewManager.setViewState(2);
            mLatencyLogger.logEvents(new int[] {
                8
            });
        }
    }

    public final void onSlimProfileViewLargePrimaryLabelClicked()
    {
        mParent.launchPlusUpgradeFlow(2, Integer.valueOf(1));
    }

    public final void onSlimProfileViewProfileClicked(Player player, SharedElementTransition sharedelementtransition)
    {
        UiUtils.viewMyProfile(mParent, player, sharedelementtransition);
    }

    public final void onStop()
    {
        mLatencyLogger.logEvents(new int[] {
            6
        });
        if (getGoogleApiClient().isConnected())
        {
            GamesLog.i(TAG, "Stopping discovery");
            Nearby.Connections.stopCrossAppDiscoveryRestricted(getGoogleApiClient());
        }
        onStop();
    }

    public final void updateProfileVisibility(boolean flag)
    {
        if (!isAttachedToParent())
        {
            return;
        }
        com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable playheaderlistwrappable = UiUtils.findPlayHeaderListWrappable(this);
        if (playheaderlistwrappable != null && mProfileVisibilityButterbarAdapter.isVisible() && flag)
        {
            playheaderlistwrappable.showActionBar$1385ff();
        }
        mProfileVisibilityButterbarAdapter.updateButterBarVisibility(flag);
    }










/*
    static void access$1700(HomepageRecyclerFragment homepagerecyclerfragment, DataBuffer databuffer)
    {
        Resources resources = homepagerecyclerfragment.getResources();
        int i = resources.getInteger(0x7f0e0057);
        homepagerecyclerfragment.shuffleAndPopulate(databuffer, resources.getInteger(0x7f0e0056) * i, homepagerecyclerfragment.mFriendsArePlayingAdapter);
        homepagerecyclerfragment.mFriendsArePlayingHeaderAdapter.showButton(true);
        homepagerecyclerfragment.mFriendsArePlayingNullStateAdapter.setVisible(false);
        return;
    }

*/





/*
    static void access$2100(HomepageRecyclerFragment homepagerecyclerfragment, PlayerBuffer playerbuffer, int i, boolean flag)
    {
        boolean flag3 = true;
        boolean flag2 = true;
        Resources resources = homepagerecyclerfragment.getResources();
        ArrayList arraylist = new ArrayList();
        boolean flag1;
        if (homepagerecyclerfragment.mHasGYMKPushAdapter && i <= 3)
        {
            int j = resources.getInteger(0x7f0e0021) * resources.getInteger(0x7f0e0067);
            homepagerecyclerfragment.shuffleAndPopulate(playerbuffer, j, homepagerecyclerfragment.mGamersYouMayKnowPushAdapter);
            DataBuffer databuffer = ((DatabufferRecyclerAdapter) (homepagerecyclerfragment.mGamersYouMayKnowPushAdapter)).mDataBuffer;
            int l = databuffer.getCount();
            for (i = 0; i < l; i++)
            {
                arraylist.add(((Player)databuffer.get(i)).getPlayerId());
            }

            if (playerbuffer.getCount() > j)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            homepagerecyclerfragment.mGamersYouMayKnowPushHeaderAdapter.setVisible(true);
            homepagerecyclerfragment.mGamersYouMayKnowPushHeaderAdapter.showButton(flag1);
        } else
        {
            homepagerecyclerfragment.mGamersYouMayKnowPushAdapter.clearData();
            homepagerecyclerfragment.mGamersYouMayKnowPushHeaderAdapter.setVisible(false);
            if (playerbuffer.getCount() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            int k = resources.getInteger(0x7f0e0021) * resources.getInteger(0x7f0e0067);
            if (arraylist.size() > 0)
            {
                ExclusionFilteredDataBuffer exclusionfiltereddatabuffer = new ExclusionFilteredDataBuffer(playerbuffer, "external_player_id");
                l = arraylist.size();
                for (i = 0; i < l; i++)
                {
                    exclusionfiltereddatabuffer.filterOut((String)arraylist.get(i));
                }

                homepagerecyclerfragment.mGamersYouMayKnowPlayersAdapter.setDataBuffer(exclusionfiltereddatabuffer);
            } else
            {
                homepagerecyclerfragment.shuffleAndPopulate(playerbuffer, k, homepagerecyclerfragment.mGamersYouMayKnowPlayersAdapter);
            }
            homepagerecyclerfragment.mGamersYouMayKnowPlayersHeaderAdapter.setVisible(true);
            homepagerecyclerfragment.mGamersYouMayKnowWelcomeAdapter.setVisible(homepagerecyclerfragment.mShowGYMKWelcome);
            homepagerecyclerfragment = homepagerecyclerfragment.mGamersYouMayKnowPlayersHeaderAdapter;
            if (playerbuffer.getCount() > k)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            homepagerecyclerfragment.showButton(flag);
            return;
        }
        if (!flag)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        homepagerecyclerfragment.setGYMKNullState(flag);
        return;
    }

*/







/*
    static boolean access$402(HomepageRecyclerFragment homepagerecyclerfragment, boolean flag)
    {
        homepagerecyclerfragment.mPublicProfile = flag;
        return flag;
    }

*/





}
