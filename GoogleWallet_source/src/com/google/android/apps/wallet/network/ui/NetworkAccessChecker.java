// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.network.ui;

import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import com.google.android.apps.wallet.network.NetworkInformationProvider;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.common.base.Preconditions;

public class NetworkAccessChecker
{

    private static final String TAG = com/google/android/apps/wallet/network/ui/NetworkAccessChecker.getSimpleName();
    private final FragmentActivity activity;
    private final NetworkInformationProvider networkInformationProvider;

    NetworkAccessChecker(NetworkInformationProvider networkinformationprovider, FragmentActivity fragmentactivity)
    {
        networkInformationProvider = networkinformationprovider;
        activity = fragmentactivity;
    }

    public final boolean check()
    {
        return check(false);
    }

    public final boolean check(boolean flag)
    {
        boolean flag1;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1);
        flag1 = networkInformationProvider.hasNetworkAccess();
        if (!flag1)
        {
            Object obj = (AlertDialogFragment)activity.getSupportFragmentManager().findFragmentByTag(TAG);
            if (obj != null)
            {
                ((AlertDialogFragment) (obj)).dismiss();
            }
            obj = AlertDialogFragment.newBuilder().setCancelable(true).setTitle(com.google.android.apps.walletnfcrel.R.string.error_dialog_no_network_access_title).setMessage(com.google.android.apps.walletnfcrel.R.string.error_dialog_no_network_access);
            if (flag)
            {
                ((com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder) (obj)).setFinishActivityOnClick().setFinishActivityOnDismiss();
            }
            ((com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment.Builder) (obj)).build().show(activity.getSupportFragmentManager(), TAG);
        }
        return flag1;
    }

}
