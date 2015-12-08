// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.util.view.Views;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountActivity, Amounts, RemoveBankAccountHelper

public class VerifyWithDepositActivity extends RemoveBankAccountActivity
{

    public VerifyWithDepositActivity()
    {
    }

    public VerifyWithDepositActivity(int i)
    {
        super(i);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.verify_with_deposit);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.verify_with_deposit_activity);
        bundle = getString(com.google.android.apps.walletnfcrel.R.string.verify_with_deposit_check_bank_acount_for_deposit_message, new Object[] {
            Amounts.MAX_DEPOSIT_AMOUNT
        });
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.VerifyDepositMessage)).setText(bundle);
        ((Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.VerifyWithDepositContinueButton)).setOnClickListener(new android.view.View.OnClickListener() {

            final VerifyWithDepositActivity this$0;

            public final void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = VerifyWithDepositActivity.this;
                super();
            }
        });
        bundle = getIntent();
        if (!bundle.hasExtra("bank_account"))
        {
            throw new IllegalArgumentException("VerifyWithDepositActivity.doOnCreate() missing extras");
        } else
        {
            bundle = (BankAccount)bundle.getParcelableExtra("bank_account");
            removeBankAccountHelper.initMenu(bundle);
            return;
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        RemoveBankAccountHelper removebankaccounthelper = removeBankAccountHelper;
        boolean flag = RemoveBankAccountHelper.createOptionsMenu(menu);
        return super.onCreateOptionsMenu(menu) || flag;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return removeBankAccountHelper.handleOptionsMenuItemSelection(this, menuitem) || super.onOptionsItemSelected(menuitem);
    }

    protected final void onUpPressed()
    {
        finish();
    }
}
