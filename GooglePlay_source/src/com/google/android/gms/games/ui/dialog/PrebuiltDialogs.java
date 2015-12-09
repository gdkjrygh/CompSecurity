// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.dialog.changeaccount.MatchChangeAccountDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiSharedPrefs;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.util.ExperimentUtils;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            GamesDialogBuilder, ConfirmCopresenceDialogFragment, GamesDialogFragment, VideoRecordingPrerecordDialogFragment

public final class PrebuiltDialogs
{

    public static GamesDialogBuilder getGamesThemedBuilder(Context context)
    {
        return new GamesDialogBuilder(context);
    }

    public static GamesDialogFragment newConfirmCopresenceDialog(Fragment fragment)
    {
        ConfirmCopresenceDialogFragment confirmcopresencedialogfragment = new ConfirmCopresenceDialogFragment();
        confirmcopresencedialogfragment.setTargetFragment$4b1b893a(fragment);
        return confirmcopresencedialogfragment;
    }

    public static AlertDialog newIdentitySharingDialog(Activity activity, Invitation invitation, com.google.android.gms.games.ui.util.UiUtils.IdentitySharingOnClickListener identitysharingonclicklistener)
    {
        invitation = new android.content.DialogInterface.OnClickListener(identitysharingonclicklistener, invitation, activity) {

            final Activity val$activity;
            final Invitation val$invitation;
            final com.google.android.gms.games.ui.util.UiUtils.IdentitySharingOnClickListener val$listener;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                i;
                JVM INSTR tableswitch -3 -1: default 28
            //                           -3 72
            //                           -2 28
            //                           -1 56;
                   goto _L1 _L2 _L1 _L3
_L1:
                GamesLog.e("GamesDialogs", (new StringBuilder("Unhandled dialog action ")).append(i).toString());
_L5:
                dialoginterface.dismiss();
                return;
_L3:
                listener.onIdentitySharingAccepted(invitation);
                continue; /* Loop/switch isn't completed */
_L2:
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)G.playGamesIdSharingWebpageUrl.get()));
                activity.startActivity(intent);
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                listener = identitysharingonclicklistener;
                invitation = invitation1;
                activity = activity1;
                super();
            }
        };
        return getGamesThemedBuilder(activity).setTitle(0x7f100182).setMessage(0x7f100181).setPositiveButton(0x104000a, invitation).setNegativeButton(0x1040000, null).setNeutralButton(0x7f1002cb, invitation).create();
    }

    public static GamesDialogFragment newMatchChangeAccountDialog(String s, String s1, TurnBasedMatch turnbasedmatch, boolean flag)
    {
        MatchChangeAccountDialogFragment matchchangeaccountdialogfragment = new MatchChangeAccountDialogFragment();
        matchchangeaccountdialogfragment.setArguments(MatchChangeAccountDialogFragment.createArgs(s, s1, turnbasedmatch, flag));
        return matchchangeaccountdialogfragment;
    }

    public static GamesDialogFragment newNetworkErrorDialog(int i)
    {
        return new GamesDialogFragment(i) {

            final int val$messageStringId;

            protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
            {
                return gamesdialogbuilder.setTitle(0x7f100201).setMessage(messageStringId).setPositiveButton(0x104000a, null);
            }

            
            {
                messageStringId = i;
                super();
            }
        };
    }

    public static GamesDialogFragment newProgressDialog(int i)
    {
        return new GamesDialogFragment(i) {

            final int val$messageId;

            protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
            {
                bundle = super.mActivity.getLayoutInflater().inflate(0x7f0400c0, null);
                ((TextView)bundle.findViewById(0x7f0d0105)).setText(messageId);
                return gamesdialogbuilder.setTitle(0x7f100233).setView(bundle).setCancelable(false);
            }

            
            {
                messageId = i;
                super();
            }
        };
    }

    public static void showVideoRecordingPrerecordDialog(GamesFragmentActivity gamesfragmentactivity, String s, String s1, GamesDialogFragment.GamesDialogFragmentCallbacks gamesdialogfragmentcallbacks)
    {
        String s2 = gamesfragmentactivity.mConfiguration.getCurrentAccountName();
        if (s2 == null)
        {
            return;
        }
        boolean flag1 = gamesfragmentactivity.getGoogleApiClient().hasAuthenticatedScope(PlayGames.SCOPE_GAMES_1P);
        boolean flag;
        if (flag1)
        {
            flag = ExperimentUtils.ENABLE_VIDEO_RECORDING_ONBOARDING.get(gamesfragmentactivity.getGoogleApiClient());
        } else
        {
            flag = ((Boolean)G.videoRecordingOnboarding2P.get()).booleanValue();
        }
        if (flag && !UiSharedPrefs.hasShownVideoOnboardingFlow(gamesfragmentactivity))
        {
            if (flag1)
            {
                gamesdialogfragmentcallbacks = "com.google.android.gms.games.destination.SHOW_VIDEO_RECORDING_ONBOARDING";
            } else
            {
                gamesdialogfragmentcallbacks = "com.google.android.gms.games.SHOW_VIDEO_RECORDING_ONBOARDING";
            }
            gamesdialogfragmentcallbacks = new Intent(gamesdialogfragmentcallbacks);
            gamesdialogfragmentcallbacks.putExtra("com.google.android.gms.games.GAME_ID", s);
            gamesdialogfragmentcallbacks.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", s1);
            gamesdialogfragmentcallbacks.putExtra("com.google.android.gms.games.ACCOUNT_NAME", s2);
            gamesdialogfragmentcallbacks.setPackage("com.google.android.play.games");
            gamesfragmentactivity.startActivityForResult(gamesdialogfragmentcallbacks, 2002);
            return;
        } else
        {
            VideoRecordingPrerecordDialogFragment videorecordingprerecorddialogfragment = new VideoRecordingPrerecordDialogFragment();
            videorecordingprerecorddialogfragment.mConfig = new VideoRecordingPrerecordDialogFragment.Config(s, s1);
            videorecordingprerecorddialogfragment.setCallbacks(gamesdialogfragmentcallbacks);
            DialogFragmentUtil.show(gamesfragmentactivity, videorecordingprerecorddialogfragment, "VideoRecordingPrerecordDialogFragment");
            return;
        }
    }

    // Unreferenced inner class com/google/android/gms/games/ui/dialog/PrebuiltDialogs$1

