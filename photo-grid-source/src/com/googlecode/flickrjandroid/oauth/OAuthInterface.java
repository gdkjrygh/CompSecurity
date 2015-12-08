// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.oauth;

import com.googlecode.flickrjandroid.FlickrException;
import com.googlecode.flickrjandroid.Parameter;
import com.googlecode.flickrjandroid.REST;
import com.googlecode.flickrjandroid.RequestContext;
import com.googlecode.flickrjandroid.Response;
import com.googlecode.flickrjandroid.Transport;
import com.googlecode.flickrjandroid.auth.Permission;
import com.googlecode.flickrjandroid.people.User;
import com.googlecode.flickrjandroid.util.UrlUtilities;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.googlecode.flickrjandroid.oauth:
//            OAuthToken, OAuthTokenParameter, OAuthUtils, OAuth

public class OAuthInterface
{

    public static final String KEY_OAUTH_CALLBACK_CONFIRMED = "oauth_callback_confirmed";
    public static final String KEY_OAUTH_TOKEN = "oauth_token";
    public static final String KEY_OAUTH_TOKEN_SECRET = "oauth_token_secret";
    public static final String KEY_OAUTH_VERIFIER = "oauth_verifier";
    public static final String METHOD_TEST_LOGIN = "flickr.test.login";
    public static final String PARAM_OAUTH_CONSUMER_KEY = "oauth_consumer_key";
    public static final String PARAM_OAUTH_TOKEN = "oauth_token";
    public static final String PATH_OAUTH_ACCESS_TOKEN = "/services/oauth/access_token";
    public static final String PATH_OAUTH_REQUEST_TOKEN = "/services/oauth/request_token";
    public static final String PATH_REST = "/services/rest";
    public static final String URL_ACCESS_TOKEN = "https://api.flickr.com/services/oauth/access_token";
    public static final String URL_REQUEST_TOKEN = "https://api.flickr.com/services/oauth/request_token";
    public static final String URL_REST = "https://api.flickr.com/services/rest";
    private String apiKey;
    private REST oauthTransport;
    private String sharedSecret;

    public OAuthInterface(String s, String s1, Transport transport)
    {
        apiKey = s;
        sharedSecret = s1;
        oauthTransport = (REST)transport;
    }

    public URL buildAuthenticationUrl(Permission permission, OAuthToken oauthtoken)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("oauth_token", oauthtoken.getOauthToken()));
        if (permission != null)
        {
            arraylist.add(new Parameter("perms", permission.toString()));
        }
        return UrlUtilities.buildUrl("api.flickr.com", oauthTransport.getPort(), "/services/oauth/authorize", arraylist);
    }

    public OAuth getAccessToken(String s, String s1, String s2)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new Parameter("oauth_consumer_key", apiKey));
        arraylist.add(new OAuthTokenParameter(s));
        arraylist.add(new Parameter("oauth_verifier", s2));
        OAuthUtils.addBasicOAuthParams(arraylist);
        arraylist.add(new Parameter("oauth_signature", OAuthUtils.getSignature("POST", "https://api.flickr.com/services/oauth/access_token", arraylist, sharedSecret, s1)));
        s = oauthTransport.getMapData(false, "/services/oauth/access_token", arraylist);
        if (s.isEmpty())
        {
            throw new FlickrException("Empty Response", "Empty Response");
        } else
        {
            s1 = new OAuth();
            s2 = new User();
            s2.setId((String)s.get("user_nsid"));
            s2.setUsername((String)s.get("username"));
            s2.setRealName((String)s.get("fullname"));
            s1.setUser(s2);
            s1.setToken(new OAuthToken((String)s.get("oauth_token"), (String)s.get("oauth_token_secret")));
            RequestContext.getRequestContext().setOAuth(s1);
            return s1;
        }
    }

    public OAuthToken getRequestToken(String s)
    {
        Object obj = s;
        if (s == null)
        {
            obj = "oob";
        }
        s = new ArrayList();
        s.add(new Parameter("oauth_callback", obj));
        s.add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addBasicOAuthParams(s);
        s.add(new Parameter("oauth_signature", OAuthUtils.getSignature("GET", "https://api.flickr.com/services/oauth/request_token", s, sharedSecret, null)));
        obj = oauthTransport.getMapData(true, "/services/oauth/request_token", s);
        if (((Map) (obj)).isEmpty())
        {
            throw new FlickrException("Empty Response", "Empty Response");
        }
        if (!((Map) (obj)).containsKey("oauth_callback_confirmed") || !Boolean.valueOf((String)((Map) (obj)).get("oauth_callback_confirmed")).booleanValue())
        {
            throw new FlickrException("Error", (new StringBuilder("Invalid response: ")).append(obj).toString());
        } else
        {
            s = (String)((Map) (obj)).get("oauth_token");
            obj = (String)((Map) (obj)).get("oauth_token_secret");
            OAuth oauth = new OAuth();
            oauth.setToken(new OAuthToken(s, ((String) (obj))));
            return oauth.getToken();
        }
    }

    public User testLogin()
    {
        Object obj = new ArrayList();
        ((List) (obj)).add(new Parameter("method", "flickr.test.login"));
        ((List) (obj)).add(new Parameter("oauth_consumer_key", apiKey));
        OAuthUtils.addOAuthToken(((List) (obj)));
        obj = oauthTransport.postJSON(sharedSecret, ((List) (obj)));
        if (((Response) (obj)).isError())
        {
            throw new FlickrException(((Response) (obj)).getErrorCode(), ((Response) (obj)).getErrorMessage());
        } else
        {
            Object obj1 = ((Response) (obj)).getData().getJSONObject("user");
            obj = ((JSONObject) (obj1)).getString("id");
            obj1 = ((JSONObject) (obj1)).getJSONObject("username").getString("_content");
            User user = new User();
            user.setId(((String) (obj)));
            user.setUsername(((String) (obj1)));
            return user;
        }
    }
}
