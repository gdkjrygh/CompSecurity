// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.view.View;
import com.pinterest.activity.commerce.logic.ShopSpaceNavigationHelper;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.schemas.event.EventType;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            ShopSpaceGridView

class val.shopCollectionItem
    implements android.view.
{

    final ShopSpaceGridView this$0;
    final int val$position;
    final ShopCollectionItem val$shopCollectionItem;
    final String val$type;

    public void onClick(View view)
    {
        ShopSpaceGridView.access$000(ShopSpaceGridView.this, val$type, EventType.TAP, val$position, val$shopCollectionItem);
        ShopSpaceNavigationHelper.handleNavigation(val$shopCollectionItem);
    }

    Helper()
    {
        this$0 = final_shopspacegridview;
        val$type = s;
        val$position = i;
        val$shopCollectionItem = ShopCollectionItem.this;
        super();
    }
}
