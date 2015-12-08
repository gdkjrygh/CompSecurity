// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth;

import com.google.api.client.util.Base64;
import com.google.api.client.util.StringUtils;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.api.client.auth.oauth:
//            OAuthSigner, OAuthParameters

public final class OAuthHmacSigner
    implements OAuthSigner
{

    public String clientSharedSecret;
    public String tokenSharedSecret;

    public OAuthHmacSigner()
    {
    }

    public String computeSignature(String s)
        throws GeneralSecurityException
    {
        Object obj = new StringBuilder();
        Object obj1 = clientSharedSecret;
        if (obj1 != null)
        {
            ((StringBuilder) (obj)).append(OAuthParameters.escape(((String) (obj1))));
        }
        ((StringBuilder) (obj)).append('&');
        obj1 = tokenSharedSecret;
        if (obj1 != null)
        {
            ((StringBuilder) (obj)).append(OAuthParameters.escape(((String) (obj1))));
        }
        obj = new SecretKeySpec(StringUtils.getBytesUtf8(((StringBuilder) (obj)).toString()), "HmacSHA1");
        obj1 = Mac.getInstance("HmacSHA1");
        ((Mac) (obj1)).init(((java.security.Key) (obj)));
        return Base64.encodeBase64String(((Mac) (obj1)).doFinal(StringUtils.getBytesUtf8(s)));
    }

    public String getSignatureMethod()
    {
        return "HMAC-SHA1";
    }
}
