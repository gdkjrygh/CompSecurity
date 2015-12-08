// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.requests;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.data.FreezableUtils;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.ui.common.requests.RequestInboxHelper;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivityBase;
import com.google.android.gms.games.ui.destination.notifications.DestinationMuteGameHelper;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.dialog.changeaccount.RequestChangeAccountDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

public final class DestinationRequestInboxHelper extends RequestInboxHelper
    implements com.google.android.gms.games.ui.dialog.changeaccount.RequestChangeAccountDialogFragment.RequestAccountSwitcher
{

    private final DestinationFragmentActivityBase mActivity;
    private final DestinationMuteGameHelper mMuteGameHelper;

    public DestinationRequestInboxHelper(DestinationFragmentActivityBase destinationfragmentactivitybase)
    {
        Asserts.checkNotNull(destinationfragmentactivitybase);
        mActivity = destinationfragmentactivitybase;
        mMuteGameHelper = new DestinationMuteGameHelper(destinationfragmentactivitybase);
    }

    private void launchGameForRequests(ArrayList arraylist)
    {
        Object obj = mActivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected())
        {
            GamesLog.w("DestReqInboxHelper", "launchGameForRequest: not connected; ignoring...");
            return;
        } else
        {
            Game game = ((GameRequest)arraylist.get(0)).getGame();
            obj = Games.getCurrentAccountName(((GoogleApiClient) (obj)));
            UiUtils.launchGameForRequest(mActivity, ((String) (obj)), game, arraylist);
            return;
        }
    }

    public final void onRequestClusterDismissed(GameRequestCluster gamerequestcluster)
    {
        gamerequestcluster = gamerequestcluster.getRequestList();
        int i = 0;
        for (int j = gamerequestcluster.size(); i < j; i++)
        {
            onRequestDismissed((GameRequest)gamerequestcluster.get(i));
        }

    }

    public final void onRequestClusterSeeMoreClicked(GameRequestCluster gamerequestcluster, String s)
    {
        Intent intent = new Intent("com.google.android.gms.games.destination.SHOW_PUBLIC_REQUESTS");
        intent.putExtra("com.google.android.gms.games.GAME_REQUEST_CLUSTER", gamerequestcluster);
        intent.putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
        mActivity.startActivity(intent);
    }

    public final void onRequestDismissed(GameRequest gamerequest)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestReqInboxHelper", "onRequestDismissed: not connected; ignoring...");
            return;
        } else
        {
            String s = Games.Players.getCurrentPlayerId(googleapiclient);
            String s1 = gamerequest.getGame().getApplicationId();
            Games.Requests.dismissRequestFirstParty(googleapiclient, s1, s, gamerequest.getRequestId());
            mActivity.updateInboxCount();
            return;
        }
    }

    public final void onRequestMuteAppClicked(Game game)
    {
        mMuteGameHelper.muteGame(game);
    }

    public final transient void onRequestsClicked(GameRequest agamerequest[])
    {
        Object obj = mActivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected())
        {
            GamesLog.w("DestReqInboxHelper", "onRequestClicked: not connected; ignoring...");
            return;
        }
        String s = Games.getCurrentAccountName(((GoogleApiClient) (obj)));
        agamerequest = FreezableUtils.freeze(agamerequest);
        obj = Games.getSelectedAccountForGameRestricted(((GoogleApiClient) (obj)), ((GameRequest)agamerequest.get(0)).getGame().getInstancePackageName());
        if (obj == null)
        {
            switchAccountForRequests(agamerequest);
            return;
        }
        if (!((String) (obj)).equals(s))
        {
            RequestChangeAccountDialogFragment requestchangeaccountdialogfragment = new RequestChangeAccountDialogFragment();
            requestchangeaccountdialogfragment.setArguments(RequestChangeAccountDialogFragment.createArgs(((String) (obj)), s, agamerequest));
            DialogFragmentUtil.show(mActivity, requestchangeaccountdialogfragment, "com.google.android.gms.games.ui.dialog.changeAccountDialog");
            return;
        } else
        {
            launchGameForRequests(agamerequest);
            return;
        }
    }

    public final void switchAccountForRequests(ArrayList arraylist)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestReqInboxHelper", "switchAccountForRequest: not connected; ignoring...");
            return;
        } else
        {
            String s = Games.getCurrentAccountName(googleapiclient);
            Games.updateSelectedAccountForGameRestricted(googleapiclient, ((GameRequest)arraylist.get(0)).getGame().getInstancePackageName(), s);
            launchGameForRequests(arraylist);
            return;
        }
    }
}
