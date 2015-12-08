// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.commerce:
//            ShopSpaceFragment

class this._cls0 extends BaseApiResponseHandler
{

    final ShopSpaceFragment this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        ShopSpaceFragment.access$000(ShopSpaceFragment.this, (PinterestJsonObject)apiresponse.getData());
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        ShopSpaceFragment.access$000(ShopSpaceFragment.this, (PinterestJsonObject)apiresponse.getData());
    }

    _cls9()
    {
        this$0 = ShopSpaceFragment.this;
        super();
    }
}
