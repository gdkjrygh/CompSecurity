// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.location.ui;

import android.content.DialogInterface;
import com.google.android.apps.wallet.location.api.LocationSettings;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;

public class EnableSystemPreferencesLocationDialog extends AlertDialogFragment
{

    LocationSettings locationSettings;

    public EnableSystemPreferencesLocationDialog()
    {
        super(newBuilder().setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_enable).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setCancelable(true));
    }

    protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        super.configureAlertDialog(builder);
        builder.setTitle(com.google.android.apps.walletnfcrel.R.string.enable_location_settings_dialog_title);
        builder.setMessage(com.google.android.apps.walletnfcrel.R.string.enable_location_settings_dialog_content);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            locationSettings.startSystemLocationSettingActivity(getActivity());
        }
    }
}
