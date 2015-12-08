// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.common.base.Optional;

public class NetworkAccessPrompter
{
    public static class NetworkAccessDialogFragment extends AlertDialogFragment
    {

        public void onClick(DialogInterface dialoginterface, int i)
        {
            switch (i)
            {
            default:
                return;

            case -1: 
                startActivity(new Intent("android.settings.SETTINGS"));
                return;

            case -2: 
                dialoginterface.dismiss();
                return;
            }
        }

        public NetworkAccessDialogFragment()
        {
        }

        public NetworkAccessDialogFragment(int i)
        {
            super(newBuilder().setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_settings).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setTitle(i).setMessage(com.google.android.apps.walletnfcrel.R.string.error_dialog_no_network_access).setCancelable(false));
        }
    }


    private static final String TAG = com/google/android/apps/wallet/usersetup/NetworkAccessPrompter.getSimpleName();
    private final FragmentActivity mActivity;
    private final NetworkInformationProvider mNetworkInformationProvider;

    NetworkAccessPrompter(NetworkInformationProvider networkinformationprovider, FragmentActivity fragmentactivity)
    {
        mNetworkInformationProvider = networkinformationprovider;
        mActivity = fragmentactivity;
    }

    private void displayNoNetworkDialog(int i)
    {
        Optional optional = Optional.fromNullable((AlertDialogFragment)mActivity.getSupportFragmentManager().findFragmentByTag("network_access"));
        if (optional.isPresent())
        {
            ((AlertDialogFragment)optional.get()).dismiss();
        }
        (new NetworkAccessDialogFragment(i)).show(mActivity.getSupportFragmentManager(), "network_access");
    }

    public final boolean checkIfNetworkAvailableAndPromptIfNot(int i)
    {
        if (!mNetworkInformationProvider.hasNetworkAccess())
        {
            WLog.d(TAG, "No network available, can't make RPC calls.");
            displayNoNetworkDialog(i);
            return false;
        } else
        {
            return true;
        }
    }

}
