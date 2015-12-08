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

// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

private class setRequest extends setRequest
    implements setRequest
{

    private boolean objectIsLiked;
    private String pageId;
    final LikeActionController this$0;

    public String getUnlikeToken()
    {
        return null;
    }

    public boolean isObjectLiked()
    {
        return objectIsLiked;
    }

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching like status for page id '%s': %s", new Object[] {
            pageId, facebookrequesterror
        });
        LikeActionController.access$2400(LikeActionController.this, "get_page_like", facebookrequesterror);
    }

    protected void processSuccess(GraphResponse graphresponse)
    {
        graphresponse = Utility.tryGetJSONArrayFromResponse(graphresponse.getJSONObject(), "data");
        if (graphresponse != null && graphresponse.length() > 0)
        {
            objectIsLiked = true;
        }
    }

    Q(String s)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, s, com.facebook.share.widget.nit>);
        objectIsLiked = LikeActionController.access$2500(LikeActionController.this);
        pageId = s;
        likeactioncontroller = new Bundle();
        putString("fields", "id");
        setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), (new StringBuilder()).append("me/likes/").append(s).toString(), LikeActionController.this, HttpMethod.GET));
    }
}
