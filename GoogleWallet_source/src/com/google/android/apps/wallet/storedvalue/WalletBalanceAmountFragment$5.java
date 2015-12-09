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

final class this._cls0
    implements android.view.WalletBalanceAmountFragment._cls5
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
            WalletBalanceAmountFragment.access$402(WalletBalanceAmountFragment.this, eventBus.register(this, com/google/android/apps/wallet/bankaccount/api/BankAccountsModelEvent, new EventHandler() {

                final WalletBalanceAmountFragment._cls5 this$1;

                private void handleEvent(BankAccountsModelEvent bankaccountsmodelevent)
                {
                    eventBus.unregister(new HandlerRegistration[] {
                        WalletBalanceAmountFragment.access$400(this$0)
                    });
                    WalletBalanceAmountFragment.access$402(this$0, null);
                    WalletBalanceAmountFragment.access$500(this$0, bankaccountsmodelevent);
                }

                public final volatile void handleEvent(Object obj)
                {
                    handleEvent((BankAccountsModelEvent)obj);
                }

            
            {
                this$1 = WalletBalanceAmountFragment._cls5.this;
                super();
            }
            }));
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = WalletBalanceAmountFragment.this;
        super();
    }
}
