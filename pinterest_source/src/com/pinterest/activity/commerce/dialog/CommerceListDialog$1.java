// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import com.pinterest.activity.commerce.event.CloseCommerceListDialogEvent;
import com.pinterest.activity.commerce.event.PaymentMethodDeletedEvent;
import com.pinterest.activity.commerce.event.ShippingAddressDeletedEvent;
import com.pinterest.model.commerce.DetailedShipping;
import com.pinterest.model.commerce.UserCard;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceListDialog

class this._cls0
    implements com.pinterest.base.er
{

    final CommerceListDialog this$0;

    public void onEventMainThread(CloseCommerceListDialogEvent closecommercelistdialogevent)
    {
        dismiss();
    }

    public void onEventMainThread(PaymentMethodDeletedEvent paymentmethoddeletedevent)
    {
        if (CommerceListDialog.access$100(CommerceListDialog.this) == pe.PaymentMethod)
        {
            if (CommerceListDialog.access$200(CommerceListDialog.this) != null && CommerceListDialog.access$200(CommerceListDialog.this).equals(paymentmethoddeletedevent.getUserCard()))
            {
                CommerceListDialog.access$202(CommerceListDialog.this, null);
            }
            CommerceListDialog.access$300(CommerceListDialog.this).removeItem(paymentmethoddeletedevent.getUserCard());
            if (CommerceListDialog.access$300(CommerceListDialog.this).getItemCount() == 1)
            {
                dismiss();
                return;
            }
        }
    }

    public void onEventMainThread(ShippingAddressDeletedEvent shippingaddressdeletedevent)
    {
        if (CommerceListDialog.access$100(CommerceListDialog.this) == pe.ShippingAddress)
        {
            if (CommerceListDialog.access$400(CommerceListDialog.this) != null && CommerceListDialog.access$400(CommerceListDialog.this).equals(shippingaddressdeletedevent.getDetailedShipping()))
            {
                CommerceListDialog.access$402(CommerceListDialog.this, null);
            }
            CommerceListDialog.access$300(CommerceListDialog.this).removeItem(shippingaddressdeletedevent.getDetailedShipping());
            if (CommerceListDialog.access$300(CommerceListDialog.this).getItemCount() == 1)
            {
                dismiss();
                return;
            }
        }
    }

    Event()
    {
        this$0 = CommerceListDialog.this;
        super();
    }
}
