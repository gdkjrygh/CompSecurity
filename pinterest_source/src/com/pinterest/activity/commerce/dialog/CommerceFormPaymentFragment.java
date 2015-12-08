// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.pinterest.activity.commerce.logic.CommerceFormBaseFragmentController;
import com.pinterest.activity.commerce.logic.PaymentFormFragmentController;
import com.pinterest.di.components.FragmentComponent;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.UserCard;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceFormBaseFragment

public class CommerceFormPaymentFragment extends CommerceFormBaseFragment
{

    private static final String EXTRA_CARD_INCENTIVE = "card_incentive";
    private static final String EXTRA_PAYMENT = "payment";
    private static final String EXTRA_SHIPPING_ADDRESS = "shipping_address";
    private String cardIncentive;
    private String merchantName;
    private UserCard originalUserCard;
    PaymentFormFragmentController paymentFormController;
    private DetailedShipping shippingAddress;

    public CommerceFormPaymentFragment()
    {
    }

    public static CommerceFormPaymentFragment newInstance(DetailedShipping detailedshipping, String s, String s1)
    {
        CommerceFormPaymentFragment commerceformpaymentfragment = new CommerceFormPaymentFragment();
        Bundle bundle = new Bundle();
        if (detailedshipping != null)
        {
            bundle.putParcelable("shipping_address", detailedshipping);
        }
        if (!TextUtils.isEmpty(s))
        {
            bundle.putString("merchant_name", s);
        }
        if (!TextUtils.isEmpty(s1))
        {
            bundle.putString("card_incentive", s1);
        }
        commerceformpaymentfragment.setArguments(bundle);
        return commerceformpaymentfragment;
    }

    public static CommerceFormPaymentFragment newInstanceForEdit(UserCard usercard)
    {
        CommerceFormPaymentFragment commerceformpaymentfragment = new CommerceFormPaymentFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("payment", usercard);
        commerceformpaymentfragment.setArguments(bundle);
        return commerceformpaymentfragment;
    }

    protected int getContainerResourceId()
    {
        return 0x7f030067;
    }

    protected CommerceFormBaseFragmentController getController()
    {
        return paymentFormController;
    }

    protected String getDialogTitle()
    {
        return Resources.string(0x7f070126);
    }

    public void onActivityCreated(Bundle bundle)
    {
        getComponent().inject(this);
        paymentFormController.init(shippingAddress, merchantName, originalUserCard, cardIncentive);
        super.onActivityCreated(bundle);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = getArguments();
        shippingAddress = (DetailedShipping)view.getParcelable("shipping_address");
        merchantName = view.getString("merchant_name");
        originalUserCard = (UserCard)view.getParcelable("payment");
        cardIncentive = view.getString("card_incentive");
    }
}
