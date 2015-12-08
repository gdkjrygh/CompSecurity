// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import twitter4j.RateLimitStatus;
import twitter4j.ResponseList;
import twitter4j.SimilarPlaces;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            ResponseListImpl, PlaceJSONImpl

public class SimilarPlacesImpl extends ResponseListImpl
    implements SimilarPlaces
{

    private static final long serialVersionUID = 0x92655a9befea1fc5L;
    private final String token;

    SimilarPlacesImpl(ResponseList responselist, HttpResponse httpresponse, String s)
    {
        super(responselist.size(), httpresponse);
        addAll(responselist);
        token = s;
    }

    static SimilarPlaces createSimilarPlaces(HttpResponse httpresponse, Configuration configuration)
    {
        JSONObject jsonobject = null;
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        try
        {
            jsonobject1 = httpresponse.asJSONObject();
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            throw new TwitterException((new StringBuilder()).append(httpresponse.getMessage()).append(":").append(jsonobject.toString()).toString(), httpresponse);
        }
        jsonobject = jsonobject1;
        jsonobject2 = jsonobject1.getJSONObject("result");
        jsonobject = jsonobject1;
        httpresponse = new SimilarPlacesImpl(PlaceJSONImpl.createPlaceList(jsonobject2.getJSONArray("places"), httpresponse, configuration), httpresponse, jsonobject2.getString("token"));
        return httpresponse;
    }

    public volatile int getAccessLevel()
    {
        return super.getAccessLevel();
    }

    public volatile RateLimitStatus getRateLimitStatus()
    {
        return super.getRateLimitStatus();
    }

    public String getToken()
    {
        return token;
    }
}
