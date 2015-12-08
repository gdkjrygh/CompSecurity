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

class setRequest extends setRequest
{

    String likeCountStringWithLike;
    String likeCountStringWithoutLike;
    String socialSentenceStringWithLike;
    String socialSentenceStringWithoutLike;
    final LikeActionController this$0;

    protected void processError(FacebookRequestError facebookrequesterror)
    {
        Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching engagement for object '%s' with type '%s' : %s", new Object[] {
            objectId, objectType, facebookrequesterror
        });
        LikeActionController.access$2400(LikeActionController.this, "get_engagement", facebookrequesterror);
    }

    protected void processSuccess(GraphResponse graphresponse)
    {
        graphresponse = Utility.tryGetJSONObjectFromResponse(graphresponse.getJSONObject(), "engagement");
        if (graphresponse != null)
        {
            likeCountStringWithLike = graphresponse.optString("count_string_with_like", likeCountStringWithLike);
            likeCountStringWithoutLike = graphresponse.optString("count_string_without_like", likeCountStringWithoutLike);
            socialSentenceStringWithLike = graphresponse.optString("social_sentence_with_like", socialSentenceStringWithLike);
            socialSentenceStringWithoutLike = graphresponse.optString("social_sentence_without_like", socialSentenceStringWithoutLike);
        }
    }

    (String s, com.facebook.share.widget.r r)
    {
        this$0 = LikeActionController.this;
        super(LikeActionController.this, s, r);
        likeCountStringWithLike = LikeActionController.access$700(LikeActionController.this);
        likeCountStringWithoutLike = LikeActionController.access$800(LikeActionController.this);
        socialSentenceStringWithLike = LikeActionController.access$900(LikeActionController.this);
        socialSentenceStringWithoutLike = LikeActionController.access$1000(LikeActionController.this);
        likeactioncontroller = new Bundle();
        putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
        setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), s, LikeActionController.this, HttpMethod.GET));
    }
}
