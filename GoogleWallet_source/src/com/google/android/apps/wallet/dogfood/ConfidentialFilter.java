// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.dogfood;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.common.base.Preconditions;

public class ConfidentialFilter extends ActivityFilter
{

    private final FragmentActivity activity;
    private final FeatureManager featureManager;
    private final android.content.DialogInterface.OnClickListener onClickListener = new android.content.DialogInterface.OnClickListener() {

        final ConfidentialFilter this$0;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            boolean flag;
            if (i == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            SharedPreference.LAST_SEEN_CONFIDENTIAL_WARNING.put(sharedPreferences, versionName);
            shownDialog.dismiss();
            shownDialog = null;
        }

            
            {
                this$0 = ConfidentialFilter.this;
                super();
            }
    };
    private final SharedPreferences sharedPreferences;
    private AlertDialogFragment shownDialog;
    private final String versionName;

    ConfidentialFilter(FragmentActivity fragmentactivity, FeatureManager featuremanager, SharedPreferences sharedpreferences, String s)
    {
        shownDialog = null;
        activity = fragmentactivity;
        featureManager = featuremanager;
        sharedPreferences = sharedpreferences;
        versionName = s;
    }

    private static AlertDialogFragment buildDialog()
    {
        return AlertDialogFragment.newBuilder().setCancelable(false).setTitleLayout(com.google.android.apps.walletnfcrel.R.layout.confidential_dialog_title).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.confidential_warning_button).setLayout(com.google.android.apps.walletnfcrel.R.layout.confidential_dialog).build();
    }

    protected final void onPause()
    {
        super.onPause();
        if (shownDialog != null)
        {
            shownDialog.dismiss();
            shownDialog = null;
        }
    }

    protected final void onPostResume()
    {
        super.onPostResume();
        String s;
        if (featureManager.isFeatureEnabled(Feature.SHOW_CONFIDENTIAL_DIALOG))
        {
            if (!versionName.equals(s = (String)SharedPreference.LAST_SEEN_CONFIDENTIAL_WARNING.get(sharedPreferences)))
            {
                shownDialog = buildDialog();
                shownDialog.setOnClickListener(onClickListener);
                shownDialog.show(activity.getSupportFragmentManager());
                return;
            }
        }
    }





/*
    static AlertDialogFragment access$202(ConfidentialFilter confidentialfilter, AlertDialogFragment alertdialogfragment)
    {
        confidentialfilter.shownDialog = alertdialogfragment;
        return alertdialogfragment;
    }

*/
}
