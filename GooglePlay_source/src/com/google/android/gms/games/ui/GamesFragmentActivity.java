// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.app.Activity;
import android.app.Dialog;
import android.app.SharedElementCallback;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.GmsIntents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.EventProtoCache;
import com.google.android.gms.games.logging.GamesLogflowLogger;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.logging.LogflowGamesUiElementNode;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.ui.api.DestinationApiHelper;
import com.google.android.gms.games.ui.api.GamesDestinationApiHelper;
import com.google.android.gms.games.ui.common.players.ProfileVisibilityHelper;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.util.GamesProfileVisibilityHelper;
import com.google.android.gms.games.ui.util.GooglePlusUpgradeVerifier;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.util.PackageUtils;
import com.google.android.play.headerlist.PlayHeaderListLayout;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesContext, GamesUiConfiguration, OnMultiplayerUpdatedListener, OnRequestUpdatedListener, 
//            G, PlayHeaderListHelper, OnQuestUpdatedListener, LogflowEventListener

public abstract class GamesFragmentActivity extends ActionBarActivity
    implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, OnInvitationReceivedListener, OnTurnBasedMatchUpdateReceivedListener, QuestUpdateListener, OnRequestReceivedListener, GamesContext, GamesUiConfiguration.GamesUiConfigurationProvider, PlayHeaderListHelper.PlayHeaderListWrappable, com.google.android.gms.games.ui.api.DestinationApiHelper.DestinationApiHelperProvider, com.google.android.gms.games.ui.common.players.ProfileVisibilityHelper.ProfileVisibilityHelperProvider, com.google.android.gms.games.ui.dialog.changeaccount.IntentChangeAccountDialogFragment.IntentAccountSwitcherProvider, com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer
{
    private final class InstallationBroadcastReceiver extends BroadcastReceiver
    {

        final GamesFragmentActivity this$0;

