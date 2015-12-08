// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.cardlist.PaymentCardModel;
import com.google.android.apps.wallet.cardlist.PaymentCardModelEvent;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModel;
import com.google.android.apps.wallet.frontinginstrument.TapAndPayModelEvent;
import com.google.android.apps.wallet.funding.api.FundingApi;
import com.google.android.apps.wallet.hce.setup.api.NfcSetupApi;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupEvent;
import com.google.android.apps.wallet.hce.util.HceUtil;
import com.google.android.apps.wallet.log.SLog;
import com.google.android.apps.wallet.nfc.NfcAdapterStateEvent;
import com.google.android.apps.wallet.paymentcard.api.PaymentCard;
import com.google.android.apps.wallet.storedvalue.api.StoredValueEvent;
import com.google.android.apps.wallet.storedvalue.api.StoredValueModel;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.util.view.Views;

public class NfcTile extends Tile
{

    private static final String TAG = com/google/android/apps/wallet/hce/setup/ui/NfcTile.getSimpleName();
    private final AnalyticsUtil analyticsUtil;
    private TextView body;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private boolean hasReportedAnalyticsImpression;
    private final HceUtil hceUtil;
    private TextView headline;
    private ViewGroup layout;
    private NfcAdapterStateEvent nfcAdapterEvent;
    private NfcPaymentSetupEvent nfcPaymentSetupEvent;
    private final android.view.View.OnClickListener nfcSettingsListener = new android.view.View.OnClickListener() ;
    private PaymentCardModelEvent paymentCardModelEvent;
    private final android.view.View.OnClickListener requestHceRefreshBundleListener = new android.view.View.OnClickListener() ;
    private final android.view.View.OnClickListener selectCardListener = new android.view.View.OnClickListener() ;
    private final android.view.View.OnClickListener setWalletDefaultHceAppListener = new android.view.View.OnClickListener() {

        final NfcTile this$0;

        public final void onClick(View view)
        {
            analyticsUtil.sendLinkTap("NfcSettingsTile", new AnalyticsCustomDimension[0]);
            hceUtil.setWalletDefaultPaymentApp();
        }

            
            {
                this$0 = NfcTile.this;
                super();
            }
    };
    private final SharedPreferences sharedPreferences;
    private final SLog slog;
    private StoredValueEvent storedValueEvent;
    private TapAndPayModelEvent tapAndPayModelEvent;

    public NfcTile(Activity activity, EventBus eventbus, HceUtil hceutil, FeatureManager featuremanager, AnalyticsUtil analyticsutil, SLog slog1, SharedPreferences sharedpreferences)
    {
        super(activity);
        hasReportedAnalyticsImpression = false;
        eventBus = eventbus;
        hceUtil = hceutil;
        featureManager = featuremanager;
        analyticsUtil = analyticsutil;
        slog = slog1;
        sharedPreferences = sharedpreferences;
    }

