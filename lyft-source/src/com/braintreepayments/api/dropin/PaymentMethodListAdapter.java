// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.dropin;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.braintreepayments.api.dropin.view.PaymentMethodView;
import com.braintreepayments.api.models.PaymentMethod;
import java.util.List;

// Referenced classes of package com.braintreepayments.api.dropin:
//            SelectPaymentMethodViewController

public class PaymentMethodListAdapter extends BaseAdapter
    implements android.content.DialogInterface.OnClickListener
{

    private Context mContext;
    private List mPaymentMethods;
    private SelectPaymentMethodViewController mViewController;

    public PaymentMethodListAdapter(Context context, SelectPaymentMethodViewController selectpaymentmethodviewcontroller, List list)
    {
        mContext = context;
        mViewController = selectpaymentmethodviewcontroller;
        mPaymentMethods = list;
    }

    public int getCount()
    {
        return mPaymentMethods.size();
    }

    public Object getItem(int i)
    {
        return mPaymentMethods.get(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = new PaymentMethodView(mContext);
        view.setPaymentMethodDetails((PaymentMethod)mPaymentMethods.get(i));
        return view;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        mViewController.onPaymentMethodSelected(i);
    }
}
