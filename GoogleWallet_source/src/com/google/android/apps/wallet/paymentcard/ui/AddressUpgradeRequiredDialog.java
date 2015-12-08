// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import com.google.android.apps.common.inject.FragmentInjectHelper;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.paymentcard.api.PaymentCardApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.Callable;

public class AddressUpgradeRequiredDialog extends AlertDialogFragment
{

    private static final String TAG = com/google/android/apps/wallet/paymentcard/ui/AddressUpgradeRequiredDialog.getSimpleName();
    ActionExecutor actionExecutor;
    private PaymentCard card;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    PaymentCardApi paymentCardApi;

    public AddressUpgradeRequiredDialog()
    {
        super(newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.address_upgrade_required_header).setMessage(com.google.android.apps.walletnfcrel.R.string.address_upgrade_required_explanation).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_enter_address));
    }

    private AddressUpgradeRequiredDialog(PaymentCard paymentcard)
    {
        this();
        card = paymentcard;
    }

    public static void show(PaymentCard paymentcard, FragmentManager fragmentmanager)
    {
        (new AddressUpgradeRequiredDialog(paymentcard)).show(fragmentmanager);
    }

    private void startEditCardActivity(final Activity activity, final DialogInterface dialog)
    {
        actionExecutor.executeAction(new Callable() {

            final AddressUpgradeRequiredDialog this$0;
            final Activity val$activity;

            private Intent call()
                throws Exception
            {
                return paymentCardApi.createEditCardIntent(activity, card);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = AddressUpgradeRequiredDialog.this;
                activity = activity1;
                super();
            }
        }, new AsyncCallback() {

            final AddressUpgradeRequiredDialog this$0;
            final Activity val$activity;
            final DialogInterface val$dialog;

            private void onSuccess(Intent intent)
            {
                fullScreenProgressSpinnerManager.hide();
                activity.startActivityForResult(intent, 1);
            }

            public final void onFailure(Exception exception)
            {
                Toasts.show(activity, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_title);
                WLog.e(AddressUpgradeRequiredDialog.TAG, "Could not create intent to edit instrument", exception);
                dialog.dismiss();
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((Intent)obj);
            }

            
            {
                this$0 = AddressUpgradeRequiredDialog.this;
                activity = activity1;
                dialog = dialoginterface;
                super();
            }
        });
    }

    public final void onAttach(final Activity activity)
    {
        super.onAttach(activity);
        setOnClickListener(new android.content.DialogInterface.OnClickListener() {

            final AddressUpgradeRequiredDialog this$0;
            final Activity val$activity;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case -1: 
                    fullScreenProgressSpinnerManager.show();
                    startEditCardActivity(activity, dialoginterface);
                    return;

                case -2: 
                    dialoginterface.dismiss();
                    return;
                }
            }

            
            {
                this$0 = AddressUpgradeRequiredDialog.this;
                activity = activity1;
                super();
            }
        });
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            card = (PaymentCard)bundle.getParcelable("card id");
        }
        FragmentInjectHelper.inject(this);
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("card id", card);
    }




}