        public final void onReceive(Context context, Intent intent)
        {
            if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()))
            {
                context = intent.getData();
                if (context != null && context.getSchemeSpecificPart().equals(mGamePackageToInstall))
                {
                    mWaitingForInstallation;
                    onFinskyLightInstallationCompleted(mGamePackageToInstall);
                    mGamePackageToInstall;
                }
            }
        }

        private InstallationBroadcastReceiver()
        {
            this$0 = GamesFragmentActivity.this;
            super();
        }

        InstallationBroadcastReceiver(byte byte0)
        {
            this();
        }
    }


    private static final IntentFilter PACKAGE_ADDED_INTENT_FILTER;
    private static Bitmap sTaskDescIcon;
    protected int mActionBarAlpha;
    private ColorDrawable mActionBarBGDrawable;
    private ProgressBar mActionBarProgressBar;
    protected LayoutInflater mAltLayoutInflater;
    public GamesUiConfiguration mConfiguration;
    private GamesDestinationApiHelper mDestinationApiHelper;
    public boolean mEnableActionBarProgressBar;
    private GamesLogflowLogger mEventLog;
    private Fragment mFragment;
    private String mGamePackageToInstall;
    private GoogleApiClient mGoogleApiClient;
    private GooglePlusUpgradeVerifier mGooglePlusUpgradeVerifier;
    protected Handler mImpressionHandler;
    protected long mImpressionId;
    private InstallationBroadcastReceiver mInstallationReceiver;
    private boolean mInvitationListenersRegistered;
    public boolean mIsPlusEnabled;
    protected boolean mIsRefreshing;
    private final int mLayoutResId;
    private boolean mMatchListenersRegistered;
    private int mOptionsMenuResId;
    private int mPendingPlusUpgradeSource;
    private Integer mPendingPlusUpgradeSubSource;
    public PlayHeaderListLayout mPlayHeaderListLayout;
    private ProfileVisibilityHelper mProfileVisibilityHelper;
    private boolean mQuestListenersRegistered;
    private boolean mRegisterInboxListeners;
    private boolean mRequestListenersRegistered;
    public boolean mResolutionInProgress;
    private CharSequence mSavedActionBarSubtitle;
    private boolean mShowActionBarProgressBar;
    private Dialog mUnknownFailureDialog;
    private boolean mWaitingForInstallation;

    public GamesFragmentActivity(int i, int j, int k, int l)
    {
        this(i, j, k, l, false);
    }

    public GamesFragmentActivity(int i, int j, int k, int l, boolean flag)
    {
        this(i, j, k, l, flag, false);
    }

    public GamesFragmentActivity(int i, int j, int k, int l, boolean flag, boolean flag1)
    {
label0:
        {
            boolean flag2 = false;
            super();
            mPendingPlusUpgradeSource = 0;
            mPendingPlusUpgradeSubSource = null;
            mImpressionId = GamesLogflowLogger.getNextImpressionId();
            mActionBarAlpha = 255;
            mIsRefreshing = false;
            mAltLayoutInflater = null;
            mConfiguration = new GamesUiConfiguration(this, i, j);
            mEnableActionBarProgressBar = flag;
            if (k <= 0 && !hasPlayHeader())
            {
                flag = flag2;
                if (getWrappableContentResId() <= 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        Asserts.checkState(flag);
        mLayoutResId = k;
        mOptionsMenuResId = l;
        mRegisterInboxListeners = flag1;
    }

    private void clearPendingPlusUpgrade()
    {
        mPendingPlusUpgradeSource = 0;
        mPendingPlusUpgradeSubSource = null;
    }

    private void forwardMultiplayerEvent()
    {
        if (mFragment instanceof OnMultiplayerUpdatedListener)
        {
            ((OnMultiplayerUpdatedListener)mFragment).onMultiplayerUpdated();
        }
        updateInboxCount();
    }

    private void forwardRequestEvent()
    {
        if (mFragment instanceof OnRequestUpdatedListener)
        {
            ((OnRequestUpdatedListener)mFragment).onRequestUpdated();
        }
        updateInboxCount();
    }

    public static LayoutInflater getGamesLayoutInflater(Context context)
    {
        if (context instanceof GamesFragmentActivity)
        {
            context = (GamesFragmentActivity)context;
            if (((GamesFragmentActivity) (context)).mAltLayoutInflater != null)
            {
                return ((GamesFragmentActivity) (context)).mAltLayoutInflater;
            } else
            {
                return context.getLayoutInflater();
            }
        } else
        {
            return LayoutInflater.from(context);
        }
    }

    private void launchPlusUpgradeFlow()
    {
        int i = mPendingPlusUpgradeSource;
        Integer integer = mPendingPlusUpgradeSubSource;
        if (mGoogleApiClient.isConnected())
        {
            GamesPlayLogger.logPlusUpgradeStartEvent(this, mConfiguration.getCurrentAccountName(), i, integer);
        }
        startActivityForResult(Games.Players.getPlusUpgradeIntentFirstParty(getGoogleApiClient()), 902);
    }

    private void updateStatusBar()
    {
        Window window;
        int i;
label0:
        {
            if (PlatformVersion.checkVersion(21) && mConfiguration.isDestinationUi())
            {
                i = getResources().getColor(0x7f0b0259);
                window = getWindow();
                if (mActionBarAlpha == 255)
                {
                    break label0;
                }
                window.setStatusBarColor(getResources().getColor(0x7f0b0253));
            }
            return;
        }
        window.setStatusBarColor(i);
    }

    public void addApisToGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient.Builder builder)
    {
    }

    public void addBackgroundView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
    }

    public final View addContentView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        if (getWrappableContentResId() != 0)
        {
            return layoutinflater.inflate(getWrappableContentResId(), viewgroup, true);
        } else
        {
            throw new IllegalStateException("getWrappableContentResId() can't return 0 when hasPlayHeader() returns true.");
        }
    }

    public void addHeroView(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
    }

    public boolean alwaysUseFloatingBackground()
    {
        return true;
    }

    public boolean canContinueWithStatus(int i)
    {
        return true;
    }

    public final void clearTitleFromActivity()
    {
        super.setTitle("");
    }

    public final void createGoogleApiClient()
    {
        mGoogleApiClient = instantiateGoogleApiClient();
        if (mGoogleApiClient == null)
        {
            GamesLog.e("GamesFragmentActivity", "Unable to instantiate GoogleApiClient; bailing out...");
            finish();
        }
    }

    public int getActionBarColor()
    {
        return getResources().getColor(0x7f0b0257);
    }

    public final int getActionBarHeight()
    {
        TypedValue typedvalue = new TypedValue();
        getTheme().resolveAttribute(0x7f010101, typedvalue, true);
        return TypedValue.complexToDimensionPixelSize(typedvalue.data, getResources().getDisplayMetrics());
    }

    public float getBackgroundViewParallaxRatio()
    {
        return 0.7F;
    }

    public final GamesUiConfiguration getConfiguration()
    {
        return mConfiguration;
    }

    public PlayHeaderListTabStrip getCustomTabStrip$78490773(Context context)
    {
        return null;
    }

    public DestinationApiHelper getDestinationApiHelper()
    {
        return mDestinationApiHelper;
    }

    public Drawable getFloatingControlsBackground()
    {
        return new ColorDrawable(UiUtils.getActionBarColorFromWrappable(this));
    }

    public final GoogleApiClient getGoogleApiClient()
    {
        if (mGoogleApiClient == null)
        {
            throw new IllegalStateException("GoogleApiClient instance not created yet");
        } else
        {
            return mGoogleApiClient;
        }
    }

    public int getHeaderHeight(Context context)
    {
        return PlayHeaderListLayout.getMinimumHeaderHeight(context, getPlayHeaderTabMode(), 0);
    }

    public int getHeaderMode()
    {
        return 1;
    }

    public final int getHeaderShadowMode()
    {
        return 0;
    }

    public final com.google.android.gms.games.ui.dialog.changeaccount.IntentChangeAccountDialogFragment.IntentAccountSwitcher getIntentAccountSwitcher()
    {
        return mDestinationApiHelper;
    }

    public final Activity getPlayHeaderActivity()
    {
        return this;
    }

    public int getPlayHeaderTabMode()
    {
        return 2;
    }

    public final boolean getProfileVisibility()
    {
        if (mFragment instanceof com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer)
        {
            return ((com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer)mFragment).getProfileVisibility();
        } else
        {
            return false;
        }
    }

    public final ProfileVisibilityHelper getProfileVisibilityHelper()
    {
        return mProfileVisibilityHelper;
    }

    public int getTabPaddingMode()
    {
        return !alwaysUseFloatingBackground() ? 0 : 1;
    }

    public int getToolbarTitleMode()
    {
        return 1;
    }

    public final float getVisibleHeaderHeight()
    {
        if (mPlayHeaderListLayout != null)
        {
            return mPlayHeaderListLayout.getVisibleHeaderHeight();
        } else
        {
            return 0.0F;
        }
    }

    public int getWrappableContentResId()
    {
        return 0;
    }

    public boolean hasPlayHeader()
    {
        return false;
    }

    public boolean hasViewPager()
    {
        return false;
    }

    public final void hideActionBarProgressBar()
    {
        Asserts.checkState(mEnableActionBarProgressBar, "This method can only be called if we have a progressbar in the actionbar");
        mShowActionBarProgressBar = false;
        if (mActionBarProgressBar != null)
        {
            mActionBarProgressBar.setVisibility(4);
        }
    }

    public abstract GoogleApiClient instantiateGoogleApiClient();

    public final boolean isGoogleApiClientCreated()
    {
        return mGoogleApiClient != null;
    }

    public final boolean isPageRefreshing$134632()
    {
        return false;
    }

    public final void launchFinskyLightInstallation(String s, String s1)
    {
        boolean flag;
        if (!mWaitingForInstallation)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Cannot try to install a game while already waiting for another install");
        Asserts.checkNotNull(s, "currentAccountName cannot be null");
        mGamePackageToInstall = (String)Preconditions.checkNotNull(s1, "game package to install cannot be null");
        startActivityForResult(GmsIntents.createPlayStoreLightPurchaseFlowIntent(this, s, s1), 2000);
    }

    public final void launchPlusUpgradeFlow(int i, Integer integer)
    {
        if (mIsPlusEnabled)
        {
            GamesLog.w("GamesFragmentActivity", "Trying to launch G+ adoption flow but already G+ enabled");
            restartGamesActivity();
            return;
        }
        mPendingPlusUpgradeSource = i;
        mPendingPlusUpgradeSubSource = integer;
        if (((Boolean)G.usePlusUpsellDialog.get()).booleanValue())
        {
            i = mPendingPlusUpgradeSource;
            integer = mPendingPlusUpgradeSubSource;
            if (mGoogleApiClient.isConnected())
            {
                GamesPlayLogger.logPlusUpgradeDialogShowEvent(this, mConfiguration.getCurrentAccountName(), i, integer);
            }
            (new GamesDialogFragment() {

                final GamesFragmentActivity this$0;
                final android.content.DialogInterface.OnCancelListener val$cancelListener;
                final android.content.DialogInterface.OnClickListener val$negativeOnClickListener;
                final android.content.DialogInterface.OnClickListener val$positiveOnClickListener;

                protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
                {
                    return gamesdialogbuilder.setTitle(0x7f10015c).setMessage(0x7f10015b).setNegativeButton(0x7f100159, negativeOnClickListener).setPositiveButton(0x7f10015a, positiveOnClickListener).setOnCancelListener(cancelListener);
                }

            
            {
                this$0 = GamesFragmentActivity.this;
                negativeOnClickListener = onclicklistener;
                positiveOnClickListener = onclicklistener1;
                cancelListener = oncancellistener;
                super();
            }
            }).show(super.mFragments, "plusUpgradeDialog");
            return;
        } else
        {
            launchPlusUpgradeFlow();
            return;
        }
    }

    public final void logClick(int i, View view)
    {
        if (view != null && (view.getTag(0x7f0d0061) instanceof LogflowGamesUiElementNode))
        {
            logClickEvent(i, view);
        }
    }

    public final void logClick(View view)
    {
        if (view != null && (view.getTag(0x7f0d0061) instanceof LogflowGamesUiElementNode))
        {
            GamesLogflowLogger gameslogflowlogger = mEventLog;
            if (view != null)
            {
                com.google.android.gms.games.proto.PlayGames.PlaylogGamesClickEvent playloggamesclickevent = gameslogflowlogger.mProtoCache.obtainPlaylogGamesClickEvent();
                GamesLogflowLogger.createClickPathFromView(view, playloggamesclickevent);
                gameslogflowlogger.logClickEvent(playloggamesclickevent);
            }
        }
    }

    public final void logClickEvent(int i)
    {
        mEventLog.logClick(i, null);
    }

    public final void logClickEvent(int i, View view)
    {
        if (view != null)
        {
            mEventLog.logClick(i, view);
        }
    }

    public final void logImpression(View view, final boolean isFlinging)
    {
label0:
        {
label1:
            {
                if (view != null && (view.getTag(0x7f0d0061) instanceof LogflowGamesUiElementNode))
                {
                    if (view.getParent() != null)
                    {
                        break label0;
                    }
                    if (PlatformVersion.checkVersion(12))
                    {
                        break label1;
                    }
                    GamesLog.d("GamesFragmentActivity", "Dropping logging event on older platform");
                }
                return;
            }
            view.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() {

                final GamesFragmentActivity this$0;
                final boolean val$isFlinging;
                final LogflowEventListener val$logListener;

                public final void onViewAttachedToWindow(View view2)
                {
                    logListener.logImpression(view2, isFlinging);
                }

                public final void onViewDetachedFromWindow(View view2)
                {
                }

            
            {
                this$0 = GamesFragmentActivity.this;
                logListener = logfloweventlistener;
                isFlinging = flag;
                super();
            }
            });
            return;
        }
        GamesLogflowLogger gameslogflowlogger = mEventLog;
        Handler handler = mImpressionHandler;
        long l = mImpressionId;
        View view1 = GamesLogflowLogger.findRootView(view);
        if (isFlinging && GamesLogflowLogger.isShown(view))
        {
            synchronized (GamesLogflowLogger.FLINGING_VIEW_LOCK)
            {
                com.google.android.gms.games.proto.PlayGames.PlaylogGamesUiElement aplayloggamesuielement[] = GamesLogflowLogger.createLeafToRootPath(view);
                if (aplayloggamesuielement.length > 1 && view.hashCode() != 0)
                {
                    GamesLogflowLogger.sFlingingViews.put(view.hashCode(), aplayloggamesuielement);
                }
            }
        }
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new com.google.android.gms.games.logging.GamesLogflowLogger._cls1(gameslogflowlogger, l, view1), GamesLogflowLogger.LOG_IMPRESSION_SETTLE_TIME_MS);
        return;
        view;
        obj;
        JVM INSTR monitorexit ;
        throw view;
    }

    public final void logPlusUpgradeDialogFinishedEvent(int i, Integer integer, int j)
    {
        if (mGoogleApiClient.isConnected())
        {
            GamesPlayLogger.logPlusUpgradeDialogFinishEvent(this, mConfiguration.getCurrentAccountName(), i, integer, j);
        }
    }

    public final void logPlusUpgradeViewEvent(int i, Integer integer)
    {
        if (mGoogleApiClient.isConnected())
        {
            GamesPlayLogger.logPlusUpgradeViewEvent(this, mConfiguration.getCurrentAccountName(), i, integer);
        }
    }

    public final void logSearchEvent(int i, String s)
    {
        GamesLogflowLogger gameslogflowlogger = mEventLog;
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesSearchEvent playloggamessearchevent = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesSearchEvent)EventProtoCache.getInstance().mCachePlaylogGamesSearch.obtain();
        playloggamessearchevent.type = i;
        playloggamessearchevent.query = s;
        s = gameslogflowlogger.mProtoCache.obtainPlaylogGamesLogEvent();
        s.search = playloggamessearchevent;
        gameslogflowlogger.logPlaylogEvent(s);
    }

    public void modifyGamesOptions(com.google.android.gms.games.Games.GamesOptions.Builder builder)
    {
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR lookupswitch 5: default 52
    //                   900: 82
    //                   901: 83
    //                   902: 162
    //                   903: 247
    //                   2000: 270;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        GamesLog.d("GamesFragmentActivity", (new StringBuilder("onActivityResult: unhandled request code: ")).append(i).toString());
        super.onActivityResult(i, j, intent);
_L2:
        return;
_L3:
        if (j == -1)
        {
            mResolutionInProgress = false;
            mGoogleApiClient.connect();
            return;
        }
        if (j == 10002)
        {
            GamesLog.w("GamesFragmentActivity", "REQUEST_RESOLVE_FAILURE resulted in SIGN_IN_FAILED");
            mResolutionInProgress = false;
            Status status = null;
            if (intent != null)
            {
                status = (Status)intent.getParcelableExtra("status");
            }
            onLoginFailed(status);
            return;
        } else
        {
            GamesLog.w("GamesFragmentActivity", "REQUEST_RESOLVE_FAILURE failed, bailing out...");
            finish();
            return;
        }
_L4:
        i = mPendingPlusUpgradeSource;
        intent = mPendingPlusUpgradeSubSource;
        if (mGoogleApiClient.isConnected())
        {
            GamesPlayLogger.logPlusUpgradeFinishEvent(this, mConfiguration.getCurrentAccountName(), i, intent, j);
        }
        clearPendingPlusUpgrade();
        if (j == -1)
        {
            mGooglePlusUpgradeVerifier = new GooglePlusUpgradeVerifier(this, new Runnable() {

                final GamesFragmentActivity this$0;

                public final void run()
                {
                    GoogleApiClient googleapiclient = getGoogleApiClient();
                    String s = Games.getCurrentAccountName(googleapiclient);
                    Games.signOut(googleapiclient);
                    switchAccount(s);
                }

            
            {
                this$0 = GamesFragmentActivity.this;
                super();
            }
            });
            mGooglePlusUpgradeVerifier.run();
            return;
        }
        if (j == 0) goto _L2; else goto _L7
_L7:
        GamesLog.e("GamesFragmentActivity", "Failed to adopt G+");
        return;
_L5:
        intent = mGooglePlusUpgradeVerifier;
        if (j == -1)
        {
            ((GooglePlusUpgradeVerifier) (intent)).mClient.connect();
            return;
        } else
        {
            intent.loop();
            return;
        }
_L6:
        if (j == -1 && !TextUtils.isEmpty(mGamePackageToInstall))
        {
            if (PackageUtils.isPackageInstalled(this, mGamePackageToInstall))
            {
                onFinskyLightInstallationCompleted(mGamePackageToInstall);
                mGamePackageToInstall = null;
            } else
            {
                mWaitingForInstallation = true;
                onFinskyLightInstallationStarted(mGamePackageToInstall);
            }
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void onAttachFragment(Fragment fragment)
    {
        super.onAttachFragment(fragment);
        if (!(fragment instanceof DialogFragment))
        {
            mFragment = fragment;
        }
    }

    public void onConnected(Bundle bundle)
    {
        GamesLogflowLogger gameslogflowlogger;
        Object obj;
        int i = 0;
        if (mRegisterInboxListeners)
        {
            registerMatchListeners();
            registerInvitationListeners();
            registerRequestListeners();
            registerQuestListeners();
        }
        String s = mConfiguration.getCurrentAccountName();
        if (s == null)
        {
            GamesLog.w("GamesFragmentActivity", "We don't have a current account name, something went wrong. Finishing the activity");
            finish();
            return;
        }
        int j;
        boolean flag;
        if (!mConfiguration.isDestinationUi() || !TextUtils.isEmpty(Games.Players.getCurrentPlayerId(mGoogleApiClient)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsPlusEnabled = flag;
        gameslogflowlogger = mEventLog;
        if (mConfiguration.isDestinationUi())
        {
            bundle = "593950602418";
        } else
        {
            bundle = mConfiguration.getCurrentGameId();
        }
        obj = GamesLogflowLogger.LOGGING_QUEUE_LOCK;
        obj;
        JVM INSTR monitorenter ;
        gameslogflowlogger.mAccountName = s;
        gameslogflowlogger.mApplicationId = bundle;
        bundle = ((Bundle) (GamesLogflowLogger.LOGGING_QUEUE_LOCK));
        bundle;
        JVM INSTR monitorenter ;
        j = gameslogflowlogger.mEventQueue.size();
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        gameslogflowlogger.logEventInternalImmediate((com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension)gameslogflowlogger.mEventQueue.get(i));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        gameslogflowlogger.clearPendingEvents();
        bundle;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
        Exception exception;
        exception;
        bundle;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        int i;
        i = connectionresult.mStatusCode;
        GamesLog.i("GamesFragmentActivity", (new StringBuilder("Connection to service apk failed with error ")).append(i).toString());
        if (!connectionresult.hasResolution())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        mResolutionInProgress = true;
        connectionresult.startResolutionForResult(this, 901);
_L1:
        return;
        connectionresult;
        GamesLog.e("GamesFragmentActivity", "Unable to recover from a connection failure.");
        finish();
        return;
        mUnknownFailureDialog = GooglePlayServicesUtil.getErrorDialog$7b9fd7d3(i, this);
        if (mUnknownFailureDialog == null)
        {
            GamesLog.e("GamesFragmentActivity", "Unable to recover from a connection failure.");
            finish();
            return;
        }
        if (!isFinishing())
        {
            mUnknownFailureDialog.show();
            return;
        }
          goto _L1
    }

    public final void onConnectionSuspended(int i)
    {
    }

    public void onCreate(Bundle bundle)
    {
        LayoutInflater layoutinflater;
        int i;
        mEventLog = new GamesLogflowLogger(this, null);
        mImpressionHandler = new Handler(getMainLooper());
        super.onCreate(bundle);
        layoutinflater = getLayoutInflater();
        if (hasPlayHeader())
        {
            PlayHeaderListHelper playheaderlisthelper = new PlayHeaderListHelper(this);
            mPlayHeaderListLayout = playheaderlisthelper.inflatePlayHeaderListLayout(layoutinflater);
            playheaderlisthelper.configurePlayHeaderListLayout(mPlayHeaderListLayout);
            onSetActionBar();
        }
        i = getWrappableContentResId();
        if (mLayoutResId == 0) goto _L2; else goto _L1
_L1:
        ViewGroup viewgroup;
        setContentView(mLayoutResId);
        viewgroup = (ViewGroup)((ViewGroup)findViewById(0x1020002)).getChildAt(0);
        if (!hasPlayHeader()) goto _L4; else goto _L3
_L3:
        viewgroup.addView(mPlayHeaderListLayout, 0);
_L6:
        mDestinationApiHelper = new GamesDestinationApiHelper(this);
        mProfileVisibilityHelper = new GamesProfileVisibilityHelper(this, this);
        createGoogleApiClient();
        if (bundle != null)
        {
            mResolutionInProgress = bundle.getBoolean("savedStateResolutionInProgress");
            mWaitingForInstallation = bundle.getBoolean("savedStateWaitingForInstall");
        }
        if (PlatformVersion.checkVersion(21))
        {
            setExitSharedElementCallback(new SharedElementCallback() {

                final GamesFragmentActivity this$0;

                public final void onRejectSharedElements(List list)
                {
                    if (list != null)
                    {
                        list.clear();
                    }
                }

            
            {
                this$0 = GamesFragmentActivity.this;
                super();
            }
            });
        }
        return;
_L4:
        if (i != 0)
        {
            layoutinflater.inflate(i, viewgroup, true);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (hasPlayHeader())
        {
            setContentView(mPlayHeaderListLayout);
        } else
        if (i != 0)
        {
            setContentView(i);
        } else
        {
            Asserts.fail("We need to either have a layout res id, play header, or a wrappable content res id to ensure we have a content view.");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (mOptionsMenuResId == 0)
        {
            return super.onCreateOptionsMenu(menu);
        }
        menu.clear();
        getMenuInflater().inflate(mOptionsMenuResId, menu);
        super.onCreateOptionsMenu(menu);
        if (mEnableActionBarProgressBar)
        {
            menu = menu.findItem(0x7f0d004f);
            Asserts.checkNotNull(menu, "You need an item menu_progress_bar in your menu if you are enabling the ProgressBar in the ActionBar");
            View view = getLayoutInflater().inflate(0x7f04001f, null, false);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));
            mActionBarProgressBar = (ProgressBar)view.findViewById(0x7f0d00e4);
            UiUtils.setVisible(mShowActionBarProgressBar, 4, new View[] {
                mActionBarProgressBar
            });
            MenuItemCompat.setActionView(menu, view);
        }
        return true;
    }

    public void onFinskyLightInstallationCompleted(String s)
    {
    }

    public void onFinskyLightInstallationStarted(String s)
    {
    }

    public final void onInvitationReceived$4945a01a()
    {
        if (mConfiguration.isDestinationUi())
        {
            Toast.makeText(this, 0x7f100185, 0).show();
        }
        forwardMultiplayerEvent();
    }

    public final void onInvitationRemoved$552c4e01()
    {
        forwardMultiplayerEvent();
    }

    public void onLoginFailed(Status status)
    {
        finish();
    }

    public void onPause()
    {
        super.onPause();
    }

    public final void onPlayHeaderListLayoutCreated(PlayHeaderListLayout playheaderlistlayout)
    {
    }

    public final void onPulledToRefresh()
    {
    }

    public final void onQuestCompleted$61796567()
    {
        if (mFragment instanceof OnQuestUpdatedListener)
        {
            ((OnQuestUpdatedListener)mFragment).onQuestUpdated();
        }
        updateInboxCount();
    }

    public final void onRequestReceived(GameRequest gamerequest)
    {
        if (!mConfiguration.isDestinationUi()) goto _L2; else goto _L1
_L1:
        int i = gamerequest.getType();
        if (i != 1) goto _L4; else goto _L3
_L3:
        Toast.makeText(this, 0x7f100184, 0).show();
_L2:
        forwardRequestEvent();
        return;
_L4:
        if (i == 2)
        {
            Toast.makeText(this, 0x7f100187, 0).show();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public final void onRequestRemoved$552c4e01()
    {
        forwardRequestEvent();
    }

    public void onResume()
    {
        super.onResume();
        if (mResolutionInProgress)
        {
            GamesLog.e("GamesFragmentActivity", "onResume with a resolutionIntentInProgress. This should never have happened ...");
            mResolutionInProgress = false;
            mGoogleApiClient.connect();
        }
        if (!TextUtils.isEmpty(mGamePackageToInstall))
        {
            boolean flag = PackageUtils.isPackageInstalled(this, mGamePackageToInstall);
            if (mWaitingForInstallation)
            {
                if (flag)
                {
                    mWaitingForInstallation = false;
                    onFinskyLightInstallationCompleted(mGamePackageToInstall);
                    mGamePackageToInstall = null;
                } else
                {
                    onFinskyLightInstallationStarted(mGamePackageToInstall);
                }
            }
            if (mInstallationReceiver == null)
            {
                mInstallationReceiver = new InstallationBroadcastReceiver((byte)0);
                registerReceiver(mInstallationReceiver, PACKAGE_ADDED_INTENT_FILTER);
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("savedStateResolutionInProgress", mResolutionInProgress);
        bundle.putBoolean("savedStateWaitingForInstall", mWaitingForInstallation);
    }

    public void onSetActionBar()
    {
        if (mPlayHeaderListLayout != null)
        {
            PlayHeaderListLayout playheaderlistlayout = mPlayHeaderListLayout;
            if (playheaderlistlayout.mUseBuiltInToolbar)
            {
                playheaderlistlayout.setSupportActionBar(playheaderlistlayout.mToolbar);
            }
        }
        ActionBar actionbar = getDelegate().getSupportActionBar();
        actionbar.setTitle(getTitle());
        if (mSavedActionBarSubtitle != null)
        {
            actionbar.setSubtitle(mSavedActionBarSubtitle);
        }
        mActionBarAlpha = 255;
        updateStatusBar();
    }

    public void onShowSettings()
    {
    }

    public void onStart()
    {
        super.onStart();
        if (!mResolutionInProgress)
        {
            mGoogleApiClient.connect();
        }
        GamesLogflowLogger.start();
    }

    public void onStop()
    {
        super.onStop();
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            if (mMatchListenersRegistered || mRegisterInboxListeners)
            {
                if (mConfiguration.is3PContext())
                {
                    Games.TurnBasedMultiplayer.unregisterMatchUpdateListener(googleapiclient);
                } else
                {
                    String s;
                    if (mConfiguration.isDestinationUi())
                    {
                        s = null;
                    } else
                    {
                        s = mConfiguration.getCurrentGameId();
                    }
                    Games.TurnBasedMultiplayer.unregisterMatchUpdateListenerFirstParty(googleapiclient, s);
                }
            }
            if (mInvitationListenersRegistered || mRegisterInboxListeners)
            {
                if (mConfiguration.is3PContext())
                {
                    Games.Invitations.unregisterInvitationListener(googleapiclient);
                } else
                {
                    String s1;
                    if (mConfiguration.isDestinationUi())
                    {
                        s1 = null;
                    } else
                    {
                        s1 = mConfiguration.getCurrentGameId();
                    }
                    Games.Invitations.unregisterInvitationListenerFirstParty(googleapiclient, s1);
                }
            }
            if (mRequestListenersRegistered || mRegisterInboxListeners)
            {
                if (mConfiguration.is3PContext())
                {
                    Games.Requests.unregisterRequestListener(googleapiclient);
                } else
                {
                    String s2;
                    if (mConfiguration.isDestinationUi())
                    {
                        s2 = null;
                    } else
                    {
                        s2 = mConfiguration.getCurrentGameId();
                    }
                    Games.Requests.unregisterRequestListenerFirstParty(googleapiclient, s2);
                }
            }
            if (mQuestListenersRegistered || mRegisterInboxListeners)
            {
                if (mConfiguration.is3PContext())
                {
                    Games.Quests.unregisterQuestUpdateListener(googleapiclient);
                } else
                {
                    String s3;
                    if (mConfiguration.isDestinationUi())
                    {
                        s3 = null;
                    } else
                    {
                        s3 = mConfiguration.getCurrentGameId();
                    }
                    Games.Quests.unregisterQuestUpdateListenerFirstParty(googleapiclient, s3);
                }
            }
        }
        mGoogleApiClient.disconnect();
        if (mUnknownFailureDialog != null)
        {
            mUnknownFailureDialog.dismiss();
        }
        if (mInstallationReceiver != null)
        {
            unregisterReceiver(mInstallationReceiver);
            mInstallationReceiver = null;
        }
        mEventLog.clearPendingEvents();
    }

    public final void onTurnBasedMatchReceived$660f1cd7()
    {
        if (mConfiguration.isDestinationUi())
        {
            Toast.makeText(this, 0x7f100186, 0).show();
        }
        forwardMultiplayerEvent();
    }

    public final void onTurnBasedMatchRemoved$552c4e01()
    {
        forwardMultiplayerEvent();
    }

    public final void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        if (mGoogleApiClient == null)
        {
            GamesLog.w("GamesFragmentActivity", "Attempting to register a listener without a GoogleApiClient");
            return;
        } else
        {
            mGoogleApiClient.registerConnectionFailedListener(onconnectionfailedlistener);
            return;
        }
    }

    public final void registerInvitationListeners()
    {
        GoogleApiClient googleapiclient;
label0:
        {
            googleapiclient = getGoogleApiClient();
            if (googleapiclient.isConnected())
            {
                mInvitationListenersRegistered = true;
                if (!mConfiguration.is3PContext())
                {
                    break label0;
                }
                Games.Invitations.registerInvitationListener(googleapiclient, this);
            }
            return;
        }
        String s;
        if (mConfiguration.isDestinationUi())
        {
            s = null;
        } else
        {
            s = mConfiguration.getCurrentGameId();
        }
        Games.Invitations.registerInvitationListenerFirstParty(googleapiclient, this, s);
    }

    public final void registerListener(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        if (mGoogleApiClient == null)
        {
            GamesLog.w("GamesFragmentActivity", "Attempting to register a listener without a GoogleApiClient");
            return;
        } else
        {
            mGoogleApiClient.registerConnectionCallbacks(connectioncallbacks);
            return;
        }
    }

    public final void registerMatchListeners()
    {
        GoogleApiClient googleapiclient;
label0:
        {
            googleapiclient = getGoogleApiClient();
            if (googleapiclient.isConnected())
            {
                mMatchListenersRegistered = true;
                if (!mConfiguration.is3PContext())
                {
                    break label0;
                }
                Games.TurnBasedMultiplayer.registerMatchUpdateListener(googleapiclient, this);
            }
            return;
        }
        String s;
        if (mConfiguration.isDestinationUi())
        {
            s = null;
        } else
        {
            s = mConfiguration.getCurrentGameId();
        }
        Games.TurnBasedMultiplayer.registerMatchUpdateListenerFirstParty(googleapiclient, this, s);
    }

    public final void registerQuestListeners()
    {
        GoogleApiClient googleapiclient;
label0:
        {
            googleapiclient = getGoogleApiClient();
            if (googleapiclient.isConnected())
            {
                mQuestListenersRegistered = true;
                if (!mConfiguration.is3PContext())
                {
                    break label0;
                }
                Games.Quests.registerQuestUpdateListener(googleapiclient, this);
            }
            return;
        }
        String s;
        if (mConfiguration.isDestinationUi())
        {
            s = null;
        } else
        {
            s = mConfiguration.getCurrentGameId();
        }
        Games.Quests.registerQuestUpdateListenerFirstParty(googleapiclient, this, s);
    }

    public final void registerRequestListeners()
    {
        GoogleApiClient googleapiclient;
label0:
        {
            googleapiclient = getGoogleApiClient();
            if (googleapiclient.isConnected())
            {
                mRequestListenersRegistered = true;
                if (!mConfiguration.is3PContext())
                {
                    break label0;
                }
                Games.Requests.registerRequestListener(googleapiclient, this);
            }
            return;
        }
        String s;
        if (mConfiguration.isDestinationUi())
        {
            s = null;
        } else
        {
            s = mConfiguration.getCurrentGameId();
        }
        Games.Requests.registerRequestListenerFirstParty(googleapiclient, this, s);
    }

    public void restartGamesActivity()
    {
    }

    public final void setActionBarAlpha(int i)
    {
        mActionBarAlpha = i;
        i = i << 24 | getActionBarColor() & 0xffffff;
        if (mActionBarBGDrawable == null || !PlatformVersion.checkVersion(14))
        {
            mActionBarBGDrawable = new ColorDrawable(i);
        }
        if (PlatformVersion.checkVersion(14))
        {
            mActionBarBGDrawable.setColor(i);
        }
        getDelegate().getSupportActionBar().setBackgroundDrawable(mActionBarBGDrawable);
        updateStatusBar();
    }

    public final void setLayoutInflater(LayoutInflater layoutinflater)
    {
        mAltLayoutInflater = layoutinflater;
    }

    public final void setOptionsMenuResId(int i)
    {
        if (mOptionsMenuResId == i)
        {
            return;
        } else
        {
            mOptionsMenuResId = i;
            supportInvalidateOptionsMenu();
            return;
        }
    }

    public final void setSubtitle(CharSequence charsequence)
    {
        mSavedActionBarSubtitle = charsequence;
        ActionBar actionbar = getDelegate().getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setSubtitle(charsequence);
        }
    }

    public void setTitle(int i)
    {
        setTitle(getText(i));
    }

    public void setTitle(CharSequence charsequence)
    {
        super.setTitle(charsequence);
        ActionBar actionbar = getDelegate().getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(charsequence);
        }
    }

    public void shareGame(String s, String s1)
    {
        if (s == null)
        {
            GamesLog.w("UiUtils", "shareGame: null game name");
            return;
        }
        if (s1 == null)
        {
            GamesLog.w("UiUtils", "shareGame: null game package name");
            return;
        }
        Object obj = GmsIntents.getPlayStoreUri(s1).buildUpon().appendQueryParameter("pcampaignid", "GPG_shareGame").build();
        if (obj == null)
        {
            GamesLog.w("UiUtils", (new StringBuilder("shareGame: couldn't get shareGame for game: ")).append(s1).toString());
            return;
        } else
        {
            s1 = getString(0x7f10028c, new Object[] {
                s, obj
            });
            obj = new Intent("android.intent.action.SEND");
            ((Intent) (obj)).putExtra("android.intent.extra.SUBJECT", getString(0x7f10028b, new Object[] {
                s
            }));
            ((Intent) (obj)).putExtra("android.intent.extra.TEXT", s1);
            ((Intent) (obj)).setType("text/plain");
            ((Intent) (obj)).setFlags(0x80000);
            startActivity(Intent.createChooser(((Intent) (obj)), getString(0x7f10028d)));
            return;
        }
    }

    public final void showActionBar$1385ff()
    {
        mPlayHeaderListLayout.snapControlsIfNeeded(true, true, true);
    }

    public final void showActionBarProgressBar()
    {
        Asserts.checkState(mEnableActionBarProgressBar, "This method can only be called if we have a progressbar in the actionbar");
        mShowActionBarProgressBar = true;
        if (mActionBarProgressBar != null)
        {
            mActionBarProgressBar.setVisibility(0);
        }
    }

    public final void startNewImpression(View view)
    {
        GamesLogflowLogger gameslogflowlogger = mEventLog;
        Handler handler = mImpressionHandler;
        long l = mImpressionId;
        view = GamesLogflowLogger.findRootView((ViewGroup)view);
        if (GamesLogflowLogger.VERBOSE_IMPRESSION)
        {
            GamesLogflowLogger.dumpTree("Flushing", l, ((LogflowGamesUiElementNode)view.getTag(0x7f0d0061)).getPlaylogGamesUiElement(), null);
        }
        handler.removeCallbacksAndMessages(null);
        gameslogflowlogger.sendImpression(l, view, true);
        mImpressionId = GamesLogflowLogger.getNextImpressionId();
    }

    public final void supportInvalidateOptionsMenu()
    {
        super.supportInvalidateOptionsMenu();
        mActionBarProgressBar = null;
    }

    public final boolean supportsPullToRefresh$134632()
    {
        return false;
    }

    public void switchAccount(String s)
    {
    }

    public final void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        if (mGoogleApiClient == null)
        {
            GamesLog.w("GamesFragmentActivity", "Attempting to unregister a listener without a GoogleApiClient");
            return;
        } else
        {
            mGoogleApiClient.unregisterConnectionFailedListener(onconnectionfailedlistener);
            return;
        }
    }

    public final void unregisterListener(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        if (mGoogleApiClient == null)
        {
            GamesLog.w("GamesFragmentActivity", "Attempting to unregister a listener without a GoogleApiClient");
            return;
        } else
        {
            mGoogleApiClient.unregisterConnectionCallbacks(connectioncallbacks);
            return;
        }
    }

    public void updateInboxCount()
    {
        if (mFragment instanceof com.google.android.gms.games.ui.util.InboxCountAdapter.OnInboxCountUpdatedListener)
        {
            ((com.google.android.gms.games.ui.util.InboxCountAdapter.OnInboxCountUpdatedListener)mFragment).onInboxCountUpdated();
        }
    }

    public final void updateProfileVisibility(boolean flag)
    {
        if (mFragment instanceof com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer)
        {
            ((com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer)mFragment).updateProfileVisibility(flag);
        }
    }

    public final void updateTaskDescription(CharSequence charsequence)
    {
        if (PlatformVersion.checkVersion(21))
        {
            Resources resources = getResources();
            CharSequence charsequence1 = charsequence;
            if (TextUtils.isEmpty(charsequence))
            {
                charsequence1 = getTitle();
            }
            charsequence = charsequence1;
            if (TextUtils.isEmpty(charsequence1))
            {
                charsequence = resources.getString(0x7f10009e);
            }
            if (sTaskDescIcon == null)
            {
                int i = 0x7f030001;
                if (((Boolean)G.playGamesDogfoodMode.get()).booleanValue())
                {
                    i = 0x7f030000;
                }
                sTaskDescIcon = BitmapFactory.decodeResource(resources, i);
            }
            setTaskDescription(new android.app.ActivityManager.TaskDescription(charsequence.toString(), sTaskDescIcon, resources.getColor(0x7f0b0257)));
        }
    }

    static 
    {
        IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        PACKAGE_ADDED_INTENT_FILTER = intentfilter;
        intentfilter.addDataScheme("package");
    }



/*
    static String access$102$35e9d659(GamesFragmentActivity gamesfragmentactivity)
    {
        gamesfragmentactivity.mGamePackageToInstall = null;
        return null;
    }

*/


/*
    static boolean access$202$5c9b38a9(GamesFragmentActivity gamesfragmentactivity)
    {
        gamesfragmentactivity.mWaitingForInstallation = false;
        return false;
    }

*/



/*
    static int access$302$5c9af8c7(GamesFragmentActivity gamesfragmentactivity)
    {
        gamesfragmentactivity.mPendingPlusUpgradeSource = 16;
        return 16;
    }

*/



/*
    static Integer access$402(GamesFragmentActivity gamesfragmentactivity, Integer integer)
    {
        gamesfragmentactivity.mPendingPlusUpgradeSubSource = integer;
        return integer;
    }

*/



    // Unreferenced inner class com/google/android/gms/games/ui/GamesFragmentActivity$3

/* anonymous class */
    final class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final GamesFragmentActivity this$0;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            logPlusUpgradeDialogFinishedEvent(mPendingPlusUpgradeSource, mPendingPlusUpgradeSubSource, 0);
            clearPendingPlusUpgrade();
            dialoginterface.dismiss();
        }

            
            {
                this$0 = GamesFragmentActivity.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/ui/GamesFragmentActivity$4

/* anonymous class */
    final class _cls4
        implements android.content.DialogInterface.OnClickListener
    {

        final GamesFragmentActivity this$0;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            logPlusUpgradeDialogFinishedEvent(mPendingPlusUpgradeSource, mPendingPlusUpgradeSubSource, -1);
            clearPendingPlusUpgrade();
            mPendingPlusUpgradeSource;
            GamesFragmentActivity gamesfragmentactivity = GamesFragmentActivity.this;
            if (((Boolean)G.showBannerInPlusUpsellDialog.get()).booleanValue())
            {
                i = 2;
            } else
            {
                i = 1;
            }
            gamesfragmentactivity.mPendingPlusUpgradeSubSource = Integer.valueOf(i);
            launchPlusUpgradeFlow();
            dialoginterface.dismiss();
        }

            
            {
                this$0 = GamesFragmentActivity.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/ui/GamesFragmentActivity$5

/* anonymous class */
    final class _cls5
        implements android.content.DialogInterface.OnCancelListener
    {

        final GamesFragmentActivity this$0;

        public final void onCancel(DialogInterface dialoginterface)
        {
            logPlusUpgradeDialogFinishedEvent(mPendingPlusUpgradeSource, mPendingPlusUpgradeSubSource, 0);
            clearPendingPlusUpgrade();
        }

            
            {
                this$0 = GamesFragmentActivity.this;
                super();
            }
    }

}
