// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.api.ApiResponse;
import java.util.List;

// Referenced classes of package com.pinterest.activity.commerce:
//            ShopSpaceSectionFragment

class msApiResponse extends com.pinterest.api.remote.tionItemsApiResponse
{

    final ShopSpaceSectionFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        ShopSpaceSectionFragment.access$100(ShopSpaceSectionFragment.this).maybeRemoveLoadMoreItem();
        ShopSpaceSectionFragment.access$302(ShopSpaceSectionFragment.this, false);
        ShopSpaceSectionFragment.access$400(ShopSpaceSectionFragment.this, false);
    }

    public void onSuccess(List list, String s)
    {
        super.onSuccess(list, s);
        ShopSpaceSectionFragment.access$100(ShopSpaceSectionFragment.this).appendItem(list);
        ShopSpaceSectionFragment shopspacesectionfragment = ShopSpaceSectionFragment.this;
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ShopSpaceSectionFragment.access$200(shopspacesectionfragment, s, flag);
    }

    apter()
    {
        this$0 = ShopSpaceSectionFragment.this;
        super();
    }
}
