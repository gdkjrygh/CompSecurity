// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.HeaderItemRecyclerAdapter;
import com.google.android.gms.games.ui.InboxDataEventListener;
import com.google.android.gms.games.ui.LoadingAdapter;
import com.google.android.gms.games.ui.MergedRecyclerAdapter;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            InboxNearbyPlayersAdapter, InvitationAdapter, InvitationClusterAdapter, MatchAdapter, 
//            InvitationBufferHelper

public final class MultiplayerInboxRecyclerAdapter extends MergedRecyclerAdapter
    implements com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener, InvitationAdapter.InvitationEventListener, InvitationClusterAdapter.InvitationClusterEventListener, MatchAdapter.MatchEventListener
{

    final MatchAdapter mCompletedMatchAdapter;
    private final HeaderItemRecyclerAdapter mCompletedMatchHeaderAdapter;
    private final com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener mHeaderEventListener;
    private final InboxDataEventListener mInboxDataEventListener;
    final InboxNearbyPlayersAdapter mInboxNearbyPlayersAdapter;
    final InvitationAdapter mInvitationAdapter;
    public final InvitationClusterAdapter mInvitationClusterAdapter;
    private final InvitationClusterAdapter.InvitationClusterEventListener mInvitationClusterEventListener;
    private final InvitationAdapter.InvitationEventListener mInvitationEventListener;
    private final HeaderItemRecyclerAdapter mInvitationHeaderAdapter;
    private boolean mIsAllDataLoaded;
    final LoadingAdapter mLoadingAdapter;
    private final MatchAdapter.MatchEventListener mMatchEventListener;
    final MatchAdapter mMyTurnAdapter;
    private final HeaderItemRecyclerAdapter mMyTurnHeaderAdapter;
    final GamesFragmentActivity mParentActivity;
    private int mStatusCode;
    final MatchAdapter mTheirTurnAdapter;
    private final HeaderItemRecyclerAdapter mTheirTurnHeaderAdapter;

    public MultiplayerInboxRecyclerAdapter(GamesFragmentActivity gamesfragmentactivity, InvitationAdapter.InvitationEventListener invitationeventlistener, InvitationClusterAdapter.InvitationClusterEventListener invitationclustereventlistener, MatchAdapter.MatchEventListener matcheventlistener, InboxDataEventListener inboxdataeventlistener, com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener headereventlistener, InboxNearbyPlayersAdapter.InboxNearbyPlayersEventListener inboxnearbyplayerseventlistener)
    {
        mIsAllDataLoaded = false;
        mParentActivity = gamesfragmentactivity;
        mInvitationEventListener = (InvitationAdapter.InvitationEventListener)Preconditions.checkNotNull(invitationeventlistener);
        mInvitationClusterEventListener = (InvitationClusterAdapter.InvitationClusterEventListener)Preconditions.checkNotNull(invitationclustereventlistener);
        mMatchEventListener = (MatchAdapter.MatchEventListener)Preconditions.checkNotNull(matcheventlistener);
        mInboxDataEventListener = (InboxDataEventListener)Preconditions.checkNotNull(inboxdataeventlistener);
        mHeaderEventListener = (com.google.android.gms.games.ui.HeaderItemRecyclerAdapter.HeaderEventListener)Preconditions.checkNotNull(headereventlistener);
        mLoadingAdapter = new LoadingAdapter(gamesfragmentactivity);
        mInboxNearbyPlayersAdapter = new InboxNearbyPlayersAdapter(gamesfragmentactivity, inboxnearbyplayerseventlistener);
        mInboxNearbyPlayersAdapter.setVisible(((Boolean)G.allowNearbyPlayerSearch.get()).booleanValue());
        if (!gamesfragmentactivity.mConfiguration.isClientUi())
        {
            mInboxNearbyPlayersAdapter.setVisible(false);
        }
        mInvitationHeaderAdapter = new HeaderItemRecyclerAdapter(gamesfragmentactivity);
        mInvitationHeaderAdapter.setTitle(0x7f10018b);
        mInvitationHeaderAdapter.setButtonWithMoreCount(this, "invitationsButton");
        mInvitationAdapter = new InvitationAdapter(gamesfragmentactivity, this, 0x7f0e000a);
        mInvitationAdapter.disablePagination();
        mInvitationClusterAdapter = new InvitationClusterAdapter(gamesfragmentactivity, this, 0x7f0e000a);
        mInvitationClusterAdapter.disablePagination();
        mMyTurnHeaderAdapter = new HeaderItemRecyclerAdapter(gamesfragmentactivity);
        mMyTurnHeaderAdapter.setTitle(0x7f10018c);
        mMyTurnHeaderAdapter.setButtonWithMoreCount(this, "myTurnButton");
        mMyTurnAdapter = new MatchAdapter(gamesfragmentactivity, this, 0x7f0e000b);
        mMyTurnAdapter.disablePagination();
        mTheirTurnHeaderAdapter = new HeaderItemRecyclerAdapter(gamesfragmentactivity);
        mTheirTurnHeaderAdapter.setTitle(0x7f10018f);
        mTheirTurnHeaderAdapter.setButtonWithMoreCount(this, "theirTurnButton");
        mTheirTurnAdapter = new MatchAdapter(gamesfragmentactivity, this, 0x7f0e000c);
        mTheirTurnAdapter.disablePagination();
        mCompletedMatchHeaderAdapter = new HeaderItemRecyclerAdapter(gamesfragmentactivity);
        mCompletedMatchHeaderAdapter.setTitle(0x7f10018a);
        mCompletedMatchHeaderAdapter.setButtonWithMoreCount(this, "completedMatchesButton");
        mCompletedMatchAdapter = new MatchAdapter(gamesfragmentactivity, this, 0x7f0e0009);
        mCompletedMatchAdapter.disablePagination();
        gamesfragmentactivity = new ArrayList();
        gamesfragmentactivity.add(mLoadingAdapter);
        gamesfragmentactivity.add(mInboxNearbyPlayersAdapter);
        gamesfragmentactivity.add(mInvitationHeaderAdapter);
        gamesfragmentactivity.add(mInvitationAdapter);
        gamesfragmentactivity.add(mInvitationClusterAdapter);
        gamesfragmentactivity.add(mMyTurnHeaderAdapter);
        gamesfragmentactivity.add(mMyTurnAdapter);
        gamesfragmentactivity.add(mTheirTurnHeaderAdapter);
        gamesfragmentactivity.add(mTheirTurnAdapter);
        gamesfragmentactivity.add(mCompletedMatchHeaderAdapter);
        gamesfragmentactivity.add(mCompletedMatchAdapter);
        setAdapterList(gamesfragmentactivity);
        clearData();
    }

    public final void clearData()
    {
        super.clearData();
        mLoadingAdapter.setVisible(true);
        mInvitationHeaderAdapter.setVisible(false);
        mMyTurnHeaderAdapter.setVisible(false);
        mTheirTurnHeaderAdapter.setVisible(false);
        mCompletedMatchHeaderAdapter.setVisible(false);
    }

    public final void onHeaderClicked(String s)
    {
        mHeaderEventListener.onHeaderClicked(s);
    }

    public final void onInvitationAccepted(Invitation invitation)
    {
        mInvitationEventListener.onInvitationAccepted(invitation);
    }

    public final void onInvitationClusterDeclined(ZInvitationCluster zinvitationcluster)
    {
        mInvitationClusterEventListener.onInvitationClusterDeclined(zinvitationcluster);
        updateHeaders();
    }

    public final void onInvitationClusterDismissed(ZInvitationCluster zinvitationcluster)
    {
        mInvitationClusterEventListener.onInvitationClusterDismissed(zinvitationcluster);
        updateHeaders();
    }

    public final void onInvitationClusterSeeMoreClicked(ZInvitationCluster zinvitationcluster, String s, String s1)
    {
        mInvitationClusterEventListener.onInvitationClusterSeeMoreClicked(zinvitationcluster, s, s1);
    }

    public final void onInvitationDeclined(Invitation invitation)
    {
        mInvitationEventListener.onInvitationDeclined(invitation);
        updateHeaders();
    }

    public final void onInvitationDismissed(Invitation invitation)
    {
        mInvitationEventListener.onInvitationDismissed(invitation);
        updateHeaders();
    }

    public final void onInvitationGameInfoClicked(Game game)
    {
        mInvitationEventListener.onInvitationGameInfoClicked(game);
    }

    public final void onInvitationMuteAppClicked(Game game)
    {
        mInvitationEventListener.onInvitationMuteAppClicked(game);
    }

    public final void onInvitationParticipantListClicked(Invitation invitation, String s, String s1)
    {
        mInvitationEventListener.onInvitationParticipantListClicked(invitation, s, s1);
    }

    public final void onMatchClicked(TurnBasedMatch turnbasedmatch)
    {
        mMatchEventListener.onMatchClicked(turnbasedmatch);
    }

    public final void onMatchDismissed(TurnBasedMatch turnbasedmatch)
    {
        mMatchEventListener.onMatchDismissed(turnbasedmatch);
        updateHeaders();
    }

    public final void onMatchMuteAppClicked(Game game)
    {
        mMatchEventListener.onMatchMuteAppClicked(game);
    }

    public final void onMatchParticipantListClicked(TurnBasedMatch turnbasedmatch, String s, String s1)
    {
        mMatchEventListener.onMatchParticipantListClicked(turnbasedmatch, s, s1);
    }

    public final void onMatchRematch(TurnBasedMatch turnbasedmatch)
    {
        mMatchEventListener.onMatchRematch(turnbasedmatch);
    }

    public final void onTurnBasedMatchesLoaded(com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult loadmatchesresult)
    {
        boolean flag1;
        flag1 = false;
        mStatusCode = loadmatchesresult.getStatus().mStatusCode;
        loadmatchesresult = loadmatchesresult.getMatches();
        boolean flag2 = mParentActivity.canContinueWithStatus(mStatusCode);
        if (!flag2)
        {
            loadmatchesresult.release();
            return;
        }
        if (((LoadMatchesResponse) (loadmatchesresult)).mInvitations == null || ((LoadMatchesResponse) (loadmatchesresult)).mInvitations.getCount() <= 0) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mInboxDataEventListener != null)
        {
            mInboxDataEventListener.onNoDataLoaded(mStatusCode);
        }
        loadmatchesresult.release();
        return;
_L2:
        if (((LoadMatchesResponse) (loadmatchesresult)).mMyTurnMatches != null && ((LoadMatchesResponse) (loadmatchesresult)).mMyTurnMatches.getCount() > 0)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        if (((LoadMatchesResponse) (loadmatchesresult)).mTheirTurnMatches != null && ((LoadMatchesResponse) (loadmatchesresult)).mTheirTurnMatches.getCount() > 0)
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((LoadMatchesResponse) (loadmatchesresult)).mCompletedMatches == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((LoadMatchesResponse) (loadmatchesresult)).mCompletedMatches.getCount() > 0)
        {
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        InvitationBuffer invitationbuffer = ((LoadMatchesResponse) (loadmatchesresult)).mInvitations;
        InvitationBufferHelper invitationbufferhelper = new InvitationBufferHelper(invitationbuffer);
        invitationbuffer.release();
        mLoadingAdapter.setVisible(false);
        mInvitationAdapter.setDataBuffer(invitationbufferhelper.mInCirclesInvitationBuffer);
        mInvitationClusterAdapter.setDataBuffer(invitationbufferhelper.mAggregatedInvitationBuffer);
        mMyTurnAdapter.setDataBuffer(((LoadMatchesResponse) (loadmatchesresult)).mMyTurnMatches);
        mTheirTurnAdapter.setDataBuffer(((LoadMatchesResponse) (loadmatchesresult)).mTheirTurnMatches);
        mCompletedMatchAdapter.setDataBuffer(((LoadMatchesResponse) (loadmatchesresult)).mCompletedMatches);
        if (mInboxDataEventListener != null)
        {
            mInboxDataEventListener.onDataLoaded();
        }
        mIsAllDataLoaded = true;
        updateHeaders();
        return;
        Exception exception;
        exception;
        loadmatchesresult.release();
        throw exception;
    }

    public final void setNearbyPlayersEnabled(boolean flag)
    {
        mInboxNearbyPlayersAdapter.setNearbyPlayersEnabled(flag);
    }

    public final void updateHeaders()
    {
        int i = mInvitationAdapter.getDataBufferCount();
        int j = mInvitationClusterAdapter.getDataBufferCount();
        boolean flag1 = mInvitationHeaderAdapter.updateHeaderAdapter(i + j, mInvitationAdapter.getItemCount());
        i = mMyTurnAdapter.getDataBufferCount();
        boolean flag;
        if (mMyTurnHeaderAdapter.updateHeaderAdapter(i, mMyTurnAdapter.getItemCount()) || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = mTheirTurnAdapter.getDataBufferCount();
        if (mTheirTurnHeaderAdapter.updateHeaderAdapter(j, mTheirTurnAdapter.getItemCount()) || flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = mCompletedMatchAdapter.getDataBufferCount();
        if (mCompletedMatchHeaderAdapter.updateHeaderAdapter(j, mCompletedMatchAdapter.getItemCount()) || flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mInboxDataEventListener != null && !flag && mIsAllDataLoaded)
        {
            mInboxDataEventListener.onNoDataLoaded(mStatusCode);
        }
        super.mObservable.notifyChanged();
    }

    // Unreferenced inner class com/google/android/gms/games/ui/common/matches/MultiplayerInboxRecyclerAdapter$1

/* anonymous class */
    final class _cls1
        implements ResultCallback
    {

        final MultiplayerInboxRecyclerAdapter this$0;

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult)result;
            onTurnBasedMatchesLoaded(result);
        }

            
            {
                this$0 = MultiplayerInboxRecyclerAdapter.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/ui/common/matches/MultiplayerInboxRecyclerAdapter$2

/* anonymous class */
    final class _cls2
        implements ResultCallback
    {

        final MultiplayerInboxRecyclerAdapter this$0;

        public final volatile void onResult(Result result)
        {
            result = (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult)result;
            onTurnBasedMatchesLoaded(result);
        }

            
            {
                this$0 = MultiplayerInboxRecyclerAdapter.this;
                super();
            }
    }

}
