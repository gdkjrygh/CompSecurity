// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.requests;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.GmsIntents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.ui.DatabufferRecyclerAdapter;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.common.players.ProfileSummaryAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.requests:
//            RequestAdapter, GameRequestUtils

public final class PublicRequestFragment extends GamesHeaderRecyclerViewFragment
    implements com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, com.google.android.gms.games.ui.common.players.ProfileSummaryAdapter.ProfileSummaryEventListener, RequestAdapter.RequestEventListener
{
    public static interface GameRequestClusterMetadataProvider
    {

        public abstract String getAccountName();

        public abstract GameRequestCluster getGameRequestCluster();
    }


    private Player mAddedPlayer;
    private String mCurrentAccountName;
    private RequestAdapter.RequestEventListener mEventListener;
    private GameRequestCluster mGameRequestCluster;
    private boolean mPlayerWasAdded;
    private ProfileSummaryAdapter mProfileAddAdapter;
    private boolean mRemoveCluster;
    private ArrayList mRemovedRequestList;
    private RequestAdapter mRequestAdapter;
    private HeaderItemRecyclerAdapter mRequestHeaderAdapter;

    public PublicRequestFragment()
    {
        mRemovedRequestList = null;
        mRemoveCluster = false;
        mPlayerWasAdded = false;
    }

    private void updateHeaders()
    {
        int i = mRequestAdapter.getDataBufferCount();
        HeaderItemRecyclerAdapter headeritemrecycleradapter = mRequestHeaderAdapter;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        headeritemrecycleradapter.setVisible(flag);
    }

    protected final int getPlaylogElementType()
    {
        return 5;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        Object obj;
        int i;
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof GameRequestClusterMetadataProvider);
        obj = (GameRequestClusterMetadataProvider)mParent;
        mGameRequestCluster = ((GameRequestClusterMetadataProvider) (obj)).getGameRequestCluster();
        mCurrentAccountName = ((GameRequestClusterMetadataProvider) (obj)).getAccountName();
        Asserts.checkState(mParent instanceof RequestInboxHelper.RequestInboxHelperProvider);
        mEventListener = ((RequestInboxHelper.RequestInboxHelperProvider)mParent).getRequestInboxHelper();
        Asserts.checkNotNull(mEventListener);
        obj = new HeaderItemRecyclerAdapter(mParent);
        ((HeaderItemRecyclerAdapter) (obj)).setTitle(getString(0x7f10018e, new Object[] {
            mGameRequestCluster.getSender().getDisplayName()
        }));
        ((HeaderItemRecyclerAdapter) (obj)).setSubtitle$13462e();
        mProfileAddAdapter = new ProfileSummaryAdapter(super.mActivity, this);
        i = mGameRequestCluster.getType();
        mRequestHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        i;
        JVM INSTR tableswitch 1 2: default 184
    //                   1 209
    //                   2 341;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Invalid request type: ")).append(i).toString());
_L2:
        mRequestHeaderAdapter.setTitle(0x7f10024a);
        mRequestHeaderAdapter.setButton(this, 0x7f10024b, 0x7f10024c, "openAllButton");
        mRequestHeaderAdapter.showButton(true);
_L5:
        mRequestAdapter = new RequestAdapter(mParent, this);
        mRequestAdapter.mCurrentAccountName = mCurrentAccountName;
        com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder builder = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        builder.addAdapter(((com.google.android.gms.games.ui.GamesRecyclerAdapter) (obj)));
        builder.addAdapter(mProfileAddAdapter);
        builder.addAdapter(mRequestHeaderAdapter);
        builder.addAdapter(mRequestAdapter);
        setAdapter(builder.build());
        if (bundle != null)
        {
            mRemovedRequestList = bundle.getParcelableArrayList("savedStateRemovedIdList");
            mRemoveCluster = bundle.getBoolean("savedStateRemoveCluster");
        }
        return;
_L3:
        mRequestHeaderAdapter.setTitle(0x7f10024d);
        mRequestHeaderAdapter.showButton(false);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1 && ProfileSummaryAdapter.wasPlayerAddedToCircles(mAddedPlayer, intent))
        {
            mProfileAddAdapter.markPlayerAsAdded();
            mPlayerWasAdded = true;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        mProfileAddAdapter.setCurrentPlayerInfo(mGameRequestCluster.getSender());
        if (!mRemoveCluster) goto _L2; else goto _L1
_L1:
        googleapiclient = new ObjectDataBuffer();
_L4:
        mRequestAdapter.setDataBuffer(googleapiclient);
        mLoadingDataViewManager.setViewState(2);
        updateHeaders();
        return;
_L2:
        ObjectDataBuffer objectdatabuffer = new ObjectDataBuffer(mGameRequestCluster.getRequestList());
        googleapiclient = objectdatabuffer;
        if (mRemovedRequestList == null)
        {
            continue;
        }
        int i = 0;
        int j = mRemovedRequestList.size();
        do
        {
            googleapiclient = objectdatabuffer;
            if (i >= j)
            {
                continue;
            }
            objectdatabuffer.filterOut(mRemovedRequestList.get(i));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onHeaderClicked(String s)
    {
        if ("openAllButton".equals(s))
        {
            s = GameRequestUtils.extractFromBuffers(new DataBuffer[] {
                ((DatabufferRecyclerAdapter) (mRequestAdapter)).mDataBuffer
            });
            mEventListener.onRequestsClicked(s);
        }
    }

    public final void onProfileEditCirclesClicked(Player player)
    {
        mAddedPlayer = (Player)player.freeze();
        UiUtils.startActivityForResultFromFragment(this, UiUtils.createAddUpdateCirclesIntent(mParent, mCurrentAccountName, player.getPlayerId(), null), 1);
    }

    public final void onProfileViewProfileClicked(Player player, SharedElementTransition sharedelementtransition)
    {
        if (!mParent.mConfiguration.isDestinationUi())
        {
            startActivity(GmsIntents.createShowProfileIntent(mParent, player.getPlayerId()));
            return;
        } else
        {
            UiUtils.viewProfileComparison(mParent, player, sharedelementtransition);
            return;
        }
    }

    public final void onRequestDismissed(GameRequest gamerequest)
    {
        mEventListener.onRequestDismissed(gamerequest);
        updateHeaders();
        int i;
        int j;
        if (gamerequest != null)
        {
            if (mRequestAdapter.getDataBufferCount() == 0)
            {
                mRemovedRequestList = null;
                mRemoveCluster = true;
            } else
            {
                if (mRemovedRequestList == null)
                {
                    mRemovedRequestList = new ArrayList();
                }
                mRemovedRequestList.add(gamerequest);
            }
        }
        gamerequest = new Intent();
        if (mRemovedRequestList == null || mRemovedRequestList.isEmpty()) goto _L2; else goto _L1
_L1:
        j = mRemovedRequestList.size();
        ArrayList arraylist = new ArrayList(j);
        for (i = 0; i < j; i++)
        {
            arraylist.add(((GameRequest)mRemovedRequestList.get(i)).getRequestId());
        }

        gamerequest.putExtra("com.google.android.gms.games.GAME_REQUEST_CLUSTER", mGameRequestCluster);
        gamerequest.putExtra("com.google.android.gms.games.REMOVED_ID_LIST", arraylist);
_L4:
        gamerequest.putExtra("com.google.android.gms.games.PLAYER_WAS_ADDED", mPlayerWasAdded);
        mParent.setResult(900, gamerequest);
        return;
_L2:
        if (mRemoveCluster)
        {
            gamerequest.putExtra("com.google.android.gms.games.GAME_REQUEST_CLUSTER", mGameRequestCluster);
            gamerequest.putExtra("com.google.android.gms.games.REMOVE_CLUSTER", true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onRequestMuteAppClicked(Game game)
    {
        mEventListener.onRequestMuteAppClicked(game);
    }

    public final transient void onRequestsClicked(GameRequest agamerequest[])
    {
        mEventListener.onRequestsClicked(agamerequest);
    }

    public final void onRetry()
    {
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("savedStateRemovedIdList", mRemovedRequestList);
        bundle.putBoolean("savedStateRemoveCluster", mRemoveCluster);
    }
}
