// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.InboxDataEventListener;
import com.google.android.gms.games.ui.LoadingAdapter;
import com.google.android.gms.games.ui.OnLogInGameActionListener;
import com.google.android.gms.games.ui.OnMultiplayerUpdatedListener;
import com.google.android.gms.games.ui.common.UpsellCardAdapter;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiSharedPrefs;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            MultiplayerInboxRecyclerAdapter, InboxNearbyPlayersView, InvitationAdapter, InvitationClusterAdapter, 
//            MatchAdapter, InboxNearbyPlayersAdapter

public final class MultiplayerInboxFragment extends GamesHeaderRecyclerViewFragment
    implements android.view.View.OnClickListener, InboxDataEventListener, OnMultiplayerUpdatedListener, InboxNearbyPlayersAdapter.InboxNearbyPlayersEventListener, com.google.android.gms.games.ui.dialog.ConfirmCopresenceDialogFragment.CopresenceDialogResultListener
{

    private String mCurrentAccountName;
    private InboxNearbyPlayersView mEmptyNearbyPlayersView;
    private boolean mIsNearbyPlayersEnabled;
    public MultiplayerInboxRecyclerAdapter mMultiplayerInboxAdapter;
    private int mNumPlayersNearby;
    private UpsellCardAdapter mUpsellCardAdapter;

    public MultiplayerInboxFragment()
    {
        super(0x7f04009f);
        mNumPlayersNearby = -1;
    }

    private void disableNearbyPlayerSearch()
    {
        mIsNearbyPlayersEnabled = false;
        mMultiplayerInboxAdapter.setNearbyPlayersEnabled(mIsNearbyPlayersEnabled);
        mEmptyNearbyPlayersView.populateViews(mIsNearbyPlayersEnabled, mNumPlayersNearby);
        turnOffNearby();
    }

    private void enableNearbyPlayerSearch(boolean flag)
    {
        mIsNearbyPlayersEnabled = true;
        mMultiplayerInboxAdapter.setNearbyPlayersEnabled(mIsNearbyPlayersEnabled);
        mEmptyNearbyPlayersView.populateViews(mIsNearbyPlayersEnabled, mNumPlayersNearby);
        if (flag)
        {
            UiSharedPrefs.setNearbyPlayersConsent$607b2e89(mParent, mCurrentAccountName);
        }
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            Games.Players.setNearbyPlayerDetectionEnabledInternal(googleapiclient, true);
            Games.Players.loadNearbyPlayersInternal(googleapiclient, Games.getAppId(googleapiclient), PageSizeUtils.getMixedTilePageSize(mParent)).setResultCallback(new ResultCallback() {

                final MultiplayerInboxFragment this$0;

                public final volatile void onResult(Result result)
                {
                    int i;
                    result = (com.google.android.gms.games.Players.LoadPlayersResult)result;
                    i = result.getStatus().mStatusCode;
                    result = result.getPlayers();
                    if (mDetached) goto _L2; else goto _L1
_L1:
                    boolean flag1 = mRemoving;
                    if (!flag1) goto _L3; else goto _L2
_L2:
                    if (result != null)
                    {
                        result.release();
                    }
_L5:
                    return;
_L3:
                    flag1 = 
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = MultiplayerInboxFragment.this;
                super();
            }
            });
        }
    }

    private void loadData()
    {
        GoogleApiClient googleapiclient;
        boolean flag;
        flag = false;
        googleapiclient = getGoogleApiClient();
        if (!UiUtils.checkClientDisconnected(googleapiclient, mParent)) goto _L2; else goto _L1
_L1:
        GamesLog.w("MultiplayerInboxFrag", "reloadData: not connected; ignoring...");
_L4:
        return;
_L2:
        Object obj;
        obj = mParent.mConfiguration;
        if (!((GamesUiConfiguration) (obj)).is3PContext())
        {
            break; /* Loop/switch isn't completed */
        }
        MultiplayerInboxRecyclerAdapter multiplayerinboxrecycleradapter = mMultiplayerInboxAdapter;
        Asserts.checkState(multiplayerinboxrecycleradapter.mParentActivity.mConfiguration.is3PContext(), "This method should only be called from a 3P context");
        if (!UiUtils.checkClientDisconnected(googleapiclient, multiplayerinboxrecycleradapter.mParentActivity))
        {
            Games.TurnBasedMultiplayer.loadMatchesByStatus(googleapiclient, 1, TurnBasedMatch.MATCH_TURN_STATUS_ALL).setResultCallback(new _cls1(multiplayerinboxrecycleradapter));
            String s = Games.Players.getCurrentPlayerId(googleapiclient);
            String s2 = Games.getCurrentAccountName(googleapiclient);
            multiplayerinboxrecycleradapter.mInvitationAdapter.setCurrentPlayerInfo(s, s2);
            multiplayerinboxrecycleradapter.mInvitationClusterAdapter.setCurrentPlayerInfo(s, s2);
            multiplayerinboxrecycleradapter.mMyTurnAdapter.setCurrentPlayerInfo(s, s2);
            multiplayerinboxrecycleradapter.mTheirTurnAdapter.setCurrentPlayerInfo(s, s2);
            multiplayerinboxrecycleradapter.mCompletedMatchAdapter.setCurrentPlayerInfo(s, s2);
            Games.Notifications.clear(googleapiclient, 3);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mParent.mIsPlusEnabled)
        {
            mUpsellCardAdapter.setVisible(false);
            MultiplayerInboxRecyclerAdapter multiplayerinboxrecycleradapter1 = mMultiplayerInboxAdapter;
            String s1 = ((GamesUiConfiguration) (obj)).getCurrentGameId();
            String s3 = ((GamesUiConfiguration) (obj)).getCurrentPlayerId();
            obj = ((GamesUiConfiguration) (obj)).getCurrentAccountName();
            GamesUiConfiguration gamesuiconfiguration = multiplayerinboxrecycleradapter1.mParentActivity.mConfiguration;
            if (gamesuiconfiguration.mUiType == 2 || gamesuiconfiguration.mUiType == 3 || gamesuiconfiguration.mUiType == 0)
            {
                flag = true;
            }
            Asserts.checkState(flag, "This method should only be called from a 1P context");
            if (!UiUtils.checkClientDisconnected(googleapiclient, multiplayerinboxrecycleradapter1.mParentActivity))
            {
                Games.TurnBasedMultiplayer.loadMatchesByStatusFirstParty$1a7105dc(googleapiclient, s1, TurnBasedMatch.MATCH_TURN_STATUS_ALL).setResultCallback(new _cls2(multiplayerinboxrecycleradapter1));
                multiplayerinboxrecycleradapter1.mInvitationAdapter.setCurrentPlayerInfo(s3, ((String) (obj)));
                multiplayerinboxrecycleradapter1.mInvitationClusterAdapter.setCurrentPlayerInfo(s3, ((String) (obj)));
                multiplayerinboxrecycleradapter1.mMyTurnAdapter.setCurrentPlayerInfo(s3, ((String) (obj)));
                multiplayerinboxrecycleradapter1.mTheirTurnAdapter.setCurrentPlayerInfo(s3, ((String) (obj)));
                multiplayerinboxrecycleradapter1.mCompletedMatchAdapter.setCurrentPlayerInfo(s3, ((String) (obj)));
                Games.Notifications.clearFirstParty(googleapiclient, s1, 3);
                return;
            }
        } else
        {
            mUpsellCardAdapter.setVisible(true);
            onDataLoaded();
            mMultiplayerInboxAdapter.mLoadingAdapter.setVisible(false);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private void turnOffNearby()
    {
        GoogleApiClient googleapiclient;
        if (mParent.mConfiguration.isClientUi())
        {
            if ((googleapiclient = getGoogleApiClient()).isConnected())
            {
                Games.Players.setNearbyPlayerDetectionEnabledInternal(googleapiclient, false);
                return;
            }
        }
    }

    protected final LoadingDataRecyclerViewManager createLoadingDataViewManager(View view)
    {
        com.google.android.gms.games.ui.PlayHeaderListHelper.PlayHeaderListWrappable playheaderlistwrappable = UiUtils.findPlayHeaderListWrappable(this);
        int i = 0;
        if (playheaderlistwrappable != null)
        {
            i = playheaderlistwrappable.getHeaderHeight(super.mActivity);
        }
        return new LoadingDataRecyclerViewManager(view, 0x102000a, 0x7f0d01b4, 0x7f0d01f5, 0x7f0d01ae, 0x7f0d01b3, this, this, this, i);
    }

    protected final int getPlaylogElementType()
    {
        return 13;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener);
        Asserts.checkState(mParent instanceof MultiplayerInboxHelper.MultiplayerInboxHelperProvider);
        bundle = ((MultiplayerInboxHelper.MultiplayerInboxHelperProvider)mParent).getMultiplayerInboxHelper();
        int i = 0;
        if (mParent.mConfiguration.isDestinationUi())
        {
            i = 0x7f100194;
        }
        setEmptyViewElements(0x7f020154, 0x7f100195, i);
        Resources resources = mParent.getResources();
        mMultiplayerInboxAdapter = new MultiplayerInboxRecyclerAdapter(mParent, bundle, bundle, bundle, this, (com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener)mParent, this);
        mUpsellCardAdapter = UpsellCardAdapter.createPlusUpsellCardAdapter(mParent, new Data(resources.getColor(0x7f0b0072), 0x7f100197), 10, null);
        setAdapter((new Builder()).addAdapter(mMultiplayerInboxAdapter).addAdapter(mUpsellCardAdapter).build());
        if (!mParent.mConfiguration.isClientUi())
        {
            mEmptyNearbyPlayersView.setVisibility(8);
        }
    }

    public final void onClick(View view)
    {
        if (view == mEmptyNearbyPlayersView)
        {
            boolean flag;
            if (!mIsNearbyPlayersEnabled)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            onInboxNearbyPlayersClicked(flag);
        }
    }

    public final void onDataLoaded()
    {
        if (isAttachedToParent())
        {
            mParent.hideActionBarProgressBar();
            mLoadingDataViewManager.setViewState(2);
            mParent.registerInvitationListeners();
            mParent.registerMatchListeners();
        }
    }

    public final void onDetach()
    {
        onDetach();
        unregisterPlayerChangeObserver();
        if (!isGoogleApiClientCreated())
        {
            GamesLog.w("MultiplayerInboxFrag", "Tearing down without finishing creation");
        } else
        if (mIsNearbyPlayersEnabled)
        {
            turnOffNearby();
            return;
        }
    }

    public final void onDialogClose(int i, boolean flag)
    {
        OnLogInGameActionListener onlogingameactionlistener = null;
        if (mParent instanceof OnLogInGameActionListener)
        {
            onlogingameactionlistener = (OnLogInGameActionListener)mParent;
        }
        switch (i)
        {
        default:
            return;

        case -1: 
            if (onlogingameactionlistener != null)
            {
                onlogingameactionlistener.logInGameAction(21);
            }
            enableNearbyPlayerSearch(flag);
            return;

        case -2: 
            break;
        }
        if (onlogingameactionlistener != null)
        {
            onlogingameactionlistener.logInGameAction(22);
        }
        disableNearbyPlayerSearch();
    }

    public final void onEmptyActionTextClicked()
    {
        if (mParent.mConfiguration.isDestinationUi())
        {
            UiUtils.showPopularMultiplayer(mParent);
            return;
        } else
        {
            Asserts.fail("onEmptyActionTextClicked - Trying to show popular multiplayer when not in destination app");
            return;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mCurrentAccountName = mParent.mConfiguration.getCurrentAccountName();
        loadData();
        registerPlayerChangeObserver();
    }

    public final void onInboxNearbyPlayersClicked(boolean flag)
    {
        if (!mParent.mConfiguration.isClientUi())
        {
            return;
        }
        if (flag)
        {
            if (mParent instanceof OnLogInGameActionListener)
            {
                ((OnLogInGameActionListener)mParent).logInGameAction(20);
            }
            if (UiSharedPrefs.hasEnabledNearbyPlayers(mParent, mCurrentAccountName))
            {
                enableNearbyPlayerSearch(false);
                return;
            } else
            {
                DialogFragmentUtil.show(mParent, PrebuiltDialogs.newConfirmCopresenceDialog(this), "confirmationDialog");
                return;
            }
        } else
        {
            disableNearbyPlayerSearch();
            return;
        }
    }

    public final void onMultiplayerUpdated()
    {
        if (!isAttachedToParent())
        {
            return;
        } else
        {
            reloadData();
            return;
        }
    }

    public final void onNoDataLoaded(int i)
    {
        if (isAttachedToParent())
        {
            mParent.hideActionBarProgressBar();
            mLoadingDataViewManager.handleViewState(i, 0, false);
            mEmptyNearbyPlayersView.populateViews(mIsNearbyPlayersEnabled, mNumPlayersNearby);
            mParent.registerInvitationListeners();
            mParent.registerMatchListeners();
        }
    }

    protected final void onPlayersChanged()
    {
        reloadData();
        if (mIsNearbyPlayersEnabled)
        {
            enableNearbyPlayerSearch(false);
            return;
        } else
        {
            disableNearbyPlayerSearch();
            return;
        }
    }

    public final void onRetry()
    {
        reloadData();
    }

    public final void onStop()
    {
        if (isGoogleApiClientCreated() && mIsNearbyPlayersEnabled)
        {
            turnOffNearby();
        }
        onStop();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        onViewCreated(view, bundle);
        mEmptyNearbyPlayersView = (InboxNearbyPlayersView)view.findViewById(0x7f0d01b8);
        if (!((Boolean)G.allowNearbyPlayerSearch.get()).booleanValue())
        {
            mEmptyNearbyPlayersView.setVisibility(8);
            return;
        } else
        {
            mEmptyNearbyPlayersView.setOnClickListener(this);
            return;
        }
    }

    public final void reloadData()
    {
        mParent.showActionBarProgressBar();
        loadData();
    }




/*
    static int access$102(MultiplayerInboxFragment multiplayerinboxfragment, int i)
    {
        multiplayerinboxfragment.mNumPlayersNearby = i;
        return i;
    }

*/



}
