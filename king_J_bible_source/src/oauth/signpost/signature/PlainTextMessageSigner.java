// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.signature;

import oauth.signpost.OAuth;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;
import oauth.signpost.http.HttpRequest;

// Referenced classes of package oauth.signpost.signature:
//            OAuthMessageSigner

public class PlainTextMessageSigner extends OAuthMessageSigner
{

    public PlainTextMessageSigner()
    {
    }

    public String getSignatureMethod()
    {
        return "PLAINTEXT";
    }

    public String sign(HttpRequest httprequest, HttpParameters httpparameters)
        throws OAuthMessageSignerException
    {
        return (new StringBuilder()).append(OAuth.percentEncode(getConsumerSecret())).append('&').append(OAuth.percentEncode(getTokenSecret())).toString();
    }
}
