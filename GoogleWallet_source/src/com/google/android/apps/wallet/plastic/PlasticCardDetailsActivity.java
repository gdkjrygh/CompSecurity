// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.pin.api.PinApi;
import com.google.android.apps.wallet.plastic.api.PlasticCard;
import com.google.android.apps.wallet.plastic.api.PlasticCardCashWithdrawalDetails;
import com.google.android.apps.wallet.plastic.api.PlasticCardModel;
import com.google.android.apps.wallet.plastic.api.PlasticCardModelEvent;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.accessibility.AccessibilityUtil;
import com.google.android.apps.wallet.util.date.DateAndTimeHelper;
import com.google.android.apps.wallet.util.dialer.SafeDialer;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            LockPlasticCardAction, UnlockPlasticCardAction, PlasticCardModelPublisher, CancelPlasticCardActivity

public class PlasticCardDetailsActivity extends WalletActivity
{

    AccessibilityUtil accessibilityUtil;
    String accountName;
    private View alertSection;
    AnalyticsUtil analyticsUtil;
    AppControl appControl;
    private PlasticCard card;
    DateAndTimeHelper dateAndTimeHelper;
    EventBus eventBus;
    FeatureManager featureManager;
    private Button lockPlasticCardToggleButton;
    private TextView messageBelowHeaderImage;
    PlasticCardModelPublisher plasticCardModelPublisher;
    SafeDialer safeDialer;
    FullScreenProgressSpinnerManager spinnerManager;
    UriRegistry uriRegistry;
    private PlasticCardCashWithdrawalDetails withdrawalDetails;

