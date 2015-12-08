// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookapi;

import com.soundcloud.android.utils.ErrorUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.b;

// Referenced classes of package com.soundcloud.android.facebookapi:
//            FacebookApiResponse, FacebookApiHelper

public class FacebookApi
{

    private final FacebookApiHelper facebookApiHelper;

    public FacebookApi(FacebookApiHelper facebookapihelper)
    {
        facebookApiHelper = facebookapihelper;
    }

    private List extractFriendPictureUrls(FacebookApiResponse facebookapiresponse)
    {
        if (facebookapiresponse.isSuccess())
        {
            return extractPictureUrls(facebookapiresponse.getJSONObject());
        } else
        {
            return Collections.emptyList();
        }
    }

    private List extractPictureUrls(JSONObject jsonobject)
    {
        ArrayList arraylist;
        int i;
        i = 0;
        arraylist = new ArrayList();
        jsonobject = jsonobject.getJSONArray("data");
_L1:
        if (i >= jsonobject.length())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        JSONObject jsonobject1 = jsonobject.getJSONObject(i).getJSONObject("picture").getJSONObject("data");
        if (!jsonobject1.optBoolean("is_silhouette", false))
        {
            arraylist.add(jsonobject1.getString("url"));
        }
        i++;
          goto _L1
        jsonobject;
        ErrorUtils.handleSilentException(jsonobject);
        return arraylist;
    }

    public b friendPictureUrls()
    {
        if (!facebookApiHelper.hasAccessToken())
        {
            return b.just(Collections.emptyList());
        } else
        {
            return b.create(new _cls1());
        }
    }



    private class _cls1
        implements rx.b.f
    {

        final FacebookApi this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            FacebookApiResponse facebookapiresponse = facebookApiHelper.graphRequest(FacebookApiEndpoints.ME_FRIEND_PICTURES);
            x.onNext(extractFriendPictureUrls(facebookapiresponse));
            x.onCompleted();
        }

        _cls1()
        {
            this$0 = FacebookApi.this;
            super();
        }
    }

}
