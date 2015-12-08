// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.ui;

import android.content.DialogInterface;
import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;

public class NfcCancelConfirmationDialogFragment extends AlertDialogFragment
{

    UriRegistry uriRegistry;

    public NfcCancelConfirmationDialogFragment()
    {
        super(AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.leave_nfc_setup_title).setMessage(com.google.android.apps.walletnfcrel.R.string.leave_nfc_setup_message).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.leave_nfc_setup_button_label).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setCancelable(true));
    }

    public static NfcCancelConfirmationDialogFragment createAndShow(FragmentActivity fragmentactivity)
    {
        NfcCancelConfirmationDialogFragment nfccancelconfirmationdialogfragment = new NfcCancelConfirmationDialogFragment();
        nfccancelconfirmationdialogfragment.show(fragmentactivity.getSupportFragmentManager());
        return nfccancelconfirmationdialogfragment;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            getActivity().setResult(0);
            getActivity().finish();
            startActivity(uriRegistry.createIntent(2, new Object[0]));
            return;
        } else
        {
            super.onClick(dialoginterface, i);
            return;
        }
    }
}
