// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.animation.Animator;
import android.app.SharedElementCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GameFirstPartyBuffer;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.game.GameBadge;
import com.google.android.gms.games.logging.LatencyLogger;
import com.google.android.gms.games.logging.LogflowUiUtils;
import com.google.android.gms.games.logging.LogflowViewUiElementNode;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.common.quests.DestinationQuestInboxHelper;
import com.google.android.gms.games.ui.common.quests.QuestInboxHelper;
import com.google.android.gms.games.ui.common.quests.QuestMetadataProvider;
import com.google.android.gms.games.ui.common.quests.QuestUiConfiguration;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivityBase;
import com.google.android.gms.games.ui.destination.DestinationMultiFragmentActivity;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.transition.BannerExpando;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter;
import com.google.android.gms.games.ui.util.LoadingDataViewManager;
import com.google.android.gms.games.ui.util.TabConfig;
import com.google.android.gms.games.ui.util.TabSpec;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.util.ExperimentUtils;
import com.google.android.gms.games.util.PackageUtils;
import com.google.android.play.animation.AnimationCompat;
import com.google.android.play.animation.BaseAnimatorListener;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.transition.BaseTransitionListener;
import com.google.android.play.transition.HeroReloadoHelper;
import com.google.android.play.transition.PlayTransitionUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailAboutFragment, GameDetailAchievementListFragment, GameDetailLeaderboardListFragment, GameDetailFriendsFragment, 
//            GameDetailQuestFragment

