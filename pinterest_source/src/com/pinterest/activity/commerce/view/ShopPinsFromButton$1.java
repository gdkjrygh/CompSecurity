// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            ShopPinsFromButton

class val.canonicalMerchantDomain
    implements android.view.ew.ShopPinsFromButton._cls1
{

    final ShopPinsFromButton this$0;
    final String val$canonicalMerchantDomain;

    public void onClick(View view)
    {
        Pinalytics.a(EventType.TAP, ElementType.COMMERCE_SHOP_MORE_BUTTON, null, null);
        view = new Navigation(Location.SEARCH_PIN_COMMERCE);
        view.putStringParcelable("domain", val$canonicalMerchantDomain);
        Events.post(view);
    }

    ()
    {
        this$0 = final_shoppinsfrombutton;
        val$canonicalMerchantDomain = String.this;
        super();
    }
}
