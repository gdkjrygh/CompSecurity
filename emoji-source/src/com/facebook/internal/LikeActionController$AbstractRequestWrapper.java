// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.RequestBatch;
import com.facebook.Response;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Logger

private abstract class objectId
{

    FacebookRequestError error;
    protected String objectId;
    private Request request;
    final LikeActionController this$0;

    void addToBatch(RequestBatch requestbatch)
    {
        requestbatch.add(request);
    }

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$1500(), "Error running request for object '%s' : %s", new Object[] {
            objectId, facebookrequesterror
        });
    }

    protected abstract void processSuccess(Response response);

    protected void setRequest(Request request1)
    {
        request = request1;
        request1.setVersion("v2.2");
        request1.setCallback(new com.facebook.Request.Callback() {

            final LikeActionController.AbstractRequestWrapper this$1;

            public void onCompleted(Response response)
            {
                error = response.getError();
                if (error != null)
                {
                    processError(error);
                    return;
                } else
                {
                    processSuccess(response);
                    return;
                }
            }

            
            {
                this$1 = LikeActionController.AbstractRequestWrapper.this;
                super();
            }
        });
    }

    protected _cls1.this._cls1(String s)
    {
        this$0 = LikeActionController.this;
        super();
        objectId = s;
    }
}
