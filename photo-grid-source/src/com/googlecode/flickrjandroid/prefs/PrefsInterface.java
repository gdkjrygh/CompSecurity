// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.prefs;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.oauth.OAuthUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class PrefsInterface
{

    public static final String METHOD_GET_CONTENT_TYPE = "flickr.prefs.getContentType";
    public static final String METHOD_GET_GEO_PERMS = "flickr.prefs.getGeoPerms";
    public static final String METHOD_GET_HIDDEN = "flickr.prefs.getHidden";
    public static final String METHOD_GET_PRIVACY = "flickr.prefs.getPrivacy";
    public static final String METHOD_GET_SAFETY_LEVEL = "flickr.prefs.getSafetyLevel";
    private String apiKey;
    private String sharedSecret;
    private Transport transportAPI;

    public PrefsInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        transportAPI = transport;
    }

    public String getContentType()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.prefs.getContentType"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            return ((Response) (obj)).getData().getJSONObject("person").getString("content_type");
        }
    }

    public int getGeoPerms()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.prefs.getGeoPerms"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            return ((Response) (obj)).getData().getJSONObject("person").getInt("geoperms");
        }
    }

    public boolean getHidden()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.prefs.getHidden"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            return "1".equals(((Response) (obj)).getData().getJSONObject("person").getString("hidden"));
        }
    }

    public int getPrivacy()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.prefs.getPrivacy"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            return ((Response) (obj)).getData().getJSONObject("person").getInt("privacy");
        }
    }

    public String getSafetyLevel()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.prefs.getSafetyLevel"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = transportAPI.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            return ((Response) (obj)).getData().getJSONObject("person").getString("safety_level");
        }
    }
}
