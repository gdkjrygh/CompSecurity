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
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

private class setRequest extends setRequest
{

    final LikeActionController this$0;
    String verifiedObjectId;

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        if (facebookrequesterror.getErrorMessage().contains("og_object"))
        {
            error = null;
            return;
        } else
        {
            Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] {
                objectId, objectType, facebookrequesterror
            });
            return;
        }
    }

    protected void processSuccess(GraphResponse graphresponse)
    {
        graphresponse = Utility.tryGetJSONObjectFromResponse(graphresponse.getJSONObject(), objectId);
        if (graphresponse != null)
        {
            graphresponse = graphresponse.optJSONObject("og_object");
            if (graphresponse != null)
            {
                verifiedObjectId = graphresponse.optString("id");
            }
        }
    }

    (String s, com.facebook.share.widget.r r)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, s, r);
        likeactioncontroller = new Bundle();
        putString("fields", "og_object.fields(id)");
        putString("ids", s);
        setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "", LikeActionController.this, HttpMethod.GET));
    }
}
