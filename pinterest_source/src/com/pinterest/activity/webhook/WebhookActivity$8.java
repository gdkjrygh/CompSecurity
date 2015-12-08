// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import android.net.Uri;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.appwidget.PWidgetHelper;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;

// Referenced classes of package com.pinterest.activity.webhook:
//            WebhookActivity

class val.uri extends BaseApiResponseHandler
{

    final WebhookActivity this$0;
    final Uri val$uri;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        CrashReporting.a(throwable);
        WebhookActivity.access$300(WebhookActivity.this);
    }

    public void onSuccess(ApiResponse apiresponse)
    {
        super.onSuccess(apiresponse);
        apiresponse = (PinterestJsonObject)apiresponse.getData();
        if (apiresponse == null)
        {
            class _cls1 extends com.pinterest.api.remote.MyUserApi.MyUserApiResponse
            {

                final WebhookActivity._cls8 this$1;

                public void onFailure(Throwable throwable, ApiResponse apiresponse1)
                {
                    super.onFailure(throwable, apiresponse1);
                    WebhookActivity.access$300(this$0);
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
                    WebhookActivity.access$300(this$0);
                }

            _cls1()
            {
                this$1 = WebhookActivity._cls8.this;
                super();
            }
            }

            try
            {
                onFailure(new Throwable(""), new PinterestJsonObject());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ApiResponse apiresponse)
            {
                onFailure(new Throwable(""), new PinterestJsonObject());
            }
            break MISSING_BLOCK_LABEL_96;
        }
        MyUser.setAccessToken(apiresponse.a("access_token", ""));
        MyUserApi.a(new _cls1(), WebhookActivity.access$600(WebhookActivity.this));
        PWidgetHelper.notifyWidgetStateChange(WebhookActivity.this);
        return;
    }

    _cls1()
    {
        this$0 = final_webhookactivity;
        val$uri = Uri.this;
        super();
    }
}
