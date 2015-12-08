// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.topup.api.TopUpApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            CancelRecurringTopupAction, RecurringTopupEvent, RecurringTopupPublisher

public class RecurringTopupErrorActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/recurringtopup/RecurringTopupErrorActivity.getSimpleName();
    AnalyticsUtil analyticsUtil;
    private TextView errorText;
    EventBus eventBus;
    private Button okButton;
    FullScreenProgressSpinnerManager progressSpinnerManager;
    private RecurringTopupEvent recurringTopupEvent;
    RecurringTopupPublisher recurringTopupPublisher;
    UriRegistry uriRegistry;

    public RecurringTopupErrorActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void onOk()
    {
        progressSpinnerManager.showImmediately();
        WLog.i(TAG, "Canceling recurring topup");
        analyticsUtil.sendButtonTap("RecurringTransferCancel", new AnalyticsCustomDimension[0]);
        executeAction("CANCEL", new CancelRecurringTopupAction(recurringTopupPublisher, recurringTopupEvent.getTopupSchedule().serverData, true));
    }

    private void showError(Exception exception)
    {
        CallErrorDialogs.createBuilderWithGenericTitle(exception, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().build().show(getSupportFragmentManager(), "ERROR_DIALOG");
    }

    protected final void doOnCreate(Bundle bundle)
    {
        progressSpinnerManager.showImmediately();
        setTitle(com.google.android.apps.walletnfcrel.R.string.recurring_topup_error_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.recurring_topup_error_activity);
        errorText = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ErrorDescription);
        okButton = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CancelRecurringTopup);
        okButton.setOnClickListener(new android.view.View.OnClickListener() {

            final RecurringTopupErrorActivity this$0;

            public final void onClick(View view)
            {
                onOk();
            }

            
            {
                this$0 = RecurringTopupErrorActivity.this;
                super();
            }
        });
    }

    protected final void doOnResume()
    {
        super.doOnResume();
        eventBus.register(this);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        progressSpinnerManager.hide();
        if (!super.onActionFailure(s, callable, exception))
        {
            analyticsUtil.sendError("RecurringTransferCancel", new AnalyticsCustomDimension[0]);
            WLog.e(TAG, "Error canceling recurring topup", exception);
            showError(exception);
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        s = (com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse)obj;
        if (((com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse) (s)).callError != null)
        {
            progressSpinnerManager.hide();
            analyticsUtil.sendError("RecurringTransferCancel", new AnalyticsCustomDimension[0]);
            WLog.e(TAG, ((com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse) (s)).callError.toString());
            CallErrorDialogs.createBuilderWithGenericTitle(((com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse) (s)).callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().build().show(getSupportFragmentManager(), "ERROR_DIALOG");
            return;
        } else
        {
            analyticsUtil.sendSuccess("RecurringTransferCancel", new AnalyticsCustomDimension[0]);
            finish();
            return;
        }
    }

    public void onNewRecurringTopupEvent(RecurringTopupEvent recurringtopupevent)
    {
        Preconditions.checkArgument(recurringtopupevent.isFeatureEnabled());
        if (recurringtopupevent.getFailureCause() != null)
        {
            WLog.e(TAG, "Received exception from an event provider", recurringtopupevent.getFailureCause());
            showError(recurringtopupevent.getFailureCause());
        } else
        if (recurringtopupevent.getTopupSchedule() == null)
        {
            if (!isActionRunning("CANCEL"))
            {
                WLog.w(TAG, "Recurring topup no longer exists");
                navigateUpWithIntent(TopUpApi.createTopUpActivityIntent(this));
                finish();
                return;
            }
        } else
        if (recurringtopupevent.getTopupSchedule().errorState == null)
        {
            WLog.w(TAG, "Recurring topup is not in error state");
            navigateUpWithIntent(uriRegistry.createIntent(5005, new Object[0]));
            finish();
            return;
        } else
        {
            recurringTopupEvent = recurringtopupevent;
            errorText.setText(recurringTopupEvent.getTopupSchedule().errorState.description);
            progressSpinnerManager.hide();
            return;
        }
    }

    protected void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(5003, new Object[0]));
    }


}
