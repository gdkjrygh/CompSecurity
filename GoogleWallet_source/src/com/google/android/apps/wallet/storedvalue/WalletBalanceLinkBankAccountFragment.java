// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.bankaccount.BankAccountTileForWalletBalanceScreen;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.HandlerRegistration;
import com.google.android.apps.wallet.kyc.api.KycStatusPublisher;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            TileFragment

public class WalletBalanceLinkBankAccountFragment extends TileFragment
{

    BankAccountTileForWalletBalanceScreen bankAccountTile;
    EventBus eventBus;
    private HandlerRegistration kycStatusEventRegistration;
    KycStatusPublisher kycStatusPublisher;

    public WalletBalanceLinkBankAccountFragment()
    {
    }

    private void registerBankAccountEvent()
    {
        eventBus.register(this, com/google/android/apps/wallet/bankaccount/api/BankAccountsModelEvent, new EventHandler() {

            final WalletBalanceLinkBankAccountFragment this$0;

            private void handleEvent(BankAccountsModelEvent bankaccountsmodelevent)
            {
                onBankAccountEvent(bankaccountsmodelevent);
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((BankAccountsModelEvent)obj);
            }

            
            {
                this$0 = WalletBalanceLinkBankAccountFragment.this;
                super();
            }
        });
    }

    private void registerKycStatusEvent()
    {
        kycStatusEventRegistration = eventBus.register(this, com/google/android/apps/wallet/kyc/api/KycStatusPublisher$KycStatusEvent, new EventHandler() {

            final WalletBalanceLinkBankAccountFragment this$0;

            private void handleEvent(com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycstatusevent)
            {
                if (kycstatusevent.getStatus() != null && kycstatusevent.getStatus().intValue() == 1)
                {
                    eventBus.unregister(new HandlerRegistration[] {
                        kycStatusEventRegistration
                    });
                    registerBankAccountEvent();
                }
            }

            public final volatile void handleEvent(Object obj)
            {
                handleEvent((com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent)obj);
            }

            
            {
                this$0 = WalletBalanceLinkBankAccountFragment.this;
                super();
            }
        });
    }

    final void onBankAccountEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        bankAccountTile.onBankAccountEvent(bankaccountsmodelevent);
        notifyTileChanged();
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = bankAccountTile.onCreateView(viewgroup);
        bankAccountTile.setView(layoutinflater);
        return layoutinflater;
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
            registerBankAccountEvent();
            return;
        } else
        {
            registerKycStatusEvent();
            return;
        }
    }

    public final boolean shouldShow()
    {
        return bankAccountTile.getView().getVisibility() == 0;
    }


}
