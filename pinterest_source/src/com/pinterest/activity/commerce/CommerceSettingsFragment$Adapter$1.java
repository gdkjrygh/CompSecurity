// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.model.commerce.Cart;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;

class val.cart
    implements android.view.Fragment.Adapter._cls1
{

    final val.cart this$1;
    final Cart val$cart;

    public void onClick(View view)
    {
        Pinalytics.a(EventType.TAP, ElementType.BUYABLE_ORDER_HISTORY_CELL, ComponentType.NAVIGATION, null);
        view = new Navigation(Location.COMMERCE_ORDER_DETAIL);
        view.putExtra("cart", val$cart);
        Events.post(view);
    }

    ()
    {
        this$1 = final_;
        val$cart = Cart.this;
        super();
    }
}
