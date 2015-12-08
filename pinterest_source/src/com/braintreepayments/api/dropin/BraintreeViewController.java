// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.braintreepayments.api.Braintree;

// Referenced classes of package com.braintreepayments.api.dropin:
//            Customization, BraintreePaymentActivity

public abstract class BraintreeViewController
{

    protected BraintreePaymentActivity a;
    protected final Braintree b;
    private View c;
    private final Customization d;

    public BraintreeViewController(BraintreePaymentActivity braintreepaymentactivity, View view, Braintree braintree, Customization customization)
    {
        a = braintreepaymentactivity;
        c = view;
        b = braintree;
        d = customization;
        if (!TextUtils.isEmpty(d.c()))
        {
            a(R.id.bt_primary_description, d.c());
            a(R.id.bt_secondary_description, d.d());
            a(R.id.bt_description_amount, d.f());
            a(R.id.bt_description_container).setVisibility(0);
        }
    }

    private void a(int i, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            ((TextView)a(i)).setText(s);
        }
    }

    public final View a(int i)
    {
        return c.findViewById(i);
    }

    public abstract void a(Bundle bundle);

    protected final String d()
    {
        String s1 = e();
        String s = s1;
        if (!TextUtils.isEmpty(d.f()))
        {
            s = (new StringBuilder()).append(d.f()).append(" - ").append(s1).toString();
        }
        return s.toUpperCase();
    }

    protected final String e()
    {
        String s1 = d.e();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = a.getString(R.string.bt_default_submit_button_text);
        }
        return s;
    }
}
