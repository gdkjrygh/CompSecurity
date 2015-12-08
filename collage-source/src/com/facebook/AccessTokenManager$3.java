// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            AccessTokenManager, GraphResponse

class freshResult
    implements 
{

    final AccessTokenManager this$0;
    final freshResult val$refreshResult;

    public void onCompleted(GraphResponse graphresponse)
    {
        graphresponse = graphresponse.getJSONObject();
        if (graphresponse == null)
        {
            return;
        } else
        {
            val$refreshResult.accessToken = graphresponse.optString("access_token");
            val$refreshResult.expiresAt = graphresponse.optInt("expires_at");
            return;
        }
    }

    freshResult()
    {
        this$0 = final_accesstokenmanager;
        val$refreshResult = freshResult.this;
        super();
    }
}
