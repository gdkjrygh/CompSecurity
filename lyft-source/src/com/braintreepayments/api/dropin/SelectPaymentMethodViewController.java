// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import android.content.DialogInterface;
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

    private static final String EXTRA_SELECTED_PAYMENT_METHOD = "com.braintreepayments.api.dropin.EXTRA_SELECTED_PAYMENT_METHOD";
    private int mActivePaymentMethod;
    private TextView mChangeMethodView;
    private PaymentMethodView mPaymentMethodView;
    private Button mSubmitButton;

    public SelectPaymentMethodViewController(BraintreePaymentActivity braintreepaymentactivity, Bundle bundle, View view, Braintree braintree, Customization customization)
    {
        super(braintreepaymentactivity, view, braintree, customization);
        mPaymentMethodView = (PaymentMethodView)findView(R.id.bt_selected_payment_method_view);
        mPaymentMethodView.setOnClickListener(this);
        mChangeMethodView = (TextView)findView(R.id.bt_change_payment_method_link);
        mChangeMethodView.setOnClickListener(this);
        mSubmitButton = (Button)findView(R.id.bt_select_payment_method_submit_button);
        mSubmitButton.setOnClickListener(this);
        mSubmitButton.setText(getSubmitButtonText());
        if (bundle.containsKey("com.braintreepayments.api.dropin.EXTRA_SELECTED_PAYMENT_METHOD"))
        {
            mActivePaymentMethod = bundle.getInt("com.braintreepayments.api.dropin.EXTRA_SELECTED_PAYMENT_METHOD");
        } else
        {
            mActivePaymentMethod = 0;
        }
        setupPaymentMethod();
    }

    private PaymentMethod getActivePaymentMethod()
    {
        return (PaymentMethod)mBraintree.getCachedPaymentMethods().get(mActivePaymentMethod);
    }

    private void launchFormView()
    {
        getActivity().initAddPaymentMethodView();
    }

    private void showPaymentMethodListDialog()
    {
        PaymentMethodListAdapter paymentmethodlistadapter = new PaymentMethodListAdapter(getActivity(), this, mBraintree.getCachedPaymentMethods());
        ContextThemeWrapper contextthemewrapper;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            contextthemewrapper = new ContextThemeWrapper(getActivity(), 0x1030075);
        } else
        {
            contextthemewrapper = new ContextThemeWrapper(getActivity(), 0x103000d);
        }
        (new android.app.AlertDialog.Builder(contextthemewrapper)).setTitle(R.string.bt_choose_payment_method).setAdapter(paymentmethodlistadapter, paymentmethodlistadapter).setPositiveButton(R.string.bt_add_new_payment_method, new android.content.DialogInterface.OnClickListener() {

            final SelectPaymentMethodViewController this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                launchFormView();
            }

            
            {
                this$0 = SelectPaymentMethodViewController.this;
                super();
            }
        }).show();
    }

    public void onClick(View view)
    {
        if (view.getId() == mPaymentMethodView.getId())
        {
            if (mBraintree.getCachedPaymentMethods().size() > 1)
            {
                showPaymentMethodListDialog();
            }
        } else
        {
            if (view.getId() == mChangeMethodView.getId())
            {
                if (mBraintree.getCachedPaymentMethods().size() == 1)
                {
                    launchFormView();
                    return;
                } else
                {
                    showPaymentMethodListDialog();
                    return;
                }
            }
            if (view.getId() == mSubmitButton.getId())
            {
                mSubmitButton.setEnabled(false);
                getActivity().finalizeSelection(getActivePaymentMethod());
                return;
            }
        }
    }

    protected void onPaymentMethodSelected(int i)
    {
        mActivePaymentMethod = i;
        setupPaymentMethod();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt("com.braintreepayments.api.dropin.EXTRA_SELECTED_PAYMENT_METHOD", mActivePaymentMethod);
    }

    protected void setupPaymentMethod()
    {
        mPaymentMethodView.setPaymentMethodDetails(getActivePaymentMethod());
        TextView textview = (TextView)findView(R.id.bt_change_payment_method_link);
        if (mBraintree.getCachedPaymentMethods().size() == 1)
        {
            textview.setText(R.string.bt_add_payment_method);
            return;
        } else
        {
            textview.setText(R.string.bt_change_payment_method);
            return;
        }
    }

}
