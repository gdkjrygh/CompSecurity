// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.players;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.MenuItemCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.audience.dialogs.CircleSelection;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataBufferUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.EntityBuffer;
import com.google.android.gms.common.data.TextFilteredDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.ui.DataBufferAdapter;
import com.google.android.gms.games.ui.GamesFragment;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.HeaderItemAdapter;
import com.google.android.gms.games.ui.Searchable;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.util.SelectionSet;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui.client.players:
//            SelectPlayersMetadataProvider, SelectPlayersListFragment, SelectPlayersAdapter, ChipsGridAdapter

public final class SelectPlayersFragment extends GamesFragment
    implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener, android.view.View.OnTouchListener, Searchable, ChipsGridAdapter.OnRemovePlayerListener
{
    public static interface SelectPlayersListener
    {

        public abstract void onSelectedPlayersChanged(ArrayMap arraymap, int i);
    }


    private ProgressBar mActionBarProgressBar;
    ChipsGridAdapter mChipsGridAdapter;
    private ListView mChipsList;
    private TextView mCurrentCountLabel;
    private Player mCurrentPlayer;
    private View mFilterView;
    private Handler mHandler;
    private boolean mHasChipsListMoved;
    private LayoutInflater mLayoutInflater;
    private SelectPlayersMetadataProvider mMetadataProvider;
    private LinearLayout mNoSelectablePlayersLayout;
    int mNumAutoMatchPlayers;
    private ClientFragmentActivity mParent;
    Bundle mSavedState;
    private MenuItem mSearchMenuItem;
    private SelectPlayersListener mSelectPlayersListener;
    private FrameLayout mSelectablePlayersContainer;
    SelectPlayersListFragment mSelectablePlayersFragment;
    SelectionSet mSelectedPlayerIds;
    ArrayMap mSelectedPlayers;
    private boolean mShowActionBarProgressBar;

    public SelectPlayersFragment()
    {
        super(0x7f0400cb);
    }

    private boolean hasRoomForMorePlayers()
    {
        return mSelectedPlayerIds.getNumSelected() + mNumAutoMatchPlayers < mMetadataProvider.getMaxParticipants();
    }

    private void saveState(Bundle bundle)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        Pair pair;
        for (Iterator iterator = mSelectedPlayers.values().iterator(); iterator.hasNext(); arraylist1.add(pair.second))
        {
            pair = (Pair)iterator.next();
            arraylist.add((PlayerEntity)pair.first);
        }

