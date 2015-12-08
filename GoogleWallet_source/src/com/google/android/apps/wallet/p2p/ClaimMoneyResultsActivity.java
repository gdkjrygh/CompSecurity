// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.money.CurrencyUtil;
import com.google.android.apps.wallet.pin.api.PinApi;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecord;
import com.google.android.apps.wallet.purchaserecord.PurchaseRecordManager;
import com.google.android.apps.wallet.transfer.api.FundsTransferClient;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            SenderRowView, ClaimablePurchaseRecordEventPublisher

public class ClaimMoneyResultsActivity extends WalletActivity
{
    final class ClaimMoneyAction
        implements Callable
    {

        private final String instrumentId;
        final ClaimMoneyResultsActivity this$0;

        private ClaimResult call()
            throws Exception
        {
            Object obj = purchaseRecordManager.getClaimablePurchaseRecords();
            long l = 0L;
            for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext();)
            {
                l += ((PurchaseRecord)iterator.next()).getTotalAmountMicros();
            }

            Object obj1 = new com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersRequest();
            obj1.destinationInstrumentSubId = instrumentId;
            Object obj2 = new com.google.wallet.proto.api.NanoWalletFundsTransfer.UserChallenge();
            obj2.challenge = Integer.valueOf(2);
            obj1.userChallenge = (new com.google.wallet.proto.api.NanoWalletFundsTransfer.UserChallenge[] {
                obj2
            });
            obj1 = fundsTransferClient.acceptAllMoney(((com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersRequest) (obj1)));
            if (((com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersResponse) (obj1)).callError != null)
            {
                return new ClaimResult(null, null, null, ((com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersResponse) (obj1)).callError, ((com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersResponse) (obj1)).requestedChallenge);
            }
            expectedAvailability = ((com.google.wallet.proto.api.NanoWalletFundsTransfer.AcceptAllMoneyTransfersResponse) (obj1)).expectedAvailabilityDescription;
            claimablePurchaseRecordEventPublisher.invalidate();
            obj2 = purchaseRecordManager.getClaimablePurchaseRecords();
            long l1 = 0L;
            for (obj1 = ((List) (obj2)).iterator(); ((Iterator) (obj1)).hasNext();)
            {
                l1 += ((PurchaseRecord)((Iterator) (obj1)).next()).getTotalAmountMicros();
            }

            obj1 = Currency.getInstance(((PurchaseRecord)((List) (obj)).get(0)).getTotalAmountCurrencyCode());
            l -= l1;
            if (l <= 0L)
            {
                obj = null;
            } else
            {
                obj = CurrencyUtil.microsToDisplayableMoney(l, ((Currency) (obj1)));
            }
            if (l1 <= 0L)
            {
                obj1 = null;
            } else
            {
                obj1 = CurrencyUtil.microsToDisplayableMoney(l1, ((Currency) (obj1)));
            }
            return new ClaimResult(((String) (obj)), ((String) (obj1)), ((List) (obj2)), null, null);
        }

        public final volatile Object call()
            throws Exception
        {
            return call();
        }

