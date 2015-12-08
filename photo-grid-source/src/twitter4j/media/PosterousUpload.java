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

class PosterousUpload extends AbstractImageUploadImpl
{

    public PosterousUpload(Configuration configuration, OAuthAuthorization oauthauthorization)
    {
        super(configuration, oauthauthorization);
    }

    protected String postUpload()
    {
label0:
        {
            if (httpResponse.getStatusCode() != 200)
            {
                throw new TwitterException("Posterous image upload returned invalid status code", httpResponse);
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
                throw new TwitterException((new StringBuilder("Invalid Posterous response: ")).append(s).toString(), jsonexception);
            }
            return ((String) (obj));
        }
        throw new TwitterException("Unknown Posterous response", httpResponse);
    }

    protected void preUpload()
    {
        uploadUrl = "http://posterous.com/api2/upload.json";
        String s = generateVerifyCredentialsAuthorizationHeader("https://api.twitter.com/1/account/verify_credentials.json");
        headers.put("X-Auth-Service-Provider", "https://api.twitter.com/1/account/verify_credentials.json");
        headers.put("X-Verify-Credentials-Authorization", s);
        HttpParameter ahttpparameter1[] = new HttpParameter[1];
        ahttpparameter1[0] = image;
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
