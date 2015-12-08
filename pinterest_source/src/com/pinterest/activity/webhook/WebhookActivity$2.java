// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.activity.webhook:
//            WebhookActivity

class this._cls0 extends ApiResponseHandler
{

    final WebhookActivity this$0;

    private void doOnError()
    {
        WebhookActivity.access$300(WebhookActivity.this);
    }

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        doOnError();
    }

    public void onSuccess(final PinterestJsonObject response)
    {
        super.onSuccess(response);
        class _cls1 extends BackgroundTask
        {

            final WebhookActivity._cls2 this$1;
            final PinterestJsonObject val$response;

            public void run()
            {
                Object obj;
                obj = response.c("data");
                if (obj == null)
                {
                    doOnError();
                    return;
                }
                obj = Story.make(((PinterestJsonObject) (obj)));
                int i;
                if (obj == null || ((Story) (obj)).getMainObjectType() == null)
                {
                    i = -1;
                } else
                {
                    i = ((Story) (obj)).getMainObjectType().intValue();
                }
                i;
                JVM INSTR tableswitch 0 2: default 68
            //                           0 87
            //                           1 116
            //                           2 131;
                   goto _L1 _L2 _L3 _L4
_L1:
                doOnError();
                return;
_L2:
                obj = new Navigation(Location.STORY_PINS, ((com.pinterest.api.model.Model) (obj)));
_L6:
                WebhookActivity.access$100("news");
                WebhookActivity.access$200(this$0, ((Navigation) (obj)));
                return;
_L3:
                obj = new Navigation(Location.STORY_BOARDS, ((com.pinterest.api.model.Model) (obj)));
                continue; /* Loop/switch isn't completed */
_L4:
                obj = new Navigation(Location.STORY_USERS, ((com.pinterest.api.model.Model) (obj)));
                if (true) goto _L6; else goto _L5
_L5:
            }

            _cls1()
            {
                this$1 = WebhookActivity._cls2.this;
                response = pinterestjsonobject;
                super();
            }
        }

        (new _cls1()).execute();
    }


    _cls1()
    {
        this$0 = WebhookActivity.this;
        super();
    }
}
