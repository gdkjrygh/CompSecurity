// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.tos;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.hce.setup.api.NfcSetupApi;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;

public class TermsOfUseDialog extends AlertDialogFragment
{

    public TermsOfUseDialog()
    {
        super(newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.terms_of_use_title).setMessage(com.google.android.apps.walletnfcrel.R.string.terms_of_use).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_accept).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setCancelable(true));
    }

    public static TermsOfUseDialog createAndShow(FragmentActivity fragmentactivity)
    {
        TermsOfUseDialog termsofusedialog = new TermsOfUseDialog();
        termsofusedialog.show(fragmentactivity.getSupportFragmentManager(), "DIALOG_TERMS_OF_USE");
        return termsofusedialog;
    }

    private static String createTermsOfUseMarkup(Context context)
    {
        return context.getString(com.google.android.apps.walletnfcrel.R.string.terms_of_use, new Object[] {
            HelpUrls.createVirtualCardTosUrl().toString(), HelpUrls.createTosLearnMoreUrl().toString()
        });
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case -1: 
            dialoginterface.dismiss();
            analyticsUtil.sendButtonTap("AcceptVirtualCardTermsOfUse", new AnalyticsCustomDimension[0]);
            startActivity(NfcSetupApi.createTapAndPaySetupIntent(getActivity()));
            return;

        case -2: 
            dialoginterface.dismiss();
            return;
        }
    }

    public final void onResume()
    {
        super.onResume();
        Dialog dialog = getDialog();
        if (dialog == null)
        {
            return;
        } else
        {
            Views.setLink((TextView)dialog.findViewById(0x102000b), createTermsOfUseMarkup(getActivity()));
            return;
        }
    }
}