        ClaimMoneyAction(String s)
        {
            this$0 = ClaimMoneyResultsActivity.this;
            super();
            instrumentId = s;
        }
    }

    static final class ClaimResult
    {

        private final String amountClaimed;
        private final String amountFailedToClaim;
        private final com.google.wallet.proto.NanoWalletError.CallError callError;
        private final List failedClaims;
        private final com.google.wallet.proto.api.NanoWalletFundsTransfer.UserChallenge requestedChallenge;






        ClaimResult(String s, String s1, List list, com.google.wallet.proto.NanoWalletError.CallError callerror, com.google.wallet.proto.api.NanoWalletFundsTransfer.UserChallenge userchallenge)
        {
            amountClaimed = s;
            amountFailedToClaim = s1;
            failedClaims = list;
            callError = callerror;
            requestedChallenge = userchallenge;
        }
    }


    private static final Uri GOOGLE_PLAY_URI = Uri.parse("https://play.google.com");
    private String amountClaimed;
    private String amountFailedToClaim;
    AnalyticsUtil analyticsUtil;
    ClaimablePurchaseRecordEventPublisher claimablePurchaseRecordEventPublisher;
    private FundingSource destinationInstrument;
    private String expectedAvailability;
    private List failedClaims;
    FullScreenProgressSpinnerManager fullScreenProgressSpinnerManager;
    FundsTransferClient fundsTransferClient;
    PurchaseRecordManager purchaseRecordManager;
    UriRegistry uriRegistry;

    public ClaimMoneyResultsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void claimMoney()
    {
        analyticsUtil.startTiming(null, "user_claim_money");
        String s;
        if (destinationInstrument == null)
        {
            s = "";
        } else
        {
            s = destinationInstrument.getCdpId();
        }
        executeAction("claim_money", new ClaimMoneyAction(s));
    }

    private void renderErrorResults()
    {
        if (failedClaims == null || failedClaims.isEmpty())
        {
            return;
        }
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.bad)));
        if (Strings.isNullOrEmpty(amountClaimed))
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.Header).setBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.bad));
            ((ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Icon)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_fail_white_circle_color_64dp);
            ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.Amount)).setText(amountFailedToClaim);
            ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.Headline)).setText(getString(com.google.android.apps.walletnfcrel.R.string.claim_money_error_headline));
            ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.Body)).setText(getString(com.google.android.apps.walletnfcrel.R.string.claim_money_error));
            return;
        }
        findViewById(com.google.android.apps.walletnfcrel.R.id.Headline).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.FailedClaimsContainer).setVisibility(0);
        LinkedHashSet linkedhashset = new LinkedHashSet();
        LinkedHashSet linkedhashset1 = new LinkedHashSet();
        PurchaseRecord purchaserecord;
        for (Iterator iterator = failedClaims.iterator(); iterator.hasNext(); linkedhashset1.add(purchaserecord.getCounterPartyEmail()))
        {
            purchaserecord = (PurchaseRecord)iterator.next();
            linkedhashset.add(purchaserecord.getSenderDisplayName(getString(com.google.android.apps.walletnfcrel.R.string.claim_money_empty_sender_name)));
        }

        ((SenderRowView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ErrorSendersContainer)).setSenders(Lists.newArrayList(linkedhashset1));
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.ErrorAmount)).setText(getString(com.google.android.apps.walletnfcrel.R.string.amount_failed_to_claim, new Object[] {
            amountFailedToClaim
        }));
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.Body)).setText(getString(com.google.android.apps.walletnfcrel.R.string.claim_money_error_senders, new Object[] {
            Joiner.on(", ").join(Lists.newArrayList(linkedhashset))
        }));
    }

    private void renderSuccessfulResults()
    {
        if (!Strings.isNullOrEmpty(amountClaimed))
        {
            ((ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Icon)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_check_circle_white_88dp);
            TextView textview = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.Amount);
            String s;
            if (failedClaims.isEmpty())
            {
                s = amountClaimed;
            } else
            {
                s = getString(com.google.android.apps.walletnfcrel.R.string.amount_claimed, new Object[] {
                    amountClaimed
                });
            }
            textview.setText(s);
            textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Headline);
            if (destinationInstrument == null)
            {
                s = getString(com.google.android.apps.walletnfcrel.R.string.claim_money_success_headline_my_wallet);
            } else
            {
                s = getString(com.google.android.apps.walletnfcrel.R.string.claim_money_success_headline_instrument, new Object[] {
                    amountClaimed, destinationInstrument.getNickname(this)
                });
            }
            textview.setText(s);
            textview = (TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.Body);
            if (destinationInstrument == null)
            {
                s = getString(com.google.android.apps.walletnfcrel.R.string.claim_money_future_payments_explanation);
            } else
            {
                s = expectedAvailability;
            }
            textview.setText(s);
            if (failedClaims.isEmpty() && destinationInstrument == null)
            {
                findViewById(com.google.android.apps.walletnfcrel.R.id.WalletBalancePromoSection).setVisibility(0);
                Views.setLinkOnClickListener((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.WalletCardPromoLink), new android.view.View.OnClickListener() {

                    final ClaimMoneyResultsActivity this$0;

                    public final void onClick(View view)
                    {
                        startActivity(uriRegistry.createIntent(6002, new Object[0]));
                    }

            
            {
                this$0 = ClaimMoneyResultsActivity.this;
                super();
            }
                });
                Views.setLinkOnClickListener((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.SendMoneyPromoLink), new android.view.View.OnClickListener() {

                    final ClaimMoneyResultsActivity this$0;

                    public final void onClick(View view)
                    {
                        startActivity(uriRegistry.createIntent(4000, new Object[0]));
                    }

            
            {
                this$0 = ClaimMoneyResultsActivity.this;
                super();
            }
                });
                Views.setLinkOnClickListener((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.PlayPromoLink), new android.view.View.OnClickListener() {

                    final ClaimMoneyResultsActivity this$0;

                    public final void onClick(View view)
                    {
                        startActivity(UriIntents.create(ClaimMoneyResultsActivity.this, ClaimMoneyResultsActivity.GOOGLE_PLAY_URI));
                    }

            
            {
                this$0 = ClaimMoneyResultsActivity.this;
                super();
            }
                });
                return;
            }
        }
    }

    protected final void doOnCreate(Bundle bundle)
    {
        Preconditions.checkArgument(getIntent().hasExtra("funding_source"));
        destinationInstrument = (FundingSource)getIntent().getParcelableExtra("funding_source");
        setTitle("");
        setContentView(com.google.android.apps.walletnfcrel.R.layout.claim_money_results_activity);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.toolbar).setElevation(0.0F);
        }
        findViewById(com.google.android.apps.walletnfcrel.R.id.DoneButton).setOnClickListener(new android.view.View.OnClickListener() {

            final ClaimMoneyResultsActivity this$0;

            public final void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = ClaimMoneyResultsActivity.this;
                super();
            }
        });
        if (bundle == null)
        {
            fullScreenProgressSpinnerManager.show();
            claimMoney();
        }
    }

    protected final void doOnResume()
    {
        if (amountClaimed != null || amountFailedToClaim != null)
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.Wrapper).setVisibility(0);
        }
        renderSuccessfulResults();
        renderErrorResults();
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (super.onActionFailure(s, callable, exception))
        {
            return true;
        } else
        {
            analyticsUtil.sendError("ClaimMoney", new AnalyticsCustomDimension[0]);
            Toasts.show(this, com.google.android.apps.walletnfcrel.R.string.claim_money_generic_error);
            finish();
            return true;
        }
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if (!"claim_money".equals(s))
        {
            return;
        }
        s = (ClaimResult)obj;
        if (((ClaimResult) (s)).callError != null && ((ClaimResult) (s)).callError.errorCode.intValue() == 2 && ((ClaimResult) (s)).requestedChallenge.challenge.intValue() == 2)
        {
            PinApi.startVerifyPinActivityForResult(this, 1);
            return;
        }
        if (((ClaimResult) (s)).callError != null)
        {
            analyticsUtil.sendError("ClaimMoney", new AnalyticsCustomDimension[0]);
            CallErrorDialogs.createBuilderWithGenericTitle(((ClaimResult) (s)).callError, com.google.android.apps.walletnfcrel.R.string.claim_money_generic_error).setFinishActivityOnClick().build().show(getSupportFragmentManager());
            return;
        }
        amountClaimed = ((ClaimResult) (s)).amountClaimed;
        amountFailedToClaim = ((ClaimResult) (s)).amountFailedToClaim;
        failedClaims = ((ClaimResult) (s)).failedClaims;
        findViewById(com.google.android.apps.walletnfcrel.R.id.Wrapper).setVisibility(0);
        renderSuccessfulResults();
        renderErrorResults();
        fullScreenProgressSpinnerManager.hide();
        analyticsUtil.endTiming(null, "user_claim_money");
        if (failedClaims.isEmpty())
        {
            analyticsUtil.sendSuccess("ClaimMoney", new AnalyticsCustomDimension[0]);
            return;
        } else
        {
            analyticsUtil.sendError("ClaimMoney", new AnalyticsCustomDimension[0]);
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            claimMoney();
        }
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        amountClaimed = bundle.getString("amount_claimed");
        amountFailedToClaim = bundle.getString("amount_failed_to_claim");
        expectedAvailability = bundle.getString("expected_availability");
        failedClaims = bundle.getParcelableArrayList("failed_claims");
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("amount_claimed", amountClaimed);
        bundle.putString("amount_failed_to_claim", amountFailedToClaim);
        bundle.putString("expected_availability", expectedAvailability);
        if (failedClaims != null)
        {
            bundle.putParcelableArrayList("failed_claims", Lists.newArrayList(failedClaims));
        }
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }



/*
    static String access$002(ClaimMoneyResultsActivity claimmoneyresultsactivity, String s)
    {
        claimmoneyresultsactivity.expectedAvailability = s;
        return s;
    }

*/

}
