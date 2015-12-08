// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ScrollView;
import com.braintreepayments.api.AndroidPay;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.PayPalHelper;
import com.braintreepayments.api.VenmoAppSwitch;
import com.braintreepayments.api.dropin.view.LoadingHeader;
import com.braintreepayments.api.dropin.view.PaymentButton;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.UnexpectedException;
import com.braintreepayments.api.models.CardBuilder;
import com.braintreepayments.api.models.ThreeDSecureAuthenticationResponse;
import com.braintreepayments.cardform.OnCardFormFieldFocusedListener;
import com.braintreepayments.cardform.OnCardFormSubmitListener;
import com.braintreepayments.cardform.OnCardFormValidListener;
import com.braintreepayments.cardform.view.CardForm;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.braintreepayments.api.dropin:
//            BraintreeViewController, BraintreePaymentActivity, Customization

public class AddPaymentMethodViewController extends BraintreeViewController
    implements android.view.View.OnClickListener, OnCardFormFieldFocusedListener, OnCardFormSubmitListener, OnCardFormValidListener
{

    private PaymentButton c;
    private CardForm d;
    private View e;
    private Button f;
    private LoadingHeader g;
    private ScrollView h;
    private boolean i;

    public AddPaymentMethodViewController(BraintreePaymentActivity braintreepaymentactivity, Bundle bundle, View view, Braintree braintree, Customization customization)
    {
        super(braintreepaymentactivity, view, braintree, customization);
        i = false;
        g = (LoadingHeader)a(R.id.bt_header_container);
        h = (ScrollView)a(R.id.bt_form_scroll_container);
        e = a(R.id.bt_description_container);
        c = (PaymentButton)a(R.id.bt_payment_button);
        d = (CardForm)a(R.id.bt_card_form);
        f = (Button)a(R.id.bt_card_form_submit_button);
        c.setOnClickListener(this);
        try
        {
            c.a((Cart)a.getIntent().getParcelableExtra("com.braintreepayments.api.dropin.EXTRA_CART"), a.getIntent().getBooleanExtra("com.braintreepayments.api.dropin.EXTRA_ANDROID_PAY_IS_BILLING_AGREEMENT", false));
        }
        // Misplaced declaration of an exception variable
        catch (BraintreePaymentActivity braintreepaymentactivity) { }
        c.a(a, b);
        d.a(a, b.e(), b.f(), e());
        d.a(this);
        d.a(this);
        d.a(this);
        f.setOnClickListener(this);
        f.setText(d());
        if (bundle.containsKey("com.braintreepayments.api.dropin.EXTRA_FORM_IS_SUBMITTING"))
        {
            i = bundle.getBoolean("com.braintreepayments.api.dropin.EXTRA_FORM_IS_SUBMITTING");
            if (i)
            {
                f();
            }
        }
        if (bundle.containsKey("com.braintreepayments.api.dropin.EXTRA_SUBMIT_BUTTON_ENABLED"))
        {
            f.setEnabled(bundle.getBoolean("com.braintreepayments.api.dropin.EXTRA_SUBMIT_BUTTON_ENABLED"));
        }
        if (d.a())
        {
            g();
        }
    }

    static ScrollView a(AddPaymentMethodViewController addpaymentmethodviewcontroller)
    {
        return addpaymentmethodviewcontroller.h;
    }

    private void f()
    {
        d.setEnabled(false);
        f.setEnabled(false);
        e.setVisibility(8);
        g.a();
    }

    private void g()
    {
        f.setBackgroundResource(R.drawable.bt_submit_button_background);
    }

    private void h()
    {
        f.setBackgroundResource(R.color.bt_button_disabled_color);
    }

    public final void a(int j, int k, Intent intent)
    {
        i = true;
        Braintree braintree = b;
        BraintreePaymentActivity braintreepaymentactivity = a;
        if (k == -1 && intent != null)
        {
            if (PayPalHelper.a(intent))
            {
                braintree.a(braintreepaymentactivity, k, intent);
            } else
            {
                if (AndroidPay.a(intent))
                {
                    if (AndroidPay.a(intent))
                    {
                        intent = ((MaskedWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_MASKED_WALLET")).getGoogleTransactionId();
                    } else
                    if (AndroidPay.b(intent))
                    {
                        intent = ((FullWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET")).getGoogleTransactionId();
                    } else
                    {
                        intent = null;
                    }
                    braintree.a(braintreepaymentactivity, j, intent);
                    return;
                }
                if (AndroidPay.b(intent))
                {
                    braintree.b(k, intent);
                    return;
                }
                if (VenmoAppSwitch.a(intent))
                {
                    braintree.a(k, intent);
                    return;
                }
                if (ThreeDSecureAuthenticationResponse.a(intent))
                {
                    braintree.c(k, intent);
                    return;
                }
            }
        }
    }

    public final void a(Bundle bundle)
    {
        bundle.putBoolean("com.braintreepayments.api.dropin.EXTRA_FORM_IS_SUBMITTING", i);
        bundle.putBoolean("com.braintreepayments.api.dropin.EXTRA_SUBMIT_BUTTON_ENABLED", f.isEnabled());
    }

    public final void a(ErrorWithResponse errorwithresponse)
    {
        b();
        com.braintreepayments.api.exceptions.ErrorWithResponse.BraintreeError braintreeerror = errorwithresponse.a("creditCard");
        if (braintreeerror != null)
        {
            b.a("add-card.failed");
            if (braintreeerror.a("number") != null)
            {
                d.c();
            }
            if (braintreeerror.a("expirationYear") != null || braintreeerror.a("expirationMonth") != null || braintreeerror.a("expirationDate") != null)
            {
                d.d();
            }
            if (braintreeerror.a("cvv") != null)
            {
                d.e();
            }
            if (braintreeerror.a("billingAddress") != null)
            {
                d.f();
            }
            g.a(a.getString(R.string.bt_invalid_card));
            return;
        } else
        {
            a.onUnrecoverableError(new UnexpectedException(errorwithresponse.getMessage()));
            return;
        }
    }

    protected final boolean a()
    {
        return i;
    }

    protected final void b()
    {
        h();
        d.setEnabled(true);
        f.setEnabled(true);
        i = false;
    }

    protected final void c()
    {
        g.b();
    }

    public void onCardFormFieldFocused(View view)
    {
        h.postDelayed(new _cls1(view), 100L);
    }

    public void onCardFormSubmit()
    {
        f.performClick();
    }

    public void onCardFormValid(boolean flag)
    {
        if (flag)
        {
            g();
            return;
        } else
        {
            h();
            return;
        }
    }

    public void onClick(View view)
    {
        if (view == c)
        {
            a.b();
        } else
        if (view == f)
        {
            if (d.a())
            {
                view = d;
                ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                i = true;
                f();
                view = b;
                CardBuilder cardbuilder = (new CardBuilder()).a(d.g()).c(d.h()).d(d.i()).k("dropin");
                if (b.e())
                {
                    cardbuilder.b(d.j());
                }
                if (b.f())
                {
                    cardbuilder.h(d.k());
                }
                view.a(cardbuilder);
                return;
            } else
            {
                d.b();
                h();
                return;
            }
        }
    }

    /* member class not found */
    class _cls1 {}

}
