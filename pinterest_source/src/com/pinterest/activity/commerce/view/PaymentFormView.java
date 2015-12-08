// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.SwitchCompat;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.braintreepayments.cardform.utils.CardType;
import com.pinterest.activity.commerce.braintree.view.CardEditText;
import com.pinterest.activity.commerce.braintree.view.CvvEditText;
import com.pinterest.activity.commerce.braintree.view.MonthYearEditText;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.commerce.viewmodel.PaymentFormViewModel;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.ui.text.PTextView;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            CommerceFormView, AddressFormView

public class PaymentFormView extends LinearLayout
    implements android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.widget.TextView.OnEditorActionListener, com.pinterest.activity.commerce.braintree.view.CardEditText.OnCardTypeChangedListener, CommerceFormView
{

    private static final int KEYBOARD_DELAY_MS = 300;
    AddressFormView addressFormView;
    PTextView billingAddressDisplay;
    CardEditText cardNumber;
    CvvEditText cvv;
    PTextView disclaimer;
    MonthYearEditText expiration;
    private OnPaymentFormSubmitListener onPaymentFormSubmitListener;
    private PaymentFormViewModel originalViewModel;
    FrameLayout statementCreditContainer;
    TextView statementCreditText;
    LinearLayout switchContainer;
    PTextView switchText;
    private SwitchCompat useBillingAddress;

    public PaymentFormView(Context context)
    {
        super(context);
        init(context);
    }

    public PaymentFormView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init(context);
    }

    public PaymentFormView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init(context);
    }

    private void init(Context context)
    {
        inflate(context, 0x7f030182, this);
        ButterKnife.a(this);
        setOrientation(1);
        useBillingAddress = new SwitchCompat(new ContextThemeWrapper(getContext(), 0x7f0b0096));
        switchContainer.addView(useBillingAddress);
        useBillingAddress.setChecked(true);
        updateBillingAddressComponents(true);
        useBillingAddress.setOnCheckedChangeListener(new _cls1());
        cardNumber.setOnFocusChangeListener(this);
        expiration.setOnFocusChangeListener(this);
        cvv.setOnFocusChangeListener(this);
        cardNumber.setOnClickListener(this);
        expiration.setOnClickListener(this);
        cvv.setOnClickListener(this);
        cardNumber.setOnCardTypeChangedListener(this);
        updateCvvImeAction();
        context = Resources.string(0x7f0700ff);
        String s = Resources.string(0x7f0700fe, new Object[] {
            context
        });
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(s);
        int i = s.indexOf(context);
        spannablestringbuilder.setSpan(BuyableProductHelper.getClickablePrivacyPolicySpan(), i, context.length() + i, 33);
        disclaimer.setText(spannablestringbuilder);
        disclaimer.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void showKeyboardDelayed(final View view)
    {
        (new Handler()).postDelayed(new _cls2(), 300L);
    }

    private void updateBillingAddressComponents(boolean flag)
    {
        boolean flag1 = false;
        Object obj = addressFormView;
        int i;
        if (!flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((AddressFormView) (obj)).setVisibility(i);
        obj = billingAddressDisplay;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((PTextView) (obj)).setVisibility(i);
    }

    private void updateCvvImeAction()
    {
        if (useBillingAddress.isChecked())
        {
            cvv.setImeOptions(2);
            cvv.setImeActionLabel(Resources.string(0x7f0704be), 2);
            cvv.setOnEditorActionListener(this);
            return;
        } else
        {
            cvv.setImeOptions(5);
            cvv.setImeActionLabel(Resources.string(0x7f070397), 5);
            cvv.setOnEditorActionListener(this);
            return;
        }
    }

    public AddressFormView getAddressFormView()
    {
        return addressFormView;
    }

    public PaymentFormViewModel getData()
    {
        if (originalViewModel != null)
        {
            return new PaymentFormViewModel(null, expiration.getMonth(), expiration.getYear(), null);
        }
        if (!cardNumber.isValid() || !expiration.isValid() || !cvv.isValid())
        {
            return null;
        } else
        {
            return new PaymentFormViewModel(cardNumber.getText().toString(), expiration.getMonth(), expiration.getYear(), cvv.getText().toString());
        }
    }

    public volatile Object getData()
    {
        return getData();
    }

    public boolean isBillingAddressSelected()
    {
        return useBillingAddress.isChecked();
    }

    public void onCardTypeChanged(CardType cardtype)
    {
        cvv.setCardType(cardtype);
    }

    public void onClick(View view)
    {
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 5 && !useBillingAddress.isChecked())
        {
            addressFormView.requestFocusForFirstField();
            return true;
        }
        if (i == 2 && onPaymentFormSubmitListener != null)
        {
            onPaymentFormSubmitListener.onPaymentFormSubmit();
            return true;
        } else
        {
            return false;
        }
    }

    public void onFocusChange(View view, boolean flag)
    {
    }

    public void setData(PaymentFormViewModel paymentformviewmodel)
    {
        originalViewModel = paymentformviewmodel;
        paymentformviewmodel = originalViewModel.getExpMonth();
        String s = originalViewModel.getExpYear();
        expiration.setText((new StringBuilder()).append(paymentformviewmodel).append(s).toString());
        cardNumber.setText((new StringBuilder("*** ")).append(originalViewModel.getCardNumber()).toString());
        cardNumber.setEnabled(false);
        cardNumber.setFocusable(false);
        cvv.setText("***");
        cvv.setEnabled(false);
        cvv.setFocusable(false);
        expiration.requestFocus();
        expiration.setNextFocusDownId(0x7f0f0099);
    }

    public volatile void setData(Object obj)
    {
        setData((PaymentFormViewModel)obj);
    }

    public void setDetailedShipping(DetailedShipping detailedshipping)
    {
        billingAddressDisplay.setText(BuyableProductHelper.getFormattedAddress(detailedshipping, true));
    }

    public void setOnPaymentFormSubmitListener(OnPaymentFormSubmitListener onpaymentformsubmitlistener)
    {
        onPaymentFormSubmitListener = onpaymentformsubmitlistener;
    }

    public void setRequireAddressInput()
    {
        useBillingAddress.setChecked(false);
        useBillingAddress.setEnabled(false);
    }

    public void setupForAddressInputOnly(String s)
    {
        useBillingAddress.setVisibility(8);
        updateBillingAddressComponents(false);
        addressFormView.setVisibility(0);
        switchText.setText(s);
    }

    public void setupIncentive(String s)
    {
        statementCreditText.setText(s);
        statementCreditContainer.setVisibility(0);
    }

    public void updateCreditCardNumber(String s, String s1)
    {
        cardNumber.setText(s);
        expiration.setText(s1);
        if (cardNumber.isValid() && expiration.isValid())
        {
            cvv.requestFocus();
            showKeyboardDelayed(cvv);
        } else
        if (cardNumber.isValid())
        {
            expiration.requestFocus();
            showKeyboardDelayed(expiration);
            return;
        }
    }



    private class _cls1
        implements android.widget.CompoundButton.OnCheckedChangeListener
    {

        final PaymentFormView this$0;

        public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
        {
            updateBillingAddressComponents(flag);
            updateCvvImeAction();
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_PAYMENT_BILLING_TOGGLE, null, null);
        }

        _cls1()
        {
            this$0 = PaymentFormView.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final PaymentFormView this$0;
        final View val$view;

        public void run()
        {
            if (view == null)
            {
                return;
            } else
            {
                Device.showSoftKeyboard(view);
                return;
            }
        }

        _cls2()
        {
            this$0 = PaymentFormView.this;
            view = view1;
            super();
        }
    }


    private class OnPaymentFormSubmitListener
    {

        public abstract void onPaymentFormSubmit();
    }

}
