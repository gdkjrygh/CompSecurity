// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import com.skype.android.SkypeDialogFragment;
import com.skype.android.SkypeDialogFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.ConfigUpdater;
import com.skype.android.config.UpdateConfig;
import com.skype.android.config.web.SamsungGalaxyStoreUpdater;
import com.skype.android.res.Urls;

public class UpdateOptionalDialog extends SkypeDialogFragment
    implements android.content.DialogInterface.OnClickListener
{

    Analytics analytics;
    ApplicationConfig appConfig;
    private CheckBox dontShowAgainCheckbox;
    Urls urls;

    public UpdateOptionalDialog()
    {
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            analytics.c(AnalyticsEvent.ap);
            if ("GALAXY_STORE".equalsIgnoreCase(appConfig.getUpdateConfig().getStoreName()))
            {
                try
                {
                    SamsungGalaxyStoreUpdater.startStoreIntent(getActivity());
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface) { }
            } else
            {
                dialoginterface = Uri.parse(urls.a(com.skype.android.res.Urls.Type.k));
                String s = appConfig.getUpdateConfig().getUpdateUrl();
                if (!TextUtils.isEmpty(s))
                {
                    dialoginterface = Uri.parse(s);
                }
                try
                {
                    startActivity(new Intent("android.intent.action.VIEW", dialoginterface));
                }
                // Misplaced declaration of an exception variable
                catch (DialogInterface dialoginterface) { }
            }
        }
        if (dontShowAgainCheckbox.isChecked())
        {
            appConfig.getUpdateConfig().setLastUpgradeOffered(appConfig.getUpdateConfig().getSuggestedUpgradeVersion());
            (new ConfigUpdater(getActivity().getApplication())).saveLocalConfig();
        }
    }

    public void onCreate(Bundle bundle)
    {
        getComponent().inject(this);
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        Object obj = getArguments().getString("android.intent.extra.TEXT");
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setTitle(0x7f080283);
        bundle.setMessage(((CharSequence) (obj)));
        bundle.setCancelable(true);
        obj = getActivity().getLayoutInflater().inflate(0x7f030128, null);
        bundle.setView(((View) (obj)));
        dontShowAgainCheckbox = (CheckBox)((View) (obj)).findViewById(0x7f100579);
        if (appConfig.getUpdateConfig().getAlwaysShow())
        {
            dontShowAgainCheckbox.setVisibility(8);
        }
        bundle.setPositiveButton(0x7f0801a2, this);
        bundle.setNegativeButton(0x7f0802a5, this);
        analytics.c(AnalyticsEvent.aq);
        return bundle.create();
    }
}
