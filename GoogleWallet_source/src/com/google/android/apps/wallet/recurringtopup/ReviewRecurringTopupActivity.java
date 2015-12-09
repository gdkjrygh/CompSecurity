// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.recurringtopup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Preconditions;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.recurringtopup:
//            SaveRecurringTopupAction, RecurringTopupDetailsFragment, SetupRecurringTopupActivity, RecurringTopupPublisher

public class ReviewRecurringTopupActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/recurringtopup/ReviewRecurringTopupActivity.getSimpleName();
    AnalyticsUtil analyticsUtil;
    private com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule displayableSchedule;
    FullScreenProgressSpinnerManager progressSpinnerManager;
    RecurringTopupPublisher recurringTopupPublisher;
    private AnalyticsCustomDimension transferHoldDimension;
    UriRegistry uriRegistry;

    public ReviewRecurringTopupActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    public static Intent createIntent(Context context, com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule displayableschedule)
    {
        Preconditions.checkNotNull(displayableschedule);
        context = InternalIntents.forClass(context, com/google/android/apps/wallet/recurringtopup/ReviewRecurringTopupActivity);
        context.putExtra("DISPLAYABLE_SCHEDULE", MessageNano.toByteArray(displayableschedule));
        return context;
    }

    private void onSave()
    {
        progressSpinnerManager.showImmediately();
        WLog.i(TAG, "Saving recurring topup");
        executeAction("SAVE", new SaveRecurringTopupAction(recurringTopupPublisher, displayableSchedule.serverData));
    }

    private void readExtras()
    {
        Bundle bundle = getIntent().getExtras();
        displayableSchedule = new com.google.wallet.proto.api.NanoWalletScheduleTopups.DisplayableSchedule();
        try
        {
            MessageNano.mergeFrom(displayableSchedule, bundle.getByteArray("DISPLAYABLE_SCHEDULE"));
            return;
        }
        catch (InvalidProtocolBufferNanoException invalidprotocolbuffernanoexception)
        {
            throw new RuntimeException("Failed parsing ReviewRecurringTopupActivity extras", invalidprotocolbuffernanoexception);
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.review_recurring_topup_title);
        readExtras();
        if (bundle == null)
        {
            bundle = RecurringTopupDetailsFragment.createFragment(displayableSchedule, true);
            getSupportFragmentManager().beginTransaction().replace(com.google.android.apps.walletnfcrel.R.id.ChildActivityContainer, bundle, bundle.getClass().getSimpleName()).commit();
        }
    }

    protected final void doOnResume()
    {
        super.doOnResume();
        Object obj = displayableSchedule.nextTopup.transferHold;
        if (Boolean.TRUE.equals(obj))
        {
            obj = "Hold";
        } else
        if (Boolean.FALSE.equals(obj))
        {
            obj = "No Hold";
        } else
        {
            obj = "";
        }
        transferHoldDimension = new AnalyticsCustomDimension(3, ((String) (obj)));
        analyticsUtil.sendScreen("Review Recurring Transfer", new AnalyticsCustomDimension[] {
            transferHoldDimension
        });
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
            analyticsUtil.sendError("RecurringTransferSave", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            WLog.e(TAG, "Error saving schedule", exception);
            AlertDialogFragment.newBuilder().setMessage(com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        s = (com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse)obj;
        if (((com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse) (s)).callError != null && ((com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse) (s)).callError.errorCode.intValue() == 2)
        {
            progressSpinnerManager.hide();
            analyticsUtil.sendUserError("RecurringTransferSave", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            WLog.i(TAG, ((com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse) (s)).callError.toString());
            CallErrorDialogs.createBuilderWithGenericTitle(((com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse) (s)).callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).setFinishActivityOnClick().setCancelable(false).build().show(getSupportFragmentManager());
            return;
        }
        if (((com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse) (s)).callError != null)
        {
            progressSpinnerManager.hide();
            analyticsUtil.sendError("RecurringTransferSave", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            WLog.e(TAG, ((com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse) (s)).callError.toString());
            CallErrorDialogs.createBuilderWithGenericTitle(((com.google.wallet.proto.api.NanoWalletScheduleTopups.ScheduleTopupResponse) (s)).callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
            return;
        } else
        {
            analyticsUtil.sendSuccess("RecurringTransferSave", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            Toasts.show(this, com.google.android.apps.walletnfcrel.R.string.scheduled_transfer_toast);
            navigateUpWithIntent(uriRegistry.createIntent(5003, new Object[0]));
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.apps.walletnfcrel.R.menu.action_bar_button, menu);
        menu.findItem(com.google.android.apps.walletnfcrel.R.id.ActionBarButton).setTitle(com.google.android.apps.walletnfcrel.R.string.button_save);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == com.google.android.apps.walletnfcrel.R.id.ActionBarButton)
        {
            analyticsUtil.sendButtonTap("RecurringTransferSave", new AnalyticsCustomDimension[] {
                transferHoldDimension
            });
            onSave();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    protected final void onUpPressed()
    {
        Views.hideSoftKeyboard(this, getCurrentFocus());
        navigateUpWithIntent(InternalIntents.forClass(this, com/google/android/apps/wallet/recurringtopup/SetupRecurringTopupActivity));
    }

}
