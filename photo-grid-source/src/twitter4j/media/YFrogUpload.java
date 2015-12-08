// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.media;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpParameter;
import twitter4j.internal.http.HttpResponse;

// Referenced classes of package twitter4j.media:
//            AbstractImageUploadImpl

class YFrogUpload extends AbstractImageUploadImpl
{

    public YFrogUpload(Configuration configuration, OAuthAuthorization oauthauthorization)
    {
        super(configuration, oauthauthorization);
    }

    protected String postUpload()
    {
        if (httpResponse.getStatusCode() != 200)
        {
            throw new TwitterException("YFrog image upload returned invalid status code", httpResponse);
        }
        String s = httpResponse.asString();
        if (s.contains("<rsp stat=\"fail\">"))
        {
            s = s.substring(s.indexOf("msg") + 5, s.lastIndexOf("\""));
            throw new TwitterException((new StringBuilder("YFrog image upload failed with this error message: ")).append(s).toString(), httpResponse);
        }
        if (s.contains("<rsp stat=\"ok\">"))
        {
            return s.substring(s.indexOf("<mediaurl>") + 10, s.indexOf("</mediaurl>"));
        } else
        {
            throw new TwitterException("Unknown YFrog response", httpResponse);
        }
    }

    protected void preUpload()
    {
        uploadUrl = "https://yfrog.com/api/xauth_upload";
        String s = generateVerifyCredentialsAuthorizationURL("https://api.twitter.com/1/account/verify_credentials.xml");
        Twitter twitter = (new TwitterFactory()).getInstance(oauth);
        HttpParameter ahttpparameter1[] = new HttpParameter[4];
        ahttpparameter1[0] = new HttpParameter("auth", "oauth");
        ahttpparameter1[1] = new HttpParameter("username", twitter.verifyCredentials().getScreenName());
        ahttpparameter1[2] = new HttpParameter("verify_url", s);
        ahttpparameter1[3] = image;
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
