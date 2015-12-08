// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.media;

import java.util.Map;
import twitter4j.TwitterException;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpParameter;
import twitter4j.internal.http.HttpResponse;
import twitter4j.internal.org.json.JSONException;
import twitter4j.internal.org.json.JSONObject;

// Referenced classes of package twitter4j.media:
//            AbstractImageUploadImpl

class TwitpicUpload extends AbstractImageUploadImpl
{

    public TwitpicUpload(Configuration configuration, String s, OAuthAuthorization oauthauthorization)
    {
        super(configuration, s, oauthauthorization);
    }

    protected String postUpload()
    {
label0:
        {
            if (httpResponse.getStatusCode() != 200)
            {
                throw new TwitterException("Twitpic image upload returned invalid status code", httpResponse);
            }
            String s = httpResponse.asString();
            Object obj;
            try
            {
                obj = new JSONObject(s);
                if (((JSONObject) (obj)).isNull("url"))
                {
                    break label0;
                }
                obj = ((JSONObject) (obj)).getString("url");
            }
            catch (JSONException jsonexception)
            {
                throw new TwitterException((new StringBuilder("Invalid Twitpic response: ")).append(s).toString(), jsonexception);
            }
            return ((String) (obj));
        }
        throw new TwitterException("Unknown Twitpic response", httpResponse);
    }

    protected void preUpload()
    {
        uploadUrl = "https://twitpic.com/api/2/upload.json";
        String s = generateVerifyCredentialsAuthorizationHeader("https://api.twitter.com/1.1/account/verify_credentials.json");
        headers.put("X-Auth-Service-Provider", "https://api.twitter.com/1.1/account/verify_credentials.json");
        headers.put("X-Verify-Credentials-Authorization", s);
        if (apiKey == null)
        {
            throw new IllegalStateException("No API Key for Twitpic specified. put media.providerAPIKey in twitter4j.properties.");
        }
        HttpParameter ahttpparameter1[] = new HttpParameter[2];
        ahttpparameter1[0] = new HttpParameter("key", apiKey);
        ahttpparameter1[1] = image;
        HttpParameter ahttpparameter[] = ahttpparameter1;
        if (message != null)
        {
            ahttpparameter = appendHttpParameters(new HttpParameter[] {
                message
            }, ahttpparameter1);
        }
        postParameter = ahttpparameter;
    }
}
