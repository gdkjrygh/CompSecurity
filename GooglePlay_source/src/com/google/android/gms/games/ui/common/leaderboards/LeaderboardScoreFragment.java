// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.leaderboards;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardVariant;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragment;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.LoadingAdapter;
import com.google.android.gms.games.ui.OnLogLeaderboardActionListener;
import com.google.android.gms.games.ui.common.SlimGotItCardAdapter;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.common.share.ShareGameAdapter;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiSharedPrefs;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.leaderboards:
//            LeaderboardMetadataProvider, LeaderboardScoreHeaderAdapter, LeaderboardButterBarAdapter, LeaderboardScoreAdapter, 
//            LeaderboardEmptyAdapter, LeaderboardScorePodiumAdapter

public class LeaderboardScoreFragment extends GamesHeaderRecyclerViewFragment
    implements ResultCallback, com.google.android.gms.games.ui.DatabufferRecyclerAdapter.OnEndOfWindowReachedListener, LeaderboardButterBarAdapter.LeaderboardButterBarEventListener, LeaderboardScoreAdapter.LeaderboardScoreEventListener, LeaderboardScoreHeaderAdapter.LeaderboardCollectionControlListener, com.google.android.gms.games.ui.common.share.ShareGameAdapter.ShareGameEventListener
{

    private int mCollection;
    private boolean mCollectionSetBySavedState;
    private int mGameThemeColor;
    private LeaderboardButterBarAdapter mLeaderboardButterBarAdapter;
    private LeaderboardEmptyAdapter mLeaderboardEmptyAdapter;
    private String mLeaderboardName;
    private LeaderboardScoreAdapter mLeaderboardScoreAdapter;
    private LeaderboardScoreHeaderAdapter mLeaderboardScoreHeaderAdapter;
    private LeaderboardScorePodiumAdapter mLeaderboardScorePodiumAdapter;
    private LoadingAdapter mLoadingAdapter;
    private LeaderboardMetadataProvider mMetadataProvider;
    private ShareGameAdapter mShareGameAdapter;
    private SlimGotItCardAdapter mSlimUpsellCardAdapter;
    private int mTimeSpan;
    private UpsellCardAdapter mUpsellCardAdapter;

    public LeaderboardScoreFragment()
    {
        mLeaderboardScoreHeaderAdapter = null;
        mCollectionSetBySavedState = false;
        mCollection = 1;
    }

    private void loadLeaderboardScores(boolean flag)
    {
        boolean flag1 = true;
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            return;
        }
        String s = mMetadataProvider.getLeaderboardId();
        String s1 = mMetadataProvider.getGameId();
        int i = PageSizeUtils.getMixedTilePageSize(mParent);
        if (mParent.mConfiguration.is3PContext())
        {
            Games.Leaderboards.loadTopScores(googleapiclient, s, mTimeSpan, mCollection, i, flag).setResultCallback(this);
            return;
        }
        if (!mParent.mIsPlusEnabled && mCollection == 1)
        {
            mLeaderboardScoreHeaderAdapter.setVisible(true);
            mLeaderboardButterBarAdapter.setVisible(false);
            mShareGameAdapter.setVisible(false);
            mLoadingAdapter.setVisible(false);
            mLoadingDataViewManager.setViewState(2);
            mUpsellCardAdapter.setVisible(true);
            mSlimUpsellCardAdapter.setVisible(false);
            mLeaderboardScoreAdapter.setAdapterVisible(false);
            mLeaderboardEmptyAdapter.setVisible(false);
            return;
        }
        mUpsellCardAdapter.setVisible(false);
        mLeaderboardScoreAdapter.setAdapterVisible(true);
        SlimGotItCardAdapter slimgotitcardadapter = mSlimUpsellCardAdapter;
        if (mParent.mIsPlusEnabled || mCollection != 0)
        {
            flag1 = false;
        }
        slimgotitcardadapter.setVisible(flag1);
        Games.Leaderboards.loadTopScoresFirstParty(googleapiclient, s1, s, mTimeSpan, mCollection, i, flag).setResultCallback(this);
    }

    private void setLoadingState()
    {
        mLeaderboardButterBarAdapter.setVisible(false);
        mLeaderboardScorePodiumAdapter.setVisible(false);
        mLeaderboardEmptyAdapter.setVisible(false);
        mLeaderboardScoreAdapter.setAdapterVisible(false);
        mShareGameAdapter.setVisible(false);
        mLoadingAdapter.setVisible(true);
    }

    public final void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = (GamesFragmentActivity)super.mActivity;
        if (!((GamesFragmentActivity) (layoutinflater)).mConfiguration.isDestinationUi())
        {
            return;
        } else
        {
            mGameThemeColor = layoutinflater.getIntent().getIntExtra("com.google.android.gms.games.EXTRA_GAME_THEME_COLOR", UiUtils.getActionBarColorForFragment(this));
            Resources resources = layoutinflater.getResources();
            View view = new View(layoutinflater);
            view.setBackgroundColor(mGameThemeColor);
            viewgroup.addView(view);
            viewgroup = (android.widget.FrameLayout.LayoutParams)view.getLayoutParams();
            viewgroup.width = -1;
            viewgroup.height = getHeaderHeight(layoutinflater);
            viewgroup.height = ((android.widget.FrameLayout.LayoutParams) (viewgroup)).height + resources.getDimensionPixelSize(0x7f0c00cc);
            view.setLayoutParams(viewgroup);
            return;
        }
    }

    public final boolean alwaysUseFloatingBackground()
    {
        return false;
    }

    public final float getBackgroundViewParallaxRatio()
    {
        return 1.0F;
    }

    public final Drawable getFloatingControlsBackground()
    {
        if (!((GamesFragmentActivity)super.mActivity).mConfiguration.isDestinationUi())
        {
            return getFloatingControlsBackground();
        } else
        {
            return new ColorDrawable(mGameThemeColor);
        }
    }

    protected final int getPlaylogElementType()
    {
        return 10;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        LeaderboardButterBarAdapter leaderboardbutterbaradapter;
        onActivityCreated(bundle);
        mMetadataProvider = (LeaderboardMetadataProvider)mParent;
        if (bundle != null)
        {
            mCollectionSetBySavedState = bundle.containsKey("collection");
            mCollection = bundle.getInt("collection", 1);
            mTimeSpan = bundle.getInt("time_span", 2);
        } else
        {
            mCollection = mMetadataProvider.getCollection();
            if (mCollection == -1)
            {
                mCollection = UiSharedPrefs.getLeaderboardCollection(mParent);
            }
            mTimeSpan = mMetadataProvider.getTimeSpan();
            if (mTimeSpan == -1)
            {
                mTimeSpan = UiSharedPrefs.getLeaderboardTimespan(mParent);
            }
        }
        mUpsellCardAdapter = UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new Data(0x7f0b006c, 0x7f1001cd), 7, null);
        mSlimUpsellCardAdapter = new SlimGotItCardAdapter(mParent, new Data(0x7f0b0061, 0x7f020120, 0x7f1001b0, 0x7f1000bc), new com.google.android.gms.games.ui.card.OnyxGotItCardAdapter.GotItEventListener() );
        mLeaderboardScoreHeaderAdapter = new LeaderboardScoreHeaderAdapter(mParent, mCollection, mTimeSpan, this);
        mLeaderboardScoreHeaderAdapter.setVisible(false);
        mLeaderboardButterBarAdapter = new LeaderboardButterBarAdapter(mParent, this);
        mLeaderboardButterBarAdapter.setVisible(true);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        leaderboardbutterbaradapter = mLeaderboardButterBarAdapter;
        if (bundle.containsKey("BUTTERBAR_STATES"))
        {
            leaderboardbutterbaradapter.mButterbarStates = bundle.getIntArray("BUTTERBAR_STATES");
        }
        leaderboardbutterbaradapter.getVisibleButterbarIndex();
        JVM INSTR tableswitch 0 2: default 240
    //                   0 645
    //                   1 652
    //                   2 659;
           goto _L2 _L3 _L4 _L5
