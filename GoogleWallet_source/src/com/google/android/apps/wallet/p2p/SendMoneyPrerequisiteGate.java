// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.support.v4.app.FragmentActivity;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SettleBalanceAlertDialog

public class SendMoneyPrerequisiteGate
{

    private static final String TAG = com/google/android/apps/wallet/p2p/SendMoneyPrerequisiteGate.getSimpleName();
    private final FragmentActivity activity;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private final FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    private boolean hasFinished;
    private Runnable onSuccess;
    private Optional storedValueEvent;

    public SendMoneyPrerequisiteGate(FragmentActivity fragmentactivity, EventBus eventbus, FullScreenProgressSpinnerManager fullscreenprogressspinnermanager, FeatureManager featuremanager)
    {
        storedValueEvent = Optional.absent();
        activity = fragmentactivity;
        fullScreenProgressSpinnerManager = fullscreenprogressspinnermanager;
        eventBus = eventbus;
        featureManager = featuremanager;
    }

    private boolean isStoredValueNegative()
    {
        Preconditions.checkState(storedValueEvent.isPresent());
        Preconditions.checkState(((StoredValueEvent)storedValueEvent.get()).isFeatureEnabled());
        if (((StoredValueEvent)storedValueEvent.get()).getModel() == null)
        {
            return false;
        } else
        {
            return ((StoredValueEvent)storedValueEvent.get()).getModel().isStoredValueNegative();
        }
    }

    private void onEventsResult()
    {
        if (hasFinished)
        {
            return;
        }
        hasFinished = true;
        fullScreenProgressSpinnerManager.hide();
        if (!storedValueEvent.isPresent())
        {
            verificationError(com.google.android.apps.walletnfcrel.R.string.send_money_gate_error_balance_not_found);
            return;
        }
        if (!((StoredValueEvent)storedValueEvent.get()).isFeatureEnabled())
        {
            verificationError(com.google.android.apps.walletnfcrel.R.string.send_money_gate_error_balance_not_found);
            return;
        }
        if (isStoredValueNegative() && featureManager.isFeatureEnabled(Feature.STORED_VALUE_TOPUP))
        {
            SettleBalanceAlertDialog.createNewDialog().setAmountOwed(((StoredValueEvent)storedValueEvent.get()).getModel().getStoredValue().requiredTopUpAmount.amount).show(activity.getSupportFragmentManager());
            return;
        } else
        {
            onSuccess.run();
            return;
        }
    }

    private void verificationError(int i)
    {
        String s = activity.getString(i);
        AlertDialogFragment.newBuilder().setMessage(s).setCancelable(false).build().show(activity.getSupportFragmentManager(), "sendMoneyErrorDialog");
        WLog.e(TAG, s);
    }

    public final void activate()
    {
        eventBus.register(this);
    }

    public final void deactivate()
    {
        eventBus.unregisterAll(this);
    }

    public void onStoredValueEvent(StoredValueEvent storedvalueevent)
    {
        storedValueEvent = Optional.of(storedvalueevent);
        onEventsResult();
    }

    public final void setOnSuccessCallback(Runnable runnable)
    {
        onSuccess = runnable;
    }

}
