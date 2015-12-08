// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.google.android.apps.wallet.fragment.Fragments;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import dagger.Lazy;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.util.async.activity:
//            WalletTaskFragment

public class WalletActivityActionExecutor
{

    public Lazy actionExecutor;
    private FragmentManager activityFragmentManager;
    private WalletTaskFragment walletTaskFragment;

    public WalletActivityActionExecutor()
    {
    }

    public final void clearCallback(String s)
    {
        if (walletTaskFragment != null)
        {
            walletTaskFragment.clearCallback(s);
        }
    }

    public final void executeAction(String s, String s1, Callable callable, WalletTaskFragment.TaskCallback taskcallback)
    {
        if (walletTaskFragment == null)
        {
            walletTaskFragment = new WalletTaskFragment();
            activityFragmentManager.beginTransaction().add(walletTaskFragment, Fragments.getTransactionTag(com/google/android/apps/wallet/util/async/activity/WalletTaskFragment)).commit();
            walletTaskFragment.setActionExecutor((ActionExecutor)actionExecutor.get());
            walletTaskFragment.setCallback(s, taskcallback);
        }
        walletTaskFragment.executeAction(s, s1, callable);
    }

    public final void handleConcurrentActionException(Context context)
    {
        AlertDialogFragment.newBuilder().setMessage(context.getString(com.google.android.apps.walletnfcrel.R.string.concurrent_running_action_error_dialog_message)).build().show(activityFragmentManager);
    }

    public final void initialize(FragmentManager fragmentmanager, Bundle bundle)
    {
        activityFragmentManager = fragmentmanager;
        if (bundle != null)
        {
            walletTaskFragment = (WalletTaskFragment)fragmentmanager.findFragmentByTag(Fragments.getTransactionTag(com/google/android/apps/wallet/util/async/activity/WalletTaskFragment));
            if (walletTaskFragment != null)
            {
                walletTaskFragment.setActionExecutor((ActionExecutor)actionExecutor.get());
            }
        }
    }

    public final boolean isActionRunning(String s)
    {
        return walletTaskFragment != null && walletTaskFragment.isActionRunning(s);
    }

    public final void setCallback(String s, WalletTaskFragment.TaskCallback taskcallback)
    {
        if (walletTaskFragment != null)
        {
            walletTaskFragment.setCallback(s, taskcallback);
        }
    }
}
