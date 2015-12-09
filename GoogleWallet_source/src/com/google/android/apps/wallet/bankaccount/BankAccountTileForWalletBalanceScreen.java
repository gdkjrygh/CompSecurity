// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            BankAccountTile

public class BankAccountTileForWalletBalanceScreen extends BankAccountTile
{

    public BankAccountTileForWalletBalanceScreen(Activity activity, EventBus eventbus, NetworkAccessChecker networkaccesschecker)
    {
        super(activity, eventbus, networkaccesschecker);
    }

    public void onBankAccountEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        super.onBankAccountEvent(bankaccountsmodelevent);
    }

    protected final void renderForBankAccount(final BankAccount bankAccount)
    {
        if (bankAccount.getStatus() == com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.AWAITING_YODLEE_VERIFICATION)
        {
            getHeadline().setText(com.google.android.apps.walletnfcrel.R.string.link_bank_account_tile_iav_status_title);
            getHeadline().setTextAppearance(context, com.google.android.apps.walletnfcrel.R.style.ListItemPrimaryText);
            getBody().setText(context.getString(com.google.android.apps.walletnfcrel.R.string.link_bank_account_tile_iav_status_message, new Object[] {
                bankAccount.getNickname(context)
            }));
            getView().setOnClickListener(new android.view.View.OnClickListener() {

                final BankAccountTileForWalletBalanceScreen this$0;
                final BankAccount val$bankAccount;

                public final void onClick(View view)
                {
                    if (!networkAccessChecker.check())
                    {
                        return;
                    } else
                    {
                        BankAccountTileForWalletBalanceScreen.this.bankAccount.startActivity(BankAccountApi.createVerifyWithIavActivityIntent(BankAccountTileForWalletBalanceScreen.this.bankAccount, bankAccount));
                        return;
                    }
                }

            
            {
                this$0 = BankAccountTileForWalletBalanceScreen.this;
                bankAccount = bankaccount;
                super();
            }
            });
            getView().setVisibility(0);
            return;
        } else
        {
            super.renderForBankAccount(bankAccount);
            return;
        }
    }

    protected final void renderForEmptyBankAccountList()
    {
        getHeadline().setText(com.google.android.apps.walletnfcrel.R.string.link_bank_account_tile_add_account_title);
        getHeadline().setTextAppearance(context, com.google.android.apps.walletnfcrel.R.style.ListItemPrimaryText);
        getBody().setText(com.google.android.apps.walletnfcrel.R.string.link_bank_account_tile_add_account_message);
        getView().setOnClickListener(new android.view.View.OnClickListener() {

            final BankAccountTileForWalletBalanceScreen this$0;

            public final void onClick(View view)
            {
                if (!networkAccessChecker.check())
                {
                    return;
                } else
                {
                    
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = BankAccountTileForWalletBalanceScreen.this;
                super();
            }
        });
        getView().setVisibility(0);
    }




}
