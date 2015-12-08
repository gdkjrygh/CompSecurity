// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.hce.setup.api.NfcSetupApi;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupEvent;
import com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupState;
import com.google.android.apps.wallet.hce.setup.tos.TermsOfUseDialog;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.mywallet.SharedPreferenceDismissController;
import com.google.android.apps.wallet.network.ui.NetworkAccessChecker;
import com.google.android.apps.wallet.nfc.NfcAdapterStateEvent;
import com.google.android.apps.wallet.tile.Tile;
import com.google.android.apps.wallet.ui.toast.Toasts;
import com.google.android.apps.wallet.util.view.Views;
import com.google.common.base.Optional;
import com.google.common.base.Strings;

public class SetupNfcPaymentTile extends Tile
{

    private static final String TAG = com/google/android/apps/wallet/hce/setup/ui/SetupNfcPaymentTile.getSimpleName();
    private final AnalyticsUtil analyticsUtil;
    private TextView body;
    private final SharedPreferenceDismissController dismissController;
    private final EventBus eventBus;
    private final FeatureManager featureManager;
    private boolean hasReportedAnalyticsImpression;
    private TextView headline;
    private ImageView icon;
    private final NetworkAccessChecker networkAccessChecker;
    private Optional nfcIsOn;
    private Optional setupStateEvent;
    private final SharedPreferences sharedPreferences;

    SetupNfcPaymentTile(Activity activity, EventBus eventbus, NetworkAccessChecker networkaccesschecker, FeatureManager featuremanager, SharedPreferences sharedpreferences, AnalyticsUtil analyticsutil)
    {
        super(activity);
        nfcIsOn = Optional.absent();
        setupStateEvent = Optional.absent();
        hasReportedAnalyticsImpression = false;
        eventBus = eventbus;
        networkAccessChecker = networkaccesschecker;
        featureManager = featuremanager;
        analyticsUtil = analyticsutil;
        sharedPreferences = sharedpreferences;
        dismissController = new SharedPreferenceDismissController(sharedpreferences, SharedPreference.NFC_TILE_DISMISSED);
        addTileDismissedListener(dismissController);
    }

    private void handleNfcPaymentSetupState(NfcPaymentSetupEvent nfcpaymentsetupevent)
    {
        setupStateEvent = Optional.of(nfcpaymentsetupevent);
        refresh();
    }

    private void onNfcAdapterStateEvent(NfcAdapterStateEvent nfcadapterstateevent)
    {
        nfcIsOn = Optional.of(Boolean.valueOf(nfcadapterstateevent.isAdapterStateOn()));
        refresh();
    }

    private void refresh()
    {
        if (((Boolean)SharedPreference.HCE_HANDLED_BY_GMS_CORE.get(sharedPreferences)).booleanValue())
        {
            getView().setVisibility(8);
        } else
        if (nfcIsOn.isPresent() && setupStateEvent.isPresent())
        {
            if (!((Boolean)nfcIsOn.get()).booleanValue())
            {
                getView().setVisibility(8);
                return;
            }
            static final class _cls3
            {

                static final int $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[];

                static 
                {
                    $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState = new int[NfcPaymentSetupState.values().length];
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.NOT_STARTED.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.FAILED.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$google$android$apps$wallet$hce$setup$setupstate$NfcPaymentSetupState[NfcPaymentSetupState.COMPLETE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls3..SwitchMap.com.google.android.apps.wallet.hce.setup.setupstate.NfcPaymentSetupState[((NfcPaymentSetupEvent)setupStateEvent.get()).getState().ordinal()])
            {
            default:
                String s = TAG;
                String s1 = String.valueOf(((NfcPaymentSetupEvent)setupStateEvent.get()).getState());
                WLog.e(s, (new StringBuilder(String.valueOf(s1).length() + 19)).append("Unsupported state: ").append(s1).toString());
                return;

            case 1: // '\001'
                setTileVisible();
                getView().setOnClickListener(new android.view.View.OnClickListener() );
                return;

            case 2: // '\002'
                setTileVisible();
                headline.setTextColor(context.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.bad));
                icon.setVisibility(8);
                getView().setOnClickListener(new android.view.View.OnClickListener() );
                com.google.wallet.proto.NanoWalletError.CallError callerror = ((NfcPaymentSetupEvent)setupStateEvent.get()).getCallError();
                if (((NfcPaymentSetupEvent)setupStateEvent.get()).getCallError() != null && !Strings.isNullOrEmpty(callerror.content) && !Strings.isNullOrEmpty(callerror.title))
                {
                    headline.setText(callerror.title);
                    Views.setLink(body, callerror.content);
                    return;
                } else
                {
                    headline.setText(com.google.android.apps.walletnfcrel.R.string.setup_tap_and_pay_failed_header_default);
                    body.setText(com.google.android.apps.walletnfcrel.R.string.setup_tap_and_pay_failed_provisioning_problem);
                    return;
                }

            case 3: // '\003'
                getView().setVisibility(8);
                return;
            }
        }
    }

    private void setTileVisible()
    {
        getView().setVisibility(0);
        if (!hasReportedAnalyticsImpression)
        {
            analyticsUtil.sendImpression("SetupNfcTile", new AnalyticsCustomDimension[0]);
            hasReportedAnalyticsImpression = true;
        }
    }

    public final boolean canDismiss(Object obj)
    {
        return true;
    }

    public final String getAnchor()
    {
        return "nfcsetup";
    }

    public final void onActivate()
    {
        onActivate();
        eventBus.register(this);
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = context.getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.tile_card, viewgroup, false);
        setView(viewgroup);
        viewgroup.setVisibility(8);
        headline = (TextView)viewgroup.findViewById(com.google.android.apps.walletnfcrel.R.id.Headline);
        headline.setText(com.google.android.apps.walletnfcrel.R.string.setup_tap_and_pay_header);
        body = (TextView)viewgroup.findViewById(com.google.android.apps.walletnfcrel.R.id.Body);
        body.setText(com.google.android.apps.walletnfcrel.R.string.setup_tap_and_pay_description);
        icon = (ImageView)Views.findViewById(viewgroup, com.google.android.apps.walletnfcrel.R.id.Icon);
        icon.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.ic_tap_and_pay_color_40dp);
        return viewgroup;
    }

    protected final void onDeactivate()
    {
        onDeactivate();
        eventBus.unregisterAll(this);
    }

    public final void onDismiss(View view, Object obj)
    {
        analyticsUtil.sendDismissal("SetupNfcTile", new AnalyticsCustomDimension[0]);
        onDismiss(view, obj);
        Toasts.show(view.getContext(), com.google.android.apps.walletnfcrel.R.string.tap_and_pay_dismissed);
    }

    public final boolean shouldShow()
    {
        return !dismissController.isDismissed() && featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS);
    }






}
