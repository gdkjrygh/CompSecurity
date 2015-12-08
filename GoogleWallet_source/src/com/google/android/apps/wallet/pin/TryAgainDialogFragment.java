// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin;

import android.content.DialogInterface;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.common.base.Preconditions;

public class TryAgainDialogFragment extends AlertDialogFragment
{
    static interface Listener
    {

        public abstract void onCancel();

        public abstract void onTryAgain();
    }


    private Listener listener;

    public TryAgainDialogFragment()
    {
        super(newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.pin_network_error_title).setMessage(com.google.android.apps.walletnfcrel.R.string.pin_network_error_message).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.dialog_option_try_again).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setCancelable(false));
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        Preconditions.checkNotNull(listener);
        switch (i)
        {
        default:
            return;

        case -1: 
            listener.onTryAgain();
            return;

        case -2: 
            listener.onCancel();
            return;
        }
    }

    final void setListener(Listener listener1)
    {
        listener = listener1;
    }
}
