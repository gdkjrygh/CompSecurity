// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import com.pinterest.activity.commerce.event.PaymentSelectedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressSelectedEvent;
import com.pinterest.activity.commerce.view.CheckoutView;
import com.pinterest.activity.commerce.viewmodel.CheckoutViewModel;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.data.CommerceApiManager;
import com.pinterest.model.commerce.Cart;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.UserCard;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            CheckoutController

class this._cls0
    implements com.pinterest.base.r
{

    final CheckoutController this$0;

    public void onEventMainThread(PaymentSelectedEvent paymentselectedevent)
    {
        Events.removeStickyEvent(paymentselectedevent);
        if (!paymentselectedevent.getUserCard().equals(CheckoutController.access$500(CheckoutController.this).getPaymentMethod()))
        {
            CheckoutController.access$500(CheckoutController.this).clearPaymentIncentive();
            CheckoutController.access$2202(CheckoutController.this, false);
            CheckoutController.access$802(CheckoutController.this, false);
            CheckoutController.access$500(CheckoutController.this).updatePayment(paymentselectedevent.getUserCard());
            CheckoutController.access$500(CheckoutController.this).setShowProgress();
            CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
            CheckoutController.access$2000(CheckoutController.this).d(CheckoutController.access$1100(CheckoutController.this).getId(), paymentselectedevent.getUserCard().getId(), CheckoutController.access$1900(CheckoutController.this));
            CheckoutController.access$1800(CheckoutController.this);
            if (paymentselectedevent.isExistingSelected())
            {
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_PAYMENT_CELL, null, null);
                return;
            }
        }
    }

    public void onEventMainThread(ShippingAddressSelectedEvent shippingaddressselectedevent)
    {
        Events.removeStickyEvent(shippingaddressselectedevent);
        if (shippingaddressselectedevent.getDetailedShipping().equals(CheckoutController.access$500(CheckoutController.this).getShippingAddress()))
        {
            return;
        }
        CheckoutController.access$500(CheckoutController.this).updateShippingAddress(shippingaddressselectedevent.getDetailedShipping());
        CheckoutController.access$500(CheckoutController.this).setShowProgress();
        CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
        CheckoutController.access$2000(CheckoutController.this).b(CheckoutController.access$1100(CheckoutController.this).getId(), shippingaddressselectedevent.getDetailedShipping().getId(), CheckoutController.access$1900(CheckoutController.this));
        if (shippingaddressselectedevent.isNewlyCreated())
        {
            CheckoutController.access$2100(CheckoutController.this);
            return;
        } else
        {
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_SHIPPING_ADDRESS_CELL, null, null);
            return;
        }
    }

    dEvent()
    {
        this$0 = CheckoutController.this;
        super();
    }
}
