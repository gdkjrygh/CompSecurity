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
import android.widget.TextView;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.POIDetail;
import java.util.HashMap;
import java.util.Map;

public class CallPhoneDialogFragment extends DialogFragment
{

    private TextView mTextView;
    private POIDetail poi;

    public CallPhoneDialogFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        final AlertDialog dialog = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(0x7f03001f, null);
        bundle = (Button)view.findViewById(0x7f0a0071);
        Button button = (Button)view.findViewById(0x7f0a0072);
        mTextView = (TextView)view.findViewById(0x7f0a0070);
        mTextView.setText((new StringBuilder()).append(mTextView.getText().toString()).append(" ").append(poi.getTitle()).append("?").toString());
        dialog.setView(view);
        dialog = dialog.create();
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final CallPhoneDialogFragment this$0;
            final AlertDialog val$dialog;

            public void onClick(View view1)
            {
                view1 = new HashMap();
                view1.put("Place Called", poi.getTitle());
                ((MainNavigationActivity)getActivity()).tagLocalyticsEvent("Call Phone Number", view1);
                view1 = new Intent("android.intent.action.CALL", Uri.parse((new StringBuilder()).append("tel:").append(poi.getFormattedPhoneNumber().replace("-", "")).toString()));
                view1.setFlags(0x10000000);
                startActivity(view1);
                dialog.cancel();
            }

            
            {
                this$0 = CallPhoneDialogFragment.this;
                dialog = alertdialog;
                super();
            }
        });
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final CallPhoneDialogFragment this$0;
            final AlertDialog val$dialog;

            public void onClick(View view1)
            {
                dialog.cancel();
            }

            
            {
                this$0 = CallPhoneDialogFragment.this;
                dialog = alertdialog;
                super();
            }
        });
        return dialog;
    }

    public void setPOI(POIDetail poidetail)
    {
        poi = poidetail;
    }

}
