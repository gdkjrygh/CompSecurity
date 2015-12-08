// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class NoPoisInListDialogFragment extends DialogFragment
{

    public NoPoisInListDialogFragment()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        final AlertDialog dialog = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(0x7f030027, null);
        bundle = (Button)view.findViewById(0x7f0a0071);
        dialog.setView(view);
        dialog = dialog.create();
        bundle.setOnClickListener(new android.view.View.OnClickListener() {

            final NoPoisInListDialogFragment this$0;
            final AlertDialog val$dialog;

            public void onClick(View view1)
            {
                dialog.cancel();
            }

            
            {
                this$0 = NoPoisInListDialogFragment.this;
                dialog = alertdialog;
                super();
            }
        });
        return dialog;
    }
}
