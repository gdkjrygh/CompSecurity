// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.view.View;
import com.pinterest.activity.commerce.event.VariantSelectedEvent;
import com.pinterest.activity.commerce.viewmodel.VariantRowItem;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            VariantSelectionView

class val.variantRowItem
    implements android.view.onView.VariantAdapter._cls1
{

    final val.variantRowItem this$1;
    final VariantRowItem val$variantRowItem;

    public void onClick(View view)
    {
        EventType eventtype = EventType.TAP;
        if (VariantSelectionView.access$000(_fld0) == is._fld0)
        {
            view = ElementType.BUYABLE_CHECKOUT_VARIANT_CIRCLE_CELL;
        } else
        {
            view = ElementType.BUYABLE_CHECKOUT_VARIANT_TABLE_CELL;
        }
        Pinalytics.b(eventtype, view, null, null);
        Events.post(new VariantSelectedEvent(val$variantRowItem));
    }

    ()
    {
        this$1 = final_;
        val$variantRowItem = VariantRowItem.this;
        super();
    }
}
