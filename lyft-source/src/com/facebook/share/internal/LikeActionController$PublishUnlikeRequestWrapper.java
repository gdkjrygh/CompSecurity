// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class setRequest extends setRequest
{

    final LikeActionController this$0;
    private String unlikeToken;

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error unliking object with unlike token '%s' : %s", new Object[] {
            unlikeToken, facebookrequesterror
        });
        LikeActionController.access$2400(LikeActionController.this, "publish_unlike", facebookrequesterror);
    }

    protected void processSuccess(GraphResponse graphresponse)
    {
    }

    (String s)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, null, null);
        unlikeToken = s;
        setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), s, null, HttpMethod.DELETE));
    }
}
