// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.bankaccount.api.BankAccount;
import com.google.android.apps.wallet.bankaccount.api.BankAccountApi;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModel;
import com.google.android.apps.wallet.bankaccount.api.BankAccountsModelEvent;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.funding.widgets.VerifyBankAccountDialogFragment;
import com.google.android.apps.wallet.kyc.api.KycApi;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.p2p.api.P2pApi;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.async.ActionExecutor;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SenderRowView, ClaimablePurchaseRecordEvent, GenericVerifyYourIdentityActivity

public class ClaimMoneyIntroActivity extends WalletActivity
{

    ActionExecutor actionExecutor;
    private String amountString;
    private List bankAccounts;
    EventBus eventBus;
    FeatureManager featureManager;
    FundsTransferClient fundsTransferClient;
    private boolean mayClaimToAnyAvailableInstrument;
    SenderRowView senderRowView;
    FullScreenProgressSpinnerManager spinnerManager;
    UriRegistry uriRegistry;

    public ClaimMoneyIntroActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        mayClaimToAnyAvailableInstrument = false;
    }

    private void onBankAccountsModelEvent(BankAccountsModelEvent bankaccountsmodelevent)
    {
        if (bankaccountsmodelevent.getModel() == null)
        {
            return;
        } else
        {
            bankAccounts = bankaccountsmodelevent.getModel().getBankAccounts();
            renderBankAccountTileOrRedirectIfReady();
            return;
        }
    }

    private void onKycStatusEvent(com.google.android.apps.wallet.kyc.api.KycStatusPublisher.KycStatusEvent kycstatusevent)
    {
        boolean flag = true;
        if (Objects.equal(kycstatusevent.getStatus(), Integer.valueOf(1)))
        {
            startActivity(P2pApi.createClaimMoneyResultsActivityIntent(this, null));
            finish();
        }
        final boolean kycFailedOrReferred = flag;
        if (!Objects.equal(kycstatusevent.getStatus(), Integer.valueOf(1)))
        {
            if (Objects.equal(kycstatusevent.getStatus(), Integer.valueOf(3)))
            {
                kycFailedOrReferred = flag;
            } else
            {
                kycFailedOrReferred = false;
            }
        }
        findViewById(com.google.android.apps.walletnfcrel.R.id.ClaimToWalletBalanceTile).setOnClickListener(new android.view.View.OnClickListener() {

            final ClaimMoneyIntroActivity this$0;
            final boolean val$kycFailedOrReferred;

            public final void onClick(View view)
            {
                if (kycFailedOrReferred)
                {
                    view = KycApi.createManualKycActivityIntentToClaimMoney(ClaimMoneyIntroActivity.this);
                } else
                {
                    view = InternalIntents.forClass(ClaimMoneyIntroActivity.this, com/google/android/apps/wallet/p2p/GenericVerifyYourIdentityActivity);
                }
                view.putExtra("KYC_CLAIM_CONTEXT", true);
                startActivityForResult(view, 1);
            }

            
            {
                this$0 = ClaimMoneyIntroActivity.this;
                kycFailedOrReferred = flag;
                super();
            }
        });
    }

    private void quit(int i)
    {
        Toasts.show(this, i);
        finish();
    }

    private void renderBankAccountTileOrRedirectIfReady()
    {
        View view = findViewById(com.google.android.apps.walletnfcrel.R.id.HorizontalDivider);
        View view1 = findViewById(com.google.android.apps.walletnfcrel.R.id.ClaimToBankAccountTile);
        if (bankAccounts == null || !mayClaimToAnyAvailableInstrument)
        {
            view.setVisibility(8);
            view1.setVisibility(8);
            return;
        }
        final BankAccount bankAccount;
        if (!bankAccounts.isEmpty())
        {
            bankAccount = (BankAccount)bankAccounts.get(0);
            if (bankAccount.getStatus() == com.google.android.apps.wallet.bankaccount.api.BankAccount.Status.VALID && amountString != null)
            {
                startActivity(P2pApi.createReviewClaimMoneyActivityIntent(this, new FundingSource(bankAccount), amountString));
                finish();
                return;
            }
            bankAccount = new android.view.View.OnClickListener() {

                final ClaimMoneyIntroActivity this$0;
                final BankAccount val$bankAccount;

                public final void onClick(View view2)
                {
                    view2 = new VerifyBankAccountDialogFragment();
                    view2.setBankAccount(bankAccount);
                    view2.show(getSupportFragmentManager());
                }

            
            {
                this$0 = ClaimMoneyIntroActivity.this;
                bankAccount = bankaccount;
                super();
            }
            };
        } else
        {
            bankAccount = new android.view.View.OnClickListener() {

                final ClaimMoneyIntroActivity this$0;

                public final void onClick(View view2)
                {
                    startActivityForResult(BankAccountApi.createAddBankAccountActivityIntent(ClaimMoneyIntroActivity.this), 2);
                }

            
            {
                this$0 = ClaimMoneyIntroActivity.this;
                super();
            }
            };
        }
        view.setVisibility(0);
        view1.setVisibility(0);
        view1.setOnClickListener(bankAccount);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.claim_money_intro_activity);
        setTitle("");
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.toolbar).setElevation(0.0F);
        }
        senderRowView = (SenderRowView)findViewById(com.google.android.apps.walletnfcrel.R.id.SendersContainer);
        if (bundle == null && featureManager.isFeatureEnabled(Feature.CLAIM_TO_BANK_ACCOUNT))
        {
            spinnerManager.show();
            actionExecutor.executeAction(new Callable() {

                final ClaimMoneyIntroActivity this$0;

                private Boolean call()
                {
                    boolean flag;
                    try
                    {
                        flag = Objects.equal(fundsTransferClient.getAcceptanceOptions(new com.google.wallet.proto.api.NanoWalletFundsTransfer.GetAcceptanceOptionsRequest()).acceptanceOptions, Integer.valueOf(2));
                    }
                    catch (RpcException rpcexception)
                    {
                        return Boolean.valueOf(false);
                    }
                    return Boolean.valueOf(flag);
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = ClaimMoneyIntroActivity.this;
                super();
            }
            }, new AsyncCallback() {

                final ClaimMoneyIntroActivity this$0;

                private void onSuccess(Boolean boolean1)
                {
                    mayClaimToAnyAvailableInstrument = boolean1.booleanValue();
                    spinnerManager.hide();
                    renderBankAccountTileOrRedirectIfReady();
                }

                public final void onFailure(Exception exception)
                {
                    spinnerManager.hide();
                    mayClaimToAnyAvailableInstrument = false;
                    renderBankAccountTileOrRedirectIfReady();
                }

                public final volatile void onSuccess(Object obj)
                {
                    onSuccess((Boolean)obj);
                }

            
            {
                this$0 = ClaimMoneyIntroActivity.this;
                super();
            }
            });
        }
    }

    public final void doOnResume()
    {
        eventBus.register(this);
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            startActivity(P2pApi.createClaimMoneyResultsActivityIntent(this, null));
            finish();
        } else
        if (i == 2 && j == -1)
        {
            intent = (FundingSource)intent.getParcelableExtra("funding_source");
            if (intent.getBankAccount().isValid())
            {
                startActivity(P2pApi.createReviewClaimMoneyActivityIntent(this, intent, amountString));
                finish();
                return;
            }
        }
    }

    public void onClaimablePurchaseRecordEvent(ClaimablePurchaseRecordEvent claimablepurchaserecordevent)
    {
        if (claimablepurchaserecordevent.getFailureCause() != null)
        {
            quit(com.google.android.apps.walletnfcrel.R.string.claim_money_generic_error);
            return;
        }
        claimablepurchaserecordevent = claimablepurchaserecordevent.getPurchaseRecords();
        if (claimablepurchaserecordevent.isEmpty())
        {
            quit(com.google.android.apps.walletnfcrel.R.string.claim_money_generic_error);
            return;
        }
        long l = 0L;
        Object obj = new LinkedHashSet();
        LinkedHashSet linkedhashset = new LinkedHashSet();
        PurchaseRecord purchaserecord;
        for (Iterator iterator = claimablepurchaserecordevent.iterator(); iterator.hasNext(); linkedhashset.add(purchaserecord.getCounterPartyEmail()))
        {
            purchaserecord = (PurchaseRecord)iterator.next();
            l += purchaserecord.getTotalAmountMicros();
            ((LinkedHashSet) (obj)).add(purchaserecord.getSenderDisplayName(getString(com.google.android.apps.walletnfcrel.R.string.claim_money_empty_sender_name)));
        }

        senderRowView.setSenders(Lists.newArrayList(linkedhashset));
        obj = getString(com.google.android.apps.walletnfcrel.R.string.claim_money_from, new Object[] {
            Joiner.on(", ").join(Lists.newArrayList(((Iterable) (obj))))
        });
        amountString = CurrencyUtil.microsToDisplayableMoney(l, Currency.getInstance(((PurchaseRecord)claimablepurchaserecordevent.get(0)).getTotalAmountCurrencyCode()));
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.ClaimMoneyHeadline)).setText(amountString);
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.SendersParagraph)).setText(((CharSequence) (obj)));
        obj = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Memo);
        if (claimablepurchaserecordevent.size() == 1)
        {
            ((TextView) (obj)).setVisibility(0);
            ((TextView) (obj)).setText(((PurchaseRecord)claimablepurchaserecordevent.get(0)).getMemo());
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        renderBankAccountTileOrRedirectIfReady();
    }

    protected void onPause()
    {
        eventBus.unregisterAll(this);
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        mayClaimToAnyAvailableInstrument = bundle.getBoolean("may_claim_to_any_available_instrument", false);
        amountString = bundle.getString("amount_string");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("may_claim_to_any_available_instrument", mayClaimToAnyAvailableInstrument);
        bundle.putString("amount_string", amountString);
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }


/*
    static boolean access$002(ClaimMoneyIntroActivity claimmoneyintroactivity, boolean flag)
    {
        claimmoneyintroactivity.mayClaimToAnyAvailableInstrument = flag;
        return flag;
    }

*/

}
