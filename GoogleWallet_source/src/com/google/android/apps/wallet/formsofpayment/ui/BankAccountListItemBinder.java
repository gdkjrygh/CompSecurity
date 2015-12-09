// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.formsofpayment.ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.base.view.ViewHolder;
import com.google.android.apps.wallet.funding.api.BankAccountItemHelper;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.paymentcard.widgets.FundingSourceView;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.list.ListItemBinder;

public class BankAccountListItemBinder
    implements ListItemBinder
{

    private final Context context;

    public BankAccountListItemBinder(Activity activity)
    {
        context = activity;
    }

    private void bind(int i, ViewHolder viewholder, BankAccount bankaccount)
    {
        viewholder = viewholder.getView();
        com.google.android.apps.wallet.funding.api.BankAccountItemHelper.AccountItem accountitem = BankAccountItemHelper.createAccountItem(bankaccount, context);
        ((TextView)viewholder.findViewById(com.google.android.apps.walletnfcrel.R.id.PaymentCardName)).setText(accountitem.getMainText());
        Views.setTextOrHide((TextView)viewholder.findViewById(com.google.android.apps.walletnfcrel.R.id.MessageText), accountitem.getSubText());
        FundingSourceView fundingsourceview = (FundingSourceView)Views.findViewById(viewholder, com.google.android.apps.walletnfcrel.R.id.Card);
        if (bankaccount != null)
        {
            fundingsourceview.setFundingSource(new FundingSource(bankaccount));
        } else
        {
            fundingsourceview.setFundingSource(new FundingSource(new BankAccount(null)));
        }
        viewholder.setTag(com.google.android.apps.walletnfcrel.R.id.FormsOfPaymentIntentTagKey, accountitem.getIntentWhenClicked());
    }

    private static boolean isEnabled(BankAccount bankaccount)
    {
        return true;
    }

    public final volatile void bind(int i, ViewHolder viewholder, Object obj)
    {
        bind(i, viewholder, (BankAccount)obj);
    }

    public final ViewHolder createDisplay()
    {
        return new ViewHolder() {

            final BankAccountListItemBinder this$0;
            final View val$view;

            public final View getView()
            {
                return view;
            }

            
            {
                this$0 = BankAccountListItemBinder.this;
                view = view1;
                super();
            }
        };
    }

    public final volatile boolean isEnabled(Object obj)
    {
        return isEnabled((BankAccount)obj);
    }
}
