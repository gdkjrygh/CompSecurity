// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import android.content.Context;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.appwidget:
//            WidgetValidator

final class > extends ApiResponseHandler
{

    final Context val$context;
    final boolean val$showToast;

    public final void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = (PinterestJsonObject)apiresponse.getData();
        boolean flag = WidgetValidator.shouldShowWidget(apiresponse.a("is_enabled").booleanValue());
        WidgetValidator.enableWidget(val$context, flag);
        if (!flag && val$showToast)
        {
            apiresponse.a("operator", "");
            WidgetValidator.showIneligibleToast();
        }
    }

    ject()
    {
        val$context = context1;
        val$showToast = flag;
        super();
    }
}
