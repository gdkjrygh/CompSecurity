// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AlertDialog;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.client.notifications.ClientMuteGameHelper;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

public final class ClientMultiplayerInboxHelper extends MultiplayerInboxHelper
{

    private final ClientFragmentActivity mActivity;
    private final ClientMuteGameHelper mMuteGameHelper;

    public ClientMultiplayerInboxHelper(ClientFragmentActivity clientfragmentactivity)
    {
        Asserts.checkNotNull(clientfragmentactivity);
        mActivity = clientfragmentactivity;
        mMuteGameHelper = new ClientMuteGameHelper(clientfragmentactivity);
        DialogFragmentUtil.dismiss(mActivity, "com.google.android.gms.games.ui.dialog.progressDialogStartingTbmp");
    }

    private void acceptInvitation(Invitation invitation)
    {
        Object obj = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(((com.google.android.gms.common.api.GoogleApiClient) (obj)), mActivity))
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "acceptInvitation: not connected; ignoring...");
            return;
        }
        if (!invitation.isDataValid())
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "acceptInvitation: invitation not valid anymore...");
            return;
        }
        if (invitation.getInvitationType() == 1)
        {
            com.google.android.gms.games.ui.dialog.GamesDialogFragment gamesdialogfragment = PrebuiltDialogs.newProgressDialog(0x7f10022d);
            DialogFragmentUtil.show(mActivity, gamesdialogfragment, "com.google.android.gms.games.ui.dialog.progressDialogStartingTbmp");
            Games.TurnBasedMultiplayer.acceptInvitation(((com.google.android.gms.common.api.GoogleApiClient) (obj)), invitation.getInvitationId()).setResultCallback(new ResultCallback() {

                final ClientMultiplayerInboxHelper this$0;

                public final volatile void onResult(Result result)
                {
                    result = (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult)result;
                    onTurnBasedMatchInitiated(result);
                }

            
            {
                this$0 = ClientMultiplayerInboxHelper.this;
                super();
            }
            });
            return;
        }
        obj = AndroidUtils.getCallingContext(mActivity);
        InvitationEntity invitationentity = (InvitationEntity)invitation.freeze();
        invitation = new Bundle();
        if (!com.google.android.gms.common.internal.DowngradeableSafeParcel.DowngradeableSafeParcelHelper.putParcelable(invitation, "invitation", invitationentity, ((android.content.Context) (obj)), Integer.valueOf(mActivity.mClientVersionCode)))
        {
            GamesLog.e("ClientMultiplayerInboxHelper", "Unable to return invitation to game. Something has gone very wrong.");
            mActivity.setResult(0);
            mActivity.finish();
            return;
        } else
        {
            Intent intent = new Intent();
            intent.putExtras(invitation);
            mActivity.setResult(-1, intent);
            mActivity.finish();
            return;
        }
    }

    private void acceptMatch(TurnBasedMatch turnbasedmatch)
    {
        Intent intent = new Intent();
        intent.putExtra("turn_based_match", (Parcelable)turnbasedmatch.freeze());
        mActivity.setResult(-1, intent);
        mActivity.finish();
    }

    public final void onIdentitySharingAccepted(Invitation invitation)
    {
        acceptInvitation(invitation);
    }

    public final void onInvitationAccepted(Invitation invitation)
    {
        if (UiUtils.checkClientDisconnected(mActivity.getGoogleApiClient(), mActivity))
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "onInvitationAccepted: not connected; ignoring...");
            return;
        }
        if (UiUtils.shouldShowIdentitySharingDialog(invitation))
        {
            PrebuiltDialogs.newIdentitySharingDialog(mActivity, invitation, this).show();
            return;
        } else
        {
            acceptInvitation(invitation);
            return;
        }
    }

    public final void onInvitationClusterDeclined(ZInvitationCluster zinvitationcluster)
    {
        zinvitationcluster = zinvitationcluster.getInvitationList();
        int i = 0;
        for (int j = zinvitationcluster.size(); i < j; i++)
        {
            onInvitationDeclined((Invitation)zinvitationcluster.get(i));
        }

    }

    public final void onInvitationClusterDismissed(ZInvitationCluster zinvitationcluster)
    {
        zinvitationcluster = zinvitationcluster.getInvitationList();
        int i = 0;
        for (int j = zinvitationcluster.size(); i < j; i++)
        {
            onInvitationDismissed((Invitation)zinvitationcluster.get(i));
        }

    }

    public final void onInvitationClusterSeeMoreClicked(ZInvitationCluster zinvitationcluster, String s, String s1)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "onInvitationClusterSeeMoreClicked: not connected; ignoring...");
            return;
        } else
        {
            zinvitationcluster = Games.Invitations.getPublicInvitationListIntentRestricted(googleapiclient, zinvitationcluster, s, s1);
            mActivity.startActivityForResult(zinvitationcluster, 1000);
            return;
        }
    }

    public final void onInvitationDeclined(Invitation invitation)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "onInvitationDeclined: not connected; ignoring...");
            return;
        }
        int i = invitation.getInvitationType();
        invitation = invitation.getInvitationId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown invitation type ")).append(i).toString());

        case 1: // '\001'
            Games.TurnBasedMultiplayer.declineInvitation(googleapiclient, invitation);
            return;

        case 0: // '\0'
            Games.RealTimeMultiplayer.declineInvitation(googleapiclient, invitation);
            return;
        }
    }

    public final void onInvitationDismissed(Invitation invitation)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "onInvitationDismissed: not connected; ignoring...");
            return;
        }
        int i = invitation.getInvitationType();
        invitation = invitation.getInvitationId();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown invitation type ")).append(i).toString());

        case 1: // '\001'
            Games.TurnBasedMultiplayer.dismissInvitation(googleapiclient, invitation);
            return;

        case 0: // '\0'
            Games.RealTimeMultiplayer.dismissInvitation(googleapiclient, invitation);
            return;
        }
    }

    public final void onInvitationGameInfoClicked(Game game)
    {
        Asserts.fail("Trying to install game from Client UI!");
    }

    public final void onInvitationMuteAppClicked(Game game)
    {
        mMuteGameHelper.muteGame(game);
    }

    public final void onInvitationParticipantListClicked(Invitation invitation, String s, String s1)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "onInvitationParticipantListClicked: not connected; ignoring...");
            return;
        } else
        {
            UiUtils.viewParticipantList(mActivity, googleapiclient, invitation.getParticipants(), invitation.getAvailableAutoMatchSlots(), s, s1, invitation.getGame());
            return;
        }
    }

    public final void onMatchClicked(TurnBasedMatch turnbasedmatch)
    {
        acceptMatch(turnbasedmatch);
    }

    public final void onMatchDismissed(TurnBasedMatch turnbasedmatch)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "onMatchDismissed: not connected; ignoring...");
            return;
        } else
        {
            Games.TurnBasedMultiplayer.dismissMatch(googleapiclient, turnbasedmatch.getMatchId());
            return;
        }
    }

    public final void onMatchMuteAppClicked(Game game)
    {
        mMuteGameHelper.muteGame(game);
    }

    public final void onMatchParticipantListClicked(TurnBasedMatch turnbasedmatch, String s, String s1)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "onMatchParticipantListClicked: not connected; ignoring...");
            return;
        } else
        {
            UiUtils.viewParticipantList(mActivity, googleapiclient, turnbasedmatch.getParticipants(), turnbasedmatch.getAvailableAutoMatchSlots(), s, s1, turnbasedmatch.getGame());
            return;
        }
    }

    public final void onMatchRematch(TurnBasedMatch turnbasedmatch)
    {
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mActivity))
        {
            GamesLog.w("ClientMultiplayerInboxHelper", "onMatchRematch: not connected; ignoring...");
            return;
        } else
        {
            com.google.android.gms.games.ui.dialog.GamesDialogFragment gamesdialogfragment = PrebuiltDialogs.newProgressDialog(0x7f100232);
            DialogFragmentUtil.show(mActivity, gamesdialogfragment, "com.google.android.gms.games.ui.dialog.progressDialogStartingTbmp");
            Games.TurnBasedMultiplayer.rematch(googleapiclient, turnbasedmatch.getMatchId()).setResultCallback(new ResultCallback() {

                final ClientMultiplayerInboxHelper this$0;

                public final volatile void onResult(Result result)
                {
                    result = (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult)result;
                    onTurnBasedMatchInitiated(result);
                }

            
            {
                this$0 = ClientMultiplayerInboxHelper.this;
                super();
            }
            });
            return;
        }
    }

    public final void onTurnBasedMatchInitiated(com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult initiatematchresult)
    {
        int i = initiatematchresult.getStatus().mStatusCode;
        initiatematchresult = initiatematchresult.getMatch();
        DialogFragmentUtil.dismiss(mActivity, "com.google.android.gms.games.ui.dialog.progressDialogStartingTbmp");
        if (UiUtils.isNetworkError(i))
        {
            initiatematchresult = PrebuiltDialogs.newNetworkErrorDialog(0x7f100193);
            DialogFragmentUtil.show(mActivity, initiatematchresult, "com.google.android.gms.games.ui.dialog.alertDialogNetworkError");
            return;
        }
        if (initiatematchresult == null)
        {
            GamesLog.e("ClientMultiplayerInboxHelper", (new StringBuilder("No turn-based match received after accepting invite: ")).append(i).toString());
            return;
        } else
        {
            acceptMatch(initiatematchresult);
            return;
        }
    }
}