        bundle.putParcelableArrayList("savedStateSelectedPlayers", arraylist);
        bundle.putIntegerArrayList("savedStatedPlayerSources", arraylist1);
        bundle.putInt("savedStateNumOfAutoMatchPlayers", mNumAutoMatchPlayers);
        if (mSelectablePlayersFragment != null)
        {
            SelectPlayersListFragment selectplayerslistfragment = mSelectablePlayersFragment;
            boolean flag;
            if (selectplayerslistfragment.mSpecialTilesAdapter == null)
            {
                flag = false;
            } else
            {
                flag = selectplayerslistfragment.mSpecialTilesAdapter.mNearbyPlayersEnabled;
            }
            bundle.putBoolean("savedStateSearchNearbyPlayers", flag);
        } else
        {
            bundle.putBoolean("savedStateSearchNearbyPlayers", false);
        }
        mSavedState = bundle;
    }

    private void unselectAllChips()
    {
        mChipsGridAdapter.unselectAllChips();
        mChipsGridAdapter.notifyDataSetChanged();
    }

    private void updateStagingAreaHeight()
    {
        Object obj = getResources();
        int j = mChipsGridAdapter.getCount();
        int k = ((Resources) (obj)).getInteger(0x7f0e0049);
        int i = j;
        if (j > k)
        {
            i = k;
        }
        float f = ((Resources) (obj)).getDimension(0x7f0c0188);
        float f1 = ((Resources) (obj)).getDimension(0x7f0c0189);
        float f2 = i;
        float f3 = (f + f1) / 4F;
        obj = mChipsList.getLayoutParams();
        obj.height = (int)((f + f1) * f2 + f3);
        mChipsList.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    final void addAutoMatchPlayer()
    {
        if (!hasRoomForMorePlayers())
        {
            GamesLog.w("SelectPlayersFrag", "addAutoMatchPlayer: no room to add more players!");
            return;
        } else
        {
            mNumAutoMatchPlayers = mNumAutoMatchPlayers + 1;
            ChipsGridAdapter chipsgridadapter = mChipsGridAdapter;
            ChipsGridAdapter.ChipModel chipmodel = new ChipsGridAdapter.ChipModel(1);
            chipmodel.displayName = chipsgridadapter.mFragment.getString(0x7f100264);
            chipmodel.iconImageResId = 0x7f0200c9;
            chipsgridadapter.addChipInternal(chipmodel);
            updatePlayerCount();
            unselectAllChips();
            return;
        }
    }

    final void addPlayer(Player player, int i)
    {
        if (!hasRoomForMorePlayers())
        {
            GamesLog.w("SelectPlayersFrag", "addPlayer: no room to add more players!");
        } else
        {
            String s = player.getPlayerId();
            if (mSelectedPlayerIds.isSelected(s))
            {
                GamesLog.w("SelectPlayersFrag", (new StringBuilder("addPlayer: ignoring already-selected player ")).append(player).toString());
                return;
            }
            if (togglePlayer(player, i))
            {
                Asserts.checkState(mSelectedPlayerIds.isSelected(s));
                return;
            }
        }
    }

    void doSearch()
    {
        if (!hasRoomForMorePlayers())
        {
            GamesLog.w("SelectPlayersFrag", "doSearch: no room to add more players!");
            return;
        }
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("SelectPlayersFrag", "GoogleApiClient not connected (yet); ignoring...");
            return;
        } else
        {
            startActivityForResult(Games.Players.getPlayerSearchIntentInternal(googleapiclient, mParent.mClientPackageName), 1);
            return;
        }
    }

    final int getNumPlayerSlotsLeft()
    {
        int i = mSelectedPlayerIds.getNumSelected();
        int j = mNumAutoMatchPlayers;
        return mMetadataProvider.getMaxParticipants() - (i + j);
    }

    protected final int getPlaylogElementType()
    {
        return 34;
    }

    public final void hideActionBarProgressBar()
    {
        mShowActionBarProgressBar = false;
        if (mActionBarProgressBar != null)
        {
            mActionBarProgressBar.setVisibility(4);
        }
    }

    public final void logInGameAction(int i)
    {
        mParent.logInGameAction(i);
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(super.mActivity instanceof ClientFragmentActivity);
        mParent = (ClientFragmentActivity)super.mActivity;
        Asserts.checkState(mParent instanceof SelectPlayersMetadataProvider);
        mMetadataProvider = (SelectPlayersMetadataProvider)mParent;
        Asserts.checkState(mParent instanceof SelectPlayersListener);
        mSelectPlayersListener = (SelectPlayersListener)mParent;
        mParent.supportInvalidateOptionsMenu();
        int i = mMetadataProvider.getMaxParticipants();
        mChipsGridAdapter = new ChipsGridAdapter(this);
        mChipsList.setAdapter(mChipsGridAdapter);
        mChipsGridAdapter.mOnChipsGridChangedListener = new ChipsGridAdapter.OnChipsGridChangedListener() {

            final SelectPlayersFragment this$0;

            public final void onChipAdded()
            {
                mChipsList.smoothScrollToPosition(mChipsGridAdapter.getCount() - 1);
                UiUtils.sendAccessibilityEventWithText(mActivity, getResources().getString(0x7f100261), null);
            }

            public final void onChipRemoved()
            {
                UiUtils.sendAccessibilityEventWithText(mActivity, getResources().getString(0x7f100276), null);
            }

            
            {
                this$0 = SelectPlayersFragment.this;
                super();
            }
        };
        ChipsGridAdapter chipsgridadapter = mChipsGridAdapter;
        View view = mFilterView;
        if (chipsgridadapter.mFilterView == null)
        {
            chipsgridadapter.mFilterView = view;
            chipsgridadapter.mFilterTextView = (TextView)chipsgridadapter.mFilterView.findViewById(0x7f0d012b);
            Asserts.checkNotNull(chipsgridadapter.mFilterTextView);
            if (chipsgridadapter.mChips.size() > 0)
            {
                chipsgridadapter.mChips.add(chipsgridadapter.mFilterChip);
            }
            chipsgridadapter.mMaxParticipants = i;
            chipsgridadapter.mFilterViewHint = chipsgridadapter.mFragment.getString(0x7f10026a);
        }
        mSelectedPlayerIds = new SelectionSet(i);
        mSelectedPlayers = new ArrayMap(i);
        mNumAutoMatchPlayers = 0;
        if (bundle != null)
        {
            mSavedState = bundle;
        }
        updateStagingAreaHeight();
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = true;
        i;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 58
    //                   2 134;
           goto _L1 _L2 _L3
_L1:
        GamesLog.d("SelectPlayersFrag", (new StringBuilder("onActivityResult: unhandled request code: ")).append(i).toString());
        super.onActivityResult(i, j, intent);
_L5:
        return;
_L2:
        if (j == -1)
        {
            intent.getExtras();
            intent = intent.getParcelableArrayListExtra("player_search_results");
            if (intent.size() <= 0)
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            if (intent.size() > 0)
            {
                intent = (Player)intent.get(0);
                Asserts.checkNotNull(intent);
                if (intent != null)
                {
                    addPlayer(intent, 2);
                    return;
                }
            } else
            {
                GamesLog.w("SelectPlayersFrag", "REQUEST_PLAYER_SEARCH: RESULT_OK, but empty result");
                return;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (j == -1)
        {
            intent = CircleSelection.getResults(intent);
            Object obj;
            String s;
            boolean flag2;
            if (intent.getSelectedCircles().size() > 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (!intent.getAddedCirclesDelta().isEmpty() || !intent.getRemovedCirclesDelta().isEmpty())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            intent = mSelectablePlayersFragment;
            obj = ((SelectPlayersListFragment) (intent)).mRecentPlayersAdapter;
            s = ((SelectPlayersListFragment) (intent)).mManagedPlayer;
            if (((SelectPlayersAdapter) (obj)).mIsInCircles.containsKey(s))
            {
                HashMap hashmap = ((SelectPlayersAdapter) (obj)).mIsInCircles;
                if (i != 0)
                {
                    i = ((flag) ? 1 : 0);
                } else
                {
                    i = 0;
                }
                hashmap.put(s, Integer.valueOf(i));
                ((SelectPlayersAdapter) (obj)).notifyDataSetChanged();
            }
            obj = ((SelectPlayersListFragment) (intent)).mParent.getGoogleApiClient();
            if (UiUtils.checkClientDisconnected(((GoogleApiClient) (obj)), ((SelectPlayersListFragment) (intent)).mParent))
            {
                GamesLog.w("SelectPlayersListFrag", "logAddToCirclesAction: not connected; ignoring...");
                return;
            } else
            {
                obj = Games.GamesMetadata.getCurrentGame(((GoogleApiClient) (obj))).getApplicationId();
                GamesPlayLogger.logAddToCirclesAction(((SelectPlayersListFragment) (intent)).mParent, ((String) (obj)), ((SelectPlayersListFragment) (intent)).mCurrentAccountName, 2, flag2);
                return;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menuinflater.inflate(0x7f120005, menu);
        mSearchMenuItem = menu.findItem(0x7f0d0353);
        Asserts.checkNotNull(mSearchMenuItem);
        menuinflater = menu.findItem(0x7f0d004f);
        Asserts.checkNotNull(menuinflater);
        menu = menu.findItem(0x7f0d0354);
        Asserts.checkNotNull(menu);
        if (mMetadataProvider != null)
        {
            menu.setVisible(mMetadataProvider.allowNearbySearch());
        }
        menu = mLayoutInflater.inflate(0x7f04001f, null, false);
        menu.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -1));
        mActionBarProgressBar = (ProgressBar)menu.findViewById(0x7f0d00e4);
        ProgressBar progressbar = mActionBarProgressBar;
        int i;
        if (mShowActionBarProgressBar)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        progressbar.setVisibility(i);
        MenuItemCompat.setActionView(menuinflater, menu);
    }

    public final View onCreateView(final LayoutInflater filterText, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = super.onCreateView(filterText, viewgroup, bundle);
        mHandler = new Handler(Looper.getMainLooper());
        mLayoutInflater = filterText;
        mChipsList = (ListView)viewgroup.findViewById(0x7f0d027c);
        mChipsList.setFocusable(false);
        mChipsList.setOnTouchListener(this);
        mSelectablePlayersContainer = (FrameLayout)viewgroup.findViewById(0x7f0d027e);
        mSelectablePlayersFragment = new SelectPlayersListFragment();
        mSelectablePlayersFragment.enableSwipeToRefresh();
        mSelectablePlayersFragment.setOnRefreshListener(this);
        bundle = getChildFragmentManager().beginTransaction();
        bundle.replace(0x7f0d027f, mSelectablePlayersFragment);
        bundle.commit();
        mNoSelectablePlayersLayout = (LinearLayout)viewgroup.findViewById(0x7f0d0280);
        mCurrentCountLabel = (TextView)viewgroup.findViewById(0x7f0d027b);
        bundle = (TextView)viewgroup.findViewById(0x7f0d0281);
        if (!getResources().getBoolean(0x7f0a0011))
        {
            mCurrentCountLabel.setVisibility(8);
        }
        mFilterView = filterText.inflate(0x7f04004f, null, false);
        filterText = (TextView)mFilterView.findViewById(0x7f0d012b);
        filterText.addTextChangedListener(new TextWatcher() {

            private CharSequence mOldFilterText;
            final SelectPlayersFragment this$0;

            public final void afterTextChanged(Editable editable)
            {
            }

            public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
            {
                if (!TextUtils.equals(charsequence, mOldFilterText))
                {
                    SelectPlayersListFragment selectplayerslistfragment = mSelectablePlayersFragment;
                    String s = charsequence.toString();
                    if (selectplayerslistfragment.mMyCirclesTFDataBuffer != null)
                    {
                        TextFilteredDataBuffer textfiltereddatabuffer = selectplayerslistfragment.mMyCirclesTFDataBuffer;
                        Object obj1 = ((Fragment) (selectplayerslistfragment)).mActivity;
                        com.google.android.gms.common.data.TextFilterable.StringFilter stringfilter = TextFilteredDataBuffer.WORD_STARTS_WITH;
                        Preconditions.checkNotNull(stringfilter);
                        textfiltereddatabuffer.mFilterTerm = s;
                        textfiltereddatabuffer.mStringFilter = stringfilter;
                        if (!TextUtils.isEmpty(textfiltereddatabuffer.mFilterTerm))
                        {
                            textfiltereddatabuffer.mLocale = ((Context) (obj1)).getResources().getConfiguration().locale;
                            textfiltereddatabuffer.mFilterTerm = textfiltereddatabuffer.cleanString(textfiltereddatabuffer.mFilterTerm);
                            textfiltereddatabuffer.mEntityOffsets.clear();
                            obj1 = textfiltereddatabuffer.mAbstractDataBuffer.mDataHolder;
                            String s2 = textfiltereddatabuffer.mColumnName;
                            boolean flag = textfiltereddatabuffer.mAbstractDataBuffer instanceof EntityBuffer;
                            i = 0;
                            k = textfiltereddatabuffer.mAbstractDataBuffer.getCount();
                            while (i < k) 
                            {
                                String s3;
                                if (flag)
                                {
                                    j = ((EntityBuffer)textfiltereddatabuffer.mAbstractDataBuffer).getRowIndex(i);
                                } else
                                {
                                    j = i;
                                }
                                s3 = ((DataHolder) (obj1)).getString(s2, j, ((DataHolder) (obj1)).getWindowIndex(j));
                                if (!TextUtils.isEmpty(s3) && textfiltereddatabuffer.mStringFilter.matches(textfiltereddatabuffer.cleanString(s3), textfiltereddatabuffer.mFilterTerm))
                                {
                                    textfiltereddatabuffer.mEntityOffsets.add(Integer.valueOf(i));
                                }
                                i++;
                            }
                        } else
                        {
                            textfiltereddatabuffer.mEntityOffsets.clear();
                        }
                        if (TextUtils.isEmpty(s))
                        {
                            selectplayerslistfragment.mIsFiltering = false;
                            if (selectplayerslistfragment.mSpecialTilesAdapter != null)
                            {
                                selectplayerslistfragment.mSpecialTilesAdapter.setShowAutoPick(selectplayerslistfragment.mAllowAutoPick);
                                selectplayerslistfragment.mSpecialTilesAdapter.mAllowNearbyPlayers = selectplayerslistfragment.mAllowNearbySearch;
                            }
                            boolean flag1 = DataBufferUtils.hasData(selectplayerslistfragment.mNearbyDataBuffer);
                            if (selectplayerslistfragment.mNearbySearchEnabled)
                            {
                                selectplayerslistfragment.mNearbyPlayersHeaderAdapter.setVisible(true);
                                Object obj = selectplayerslistfragment.mNearbyPlayersNullStateAdapter;
                                String s1;
                                if (!flag1)
                                {
                                    flag1 = true;
                                } else
                                {
                                    flag1 = false;
                                }
                                ((SelectPlayersListFragment.NearbyPlayersNullStateAdapter) (obj)).setVisible(flag1);
                            } else
                            {
                                selectplayerslistfragment.mNearbyPlayersHeaderAdapter.setVisible(false);
                                selectplayerslistfragment.mNearbyPlayersNullStateAdapter.setVisible(false);
                            }
                            selectplayerslistfragment.mRecentPlayersAdapter.setAdapterVisible(true);
                            selectplayerslistfragment.mConnectedPlayersAdapter.setAdapterVisible(true);
                            selectplayerslistfragment.mMyCirclesPlayersAdapter.mOnEndOfWindowReachedListener = selectplayerslistfragment;
                            obj = selectplayerslistfragment.mMyCirclesPlayersAdapter.getDataBuffer().getMetadata();
                            s1 = ((Bundle) (obj)).getString("savedStatePageToken");
                            if (s1 != null)
                            {
                                ((Bundle) (obj)).putString("next_page_token", s1);
                            }
                            selectplayerslistfragment.updateHeaderVisibility();
                        } else
                        {
                            selectplayerslistfragment.mIsFiltering = true;
                            if (selectplayerslistfragment.mSpecialTilesAdapter != null)
                            {
                                selectplayerslistfragment.mSpecialTilesAdapter.setShowAutoPick(false);
                                selectplayerslistfragment.mSpecialTilesAdapter.mAllowNearbyPlayers = false;
                            }
                            selectplayerslistfragment.mNearbyPlayersAdapter.setAdapterVisible(false);
                            selectplayerslistfragment.mNearbyPlayersHeaderAdapter.setVisible(false);
                            selectplayerslistfragment.mNearbyPlayersNullStateAdapter.setVisible(false);
                            selectplayerslistfragment.mRecentPlayersHeaderAdapter.setVisible(false);
                            selectplayerslistfragment.mRecentPlayersAdapter.setAdapterVisible(false);
                            selectplayerslistfragment.mConnectedPlayersHeaderAdapter.setVisible(false);
                            selectplayerslistfragment.mConnectedPlayersAdapter.setAdapterVisible(false);
                            selectplayerslistfragment.mMyCirclesPlayersHeaderAdapter.setVisible(false);
                            selectplayerslistfragment.mMyCirclesPlayersAdapter.mOnEndOfWindowReachedListener = null;
                            Bundle bundle1 = selectplayerslistfragment.mMyCirclesPlayersAdapter.getDataBuffer().getMetadata();
                            bundle1.putString("savedStatePageToken", bundle1.getString("next_page_token"));
                        }
                        selectplayerslistfragment.mMyCirclesPlayersAdapter.notifyDataSetChanged();
                    }
                    if (TextUtils.isEmpty(charsequence))
                    {
                        mSelectablePlayersContainer.setVisibility(0);
                        mNoSelectablePlayersLayout.setVisibility(4);
                        mSelectablePlayersFragment.updateHeaderVisibility();
                    } else
                    if (mSelectablePlayersFragment.getFilteredPlayerCount() == 0)
                    {
                        mSelectablePlayersContainer.setVisibility(4);
                        mNoSelectablePlayersLayout.setVisibility(0);
                    } else
                    {
                        mSelectablePlayersContainer.setVisibility(0);
                        mNoSelectablePlayersLayout.setVisibility(4);
                    }
                }
                mOldFilterText = charsequence.toString();
            }

            
            {
                this$0 = SelectPlayersFragment.this;
                super();
                mOldFilterText = "";
            }
        });
        filterText.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final SelectPlayersFragment this$0;

            public final void onFocusChange(View view, boolean flag)
            {
                if (!flag)
                {
                    ((InputMethodManager)mParent.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }

            
            {
                this$0 = SelectPlayersFragment.this;
                super();
            }
        });
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final SelectPlayersFragment this$0;
            final TextView val$filterText;

            public final void onClick(View view)
            {
                filterText.setText("");
            }

            
            {
                this$0 = SelectPlayersFragment.this;
                filterText = textview;
                super();
            }
        });
        if (!super.mHasMenu)
        {
            super.mHasMenu = true;
            if (isAdded() && !super.mHidden)
            {
                super.mActivity.supportInvalidateOptionsMenu();
            }
        }
        return viewgroup;
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mCurrentPlayer = Games.Players.getCurrentPlayer(googleapiclient);
        if (mCurrentPlayer == null)
        {
            GamesLog.w("SelectPlayersFrag", "We don't have a current player, something went wrong. Finishing the activity");
            mParent.finish();
            return;
        } else
        {
            mCurrentPlayer.getIconImageUri();
            return;
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == 0x7f0d0050)
        {
            showActionBarProgressBar();
            onRefresh();
            return true;
        }
        if (i == 0x7f0d0353)
        {
            doSearch();
            return true;
        }
        if (i == 0x7f0d0354)
        {
            UiUtils.launchNearbyLearnMore(mParent);
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public final void onRefresh()
    {
        ((TextView)mFilterView.findViewById(0x7f0d012b)).setText("");
        saveState(new Bundle());
        mSelectablePlayersFragment.refresh(true, false);
        updatePlayerCount();
    }

    public final void onRemoveAutoMatchPlayer()
    {
        if (mNumAutoMatchPlayers == 0)
        {
            GamesLog.w("SelectPlayersFrag", "onRemoveAutoMatchPlayer: no auto-match players to remove!");
            return;
        } else
        {
            mNumAutoMatchPlayers = mNumAutoMatchPlayers - 1;
            mChipsGridAdapter.removeAutoMatchPlayer();
            updatePlayerCount();
            return;
        }
    }

    public final void onRemovePlayer(String s)
    {
        mSelectedPlayerIds.mSelectedSet.remove(s);
        mSelectablePlayersFragment.refresh(false, false);
        mSelectedPlayers.remove(s);
        mChipsGridAdapter.removePlayer(s);
        updatePlayerCount();
    }

    public final void onResume()
    {
        super.onResume();
        updatePlayerCount();
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        saveState(bundle);
    }

    public final boolean onSearchRequested()
    {
        doSearch();
        return false;
    }

    public final boolean onTouch(final View filterText, MotionEvent motionevent)
    {
        if (filterText.getId() != 0x7f0d027c)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        if (motionevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        mHasChipsListMoved = false;
_L4:
        return false;
_L2:
        if (motionevent.getAction() != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        unselectAllChips();
        if (mSelectedPlayerIds.getNumSelected() != 0 || mHasChipsListMoved) goto _L4; else goto _L3
_L3:
        filterText = (TextView)mFilterView.findViewById(0x7f0d012b);
        if (filterText.getVisibility() != 0) goto _L4; else goto _L5
_L5:
        mHandler.postDelayed(new Runnable() {

            final SelectPlayersFragment this$0;
            final TextView val$filterText;

            public final void run()
            {
                filterText.requestFocus();
                InputMethodManager inputmethodmanager = (InputMethodManager)mParent.getSystemService("input_method");
                if (inputmethodmanager != null)
                {
                    inputmethodmanager.showSoftInput(filterText, 0);
                }
            }

            
            {
                this$0 = SelectPlayersFragment.this;
                filterText = textview;
                super();
            }
        }, 100L);
        return false;
        if (motionevent.getAction() != 2) goto _L4; else goto _L6
_L6:
        mHasChipsListMoved = true;
        return false;
        GamesLog.w("SelectPlayersFrag", (new StringBuilder("onTouch: unexpected view ")).append(filterText).append(", id ").append(filterText.getId()).toString());
        return false;
    }

    final void removeAutoMatchPlayer()
    {
        boolean flag;
        if (mNumAutoMatchPlayers > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (mNumAutoMatchPlayers == 0)
        {
            GamesLog.w("SelectPlayersFrag", "removeAutoMatchPlayer: nobody to remove!");
            return;
        } else
        {
            mNumAutoMatchPlayers = mNumAutoMatchPlayers - 1;
            mChipsGridAdapter.removeAutoMatchPlayer();
            updatePlayerCount();
            unselectAllChips();
            return;
        }
    }

    public final void showActionBarProgressBar()
    {
        mShowActionBarProgressBar = true;
        if (mActionBarProgressBar != null)
        {
            mActionBarProgressBar.setVisibility(0);
        }
    }

    final boolean togglePlayer(Player player, int i)
    {
        boolean flag1 = false;
        Object obj = player.getPlayerId();
        boolean flag2;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Asserts.checkState(flag2);
        if (mCurrentPlayer == null)
        {
            GamesLog.w("SelectPlayersFrag", "don't have mCurrentPlayer yet");
            return false;
        }
        if (((String) (obj)).equals(mCurrentPlayer.getPlayerId()))
        {
            GamesLog.w("SelectPlayersFrag", (new StringBuilder("ignoring current player ")).append(player).toString());
            return false;
        }
        Object obj1 = mSelectedPlayerIds;
        android.net.Uri uri;
        if (((SelectionSet) (obj1)).isSelected(obj))
        {
            ((SelectionSet) (obj1)).mSelectedSet.remove(obj);
        } else
        {
            boolean flag = flag1;
            if (((SelectionSet) (obj1)).mMaxSelected != -1)
            {
                flag = flag1;
                if (((SelectionSet) (obj1)).mSelectedSet.size() >= ((SelectionSet) (obj1)).mMaxSelected)
                {
                    flag = true;
                }
            }
            if (!flag)
            {
                ((SelectionSet) (obj1)).mSelectedSet.add(obj);
            }
        }
        flag2 = ((SelectionSet) (obj1)).isSelected(obj);
        if (!flag2)
        {
            mSelectedPlayers.remove(obj);
        } else
        {
            Pair pair = new Pair((PlayerEntity)player.freeze(), Integer.valueOf(i));
            mSelectedPlayers.put(obj, pair);
        }
        obj = player.getPlayerId();
        obj1 = player.getDisplayName();
        uri = player.getIconImageUri();
        if (flag2)
        {
            player = mChipsGridAdapter;
            obj = new ChipsGridAdapter.ChipModel(((String) (obj)), ((String) (obj1)), uri);
            if (((ChipsGridAdapter) (player)).mChips.contains(obj))
            {
                GamesLog.w("ChipsGridAdapter", (new StringBuilder("addPlayer: chip ")).append(obj).append(" is already present").toString());
            } else
            {
                player.addChipInternal(((ChipsGridAdapter.ChipModel) (obj)));
            }
        } else
        {
            player = mChipsGridAdapter;
            ChipsGridAdapter.ChipModel chipmodel = new ChipsGridAdapter.ChipModel(((String) (obj)), null, null);
            if (((ChipsGridAdapter) (player)).mChips.contains(chipmodel))
            {
                mChipsGridAdapter.removePlayer(((String) (obj)));
            }
        }
        updatePlayerCount();
        unselectAllChips();
        return true;
    }

    final void updatePlayerCount()
    {
        int i = mSelectedPlayerIds.getNumSelected();
        int j = mNumAutoMatchPlayers;
        Resources resources = getResources();
        boolean flag;
        if (mMetadataProvider.updateSubtitle())
        {
            int k = getNumPlayerSlotsLeft();
            Object obj;
            if (k >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            if (k == mMetadataProvider.getMaxParticipants())
            {
                k = mMetadataProvider.getMinParticipants() + 1;
                int l = mMetadataProvider.getMaxParticipants() + 1;
                boolean flag2;
                if (l == k)
                {
                    obj = resources.getString(0x7f100271, new Object[] {
                        Integer.valueOf(k)
                    });
                } else
                {
                    obj = resources.getString(0x7f100272, new Object[] {
                        Integer.valueOf(k), Integer.valueOf(l)
                    });
                }
            } else
            if (k > 0)
            {
                obj = resources.getQuantityString(0x7f0f0010, k, new Object[] {
                    Integer.valueOf(k)
                });
            } else
            {
                obj = resources.getString(0x7f100270);
            }
            mParent.setSubtitle(((CharSequence) (obj)));
        }
        i = i + j + 1;
        obj = resources.getQuantityString(0x7f0f000e, i, new Object[] {
            Integer.valueOf(i)
        });
        mCurrentCountLabel.setText(((CharSequence) (obj)));
        i = mMetadataProvider.getMaxParticipants() - mNumAutoMatchPlayers;
        obj = mSelectedPlayerIds;
        if (i >= ((SelectionSet) (obj)).mSelectedSet.size() || i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        obj.mMaxSelected = i;
        flag2 = hasRoomForMorePlayers();
        obj = mSelectablePlayersFragment;
        ((SelectPlayersListFragment) (obj)).mRecentPlayersAdapter.setUnselectedPlayersEnabled(flag2);
        ((SelectPlayersListFragment) (obj)).mConnectedPlayersAdapter.setUnselectedPlayersEnabled(flag2);
        ((SelectPlayersListFragment) (obj)).mMyCirclesPlayersAdapter.setUnselectedPlayersEnabled(flag2);
        if (mSearchMenuItem != null)
        {
            mSearchMenuItem.setVisible(flag2);
            mSearchMenuItem.setEnabled(flag2);
        }
        if (!flag2 && mNumAutoMatchPlayers > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = mSelectablePlayersFragment;
        if (((SelectPlayersListFragment) (obj)).mSpecialTilesAdapter != null)
        {
            obj = ((SelectPlayersListFragment) (obj)).mSpecialTilesAdapter;
            boolean flag1;
            if (!flag2 || !flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Asserts.checkState(flag1);
            if (((SelectPlayersAdapter) (obj)).mAllowAutoPick && (((SelectPlayersAdapter) (obj)).mAutoPickItemAddEnabled != flag2 || ((SelectPlayersAdapter) (obj)).mAutoPickItemRemoveEnabled != flag))
            {
                obj.mAutoPickItemAddEnabled = flag2;
                obj.mAutoPickItemRemoveEnabled = flag;
                ((SelectPlayersAdapter) (obj)).notifyDataSetChanged();
            }
        }
        if (mSelectPlayersListener != null)
        {
            mSelectPlayersListener.onSelectedPlayersChanged(mSelectedPlayers, mNumAutoMatchPlayers);
            obj = mSelectablePlayersFragment;
            ((SelectPlayersListFragment) (obj)).getListView().setPadding(0, 0, 0, ((SelectPlayersListFragment) (obj)).mMetadataProvider.getBottomPadding());
        }
        mSelectablePlayersFragment.toggleAutoMatchWarning();
        updateStagingAreaHeight();
    }






}
