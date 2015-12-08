// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.braintreepayments.api.Braintree;
import com.braintreepayments.api.PayPalHelper;

public class PaymentButton extends RelativeLayout
    implements android.view.View.OnClickListener
{

    public static final int REQUEST_CODE = 11876;
    private Activity mActivity;
    private Braintree mBraintree;
    private int mRequestCode;

    public PaymentButton(Context context)
    {
        super(context);
    }

    public PaymentButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PaymentButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void initialize(Activity activity, Braintree braintree)
    {
        initialize(activity, braintree, 11876);
    }

    public void initialize(Activity activity, Braintree braintree, int i)
    {
        mActivity = activity;
        mBraintree = braintree;
        mRequestCode = i;
        inflate(getContext(), com.braintreepayments.api.dropin.R.layout.bt_payment_button, this);
        boolean flag = mBraintree.isPayPalEnabled();
        boolean flag1 = mBraintree.isVenmoEnabled();
        if (!flag && !flag1)
        {
            setVisibility(8);
        } else
        {
            if (flag)
            {
                activity = (ImageButton)findViewById(com.braintreepayments.api.dropin.R.id.bt_paypal_button);
                activity.setVisibility(0);
                activity.setOnClickListener(this);
            }
            if (flag1)
            {
                activity = (ImageButton)findViewById(com.braintreepayments.api.dropin.R.id.bt_venmo_button);
                activity.setVisibility(0);
                activity.setOnClickListener(this);
            }
            if (flag && flag1)
            {
                findViewById(com.braintreepayments.api.dropin.R.id.bt_payment_button_divider).setVisibility(0);
                return;
            }
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            if (i == mRequestCode && j == -1)
            {
                if (!PayPalHelper.isPayPalIntent(intent))
                {
                    break label0;
                }
                mBraintree.finishPayWithPayPal(mActivity, j, intent);
            }
            return;
        }
        mBraintree.finishPayWithVenmo(j, intent);
    }

    public void onClick(View view)
    {
        if (view.getId() == com.braintreepayments.api.dropin.R.id.bt_paypal_button)
        {
            mBraintree.startPayWithPayPal(mActivity, mRequestCode);
        } else
        if (view.getId() == com.braintreepayments.api.dropin.R.id.bt_venmo_button)
        {
            mBraintree.startPayWithVenmo(mActivity, mRequestCode);
            return;
        }
    }
}
