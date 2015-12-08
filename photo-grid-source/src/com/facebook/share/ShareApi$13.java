// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share;

import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.share.model.SharePhoto;
import org.json.JSONException;
import org.json.JSONObject;

final class val.photo
    implements com.facebook..Callback
{

    final com.facebook.internal.pper.OnMapValueCompleteListener val$onPhotoStagedListener;
    final SharePhoto val$photo;

    public final void onCompleted(GraphResponse graphresponse)
    {
        Object obj = graphresponse.getError();
        if (obj != null)
        {
            String s1 = ((FacebookRequestError) (obj)).getErrorMessage();
            obj = s1;
            if (s1 == null)
            {
                obj = "Error staging photo.";
            }
            val$onPhotoStagedListener.onError(new FacebookGraphResponseException(graphresponse, ((String) (obj))));
            return;
        }
        graphresponse = graphresponse.getJSONObject();
        if (graphresponse == null)
        {
            val$onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
            return;
        }
        graphresponse = graphresponse.optString("uri");
        if (graphresponse == null)
        {
            val$onPhotoStagedListener.onError(new FacebookException("Error staging photo."));
            return;
        }
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("url", graphresponse);
            ((JSONObject) (obj)).put("user_generated", val$photo.getUserGenerated());
        }
        // Misplaced declaration of an exception variable
        catch (GraphResponse graphresponse)
        {
            String s = graphresponse.getLocalizedMessage();
            graphresponse = s;
            if (s == null)
            {
                graphresponse = "Error staging photo.";
            }
            val$onPhotoStagedListener.onError(new FacebookException(graphresponse));
            return;
        }
        val$onPhotoStagedListener.onComplete(obj);
    }

    hoto()
    {
        val$onPhotoStagedListener = onmapvaluecompletelistener;
        val$photo = sharephoto;
        super();
    }
}
