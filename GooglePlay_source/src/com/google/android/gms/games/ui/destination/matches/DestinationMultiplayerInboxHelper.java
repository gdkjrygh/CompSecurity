// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.matches;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.ui.common.matches.MultiplayerInboxHelper;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivityBase;
import com.google.android.gms.games.ui.destination.notifications.DestinationMuteGameHelper;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;
import java.util.ArrayList;

public final class DestinationMultiplayerInboxHelper extends MultiplayerInboxHelper
    implements com.google.android.gms.games.ui.dialog.changeaccount.InvitationChangeAccountDialogFragment.InvitationAccountSwitcher, com.google.android.gms.games.ui.dialog.changeaccount.MatchChangeAccountDialogFragment.MatchAccountSwitcher
{

    private final DestinationFragmentActivityBase mActivity;
    private final DestinationMuteGameHelper mMuteGameHelper;

    public DestinationMultiplayerInboxHelper(DestinationFragmentActivityBase destinationfragmentactivitybase)
    {
        Asserts.checkNotNull(destinationfragmentactivitybase);
        mActivity = destinationfragmentactivitybase;
        mMuteGameHelper = new DestinationMuteGameHelper(destinationfragmentactivitybase);
        DialogFragmentUtil.dismiss(mActivity, "com.google.android.gms.games.ui.dialog.progressDialogStartingTbmp");
    }

    private void acceptInvitation(Invitation invitation)
    {
        Object obj = mActivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected())
        {
            GamesLog.w("DestInboxHelper", "acceptInvitation: not connected; ignoring...");
            return;
        }
        if (invitation.getInvitationType() == 1)
        {
            Object obj1 = PrebuiltDialogs.newProgressDialog(0x7f10022d);
            DialogFragmentUtil.show(mActivity, ((android.support.v4.app.DialogFragment) (obj1)), "com.google.android.gms.games.ui.dialog.progressDialogStartingTbmp");
            obj1 = invitation.getGame().getApplicationId();
            Games.TurnBasedMultiplayer.acceptInvitationFirstParty(((GoogleApiClient) (obj)), ((String) (obj1)), invitation.getInvitationId()).setResultCallback(new ResultCallback() {

                final DestinationMultiplayerInboxHelper this$0;

                public final volatile void onResult(Result result)
                {
                    result = (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult)result;
                    onTurnBasedMatchInitiated(result);
                }

            
            {
                this$0 = DestinationMultiplayerInboxHelper.this;
                super();
            }
            });
            return;
        }
        obj = mActivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected())
        {
            GamesLog.w("DestInboxHelper", "launchGameForInvitation: not connected; ignoring...");
            return;
        } else
        {
            obj = Games.getCurrentAccountName(((GoogleApiClient) (obj)));
            UiUtils.launchGameForInvitation(mActivity, ((String) (obj)), invitation.getGame(), invitation);
            mActivity.finish();
            return;
        }
    }

    private void launchGameForMatch(TurnBasedMatch turnbasedmatch)
    {
        Object obj = mActivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected())
        {
            GamesLog.w("DestInboxHelper", "launchGameForMatch: not connected; ignoring...");
            return;
        } else
        {
            obj = Games.getCurrentAccountName(((GoogleApiClient) (obj)));
            UiUtils.launchGameForTurnBasedMatch(mActivity, ((String) (obj)), turnbasedmatch.getGame(), turnbasedmatch);
            mActivity.finish();
            return;
        }
    }

    private void launchGameForRematch(TurnBasedMatch turnbasedmatch)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestInboxHelper", "launchGameForRematch: not connected; ignoring...");
            return;
        } else
        {
            Object obj = PrebuiltDialogs.newProgressDialog(0x7f100232);
            DialogFragmentUtil.show(mActivity, ((android.support.v4.app.DialogFragment) (obj)), "com.google.android.gms.games.ui.dialog.progressDialogStartingTbmp");
            obj = turnbasedmatch.getGame().getApplicationId();
            Games.TurnBasedMultiplayer.rematchFirstParty(googleapiclient, ((String) (obj)), turnbasedmatch.getMatchId()).setResultCallback(new ResultCallback() {

                final DestinationMultiplayerInboxHelper this$0;

                public final volatile void onResult(Result result)
                {
                    result = (com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult)result;
                    onTurnBasedMatchInitiated(result);
                }

            
            {
                this$0 = DestinationMultiplayerInboxHelper.this;
                super();
            }
            });
            return;
        }
    }

    public final void onIdentitySharingAccepted(Invitation invitation)
    {
        acceptInvitation(invitation);
    }

    public final void onInvitationAccepted(Invitation invitation)
    {
        Object obj = mActivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected())
        {
            GamesLog.w("DestInboxHelper", "onInvitationAccepted: not connected; ignoring...");
            return;
        }
        String s = Games.getCurrentAccountName(((GoogleApiClient) (obj)));
        obj = Games.getSelectedAccountForGameRestricted(((GoogleApiClient) (obj)), invitation.getGame().getInstancePackageName());
        if (obj == null)
        {
            switchAccountForInvitation(invitation);
            return;
        }
        if (!((String) (obj)).equals(s))
        {
            InvitationChangeAccountDialogFragment invitationchangeaccountdialogfragment = new InvitationChangeAccountDialogFragment();
            invitationchangeaccountdialogfragment.setArguments(InvitationChangeAccountDialogFragment.createArgs(((String) (obj)), s, invitation));
            DialogFragmentUtil.show(mActivity, invitationchangeaccountdialogfragment, "com.google.android.gms.games.ui.dialog.changeAccountDialog");
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
        Intent intent = new Intent("com.google.android.gms.games.destination.SHOW_PUBLIC_INVITATIONS");
        intent.putExtra("com.google.android.gms.games.INVITATION_CLUSTER", zinvitationcluster);
        intent.putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
        intent.putExtra("com.google.android.gms.games.PLAYER_ID", s1);
        mActivity.startActivity(intent);
    }

    public final void onInvitationDeclined(Invitation invitation)
    {
        GoogleApiClient googleapiclient;
        String s;
        int i;
        googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestInboxHelper", "onInvitationDeclined: not connected; ignoring...");
            return;
        }
        s = invitation.getGame().getApplicationId();
        i = invitation.getInvitationType();
        invitation = invitation.getInvitationId();
        i;
        JVM INSTR tableswitch 0 1: default 76
    //                   0 121
    //                   1 102;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown invitation type ")).append(i).toString());
