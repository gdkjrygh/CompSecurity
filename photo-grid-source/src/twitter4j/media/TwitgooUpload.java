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

// Referenced classes of package twitter4j.media:
//            AbstractImageUploadImpl

class TwitgooUpload extends AbstractImageUploadImpl
{

    public TwitgooUpload(Configuration configuration, OAuthAuthorization oauthauthorization)
    {
        super(configuration, oauthauthorization);
    }

    protected String postUpload()
    {
        if (httpResponse.getStatusCode() != 200)
        {
            throw new TwitterException("Twitgoo image upload returned invalid status code", httpResponse);
        }
        String s = httpResponse.asString();
        if (s.contains("<rsp status=\"ok\">"))
        {
            int i = s.indexOf("<mediaurl>");
            if (i != -1)
            {
                int k = s.indexOf("</mediaurl>", "<mediaurl>".length() + i);
                if (k != -1)
                {
                    return s.substring("<mediaurl>".length() + i, k);
                }
            }
        } else
        if (s.contains("<rsp status=\"fail\">"))
        {
            int j = s.indexOf("msg=\"");
            if (j != -1)
            {
                int l = s.indexOf("\"", "msg=\"".length() + j);
                if (l != -1)
                {
                    s = s.substring("msg=\"".length() + j, l);
                    throw new TwitterException((new StringBuilder("Invalid Twitgoo response: ")).append(s).toString());
                }
            }
        }
        throw new TwitterException("Unknown Twitgoo response", httpResponse);
    }

    protected void preUpload()
    {
        uploadUrl = "http://twitgoo.com/api/uploadAndPost";
        String s = generateVerifyCredentialsAuthorizationHeader("https://api.twitter.com/1/account/verify_credentials.json");
        headers.put("X-Auth-Service-Provider", "https://api.twitter.com/1/account/verify_credentials.json");
        headers.put("X-Verify-Credentials-Authorization", s);
        HttpParameter ahttpparameter1[] = new HttpParameter[2];
        ahttpparameter1[0] = new HttpParameter("no_twitter_post", "1");
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
