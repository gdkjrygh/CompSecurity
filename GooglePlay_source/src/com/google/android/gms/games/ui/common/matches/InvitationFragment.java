// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.OnLogInGameActionListener;
import com.google.android.gms.games.ui.OnMultiplayerUpdatedListener;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.UiSharedPrefs;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            InboxNearbyPlayersAdapter, InboxNearbyPlayersView, InvitationAdapter, InvitationClusterAdapter, 
//            MultiplayerInboxHelper, InvitationBufferHelper

public final class InvitationFragment extends GamesHeaderRecyclerViewFragment
    implements android.view.View.OnClickListener, ResultCallback, OnMultiplayerUpdatedListener, InboxNearbyPlayersAdapter.InboxNearbyPlayersEventListener, InvitationAdapter.InvitationEventListener, InvitationClusterAdapter.InvitationClusterEventListener, com.google.android.gms.games.ui.dialog.ConfirmCopresenceDialogFragment.CopresenceDialogResultListener
{

    private String mCurrentAccountName;
    private InboxNearbyPlayersView mEmptyNearbyPlayersView;
    private InboxNearbyPlayersAdapter mInboxNearbyPlayersAdapter;
    private InvitationAdapter mInvitationAdapter;
    public InvitationClusterAdapter mInvitationClusterAdapter;
    private boolean mIsNearbyPlayersEnabled;
    private MultiplayerInboxHelper mMultiplayerInboxHelper;
    private int mNumPlayersNearby;

    public InvitationFragment()
    {
        super(0x7f04009f);
        mNumPlayersNearby = -1;
    }

    private void disableNearbyPlayerSearch()
    {
        mIsNearbyPlayersEnabled = false;
        mInboxNearbyPlayersAdapter.setNearbyPlayersEnabled(mIsNearbyPlayersEnabled);
        mEmptyNearbyPlayersView.populateViews(mIsNearbyPlayersEnabled, mNumPlayersNearby);
        turnOffNearby();
    }

    private void enableNearbyPlayerSearch(boolean flag)
    {
        mIsNearbyPlayersEnabled = true;
        mInboxNearbyPlayersAdapter.setNearbyPlayersEnabled(mIsNearbyPlayersEnabled);
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

                final InvitationFragment this$0;

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
                this$0 = InvitationFragment.this;
                super();
            }
            });
        }
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

    public final void computeInvitationCount()
    {
        int i = mInvitationAdapter.getItemCount() + mInvitationClusterAdapter.getItemCount();
        LoadingDataRecyclerViewManager loadingdatarecyclerviewmanager = mLoadingDataViewManager;
        byte byte0;
        if (i == 0)
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        loadingdatarecyclerviewmanager.setViewState(byte0);
        if (i == 0)
        {
            mEmptyNearbyPlayersView.populateViews(mIsNearbyPlayersEnabled, mNumPlayersNearby);
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
        return 12;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof MultiplayerInboxHelper.MultiplayerInboxHelperProvider);
        mMultiplayerInboxHelper = ((MultiplayerInboxHelper.MultiplayerInboxHelperProvider)mParent).getMultiplayerInboxHelper();
        Asserts.checkNotNull(mMultiplayerInboxHelper);
        setEmptyViewElements(0x7f020150, 0x7f1001af, 0);
        mInboxNearbyPlayersAdapter = new InboxNearbyPlayersAdapter(mParent, this);
        mInboxNearbyPlayersAdapter.setVisible(((Boolean)G.allowNearbyPlayerSearch.get()).booleanValue());
        mInvitationAdapter = new InvitationAdapter(mParent, this);
        mInvitationClusterAdapter = new InvitationClusterAdapter(mParent, this);
        bundle = new Builder();
        bundle.addAdapter(mInboxNearbyPlayersAdapter);
        bundle.addAdapter(mInvitationAdapter);
        bundle.addAdapter(mInvitationClusterAdapter);
        setAdapter(bundle.build());
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

    public final void onDetach()
    {
        onDetach();
        unregisterPlayerChangeObserver();
        if (!isGoogleApiClientCreated())
        {
            GamesLog.w("InvitationListFragment", "Tearing down without finishing creation");
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

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        Object obj = mParent.mConfiguration;
        mCurrentAccountName = ((GamesUiConfiguration) (obj)).getCurrentAccountName();
        mInvitationAdapter.setCurrentPlayerInfo(((GamesUiConfiguration) (obj)).getCurrentPlayerId(), ((GamesUiConfiguration) (obj)).getCurrentAccountName());
        mInvitationClusterAdapter.setCurrentPlayerInfo(((GamesUiConfiguration) (obj)).getCurrentPlayerId(), ((GamesUiConfiguration) (obj)).getCurrentAccountName());
        if (((GamesUiConfiguration) (obj)).is3PContext())
        {
            Games.Invitations.loadInvitations$385d8060(googleapiclient).setResultCallback(this);
            Games.Notifications.clear(googleapiclient, 1);
        } else
        {
            obj = ((GamesUiConfiguration) (obj)).getCurrentGameId();
            Games.Invitations.loadInvitationsFirstParty$b85066a(googleapiclient, ((String) (obj))).setResultCallback(this);
            Games.Notifications.clearFirstParty(googleapiclient, ((String) (obj)), 1);
        }
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

    public final void onInvitationAccepted(Invitation invitation)
    {
        mMultiplayerInboxHelper.onInvitationAccepted(invitation);
    }

    public final void onInvitationClusterDeclined(ZInvitationCluster zinvitationcluster)
    {
        mMultiplayerInboxHelper.onInvitationClusterDeclined(zinvitationcluster);
        computeInvitationCount();
    }

    public final void onInvitationClusterDismissed(ZInvitationCluster zinvitationcluster)
    {
        mMultiplayerInboxHelper.onInvitationClusterDismissed(zinvitationcluster);
        computeInvitationCount();
    }

    public final void onInvitationClusterSeeMoreClicked(ZInvitationCluster zinvitationcluster, String s, String s1)
    {
        mMultiplayerInboxHelper.onInvitationClusterSeeMoreClicked(zinvitationcluster, s, s1);
    }

    public final void onInvitationDeclined(Invitation invitation)
    {
        mMultiplayerInboxHelper.onInvitationDeclined(invitation);
        computeInvitationCount();
    }

    public final void onInvitationDismissed(Invitation invitation)
    {
        mMultiplayerInboxHelper.onInvitationDismissed(invitation);
        computeInvitationCount();
    }

    public final void onInvitationGameInfoClicked(Game game)
    {
        mMultiplayerInboxHelper.onInvitationGameInfoClicked(game);
    }

    public final void onInvitationMuteAppClicked(Game game)
    {
        mMultiplayerInboxHelper.onInvitationMuteAppClicked(game);
    }

    public final void onInvitationParticipantListClicked(Invitation invitation, String s, String s1)
    {
        mMultiplayerInboxHelper.onInvitationParticipantListClicked(invitation, s, s1);
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

    protected final void onPlayersChanged()
    {
        reloadData();
    }

    public final volatile void onResult(Result result)
    {
        com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult loadinvitationsresult;
        int i;
        loadinvitationsresult = (com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult)result;
        i = loadinvitationsresult.getStatus().mStatusCode;
        result = loadinvitationsresult.getInvitations();
        boolean flag = canUseResult(loadinvitationsresult);
        if (!flag)
        {
            result.release();
            return;
        }
        mParent.hideActionBarProgressBar();
        InvitationBufferHelper invitationbufferhelper = new InvitationBufferHelper(result);
        mInvitationAdapter.setDataBuffer(invitationbufferhelper.mInCirclesInvitationBuffer);
        mInvitationClusterAdapter.setDataBuffer(invitationbufferhelper.mAggregatedInvitationBuffer);
        LoadingDataRecyclerViewManager loadingdatarecyclerviewmanager = mLoadingDataViewManager;
        int j = invitationbufferhelper.mInCirclesInvitationBuffer.getCount();
        loadingdatarecyclerviewmanager.handleViewState(i, invitationbufferhelper.mAggregatedInvitationBuffer.getCount() + j, false);
        if (result.getCount() == 0)
        {
            mEmptyNearbyPlayersView.populateViews(mIsNearbyPlayersEnabled, mNumPlayersNearby);
        }
        result.release();
        mParent.registerInvitationListeners();
        return;
        Exception exception;
        exception;
        result.release();
        throw exception;
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
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            return;
        }
        mParent.showActionBarProgressBar();
        GamesUiConfiguration gamesuiconfiguration = mParent.mConfiguration;
        if (gamesuiconfiguration.is3PContext())
        {
            Games.Invitations.loadInvitations$385d8060(googleapiclient).setResultCallback(this);
            return;
        } else
        {
            Games.Invitations.loadInvitationsFirstParty$b85066a(googleapiclient, gamesuiconfiguration.getCurrentGameId()).setResultCallback(this);
            return;
        }
    }




/*
    static int access$102(InvitationFragment invitationfragment, int i)
    {
        invitationfragment.mNumPlayersNearby = i;
        return i;
    }

*/



}
