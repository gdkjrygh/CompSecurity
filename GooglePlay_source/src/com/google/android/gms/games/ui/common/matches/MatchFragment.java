// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.OnMultiplayerUpdatedListener;
import com.google.android.gms.games.ui.util.LoadingDataRecyclerViewManager;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            MatchAdapter

public final class MatchFragment extends GamesHeaderRecyclerViewFragment
    implements ResultCallback, OnMultiplayerUpdatedListener, MatchAdapter.MatchEventListener
{

    private MatchAdapter.MatchEventListener mEventListener;
    private MatchAdapter mMatchAdapter;
    private int mMatchTurnStatus;

    public MatchFragment()
    {
    }

    public static MatchFragment newInstance(int i)
    {
        if (i != 1 && i != 2 && i != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("Match type ")).append(i).append(" is invalid").toString());
        } else
        {
            MatchFragment matchfragment = new MatchFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("match_type", i);
            matchfragment.setArguments(bundle);
            return matchfragment;
        }
    }

    private void reloadData()
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
            Games.TurnBasedMultiplayer.loadMatchesByStatus(googleapiclient, new int[] {
                mMatchTurnStatus
            }).setResultCallback(this);
            return;
        } else
        {
            Games.TurnBasedMultiplayer.loadMatchesByStatusFirstParty$1a7105dc(googleapiclient, gamesuiconfiguration.getCurrentGameId(), new int[] {
                mMatchTurnStatus
            }).setResultCallback(this);
            return;
        }
    }

    protected final int getPlaylogElementType()
    {
        return 11;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof MultiplayerInboxHelper.MultiplayerInboxHelperProvider);
        mEventListener = ((MultiplayerInboxHelper.MultiplayerInboxHelperProvider)mParent).getMultiplayerInboxHelper();
        Asserts.checkNotNull(mEventListener);
        bundle = super.mArguments;
        Asserts.checkState(bundle.containsKey("match_type"), "Must specify a match type!");
        mMatchTurnStatus = bundle.getInt("match_type");
        int i = 0;
        if (mParent.mConfiguration.isDestinationUi())
        {
            i = 0x7f100194;
        }
        setEmptyViewElements(0x7f020154, 0x7f100195, i);
        mMatchAdapter = new MatchAdapter(mParent, this);
        setAdapter(mMatchAdapter);
    }

    public final void onDetach()
    {
        super.onDetach();
        unregisterPlayerChangeObserver();
        if (!isGoogleApiClientCreated())
        {
            GamesLog.w("MatchFragment", "Tearing down without finishing creation");
        }
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
        Object obj = mParent.mConfiguration;
        mMatchAdapter.setCurrentPlayerInfo(((GamesUiConfiguration) (obj)).getCurrentPlayerId(), ((GamesUiConfiguration) (obj)).getCurrentAccountName());
        if (((GamesUiConfiguration) (obj)).is3PContext())
        {
            Games.TurnBasedMultiplayer.loadMatchesByStatus(googleapiclient, new int[] {
                mMatchTurnStatus
            }).setResultCallback(this);
            Games.Notifications.clear(googleapiclient, 2);
        } else
        {
            obj = ((GamesUiConfiguration) (obj)).getCurrentGameId();
            Games.TurnBasedMultiplayer.loadMatchesByStatusFirstParty$1a7105dc(googleapiclient, ((String) (obj)), new int[] {
                mMatchTurnStatus
            }).setResultCallback(this);
            Games.Notifications.clearFirstParty(googleapiclient, ((String) (obj)), 2);
        }
        registerPlayerChangeObserver();
    }

    public final void onMatchClicked(TurnBasedMatch turnbasedmatch)
    {
        mEventListener.onMatchClicked(turnbasedmatch);
    }

    public final void onMatchDismissed(TurnBasedMatch turnbasedmatch)
    {
        mEventListener.onMatchDismissed(turnbasedmatch);
        int i = mMatchAdapter.getItemCount();
        turnbasedmatch = mLoadingDataViewManager;
        if (i > 0)
        {
            i = 2;
        } else
        {
            i = 3;
        }
        turnbasedmatch.setViewState(i);
    }

    public final void onMatchMuteAppClicked(Game game)
    {
        mEventListener.onMatchMuteAppClicked(game);
    }

    public final void onMatchParticipantListClicked(TurnBasedMatch turnbasedmatch, String s, String s1)
    {
        mEventListener.onMatchParticipantListClicked(turnbasedmatch, s, s1);
    }

    public final void onMatchRematch(TurnBasedMatch turnbasedmatch)
    {
        mEventListener.onMatchRematch(turnbasedmatch);
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
        LoadMatchesResponse loadmatchesresponse;
        int i;
        result = (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult)result;
        i = result.getStatus().mStatusCode;
        loadmatchesresponse = result.getMatches();
        boolean flag = canUseResult(result);
        if (!flag)
        {
            loadmatchesresponse.release();
            return;
        }
        mParent.hideActionBarProgressBar();
        mMatchTurnStatus;
        JVM INSTR tableswitch 1 3: default 165
    //                   1 115
    //                   2 149
    //                   3 157;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_157;
_L1:
        throw new IllegalArgumentException((new StringBuilder("Match type ")).append(mMatchTurnStatus).append(" is invalid").toString());
        result;
        loadmatchesresponse.release();
        throw result;
_L2:
        result = loadmatchesresponse.mMyTurnMatches;
_L5:
        mMatchAdapter.setDataBuffer(result);
        mLoadingDataViewManager.handleViewState(i, result.getCount(), false);
        mParent.registerMatchListeners();
        return;
_L3:
        result = loadmatchesresponse.mTheirTurnMatches;
          goto _L5
        result = loadmatchesresponse.mCompletedMatches;
          goto _L5
    }

    public final void onRetry()
    {
        reloadData();
    }
}
