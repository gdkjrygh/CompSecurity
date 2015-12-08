// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.View;
import com.pinterest.activity.commerce.logic.ShopSpaceNavigationHelper;
import com.pinterest.api.model.ShopCollectionItem;

class val.shopCollectionItem
    implements android.view.Fragment.Adapter._cls1
{

    final val.shopCollectionItem this$1;
    final ShopCollectionItem val$shopCollectionItem;

    public void onClick(View view)
    {
        ShopSpaceNavigationHelper.handleNavigation(val$shopCollectionItem);
    }

    ()
    {
        this$1 = final_;
        val$shopCollectionItem = ShopCollectionItem.this;
        super();
    }
}
