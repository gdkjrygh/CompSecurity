// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.Response;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Logger

class setRequest extends setRequest
{

    final LikeActionController this$0;
    private String unlikeToken;

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$1500(), "Error unliking object with unlike token '%s' : %s", new Object[] {
            unlikeToken, facebookrequesterror
        });
        LikeActionController.access$2600(LikeActionController.this, "publish_unlike", facebookrequesterror);
    }

    protected void processSuccess(Response response)
    {
    }

    (String s)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, null);
        unlikeToken = s;
        setRequest(new Request(LikeActionController.access$2700(LikeActionController.this), s, null, HttpMethod.DELETE));
    }
}
