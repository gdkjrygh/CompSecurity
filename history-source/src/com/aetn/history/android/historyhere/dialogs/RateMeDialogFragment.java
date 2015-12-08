// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.Configuration;
import com.aetn.history.android.historyhere.model.PreferenceManager;

public class RateMeDialogFragment extends DialogFragment
{

    public RateMeDialogFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        final AlertDialog dialog = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(0x7f030029, null);
        bundle = (Button)view.findViewById(0x7f0a0071);
        Button button = (Button)view.findViewById(0x7f0a0072);
        Button button1 = (Button)view.findViewById(0x7f0a0079);
        dialog.setView(view);
        dialog = dialog.create();
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final RateMeDialogFragment this$0;
            final AlertDialog val$dialog;

            public void onClick(View view1)
            {
                ((MainNavigationActivity)getActivity()).tagLocalyticsEvent("Rate App", null);
                PreferenceManager.setShouldShowRateReminder(getActivity(), false);
                view1 = new Intent("android.intent.action.VIEW", Uri.parse(HistoryHereApplication.getConfiguration().playStoreURL));
                getActivity().startActivity(view1);
                dialog.cancel();
            }

            
            {
                this$0 = RateMeDialogFragment.this;
                dialog = alertdialog;
                super();
            }
        });
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final RateMeDialogFragment this$0;
            final AlertDialog val$dialog;

            public void onClick(View view1)
            {
                PreferenceManager.setShouldShowRateReminder(getActivity(), false);
                dialog.cancel();
            }

            
            {
                this$0 = RateMeDialogFragment.this;
                dialog = alertdialog;
                super();
            }
        });
        button1.setOnClickListener(new android.view.View.OnClickListener() {

            final RateMeDialogFragment this$0;
            final AlertDialog val$dialog;

            public void onClick(View view1)
            {
                PreferenceManager.setShouldShowRateReminder(getActivity(), true);
                dialog.cancel();
            }

            
            {
                this$0 = RateMeDialogFragment.this;
                dialog = alertdialog;
                super();
            }
        });
        return dialog;
    }
}
