// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.dropin.view.LoadingHeader;
import com.braintreepayments.api.dropin.view.PaymentButton;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.UnexpectedException;
import com.braintreepayments.api.models.CardBuilder;
import com.braintreepayments.cardform.OnCardFormFieldFocusedListener;
import com.braintreepayments.cardform.OnCardFormSubmitListener;
import com.braintreepayments.cardform.OnCardFormValidListener;
import com.braintreepayments.cardform.view.CardForm;

// Referenced classes of package com.braintreepayments.api.dropin:
//            BraintreeViewController, BraintreePaymentActivity, Customization

public class AddPaymentMethodViewController extends BraintreeViewController
    implements android.view.View.OnClickListener, OnCardFormFieldFocusedListener, OnCardFormSubmitListener, OnCardFormValidListener
{

    private static final String EXTRA_FORM_IS_SUBMITTING = "com.braintreepayments.api.dropin.EXTRA_FORM_IS_SUBMITTING";
    private static final String EXTRA_SUBMIT_BUTTON_ENABLED = "com.braintreepayments.api.dropin.EXTRA_SUBMIT_BUTTON_ENABLED";
    private static final String INTEGRATION_METHOD = "dropin";
    private CardForm mCardForm;
    private View mDescription;
    private boolean mIsSubmitting;
    private LoadingHeader mLoadingHeader;
    private PaymentButton mPaymentButton;
    private ScrollView mScrollView;
    private Button mSubmitButton;

    public AddPaymentMethodViewController(BraintreePaymentActivity braintreepaymentactivity, Bundle bundle, View view, Braintree braintree, Customization customization)
    {
        super(braintreepaymentactivity, view, braintree, customization);
        mIsSubmitting = false;
        initViews();
        restoreState(bundle);
    }

    private CardBuilder getCardBuilder()
    {
        CardBuilder cardbuilder = (new CardBuilder()).cardNumber(mCardForm.getCardNumber()).expirationMonth(mCardForm.getExpirationMonth()).expirationYear(mCardForm.getExpirationYear()).integration("dropin");
        if (mBraintree.isCvvChallenegePresent())
        {
            cardbuilder.cvv(mCardForm.getCvv());
        }
        if (mBraintree.isPostalCodeChallengePresent())
        {
            cardbuilder.postalCode(mCardForm.getPostalCode());
        }
        return cardbuilder;
    }

    private void initViews()
    {
        mLoadingHeader = (LoadingHeader)findView(R.id.bt_header_container);
        mScrollView = (ScrollView)findView(R.id.bt_form_scroll_container);
        mDescription = findView(R.id.bt_description_container);
        mPaymentButton = (PaymentButton)findView(R.id.bt_payment_button);
        mCardForm = (CardForm)findView(R.id.bt_card_form);
        mSubmitButton = (Button)findView(R.id.bt_card_form_submit_button);
        mPaymentButton.initialize(getActivity(), mBraintree);
        mCardForm.setRequiredFields(true, true, mBraintree.isCvvChallenegePresent(), mBraintree.isPostalCodeChallengePresent(), getCustomizedCallToAction());
        mCardForm.setOnCardFormValidListener(this);
        mCardForm.setOnCardFormSubmitListener(this);
        mCardForm.setOnFormFieldFocusedListener(this);
        mSubmitButton.setOnClickListener(this);
        mSubmitButton.setText(getSubmitButtonText());
    }

    private void restoreState(Bundle bundle)
    {
        mCardForm.onRestoreInstanceState(bundle);
        if (bundle.containsKey("com.braintreepayments.api.dropin.EXTRA_FORM_IS_SUBMITTING"))
        {
            mIsSubmitting = bundle.getBoolean("com.braintreepayments.api.dropin.EXTRA_FORM_IS_SUBMITTING");
            if (mIsSubmitting)
            {
                setUIForSubmit();
            }
        }
        if (bundle.containsKey("com.braintreepayments.api.dropin.EXTRA_SUBMIT_BUTTON_ENABLED"))
        {
            mSubmitButton.setEnabled(bundle.getBoolean("com.braintreepayments.api.dropin.EXTRA_SUBMIT_BUTTON_ENABLED"));
        }
        if (mCardForm.isValid())
        {
            setEnabledSubmitButtonStyle();
        }
    }

    private void setDisabledSubmitButtonStyle()
    {
        mSubmitButton.setBackgroundResource(R.color.bt_button_disabled_color);
    }

    private void setEnabledSubmitButtonStyle()
    {
        mSubmitButton.setBackgroundResource(R.drawable.bt_submit_button_background);
    }

    private void setUIForSubmit()
    {
        mCardForm.setEnabled(false);
        mSubmitButton.setEnabled(false);
        mDescription.setVisibility(8);
        mLoadingHeader.setLoading();
    }

    private void showErrorUI()
    {
        mLoadingHeader.setError(getActivity().getString(R.string.bt_invalid_card));
    }

    private void startSubmit()
    {
        mCardForm.closeSoftKeyboard();
        mIsSubmitting = true;
        setUIForSubmit();
    }

    protected void endSubmit()
    {
        setDisabledSubmitButtonStyle();
        mCardForm.setEnabled(true);
        mSubmitButton.setEnabled(true);
        mIsSubmitting = false;
    }

    protected boolean isSubmitting()
    {
        return mIsSubmitting;
    }

    public void onCardFormFieldFocused(final View field)
    {
        mScrollView.postDelayed(new Runnable() {

            final AddPaymentMethodViewController this$0;
            final View val$field;

            public void run()
            {
                mScrollView.smoothScrollTo(0, field.getTop());
            }

            
            {
                this$0 = AddPaymentMethodViewController.this;
                field = view;
                super();
            }
        }, 100L);
    }

    public void onCardFormSubmit()
    {
        mSubmitButton.performClick();
    }

    public void onCardFormValid(boolean flag)
    {
        if (flag)
        {
            setEnabledSubmitButtonStyle();
            return;
        } else
        {
            setDisabledSubmitButtonStyle();
            return;
        }
    }

    public void onClick(View view)
    {
label0:
        {
            if (view == mSubmitButton)
            {
                if (!mCardForm.isValid())
                {
                    break label0;
                }
                startSubmit();
                mBraintree.create(getCardBuilder());
            }
            return;
        }
        mCardForm.validate();
        setDisabledSubmitButtonStyle();
    }

    public void onPaymentResult(int i, int j, Intent intent)
    {
        mIsSubmitting = true;
        mPaymentButton.onActivityResult(i, j, intent);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        mCardForm.onSaveInstanceState(bundle);
        bundle.putBoolean("com.braintreepayments.api.dropin.EXTRA_FORM_IS_SUBMITTING", mIsSubmitting);
        bundle.putBoolean("com.braintreepayments.api.dropin.EXTRA_SUBMIT_BUTTON_ENABLED", mSubmitButton.isEnabled());
    }

    public void setErrors(ErrorWithResponse errorwithresponse)
    {
        showErrorUI();
        endSubmit();
        if (errorwithresponse.errorFor("creditCard") != null)
        {
            mBraintree.sendAnalyticsEvent("add-card.failed");
            errorwithresponse = errorwithresponse.errorFor("creditCard");
            if (errorwithresponse.errorFor("number") != null)
            {
                mCardForm.setCardNumberError();
            }
            if (errorwithresponse.errorFor("expirationYear") != null || errorwithresponse.errorFor("expirationMonth") != null || errorwithresponse.errorFor("expirationDate") != null)
            {
                mCardForm.setExpirationError();
            }
            if (errorwithresponse.errorFor("cvv") != null)
            {
                mCardForm.setCvvError();
            }
            if (errorwithresponse.errorFor("billingAddress") != null)
            {
                mCardForm.setPostalCodeError();
            }
            return;
        } else
        {
            getActivity().onUnrecoverableError(new UnexpectedException(errorwithresponse.getMessage()));
            return;
        }
    }

    protected void showSuccess()
    {
        mLoadingHeader.setSuccessful();
    }

}
