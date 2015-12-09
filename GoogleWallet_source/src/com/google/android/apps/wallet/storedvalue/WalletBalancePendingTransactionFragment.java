// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.HandlerRegistration;
import com.google.android.apps.wallet.kyc.api.KycStatusPublisher;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordExpandedListView;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordListItemBinder;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.view.Views;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            TileFragment, WalletBalancePendingTransactionEvent

public class WalletBalancePendingTransactionFragment extends TileFragment
    implements com.google.android.swipedismiss.SwipeDismissTouchListener.DismissCallbacks
{

    EventBus eventBus;
    FeatureManager featureManager;
    private HandlerRegistration kycStatusEventRegistration;
    KycStatusPublisher kycStatusPublisher;
    PurchaseRecordListItemBinder listItemBinder;
    private WalletBalancePendingTransactionEvent pendingTransactionEvent;
    private PurchaseRecordExpandedListView purchaseRecordListView;

    public WalletBalancePendingTransactionFragment()
    {
    }

    private void displayPendingTransactions()
    {
        if (pendingTransactionEvent.getFailureCause() != null)
        {
            Toasts.show(getActivity(), com.google.android.apps.walletnfcrel.R.string.errormessage_fetch_transactions);
            return;
        } else
        {
            purchaseRecordListView.setPurchaseRecordListItemBinder(listItemBinder, featureManager.isFeatureEnabled(Feature.TRANSACTIONS_USE_WOBL));
            purchaseRecordListView.showPurchaseRecordsTransactions(pendingTransactionEvent.getPendingTransactions());
            return;
        }
    }

    private void onWalletBalancePendingTransactionEvent(WalletBalancePendingTransactionEvent walletbalancependingtransactionevent)
    {
        pendingTransactionEvent = walletbalancependingtransactionevent;
        displayPendingTransactions();
        notifyTileChanged();
    }

    private void registerKycStatusEvent()
    {
        kycStatusEventRegistration = eventBus.register(this, com/google/android/apps/wallet/kyc/api/KycStatusPublisher$KycStatusEvent, new EventHandler() {

            final WalletBalancePendingTransactionFragment this$0;

            private void handleEvent(com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycstatusevent)
            {
                if (kycstatusevent.getStatus() != null && kycstatusevent.getStatus().intValue() == 1)
                {
                    eventBus.unregister(new HandlerRegistration[] {
                        kycStatusEventRegistration
                    });
                    registerPendingTransactionEvent();
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent)obj);
            }

            
            {
                this$0 = WalletBalancePendingTransactionFragment.this;
                super();
            }
        });
    }

    private void registerPendingTransactionEvent()
    {
        eventBus.register(this, com/google/android/apps/wallet/storedvalue/WalletBalancePendingTransactionEvent, new EventHandler() {

            final WalletBalancePendingTransactionFragment this$0;

            private void handleEvent(WalletBalancePendingTransactionEvent walletbalancependingtransactionevent)
            {
                onWalletBalancePendingTransactionEvent(walletbalancependingtransactionevent);
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((WalletBalancePendingTransactionEvent)obj);
            }

            
            {
                this$0 = WalletBalancePendingTransactionFragment.this;
                super();
            }
        });
    }

    public final boolean canDismiss(Object obj)
    {
        return false;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(com.google.android.apps.walletnfcrel.R.layout.wallet_balance_pending_transactions_fragment, viewgroup, false);
        purchaseRecordListView = (PurchaseRecordExpandedListView)Views.findViewById(layoutinflater, com.google.android.apps.walletnfcrel.R.id.PurchaseRecordListView);
        return layoutinflater;
    }

    public final void onDismiss(View view, Object obj)
    {
    }

    public final void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    public final void onResume()
    {
        super.onResume();
        if (kycStatusPublisher.hasPassedKyc())
        {
            registerPendingTransactionEvent();
            return;
        } else
        {
            registerKycStatusEvent();
            return;
        }
    }

    public final boolean shouldShow()
    {
        return kycStatusPublisher.hasPassedKyc() && pendingTransactionEvent != null && pendingTransactionEvent.getFailureCause() == null && !pendingTransactionEvent.getPendingTransactions().isEmpty();
    }



}
