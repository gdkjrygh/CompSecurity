// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import android.content.Intent;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.commerce.logic.ShopSpaceNavigationHelper;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.ShopCollectionItem;

// Referenced classes of package com.pinterest.activity.webhook:
//            WebhookActivity

class onse extends com.pinterest.api.remote.aceCollectionItemApiResponse
{

    final WebhookActivity this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        finish();
    }

    public void onSuccess(ShopCollectionItem shopcollectionitem)
    {
        super.onSuccess(shopcollectionitem);
        if (shopcollectionitem == null)
        {
            finish();
            return;
        } else
        {
            WebhookActivity.access$100("shop_space_collection");
            shopcollectionitem = ShopSpaceNavigationHelper.getNavigation(shopcollectionitem);
            Intent intent = ActivityHelper.getHomeIntent(WebhookActivity.this);
            intent.putExtra("com.pinterest.EXTRA_PENDING_TASK", shopcollectionitem);
            startActivity(intent);
            finish();
            return;
        }
    }

    vigationHelper()
    {
        this$0 = WebhookActivity.this;
        super();
    }
}