/* anonymous class */
    public static final class _cls1 extends GamesDialogFragment
    {

        protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
        {
            return gamesdialogbuilder.setTitle(0x7f10019d).setMessage(0x7f10019c).setPositiveButton(0x7f10019b, new android.content.DialogInterface.OnClickListener() {

                final _cls1 this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = mActivity;
                    Intent intent = UiUtils.createPlayStoreIntent(dialoginterface, "com.google.android.play.games", "GPG_destAppInstall");
                    try
                    {
                        dialoginterface.startActivity(intent);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DialogInterface dialoginterface)
                    {
                        GamesLog.e("GamesDialogs", "Unable to launch play store intent", dialoginterface);
                    }
                }

            
            {
                this$0 = _cls1.this;
                super();
            }
            }).setNegativeButton(0x1040000, null);
        }

    }


    // Unreferenced inner class com/google/android/gms/games/ui/dialog/PrebuiltDialogs$3

/* anonymous class */
    public static final class _cls3 extends GamesDialogFragment
    {

        protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
        {
            return gamesdialogbuilder.setTitle(0x7f1002d0).setMessage(0x7f1002cf).setNeutralButton(0x1040000, null).setPositiveButton(0x7f1002ce, new android.content.DialogInterface.OnClickListener() {

                final _cls3 this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = mActivity;
                    Intent intent = UiUtils.createPlayStoreIntent(dialoginterface, "com.google.android.play.games", "GPG_destAppUpgrade");
                    try
                    {
                        dialoginterface.startActivity(intent);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DialogInterface dialoginterface)
                    {
                        GamesLog.e("GamesDialogs", "Unable to launch play store intent", dialoginterface);
                    }
                }

            
            {
                this$0 = _cls3.this;
                super();
            }
            });
        }

    }


    // Unreferenced inner class com/google/android/gms/games/ui/dialog/PrebuiltDialogs$5

/* anonymous class */
    public static final class _cls5 extends GamesDialogFragment
    {

        final int val$messageId = 0x7f1002d1;
        final int val$titleId = 0x7f1002d2;

        protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
        {
            return gamesdialogbuilder.setTitle(titleId).setMessage(messageId).setPositiveButton(0x104000a, null);
        }

            public 
            {
                super();
            }
    }

}
