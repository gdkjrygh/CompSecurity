// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Interest;

// Referenced classes of package com.pinterest.activity.webhook:
//            WebhookActivity

class ResponseHandler extends com.pinterest.api.remote.estApiResponseHandler
{

    final WebhookActivity this$0;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        WebhookActivity.access$300(WebhookActivity.this);
    }

    public void onSuccess(Interest interest)
    {
        if (interest != null)
        {
            interest = new Navigation(Location.INTEREST, interest);
            WebhookActivity.access$200(WebhookActivity.this, interest);
        }
        finish();
    }

    ResponseHandler(boolean flag)
    {
        this$0 = WebhookActivity.this;
        super(flag);
    }
}
