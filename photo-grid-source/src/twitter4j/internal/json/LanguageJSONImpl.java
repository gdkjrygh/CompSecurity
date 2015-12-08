// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.json;

import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONArray;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.internal.json:
//            DataObjectFactoryUtil, ResponseListImpl

public class LanguageJSONImpl
    implements twitter4j.api.HelpResources.Language
{

    private String code;
    private String name;
    private String status;

    LanguageJSONImpl(JSONObject jsonobject)
    {
        init(jsonobject);
    }

    static ResponseList createLanguageList(HttpResponse httpresponse, Configuration configuration)
    {
        return createLanguageList(httpresponse.asJSONArray(), httpresponse, configuration);
    }

    static ResponseList createLanguageList(JSONArray jsonarray, HttpResponse httpresponse, Configuration configuration)
    {
        int i;
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.clearThreadLocalMap();
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
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            throw jsonarray;
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
            DataObjectFactoryUtil.registerJSONObject(languagejsonimpl, jsonobject);
        }
        break MISSING_BLOCK_LABEL_114;
        if (configuration.isJSONStoreEnabled())
        {
            DataObjectFactoryUtil.registerJSONObject(httpresponse, jsonarray);
        }
        return httpresponse;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void init(JSONObject jsonobject)
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
