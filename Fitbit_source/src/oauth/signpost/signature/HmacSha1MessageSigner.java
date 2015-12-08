// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package oauth.signpost.signature;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import oauth.signpost.a;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.http.HttpParameters;

// Referenced classes of package oauth.signpost.signature:
//            OAuthMessageSigner, a

public class HmacSha1MessageSigner extends OAuthMessageSigner
{

    private static final String a = "HmacSHA1";

    public HmacSha1MessageSigner()
    {
    }

    public String a()
    {
        return "HMAC-SHA1";
    }

    public String a(oauth.signpost.http.a a1, HttpParameters httpparameters)
        throws OAuthMessageSignerException
    {
        try
        {
            SecretKeySpec secretkeyspec = new SecretKeySpec((new StringBuilder()).append(oauth.signpost.a.a(b())).append('&').append(oauth.signpost.a.a(c())).toString().getBytes("UTF-8"), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretkeyspec);
            a1 = (new oauth.signpost.signature.a(a1, httpparameters)).a();
            oauth.signpost.a.c("SBS", a1);
            a1 = a(mac.doFinal(a1.getBytes("UTF-8"))).trim();
        }
        // Misplaced declaration of an exception variable
        catch (oauth.signpost.http.a a1)
        {
            throw new OAuthMessageSignerException(a1);
        }
        // Misplaced declaration of an exception variable
        catch (oauth.signpost.http.a a1)
        {
            throw new OAuthMessageSignerException(a1);
        }
        return a1;
    }
}
