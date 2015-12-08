// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.view.View;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.ShopCollection;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            ShopSpaceGridView

class val.shopCollection
    implements android.view.
{

    final ShopSpaceGridView this$0;
    final ShopCollection val$shopCollection;

    public void onClick(View view)
    {
        view = new Navigation(Location.COMMERCE_SHOP_SPACE_SECTION);
        view.putExtra("section_id", val$shopCollection.getId());
        Events.post(view);
    }

    ()
    {
        this$0 = final_shopspacegridview;
        val$shopCollection = ShopCollection.this;
        super();
    }
}
