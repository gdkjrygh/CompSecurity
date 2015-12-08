// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth;

import com.google.api.client.util.Base64;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.StringUtils;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;

// Referenced classes of package com.google.api.client.auth.oauth:
//            OAuthSigner

public final class OAuthRsaSigner
    implements OAuthSigner
{

    public PrivateKey privateKey;

    public OAuthRsaSigner()
    {
    }

    public String computeSignature(String s)
        throws GeneralSecurityException
    {
        java.security.Signature signature = SecurityUtils.getSha1WithRsaSignatureAlgorithm();
        s = StringUtils.getBytesUtf8(s);
        return Base64.encodeBase64String(SecurityUtils.sign(signature, privateKey, s));
    }

    public String getSignatureMethod()
    {
        return "RSA-SHA1";
    }
}
