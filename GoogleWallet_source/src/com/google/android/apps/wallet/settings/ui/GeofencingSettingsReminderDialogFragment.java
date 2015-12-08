// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.location.api.GoogleLocationSettingHelper;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.settings.ui:
//            GeofencingSettingsChecker

public class GeofencingSettingsReminderDialogFragment extends AlertDialogFragment
{

    GeofencingSettingsChecker geofencingSettingsChecker;
    GoogleLocationSettingHelper googleLocationSettingHelper;
    private CheckBox mCheckbox;
    private boolean mSettingsButtonClicked;
    SharedPreferences sharedPreferences;

    public GeofencingSettingsReminderDialogFragment()
    {
        super(newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.geofencing_settings_reminder_dialog_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_settings).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel));
        mSettingsButtonClicked = false;
    }

    private boolean isDismissDialogChecked()
    {
        return mCheckbox != null && mCheckbox.isChecked();
    }

    private static void updateRowVisibility(View view, int i, boolean flag)
    {
        view = view.findViewById(i);
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    protected final void configureAlertDialog(android.app.AlertDialog.Builder builder)
    {
        boolean flag1 = true;
        super.configureAlertDialog(builder);
        View view = getActivity().getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.geofencing_settings_reminder, null);
        mCheckbox = (CheckBox)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.HideAlertDialog);
        int i = com.google.android.apps.walletnfcrel.R.id.GoogleAppsLocationSettingRow;
        boolean flag;
        if (geofencingSettingsChecker.isGoogleAppsLocationSettingAvailable() && !geofencingSettingsChecker.isGoogleAppsLocationSettingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateRowVisibility(view, i, flag);
        i = com.google.android.apps.walletnfcrel.R.id.NetworkProviderSettingRow;
        if (!geofencingSettingsChecker.isNetworkProviderEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateRowVisibility(view, i, flag);
        i = com.google.android.apps.walletnfcrel.R.id.WifiNetworksSettingRow;
        if (!geofencingSettingsChecker.isWifiNetworksEnabled())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        updateRowVisibility(view, i, flag);
        builder.setView(view);
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i != -1) goto _L2; else goto _L1
_L1:
        mSettingsButtonClicked = true;
        if (!geofencingSettingsChecker.isGoogleAppsLocationSettingAvailable() || geofencingSettingsChecker.isGoogleAppsLocationSettingEnabled()) goto _L4; else goto _L3
_L3:
        googleLocationSettingHelper.launchGoogleLocationSettingIntent();
_L6:
        return;
_L4:
        if (geofencingSettingsChecker.isNetworkProviderEnabled())
        {
            continue; /* Loop/switch isn't completed */
        }
        dialoginterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
_L7:
        startActivity(dialoginterface);
        return;
        if (geofencingSettingsChecker.isWifiNetworksEnabled()) goto _L6; else goto _L5
_L5:
        dialoginterface = new Intent("android.settings.WIFI_SETTINGS");
          goto _L7
_L2:
        if (i == -2 && isDismissDialogChecked())
        {
            SharedPreference.GEOFENCING_SETTINGS_REMINDER_DIALOG_DISMISSED.put(sharedPreferences, Boolean.valueOf(true));
            return;
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!mSettingsButtonClicked)
        {
            geofencingSettingsChecker.setGeofencingSettingsReminderDialogCanceled();
        }
        super.onDismiss(dialoginterface);
    }
}
