// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.requests;

import android.content.Intent;
import com.google.android.gms.common.data.FreezableUtils;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.client.notifications.ClientMuteGameHelper;
import com.google.android.gms.games.ui.common.requests.RequestInboxHelper;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

public final class ClientRequestInboxHelper extends RequestInboxHelper
{

    private final ClientFragmentActivity mActivity;
    private final ClientMuteGameHelper mMuteGameHelper;

    public ClientRequestInboxHelper(ClientFragmentActivity clientfragmentactivity)
    {
        Asserts.checkNotNull(clientfragmentactivity);
        mActivity = clientfragmentactivity;
        mMuteGameHelper = new ClientMuteGameHelper(clientfragmentactivity);
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
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientReqInboxHelper", "onRequestClusterSeeMoreClicked: not connected; ignoring...");
            return;
        } else
        {
            gamerequestcluster = Games.Requests.getPublicRequestListIntentRestricted(googleapiclient, gamerequestcluster, s);
            mActivity.startActivityForResult(gamerequestcluster, 1000);
            return;
        }
    }

    public final void onRequestDismissed(GameRequest gamerequest)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientReqInboxHelper", "onRequestDismissed: not connected; ignoring...");
            return;
        } else
        {
            Games.Requests.dismissRequest(googleapiclient, gamerequest.getRequestId());
            return;
        }
    }

    public final void onRequestMuteAppClicked(Game game)
    {
        mMuteGameHelper.muteGame(game);
    }

    public final transient void onRequestsClicked(GameRequest agamerequest[])
    {
        if (UiUtils.checkClientDisconnected(mActivity.getGoogleApiClient(), mActivity))
        {
            GamesLog.w("ClientReqInboxHelper", "onRequestClicked: not connected; ignoring...");
            return;
        } else
        {
            agamerequest = FreezableUtils.freeze(agamerequest);
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("requests", agamerequest);
            mActivity.setResult(-1, intent);
            mActivity.finish();
            return;
        }
    }
}
