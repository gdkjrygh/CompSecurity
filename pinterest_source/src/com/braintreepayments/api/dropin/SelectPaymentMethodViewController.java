// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.dropin.view.PaymentMethodView;
import com.braintreepayments.api.models.PaymentMethod;
import java.util.List;

// Referenced classes of package com.braintreepayments.api.dropin:
//            BraintreeViewController, BraintreePaymentActivity, PaymentMethodListAdapter, Customization

public class SelectPaymentMethodViewController extends BraintreeViewController
    implements android.view.View.OnClickListener
{

    private PaymentMethodView c;
    private TextView d;
    private Button e;
    private int f;

    public SelectPaymentMethodViewController(BraintreePaymentActivity braintreepaymentactivity, Bundle bundle, View view, Braintree braintree, Customization customization)
    {
        super(braintreepaymentactivity, view, braintree, customization);
        c = (PaymentMethodView)a(R.id.bt_selected_payment_method_view);
        c.setOnClickListener(this);
        d = (TextView)a(R.id.bt_change_payment_method_link);
        d.setOnClickListener(this);
        e = (Button)a(R.id.bt_select_payment_method_submit_button);
        e.setOnClickListener(this);
        e.setText(d());
        if (bundle.containsKey("com.braintreepayments.api.dropin.EXTRA_SELECTED_PAYMENT_METHOD"))
        {
            f = bundle.getInt("com.braintreepayments.api.dropin.EXTRA_SELECTED_PAYMENT_METHOD");
        } else
        {
            f = 0;
        }
        a();
    }

    static void a(SelectPaymentMethodViewController selectpaymentmethodviewcontroller)
    {
        selectpaymentmethodviewcontroller.a.a();
    }

    private void b()
    {
        PaymentMethodListAdapter paymentmethodlistadapter = new PaymentMethodListAdapter(a, this, b.i());
        ContextThemeWrapper contextthemewrapper;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            contextthemewrapper = new ContextThemeWrapper(a, 0x1030075);
        } else
        {
            contextthemewrapper = new ContextThemeWrapper(a, 0x103000d);
        }
        (new android.app.AlertDialog.Builder(contextthemewrapper)).setTitle(R.string.bt_choose_payment_method).setAdapter(paymentmethodlistadapter, paymentmethodlistadapter).setPositiveButton(R.string.bt_add_new_payment_method, new _cls1()).show();
    }

    private PaymentMethod c()
    {
        return (PaymentMethod)b.i().get(f);
    }

    protected final void a()
    {
        c.a(c());
        TextView textview = (TextView)a(R.id.bt_change_payment_method_link);
        if (b.i().size() == 1)
        {
            textview.setText(R.string.bt_add_payment_method);
            return;
        } else
        {
            textview.setText(R.string.bt_change_payment_method);
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        bundle.putInt("com.braintreepayments.api.dropin.EXTRA_SELECTED_PAYMENT_METHOD", f);
    }

    protected final void b(int i)
    {
        f = i;
        a();
    }

    public void onClick(View view)
    {
        if (view.getId() == c.getId())
        {
            if (b.i().size() > 1)
            {
                b();
            }
        } else
        {
            if (view.getId() == d.getId())
            {
                if (b.i().size() == 1)
                {
                    a.a();
                    return;
                } else
                {
                    b();
                    return;
                }
            }
            if (view.getId() == e.getId())
            {
                e.setEnabled(false);
                a.a(c());
                return;
            }
        }
    }

    /* member class not found */
    class _cls1 {}

}
