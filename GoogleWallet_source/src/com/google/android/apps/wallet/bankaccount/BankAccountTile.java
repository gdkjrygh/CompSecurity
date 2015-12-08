// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.collect.ImmutableList;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            Amounts

public class BankAccountTile extends Tile
{

    private TextView body;
    private final EventBus eventBus;
    private TextView headline;
    protected final NetworkAccessChecker networkAccessChecker;

    public BankAccountTile(Activity activity, EventBus eventbus, NetworkAccessChecker networkaccesschecker)
    {
        super(activity);
        eventBus = eventbus;
        networkAccessChecker = networkaccesschecker;
    }

    public final boolean canDismiss(Object obj)
    {
        return false;
    }

    public final String getAnchor()
    {
        return "bankaccount";
    }

    public final TextView getBody()
    {
        return body;
    }

    public final TextView getHeadline()
    {
        return headline;
    }

    protected final void onActivate()
    {
        super.onActivate();
        eventBus.register(this);
    }

    public void onBankAccountEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        if (!bankaccountsmodelevent.isFeatureEnabled() || bankaccountsmodelevent.getModel() == null || bankaccountsmodelevent.getModel().getBankAccounts() == null)
        {
            getView().setVisibility(8);
            return;
        }
        if (bankaccountsmodelevent.getModel().getBankAccounts().isEmpty())
        {
            renderForEmptyBankAccountList();
            return;
        } else
        {
            renderForBankAccount((BankAccount)bankaccountsmodelevent.getModel().getBankAccounts().get(0));
            return;
        }
    }

    public final View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.tile_card, viewgroup, false);
        setView(viewgroup);
        ((ImageView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Icon)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_wb_add_money_color_40dp);
        headline = (TextView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Headline);
        body = (TextView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Body);
        viewgroup.setVisibility(8);
        return viewgroup;
    }

    protected final void onDeactivate()
    {
        super.onDeactivate();
        eventBus.unregisterAll(this);
    }

    protected void renderForBankAccount(final BankAccount bankAccount)
    {
        static final class _cls3
        {

            static final int $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status = new int[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.AWAITING_CHALLENGE_DEPOSIT_VERIFICATION.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$bankaccount$api$BankAccount$Status[com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.YODLEE_FAILED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3..SwitchMap.com.google.android.apps.wallet.bankaccount.api.BankAccount.Status[bankAccount.getStatus().ordinal()])
        {
        default:
            getView().setVisibility(8);
            return;

        case 1: // '\001'
            headline.setText(com.google.android.apps.walletnfcrel.R.string.link_bank_account_tile_complete_linking_title);
            headline.setTextAppearance(context, com.google.android.apps.walletnfcrel.R.style.ListItemPrimaryText);
            String s = context.getString(com.google.android.apps.walletnfcrel.R.string.link_bank_account_tile_use_deposit, new Object[] {
                Amounts.MAX_DEPOSIT_AMOUNT
            });
            getBody().setText(s);
            getView().setOnClickListener(new android.view.View.OnClickListener() {

                final BankAccountTile this$0;
                final BankAccount val$bankAccount;

                public final void onClick(View view)
                {
                    if (!networkAccessChecker.check())
                    {
                        return;
                    } else
                    {
                        
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = BankAccountTile.this;
                bankAccount = bankaccount;
                super();
            }
            });
            getView().setVisibility(0);
            return;

        case 2: // '\002'
            headline.setText(com.google.android.apps.walletnfcrel.R.string.link_bank_account_tile_iav_failure_title);
            break;
        }
        headline.setTextAppearance(context, com.google.android.apps.walletnfcrel.R.style.ListItemPrimaryText_Error);
        getBody().setText(com.google.android.apps.walletnfcrel.R.string.link_bank_account_tile_iav_failure_message);
        getView().setOnClickListener(new android.view.View.OnClickListener() {

            final BankAccountTile this$0;
            final BankAccount val$bankAccount;

            public final void onClick(View view)
            {
                if (!networkAccessChecker.check())
                {
                    return;
                } else
                {
                    
// JavaClassFileOutputException: get_constant: invalid tag

            
            {
                this$0 = BankAccountTile.this;
                bankAccount = bankaccount;
                super();
            }
        });
        getView().setVisibility(0);
    }

    protected void renderForEmptyBankAccountList()
    {
        getView().setVisibility(8);
    }

    public final boolean shouldShow()
    {
        return true;
    }




}
