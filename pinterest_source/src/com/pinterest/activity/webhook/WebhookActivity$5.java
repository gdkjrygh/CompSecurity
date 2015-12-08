// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import android.content.Intent;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Pin;
import java.util.List;

// Referenced classes of package com.pinterest.activity.webhook:
//            WebhookActivity

class nit> extends com.pinterest.api.remote.nse
{

    final WebhookActivity this$0;
    final boolean val$isAuthenticated;
    final List val$segmentsCopy;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        finish();
    }

    public void onSuccess(Pin pin)
    {
        super.onSuccess(pin);
        if (val$isAuthenticated && val$segmentsCopy.contains("repin"))
        {
            Intent intent = ActivityHelper.getRepinDialogIntent(WebhookActivity.this);
            intent.putExtra("com.pinterest.EXTRA_PIN_ID", pin.getUid());
            pin = intent;
        } else
        {
            pin = new Navigation(Location.PIN, pin);
            pin = ActivityHelper.getTaskIntent(WebhookActivity.this, pin);
        }
        startActivity(pin);
        WebhookActivity.access$100("pin");
        finish();
    }

    (List list)
    {
        this$0 = final_webhookactivity;
        val$isAuthenticated = Z.this;
        val$segmentsCopy = list;
        super(final_flag);
    }
}
