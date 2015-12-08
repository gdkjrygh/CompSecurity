// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.callstatus.CallErrorDialogs;
import com.google.android.apps.wallet.pin.api.PinApi;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.validator.DataValidator;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinner;
import com.google.android.apps.wallet.widgets.validation.ValidatedSpinnerAdapterWrapper;
import com.google.android.apps.wallet.widgets.validation.ValidationGroup;
import com.google.common.base.Preconditions;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardDetailsActivity, PlasticCardModelPublisher, CancelPlasticCardAction

public class CancelPlasticCardActivity extends WalletActivity
{
    static final class Reason
    {

        private final int code;
        private final Context context;
        private final int stringResource;

        public final int getCode()
        {
            return code;
        }

        public final String toString()
        {
            return context.getString(stringResource);
        }

        public Reason(int i, int j, Context context1)
        {
            stringResource = i;
            code = j;
            context = context1;
        }
    }


    AnalyticsUtil analyticsUtil;
    PlasticCardModelPublisher plasticCardModelPublisher;
    private final Reason reasonArray[];
    FullScreenProgressSpinnerManager spinnerManager;
    ValidationGroup validationGroup;

    public CancelPlasticCardActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
        reasonArray = (new Reason[] {
            new Reason(com.google.android.apps.walletnfcrel.R.string.wallet_card_cancel_reason_lost, 2, this), new Reason(com.google.android.apps.walletnfcrel.R.string.wallet_card_cancel_reason_stolen, 3, this), new Reason(com.google.android.apps.walletnfcrel.R.string.wallet_card_cancel_reason_suspicious, 4, this), new Reason(com.google.android.apps.walletnfcrel.R.string.wallet_card_cancel_reason_no_usage, 5, this), new Reason(com.google.android.apps.walletnfcrel.R.string.wallet_card_cancel_reason_other, 6, this)
        });
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.wallet_card_cancel_title);
        final String proxyCardSubId = getIntent().getStringExtra("proxy_card_sub_id");
        Preconditions.checkNotNull(proxyCardSubId);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.cancel_plastic_card);
        findViewById(com.google.android.apps.walletnfcrel.R.id.CancelPlasticCardButton).setOnClickListener(new android.view.View.OnClickListener() {

            final CancelPlasticCardActivity this$0;
            final String val$proxyCardSubId;

            public final void onClick(View view)
            {
                analyticsUtil.sendButtonTap("CancelWalletCard", new AnalyticsCustomDimension[0]);
                if (validationGroup.checkForErrors())
                {
                    validationGroup.focusOnFirstError();
                    return;
                } else
                {
                    spinnerManager.showImmediately();
                    view = (Reason)((ValidatedSpinner)Views.findViewById(CancelPlasticCardActivity.this, com.google.android.apps.walletnfcrel.R.id.CancelCardReasonSpinner)).getValue();
                    TextView textview = (TextView)Views.findViewById(CancelPlasticCardActivity.this, com.google.android.apps.walletnfcrel.R.id.CancelPlasticCardOtherExplanation);
                    executeAction("cancel", new CancelPlasticCardAction(plasticCardModelPublisher, proxyCardSubId, view.getCode(), textview.getText().toString()));
                    return;
                }
            }

            
            {
                this$0 = CancelPlasticCardActivity.this;
                proxyCardSubId = s;
                super();
            }
        });
        final ValidatedSpinner spinner = (ValidatedSpinner)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CancelCardReasonSpinner);
        final EditText otherExplanation = new ArrayAdapter(this, 0x1090009, reasonArray);
        spinner.setAdapter(new ValidatedSpinnerAdapterWrapper(otherExplanation, 0x1090009, otherExplanation) {

            final CancelPlasticCardActivity this$0;
            final ArrayAdapter val$arrayAdapter;

            private Reason getItemValue(int i)
            {
                return (Reason)arrayAdapter.getItem(i);
            }

            protected final String getHintText()
            {
                return getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_cancel_reason_hint);
            }

            protected final volatile Object getItemValue(int i)
            {
                return getItemValue(i);
            }

            
            {
                this$0 = CancelPlasticCardActivity.this;
                arrayAdapter = arrayadapter;
                super(final_context, spinneradapter, i);
            }
        });
        otherExplanation = (EditText)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.CancelPlasticCardOtherExplanation);
        otherExplanation.setOnFocusChangeListener(new android.view.View.OnFocusChangeListener() {

            final CancelPlasticCardActivity this$0;

            public final void onFocusChange(View view, boolean flag)
            {
                if (flag)
                {
                    Views.showSoftKeyboard(CancelPlasticCardActivity.this, view);
                    return;
                } else
                {
                    Views.hideSoftKeyboard(CancelPlasticCardActivity.this, view);
                    return;
                }
            }

            
            {
                this$0 = CancelPlasticCardActivity.this;
                super();
            }
        });
        spinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

            final CancelPlasticCardActivity this$0;
            final EditText val$otherExplanation;
            final ValidatedSpinner val$spinner;

            public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
            {
                if (((Reason)spinner.getValue()).toString().equals(getString(com.google.android.apps.walletnfcrel.R.string.wallet_card_cancel_reason_other)))
                {
                    otherExplanation.setVisibility(0);
                    otherExplanation.requestFocus();
                    return;
                } else
                {
                    otherExplanation.setVisibility(8);
                    Views.hideSoftKeyboard(CancelPlasticCardActivity.this, getCurrentFocus());
                    return;
                }
            }

            public final void onNothingSelected(AdapterView adapterview)
            {
                otherExplanation.setVisibility(8);
            }

            
            {
                this$0 = CancelPlasticCardActivity.this;
                spinner = validatedspinner;
                otherExplanation = edittext;
                super();
            }
        });
        spinner.setValidator(new DataValidator() {

            final CancelPlasticCardActivity this$0;

            private static boolean isValid(Reason reason, Resources resources)
            {
                return reason != null;
            }

            private String validate(Reason reason, Resources resources)
            {
                if (reason == null)
                {
                    return getString(com.google.android.apps.walletnfcrel.R.string.validated_spinner_no_selection_error);
                } else
                {
                    return "";
                }
            }

            public final volatile boolean isValid(Object obj, Resources resources)
            {
                return isValid((Reason)obj, resources);
            }

            public final volatile String validate(Object obj, Resources resources)
            {
                return validate((Reason)obj, resources);
            }

            
            {
                this$0 = CancelPlasticCardActivity.this;
                super();
            }
        });
        validationGroup.addInput(spinner);
        otherExplanation.setInputType(1);
        otherExplanation.setVisibility(8);
        if (bundle == null)
        {
            PinApi.startVerifyPinActivityForResultAllowBack(this, 1);
        }
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final boolean onActionFailure(String s, Callable callable, Exception exception)
    {
        if ("cancel".equals(s))
        {
            analyticsUtil.sendError("CancelWalletCard", new AnalyticsCustomDimension[0]);
        }
        if (!super.onActionFailure(s, callable, exception))
        {
            CallErrorDialogs.createBuilderWithGenericTitle(exception, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
            spinnerManager.hide();
        }
        return true;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
label0:
        {
            if ("cancel".equals(s))
            {
                s = (com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardResponse)obj;
                if (((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardResponse) (s)).callError == null)
                {
                    break label0;
                }
                analyticsUtil.sendError("CancelWalletCard", new AnalyticsCustomDimension[0]);
                CallErrorDialogs.createBuilderWithGenericTitle(((com.google.wallet.proto.api.NanoWalletFrontingInstrument.CancelPlasticCardResponse) (s)).callError, com.google.android.apps.walletnfcrel.R.string.error_generic_problem_message).build().show(getSupportFragmentManager());
                spinnerManager.hide();
            }
            return;
        }
        analyticsUtil.sendSuccess("CancelWalletCard", new AnalyticsCustomDimension[0]);
        finish();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1 && j != -1)
        {
            finish();
        }
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(InternalIntents.forClass(this, com/google/android/apps/wallet/plastic/PlasticCardDetailsActivity));
    }
}
