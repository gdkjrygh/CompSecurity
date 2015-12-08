// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class setRequest extends setRequest
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
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error liking object '%s' with type '%s' : %s", new Object[] {
                objectId, objectType, facebookrequesterror
            });
            LikeActionController.access$2400(LikeActionController.this, "publish_like", facebookrequesterror);
            return;
        }
    }

    protected void processSuccess(GraphResponse graphresponse)
    {
        unlikeToken = Utility.safeGetStringFromResponse(graphresponse.getJSONObject(), "id");
    }

    (String s, com.facebook.share.widget.r r)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, s, r);
        likeactioncontroller = new Bundle();
        putString("object", s);
        setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", LikeActionController.this, HttpMethod.POST));
    }
}
