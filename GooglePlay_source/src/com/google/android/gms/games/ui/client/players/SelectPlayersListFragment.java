// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
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
import com.google.android.gms.common.data.DataBufferUtils;
import com.google.android.gms.common.data.ExclusionFilteredDataBuffer;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.data.TextFilteredDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.data.GamesDataChangeUris;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.ui.DataBufferAdapter;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragment;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesListFragment;
import com.google.android.gms.games.ui.HeaderItemAdapter;
import com.google.android.gms.games.ui.MergedAdapter;
import com.google.android.gms.games.ui.SingleItemAdapter;
import com.google.android.gms.games.ui.TileBannerNullStateItemAdapter;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.LoadingDataViewManager;
import com.google.android.gms.games.ui.util.ManageCirclesHelper;
import com.google.android.gms.games.ui.util.PageSizeUtils;
import com.google.android.gms.games.ui.util.SelectionSet;
import com.google.android.gms.games.ui.util.UiSharedPrefs;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            SelectPlayersMetadataProvider, SelectPlayersAdapter, SelectPlayersFragment, ChipsGridAdapter

public final class SelectPlayersListFragment extends GamesListFragment
    implements android.support.v7.widget.PopupMenu.OnMenuItemClickListener, android.view.View.OnClickListener, com.google.android.gms.games.ui.DataBufferAdapter.OnEndOfWindowReachedListener, com.google.android.gms.games.ui.dialog.ConfirmCopresenceDialogFragment.CopresenceDialogResultListener, com.google.android.gms.games.ui.util.ManageCirclesHelper.ContinueProcessingCallback
{
    private static final class NearbyPlayersNullStateAdapter extends SingleItemAdapter
    {

        private final LayoutInflater mInflater;

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = mInflater.inflate(0x7f0400a2, viewgroup, false);
            }
            return view1;
        }

        public NearbyPlayersNullStateAdapter(Context context)
        {
            mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        }
    }


    boolean mAllowAutoPick;
    boolean mAllowNearbySearch;
    private TileBannerNullStateItemAdapter mAutoMatchWarningAdapter;
    private final Runnable mClearFocusLockRunnable = new Runnable() {

        final SelectPlayersListFragment this$0;

        public final void run()
        {
            mMyCirclesPlayersAdapter.mFocusLockedViewPlayerId = null;
        }

            
            {
                this$0 = SelectPlayersListFragment.this;
                super();
            }
    };
    private ExclusionFilteredDataBuffer mConnectedEFDataBuffer;
    SelectPlayersAdapter mConnectedPlayersAdapter;
    HeaderItemAdapter mConnectedPlayersHeaderAdapter;
    String mCurrentAccountName;
    private TileBannerNullStateItemAdapter mEmptyMessageAdapter;
    private boolean mIdentitySharingConfirmed;
    boolean mIsFiltering;
    private boolean mIsRefreshing;
    private ManageCirclesHelper mManageCirclesHelper;
    String mManagedPlayer;
    SelectPlayersMetadataProvider mMetadataProvider;
    SelectPlayersAdapter mMyCirclesPlayersAdapter;
    HeaderItemAdapter mMyCirclesPlayersHeaderAdapter;
    TextFilteredDataBuffer mMyCirclesTFDataBuffer;
    DataBuffer mNearbyDataBuffer;
    SelectPlayersAdapter mNearbyPlayersAdapter;
    HeaderItemAdapter mNearbyPlayersHeaderAdapter;
    NearbyPlayersNullStateAdapter mNearbyPlayersNullStateAdapter;
    boolean mNearbySearchEnabled;
    SelectPlayersFragment mParentFragment;
    private DataBuffer mRecentDataBuffer;
    SelectPlayersAdapter mRecentPlayersAdapter;
    HeaderItemAdapter mRecentPlayersHeaderAdapter;
    SelectPlayersAdapter mSpecialTilesAdapter;
    private boolean mViewDestroyed;

    public SelectPlayersListFragment()
    {
        mIsFiltering = false;
    }

    private void loadInvitablePlayers(final GoogleApiClient preselectedPlayersResultToken, boolean flag)
    {
        final Object recentResultToken;
        com.google.android.gms.common.api.Batch.Builder builder;
        builder = new com.google.android.gms.common.api.Batch.Builder(preselectedPlayersResultToken);
        recentResultToken = Games.getAppId(preselectedPlayersResultToken);
        final BatchResultToken nearbyResultToken;
        final BatchResultToken connectedResultToken;
        final BatchResultToken invitableResultToken;
        ArrayList arraylist;
        if (mNearbySearchEnabled)
        {
            nearbyResultToken = builder.add(Games.Players.loadNearbyPlayersInternal(preselectedPlayersResultToken, ((String) (recentResultToken)), PageSizeUtils.getMixedTilePageSize(mParent)));
        } else
        {
            nearbyResultToken = null;
        }
        switch (mMetadataProvider.getRecentPlayersType())
        {
        default:
            recentResultToken = null;
            break;

        case 1: // '\001'
            break MISSING_BLOCK_LABEL_195;
        }
_L1:
        connectedResultToken = builder.add(Games.Players.loadConnectedPlayers(preselectedPlayersResultToken, flag));
        invitableResultToken = builder.add(Games.Players.loadInvitablePlayers(preselectedPlayersResultToken, PageSizeUtils.getMixedTilePageSize(mParent), flag));
        arraylist = mMetadataProvider.getPreselectedPlayerIds();
        if (!flag && arraylist != null && arraylist.size() > 0)
        {
            preselectedPlayersResultToken = builder.add(Games.Players.loadPlayers(preselectedPlayersResultToken, arraylist));
        } else
        {
            preselectedPlayersResultToken = null;
        }
        builder.build().setResultCallback(new ResultCallback() {

            final SelectPlayersListFragment this$0;
            final BatchResultToken val$connectedResultToken;
            final BatchResultToken val$invitableResultToken;
            final BatchResultToken val$nearbyResultToken;
            final BatchResultToken val$preselectedPlayersResultToken;
            final BatchResultToken val$recentResultToken;

            public final volatile void onResult(Result result)
            {
                Object obj;
                boolean flag2;
                flag2 = false;
                obj = (BatchResult)result;
                mParentFragment.hideActionBarProgressBar();
                if (mIsRefreshing)
                {
                    result = getListView().getAnimation();
                    if (result != null)
                    {
                        result.cancel();
                    }
                    UiUtils.slideViewToTop$5359d8d9(getListView());
                }
                setRefreshing$1385ff();
                mIsRefreshing;
                if (!mDetached && !mRemoving && !mViewDestroyed) goto _L2; else goto _L1
_L1:
                return;
_L2:
                int i;
                int j;
                int k;
                int l;
                int j1;
                boolean flag3;
                com.google.android.gms.games.Players.LoadPlayersResult loadplayersresult;
                com.google.android.gms.games.Players.LoadPlayersResult loadplayersresult1;
                com.google.android.gms.games.Players.LoadPlayersResult loadplayersresult2;
                Object obj1;
                Exception exception;
                ArrayList arraylist1;
                boolean flag1;
                int i1;
                int k1;
                if (recentResultToken != null)
                {
                    result = (com.google.android.gms.games.Players.LoadPlayersResult)((BatchResult) (obj)).take(recentResultToken);
                    i = result.getStatus().mStatusCode;
                } else
                {
                    result = null;
                    i = 0;
                }
                loadplayersresult1 = (com.google.android.gms.games.Players.LoadPlayersResult)((BatchResult) (obj)).take(connectedResultToken);
                k = loadplayersresult1.getStatus().mStatusCode;
                loadplayersresult2 = (com.google.android.gms.games.Players.LoadPlayersResult)((BatchResult) (obj)).take(invitableResultToken);
                j1 = loadplayersresult2.getStatus().mStatusCode;
                if (nearbyResultToken != null)
                {
                    loadplayersresult = (com.google.android.gms.games.Players.LoadPlayersResult)((BatchResult) (obj)).take(nearbyResultToken);
                    j = loadplayersresult.getStatus().mStatusCode;
                } else
                {
                    loadplayersresult = null;
                    j = 0;
                }
                if (!
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = SelectPlayersListFragment.this;
                recentResultToken = batchresulttoken;
                connectedResultToken = batchresulttoken1;
                invitableResultToken = batchresulttoken2;
                nearbyResultToken = batchresulttoken3;
                preselectedPlayersResultToken = batchresulttoken4;
                super();
            }
        });
        return;
        recentResultToken = builder.add(Games.Players.loadRecentlyPlayedWithPlayersInternal$4189436a(preselectedPlayersResultToken, ((String) (recentResultToken)), flag));
          goto _L1
    }

    public final boolean canContinueProcessing()
    {
        return super.mActivity != null && !super.mDetached && !super.mRemoving;
    }

    final void disableNearbyPlayerSearch()
    {
        mNearbySearchEnabled = false;
        mSpecialTilesAdapter.setNearbyItemState(false);
        mNearbyPlayersHeaderAdapter.setVisible(false);
        mNearbyPlayersNullStateAdapter.setVisible(false);
        mNearbyPlayersAdapter.setAdapterVisible(false);
        mParentFragment.hideActionBarProgressBar();
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            Games.Players.setNearbyPlayerDetectionEnabledInternal(googleapiclient, false);
        }
    }

    final void enableNearbyPlayerSearch(boolean flag)
    {
        mNearbySearchEnabled = true;
        mSpecialTilesAdapter.setNearbyItemState(true);
        if (flag)
        {
            UiSharedPrefs.setNearbyPlayersConsent$607b2e89(mParent, mCurrentAccountName);
        }
        mNearbyPlayersHeaderAdapter.setVisible(true);
        mNearbyPlayersNullStateAdapter.setVisible(true);
        mNearbyPlayersAdapter.setAdapterVisible(false);
        mParentFragment.showActionBarProgressBar();
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            Games.Players.setNearbyPlayerDetectionEnabledInternal(googleapiclient, true);
            loadInvitablePlayers(googleapiclient, false);
        }
    }

    final int getFilteredPlayerCount()
    {
        int i = 0;
        int k = 0;
        boolean flag = false;
        if (mMyCirclesTFDataBuffer != null)
        {
            i = mMyCirclesTFDataBuffer.getCount() + 0;
        }
        int j = k;
        if (!mIsFiltering)
        {
            j = k;
            if (mConnectedEFDataBuffer != null)
            {
                j = mConnectedEFDataBuffer.getCount() + 0;
            }
        }
        k = ((flag) ? 1 : 0);
        if (!mIsFiltering)
        {
            k = ((flag) ? 1 : 0);
            if (mRecentDataBuffer != null)
            {
                k = mRecentDataBuffer.getCount() + 0;
            }
        }
        return i + j + k;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        onActivityCreated(bundle);
        mViewDestroyed = false;
        mMetadataProvider = (SelectPlayersMetadataProvider)super.mActivity;
        mAllowAutoPick = mMetadataProvider.allowAutoMatch();
        mAllowNearbySearch = mMetadataProvider.allowNearbySearch();
        if (!((Boolean)G.allowNearbyPlayerSearch.get()).booleanValue())
        {
            mAllowNearbySearch = false;
        }
        mParentFragment = (SelectPlayersFragment)super.mParentFragment;
        Asserts.checkNotNull(mParentFragment);
        mAutoMatchWarningAdapter = new TileBannerNullStateItemAdapter(super.mActivity, 0x7f02017f, 0x7f100263, 0x7f1002ca, this, "autoMatchTile", "gotIt");
        mAutoMatchWarningAdapter.setVisible(false);
        mNearbyPlayersHeaderAdapter = new HeaderItemAdapter(mParent);
        mNearbyPlayersHeaderAdapter.setTitle(0x7f10026d);
        mNearbyPlayersAdapter = new SelectPlayersAdapter(mParent, mParentFragment, this, 3);
        mNearbyPlayersHeaderAdapter.setVisible(false);
        mNearbyPlayersNullStateAdapter = new NearbyPlayersNullStateAdapter(super.mActivity);
        mNearbyPlayersNullStateAdapter.setVisible(false);
        mRecentPlayersHeaderAdapter = new HeaderItemAdapter(mParent);
        mRecentPlayersHeaderAdapter.setTitle(0x7f100275);
        mRecentPlayersAdapter = new SelectPlayersAdapter(mParent, mParentFragment, this, 4);
        mConnectedPlayersHeaderAdapter = new HeaderItemAdapter(mParent);
        mConnectedPlayersHeaderAdapter.setTitle(0x7f100265);
        mConnectedPlayersAdapter = new SelectPlayersAdapter(mParent, mParentFragment, this, 5);
        mMyCirclesPlayersHeaderAdapter = new HeaderItemAdapter(mParent);
        mMyCirclesPlayersHeaderAdapter.setTitle(0x7f10026c);
        mMyCirclesPlayersAdapter = new SelectPlayersAdapter(mParent, mParentFragment, this, 6);
        mMyCirclesPlayersAdapter.mOnEndOfWindowReachedListener = this;
        mEmptyMessageAdapter = new TileBannerNullStateItemAdapter(super.mActivity, 0x7f020180, 0x7f10026f, 0x7f100161, this, "findPeople", "findPeople");
        mEmptyMessageAdapter.setVisible(false);
        setListAdapter(new MergedAdapter(new BaseAdapter[] {
            mAutoMatchWarningAdapter, mNearbyPlayersHeaderAdapter, mNearbyPlayersNullStateAdapter, mNearbyPlayersAdapter, mRecentPlayersHeaderAdapter, mRecentPlayersAdapter, mConnectedPlayersHeaderAdapter, mConnectedPlayersAdapter, mMyCirclesPlayersHeaderAdapter, mMyCirclesPlayersAdapter, 
            mEmptyMessageAdapter
        }));
        getListView().setItemsCanFocus(true);
        getListView().setBackgroundColor(0);
    }

    public final void onClick(View view)
    {
        Object obj = UiUtils.getValidTag(view);
        if (obj instanceof Player)
        {
            obj = (Player)obj;
            String s = ((Player) (obj)).getPlayerId();
            if (view.getId() == 0x7f0d022e)
            {
                if (mManageCirclesHelper != null)
                {
                    GamesLog.d("SelectPlayersListFrag", "onManageCircles(): canceling the helper that was already running...");
                    mManageCirclesHelper.cancel();
                }
                mManagedPlayer = ((Player) (obj)).getPlayerId();
                mManageCirclesHelper = ManageCirclesHelper.startHelperFromFragment(((Player) (obj)), this, this, getGoogleApiClient(), mCurrentAccountName, 2);
                return;
            }
            Integer integer = (Integer)view.getTag(0x7f0d0060);
            mParentFragment.togglePlayer(((Player) (obj)), integer.intValue());
            if (!view.isInTouchMode())
            {
                mMyCirclesPlayersAdapter.mFocusLockedViewPlayerId = s;
            }
            view = getListView();
            view.removeCallbacks(mClearFocusLockRunnable);
            view.post(mClearFocusLockRunnable);
            return;
        }
        if (obj instanceof String)
        {
            String s1 = (String)obj;
            if ("auto_pick_item_add_tag".equals(s1))
            {
                mParentFragment.addAutoMatchPlayer();
                return;
            }
            if ("auto_pick_item_remove_tag".equals(s1))
            {
                mParentFragment.removeAutoMatchPlayer();
                return;
            }
            if ("gotIt".equals(s1))
            {
                view = getGoogleApiClient();
                if (UiUtils.checkClientDisconnected(view, mParent))
                {
                    GamesLog.w("SelectPlayersListFrag", "setIdentitySharingConfirmed: not connected; ignoring...");
                } else
                {
                    Games.setIdentitySharingConfirmedInternal(view);
                    mIdentitySharingConfirmed = true;
                }
                toggleAutoMatchWarning();
                return;
            }
            if ("autoMatchTile".equals(s1))
            {
                ((GamesFragment) (mParentFragment)).mParent.onShowSettings();
                return;
            }
            if ("findPeople".equals(s1))
            {
                mParentFragment.doSearch();
                return;
            }
            if ("nearby_players_tag".equals(s1))
            {
                if (!mSpecialTilesAdapter.mNearbyPlayersEnabled)
                {
                    mParentFragment.logInGameAction(20);
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
        } else
        if (view.getId() == 0x7f0d01f4)
        {
            view = new PopupMenu(view.getContext(), view);
            view.inflate(0x7f120003);
            if (mParentFragment.getNumPlayerSlotsLeft() == 0 && mParentFragment.mNumAutoMatchPlayers > 0)
            {
                if (mParentFragment.mNumAutoMatchPlayers > 0)
                {
                    obj = getResources().getQuantityString(0x7f0f000f, 1, new Object[] {
                        Integer.valueOf(1)
                    });
                    ((PopupMenu) (view)).mMenu.add(0, -1, 0, ((CharSequence) (obj)));
                }
                if (mParentFragment.mNumAutoMatchPlayers >= 2)
                {
                    obj = getResources().getString(0x7f100267);
                    ((PopupMenu) (view)).mMenu.add(0, 0, 1, ((CharSequence) (obj)));
                }
            }
            view.mMenuItemClickListener = this;
            ((PopupMenu) (view)).mPopup.show();
            return;
        }
        GamesLog.w("SelectPlayersListFrag", (new StringBuilder("onClick: unexpected tag '")).append(obj).append("'; View: ").append(view).append(", id ").append(view.getId()).toString());
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mInflater = layoutinflater;
        layoutinflater = inflateView(layoutinflater, viewgroup);
        mLoadingDataViewManager = new LoadingDataViewManager(layoutinflater, 0x7f0d01b1, this);
        mLoadingDataViewManager.setViewState(1);
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        mViewDestroyed = true;
        mRecentPlayersAdapter.setDataBuffer(null);
        mConnectedPlayersAdapter.setDataBuffer(null);
        mMyCirclesPlayersAdapter.setDataBuffer(null);
        mNearbyPlayersAdapter.setDataBuffer(null);
        getListView().removeCallbacks(mClearFocusLockRunnable);
        onDestroyView();
    }

    public final void onDetach()
    {
        onDetach();
        if (super.mContentObserver != null)
        {
            super.mParent.getContentResolver().unregisterContentObserver(super.mContentObserver);
            super.mContentObserver = null;
        }
    }

    public final void onDialogClose(int i, boolean flag)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            mParentFragment.logInGameAction(21);
            enableNearbyPlayerSearch(flag);
            return;

        case -2: 
            mParentFragment.logInGameAction(22);
            disableNearbyPlayerSearch();
            return;
        }
    }

    public final void onEndOfWindowReached$13462e()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            GamesLog.w("SelectPlayersListFrag", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            Games.Players.loadMoreInvitablePlayers(googleapiclient, PageSizeUtils.getMixedTilePageSize(mParent)).setResultCallback(new ResultCallback() {

                final SelectPlayersListFragment this$0;

                public final volatile void onResult(Result result)
                {
                    Object obj;
                    int i;
                    obj = (com.google.android.gms.games.Players.LoadPlayersResult)result;
                    result = SelectPlayersListFragment.this;
                    i = ((com.google.android.gms.games.Players.LoadPlayersResult) (obj)).getStatus().mStatusCode;
                    obj = ((com.google.android.gms.games.Players.LoadPlayersResult) (obj)).getPlayers();
                    if (((Fragment) (result)).mDetached) goto _L2; else goto _L1
_L1:
                    boolean flag = ((Fragment) (result)).mRemoving;
                    if (!flag) goto _L3; else goto _L2
_L2:
                    ((PlayerBuffer) (obj)).release();
_L5:
                    return;
_L3:
                    flag = ((SelectPlayersListFragment) (result)).mParent.canContinueWithStatus(i);
                    if (!flag)
                    {
                        ((PlayerBuffer) (obj)).release();
                        return;
                    }
                    if (UiUtils.isNetworkError(i))
                    {
                        ((SelectPlayersListFragment) (result)).mMyCirclesPlayersAdapter.showFooterErrorState();
                    }
                    result.mMyCirclesTFDataBuffer = new TextFilteredDataBuffer(((com.google.android.gms.common.data.AbstractDataBuffer) (obj)), "profile_name");
                    if (((SelectPlayersListFragment) (result)).mMyCirclesTFDataBuffer.getCount() <= 0) goto _L5; else goto _L4
_L4:
                    ((SelectPlayersListFragment) (result)).mMyCirclesPlayersAdapter.setDataBuffer(((SelectPlayersListFragment) (result)).mMyCirclesTFDataBuffer);
                    ((SelectPlayersListFragment) (result)).mLoadingDataViewManager.setViewState(2);
                    result.updateHeaderVisibility();
                    return;
                    result;
                    ((PlayerBuffer) (obj)).release();
                    throw result;
                }

            
            {
                this$0 = SelectPlayersListFragment.this;
                super();
            }
            });
            return;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        String s = Games.Players.getCurrentPlayerId(googleapiclient);
        if (s == null)
        {
            GamesLog.w("SelectPlayersListFrag", "We don't have a current player, something went wrong. Finishing the activity");
            mParent.finish();
            return;
        }
        mCurrentAccountName = Games.getCurrentAccountName(googleapiclient);
        if (mCurrentAccountName == null)
        {
            GamesLog.w("SelectPlayersListFrag", "onGoogleApiClientConnected: no current account! Bailing out...");
            mParent.finish();
            return;
        }
        mNearbyPlayersAdapter.setCurrentPlayerId(s);
        mRecentPlayersAdapter.setCurrentPlayerId(s);
        mConnectedPlayersAdapter.setCurrentPlayerId(s);
        mMyCirclesPlayersAdapter.setCurrentPlayerId(s);
        loadInvitablePlayers(googleapiclient, false);
        mIdentitySharingConfirmed = Games.GamesMetadata.getCurrentGame(googleapiclient).isIdentitySharingConfirmed();
        if (super.mContentObserver == null)
        {
            super.mContentObserver = new _cls1(this);
            super.mParent.getContentResolver().registerContentObserver(GamesDataChangeUris.URI_PLAYERS, true, super.mContentObserver);
        }
        Games.Invitations.registerInvitationPopupListenerRestricted(googleapiclient);
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        int l = menuitem.getItemId();
        if (l > 0)
        {
            for (int i = 0; i < l; i++)
            {
                mParentFragment.addAutoMatchPlayer();
            }

        } else
        if (l < 0)
        {
            for (int j = 0; j < -l; j++)
            {
                mParentFragment.removeAutoMatchPlayer();
            }

        } else
        {
            int i1 = mParentFragment.mNumAutoMatchPlayers;
            for (int k = 0; k < i1; k++)
            {
                mParentFragment.removeAutoMatchPlayer();
            }

        }
        return true;
    }

    protected final void onPlayersChanged()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            loadInvitablePlayers(googleapiclient, false);
            return;
        } else
        {
            GamesLog.w("SelectPlayersListFrag", "onPlayersChanged: not connected; ignoring...");
            return;
        }
    }

    public final void onRetry()
    {
        mParentFragment.showActionBarProgressBar();
        refresh(true, true);
    }

    public final void onStop()
    {
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            Games.Players.setNearbyPlayerDetectionEnabledInternal(googleapiclient, false);
        }
        onStop();
    }

    final void refresh(boolean flag, boolean flag1)
    {
        if (flag)
        {
            GoogleApiClient googleapiclient = getGoogleApiClient();
            mIsRefreshing = true;
            if (googleapiclient.isConnected())
            {
                if (flag1)
                {
                    mRecentPlayersAdapter.setDataBuffer(null);
                    mConnectedPlayersAdapter.setDataBuffer(null);
                    mMyCirclesPlayersAdapter.setDataBuffer(null);
                    mRecentPlayersHeaderAdapter.setVisible(false);
                    mConnectedPlayersHeaderAdapter.setVisible(false);
                    mMyCirclesPlayersHeaderAdapter.setVisible(false);
                    mEmptyMessageAdapter.setVisible(false);
                    mLoadingDataViewManager.setViewState(1);
                }
                loadInvitablePlayers(googleapiclient, true);
            } else
            {
                GamesLog.w("SelectPlayersListFrag", "refresh: googleApiClient not connected, ignoring...");
            }
        }
        mRecentPlayersAdapter.notifyDataSetChanged();
        mConnectedPlayersAdapter.notifyDataSetChanged();
        mMyCirclesPlayersAdapter.notifyDataSetChanged();
    }

    public final void toggleAutoMatchWarning()
    {
        TileBannerNullStateItemAdapter tilebannernullstateitemadapter = mAutoMatchWarningAdapter;
        boolean flag;
        if (!mIdentitySharingConfirmed && mParentFragment.mNumAutoMatchPlayers > 0 && mMetadataProvider.showIdentitySharingCard())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        tilebannernullstateitemadapter.setVisible(flag);
    }

    final void updateHeaderVisibility()
    {
        boolean flag = true;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (getFilteredPlayerCount() == 0)
        {
            mEmptyMessageAdapter.setVisible(true);
        } else
        {
            mEmptyMessageAdapter.setVisible(false);
        }
        flag1 = DataBufferUtils.hasData(mMyCirclesTFDataBuffer);
        flag2 = DataBufferUtils.hasData(mConnectedEFDataBuffer);
        flag3 = DataBufferUtils.hasData(mRecentDataBuffer);
        flag4 = DataBufferUtils.hasData(mNearbyDataBuffer);
        if (mNearbySearchEnabled)
        {
            mNearbyPlayersHeaderAdapter.setVisible(true);
            NearbyPlayersNullStateAdapter nearbyplayersnullstateadapter = mNearbyPlayersNullStateAdapter;
            if (flag4)
            {
                flag = false;
            }
            nearbyplayersnullstateadapter.setVisible(flag);
        } else
        {
            mNearbyPlayersHeaderAdapter.setVisible(false);
            mNearbyPlayersNullStateAdapter.setVisible(false);
        }
        mRecentPlayersHeaderAdapter.setVisible(flag3);
        mConnectedPlayersHeaderAdapter.setVisible(flag2);
        mMyCirclesPlayersHeaderAdapter.setVisible(flag1);
    }





