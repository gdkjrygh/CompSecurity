// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

abstract class objectType
{

    FacebookRequestError error;
    protected String objectId;
    protected com.facebook.share.widget.r objectType;
    private GraphRequest request;
    final LikeActionController this$0;

    void addToBatch(GraphRequestBatch graphrequestbatch)
    {
        graphrequestbatch.add(request);
    }

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error running request for object '%s' with type '%s' : %s", new Object[] {
            objectId, objectType, facebookrequesterror
        });
    }

    protected abstract void processSuccess(GraphResponse graphresponse);

    protected void setRequest(GraphRequest graphrequest)
    {
        request = graphrequest;
        graphrequest.setVersion("v2.3");
        class _cls1
            implements com.facebook.GraphRequest.Callback
        {

            final LikeActionController.AbstractRequestWrapper this$1;

            public void onCompleted(GraphResponse graphresponse)
            {
                error = graphresponse.getError();
                if (error != null)
                {
                    processError(error);
                    return;
                } else
                {
                    processSuccess(graphresponse);
                    return;
                }
            }

            _cls1()
            {
                this$1 = LikeActionController.AbstractRequestWrapper.this;
                super();
            }
        }

        graphrequest.setCallback(new _cls1());
    }

    protected _cls1(String s, com.facebook.share.widget.r r)
    {
        this$0 = LikeActionController.this;
        super();
        objectId = s;
        objectType = r;
    }
}
