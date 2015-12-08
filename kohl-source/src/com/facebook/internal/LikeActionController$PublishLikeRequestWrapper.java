// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.Response;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Logger, Utility

private class setRequest extends setRequest
{

    final LikeActionController this$0;
    String unlikeToken;

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        if (facebookrequesterror.getErrorCode() == 3501)
        {
            error = null;
            return;
        } else
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$1600(), "Error liking object '%s' : %s", new Object[] {
                objectId, facebookrequesterror
            });
            LikeActionController.access$2600(LikeActionController.this, "publish_like", facebookrequesterror);
            return;
        }
    }

    protected void processSuccess(Response response)
    {
        unlikeToken = Utility.safeGetStringFromResponse(response.getGraphObject(), "id");
    }

    (String s)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, s);
        Bundle bundle = new Bundle();
        bundle.putString("object", s);
        setRequest(new Request(LikeActionController.access$2700(LikeActionController.this), "me/og.likes", bundle, HttpMethod.POST));
    }
}
