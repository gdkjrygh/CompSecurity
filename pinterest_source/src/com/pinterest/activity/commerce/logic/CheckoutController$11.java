// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.app.Activity;
import android.content.Intent;
import com.pinterest.activity.commerce.SecureDialogActivity;
import com.pinterest.activity.commerce.dialog.CommerceListDialog;
import com.pinterest.activity.commerce.event.CheckoutClickEvent;
import com.pinterest.activity.commerce.event.PaymentMethodDeletedEvent;
import com.pinterest.activity.commerce.event.QuantitySelectedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressDeletedEvent;
import com.pinterest.activity.commerce.event.ShippingRateSelectedEvent;
import com.pinterest.activity.commerce.view.CheckoutView;
import com.pinterest.activity.commerce.viewmodel.CheckoutViewModel;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.BuyableProduct;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Events;
import com.pinterest.data.CommerceApiManager;
import com.pinterest.kit.application.Resources;
import com.pinterest.model.api.RequestVariantParameter;
import com.pinterest.model.commerce.Cart;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.ShippingRate;
import com.pinterest.model.commerce.UserCard;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            CheckoutController

class this._cls0
    implements com.pinterest.base.r
{

    final CheckoutController this$0;

    private void postCommerceFormAddressDialogEvent()
    {
        Intent intent = new Intent(CheckoutController.access$2600(CheckoutController.this), com/pinterest/activity/commerce/SecureDialogActivity);
        intent.putExtra("dialog_type", "address");
        intent.putExtra("merchant", CheckoutController.access$2500(CheckoutController.this).getBuyableProduct().getMerchantName());
        CheckoutController.access$2900(CheckoutController.this).startActivity(intent);
    }

    private void postCommerceFormPaymentDialogEvent()
    {
        Intent intent = new Intent(CheckoutController.access$2600(CheckoutController.this), com/pinterest/activity/commerce/SecureDialogActivity);
        intent.putExtra("dialog_type", "payment");
        intent.putExtra("merchant", CheckoutController.access$2500(CheckoutController.this).getBuyableProduct().getMerchantName());
        if (CheckoutController.access$1100(CheckoutController.this).getDetailedShipping() != null)
        {
            intent.putExtra("ship_address", CheckoutController.access$1100(CheckoutController.this).getDetailedShipping());
        }
        if (CheckoutController.access$1600(CheckoutController.this))
        {
            intent.putExtra("card_incentive", Resources.string(0x7f07015d, new Object[] {
                CheckoutController.access$2700(CheckoutController.this), CheckoutController.access$2800(CheckoutController.this)
            }));
        }
        CheckoutController.access$2900(CheckoutController.this).startActivity(intent);
    }

    public void onEventMainThread(CheckoutClickEvent checkoutclickevent)
    {
        checkoutclickevent = checkoutclickevent.getClick();
        switch (.SwitchMap.com.pinterest.activity.commerce.event.CheckoutClickEvent.Click[checkoutclickevent.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_SUMMARY_SHIP_ADDRESS_CELL, null, null);
            if (CheckoutController.access$300(CheckoutController.this) == null || CheckoutController.access$300(CheckoutController.this).isEmpty())
            {
                postCommerceFormAddressDialogEvent();
                return;
            } else
            {
                Events.post(new DialogEvent(CommerceListDialog.newInstanceForShippingAddresses(CheckoutController.access$1100(CheckoutController.this).getDetailedShipping(), new ArrayList(CheckoutController.access$300(CheckoutController.this)))));
                return;
            }

        case 2: // '\002'
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_SHIPPING_ADDRESS_ADD_NEW_CELL, null, null);
            postCommerceFormAddressDialogEvent();
            return;

        case 3: // '\003'
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_QUANTITY_FIELD, null, null);
            Events.post(new DialogEvent(CommerceListDialog.newInstanceForQuantity(CheckoutController.access$100(CheckoutController.this).getMaxQuantity().intValue())));
            return;

        case 4: // '\004'
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_SUMMARY_PAYMENT_CELL, null, null);
            if (CheckoutController.access$400(CheckoutController.this) == null || CheckoutController.access$400(CheckoutController.this).isEmpty())
            {
                postCommerceFormPaymentDialogEvent();
                return;
            } else
            {
                Events.post(new DialogEvent(CommerceListDialog.newInstanceForPaymentMethods(CheckoutController.access$1100(CheckoutController.this).getUserCard(), new ArrayList(CheckoutController.access$400(CheckoutController.this)))));
                return;
            }

        case 5: // '\005'
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_PAYMENT_ADD_NEW_CELL, null, null);
            postCommerceFormPaymentDialogEvent();
            return;

        case 6: // '\006'
            if (CheckoutController.access$500(CheckoutController.this).hasError())
            {
                CheckoutController.access$1700(CheckoutController.this);
                return;
            } else
            {
                Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_SUMMARY_PAY_BUTTON, null, null);
                CheckoutController.access$2300(CheckoutController.this);
                return;
            }

        case 7: // '\007'
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_CHECKOUT_SUMMARY_SHIP_METHOD_CELL, null, null);
            Events.post(new DialogEvent(CommerceListDialog.newInstanceForShippingMethods(CheckoutController.access$1100(CheckoutController.this).getSelectedShippingRate(), new ArrayList(CheckoutController.access$1100(CheckoutController.this).getShippingRates()))));
            return;

        case 8: // '\b'
            CheckoutController.access$2400(CheckoutController.this);
            return;
        }
    }

    public void onEventMainThread(PaymentMethodDeletedEvent paymentmethoddeletedevent)
    {
        if (CheckoutController.access$500(CheckoutController.this).getPaymentMethod().equals(paymentmethoddeletedevent.getUserCard()))
        {
            CheckoutController.access$500(CheckoutController.this).updatePayment(null);
            CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
            CheckoutController.access$1700(CheckoutController.this);
        }
        CheckoutController.access$1800(CheckoutController.this);
    }

    public void onEventMainThread(QuantitySelectedEvent quantityselectedevent)
    {
        String s = (String)CheckoutController.access$1100(CheckoutController.this).getItemMap().keySet().toArray()[0];
        CheckoutController.access$500(CheckoutController.this).updateQuantity(quantityselectedevent.getQuantity());
        CheckoutController.access$500(CheckoutController.this).setShowProgress();
        CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
        CheckoutController.access$2000(CheckoutController.this).a(CheckoutController.access$1100(CheckoutController.this).getId(), s, new RequestVariantParameter(s, Integer.valueOf(quantityselectedevent.getQuantity())), CheckoutController.access$2500(CheckoutController.this).getUid(), CheckoutController.access$1900(CheckoutController.this));
    }

    public void onEventMainThread(ShippingAddressDeletedEvent shippingaddressdeletedevent)
    {
        if (CheckoutController.access$500(CheckoutController.this).getShippingAddress() != null && CheckoutController.access$500(CheckoutController.this).getShippingAddress().equals(shippingaddressdeletedevent.getDetailedShipping()))
        {
            CheckoutController.access$500(CheckoutController.this).updateShippingMethod(null);
            CheckoutController.access$500(CheckoutController.this).updateShippingAddress(null);
            CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
            CheckoutController.access$1700(CheckoutController.this);
        }
        CheckoutController.access$2100(CheckoutController.this);
    }

    public void onEventMainThread(ShippingRateSelectedEvent shippingrateselectedevent)
    {
        if (shippingrateselectedevent.getShippingRate().equals(CheckoutController.access$500(CheckoutController.this).getShippingMethod()))
        {
            return;
        } else
        {
            CheckoutController.access$500(CheckoutController.this).updateShippingMethod(shippingrateselectedevent.getShippingRate());
            CheckoutController.access$500(CheckoutController.this).setShowProgress();
            CheckoutController.access$600(CheckoutController.this).update(CheckoutController.access$500(CheckoutController.this));
            CheckoutController.access$2000(CheckoutController.this).c(CheckoutController.access$1100(CheckoutController.this).getId(), shippingrateselectedevent.getShippingRate().getId(), CheckoutController.access$1900(CheckoutController.this));
            Pinalytics.b(EventType.TAP, ElementType.BUYABLE_SHIPPING_METHOD_CELL, null, null);
            return;
        }
    }

    ent()
    {
        this$0 = CheckoutController.this;
        super();
    }
}
