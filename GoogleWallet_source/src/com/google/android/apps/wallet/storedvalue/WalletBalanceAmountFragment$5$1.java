// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.storedvalue;

import android.view.View;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.EventHandler;
import com.google.android.apps.wallet.eventbus.HandlerRegistration;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;

// Referenced classes of package com.google.android.apps.wallet.storedvalue:
//            WalletBalanceAmountFragment

final class this._cls1
    implements EventHandler
{

    final handleEvent this$1;

    private void handleEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        eventBus.unregister(new HandlerRegistration[] {
            WalletBalanceAmountFragment.access$400(_fld0)
        });
        WalletBalanceAmountFragment.access$402(_fld0, null);
        WalletBalanceAmountFragment.access$500(_fld0, bankaccountsmodelevent);
    }

    public final volatile void handleEvent(Object obj)
    {
        handleEvent((BankAccountsModelEvent)obj);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/google/android/apps/wallet/storedvalue/WalletBalanceAmountFragment$5

/* anonymous class */
    final class WalletBalanceAmountFragment._cls5
        implements android.view.View.OnClickListener
    {

        final WalletBalanceAmountFragment this$0;

        public final void onClick(View view)
        {
            if (!networkAccessChecker.check())
            {
                return;
            } else
            {
                spinnerManager.show();
                WalletBalanceAmountFragment.access$402(WalletBalanceAmountFragment.this, eventBus.register(this, com/google/android/apps/wallet/bankaccount/api/BankAccountsModelEvent, new WalletBalanceAmountFragment._cls5._cls1()));
                return;
            }
        }

            
            {
                this$0 = WalletBalanceAmountFragment.this;
                super();
            }
    }

}
