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

    private BraintreePaymentActivity mActivity;
    protected final Braintree mBraintree;
    private final Customization mCustomization;
    private View mRootView;

    public BraintreeViewController(BraintreePaymentActivity braintreepaymentactivity, View view, Braintree braintree, Customization customization)
    {
        mActivity = braintreepaymentactivity;
        mRootView = view;
        mBraintree = braintree;
        mCustomization = customization;
        initDescriptionView();
    }

    private void initDescriptionSubview(int i, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            ((TextView)findView(i)).setText(s);
        }
    }

    private void initDescriptionView()
    {
        if (!TextUtils.isEmpty(mCustomization.getPrimaryDescription()))
        {
            initDescriptionSubview(R.id.bt_primary_description, mCustomization.getPrimaryDescription());
            initDescriptionSubview(R.id.bt_secondary_description, mCustomization.getSecondaryDescription());
            initDescriptionSubview(R.id.bt_description_amount, mCustomization.getAmount());
            findView(R.id.bt_description_container).setVisibility(0);
        }
    }

    public View findView(int i)
    {
        return mRootView.findViewById(i);
    }

    protected BraintreePaymentActivity getActivity()
    {
        return mActivity;
    }

    protected String getCustomizedCallToAction()
    {
        String s1 = mCustomization.getSubmitButtonText();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = getActivity().getString(R.string.bt_default_submit_button_text);
        }
        return s;
    }

    protected String getSubmitButtonText()
    {
        String s1 = getCustomizedCallToAction();
        String s = s1;
        if (!TextUtils.isEmpty(mCustomization.getAmount()))
        {
            s = (new StringBuilder()).append(mCustomization.getAmount()).append(" - ").append(s1).toString();
        }
        return s;
    }

    public abstract void onSaveInstanceState(Bundle bundle);
}
