// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import android.net.Uri;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.User;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.webhook:
//            WebhookActivity

class e extends com.pinterest.api.remote.esponse
{

    final is._cls0 this$1;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        WebhookActivity.access$300(_fld0);
    }

    public void onSuccess(User user)
    {
        super.onSuccess(user);
        user = uri.getQueryParameter("next");
        if (StringUtils.isNotEmpty(user))
        {
            user = Uri.parse(user);
            if (user != null)
            {
                init(user);
                return;
            }
        }
        WebhookActivity.access$300(_fld0);
    }

    e()
    {
        this$1 = this._cls1.this;
        super();
    }
}
