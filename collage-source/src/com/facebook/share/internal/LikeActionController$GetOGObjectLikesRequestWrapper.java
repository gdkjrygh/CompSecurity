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
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

private class setRequest extends setRequest
    implements setRequest
{

    private final String objectId;
    private boolean objectIsLiked;
    private final com.facebook.share.widget.r.unlikeToken objectType;
    final LikeActionController this$0;
    private String unlikeToken;

    public String getUnlikeToken()
    {
        return unlikeToken;
    }

    public boolean isObjectLiked()
    {
        return objectIsLiked;
    }

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching like status for object '%s' with type '%s' : %s", new Object[] {
            objectId, objectType, facebookrequesterror
        });
        LikeActionController.access$2400(LikeActionController.this, "get_og_object_like", facebookrequesterror);
    }

    protected void processSuccess(GraphResponse graphresponse)
    {
        graphresponse = Utility.tryGetJSONArrayFromResponse(graphresponse.getJSONObject(), "data");
        if (graphresponse != null)
        {
            for (int i = 0; i < graphresponse.length(); i++)
            {
                JSONObject jsonobject = graphresponse.optJSONObject(i);
                if (jsonobject == null)
                {
                    continue;
                }
                objectIsLiked = true;
                JSONObject jsonobject1 = jsonobject.optJSONObject("application");
                AccessToken accesstoken = AccessToken.getCurrentAccessToken();
                if (jsonobject1 != null && accesstoken != null && Utility.areObjectsEqual(accesstoken.getApplicationId(), jsonobject1.optString("id")))
                {
                    unlikeToken = jsonobject.optString("id");
                }
            }

        }
    }

    (String s, com.facebook.share.widget.r r)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, s, r);
        objectIsLiked = LikeActionController.access$2500(LikeActionController.this);
        objectId = s;
        objectType = r;
        likeactioncontroller = new Bundle();
        putString("fields", "id,application");
        putString("object", objectId);
        setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", LikeActionController.this, HttpMethod.GET));
    }
}
