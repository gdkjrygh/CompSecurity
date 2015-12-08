// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.GmsIntents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.common.players.ProfileSummaryAdapter;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            InvitationAdapter

public final class PublicInvitationFragment extends GamesHeaderRecyclerViewFragment
    implements InvitationAdapter.InvitationEventListener, com.google.android.gms.games.ui.common.players.ProfileSummaryAdapter.ProfileSummaryEventListener
{
    public static interface InvitationClusterMetadataProvider
    {

        public abstract String getAccountName();

        public abstract ZInvitationCluster getInvitationCluster();

        public abstract String getPlayerId();
    }


    private Player mAddedPlayer;
    private String mCurrentAccountName;
    private InvitationAdapter.InvitationEventListener mEventListener;
    private InvitationAdapter mInvitationAdapter;
    private ZInvitationCluster mInvitationCluster;
    private HeaderItemRecyclerAdapter mInvitationHeaderAdapter;
    private boolean mPlayerWasAdded;
    private ProfileSummaryAdapter mProfileAddAdapter;
    private boolean mRemoveCluster;
    private ArrayList mRemovedInvitationList;

    public PublicInvitationFragment()
    {
        mRemovedInvitationList = null;
        mRemoveCluster = false;
        mPlayerWasAdded = false;
    }

    private void updateHeaders()
    {
        int i = mInvitationAdapter.getDataBufferCount();
        HeaderItemRecyclerAdapter headeritemrecycleradapter = mInvitationHeaderAdapter;
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

    private void updateResultData(Invitation invitation)
    {
        int i;
        int j;
        if (invitation != null)
        {
            if (mInvitationAdapter.getDataBufferCount() == 0)
            {
                mRemovedInvitationList = null;
                mRemoveCluster = true;
            } else
            {
                if (mRemovedInvitationList == null)
                {
                    mRemovedInvitationList = new ArrayList();
                }
                mRemovedInvitationList.add(invitation);
            }
        }
        invitation = new Intent();
        if (mRemovedInvitationList == null || mRemovedInvitationList.isEmpty()) goto _L2; else goto _L1
_L1:
        j = mRemovedInvitationList.size();
        ArrayList arraylist = new ArrayList(j);
        for (i = 0; i < j; i++)
        {
            arraylist.add(((Invitation)mRemovedInvitationList.get(i)).getInvitationId());
        }

        invitation.putExtra("com.google.android.gms.games.INVITATION_CLUSTER", mInvitationCluster);
        invitation.putExtra("com.google.android.gms.games.REMOVED_ID_LIST", arraylist);
_L4:
        invitation.putExtra("com.google.android.gms.games.PLAYER_WAS_ADDED", mPlayerWasAdded);
        mParent.setResult(900, invitation);
        return;
_L2:
        if (mRemoveCluster)
        {
            invitation.putExtra("com.google.android.gms.games.INVITATION_CLUSTER", mInvitationCluster);
            invitation.putExtra("com.google.android.gms.games.REMOVE_CLUSTER", true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final int getPlaylogElementType()
    {
        return 42;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof InvitationClusterMetadataProvider);
        Object obj = (InvitationClusterMetadataProvider)mParent;
        mInvitationCluster = ((InvitationClusterMetadataProvider) (obj)).getInvitationCluster();
        mCurrentAccountName = ((InvitationClusterMetadataProvider) (obj)).getAccountName();
        Participant participant = mInvitationCluster.getInviter();
        Asserts.checkNotNull(participant.getPlayer(), "Must have a valid player to show cluster!");
        Asserts.checkState(mParent instanceof MultiplayerInboxHelper.MultiplayerInboxHelperProvider);
        mEventListener = ((MultiplayerInboxHelper.MultiplayerInboxHelperProvider)mParent).getMultiplayerInboxHelper();
        Asserts.checkNotNull(mEventListener);
        HeaderItemRecyclerAdapter headeritemrecycleradapter = new HeaderItemRecyclerAdapter(mParent);
        headeritemrecycleradapter.setTitle(getString(0x7f10018e, new Object[] {
            participant.getDisplayName()
        }));
        headeritemrecycleradapter.setSubtitle$13462e();
        mProfileAddAdapter = new ProfileSummaryAdapter(super.mActivity, this);
        mInvitationHeaderAdapter = new HeaderItemRecyclerAdapter(mParent);
        mInvitationHeaderAdapter.setTitle(0x7f10018b);
        mInvitationAdapter = new InvitationAdapter(mParent, this);
        mInvitationAdapter.setCurrentPlayerInfo(((InvitationClusterMetadataProvider) (obj)).getPlayerId(), mCurrentAccountName);
        obj = new com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder();
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(headeritemrecycleradapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mProfileAddAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mInvitationHeaderAdapter);
        ((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).addAdapter(mInvitationAdapter);
        setAdapter(((com.google.android.gms.games.ui.MergedRecyclerAdapter.Builder) (obj)).build());
        if (bundle != null)
        {
            mRemovedInvitationList = bundle.getParcelableArrayList("savedStateRemovedIdList");
            mRemoveCluster = bundle.getBoolean("savedStateRemoveCluster");
        }
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
        mProfileAddAdapter.setCurrentPlayerInfo(mInvitationCluster.getInviter().getPlayer());
        if (!mRemoveCluster) goto _L2; else goto _L1
_L1:
        googleapiclient = new ObjectDataBuffer();
_L4:
        mInvitationAdapter.setDataBuffer(googleapiclient);
        mLoadingDataViewManager.setViewState(2);
        updateHeaders();
        return;
_L2:
        ObjectDataBuffer objectdatabuffer = new ObjectDataBuffer(mInvitationCluster.getInvitationList());
        googleapiclient = objectdatabuffer;
        if (mRemovedInvitationList == null)
        {
            continue;
        }
        int i = 0;
        int j = mRemovedInvitationList.size();
        do
        {
            googleapiclient = objectdatabuffer;
            if (i >= j)
            {
                continue;
            }
            objectdatabuffer.filterOut(mRemovedInvitationList.get(i));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onInvitationAccepted(Invitation invitation)
    {
        mEventListener.onInvitationAccepted(invitation);
    }

    public final void onInvitationDeclined(Invitation invitation)
    {
        mEventListener.onInvitationDeclined(invitation);
        updateHeaders();
        updateResultData(invitation);
    }

    public final void onInvitationDismissed(Invitation invitation)
    {
        mEventListener.onInvitationDismissed(invitation);
        updateHeaders();
        updateResultData(invitation);
    }

    public final void onInvitationGameInfoClicked(Game game)
    {
        mEventListener.onInvitationGameInfoClicked(game);
    }

    public final void onInvitationMuteAppClicked(Game game)
    {
        mEventListener.onInvitationMuteAppClicked(game);
    }

    public final void onInvitationParticipantListClicked(Invitation invitation, String s, String s1)
    {
        mEventListener.onInvitationParticipantListClicked(invitation, s, s1);
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

    public final void onRetry()
    {
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("savedStateRemovedIdList", mRemovedInvitationList);
        bundle.putBoolean("savedStateRemoveCluster", mRemoveCluster);
    }
}