_L2:
        mLeaderboardEmptyAdapter = new LeaderboardEmptyAdapter(mParent, mParent.mConfiguration.isDestinationUi());
        mLeaderboardEmptyAdapter.setVisible(false);
        mLoadingAdapter = new LoadingAdapter(mParent);
        mLeaderboardScorePodiumAdapter = new LeaderboardScorePodiumAdapter(mParent, this);
        mLeaderboardScorePodiumAdapter.setVisible(false);
        mLeaderboardScoreAdapter = new LeaderboardScoreAdapter(mParent, this);
        mLeaderboardScoreAdapter.mOnEndOfWindowReachedListener = this;
        mShareGameAdapter = new ShareGameAdapter(mParent, this);
        mShareGameAdapter.setVisible(false);
        bundle = mParent.getResources();
        setEmptyViewElementsColor(bundle.getColor(0x106000b), bundle.getColor(0x7f0b0257));
        bundle = new Builder();
        bundle.addAdapter(mLeaderboardScoreHeaderAdapter);
        bundle.addAdapter(mUpsellCardAdapter);
        bundle.addAdapter(mSlimUpsellCardAdapter);
        bundle.addAdapter(mLeaderboardButterBarAdapter);
        bundle.addAdapter(mLeaderboardEmptyAdapter);
        bundle.addAdapter(mLoadingAdapter);
        bundle.addAdapter(mLeaderboardScorePodiumAdapter);
        bundle.addAdapter(mLeaderboardScoreAdapter);
        bundle.addAdapter(mShareGameAdapter);
        setAdapter(bundle.build());
        if (super.mPlayHeaderListLayout != null)
        {
            bundle = super.mPlayHeaderListLayout.mSwipeRefreshLayout;
            if (bundle != null)
            {
                bundle.setColorScheme(new int[] {
                    0x7f0b00a8, 0x7f0b00aa, 0x7f0b00ab, 0x7f0b00a9
                });
            }
        }
        if (PlatformVersion.checkVersion(21) && mParent.mConfiguration.isDestinationUi())
        {
            super.mActivity.getWindow().setStatusBarColor(UiUtils.interpolateColor(0xff000000, mGameThemeColor, 0.15F));
        }
        return;