_L3:
        Games.TurnBasedMultiplayer.declineInvitationFirstParty(googleapiclient, s, invitation);
_L5:
        mActivity.updateInboxCount();
        return;
_L2:
        Games.RealTimeMultiplayer.declineInvitationFirstParty(googleapiclient, s, invitation);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void onInvitationDismissed(Invitation invitation)
    {
        GoogleApiClient googleapiclient;
        String s;
        int i;
        googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestInboxHelper", "onInvitationDismissed: not connected; ignoring...");
            return;
        }
        s = invitation.getGame().getApplicationId();
        i = invitation.getInvitationType();
        invitation = invitation.getInvitationId();
        i;
        JVM INSTR tableswitch 0 1: default 76
    //                   0 121
    //                   1 102;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown invitation type ")).append(i).toString());
_L3:
        Games.TurnBasedMultiplayer.dismissInvitationFirstParty(googleapiclient, s, invitation);
_L5:
        mActivity.updateInboxCount();
        return;
_L2:
        Games.RealTimeMultiplayer.dismissInvitationFirstParty(googleapiclient, s, invitation);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void onInvitationGameInfoClicked(Game game)
    {
        if (!mActivity.getGoogleApiClient().isConnected())
        {
            GamesLog.w("DestInboxHelper", "onInvitationGameInfoClicked: not connected; ignoring...");
            return;
        } else
        {
            PowerUpUtils.viewGameDetail(mActivity, game);
            return;
        }
    }

    public final void onInvitationMuteAppClicked(Game game)
    {
        mMuteGameHelper.muteGame(game);
    }

    public final void onInvitationParticipantListClicked(Invitation invitation, String s, String s1)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestInboxHelper", "onInvitationParticipantListClicked: not connected; ignoring...");
            return;
        } else
        {
            UiUtils.viewDestAppParticipantList(mActivity, googleapiclient, invitation.getParticipants(), invitation.getAvailableAutoMatchSlots(), s, s1, invitation.getGame());
            return;
        }
    }

    public final void onMatchClicked(TurnBasedMatch turnbasedmatch)
    {
        Object obj = turnbasedmatch.getGame();
        if (((Game) (obj)).isInstanceInstalled())
        {
            GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
            if (!googleapiclient.isConnected())
            {
                GamesLog.w("DestInboxHelper", "onMatchClicked: not connected; ignoring...");
                return;
            }
            String s = Games.getCurrentAccountName(googleapiclient);
            obj = Games.getSelectedAccountForGameRestricted(googleapiclient, ((Game) (obj)).getInstancePackageName());
            if (obj == null)
            {
                switchAccountForTurnBasedMatch(turnbasedmatch);
                return;
            }
            if (!((String) (obj)).equals(s))
            {
                turnbasedmatch = PrebuiltDialogs.newMatchChangeAccountDialog(((String) (obj)), s, turnbasedmatch, false);
                DialogFragmentUtil.show(mActivity, turnbasedmatch, "com.google.android.gms.games.ui.dialog.changeAccountDialog");
                return;
            } else
            {
                launchGameForMatch(turnbasedmatch);
                return;
            }
        } else
        {
            onInvitationGameInfoClicked(((Game) (obj)));
            return;
        }
    }

    public final void onMatchDismissed(TurnBasedMatch turnbasedmatch)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestInboxHelper", "onMatchDismissed: not connected; ignoring...");
            return;
        } else
        {
            String s = turnbasedmatch.getGame().getApplicationId();
            Games.TurnBasedMultiplayer.dismissMatchFirstParty(googleapiclient, s, turnbasedmatch.getMatchId());
            mActivity.updateInboxCount();
            return;
        }
    }

    public final void onMatchMuteAppClicked(Game game)
    {
        mMuteGameHelper.muteGame(game);
    }

    public final void onMatchParticipantListClicked(TurnBasedMatch turnbasedmatch, String s, String s1)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestInboxHelper", "onMatchParticipantListClicked: not connected; ignoring...");
            return;
        } else
        {
            UiUtils.viewDestAppParticipantList(mActivity, googleapiclient, turnbasedmatch.getParticipants(), turnbasedmatch.getAvailableAutoMatchSlots(), s, s1, turnbasedmatch.getGame());
            return;
        }
    }

    public final void onMatchRematch(TurnBasedMatch turnbasedmatch)
    {
        Object obj = mActivity.getGoogleApiClient();
        if (!((GoogleApiClient) (obj)).isConnected())
        {
            GamesLog.w("DestInboxHelper", "onMatchRematch: not connected; ignoring...");
            return;
        }
        String s = Games.getCurrentAccountName(((GoogleApiClient) (obj)));
        obj = Games.getSelectedAccountForGameRestricted(((GoogleApiClient) (obj)), turnbasedmatch.getGame().getInstancePackageName());
        if (obj == null)
        {
            switchAccountForRematch(turnbasedmatch);
            return;
        }
        if (!((String) (obj)).equals(s))
        {
            turnbasedmatch = PrebuiltDialogs.newMatchChangeAccountDialog(((String) (obj)), s, turnbasedmatch, true);
            DialogFragmentUtil.show(mActivity, turnbasedmatch, "com.google.android.gms.games.ui.dialog.changeAccountDialog");
            return;
        } else
        {
            launchGameForRematch(turnbasedmatch);
            return;
        }
    }

    public final void onTurnBasedMatchInitiated(com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult initiatematchresult)
    {
        int i = initiatematchresult.getStatus().mStatusCode;
        initiatematchresult = initiatematchresult.getMatch();
        DialogFragmentUtil.dismiss(mActivity, "com.google.android.gms.games.ui.dialog.progressDialogStartingTbmp");
        if (!mActivity.getGoogleApiClient().isConnected())
        {
            GamesLog.w("DestInboxHelper", "onTurnBasedMatchInitiated: not connected; ignoring...");
            return;
        }
        if (UiUtils.isNetworkError(i))
        {
            initiatematchresult = PrebuiltDialogs.newNetworkErrorDialog(0x7f100193);
            DialogFragmentUtil.show(mActivity, initiatematchresult, "com.google.android.gms.games.ui.dialog.alertDialogNetworkError");
            return;
        }
        if (initiatematchresult == null)
        {
            GamesLog.e("DestInboxHelper", (new StringBuilder("No turn-based match received after accepting invite: ")).append(i).toString());
            return;
        } else
        {
            launchGameForMatch(initiatematchresult);
            return;
        }
    }

    public final void switchAccountForInvitation(Invitation invitation)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestInboxHelper", "switchAccountForInvitation: not connected; ignoring...");
            return;
        }
        String s = Games.getCurrentAccountName(googleapiclient);
        Games.updateSelectedAccountForGameRestricted(googleapiclient, invitation.getGame().getInstancePackageName(), s);
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

    public final void switchAccountForRematch(TurnBasedMatch turnbasedmatch)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestInboxHelper", "switchAccountForRematch: not connected; ignoring...");
            return;
        } else
        {
            String s = Games.getCurrentAccountName(googleapiclient);
            Games.updateSelectedAccountForGameRestricted(googleapiclient, turnbasedmatch.getGame().getInstancePackageName(), s);
            launchGameForRematch(turnbasedmatch);
            return;
        }
    }

    public final void switchAccountForTurnBasedMatch(TurnBasedMatch turnbasedmatch)
    {
        GoogleApiClient googleapiclient = mActivity.getGoogleApiClient();
        if (!googleapiclient.isConnected())
        {
            GamesLog.w("DestInboxHelper", "switchAccountForTurnBasedMatch: not connected; ignoring...");
            return;
        } else
        {
            String s = Games.getCurrentAccountName(googleapiclient);
            Games.updateSelectedAccountForGameRestricted(googleapiclient, turnbasedmatch.getGame().getInstancePackageName(), s);
            launchGameForMatch(turnbasedmatch);
            return;
        }
    }
}