/*
    static DataBuffer access$1002(SelectPlayersListFragment selectplayerslistfragment, DataBuffer databuffer)
    {
        selectplayerslistfragment.mRecentDataBuffer = databuffer;
        return databuffer;
    }

*/





/*
    static SelectPlayersAdapter access$1402(SelectPlayersListFragment selectplayerslistfragment, SelectPlayersAdapter selectplayersadapter)
    {
        selectplayerslistfragment.mSpecialTilesAdapter = selectplayersadapter;
        return selectplayersadapter;
    }

*/



/*
    static ExclusionFilteredDataBuffer access$1502(SelectPlayersListFragment selectplayerslistfragment, ExclusionFilteredDataBuffer exclusionfiltereddatabuffer)
    {
        selectplayerslistfragment.mConnectedEFDataBuffer = exclusionfiltereddatabuffer;
        return exclusionfiltereddatabuffer;
    }

*/




/*
    static TextFilteredDataBuffer access$1702(SelectPlayersListFragment selectplayerslistfragment, TextFilteredDataBuffer textfiltereddatabuffer)
    {
        selectplayerslistfragment.mMyCirclesTFDataBuffer = textfiltereddatabuffer;
        return textfiltereddatabuffer;
    }

*/





/*
    static boolean access$202$22c60f5a(SelectPlayersListFragment selectplayerslistfragment)
    {
        selectplayerslistfragment.mIsRefreshing = false;
        return false;
    }

*/








/*
    static DataBuffer access$802(SelectPlayersListFragment selectplayerslistfragment, DataBuffer databuffer)
    {
        selectplayerslistfragment.mNearbyDataBuffer = databuffer;
        return databuffer;
    }

*/

}
