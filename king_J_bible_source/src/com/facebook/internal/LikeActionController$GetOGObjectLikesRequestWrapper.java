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
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$1(), "Error fetching like status for object '%s' : %s", new Object[] {
            objectId, facebookrequesterror
        });
        LikeActionController.access$2(LikeActionController.this, "get_og_object_like", facebookrequesterror);
    }

    protected void processSuccess(Response response)
    {
        response = Utility.tryGetJSONArrayFromResponse(response.getGraphObject(), "data");
        if (response == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L5:
        if (i < response.length()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        JSONObject jsonobject = response.optJSONObject(i);
        if (jsonobject != null)
        {
            objectIsLiked = true;
            JSONObject jsonobject1 = jsonobject.optJSONObject("application");
            if (jsonobject1 != null && Utility.areObjectsEqual(LikeActionController.access$0(LikeActionController.this).getApplicationId(), jsonobject1.optString("id")))
            {
                unlikeToken = jsonobject.optString("id");
            }
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    (String s)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, s);
        objectIsLiked = LikeActionController.access$3(LikeActionController.this);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,application");
        bundle.putString("object", s);
        setRequest(new Request(LikeActionController.access$0(LikeActionController.this), "me/og.likes", bundle, HttpMethod.GET));
    }
}
