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
import com.facebook.Session;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            LikeActionController, Logger, Utility

private class setRequest extends setRequest
{

    boolean objectIsLiked;
    final LikeActionController this$0;
    String unlikeToken;

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$1600(), "Error fetching like status for object '%s' : %s", new Object[] {
            objectId, facebookrequesterror
        });
        LikeActionController.access$2600(LikeActionController.this, "get_og_object_like", facebookrequesterror);
    }

    protected void processSuccess(Response response)
    {
        response = Utility.tryGetJSONArrayFromResponse(response.getGraphObject(), "data");
        if (response != null)
        {
            for (int i = 0; i < response.length(); i++)
            {
                JSONObject jsonobject = response.optJSONObject(i);
                if (jsonobject == null)
                {
                    continue;
                }
                objectIsLiked = true;
                JSONObject jsonobject1 = jsonobject.optJSONObject("application");
                if (jsonobject1 != null && Utility.areObjectsEqual(LikeActionController.access$2700(LikeActionController.this).getApplicationId(), jsonobject1.optString("id")))
                {
                    unlikeToken = jsonobject.optString("id");
                }
            }

        }
    }

    (String s)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, s);
        objectIsLiked = LikeActionController.access$2800(LikeActionController.this);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,application");
        bundle.putString("object", s);
        setRequest(new Request(LikeActionController.access$2700(LikeActionController.this), "me/og.likes", bundle, HttpMethod.GET));
    }
}
