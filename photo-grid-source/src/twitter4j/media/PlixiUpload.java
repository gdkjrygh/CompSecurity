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
import twitter4j.internal.logging.Logger;

// Referenced classes of package twitter4j.media:
//            AbstractImageUploadImpl

class PlixiUpload extends AbstractImageUploadImpl
{

    public PlixiUpload(Configuration configuration, String s, OAuthAuthorization oauthauthorization)
    {
        super(configuration, s, oauthauthorization);
        logger.warn("Lockerz is no longer providing API.");
        uploadUrl = "http://api.plixi.com/api/upload.aspx";
    }

    protected String postUpload()
    {
        if (httpResponse.getStatusCode() != 201)
        {
            throw new TwitterException("Plixi image upload returned invalid status code", httpResponse);
        }
        String s = httpResponse.asString();
        if (s.contains("<Error><ErrorCode>"))
        {
            s = s.substring(s.indexOf("<ErrorCode>") + 11, s.lastIndexOf("</ErrorCode>"));
            throw new TwitterException((new StringBuilder("Plixi image upload failed with this error message: ")).append(s).toString(), httpResponse);
        }
        if (s.contains("<Status>OK</Status>"))
        {
            return s.substring(s.indexOf("<MediaUrl>") + 10, s.indexOf("</MediaUrl>"));
        } else
        {
            throw new TwitterException("Unknown Plixi response", httpResponse);
        }
    }

    protected void preUpload()
    {
        String s = generateVerifyCredentialsAuthorizationHeader("https://api.twitter.com/1.1/account/verify_credentials.json");
        headers.put("X-Auth-Service-Provider", "https://api.twitter.com/1.1/account/verify_credentials.json");
        headers.put("X-Verify-Credentials-Authorization", s);
        if (apiKey == null)
        {
            throw new IllegalStateException("No API Key for Plixi specified. put media.providerAPIKey in twitter4j.properties.");
        }
        HttpParameter ahttpparameter1[] = new HttpParameter[2];
        ahttpparameter1[0] = new HttpParameter("api_key", apiKey);
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
