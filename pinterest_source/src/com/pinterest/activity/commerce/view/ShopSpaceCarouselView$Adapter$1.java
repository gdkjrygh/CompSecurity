// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import android.view.View;
import com.pinterest.activity.commerce.logic.ShopSpaceNavigationHelper;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.schemas.event.EventType;

class val.position
    implements android.view.eCarouselView.Adapter._cls1
{

    final val.shopCollectionItem this$1;
    final int val$position;
    final ShopCollectionItem val$shopCollectionItem;

    public void onClick(View view)
    {
        ShopSpaceNavigationHelper.handleNavigation(val$shopCollectionItem);
        cess._mth200(this._cls1.this, EventType.TAP, val$position, val$shopCollectionItem);
    }

    ()
    {
        this$1 = final_;
        val$shopCollectionItem = shopcollectionitem;
        val$position = I.this;
        super();
    }
}
