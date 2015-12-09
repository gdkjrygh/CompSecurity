// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.widget.CheckBox;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.purchaserecord.api.NewPurchaseRecordReceiptEvent;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.android.apps.wallet.transfer.request.DeclineMoneyRequestAction;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;

// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecord

public class DeclineMoneyRequestDialog extends AlertDialogFragment
{

    private static final String TAG = com/google/android/apps/wallet/purchaserecord/DeclineMoneyRequestDialog.getSimpleName();
    ActionExecutor actionExecutor;
    Application application;
    EventBus eventBus;
    FundsTransferClient fundsTransferClient;
    private String requestId;
    private Runnable successRunnable;

    public DeclineMoneyRequestDialog()
    {
        super(newBuilder().setTitle(null).setLayout(com.google.android.apps.walletnfcrel.R.layout.request_money_decline_dialog).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.request_money_confirm_decline).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).setCancelable(true));
    }

    private DeclineMoneyRequestDialog(PurchaseRecord purchaserecord)
    {
        this(purchaserecord, null);
    }

    private DeclineMoneyRequestDialog(PurchaseRecord purchaserecord, Runnable runnable)
    {
        this();
        requestId = purchaserecord.getId();
        successRunnable = runnable;
    }

    private void handleDecline(final int reason)
    {
        com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestRequest declinemoneyrequestrequest = new com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestRequest();
        declinemoneyrequestrequest.id = requestId;
        declinemoneyrequestrequest.reason = Integer.valueOf(reason);
        final String eventLabel;
        if (reason == 2)
        {
            eventLabel = "DeclineIncomingMoneyRequest";
        } else
        {
            eventLabel = "RequestMoneySpam";
        }
        analyticsUtil.sendButtonTap(eventLabel, new AnalyticsCustomDimension[0]);
        actionExecutor.executeAction(new DeclineMoneyRequestAction(fundsTransferClient, declinemoneyrequestrequest), new AsyncCallback() {

            final DeclineMoneyRequestDialog this$0;
            final String val$eventLabel;
            final int val$reason;

            private void onSuccess(com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestResponse declinemoneyrequestresponse)
            {
                if (declinemoneyrequestresponse.callError != null)
                {
                    WLog.e(DeclineMoneyRequestDialog.TAG, declinemoneyrequestresponse.callError.toString());
                    analyticsUtil.sendError(eventLabel, new AnalyticsCustomDimension[0]);
                    showToast(com.google.android.apps.walletnfcrel.R.string.request_money_decline_failed);
                } else
                {
                    analyticsUtil.sendSuccess(eventLabel, new AnalyticsCustomDimension[0]);
                    int i;
                    if (reason == 2)
                    {
                        i = com.google.android.apps.walletnfcrel.R.string.request_money_decline_complete;
                    } else
                    {
                        i = com.google.android.apps.walletnfcrel.R.string.request_money_flag_spam_complete;
                    }
                    showToast(i);
                    eventBus.post(Integer.valueOf(13), new NewPurchaseRecordReceiptEvent());
                }
                if (successRunnable != null)
                {
                    successRunnable.run();
                }
            }

            private void showToast(int i)
            {
                Toasts.show(application, i);
            }

            public final void onFailure(Exception exception)
            {
                WLog.e(DeclineMoneyRequestDialog.TAG, "Failed to decline request", exception);
                analyticsUtil.sendError(eventLabel, new AnalyticsCustomDimension[0]);
                showToast(com.google.android.apps.walletnfcrel.R.string.request_money_decline_failed);
            }

            public final volatile void onSuccess(Object obj)
            {
                onSuccess((com.google.wallet.proto.api.NanoWalletFundsTransfer.DeclineMoneyRequestResponse)obj);
            }

            
            {
                this$0 = DeclineMoneyRequestDialog.this;
                eventLabel = s;
                reason = i;
                super();
            }
        });
    }

    public static void show(PurchaseRecord purchaserecord, FragmentManager fragmentmanager)
    {
        (new DeclineMoneyRequestDialog(purchaserecord)).show(fragmentmanager);
    }

    public static void show(PurchaseRecord purchaserecord, FragmentManager fragmentmanager, Runnable runnable)
    {
        (new DeclineMoneyRequestDialog(purchaserecord, runnable)).show(fragmentmanager);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        setOnClickListener(new android.content.DialogInterface.OnClickListener() {

            final DeclineMoneyRequestDialog this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (-1 == i)
                {
                    dialoginterface = (CheckBox)getDialog().findViewById(com.google.android.apps.walletnfcrel.R.id.flagSpamCheckbox);
                    DeclineMoneyRequestDialog declinemoneyrequestdialog = DeclineMoneyRequestDialog.this;
                    if (dialoginterface.isChecked())
                    {
                        i = 3;
                    } else
                    {
                        i = 2;
                    }
                    declinemoneyrequestdialog.handleDecline(i);
                }
            }

            
            {
                this$0 = DeclineMoneyRequestDialog.this;
                super();
            }
        });
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            requestId = bundle.getString("request id");
        }
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("request id", requestId);
    }




}