    public PlasticCardDetailsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private void setBackgroundColor(int i)
    {
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(i));
        findViewById(com.google.android.apps.walletnfcrel.R.id.HeaderImageSection).setBackgroundColor(i);
    }

    private void setCancelCardButton()
    {
        if (!featureManager.isFeatureEnabled(Feature.WALLET_CARD_CANCEL))
        {
            return;
        } else
        {
            Button button = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CancelPlasticCardButton);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final PlasticCardDetailsActivity this$0;

                public final void onClick(View view)
                {
                    view = InternalIntents.forClass(PlasticCardDetailsActivity.this, com/google/android/apps/wallet/plastic/CancelPlasticCardActivity);
                    view.putExtra("proxy_card_sub_id", card.getProxyCardId().subId);
                    startActivity(view);
                }

            
            {
                this$0 = PlasticCardDetailsActivity.this;
                super();
            }
            });
            button.setVisibility(0);
            return;
        }
    }

    private void updateView()
    {
        findViewById(com.google.android.apps.walletnfcrel.R.id.ArrivalPrompts).setVisibility(8);
        alertSection.setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.ShippingAddressSection).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.CashWithdrawalSection).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.LockedSection).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.ActionButton).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.CancelPlasticCardButton).setVisibility(8);
        messageBelowHeaderImage.setText("");
        lockPlasticCardToggleButton.setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.AboutLock).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.ActivatePlasticCardButton).setVisibility(8);
        TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Heading);
        textview.setVisibility(0);
        Object obj;
        if (card != null && card.hasTrailingDigits())
        {
            obj = getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_headline, new Object[] {
                card.getTrailingDigits()
            });
        } else
        {
            obj = getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_headline_no_digits);
        }
        textview.setText(((CharSequence) (obj)));
        accessibilityUtil.announce(textview, textview.getText());
        obj = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Body);
        ((TextView) (obj)).setVisibility(0);
        ((TextView) (obj)).setText(accountName);
        Views.setLinkOnClickListener((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.PhoneSupportLink), new android.view.View.OnClickListener() {

            final PlasticCardDetailsActivity this$0;

            public final void onClick(View view)
            {
                analyticsUtil.sendLinkTap("CallCustomerSupport", new AnalyticsCustomDimension[0]);
                safeDialer.safeDial(HelpUrls.createTelephoneHelpUrl());
            }

            
            {
                this$0 = PlasticCardDetailsActivity.this;
                super();
            }
        });
        if (card == null)
        {
            updateViewForError();
            return;
        }
        static final class _cls9
        {

            static final int $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[];

            static 
            {
                $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status = new int[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.values().length];
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.REQUESTED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.ACTIVATED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.LOCKED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.CANCELED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$android$apps$wallet$plastic$api$PlasticCard$Status[com.google.android.apps.wallet.plastic.api.PlasticCard.Status.SUSPENDED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls9..SwitchMap.com.google.android.apps.wallet.plastic.api.PlasticCard.Status[card.getStatus().ordinal()])
        {
        default:
            updateViewForError();
            return;

        case 1: // '\001'
            updateViewForRequestedCard();
            return;

        case 2: // '\002'
            updateViewForActivatedCard();
            return;

        case 3: // '\003'
            updateViewForLockedCard();
            return;

        case 4: // '\004'
            updateViewForCanceledCard();
            return;

        case 5: // '\005'
            updateViewForSuspendedCard();
            break;
        }
    }

    private void updateViewForActivatedCard()
    {
        setBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.primary));
        ((ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.HeaderImage)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_wcard_active);
        if (withdrawalDetails.hasCashWithdrawalLimit() && withdrawalDetails.hasAtmFeeDescription())
        {
            Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CashWithdrawalSection).setVisibility(0);
            ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CashWithdrawalLimitText)).setText(getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_withdrawal_headline, new Object[] {
                withdrawalDetails.getCashWithdrawalLimit()
            }));
            ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CashWithdrawalFeeInfoText)).setText(withdrawalDetails.getAtmFeeDescription());
        }
        setCancelCardButton();
        if (featureManager.isFeatureEnabled(Feature.WALLET_CARD_LOCK))
        {
            lockPlasticCardToggleButton.setVisibility(0);
            lockPlasticCardToggleButton.setText(com.google.android.apps.walletnfcrel.R.string.wallet_card_lock_button);
            lockPlasticCardToggleButton.setOnClickListener(new android.view.View.OnClickListener() {

                final PlasticCardDetailsActivity this$0;

                public final void onClick(View view)
                {
                    analyticsUtil.sendButtonTap("LockWalletCard", new AnalyticsCustomDimension[0]);
                    PinApi.startVerifyPinActivityForResultAllowBack(PlasticCardDetailsActivity.this, 1);
                }

            
            {
                this$0 = PlasticCardDetailsActivity.this;
                super();
            }
            });
            TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AboutLock);
            textview.setVisibility(0);
            Views.setLinkOnClickListener(textview, new android.view.View.OnClickListener() {

                final PlasticCardDetailsActivity this$0;

                public final void onClick(View view)
                {
                    AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.wallet_card_why_lock_title).setMessage(com.google.android.apps.walletnfcrel.R.string.wallet_card_why_lock_body).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok_got_it).build().show(getSupportFragmentManager(), null);
                }

            
            {
                this$0 = PlasticCardDetailsActivity.this;
                super();
            }
            });
        }
    }

    private void updateViewForCanceledCard()
    {
        setBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.bad));
        ((ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.HeaderImage)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_wcard_canceled);
        alertSection.setVisibility(0);
        ((TextView)findViewById(com.google.android.apps.walletnfcrel.R.id.AlertHeader)).setText(getString(com.google.android.apps.walletnfcrel.R.string.canceled_plastic_card_headline));
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AlertBody)).setText(getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_details_canceled_text, new Object[] {
            appControl.getString(AppControlKey.CARD_BLOCKED_PHONE_NUMBER)
        }));
        if (card.hasCancellationTimeMillis())
        {
            messageBelowHeaderImage.setText(getString(com.google.android.apps.walletnfcrel.R.string.canceled_plastic_card_date, new Object[] {
                dateAndTimeHelper.formatDate(card.getCancellationTimeMillis(), true)
            }));
        }
        View view = findViewById(com.google.android.apps.walletnfcrel.R.id.ActionButton);
        view.setVisibility(0);
        view.setOnClickListener(new android.view.View.OnClickListener() {

            final PlasticCardDetailsActivity this$0;

            public final void onClick(View view1)
            {
                startActivity(uriRegistry.createIntent(6000, new Object[0]));
            }

            
            {
                this$0 = PlasticCardDetailsActivity.this;
                super();
            }
        });
    }

    private void updateViewForError()
    {
        setBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.bad));
        ((ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.HeaderImage)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_wcard_suspended);
        findViewById(com.google.android.apps.walletnfcrel.R.id.Heading).setVisibility(8);
        findViewById(com.google.android.apps.walletnfcrel.R.id.Body).setVisibility(8);
        alertSection.setVisibility(0);
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AlertHeader)).setText(com.google.android.apps.walletnfcrel.R.string.wallet_card_details_error);
    }

    private void updateViewForLockedCard()
    {
        setBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.google_yellow));
        ((ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.HeaderImage)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_wcard_locked);
        findViewById(com.google.android.apps.walletnfcrel.R.id.LockedSection).setVisibility(0);
        setCancelCardButton();
        Long long1 = card.getLockTimestamp();
        if (long1 != null)
        {
            messageBelowHeaderImage.setText(getString(com.google.android.apps.walletnfcrel.R.string.locked_plastic_card_body, new Object[] {
                dateAndTimeHelper.formatDate(long1.longValue(), true)
            }));
        }
        lockPlasticCardToggleButton.setVisibility(0);
        lockPlasticCardToggleButton.setText(com.google.android.apps.walletnfcrel.R.string.wallet_card_unlock_button);
        lockPlasticCardToggleButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PlasticCardDetailsActivity this$0;

            public final void onClick(View view)
            {
                analyticsUtil.sendButtonTap("UnlockWalletCard", new AnalyticsCustomDimension[0]);
                PinApi.startVerifyPinActivityForResult(PlasticCardDetailsActivity.this, 2);
            }

            
            {
                this$0 = PlasticCardDetailsActivity.this;
                super();
            }
        });
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.LockedBody)).setText(getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_details_locked_text));
    }

    private void updateViewForRequestedCard()
    {
        setBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.medium));
        ((ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.HeaderImage)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_large_envelope_card);
        findViewById(com.google.android.apps.walletnfcrel.R.id.ArrivalPrompts).setVisibility(0);
        TextView textview = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Heading);
        textview.setVisibility(0);
        Object obj;
        if (card.hasShippingTimeMillis())
        {
            obj = getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_headline_sent, new Object[] {
                dateAndTimeHelper.formatDate(card.getShippingTimeMillis(), false)
            });
        } else
        {
            obj = getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_headline_ordered);
        }
        textview.setText(((CharSequence) (obj)));
        accessibilityUtil.announce(textview, textview.getText());
        obj = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Body);
        if (card.hasShippingTimeMillis() && card.hasEstimatedDeliveryDays())
        {
            ((TextView) (obj)).setText(getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_body_with_estimated_dates, new Object[] {
                dateAndTimeHelper.formatIncrementedDate(card.getShippingTimeMillis(), card.getMinEstimatedDeliveryDays()), dateAndTimeHelper.formatIncrementedDate(card.getShippingTimeMillis(), card.getMaxEstimatedDeliveryDays())
            }));
        } else
        if (card.hasEstimatedDeliveryDays())
        {
            ((TextView) (obj)).setText(getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_body_with_estimated_num_days, new Object[] {
                Integer.valueOf(card.getMinEstimatedDeliveryDays()), Integer.valueOf(card.getMaxEstimatedDeliveryDays())
            }));
        } else
        {
            ((TextView) (obj)).setText(getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_body_no_eta));
        }
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.NeverArrivedLink)).setText(getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_details_never_arrived_link, new Object[] {
            appControl.getString(AppControlKey.CARD_BLOCKED_PHONE_NUMBER)
        }));
        if (card.hasShippingAddress())
        {
            obj = card.getShippingAddress();
            Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ShippingAddressSection).setVisibility(0);
            Views.setTextOrHide((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AddressLine1), ((com.google.wallet.proto.NanoWalletEntities.Address) (obj)).line1);
            Views.setTextOrHide((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AddressLine2), ((com.google.wallet.proto.NanoWalletEntities.Address) (obj)).line2);
            TextView textview1 = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AddressLine3);
            if (!TextUtils.isEmpty(((com.google.wallet.proto.NanoWalletEntities.Address) (obj)).city) || !TextUtils.isEmpty(((com.google.wallet.proto.NanoWalletEntities.Address) (obj)).state) || !TextUtils.isEmpty(((com.google.wallet.proto.NanoWalletEntities.Address) (obj)).postalCode))
            {
                textview1.setVisibility(0);
                textview1.setText(getString(com.google.android.apps.walletnfcrel.R.string.address_line3, new Object[] {
                    ((com.google.wallet.proto.NanoWalletEntities.Address) (obj)).city, ((com.google.wallet.proto.NanoWalletEntities.Address) (obj)).state, ((com.google.wallet.proto.NanoWalletEntities.Address) (obj)).postalCode
                }));
            } else
            {
                textview1.setVisibility(8);
            }
            Views.setLinkOnClickListener((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.WrongAddressLink), new android.view.View.OnClickListener() {

                final PlasticCardDetailsActivity this$0;

                public final void onClick(View view)
                {
                    startActivity(UriIntents.create(PlasticCardDetailsActivity.this, HelpUrls.createWalletCardWrongAddressHelpUrl()));
                }

            
            {
                this$0 = PlasticCardDetailsActivity.this;
                super();
            }
            });
        }
        obj = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ActivatePlasticCardButton);
        ((TextView) (obj)).setVisibility(0);
        ((TextView) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final PlasticCardDetailsActivity this$0;

            public final void onClick(View view)
            {
                startActivity(uriRegistry.createIntent(6001, new Object[0]));
            }

            
            {
                this$0 = PlasticCardDetailsActivity.this;
                super();
            }
        });
        setCancelCardButton();
    }

    private void updateViewForSuspendedCard()
    {
        setBackgroundColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.bad));
        ((ImageView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.HeaderImage)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_wcard_suspended);
        alertSection.setVisibility(0);
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AlertHeader)).setText(com.google.android.apps.walletnfcrel.R.string.suspended_plastic_card_headline);
        ((TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AlertBody)).setText(getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_details_suspended_text, new Object[] {
            appControl.getString(AppControlKey.CARD_BLOCKED_PHONE_NUMBER)
        }));
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setContentView(com.google.android.apps.walletnfcrel.R.layout.plastic_card_details_activity);
        setTitle("");
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            findViewById(com.google.android.apps.walletnfcrel.R.id.toolbar).setElevation(0.0F);
        }
        messageBelowHeaderImage = (TextView)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.MessageBelowHeaderImage);
        lockPlasticCardToggleButton = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.LockPlasticCardToggleButton);
        alertSection = Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.AlertSection);
        if (bundle != null)
        {
            card = (PlasticCard)bundle.getParcelable("plastic_card");
            withdrawalDetails = (PlasticCardCashWithdrawalDetails)bundle.getParcelable("withdrawal_details");
            updateView();
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

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if (!"lock".equals(s)) goto _L2; else goto _L1
_L1:
        analyticsUtil.sendError("LockWalletCard", new AnalyticsCustomDimension[0]);
_L4:
        spinnerManager.hide();
        if (!super.onActionFailure(s, callable, exception))
        {
            CallErrorDialogs.createBuilderWithGenericTitle(exception, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
            finish();
        }
        return true;
_L2:
        if ("unlock".equals(s))
        {
            analyticsUtil.sendError("UnlockWalletCard", new AnalyticsCustomDimension[0]);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if ("lock".equals(s))
        {
            callable = (com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardResponse)obj;
            if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardResponse) (callable)).callError != null)
            {
                analyticsUtil.sendError("LockWalletCard", new AnalyticsCustomDimension[0]);
                CallErrorDialogs.createBuilderWithGenericTitle(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.LockPlasticCardResponse) (callable)).callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
            } else
            {
                analyticsUtil.sendSuccess("LockWalletCard", new AnalyticsCustomDimension[0]);
            }
            spinnerManager.hide();
        }
        if ("unlock".equals(s))
        {
            s = (com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardResponse)obj;
            if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardResponse) (s)).callError != null)
            {
                analyticsUtil.sendError("UnlockWalletCard", new AnalyticsCustomDimension[0]);
                CallErrorDialogs.createBuilderWithGenericTitle(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.UnlockPlasticCardResponse) (s)).callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
            } else
            {
                analyticsUtil.sendSuccess("UnlockWalletCard", new AnalyticsCustomDimension[0]);
            }
            spinnerManager.hide();
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        if (i == 1 && j == -1)
        {
            spinnerManager.showImmediately();
            executeAction("lock", new LockPlasticCardAction(plasticCardModelPublisher, card.getProxyCardId().subId));
        } else
        if (i == 2 && j == -1)
        {
            spinnerManager.showImmediately();
            executeAction("unlock", new UnlockPlasticCardAction(plasticCardModelPublisher, card.getProxyCardId().subId));
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        menu = menu.add(0, 53, 0x30002, com.google.android.apps.walletnfcrel.R.string.tutorial_learn_even_more);
        menu.setIcon(com.google.android.apps.walletnfcrel.R.drawable.quantum_ic_info_outline_white_24);
        menu.setShowAsActionFlags(2);
        return true;
    }

    public void onNewPlasticCardModel(PlasticCardModelEvent plasticcardmodelevent)
    {
        card = null;
        withdrawalDetails = null;
        if (plasticcardmodelevent != null && plasticcardmodelevent.getModel() != null)
        {
            withdrawalDetails = plasticcardmodelevent.getModel().getWithdrawalDetails();
            if (plasticcardmodelevent.getModel().hasCard())
            {
                card = plasticcardmodelevent.getModel().getCard();
            } else
            {
                card = null;
            }
        }
        updateView();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 53: // '5'
            startActivity(UriIntents.create(this, HelpUrls.createWalletCardFaqUrl()));
            break;
        }
        return true;
    }

    protected void onPause()
    {
        super.onPause();
        eventBus.unregisterAll(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("plastic_card", card);
        bundle.putParcelable("withdrawal_details", withdrawalDetails);
    }

    protected final void onUpPressed()
    {
        finish();
    }

}
