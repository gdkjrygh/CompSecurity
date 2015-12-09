// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.topup.api.TopUpApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            RecurringTopupEvent, CancelRecurringTopupDialog, CancelRecurringTopupAction, RecurringTopupDetailsFragment, 
//            SkipRecurringTopupAction, RecurringTopupPublisher

public class ViewRecurringTopupActivity extends WalletActivity
    implements CancelRecurringTopupDialog.CancelRecurringTopupDialogListener
{

    private static final String TAG = com/google/android/apps/wallet/recurringtopup/ViewRecurringTopupActivity.getSimpleName();
    AnalyticsUtil analyticsUtil;
    DateAndTimeHelper dateAndTimeHelper;
    EventBus eventBus;
    private boolean openCancelDialog;
    FullScreenProgressSpinnerManager progressSpinnerManager;
    private RecurringTopupEvent recurringTopupEvent;
    RecurringTopupPublisher recurringTopupPublisher;
    private AnalyticsCustomDimension transferHoldDimension;
    UriRegistry uriRegistry;

    public ViewRecurringTopupActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        openCancelDialog = false;
    }

    private void attachCancelAllListener(AlertDialogFragment alertdialogfragment)
    {
        alertdialogfragment.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

            final ViewRecurringTopupActivity this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    onCancelAll();
                }
            }

            
            {
                this$0 = ViewRecurringTopupActivity.this;
                super();
            }
        });
    }

    private void attachCancelExpiredListener(AlertDialogFragment alertdialogfragment)
    {
        alertdialogfragment.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

            final ViewRecurringTopupActivity this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    progressSpinnerManager.showImmediately();
                    WLog.i(ViewRecurringTopupActivity.TAG, "Canceling recurring topup");
                    analyticsUtil.sendButtonTap("RecurringTransferCancel", new AnalyticsCustomDimension[] {
                        transferHoldDimension
                    });
                    executeAction("CANCEL", new CancelRecurringTopupAction(recurringTopupPublisher, recurringTopupEvent.getTopupSchedule().serverData, true));
                }
            }

            
            {
                this$0 = ViewRecurringTopupActivity.this;
                super();
            }
        });
    }

    private boolean checkFailureCause(Throwable throwable)
    {
        if (throwable != null)
        {
            WLog.e(TAG, "Received exception from an event provider", throwable);
            if (getFragmentManager().findFragmentByTag("ERROR_DIALOG") == null)
            {
                CallErrorDialogs.createBuilderWithGenericTitle(throwable, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().build().show(getSupportFragmentManager(), "ERROR_DIALOG");
            }
            return true;
        } else
        {
            return false;
        }
    }

    private void onCancel()
    {
        if (Boolean.TRUE.equals(recurringTopupEvent.getTopupSchedule().disableSkipSupport))
        {
            showCancelAllDialog();
            return;
        } else
        {
            showCancelDialog();
            return;
        }
    }

    private void onCancelExpired()
    {
        AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.cancel_dealdine_expired_title).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.cancel_dealdine_expired_content)).setCancelable(true).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.nevermind).build().show(getSupportFragmentManager(), "CANCEL_EXPIRED");
    }

    private void onCancelSuccess(com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse canceltopupscheduleresponse)
    {
        if (canceltopupscheduleresponse.callError != null && canceltopupscheduleresponse.callError.errorCode.intValue() == 2)
        {
            analyticsUtil.sendUserError("RecurringTransferCancel", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            WLog.w(TAG, canceltopupscheduleresponse.callError.toString());
            onCancelExpired();
            return;
        }
        if (canceltopupscheduleresponse.callError != null)
        {
            analyticsUtil.sendError("RecurringTransferCancel", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            WLog.e(TAG, canceltopupscheduleresponse.callError.toString());
            CallErrorDialogs.createBuilderWithGenericTitle(canceltopupscheduleresponse.callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
            return;
        } else
        {
            analyticsUtil.sendSuccess("RecurringTransferCancel", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            Toasts.show(this, com.google.android.apps.walletnfcrel.R.string.cancel_recurring_transfer_toast);
            finish();
            return;
        }
    }

    private void onSkipSuccess(com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionResponse skipnexttopuptransactionresponse)
    {
        if (skipnexttopuptransactionresponse.callError != null && skipnexttopuptransactionresponse.callError.errorCode.intValue() == 2)
        {
            analyticsUtil.sendUserError("RecurringTransferSkip", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            WLog.w(TAG, skipnexttopuptransactionresponse.callError.toString());
            AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.skip_dealdine_expired_title).setMessage(getString(com.google.android.apps.walletnfcrel.R.string.skip_dealdine_expired_content)).setCancelable(true).build().show(getSupportFragmentManager(), "SKIP_EXPIRED");
            return;
        }
        if (skipnexttopuptransactionresponse.callError != null)
        {
            analyticsUtil.sendError("RecurringTransferSkip", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            WLog.e(TAG, skipnexttopuptransactionresponse.callError.toString());
            CallErrorDialogs.createBuilderWithGenericTitle(skipnexttopuptransactionresponse.callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
            return;
        } else
        {
            analyticsUtil.sendSuccess("RecurringTransferSkip", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            Toasts.show(this, getString(com.google.android.apps.walletnfcrel.R.string.skip_recurring_transfer_toast, new Object[] {
                recurringTopupEvent.getTopupSchedule().nextTopup.startDate.date
            }));
            return;
        }
    }

    private void showCancelAllDialog()
    {
        AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.cancel_recurring_topup_title).setMessage(com.google.android.apps.walletnfcrel.R.string.confirm_cancel_all).setCancelable(true).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.nevermind).build().show(getSupportFragmentManager(), "CANCEL_ALL");
    }

    private void showCancelDialog()
    {
        com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule displayableschedule = recurringTopupEvent.getTopupSchedule();
        com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule.DisplayableDateTime displayabledatetime = displayableschedule.nextTopup.startDate;
        CancelRecurringTopupDialog.createDialog(displayableschedule.amount.displayAmount, displayabledatetime.date).show(getSupportFragmentManager(), "CANCEL");
    }

    protected final void doOnCreate(Bundle bundle)
    {
        progressSpinnerManager.showImmediately();
        setTitle(com.google.android.apps.walletnfcrel.R.string.view_recurring_transfer_title);
        if (UriRegistry.getUri(5006, new Object[0]).equals(getIntent().getData()))
        {
            openCancelDialog = true;
        }
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
        if (super.onActionFailure(s, callable, exception)) goto _L2; else goto _L1
_L1:
        if (!"SKIP".equals(s)) goto _L4; else goto _L3
_L3:
        analyticsUtil.sendError("RecurringTransferSkip", new AnalyticsCustomDimension[] {
            transferHoldDimension
        });
        WLog.e(TAG, "Error skipping recurring topup", exception);
_L6:
        CallErrorDialogs.createBuilderWithGenericTitle(exception, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
_L2:
        progressSpinnerManager.hide();
        return true;
_L4:
        if ("CANCEL".equals(s))
        {
            analyticsUtil.sendError("RecurringTransferCancel", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            WLog.e(TAG, "Error canceling recurring topup", exception);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if (!"SKIP".equals(s)) goto _L2; else goto _L1
_L1:
        onSkipSuccess((com.google.wallet.proto.api.NanoWalletScheduleTopups.SkipNextTopupTransactionResponse)obj);
_L4:
        progressSpinnerManager.hide();
        return;
_L2:
        if ("CANCEL".equals(s))
        {
            onCancelSuccess((com.google.wallet.proto.api.NanoWalletScheduleTopups.CancelTopupScheduleResponse)obj);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onAttachFragment(Fragment fragment)
    {
        if ("CANCEL_EXPIRED".equals(fragment.getTag()))
        {
            attachCancelExpiredListener((AlertDialogFragment)fragment);
        } else
        if ("CANCEL_ALL".equals(fragment.getTag()))
        {
            attachCancelAllListener((AlertDialogFragment)fragment);
            return;
        }
    }

    public final void onCancelAll()
    {
        progressSpinnerManager.showImmediately();
        WLog.i(TAG, "Canceling recurring topup");
        analyticsUtil.sendButtonTap("RecurringTransferCancel", new AnalyticsCustomDimension[] {
            transferHoldDimension
        });
        executeAction("CANCEL", new CancelRecurringTopupAction(recurringTopupPublisher, recurringTopupEvent.getTopupSchedule().serverData));
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.cancel_transfers_buttons);
        return true;
    }

    public void onNewRecurringTopupEvent(RecurringTopupEvent recurringtopupevent)
    {
        Preconditions.checkArgument(recurringtopupevent.isFeatureEnabled());
        if (!checkFailureCause(recurringtopupevent.getFailureCause()))
        {
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
            {
                if (recurringtopupevent.getTopupSchedule().errorState != null)
                {
                    WLog.w(TAG, "Recurring topup is in error state");
                    navigateUpWithIntent(uriRegistry.createIntent(5007, new Object[0]));
                    finish();
                    return;
                }
                recurringTopupEvent = recurringtopupevent;
                recurringtopupevent = recurringTopupEvent.getTopupSchedule().nextTopup.transferHold;
                if (Boolean.TRUE.equals(recurringtopupevent))
                {
                    recurringtopupevent = "Hold";
                } else
                if (Boolean.FALSE.equals(recurringtopupevent))
                {
                    recurringtopupevent = "No Hold";
                } else
                {
                    recurringtopupevent = "";
                }
                transferHoldDimension = new AnalyticsCustomDimension(3, recurringtopupevent);
                analyticsUtil.sendScreen("Recurring Transfer Details", new AnalyticsCustomDimension[] {
                    transferHoldDimension
                });
                recurringtopupevent = RecurringTopupDetailsFragment.createFragment(recurringTopupEvent.getTopupSchedule(), false);
                getSupportFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, recurringtopupevent, recurringtopupevent.getClass().getSimpleName()).commit();
                if (openCancelDialog)
                {
                    onCancel();
                    openCancelDialog = false;
                }
                progressSpinnerManager.hide();
                return;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton && recurringTopupEvent != null)
        {
            onCancel();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    public final void onSkip()
    {
        progressSpinnerManager.showImmediately();
        WLog.i(TAG, "Skipping recurring topup");
        analyticsUtil.sendButtonTap("RecurringTransferSkip", new AnalyticsCustomDimension[] {
            transferHoldDimension
        });
        executeAction("SKIP", new SkipRecurringTopupAction(recurringTopupPublisher, recurringTopupEvent.getTopupSchedule().serverData));
    }

    protected final void onUpPressed()
    {
        Views.hideSoftKeyboard(this, getCurrentFocus());
        navigateUpWithIntent(uriRegistry.createIntent(5003, new Object[0]));
    }




}
