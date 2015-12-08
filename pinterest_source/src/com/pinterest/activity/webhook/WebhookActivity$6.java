// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import android.content.Intent;
import android.net.Uri;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.User;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.kit.utils.OcfUtils;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.webhook:
//            WebhookActivity

class <init> extends com.pinterest.api.remote.ponse
{

    final WebhookActivity this$0;
    final Uri val$uri;

    public void onFailure(Throwable throwable, PinterestJsonObject pinterestjsonobject)
    {
        if (!NetworkUtils.getInstance().hasInternet())
        {
            super.onFailure(throwable, pinterestjsonobject);
            finish();
            return;
        }
        throwable = val$uri;
        if (val$uri.getScheme().equalsIgnoreCase("pinterest"))
        {
            throwable = Uri.parse(val$uri.toString().replaceFirst("pinterest", "https"));
        }
        ActivityHelper.gotoBrowser(WebhookActivity.this, throwable);
    }

    public void onSuccess(User user)
    {
        super.onSuccess(user);
        user = new Navigation(Location.USER, user);
        Intent intent = ActivityHelper.getHomeIntent(WebhookActivity.this);
        intent.putExtra("com.pinterest.EXTRA_PENDING_TASK", user);
        OcfUtils.addOcfFlag(intent, WebhookActivity.access$400(WebhookActivity.this));
        WebhookActivity.access$402(WebhookActivity.this, false);
        startActivity(intent);
        WebhookActivity.access$100("user");
        finish();
    }

    (Uri uri1)
    {
        this$0 = final_webhookactivity;
        val$uri = uri1;
        super(Z.this);
    }
}