_L3:
        leaderboardbutterbaradapter.showOfflineButterbar();
        continue; /* Loop/switch isn't completed */
_L4:
        leaderboardbutterbaradapter.showNonPublicPaclButterbar();
        continue; /* Loop/switch isn't completed */
_L5:
        leaderboardbutterbaradapter.showPaclServerWaitButterbar();
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void onCollectionChanged(int i)
    {
        if (i == mCollection)
        {
            return;
        } else
        {
            mCollection = i;
            setLoadingState();
            loadLeaderboardScores(false);
            return;
        }
    }

    public final void onEndOfWindowReached(int i)
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("LeaderboardScoreFrag", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            Games.Leaderboards.loadMoreScores(googleapiclient, (LeaderboardScoreBuffer)((DatabufferRecyclerAdapter) (mLeaderboardScoreAdapter)).mDataBuffer, PageSizeUtils.getMixedTilePageSize(mParent), i).setResultCallback(this);
            return;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        int i;
        i = 1;
        googleapiclient = Games.Players.getCurrentPlayer(googleapiclient);
        LeaderboardScoreHeaderAdapter leaderboardscoreheaderadapter = mLeaderboardScoreHeaderAdapter;
        leaderboardscoreheaderadapter.mCurrentPlayer = googleapiclient;
        leaderboardscoreheaderadapter.notifySingleItemChanged();
        if (!mParent.mIsPlusEnabled) goto _L2; else goto _L1
_L1:
        if (googleapiclient != null)
        {
            googleapiclient = googleapiclient.getPlayerId();
        } else
        {
            googleapiclient = null;
        }
        if (!TextUtils.isEmpty(googleapiclient)) goto _L4; else goto _L3
_L3:
        GamesLog.e("LeaderboardScoreFrag", "couldn't get current player ID; bailing out...");
        mParent.finish();
_L6:
        return;
_L4:
        LeaderboardScorePodiumAdapter leaderboardscorepodiumadapter = mLeaderboardScorePodiumAdapter;
        leaderboardscorepodiumadapter.mPlayerId = googleapiclient;
        if (leaderboardscorepodiumadapter.canBindView())
        {
            leaderboardscorepodiumadapter.notifySingleItemChanged();
        }
        mLeaderboardScoreAdapter.setCurrentPlayerId(googleapiclient);
_L14:
        String s;
        int j;
        int k;
        googleapiclient = mShareGameAdapter;
        s = mMetadataProvider.getGameName();
        String s1 = mMetadataProvider.getGamePackageName();
        googleapiclient.mGameName = s;
        googleapiclient.mGamePackageName = s1;
        googleapiclient.notifySingleItemChanged();
        loadLeaderboardScores(false);
        googleapiclient = mParent;
        s = mMetadataProvider.getLeaderboardId();
        j = mCollection;
        k = mTimeSpan;
        if (!(googleapiclient instanceof OnLogLeaderboardActionListener)) goto _L6; else goto _L5
_L5:
        j;
        JVM INSTR tableswitch 0 1: default 208
    //                   0 308
    //                   1 302;
           goto _L7 _L8 _L9
_L7:
        j = 0;
_L15:
        k;
        JVM INSTR tableswitch 0 2: default 240
    //                   0 243
    //                   1 314
    //                   2 320;
           goto _L10 _L11 _L12 _L13
_L11:
        break; /* Loop/switch isn't completed */
_L10:
        i = 0;
_L16:
        ((OnLogLeaderboardActionListener)googleapiclient).logLeaderboardAction(s, j, i);
        return;
_L2:
        if (!mCollectionSetBySavedState)
        {
            googleapiclient = mLeaderboardScoreHeaderAdapter;
            if (((LeaderboardScoreHeaderAdapter) (googleapiclient)).mCollection != 0)
            {
                googleapiclient.mCollection = 0;
                ((LeaderboardScoreHeaderAdapter) (googleapiclient)).mLeaderboardVariantControl.onCollectionChanged(((LeaderboardScoreHeaderAdapter) (googleapiclient)).mCollection);
                googleapiclient.notifySingleItemChanged();
            }
        }
          goto _L14
_L9:
        j = 2;
          goto _L15
_L8:
        j = 1;
          goto _L15
_L12:
        i = 2;
          goto _L16
_L13:
        i = 3;
          goto _L16
    }

    public final void onLeaderboardScoreClicked(Player player)
    {
        GamesUiConfiguration gamesuiconfiguration = mParent.mConfiguration;
        String s = gamesuiconfiguration.getCurrentPlayerId();
        boolean flag = player.getPlayerId().equals(s);
        if (gamesuiconfiguration.isDestinationUi())
        {
            if (flag)
            {
                UiUtils.viewMyProfile(mParent, player, null);
                return;
            } else
            {
                UiUtils.viewProfileComparison(mParent, player, null);
                return;
            }
        } else
        {
            UiUtils.showProfileSummaryDialog(mParent, player, flag);
            return;
        }
    }

    public final void onNonPublicPaclButterBarClicked()
    {
        PaclButterBarDialogFragment paclbutterbardialogfragment = new PaclButterBarDialogFragment();
        paclbutterbardialogfragment._mth4b1b893a(this);
        DialogFragmentUtil.show(mParent, paclbutterbardialogfragment, "nonPublicPaclButterBarDialog");
    }

    public final void onPause()
    {
        onPause();
        UiSharedPrefs.setLeaderboardTimespan(mParent, mTimeSpan);
    }

    public final void onPulledToRefresh()
    {
        setRefreshing$2563266(true);
        loadLeaderboardScores(true);
    }

    public final volatile void onResult(Result result)
    {
        LeaderboardScoreBuffer leaderboardscorebuffer;
        int i1;
        result = (com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult)result;
        i1 = result.getStatus().mStatusCode;
        leaderboardscorebuffer = result.getScores();
        boolean flag = canUseResult(result);
        if (!flag)
        {
            leaderboardscorebuffer.release();
            return;
        }
        Object obj;
        Object obj1;
        if (UiUtils.isNetworkError(i1))
        {
            mLeaderboardScoreAdapter.showFooterErrorState();
            mLeaderboardButterBarAdapter.showOfflineButterbar();
        }
        if (!super.mIsRefreshing)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        obj = super.mView.findViewById(0x102000a);
        obj1 = ((View) (obj)).getAnimation();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        ((Animation) (obj1)).cancel();
        UiUtils.slideViewToTop$5359d8d9(((View) (obj)));
        setRefreshing$2563266(false);
        obj1 = result.getLeaderboard();
        if (obj1 == null)
        {
            leaderboardscorebuffer.release();
            return;
        }
        obj = ((Leaderboard) (obj1)).getGame();
        result = "";
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        result = ((Leaderboard) (obj1)).getGame().getDisplayName();
        int l;
        LeaderboardEmptyAdapter leaderboardemptyadapter = mLeaderboardEmptyAdapter;
        int i = mCollection;
        l = mTimeSpan;
        leaderboardemptyadapter.mCollection = i;
        leaderboardemptyadapter.mTimeSpan = l;
        leaderboardemptyadapter.mGameName = result;
        leaderboardemptyadapter.notifySingleItemChanged();
        if (mLeaderboardName == null)
        {
            mLeaderboardName = ((Leaderboard) (obj1)).getDisplayName();
            result = mLeaderboardScoreHeaderAdapter;
            String s = mLeaderboardName;
            int j = mTimeSpan;
            android.net.Uri uri = ((Leaderboard) (obj1)).getIconImageUri();
            result.mLeaderboardName = s;
            result.mTimeSpan = j;
            result.mGameUri = uri;
            result.notifySingleItemChanged();
        }
        obj1 = ((Leaderboard) (obj1)).getVariants();
        l = ((ArrayList) (obj1)).size();
        int k = 0;
_L16:
        if (k >= l) goto _L2; else goto _L1
_L1:
        result = (LeaderboardVariant)((ArrayList) (obj1)).get(k);
        if (result.getCollection() != mCollection || mTimeSpan != result.getTimeSpan()) goto _L4; else goto _L3
_L3:
        Preconditions.checkNotNull(result, "Leaderboard variant must not be null.");
        if (result.getRawPlayerScore() != -1L)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (result.getPlayerRank() == -1L)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        mLeaderboardButterBarAdapter.clearButterbar(1);
        mLeaderboardButterBarAdapter.clearButterbar(2);
        if (k == 0 || l == 0) goto _L6; else goto _L5
_L5:
        if (mCollection != 0) goto _L6; else goto _L7
_L7:
        if (((Game) (obj)).getGameplayAclStatus() == 3)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (k == 0) goto _L9; else goto _L8
_L8:
        mLeaderboardButterBarAdapter.showPaclServerWaitButterbar();
_L6:
        obj = mLeaderboardScoreHeaderAdapter;
        obj.mLeaderboardVariant = result;
        ((LeaderboardScoreHeaderAdapter) (obj)).notifySingleItemChanged();
        long l1 = Math.max(1L, result.getNumScores());
        mLeaderboardScoreAdapter.setNumScores(l1);
        k = leaderboardscorebuffer.getCount();
        l = Math.min(k, 3);
        if (k <= 0) goto _L11; else goto _L10
_L10:
        obj1 = (LeaderboardScore)leaderboardscorebuffer.get(0).freeze();
        if (k <= 1) goto _L13; else goto _L12
_L12:
        result = (LeaderboardScore)leaderboardscorebuffer.get(1).freeze();
_L19:
        if (k <= 2) goto _L15; else goto _L14
_L14:
        obj = (LeaderboardScore)leaderboardscorebuffer.get(2).freeze();
_L20:
        LeaderboardScorePodiumAdapter leaderboardscorepodiumadapter = mLeaderboardScorePodiumAdapter;
        leaderboardscorepodiumadapter.mFirstScore = ((LeaderboardScore) (obj1));
        leaderboardscorepodiumadapter.mSecondScore = result;
        leaderboardscorepodiumadapter.mThirdScore = ((LeaderboardScore) (obj));
        if (leaderboardscorepodiumadapter.canBindView())
        {
            leaderboardscorepodiumadapter.notifySingleItemChanged();
        }
        result = mLeaderboardScorePodiumAdapter;
        if (k <= 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        result.mOnlyPodiumVisible = flag;
        mLeaderboardScorePodiumAdapter.setVisible(true);
        mLeaderboardEmptyAdapter.setVisible(false);
        result = mShareGameAdapter;
        if (k > 3)
        {
            break MISSING_BLOCK_LABEL_827;
        }
        if (mCollection != 1)
        {
            break MISSING_BLOCK_LABEL_827;
        }
        flag = true;
_L21:
        result.setVisible(flag);
_L18:
        mLeaderboardScoreAdapter.setStartOffset(l);
        mLeaderboardScoreAdapter.setDataBuffer(leaderboardscorebuffer);
        mLoadingAdapter.setVisible(false);
        mLeaderboardScoreHeaderAdapter.setVisible(true);
        result = mLeaderboardScoreAdapter;
        if (k <= 3 && k != 0)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        result.setAdapterVisible(flag);
        mLoadingDataViewManager.handleViewState(i1, k, true);
        return;
        result;
        leaderboardscorebuffer.release();
        throw result;
_L4:
        k++;
          goto _L16
_L9:
        if (!mParent.mConfiguration.isClientUi()) goto _L6; else goto _L17
_L17:
        mLeaderboardButterBarAdapter.showNonPublicPaclButterbar();
          goto _L6
_L11:
        mLeaderboardScorePodiumAdapter.setVisible(false);
        mLeaderboardEmptyAdapter.setVisible(true);
        mShareGameAdapter.setVisible(mParent.mIsPlusEnabled);
          goto _L18
_L2:
        result = null;
          goto _L3
_L13:
        result = null;
          goto _L19
_L15:
        obj = null;
          goto _L20
        flag = false;
          goto _L21
    }

    public final void onRetry()
    {
        loadLeaderboardScores(true);
        mLoadingDataViewManager.setViewState(1);
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        onSaveInstanceState(bundle);
        bundle.putInt("collection", mCollection);
        bundle.putInt("time_span", mTimeSpan);
        bundle.putIntArray("BUTTERBAR_STATES", mLeaderboardButterBarAdapter.mButterbarStates);
    }

    public final void onShareGameClicked(String s, String s1)
    {
        mParent.shareGame(s, s1);
    }

    public final void onTimeSpanChanged(int i)
    {
        if (i == mTimeSpan)
        {
            return;
        } else
        {
            mTimeSpan = i;
            loadLeaderboardScores(false);
            setLoadingState();
            return;
        }
    }

    public final boolean supportsPullToRefresh$134632()
    {
        return true;
    }


}
