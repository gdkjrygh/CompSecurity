// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.media;

import twitter4j.TwitterException;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.internal.http.HttpParameter;
import twitter4j.internal.http.HttpResponse;

// Referenced classes of package twitter4j.media:
//            AbstractImageUploadImpl

class TwippleUpload extends AbstractImageUploadImpl
{

    public TwippleUpload(Configuration configuration, OAuthAuthorization oauthauthorization)
    {
        super(configuration, oauthauthorization);
    }

    protected String postUpload()
    {
        if (httpResponse.getStatusCode() != 200)
        {
            throw new TwitterException("Twipple image upload returned invalid status code", httpResponse);
        }
        String s = httpResponse.asString();
        if (s.contains("<rsp stat=\"fail\">"))
        {
            s = s.substring(s.indexOf("msg") + 5, s.lastIndexOf("\""));
            throw new TwitterException((new StringBuilder("Twipple image upload failed with this error message: ")).append(s).toString(), httpResponse);
        }
        if (s.contains("<rsp stat=\"ok\">"))
        {
            return s.substring(s.indexOf("<mediaurl>") + 10, s.indexOf("</mediaurl>"));
        } else
        {
            throw new TwitterException("Unknown Twipple response", httpResponse);
        }
    }

    protected void preUpload()
    {
        uploadUrl = "http://p.twipple.jp/api/upload";
        postParameter = (new HttpParameter[] {
            new HttpParameter("verify_url", generateVerifyCredentialsAuthorizationURL("https://api.twitter.com/1.1/account/verify_credentials.json")), image
        });
    }
}