public final class GameDetailActivity extends DestinationMultiFragmentActivity
    implements android.view.View.OnClickListener, com.google.android.gms.common.images.ImageManager.OnImageLoadedListener, com.google.android.gms.games.ui.GamesUiConfiguration.CurrentGameProvider, com.google.android.gms.games.ui.common.quests.QuestInboxHelper.QuestInboxHelperProvider, QuestMetadataProvider, QuestUiConfiguration, com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment.QuestAccountSwitcherProvider, com.google.android.play.headerlist.PlayHeaderListLayout.LayoutListener
{
    private final class MuteUnmuteResultCallback
        implements ResultCallback
    {

        private final boolean mMute;
        final GameDetailActivity this$0;

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.Notifications.GameMuteStatusChangeResult)result;
            int i = result.getStatus().mStatusCode;
            boolean flag = result.isMuted();
            if (mMute != flag)
            {
                GamesLog.e(GameDetailActivity.TAG, (new StringBuilder("The mute status was not changed as it should have been. (")).append(i).append(")").toString());
                return;
            }
            if (mCurrentGame != null)
            {
                result = mCurrentGame.getDisplayName();
                GameDetailActivity gamedetailactivity = GameDetailActivity.this;
                int j;
                if (mMute)
                {
                    j = 0x7f1002c3;
                } else
                {
                    j = 0x7f1002c5;
                }
                result = gamedetailactivity.getString(j, new Object[] {
                    result
                });
            } else
            {
                result = GameDetailActivity.this;
                int k;
                if (mMute)
                {
                    k = 0x7f1002c4;
                } else
                {
                    k = 0x7f1002c6;
                }
                result = result.getString(k);
            }
            Toast.makeText(GameDetailActivity.this, result, 0).show();
            result = GameDetailActivity.this;
            if (!mIsMuted)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            result.mIsMuted = flag;
            adjustMuteUnmuteMenu();
        }

        MuteUnmuteResultCallback(boolean flag)
        {
            this$0 = GameDetailActivity.this;
            super();
            mMute = flag;
        }
    }

    private final class PackageBroadcastReceiver extends BroadcastReceiver
    {

        final GameDetailActivity this$0;

        public final void onReceive(Context context, Intent intent)
        {
            if (mCurrentGame != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            if (!"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()))
            {
                continue; /* Loop/switch isn't completed */
            }
            if ((context = intent.getData()) != null && context.getSchemeSpecificPart().equals(mCurrentGame.getInstancePackageName()))
            {
                mStateManager.mIsInstalled = true;
                mWaitingForInstallation;
                mStateManager.populateViews();
                return;
            }
            continue; /* Loop/switch isn't completed */
            if (!"android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) goto _L1; else goto _L3
_L3:
            context = intent.getData();
            if (context != null && context.getSchemeSpecificPart().equals(mCurrentGame.getInstancePackageName()))
            {
                mStateManager.mIsInstalled = false;
                mStateManager.populateViews();
                return;
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        private PackageBroadcastReceiver()
        {
            this$0 = GameDetailActivity.this;
            super();
        }

        PackageBroadcastReceiver(byte byte0)
        {
            this();
        }
    }


    private static final TabSpec ABOUT_TAB_SPEC;
    private static final TabSpec ACHIEVEMENTS_TAB_SPEC;
    private static long FAB_REVEAL_DURATION_MS = 400L;
    private static final TabSpec FRIENDS_TAB_SPEC;
    private static final TabSpec LEADERBOARDS_TAB_SPEC;
    private static final IntentFilter PACKAGE_ADDED_INTENT_FILTER;
    private static final IntentFilter PACKAGE_REMOVED_INTENT_FILTER;
    private static final TabSpec QUESTS_TAB_SPEC;
    private static final int QUEST_STATES[] = {
        6, 4, 3, 2, 1
    };
    private static final TabConfig TAB_CONFIG = new TabConfig();
    private static final String TAG = com/google/android/gms/games/ui/destination/games/GameDetailActivity.getSimpleName();
    private ArrayList attachedFragments;
    private boolean mAccessibilityEventRequired;
    private boolean mAdjustForGAR;
    private boolean mAllowFabToFloat;
    private Button mBuyInstallButton;
    String mCurrentAccountName;
    Game mCurrentGame;
    private String mCurrentGameId;
    private double mDurationDevMultiplier;
    private long mEnterDuration;
    private View mFabContainer;
    private long mFabRevealDuration;
    private View mFabSpacer;
    private LoadingImageView mGameBanner;
    private AnimationCompat mGameBannerCompat;
    private ImageView mGameBannerDropTarget;
    private TextView mGameDescription;
    private LoadingImageView mGameIcon;
    private TextView mGameSubtitle;
    private int mGameThemeColor;
    private Toolbar mGingerbreadToolbar;
    private View mGradientView;
    private View mInstallingProgressBar;
    private View mInstallingText;
    private boolean mIsInSharedElemTransition;
    private boolean mIsMuted;
    private boolean mIsSharedTransitionEntering;
    private boolean mIsWindowTransitionEntering;
    private LatencyLogger mLatencyLogger;
    private LoadingDataViewManager mLoadingDataViewManager;
    private Menu mMenu;
    private PackageBroadcastReceiver mPackageReceiver;
    private ImageView mPlayFab;
    private DestinationQuestInboxHelper mQuestInboxHelper;
    private ImageView mRecordFab;
    private long mReturnDuration;
    private int mSelectedTabIndex;
    private boolean mShouldLaunchSettingForRecording;
    private boolean mShouldShowPlayFab;
    private boolean mStartPostponedInitialRevealAllowed;
    final GameDetailStateManager mStateManager = new GameDetailStateManager();
    private int mTargetTabIndex;
    private SharedElementTransition mTransition;
    private View mUnavailableText;
    private View mViewUnderGameBanner;
    private boolean mWaitingForInstallation;

    public GameDetailActivity()
    {
        super(TAB_CONFIG, 0x7f040058, 0x7f120012);
        mShouldLaunchSettingForRecording = false;
        mIsMuted = false;
        mShouldShowPlayFab = true;
        mAllowFabToFloat = false;
        mIsSharedTransitionEntering = true;
        mIsWindowTransitionEntering = true;
        mIsInSharedElemTransition = false;
        mDurationDevMultiplier = 1.0D;
        attachedFragments = new ArrayList();
    }

    private void adjustMuteUnmuteMenu()
    {
        if (mMenu == null)
        {
            return;
        }
        MenuItem menuitem = mMenu.findItem(0x7f0d035f);
        if (mIsMuted)
        {
            menuitem.setTitle(0x7f1000dc);
            return;
        } else
        {
            menuitem.setTitle(0x7f1000db);
            return;
        }
    }

    private void bindViews(View view)
    {
        mGameIcon = (LoadingImageView)view.findViewById(0x7f0d0158);
        mBuyInstallButton = (Button)view.findViewById(0x7f0d015d);
        mBuyInstallButton.setTag(0x7f0d0061, new LogflowViewUiElementNode(504, (byte)0));
        if (TextUtils.isEmpty(mCurrentAccountName))
        {
            mBuyInstallButton.setEnabled(false);
        }
        mBuyInstallButton.setOnClickListener(this);
        mInstallingText = view.findViewById(0x7f0d015e);
        mInstallingProgressBar = view.findViewById(0x7f0d015f);
        mUnavailableText = view.findViewById(0x7f0d0161);
        mGameDescription = (TextView)view.findViewById(0x7f0d015a);
        mGameSubtitle = (TextView)view.findViewById(0x7f0d015b);
        mFabSpacer = view.findViewById(0x7f0d0160);
        view = view.findViewById(0x7f0d0157);
        if (PlatformVersion.checkVersion(11))
        {
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            layoutparams.height = mPlayHeaderListLayout.getTabBarHeight();
            view.setLayoutParams(layoutparams);
        } else
        {
            view.setVisibility(8);
        }
        if (mTransition != null)
        {
            mTransition.initSharedView(mGameIcon, "icon");
        }
    }

    private LoadingImageView createBackgroundView()
    {
        LoadingImageView loadingimageview = new LoadingImageView(this);
        loadingimageview.setId(0x7f0d0027);
        return loadingimageview;
    }

    private View createGradientView()
    {
        View view = new View(this);
        Object obj = getResources();
        int i = ((Resources) (obj)).getColor(0x7f0b005b);
        int j = ((Resources) (obj)).getColor(0x106000d);
        obj = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            i, j
        });
        if (PlatformVersion.checkVersion(16))
        {
            view.setBackground(((Drawable) (obj)));
        } else
        {
            view.setBackgroundDrawable(((Drawable) (obj)));
        }
        view.setId(0x7f0d0029);
        return view;
    }

    private static View createHeroView(LayoutInflater layoutinflater)
    {
        return layoutinflater.inflate(0x7f040059, null, false);
    }

    private transient Animation fadeViews(boolean flag, long l, int ai[])
    {
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), 0x10a0000);
        animation.setDuration(l);
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            View view = findViewById(ai[i]);
            if (view != null)
            {
                view.setAnimation(animation);
                view.setVisibility(0);
            }
        }

        return animation;
    }

    private int getActualBannerHeight(Resources resources)
    {
        Display display = ((WindowManager)getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        int k = (int)(((float)displaymetrics.widthPixels * 500F) / 1024F);
        int i;
        int j;
        if (displaymetrics.heightPixels < displaymetrics.widthPixels)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i = k;
        if (j != 0)
        {
            i = (int)((float)k * 0.5F);
        }
        j = i;
        if (resources.getBoolean(0x7f0a000f))
        {
            j = (int)((float)i * 0.7F);
        }
        i = j;
        if (!PlatformVersion.checkVersion(11))
        {
            i = (int)((float)j * 0.6F);
        }
        return i;
    }

    private void populateBasicHeaderViews()
    {
        if (mCurrentGame != null)
        {
            GameFirstParty gamefirstparty = mStateManager.mCurrentExtendedGame;
            SnapshotMetadata snapshotmetadata = null;
            if (gamefirstparty != null)
            {
                snapshotmetadata = gamefirstparty.getSnapshot();
            }
            if (PlatformVersion.checkVersion(11))
            {
                setTitle(mCurrentGame.getDisplayName());
                setSubtitle(mCurrentGame.getDeveloperName());
                if (snapshotmetadata != null)
                {
                    setSubtitle(snapshotmetadata.getDescription());
                }
                if (mAccessibilityEventRequired)
                {
                    getWindow().getDecorView().sendAccessibilityEvent(32);
                    mAccessibilityEventRequired = false;
                }
            }
            if (mGameBanner != null)
            {
                Uri uri1 = mCurrentGame.getFeaturedImageUri();
                Uri uri = uri1;
                if (snapshotmetadata != null)
                {
                    Uri uri2 = snapshotmetadata.getCoverImageUri();
                    uri = uri1;
                    if (uri2 != null)
                    {
                        uri = uri2;
                    }
                }
                mGameBanner.mOnImageLoadedListener = this;
                mGameBanner.loadUri$3329f911(uri, 0x7f0201e0, true);
            }
            if (mGameIcon != null)
            {
                mGameIcon.loadUri$3329f911(mCurrentGame.getHiResImageUri(), 0x7f0200da, false);
            }
            if (mGameDescription != null)
            {
                mGameDescription.setText(mCurrentGame.getDisplayName());
            }
            if (mGameSubtitle != null)
            {
                mGameSubtitle.setText(mCurrentGame.getDeveloperName());
                if (snapshotmetadata != null)
                {
                    mGameSubtitle.setText(snapshotmetadata.getDescription());
                }
            }
        }
    }

    private void populatePlayPurchaseViews()
    {
        Object obj;
        if (mStateManager.mIsInstalled)
        {
            if (mShouldShowPlayFab)
            {
                showFabs();
            }
            mBuyInstallButton.setVisibility(8);
            mInstallingText.setVisibility(8);
            mInstallingProgressBar.setVisibility(8);
            mUnavailableText.setVisibility(8);
            return;
        }
        mFabContainer.setVisibility(4);
        mFabSpacer.setVisibility(8);
        obj = mStateManager.mCurrentExtendedGame;
        if (mWaitingForInstallation)
        {
            mBuyInstallButton.setVisibility(8);
            mInstallingText.setVisibility(0);
            mInstallingProgressBar.setVisibility(0);
            mUnavailableText.setVisibility(8);
            return;
        }
        if (obj == null)
        {
            mBuyInstallButton.setVisibility(8);
            mInstallingText.setVisibility(8);
            mInstallingProgressBar.setVisibility(8);
            mUnavailableText.setVisibility(8);
            return;
        }
        if (((GameFirstParty) (obj)).getAvailability() != 0) goto _L2; else goto _L1
_L1:
        mBuyInstallButton.setVisibility(0);
        mInstallingText.setVisibility(8);
        mInstallingProgressBar.setVisibility(8);
        mUnavailableText.setVisibility(8);
        if (!((GameFirstParty) (obj)).isOwned()) goto _L4; else goto _L3
_L3:
        obj = getString(0x7f1000d9);
_L5:
        mBuyInstallButton.setText(((CharSequence) (obj)));
        return;
_L4:
        String s = ((GameFirstParty) (obj)).getFormattedPrice();
        obj = s;
        if (s != null)
        {
            obj = s.toUpperCase(getResources().getConfiguration().locale);
        }
        if (true) goto _L5; else goto _L2
_L2:
        mBuyInstallButton.setVisibility(8);
        mInstallingText.setVisibility(8);
        mInstallingProgressBar.setVisibility(8);
        mUnavailableText.setVisibility(0);
        return;
    }

    private void positionFabs(int i)
    {
label0:
        {
            Resources resources = getResources();
            android.support.v4.widget.DrawerLayout.LayoutParams layoutparams = (android.support.v4.widget.DrawerLayout.LayoutParams)mFabContainer.getLayoutParams();
            float f = 0.5F * (float)resources.getDimensionPixelSize(0x7f0c00c5);
            int j = getActualBannerHeight(resources);
            int l = (int)f;
            getActualBannerHeight(resources);
            getActionBarHeight();
            resources.getDimensionPixelSize(0x7f0c00c4);
            i = j - l - i;
            layoutparams.setMargins(0, i, 0, 0);
            mFabContainer.setLayoutParams(layoutparams);
            if (PlatformVersion.checkVersion(11))
            {
                int k = mPlayHeaderListLayout.mToolbarHeight;
                if ((float)i >= (float)k + f)
                {
                    break label0;
                }
                f = Math.max((float)(i - k) / f, 0.0F);
                if (f >= 0.0F && f < 1.0F)
                {
                    mPlayFab.setAlpha(f);
                    mRecordFab.setAlpha(f);
                }
            }
            return;
        }
        mPlayFab.setAlpha(1.0F);
        mRecordFab.setAlpha(1.0F);
    }

    private void revealFabAnimation(ImageView imageview)
    {
        ScaleAnimation scaleanimation = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, 1, 0.5F, 1, 0.5F);
        scaleanimation.setInterpolator(new DecelerateInterpolator());
        scaleanimation.setDuration(mFabRevealDuration);
        imageview.startAnimation(scaleanimation);
    }

    private void setBackgroundViewProps(LoadingImageView loadingimageview)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)loadingimageview.getLayoutParams();
        layoutparams.width = -1;
        layoutparams.height = getActualBannerHeight(getResources());
        loadingimageview.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        loadingimageview.setLayoutParams(layoutparams);
    }

    private void setGradientViewProps(View view)
    {
        view = view.getLayoutParams();
        view.width = -1;
        view.height = getResources().getDimensionPixelSize(0x7f0c00bd);
    }

    private void setupCommonEnterExitAnims()
    {
        if (!PlatformVersion.checkVersion(21))
        {
            return;
        }
        mIsInSharedElemTransition = true;
        mShouldShowPlayFab = false;
        mPlayFab.setTransitionName("playFab");
        mRecordFab.setTransitionName("recordFab");
        PlayTransitionUtil.setHeaderListLayoutClipChildren$72cb25e2(mPlayHeaderListLayout);
        getWindow().setAllowEnterTransitionOverlap(true);
        if (1 != mTransition.mAnimation) goto _L2; else goto _L1
_L1:
        mEnterDuration = Math.round(450D * mDurationDevMultiplier);
        mReturnDuration = Math.round(350D * mDurationDevMultiplier);
_L4:
        mViewUnderGameBanner.setVisibility(0);
        return;
_L2:
        if (2 == mTransition.mAnimation)
        {
            mEnterDuration = Math.round((double)BannerExpando.DEFAULT_ENTER_DURATION_MS * mDurationDevMultiplier);
            mReturnDuration = Math.round((double)BannerExpando.DEFAULT_RETURN_DURATION_MS * mDurationDevMultiplier);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void showFabs()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (mFabContainer.getVisibility() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || mPlayFab.getVisibility() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 || mRecordFab.getVisibility() != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (PlatformVersion.checkVersion(21) && getGoogleApiClient().isConnected() && ExperimentUtils.ENABLE_VIDEO_RECORDING.get(getGoogleApiClient()))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        mFabContainer.setVisibility(0);
        mFabSpacer.setVisibility(4);
        mPlayFab.setVisibility(0);
        if (flag)
        {
            revealFabAnimation(mPlayFab);
        }
        if (flag2)
        {
            mRecordFab.setVisibility(0);
            if (flag1)
            {
                revealFabAnimation(mRecordFab);
            }
            return;
        } else
        {
            mRecordFab.setVisibility(8);
            return;
        }
    }

    public final void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        mGameBanner = createBackgroundView();
        mGameBannerCompat = new AnimationCompat(mGameBanner);
        mGameBanner.setBackgroundColor(mGameThemeColor);
        layoutinflater = new FrameLayout(this);
        layoutinflater.setId(0x7f0d0025);
        if (PlatformVersion.checkVersion(21))
        {
            layoutinflater.setTransitionGroup(true);
        }
        mViewUnderGameBanner = new View(this);
        mViewUnderGameBanner.setId(0x7f0d0026);
        mViewUnderGameBanner.setBackgroundColor(mGameThemeColor);
        mViewUnderGameBanner.setVisibility(8);
        layoutinflater.addView(mViewUnderGameBanner);
        layoutinflater.addView(mGameBanner);
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)mViewUnderGameBanner.getLayoutParams();
        layoutparams.width = -1;
        layoutparams.height = getHeaderHeight(this);
        mGradientView = createGradientView();
        layoutinflater.addView(mGradientView);
        viewgroup.addView(layoutinflater);
        setBackgroundViewProps(mGameBanner);
        setGradientViewProps(mGradientView);
        populateBasicHeaderViews();
    }

    public final void addHeroView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = createHeroView(layoutinflater);
        viewgroup.addView(layoutinflater);
        bindViews(layoutinflater);
    }

    public final boolean alwaysUseFloatingBackground()
    {
        return false;
    }

    protected final int getActionBarColor()
    {
        return mGameThemeColor;
    }

    public final float getBackgroundViewParallaxRatio()
    {
        return 1.0F;
    }

    public final Game getCurrentGame()
    {
        return mCurrentGame;
    }

    public final Drawable getFloatingControlsBackground()
    {
        return new ColorDrawable(mGameThemeColor);
    }

    public final int getHeaderHeight(Context context)
    {
        context = getResources();
        int i = getActualBannerHeight(context);
        if (PlatformVersion.checkVersion(11))
        {
            return context.getDimensionPixelSize(0x7f0c00c3) + i + mPlayHeaderListLayout.getTabBarHeight();
        } else
        {
            return context.getDimensionPixelSize(0x7f0c00c3) + i;
        }
    }

    public final int getPlayHeaderTabMode()
    {
        return 0;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.QuestChangeAccountDialogFragment.QuestAccountSwitcher getQuestAccountSwitcher()
    {
        return mQuestInboxHelper;
    }

    public final QuestInboxHelper getQuestInboxHelper()
    {
        return mQuestInboxHelper;
    }

    public final int[] getQuestSelectors()
    {
        return QUEST_STATES;
    }

    public final int getTabPaddingMode()
    {
        return 1;
    }

    public final int getToolbarTitleMode()
    {
        return 0;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f04005a;
    }

    public final boolean hasPlayHeader()
    {
        return PlatformVersion.checkVersion(11);
    }

    public final boolean hasViewPager()
    {
        return true;
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 2002 && j == -1)
        {
            mShouldLaunchSettingForRecording = true;
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public final void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if (mStartPostponedInitialRevealAllowed)
        {
            if (fragment instanceof GamesHeaderRecyclerViewFragment)
            {
                ((GamesHeaderRecyclerViewFragment)fragment).startPostponedInitialReveal();
            }
            return;
        } else
        {
            attachedFragments.add(fragment);
            return;
        }
    }

    public final void onBackPressed()
    {
        if (mTransition != null && 2 == mTransition.mAnimation)
        {
            getWindow().setSharedElementsUseOverlay(false);
        }
        if (mPlayHeaderListLayout != null)
        {
            View view = mPlayHeaderListLayout.findViewById(0x7f0d0319);
            if (PlatformVersion.checkVersion(16))
            {
                view.setBackground(null);
            } else
            {
                view.setBackgroundDrawable(null);
            }
        }
        super.onBackPressed();
    }

    public final void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            super.onClick(view);
            return;

        case 2131558828: 
            logClickEvent(1148, view);
            super.mPlayLogger.logGameAction(mCurrentGame, 1, true);
            UiUtils.launchGame(this, mCurrentGame, null);
            return;

        case 2131558827: 
            logClickEvent(1154, view);
            PrebuiltDialogs.showVideoRecordingPrerecordDialog(this, mCurrentGame.getApplicationId(), mCurrentGame.getInstancePackageName(), null);
            return;

        case 2131558749: 
            break;
        }
        if (!TextUtils.isEmpty(mCurrentAccountName))
        {
            logClickEvent(1147, view);
            if (((Boolean)G.useInAppPurchaseFlow.get()).booleanValue())
            {
                GamesLog.d(TAG, "OnClick: Launch the finsky buy/install process");
                launchFinskyLightInstallation(mCurrentAccountName, mCurrentGame.getInstancePackageName());
                return;
            } else
            {
                UiUtils.viewInPlayStore(this, mCurrentGame.getInstancePackageName(), "GPG_gameDetail_about");
                return;
            }
        } else
        {
            GamesLog.w(TAG, "onClick: mCurrentAccountName is null!");
            return;
        }
    }

    public final void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        bundle = getGoogleApiClient();
        mLatencyLogger.onConnected(bundle);
        mCurrentAccountName = Games.getCurrentAccountName(bundle);
        mBuyInstallButton.setEnabled(true);
        mStateManager.makeNextRequest();
        if (mShouldLaunchSettingForRecording)
        {
            PrebuiltDialogs.showVideoRecordingPrerecordDialog(this, mCurrentGame.getApplicationId(), mCurrentGame.getInstancePackageName(), null);
            mShouldLaunchSettingForRecording = false;
        }
    }

    public final void onCreate(final Bundle res)
    {
        final Object heroContainerView = getIntent();
        mGameThemeColor = ((Intent) (heroContainerView)).getIntExtra("com.google.android.gms.games.EXTRA_GAME_THEME_COLOR", getResources().getColor(0x7f0b0257));
        if (PlatformVersion.checkVersion(21))
        {
            mTransition = new SharedElementTransition(((Intent) (heroContainerView)));
            if (mTransition.mAnimation == 0)
            {
                mTransition = null;
            }
        }
        super.onCreate(res);
        mLatencyLogger = LatencyLogger.createDestAppLatencyLogger(this, 2);
        mQuestInboxHelper = new DestinationQuestInboxHelper(this);
        final Object containerView;
        int i;
        if (PlatformVersion.checkVersion(11))
        {
            i = mPlayHeaderListLayout.mHeaderHeight;
        } else
        {
            i = 0;
        }
        mLoadingDataViewManager = new LoadingDataViewManager(findViewById(0x7f0d0162), 0x7f0d01b7, 0x7f0d01b4, 0x7f0d0166, 0x7f0d01ae, mStateManager, i);
        if (res != null)
        {
            mCurrentGame = (Game)res.getParcelable("savedStateGame");
            mCurrentGameId = res.getString("savedStateGameId");
            heroContainerView = (GameFirstParty)res.getParcelable("savedStateExtendedGame");
            mStateManager.mCurrentExtendedGame = ((GameFirstParty) (heroContainerView));
            mIsMuted = res.getBoolean("savedStateIsMuted");
            mWaitingForInstallation = res.getBoolean("savedStateWaitingForInstall");
            mSelectedTabIndex = res.getInt("savedStateSelectedTab");
        } else
        {
            containerView = (GameFirstParty)((Intent) (heroContainerView)).getParcelableExtra("com.google.android.gms.games.EXTENDED_GAME");
            mStateManager.mCurrentExtendedGame = ((GameFirstParty) (containerView));
            if (containerView == null)
            {
                mCurrentGame = (Game)((Intent) (heroContainerView)).getParcelableExtra("com.google.android.gms.games.GAME");
            } else
            {
                mCurrentGame = ((GameFirstParty) (containerView)).getGame();
            }
            if (mCurrentGame == null)
            {
                mCurrentGameId = ((Intent) (heroContainerView)).getStringExtra("com.google.android.gms.games.GAME_ID");
            } else
            {
                mCurrentGameId = mCurrentGame.getApplicationId();
                mIsMuted = mCurrentGame.isMuted();
            }
            mSelectedTabIndex = -1;
            mTargetTabIndex = ((Intent) (heroContainerView)).getIntExtra("com.google.android.gms.games.TAB", -1);
        }
        setTitle("");
        if (mCurrentGame != null)
        {
            updateTaskDescription(mCurrentGame.getDisplayName());
        }
        if (!PlatformVersion.checkVersion(11))
        {
            Object obj1 = LayoutInflater.from(this);
            heroContainerView = new FrameLayout(this);
            View view = createHeroView(((LayoutInflater) (obj1)));
            obj1 = createBackgroundView();
            mGradientView = createGradientView();
            populateBasicHeaderViews();
            mGameBanner = ((LoadingImageView) (obj1));
            mGameBannerCompat = new AnimationCompat(mGameBanner);
            mGameBanner.setBackgroundColor(mGameThemeColor);
            ViewGroup viewgroup = (ViewGroup)findViewById(0x7f0d0162);
            ((FrameLayout) (heroContainerView)).addView(((View) (obj1)));
            ((FrameLayout) (heroContainerView)).addView(mGradientView);
            ((FrameLayout) (heroContainerView)).addView(view);
            viewgroup.addView(((View) (heroContainerView)), 0);
            heroContainerView = ((FrameLayout) (heroContainerView)).getLayoutParams();
            heroContainerView.width = -1;
            heroContainerView.height = getHeaderHeight(this);
            setBackgroundViewProps(((LoadingImageView) (obj1)));
            setGradientViewProps(mGradientView);
            bindViews(viewgroup);
            heroContainerView = findViewById(0x7f0d0156);
            obj1 = (android.widget.RelativeLayout.LayoutParams)((View) (heroContainerView)).getLayoutParams();
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).setMargins(0, getActualBannerHeight(getResources()), 0, 0);
            ((View) (heroContainerView)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            mGingerbreadToolbar = (Toolbar)findViewById(0x7f0d0155);
            mGingerbreadToolbar.setVisibility(0);
            setSupportActionBar(mGingerbreadToolbar);
            onSetActionBar();
        } else
        {
            mPlayHeaderListLayout.mLayoutListener = this;
        }
        setActionBarAlpha(0);
        heroContainerView = findViewById(0x7f0d0156);
        ((View) (heroContainerView)).setBackgroundColor(mGameThemeColor);
        findViewById(0x7f0d0157).setBackgroundColor(mGameThemeColor);
        heroContainerView = ((View) (heroContainerView)).getRootView();
        if (((View) (heroContainerView)).getTag(0x7f0d0061) == null)
        {
            ((View) (heroContainerView)).setTag(0x7f0d0061, new LogflowViewUiElementNode(44, (byte)0));
            LogflowUiUtils.attachDocumentId(((View) (heroContainerView)), mCurrentGame);
        }
        mFabRevealDuration = Math.round((double)FAB_REVEAL_DURATION_MS * mDurationDevMultiplier);
        heroContainerView = (DrawerLayout)findViewById(0x7f0d0147);
        heroContainerView.mScrimColor = 0x33000000;
        ((DrawerLayout) (heroContainerView)).invalidate();
        mFabContainer = getLayoutInflater().inflate(0x7f04007f, null, false);
        mFabContainer.setVisibility(4);
        mPlayFab = (ImageView)mFabContainer.findViewById(0x7f0d01ac);
        mRecordFab = (ImageView)mFabContainer.findViewById(0x7f0d01ab);
        containerView = UiUtils.constructColorButtonBackground$548e7414(-1, getResources().getColor(0x7f0b00cb));
        i = PowerUpUtils.getBrighterColor$255e745(mGameThemeColor);
        mPlayFab.getDrawable().setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_ATOP);
        mFabSpacer.setVisibility(4);
        if (PlatformVersion.checkVersion(16))
        {
            mPlayFab.setBackground(((Drawable) (containerView)));
        } else
        {
            mPlayFab.setBackgroundDrawable(((Drawable) (containerView)));
        }
        mPlayFab.setOnClickListener(this);
        if (PlatformVersion.checkVersion(21))
        {
            mRecordFab.setOnClickListener(this);
        } else
        {
            mRecordFab.setVisibility(8);
        }
        i = ((DrawerLayout) (heroContainerView)).indexOfChild(((DrawerLayout) (heroContainerView)).findViewById(0x7f0d0347));
        ((DrawerLayout) (heroContainerView)).addView(mFabContainer, i);
        ViewCompat.setImportantForAccessibility(mFabContainer, 1);
        positionFabs(0);
        if (mTransition != null && res == null)
        {
            if (1 == mTransition.mAnimation)
            {
                setupCommonEnterExitAnims();
                if (PlatformVersion.checkVersion(21))
                {
                    res = getResources();
                    Object obj2 = findViewById(0x7f0d0158);
                    heroContainerView = (ViewGroup)mPlayHeaderListLayout.findViewById(0x7f0d031a);
                    containerView = (ViewGroup)findViewById(0x7f0d0162);
                    final ViewGroup backgroundView = (ViewGroup)mPlayHeaderListLayout.findViewById(0x7f0d0317);
                    ((ViewGroup) (containerView)).setTransitionGroup(true);
                    ((ViewGroup) (heroContainerView)).setTransitionGroup(true);
                    TransitionSet transitionset = HeroReloadoHelper.sharedElementTransition(this, ((View) (obj2)), backgroundView, true, true).setDuration(mEnterDuration);
                    getWindow().setSharedElementEnterTransition(transitionset);
                    obj2 = HeroReloadoHelper.sharedElementTransition(this, ((View) (obj2)), backgroundView, true, false).setDuration(mReturnDuration);
                    getWindow().setSharedElementReturnTransition(((Transition) (obj2)));
                    mPlayHeaderListLayout.findViewById(0x7f0d031b).setTransitionName("tab_bar");
                    setEnterSharedElementCallback(new SharedElementCallback() );
                    transitionset.addListener(new BaseTransitionListener() {

                        final GameDetailActivity this$0;
                        final ViewGroup val$heroContainerView;

                        public final void onTransitionEnd(Transition transition)
                        {
                            if (isFinishing() || isDestroyed())
                            {
                                return;
                            }
                            findViewById(0x7f0d0156).setBackgroundColor(mGameThemeColor);
                            mShouldShowPlayFab;
                            if (mStateManager.mIsInstalled)
                            {
                                showFabs();
                            }
                            transition = new ArrayList();
                            transition.add(Integer.valueOf(0x7f0d0159));
                            transition.add(Integer.valueOf(0x7f0d015c));
                            transition.add(Integer.valueOf(0x7f0d0161));
                            transition.add(Integer.valueOf(0x7f0d0157));
                            transition.add(Integer.valueOf(0x7f0d0027));
                            if (!mAdjustForGAR)
                            {
                                transition.add(Integer.valueOf(0x7f0d0029));
                            }
                            transition.add(Integer.valueOf(0x7f0d031d));
                            int ai[] = new int[
// JavaClassFileOutputException: get_local_var: index out of range

            
            {
                this$0 = GameDetailActivity.this;
                heroContainerView = viewgroup;
                super();
            }
                    });
                }
            } else
            if (2 == mTransition.mAnimation)
            {
                setupCommonEnterExitAnims();
                if (PlatformVersion.checkVersion(21))
                {
                    res = getResources();
                    findViewById(0x7f0d0153).setVisibility(0);
                    mGameBannerDropTarget = (ImageView)findViewById(0x7f0d0028);
                    Object obj = (android.widget.FrameLayout.LayoutParams)mGameBannerDropTarget.getLayoutParams();
                    ((android.widget.FrameLayout.LayoutParams) (obj)).setMargins(0, getActualBannerHeight(res) / 2 - res.getDimensionPixelSize(0x7f0c0071) / 2, 0, 0);
                    mGameBannerDropTarget.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                    obj = BannerExpando.sharedElementEnterTransition$7d835b49(this, mGameBannerDropTarget).setDuration(mEnterDuration);
                    getWindow().setSharedElementEnterTransition(((Transition) (obj)));
                    final ViewGroup heroContainerView = (ViewGroup)mPlayHeaderListLayout.findViewById(0x7f0d031a);
                    final ViewGroup containerView = (ViewGroup)findViewById(0x7f0d0162);
                    final ViewGroup backgroundView = (ViewGroup)mPlayHeaderListLayout.findViewById(0x7f0d0317);
                    mPlayHeaderListLayout.findViewById(0x7f0d031b).setTransitionName("tab_bar");
                    setEnterSharedElementCallback(new SharedElementCallback() );
                    ((Transition) (obj)).addListener(new BaseTransitionListener() {

                        final GameDetailActivity this$0;

                        public final void onTransitionEnd(Transition transition)
                        {
                            while (isDestroyed() || !mIsWindowTransitionEntering) 
                            {
                                return;
                            }
                            mIsWindowTransitionEntering;
                            mGameBannerDropTarget.setAlpha(0.0F);
                            mGameBannerDropTarget.setClipToOutline(false);
                            findViewById(0x7f0d0156).setBackgroundColor(mGameThemeColor);
                            mShouldShowPlayFab;
                            mViewUnderGameBanner.setVisibility(0);
                            if (mStateManager.mIsInstalled)
                            {
                                showFabs();
                            }
                            transition = new ArrayList();
                            transition.add(Integer.valueOf(0x7f0d0159));
                            transition.add(Integer.valueOf(0x7f0d015c));
                            transition.add(Integer.valueOf(0x7f0d0161));
                            transition.add(Integer.valueOf(0x7f0d0157));
                            transition.add(Integer.valueOf(0x7f0d031d));
                            transition.add(Integer.valueOf(0x7f0d0158));
                            if (!mAdjustForGAR)
                            {
                                transition.add(Integer.valueOf(0x7f0d0029));
                            }
                            int ai[] = new int[
// JavaClassFileOutputException: get_local_var: index out of range

            
            {
                this$0 = GameDetailActivity.this;
                super();
            }
                    });
                }
            }
        }
        if (mIsInSharedElemTransition)
        {
            mLatencyLogger.ensureStarted(new int[0]);
            return;
        } else
        {
            mLatencyLogger.ensureStarted(new int[] {
                3, 4
            });
            return;
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu)
    {
        onCreateOptionsMenu(menu);
        mMenu = menu;
        adjustMuteUnmuteMenu();
        return true;
    }

    public final void onDestroy()
    {
        GameDetailStateManager gamedetailstatemanager = mStateManager;
        if (gamedetailstatemanager.mFriendsBuffer != null)
        {
            gamedetailstatemanager.mFriendsBuffer.release();
            gamedetailstatemanager.mFriendsBuffer = null;
        }
        onDestroy();
    }

    public final void onFinskyLightInstallationCompleted(String s)
    {
        if (s.equals(mCurrentGame.getInstancePackageName()))
        {
            mWaitingForInstallation = false;
            mStateManager.mIsInstalled = true;
            populatePlayPurchaseViews();
        }
    }

    public final void onFinskyLightInstallationStarted(String s)
    {
        if (s.equals(mCurrentGame.getInstancePackageName()))
        {
            mWaitingForInstallation = true;
            populatePlayPurchaseViews();
        }
    }

    public final void onImageLoaded$482c40fe(Drawable drawable)
    {
        if (drawable != null)
        {
            drawable = ((BitmapDrawable)drawable).getBitmap();
            int i = drawable.getWidth() / 4;
            int j = PlayHeaderListLayout.getMinimumHeaderHeight(this, 2, 0);
            double d = UiUtils.computeAverageLuminance(drawable, new Rect(0, 0, i, j));
            double d1 = UiUtils.computeAverageLuminance(drawable, new Rect(drawable.getWidth() - i, 0, drawable.getWidth(), j));
            if (d > 214D || d1 > 214D)
            {
                mGradientView.setVisibility(8);
                mAdjustForGAR = true;
                if (PlatformVersion.checkVersion(11))
                {
                    drawable = mPlayHeaderListLayout.getActionBarView();
                } else
                {
                    drawable = mGingerbreadToolbar;
                }
                UiUtils.adjustForGar(drawable, 0);
                return;
            }
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        boolean flag = false;
        int i = menuitem.getItemId();
        if (i == 0x7f0d035f)
        {
            logClickEvent(577);
            if (!mIsMuted)
            {
                flag = true;
            }
            menuitem = getGoogleApiClient();
            if (!UiUtils.checkClientDisconnected(menuitem, this))
            {
                if (flag)
                {
                    menuitem = Games.Notifications.muteGameInternal(menuitem, mCurrentGameId);
                } else
                {
                    menuitem = Games.Notifications.unmuteGameInternal(menuitem, mCurrentGameId);
                }
                menuitem.setResultCallback(new MuteUnmuteResultCallback(flag));
            }
            return true;
        }
        if (i == 0x7f0d035e)
        {
            logClickEvent(576);
            if (mCurrentGame != null)
            {
                shareGame(mCurrentGame.getDisplayName(), mCurrentGame.getInstancePackageName());
                return true;
            } else
            {
                Toast.makeText(this, getString(0x7f100165), 0).show();
                return true;
            }
        } else
        {
            return onOptionsItemSelected(menuitem);
        }
    }

    public final void onPause()
    {
        onPause();
        mSelectedTabIndex = super.mViewPager.mCurItem;
        if (mPackageReceiver != null)
        {
            unregisterReceiver(mPackageReceiver);
            mPackageReceiver = null;
        }
    }

    public final void onPlayHeaderListLayoutChanged()
    {
        Resources resources = getResources();
        int j = mPlayHeaderListLayout.getTabBarHeight();
        int k = mPlayHeaderListLayout.mToolbarHeight;
        int l = resources.getDimensionPixelSize(0x7f0c00c3);
        int i1 = getHeaderHeight(this);
        int i = i1 - j - k - l;
        float f2 = mPlayHeaderListLayout.getVisibleHeaderHeight();
        float f1 = f2 - (float)j - (float)k - (float)l;
        float f = f1;
        if (f1 > (float)i)
        {
            f = i;
        }
        positionFabs(i - (int)f);
        f1 = f2 / (float)i1;
        mGameBannerCompat.setTranslationY((int)((float)i1 * (1.0F - f1) * 0.3F));
        Window window = getWindow();
        j = UiUtils.interpolateColor(0xff000000, mGameThemeColor, 0.15F);
        k = resources.getColor(0x7f0b0253);
        if (f > 0.0F)
        {
            f = 255F * (1.0F - f / (float)i);
            setActionBarAlpha((int)f);
            if (mAdjustForGAR)
            {
                UiUtils.adjustForGar(mPlayHeaderListLayout.getActionBarView(), (int)f);
            }
            i = (int)f;
            if (PlatformVersion.checkVersion(21))
            {
                window.setStatusBarColor(UiUtils.interpolateColor(j, k, (float)i / 255F));
            }
        } else
        {
            setActionBarAlpha(255);
            if (PlatformVersion.checkVersion(21))
            {
                window.setStatusBarColor(j);
                return;
            }
        }
    }

    public final boolean onPrepareOptionsMenu(Menu menu)
    {
        onPrepareOptionsMenu(menu);
        if (mAdjustForGAR && PlatformVersion.checkVersion(11) && mPlayHeaderListLayout != null)
        {
            UiUtils.adjustForGar(mPlayHeaderListLayout.getActionBarView(), 0);
        }
        return true;
    }

    public final void onResume()
    {
        onResume();
        if (mPackageReceiver == null)
        {
            mPackageReceiver = new PackageBroadcastReceiver((byte)0);
            registerReceiver(mPackageReceiver, PACKAGE_REMOVED_INTENT_FILTER);
        }
        if (mCurrentGame != null)
        {
            boolean flag = PackageUtils.isPackageInstalled(this, mCurrentGame.getInstancePackageName());
            mStateManager.mIsInstalled = flag;
        }
        adjustMuteUnmuteMenu();
        mStateManager.populateViews();
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        onSaveInstanceState(bundle);
        bundle.putParcelable("savedStateGame", mCurrentGame);
        bundle.putString("savedStateGameId", mCurrentGameId);
        bundle.putParcelable("savedStateExtendedGame", mStateManager.mCurrentExtendedGame);
        bundle.putBoolean("savedStateIsMuted", mIsMuted);
        bundle.putBoolean("savedStateWaitingForInstall", mWaitingForInstallation);
        bundle.putInt("savedStateSelectedTab", super.mViewPager.mCurItem);
    }

    public final void onStop()
    {
        onStop();
        mFabContainer.setVisibility(4);
        mLatencyLogger.logEvents(new int[] {
            6
        });
    }

    public final boolean useActionBarProgressBar()
    {
        return false;
    }

    public final boolean useFixedHeightQuestTiles()
    {
        return true;
    }

    static 
    {
        PACKAGE_ADDED_INTENT_FILTER = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        PACKAGE_REMOVED_INTENT_FILTER = new IntentFilter("android.intent.action.PACKAGE_REMOVED");
        PACKAGE_ADDED_INTENT_FILTER.addDataScheme("package");
        PACKAGE_REMOVED_INTENT_FILTER.addDataScheme("package");
        Bundle bundle = new Bundle();
        bundle.putInt("FRAGMENT_TAGS", 600);
        ABOUT_TAB_SPEC = new TabSpec(com/google/android/gms/games/ui/destination/games/GameDetailAboutFragment, 0x7f1000cb, bundle);
        bundle = new Bundle();
        bundle.putInt("FRAGMENT_TAGS", 601);
        ACHIEVEMENTS_TAB_SPEC = new TabSpec(com/google/android/gms/games/ui/destination/games/GameDetailAchievementListFragment, 0x7f1000cd, bundle);
        bundle = new Bundle();
        bundle.putInt("FRAGMENT_TAGS", 602);
        LEADERBOARDS_TAB_SPEC = new TabSpec(com/google/android/gms/games/ui/destination/games/GameDetailLeaderboardListFragment, 0x7f1000da, bundle);
        bundle = new Bundle();
        bundle.putInt("FRAGMENT_TAGS", 603);
        FRIENDS_TAB_SPEC = new TabSpec(com/google/android/gms/games/ui/destination/games/GameDetailFriendsFragment, 0x7f1000d7, bundle);
        bundle = new Bundle();
        bundle.putInt("FRAGMENT_TAGS", 604);
        QUESTS_TAB_SPEC = new TabSpec(com/google/android/gms/games/ui/destination/games/GameDetailQuestFragment, 0x7f1000df, bundle);
    }







/*
    static boolean access$1302$1b0751c8(GameDetailActivity gamedetailactivity)
    {
        gamedetailactivity.mShouldShowPlayFab = true;
        return true;
    }

*/





/*
    static Animation access$1700$1241a7bc(GameDetailActivity gamedetailactivity, long l, ArrayList arraylist)
    {
        int ai[] = new int[arraylist.size()];
        for (int i = 0; i < ai.length; i++)
        {
            ai[i] = ((Integer)arraylist.get(i)).intValue();
        }

        return gamedetailactivity.fadeViews(true, l, ai);
    }

*/


/*
    static void access$1800(GameDetailActivity gamedetailactivity)
    {
        gamedetailactivity.mStartPostponedInitialRevealAllowed = true;
        Iterator iterator = gamedetailactivity.attachedFragments.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Fragment fragment = (Fragment)iterator.next();
            if (fragment instanceof GamesHeaderRecyclerViewFragment)
            {
                ((GamesHeaderRecyclerViewFragment)fragment).startPostponedInitialReveal();
            }
        } while (true);
        gamedetailactivity.mLatencyLogger.logEvents(new int[] {
            3, 4
        });
        return;
    }

*/



/*
    static boolean access$1902$1b0751c8(GameDetailActivity gamedetailactivity)
    {
        gamedetailactivity.mIsSharedTransitionEntering = false;
        return false;
    }

*/




/*
    static void access$2100$58303095(GameDetailActivity gamedetailactivity, Drawable drawable, long l)
    {
        drawable = new TransitionDrawable(new Drawable[] {
            drawable, new ColorDrawable(gamedetailactivity.mGameThemeColor)
        });
        drawable.setCrossFadeEnabled(true);
        gamedetailactivity.mGameBannerDropTarget.setImageDrawable(drawable);
        drawable.startTransition((int)l);
        return;
    }

*/







/*
    static boolean access$2602$1b0751c8(GameDetailActivity gamedetailactivity)
    {
        gamedetailactivity.mIsWindowTransitionEntering = false;
        return false;
    }

*/



/*
    static Animator access$2800$e8bdee3(GameDetailActivity gamedetailactivity, long l)
    {
        Resources resources = gamedetailactivity.getResources();
        int k = gamedetailactivity.mGameBanner.getWidth();
        int i1 = gamedetailactivity.getHeaderHeight(gamedetailactivity);
        int j1 = i1 / 2;
        int i = k / 2;
        int j = gamedetailactivity.getActualBannerHeight(resources) / 2;
        i1 += Math.abs(j1 - j);
        float f = (float)Math.sqrt((float)(k * k) / 4F + (float)(i1 * i1) / 4F);
        k = gamedetailactivity.getResources().getDimensionPixelSize(0x7f0c0071);
        float f1 = (float)Math.sqrt(((float)(k * k) / 4F) * 2.0F);
        gamedetailactivity = ViewAnimationUtils.createCircularReveal(gamedetailactivity.mPlayHeaderListLayout, i, j, f1, f);
        gamedetailactivity.setDuration(l);
        return gamedetailactivity;
    }

*/





/*
    static Game access$3202(GameDetailActivity gamedetailactivity, Game game)
    {
        gamedetailactivity.mCurrentGame = game;
        return game;
    }

*/



/*
    static boolean access$3302(GameDetailActivity gamedetailactivity, boolean flag)
    {
        gamedetailactivity.mIsMuted = flag;
        return flag;
    }

*/



/*
    static boolean access$3502$1b0751c8(GameDetailActivity gamedetailactivity)
    {
        gamedetailactivity.mWaitingForInstallation = false;
        return false;
    }

*/





/*
    static boolean access$3902$1b0751c8(GameDetailActivity gamedetailactivity)
    {
        gamedetailactivity.mAccessibilityEventRequired = true;
        return true;
    }

*/


















/*
    static int access$5302(GameDetailActivity gamedetailactivity, int i)
    {
        gamedetailactivity.mSelectedTabIndex = i;
        return i;
    }

*/











    // Unreferenced inner class com/google/android/gms/games/ui/destination/games/GameDetailActivity$1$1

/* anonymous class */
    final class _cls1 extends BaseTransitionListener
    {

        final _cls1 this$1;

        public final void onTransitionStart(Transition transition)
        {
            mFabContainer.setVisibility(4);
            mFabSpacer.setVisibility(8);
        }

            
            {
                this$1 = _cls1.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/ui/destination/games/GameDetailActivity$4$1

/* anonymous class */
    final class _cls1
        implements android.view.animation.Animation.AnimationListener
    {

        final _cls4 this$1;

        public final void onAnimationEnd(Animation animation)
        {
            if (isDestroyed())
            {
                return;
            } else
            {
                fadeViews(mEnterDuration, new int[] {
                    0x7f0d0027
                }).setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final _cls1 this$2;

                    public final void onAnimationEnd(Animation animation)
                    {
                        if (isDestroyed())
                        {
                            return;
                        } else
                        {
                            mViewUnderGameBanner.setVisibility(4);
                            return;
                        }
                    }

                    public final void onAnimationRepeat(Animation animation)
                    {
                    }

                    public final void onAnimationStart(Animation animation)
                    {
                    }

            
            {
                this$2 = _cls1.this;
                super();
            }
                });
                return;
            }
        }

        public final void onAnimationRepeat(Animation animation)
        {
        }

        public final void onAnimationStart(Animation animation)
        {
        }

            
            {
                this$1 = _cls4.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/ui/destination/games/GameDetailActivity$4$2

/* anonymous class */
    final class _cls2 extends BaseAnimatorListener
    {

        final _cls4 this$1;

        public final void onAnimationEnd(Animator animator)
        {
            if (isDestroyed())
            {
                return;
            } else
            {
                mStartPostponedInitialRevealAllowed;
                return;
            }
        }

            
            {
                this$1 = _cls4.this;
                super();
            }
    }

}
