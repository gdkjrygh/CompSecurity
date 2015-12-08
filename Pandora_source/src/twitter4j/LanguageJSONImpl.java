// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j:
//            TwitterException, HttpResponse, JSONException, TwitterObjectFactory, 
//            JSONArray, ResponseListImpl, ResponseList, JSONObject

public class LanguageJSONImpl
    implements twitter4j.api.HelpResources.Language
{

    private String code;
    private String name;
    private String status;

    LanguageJSONImpl(JSONObject jsonobject)
        throws TwitterException
    {
        init(jsonobject);
    }

    static ResponseList createLanguageList(HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        return createLanguageList(httpresponse.asJSONArray(), httpresponse, configuration);
    }

    static ResponseList createLanguageList(JSONArray jsonarray, HttpResponse httpresponse, Configuration configuration)
        throws TwitterException
    {
        int i;
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.clearThreadLocalMap();
        }
        JSONObject jsonobject;
        LanguageJSONImpl languagejsonimpl;
        int j;
        try
        {
            j = jsonarray.length();
            httpresponse = new ResponseListImpl(j, httpresponse);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw new TwitterException(jsonarray);
        }
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        jsonobject = jsonarray.getJSONObject(i);
        languagejsonimpl = new LanguageJSONImpl(jsonobject);
        httpresponse.add(languagejsonimpl);
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(languagejsonimpl, jsonobject);
        }
        break MISSING_BLOCK_LABEL_111;
        if (configuration.isJSONStoreEnabled())
        {
            TwitterObjectFactory.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void init(JSONObject jsonobject)
        throws TwitterException
    {
        try
        {
            name = jsonobject.getString("name");
            code = jsonobject.getString("code");
            status = jsonobject.getString("status");
            return;
        }
        catch (JSONException jsonexception)
        {
            throw new TwitterException((new StringBuilder()).append(jsonexception.getMessage()).append(":").append(jsonobject.toString()).toString(), jsonexception);
        }
    }

    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public String getStatus()
    {
        return status;
    }
}