    private int determineState()
    {
        byte byte0 = 1;
        if (((Boolean)SharedPreference.HCE_HANDLED_BY_GMS_CORE.get(sharedPreferences)).booleanValue())
        {
            byte0 = 11;
        } else
        {
            if (!nfcPaymentSetupEvent.isSuccessful())
            {
                return 9;
            }
            if (hceUtil.isWalletDefaultPaymentApp())
            {
                if (!nfcAdapterEvent.isAdapterStateOn())
                {
                    return 0;
                }
                if (nfcPaymentSetupEvent.hasAtcReachedLimit())
                {
                    return !nfcPaymentSetupEvent.hasCallErrorStrings() ? 3 : 2;
                }
                PaymentCard paymentcard;
                Object obj;
                boolean flag;
                boolean flag1;
                if (storedValueEvent.isFeatureEnabled() && storedValueEvent.getModel() != null && storedValueEvent.getModel().getStoredValue() != null && storedValueEvent.getModel().getStoredValue().balance.amount.micros.longValue() > 0L)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (tapAndPayModelEvent.getModel() != null && tapAndPayModelEvent.getModel().isStoredValueEnabled(storedValueEvent.getModel().getStoredValue()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj = null;
                paymentcard = obj;
                if (paymentCardModelEvent.getModel() != null)
                {
                    paymentcard = obj;
                    if (tapAndPayModelEvent.getModel() != null)
                    {
                        paymentcard = tapAndPayModelEvent.getModel().getSelectedCredential(paymentCardModelEvent.getModel().getAllCredentials());
                    }
                }
                if (flag)
                {
                    if (paymentcard != null)
                    {
                        return 4;
                    }
                    return !flag1 ? 10 : 5;
                }
                if (paymentcard != null)
                {
                    return paymentcard.isExpired() ? 7 : 6;
                } else
                {
                    return 8;
                }
            }
        }
        return byte0;
    }

    private void refresh()
    {
        if (nfcAdapterEvent == null || nfcPaymentSetupEvent == null || storedValueEvent == null || paymentCardModelEvent == null || tapAndPayModelEvent == null)
        {
            return;
        }
        int i = determineState();
        Object obj1 = getView();
        ((View) (obj1)).setVisibility(0);
        switch (i)
        {
        default:
            throw new IllegalStateException(String.format("unknown state: %s", new Object[] {
                Integer.valueOf(i)
            }));

        case 11: // '\013'
            setTileStateUnavailable(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_in_google_settings, new android.view.View.OnClickListener() );
            return;

        case 9: // '\t'
            ((View) (obj1)).setVisibility(8);
            return;

        case 0: // '\0'
            setTileStateUnavailable(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_off_nfc_disabled, nfcSettingsListener);
            return;

        case 1: // '\001'
            setTileStateUnavailable(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_wallet_not_default_app, setWalletDefaultHceAppListener);
            return;

        case 2: // '\002'
            Object obj = nfcPaymentSetupEvent.getCallError();
            headline.setText(((com.google.wallet.proto.NanoWalletError.CallError) (obj)).title);
            Views.setLink(body, ((com.google.wallet.proto.NanoWalletError.CallError) (obj)).content);
            headline.setCompoundDrawablesWithIntrinsicBounds(com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_tappay_error_color_40dp, 0, 0, 0);
            ((View) (obj1)).setOnClickListener(requestHceRefreshBundleListener);
            obj1 = slog;
            String s = TAG;
            String s1 = String.valueOf(((com.google.wallet.proto.NanoWalletError.CallError) (obj)).title);
            obj = String.valueOf(((com.google.wallet.proto.NanoWalletError.CallError) (obj)).content);
            ((SLog) (obj1)).log(s, (new StringBuilder(String.valueOf(s1).length() + 67 + String.valueOf(obj).length())).append("Displayed NFC unavailable tile: No Valid HCE Bundle CallError - ").append(s1).append(" - ").append(((String) (obj))).toString());
            return;

        case 3: // '\003'
            setTileStateUnavailable(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_refresh_bundle_failed_no_internet, requestHceRefreshBundleListener);
            ((View) (obj1)).setOnClickListener(requestHceRefreshBundleListener);
            slog.log(TAG, "Displayed NFC unavailable tile: No Valid HCE Bundle ");
            return;

        case 4: // '\004'
        case 6: // '\006'
            setTileStateReady(tapAndPayModelEvent.getModel().getSelectedCredential(paymentCardModelEvent.getModel().getAllCredentials()).getNickname(), selectCardListener);
            return;

        case 5: // '\005'
            setTileStateReady(context.getString(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_no_backup_card), selectCardListener);
            return;

        case 7: // '\007'
            setTileStateUnavailable(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_no_stored_value_expired_card, selectCardListener);
            return;

        case 8: // '\b'
            setTileStateUnavailable(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_no_stored_value_or_card, selectCardListener);
            return;

        case 10: // '\n'
            setTileStateUnavailable(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_stored_value_not_selected_and_no_card, selectCardListener);
            slog.log(TAG, "Displayed NFC unavailable tile: Positive Unchecked Balance missing card");
            return;
        }
    }

    private void sendAnalyticsImpression()
    {
        if (!hasReportedAnalyticsImpression)
        {
            analyticsUtil.sendImpression("NfcSettingsTile", new AnalyticsCustomDimension[0]);
            hasReportedAnalyticsImpression = true;
        }
    }

    private void setTileStateReady(CharSequence charsequence, android.view.View.OnClickListener onclicklistener)
    {
        sendAnalyticsImpression();
        headline.setText(context.getString(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_ready, new Object[] {
            charsequence
        }));
        headline.setTextAppearance(context, com.google.android.apps.walletnfcrel.R.style.ListItemPrimaryText);
        headline.setSingleLine();
        headline.setEllipsize(android.text.TextUtils.TruncateAt.END);
        body.setText("");
        body.setVisibility(8);
        headline.setCompoundDrawablesWithIntrinsicBounds(com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_tappay_ready_color_40dp, 0, 0, 0);
        getView().setOnClickListener(onclicklistener);
    }

    private void setTileStateUnavailable(int i, android.view.View.OnClickListener onclicklistener)
    {
        sendAnalyticsImpression();
        headline.setText(com.google.android.apps.walletnfcrel.R.string.tap_and_pay_unavailable);
        headline.setTextAppearance(context, com.google.android.apps.walletnfcrel.R.style.ListItemPrimaryText_Error);
        headline.setSingleLine(false);
        headline.setEllipsize(null);
        body.setText(i);
        body.setVisibility(0);
        headline.setCompoundDrawablesWithIntrinsicBounds(com.google.android.apps.walletnfcrel.R.drawable.ic_mywallet_tappay_error_color_40dp, 0, 0, 0);
        getView().setOnClickListener(onclicklistener);
    }

    public final boolean canDismiss(Object obj)
    {
        return false;
    }

    protected final void onActivate()
    {
        onActivate();
        eventBus.register(this);
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        layout = (ViewGroup)LayoutInflater.from(context).inflate(com.google.android.apps.walletnfcrel.R.layout.tile_card_nfc, viewgroup, false);
        layout.setVisibility(8);
        setView(layout);
        headline = (TextView)layout.findViewById(com.google.android.apps.walletnfcrel.R.id.Headline);
        body = (TextView)layout.findViewById(com.google.android.apps.walletnfcrel.R.id.Body);
        return layout;
    }

    protected final void onDeactivate()
    {
        eventBus.unregisterAll(this);
    }

    public void onNfcAdapterStateEvent(NfcAdapterStateEvent nfcadapterstateevent)
    {
        nfcAdapterEvent = nfcadapterstateevent;
        refresh();
    }

    void onNfcPaymentSetupEvent(NfcPaymentSetupEvent nfcpaymentsetupevent)
    {
        nfcPaymentSetupEvent = nfcpaymentsetupevent;
        refresh();
    }

    public void onPaymentCardModelEvent(PaymentCardModelEvent paymentcardmodelevent)
    {
        paymentCardModelEvent = paymentcardmodelevent;
        refresh();
    }

    public void onStoredValueBalance(StoredValueEvent storedvalueevent)
    {
        storedValueEvent = storedvalueevent;
        refresh();
    }

    void onTapAndPayModelEvent(TapAndPayModelEvent tapandpaymodelevent)
    {
        tapAndPayModelEvent = tapandpaymodelevent;
        refresh();
    }

    public final boolean shouldShow()
    {
        return featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS);
    }









}
