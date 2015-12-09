// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.userevents.UserEventLogger;

public class ResetPinDialog
{

    private final String accountName;
    private final Context activity;
    private final AppControl appControl;
    private final UserEventLogger userEventLogger;

    ResetPinDialog(Activity activity1, AppControl appcontrol, String s, UserEventLogger usereventlogger)
    {
        activity = activity1;
        appControl = appcontrol;
        accountName = s;
        userEventLogger = usereventlogger;
    }

    private Intent getIntentToGaiaPinResetPage(String s)
    {
        String s1 = String.format(appControl.getString(AppControlKey.WHISKY_RESET_PIN_URL), new Object[] {
            Uri.encode("googlewallet://com.google.android.apps.wallet.pin.GaiaPinResetReturnActivity")
        });
        s = String.format(appControl.getString(AppControlKey.GAIA_ACCOUNT_CHOOSER_URL), new Object[] {
            Uri.encode(s), Uri.encode(s1)
        });
        return UriIntents.create(activity, s);
    }

    private void intentToGaiaPinResetPage(String s)
    {
        activity.startActivity(getIntentToGaiaPinResetPage(s));
    }

    private void showDialog(FragmentManager fragmentmanager, com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder builder)
    {
        builder.setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_forgot_pin);
        builder = builder.build();
        builder.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

            final ResetPinDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    userEventLogger.log(30, 125);
                    dialoginterface = accountName;
                    intentToGaiaPinResetPage(dialoginterface);
                    return;
                } else
                {
                    userEventLogger.log(30, 126);
                    return;
                }
            }

            
            {
                this$0 = ResetPinDialog.this;
                super();
            }
        });
        builder.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final ResetPinDialog this$0;

            public final void onCancel(DialogInterface dialoginterface)
            {
                userEventLogger.log(30, 126);
            }

            
            {
                this$0 = ResetPinDialog.this;
                super();
            }
        });
        builder.show(fragmentmanager);
    }

    public final void showForgotPin(FragmentManager fragmentmanager)
    {
        userEventLogger.log(30, 123);
        com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder builder = AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.pin_forgot_pin_title).setMessage(com.google.android.apps.walletnfcrel.R.string.pin_forgot_pin_message);
        builder.setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel);
        showDialog(fragmentmanager, builder);
    }

    public final void showPinLocked(FragmentManager fragmentmanager)
    {
        userEventLogger.log(30, 124);
        showDialog(fragmentmanager, AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.pin_locked_title).setMessage(com.google.android.apps.walletnfcrel.R.string.pin_locked_message));
    }



}
