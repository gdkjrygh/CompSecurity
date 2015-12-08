// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import com.soundcloud.android.dialog.ImageAlertDialog;
import com.soundcloud.android.payments.error.AlreadySubscribedDialog;
import com.soundcloud.android.payments.error.BillingUnavailableDialog;
import com.soundcloud.android.payments.error.ConnectionErrorDialog;
import com.soundcloud.android.payments.error.StaleCheckoutDialog;
import com.soundcloud.android.payments.error.UnconfirmedEmailDialog;
import com.soundcloud.android.payments.error.VerifyIssueDialog;
import com.soundcloud.android.payments.error.WrongUserDialog;

class PaymentErrorView
{

    private Activity activity;
    private FragmentManager fragmentManager;

    public PaymentErrorView()
    {
    }

    private void showGenericError()
    {
        ConnectionErrorDialog.show(fragmentManager);
    }

    public void bind(FragmentActivity fragmentactivity)
    {
        activity = fragmentactivity;
        fragmentManager = fragmentactivity.getSupportFragmentManager();
    }

    public void showAlreadySubscribed()
    {
        AlreadySubscribedDialog.show(fragmentManager);
    }

    public void showBillingUnavailable()
    {
        BillingUnavailableDialog.show(fragmentManager);
    }

    public void showCancelled()
    {
        (new ImageAlertDialog(activity)).setContent(0x7f0200f8, 0x7f0702ea, 0x7f0702e6).setPositiveButton(0x104000a, null).create().show();
    }

    public void showConnectionError()
    {
        showGenericError();
    }

    public void showStaleCheckout()
    {
        StaleCheckoutDialog.show(fragmentManager);
    }

    public void showUnconfirmedEmail()
    {
        UnconfirmedEmailDialog.show(fragmentManager);
    }

    public void showUnknownError()
    {
        showGenericError();
    }

    public void showVerifyFail()
    {
        VerifyIssueDialog.showFail(fragmentManager);
    }

    public void showVerifyTimeout()
    {
        VerifyIssueDialog.showTimeout(fragmentManager);
    }

    public void showWrongUser()
    {
        WrongUserDialog.show(fragmentManager);
    }
}
