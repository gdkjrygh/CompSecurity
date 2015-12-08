// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.dialogs;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.aetn.history.android.historyhere.MainNavigationActivity;

public class InitLocationServicesOrSearchDialog extends DialogFragment
{

    private static final String TAG = "InitLocationServicesOrSearchDialog";

    public InitLocationServicesOrSearchDialog()
    {
    }

    public static InitLocationServicesOrSearchDialog newInstance(int i)
    {
        InitLocationServicesOrSearchDialog initlocationservicesorsearchdialog = new InitLocationServicesOrSearchDialog();
        Bundle bundle = new Bundle();
        bundle.putInt("title", i);
        initlocationservicesorsearchdialog.setArguments(bundle);
        return initlocationservicesorsearchdialog;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getActivity().getLayoutInflater().inflate(0x7f030023, null);
        Button button = (Button)bundle.findViewById(0x7f0a0071);
        Button button1 = (Button)bundle.findViewById(0x7f0a006d);
        ((TextView)bundle.findViewById(0x7f0a0078)).setOnClickListener(new android.view.View.OnClickListener() {

            final InitLocationServicesOrSearchDialog this$0;

            public void onClick(View view)
            {
                ((MainNavigationActivity)getActivity()).showMapSearch();
                getDialog().cancel();
            }

            
            {
                this$0 = InitLocationServicesOrSearchDialog.this;
                super();
            }
        });
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final InitLocationServicesOrSearchDialog this$0;

            public void onClick(View view)
            {
                ((MainNavigationActivity)getActivity()).goToLocationSettings();
                getDialog().cancel();
            }

            
            {
                this$0 = InitLocationServicesOrSearchDialog.this;
                super();
            }
        });
        button1.setOnClickListener(new android.view.View.OnClickListener() {

            final InitLocationServicesOrSearchDialog this$0;

            public void onClick(View view)
            {
                getDialog().cancel();
            }

            
            {
                this$0 = InitLocationServicesOrSearchDialog.this;
                super();
            }
        });
        return (new android.app.AlertDialog.Builder(getActivity())).setView(bundle).create();
    }
}
